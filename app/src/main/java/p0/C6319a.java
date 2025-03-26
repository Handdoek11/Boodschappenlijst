package p0;

import q0.AbstractC6410a;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6319a {

    /* renamed from: a, reason: collision with root package name */
    private final float f40068a;

    /* renamed from: b, reason: collision with root package name */
    private final float f40069b;

    /* renamed from: c, reason: collision with root package name */
    private final float f40070c;

    /* renamed from: d, reason: collision with root package name */
    private final float f40071d;

    /* renamed from: e, reason: collision with root package name */
    private final float f40072e;

    /* renamed from: f, reason: collision with root package name */
    private final float f40073f;

    /* renamed from: g, reason: collision with root package name */
    private final float f40074g;

    /* renamed from: h, reason: collision with root package name */
    private final float f40075h;

    /* renamed from: i, reason: collision with root package name */
    private final float f40076i;

    C6319a(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f40068a = f8;
        this.f40069b = f9;
        this.f40070c = f10;
        this.f40071d = f11;
        this.f40072e = f12;
        this.f40073f = f13;
        this.f40074g = f14;
        this.f40075h = f15;
        this.f40076i = f16;
    }

    private static C6319a b(float f8, float f9, float f10) {
        float f11 = 100.0f;
        float f12 = 1000.0f;
        float f13 = 0.0f;
        C6319a c6319a = null;
        float f14 = 1000.0f;
        while (Math.abs(f13 - f11) > 0.01f) {
            float f15 = ((f11 - f13) / 2.0f) + f13;
            int p8 = e(f15, f9, f8).p();
            float b8 = AbstractC6320b.b(p8);
            float abs = Math.abs(f10 - b8);
            if (abs < 0.2f) {
                C6319a c8 = c(p8);
                float a8 = c8.a(e(c8.k(), c8.i(), f8));
                if (a8 <= 1.0f) {
                    c6319a = c8;
                    f12 = abs;
                    f14 = a8;
                }
            }
            if (f12 == 0.0f && f14 == 0.0f) {
                break;
            }
            if (b8 < f10) {
                f13 = f15;
            } else {
                f11 = f15;
            }
        }
        return c6319a;
    }

    static C6319a c(int i8) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i8, l.f40114k, fArr, fArr2);
        return new C6319a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i8, l lVar, float[] fArr, float[] fArr2) {
        AbstractC6320b.f(i8, fArr2);
        float[][] fArr3 = AbstractC6320b.f40077a;
        float f8 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f9 = fArr4[0] * f8;
        float f10 = fArr2[1];
        float f11 = f9 + (fArr4[1] * f10);
        float f12 = fArr2[2];
        float f13 = f11 + (fArr4[2] * f12);
        float[] fArr5 = fArr3[1];
        float f14 = (fArr5[0] * f8) + (fArr5[1] * f10) + (fArr5[2] * f12);
        float[] fArr6 = fArr3[2];
        float f15 = (f8 * fArr6[0]) + (f10 * fArr6[1]) + (f12 * fArr6[2]);
        float f16 = lVar.i()[0] * f13;
        float f17 = lVar.i()[1] * f14;
        float f18 = lVar.i()[2] * f15;
        float pow = (float) Math.pow((lVar.c() * Math.abs(f16)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((lVar.c() * Math.abs(f17)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((lVar.c() * Math.abs(f18)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d8 = signum3;
        float f19 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d8)) / 11.0f;
        float f20 = ((float) ((signum + signum2) - (d8 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = (((signum * 20.0f) + f21) + (21.0f * signum3)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f23 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float b8 = (4.0f / lVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (lVar.a() + 4.0f) * lVar.d();
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f19 * f19) + (f20 * f20)))) / (f22 + 0.305f), 0.9d));
        float d9 = lVar.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r7 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d9) + 1.0f)) * 43.85965f;
        double d10 = f24;
        float cos = ((float) Math.cos(d10)) * log;
        float sin = log * ((float) Math.sin(d10));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = b8;
            fArr[2] = d9;
            fArr[3] = sqrt2;
            fArr[4] = f25;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    private static C6319a e(float f8, float f9, float f10) {
        return f(f8, f9, f10, l.f40114k);
    }

    private static C6319a f(float f8, float f9, float f10, l lVar) {
        float b8 = (4.0f / lVar.b()) * ((float) Math.sqrt(f8 / 100.0d)) * (lVar.a() + 4.0f) * lVar.d();
        float d8 = f9 * lVar.d();
        float sqrt = ((float) Math.sqrt(((f9 / ((float) Math.sqrt(r4))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f11 = (1.7f * f8) / ((0.007f * f8) + 1.0f);
        float log = ((float) Math.log((d8 * 0.0228d) + 1.0d)) * 43.85965f;
        double d9 = (3.1415927f * f10) / 180.0f;
        return new C6319a(f10, f9, f8, b8, d8, sqrt, f11, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    public static int m(float f8, float f9, float f10) {
        return n(f8, f9, f10, l.f40114k);
    }

    static int n(float f8, float f9, float f10, l lVar) {
        if (f9 < 1.0d || Math.round(f10) <= 0.0d || Math.round(f10) >= 100.0d) {
            return AbstractC6320b.a(f10);
        }
        float min = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
        C6319a c6319a = null;
        boolean z7 = true;
        float f11 = 0.0f;
        float f12 = f9;
        while (Math.abs(f11 - f9) >= 0.4f) {
            C6319a b8 = b(min, f12, f10);
            if (!z7) {
                if (b8 == null) {
                    f9 = f12;
                } else {
                    f11 = f12;
                    c6319a = b8;
                }
                f12 = ((f9 - f11) / 2.0f) + f11;
            } else {
                if (b8 != null) {
                    return b8.o(lVar);
                }
                f12 = ((f9 - f11) / 2.0f) + f11;
                z7 = false;
            }
        }
        return c6319a == null ? AbstractC6320b.a(f10) : c6319a.o(lVar);
    }

    float a(C6319a c6319a) {
        float l8 = l() - c6319a.l();
        float g8 = g() - c6319a.g();
        float h8 = h() - c6319a.h();
        return (float) (Math.pow(Math.sqrt((l8 * l8) + (g8 * g8) + (h8 * h8)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f40075h;
    }

    float h() {
        return this.f40076i;
    }

    float i() {
        return this.f40069b;
    }

    float j() {
        return this.f40068a;
    }

    float k() {
        return this.f40070c;
    }

    float l() {
        return this.f40074g;
    }

    int o(l lVar) {
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double j8 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j8) + 3.8d)) * 0.25f;
        float a8 = lVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / lVar.b()) / lVar.j()));
        float g8 = cos * 3846.1538f * lVar.g() * lVar.h();
        float f8 = a8 / lVar.f();
        float sin = (float) Math.sin(j8);
        float cos2 = (float) Math.cos(j8);
        float f9 = (((0.305f + f8) * 23.0f) * pow) / (((g8 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f10 = cos2 * f9;
        float f11 = f9 * sin;
        float f12 = f8 * 460.0f;
        float f13 = (((451.0f * f10) + f12) + (288.0f * f11)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float signum = Math.signum(f13) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
        float signum2 = Math.signum(f14) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
        float signum3 = Math.signum(((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f15 = signum / lVar.i()[0];
        float f16 = signum2 / lVar.i()[1];
        float f17 = signum3 / lVar.i()[2];
        float[][] fArr = AbstractC6320b.f40078b;
        float[] fArr2 = fArr[0];
        float f18 = (fArr2[0] * f15) + (fArr2[1] * f16) + (fArr2[2] * f17);
        float[] fArr3 = fArr[1];
        float f19 = (fArr3[0] * f15) + (fArr3[1] * f16) + (fArr3[2] * f17);
        float[] fArr4 = fArr[2];
        return AbstractC6410a.b(f18, f19, (f15 * fArr4[0]) + (f16 * fArr4[1]) + (f17 * fArr4[2]));
    }

    int p() {
        return o(l.f40114k);
    }
}
