package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import f.AbstractC5752a;
import g.AbstractC5794a;

/* renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0861v extends RadioButton implements androidx.core.widget.j, androidx.core.widget.k {

    /* renamed from: o, reason: collision with root package name */
    private final C0850j f7938o;

    /* renamed from: s, reason: collision with root package name */
    private final C0845e f7939s;

    /* renamed from: t, reason: collision with root package name */
    private final C f7940t;

    /* renamed from: u, reason: collision with root package name */
    private C0854n f7941u;

    public C0861v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35365D);
    }

    private C0854n getEmojiTextViewHelper() {
        if (this.f7941u == null) {
            this.f7941u = new C0854n(this);
        }
        return this.f7941u;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7939s;
        if (c0845e != null) {
            c0845e.b();
        }
        C c8 = this.f7940t;
        if (c8 != null) {
            c8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7939s;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7939s;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportButtonTintList() {
        C0850j c0850j = this.f7938o;
        if (c0850j != null) {
            return c0850j.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0850j c0850j = this.f7938o;
        if (c0850j != null) {
            return c0850j.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7940t.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7940t.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7939s;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7939s;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0850j c0850j = this.f7938o;
        if (c0850j != null) {
            c0850j.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7940t;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7940t;
        if (c8 != null) {
            c8.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().e(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7939s;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7939s;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0850j c0850j = this.f7938o;
        if (c0850j != null) {
            c0850j.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0850j c0850j = this.f7938o;
        if (c0850j != null) {
            c0850j.g(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7940t.w(colorStateList);
        this.f7940t.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7940t.x(mode);
        this.f7940t.b();
    }

    public C0861v(Context context, AttributeSet attributeSet, int i8) {
        super(c0.b(context), attributeSet, i8);
        b0.a(this, getContext());
        C0850j c0850j = new C0850j(this);
        this.f7938o = c0850j;
        c0850j.d(attributeSet, i8);
        C0845e c0845e = new C0845e(this);
        this.f7939s = c0845e;
        c0845e.e(attributeSet, i8);
        C c8 = new C(this);
        this.f7940t = c8;
        c8.m(attributeSet, i8);
        getEmojiTextViewHelper().c(attributeSet, i8);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i8) {
        setButtonDrawable(AbstractC5794a.b(getContext(), i8));
    }
}
