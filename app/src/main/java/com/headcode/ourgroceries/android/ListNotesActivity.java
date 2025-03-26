package com.headcode.ourgroceries.android;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import n5.C6260j;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class ListNotesActivity extends AbstractActivityC5575j2 {

    /* renamed from: O, reason: collision with root package name */
    private String f33783O;

    /* renamed from: P, reason: collision with root package name */
    private C5688z0 f33784P;

    /* renamed from: Q, reason: collision with root package name */
    private String f33785Q;

    /* renamed from: R, reason: collision with root package name */
    private TextView f33786R;

    /* renamed from: S, reason: collision with root package name */
    private EditText f33787S;

    /* renamed from: T, reason: collision with root package name */
    private C6260j f33788T;

    /* renamed from: U, reason: collision with root package name */
    private MenuItem f33789U;

    private void A1() {
        String charSequence = this.f33786R.getText().toString();
        this.f33785Q = charSequence;
        this.f33787S.setText(charSequence);
        EditText editText = this.f33787S;
        editText.setSelection(editText.length());
        this.f33788T.f39674c.setVisibility(8);
        this.f33788T.f39675d.setVisibility(0);
        this.f33786R.setVisibility(8);
        this.f33787S.setVisibility(0);
        s1(this.f33787S);
        MenuItem menuItem = this.f33789U;
        if (menuItem != null) {
            menuItem.setTitle(M2.f33922M1);
        }
    }

    private void B1() {
        H1();
        a1(this.f33787S);
        String obj = this.f33787S.getText().toString();
        this.f33786R.setVisibility(0);
        this.f33787S.setVisibility(8);
        this.f33786R.setText(obj);
        I1();
        MenuItem menuItem = this.f33789U;
        if (menuItem != null) {
            menuItem.setTitle(M2.f33930N1);
        }
    }

    private int C1() {
        if (E1()) {
            return this.f33787S.getSelectionEnd();
        }
        return -1;
    }

    private int D1() {
        if (E1()) {
            return this.f33787S.getSelectionStart();
        }
        return -1;
    }

    private boolean E1() {
        EditText editText = this.f33787S;
        return editText != null && editText.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean F1(MenuItem menuItem) {
        if (E1()) {
            B1();
            return true;
        }
        A1();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G1() {
        this.f33788T.f39674c.setVisibility(0);
    }

    private void H1() {
        String obj = this.f33787S.getText().toString();
        if (obj.equals(this.f33785Q)) {
            return;
        }
        V0().M0(this.f33784P, obj);
    }

    private void I1() {
        if (E1()) {
            return;
        }
        if (this.f33786R.getText().toString().trim().isEmpty()) {
            new Handler().post(new Runnable() { // from class: com.headcode.ourgroceries.android.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34835o.G1();
                }
            });
            this.f33788T.f39675d.setVisibility(8);
        } else {
            this.f33788T.f39674c.setVisibility(8);
            this.f33788T.f39675d.setVisibility(0);
        }
    }

    private boolean J1() {
        C5688z0 x7 = V0().x(this.f33783O);
        this.f33784P = x7;
        if (x7 == null) {
            return false;
        }
        if (E1()) {
            return true;
        }
        this.f33786R.setText(AbstractC6803e.w(this.f33784P.X()));
        this.f33788T.f39674c.setText(P1.u(this, this.f33784P.U() == s5.Q.RECIPE ? M2.f33875G2 : M2.f33883H2, P1.K(getText(M2.f33930N1))));
        I1();
        return true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, com.headcode.ourgroceries.android.C5574j1.d
    public void P(C5688z0 c5688z0) {
        if ((c5688z0 == null || c5688z0.T().equals(this.f33783O)) && !J1()) {
            finish();
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33783O = getIntent().getStringExtra("com.headcode.ourgroceries.ListID");
        boolean booleanExtra = getIntent().getBooleanExtra("com.headcode.ourgroceries.EditMode", false);
        C6260j c8 = C6260j.c(getLayoutInflater());
        this.f33788T = c8;
        setContentView(c8.b());
        L0();
        C6260j c6260j = this.f33788T;
        this.f33786R = c6260j.f39676e;
        this.f33787S = c6260j.f39673b;
        if (!J1()) {
            finish();
        } else if (bundle == null && booleanExtra) {
            A1();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, 0, 0, E1() ? M2.f33922M1 : M2.f33930N1);
        this.f33789U = add;
        add.setShowAsAction(2);
        this.f33789U.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.headcode.ourgroceries.android.l1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f34880o.F1(menuItem);
            }
        });
        return true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        if (E1()) {
            H1();
        }
        super.onDestroy();
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (!bundle.getBoolean("com.headcode.ourgroceries.android.ListNotesActivity.Editing")) {
            this.f33786R.setVisibility(0);
            this.f33787S.setVisibility(8);
            I1();
            return;
        }
        A1();
        int i8 = bundle.getInt("com.headcode.ourgroceries.android.ListNotesActivity.SelectionStart", -1);
        int i9 = bundle.getInt("com.headcode.ourgroceries.android.ListNotesActivity.SelectionEnd", -1);
        int length = this.f33787S.length();
        if (i8 == -1) {
            this.f33787S.setSelection(length);
            return;
        }
        int min = Math.min(i8, length);
        if (i9 == -1) {
            this.f33787S.setSelection(min);
        } else {
            this.f33787S.setSelection(min, Math.min(i9, length));
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        boolean E12 = E1();
        bundle.putBoolean("com.headcode.ourgroceries.android.ListNotesActivity.Editing", E12);
        if (E12) {
            bundle.putInt("com.headcode.ourgroceries.android.ListNotesActivity.SelectionStart", D1());
            bundle.putInt("com.headcode.ourgroceries.android.ListNotesActivity.SelectionEnd", C1());
        }
    }
}
