package G;

import x6.z;

/* loaded from: classes.dex */
public abstract class h {
    public static final long a(float f8, float f9, float f10, float f11, H.d dVar) {
        float d8 = dVar.d(0);
        if (f8 <= dVar.c(0) && d8 <= f8) {
            float d9 = dVar.d(1);
            if (f9 <= dVar.c(1) && d9 <= f9) {
                float d10 = dVar.d(2);
                if (f10 <= dVar.c(2) && d10 <= f10 && 0.0f <= f11 && f11 <= 1.0f) {
                    if (dVar.g()) {
                        return g.c(z.c(z.c(z.c((((((int) ((f8 * 255.0f) + 0.5f)) << 16) | (((int) ((f11 * 255.0f) + 0.5f)) << 24)) | (((int) ((f9 * 255.0f) + 0.5f)) << 8)) | ((int) ((f10 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (dVar.a() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int b8 = dVar.b();
                    if (b8 == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short a8 = j.a(f8);
                    return g.c(z.c(z.c(z.c(z.c(z.c(z.c(z.c(j.a(f9)) & 65535) << 32) | z.c(z.c(z.c(a8) & 65535) << 48)) | z.c(z.c(z.c(j.a(f10)) & 65535) << 16)) | z.c(z.c(z.c((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | z.c(z.c(b8) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f8 + ", green = " + f9 + ", blue = " + f10 + ", alpha = " + f11 + " outside the range for " + dVar).toString());
    }

    public static final long b(int i8) {
        return g.c(z.c(z.c(i8) << 32));
    }

    public static final long c(long j8) {
        return g.c(z.c(z.c(z.c(j8) & 4294967295L) << 32));
    }

    public static final int d(long j8) {
        return (int) z.c(g.d(j8, H.h.f2781a.h()) >>> 32);
    }
}
