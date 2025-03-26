package F;

import J6.AbstractC0650j;
import J6.C0652l;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2214a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f2215b = e.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    private static final long f2216c = e.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    private static final long f2217d = e.a(Float.NaN, Float.NaN);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final long a() {
            return d.f2217d;
        }

        public final long b() {
            return d.f2215b;
        }

        private a() {
        }
    }

    public static final boolean d(long j8, long j9) {
        return j8 == j9;
    }

    public static final float e(long j8) {
        return (f(j8) * f(j8)) + (g(j8) * g(j8));
    }

    public static final float f(long j8) {
        if (j8 == f2217d) {
            throw new IllegalStateException("Offset is unspecified");
        }
        C0652l c0652l = C0652l.f3580a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float g(long j8) {
        if (j8 == f2217d) {
            throw new IllegalStateException("Offset is unspecified");
        }
        C0652l c0652l = C0652l.f3580a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final boolean h(long j8) {
        if (Float.isNaN(f(j8)) || Float.isNaN(g(j8))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        return true;
    }

    public static final long i(long j8, long j9) {
        return e.a(f(j8) - f(j9), g(j8) - g(j9));
    }

    public static final long j(long j8, long j9) {
        return e.a(f(j8) + f(j9), g(j8) + g(j9));
    }

    public static final long k(long j8) {
        return e.a(-f(j8), -g(j8));
    }

    public static long c(long j8) {
        return j8;
    }
}
