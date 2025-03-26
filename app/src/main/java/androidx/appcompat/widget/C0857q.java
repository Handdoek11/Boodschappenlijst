package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import g.AbstractC5794a;

/* renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0857q {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f7918a;

    /* renamed from: b, reason: collision with root package name */
    private d0 f7919b;

    /* renamed from: c, reason: collision with root package name */
    private d0 f7920c;

    /* renamed from: d, reason: collision with root package name */
    private d0 f7921d;

    /* renamed from: e, reason: collision with root package name */
    private int f7922e = 0;

    public C0857q(ImageView imageView) {
        this.f7918a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f7921d == null) {
            this.f7921d = new d0();
        }
        d0 d0Var = this.f7921d;
        d0Var.a();
        ColorStateList a8 = androidx.core.widget.e.a(this.f7918a);
        if (a8 != null) {
            d0Var.f7813d = true;
            d0Var.f7810a = a8;
        }
        PorterDuff.Mode b8 = androidx.core.widget.e.b(this.f7918a);
        if (b8 != null) {
            d0Var.f7812c = true;
            d0Var.f7811b = b8;
        }
        if (!d0Var.f7813d && !d0Var.f7812c) {
            return false;
        }
        C0851k.i(drawable, d0Var, this.f7918a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f7919b != null;
    }

    void b() {
        if (this.f7918a.getDrawable() != null) {
            this.f7918a.getDrawable().setLevel(this.f7922e);
        }
    }

    void c() {
        Drawable drawable = this.f7918a.getDrawable();
        if (drawable != null) {
            O.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            d0 d0Var = this.f7920c;
            if (d0Var != null) {
                C0851k.i(drawable, d0Var, this.f7918a.getDrawableState());
                return;
            }
            d0 d0Var2 = this.f7919b;
            if (d0Var2 != null) {
                C0851k.i(drawable, d0Var2, this.f7918a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        d0 d0Var = this.f7920c;
        if (d0Var != null) {
            return d0Var.f7810a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        d0 d0Var = this.f7920c;
        if (d0Var != null) {
            return d0Var.f7811b;
        }
        return null;
    }

    boolean f() {
        return !(this.f7918a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i8) {
        int n8;
        f0 v7 = f0.v(this.f7918a.getContext(), attributeSet, f.j.f35622P, i8, 0);
        ImageView imageView = this.f7918a;
        z0.X.l0(imageView, imageView.getContext(), f.j.f35622P, attributeSet, v7.r(), i8, 0);
        try {
            Drawable drawable = this.f7918a.getDrawable();
            if (drawable == null && (n8 = v7.n(f.j.f35627Q, -1)) != -1 && (drawable = AbstractC5794a.b(this.f7918a.getContext(), n8)) != null) {
                this.f7918a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                O.b(drawable);
            }
            if (v7.s(f.j.f35632R)) {
                androidx.core.widget.e.c(this.f7918a, v7.c(f.j.f35632R));
            }
            if (v7.s(f.j.f35637S)) {
                androidx.core.widget.e.d(this.f7918a, O.e(v7.k(f.j.f35637S, -1), null));
            }
            v7.x();
        } catch (Throwable th) {
            v7.x();
            throw th;
        }
    }

    void h(Drawable drawable) {
        this.f7922e = drawable.getLevel();
    }

    public void i(int i8) {
        if (i8 != 0) {
            Drawable b8 = AbstractC5794a.b(this.f7918a.getContext(), i8);
            if (b8 != null) {
                O.b(b8);
            }
            this.f7918a.setImageDrawable(b8);
        } else {
            this.f7918a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f7920c == null) {
            this.f7920c = new d0();
        }
        d0 d0Var = this.f7920c;
        d0Var.f7810a = colorStateList;
        d0Var.f7813d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f7920c == null) {
            this.f7920c = new d0();
        }
        d0 d0Var = this.f7920c;
        d0Var.f7811b = mode;
        d0Var.f7812c = true;
        c();
    }
}
