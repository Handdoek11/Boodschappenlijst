package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import q.C6397a;

/* loaded from: classes.dex */
public final class CI extends AbstractC1506Kz {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f14128G = 0;

    /* renamed from: A, reason: collision with root package name */
    private final H2.a f14129A;

    /* renamed from: B, reason: collision with root package name */
    private final Context f14130B;

    /* renamed from: C, reason: collision with root package name */
    private final EI f14131C;

    /* renamed from: D, reason: collision with root package name */
    private final C4369vX f14132D;

    /* renamed from: E, reason: collision with root package name */
    private final Map f14133E;

    /* renamed from: F, reason: collision with root package name */
    private final List f14134F;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f14135j;

    /* renamed from: k, reason: collision with root package name */
    private final HI f14136k;

    /* renamed from: l, reason: collision with root package name */
    private final PI f14137l;

    /* renamed from: m, reason: collision with root package name */
    private final C2940iJ f14138m;

    /* renamed from: n, reason: collision with root package name */
    private final MI f14139n;

    /* renamed from: o, reason: collision with root package name */
    private final SI f14140o;

    /* renamed from: p, reason: collision with root package name */
    private final Xx0 f14141p;

    /* renamed from: q, reason: collision with root package name */
    private final Xx0 f14142q;

    /* renamed from: r, reason: collision with root package name */
    private final Xx0 f14143r;

    /* renamed from: s, reason: collision with root package name */
    private final Xx0 f14144s;

    /* renamed from: t, reason: collision with root package name */
    private final Xx0 f14145t;

    /* renamed from: u, reason: collision with root package name */
    private HJ f14146u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f14147v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14148w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f14149x;

    /* renamed from: y, reason: collision with root package name */
    private final C1810Tp f14150y;

    /* renamed from: z, reason: collision with root package name */
    private final N9 f14151z;

    static {
        AbstractC4169th0.H("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public CI(C1471Jz c1471Jz, Executor executor, HI hi, PI pi, C2940iJ c2940iJ, MI mi, SI si, Xx0 xx0, Xx0 xx02, Xx0 xx03, Xx0 xx04, Xx0 xx05, C1810Tp c1810Tp, N9 n9, H2.a aVar, Context context, EI ei, C4369vX c4369vX, C1115Ab c1115Ab) {
        super(c1471Jz);
        this.f14135j = executor;
        this.f14136k = hi;
        this.f14137l = pi;
        this.f14138m = c2940iJ;
        this.f14139n = mi;
        this.f14140o = si;
        this.f14141p = xx0;
        this.f14142q = xx02;
        this.f14143r = xx03;
        this.f14144s = xx04;
        this.f14145t = xx05;
        this.f14150y = c1810Tp;
        this.f14151z = n9;
        this.f14129A = aVar;
        this.f14130B = context;
        this.f14131C = ei;
        this.f14132D = c4369vX;
        this.f14133E = new HashMap();
        this.f14134F = new ArrayList();
    }

    public static boolean H(View view) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.xa)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        C2.v.t();
        long c02 = G2.D0.c0(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (c02 >= ((Integer) D2.A.c().a(AbstractC3184kf.ya)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized ImageView.ScaleType K() {
        HJ hj = this.f14146u;
        if (hj == null) {
            H2.p.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        InterfaceC5852a h8 = hj.h();
        if (h8 != null) {
            return (ImageView.ScaleType) BinderC5853b.J0(h8);
        }
        return C2940iJ.f22943k;
    }

    private final void L(String str, boolean z7) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23943l5)).booleanValue()) {
            T("Google", true);
            return;
        }
        com.google.common.util.concurrent.d j02 = this.f14136k.j0();
        if (j02 == null) {
            return;
        }
        AbstractC2326ck0.r(j02, new C4788zI(this, "Google", true), this.f14135j);
    }

