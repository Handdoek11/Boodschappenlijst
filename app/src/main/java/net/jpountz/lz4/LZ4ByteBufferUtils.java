package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.jpountz.util.ByteBufferUtils;

/* loaded from: classes2.dex */
enum LZ4ByteBufferUtils {
    ;

    static final /* synthetic */ boolean $assertionsDisabled = false;

    static class Match {
        int len;
        int ref;
        int start;

        Match() {
        }

        int end() {
            return this.start + this.len;
        }

        void fix(int i8) {
            this.start += i8;
            this.ref += i8;
            this.len -= i8;
        }
    }

    static int commonBytes(ByteBuffer byteBuffer, int i8, int i9, int i10) {
        int numberOfTrailingZeros;
        int i11 = 0;
        while (i9 <= i10 - 8) {
            if (ByteBufferUtils.readLong(byteBuffer, i9) != ByteBufferUtils.readLong(byteBuffer, i8)) {
                if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                    numberOfTrailingZeros = Long.numberOfLeadingZeros(ByteBufferUtils.readLong(byteBuffer, i8) ^ ByteBufferUtils.readLong(byteBuffer, i9));
                } else {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(ByteBufferUtils.readLong(byteBuffer, i8) ^ ByteBufferUtils.readLong(byteBuffer, i9));
                }
                return i11 + (numberOfTrailingZeros >>> 3);
            }
            i11 += 8;
            i8 += 8;
            i9 += 8;
        }
        while (i9 < i10) {
            int i12 = i8 + 1;
            int i13 = i9 + 1;
            if (ByteBufferUtils.readByte(byteBuffer, i8) != ByteBufferUtils.readByte(byteBuffer, i9)) {
                break;
            }
            i11++;
            i8 = i12;
            i9 = i13;
        }
        return i11;
    }

    static int commonBytesBackward(ByteBuffer byteBuffer, int i8, int i9, int i10, int i11) {
        int i12 = 0;
        while (i8 > i10 && i9 > i11) {
            i8--;
            i9--;
            if (byteBuffer.get(i8) != byteBuffer.get(i9)) {
                break;
            }
            i12++;
        }
        return i12;
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    static int encodeSequence(ByteBuffer byteBuffer, int i8, int i9, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i9 - i8;
        int i17 = i12 + 1;
        if (i17 + i16 + 8 + (i16 >>> 8) > i13) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i16 >= 15) {
            i17 = writeLen(i16 - 15, byteBuffer2, i17);
            i14 = -16;
        } else {
            i14 = i16 << 4;
        }
        wildArraycopy(byteBuffer, i8, byteBuffer2, i17, i16);
        int i18 = i17 + i16;
        int i19 = i9 - i10;
        byteBuffer2.put(i18, (byte) i19);
        int i20 = i18 + 2;
        byteBuffer2.put(i18 + 1, (byte) (i19 >>> 8));
        int i21 = i11 - 4;
        if (i18 + 8 + (i21 >>> 8) > i13) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i21 >= 15) {
            i15 = i14 | 15;
            i20 = writeLen(i11 - 19, byteBuffer2, i20);
        } else {
            i15 = i21 | i14;
        }
        byteBuffer2.put(i12, (byte) i15);
        return i20;
    }

    static int hash(ByteBuffer byteBuffer, int i8) {
        return LZ4Utils.hash(ByteBufferUtils.readInt(byteBuffer, i8));
    }

    static int hash64k(ByteBuffer byteBuffer, int i8) {
        return LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i8));
    }

    static int lastLiterals(ByteBuffer byteBuffer, int i8, int i9, ByteBuffer byteBuffer2, int i10, int i11) {
        int i12;
        if (i10 + i9 + 1 + ((i9 + 240) / 255) > i11) {
            throw new LZ4Exception();
        }
        if (i9 >= 15) {
            byteBuffer2.put(i10, (byte) -16);
            i12 = writeLen(i9 - 15, byteBuffer2, i10 + 1);
        } else {
            byteBuffer2.put(i10, (byte) (i9 << 4));
            i12 = i10 + 1;
        }
        safeArraycopy(byteBuffer, i8, byteBuffer2, i12, i9);
        return i12 + i9;
    }

    static boolean readIntEquals(ByteBuffer byteBuffer, int i8, int i9) {
        return byteBuffer.getInt(i8) == byteBuffer.getInt(i9);
    }

    static void safeArraycopy(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer2.put(i9 + i11, byteBuffer.get(i8 + i11));
        }
    }

    static void safeIncrementalCopy(ByteBuffer byteBuffer, int i8, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put(i9 + i11, byteBuffer.get(i8 + i11));
        }
    }

    static void wildArraycopy(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 8) {
            try {
                byteBuffer2.putLong(i9 + i11, byteBuffer.getLong(i8 + i11));
            } catch (IndexOutOfBoundsException unused) {
                throw new LZ4Exception("Malformed input at offset " + i8);
            }
        }
    }

    static void wildIncrementalCopy(ByteBuffer byteBuffer, int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if (i11 < 4) {
            int i12 = 0;
            for (int i13 = 0; i13 < 4; i13++) {
                ByteBufferUtils.writeByte(byteBuffer, i9 + i13, ByteBufferUtils.readByte(byteBuffer, i8 + i13));
            }
            int i14 = i9 + 4;
            int i15 = i8 + 4;
            int i16 = i14 - i15;
            if (i16 == 1) {
                i15 = i8 + 1;
            } else if (i16 == 2) {
                i15 = i8 + 2;
            } else if (i16 == 3) {
                i15 = i8 + 1;
                i12 = -1;
            } else if (i16 == 5) {
                i12 = 1;
            } else if (i16 == 6) {
                i12 = 2;
            } else if (i16 == 7) {
                i12 = 3;
            }
            ByteBufferUtils.writeInt(byteBuffer, i14, ByteBufferUtils.readInt(byteBuffer, i15));
            i9 += 8;
            i8 = i15 - i12;
        } else if (i11 < 8) {
            ByteBufferUtils.writeLong(byteBuffer, i9, ByteBufferUtils.readLong(byteBuffer, i8));
            i9 += i11;
        }
        while (i9 < i10) {
            ByteBufferUtils.writeLong(byteBuffer, i9, ByteBufferUtils.readLong(byteBuffer, i8));
            i9 += 8;
            i8 += 8;
        }
    }

    static int writeLen(int i8, ByteBuffer byteBuffer, int i9) {
        while (i8 >= 255) {
            byteBuffer.put(i9, (byte) -1);
            i8 -= 255;
            i9++;
        }
        int i10 = i9 + 1;
        byteBuffer.put(i9, (byte) i8);
        return i10;
    }
}
