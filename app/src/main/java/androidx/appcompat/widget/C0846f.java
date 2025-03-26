package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import f.AbstractC5752a;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0846f extends Button implements androidx.core.widget.k {

    /* renamed from: o, reason: collision with root package name */
    private final C0845e f7821o;

    /* renamed from: s, reason: collision with root package name */
    private final C f7822s;

    /* renamed from: t, reason: collision with root package name */
    private C0854n f7823t;

    public C0846f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35387n);
    }

    private C0854n getEmojiTextViewHelper() {
        if (this.f7823t == null) {
            this.f7823t = new C0854n(this);
        }
        return this.f7823t;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7821o;
        if (c0845e != null) {
            c0845e.b();
        }
        C c8 = this.f7822s;
        if (c8 != null) {
            c8.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q0.f7925c) {
            return super.getAutoSizeMaxTextSize();
        }
        C c8 = this.f7822s;
        if (c8 != null) {
            return c8.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q0.f7925c) {
            return super.getAutoSizeMinTextSize();
        }
        C c8 = this.f7822s;
        if (c8 != null) {
            return c8.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q0.f7925c) {
            return super.getAutoSizeStepGranularity();
        }
        C c8 = this.f7822s;
        if (c8 != null) {
            return c8.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q0.f7925c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C c8 = this.f7822s;
        return c8 != null ? c8.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (q0.f7925c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C c8 = this.f7822s;
        if (c8 != null) {
            return c8.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7821o;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7821o;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7822s.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7822s.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        C c8 = this.f7822s;
        if (c8 != null) {
            c8.o(z7, i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        C c8 = this.f7822s;
        if (c8 == null || q0.f7925c || !c8.l()) {
            return;
        }
        this.f7822s.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        if (q0.f7925c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
            return;
        }
        C c8 = this.f7822s;
        if (c8 != null) {
            c8.t(i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8) {
        if (q0.f7925c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
            return;
        }
        C c8 = this.f7822s;
        if (c8 != null) {
            c8.u(iArr, i8);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i8) {
        if (q0.f7925c) {
            super.setAutoSizeTextTypeWithDefaults(i8);
            return;
        }
        C c8 = this.f7822s;
        if (c8 != null) {
            c8.v(i8);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7821o;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7821o;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().e(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z7) {
        C c8 = this.f7822s;
        if (c8 != null) {
            c8.s(z7);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7821o;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7821o;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7822s.w(colorStateList);
        this.f7822s.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7822s.x(mode);
        this.f7822s.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        C c8 = this.f7822s;
        if (c8 != null) {
            c8.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i8, float f8) {
        if (q0.f7925c) {
            super.setTextSize(i8, f8);
            return;
        }
        C c8 = this.f7822s;
        if (c8 != null) {
            c8.A(i8, f8);
        }
    }

    public C0846f(Context context, AttributeSet attributeSet, int i8) {
        super(c0.b(context), attributeSet, i8);
        b0.a(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f7821o = c0845e;
        c0845e.e(attributeSet, i8);
        C c8 = new C(this);
        this.f7822s = c8;
        c8.m(attributeSet, i8);
        c8.b();
        getEmojiTextViewHelper().c(attributeSet, i8);
    }
}
