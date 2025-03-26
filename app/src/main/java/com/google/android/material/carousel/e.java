package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.f;

/* loaded from: classes2.dex */
abstract class e {
    static float a(float f8, float f9, int i8) {
        return f8 + (Math.max(0, i8 - 1) * f9);
    }

    static float b(float f8, float f9, int i8) {
        return i8 > 0 ? f8 + (f9 / 2.0f) : f8;
    }

    static f c(Context context, float f8, float f9, a aVar) {
        float f10;
        float f11;
        float min = Math.min(f(context) + f8, aVar.f31604f);
        float f12 = min / 2.0f;
        float f13 = 0.0f - f12;
        float b8 = b(0.0f, aVar.f31600b, aVar.f31601c);
        float j8 = j(0.0f, a(b8, aVar.f31600b, (int) Math.floor(aVar.f31601c / 2.0f)), aVar.f31600b, aVar.f31601c);
        float b9 = b(j8, aVar.f31603e, aVar.f31602d);
        float j9 = j(j8, a(b9, aVar.f31603e, (int) Math.floor(aVar.f31602d / 2.0f)), aVar.f31603e, aVar.f31602d);
        float b10 = b(j9, aVar.f31604f, aVar.f31605g);
        float j10 = j(j9, a(b10, aVar.f31604f, aVar.f31605g), aVar.f31604f, aVar.f31605g);
        float b11 = b(j10, aVar.f31603e, aVar.f31602d);
        float b12 = b(j(j10, a(b11, aVar.f31603e, (int) Math.ceil(aVar.f31602d / 2.0f)), aVar.f31603e, aVar.f31602d), aVar.f31600b, aVar.f31601c);
        float f14 = f12 + f9;
        float b13 = d.b(min, aVar.f31604f, f8);
        float b14 = d.b(aVar.f31600b, aVar.f31604f, f8);
        float b15 = d.b(aVar.f31603e, aVar.f31604f, f8);
        f.b a8 = new f.b(aVar.f31604f, f9).a(f13, b13, min);
        if (aVar.f31601c > 0) {
            f10 = f14;
            a8.g(b8, b14, aVar.f31600b, (int) Math.floor(r7 / 2.0f));
        } else {
            f10 = f14;
        }
        if (aVar.f31602d > 0) {
            a8.g(b9, b15, aVar.f31603e, (int) Math.floor(r4 / 2.0f));
        }
        a8.h(b10, 0.0f, aVar.f31604f, aVar.f31605g, true);
        if (aVar.f31602d > 0) {
            f11 = 2.0f;
            a8.g(b11, b15, aVar.f31603e, (int) Math.ceil(r4 / 2.0f));
        } else {
            f11 = 2.0f;
        }
        if (aVar.f31601c > 0) {
            a8.g(b12, b14, aVar.f31600b, (int) Math.ceil(r0 / f11));
        }
        a8.a(f10, b13, min);
        return a8.i();
    }

    static f d(Context context, float f8, float f9, a aVar, int i8) {
        return i8 == 1 ? c(context, f8, f9, aVar) : e(context, f8, f9, aVar);
    }

    static f e(Context context, float f8, float f9, a aVar) {
        float min = Math.min(f(context) + f8, aVar.f31604f);
        float f10 = min / 2.0f;
        float f11 = 0.0f - f10;
        float b8 = b(0.0f, aVar.f31604f, aVar.f31605g);
        float j8 = j(0.0f, a(b8, aVar.f31604f, aVar.f31605g), aVar.f31604f, aVar.f31605g);
        float b9 = b(j8, aVar.f31603e, aVar.f31602d);
        float b10 = b(j(j8, b9, aVar.f31603e, aVar.f31602d), aVar.f31600b, aVar.f31601c);
        float f12 = f10 + f9;
        float b11 = d.b(min, aVar.f31604f, f8);
        float b12 = d.b(aVar.f31600b, aVar.f31604f, f8);
        float b13 = d.b(aVar.f31603e, aVar.f31604f, f8);
        f.b h8 = new f.b(aVar.f31604f, f9).a(f11, b11, min).h(b8, 0.0f, aVar.f31604f, aVar.f31605g, true);
        if (aVar.f31602d > 0) {
            h8.b(b9, b13, aVar.f31603e);
        }
        int i8 = aVar.f31601c;
        if (i8 > 0) {
            h8.g(b10, b12, aVar.f31600b, i8);
        }
        h8.a(f12, b11, min);
        return h8.i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(D3.d.f1493s);
    }

    static float g(Context context) {
        return context.getResources().getDimension(D3.d.f1494t);
    }

    static float h(Context context) {
        return context.getResources().getDimension(D3.d.f1495u);
    }

    static int i(int[] iArr) {
        int i8 = Integer.MIN_VALUE;
        for (int i9 : iArr) {
            if (i9 > i8) {
                i8 = i9;
            }
        }
        return i8;
    }

    static float j(float f8, float f9, float f10, int i8) {
        return i8 > 0 ? f9 + (f10 / 2.0f) : f8;
    }
}
