package F2;

import D2.InterfaceC0484a;
import G2.AbstractC0608p0;
import G2.D0;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC4180tn;
import com.google.android.gms.internal.ads.AbstractC2207bf;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC3187kg0;
import com.google.android.gms.internal.ads.C2548en;
import com.google.android.gms.internal.ads.C3712pT;
import com.google.android.gms.internal.ads.C3929rT;
import com.google.android.gms.internal.ads.C4558xC;
import com.google.android.gms.internal.ads.GN;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.HandlerC1968Yd0;
import com.google.android.gms.internal.ads.InterfaceC3418mn;
import com.google.android.gms.internal.ads.InterfaceC3912rG;
import com.google.android.gms.internal.ads.InterfaceC4410vt;
import com.google.android.gms.internal.ads.VS;
import com.google.android.gms.internal.ads.WS;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class x extends AbstractBinderC4180tn implements InterfaceC0576h {

    /* renamed from: N, reason: collision with root package name */
    static final int f2281N = Color.argb(0, 0, 0, 0);

    /* renamed from: B, reason: collision with root package name */
    q f2283B;

    /* renamed from: F, reason: collision with root package name */
    private Runnable f2287F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f2288G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f2289H;

    /* renamed from: L, reason: collision with root package name */
    private Toolbar f2293L;

    /* renamed from: o, reason: collision with root package name */
    protected final Activity f2295o;

    /* renamed from: s, reason: collision with root package name */
    AdOverlayInfoParcel f2296s;

    /* renamed from: t, reason: collision with root package name */
    InterfaceC4410vt f2297t;

    /* renamed from: u, reason: collision with root package name */
    r f2298u;

    /* renamed from: v, reason: collision with root package name */
    C f2299v;

    /* renamed from: x, reason: collision with root package name */
    FrameLayout f2301x;

    /* renamed from: y, reason: collision with root package name */
    WebChromeClient.CustomViewCallback f2302y;

    /* renamed from: w, reason: collision with root package name */
    boolean f2300w = false;

    /* renamed from: z, reason: collision with root package name */
    boolean f2303z = false;

    /* renamed from: A, reason: collision with root package name */
    boolean f2282A = false;

    /* renamed from: C, reason: collision with root package name */
    boolean f2284C = false;

    /* renamed from: M, reason: collision with root package name */
    int f2294M = 1;

    /* renamed from: D, reason: collision with root package name */
    private final Object f2285D = new Object();

    /* renamed from: E, reason: collision with root package name */
    private final View.OnClickListener f2286E = new o(this);

    /* renamed from: I, reason: collision with root package name */
    private boolean f2290I = false;

    /* renamed from: J, reason: collision with root package name */
    private boolean f2291J = false;

    /* renamed from: K, reason: collision with root package name */
    private boolean f2292K = true;

    public x(Activity activity) {
        this.f2295o = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A7(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f2296s
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            C2.l r0 = r0.f13075F
            if (r0 == 0) goto L10
            boolean r0 = r0.f788s
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.f2295o
            G2.b r4 = C2.v.u()
            boolean r6 = r4.d(r3, r6)
            boolean r3 = r5.f2282A
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f23759Q0
            com.google.android.gms.internal.ads.if r3 = D2.A.c()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L36
        L34:
            r1 = r2
            goto L57
        L36:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.bf r6 = com.google.android.gms.internal.ads.AbstractC3184kf.f23751P0
            com.google.android.gms.internal.ads.if r0 = D2.A.c()
            java.lang.Object r6 = r0.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f2296s
            if (r6 == 0) goto L57
            C2.l r6 = r6.f13075F
            if (r6 == 0) goto L57
            boolean r6 = r6.f793x
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r6 = r5.f2295o
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f23957n1
            com.google.android.gms.internal.ads.if r3 = D2.A.c()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r3)
            r6.clearFlags(r0)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r0)
            r6.clearFlags(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.x.A7(android.content.res.Configuration):void");
    }

    private static final void B7(C3929rT c3929rT, View view) {
        if (c3929rT == null || view == null) {
            return;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23880e5)).booleanValue() && c3929rT.b()) {
            return;
        }
        C2.v.b().c(c3929rT.a(), view);
    }

    private final void z7(View view) {
        C3929rT y7;
        C3712pT d02;
        InterfaceC4410vt interfaceC4410vt = this.f2297t;
        if (interfaceC4410vt == null) {
            return;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23889f5)).booleanValue() && (d02 = interfaceC4410vt.d0()) != null) {
            d02.a(view);
        } else if (((Boolean) D2.A.c().a(AbstractC3184kf.f23880e5)).booleanValue() && (y7 = interfaceC4410vt.y()) != null && y7.b()) {
            C2.v.b().d(y7.a(), view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void B() {
        this.f2289H = true;
    }

    public void C4(Bundle bundle) {
        if (!this.f2289H) {
            this.f2295o.requestWindowFeature(1);
        }
        this.f2303z = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel A02 = AdOverlayInfoParcel.A0(this.f2295o.getIntent());
            this.f2296s = A02;
            if (A02 == null) {
                throw new p("Could not get info for ad overlay.");
            }
            if (A02.f13083N) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f2295o.setShowWhenLocked(true);
                } else {
                    this.f2295o.getWindow().addFlags(524288);
                }
            }
            if (this.f2296s.f13073D.f2916t > 7500000) {
                this.f2294M = 4;
            }
            if (this.f2295o.getIntent() != null) {
                this.f2292K = this.f2295o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f2296s;
            C2.l lVar = adOverlayInfoParcel.f13075F;
            if (lVar != null) {
                boolean z7 = lVar.f787o;
                this.f2282A = z7;
                if (z7) {
                    if (adOverlayInfoParcel.f13071B != 5 && lVar.f792w != -1) {
                        new t(this, null).b();
                    }
                }
            } else if (adOverlayInfoParcel.f13071B == 5) {
                this.f2282A = true;
                if (adOverlayInfoParcel.f13071B != 5) {
                    new t(this, null).b();
                }
            } else {
                this.f2282A = false;
            }
            if (bundle == null) {
                if (this.f2292K) {
                    C4558xC c4558xC = this.f2296s.f13080K;
                    if (c4558xC != null) {
                        c4558xC.b();
                    }
                    z zVar = this.f2296s.f13087t;
                    if (zVar != null) {
                        zVar.r3();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2296s;
                if (adOverlayInfoParcel2.f13071B != 1) {
                    InterfaceC0484a interfaceC0484a = adOverlayInfoParcel2.f13086s;
                    if (interfaceC0484a != null) {
                        interfaceC0484a.I0();
                    }
                    InterfaceC3912rG interfaceC3912rG = this.f2296s.f13081L;
                    if (interfaceC3912rG != null) {
                        interfaceC3912rG.K0();
                    }
                }
            }
            Activity activity = this.f2295o;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f2296s;
            q qVar = new q(activity, adOverlayInfoParcel3.f13074E, adOverlayInfoParcel3.f13073D.f2914o, adOverlayInfoParcel3.f13079J);
            this.f2283B = qVar;
            qVar.setId(1000);
            C2.v.u().j(this.f2295o);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f2296s;
            int i8 = adOverlayInfoParcel4.f13071B;
            if (i8 == 1) {
                x7(false);
                return;
            }
            if (i8 == 2) {
                this.f2298u = new r(adOverlayInfoParcel4.f13088u);
                x7(false);
            } else if (i8 == 3) {
                x7(true);
            } else {
                if (i8 != 5) {
                    throw new p("Could not determine ad overlay type.");
                }
                x7(false);
            }
        } catch (p e8) {
            H2.p.g(e8.getMessage());
            this.f2294M = 4;
            this.f2295o.finish();
        }
    }

    public final void C7(WS ws) {
        InterfaceC3418mn interfaceC3418mn;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2296s;
        if (adOverlayInfoParcel == null || (interfaceC3418mn = adOverlayInfoParcel.f13082M) == null) {
            throw new p("noioou");
        }
        interfaceC3418mn.H0(BinderC5853b.p2(ws));
    }

    public final void D7(boolean z7) {
        if (this.f2296s.f13083N) {
            return;
        }
        int intValue = ((Integer) D2.A.c().a(AbstractC3184kf.f23803V4)).intValue();
        boolean z8 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23921j1)).booleanValue() || z7;
        B b8 = new B();
        b8.f2241d = 50;
        b8.f2238a = true != z8 ? 0 : intValue;
        b8.f2239b = true != z8 ? intValue : 0;
        b8.f2240c = intValue;
        this.f2299v = new C(this.f2295o, b8, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z8 ? 9 : 11);
        E7(z7, this.f2296s.f13091x);
        this.f2283B.addView(this.f2299v, layoutParams);
        z7(this.f2299v);
    }

    public final void E7(boolean z7, boolean z8) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C2.l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        C2.l lVar2;
        boolean z9 = true;
        boolean z10 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23903h1)).booleanValue() && (adOverlayInfoParcel2 = this.f2296s) != null && (lVar2 = adOverlayInfoParcel2.f13075F) != null && lVar2.f794y;
        boolean z11 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23912i1)).booleanValue() && (adOverlayInfoParcel = this.f2296s) != null && (lVar = adOverlayInfoParcel.f13075F) != null && lVar.f795z;
        if (z7 && z8 && z10 && !z11) {
            new C2548en(this.f2297t, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        C c8 = this.f2299v;
        if (c8 != null) {
            if (!z11 && (!z8 || z10)) {
                z9 = false;
            }
            c8.b(z9);
        }
    }

    public final void I() {
        this.f2283B.removeView(this.f2299v);
        D7(true);
    }

    protected final void M() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        z zVar;
        if (!this.f2295o.isFinishing() || this.f2290I) {
            return;
        }
        this.f2290I = true;
        InterfaceC4410vt interfaceC4410vt = this.f2297t;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.u0(this.f2294M - 1);
            synchronized (this.f2285D) {
                try {
                    if (!this.f2288G && this.f2297t.x0()) {
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23763Q4)).booleanValue() && !this.f2291J && (adOverlayInfoParcel = this.f2296s) != null && (zVar = adOverlayInfoParcel.f13087t) != null) {
                            zVar.q2();
                        }
                        Runnable runnable = new Runnable() { // from class: F2.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f2269o.a();
                            }
                        };
                        this.f2287F = runnable;
                        D0.f2566l.postDelayed(runnable, ((Long) D2.A.c().a(AbstractC3184kf.f23894g1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final boolean S() {
        this.f2294M = 1;
        if (this.f2297t == null) {
            return true;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue() && this.f2297t.canGoBack()) {
            this.f2297t.goBack();
            return false;
        }
        boolean o12 = this.f2297t.o1();
        if (!o12) {
            this.f2297t.D0("onbackblocked", Collections.emptyMap());
        }
        return o12;
    }

    final void a() {
        InterfaceC4410vt interfaceC4410vt;
        z zVar;
        if (this.f2291J) {
            return;
        }
        this.f2291J = true;
        InterfaceC4410vt interfaceC4410vt2 = this.f2297t;
        if (interfaceC4410vt2 != null) {
            this.f2283B.removeView(interfaceC4410vt2.M());
            r rVar = this.f2298u;
            if (rVar != null) {
                this.f2297t.k0(rVar.f2277d);
                this.f2297t.X0(false);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.Ac)).booleanValue() && this.f2297t.getParent() != null) {
                    ((ViewGroup) this.f2297t.getParent()).removeView(this.f2297t.M());
                }
                ViewGroup viewGroup = this.f2298u.f2276c;
                View M7 = this.f2297t.M();
                r rVar2 = this.f2298u;
                viewGroup.addView(M7, rVar2.f2274a, rVar2.f2275b);
                this.f2298u = null;
            } else if (this.f2295o.getApplicationContext() != null) {
                this.f2297t.k0(this.f2295o.getApplicationContext());
            }
            this.f2297t = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2296s;
        if (adOverlayInfoParcel != null && (zVar = adOverlayInfoParcel.f13087t) != null) {
            zVar.W4(this.f2294M);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2296s;
        if (adOverlayInfoParcel2 == null || (interfaceC4410vt = adOverlayInfoParcel2.f13088u) == null) {
            return;
        }
        B7(interfaceC4410vt.y(), this.f2296s.f13088u.M());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void a0(InterfaceC5852a interfaceC5852a) {
        A7((Configuration) BinderC5853b.J0(interfaceC5852a));
    }

    protected final void b() {
        this.f2297t.e0();
    }

    public final void d() {
        this.f2283B.f2273s = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void f() {
        this.f2294M = 1;
    }

    public final void g() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2296s;
        if (adOverlayInfoParcel != null && this.f2300w) {
            u7(adOverlayInfoParcel.f13070A);
        }
        if (this.f2301x != null) {
            this.f2295o.setContentView(this.f2283B);
            this.f2289H = true;
            this.f2301x.removeAllViews();
            this.f2301x = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f2302y;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f2302y = null;
        }
        this.f2300w = false;
    }

    @Override // F2.InterfaceC0576h
    public final void h() {
        this.f2294M = 2;
        this.f2295o.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void k() {
        InterfaceC4410vt interfaceC4410vt = this.f2297t;
        if (interfaceC4410vt != null) {
            try {
                this.f2283B.removeView(interfaceC4410vt.M());
            } catch (NullPointerException unused) {
            }
        }
        M();
    }

    public final void l() {
        if (this.f2284C) {
            this.f2284C = false;
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void l3(int i8, String[] strArr, int[] iArr) {
        if (i8 == 12345) {
            Activity activity = this.f2295o;
            VS e8 = WS.e();
            e8.a(activity);
            e8.b(this.f2296s.f13071B == 5 ? this : null);
            try {
                this.f2296s.f13082M.P5(strArr, iArr, BinderC5853b.p2(e8.e()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void o() {
        z zVar;
        g();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2296s;
        if (adOverlayInfoParcel != null && (zVar = adOverlayInfoParcel.f13087t) != null) {
            zVar.D0();
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23779S4)).booleanValue() && this.f2297t != null && (!this.f2295o.isFinishing() || this.f2298u == null)) {
            this.f2297t.onPause();
        }
        M();
    }

    public final void q0() {
        synchronized (this.f2285D) {
            try {
                this.f2288G = true;
                Runnable runnable = this.f2287F;
                if (runnable != null) {
                    HandlerC1968Yd0 handlerC1968Yd0 = D0.f2566l;
                    handlerC1968Yd0.removeCallbacks(runnable);
                    handlerC1968Yd0.post(this.f2287F);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void r() {
        z zVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2296s;
        if (adOverlayInfoParcel != null && (zVar = adOverlayInfoParcel.f13087t) != null) {
            zVar.I3();
        }
        A7(this.f2295o.getResources().getConfiguration());
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23779S4)).booleanValue()) {
            return;
        }
        InterfaceC4410vt interfaceC4410vt = this.f2297t;
        if (interfaceC4410vt == null || interfaceC4410vt.f0()) {
            H2.p.g("The webview does not exist. Ignoring action.");
        } else {
            this.f2297t.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void t() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23779S4)).booleanValue()) {
            InterfaceC4410vt interfaceC4410vt = this.f2297t;
            if (interfaceC4410vt == null || interfaceC4410vt.f0()) {
                H2.p.g("The webview does not exist. Ignoring action.");
            } else {
                this.f2297t.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void u() {
        z zVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2296s;
        if (adOverlayInfoParcel == null || (zVar = adOverlayInfoParcel.f13087t) == null) {
            return;
        }
        zVar.w0();
    }

    public final void u7(int i8) {
        if (this.f2295o.getApplicationInfo().targetSdkVersion >= ((Integer) D2.A.c().a(AbstractC3184kf.f23764Q5)).intValue()) {
            if (this.f2295o.getApplicationInfo().targetSdkVersion <= ((Integer) D2.A.c().a(AbstractC3184kf.f23772R5)).intValue()) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= ((Integer) D2.A.c().a(AbstractC3184kf.f23780S5)).intValue()) {
                    if (i9 <= ((Integer) D2.A.c().a(AbstractC3184kf.f23788T5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f2295o.setRequestedOrientation(i8);
        } catch (Throwable th) {
            C2.v.s().w(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void v7(boolean z7) {
        if (z7) {
            this.f2283B.setBackgroundColor(0);
        } else {
            this.f2283B.setBackgroundColor(-16777216);
        }
    }

    public final void w7(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f2295o);
        this.f2301x = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f2301x.addView(view, -1, -1);
        this.f2295o.setContentView(this.f2301x);
        this.f2289H = true;
        this.f2302y = customViewCallback;
        this.f2300w = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void x() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23779S4)).booleanValue() && this.f2297t != null && (!this.f2295o.isFinishing() || this.f2298u == null)) {
            this.f2297t.onPause();
        }
        M();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void x0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2303z);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void x7(boolean r27) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.x.x7(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void y2(int i8, int i9, Intent intent) {
        HN b8;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i8 == 236) {
            AbstractC2207bf abstractC2207bf = AbstractC3184kf.Wc;
            if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                AbstractC0608p0.k("Callback from intent launch with requestCode: 236 and resultCode: " + i9);
                InterfaceC4410vt interfaceC4410vt = this.f2297t;
                if (interfaceC4410vt == null || interfaceC4410vt.L() == null || (b8 = interfaceC4410vt.L().b()) == null || (adOverlayInfoParcel = this.f2296s) == null || !((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                    return;
                }
                GN a8 = b8.a();
                a8.b("action", "hilca");
                a8.b("gqi", AbstractC3187kg0.c(adOverlayInfoParcel.f13077H));
                StringBuilder sb = new StringBuilder();
                sb.append(i9);
                a8.b("hilr", sb.toString());
                if (i9 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        a8.b("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        a8.b("hills", stringExtra2);
                    }
                }
                a8.f();
            }
        }
    }

    public final void y7(String str) {
        Toolbar toolbar = this.f2293L;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public final void zzb() {
        this.f2294M = 3;
        this.f2295o.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2296s;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f13071B != 5) {
            return;
        }
        this.f2295o.overridePendingTransition(0, 0);
        InterfaceC4410vt interfaceC4410vt = this.f2297t;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.h0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void q() {
    }
}