    private final synchronized void M(View view, Map map, Map map2) {
        this.f14138m.d(this.f14146u);
        this.f14137l.a(view, map, map2, K());
        this.f14148w = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(View view, C3929rT c3929rT) {
        InterfaceC4410vt e02 = this.f14136k.e0();
        if (!this.f14139n.d() || c3929rT == null || e02 == null || view == null) {
            return;
        }
        C2.v.b().c(c3929rT.a(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final synchronized void f0(HJ hj) {
        Iterator<String> keys;
        View view;
        H9 c8;
        try {
            if (!this.f14147v) {
                this.f14146u = hj;
                this.f14138m.e(hj);
                this.f14137l.d(hj.c(), hj.k(), hj.l(), hj, hj);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23713K2)).booleanValue() && (c8 = this.f14151z.c()) != null) {
                    c8.b(hj.c());
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23776S1)).booleanValue()) {
                    C3785q60 c3785q60 = this.f16710b;
                    if (c3785q60.f25799k0 && (keys = c3785q60.f25797j0.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            HJ hj2 = this.f14146u;
                            WeakReference weakReference = hj2 == null ? null : (WeakReference) hj2.j().get(next);
                            this.f14133E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC4810zb viewOnAttachStateChangeListenerC4810zb = new ViewOnAttachStateChangeListenerC4810zb(this.f14130B, view);
                                this.f14134F.add(viewOnAttachStateChangeListenerC4810zb);
                                viewOnAttachStateChangeListenerC4810zb.c(new C4679yI(this, next));
                            }
                        }
                    }
                }
                if (hj.f() != null) {
                    hj.f().c(this.f14150y);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void i(HJ hj) {
        this.f14137l.k(hj.c(), hj.j());
        if (hj.e() != null) {
            hj.e().setClickable(false);
            hj.e().removeAllViews();
        }
        if (hj.f() != null) {
            hj.f().e(this.f14150y);
        }
        this.f14146u = null;
    }

    public static /* synthetic */ void Y(CI ci) {
        try {
            HI hi = ci.f14136k;
            int P7 = hi.P();
            if (P7 == 1) {
                InterfaceC4604xh b8 = ci.f14140o.b();
                if (b8 != null) {
                    ci.L("Google", true);
                    b8.H6((InterfaceC3515nh) ci.f14141p.zzb());
                    return;
                }
                return;
            }
            if (P7 == 2) {
                InterfaceC4277uh a8 = ci.f14140o.a();
                if (a8 != null) {
                    ci.L("Google", true);
                    a8.C1((InterfaceC3297lh) ci.f14142q.zzb());
                    return;
                }
                return;
            }
            if (P7 == 3) {
                InterfaceC1271Eh d8 = ci.f14140o.d(hi.a());
                if (d8 != null) {
                    if (ci.f14136k.f0() != null) {
                        ci.T("Google", true);
                    }
                    d8.g4((InterfaceC3842qh) ci.f14145t.zzb());
                    return;
                }
                return;
            }
            if (P7 == 6) {
                InterfaceC1521Lh f8 = ci.f14140o.f();
                if (f8 != null) {
                    ci.L("Google", true);
                    f8.i4((InterfaceC1800Th) ci.f14143r.zzb());
                    return;
                }
                return;
            }
            if (P7 != 7) {
                H2.p.d("Wrong native template id!");
                return;
            }
            InterfaceC2651fk g8 = ci.f14140o.g();
            if (g8 != null) {
                g8.z1((InterfaceC2014Zj) ci.f14144s.zzb());
            }
        } catch (RemoteException e8) {
            H2.p.e("RemoteException when notifyAdLoad is called", e8);
        }
    }

    public final synchronized void A(InterfaceC1695Qh interfaceC1695Qh) {
        this.f14137l.p(interfaceC1695Qh);
    }

    public final synchronized void B(final HJ hj) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23760Q1)).booleanValue()) {
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.qI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25891o.f0(hj);
                }
            });
        } else {
            f0(hj);
        }
    }

    public final synchronized void C(final HJ hj) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23760Q1)).booleanValue()) {
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26152o.i(hj);
                }
            });
        } else {
            i(hj);
        }
    }

    public final boolean D() {
        return this.f14139n.e();
    }

    public final synchronized boolean E() {
        return this.f14137l.c0();
    }

    public final synchronized boolean F() {
        return this.f14137l.t();
    }

    public final boolean G() {
        return this.f14139n.d();
    }

    public final synchronized boolean I(Bundle bundle) {
        if (this.f14148w) {
            return true;
        }
        boolean c8 = this.f14137l.c(bundle);
        this.f14148w = c8;
        return c8;
    }

    public final synchronized int J() {
        return this.f14137l.zza();
    }

    public final EI Q() {
        return this.f14131C;
    }

    public final C3929rT T(String str, boolean z7) {
        String str2;
        EnumC3603oT enumC3603oT;
        EnumC3494nT enumC3494nT;
        if (this.f14139n.d() && !TextUtils.isEmpty(str)) {
            HI hi = this.f14136k;
            InterfaceC4410vt e02 = hi.e0();
            InterfaceC4410vt f02 = hi.f0();
            if (e02 == null && f02 == null) {
                H2.p.g("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z8 = false;
            boolean z9 = e02 != null;
            boolean z10 = f02 != null;
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23925j5)).booleanValue()) {
                this.f14139n.a();
                int c8 = this.f14139n.a().c();
                int i8 = c8 - 1;
                if (i8 != 0) {
                    if (i8 != 1) {
                        H2.p.g("Unknown omid media type: " + (c8 != 1 ? c8 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return null;
                    }
                    if (e02 == null) {
                        H2.p.g("Omid media type was display but there was no display webview.");
                        return null;
                    }
                    z10 = false;
                    z8 = true;
                } else {
                    if (f02 == null) {
                        H2.p.g("Omid media type was video but there was no video webview.");
                        return null;
                    }
                    z10 = true;
                }
            } else {
                z8 = z9;
            }
            if (z8) {
                str2 = null;
            } else {
                str2 = "javascript";
                e02 = f02;
            }
            if (e02 != null) {
                if (!C2.v.b().f(this.f14130B)) {
                    H2.p.g("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                H2.a aVar = this.f14129A;
                String str3 = aVar.f2915s + "." + aVar.f2916t;
                if (z10) {
                    enumC3494nT = EnumC3494nT.VIDEO;
                    enumC3603oT = EnumC3603oT.DEFINED_BY_JAVASCRIPT;
                } else {
                    HI hi2 = this.f14136k;
                    EnumC3494nT enumC3494nT2 = EnumC3494nT.NATIVE_DISPLAY;
                    enumC3603oT = hi2.P() == 3 ? EnumC3603oT.UNSPECIFIED : EnumC3603oT.ONE_PIXEL;
                    enumC3494nT = enumC3494nT2;
                }
                C3929rT g8 = C2.v.b().g(str3, e02.A(), "", "javascript", str2, str, enumC3603oT, enumC3494nT, this.f16710b.f25801l0);
                if (g8 == null) {
                    H2.p.g("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                this.f14136k.w(g8);
                e02.n1(g8);
                if (z10) {
                    AbstractC1927Xa0 a8 = g8.a();
                    if (f02 != null) {
                        C2.v.b().c(a8, f02.M());
                    }
                    this.f14149x = true;
                }
                if (z7) {
                    C2.v.b().e(g8.a());
                    e02.D0("onSdkLoaded", new C6397a());
                }
                return g8;
            }
            H2.p.g("Webview is null in InternalNativeAd");
        }
        return null;
    }

    public final String U() {
        return this.f14139n.b();
    }

    public final synchronized JSONObject W(View view, Map map, Map map2) {
        return this.f14137l.r(view, map, map2, K());
    }

    public final synchronized JSONObject X(View view, Map map, Map map2) {
        return this.f14137l.u(view, map, map2, K());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1506Kz
    public final synchronized void a() {
        this.f14147v = true;
        this.f14135j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wI
            @Override // java.lang.Runnable
            public final void run() {
                this.f27477o.c0();
            }
        });
        super.a();
    }

    public final void a0(View view) {
        C3929rT h02 = this.f14136k.h0();
        if (!this.f14139n.d() || h02 == null || view == null) {
            return;
        }
        C2.v.b().d(h02.a(), view);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1506Kz
    public final void b() {
        this.f14135j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sI
            @Override // java.lang.Runnable
            public final void run() {
                CI.Y(this.f26621o);
            }
        });
        if (this.f14136k.P() != 7) {
            Executor executor = this.f14135j;
            final PI pi = this.f14137l;
            Objects.requireNonNull(pi);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tI
                @Override // java.lang.Runnable
                public final void run() {
                    pi.q();
                }
            });
        }
        super.b();
    }

    public final synchronized void b0() {
        this.f14137l.f();
    }

    final /* synthetic */ void c0() {
        this.f14137l.h();
        this.f14136k.i();
    }

    final /* synthetic */ void d0(View view, boolean z7, int i8) {
        HJ hj = this.f14146u;
        if (hj == null) {
            H2.p.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        } else {
            this.f14137l.o(view, hj.c(), this.f14146u.j(), this.f14146u.k(), z7, K(), i8);
        }
    }

    final /* synthetic */ void e0(boolean z7) {
        HJ hj = this.f14146u;
        if (hj == null) {
            H2.p.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f14137l.o(null, hj.c(), this.f14146u.j(), this.f14146u.k(), z7, K(), 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void j(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f14148w     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L7
            goto L89
        L7:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f23776S1     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.if r1 = D2.A.c()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.q60 r0 = r3.f16710b     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.f25799k0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            java.util.Map r0 = r3.f14133E     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L44
            java.util.Map r2 = r3.f14133E     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L29
            goto L89
        L44:
            r4 = move-exception
            goto L90
        L46:
            if (r7 != 0) goto L8b
            com.google.android.gms.internal.ads.bf r7 = com.google.android.gms.internal.ads.AbstractC3184kf.f23818X3     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.if r0 = D2.A.c()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = r0.a(r7)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L44
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L89
            if (r5 == 0) goto L89
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L44
        L64:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L89
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L44
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L44
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L44
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            boolean r0 = H(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            r3.M(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L89:
            monitor-exit(r3)
            return
        L8b:
            r3.M(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L90:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CI.j(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void k(D2.D0 d02) {
        this.f14137l.j(d02);
    }

    public final synchronized void l(View view, View view2, Map map, Map map2, boolean z7) {
        InterfaceC4410vt f02;
        this.f14138m.c(this.f14146u);
        this.f14137l.g(view, view2, map, map2, z7, K());
        if (this.f14149x) {
            HI hi = this.f14136k;
            if (hi.f0() != null && (f02 = hi.f0()) != null) {
                f02.D0("onSdkAdUserInteractionClick", new C6397a());
            }
        }
    }

    public final synchronized void m(final View view, final int i8) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.tb)).booleanValue()) {
            HJ hj = this.f14146u;
            if (hj == null) {
                H2.p.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z7 = hj instanceof ViewTreeObserverOnGlobalLayoutListenerC2179bJ;
                this.f14135j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vI
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27226o.d0(view, z7, i8);
                    }
                });
            }
        }
    }

    public final synchronized void n(String str) {
        this.f14137l.r0(str);
    }

    public final synchronized void o(Bundle bundle) {
        this.f14137l.i(bundle);
    }

    public final synchronized void p() {
        HJ hj = this.f14146u;
        if (hj == null) {
            H2.p.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z7 = hj instanceof ViewTreeObserverOnGlobalLayoutListenerC2179bJ;
            this.f14135j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27817o.e0(z7);
                }
            });
        }
    }

    public final void q(Bundle bundle) {
        final InterfaceC4410vt f02 = this.f14136k.f0();
        if (f02 == null) {
            H2.p.d("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.f14135j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uI
                @Override // java.lang.Runnable
                public final void run() {
                    int i8 = CI.f14128G;
                    f02.p("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e8) {
            H2.p.e("Error reading event signals", e8);
        }
    }

    public final synchronized void s() {
        if (this.f14148w) {
            return;
        }
        this.f14137l.s();
    }

    public final void t(View view) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23943l5)).booleanValue()) {
            HI hi = this.f14136k;
            if (hi.P() != 3) {
                C1811Tq c02 = hi.c0();
                if (c02 == null) {
                    return;
                }
                AbstractC2326ck0.r(c02, new AI(this, view), this.f14135j);
                return;
            }
        }
        N(view, this.f14136k.h0());
    }

    public final synchronized void u(View view, MotionEvent motionEvent, View view2) {
        this.f14137l.n(view, motionEvent, view2);
    }

    public final synchronized void v(Bundle bundle) {
        this.f14137l.l(bundle);
    }

    public final synchronized void w(View view) {
        this.f14137l.b(view);
    }

    public final synchronized void x() {
        this.f14137l.w();
    }

    public final synchronized void y(D2.A0 a02) {
        this.f14137l.m(a02);
    }

    public final synchronized void z(D2.N0 n02) {
        this.f14132D.a(n02);
    }
}
