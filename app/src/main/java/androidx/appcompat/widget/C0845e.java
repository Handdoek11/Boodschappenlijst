package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0845e {

    /* renamed from: a, reason: collision with root package name */
    private final View f7814a;

    /* renamed from: d, reason: collision with root package name */
    private d0 f7817d;

    /* renamed from: e, reason: collision with root package name */
    private d0 f7818e;

    /* renamed from: f, reason: collision with root package name */
    private d0 f7819f;

    /* renamed from: c, reason: collision with root package name */
    private int f7816c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C0851k f7815b = C0851k.b();

    C0845e(View view) {
        this.f7814a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f7819f == null) {
            this.f7819f = new d0();
        }
        d0 d0Var = this.f7819f;
        d0Var.a();
        ColorStateList r8 = z0.X.r(this.f7814a);
        if (r8 != null) {
            d0Var.f7813d = true;
            d0Var.f7810a = r8;
        }
        PorterDuff.Mode s8 = z0.X.s(this.f7814a);
        if (s8 != null) {
            d0Var.f7812c = true;
            d0Var.f7811b = s8;
        }
        if (!d0Var.f7813d && !d0Var.f7812c) {
            return false;
        }
        C0851k.i(drawable, d0Var, this.f7814a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f7817d != null;
    }

    void b() {
        Drawable background = this.f7814a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            d0 d0Var = this.f7818e;
            if (d0Var != null) {
                C0851k.i(background, d0Var, this.f7814a.getDrawableState());
                return;
            }
            d0 d0Var2 = this.f7817d;
            if (d0Var2 != null) {
                C0851k.i(background, d0Var2, this.f7814a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        d0 d0Var = this.f7818e;
        if (d0Var != null) {
            return d0Var.f7810a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        d0 d0Var = this.f7818e;
        if (d0Var != null) {
            return d0Var.f7811b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i8) {
        f0 v7 = f0.v(this.f7814a.getContext(), attributeSet, f.j.f35601K3, i8, 0);
        View view = this.f7814a;
        z0.X.l0(view, view.getContext(), f.j.f35601K3, attributeSet, v7.r(), i8, 0);
        try {
            if (v7.s(f.j.f35606L3)) {
                this.f7816c = v7.n(f.j.f35606L3, -1);
                ColorStateList f8 = this.f7815b.f(this.f7814a.getContext(), this.f7816c);
                if (f8 != null) {
                    h(f8);
                }
            }
            if (v7.s(f.j.f35611M3)) {
                z0.X.s0(this.f7814a, v7.c(f.j.f35611M3));
            }
            if (v7.s(f.j.f35616N3)) {
                z0.X.t0(this.f7814a, O.e(v7.k(f.j.f35616N3, -1), null));
            }
            v7.x();
        } catch (Throwable th) {
            v7.x();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f7816c = -1;
        h(null);
        b();
    }

    void g(int i8) {
        this.f7816c = i8;
        C0851k c0851k = this.f7815b;
        h(c0851k != null ? c0851k.f(this.f7814a.getContext(), i8) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f7817d == null) {
                this.f7817d = new d0();
            }
            d0 d0Var = this.f7817d;
            d0Var.f7810a = colorStateList;
            d0Var.f7813d = true;
        } else {
            this.f7817d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f7818e == null) {
            this.f7818e = new d0();
        }
        d0 d0Var = this.f7818e;
        d0Var.f7810a = colorStateList;
        d0Var.f7813d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f7818e == null) {
            this.f7818e = new d0();
        }
        d0 d0Var = this.f7818e;
        d0Var.f7811b = mode;
        d0Var.f7812c = true;
        b();
    }
}
