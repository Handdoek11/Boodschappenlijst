package com.google.android.material.button;

import D3.b;
import D3.l;
import S3.c;
import V3.g;
import V3.k;
import V3.n;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.internal.o;
import r0.AbstractC6641a;
import z0.X;

/* loaded from: classes2.dex */
class a {

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f31553u = true;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f31554v = false;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f31555a;

    /* renamed from: b, reason: collision with root package name */
    private k f31556b;

    /* renamed from: c, reason: collision with root package name */
    private int f31557c;

    /* renamed from: d, reason: collision with root package name */
    private int f31558d;

    /* renamed from: e, reason: collision with root package name */
    private int f31559e;

    /* renamed from: f, reason: collision with root package name */
    private int f31560f;

    /* renamed from: g, reason: collision with root package name */
    private int f31561g;

    /* renamed from: h, reason: collision with root package name */
    private int f31562h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f31563i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f31564j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f31565k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f31566l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f31567m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f31571q;

    /* renamed from: s, reason: collision with root package name */
    private LayerDrawable f31573s;

    /* renamed from: t, reason: collision with root package name */
    private int f31574t;

    /* renamed from: n, reason: collision with root package name */
    private boolean f31568n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f31569o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f31570p = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f31572r = true;

    a(MaterialButton materialButton, k kVar) {
        this.f31555a = materialButton;
        this.f31556b = kVar;
    }

    private void G(int i8, int i9) {
        int E7 = X.E(this.f31555a);
        int paddingTop = this.f31555a.getPaddingTop();
        int D7 = X.D(this.f31555a);
        int paddingBottom = this.f31555a.getPaddingBottom();
        int i10 = this.f31559e;
        int i11 = this.f31560f;
        this.f31560f = i9;
        this.f31559e = i8;
        if (!this.f31569o) {
            H();
        }
        X.B0(this.f31555a, E7, (paddingTop + i8) - i10, D7, (paddingBottom + i9) - i11);
    }

