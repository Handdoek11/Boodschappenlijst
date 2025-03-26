package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: classes.dex */
final class B4 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f13719a = new UQ();

    /* renamed from: b, reason: collision with root package name */
    private final int[] f13720b = new int[256];

    /* renamed from: c, reason: collision with root package name */
    private boolean f13721c;

    /* renamed from: d, reason: collision with root package name */
    private int f13722d;

    /* renamed from: e, reason: collision with root package name */
    private int f13723e;

    /* renamed from: f, reason: collision with root package name */
    private int f13724f;

    /* renamed from: g, reason: collision with root package name */
    private int f13725g;

    /* renamed from: h, reason: collision with root package name */
    private int f13726h;

    /* renamed from: i, reason: collision with root package name */
    private int f13727i;

    static /* bridge */ /* synthetic */ void b(B4 b42, UQ uq, int i8) {
        int E7;
        if (i8 < 4) {
            return;
        }
        uq.m(3);
        int i9 = i8 - 4;
        if ((uq.C() & 128) != 0) {
            if (i9 < 7 || (E7 = uq.E()) < 4) {
                return;
            }
            b42.f13726h = uq.G();
            b42.f13727i = uq.G();
            b42.f13719a.i(E7 - 4);
            i9 = i8 - 11;
        }
        UQ uq2 = b42.f13719a;
        int t7 = uq2.t();
        int u7 = uq2.u();
        if (t7 >= u7 || i9 <= 0) {
            return;
        }
        int min = Math.min(i9, u7 - t7);
        uq.h(uq2.n(), t7, min);
        b42.f13719a.l(t7 + min);
    }

    static /* bridge */ /* synthetic */ void c(B4 b42, UQ uq, int i8) {
        if (i8 < 19) {
            return;
        }
        b42.f13722d = uq.G();
        b42.f13723e = uq.G();
        uq.m(11);
        b42.f13724f = uq.G();
        b42.f13725g = uq.G();
    }

    static /* bridge */ /* synthetic */ void d(B4 b42, UQ uq, int i8) {
        if (i8 % 5 != 2) {
            return;
        }
        uq.m(2);
        int i9 = 0;
        Arrays.fill(b42.f13720b, 0);
        int i10 = i8 / 5;
        int i11 = 0;
        while (i11 < i10) {
            int C7 = uq.C();
            int C8 = uq.C();
            int C9 = uq.C();
            int C10 = uq.C();
            int C11 = uq.C();
            double d8 = C8;
            int[] iArr = b42.f13720b;
            double d9 = C9 - 128;
            int max = Math.max(i9, Math.min((int) ((1.402d * d9) + d8), 255)) << 16;
            double d10 = C10 - 128;
            iArr[C7] = Math.max(0, Math.min((int) (d8 + (d10 * 1.772d)), 255)) | (C11 << 24) | max | (Math.max(0, Math.min((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 255)) << 8);
            i11++;
            i9 = 0;
        }
        b42.f13721c = true;
    }

    public final C3004iy a() {
        int i8;
        if (this.f13722d == 0 || this.f13723e == 0 || this.f13726h == 0 || this.f13727i == 0) {
            return null;
        }
        UQ uq = this.f13719a;
        if (uq.u() == 0 || uq.t() != uq.u() || !this.f13721c) {
            return null;
        }
        uq.l(0);
        int i9 = this.f13726h * this.f13727i;
        int[] iArr = new int[i9];
        int i10 = 0;
        while (i10 < i9) {
            int C7 = this.f13719a.C();
            if (C7 != 0) {
                i8 = i10 + 1;
                iArr[i10] = this.f13720b[C7];
            } else {
                int C8 = this.f13719a.C();
                if (C8 != 0) {
                    int i11 = C8 & 63;
                    if ((C8 & 64) != 0) {
                        i11 = (i11 << 8) | this.f13719a.C();
                    }
                    i8 = i11 + i10;
                    Arrays.fill(iArr, i10, i8, (C8 & 128) == 0 ? this.f13720b[0] : this.f13720b[this.f13719a.C()]);
                }
            }
            i10 = i8;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f13726h, this.f13727i, Bitmap.Config.ARGB_8888);
        C2677fx c2677fx = new C2677fx();
        c2677fx.c(createBitmap);
        c2677fx.h(this.f13724f / this.f13722d);
        c2677fx.i(0);
        c2677fx.e(this.f13725g / this.f13723e, 0);
        c2677fx.f(0);
        c2677fx.k(this.f13726h / this.f13722d);
        c2677fx.d(this.f13727i / this.f13723e);
        return c2677fx.p();
    }

    public final void e() {
        this.f13722d = 0;
        this.f13723e = 0;
        this.f13724f = 0;
        this.f13725g = 0;
        this.f13726h = 0;
        this.f13727i = 0;
        this.f13719a.i(0);
        this.f13721c = false;
    }
}
