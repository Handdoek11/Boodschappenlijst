package F;

import J6.AbstractC0650j;
import J6.C0652l;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2224a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f2225b = h.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    private static final long f2226c = h.a(Float.NaN, Float.NaN);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final long a() {
            return g.f2226c;
        }

        private a() {
        }
    }

    public static final float c(long j8) {
        if (j8 == f2226c) {
            throw new IllegalStateException("Size is unspecified");
        }
        C0652l c0652l = C0652l.f3580a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final float d(long j8) {
        if (j8 == f2226c) {
            throw new IllegalStateException("Size is unspecified");
        }
        C0652l c0652l = C0652l.f3580a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static long b(long j8) {
        return j8;
    }
}
