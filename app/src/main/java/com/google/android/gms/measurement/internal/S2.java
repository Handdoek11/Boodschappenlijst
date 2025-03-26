package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.google.android.gms.internal.measurement.AbstractC4945j3;
import com.google.android.gms.internal.measurement.C4871b1;
import com.google.android.gms.internal.measurement.C4922g7;
import com.google.android.gms.internal.measurement.N6;
import com.google.android.gms.measurement.internal.A3;
import f3.InterfaceC5781e;
import j$.util.Objects;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o0.AbstractC6278a;
import org.json.JSONException;
import org.json.JSONObject;
import w3.C6886b;

/* loaded from: classes2.dex */
public class S2 implements InterfaceC5455y3 {

    /* renamed from: I, reason: collision with root package name */
    private static volatile S2 f30675I;

    /* renamed from: A, reason: collision with root package name */
    private volatile Boolean f30676A;

    /* renamed from: B, reason: collision with root package name */
    private Boolean f30677B;

    /* renamed from: C, reason: collision with root package name */
    private Boolean f30678C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f30679D;

    /* renamed from: E, reason: collision with root package name */
    private int f30680E;

    /* renamed from: F, reason: collision with root package name */
    private int f30681F;

    /* renamed from: H, reason: collision with root package name */
    final long f30683H;

    /* renamed from: a, reason: collision with root package name */
    private final Context f30684a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30685b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30686c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30687d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30688e;

    /* renamed from: f, reason: collision with root package name */
    private final C5298c f30689f;

    /* renamed from: g, reason: collision with root package name */
    private final C5326g f30690g;

    /* renamed from: h, reason: collision with root package name */
    private final C5461z2 f30691h;

    /* renamed from: i, reason: collision with root package name */
    private final C5378n2 f30692i;

    /* renamed from: j, reason: collision with root package name */
    private final P2 f30693j;

    /* renamed from: k, reason: collision with root package name */
    private final C5395p5 f30694k;

    /* renamed from: l, reason: collision with root package name */
    private final d6 f30695l;

    /* renamed from: m, reason: collision with root package name */
    private final C5336h2 f30696m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC5781e f30697n;

    /* renamed from: o, reason: collision with root package name */
    private final C5442w4 f30698o;

    /* renamed from: p, reason: collision with root package name */
    private final F3 f30699p;

    /* renamed from: q, reason: collision with root package name */
    private final C5451y f30700q;

    /* renamed from: r, reason: collision with root package name */
    private final C5414s4 f30701r;

    /* renamed from: s, reason: collision with root package name */
    private final String f30702s;

    /* renamed from: t, reason: collision with root package name */
    private C5322f2 f30703t;

    /* renamed from: u, reason: collision with root package name */
    private F4 f30704u;

    /* renamed from: v, reason: collision with root package name */
    private C5444x f30705v;

    /* renamed from: w, reason: collision with root package name */
    private C5329g2 f30706w;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f30708y;

    /* renamed from: z, reason: collision with root package name */
    private long f30709z;

    /* renamed from: x, reason: collision with root package name */
    private boolean f30707x = false;

    /* renamed from: G, reason: collision with root package name */
    private AtomicInteger f30682G = new AtomicInteger(0);

