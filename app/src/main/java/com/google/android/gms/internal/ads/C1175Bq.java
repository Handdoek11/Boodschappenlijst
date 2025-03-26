package com.google.android.gms.internal.ads;

import D2.C0555y;
import G2.AbstractC0608p0;
import G2.C0617u0;
import G2.InterfaceC0611r0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.zzr;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Bq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175Bq {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13891a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final C0617u0 f13892b;

    /* renamed from: c, reason: collision with root package name */
    private final C1283Eq f13893c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13894d;

    /* renamed from: e, reason: collision with root package name */
    private Context f13895e;

    /* renamed from: f, reason: collision with root package name */
    private H2.a f13896f;

    /* renamed from: g, reason: collision with root package name */
    private String f13897g;

    /* renamed from: h, reason: collision with root package name */
    private C3729pf f13898h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f13899i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f13900j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f13901k;

    /* renamed from: l, reason: collision with root package name */
    private final C4840zq f13902l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f13903m;

    /* renamed from: n, reason: collision with root package name */
    private com.google.common.util.concurrent.d f13904n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f13905o;

    public C1175Bq() {
        C0617u0 c0617u0 = new C0617u0();
        this.f13892b = c0617u0;
        this.f13893c = new C1283Eq(C0555y.d(), c0617u0);
        this.f13894d = false;
        this.f13898h = null;
        this.f13899i = null;
        this.f13900j = new AtomicInteger(0);
        this.f13901k = new AtomicInteger(0);
        this.f13902l = new C4840zq(null);
        this.f13903m = new Object();
        this.f13905o = new AtomicBoolean();
    }

    public final void A(String str) {
        this.f13897g = str;
    }

    public final boolean a(Context context) {
        if (f3.m.i()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.n8)).booleanValue()) {
                return this.f13905o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final int b() {
        return this.f13901k.get();
    }

    public final int c() {
        return this.f13900j.get();
    }

    public final Context e() {
        return this.f13895e;
    }

    public final Resources f() {
        if (this.f13896f.f2917u) {
            return this.f13895e.getResources();
        }
        try {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Ma)).booleanValue()) {
                return H2.s.a(this.f13895e).getResources();
            }
            H2.s.a(this.f13895e).getResources();
            return null;
        } catch (zzr e8) {
            H2.p.h("Cannot load resource from dynamite apk or local jar", e8);
            return null;
        }
    }

    public final C3729pf h() {
        C3729pf c3729pf;
        synchronized (this.f13891a) {
            c3729pf = this.f13898h;
        }
        return c3729pf;
    }

    public final C1283Eq i() {
        return this.f13893c;
    }

    public final InterfaceC0611r0 j() {
        C0617u0 c0617u0;
        synchronized (this.f13891a) {
            c0617u0 = this.f13892b;
        }
        return c0617u0;
    }

    public final com.google.common.util.concurrent.d l() {
        if (this.f13895e != null) {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23809W2)).booleanValue()) {
                synchronized (this.f13903m) {
                    try {
                        com.google.common.util.concurrent.d dVar = this.f13904n;
                        if (dVar != null) {
                            return dVar;
                        }
                        com.google.common.util.concurrent.d p02 = AbstractC1497Kq.f16644a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.wq
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f27557o.p();
                            }
                        });
                        this.f13904n = p02;
                        return p02;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return AbstractC2326ck0.h(new ArrayList());
    }

    public final Boolean m() {
        Boolean bool;
        synchronized (this.f13891a) {
            bool = this.f13899i;
        }
        return bool;
    }

    public final String o() {
        return this.f13897g;
    }

    final /* synthetic */ ArrayList p() {
        Context a8 = AbstractC1389Ho.a(this.f13895e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f8 = h3.e.a(a8).f(a8.getApplicationInfo().packageName, 4096);
            if (f8.requestedPermissions != null && f8.requestedPermissionsFlags != null) {
                int i8 = 0;
                while (true) {
                    String[] strArr = f8.requestedPermissions;
                    if (i8 >= strArr.length) {
                        break;
                    }
                    if ((f8.requestedPermissionsFlags[i8] & 2) != 0) {
                        arrayList.add(strArr[i8]);
                    }
                    i8++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void r() {
        this.f13902l.a();
    }

    public final void s() {
        this.f13900j.decrementAndGet();
    }

    public final void t() {
        this.f13901k.incrementAndGet();
    }

    public final void u() {
        this.f13900j.incrementAndGet();
    }

    public final void v(Context context, H2.a aVar) {
        C3729pf c3729pf;
        synchronized (this.f13891a) {
            try {
                if (!this.f13894d) {
                    this.f13895e = context.getApplicationContext();
                    this.f13896f = aVar;
                    C2.v.e().c(this.f13893c);
                    this.f13892b.X(this.f13895e);
                    C1773Sn.d(this.f13895e, this.f13896f);
                    C2.v.h();
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23886f2)).booleanValue()) {
                        c3729pf = new C3729pf();
                    } else {
                        AbstractC0608p0.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c3729pf = null;
                    }
                    this.f13898h = c3729pf;
                    if (c3729pf != null) {
                        AbstractC1601Nq.a(new C4622xq(this).b(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f13895e;
                    if (f3.m.i()) {
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.n8)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new C4731yq(this));
                            } catch (RuntimeException e8) {
                                H2.p.h("Failed to register network callback", e8);
                                this.f13905o.set(true);
                            }
                        }
                    }
                    this.f13894d = true;
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2.v.t().H(context, aVar.f2914o);
    }

    public final void w(Throwable th, String str) {
        C1773Sn.d(this.f13895e, this.f13896f).b(th, str, ((Double) AbstractC4275ug.f27090g.e()).floatValue());
    }

    public final void x(Throwable th, String str) {
        C1773Sn.d(this.f13895e, this.f13896f).a(th, str);
    }

    public final void y(Throwable th, String str) {
        C1773Sn.f(this.f13895e, this.f13896f).a(th, str);
    }

    public final void z(Boolean bool) {
        synchronized (this.f13891a) {
            this.f13899i = bool;
        }
    }
}
