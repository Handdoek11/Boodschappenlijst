package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import f.AbstractC5752a;
import z0.C7019d;
import z0.InterfaceC7006J;

/* renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0852l extends EditText implements InterfaceC7006J, androidx.core.widget.k {

    /* renamed from: o, reason: collision with root package name */
    private final C0845e f7881o;

    /* renamed from: s, reason: collision with root package name */
    private final C f7882s;

    /* renamed from: t, reason: collision with root package name */
    private final B f7883t;

    /* renamed from: u, reason: collision with root package name */
    private final androidx.core.widget.i f7884u;

    /* renamed from: v, reason: collision with root package name */
    private final C0853m f7885v;

    /* renamed from: w, reason: collision with root package name */
    private a f7886w;

    /* renamed from: androidx.appcompat.widget.l$a */
    class a {
        a() {
        }

        public TextClassifier a() {
            return C0852l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C0852l.super.setTextClassifier(textClassifier);
        }
    }

    public C0852l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35398y);
    }

    private a getSuperCaller() {
        if (this.f7886w == null) {
            this.f7886w = new a();
        }
        return this.f7886w;
    }

    @Override // z0.InterfaceC7006J
    public C7019d a(C7019d c7019d) {
        return this.f7884u.a(this, c7019d);
    }

    void d(C0853m c0853m) {
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
        C0845e c0845e = this.f7881o;
        if (c0845e != null) {
            c0845e.b();
        }
        C c8 = this.f7882s;
        if (c8 != null) {
            c8.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7881o;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7881o;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7882s.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7882s.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B b8;
        return (Build.VERSION.SDK_INT >= 28 || (b8 = this.f7883t) == null) ? getSuperCaller().a() : b8.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] C7;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f7882s.r(this, onCreateInputConnection, editorInfo);
        InputConnection a8 = AbstractC0855o.a(onCreateInputConnection, editorInfo, this);
        if (a8 != null && Build.VERSION.SDK_INT <= 30 && (C7 = z0.X.C(this)) != null) {
            C0.c.d(editorInfo, C7);
            a8 = C0.e.c(this, a8, editorInfo);
        }
        return this.f7885v.d(a8, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30 || i8 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC0863x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i8) {
        if (AbstractC0863x.b(this, i8)) {
            return true;
        }
        return super.onTextContextMenuItem(i8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7881o;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7881o;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7882s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7882s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f7885v.e(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f7885v.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7881o;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7881o;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7882s.w(colorStateList);
        this.f7882s.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7882s.x(mode);
        this.f7882s.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        C c8 = this.f7882s;
        if (c8 != null) {
            c8.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b8;
        if (Build.VERSION.SDK_INT >= 28 || (b8 = this.f7883t) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b8.b(textClassifier);
        }
    }

    public C0852l(Context context, AttributeSet attributeSet, int i8) {
        super(c0.b(context), attributeSet, i8);
        b0.a(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f7881o = c0845e;
        c0845e.e(attributeSet, i8);
        C c8 = new C(this);
        this.f7882s = c8;
        c8.m(attributeSet, i8);
        c8.b();
        this.f7883t = new B(this);
        this.f7884u = new androidx.core.widget.i();
        C0853m c0853m = new C0853m(this);
        this.f7885v = c0853m;
        c0853m.c(attributeSet, i8);
        d(c0853m);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
