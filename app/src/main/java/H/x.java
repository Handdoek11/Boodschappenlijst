package H;

import J6.AbstractC0650j;
import java.util.Arrays;
import y6.AbstractC6980h;

/* loaded from: classes.dex */
public final class x extends d {

    /* renamed from: t, reason: collision with root package name */
    public static final a f2848t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    private static final j f2849u = new j() { // from class: H.q
        @Override // H.j
        public final double a(double d8) {
            return x.t(d8);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final A f2850e;

    /* renamed from: f, reason: collision with root package name */
    private final float f2851f;

    /* renamed from: g, reason: collision with root package name */
    private final float f2852g;

    /* renamed from: h, reason: collision with root package name */
    private final z f2853h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f2854i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f2855j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f2856k;

    /* renamed from: l, reason: collision with root package name */
    private final j f2857l;

    /* renamed from: m, reason: collision with root package name */
    private final I6.l f2858m;

    /* renamed from: n, reason: collision with root package name */
    private final j f2859n;

    /* renamed from: o, reason: collision with root package name */
    private final j f2860o;

    /* renamed from: p, reason: collision with root package name */
    private final I6.l f2861p;

    /* renamed from: q, reason: collision with root package name */
    private final j f2862q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f2863r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f2864s;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private final float e(float[] fArr) {
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[2];
            float f11 = fArr[3];
            float f12 = fArr[4];
            float f13 = fArr[5];
            float f14 = ((((((f8 * f11) + (f9 * f12)) + (f10 * f13)) - (f11 * f12)) - (f9 * f10)) - (f8 * f13)) * 0.5f;
            return f14 < 0.0f ? -f14 : f14;
        }

        private final boolean f(double d8, j jVar, j jVar2) {
            return Math.abs(jVar.a(d8) - jVar2.a(d8)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] fArr, A a8) {
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[2];
            float f11 = fArr[3];
            float f12 = fArr[4];
            float f13 = fArr[5];
            float a9 = a8.a();
            float b8 = a8.b();
            float f14 = 1;
            float f15 = (f14 - f8) / f9;
            float f16 = (f14 - f10) / f11;
            float f17 = (f14 - f12) / f13;
            float f18 = (f14 - a9) / b8;
            float f19 = f8 / f9;
            float f20 = (f10 / f11) - f19;
            float f21 = (a9 / b8) - f19;
            float f22 = f16 - f15;
            float f23 = (f12 / f13) - f19;
            float f24 = (((f18 - f15) * f20) - (f21 * f22)) / (((f17 - f15) * f20) - (f22 * f23));
            float f25 = (f21 - (f23 * f24)) / f20;
            float f26 = (1.0f - f25) - f24;
            float f27 = f26 / f9;
            float f28 = f25 / f11;
            float f29 = f24 / f13;
            return new float[]{f27 * f8, f26, f27 * ((1.0f - f8) - f9), f28 * f10, f25, f28 * ((1.0f - f10) - f11), f29 * f12, f24, f29 * ((1.0f - f12) - f13)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f8 = fArr[0];
            float f9 = fArr2[0];
            float f10 = fArr[1];
            float f11 = fArr2[1];
            float f12 = fArr[2] - fArr2[2];
            float f13 = fArr[3] - fArr2[3];
            float f14 = fArr[4];
            float f15 = fArr2[4];
            float f16 = fArr[5];
            float f17 = fArr2[5];
            float[] fArr3 = {f8 - f9, f10 - f11, f12, f13, f14 - f15, f16 - f17};
            return i(fArr3[0], fArr3[1], f9 - f15, f11 - f17) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        private final float i(float f8, float f9, float f10, float f11) {
            return (f8 * f11) - (f9 * f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] fArr, A a8, j jVar, j jVar2, float f8, float f9, int i8) {
            if (i8 == 0) {
                return true;
            }
            h hVar = h.f2781a;
            if (!e.g(fArr, hVar.i()) || !e.f(a8, k.f2818a.e()) || f8 != 0.0f || f9 != 1.0f) {
                return false;
            }
            x h8 = hVar.h();
            for (double d8 = 0.0d; d8 <= 1.0d; d8 += 0.00392156862745098d) {
                if (!f(d8, jVar, h8.H()) || !f(d8, jVar2, h8.E())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] fArr, float f8, float f9) {
            float e8 = e(fArr);
            h hVar = h.f2781a;
            return (e8 / e(hVar.f()) > 0.9f && h(fArr, hVar.i())) || (f8 < 0.0f && f9 > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                float f10 = f8 + f9 + fArr[2];
                fArr2[0] = f8 / f10;
                fArr2[1] = f9 / f10;
                float f11 = fArr[3];
                float f12 = fArr[4];
                float f13 = f11 + f12 + fArr[5];
                fArr2[2] = f11 / f13;
                fArr2[3] = f12 / f13;
                float f14 = fArr[6];
                float f15 = fArr[7];
                float f16 = f14 + f15 + fArr[8];
                fArr2[4] = f14 / f16;
                fArr2[5] = f15 / f16;
            } else {
                AbstractC6980h.h(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }

        private a() {
        }
    }

    static final class b extends J6.s implements I6.l {
        b() {
            super(1);
        }

        public final Double b(double d8) {
            return Double.valueOf(x.this.E().a(P6.m.g(d8, x.this.f2851f, x.this.f2852g)));
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).doubleValue());
        }
    }

    static final class c extends J6.s implements I6.l {
        c() {
            super(1);
        }

        public final Double b(double d8) {
            return Double.valueOf(P6.m.g(x.this.H().a(d8), x.this.f2851f, x.this.f2852g));
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).doubleValue());
        }
    }

    public x(String str, float[] fArr, A a8, float[] fArr2, j jVar, j jVar2, float f8, float f9, z zVar, int i8) {
        super(str, H.c.f2772a.b(), i8, null);
        this.f2850e = a8;
        this.f2851f = f8;
        this.f2852g = f9;
        this.f2853h = zVar;
        this.f2857l = jVar;
        this.f2858m = new c();
        this.f2859n = new j() { // from class: H.o
            @Override // H.j
            public final double a(double d8) {
                return x.K(this.f2840a, d8);
            }
        };
        this.f2860o = jVar2;
        this.f2861p = new b();
        this.f2862q = new j() { // from class: H.p
            @Override // H.j
            public final double a(double d8) {
                return x.C(this.f2841a, d8);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f8 >= f9) {
            throw new IllegalArgumentException("Invalid range: min=" + f8 + ", max=" + f9 + "; min must be strictly < max");
        }
        a aVar = f2848t;
        float[] l8 = aVar.l(fArr);
        this.f2854i = l8;
        if (fArr2 == null) {
            this.f2855j = aVar.g(l8, a8);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f2855j = fArr2;
        }
        this.f2856k = e.j(this.f2855j);
        this.f2863r = aVar.k(l8, f8, f9);
        this.f2864s = aVar.j(l8, a8, jVar, jVar2, f8, f9, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(x xVar, double d8) {
        return xVar.f2860o.a(P6.m.g(d8, xVar.f2851f, xVar.f2852g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double K(x xVar, double d8) {
        return P6.m.g(xVar.f2857l.a(d8), xVar.f2851f, xVar.f2852g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double u(double d8, double d9) {
        if (d9 < 0.0d) {
            d9 = 0.0d;
        }
        return Math.pow(d9, 1.0d / d8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double v(double d8, double d9) {
        if (d9 < 0.0d) {
            d9 = 0.0d;
        }
        return Math.pow(d9, d8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double w(z zVar, double d8) {
        return e.q(d8, zVar.a(), zVar.b(), zVar.c(), zVar.d(), zVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(z zVar, double d8) {
        return e.r(d8, zVar.a(), zVar.b(), zVar.c(), zVar.d(), zVar.e(), zVar.f(), zVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(z zVar, double d8) {
        return e.s(d8, zVar.a(), zVar.b(), zVar.c(), zVar.d(), zVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(z zVar, double d8) {
        return e.t(d8, zVar.a(), zVar.b(), zVar.c(), zVar.d(), zVar.e(), zVar.f(), zVar.g());
    }

    public final j D() {
        return this.f2862q;
    }

    public final j E() {
        return this.f2860o;
    }

    public final float[] F() {
        return this.f2856k;
    }

    public final j G() {
        return this.f2859n;
    }

    public final j H() {
        return this.f2857l;
    }

    public final float[] I() {
        return this.f2855j;
    }

    public final A J() {
        return this.f2850e;
    }

    @Override // H.d
    public float c(int i8) {
        return this.f2852g;
    }

    @Override // H.d
    public float d(int i8) {
        return this.f2851f;
    }

    @Override // H.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        x xVar = (x) obj;
        if (Float.compare(xVar.f2851f, this.f2851f) != 0 || Float.compare(xVar.f2852g, this.f2852g) != 0 || !J6.r.a(this.f2850e, xVar.f2850e) || !Arrays.equals(this.f2854i, xVar.f2854i)) {
            return false;
        }
        z zVar = this.f2853h;
        if (zVar != null) {
            return J6.r.a(zVar, xVar.f2853h);
        }
        if (xVar.f2853h == null) {
            return true;
        }
        if (J6.r.a(this.f2857l, xVar.f2857l)) {
            return J6.r.a(this.f2860o, xVar.f2860o);
        }
        return false;
    }

    @Override // H.d
    public boolean g() {
        return this.f2864s;
    }

    @Override // H.d
    public long h(float f8, float f9, float f10) {
        float a8 = (float) this.f2862q.a(f8);
        float a9 = (float) this.f2862q.a(f9);
        float a10 = (float) this.f2862q.a(f10);
        float n8 = e.n(this.f2855j, a8, a9, a10);
        float o8 = e.o(this.f2855j, a8, a9, a10);
        return (Float.floatToRawIntBits(n8) << 32) | (Float.floatToRawIntBits(o8) & 4294967295L);
    }

    @Override // H.d
    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f2850e.hashCode()) * 31) + Arrays.hashCode(this.f2854i)) * 31;
        float f8 = this.f2851f;
        int floatToIntBits = (hashCode + (f8 == 0.0f ? 0 : Float.floatToIntBits(f8))) * 31;
        float f9 = this.f2852g;
        int floatToIntBits2 = (floatToIntBits + (f9 == 0.0f ? 0 : Float.floatToIntBits(f9))) * 31;
        z zVar = this.f2853h;
        int hashCode2 = floatToIntBits2 + (zVar != null ? zVar.hashCode() : 0);
        return this.f2853h == null ? (((hashCode2 * 31) + this.f2857l.hashCode()) * 31) + this.f2860o.hashCode() : hashCode2;
    }

    @Override // H.d
    public float i(float f8, float f9, float f10) {
        return e.p(this.f2855j, (float) this.f2862q.a(f8), (float) this.f2862q.a(f9), (float) this.f2862q.a(f10));
    }

    @Override // H.d
    public long j(float f8, float f9, float f10, float f11, d dVar) {
        return G.h.a((float) this.f2859n.a(e.n(this.f2856k, f8, f9, f10)), (float) this.f2859n.a(e.o(this.f2856k, f8, f9, f10)), (float) this.f2859n.a(e.p(this.f2856k, f8, f9, f10)), f11, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double t(double d8) {
        return d8;
    }

    public x(String str, float[] fArr, A a8, final z zVar, int i8) {
        this(str, fArr, a8, null, (zVar.e() == 0.0d && zVar.f() == 0.0d) ? new j() { // from class: H.t
            @Override // H.j
            public final double a(double d8) {
                return x.w(zVar, d8);
            }
        } : new j() { // from class: H.u
            @Override // H.j
            public final double a(double d8) {
                return x.x(zVar, d8);
            }
        }, (zVar.e() == 0.0d && zVar.f() == 0.0d) ? new j() { // from class: H.v
            @Override // H.j
            public final double a(double d8) {
                return x.y(zVar, d8);
            }
        } : new j() { // from class: H.w
            @Override // H.j
            public final double a(double d8) {
                return x.z(zVar, d8);
            }
        }, 0.0f, 1.0f, zVar, i8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(String str, float[] fArr, A a8, final double d8, float f8, float f9, int i8) {
        j jVar;
        j jVar2;
        if (d8 == 1.0d) {
            jVar = f2849u;
        } else {
            jVar = new j() { // from class: H.r
                @Override // H.j
                public final double a(double d9) {
                    return x.u(d8, d9);
                }
            };
        }
        j jVar3 = jVar;
        if (d8 == 1.0d) {
            jVar2 = f2849u;
        } else {
            jVar2 = new j() { // from class: H.s
                @Override // H.j
                public final double a(double d9) {
                    return x.v(d8, d9);
                }
            };
        }
        this(str, fArr, a8, null, jVar3, jVar2, f8, f9, new z(d8, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i8);
    }

    public x(x xVar, float[] fArr, A a8) {
        this(xVar.f(), xVar.f2854i, a8, fArr, xVar.f2857l, xVar.f2860o, xVar.f2851f, xVar.f2852g, xVar.f2853h, -1);
    }
}
