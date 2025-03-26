package com.google.android.material.textfield;

import A0.AbstractC0366c;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
abstract class t {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f32544a;

    /* renamed from: b, reason: collision with root package name */
    final s f32545b;

    /* renamed from: c, reason: collision with root package name */
    final Context f32546c;

    /* renamed from: d, reason: collision with root package name */
    final CheckableImageButton f32547d;

    t(s sVar) {
        this.f32544a = sVar.f32528o;
        this.f32545b = sVar;
        this.f32546c = sVar.getContext();
        this.f32547d = sVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i8, int i9, int i10) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    AbstractC0366c.a h() {
        return null;
    }

    boolean i(int i8) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z7) {
    }

    final void r() {
        this.f32545b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }

    void o(View view, A0.z zVar) {
    }
}
