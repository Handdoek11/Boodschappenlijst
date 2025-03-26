package com.headcode.ourgroceries.android;

import a6.AbstractC0829f;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.headcode.ourgroceries.android.AboutActivity;
import com.headcode.ourgroceries.android.C5503a2;
import com.headcode.ourgroceries.android.C5587k6;
import d6.InterfaceC5732b;
import j$.time.Year;
import n5.C6251a;

/* loaded from: classes2.dex */
public class AboutActivity extends AbstractActivityC5575j2 {

    /* renamed from: O, reason: collision with root package name */
    private TextView f33221O;

    /* renamed from: P, reason: collision with root package name */
    private TextView f33222P;

    /* renamed from: Q, reason: collision with root package name */
    private Button f33223Q;

    /* renamed from: R, reason: collision with root package name */
    private InterfaceC5732b f33224R = null;

    /* renamed from: S, reason: collision with root package name */
    private C6251a f33225S;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f33226a;

        /* renamed from: b, reason: collision with root package name */
        private final C5503a2 f33227b;

        public a(long j8, C5503a2 c5503a2) {
            this.f33226a = j8;
            this.f33227b = c5503a2;
        }

        public long a() {
            return this.f33226a;
        }

        public boolean b() {
            return a() != Long.MAX_VALUE;
        }

        public C5503a2 c() {
            return this.f33227b;
        }
    }

    private String H1() {
        return "Client ID: " + A2.f33140n0.h() + "\nDevice ID: " + P1.m(this) + "\nDevice model: " + P1.p() + "\nAndroid version: " + P1.r() + "\nOurGroceries version: " + P1.t(this) + "\nRequest queue length: " + Y0().R() + "\nFree space: " + P1.W(P1.o(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1(View view) {
        AbstractC5673x.a("aboutKeyButton");
        P1.U(this, "about_upgrade");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1(View view) {
        AbstractC5673x.a("aboutUserGuideButton");
        P1.V(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K1(View view) {
        AbstractC5673x.a("aboutShowFaqButton");
        P1.P(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L1(View view) {
        AbstractC5673x.a("aboutPrivacyButton");
        P1.S(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1(View view) {
        AbstractC5673x.a("aboutRateUsButton");
        P1.X(this.f33221O, this, "about_rate_us");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N1(DialogInterface dialogInterface, int i8) {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Device information", H1()));
        V1.e(this.f33222P, "Device information has been copied to the clipboard", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean O1(View view) {
        new AlertDialog.Builder(this).setIcon(G2.f33459g).setTitle("Device Information").setMessage(H1()).setNeutralButton("Copy Text", new DialogInterface.OnClickListener() { // from class: com.headcode.ourgroceries.android.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f34771o.N1(dialogInterface, i8);
            }
        }).setPositiveButton("Close", (DialogInterface.OnClickListener) null).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P1(StringBuilder sb, String str) {
        sb.append("\n\n");
        sb.append(getString(M2.f34032a, str));
    }

    private void Q1() {
        InterfaceC5732b interfaceC5732b = this.f33224R;
        if (interfaceC5732b != null) {
            interfaceC5732b.c();
            this.f33224R = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1(a aVar) {
        long Q7 = L4.Q();
        final StringBuilder sb = new StringBuilder();
        if (aVar.b()) {
            sb.append(getString(M2.f34064e, P1.I(this, aVar.a())));
            if (aVar.a() > 2 * Q7) {
            }
            aVar.c().c(new C5503a2.a() { // from class: com.headcode.ourgroceries.android.k
                @Override // com.headcode.ourgroceries.android.C5503a2.a
                public final void apply(Object obj) {
                    this.f34832a.P1(sb, (String) obj);
                }
            });
            this.f33222P.setText(sb);
        }
        sb.append(getString(M2.f34072f));
        sb.append(" ");
        sb.append(getString(M2.f34104j, Long.valueOf(Q7 / 1000)));
        aVar.c().c(new C5503a2.a() { // from class: com.headcode.ourgroceries.android.k
            @Override // com.headcode.ourgroceries.android.C5503a2.a
            public final void apply(Object obj) {
                this.f34832a.P1(sb, (String) obj);
            }
        });
        this.f33222P.setText(sb);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    public void j1(C5587k6.b bVar) {
        super.j1(bVar);
        boolean f8 = bVar.f34866c.f();
        setTitle(f8 ? M2.f34096i : M2.f34112k);
        this.f33223Q.setVisibility(f8 ? 8 : 0);
        this.f33221O.setText(f8 ? M2.f34088h : M2.f34080g);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6251a c8 = C6251a.c(getLayoutInflater());
        this.f33225S = c8;
        setContentView(c8.b());
        L0();
        C6251a c6251a = this.f33225S;
        this.f33221O = c6251a.f39595c;
        c6251a.f39603k.setText(getString(M2.f34040b, Integer.valueOf(Year.now().getValue())));
        this.f33225S.f39596d.setText(getString(M2.f34048c, P1.t(this)));
        C6251a c6251a2 = this.f33225S;
        this.f33222P = c6251a2.f39594b;
        Button button = c6251a2.f39598f;
        this.f33223Q = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34674o.I1(view);
            }
        });
        this.f33225S.f39602j.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34685o.J1(view);
            }
        });
        this.f33225S.f39601i.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34729o.K1(view);
            }
        });
        this.f33225S.f39599g.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34738o.L1(view);
            }
        });
        this.f33225S.f39600h.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34749o.M1(view);
            }
        });
        this.f33225S.f39597e.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.headcode.ourgroceries.android.i
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f34761o.O1(view);
            }
        });
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onStart() {
        super.onStart();
        Q1();
        this.f33224R = AbstractC0829f.h(Y0().T(), D6.f33357d.f33360a, new f6.b() { // from class: com.headcode.ourgroceries.android.b
            @Override // f6.b
            public final Object apply(Object obj, Object obj2) {
                return new AboutActivity.a(((Long) obj).longValue(), (C5503a2) obj2);
            }
        }).E(new f6.d() { // from class: com.headcode.ourgroceries.android.c
            @Override // f6.d
            public final void accept(Object obj) {
                this.f34662o.R1((AboutActivity.a) obj);
            }
        });
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onStop() {
        Q1();
        super.onStop();
    }
}
