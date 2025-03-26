package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3490nP implements PP, YO {

    /* renamed from: a, reason: collision with root package name */
    private final C4797zP f24930a;

    /* renamed from: b, reason: collision with root package name */
    private final QP f24931b;

    /* renamed from: c, reason: collision with root package name */
    private final ZO f24932c;

    /* renamed from: d, reason: collision with root package name */
    private final C2947iP f24933d;

    /* renamed from: e, reason: collision with root package name */
    private final XO f24934e;

    /* renamed from: f, reason: collision with root package name */
    private final LP f24935f;

    /* renamed from: g, reason: collision with root package name */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC4361vP f24936g;

    /* renamed from: h, reason: collision with root package name */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC4361vP f24937h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24938i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f24939j;

    /* renamed from: k, reason: collision with root package name */
    private final String f24940k;

    /* renamed from: p, reason: collision with root package name */
    private JSONObject f24945p;

    /* renamed from: s, reason: collision with root package name */
    private boolean f24948s;

    /* renamed from: t, reason: collision with root package name */
    private int f24949t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f24950u;

    /* renamed from: l, reason: collision with root package name */
    private final Map f24941l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final Map f24942m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private final Map f24943n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private String f24944o = "{}";

    /* renamed from: q, reason: collision with root package name */
    private long f24946q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    private EnumC3054jP f24947r = EnumC3054jP.NONE;

    /* renamed from: v, reason: collision with root package name */
    private EnumC3381mP f24951v = EnumC3381mP.UNKNOWN;

    /* renamed from: w, reason: collision with root package name */
    private long f24952w = 0;

    /* renamed from: x, reason: collision with root package name */
    private String f24953x = "";

    C3490nP(C4797zP c4797zP, QP qp, ZO zo, Context context, H2.a aVar, C2947iP c2947iP, LP lp, SharedPreferencesOnSharedPreferenceChangeListenerC4361vP sharedPreferencesOnSharedPreferenceChangeListenerC4361vP, SharedPreferencesOnSharedPreferenceChangeListenerC4361vP sharedPreferencesOnSharedPreferenceChangeListenerC4361vP2, String str) {
        this.f24930a = c4797zP;
        this.f24931b = qp;
        this.f24932c = zo;
        this.f24934e = new XO(context);
        this.f24938i = aVar.f2914o;
        this.f24940k = str;
        this.f24933d = c2947iP;
        this.f24935f = lp;
        this.f24936g = sharedPreferencesOnSharedPreferenceChangeListenerC4361vP;
        this.f24937h = sharedPreferencesOnSharedPreferenceChangeListenerC4361vP2;
        this.f24939j = context;
        C2.v.w().g(this);
    }

    private final synchronized void A() {
        int ordinal = this.f24947r.ordinal();
        if (ordinal == 1) {
            this.f24931b.c();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f24932c.c();
        }
    }

    private final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            y(jSONObject.optBoolean("isTestMode", false), false);
            x((EnumC3054jP) Enum.valueOf(EnumC3054jP.class, jSONObject.optString("gesture", "NONE")), false);
            this.f24944o = jSONObject.optString("networkExtras", "{}");
            this.f24946q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject u() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f24941l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (C2186bP c2186bP : (List) entry.getValue()) {
                    if (c2186bP.e()) {
                        jSONArray.put(c2186bP.b());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void v() {
        this.f24950u = true;
        this.f24933d.c();
        this.f24930a.c(this);
        this.f24931b.d(this);
        this.f24932c.d(this);
        this.f24935f.w7(this);
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.r9;
        if (!TextUtils.isEmpty((CharSequence) D2.A.c().a(abstractC2207bf))) {
            this.f24936g.b(PreferenceManager.getDefaultSharedPreferences(this.f24939j), Arrays.asList(((String) D2.A.c().a(abstractC2207bf)).split(",")));
        }
        AbstractC2207bf abstractC2207bf2 = AbstractC3184kf.s9;
        if (!TextUtils.isEmpty((CharSequence) D2.A.c().a(abstractC2207bf2))) {
            this.f24937h.b(this.f24939j.getSharedPreferences("admob", 0), Arrays.asList(((String) D2.A.c().a(abstractC2207bf2)).split(",")));
        }
        a(C2.v.s().j().i());
        this.f24953x = C2.v.s().j().j();
    }

    private final void w() {
        C2.v.s().j().e0(e());
    }

    private final synchronized void x(EnumC3054jP enumC3054jP, boolean z7) {
        try {
            if (this.f24947r != enumC3054jP) {
                if (r()) {
                    z();
                }
                this.f24947r = enumC3054jP;
                if (r()) {
                    A();
                }
                if (z7) {
                    w();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void y(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f24948s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f24948s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.AbstractC3184kf.d9     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.if r0 = D2.A.c()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            G2.z r2 = C2.v.w()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.l()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.A()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.r()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.z()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.w()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3490nP.y(boolean, boolean):void");
    }

    private final synchronized void z() {
        int ordinal = this.f24947r.ordinal();
        if (ordinal == 1) {
            this.f24931b.b();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f24932c.b();
        }
    }

    public final EnumC3054jP b() {
        return this.f24947r;
    }

    public final synchronized com.google.common.util.concurrent.d c(String str) {
        C1811Tq c1811Tq;
        try {
            c1811Tq = new C1811Tq();
            if (this.f24942m.containsKey(str)) {
                c1811Tq.c((C2186bP) this.f24942m.get(str));
            } else {
                if (!this.f24943n.containsKey(str)) {
                    this.f24943n.put(str, new ArrayList());
                }
                ((List) this.f24943n.get(str)).add(c1811Tq);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1811Tq;
    }

    public final synchronized String d() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue() && r()) {
            if (this.f24946q < C2.v.c().a() / 1000) {
                this.f24944o = "{}";
                this.f24946q = Long.MAX_VALUE;
                return "";
            }
            if (!this.f24944o.equals("{}")) {
                return this.f24944o;
            }
        }
        return "";
    }

    public final synchronized String e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f24948s);
            jSONObject.put("gesture", this.f24947r);
            if (this.f24946q > C2.v.c().a() / 1000) {
                jSONObject.put("networkExtras", this.f24944o);
                jSONObject.put("networkExtrasExpirationSecs", this.f24946q);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject f() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.f24940k)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.f24940k);
                }
                jSONObject.put("internalSdkVersion", this.f24938i);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f24933d.a());
                if (((Boolean) D2.A.c().a(AbstractC3184kf.o9)).booleanValue()) {
                    String o8 = C2.v.s().o();
                    if (!TextUtils.isEmpty(o8)) {
                        jSONObject.put("plugin", o8);
                    }
                }
                if (this.f24946q < C2.v.c().a() / 1000) {
                    this.f24944o = "{}";
                }
                jSONObject.put("networkExtras", this.f24944o);
                jSONObject.put("adSlots", u());
                jSONObject.put("appInfo", this.f24934e.a());
                String c8 = C2.v.s().j().g().c();
                if (!TextUtils.isEmpty(c8)) {
                    jSONObject.put("cld", new JSONObject(c8));
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.e9)).booleanValue() && (jSONObject2 = this.f24945p) != null) {
                    H2.p.b("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.f24945p);
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue()) {
                    jSONObject.put("openAction", this.f24951v);
                    jSONObject.put("gesture", this.f24947r);
                }
                jSONObject.put("isGamRegisteredTestDevice", C2.v.w().l());
                C2.v.t();
                C0555y.b();
                jSONObject.put("isSimulator", H2.g.v());
                if (((Boolean) D2.A.c().a(AbstractC3184kf.q9)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.f24953x));
                }
                if (!TextUtils.isEmpty((CharSequence) D2.A.c().a(AbstractC3184kf.s9))) {
                    jSONObject.put("gmaDisk", this.f24937h.a());
                }
                if (!TextUtils.isEmpty((CharSequence) D2.A.c().a(AbstractC3184kf.r9))) {
                    jSONObject.put("userDisk", this.f24936g.a());
                }
            } catch (JSONException e8) {
                C2.v.s().w(e8, "Inspector.toJson");
                H2.p.h("Ad inspector encountered an error", e8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void g(String str, C2186bP c2186bP) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue() && r()) {
            if (this.f24949t >= ((Integer) D2.A.c().a(AbstractC3184kf.Q8)).intValue()) {
                H2.p.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f24941l.containsKey(str)) {
                this.f24941l.put(str, new ArrayList());
            }
            this.f24949t++;
            ((List) this.f24941l.get(str)).add(c2186bP);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.m9)).booleanValue()) {
                String a8 = c2186bP.a();
                this.f24942m.put(a8, c2186bP);
                if (this.f24943n.containsKey(a8)) {
                    List list = (List) this.f24943n.get(a8);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1811Tq) it.next()).c(c2186bP);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void h() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue() && C2.v.s().j().J()) {
                v();
                return;
            }
            String i8 = C2.v.s().j().i();
            if (TextUtils.isEmpty(i8)) {
                return;
            }
            try {
                if (new JSONObject(i8).optBoolean("isTestMode", false)) {
                    v();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void i(D2.H0 h02, EnumC3381mP enumC3381mP) {
        if (!r()) {
            try {
                h02.A5(AbstractC3351m70.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                H2.p.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue()) {
            this.f24951v = enumC3381mP;
            this.f24930a.e(h02, new C3192kj(this), new C2432dj(this.f24935f), new C1697Qi(this));
            return;
        } else {
            try {
                h02.A5(AbstractC3351m70.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                H2.p.g("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void j(String str, long j8) {
        this.f24944o = str;
        this.f24946q = j8;
        w();
    }

    public final synchronized void k(String str) {
        this.f24953x = str;
        C2.v.s().j().Z(this.f24953x);
    }

    public final synchronized void l(long j8) {
        this.f24952w += j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f24950u
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.v()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.f24948s
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.A()
            return
        L15:
            boolean r2 = r1.r()
            if (r2 != 0) goto L1e
            r1.z()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3490nP.m(boolean):void");
    }

    public final void n(EnumC3054jP enumC3054jP) {
        x(enumC3054jP, true);
    }

    public final synchronized void o(JSONObject jSONObject) {
        this.f24945p = jSONObject;
    }

    public final void p(boolean z7) {
        if (!this.f24950u && z7) {
            v();
        }
        y(z7, true);
    }

    public final boolean q() {
        return this.f24945p != null;
    }

    public final synchronized boolean r() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue()) {
            return this.f24948s || C2.v.w().l();
        }
        return this.f24948s;
    }

    public final synchronized boolean s() {
        return this.f24948s;
    }

    public final boolean t() {
        return this.f24952w < ((Long) D2.A.c().a(AbstractC3184kf.j9)).longValue();
    }
}
