package com.google.android.material.carousel;

import t0.AbstractC6779a;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f31599a;

    /* renamed from: b, reason: collision with root package name */
    float f31600b;

    /* renamed from: c, reason: collision with root package name */
    int f31601c;

    /* renamed from: d, reason: collision with root package name */
    int f31602d;

    /* renamed from: e, reason: collision with root package name */
    float f31603e;

    /* renamed from: f, reason: collision with root package name */
    float f31604f;

    /* renamed from: g, reason: collision with root package name */
    final int f31605g;

    /* renamed from: h, reason: collision with root package name */
    final float f31606h;

    a(int i8, float f8, float f9, float f10, int i9, float f11, int i10, float f12, int i11, float f13) {
        this.f31599a = i8;
        this.f31600b = AbstractC6779a.a(f8, f9, f10);
        this.f31601c = i9;
        this.f31603e = f11;
        this.f31602d = i10;
        this.f31604f = f12;
        this.f31605g = i11;
        d(f13, f9, f10, f12);
        this.f31606h = b(f12);
    }

    private float a(float f8, int i8, float f9, int i9, int i10) {
        if (i8 <= 0) {
            f9 = 0.0f;
        }
        float f10 = i9 / 2.0f;
        return (f8 - ((i8 + f10) * f9)) / (i10 + f10);
    }

    private float b(float f8) {
        if (g()) {
            return Math.abs(f8 - this.f31604f) * this.f31599a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f8, float f9, float f10, float f11, int[] iArr, float f12, int[] iArr2, float f13, int[] iArr3) {
        a aVar = null;
        int i8 = 1;
        for (int i9 : iArr3) {
            int length = iArr2.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr2[i10];
                int length2 = iArr.length;
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = i12;
                    int i14 = length2;
                    int i15 = i10;
                    int i16 = length;
                    a aVar2 = new a(i8, f9, f10, f11, iArr[i12], f12, i11, f13, i9, f8);
                    if (aVar == null || aVar2.f31606h < aVar.f31606h) {
                        if (aVar2.f31606h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i8++;
                    i12 = i13 + 1;
                    length2 = i14;
                    i10 = i15;
                    length = i16;
                }
                i10++;
            }
        }
        return aVar;
    }

    private void d(float f8, float f9, float f10, float f11) {
        float f12 = f8 - f();
        int i8 = this.f31601c;
        if (i8 > 0 && f12 > 0.0f) {
            float f13 = this.f31600b;
            this.f31600b = f13 + Math.min(f12 / i8, f10 - f13);
        } else if (i8 > 0 && f12 < 0.0f) {
            float f14 = this.f31600b;
            this.f31600b = f14 + Math.max(f12 / i8, f9 - f14);
        }
        int i9 = this.f31601c;
        float f15 = i9 > 0 ? this.f31600b : 0.0f;
        this.f31600b = f15;
        float a8 = a(f8, i9, f15, this.f31602d, this.f31605g);
        this.f31604f = a8;
        float f16 = (this.f31600b + a8) / 2.0f;
        this.f31603e = f16;
        int i10 = this.f31602d;
        if (i10 <= 0 || a8 == f11) {
            return;
        }
        float f17 = (f11 - a8) * this.f31605g;
        float min = Math.min(Math.abs(f17), f16 * 0.1f * i10);
        if (f17 > 0.0f) {
            this.f31603e -= min / this.f31602d;
            this.f31604f += min / this.f31605g;
        } else {
            this.f31603e += min / this.f31602d;
            this.f31604f -= min / this.f31605g;
        }
    }

    private float f() {
        return (this.f31604f * this.f31605g) + (this.f31603e * this.f31602d) + (this.f31600b * this.f31601c);
    }

    private boolean g() {
        int i8 = this.f31605g;
        if (i8 <= 0 || this.f31601c <= 0 || this.f31602d <= 0) {
            return i8 <= 0 || this.f31601c <= 0 || this.f31604f > this.f31600b;
        }
        float f8 = this.f31604f;
        float f9 = this.f31603e;
        return f8 > f9 && f9 > this.f31600b;
    }

    int e() {
        return this.f31601c + this.f31602d + this.f31605g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f31599a + ", smallCount=" + this.f31601c + ", smallSize=" + this.f31600b + ", mediumCount=" + this.f31602d + ", mediumSize=" + this.f31603e + ", largeCount=" + this.f31605g + ", largeSize=" + this.f31604f + ", cost=" + this.f31606h + "]";
    }
}
