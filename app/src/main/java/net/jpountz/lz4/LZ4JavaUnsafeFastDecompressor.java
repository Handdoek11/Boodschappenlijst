package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

/* loaded from: classes2.dex */
final class LZ4JavaUnsafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaUnsafeFastDecompressor();

    LZ4JavaUnsafeFastDecompressor() {
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public int decompress(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        int i11;
        byte readByte;
        int i12;
        byte readByte2;
        UnsafeUtils.checkRange(bArr, i8);
        UnsafeUtils.checkRange(bArr2, i9, i10);
        if (i10 == 0) {
            if (UnsafeUtils.readByte(bArr, i8) == 0) {
                return 1;
            }
            throw new LZ4Exception("Malformed input at " + i8);
        }
        int i13 = i10 + i9;
        int i14 = i8;
        int i15 = i9;
        while (true) {
            byte readByte3 = UnsafeUtils.readByte(bArr, i14);
            int i16 = i14 + 1;
            int i17 = (readByte3 & 255) >>> 4;
            if (i17 == 15) {
                while (true) {
                    i12 = i16 + 1;
                    readByte2 = UnsafeUtils.readByte(bArr, i16);
                    if (readByte2 != -1) {
                        break;
                    }
                    i17 += 255;
                    i16 = i12;
                }
                i17 += readByte2 & 255;
                i16 = i12;
            }
            int i18 = i15 + i17;
            int i19 = i13 - 8;
            if (i18 > i19) {
                if (i18 == i13) {
                    LZ4UnsafeUtils.safeArraycopy(bArr, i16, bArr2, i15, i17);
                    return (i16 + i17) - i8;
                }
                throw new LZ4Exception("Malformed input at " + i16);
            }
            LZ4UnsafeUtils.wildArraycopy(bArr, i16, bArr2, i15, i17);
            int i20 = i16 + i17;
            int readShortLE = UnsafeUtils.readShortLE(bArr, i20);
            i14 = i20 + 2;
            int i21 = i18 - readShortLE;
            if (i21 < i9) {
                throw new LZ4Exception("Malformed input at " + i14);
            }
            int i22 = readByte3 & 15;
            if (i22 == 15) {
                while (true) {
                    i11 = i14 + 1;
                    readByte = UnsafeUtils.readByte(bArr, i14);
                    if (readByte != -1) {
                        break;
                    }
                    i22 += 255;
                    i14 = i11;
                }
                i22 += readByte & 255;
                i14 = i11;
            }
            int i23 = i22 + 4;
            int i24 = i18 + i23;
            if (i24 <= i19) {
                LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i21, i18, i24);
            } else {
                if (i24 > i13) {
                    throw new LZ4Exception("Malformed input at " + i14);
                }
                LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i21, i18, i23);
            }
            i15 = i24;
        }
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, int i10) {
        int i11;
        byte readByte;
        int i12;
        byte readByte2;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i8 + byteBuffer.arrayOffset(), byteBuffer2.array(), i9 + byteBuffer2.arrayOffset(), i10);
        }
        ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(inNativeByteOrder, i8);
        ByteBufferUtils.checkRange(inNativeByteOrder2, i9, i10);
        if (i10 == 0) {
            if (ByteBufferUtils.readByte(inNativeByteOrder, i8) == 0) {
                return 1;
            }
            throw new LZ4Exception("Malformed input at " + i8);
        }
        int i13 = i10 + i9;
        int i14 = i8;
        int i15 = i9;
        while (true) {
            byte readByte3 = ByteBufferUtils.readByte(inNativeByteOrder, i14);
            int i16 = i14 + 1;
            int i17 = (readByte3 & 255) >>> 4;
            if (i17 == 15) {
                while (true) {
                    i12 = i16 + 1;
                    readByte2 = ByteBufferUtils.readByte(inNativeByteOrder, i16);
                    if (readByte2 != -1) {
                        break;
                    }
                    i17 += 255;
                    i16 = i12;
                }
                i17 += readByte2 & 255;
                i16 = i12;
            }
            int i18 = i15 + i17;
            int i19 = i13 - 8;
            if (i18 > i19) {
                if (i18 != i13) {
                    throw new LZ4Exception("Malformed input at " + i16);
                }
                LZ4ByteBufferUtils.safeArraycopy(inNativeByteOrder, i16, inNativeByteOrder2, i15, i17);
                return (i16 + i17) - i8;
            }
            LZ4ByteBufferUtils.wildArraycopy(inNativeByteOrder, i16, inNativeByteOrder2, i15, i17);
            int i20 = i16 + i17;
            int readShortLE = ByteBufferUtils.readShortLE(inNativeByteOrder, i20);
            i14 = i20 + 2;
            int i21 = i18 - readShortLE;
            if (i21 < i9) {
                throw new LZ4Exception("Malformed input at " + i14);
            }
            int i22 = readByte3 & 15;
            if (i22 == 15) {
                while (true) {
                    i11 = i14 + 1;
                    readByte = ByteBufferUtils.readByte(inNativeByteOrder, i14);
                    if (readByte != -1) {
                        break;
                    }
                    i22 += 255;
                    i14 = i11;
                }
                i22 += readByte & 255;
                i14 = i11;
            }
            int i23 = i22 + 4;
            int i24 = i18 + i23;
            if (i24 <= i19) {
                LZ4ByteBufferUtils.wildIncrementalCopy(inNativeByteOrder2, i21, i18, i24);
            } else {
                if (i24 > i13) {
                    throw new LZ4Exception("Malformed input at " + i14);
                }
                LZ4ByteBufferUtils.safeIncrementalCopy(inNativeByteOrder2, i21, i18, i23);
            }
            i15 = i24;
        }
    }
}
