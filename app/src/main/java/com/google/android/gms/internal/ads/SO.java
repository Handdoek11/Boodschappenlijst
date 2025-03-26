package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SO {

    /* renamed from: f, reason: collision with root package name */
    private final Context f18883f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f18884g;

    /* renamed from: h, reason: collision with root package name */
    private final C4358vM f18885h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f18886i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f18887j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f18888k;

    /* renamed from: l, reason: collision with root package name */
    private final TN f18889l;

    /* renamed from: m, reason: collision with root package name */
    private final H2.a f18890m;

    /* renamed from: o, reason: collision with root package name */
    private final PF f18892o;

    /* renamed from: p, reason: collision with root package name */
    private final RunnableC3791q90 f18893p;

    /* renamed from: a, reason: collision with root package name */
    private boolean f18878a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18879b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18880c = false;

    /* renamed from: e, reason: collision with root package name */
    private final C1811Tq f18882e = new C1811Tq();

    /* renamed from: n, reason: collision with root package name */
    private final Map f18891n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    private boolean f18894q = true;

    /* renamed from: d, reason: collision with root package name */
    private final long f18881d = C2.v.c().b();

    public SO(Executor executor, Context context, WeakReference weakReference, Executor executor2, C4358vM c4358vM, ScheduledExecutorService scheduledExecutorService, TN tn, H2.a aVar, PF pf, RunnableC3791q90 runnableC3791q90) {
        this.f18885h = c4358vM;
        this.f18883f = context;
        this.f18884g = weakReference;
        this.f18886i = executor2;
        this.f18888k = scheduledExecutorService;
        this.f18887j = executor;
        this.f18889l = tn;
        this.f18890m = aVar;
        this.f18892o = pf;
        this.f18893p = runnableC3791q90;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void j(final SO so, String str) {
        int i8 = 5;
        final InterfaceC2160b90 a8 = AbstractC2051a90.a(so.f18883f, 5);
        a8.f();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final InterfaceC2160b90 a9 = AbstractC2051a90.a(so.f18883f, i8);
                a9.f();
                a9.Z(next);
                final Object obj = new Object();
                final C1811Tq c1811Tq = new C1811Tq();
                com.google.common.util.concurrent.d o8 = AbstractC2326ck0.o(c1811Tq, ((Long) D2.A.c().a(AbstractC3184kf.f23808W1)).longValue(), TimeUnit.SECONDS, so.f18888k);
                so.f18889l.c(next);
                so.f18892o.C(next);
                final long b8 = C2.v.c().b();
                o8.f(new Runnable() { // from class: com.google.android.gms.internal.ads.EO
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14725o.q(obj, c1811Tq, next, b8, a9);
                    }
                }, so.f18886i);
                arrayList.add(o8);
                final NO no = new NO(so, obj, next, b8, a9, c1811Tq);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i9 = 0;
                        while (i9 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new C1804Tj(optString, bundle));
                            i9++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                so.v(next, false, "", 0);
                try {
                    final C3024j70 c8 = so.f18885h.c(next, new JSONObject());
                    so.f18887j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.JO
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f16238o.n(next, no, c8, arrayList2);
                        }
                    });
                } catch (zzfcq e8) {
                    try {
                        String str2 = "Failed to create Adapter.";
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.Qc)).booleanValue()) {
                            str2 = "Failed to create Adapter. " + e8.getMessage();
                        }
                        no.n(str2);
                    } catch (RemoteException e9) {
                        H2.p.e("", e9);
                    }
                }
                i8 = 5;
            }
            AbstractC2326ck0.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.FO
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f15141o.f(a8);
                    return null;
                }
            }, so.f18886i);
        } catch (JSONException e10) {
            AbstractC0608p0.l("Malformed CLD response", e10);
            so.f18892o.n("MalformedJson");
            so.f18889l.a("MalformedJson");
            so.f18882e.d(e10);
            C2.v.s().x(e10, "AdapterInitializer.updateAdapterStatus");
            RunnableC3791q90 runnableC3791q90 = so.f18893p;
            a8.c(e10);
            a8.I0(false);
            runnableC3791q90.b(a8.k());
        }
    }

    private final synchronized com.google.common.util.concurrent.d u() {
        String c8 = C2.v.s().j().g().c();
        if (!TextUtils.isEmpty(c8)) {
            return AbstractC2326ck0.h(c8);
        }
        final C1811Tq c1811Tq = new C1811Tq();
        C2.v.s().j().a0(new Runnable() { // from class: com.google.android.gms.internal.ads.GO
            @Override // java.lang.Runnable
            public final void run() {
                this.f15363o.o(c1811Tq);
            }
        });
        return c1811Tq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str, boolean z7, String str2, int i8) {
        this.f18891n.put(str, new C1455Jj(str, z7, i8, str2));
    }

    final /* synthetic */ Object f(InterfaceC2160b90 interfaceC2160b90) {
        this.f18882e.c(Boolean.TRUE);
        interfaceC2160b90.I0(true);
        this.f18893p.b(interfaceC2160b90.k());
        return null;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f18891n.keySet()) {
            C1455Jj c1455Jj = (C1455Jj) this.f18891n.get(str);
            arrayList.add(new C1455Jj(str, c1455Jj.f16294s, c1455Jj.f16295t, c1455Jj.f16296u));
        }
        return arrayList;
    }

    public final void l() {
        this.f18894q = false;
    }

    final /* synthetic */ void m() {
        synchronized (this) {
            try {
                if (this.f18880c) {
                    return;
                }
                v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (C2.v.c().b() - this.f18881d));
                this.f18889l.b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f18892o.m("com.google.android.gms.ads.MobileAds", "timeout");
                this.f18882e.d(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void n(String str, InterfaceC1594Nj interfaceC1594Nj, C3024j70 c3024j70, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    interfaceC1594Nj.c();
                    return;
                }
                Context context = (Context) this.f18884g.get();
                if (context == null) {
                    context = this.f18883f;
                }
                c3024j70.n(context, interfaceC1594Nj, list);
            } catch (RemoteException e8) {
                throw new zzfvl(e8);
            } catch (zzfcq unused) {
                interfaceC1594Nj.n("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e9) {
            H2.p.e("", e9);
        }
    }

    final /* synthetic */ void o(final C1811Tq c1811Tq) {
        this.f18886i.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.IO
            @Override // java.lang.Runnable
            public final void run() {
                String c8 = C2.v.s().j().g().c();
                boolean isEmpty = TextUtils.isEmpty(c8);
                C1811Tq c1811Tq2 = c1811Tq;
                if (isEmpty) {
                    c1811Tq2.d(new Exception());
                } else {
                    c1811Tq2.c(c8);
                }
            }
        });
    }

    final /* synthetic */ void p() {
        this.f18889l.e();
        this.f18892o.b();
        this.f18879b = true;
    }

    final /* synthetic */ void q(Object obj, C1811Tq c1811Tq, String str, long j8, InterfaceC2160b90 interfaceC2160b90) {
        synchronized (obj) {
            try {
                if (!c1811Tq.isDone()) {
                    v(str, false, "Timeout.", (int) (C2.v.c().b() - j8));
                    this.f18889l.b(str, "timeout");
                    this.f18892o.m(str, "timeout");
                    RunnableC3791q90 runnableC3791q90 = this.f18893p;
                    interfaceC2160b90.C("Timeout");
                    interfaceC2160b90.I0(false);
                    runnableC3791q90.b(interfaceC2160b90.k());
                    c1811Tq.c(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (!((Boolean) AbstractC3948rg.f26205a.e()).booleanValue()) {
            if (this.f18890m.f2916t >= ((Integer) D2.A.c().a(AbstractC3184kf.f23800V1)).intValue() && this.f18894q) {
                if (this.f18878a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f18878a) {
                            return;
                        }
                        this.f18889l.f();
                        this.f18892o.c();
                        this.f18882e.f(new Runnable() { // from class: com.google.android.gms.internal.ads.KO
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f16583o.p();
                            }
                        }, this.f18886i);
                        this.f18878a = true;
                        com.google.common.util.concurrent.d u7 = u();
                        this.f18888k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.DO
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f14484o.m();
                            }
                        }, ((Long) D2.A.c().a(AbstractC3184kf.f23816X1)).longValue(), TimeUnit.SECONDS);
                        AbstractC2326ck0.r(u7, new MO(this), this.f18886i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f18878a) {
            return;
        }
        v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f18882e.c(Boolean.FALSE);
        this.f18878a = true;
        this.f18879b = true;
    }

    public final void s(final InterfaceC1699Qj interfaceC1699Qj) {
        this.f18882e.f(new Runnable() { // from class: com.google.android.gms.internal.ads.HO
            @Override // java.lang.Runnable
            public final void run() {
                SO so = this.f15719o;
                try {
                    interfaceC1699Qj.u5(so.g());
                } catch (RemoteException e8) {
                    H2.p.e("", e8);
                }
            }
        }, this.f18887j);
    }

    public final boolean t() {
        return this.f18879b;
    }
}