    private void H() {
        this.f31555a.setInternalBackground(a());
        g f8 = f();
        if (f8 != null) {
            f8.T(this.f31574t);
            f8.setState(this.f31555a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (f31554v && !this.f31569o) {
            int E7 = X.E(this.f31555a);
            int paddingTop = this.f31555a.getPaddingTop();
            int D7 = X.D(this.f31555a);
            int paddingBottom = this.f31555a.getPaddingBottom();
            H();
            X.B0(this.f31555a, E7, paddingTop, D7, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void J() {
        g f8 = f();
        g n8 = n();
        if (f8 != null) {
            f8.Z(this.f31562h, this.f31565k);
            if (n8 != null) {
                n8.Y(this.f31562h, this.f31568n ? L3.a.d(this.f31555a, b.f1413l) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f31557c, this.f31559e, this.f31558d, this.f31560f);
    }

    private Drawable a() {
        g gVar = new g(this.f31556b);
        gVar.J(this.f31555a.getContext());
        AbstractC6641a.o(gVar, this.f31564j);
        PorterDuff.Mode mode = this.f31563i;
        if (mode != null) {
            AbstractC6641a.p(gVar, mode);
        }
        gVar.Z(this.f31562h, this.f31565k);
        g gVar2 = new g(this.f31556b);
        gVar2.setTint(0);
        gVar2.Y(this.f31562h, this.f31568n ? L3.a.d(this.f31555a, b.f1413l) : 0);
        if (f31553u) {
            g gVar3 = new g(this.f31556b);
            this.f31567m = gVar3;
            AbstractC6641a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(T3.b.d(this.f31566l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f31567m);
            this.f31573s = rippleDrawable;
            return rippleDrawable;
        }
        T3.a aVar = new T3.a(this.f31556b);
        this.f31567m = aVar;
        AbstractC6641a.o(aVar, T3.b.d(this.f31566l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f31567m});
        this.f31573s = layerDrawable;
        return K(layerDrawable);
    }

    private g g(boolean z7) {
        LayerDrawable layerDrawable = this.f31573s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f31553u ? (g) ((LayerDrawable) ((InsetDrawable) this.f31573s.getDrawable(0)).getDrawable()).getDrawable(!z7 ? 1 : 0) : (g) this.f31573s.getDrawable(!z7 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    void A(boolean z7) {
        this.f31568n = z7;
        J();
    }

    void B(ColorStateList colorStateList) {
        if (this.f31565k != colorStateList) {
            this.f31565k = colorStateList;
            J();
        }
    }

    void C(int i8) {
        if (this.f31562h != i8) {
            this.f31562h = i8;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.f31564j != colorStateList) {
            this.f31564j = colorStateList;
            if (f() != null) {
                AbstractC6641a.o(f(), this.f31564j);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.f31563i != mode) {
            this.f31563i = mode;
            if (f() == null || this.f31563i == null) {
                return;
            }
            AbstractC6641a.p(f(), this.f31563i);
        }
    }

    void F(boolean z7) {
        this.f31572r = z7;
    }

    int b() {
        return this.f31561g;
    }

    public int c() {
        return this.f31560f;
    }

    public int d() {
        return this.f31559e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f31573s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f31573s.getNumberOfLayers() > 2 ? (n) this.f31573s.getDrawable(2) : (n) this.f31573s.getDrawable(1);
    }

    g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f31566l;
    }

    k i() {
        return this.f31556b;
    }

    ColorStateList j() {
        return this.f31565k;
    }

    int k() {
        return this.f31562h;
    }

    ColorStateList l() {
        return this.f31564j;
    }

    PorterDuff.Mode m() {
        return this.f31563i;
    }

    boolean o() {
        return this.f31569o;
    }

    boolean p() {
        return this.f31571q;
    }

    boolean q() {
        return this.f31572r;
    }

    void r(TypedArray typedArray) {
        this.f31557c = typedArray.getDimensionPixelOffset(l.f1780S2, 0);
        this.f31558d = typedArray.getDimensionPixelOffset(l.f1788T2, 0);
        this.f31559e = typedArray.getDimensionPixelOffset(l.f1796U2, 0);
        this.f31560f = typedArray.getDimensionPixelOffset(l.f1804V2, 0);
        if (typedArray.hasValue(l.f1836Z2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(l.f1836Z2, -1);
            this.f31561g = dimensionPixelSize;
            z(this.f31556b.w(dimensionPixelSize));
            this.f31570p = true;
        }
        this.f31562h = typedArray.getDimensionPixelSize(l.f1926j3, 0);
        this.f31563i = o.i(typedArray.getInt(l.f1828Y2, -1), PorterDuff.Mode.SRC_IN);
        this.f31564j = c.a(this.f31555a.getContext(), typedArray, l.f1820X2);
        this.f31565k = c.a(this.f31555a.getContext(), typedArray, l.f1917i3);
        this.f31566l = c.a(this.f31555a.getContext(), typedArray, l.f1908h3);
        this.f31571q = typedArray.getBoolean(l.f1812W2, false);
        this.f31574t = typedArray.getDimensionPixelSize(l.f1845a3, 0);
        this.f31572r = typedArray.getBoolean(l.f1935k3, true);
        int E7 = X.E(this.f31555a);
        int paddingTop = this.f31555a.getPaddingTop();
        int D7 = X.D(this.f31555a);
        int paddingBottom = this.f31555a.getPaddingBottom();
        if (typedArray.hasValue(l.f1772R2)) {
            t();
        } else {
            H();
        }
        X.B0(this.f31555a, E7 + this.f31557c, paddingTop + this.f31559e, D7 + this.f31558d, paddingBottom + this.f31560f);
    }

    void s(int i8) {
        if (f() != null) {
            f().setTint(i8);
        }
    }

    void t() {
        this.f31569o = true;
        this.f31555a.setSupportBackgroundTintList(this.f31564j);
        this.f31555a.setSupportBackgroundTintMode(this.f31563i);
    }

    void u(boolean z7) {
        this.f31571q = z7;
    }

    void v(int i8) {
        if (this.f31570p && this.f31561g == i8) {
            return;
        }
        this.f31561g = i8;
        this.f31570p = true;
        z(this.f31556b.w(i8));
    }

    public void w(int i8) {
        G(this.f31559e, i8);
    }

    public void x(int i8) {
        G(i8, this.f31560f);
    }

    void y(ColorStateList colorStateList) {
        if (this.f31566l != colorStateList) {
            this.f31566l = colorStateList;
            boolean z7 = f31553u;
            if (z7 && (this.f31555a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f31555a.getBackground()).setColor(T3.b.d(colorStateList));
            } else {
                if (z7 || !(this.f31555a.getBackground() instanceof T3.a)) {
                    return;
                }
                ((T3.a) this.f31555a.getBackground()).setTintList(T3.b.d(colorStateList));
            }
        }
    }

    void z(k kVar) {
        this.f31556b = kVar;
        I(kVar);
    }
}
