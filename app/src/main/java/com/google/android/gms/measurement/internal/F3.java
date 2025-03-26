package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.C4894d6;
import com.google.android.gms.internal.measurement.C4922g7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.measurement.internal.A3;
import f3.InterfaceC5781e;
import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import q.C6397a;
import w3.C6886b;

/* loaded from: classes2.dex */
public final class F3 extends AbstractC5454y2 {

    /* renamed from: c, reason: collision with root package name */
    private C5380n4 f30342c;

    /* renamed from: d, reason: collision with root package name */
    private w3.u f30343d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f30344e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30345f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f30346g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f30347h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30348i;

    /* renamed from: j, reason: collision with root package name */
    private int f30349j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC5416t f30350k;

    /* renamed from: l, reason: collision with root package name */
    private PriorityQueue f30351l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f30352m;

    /* renamed from: n, reason: collision with root package name */
    private A3 f30353n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicLong f30354o;

    /* renamed from: p, reason: collision with root package name */
    private long f30355p;

    /* renamed from: q, reason: collision with root package name */
    final i6 f30356q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f30357r;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC5416t f30358s;

    /* renamed from: t, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f30359t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC5416t f30360u;

    /* renamed from: v, reason: collision with root package name */
    private final c6 f30361v;

    protected F3(S2 s22) {
        super(s22);
        this.f30344e = new CopyOnWriteArraySet();
        this.f30347h = new Object();
        this.f30348i = false;
        this.f30349j = 1;
        this.f30357r = true;
        this.f30361v = new C5324f4(this);
        this.f30346g = new AtomicReference();
        this.f30353n = A3.f30265c;
        this.f30355p = -1L;
        this.f30354o = new AtomicLong(0L);
        this.f30356q = new i6(s22);
    }

    static /* synthetic */ int A(F3 f32, Throwable th) {
        String message = th.getMessage();
        f32.f30352m = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (message.contains("Background")) {
            f32.f30352m = true;
        }
        return 1;
    }

