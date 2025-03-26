package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import r0.AbstractC6641a;

/* renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0865z extends C0860u {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f7944d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f7945e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f7946f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f7947g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7948h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7949i;

    C0865z(SeekBar seekBar) {
        super(seekBar);
        this.f7946f = null;
        this.f7947g = null;
        this.f7948h = false;
        this.f7949i = false;
        this.f7944d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f7945e;
        if (drawable != null) {
            if (this.f7948h || this.f7949i) {
                Drawable r8 = AbstractC6641a.r(drawable.mutate());
                this.f7945e = r8;
                if (this.f7948h) {
                    AbstractC6641a.o(r8, this.f7946f);
                }
                if (this.f7949i) {
                    AbstractC6641a.p(this.f7945e, this.f7947g);
                }
                if (this.f7945e.isStateful()) {
                    this.f7945e.setState(this.f7944d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C0860u
    void c(AttributeSet attributeSet, int i8) {
        super.c(attributeSet, i8);
        f0 v7 = f0.v(this.f7944d.getContext(), attributeSet, f.j.f35641T, i8, 0);
        SeekBar seekBar = this.f7944d;
        z0.X.l0(seekBar, seekBar.getContext(), f.j.f35641T, attributeSet, v7.r(), i8, 0);
        Drawable h8 = v7.h(f.j.f35645U);
        if (h8 != null) {
            this.f7944d.setThumb(h8);
        }
        j(v7.g(f.j.f35649V));
        if (v7.s(f.j.f35657X)) {
            this.f7947g = O.e(v7.k(f.j.f35657X, -1), this.f7947g);
            this.f7949i = true;
        }
        if (v7.s(f.j.f35653W)) {
            this.f7946f = v7.c(f.j.f35653W);
            this.f7948h = true;
        }
        v7.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f7945e != null) {
            int max = this.f7944d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f7945e.getIntrinsicWidth();
                int intrinsicHeight = this.f7945e.getIntrinsicHeight();
                int i8 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i9 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f7945e.setBounds(-i8, -i9, i8, i9);
                float width = ((this.f7944d.getWidth() - this.f7944d.getPaddingLeft()) - this.f7944d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f7944d.getPaddingLeft(), this.f7944d.getHeight() / 2);
                for (int i10 = 0; i10 <= max; i10++) {
                    this.f7945e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.f7945e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f7944d.getDrawableState())) {
            this.f7944d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f7945e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f7945e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7945e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f7944d);
            AbstractC6641a.m(drawable, this.f7944d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f7944d.getDrawableState());
            }
            f();
        }
        this.f7944d.invalidate();
    }
}
