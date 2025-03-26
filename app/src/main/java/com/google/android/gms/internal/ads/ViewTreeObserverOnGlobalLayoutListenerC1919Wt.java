package com.google.android.gms.internal.ads;

import D2.C0555y;
import G2.AbstractC0590g0;
import G2.AbstractC0608p0;
import G2.C0581c;
import G2.C0596j0;
import G2.C0604n0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adadapted.android.sdk.constants.EventStrings;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.HandlerC1968Yd0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import q1.AbstractC6418e;
import q1.AbstractC6419f;

/* renamed from: com.google.android.gms.internal.ads.Wt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC1919Wt extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC4410vt {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f19855s0 = 0;

    /* renamed from: A, reason: collision with root package name */
    private C3785q60 f19856A;

    /* renamed from: B, reason: collision with root package name */
    private C4111t60 f19857B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f19858C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f19859D;

    /* renamed from: E, reason: collision with root package name */
    private AbstractC1358Gt f19860E;

    /* renamed from: F, reason: collision with root package name */
    private F2.x f19861F;

    /* renamed from: G, reason: collision with root package name */
    private C3929rT f19862G;

    /* renamed from: H, reason: collision with root package name */
    private C3712pT f19863H;

    /* renamed from: I, reason: collision with root package name */
    private C3976ru f19864I;

    /* renamed from: J, reason: collision with root package name */
    private final String f19865J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f19866K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f19867L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f19868M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f19869N;

    /* renamed from: O, reason: collision with root package name */
    private Boolean f19870O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f19871P;

    /* renamed from: Q, reason: collision with root package name */
    private final String f19872Q;

    /* renamed from: R, reason: collision with root package name */
    private BinderC2024Zt f19873R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f19874S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f19875T;

    /* renamed from: U, reason: collision with root package name */
    private InterfaceC1519Lg f19876U;

    /* renamed from: V, reason: collision with root package name */
    private InterfaceC1449Jg f19877V;

    /* renamed from: W, reason: collision with root package name */
    private InterfaceC3178kc f19878W;

    /* renamed from: a0, reason: collision with root package name */
    private int f19879a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f19880b0;

    /* renamed from: c0, reason: collision with root package name */
    private C4491wf f19881c0;

    /* renamed from: d0, reason: collision with root package name */
    private final C4491wf f19882d0;

    /* renamed from: e0, reason: collision with root package name */
    private C4491wf f19883e0;

    /* renamed from: f0, reason: collision with root package name */
    private final C4600xf f19884f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f19885g0;

    /* renamed from: h0, reason: collision with root package name */
    private F2.x f19886h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f19887i0;

    /* renamed from: j0, reason: collision with root package name */
    private final C0604n0 f19888j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f19889k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f19890l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f19891m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f19892n0;

    /* renamed from: o, reason: collision with root package name */
    private final C3868qu f19893o;

    /* renamed from: o0, reason: collision with root package name */
    private Map f19894o0;

    /* renamed from: p0, reason: collision with root package name */
    private final WindowManager f19895p0;

    /* renamed from: q0, reason: collision with root package name */
    private final C2000Zc f19896q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f19897r0;

    /* renamed from: s, reason: collision with root package name */
    private final N9 f19898s;

    /* renamed from: t, reason: collision with root package name */
    private final P60 f19899t;

    /* renamed from: u, reason: collision with root package name */
    private final C1726Rf f19900u;

    /* renamed from: v, reason: collision with root package name */
    private final H2.a f19901v;

    /* renamed from: w, reason: collision with root package name */
    private C2.n f19902w;

    /* renamed from: x, reason: collision with root package name */
    private final C2.a f19903x;

    /* renamed from: y, reason: collision with root package name */
    private final DisplayMetrics f19904y;

    /* renamed from: z, reason: collision with root package name */
    private final float f19905z;

    protected ViewTreeObserverOnGlobalLayoutListenerC1919Wt(C3868qu c3868qu, C3976ru c3976ru, String str, boolean z7, boolean z8, N9 n9, C1726Rf c1726Rf, H2.a aVar, C4818zf c4818zf, C2.n nVar, C2.a aVar2, C2000Zc c2000Zc, C3785q60 c3785q60, C4111t60 c4111t60, P60 p60) {
        C4111t60 c4111t602;
        super(c3868qu);
        this.f19858C = false;
        this.f19859D = false;
        this.f19871P = true;
        this.f19872Q = "";
        this.f19889k0 = -1;
        this.f19890l0 = -1;
        this.f19891m0 = -1;
        this.f19892n0 = -1;
        this.f19893o = c3868qu;
        this.f19864I = c3976ru;
        this.f19865J = str;
        this.f19868M = z7;
        this.f19898s = n9;
        this.f19899t = p60;
        this.f19900u = c1726Rf;
        this.f19901v = aVar;
        this.f19902w = nVar;
        this.f19903x = aVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f19895p0 = windowManager;
        C2.v.t();
        DisplayMetrics Z7 = G2.D0.Z(windowManager);
        this.f19904y = Z7;
        this.f19905z = Z7.density;
        this.f19896q0 = c2000Zc;
        this.f19856A = c3785q60;
        this.f19857B = c4111t60;
        this.f19888j0 = new C0604n0(c3868qu.a(), this, this, null);
        this.f19897r0 = false;
        setBackgroundColor(0);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.wb)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e8) {
            H2.p.e("Unable to enable Javascript.", e8);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.vb)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(C2.v.t().H(c3868qu, aVar.f2914o));
        C2.v.t();
        final Context context = getContext();
        AbstractC0590g0.a(context, new Callable() { // from class: G2.v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HandlerC1968Yd0 handlerC1968Yd0 = D0.f2566l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23799V0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        C1();
        addJavascriptInterface(new C2453du(this, new C2345cu(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        K1();
        C4600xf c4600xf = new C4600xf(new C4818zf(true, "make_wv", this.f19865J));
        this.f19884f0 = c4600xf;
        c4600xf.a().c(null);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue() && (c4111t602 = this.f19857B) != null && c4111t602.f26832b != null) {
            c4600xf.a().d("gqi", this.f19857B.f26832b);
        }
        c4600xf.a();
        C4491wf f8 = C4818zf.f();
        this.f19882d0 = f8;
        c4600xf.b("native:view_create", f8);
        this.f19883e0 = null;
        this.f19881c0 = null;
        C0596j0.a().b(c3868qu);
        C2.v.s().u();
    }

    private final synchronized void C1() {
        C3785q60 c3785q60 = this.f19856A;
        if (c3785q60 != null && c3785q60.f25803m0) {
            H2.p.b("Disabling hardware acceleration on an overlay.");
            E1();
            return;
        }
        if (!this.f19868M && !this.f19864I.i()) {
            H2.p.b("Enabling hardware acceleration on an AdView.");
            G1();
            return;
        }
        H2.p.b("Enabling hardware acceleration on an overlay.");
        G1();
    }

    private final synchronized void D1() {
        if (this.f19887i0) {
            return;
        }
        this.f19887i0 = true;
        C2.v.s().s();
    }

    private final synchronized void E1() {
        try {
            if (!this.f19869N) {
                setLayerType(1, null);
            }
            this.f19869N = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void F1(boolean z7) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z7 ? "0" : "1");
        D0("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void G1() {
        try {
            if (this.f19869N) {
                setLayerType(0, null);
            }
            this.f19869N = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void H1(String str) {
        final String str2 = "about:blank";
        try {
            G2.D0.f2566l.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.Rt

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ String f18714s = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18713o.y1(this.f18714s);
                }
            });
        } catch (Throwable th) {
            C2.v.s().x(th, "AdWebViewImpl.loadUrlUnsafe");
            H2.p.h("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void I1() {
        AbstractC3946rf.a(this.f19884f0.a(), this.f19882d0, "aeh2");
    }

    private final synchronized void J1() {
        try {
            Map map = this.f19894o0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC1141As) it.next()).d();
                }
            }
            this.f19894o0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void K1() {
        C4600xf c4600xf = this.f19884f0;
        if (c4600xf == null) {
            return;
        }
        C4818zf a8 = c4600xf.a();
        C3729pf h8 = C2.v.s().h();
        if (h8 != null) {
            h8.f(a8);
        }
    }

    private final synchronized void L1() {
        Boolean m8 = C2.v.s().m();
        this.f19870O = m8;
        if (m8 == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                A1(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                A1(Boolean.FALSE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final WebView A() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final void A0(C4592xb c4592xb) {
        boolean z7;
        synchronized (this) {
            z7 = c4592xb.f27883j;
            this.f19874S = z7;
        }
        F1(z7);
    }

    final void A1(Boolean bool) {
        synchronized (this) {
            this.f19870O = bool;
        }
        C2.v.s().z(bool);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final synchronized void B(BinderC2024Zt binderC2024Zt) {
        if (this.f19873R != null) {
            H2.p.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f19873R = binderC2024Zt;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void B0(InterfaceC3178kc interfaceC3178kc) {
        this.f19878W = interfaceC3178kc;
    }

    public final boolean B1() {
        int i8;
        int i9;
        if (this.f19860E.V() || this.f19860E.p()) {
            C0555y.b();
            DisplayMetrics displayMetrics = this.f19904y;
            int z7 = H2.g.z(displayMetrics, displayMetrics.widthPixels);
            C0555y.b();
            DisplayMetrics displayMetrics2 = this.f19904y;
            int z8 = H2.g.z(displayMetrics2, displayMetrics2.heightPixels);
            Activity a8 = this.f19893o.a();
            if (a8 == null || a8.getWindow() == null) {
                i8 = z7;
                i9 = z8;
            } else {
                C2.v.t();
                int[] q8 = G2.D0.q(a8);
                C0555y.b();
                int z9 = H2.g.z(this.f19904y, q8[0]);
                C0555y.b();
                i9 = H2.g.z(this.f19904y, q8[1]);
                i8 = z9;
            }
            int i10 = this.f19890l0;
            if (i10 != z7 || this.f19889k0 != z8 || this.f19891m0 != i8 || this.f19892n0 != i9) {
                boolean z10 = (i10 == z7 && this.f19889k0 == z8) ? false : true;
                this.f19890l0 = z7;
                this.f19889k0 = z8;
                this.f19891m0 = i8;
                this.f19892n0 = i9;
                new C2548en(this, "").e(z7, z8, i8, i9, this.f19904y.density, this.f19895p0.getDefaultDisplay().getRotation());
                return z10;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void C(boolean z7, int i8, boolean z8) {
        this.f19860E.V0(z7, i8, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void D() {
        AbstractC0608p0.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2869hk
    public final void D0(String str, Map map) {
        try {
            p(str, C0555y.b().n(map));
        } catch (JSONException unused) {
            H2.p.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final List E0() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3214ku
    public final N9 F() {
        return this.f19898s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void F0() {
        I1();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f19901v.f2914o);
        D0("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized InterfaceC3178kc G() {
        return this.f19878W;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void G0(String str, InterfaceC1662Pi interfaceC1662Pi) {
        AbstractC1358Gt abstractC1358Gt = this.f19860E;
        if (abstractC1358Gt != null) {
            abstractC1358Gt.i(str, interfaceC1662Pi);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3105ju
    public final synchronized C3976ru H() {
        return this.f19864I;
    }

    @Override // D2.InterfaceC0484a
    public final void I0() {
        AbstractC1358Gt abstractC1358Gt = this.f19860E;
        if (abstractC1358Gt != null) {
            abstractC1358Gt.I0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized F2.x J() {
        return this.f19886h0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void J0(boolean z7) {
        if (z7) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        F2.x xVar = this.f19861F;
        if (xVar != null) {
            xVar.v7(z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void K() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void K0() {
        AbstractC1358Gt abstractC1358Gt = this.f19860E;
        if (abstractC1358Gt != null) {
            abstractC1358Gt.K0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final /* synthetic */ InterfaceC3759pu L() {
        return this.f19860E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3432mu
    public final View M() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final P60 N0() {
        return this.f19899t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized F2.x O() {
        return this.f19861F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3430mt
    public final C3785q60 P() {
        return this.f19856A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void P0(boolean z7) {
        this.f19860E.e(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void Q0(InterfaceC1519Lg interfaceC1519Lg) {
        this.f19876U = interfaceC1519Lg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized InterfaceC1519Lg R() {
        return this.f19876U;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void R0(C3712pT c3712pT) {
        this.f19863H = c3712pT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final WebViewClient S() {
        return this.f19860E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void S0(String str, String str2, String str3) {
        String str4;
        try {
            if (f0()) {
                H2.p.g("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            String str5 = (String) D2.A.c().a(AbstractC3184kf.f23848b0);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put(EventStrings.SDK_EVENT_TYPE, "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e8) {
                H2.p.h("Unable to build MRAID_ENV", e8);
                str4 = null;
            }
            super.loadDataWithBaseURL(str, AbstractC2996iu.b(str2, str4), "text/html", "UTF-8", null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final synchronized void T(int i8) {
        this.f19885g0 = i8;
    }

    @Override // C2.n
    public final synchronized void T0() {
        C2.n nVar = this.f19902w;
        if (nVar != null) {
            nVar.T0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void U() {
        this.f19888j0.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized boolean U0() {
        return this.f19866K;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final com.google.common.util.concurrent.d V() {
        C1726Rf c1726Rf = this.f19900u;
        return c1726Rf == null ? AbstractC2326ck0.h(null) : c1726Rf.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void V0(F2.l lVar, boolean z7, boolean z8, String str) {
        this.f19860E.P0(lVar, z7, z8, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final synchronized void W(String str, AbstractC1141As abstractC1141As) {
        try {
            if (this.f19894o0 == null) {
                this.f19894o0 = new HashMap();
            }
            this.f19894o0.put(str, abstractC1141As);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void W0(String str, String str2, int i8) {
        this.f19860E.T0(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void X() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C2.v.v().e()));
        hashMap.put("app_volume", String.valueOf(C2.v.v().a()));
        hashMap.put("device_volume", String.valueOf(C0581c.b(getContext())));
        D0("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void X0(boolean z7) {
        try {
            boolean z8 = this.f19868M;
            this.f19868M = z7;
            C1();
            if (z7 != z8) {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23857c0)).booleanValue()) {
                    if (!this.f19864I.i()) {
                    }
                }
                new C2548en(this, "").g(true != z7 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void Y() {
        AbstractC0608p0.k("Destroying WebView!");
        D1();
        G2.D0.f2566l.post(new RunnableC1884Vt(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void Z(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void Z0(String str, InterfaceC1662Pi interfaceC1662Pi) {
        AbstractC1358Gt abstractC1358Gt = this.f19860E;
        if (abstractC1358Gt != null) {
            abstractC1358Gt.c(str, interfaceC1662Pi);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void a0(boolean z7) {
        this.f19871P = z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean a1(final boolean z7, final int i8) {
        destroy();
        this.f19896q0.b(new InterfaceC1965Yc() { // from class: com.google.android.gms.internal.ads.St
            @Override // com.google.android.gms.internal.ads.InterfaceC1965Yc
            public final void a(C1409Ie c1409Ie) {
                int i9 = ViewTreeObserverOnGlobalLayoutListenerC1919Wt.f19855s0;
                C3618oe d02 = C3727pe.d0();
                boolean E7 = d02.E();
                boolean z8 = z7;
                if (E7 != z8) {
                    d02.C(z8);
                }
                d02.D(i8);
                c1409Ie.H((C3727pe) d02.x());
            }
        });
        this.f19896q0.c(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final synchronized int c() {
        return this.f19885g0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void c0(int i8) {
        F2.x xVar = this.f19861F;
        if (xVar != null) {
            xVar.u7(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized C3712pT d0() {
        return this.f19863H;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void destroy() {
        try {
            K1();
            this.f19888j0.a();
            F2.x xVar = this.f19861F;
            if (xVar != null) {
                xVar.zzb();
                this.f19861F.k();
                this.f19861F = null;
            }
            this.f19862G = null;
            this.f19863H = null;
            this.f19860E.w0();
            this.f19878W = null;
            this.f19902w = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f19867L) {
                return;
            }
            C2.v.C().e(this);
            J1();
            this.f19867L = true;
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.Ga)).booleanValue()) {
                AbstractC0608p0.k("Destroying the WebView immediately...");
                Y();
                return;
            }
            Activity a8 = this.f19893o.a();
            if (a8 != null && a8.isDestroyed()) {
                AbstractC0608p0.k("Destroying the WebView immediately...");
                Y();
            } else {
                AbstractC0608p0.k("Initiating WebView self destruct sequence in 3...");
                AbstractC0608p0.k("Loading blank page in WebView, 2...");
                H1("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final int e() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void e0() {
        if (this.f19881c0 == null) {
            C4600xf c4600xf = this.f19884f0;
            AbstractC3946rf.a(c4600xf.a(), this.f19882d0, "aes2");
            this.f19884f0.a();
            C4491wf f8 = C4818zf.f();
            this.f19881c0 = f8;
            this.f19884f0.b("native:view_show", f8);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f19901v.f2914o);
        D0("onshow", hashMap);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (f0()) {
            H2.p.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Ha)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            AbstractC1497Kq.f16649f.k(new Runnable() { // from class: com.google.android.gms.internal.ads.Qt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18559o.w1(str, valueCallback);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC2562eu, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final Activity f() {
        return this.f19893o.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized boolean f0() {
        return this.f19867L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void f1(int i8) {
    }

    protected final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.f19867L) {
                        this.f19860E.w0();
                        C2.v.C().e(this);
                        J1();
                        D1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final int g() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void g0(boolean z7) {
        this.f19860E.A0(z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final boolean g1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final C2.a h() {
        return this.f19903x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void h0(F2.x xVar) {
        this.f19861F = xVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void h1(boolean z7) {
        F2.x xVar;
        int i8 = this.f19879a0 + (true != z7 ? -1 : 1);
        this.f19879a0 = i8;
        if (i8 > 0 || (xVar = this.f19861F) == null) {
            return;
        }
        xVar.q0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final C4491wf i() {
        return this.f19882d0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void i1(C3976ru c3976ru) {
        this.f19864I = c3976ru;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void j0(boolean z7) {
        this.f19897r0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void j1(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final C4600xf k() {
        return this.f19884f0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void k0(Context context) {
        this.f19893o.setBaseContext(context);
        this.f19888j0.e(this.f19893o.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void k1(boolean z7) {
        F2.x xVar = this.f19861F;
        if (xVar != null) {
            xVar.E7(this.f19860E.V(), z7);
        } else {
            this.f19866K = z7;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC3323lu, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final H2.a l() {
        return this.f19901v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void l0(C3785q60 c3785q60, C4111t60 c4111t60) {
        this.f19856A = c3785q60;
        this.f19857B = c4111t60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void l1(boolean z7, long j8) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z7 ? "0" : "1");
        hashMap.put("duration", Long.toString(j8));
        D0("onCacheAccessComplete", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void loadData(String str, String str2, String str3) {
        if (f0()) {
            H2.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (f0()) {
            H2.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void loadUrl(final String str) {
        if (f0()) {
            H2.p.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Tt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19193o.x1(str);
                }
            });
        } catch (Throwable th) {
            C2.v.s().x(th, "AdWebViewImpl.loadUrl");
            H2.p.h("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final void m(String str, String str2) {
        v1(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void m0(InterfaceC1449Jg interfaceC1449Jg) {
        this.f19877V = interfaceC1449Jg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final void m1(String str, JSONObject jSONObject) {
        m(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174tk
    public final void n(String str) {
        v1(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized boolean n0() {
        return this.f19868M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void n1(C3929rT c3929rT) {
        this.f19862G = c3929rT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final C1176Br o() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized boolean o1() {
        return this.f19871P;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!f0()) {
                this.f19888j0.c();
            }
            if (this.f19897r0) {
                onResume();
                this.f19897r0 = false;
            }
            boolean z7 = this.f19874S;
            AbstractC1358Gt abstractC1358Gt = this.f19860E;
            if (abstractC1358Gt != null && abstractC1358Gt.p()) {
                if (!this.f19875T) {
                    this.f19860E.E();
                    this.f19860E.Z();
                    this.f19875T = true;
                }
                B1();
                z7 = true;
            }
            F1(z7);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        AbstractC1358Gt abstractC1358Gt;
        synchronized (this) {
            try {
                if (!f0()) {
                    this.f19888j0.d();
                }
                super.onDetachedFromWindow();
                if (this.f19875T && (abstractC1358Gt = this.f19860E) != null && abstractC1358Gt.p() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f19860E.E();
                    this.f19860E.Z();
                    this.f19875T = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        F1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Va)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            C2.v.t();
            G2.D0.t(getContext(), intent);
        } catch (ActivityNotFoundException e8) {
            H2.p.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            C2.v.s().x(e8, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (f0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean B12 = B1();
        F2.x O7 = O();
        if (O7 == null || !B12) {
            return;
        }
        O7.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC1919Wt.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void onPause() {
        if (f0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.vc)).booleanValue() && AbstractC6419f.a("MUTE_AUDIO")) {
                H2.p.b("Muting webview");
                AbstractC6418e.j(this, true);
            }
        } catch (Exception e8) {
            H2.p.e("Could not pause webview.", e8);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.yc)).booleanValue()) {
                C2.v.s().x(e8, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void onResume() {
        if (f0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.vc)).booleanValue() && AbstractC6419f.a("MUTE_AUDIO")) {
                H2.p.b("Unmuting webview");
                AbstractC6418e.j(this, false);
            }
        } catch (Exception e8) {
            H2.p.e("Could not resume webview.", e8);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.yc)).booleanValue()) {
                C2.v.s().x(e8, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23658D3)).booleanValue() && this.f19860E.n();
        if ((!this.f19860E.p() || this.f19860E.o()) && !z7) {
            N9 n9 = this.f19898s;
            if (n9 != null) {
                n9.d(motionEvent);
            }
            C1726Rf c1726Rf = this.f19900u;
            if (c1726Rf != null) {
                c1726Rf.b(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    InterfaceC1519Lg interfaceC1519Lg = this.f19876U;
                    if (interfaceC1519Lg != null) {
                        interfaceC1519Lg.b(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (f0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2869hk
    public final void p(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        H2.p.b("Dispatching AFMA event: ".concat(sb.toString()));
        v1(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized void p0(F2.x xVar) {
        this.f19886h0 = xVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final synchronized BinderC2024Zt q() {
        return this.f19873R;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final Context q0() {
        return this.f19893o.b();
    }

    public final AbstractC1358Gt q1() {
        return this.f19860E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final synchronized String r() {
        C4111t60 c4111t60 = this.f19857B;
        if (c4111t60 == null) {
            return null;
        }
        return c4111t60.f26832b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void r0(boolean z7, int i8, String str, String str2, boolean z8) {
        this.f19860E.f1(z7, i8, str, str2, z8);
    }

    final synchronized Boolean r1() {
        return this.f19870O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final synchronized String s() {
        return this.f19872Q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final synchronized AbstractC1141As s0(String str) {
        Map map = this.f19894o0;
        if (map == null) {
            return null;
        }
        return (AbstractC1141As) map.get(str);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof AbstractC1358Gt) {
            this.f19860E = (AbstractC1358Gt) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (f0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e8) {
            H2.p.e("Could not stop loading webview.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2889hu
    public final void t(boolean z7, int i8, String str, boolean z8, boolean z9) {
        this.f19860E.a(z7, i8, str, z8, z9);
    }

    @Override // C2.n
    public final synchronized void t0() {
        C2.n nVar = this.f19902w;
        if (nVar != null) {
            nVar.t0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized String u() {
        return this.f19865J;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void u0(int i8) {
        if (i8 == 0) {
            C4600xf c4600xf = this.f19884f0;
            AbstractC3946rf.a(c4600xf.a(), this.f19882d0, "aebb2");
        }
        I1();
        this.f19884f0.a();
        this.f19884f0.a().d("close_type", String.valueOf(i8));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i8));
        hashMap.put("version", this.f19901v.f2914o);
        D0("onhide", hashMap);
    }

    protected final synchronized void u1(String str, ValueCallback valueCallback) {
        if (f0()) {
            H2.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void v() {
        if (this.f19883e0 == null) {
            this.f19884f0.a();
            C4491wf f8 = C4818zf.f();
            this.f19883e0 = f8;
            this.f19884f0.b("native:view_load", f8);
        }
    }

    protected final void v1(String str) {
        if (!f3.m.d()) {
            z1("javascript:".concat(str));
            return;
        }
        if (r1() == null) {
            L1();
        }
        if (r1().booleanValue()) {
            u1(str, null);
        } else {
            z1("javascript:".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final synchronized void w() {
        InterfaceC1449Jg interfaceC1449Jg = this.f19877V;
        if (interfaceC1449Jg != null) {
            final SK sk = (SK) interfaceC1449Jg;
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.QK
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        sk.d();
                    } catch (RemoteException e8) {
                        H2.p.i("#007 Could not call remote method.", e8);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1567Mr
    public final void w0() {
        F2.x O7 = O();
        if (O7 != null) {
            O7.d();
        }
    }

    final /* synthetic */ void w1(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void x() {
        AbstractC1358Gt abstractC1358Gt = this.f19860E;
        if (abstractC1358Gt != null) {
            abstractC1358Gt.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized boolean x0() {
        return this.f19879a0 > 0;
    }

    final /* synthetic */ void x1(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final synchronized C3929rT y() {
        return this.f19862G;
    }

    final /* synthetic */ void y1(String str) {
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt, com.google.android.gms.internal.ads.InterfaceC2128au
    public final C4111t60 z() {
        return this.f19857B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4410vt
    public final void z0(String str, f3.n nVar) {
        AbstractC1358Gt abstractC1358Gt = this.f19860E;
        if (abstractC1358Gt != null) {
            abstractC1358Gt.m(str, nVar);
        }
    }

    protected final synchronized void z1(String str) {
        if (f0()) {
            H2.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }
}
