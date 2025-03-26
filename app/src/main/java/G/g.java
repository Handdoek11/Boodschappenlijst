package G;

import J6.AbstractC0650j;
import x6.AbstractC6918G;
import x6.z;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2458a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f2459b = h.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    private static final long f2460c = h.c(4282664004L);

    /* renamed from: d, reason: collision with root package name */
    private static final long f2461d = h.c(4287137928L);

    /* renamed from: e, reason: collision with root package name */
    private static final long f2462e = h.c(4291611852L);

    /* renamed from: f, reason: collision with root package name */
    private static final long f2463f = h.c(4294967295L);

    /* renamed from: g, reason: collision with root package name */
    private static final long f2464g = h.c(4294901760L);

    /* renamed from: h, reason: collision with root package name */
    private static final long f2465h = h.c(4278255360L);

    /* renamed from: i, reason: collision with root package name */
    private static final long f2466i = h.c(4278190335L);

    /* renamed from: j, reason: collision with root package name */
    private static final long f2467j = h.c(4294967040L);

    /* renamed from: k, reason: collision with root package name */
    private static final long f2468k = h.c(4278255615L);

    /* renamed from: l, reason: collision with root package name */
    private static final long f2469l = h.c(4294902015L);

    /* renamed from: m, reason: collision with root package name */
    private static final long f2470m = h.b(0);

    /* renamed from: n, reason: collision with root package name */
    private static final long f2471n = h.a(0.0f, 0.0f, 0.0f, 0.0f, H.h.f2781a.j());

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final long a() {
            return g.f2459b;
        }

        public final long b() {
            return g.f2464g;
        }

        private a() {
        }
    }

    public static final long d(long j8, H.d dVar) {
        H.d h8 = h(j8);
        return J6.r.a(dVar, h8) ? j8 : H.e.i(h8, dVar, 0, 2, null).e(j(j8), i(j8), g(j8), f(j8));
    }

    public static final boolean e(long j8, long j9) {
        return z.g(j8, j9);
    }

    public static final float f(long j8) {
        float c8;
        float f8;
        if (z.c(63 & j8) == 0) {
            c8 = (float) AbstractC6918G.c(z.c(z.c(j8 >>> 56) & 255));
            f8 = 255.0f;
        } else {
            c8 = (float) AbstractC6918G.c(z.c(z.c(j8 >>> 6) & 1023));
            f8 = 1023.0f;
        }
        return c8 / f8;
    }

    public static final float g(long j8) {
        return z.c(63 & j8) == 0 ? ((float) AbstractC6918G.c(z.c(z.c(j8 >>> 32) & 255))) / 255.0f : j.f(j.c((short) z.c(z.c(j8 >>> 16) & 65535)));
    }

    public static final H.d h(long j8) {
        H.h hVar = H.h.f2781a;
        return hVar.e()[(int) z.c(j8 & 63)];
    }

    public static final float i(long j8) {
        return z.c(63 & j8) == 0 ? ((float) AbstractC6918G.c(z.c(z.c(j8 >>> 40) & 255))) / 255.0f : j.f(j.c((short) z.c(z.c(j8 >>> 32) & 65535)));
    }

    public static final float j(long j8) {
        return z.c(63 & j8) == 0 ? ((float) AbstractC6918G.c(z.c(z.c(j8 >>> 48) & 255))) / 255.0f : j.f(j.c((short) z.c(z.c(j8 >>> 48) & 65535)));
    }

    public static long c(long j8) {
        return j8;
    }
}
