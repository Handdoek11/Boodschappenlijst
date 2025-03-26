package Y5;

import J6.r;
import P6.m;
import io.ktor.utils.io.core.internal.MalformedUTF8InputException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import x6.C6914C;

/* loaded from: classes2.dex */
public abstract class c {
    public static final int a(char c8, char c9) {
        return ((c8 - 55232) << 10) | (c9 - 56320);
    }

    public static final int b(ByteBuffer byteBuffer, CharSequence charSequence, int i8, int i9, int i10, int i11) {
        r.e(byteBuffer, "$this$encodeUTF8");
        r.e(charSequence, "text");
        int min = Math.min(i9, i8 + 65535);
        int e8 = m.e(i11, 65535);
        int i12 = i8;
        int i13 = i10;
        while (i13 < e8 && i12 < min) {
            int i14 = i12 + 1;
            char charAt = charSequence.charAt(i12);
            int i15 = charAt & 65535;
            if ((charAt & 65408) != 0) {
                return c(byteBuffer, charSequence, i12, min, i8, i13, e8, i10);
            }
            byteBuffer.put(i13, (byte) i15);
            i12 = i14;
            i13++;
        }
        return b.d(C6914C.c((short) (i12 - i8)), C6914C.c((short) (i13 - i10)));
    }

    private static final int c(ByteBuffer byteBuffer, CharSequence charSequence, int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - 3;
        int i17 = i8;
        int i18 = i11;
        while (i16 - i18 > 0 && i17 < i9) {
            int i19 = i17 + 1;
            char charAt = charSequence.charAt(i17);
            if (!Character.isHighSurrogate(charAt)) {
                i17 = i19;
                i14 = charAt;
            } else if (i19 == i9 || !Character.isLowSurrogate(charSequence.charAt(i19))) {
                i17 = i19;
                i14 = 63;
            } else {
                i17 += 2;
                i14 = a(charAt, charSequence.charAt(i19));
            }
            if (i14 >= 0 && i14 < 128) {
                byteBuffer.put(i18, (byte) i14);
                i15 = 1;
            } else if (128 <= i14 && i14 < 2048) {
                byteBuffer.put(i18, (byte) (((i14 >> 6) & 31) | 192));
                byteBuffer.put(i18 + 1, (byte) (128 | (i14 & 63)));
                i15 = 2;
            } else if (2048 <= i14 && i14 < 65536) {
                byteBuffer.put(i18, (byte) (((i14 >> 12) & 15) | 224));
                byteBuffer.put(i18 + 1, (byte) ((63 & (i14 >> 6)) | 128));
                byteBuffer.put(i18 + 2, (byte) (128 | (i14 & 63)));
                i15 = 3;
            } else {
                if (65536 > i14 || i14 >= 1114112) {
                    j(i14);
                    throw new KotlinNothingValueException();
                }
                byteBuffer.put(i18, (byte) (((i14 >> 18) & 7) | 240));
                byteBuffer.put(i18 + 1, (byte) (((i14 >> 12) & 63) | 128));
                byteBuffer.put(i18 + 2, (byte) ((63 & (i14 >> 6)) | 128));
                byteBuffer.put(i18 + 3, (byte) (128 | (i14 & 63)));
                i15 = 4;
            }
            i18 += i15;
        }
        return i18 == i16 ? d(byteBuffer, charSequence, i17, i9, i10, i18, i12, i13) : b.d(C6914C.c((short) (i17 - i10)), C6914C.c((short) (i18 - i13)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        j(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        return Y5.b.d(x6.C6914C.c((short) (r3 - r20)), x6.C6914C.c((short) (r4 - r23)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int d(java.nio.ByteBuffer r16, java.lang.CharSequence r17, int r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.c.d(java.nio.ByteBuffer, java.lang.CharSequence, int, int, int, int, int, int):int");
    }

    public static final int e(int i8) {
        return (i8 >>> 10) + 55232;
    }

    public static final boolean f(int i8) {
        return (i8 >>> 16) == 0;
    }

    public static final boolean g(int i8) {
        return i8 <= 1114111;
    }

    public static final int h(int i8) {
        return (i8 & 1023) + 56320;
    }

    public static final Void i(int i8) {
        throw new MalformedUTF8InputException("Expected " + i8 + " more character bytes");
    }

    public static final Void j(int i8) {
        throw new IllegalArgumentException("Malformed code-point " + i8 + " found");
    }
}
