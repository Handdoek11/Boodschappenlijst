package H;

import J6.AbstractC0650j;

/* loaded from: classes.dex */
public final class m extends d {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2830e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f2831f;

    /* renamed from: g, reason: collision with root package name */
    private static final float[] f2832g;

    /* renamed from: h, reason: collision with root package name */
    private static final float[] f2833h;

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f2834i;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static {
        float[] b8 = AbstractC0625a.f2767b.a().b();
        k kVar = k.f2818a;
        float[] k8 = e.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, e.e(b8, kVar.b().c(), kVar.e().c()));
        f2831f = k8;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f2832g = fArr;
        f2833h = e.j(k8);
        f2834i = e.j(fArr);
    }

    public m(String str, int i8) {
        super(str, c.f2772a.a(), i8, null);
    }

    @Override // H.d
    public float c(int i8) {
        return i8 == 0 ? 1.0f : 0.5f;
    }

    @Override // H.d
    public float d(int i8) {
        return i8 == 0 ? 0.0f : -0.5f;
    }

    @Override // H.d
    public long h(float f8, float f9, float f10) {
        float h8 = P6.m.h(f8, 0.0f, 1.0f);
        float h9 = P6.m.h(f9, -0.5f, 0.5f);
        float h10 = P6.m.h(f10, -0.5f, 0.5f);
        float[] fArr = f2834i;
        float n8 = e.n(fArr, h8, h9, h10);
        float o8 = e.o(fArr, h8, h9, h10);
        float p8 = e.p(fArr, h8, h9, h10);
        float f11 = n8 * n8 * n8;
        float f12 = o8 * o8 * o8;
        float f13 = p8 * p8 * p8;
        float[] fArr2 = f2833h;
        float n9 = e.n(fArr2, f11, f12, f13);
        float o9 = e.o(fArr2, f11, f12, f13);
        return (Float.floatToRawIntBits(n9) << 32) | (Float.floatToRawIntBits(o9) & 4294967295L);
    }

    @Override // H.d
    public float i(float f8, float f9, float f10) {
        float h8 = P6.m.h(f8, 0.0f, 1.0f);
        float h9 = P6.m.h(f9, -0.5f, 0.5f);
        float h10 = P6.m.h(f10, -0.5f, 0.5f);
        float[] fArr = f2834i;
        float n8 = e.n(fArr, h8, h9, h10);
        float o8 = e.o(fArr, h8, h9, h10);
        float p8 = e.p(fArr, h8, h9, h10);
        float f11 = p8 * p8 * p8;
        return e.p(f2833h, n8 * n8 * n8, o8 * o8 * o8, f11);
    }

    @Override // H.d
    public long j(float f8, float f9, float f10, float f11, d dVar) {
        float[] fArr = f2831f;
        float n8 = e.n(fArr, f8, f9, f10);
        float o8 = e.o(fArr, f8, f9, f10);
        float p8 = e.p(fArr, f8, f9, f10);
        double d8 = 0.33333334f;
        float signum = Math.signum(n8) * ((float) Math.pow(Math.abs(n8), d8));
        float signum2 = Math.signum(o8) * ((float) Math.pow(Math.abs(o8), d8));
        float signum3 = Math.signum(p8) * ((float) Math.pow(Math.abs(p8), d8));
        float[] fArr2 = f2832g;
        return G.h.a(e.n(fArr2, signum, signum2, signum3), e.o(fArr2, signum, signum2, signum3), e.p(fArr2, signum, signum2, signum3), f11, dVar);
    }
}
