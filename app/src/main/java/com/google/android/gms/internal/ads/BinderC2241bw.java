package com.google.android.gms.internal.ads;

import D2.AbstractBinderC0544u0;
import G2.C0618v;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2241bw extends AbstractBinderC0544u0 {

    /* renamed from: A, reason: collision with root package name */
    private final C1305Fg f21016A;

    /* renamed from: B, reason: collision with root package name */
    private final RunnableC3791q90 f21017B;

    /* renamed from: C, reason: collision with root package name */
    private final C2808h70 f21018C;

    /* renamed from: D, reason: collision with root package name */
    private final XA f21019D;

    /* renamed from: E, reason: collision with root package name */
    private final HN f21020E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21021F = false;

    /* renamed from: G, reason: collision with root package name */
    private final Long f21022G = Long.valueOf(C2.v.c().b());

    /* renamed from: o, reason: collision with root package name */
    private final Context f21023o;

    /* renamed from: s, reason: collision with root package name */
    private final H2.a f21024s;

    /* renamed from: t, reason: collision with root package name */
    private final C4358vM f21025t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC4692yT f21026u;

    /* renamed from: v, reason: collision with root package name */
    private final NW f21027v;

    /* renamed from: w, reason: collision with root package name */
    private final SO f21028w;

    /* renamed from: x, reason: collision with root package name */
    private final C1950Xp f21029x;

    /* renamed from: y, reason: collision with root package name */
    private final AM f21030y;

    /* renamed from: z, reason: collision with root package name */
    private final C3490nP f21031z;

    BinderC2241bw(Context context, H2.a aVar, C4358vM c4358vM, InterfaceC4692yT interfaceC4692yT, NW nw, SO so, C1950Xp c1950Xp, AM am, C3490nP c3490nP, C1305Fg c1305Fg, RunnableC3791q90 runnableC3791q90, C2808h70 c2808h70, XA xa, HN hn) {
        this.f21023o = context;
        this.f21024s = aVar;
        this.f21025t = c4358vM;
        this.f21026u = interfaceC4692yT;
        this.f21027v = nw;
        this.f21028w = so;
        this.f21029x = c1950Xp;
        this.f21030y = am;
        this.f21031z = c3490nP;
        this.f21016A = c1305Fg;
        this.f21017B = runnableC3791q90;
        this.f21018C = c2808h70;
        this.f21019D = xa;
        this.f21020E = hn;
    }

    @Override // D2.InterfaceC0547v0
    public final void A6(InterfaceC5852a interfaceC5852a, String str) {
        if (interfaceC5852a == null) {
            H2.p.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        if (context == null) {
            H2.p.d("Context is null. Failed to open debug menu.");
            return;
        }
        C0618v c0618v = new C0618v(context);
        c0618v.n(str);
        c0618v.o(this.f21024s.f2914o);
        c0618v.r();
    }

    final /* synthetic */ void B() {
        this.f21016A.a(new BinderC1948Xn());
    }

    @Override // D2.InterfaceC0547v0
    public final synchronized void E5(String str) {
        AbstractC3184kf.a(this.f21023o);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23852b4)).booleanValue()) {
                C2.v.d().a(this.f21023o, this.f21024s, str, null, this.f21017B, null, null);
            }
        }
    }

    @Override // D2.InterfaceC0547v0
    public final void Q0(String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.o9)).booleanValue()) {
            C2.v.s().A(str);
        }
    }

    @Override // D2.InterfaceC0547v0
    public final void U0(String str, InterfaceC5852a interfaceC5852a) {
        String V7;
        Runnable runnable;
        AbstractC3184kf.a(this.f21023o);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23915i4)).booleanValue()) {
            try {
                C2.v.t();
                V7 = G2.D0.V(this.f21023o);
            } catch (RemoteException | RuntimeException e8) {
                C2.v.s().x(e8, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            V7 = "";
        }
        boolean z7 = true;
        String str2 = true == TextUtils.isEmpty(V7) ? str : V7;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean booleanValue = ((Boolean) D2.A.c().a(AbstractC3184kf.f23852b4)).booleanValue();
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23840a1;
        boolean booleanValue2 = booleanValue | ((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue();
        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
            final Runnable runnable2 = (Runnable) BinderC5853b.J0(interfaceC5852a);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.aw
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16649f;
                    final BinderC2241bw binderC2241bw = this.f20785o;
                    final Runnable runnable3 = runnable2;
                    interfaceExecutorServiceC3522nk0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Vv
                        @Override // java.lang.Runnable
                        public final void run() {
                            binderC2241bw.t7(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z7 = booleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z7) {
            C2.v.d().a(this.f21023o, this.f21024s, str2, runnable3, this.f21017B, this.f21020E, this.f21022G);
        }
    }

    @Override // D2.InterfaceC0547v0
    public final void X2(InterfaceC1699Qj interfaceC1699Qj) {
        this.f21028w.s(interfaceC1699Qj);
    }

    @Override // D2.InterfaceC0547v0
    public final void Z0(InterfaceC1242Dl interfaceC1242Dl) {
        this.f21018C.f(interfaceC1242Dl);
    }

    @Override // D2.InterfaceC0547v0
    public final synchronized float b() {
        return C2.v.v().a();
    }

    @Override // D2.InterfaceC0547v0
    public final void b0(String str) {
        this.f21027v.g(str);
    }

    @Override // D2.InterfaceC0547v0
    public final void b4(D2.K1 k12) {
        this.f21029x.n(this.f21023o, k12);
    }

    @Override // D2.InterfaceC0547v0
    public final String c() {
        return this.f21024s.f2914o;
    }

    final /* synthetic */ void d() {
        AbstractC3678p70.b(this.f21023o, true);
    }

    @Override // D2.InterfaceC0547v0
    public final void f() {
        this.f21028w.l();
    }

    @Override // D2.InterfaceC0547v0
    public final List g() {
        return this.f21028w.g();
    }

    @Override // D2.InterfaceC0547v0
    public final synchronized void i() {
        if (this.f21021F) {
            H2.p.g("Mobile ads is initialized already.");
            return;
        }
        AbstractC3184kf.a(this.f21023o);
        C2.v.s().v(this.f21023o, this.f21024s);
        this.f21019D.c();
        C2.v.f().i(this.f21023o);
        this.f21021F = true;
        this.f21028w.r();
        this.f21027v.e();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23870d4)).booleanValue()) {
            this.f21030y.d();
        }
        this.f21031z.h();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue()) {
            AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Wv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19907o.zzb();
                }
            });
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Pa)).booleanValue()) {
            AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Zv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20576o.B();
                }
            });
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23851b3)).booleanValue()) {
            AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Xv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20158o.d();
                }
            });
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23683G4)).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23691H4)).booleanValue()) {
                AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Yv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20351o.w();
                    }
                });
            }
        }
    }

    @Override // D2.InterfaceC0547v0
    public final void k0(boolean z7) {
        try {
            C2531ee0.a(this.f21023o).c(z7);
            if (z7) {
                return;
            }
            try {
                if (this.f21023o.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e8) {
                C2.v.s().x(e8, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e9) {
            throw new RemoteException(e9.getMessage());
        }
    }

    @Override // D2.InterfaceC0547v0
    public final synchronized void l7(boolean z7) {
        C2.v.v().c(z7);
    }

    @Override // D2.InterfaceC0547v0
    public final void p6(D2.H0 h02) {
        this.f21031z.i(h02, EnumC3381mP.API);
    }

    @Override // D2.InterfaceC0547v0
    public final synchronized void t0(float f8) {
        C2.v.v().d(f8);
    }

    final void t7(Runnable runnable) {
        Z2.r.e("Adapters must be initialized on the main thread.");
        Map e8 = C2.v.s().j().g().e();
        if (e8.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                H2.p.h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f21025t.d()) {
            HashMap hashMap = new HashMap();
            Iterator it = e8.values().iterator();
            while (it.hasNext()) {
                for (C4394vl c4394vl : ((C4503wl) it.next()).f27540a) {
                    String str = c4394vl.f27339b;
                    for (String str2 : c4394vl.f27338a) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    C4801zT a8 = this.f21026u.a(str3, jSONObject);
                    if (a8 != null) {
                        C3024j70 c3024j70 = (C3024j70) a8.f28627b;
                        if (!c3024j70.c() && c3024j70.b()) {
                            c3024j70.o(this.f21023o, (BinderC4257uU) a8.f28628c, (List) entry.getValue());
                            H2.p.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfcq e9) {
                    H2.p.h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e9);
                }
            }
        }
    }

    @Override // D2.InterfaceC0547v0
    public final synchronized boolean u() {
        return C2.v.v().e();
    }

    final /* synthetic */ void w() {
        C2.v.i().d(this.f21023o, this.f21020E);
    }

    final void zzb() {
        if (C2.v.s().j().J()) {
            String f8 = C2.v.s().j().f();
            if (C2.v.w().j(this.f21023o, f8, this.f21024s.f2914o)) {
                return;
            }
            C2.v.s().j().U(false);
            C2.v.s().j().b0("");
        }
    }
}
