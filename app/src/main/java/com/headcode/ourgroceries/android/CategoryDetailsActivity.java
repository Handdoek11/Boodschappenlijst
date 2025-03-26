package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import n5.C6255e;
import o5.C6313w;
import q5.AbstractC6635a;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public final class CategoryDetailsActivity extends AbstractActivityC5575j2 implements TextView.OnEditorActionListener, View.OnClickListener {

    /* renamed from: O, reason: collision with root package name */
    private EditText f33341O;

    /* renamed from: P, reason: collision with root package name */
    private ImageButton f33342P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f33343Q;

    /* renamed from: R, reason: collision with root package name */
    private String f33344R;

    /* renamed from: S, reason: collision with root package name */
    private Z0 f33345S;

    /* renamed from: T, reason: collision with root package name */
    private C6255e f33346T;

    private void A1() {
        if (this.f33345S == null) {
            return;
        }
        String y12 = y1();
        if (y12.length() <= 0 || z1(y12)) {
            return;
        }
        this.f33345S = V0().y0(this.f33345S, y12);
    }

    private void B1(String str) {
        if (str == null) {
            str = "";
        }
        this.f33341O.setText(str);
        this.f33341O.requestFocus();
        this.f33341O.setSelection(str.length());
    }

    private void C1(String str) {
        V1.e(this.f33341O, getString(M2.f34090h1, str), true);
    }

    private String y1() {
        return this.f33341O.getText().toString().trim();
    }

    private boolean z1(String str) {
        C5688z0 D7 = V0().D();
        Z0 I7 = D7 == null ? null : D7.I(str);
        return (I7 == null || I7 == this.f33345S) ? false : true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, com.headcode.ourgroceries.android.C5574j1.d
    public void P(C5688z0 c5688z0) {
        Z0 J7 = V0().D().J(this.f33344R);
        this.f33345S = J7;
        if (J7 == null) {
            finish();
        } else if (this.f33343Q) {
            B1(J7.E());
            this.f33343Q = false;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f33345S != null) {
            Intent intent = new Intent();
            intent.putExtra("com.headcode.ourgroceries.CategoryID", this.f33345S.w());
            setResult(-1, intent);
        }
        a1(this.f33341O);
        super.finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Z0 z02;
        if (view != this.f33342P || (z02 = this.f33345S) == null) {
            return;
        }
        C6313w.u2(z02.w()).r2(getSupportFragmentManager(), "unused");
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6255e c8 = C6255e.c(getLayoutInflater());
        this.f33346T = c8;
        setContentView(c8.b());
        L0();
        this.f33343Q = bundle == null;
        String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.CategoryID");
        this.f33344R = stringExtra;
        if (AbstractC6803e.o(stringExtra)) {
            AbstractC6635a.b("OG-CategoryDtlsAct", "Received request for category details without any category ID");
            finish();
            return;
        }
        EditText editText = this.f33346T.f39628b;
        this.f33341O = editText;
        editText.setOnEditorActionListener(this);
        ImageButton imageButton = this.f33346T.f39629c;
        this.f33342P = imageButton;
        imageButton.setOnClickListener(this);
        P(null);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        if (isFinishing()) {
            A1();
        }
        super.onDestroy();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
        String y12 = y1();
        if (y12.length() <= 0) {
            return false;
        }
        if (z1(y12)) {
            C1(y12);
            return true;
        }
        finish();
        return false;
    }

    @Override // androidx.appcompat.app.AbstractActivityC0835d, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            s1(this.f33341O);
        }
    }
}
