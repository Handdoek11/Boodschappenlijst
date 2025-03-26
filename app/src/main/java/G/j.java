package G;

import J6.AbstractC0650j;
import J6.C0652l;

/* loaded from: classes.dex */
public abstract class j implements Comparable {

    /* renamed from: E, reason: collision with root package name */
    private static final float f2480E;

    /* renamed from: o, reason: collision with root package name */
    public static final a f2481o = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private static final short f2482s = c(5120);

    /* renamed from: t, reason: collision with root package name */
    private static final short f2483t = c(-1025);

    /* renamed from: u, reason: collision with root package name */
    private static final short f2484u = c(31743);

    /* renamed from: v, reason: collision with root package name */
    private static final short f2485v = c(1024);

    /* renamed from: w, reason: collision with root package name */
    private static final short f2486w = c(1);

    /* renamed from: x, reason: collision with root package name */
    private static final short f2487x = c(32256);

    /* renamed from: y, reason: collision with root package name */
    private static final short f2488y = c(-1024);

    /* renamed from: z, reason: collision with root package name */
    private static final short f2489z = c(Short.MIN_VALUE);

    /* renamed from: A, reason: collision with root package name */
    private static final short f2476A = c(31744);

    /* renamed from: B, reason: collision with root package name */
    private static final short f2477B = c(0);

    /* renamed from: C, reason: collision with root package name */
    private static final short f2478C = a(1.0f);

    /* renamed from: D, reason: collision with root package name */
    private static final short f2479D = a(-1.0f);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short b(float f8) {
            int i8;
            int floatToRawIntBits = Float.floatToRawIntBits(f8);
            int i9 = floatToRawIntBits >>> 31;
            int i10 = (floatToRawIntBits >>> 23) & 255;
            int i11 = 8388607 & floatToRawIntBits;
            int i12 = 31;
            int i13 = 0;
            if (i10 != 255) {
                int i14 = i10 - 112;
                if (i14 >= 31) {
                    i12 = 49;
                } else if (i14 > 0) {
                    i13 = i11 >> 13;
                    if ((floatToRawIntBits & 4096) != 0) {
                        i8 = (((i14 << 10) | i13) + 1) | (i9 << 15);
                        return (short) i8;
                    }
                    i12 = i14;
                } else if (i14 >= -10) {
                    int i15 = (8388608 | i11) >> (1 - i14);
                    if ((i15 & 4096) != 0) {
                        i15 += 8192;
                    }
                    i12 = 0;
                    i13 = i15 >> 13;
                } else {
                    i12 = 0;
                }
            } else if (i11 != 0) {
                i13 = 512;
            }
            i8 = (i9 << 15) | (i12 << 10) | i13;
            return (short) i8;
        }

        private a() {
        }
    }

    static {
        C0652l c0652l = C0652l.f3580a;
        f2480E = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f8) {
        return c(f2481o.b(f8));
    }

    public static final float f(short s8) {
        int i8;
        int i9;
        int i10;
        int i11 = 32768 & s8;
        int i12 = ((65535 & s8) >>> 10) & 31;
        int i13 = s8 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i8 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i8 = i12 + 112;
            }
            int i15 = i8;
            i9 = i14;
            i10 = i15;
        } else {
            if (i13 != 0) {
                C0652l c0652l = C0652l.f3580a;
                float intBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - f2480E;
                return i11 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        int i16 = (i10 << 23) | (i11 << 16) | i9;
        C0652l c0652l2 = C0652l.f3580a;
        return Float.intBitsToFloat(i16);
    }

    public static short c(short s8) {
        return s8;
    }
}
