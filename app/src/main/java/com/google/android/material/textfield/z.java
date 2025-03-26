package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes2.dex */
class z extends t {

    /* renamed from: e, reason: collision with root package name */
    private int f32595e;

    /* renamed from: f, reason: collision with root package name */
    private EditText f32596f;

    /* renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f32597g;

    z(s sVar, int i8) {
        super(sVar);
        this.f32595e = D3.e.f1501a;
        this.f32597g = new View.OnClickListener() { // from class: com.google.android.material.textfield.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32594o.y(view);
            }
        };
        if (i8 != 0) {
            this.f32595e = i8;
        }
    }

    private boolean w() {
        EditText editText = this.f32596f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText = this.f32596f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (w()) {
            this.f32596f.setTransformationMethod(null);
        } else {
            this.f32596f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f32596f.setSelection(selectionEnd);
        }
        r();
    }

    @Override // com.google.android.material.textfield.t
    void b(CharSequence charSequence, int i8, int i9, int i10) {
        r();
    }

    @Override // com.google.android.material.textfield.t
    int c() {
        return D3.j.f1583A;
    }

    @Override // com.google.android.material.textfield.t
    int d() {
        return this.f32595e;
    }

    @Override // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.f32597g;
    }

    @Override // com.google.android.material.textfield.t
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.t
    void n(EditText editText) {
        this.f32596f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.t
    void s() {
        if (x(this.f32596f)) {
            this.f32596f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.t
    void u() {
        EditText editText = this.f32596f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
