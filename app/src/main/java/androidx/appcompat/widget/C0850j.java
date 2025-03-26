package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import g.AbstractC5794a;
import r0.AbstractC6641a;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0850j {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f7844a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f7845b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f7846c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7847d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7848e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7849f;

    C0850j(CompoundButton compoundButton) {
        this.f7844a = compoundButton;
    }

    void a() {
        Drawable a8 = androidx.core.widget.c.a(this.f7844a);
        if (a8 != null) {
            if (this.f7847d || this.f7848e) {
                Drawable mutate = AbstractC6641a.r(a8).mutate();
                if (this.f7847d) {
                    AbstractC6641a.o(mutate, this.f7845b);
                }
                if (this.f7848e) {
                    AbstractC6641a.p(mutate, this.f7846c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f7844a.getDrawableState());
                }
                this.f7844a.setButtonDrawable(mutate);
            }
        }
    }

    ColorStateList b() {
        return this.f7845b;
    }

    PorterDuff.Mode c() {
        return this.f7846c;
    }

    void d(AttributeSet attributeSet, int i8) {
        int n8;
        int n9;
        f0 v7 = f0.v(this.f7844a.getContext(), attributeSet, f.j.f35646U0, i8, 0);
        CompoundButton compoundButton = this.f7844a;
        z0.X.l0(compoundButton, compoundButton.getContext(), f.j.f35646U0, attributeSet, v7.r(), i8, 0);
        try {
            if (v7.s(f.j.f35654W0) && (n9 = v7.n(f.j.f35654W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f7844a;
                    compoundButton2.setButtonDrawable(AbstractC5794a.b(compoundButton2.getContext(), n9));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (v7.s(f.j.f35650V0) && (n8 = v7.n(f.j.f35650V0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f7844a;
                compoundButton3.setButtonDrawable(AbstractC5794a.b(compoundButton3.getContext(), n8));
            }
            if (v7.s(f.j.f35658X0)) {
                androidx.core.widget.c.d(this.f7844a, v7.c(f.j.f35658X0));
            }
            if (v7.s(f.j.f35662Y0)) {
                androidx.core.widget.c.e(this.f7844a, O.e(v7.k(f.j.f35662Y0, -1), null));
            }
        } finally {
            v7.x();
        }
    }

    void e() {
        if (this.f7849f) {
            this.f7849f = false;
        } else {
            this.f7849f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f7845b = colorStateList;
        this.f7847d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f7846c = mode;
        this.f7848e = true;
        a();
    }
}
