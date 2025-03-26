package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.headcode.ourgroceries.android.AbstractC5604n;
import d6.InterfaceC5732b;
import n5.C6252b;
import n5.C6256f;
import n5.C6265o;
import n5.C6266p;
import n5.C6267q;
import n5.C6268r;
import n5.C6269s;
import q5.AbstractC6635a;
import s5.g0;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public abstract class SignInActivity extends AbstractActivityC5575j2 {

    /* renamed from: O, reason: collision with root package name */
    protected b f34444O;

    /* renamed from: P, reason: collision with root package name */
    protected int f34445P;

    public static class AccountDeletedNoticeActivity extends SignInActivity {

        /* renamed from: Q, reason: collision with root package name */
        C6252b f34446Q;

        /* renamed from: R, reason: collision with root package name */
        InterfaceC5732b f34447R;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void H1(C5587k6 c5587k6, String str, View view) {
            C5587k6.v0(this, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void I1(View view) {
            setResult(-1);
            finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void J1(Z1 z12) {
            K1();
        }

        private void K1() {
            if (Z0().T() == null) {
                this.f34446Q.f39611f.setVisibility(8);
            }
        }

        @Override // com.headcode.ourgroceries.android.SignInActivity, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            C6252b c8 = C6252b.c(getLayoutInflater());
            this.f34446Q = c8;
            setContentView(c8.b());
            L0();
            final C5587k6 Z02 = Z0();
            final String T7 = Z02.T();
            if (T7 == null) {
                this.f34446Q.f39611f.setVisibility(8);
            } else {
                this.f34446Q.f39611f.setVisibility(0);
                if (T7.equals("personal_monthly")) {
                    this.f34446Q.f39612g.setText(M2.f34128m);
                } else if (T7.equals("personal_yearly")) {
                    this.f34446Q.f39612g.setText(M2.f34120l);
                }
                this.f34446Q.f39607b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.T3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f34486o.H1(Z02, T7, view);
                    }
                });
            }
            this.f34446Q.f39608c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.U3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34544o.I1(view);
                }
            });
            this.f34447R = Z02.O().E(new f6.d() { // from class: com.headcode.ourgroceries.android.V3
                @Override // f6.d
                public final void accept(Object obj) {
                    this.f34575o.J1((Z1) obj);
                }
            });
        }
    }

    public static class CopyListsActivity extends SignInActivity {

        /* renamed from: Q, reason: collision with root package name */
        C6265o f34448Q;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void H1(String str, String str2, String str3, View view) {
            K1(str, str2, str3, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void I1(String str, String str2, String str3, View view) {
            K1(str, str2, str3, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void J1(boolean z7, String str, String str2, AbstractC5604n.k kVar) {
            s5.I b8 = kVar.b();
            B b9 = B.NO_CHANGE;
            if (b8 != null) {
                b9 = C1(b8);
            }
            c b10 = B1(z7 ? b.NOTICE_COPIED_FROM_ACCOUNT : b.NOTICE_NOT_COPIED_FROM_ACCOUNT).c(str).e(str2).b(b9);
            if (kVar.c() == null) {
                return;
            }
            int i8 = a.f34461a[kVar.c().ordinal()];
            if (i8 == 1) {
                AbstractC5673x.a("signInCopySubmitError1");
                AbstractC6635a.b("OG-SignInActivity", "Shouldn't have gotten email sent");
            } else {
                if (i8 == 2) {
                    b10.a();
                    return;
                }
                if (i8 == 3) {
                    b10.a();
                } else {
                    if (i8 != 4) {
                        return;
                    }
                    AbstractC5673x.a("signInCopySubmitError2");
                    D1();
                }
            }
        }

        public void K1(final String str, final String str2, String str3, final boolean z7) {
            StringBuilder sb = new StringBuilder();
            sb.append("signInCopySubmit");
            sb.append(z7 ? "" : "No");
            sb.append("Copy");
            AbstractC5673x.a(sb.toString());
            b bVar = this.f34444O;
            if (bVar != b.COPY_LISTS_EMAIL) {
                AbstractC5604n.j(str, str3, z7, new C5676x2(this, bVar == b.COPY_LISTS_PASSWORD_CREATE_ACCOUNT ? getString(M2.f34013X4) : getString(M2.f34021Y4)), new AbstractC5604n.h() { // from class: com.headcode.ourgroceries.android.Y3
                    @Override // com.headcode.ourgroceries.android.AbstractC5604n.h
                    public final void onResult(Object obj) {
                        this.f34609a.J1(z7, str, str2, (AbstractC5604n.k) obj);
                    }
                });
            } else {
                Y0().L0(str, SignInActivity.A1(), z7);
                B1(b.NOTICE_EMAIL_SENT).c(str).e(str2).a();
            }
        }

        @Override // com.headcode.ourgroceries.android.SignInActivity, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            if (this.f34444O == null) {
                AbstractC5673x.a("signInCopyNoScreen");
                finish();
                return;
            }
            final String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.EMAIL_ADDRESS");
            final String stringExtra2 = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.OLD_EMAIL_ADDRESS");
            final String stringExtra3 = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.PASSWORD");
            C6265o c8 = C6265o.c(getLayoutInflater());
            this.f34448Q = c8;
            setContentView(c8.b());
            L0();
            this.f34448Q.f39710e.setText(P1.u(this, M2.f33829A4, P1.K(stringExtra2), P1.K(stringExtra)));
            this.f34448Q.f39707b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.W3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34580o.H1(stringExtra, stringExtra2, stringExtra3, view);
                }
            });
            this.f34448Q.f39708c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.X3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34595o.I1(stringExtra, stringExtra2, stringExtra3, view);
                }
            });
        }
    }

    public static class DeleteAccountConfirmationActivity extends SignInActivity {

        /* renamed from: Q, reason: collision with root package name */
        C6256f f34449Q;

        /* renamed from: R, reason: collision with root package name */
        private EditText f34450R;

        /* renamed from: S, reason: collision with root package name */
        private boolean f34451S = false;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean J1(TextView textView, int i8, KeyEvent keyEvent) {
            if (i8 != 4 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                return false;
            }
            b1(this.f34450R);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void K1(String str, View view) {
            O1(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void L1(View view) {
            setResult(-1);
            finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void M1(String str, View view) {
            Y0().E0(str);
            B1(b.NOTICE_RESET_PASSWORD).c(str).d(b.FINISH).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void N1(AbstractC5604n.e eVar) {
            if (eVar.b()) {
                AbstractC5673x.a("DeleteAccountAPIFailure");
                return;
            }
            if (!eVar.a()) {
                AbstractC5673x.a("DeleteAccountNoAccount");
                AbstractC6635a.b("OG-SignInActivity", "Account didn't exist");
                o5.T.t2().f(M2.f34152p).d(M2.f34144o).g(this);
            } else {
                if (!eVar.c()) {
                    AbstractC5673x.a("DeleteAccountSubmitWrongPw");
                    D1();
                    return;
                }
                AbstractC5673x.a("DeleteAccountDeletionSuccess");
                AbstractC6635a.b("OG-SignInActivity", "Account was successfully deleted");
                Y0().a0();
                setResult(-1);
                finish();
                B1(b.ACCOUNT_DELETED_NOTICE).a();
            }
        }

        private void O1(String str) {
            if (this.f34451S) {
                return;
            }
            this.f34451S = true;
            String trim = this.f34450R.getText().toString().trim();
            if (trim.isEmpty()) {
                AbstractC5673x.a("DeleteAccountPwSubmitEmpty");
            } else {
                AbstractC5604n.d(str, trim, new C5676x2(this, getString(M2.f34160q)), new AbstractC5604n.h() { // from class: com.headcode.ourgroceries.android.d4
                    @Override // com.headcode.ourgroceries.android.AbstractC5604n.h
                    public final void onResult(Object obj) {
                        this.f34680a.N1((AbstractC5604n.e) obj);
                    }
                });
            }
        }

        @Override // android.app.Activity
        public void finish() {
            a1(this.f34450R);
            super.finish();
        }

        @Override // com.headcode.ourgroceries.android.SignInActivity, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            final String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.EMAIL_ADDRESS");
            if (AbstractC6803e.o(stringExtra)) {
                AbstractC5673x.a("DeleteAccountNoEmail");
                finish();
                return;
            }
            C6256f c8 = C6256f.c(getLayoutInflater());
            this.f34449Q = c8;
            setContentView(c8.b());
            L0();
            this.f34449Q.f39635d.setText(P1.u(this, M2.f34136n, P1.K(stringExtra)));
            TextInputEditText textInputEditText = this.f34449Q.f39637f;
            this.f34450R = textInputEditText;
            textInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.headcode.ourgroceries.android.Z3
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                    return this.f34635o.J1(textView, i8, keyEvent);
                }
            });
            this.f34449Q.f39634c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.a4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34650o.K1(stringExtra, view);
                }
            });
            this.f34449Q.f39633b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.b4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34659o.L1(view);
                }
            });
            this.f34449Q.f39638g.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.c4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34671o.M1(stringExtra, view);
                }
            });
        }
    }

    public static class EmailAddressActivity extends SignInActivity {

        /* renamed from: Q, reason: collision with root package name */
        private EditText f34452Q;

        /* renamed from: R, reason: collision with root package name */
        private boolean f34453R = false;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void I1(String str, View view) {
            B1(b.DELETE_ACCOUNT_CONFIRMATION).c(str).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean J1(TextView textView, int i8, KeyEvent keyEvent) {
            if (i8 != 4 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                return false;
            }
            M1();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void K1(View view) {
            M1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void L1(String str, AbstractC5604n.b bVar) {
            if (bVar.c()) {
                return;
            }
            if (!bVar.a()) {
                AbstractC5673x.a("signInEmailSubmitNew");
                B1(b.PASSWORD_NEW_ACCOUNT).c(str).a();
            } else if (bVar.b()) {
                AbstractC5673x.a("signInEmailSubmitExists");
                B1(b.PASSWORD_EXISTING_ACCOUNT).c(str).a();
            } else {
                AbstractC5673x.a("signInEmailSubmitNoPw");
                Y0().E0(str);
                B1(b.NOTICE_CREATED_PASSWORD).c(str).d(b.PASSWORD_EXISTING_ACCOUNT).a();
            }
        }

        private void M1() {
            if (this.f34453R) {
                return;
            }
            this.f34453R = true;
            AbstractC5673x.a("signInEmailSubmit");
            final String j8 = AbstractC6803e.j(this.f34452Q.getText().toString());
            if (j8.isEmpty()) {
                AbstractC5673x.a("signInEmailSubmitEmpty");
                return;
            }
            if (!AbstractC6803e.n(j8)) {
                AbstractC5673x.a("signInEmailSubmitInvalid");
                this.f34452Q.requestFocus();
                o5.T.t2().f(M2.f34185t0).e(getString(M2.f34113k0, j8)).g(this);
            } else if (!j8.equalsIgnoreCase(A2.f33140n0.w())) {
                AbstractC5604n.c(j8, null, new C5676x2(this, getString(M2.f34005W4)), new AbstractC5604n.h() { // from class: com.headcode.ourgroceries.android.h4
                    @Override // com.headcode.ourgroceries.android.AbstractC5604n.h
                    public final void onResult(Object obj) {
                        this.f34755a.L1(j8, (AbstractC5604n.b) obj);
                    }
                });
            } else {
                AbstractC5673x.a("signInEmailSubmitSame");
                o5.T.t2().f(M2.f34177s0).e(getString(M2.f34105j0, j8)).g(this);
            }
        }

        @Override // android.app.Activity
        public void finish() {
            a1(this.f34452Q);
            super.finish();
        }

        @Override // com.headcode.ourgroceries.android.SignInActivity, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            final String w7 = A2.f33140n0.w();
            String v7 = bundle == null ? AbstractC6803e.o(w7) ? AbstractC6803e.v(A2.f33140n0.D()) : w7 : null;
            C6266p c8 = C6266p.c(getLayoutInflater());
            setContentView(c8.b());
            L0();
            if (AbstractC6803e.o(w7)) {
                setTitle(M2.f33845C4);
                c8.f39719h.setVisibility(8);
                c8.f39713b.setVisibility(8);
            } else {
                setTitle(M2.f33837B4);
                c8.f39719h.setVisibility(0);
                c8.f39713b.setVisibility(0);
                c8.f39714c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.e4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f34724o.I1(w7, view);
                    }
                });
            }
            EditText editText = c8.f39715d;
            this.f34452Q = editText;
            if (v7 != null) {
                editText.setText(v7);
            }
            this.f34452Q.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.headcode.ourgroceries.android.f4
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                    return this.f34732o.J1(textView, i8, keyEvent);
                }
            });
            c8.f39716e.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.g4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34744o.K1(view);
                }
            });
        }

        @Override // com.headcode.ourgroceries.android.SignInActivity
        protected b z1() {
            return b.EMAIL_ADDRESS;
        }
    }

    public static class NoticeActivity extends SignInActivity {

        /* renamed from: Q, reason: collision with root package name */
        private b f34454Q;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void F1(String str, View view) {
            b bVar = this.f34454Q;
            if (bVar == b.FINISH) {
                setResult(1);
                finish();
            } else if (bVar != null) {
                B1(bVar).c(str).a();
            } else {
                setResult(-1);
                finish();
            }
        }

        @Override // com.headcode.ourgroceries.android.SignInActivity, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
        protected void onCreate(Bundle bundle) {
            CharSequence u7;
            int i8;
            super.onCreate(bundle);
            if (this.f34444O == null) {
                AbstractC5673x.a("signInNoticeNoScreen");
                finish();
                return;
            }
            String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.NEXT_SCREEN");
            this.f34454Q = stringExtra == null ? null : b.valueOf(stringExtra);
            final String stringExtra2 = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.EMAIL_ADDRESS");
            String stringExtra3 = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.OLD_EMAIL_ADDRESS");
            String stringExtra4 = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.ASK_CATEGORY_CHANGE");
            B valueOf = stringExtra4 == null ? B.NO_CHANGE : B.valueOf(stringExtra4);
            C6267q c8 = C6267q.c(getLayoutInflater());
            setContentView(c8.b());
            L0();
            switch (this.f34444O.ordinal()) {
                case 5:
                    u7 = P1.u(this, M2.f33885H4, P1.K(stringExtra2));
                    i8 = M2.f33893I4;
                    break;
                case 6:
                    u7 = P1.u(this, M2.f33949P4, P1.K(stringExtra2));
                    i8 = M2.f33957Q4;
                    break;
                case 7:
                    u7 = P1.u(this, M2.f33901J4, P1.K(stringExtra2));
                    i8 = M2.f33909K4;
                    break;
                case 8:
                    u7 = P1.u(this, M2.f33965R4, P1.K(stringExtra2));
                    i8 = M2.f33973S4;
                    break;
                case 9:
                    u7 = P1.u(this, M2.f33917L4, P1.K(stringExtra2));
                    i8 = M2.f33925M4;
                    break;
                case 10:
                    u7 = P1.u(this, M2.f33869F4, P1.K(stringExtra3), P1.K(stringExtra2));
                    i8 = M2.f33877G4;
                    break;
                case 11:
                    u7 = P1.u(this, M2.f33933N4, P1.K(stringExtra3));
                    i8 = M2.f33941O4;
                    break;
                default:
                    AbstractC5673x.a("signInNoticeBadScreen");
                    finish();
                    return;
            }
            setTitle(i8);
            if (valueOf != B.NO_CHANGE) {
                u7 = ((Object) (((Object) u7) + "\n\n")) + valueOf.f(this);
            }
            c8.f39723d.setText(u7);
            c8.f39721b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.i4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34766o.F1(stringExtra2, view);
                }
            });
            if (this.f34454Q == null) {
                setResult(-1);
            }
            int i9 = this.f34445P;
            if (i9 != 0) {
                c8.f39721b.setText(i9);
            }
        }
    }

    public static class PasswordExistingAccountActivity extends SignInActivity {

        /* renamed from: Q, reason: collision with root package name */
        C6268r f34455Q;

        /* renamed from: R, reason: collision with root package name */
        private EditText f34456R;

        /* renamed from: S, reason: collision with root package name */
        private boolean f34457S = false;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean K1(String str, TextView textView, int i8, KeyEvent keyEvent) {
            if (i8 != 4 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                return false;
            }
            Q1(str);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void L1(String str, View view) {
            Q1(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void M1(String str, View view) {
            A2.f33140n0.z0(str);
            String w7 = A2.f33140n0.w();
            if (!AbstractC6803e.o(w7)) {
                B1(b.COPY_LISTS_EMAIL).c(str).e(w7).a();
            } else {
                Y0().L0(str, SignInActivity.A1(), true);
                B1(b.NOTICE_EMAIL_SENT).c(str).a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void N1(String str, View view) {
            Y0().E0(str);
            B1(b.NOTICE_RESET_PASSWORD).c(str).d(b.FINISH).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void O1(String str, AbstractC5604n.k kVar) {
            s5.I b8 = kVar.b();
            B b9 = B.NO_CHANGE;
            if (b8 != null) {
                b9 = C1(b8);
            }
            if (kVar.c() == null) {
                return;
            }
            int i8 = a.f34461a[kVar.c().ordinal()];
            if (i8 == 1) {
                AbstractC5673x.a("signInExistPwSubmitError1");
                AbstractC6635a.b("OG-SignInActivity", "Shouldn't have gotten email sent");
                return;
            }
            if (i8 == 2) {
                AbstractC5673x.a("signInExistPwSubmitRightPw2");
                B1(kVar.a() ? b.NOTICE_COPIED_FROM_ANONYMOUS : b.NOTICE_NOT_COPIED_FROM_ANONYMOUS).c(str).b(b9).a();
            } else if (i8 == 3) {
                AbstractC5673x.a("signInExistPwSubmitError2");
                AbstractC6635a.b("OG-SignInActivity", "Account didn't exist, was created");
                B1(b.NOTICE_COPIED_FROM_ANONYMOUS).c(str).b(b9).a();
            } else {
                if (i8 != 4) {
                    return;
                }
                AbstractC5673x.a("signInExistPwSubmitWrongPw");
                D1();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void P1(String str, String str2, String str3, AbstractC5604n.b bVar) {
            if (bVar.c()) {
                return;
            }
            if (!bVar.a()) {
                AbstractC5673x.a("signInExistPwSubmitNoAccount");
                AbstractC6635a.b("OG-SignInActivity", "Account didn't exist");
                B1(b.PASSWORD_NEW_ACCOUNT).c(str).a();
            } else if (!bVar.b()) {
                AbstractC5673x.a("signInExistPwSubmitNoPw");
                AbstractC6635a.b("OG-SignInActivity", "Account didn't have password");
            } else if (bVar.d()) {
                AbstractC5673x.a("signInExistPwSubmitRightPw1");
                B1(b.COPY_LISTS_PASSWORD_SIGN_IN).c(str).e(str2).f(str3).a();
            } else {
                AbstractC5673x.a("signInExistPwSubmitWrongPw");
                D1();
            }
        }

        private void Q1(final String str) {
            if (this.f34457S) {
                return;
            }
            this.f34457S = true;
            AbstractC5673x.a("signInExistPwSubmit");
            final String trim = this.f34456R.getText().toString().trim();
            if (trim.isEmpty()) {
                AbstractC5673x.a("signInExistPwSubmitEmpty");
                return;
            }
            final String w7 = A2.f33140n0.w();
            if (w7.isEmpty()) {
                AbstractC5604n.j(str, trim, true, new C5676x2(this, getString(M2.f34021Y4)), new AbstractC5604n.h() { // from class: com.headcode.ourgroceries.android.n4
                    @Override // com.headcode.ourgroceries.android.AbstractC5604n.h
                    public final void onResult(Object obj) {
                        this.f34947a.O1(str, (AbstractC5604n.k) obj);
                    }
                });
            } else {
                AbstractC5604n.c(str, trim, new C5676x2(this, getString(M2.f34021Y4)), new AbstractC5604n.h() { // from class: com.headcode.ourgroceries.android.o4
                    @Override // com.headcode.ourgroceries.android.AbstractC5604n.h
                    public final void onResult(Object obj) {
                        this.f34957a.P1(str, w7, trim, (AbstractC5604n.b) obj);
                    }
                });
            }
        }

        @Override // android.app.Activity
        public void finish() {
            a1(this.f34456R);
            super.finish();
        }

        @Override // com.headcode.ourgroceries.android.SignInActivity, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, android.app.Activity
        protected void onActivityResult(int i8, int i9, Intent intent) {
            if (i8 != 10 || i9 != 1) {
                super.onActivityResult(i8, i9, intent);
                return;
            }
            EditText editText = this.f34456R;
            if (editText != null) {
                editText.setText("");
            }
        }

        @Override // com.headcode.ourgroceries.android.SignInActivity, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            final String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.EMAIL_ADDRESS");
            if (AbstractC6803e.o(stringExtra)) {
                AbstractC5673x.a("signInExistNoEmail");
                finish();
                return;
            }
            C6268r c8 = C6268r.c(getLayoutInflater());
            this.f34455Q = c8;
            setContentView(c8.b());
            L0();
            this.f34455Q.f39729e.setText(P1.u(this, M2.f33981T4, P1.K(stringExtra)));
            TextInputEditText textInputEditText = this.f34455Q.f39731g;
            this.f34456R = textInputEditText;
            textInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.headcode.ourgroceries.android.j4
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                    return this.f34828o.K1(stringExtra, textView, i8, keyEvent);
                }
            });
            this.f34455Q.f39727c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.k4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34837o.L1(stringExtra, view);
                }
            });
            this.f34455Q.f39726b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.l4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34884o.M1(stringExtra, view);
                }
            });
            this.f34455Q.f39732h.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.m4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34916o.N1(stringExtra, view);
                }
            });
        }

        @Override // androidx.appcompat.app.AbstractActivityC0835d, android.app.Activity
        protected void onPostCreate(Bundle bundle) {
            super.onPostCreate(bundle);
            if (bundle == null) {
                b1(this.f34456R);
            }
        }
    }

    public static class PasswordNewAccountActivity extends SignInActivity {

        /* renamed from: Q, reason: collision with root package name */
        C6269s f34458Q;

        /* renamed from: R, reason: collision with root package name */
        private EditText f34459R;

        /* renamed from: S, reason: collision with root package name */
        private boolean f34460S = false;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean H1(String str, TextView textView, int i8, KeyEvent keyEvent) {
            if (i8 != 4 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                return false;
            }
            K1(str);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void I1(String str, View view) {
            K1(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void J1(String str, AbstractC5604n.k kVar) {
            s5.I b8 = kVar.b();
            B b9 = B.NO_CHANGE;
            if (b8 != null) {
                b9 = C1(b8);
            }
            if (kVar.c() == null) {
                return;
            }
            int i8 = a.f34461a[kVar.c().ordinal()];
            if (i8 == 1) {
                AbstractC5673x.a("signInNewPwSubmitError1");
                AbstractC6635a.b("OG-SignInActivity", "Shouldn't have gotten email sent");
                return;
            }
            if (i8 == 2) {
                AbstractC5673x.a("signInNewPwSubmitError2");
                B1(b.NOTICE_COPIED_FROM_ANONYMOUS).c(str).b(b9).a();
            } else if (i8 == 3) {
                B1(b.NOTICE_COPIED_FROM_ANONYMOUS).c(str).b(b9).a();
            } else {
                if (i8 != 4) {
                    return;
                }
                AbstractC5673x.a("signInNewPwSubmitError3");
                AbstractC6635a.b("OG-SignInActivity", "Account didn't exist");
            }
        }

        private void K1(final String str) {
            if (this.f34460S) {
                return;
            }
            this.f34460S = true;
            AbstractC5673x.a("signInNewPwSubmit");
            String trim = this.f34459R.getText().toString().trim();
            if (trim.isEmpty()) {
                AbstractC5673x.a("signInNewPwSubmitEmpty");
                return;
            }
            String w7 = A2.f33140n0.w();
            if (w7.isEmpty()) {
                AbstractC5604n.j(str, trim, true, new C5676x2(this, getString(M2.f34013X4)), new AbstractC5604n.h() { // from class: com.headcode.ourgroceries.android.r4
                    @Override // com.headcode.ourgroceries.android.AbstractC5604n.h
                    public final void onResult(Object obj) {
                        this.f34996a.J1(str, (AbstractC5604n.k) obj);
                    }
                });
            } else {
                B1(b.COPY_LISTS_PASSWORD_CREATE_ACCOUNT).c(str).e(w7).f(trim).a();
            }
        }

        @Override // android.app.Activity
        public void finish() {
            a1(this.f34459R);
            super.finish();
        }

        @Override // com.headcode.ourgroceries.android.SignInActivity, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            final String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.EMAIL_ADDRESS");
            if (AbstractC6803e.o(stringExtra)) {
                AbstractC5673x.a("signInNewNoEmail");
                finish();
                return;
            }
            C6269s c8 = C6269s.c(getLayoutInflater());
            this.f34458Q = c8;
            setContentView(c8.b());
            L0();
            this.f34458Q.f39736d.setText(P1.u(this, M2.f33989U4, P1.K(stringExtra)));
            TextInputEditText textInputEditText = this.f34458Q.f39738f;
            this.f34459R = textInputEditText;
            textInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.headcode.ourgroceries.android.p4
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                    return this.f34970o.H1(stringExtra, textView, i8, keyEvent);
                }
            });
            this.f34458Q.f39734b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.q4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34988o.I1(stringExtra, view);
                }
            });
        }

        @Override // androidx.appcompat.app.AbstractActivityC0835d, android.app.Activity
        protected void onPostCreate(Bundle bundle) {
            super.onPostCreate(bundle);
            if (bundle == null) {
                b1(this.f34459R);
            }
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34461a;

        static {
            int[] iArr = new int[g0.c.values().length];
            f34461a = iArr;
            try {
                iArr[g0.c.EMAIL_SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34461a[g0.c.REPARENTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34461a[g0.c.CREATED_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34461a[g0.c.INVALID_PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum b {
        EMAIL_ADDRESS(EmailAddressActivity.class),
        PASSWORD_EXISTING_ACCOUNT(PasswordExistingAccountActivity.class),
        PASSWORD_NEW_ACCOUNT(PasswordNewAccountActivity.class),
        DELETE_ACCOUNT_CONFIRMATION(DeleteAccountConfirmationActivity.class),
        ACCOUNT_DELETED_NOTICE(AccountDeletedNoticeActivity.class),
        NOTICE_COPIED_FROM_ANONYMOUS(NoticeActivity.class),
        NOTICE_NOT_COPIED_FROM_ANONYMOUS(NoticeActivity.class),
        NOTICE_CREATED_PASSWORD(NoticeActivity.class),
        NOTICE_RESET_PASSWORD(NoticeActivity.class),
        NOTICE_EMAIL_SENT(NoticeActivity.class),
        NOTICE_COPIED_FROM_ACCOUNT(NoticeActivity.class),
        NOTICE_NOT_COPIED_FROM_ACCOUNT(NoticeActivity.class),
        COPY_LISTS_EMAIL(CopyListsActivity.class),
        COPY_LISTS_PASSWORD_SIGN_IN(CopyListsActivity.class),
        COPY_LISTS_PASSWORD_CREATE_ACCOUNT(CopyListsActivity.class),
        FINISH(null);


        /* renamed from: o, reason: collision with root package name */
        private final Class f34479o;

        b(Class cls) {
            this.f34479o = cls;
        }

        public Class c() {
            return this.f34479o;
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        private final Intent f34480a;

        public c(Intent intent) {
            this.f34480a = intent;
        }

        public void a() {
            SignInActivity.this.startActivityForResult(this.f34480a, 10);
        }

        public c b(B b8) {
            this.f34480a.putExtra("com.headcode.ourgroceries.android.SignInActivity.ASK_CATEGORY_CHANGE", b8.name());
            return this;
        }

        public c c(String str) {
            this.f34480a.putExtra("com.headcode.ourgroceries.android.SignInActivity.EMAIL_ADDRESS", str);
            return this;
        }

        public c d(b bVar) {
            this.f34480a.putExtra("com.headcode.ourgroceries.android.SignInActivity.NEXT_SCREEN", bVar.name());
            return this;
        }

        public c e(String str) {
            this.f34480a.putExtra("com.headcode.ourgroceries.android.SignInActivity.OLD_EMAIL_ADDRESS", str);
            return this;
        }

        public c f(String str) {
            this.f34480a.putExtra("com.headcode.ourgroceries.android.SignInActivity.PASSWORD", str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String A1() {
        return Build.MODEL;
    }

    protected c B1(b bVar) {
        Intent intent = new Intent(this, (Class<?>) bVar.c());
        intent.putExtra("com.headcode.ourgroceries.android.SignInActivity.SCREEN", bVar.name());
        intent.putExtra("com.headcode.ourgroceries.android.SignInActivity.NOTICE_BUTTON_STRING_ID", this.f34445P);
        return new c(intent);
    }

    protected B C1(s5.I i8) {
        return AbstractC5604n.i(V0(), i8);
    }

    protected void D1() {
        o5.T.t2().f(M2.f33861E4).d(M2.f33853D4).g(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 10 && i9 == -1) {
            setResult(-1);
            finish();
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.android.SignInActivity.SCREEN");
        if (stringExtra == null) {
            this.f34444O = z1();
        } else {
            this.f34444O = b.valueOf(stringExtra);
        }
        this.f34445P = getIntent().getIntExtra("com.headcode.ourgroceries.android.SignInActivity.NOTICE_BUTTON_STRING_ID", 0);
        if (bundle != null || this.f34444O == null) {
            return;
        }
        AbstractC5673x.a("signIn_" + this.f34444O.name());
    }

    protected b z1() {
        return null;
    }
}
