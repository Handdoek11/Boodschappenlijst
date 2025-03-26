package p0;

/* loaded from: classes.dex */
final class l {

    /* renamed from: k, reason: collision with root package name */
    static final l f40114k = k(AbstractC6320b.f40079c, (float) ((AbstractC6320b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f40115a;

    /* renamed from: b, reason: collision with root package name */
    private final float f40116b;

    /* renamed from: c, reason: collision with root package name */
    private final float f40117c;

    /* renamed from: d, reason: collision with root package name */
    private final float f40118d;

    /* renamed from: e, reason: collision with root package name */
    private final float f40119e;

    /* renamed from: f, reason: collision with root package name */
    private final float f40120f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f40121g;

    /* renamed from: h, reason: collision with root package name */
    private final float f40122h;

    /* renamed from: i, reason: collision with root package name */
    private final float f40123i;

    /* renamed from: j, reason: collision with root package name */
    private final float f40124j;

    private l(float f8, float f9, float f10, float f11, float f12, float f13, float[] fArr, float f14, float f15, float f16) {
        this.f40120f = f8;
        this.f40115a = f9;
        this.f40116b = f10;
        this.f40117c = f11;
        this.f40118d = f12;
        this.f40119e = f13;
        this.f40121g = fArr;
        this.f40122h = f14;
        this.f40123i = f15;
        this.f40124j = f16;
    }

    static l k(float[] fArr, float f8, float f9, float f10, boolean z7) {
        float[][] fArr2 = AbstractC6320b.f40077a;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = f12 + (fArr3[1] * f13);
        float f15 = fArr[2];
        float f16 = f14 + (fArr3[2] * f15);
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[0] * f11) + (fArr4[1] * f13) + (fArr4[2] * f15);
        float[] fArr5 = fArr2[2];
        float f18 = (f11 * fArr5[0]) + (f13 * fArr5[1]) + (f15 * fArr5[2]);
        float f19 = (f10 / 10.0f) + 0.8f;
        float d8 = ((double) f19) >= 0.9d ? AbstractC6320b.d(0.59f, 0.69f, (f19 - 0.9f) * 10.0f) : AbstractC6320b.d(0.525f, 0.59f, (f19 - 0.8f) * 10.0f);
        float exp = z7 ? 1.0f : (1.0f - (((float) Math.exp(((-f8) - 42.0f) / 92.0f)) * 0.2777778f)) * f19;
        double d9 = exp;
        if (d9 > 1.0d) {
            exp = 1.0f;
        } else if (d9 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp};
        float f20 = 1.0f / ((5.0f * f8) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float cbrt = (f21 * f8) + (0.1f * f22 * f22 * ((float) Math.cbrt(f8 * 5.0d)));
        float h8 = AbstractC6320b.h(f9) / fArr[1];
        double d10 = h8;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f17) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f18) / 100.0d, 0.42d)};
        float f23 = fArr7[0];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[1];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[2];
        float[] fArr8 = {f24, f26, (400.0f * f27) / (f27 + 27.13f)};
        return new l(h8, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, d8, f19, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    float a() {
        return this.f40115a;
    }

    float b() {
        return this.f40118d;
    }

    float c() {
        return this.f40122h;
    }

    float d() {
        return this.f40123i;
    }

    float e() {
        return this.f40120f;
    }

    float f() {
        return this.f40116b;
    }

    float g() {
        return this.f40119e;
    }

    float h() {
        return this.f40117c;
    }

    float[] i() {
        return this.f40121g;
    }

    float j() {
        return this.f40124j;
    }
}
