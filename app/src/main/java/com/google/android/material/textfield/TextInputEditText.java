package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C0852l;

/* loaded from: classes2.dex */
public class TextInputEditText extends C0852l {

    /* renamed from: x, reason: collision with root package name */
    private final Rect f32384x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f32385y;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1414m);
    }

    private boolean e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f32385y;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f32384x);
        rect.bottom = this.f32384x.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.R()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.R() && super.getHint() == null && com.google.android.material.internal.e.b()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.C0852l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f32384x.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f32384x);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z7) {
        this.f32385y = z7;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i8) {
        super(Z3.a.c(context, attributeSet, i8, 0), attributeSet, i8);
        this.f32384x = new Rect();
        TypedArray i9 = com.google.android.material.internal.l.i(context, attributeSet, D3.l.f1656C6, i8, D3.k.f1619i, new int[0]);
        setTextInputLayoutFocusedRectEnabled(i9.getBoolean(D3.l.f1664D6, false));
        i9.recycle();
    }
}
