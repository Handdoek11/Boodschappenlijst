package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import f.AbstractC5752a;
import g.AbstractC5794a;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0848h extends CheckedTextView implements androidx.core.widget.k {

    /* renamed from: o, reason: collision with root package name */
    private final C0849i f7832o;

    /* renamed from: s, reason: collision with root package name */
    private final C0845e f7833s;

    /* renamed from: t, reason: collision with root package name */
    private final C f7834t;

    /* renamed from: u, reason: collision with root package name */
    private C0854n f7835u;

    public C0848h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35389p);
    }

    private C0854n getEmojiTextViewHelper() {
        if (this.f7835u == null) {
            this.f7835u = new C0854n(this);
        }
        return this.f7835u;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C c8 = this.f7834t;
        if (c8 != null) {
            c8.b();
        }
        C0845e c0845e = this.f7833s;
        if (c0845e != null) {
            c0845e.b();
        }
        C0849i c0849i = this.f7832o;
        if (c0849i != null) {
            c0849i.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7833s;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7833s;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0849i c0849i = this.f7832o;
        if (c0849i != null) {
            return c0849i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0849i c0849i = this.f7832o;
        if (c0849i != null) {
            return c0849i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7834t.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7834t.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC0855o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7833s;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7833s;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0849i c0849i = this.f7832o;
        if (c0849i != null) {
            c0849i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7834t;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7834t;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().e(z7);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7833s;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7833s;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0849i c0849i = this.f7832o;
        if (c0849i != null) {
            c0849i.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0849i c0849i = this.f7832o;
        if (c0849i != null) {
            c0849i.g(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7834t.w(colorStateList);
        this.f7834t.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7834t.x(mode);
        this.f7834t.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        C c8 = this.f7834t;
        if (c8 != null) {
            c8.q(context, i8);
        }
    }

    public C0848h(Context context, AttributeSet attributeSet, int i8) {
        super(c0.b(context), attributeSet, i8);
        b0.a(this, getContext());
        C c8 = new C(this);
        this.f7834t = c8;
        c8.m(attributeSet, i8);
        c8.b();
        C0845e c0845e = new C0845e(this);
        this.f7833s = c0845e;
        c0845e.e(attributeSet, i8);
        C0849i c0849i = new C0849i(this);
        this.f7832o = c0849i;
        c0849i.d(attributeSet, i8);
        getEmojiTextViewHelper().c(attributeSet, i8);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i8) {
        setCheckMarkDrawable(AbstractC5794a.b(getContext(), i8));
    }
}
