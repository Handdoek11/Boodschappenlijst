package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import f.AbstractC5752a;
import g.AbstractC5794a;

/* renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0844d extends AutoCompleteTextView implements androidx.core.widget.k {

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f7806u = {R.attr.popupBackground};

    /* renamed from: o, reason: collision with root package name */
    private final C0845e f7807o;

    /* renamed from: s, reason: collision with root package name */
    private final C f7808s;

    /* renamed from: t, reason: collision with root package name */
    private final C0853m f7809t;

    public C0844d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35386m);
    }

    void a(C0853m c0853m) {
        KeyListener keyListener = getKeyListener();
        if (c0853m.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a8 = c0853m.a(keyListener);
            if (a8 == keyListener) {
                return;
            }
            super.setKeyListener(a8);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7807o;
        if (c0845e != null) {
            c0845e.b();
        }
        C c8 = this.f7808s;
        if (c8 != null) {
            c8.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7807o;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7807o;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7808s.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7808s.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f7809t.d(AbstractC0855o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7807o;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7807o;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7808s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7808s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.s(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i8) {
        setDropDownBackgroundDrawable(AbstractC5794a.b(getContext(), i8));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f7809t.e(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f7809t.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7807o;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7807o;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7808s.w(colorStateList);
        this.f7808s.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7808s.x(mode);
        this.f7808s.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        C c8 = this.f7808s;
        if (c8 != null) {
            c8.q(context, i8);
        }
    }

    public C0844d(Context context, AttributeSet attributeSet, int i8) {
        super(c0.b(context), attributeSet, i8);
        b0.a(this, getContext());
        f0 v7 = f0.v(getContext(), attributeSet, f7806u, i8, 0);
        if (v7.s(0)) {
            setDropDownBackgroundDrawable(v7.g(0));
        }
        v7.x();
        C0845e c0845e = new C0845e(this);
        this.f7807o = c0845e;
        c0845e.e(attributeSet, i8);
        C c8 = new C(this);
        this.f7808s = c8;
        c8.m(attributeSet, i8);
        c8.b();
        C0853m c0853m = new C0853m(this);
        this.f7809t = c0853m;
        c0853m.c(attributeSet, i8);
        a(c0853m);
    }
}
