package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes.dex */
final class S4 {

    /* renamed from: a, reason: collision with root package name */
    private String f18802a;

    /* renamed from: b, reason: collision with root package name */
    private int f18803b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18804c;

    /* renamed from: d, reason: collision with root package name */
    private int f18805d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18806e;

    /* renamed from: k, reason: collision with root package name */
    private float f18812k;

    /* renamed from: l, reason: collision with root package name */
    private String f18813l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f18816o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f18817p;

    /* renamed from: r, reason: collision with root package name */
    private L4 f18819r;

    /* renamed from: f, reason: collision with root package name */
    private int f18807f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f18808g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f18809h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f18810i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f18811j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f18814m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f18815n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f18818q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f18820s = Float.MAX_VALUE;

    public final S4 A(float f8) {
        this.f18812k = f8;
        return this;
    }

    public final S4 B(int i8) {
        this.f18811j = i8;
        return this;
    }

    public final S4 C(String str) {
        this.f18813l = str;
        return this;
    }

    public final S4 D(boolean z7) {
        this.f18810i = z7 ? 1 : 0;
        return this;
    }

    public final S4 E(boolean z7) {
        this.f18807f = z7 ? 1 : 0;
        return this;
    }

    public final S4 F(Layout.Alignment alignment) {
        this.f18817p = alignment;
        return this;
    }

    public final S4 G(int i8) {
        this.f18815n = i8;
        return this;
    }

    public final S4 H(int i8) {
        this.f18814m = i8;
        return this;
    }

    public final S4 I(float f8) {
        this.f18820s = f8;
        return this;
    }

    public final S4 J(Layout.Alignment alignment) {
        this.f18816o = alignment;
        return this;
    }

    public final S4 a(boolean z7) {
        this.f18818q = z7 ? 1 : 0;
        return this;
    }

    public final S4 b(L4 l42) {
        this.f18819r = l42;
        return this;
    }

    public final S4 c(boolean z7) {
        this.f18808g = z7 ? 1 : 0;
        return this;
    }

    public final String d() {
        return this.f18802a;
    }

    public final String e() {
        return this.f18813l;
    }

    public final boolean f() {
        return this.f18818q == 1;
    }

    public final boolean g() {
        return this.f18806e;
    }

    public final boolean h() {
        return this.f18804c;
    }

    public final boolean i() {
        return this.f18807f == 1;
    }

    public final boolean j() {
        return this.f18808g == 1;
    }

    public final float k() {
        return this.f18812k;
    }

    public final float l() {
        return this.f18820s;
    }

    public final int m() {
        if (this.f18806e) {
            return this.f18805d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int n() {
        if (this.f18804c) {
            return this.f18803b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int o() {
        return this.f18811j;
    }

    public final int p() {
        return this.f18815n;
    }

    public final int q() {
        return this.f18814m;
    }

    public final int r() {
        int i8 = this.f18809h;
        if (i8 == -1 && this.f18810i == -1) {
            return -1;
        }
        return (i8 == 1 ? 1 : 0) | (this.f18810i == 1 ? 2 : 0);
    }

    public final Layout.Alignment s() {
        return this.f18817p;
    }

    public final Layout.Alignment t() {
        return this.f18816o;
    }

    public final L4 u() {
        return this.f18819r;
    }

    public final S4 v(S4 s42) {
        int i8;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (s42 != null) {
            if (!this.f18804c && s42.f18804c) {
                y(s42.f18803b);
            }
            if (this.f18809h == -1) {
                this.f18809h = s42.f18809h;
            }
            if (this.f18810i == -1) {
                this.f18810i = s42.f18810i;
            }
            if (this.f18802a == null && (str = s42.f18802a) != null) {
                this.f18802a = str;
            }
            if (this.f18807f == -1) {
                this.f18807f = s42.f18807f;
            }
            if (this.f18808g == -1) {
                this.f18808g = s42.f18808g;
            }
            if (this.f18815n == -1) {
                this.f18815n = s42.f18815n;
            }
            if (this.f18816o == null && (alignment2 = s42.f18816o) != null) {
                this.f18816o = alignment2;
            }
            if (this.f18817p == null && (alignment = s42.f18817p) != null) {
                this.f18817p = alignment;
            }
            if (this.f18818q == -1) {
                this.f18818q = s42.f18818q;
            }
            if (this.f18811j == -1) {
                this.f18811j = s42.f18811j;
                this.f18812k = s42.f18812k;
            }
            if (this.f18819r == null) {
                this.f18819r = s42.f18819r;
            }
            if (this.f18820s == Float.MAX_VALUE) {
                this.f18820s = s42.f18820s;
            }
            if (!this.f18806e && s42.f18806e) {
                w(s42.f18805d);
            }
            if (this.f18814m == -1 && (i8 = s42.f18814m) != -1) {
                this.f18814m = i8;
            }
        }
        return this;
    }

    public final S4 w(int i8) {
        this.f18805d = i8;
        this.f18806e = true;
        return this;
    }

    public final S4 x(boolean z7) {
        this.f18809h = z7 ? 1 : 0;
        return this;
    }

    public final S4 y(int i8) {
        this.f18803b = i8;
        this.f18804c = true;
        return this;
    }

    public final S4 z(String str) {
        this.f18802a = str;
        return this;
    }
}