    private S2(D3 d32) {
        Bundle bundle;
        boolean z7 = false;
        Z2.r.l(d32);
        C5298c c5298c = new C5298c(d32.f30316a);
        this.f30689f = c5298c;
        AbstractC5308d2.f30899a = c5298c;
        Context context = d32.f30316a;
        this.f30684a = context;
        this.f30685b = d32.f30317b;
        this.f30686c = d32.f30318c;
        this.f30687d = d32.f30319d;
        this.f30688e = d32.f30323h;
        this.f30676A = d32.f30320e;
        this.f30702s = d32.f30325j;
        this.f30679D = true;
        C4871b1 c4871b1 = d32.f30322g;
        if (c4871b1 != null && (bundle = c4871b1.f29228x) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f30677B = (Boolean) obj;
            }
            Object obj2 = c4871b1.f29228x.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f30678C = (Boolean) obj2;
            }
        }
        AbstractC4945j3.l(context);
        InterfaceC5781e d8 = f3.h.d();
        this.f30697n = d8;
        Long l8 = d32.f30324i;
        this.f30683H = l8 != null ? l8.longValue() : d8.a();
        this.f30690g = new C5326g(this);
        C5461z2 c5461z2 = new C5461z2(this);
        c5461z2.o();
        this.f30691h = c5461z2;
        C5378n2 c5378n2 = new C5378n2(this);
        c5378n2.o();
        this.f30692i = c5378n2;
        d6 d6Var = new d6(this);
        d6Var.o();
        this.f30695l = d6Var;
        this.f30696m = new C5336h2(new C3(d32, this));
        this.f30700q = new C5451y(this);
        C5442w4 c5442w4 = new C5442w4(this);
        c5442w4.u();
        this.f30698o = c5442w4;
        F3 f32 = new F3(this);
        f32.u();
        this.f30699p = f32;
        C5395p5 c5395p5 = new C5395p5(this);
        c5395p5.u();
        this.f30694k = c5395p5;
        C5414s4 c5414s4 = new C5414s4(this);
        c5414s4.o();
        this.f30701r = c5414s4;
        P2 p22 = new P2(this);
        p22.o();
        this.f30693j = p22;
        C4871b1 c4871b12 = d32.f30322g;
        if (c4871b12 != null && c4871b12.f29223s != 0) {
            z7 = true;
        }
        boolean z8 = !z7;
        if (context.getApplicationContext() instanceof Application) {
            F().T0(z8);
        } else {
            h().J().a("Application context is not an Application");
        }
        p22.B(new Y2(this, d32));
    }

    public static S2 a(Context context, C4871b1 c4871b1, Long l8) {
        Bundle bundle;
        if (c4871b1 != null && (c4871b1.f29226v == null || c4871b1.f29227w == null)) {
            c4871b1 = new C4871b1(c4871b1.f29222o, c4871b1.f29223s, c4871b1.f29224t, c4871b1.f29225u, null, null, c4871b1.f29228x, null);
        }
        Z2.r.l(context);
        Z2.r.l(context.getApplicationContext());
        if (f30675I == null) {
            synchronized (S2.class) {
                try {
                    if (f30675I == null) {
                        f30675I = new S2(new D3(context, c4871b1, l8));
                    }
                } finally {
                }
            }
        } else if (c4871b1 != null && (bundle = c4871b1.f29228x) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Z2.r.l(f30675I);
            f30675I.k(c4871b1.f29228x.getBoolean("dataCollectionDefaultEnabled"));
        }
        Z2.r.l(f30675I);
        return f30675I;
    }

    private static void c(AbstractC5454y2 abstractC5454y2) {
        if (abstractC5454y2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC5454y2.x()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC5454y2.getClass()));
    }

    static /* synthetic */ void e(S2 s22, D3 d32) {
        s22.j().l();
        C5444x c5444x = new C5444x(s22);
        c5444x.o();
        s22.f30705v = c5444x;
        C5329g2 c5329g2 = new C5329g2(s22, d32.f30321f);
        c5329g2.u();
        s22.f30706w = c5329g2;
        C5322f2 c5322f2 = new C5322f2(s22);
        c5322f2.u();
        s22.f30703t = c5322f2;
        F4 f42 = new F4(s22);
        f42.u();
        s22.f30704u = f42;
        s22.f30695l.p();
        s22.f30691h.p();
        s22.f30706w.v();
        s22.h().H().b("App measurement initialized, version", 106000L);
        s22.h().H().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String D7 = c5329g2.D();
        if (TextUtils.isEmpty(s22.f30685b)) {
            if (s22.J().C0(D7, s22.f30690g.R())) {
                s22.h().H().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                s22.h().H().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + D7);
            }
        }
        s22.h().D().a("Debug-level message logging enabled");
        if (s22.f30680E != s22.f30682G.get()) {
            s22.h().E().c("Not all components initialized", Integer.valueOf(s22.f30680E), Integer.valueOf(s22.f30682G.get()));
        }
        s22.f30707x = true;
    }

    private static void f(AbstractC5441w3 abstractC5441w3) {
        if (abstractC5441w3 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void g(AbstractC5462z3 abstractC5462z3) {
        if (abstractC5462z3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC5462z3.q()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC5462z3.getClass()));
    }

    private final C5414s4 t() {
        g(this.f30701r);
        return this.f30701r;
    }

    public final C5322f2 A() {
        c(this.f30703t);
        return this.f30703t;
    }

    public final C5336h2 B() {
        return this.f30696m;
    }

    public final C5378n2 C() {
        C5378n2 c5378n2 = this.f30692i;
        if (c5378n2 == null || !c5378n2.q()) {
            return null;
        }
        return this.f30692i;
    }

    public final C5461z2 D() {
        f(this.f30691h);
        return this.f30691h;
    }

    final P2 E() {
        return this.f30693j;
    }

    public final F3 F() {
        c(this.f30699p);
        return this.f30699p;
    }

    public final C5442w4 G() {
        c(this.f30698o);
        return this.f30698o;
    }

    public final F4 H() {
        c(this.f30704u);
        return this.f30704u;
    }

    public final C5395p5 I() {
        c(this.f30694k);
        return this.f30694k;
    }

    public final d6 J() {
        f(this.f30695l);
        return this.f30695l;
    }

    public final String K() {
        return this.f30685b;
    }

    public final String L() {
        return this.f30686c;
    }

    public final String M() {
        return this.f30687d;
    }

    public final String N() {
        return this.f30702s;
    }

    final void O() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void P() {
        this.f30682G.incrementAndGet();
    }

    protected final void b(C4871b1 c4871b1) {
        A3 f8;
        Boolean e8;
        j().l();
        if (C4922g7.a() && this.f30690g.r(G.f30389J0) && J().V0()) {
            d6 J7 = J();
            J7.l();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            AbstractC6278a.k(J7.zza(), new w3.F(J7.f31239a), intentFilter, 2);
            J7.h().D().a("Registered app receiver");
        }
        A3 K7 = D().K();
        int b8 = K7.b();
        w3.p z7 = this.f30690g.z("google_analytics_default_allow_ad_storage", false);
        w3.p z8 = this.f30690g.z("google_analytics_default_allow_analytics_storage", false);
        w3.p pVar = w3.p.UNINITIALIZED;
        if (!(z7 == pVar && z8 == pVar) && D().w(-10)) {
            f8 = A3.f(z7, z8, -10);
        } else {
            if (!TextUtils.isEmpty(z().E()) && (b8 == 0 || b8 == 30 || b8 == 10 || b8 == 30 || b8 == 30 || b8 == 40)) {
                F().Q(new A3(null, null, -10), this.f30683H, false);
            } else if (TextUtils.isEmpty(z().E()) && c4871b1 != null && c4871b1.f29228x != null && D().w(30)) {
                f8 = A3.c(c4871b1.f29228x, 30);
                if (!f8.A()) {
                }
            }
            f8 = null;
        }
        if (f8 != null) {
            F().Q(f8, this.f30683H, true);
            K7 = f8;
        }
        F().P(K7);
        int a8 = D().J().a();
        w3.p z9 = this.f30690g.z("google_analytics_default_allow_ad_personalization_signals", true);
        if (z9 != pVar) {
            h().I().b("Default ad personalization consent from Manifest", z9);
        }
        w3.p z10 = this.f30690g.z("google_analytics_default_allow_ad_user_data", true);
        if (z10 != pVar && A3.l(-10, a8)) {
            F().O(C5430v.d(z10, -10), true);
        } else if (TextUtils.isEmpty(z().E()) || !(a8 == 0 || a8 == 30)) {
            if (TextUtils.isEmpty(z().E()) && c4871b1 != null && c4871b1.f29228x != null && A3.l(30, a8)) {
                C5430v b9 = C5430v.b(c4871b1.f29228x, 30);
                if (b9.k()) {
                    F().O(b9, true);
                }
            }
            if (TextUtils.isEmpty(z().E()) && c4871b1 != null && c4871b1.f29228x != null && D().f31296o.a() == null && (e8 = C5430v.e(c4871b1.f29228x)) != null) {
                F().h0(c4871b1.f29226v, "allow_personalized_ads", e8.toString(), false);
            }
        } else {
            F().O(new C5430v(null, -10), true);
        }
        Boolean C7 = this.f30690g.C("google_analytics_tcf_data_enabled");
        if (C7 == null ? true : C7.booleanValue()) {
            h().D().a("TCF client enabled.");
            F().G0();
            F().E0();
        }
        if (D().f31288g.a() == 0) {
            h().I().b("Persisting first open", Long.valueOf(this.f30683H));
            D().f31288g.b(this.f30683H);
        }
        F().f30356q.c();
        if (q()) {
            if (!TextUtils.isEmpty(z().E()) || !TextUtils.isEmpty(z().C())) {
                J();
                if (d6.k0(z().E(), D().Q(), z().C(), D().P())) {
                    h().H().a("Rechecking which service to use due to a GMP App Id change");
                    D().R();
                    A().F();
                    this.f30704u.Y();
                    this.f30704u.X();
                    D().f31288g.b(this.f30683H);
                    D().f31290i.b(null);
                }
                D().G(z().E());
                D().D(z().C());
            }
            if (!D().K().m(A3.a.ANALYTICS_STORAGE)) {
                D().f31290i.b(null);
            }
            F().Y0(D().f31290i.a());
            if (!J().W0() && !TextUtils.isEmpty(D().f31305x.a())) {
                h().J().a("Remote config removed with active feature rollouts");
                D().f31305x.b(null);
            }
            if (!TextUtils.isEmpty(z().E()) || !TextUtils.isEmpty(z().C())) {
                boolean n8 = n();
                if (!D().B() && !this.f30690g.U()) {
                    D().E(!n8);
                }
                if (n8) {
                    F().A0();
                }
                I().f31154e.a();
                H().M(new AtomicReference());
                H().A(D().f31283A.a());
            }
        } else if (n()) {
            if (!J().D0("android.permission.INTERNET")) {
                h().E().a("App is missing INTERNET permission");
            }
            if (!J().D0("android.permission.ACCESS_NETWORK_STATE")) {
                h().E().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!h3.e.a(this.f30684a).g() && !this.f30690g.V()) {
                if (!d6.b0(this.f30684a)) {
                    h().E().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!d6.c0(this.f30684a, false)) {
                    h().E().a("AppMeasurementService not registered/enabled");
                }
            }
            h().E().a("Uploading is not possible. App measurement disabled");
        }
        if (C4922g7.a() && this.f30690g.r(G.f30389J0) && J().V0()) {
            final F3 F7 = F();
            Objects.requireNonNull(F7);
            new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.W2
                @Override // java.lang.Runnable
                public final void run() {
                    F7.C0();
                }
            }).start();
        }
        D().f31298q.a(true);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final C5298c d() {
        return this.f30689f;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final C5378n2 h() {
        g(this.f30692i);
        return this.f30692i;
    }

    final /* synthetic */ void i(String str, int i8, Throwable th, byte[] bArr, Map map) {
        if ((i8 != 200 && i8 != 204 && i8 != 304) || th != null) {
            h().J().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
            return;
        }
        D().f31303v.a(true);
        if (bArr == null || bArr.length == 0) {
            h().D().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString(AdditContent.AdditSources.DEEPLINK, "");
            if (TextUtils.isEmpty(optString)) {
                h().D().a("Deferred Deep Link is empty.");
                return;
            }
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            String optString4 = jSONObject.optString("gad_source", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            Bundle bundle = new Bundle();
            if (N6.a() && this.f30690g.r(G.f30411U0)) {
                if (!J().J0(optString)) {
                    h().J().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                if (!TextUtils.isEmpty(optString3)) {
                    bundle.putString("gbraid", optString3);
                }
                if (!TextUtils.isEmpty(optString4)) {
                    bundle.putString("gad_source", optString4);
                }
            } else if (!J().J0(optString)) {
                h().J().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            if (N6.a()) {
                this.f30690g.r(G.f30411U0);
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f30699p.Z0("auto", "_cmp", bundle);
            d6 J7 = J();
            if (TextUtils.isEmpty(optString) || !J7.g0(optString, optDouble)) {
                return;
            }
            J7.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e8) {
            h().E().b("Failed to parse the Deferred Deep Link response. exception", e8);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final P2 j() {
        g(this.f30693j);
        return this.f30693j;
    }

    final void k(boolean z7) {
        this.f30676A = Boolean.valueOf(z7);
    }

    final void l() {
        this.f30680E++;
    }

    public final boolean m() {
        return this.f30676A != null && this.f30676A.booleanValue();
    }

    public final boolean n() {
        return v() == 0;
    }

    public final boolean o() {
        j().l();
        return this.f30679D;
    }

    public final boolean p() {
        return TextUtils.isEmpty(this.f30685b);
    }

    protected final boolean q() {
        if (!this.f30707x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        j().l();
        Boolean bool = this.f30708y;
        if (bool == null || this.f30709z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f30697n.b() - this.f30709z) > 1000)) {
            this.f30709z = this.f30697n.b();
            boolean z7 = true;
            Boolean valueOf = Boolean.valueOf(J().D0("android.permission.INTERNET") && J().D0("android.permission.ACCESS_NETWORK_STATE") && (h3.e.a(this.f30684a).g() || this.f30690g.V() || (d6.b0(this.f30684a) && d6.c0(this.f30684a, false))));
            this.f30708y = valueOf;
            if (valueOf.booleanValue()) {
                if (!J().i0(z().E(), z().C()) && TextUtils.isEmpty(z().C())) {
                    z7 = false;
                }
                this.f30708y = Boolean.valueOf(z7);
            }
        }
        return this.f30708y.booleanValue();
    }

    public final boolean r() {
        return this.f30688e;
    }

    public final boolean s() {
        j().l();
        g(t());
        String D7 = z().D();
        if (!this.f30690g.S()) {
            h().I().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair s8 = D().s(D7);
        if (((Boolean) s8.second).booleanValue() || TextUtils.isEmpty((CharSequence) s8.first)) {
            h().I().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!t().u()) {
            h().J().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        F4 H7 = H();
        H7.l();
        H7.t();
        if (!H7.i0() || H7.g().G0() >= 234200) {
            C6886b o02 = F().o0();
            Bundle bundle = o02 != null ? o02.f44333o : null;
            if (bundle == null) {
                int i8 = this.f30681F;
                this.f30681F = i8 + 1;
                boolean z7 = i8 < 10;
                h().D().b("Failed to retrieve DMA consent from the service, " + (z7 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f30681F));
                return z7;
            }
            A3 c8 = A3.c(bundle, 100);
            sb.append("&gcs=");
            sb.append(c8.w());
            C5430v b8 = C5430v.b(bundle, 100);
            sb.append("&dma=");
            sb.append(b8.h() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(b8.i())) {
                sb.append("&dma_cps=");
                sb.append(b8.i());
            }
            int i9 = C5430v.e(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i9);
            h().I().b("Consent query parameters to Bow", sb);
        }
        d6 J7 = J();
        z();
        URL I7 = J7.I(106000L, D7, (String) s8.first, D().f31304w.a() - 1, sb.toString());
        if (I7 != null) {
            C5414s4 t7 = t();
            InterfaceC5407r4 interfaceC5407r4 = new InterfaceC5407r4() { // from class: com.google.android.gms.measurement.internal.V2
                @Override // com.google.android.gms.measurement.internal.InterfaceC5407r4
                public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
                    this.f30733a.i(str, i10, th, bArr, map);
                }
            };
            t7.l();
            t7.n();
            Z2.r.l(I7);
            Z2.r.l(interfaceC5407r4);
            t7.j().x(new RunnableC5428u4(t7, D7, I7, null, null, interfaceC5407r4));
        }
        return false;
    }

    public final void u(boolean z7) {
        j().l();
        this.f30679D = z7;
    }

    public final int v() {
        j().l();
        if (this.f30690g.U()) {
            return 1;
        }
        Boolean bool = this.f30678C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!o()) {
            return 8;
        }
        Boolean N7 = D().N();
        if (N7 != null) {
            return N7.booleanValue() ? 0 : 3;
        }
        Boolean C7 = this.f30690g.C("firebase_analytics_collection_enabled");
        if (C7 != null) {
            return C7.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f30677B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f30676A == null || this.f30676A.booleanValue()) ? 0 : 7;
    }

    public final C5451y w() {
        C5451y c5451y = this.f30700q;
        if (c5451y != null) {
            return c5451y;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C5326g x() {
        return this.f30690g;
    }

    public final C5444x y() {
        g(this.f30705v);
        return this.f30705v;
    }

    public final C5329g2 z() {
        c(this.f30706w);
        return this.f30706w;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final Context zza() {
        return this.f30684a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final InterfaceC5781e zzb() {
        return this.f30697n;
    }
}
