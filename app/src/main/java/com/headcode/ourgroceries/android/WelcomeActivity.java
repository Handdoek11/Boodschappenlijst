package com.headcode.ourgroceries.android;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC0835d;
import com.headcode.ourgroceries.android.AbstractC5604n;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.TourActivity;
import d6.InterfaceC5732b;
import n5.C6274x;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class WelcomeActivity extends AbstractActivityC0835d {

    /* renamed from: o, reason: collision with root package name */
    private final d.c f34587o = registerForActivityResult(new AbstractC5625q.c(M2.f33975S6), new d.b() { // from class: com.headcode.ourgroceries.android.E6
        @Override // d.b
        public final void a(Object obj) {
            ((Integer) obj).intValue();
        }
    });

    /* renamed from: s, reason: collision with root package name */
    private final d.c f34588s = registerForActivityResult(new TourActivity.c(), new d.b() { // from class: com.headcode.ourgroceries.android.F6
        @Override // d.b
        public final void a(Object obj) {
            this.f33450a.L0((TourActivity.d) obj);
        }
    });

    /* renamed from: t, reason: collision with root package name */
    private C6274x f34589t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC5732b f34590u;

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(final AbstractC5604n.g gVar) {
        if (gVar == null) {
            this.f34589t.f39775d.setText(M2.f34007W6);
            this.f34589t.f39773b.setText(M2.f33975S6);
            this.f34589t.f39774c.setText(M2.f33967R6);
            this.f34589t.f39773b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.I6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f33645o.F0(view);
                }
            });
            this.f34589t.f39774c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.J6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f33725o.G0(view);
                }
            });
            return;
        }
        this.f34589t.f39775d.setText(getString(M2.f33999V6, gVar.c()));
        this.f34589t.f39773b.setText(M2.f33983T6);
        this.f34589t.f39774c.setText(M2.f33991U6);
        this.f34589t.f39773b.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.K6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33735o.I0(gVar, view);
            }
        });
        this.f34589t.f39774c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.L6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33782o.J0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(View view) {
        AbstractC5673x.a("welcomeGoTour");
        N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(View view) {
        O0(s5.W.SIGN_IN);
        AbstractC5673x.a("welcomeGoSignIn");
        this.f34587o.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        E0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(AbstractC5604n.g gVar, View view) {
        AbstractC5673x.a("welcomeInviteAccept");
        AbstractC5604n.e(gVar, !A2.f33140n0.X(), this, new X1() { // from class: com.headcode.ourgroceries.android.M6
            @Override // com.headcode.ourgroceries.android.X1
            public final void accept(Object obj) {
                this.f34242a.H0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(View view) {
        AbstractC5673x.a("welcomeInviteReject");
        N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(TourActivity.d dVar) {
        if (dVar == TourActivity.d.BACK_OUT) {
            return;
        }
        A2.f33140n0.u0(dVar == TourActivity.d.SKIPPED ? s5.X.SKIPPED : s5.X.COMPLETED);
        OurApplication.f34286H.n().J0();
        AbstractC5625q.e(OurApplication.f34286H.i().O(), this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(String str) {
        if (AbstractC6803e.o(str)) {
            return;
        }
        N0();
    }

    private void N0() {
        A2.f33140n0.E0(P1.t(this));
        OurApplication.f34286H.n().J0();
        this.f34588s.a(null);
    }

    private void O0(s5.W w7) {
        if (A2.f33140n0.r() != w7) {
            A2.f33140n0.r0(w7);
            OurApplication.f34286H.n().J0();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O0(s5.W.WELCOME);
        AbstractC5673x.a("welcomeScreen");
        C6274x c8 = C6274x.c(getLayoutInflater());
        this.f34589t = c8;
        setContentView(c8.b());
        this.f34590u = A2.f33140n0.x().E(new f6.d() { // from class: com.headcode.ourgroceries.android.G6
            @Override // f6.d
            public final void accept(Object obj) {
                this.f33470o.M0((String) obj);
            }
        });
        E0(null);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        InterfaceC5732b interfaceC5732b = this.f34590u;
        if (interfaceC5732b != null) {
            interfaceC5732b.c();
            this.f34590u = null;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onResume() {
        super.onResume();
        AbstractC5517c0.c(this, new X1() { // from class: com.headcode.ourgroceries.android.H6
            @Override // com.headcode.ourgroceries.android.X1
            public final void accept(Object obj) {
                this.f33638a.E0((AbstractC5604n.g) obj);
            }
        });
    }
}
