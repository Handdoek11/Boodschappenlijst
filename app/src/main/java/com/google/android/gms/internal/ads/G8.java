package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class G8 {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f15288a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f15289b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f15290c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f15291d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f15292e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f15293f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f15294g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f15295h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f15296i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f15297j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f15298k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f15299l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f15300m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f15301n;

    /* renamed from: o, reason: collision with root package name */
    private Integer f15302o;

    /* renamed from: p, reason: collision with root package name */
    private Integer f15303p;

    /* renamed from: q, reason: collision with root package name */
    private Integer f15304q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f15305r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f15306s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f15307t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f15308u;

    /* renamed from: v, reason: collision with root package name */
    private CharSequence f15309v;

    /* renamed from: w, reason: collision with root package name */
    private Integer f15310w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC4169th0 f15311x;

    /* synthetic */ G8(M9 m9, AbstractC3245l9 abstractC3245l9) {
        this.f15288a = m9.f17265a;
        this.f15289b = m9.f17266b;
        this.f15290c = m9.f17267c;
        this.f15291d = m9.f17268d;
        this.f15292e = m9.f17269e;
        this.f15293f = m9.f17270f;
        this.f15294g = m9.f17271g;
        this.f15295h = m9.f17272h;
        this.f15296i = m9.f17273i;
        this.f15297j = m9.f17274j;
        this.f15298k = m9.f17275k;
        this.f15299l = m9.f17277m;
        this.f15300m = m9.f17278n;
        this.f15301n = m9.f17279o;
        this.f15302o = m9.f17280p;
        this.f15303p = m9.f17281q;
        this.f15304q = m9.f17282r;
        this.f15305r = m9.f17283s;
        this.f15306s = m9.f17284t;
        this.f15307t = m9.f17285u;
        this.f15308u = m9.f17286v;
        this.f15309v = m9.f17287w;
        this.f15310w = m9.f17288x;
        this.f15311x = m9.f17289y;
    }

    public final G8 A(CharSequence charSequence) {
        this.f15292e = charSequence;
        return this;
    }

    public final G8 B(CharSequence charSequence) {
        this.f15308u = charSequence;
        return this;
    }

    public final G8 C(Integer num) {
        this.f15301n = num;
        return this;
    }

    public final G8 D(Integer num) {
        this.f15300m = num;
        return this;
    }

    public final G8 E(Integer num) {
        this.f15299l = num;
        return this;
    }

    public final G8 F(Integer num) {
        this.f15304q = num;
        return this;
    }

    public final G8 G(Integer num) {
        this.f15303p = num;
        return this;
    }

    public final G8 H(Integer num) {
        this.f15302o = num;
        return this;
    }

    public final G8 I(CharSequence charSequence) {
        this.f15309v = charSequence;
        return this;
    }

    public final G8 J(CharSequence charSequence) {
        this.f15288a = charSequence;
        return this;
    }

    public final G8 K(Integer num) {
        this.f15296i = num;
        return this;
    }

    public final G8 L(Integer num) {
        this.f15295h = num;
        return this;
    }

    public final G8 M(CharSequence charSequence) {
        this.f15305r = charSequence;
        return this;
    }

    public final M9 N() {
        return new M9(this);
    }

    public final G8 t(byte[] bArr, int i8) {
        if (this.f15293f == null || Integer.valueOf(i8).equals(3) || !Objects.equals(this.f15294g, 3)) {
            this.f15293f = (byte[]) bArr.clone();
            this.f15294g = Integer.valueOf(i8);
        }
        return this;
    }

    public final G8 u(M9 m9) {
        if (m9 != null) {
            CharSequence charSequence = m9.f17265a;
            if (charSequence != null) {
                this.f15288a = charSequence;
            }
            CharSequence charSequence2 = m9.f17266b;
            if (charSequence2 != null) {
                this.f15289b = charSequence2;
            }
            CharSequence charSequence3 = m9.f17267c;
            if (charSequence3 != null) {
                this.f15290c = charSequence3;
            }
            CharSequence charSequence4 = m9.f17268d;
            if (charSequence4 != null) {
                this.f15291d = charSequence4;
            }
            CharSequence charSequence5 = m9.f17269e;
            if (charSequence5 != null) {
                this.f15292e = charSequence5;
            }
            byte[] bArr = m9.f17270f;
            if (bArr != null) {
                Integer num = m9.f17271g;
                this.f15293f = (byte[]) bArr.clone();
                this.f15294g = num;
            }
            Integer num2 = m9.f17272h;
            if (num2 != null) {
                this.f15295h = num2;
            }
            Integer num3 = m9.f17273i;
            if (num3 != null) {
                this.f15296i = num3;
            }
            Integer num4 = m9.f17274j;
            if (num4 != null) {
                this.f15297j = num4;
            }
            Boolean bool = m9.f17275k;
            if (bool != null) {
                this.f15298k = bool;
            }
            Integer num5 = m9.f17276l;
            if (num5 != null) {
                this.f15299l = num5;
            }
            Integer num6 = m9.f17277m;
            if (num6 != null) {
                this.f15299l = num6;
            }
            Integer num7 = m9.f17278n;
            if (num7 != null) {
                this.f15300m = num7;
            }
            Integer num8 = m9.f17279o;
            if (num8 != null) {
                this.f15301n = num8;
            }
            Integer num9 = m9.f17280p;
            if (num9 != null) {
                this.f15302o = num9;
            }
            Integer num10 = m9.f17281q;
            if (num10 != null) {
                this.f15303p = num10;
            }
            Integer num11 = m9.f17282r;
            if (num11 != null) {
                this.f15304q = num11;
            }
            CharSequence charSequence6 = m9.f17283s;
            if (charSequence6 != null) {
                this.f15305r = charSequence6;
            }
            CharSequence charSequence7 = m9.f17284t;
            if (charSequence7 != null) {
                this.f15306s = charSequence7;
            }
            CharSequence charSequence8 = m9.f17285u;
            if (charSequence8 != null) {
                this.f15307t = charSequence8;
            }
            CharSequence charSequence9 = m9.f17286v;
            if (charSequence9 != null) {
                this.f15308u = charSequence9;
            }
            CharSequence charSequence10 = m9.f17287w;
            if (charSequence10 != null) {
                this.f15309v = charSequence10;
            }
            Integer num12 = m9.f17288x;
            if (num12 != null) {
                this.f15310w = num12;
            }
        }
        return this;
    }

    public final G8 v(CharSequence charSequence) {
        this.f15291d = charSequence;
        return this;
    }

    public final G8 w(CharSequence charSequence) {
        this.f15290c = charSequence;
        return this;
    }

    public final G8 x(CharSequence charSequence) {
        this.f15289b = charSequence;
        return this;
    }

    public final G8 y(CharSequence charSequence) {
        this.f15306s = charSequence;
        return this;
    }

    public final G8 z(CharSequence charSequence) {
        this.f15307t = charSequence;
        return this;
    }

    public G8() {
        this.f15311x = AbstractC4169th0.w();
    }
}
