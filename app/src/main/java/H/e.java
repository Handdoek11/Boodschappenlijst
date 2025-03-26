package H;

import H.c;
import H.i;
import J6.AbstractC0650j;

/* loaded from: classes.dex */
public abstract class e {
    public static final double a(double d8, double d9, double d10, double d11, double d12, double d13) {
        return Math.copySign(q(d8 < 0.0d ? -d8 : d8, d9, d10, d11, d12, d13), d8);
    }

    public static final double b(double d8, double d9, double d10, double d11, double d12, double d13) {
        return Math.copySign(s(d8 < 0.0d ? -d8 : d8, d9, d10, d11, d12, d13), d8);
    }

    public static final d c(d dVar, A a8, AbstractC0625a abstractC0625a) {
        if (!c.e(dVar.e(), c.f2772a.b())) {
            return dVar;
        }
        J6.r.c(dVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        x xVar = (x) dVar;
        if (f(xVar.J(), a8)) {
            return dVar;
        }
        return new x(xVar, k(e(abstractC0625a.b(), xVar.J().c(), a8.c()), xVar.I()), a8);
    }

    public static /* synthetic */ d d(d dVar, A a8, AbstractC0625a abstractC0625a, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            abstractC0625a = AbstractC0625a.f2767b.a();
        }
        return c(dVar, a8, abstractC0625a);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] m8 = m(fArr, fArr2);
        float[] m9 = m(fArr, fArr3);
        return k(j(fArr), l(new float[]{m9[0] / m8[0], m9[1] / m8[1], m9[2] / m8[2]}, fArr));
    }

    public static final boolean f(A a8, A a9) {
        if (a8 == a9) {
            return true;
        }
        return Math.abs(a8.a() - a9.a()) < 0.001f && Math.abs(a8.b() - a9.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (Float.compare(fArr[i8], fArr2[i8]) != 0 && Math.abs(fArr[i8] - fArr2[i8]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final i h(d dVar, d dVar2, int i8) {
        h hVar = h.f2781a;
        if (dVar == hVar.h()) {
            if (dVar2 == hVar.h()) {
                return i.f2805g.d();
            }
            if (dVar2 == hVar.g() && n.e(i8, n.f2835a.b())) {
                return i.f2805g.e();
            }
        } else if (dVar == hVar.g() && dVar2 == hVar.h() && n.e(i8, n.f2835a.b())) {
            return i.f2805g.c();
        }
        if (dVar == dVar2) {
            return i.f2805g.f(dVar);
        }
        long e8 = dVar.e();
        c.a aVar = c.f2772a;
        AbstractC0650j abstractC0650j = null;
        if (!c.e(e8, aVar.b()) || !c.e(dVar2.e(), aVar.b())) {
            return new i(dVar, dVar2, i8, abstractC0650j);
        }
        J6.r.c(dVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        J6.r.c(dVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new i.b((x) dVar, (x) dVar2, i8, abstractC0650j);
    }

    public static /* synthetic */ i i(d dVar, d dVar2, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            dVar2 = h.f2781a.h();
        }
        if ((i9 & 2) != 0) {
            i8 = n.f2835a.b();
        }
        return h(dVar, dVar2, i8);
    }

    public static final float[] j(float[] fArr) {
        float f8 = fArr[0];
        float f9 = fArr[3];
        float f10 = fArr[6];
        float f11 = fArr[1];
        float f12 = fArr[4];
        float f13 = fArr[7];
        float f14 = fArr[2];
        float f15 = fArr[5];
        float f16 = fArr[8];
        float f17 = (f12 * f16) - (f13 * f15);
        float f18 = (f13 * f14) - (f11 * f16);
        float f19 = (f11 * f15) - (f12 * f14);
        float f20 = (f8 * f17) + (f9 * f18) + (f10 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f17 / f20;
        fArr2[1] = f18 / f20;
        fArr2[2] = f19 / f20;
        fArr2[3] = ((f10 * f15) - (f9 * f16)) / f20;
        fArr2[4] = ((f16 * f8) - (f10 * f14)) / f20;
        fArr2[5] = ((f14 * f9) - (f15 * f8)) / f20;
        fArr2[6] = ((f9 * f13) - (f10 * f12)) / f20;
        fArr2[7] = ((f10 * f11) - (f13 * f8)) / f20;
        fArr2[8] = ((f8 * f12) - (f9 * f11)) / f20;
        return fArr2;
    }

    public static final float[] k(float[] fArr, float[] fArr2) {
        float f8 = fArr[0];
        float f9 = fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        float f14 = (f8 * f9) + (f10 * f11) + (f12 * f13);
        float f15 = fArr[1];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = (f15 * f9) + (f16 * f11) + (f17 * f13);
        float f19 = fArr[2];
        float f20 = fArr[5];
        float f21 = fArr[8];
        float f22 = (f9 * f19) + (f11 * f20) + (f13 * f21);
        float f23 = fArr2[3];
        float f24 = fArr2[4];
        float f25 = fArr2[5];
        float f26 = (f8 * f23) + (f10 * f24) + (f12 * f25);
        float f27 = (f15 * f23) + (f16 * f24) + (f17 * f25);
        float f28 = (f23 * f19) + (f24 * f20) + (f25 * f21);
        float f29 = fArr2[6];
        float f30 = fArr2[7];
        float f31 = (f8 * f29) + (f10 * f30);
        float f32 = fArr2[8];
        return new float[]{f14, f18, f22, f26, f27, f28, f31 + (f12 * f32), (f15 * f29) + (f16 * f30) + (f17 * f32), (f19 * f29) + (f20 * f30) + (f21 * f32)};
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float f8 = fArr[0];
        float f9 = fArr2[0] * f8;
        float f10 = fArr[1];
        float f11 = fArr2[1] * f10;
        float f12 = fArr[2];
        return new float[]{f9, f11, fArr2[2] * f12, fArr2[3] * f8, fArr2[4] * f10, fArr2[5] * f12, f8 * fArr2[6], f10 * fArr2[7], f12 * fArr2[8]};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f8 = fArr2[0];
        float f9 = fArr2[1];
        float f10 = fArr2[2];
        fArr2[0] = (fArr[0] * f8) + (fArr[3] * f9) + (fArr[6] * f10);
        fArr2[1] = (fArr[1] * f8) + (fArr[4] * f9) + (fArr[7] * f10);
        fArr2[2] = (fArr[2] * f8) + (fArr[5] * f9) + (fArr[8] * f10);
        return fArr2;
    }

    public static final float n(float[] fArr, float f8, float f9, float f10) {
        return (fArr[0] * f8) + (fArr[3] * f9) + (fArr[6] * f10);
    }

    public static final float o(float[] fArr, float f8, float f9, float f10) {
        return (fArr[1] * f8) + (fArr[4] * f9) + (fArr[7] * f10);
    }

    public static final float p(float[] fArr, float f8, float f9, float f10) {
        return (fArr[2] * f8) + (fArr[5] * f9) + (fArr[8] * f10);
    }

    public static final double q(double d8, double d9, double d10, double d11, double d12, double d13) {
        return d8 >= d12 * d11 ? (Math.pow(d8, 1.0d / d13) - d10) / d9 : d8 / d11;
    }

    public static final double r(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        return d8 >= d12 * d11 ? (Math.pow(d8 - d13, 1.0d / d15) - d10) / d9 : (d8 - d14) / d11;
    }

    public static final double s(double d8, double d9, double d10, double d11, double d12, double d13) {
        return d8 >= d12 ? Math.pow((d9 * d8) + d10, d13) : d8 * d11;
    }

    public static final double t(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        return d8 >= d12 ? Math.pow((d9 * d8) + d10, d15) + d13 : (d11 * d8) + d14;
    }
}
