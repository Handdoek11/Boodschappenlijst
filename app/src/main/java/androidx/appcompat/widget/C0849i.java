package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import g.AbstractC5794a;
import r0.AbstractC6641a;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0849i {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f7837a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f7838b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f7839c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7840d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7841e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7842f;

    C0849i(CheckedTextView checkedTextView) {
        this.f7837a = checkedTextView;
    }

    void a() {
        Drawable a8 = androidx.core.widget.b.a(this.f7837a);
        if (a8 != null) {
            if (this.f7840d || this.f7841e) {
                Drawable mutate = AbstractC6641a.r(a8).mutate();
                if (this.f7840d) {
                    AbstractC6641a.o(mutate, this.f7838b);
                }
                if (this.f7841e) {
                    AbstractC6641a.p(mutate, this.f7839c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f7837a.getDrawableState());
                }
                this.f7837a.setCheckMarkDrawable(mutate);
            }
        }
    }

    ColorStateList b() {
        return this.f7838b;
    }

    PorterDuff.Mode c() {
        return this.f7839c;
    }

    void d(AttributeSet attributeSet, int i8) {
        int n8;
        int n9;
        f0 v7 = f0.v(this.f7837a.getContext(), attributeSet, f.j.f35623P0, i8, 0);
        CheckedTextView checkedTextView = this.f7837a;
        z0.X.l0(checkedTextView, checkedTextView.getContext(), f.j.f35623P0, attributeSet, v7.r(), i8, 0);
        try {
            if (v7.s(f.j.f35633R0) && (n9 = v7.n(f.j.f35633R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f7837a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC5794a.b(checkedTextView2.getContext(), n9));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (v7.s(f.j.f35628Q0) && (n8 = v7.n(f.j.f35628Q0, 0)) != 0) {
                CheckedTextView checkedTextView3 = this.f7837a;
                checkedTextView3.setCheckMarkDrawable(AbstractC5794a.b(checkedTextView3.getContext(), n8));
            }
            if (v7.s(f.j.f35638S0)) {
                androidx.core.widget.b.b(this.f7837a, v7.c(f.j.f35638S0));
            }
            if (v7.s(f.j.f35642T0)) {
                androidx.core.widget.b.c(this.f7837a, O.e(v7.k(f.j.f35642T0, -1), null));
            }
        } finally {
            v7.x();
        }
    }

    void e() {
        if (this.f7842f) {
            this.f7842f = false;
        } else {
            this.f7842f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f7838b = colorStateList;
        this.f7840d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f7839c = mode;
        this.f7841e = true;
        a();
    }
}