    public static int C(String str) {
        Z2.r.f(str);
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0() {
        l();
        String a8 = f().f31296o.a();
        if (a8 != null) {
            if ("unset".equals(a8)) {
                g0("app", "_npa", null, zzb().a());
            } else {
                g0("app", "_npa", Long.valueOf("true".equals(a8) ? 1L : 0L), zzb().a());
            }
        }
        if (!this.f31239a.n() || !this.f30357r) {
            h().D().a("Updating Scion state (FE)");
            r().d0();
        } else {
            h().D().a("Recording app launch after enabling measurement for the first time (FE)");
            A0();
            s().f31154e.a();
            j().B(new S3(this));
        }
    }

    private final void L(Bundle bundle, int i8, long j8) {
        t();
        String h8 = A3.h(bundle);
        if (h8 != null) {
            h().K().b("Ignoring invalid consent setting", h8);
            h().K().a("Valid consent values are 'granted', 'denied'");
        }
        boolean H7 = j().H();
        A3 c8 = A3.c(bundle, i8);
        if (c8.A()) {
            Q(c8, j8, H7);
        }
        C5430v b8 = C5430v.b(bundle, i8);
        if (b8.k()) {
            O(b8, H7);
        }
        Boolean e8 = C5430v.e(bundle);
        if (e8 != null) {
            String str = i8 == -30 ? "tcf" : "app";
            if (a().r(G.f30409T0) && H7) {
                g0(str, "allow_personalized_ads", e8.toString(), j8);
            } else {
                i0(str, "allow_personalized_ads", e8.toString(), false, j8);
            }
        }
    }

    static /* synthetic */ void N0(F3 f32, int i8) {
        if (f32.f30350k == null) {
            f32.f30350k = new Q3(f32, f32.f31239a);
        }
        f32.f30350k.b(i8 * 1000);
    }

    static /* synthetic */ void O0(F3 f32, Bundle bundle) {
        f32.l();
        f32.t();
        Z2.r.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Z2.r.f(string);
        Z2.r.f(string2);
        Z2.r.l(bundle.get("value"));
        if (!f32.f31239a.n()) {
            f32.h().I().a("Conditional property not set since app measurement is disabled");
            return;
        }
        Y5 y52 = new Y5(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            E F7 = f32.g().F(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            f32.r().F(new C5312e(bundle.getString("app_id"), string2, y52, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), f32.g().F(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), F7, bundle.getLong("time_to_live"), f32.g().F(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void Q0(String str, String str2, long j8, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        j().B(new X3(this, str, str2, j8, d6.B(bundle), z7, z8, z9, str3));
    }

    static /* synthetic */ void S(F3 f32, Bundle bundle) {
        f32.l();
        f32.t();
        Z2.r.l(bundle);
        String f8 = Z2.r.f(bundle.getString("name"));
        if (!f32.f31239a.n()) {
            f32.h().I().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            f32.r().F(new C5312e(bundle.getString("app_id"), "", new Y5(f8, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), f32.g().F(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void T(F3 f32, A3 a32, long j8, boolean z7, boolean z8) {
        f32.l();
        f32.t();
        A3 K7 = f32.f().K();
        if (j8 <= f32.f30355p && A3.l(K7.b(), a32.b())) {
            f32.h().H().b("Dropped out-of-date consent setting, proposed settings", a32);
            return;
        }
        if (!f32.f().z(a32)) {
            f32.h().H().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(a32.b()));
            return;
        }
        f32.h().I().b("Setting storage consent(FE)", a32);
        f32.f30355p = j8;
        if (f32.r().h0()) {
            f32.r().m0(z7);
        } else {
            f32.r().S(z7);
        }
        if (z8) {
            f32.r().M(new AtomicReference());
        }
    }

    static /* synthetic */ void U(F3 f32, A3 a32, A3 a33) {
        if (C4894d6.a() && f32.a().r(G.f30419Y0)) {
            return;
        }
        A3.a aVar = A3.a.ANALYTICS_STORAGE;
        A3.a aVar2 = A3.a.AD_STORAGE;
        boolean n8 = a32.n(a33, aVar, aVar2);
        boolean s8 = a32.s(a33, aVar, aVar2);
        if (n8 || s8) {
            f32.n().G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(Boolean bool, boolean z7) {
        l();
        t();
        h().D().b("Setting app measurement enabled (FE)", bool);
        f().u(bool);
        if (z7) {
            f().C(bool);
        }
        if (this.f31239a.o() || !(bool == null || bool.booleanValue())) {
            I0();
        }
    }

    private final void c0(String str, String str2, long j8, Object obj) {
        j().B(new W3(this, str, str2, obj, j8));
    }

    public final void A0() {
        l();
        t();
        if (this.f31239a.q()) {
            Boolean C7 = a().C("google_analytics_deferred_deep_link_enabled");
            if (C7 != null && C7.booleanValue()) {
                h().D().a("Deferred Deep Link feature enabled.");
                j().B(new Runnable() { // from class: w3.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44355o.D0();
                    }
                });
            }
            r().W();
            this.f30357r = false;
            String O7 = f().O();
            if (TextUtils.isEmpty(O7)) {
                return;
            }
            c().n();
            if (O7.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", O7);
            Z0("auto", "_ou", bundle);
        }
    }

    public final void B0() {
        if (!(zza().getApplicationContext() instanceof Application) || this.f30342c == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f30342c);
    }

    final void C0() {
        if (C4922g7.a() && a().r(G.f30389J0)) {
            if (j().H()) {
                h().E().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C5298c.a()) {
                h().E().a("Cannot get trigger URIs from main thread");
                return;
            }
            t();
            h().I().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            j().t(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.G3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30489o.k0(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                h().E().a("Timed out waiting for get trigger URIs");
            } else {
                j().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.J3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30560o.j0(list);
                    }
                });
            }
        }
    }

    public final void D0() {
        l();
        if (f().f31303v.b()) {
            h().D().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a8 = f().f31304w.a();
        f().f31304w.b(1 + a8);
        if (a8 >= 5) {
            h().J().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            f().f31303v.a(true);
        } else {
            if (this.f30358s == null) {
                this.f30358s = new C5289a4(this, this.f31239a);
            }
            this.f30358s.b(0L);
        }
    }

    public final ArrayList E(String str, String str2) {
        if (j().H()) {
            h().E().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C5298c.a()) {
            h().E().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f31239a.j().t(atomicReference, 5000L, "get conditional user properties", new RunnableC5317e4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return d6.r0(list);
        }
        h().E().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final void E0() {
        l();
        h().D().a("Handle tcf update.");
        C5464z5 c8 = C5464z5.c(f().F());
        h().I().b("Tcf preferences read", c8);
        if (f().A(c8)) {
            Bundle b8 = c8.b();
            h().I().b("Consent generated from Tcf", b8);
            if (b8 != Bundle.EMPTY) {
                L(b8, -30, zzb().a());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c8.e());
            Z0("auto", "_tcf", bundle);
        }
    }

    public final Map F(String str, String str2, boolean z7) {
        if (j().H()) {
            h().E().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C5298c.a()) {
            h().E().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f31239a.j().t(atomicReference, 5000L, "get user properties", new RunnableC5310d4(this, atomicReference, null, str, str2, z7));
        List<Y5> list = (List) atomicReference.get();
        if (list == null) {
            h().E().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z7));
            return Collections.emptyMap();
        }
        C6397a c6397a = new C6397a(list.size());
        for (Y5 y52 : list) {
            Object A02 = y52.A0();
            if (A02 != null) {
                c6397a.put(y52.f30790s, A02);
            }
        }
        return c6397a;
    }

    final void F0() {
        B5 b52;
        X0.a R02;
        l();
        this.f30352m = false;
        if (y0().isEmpty() || this.f30348i || (b52 = (B5) y0().poll()) == null || (R02 = g().R0()) == null) {
            return;
        }
        this.f30348i = true;
        h().I().b("Registering trigger URI", b52.f30298o);
        com.google.common.util.concurrent.d d8 = R02.d(Uri.parse(b52.f30298o));
        if (d8 == null) {
            this.f30348i = false;
            y0().add(b52);
            return;
        }
        if (!a().r(G.f30399O0)) {
            SparseArray I7 = f().I();
            I7.put(b52.f30300t, Long.valueOf(b52.f30299s));
            f().t(I7);
        }
        com.google.common.util.concurrent.b.a(d8, new R3(this, b52), new N3(this));
    }

    public final void G(long j8) {
        Y0(null);
        j().B(new Z3(this, j8));
    }

    public final void G0() {
        l();
        h().D().a("Register tcfPrefChangeListener.");
        if (this.f30359t == null) {
            this.f30360u = new U3(this, this.f31239a);
            this.f30359t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.M3
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f30588o.J(sharedPreferences, str);
                }
            };
        }
        f().F().registerOnSharedPreferenceChangeListener(this.f30359t);
    }

    final void H(long j8, boolean z7) {
        l();
        t();
        h().D().a("Resetting analytics data (FE)");
        C5395p5 s8 = s();
        s8.l();
        s8.f31155f.b();
        n().G();
        boolean n8 = this.f31239a.n();
        C5461z2 f8 = f();
        f8.f31288g.b(j8);
        if (!TextUtils.isEmpty(f8.f().f31305x.a())) {
            f8.f31305x.b(null);
        }
        f8.f31299r.b(0L);
        f8.f31300s.b(0L);
        if (!f8.a().U()) {
            f8.E(!n8);
        }
        f8.f31306y.b(null);
        f8.f31307z.b(0L);
        f8.f31283A.b(null);
        if (z7) {
            r().b0();
        }
        s().f31154e.a();
        this.f30357r = !n8;
    }

    final boolean H0() {
        return this.f30352m;
    }

    public final void I(Intent intent) {
        if (n7.a() && a().r(G.f30486z0)) {
            Uri data = intent.getData();
            if (data == null) {
                h().H().a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                h().H().a("Preview Mode was not enabled.");
                a().J(null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            h().H().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            a().J(queryParameter2);
        }
    }

    final /* synthetic */ void J(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            h().I().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC5416t) Z2.r.l(this.f30360u)).b(500L);
        }
    }

    final /* synthetic */ void K(Bundle bundle) {
        Bundle a8;
        if (bundle.isEmpty()) {
            a8 = bundle;
        } else {
            a8 = f().f31283A.a();
            if (a().r(G.f30448i1)) {
                a8 = new Bundle(a8);
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    g();
                    if (d6.f0(obj)) {
                        g();
                        d6.W(this.f30361v, 27, null, null, 0);
                    }
                    h().K().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (d6.H0(str)) {
                    h().K().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a8.remove(str);
                } else if (g().j0("param", str, a().p(null, false), obj)) {
                    g().M(a8, str, obj);
                }
            }
            g();
            if (d6.e0(a8, a().w())) {
                g();
                d6.W(this.f30361v, 26, null, null, 0);
                h().K().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        f().f31283A.b(a8);
        if (!bundle.isEmpty() || a().r(G.f30442g1)) {
            r().A(a8);
        }
    }

    final void K0(long j8) {
        H(j8, true);
    }

    public final void L0(Bundle bundle) {
        M0(bundle, zzb().a());
    }

    final /* synthetic */ void M(Bundle bundle, long j8) {
        if (TextUtils.isEmpty(n().E())) {
            L(bundle, 0, j8);
        } else {
            h().K().a("Using developer consent only; google app id found");
        }
    }

    public final void M0(Bundle bundle, long j8) {
        Z2.r.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            h().J().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Z2.r.l(bundle2);
        w3.o.a(bundle2, "app_id", String.class, null);
        w3.o.a(bundle2, "origin", String.class, null);
        w3.o.a(bundle2, "name", String.class, null);
        w3.o.a(bundle2, "value", Object.class, null);
        w3.o.a(bundle2, "trigger_event_name", String.class, null);
        w3.o.a(bundle2, "trigger_timeout", Long.class, 0L);
        w3.o.a(bundle2, "timed_out_event_name", String.class, null);
        w3.o.a(bundle2, "timed_out_event_params", Bundle.class, null);
        w3.o.a(bundle2, "triggered_event_name", String.class, null);
        w3.o.a(bundle2, "triggered_event_params", Bundle.class, null);
        w3.o.a(bundle2, "time_to_live", Long.class, 0L);
        w3.o.a(bundle2, "expired_event_name", String.class, null);
        w3.o.a(bundle2, "expired_event_params", Bundle.class, null);
        Z2.r.f(bundle2.getString("name"));
        Z2.r.f(bundle2.getString("origin"));
        Z2.r.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j8);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (g().p0(string) != 0) {
            h().E().b("Invalid conditional user property name", e().g(string));
            return;
        }
        if (g().u(string, obj) != 0) {
            h().E().c("Invalid conditional user property value", e().g(string), obj);
            return;
        }
        Object y02 = g().y0(string, obj);
        if (y02 == null) {
            h().E().c("Unable to normalize conditional user property value", e().g(string), obj);
            return;
        }
        w3.o.b(bundle2, y02);
        long j9 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j9 > 15552000000L || j9 < 1)) {
            h().E().c("Invalid conditional user property timeout", e().g(string), Long.valueOf(j9));
            return;
        }
        long j10 = bundle2.getLong("time_to_live");
        if (j10 > 15552000000L || j10 < 1) {
            h().E().c("Invalid conditional user property time to live", e().g(string), Long.valueOf(j10));
        } else {
            j().B(new RunnableC5303c4(this, bundle2));
        }
    }

    public final void N(com.google.android.gms.internal.measurement.T0 t02) {
        j().B(new RunnableC5331g4(this, t02));
    }

    final void O(C5430v c5430v, boolean z7) {
        RunnableC5373m4 runnableC5373m4 = new RunnableC5373m4(this, c5430v);
        if (!z7) {
            j().B(runnableC5373m4);
        } else {
            l();
            runnableC5373m4.run();
        }
    }

    final void P(A3 a32) {
        l();
        boolean z7 = (a32.z() && a32.y()) || r().g0();
        if (z7 != this.f31239a.o()) {
            this.f31239a.u(z7);
            Boolean M7 = f().M();
            if (!z7 || M7 == null || M7.booleanValue()) {
                Y(Boolean.valueOf(z7), false);
            }
        }
    }

    final /* synthetic */ void P0(String str) {
        if (n().I(str)) {
            n().G();
        }
    }

    public final void Q(A3 a32, long j8, boolean z7) {
        A3 a33;
        boolean z8;
        boolean z9;
        boolean z10;
        A3 a34 = a32;
        t();
        int b8 = a32.b();
        if (b8 != -10) {
            w3.p t7 = a32.t();
            w3.p pVar = w3.p.UNINITIALIZED;
            if (t7 == pVar && a32.v() == pVar) {
                h().K().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f30347h) {
            try {
                a33 = this.f30353n;
                z8 = false;
                if (A3.l(b8, a33.b())) {
                    z9 = a32.u(this.f30353n);
                    if (a32.z() && !this.f30353n.z()) {
                        z8 = true;
                    }
                    a34 = a32.p(this.f30353n);
                    this.f30353n = a34;
                    z10 = z8;
                    z8 = true;
                } else {
                    z9 = false;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8) {
            h().H().b("Ignoring lower-priority consent settings, proposed settings", a34);
            return;
        }
        long andIncrement = this.f30354o.getAndIncrement();
        if (z9) {
            Y0(null);
            RunnableC5366l4 runnableC5366l4 = new RunnableC5366l4(this, a34, j8, andIncrement, z10, a33);
            if (!z7) {
                j().E(runnableC5366l4);
                return;
            } else {
                l();
                runnableC5366l4.run();
                return;
            }
        }
        RunnableC5394p4 runnableC5394p4 = new RunnableC5394p4(this, a34, andIncrement, z10, a33);
        if (z7) {
            l();
            runnableC5394p4.run();
        } else if (b8 == 30 || b8 == -10) {
            j().E(runnableC5394p4);
        } else {
            j().B(runnableC5394p4);
        }
    }

    public final void R0(String str, String str2, Bundle bundle) {
        f0(str, str2, bundle, true, true, zzb().a());
    }

    public final void S0(w3.t tVar) {
        t();
        Z2.r.l(tVar);
        if (this.f30344e.remove(tVar)) {
            return;
        }
        h().J().a("OnEventListener had not been registered");
    }

    public final void T0(boolean z7) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.f30342c == null) {
                this.f30342c = new C5380n4(this);
            }
            if (z7) {
                application.unregisterActivityLifecycleCallbacks(this.f30342c);
                application.registerActivityLifecycleCallbacks(this.f30342c);
                h().I().a("Registered activity lifecycle callback");
            }
        }
    }

    public final void U0(long j8) {
        j().B(new V3(this, j8));
    }

    public final void V0(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        j().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.I3
            @Override // java.lang.Runnable
            public final void run() {
                this.f30547o.K(bundle2);
            }
        });
    }

    public final void W0(final Bundle bundle, final long j8) {
        j().E(new Runnable() { // from class: com.google.android.gms.measurement.internal.K3
            @Override // java.lang.Runnable
            public final void run() {
                this.f30569o.M(bundle, j8);
            }
        });
    }

    public final void X(Boolean bool) {
        t();
        j().B(new RunnableC5352j4(this, bool));
    }

    final void Y0(String str) {
        this.f30346g.set(str);
    }

    public final void Z(final String str, long j8) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.f31239a.h().J().a("User ID must be non-empty or null");
        } else {
            j().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.L3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30578o.P0(str);
                }
            });
            i0(null, "_id", str, true, j8);
        }
    }

    final void Z0(String str, String str2, Bundle bundle) {
        l();
        a0(str, str2, zzb().a(), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    final void a0(String str, String str2, long j8, Bundle bundle) {
        l();
        b0(str, str2, j8, bundle, true, this.f30343d == null || d6.H0(str2), true, null);
    }

    public final void a1(boolean z7) {
        t();
        j().B(new T3(this, z7));
    }

    protected final void b0(String str, String str2, long j8, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        String str4;
        long j9;
        int i8;
        int length;
        Z2.r.f(str);
        Z2.r.l(bundle);
        l();
        t();
        if (!this.f31239a.n()) {
            h().D().a("Event not sent since app measurement is disabled");
            return;
        }
        List F7 = n().F();
        if (F7 != null && !F7.contains(str2)) {
            h().D().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f30345f) {
            this.f30345f = true;
            try {
                try {
                    (!this.f31239a.r() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e8) {
                    h().J().b("Failed to invoke Tag Manager's initialize() method", e8);
                }
            } catch (ClassNotFoundException unused) {
                h().H().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            g0("auto", "_lgclid", bundle.getString("gclid"), zzb().a());
        }
        if (z7 && d6.K0(str2)) {
            g().L(bundle, f().f31283A.a());
        }
        if (!z9 && !"_iap".equals(str2)) {
            d6 J7 = this.f31239a.J();
            int i9 = 2;
            if (J7.A0("event", str2)) {
                if (!J7.n0("event", w3.q.f44345a, w3.q.f44346b, str2)) {
                    i9 = 13;
                } else if (J7.h0("event", 40, str2)) {
                    i9 = 0;
                }
            }
            if (i9 != 0) {
                h().F().b("Invalid public event name. Event will not be logged (FE)", e().c(str2));
                this.f31239a.J();
                String H7 = d6.H(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f31239a.J();
                d6.W(this.f30361v, i9, "_ev", H7, length);
                return;
            }
        }
        C5449x4 A7 = q().A(false);
        if (A7 != null && !bundle.containsKey("_sc")) {
            A7.f31263d = true;
        }
        d6.V(A7, bundle, z7 && !z9);
        boolean equals = "am".equals(str);
        boolean H02 = d6.H0(str2);
        if (z7 && this.f30343d != null && !H02 && !equals) {
            h().D().c("Passing event to registered event handler (FE)", e().c(str2), e().a(bundle));
            Z2.r.l(this.f30343d);
            this.f30343d.a(str, str2, bundle, j8);
            return;
        }
        if (this.f31239a.q()) {
            int t7 = g().t(str2);
            if (t7 != 0) {
                h().F().b("Invalid event name. Event will not be logged (FE)", e().c(str2));
                g();
                String H8 = d6.H(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f31239a.J();
                d6.X(this.f30361v, str3, t7, "_ev", H8, length);
                return;
            }
            Bundle D7 = g().D(str3, str2, bundle, f3.f.b("_o", "_sn", "_sc", "_si"), z9);
            Z2.r.l(D7);
            if (q().A(false) != null && "_ae".equals(str2)) {
                C5429u5 c5429u5 = s().f31155f;
                long b8 = c5429u5.f31219d.zzb().b();
                long j10 = b8 - c5429u5.f31217b;
                c5429u5.f31217b = b8;
                if (j10 > 0) {
                    g().K(D7, j10);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                d6 g8 = g();
                String string = D7.getString("_ffr");
                if (f3.q.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, g8.f().f31305x.a())) {
                    g8.h().D().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                g8.f().f31305x.b(string);
            } else if ("_ae".equals(str2)) {
                String a8 = g().f().f31305x.a();
                if (!TextUtils.isEmpty(a8)) {
                    D7.putString("_ffr", a8);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(D7);
            boolean D8 = a().r(G.f30401P0) ? s().D() : f().f31302u.b();
            if (f().f31299r.a() > 0 && f().x(j8) && D8) {
                h().I().a("Current session is expired, remove the session number, ID, and engagement time");
                j9 = 0;
                str4 = "_ae";
                g0("auto", "_sid", null, zzb().a());
                g0("auto", "_sno", null, zzb().a());
                g0("auto", "_se", null, zzb().a());
                f().f31300s.b(0L);
            } else {
                str4 = "_ae";
                j9 = 0;
            }
            if (D7.getLong("extend_session", j9) == 1) {
                h().I().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i8 = 1;
                this.f31239a.I().f31154e.b(j8, true);
            } else {
                i8 = 1;
            }
            ArrayList arrayList2 = new ArrayList(D7.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10 += i8;
                String str5 = (String) obj;
                if (str5 != null) {
                    g();
                    Bundle[] v02 = d6.v0(D7.get(str5));
                    if (v02 != null) {
                        D7.putParcelableArray(str5, v02);
                    }
                }
                i8 = 1;
            }
            int i11 = 0;
            while (i11 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i11);
                String str6 = i11 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str);
                if (z8) {
                    bundle2 = g().C(bundle2, null);
                }
                Bundle bundle3 = bundle2;
                r().G(new E(str6, new D(bundle3), str, j8), str3);
                if (!equals) {
                    Iterator it = this.f30344e.iterator();
                    while (it.hasNext()) {
                        ((w3.t) it.next()).a(str, str2, new Bundle(bundle3), j8);
                    }
                }
                i11++;
            }
            if (q().A(false) == null || !str4.equals(str2)) {
                return;
            }
            s().C(true, true, zzb().b());
        }
    }

    public final void b1(Bundle bundle, long j8) {
        L(bundle, -20, j8);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    public final void d0(String str, String str2, Bundle bundle) {
        long a8 = zzb().a();
        Z2.r.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a8);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        j().B(new RunnableC5296b4(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    public final void e0(String str, String str2, Bundle bundle, String str3) {
        k();
        Q0(str, str2, zzb().a(), bundle, false, true, true, str3);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    public final void f0(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            q().G(bundle2, j8);
        } else {
            Q0(str3, str2, j8, bundle2, z8, !z8 || this.f30343d == null || d6.H0(str2), z7, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void g0(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            Z2.r.f(r10)
            Z2.r.f(r11)
            r9.l()
            r9.t()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L6e
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L51
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L51
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r2 = 1
            if (r11 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.z2 r0 = r9.f()
            com.google.android.gms.measurement.internal.C2 r0 = r0.f31296o
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4b
            java.lang.String r12 = "true"
        L4b:
            r0.b(r12)
            r12 = r11
        L4f:
            r11 = r1
            goto L5f
        L51:
            if (r12 != 0) goto L5f
            com.google.android.gms.measurement.internal.z2 r11 = r9.f()
            com.google.android.gms.measurement.internal.C2 r11 = r11.f31296o
            java.lang.String r0 = "unset"
            r11.b(r0)
            goto L4f
        L5f:
            com.google.android.gms.measurement.internal.n2 r0 = r9.h()
            com.google.android.gms.measurement.internal.p2 r0 = r0.I()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.c(r1, r2, r12)
        L6e:
            r4 = r11
            r7 = r12
            com.google.android.gms.measurement.internal.S2 r11 = r9.f31239a
            boolean r11 = r11.n()
            if (r11 != 0) goto L86
            com.google.android.gms.measurement.internal.n2 r10 = r9.h()
            com.google.android.gms.measurement.internal.p2 r10 = r10.I()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L86:
            com.google.android.gms.measurement.internal.S2 r11 = r9.f31239a
            boolean r11 = r11.q()
            if (r11 != 0) goto L8f
            return
        L8f:
            com.google.android.gms.measurement.internal.Y5 r11 = new com.google.android.gms.measurement.internal.Y5
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.F4 r10 = r9.r()
            r10.K(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.F3.g0(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    public final void h0(String str, String str2, Object obj, boolean z7) {
        i0(str, str2, obj, z7, zzb().a());
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0(java.lang.String r7, java.lang.String r8, java.lang.Object r9, boolean r10, long r11) {
        /*
            r6 = this;
            if (r7 != 0) goto L4
            java.lang.String r7 = "app"
        L4:
            r1 = r7
            r7 = 0
            r0 = 24
            if (r10 == 0) goto L13
            com.google.android.gms.measurement.internal.d6 r10 = r6.g()
            int r10 = r10.p0(r8)
            goto L35
        L13:
            com.google.android.gms.measurement.internal.d6 r10 = r6.g()
            java.lang.String r2 = "user property"
            boolean r3 = r10.A0(r2, r8)
            r4 = 6
            if (r3 != 0) goto L22
        L20:
            r10 = r4
            goto L35
        L22:
            java.lang.String[] r3 = w3.r.f44349a
            boolean r3 = r10.m0(r2, r3, r8)
            if (r3 != 0) goto L2d
            r10 = 15
            goto L35
        L2d:
            boolean r10 = r10.h0(r2, r0, r8)
            if (r10 != 0) goto L34
            goto L20
        L34:
            r10 = r7
        L35:
            java.lang.String r2 = "_ev"
            r3 = 1
            if (r10 == 0) goto L52
            r6.g()
            java.lang.String r9 = com.google.android.gms.measurement.internal.d6.H(r8, r0, r3)
            if (r8 == 0) goto L47
            int r7 = r8.length()
        L47:
            com.google.android.gms.measurement.internal.S2 r8 = r6.f31239a
            r8.J()
            com.google.android.gms.measurement.internal.c6 r8 = r6.f30361v
            com.google.android.gms.measurement.internal.d6.W(r8, r10, r2, r9, r7)
            return
        L52:
            if (r9 == 0) goto L91
            com.google.android.gms.measurement.internal.d6 r10 = r6.g()
            int r10 = r10.u(r8, r9)
            if (r10 == 0) goto L80
            r6.g()
            java.lang.String r8 = com.google.android.gms.measurement.internal.d6.H(r8, r0, r3)
            boolean r11 = r9 instanceof java.lang.String
            if (r11 != 0) goto L6d
            boolean r11 = r9 instanceof java.lang.CharSequence
            if (r11 == 0) goto L75
        L6d:
            java.lang.String r7 = java.lang.String.valueOf(r9)
            int r7 = r7.length()
        L75:
            com.google.android.gms.measurement.internal.S2 r9 = r6.f31239a
            r9.J()
            com.google.android.gms.measurement.internal.c6 r9 = r6.f30361v
            com.google.android.gms.measurement.internal.d6.W(r9, r10, r2, r8, r7)
            return
        L80:
            com.google.android.gms.measurement.internal.d6 r7 = r6.g()
            java.lang.Object r5 = r7.y0(r8, r9)
            if (r5 == 0) goto L90
            r0 = r6
            r2 = r8
            r3 = r11
            r0.c0(r1, r2, r3, r5)
        L90:
            return
        L91:
            r5 = 0
            r0 = r6
            r2 = r8
            r3 = r11
            r0.c0(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.F3.i0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    final /* synthetic */ void j0(List list) {
        l();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray I7 = f().I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                B5 b52 = (B5) it.next();
                if (!I7.contains(b52.f30300t) || ((Long) I7.get(b52.f30300t)).longValue() < b52.f30299s) {
                    y0().add(b52);
                }
            }
            F0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    final /* synthetic */ void k0(AtomicReference atomicReference) {
        Bundle a8 = f().f31297p.a();
        F4 r8 = r();
        if (a8 == null) {
            a8 = new Bundle();
        }
        r8.N(atomicReference, a8);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1, com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final void l0(w3.t tVar) {
        t();
        Z2.r.l(tVar);
        if (this.f30344e.add(tVar)) {
            return;
        }
        h().J().a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5451y m() {
        return super.m();
    }

    public final void m0(w3.u uVar) {
        w3.u uVar2;
        l();
        t();
        if (uVar != null && uVar != (uVar2 = this.f30343d)) {
            Z2.r.q(uVar2 == null, "EventInterceptor already set.");
        }
        this.f30343d = uVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5329g2 n() {
        return super.n();
    }

    public final Application.ActivityLifecycleCallbacks n0() {
        return this.f30342c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5322f2 o() {
        return super.o();
    }

    public final C6886b o0() {
        l();
        return r().T();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ F3 p() {
        return super.p();
    }

    public final Boolean p0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) j().t(atomicReference, 15000L, "boolean test flag value", new P3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5442w4 q() {
        return super.q();
    }

    public final Double q0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) j().t(atomicReference, 15000L, "double test flag value", new RunnableC5359k4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ F4 r() {
        return super.r();
    }

    public final Integer r0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) j().t(atomicReference, 15000L, "int test flag value", new RunnableC5338h4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5286a1
    public final /* bridge */ /* synthetic */ C5395p5 s() {
        return super.s();
    }

    public final Long s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) j().t(atomicReference, 15000L, "long test flag value", new RunnableC5345i4(this, atomicReference));
    }

    public final String t0() {
        return (String) this.f30346g.get();
    }

    public final String u0() {
        C5449x4 N7 = this.f31239a.G().N();
        if (N7 != null) {
            return N7.f31261b;
        }
        return null;
    }

    public final String v0() {
        C5449x4 N7 = this.f31239a.G().N();
        if (N7 != null) {
            return N7.f31260a;
        }
        return null;
    }

    public final String w0() {
        if (this.f31239a.K() != null) {
            return this.f31239a.K();
        }
        try {
            return new w3.n(zza(), this.f31239a.N()).b("google_app_id");
        } catch (IllegalStateException e8) {
            this.f31239a.h().E().b("getGoogleAppId failed with exception", e8);
            return null;
        }
    }

    public final String x0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) j().t(atomicReference, 15000L, "String test flag value", new Y3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5454y2
    protected final boolean y() {
        return false;
    }

    final PriorityQueue y0() {
        if (this.f30351l == null) {
            w3.x.a();
            this.f30351l = w3.w.a(Comparator$CC.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.E3
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((B5) obj).f30299s);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.H3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f30351l;
    }

    public final void z0() {
        l();
        t();
        if (a().r(G.f30436e1)) {
            F4 r8 = r();
            r8.l();
            r8.t();
            if (r8.i0() && r8.g().G0() < 242600) {
                return;
            }
            r().V();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
