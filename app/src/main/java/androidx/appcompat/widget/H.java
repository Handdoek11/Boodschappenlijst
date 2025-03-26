package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class H extends ToggleButton implements androidx.core.widget.k {

    /* renamed from: o, reason: collision with root package name */
    private final C0845e f7426o;

    /* renamed from: s, reason: collision with root package name */
    private final C f7427s;

    /* renamed from: t, reason: collision with root package name */
    private C0854n f7428t;

    public H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private C0854n getEmojiTextViewHelper() {
        if (this.f7428t == null) {
            this.f7428t = new C0854n(this);
        }
        return this.f7428t;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7426o;
        if (c0845e != null) {
            c0845e.b();
        }
        C c8 = this.f7427s;
        if (c8 != null) {
            c8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7426o;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7426o;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7427s.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7427s.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7426o;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7426o;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7427s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7427s;
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
        C0845e c0845e = this.f7426o;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7426o;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7427s.w(colorStateList);
        this.f7427s.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7427s.x(mode);
        this.f7427s.b();
    }

    public H(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        b0.a(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f7426o = c0845e;
        c0845e.e(attributeSet, i8);
        C c8 = new C(this);
        this.f7427s = c8;
        c8.m(attributeSet, i8);
        getEmojiTextViewHelper().c(attributeSet, i8);
    }
}
