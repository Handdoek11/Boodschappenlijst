package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0853m {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f7889a;

    /* renamed from: b, reason: collision with root package name */
    private final N0.a f7890b;

    C0853m(EditText editText) {
        this.f7889a = editText;
        this.f7890b = new N0.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f7890b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i8) {
        TypedArray obtainStyledAttributes = this.f7889a.getContext().obtainStyledAttributes(attributeSet, f.j.f35700g0, i8, 0);
        try {
            boolean z7 = obtainStyledAttributes.hasValue(f.j.f35770u0) ? obtainStyledAttributes.getBoolean(f.j.f35770u0, true) : true;
            obtainStyledAttributes.recycle();
            e(z7);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f7890b.b(inputConnection, editorInfo);
    }

    void e(boolean z7) {
        this.f7890b.c(z7);
    }
}
