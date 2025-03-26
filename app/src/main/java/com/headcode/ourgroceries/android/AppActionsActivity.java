package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.adadapted.android.sdk.constants.Config;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n5.C6254d;
import o5.O;
import o5.T;
import q5.AbstractC6635a;
import s5.EnumC6751q;
import s5.p0;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class AppActionsActivity extends AbstractActivityC5575j2 implements O.a, T.c {

    /* renamed from: O, reason: collision with root package name */
    private final ExecutorService f33267O = Executors.newSingleThreadExecutor();

    /* renamed from: P, reason: collision with root package name */
    private final Handler f33268P = new Handler(Looper.getMainLooper());

    /* renamed from: Q, reason: collision with root package name */
    private C6254d f33269Q;

    class a extends AbstractRunnableC5500a {

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ String f33270w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s5.h0 h0Var, String str) {
            super(h0Var);
            this.f33270w = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(AbstractRunnableC5500a abstractRunnableC5500a, String str) {
            s5.n0 c8;
            AppActionsActivity.this.f33269Q.f39622b.setVisibility(4);
            if (abstractRunnableC5500a.d() == s5.o0.RS_SUCCESS && (c8 = abstractRunnableC5500a.c()) != null && c8.J()) {
                AppActionsActivity.this.E1(str, c8.v());
            } else {
                AppActionsActivity appActionsActivity = AppActionsActivity.this;
                appActionsActivity.F1(M2.f33873G0, appActionsActivity.getResources().getString(M2.f33865F0));
            }
        }

        @Override // com.headcode.ourgroceries.android.AbstractRunnableC5500a
        public void h(final AbstractRunnableC5500a abstractRunnableC5500a) {
            Handler j8 = OurApplication.j();
            final String str = this.f33270w;
            j8.post(new Runnable() { // from class: com.headcode.ourgroceries.android.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35120o.k(abstractRunnableC5500a, str);
                }
            });
        }
    }

    class b extends AbstractRunnableC5500a {

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ String f33272w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ String f33273x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s5.h0 h0Var, String str, String str2) {
            super(h0Var);
            this.f33272w = str;
            this.f33273x = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            AppActionsActivity.this.finishAndRemoveTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(AbstractRunnableC5500a abstractRunnableC5500a, String str, String str2) {
            AppActionsActivity.this.f33269Q.f39622b.setVisibility(4);
            if (abstractRunnableC5500a.d() != s5.o0.RS_SUCCESS) {
                AppActionsActivity appActionsActivity = AppActionsActivity.this;
                appActionsActivity.F1(M2.f33873G0, appActionsActivity.getResources().getString(M2.f33865F0));
                AbstractC6635a.d("OG-AppAction", "Likely network error adding item \"" + str + "\" to list \"" + str2 + "\" (" + abstractRunnableC5500a.d() + ")");
                return;
            }
            s5.n0 c8 = abstractRunnableC5500a.c();
            if (c8 != null && c8.J()) {
                s5.q0 v7 = c8.v();
                if (v7.E() != 1) {
                    AppActionsActivity appActionsActivity2 = AppActionsActivity.this;
                    appActionsActivity2.F1(M2.f33873G0, appActionsActivity2.getResources().getString(M2.f33865F0));
                    AbstractC6635a.b("OG-AppAction", "No items were added for \"" + str + "\"");
                    return;
                }
                AppActionsActivity.this.f33269Q.f39626f.setText((v7.y() <= 0 || !v7.x(0)) ? P1.u(AppActionsActivity.this.getApplicationContext(), M2.f33849D0, str, str2) : P1.u(AppActionsActivity.this.getApplicationContext(), M2.f33857E0, AbstractC6803e.g(str, Locale.getDefault()), str2));
                AppActionsActivity.this.f33269Q.f39626f.setVisibility(0);
                AbstractC6635a.d("OG-AppAction", "Added item \"" + str + "\" to list \"" + str2 + "\"");
                AppActionsActivity.this.Y0().a0();
            }
            AppActionsActivity.this.f33268P.postDelayed(new Runnable() { // from class: com.headcode.ourgroceries.android.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33134o.l();
                }
            }, Config.DEFAULT_EVENT_POLLING);
        }

        @Override // com.headcode.ourgroceries.android.AbstractRunnableC5500a
        public void h(final AbstractRunnableC5500a abstractRunnableC5500a) {
            Handler j8 = OurApplication.j();
            final String str = this.f33272w;
            final String str2 = this.f33273x;
            j8.post(new Runnable() { // from class: com.headcode.ourgroceries.android.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35129o.m(abstractRunnableC5500a, str, str2);
                }
            });
        }
    }

    private void C1(String str, String str2) {
        p0.b m8 = s5.p0.G().A(p0.c.ADD_ITEM).x(A2.f33140n0.e()).m(str);
        if (str2 != null) {
            m8.y(str2);
        }
        this.f33267O.execute(new b(s5.h0.J0().P(A2.f33140n0.h()).Q(EnumC6751q.VERSION_WITH_MANY_AD_NETWORKS.e()).c0(s5.i0.SPEECH).g0(m8.p()).m(), str, str2));
        this.f33269Q.f39622b.setVisibility(0);
    }

    private void D1(String str, String str2) {
        p0.b A7 = s5.p0.G().A(p0.c.ADD_ITEM_CHECK_LIST_NAME);
        if (str2 != null) {
            A7.y(str2);
        }
        this.f33267O.execute(new a(L4.O(s5.i0.SPEECH, s5.h0.J0().f0(A7)), str));
        this.f33269Q.f39622b.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1(String str, s5.q0 q0Var) {
        try {
            if (q0Var.B() != 1) {
                o5.O.w2(Collections.singletonList(str), Collections.singletonList(null), null).r2(getSupportFragmentManager(), "unused");
            } else if (!q0Var.u()) {
                C1(str, q0Var.A(0));
            } else {
                o5.O.w2(Collections.singletonList(str), Collections.singletonList(null), V0().y(q0Var.A(0))).r2(getSupportFragmentManager(), "unused");
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F1(int i8, String str) {
        o5.T.t2().f(i8).e(str).a(0).g(this);
    }

    @Override // o5.O.a
    public void B() {
    }

    @Override // o5.T.c
    public void a(int i8) {
        finishAndRemoveTask();
    }

    @Override // o5.O.a
    public void n(C5688z0 c5688z0, List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1((String) it.next(), c5688z0.W());
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6254d c8 = C6254d.c(getLayoutInflater());
        this.f33269Q = c8;
        setContentView(c8.b());
        if (bundle != null) {
            return;
        }
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("actions.fulfillment.extra.ACTION_TOKEN")) {
            String stringExtra = intent.getStringExtra("list");
            String stringExtra2 = intent.getStringExtra("item");
            AbstractC6635a.d("OG-AppAction", "App Action: list=" + stringExtra + " item=" + stringExtra2 + " action=" + intent.getAction());
            AbstractC5673x.c("appaction", null, intent.getAction());
            if (stringExtra2 != null) {
                D1(stringExtra2, stringExtra);
                this.f33269Q.f39626f.setVisibility(8);
                return;
            }
        }
        finishAndRemoveTask();
    }

    @Override // o5.O.a
    public void x() {
        finishAndRemoveTask();
    }
}
