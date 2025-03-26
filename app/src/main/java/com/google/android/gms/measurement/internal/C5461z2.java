package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.A3;

/* renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5461z2 extends AbstractC5462z3 {

    /* renamed from: B, reason: collision with root package name */
    static final Pair f31282B = new Pair("", 0L);

    /* renamed from: A, reason: collision with root package name */
    public final B2 f31283A;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f31284c;

    /* renamed from: d, reason: collision with root package name */
    private Object f31285d;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f31286e;

    /* renamed from: f, reason: collision with root package name */
    public D2 f31287f;

    /* renamed from: g, reason: collision with root package name */
    public final A2 f31288g;

    /* renamed from: h, reason: collision with root package name */
    public final A2 f31289h;

    /* renamed from: i, reason: collision with root package name */
    public final C2 f31290i;

    /* renamed from: j, reason: collision with root package name */
    private String f31291j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f31292k;

    /* renamed from: l, reason: collision with root package name */
    private long f31293l;

    /* renamed from: m, reason: collision with root package name */
    public final A2 f31294m;

    /* renamed from: n, reason: collision with root package name */
    public final C5447x2 f31295n;

    /* renamed from: o, reason: collision with root package name */
    public final C2 f31296o;

    /* renamed from: p, reason: collision with root package name */
    public final B2 f31297p;

    /* renamed from: q, reason: collision with root package name */
    public final C5447x2 f31298q;

    /* renamed from: r, reason: collision with root package name */
    public final A2 f31299r;

    /* renamed from: s, reason: collision with root package name */
    public final A2 f31300s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f31301t;

    /* renamed from: u, reason: collision with root package name */
    public C5447x2 f31302u;

    /* renamed from: v, reason: collision with root package name */
    public C5447x2 f31303v;

    /* renamed from: w, reason: collision with root package name */
    public A2 f31304w;

    /* renamed from: x, reason: collision with root package name */
    public final C2 f31305x;

    /* renamed from: y, reason: collision with root package name */
    public final C2 f31306y;

    /* renamed from: z, reason: collision with root package name */
    public final A2 f31307z;

    C5461z2(S2 s22) {
        super(s22);
        this.f31285d = new Object();
        this.f31294m = new A2(this, "session_timeout", 1800000L);
        this.f31295n = new C5447x2(this, "start_new_session", true);
        this.f31299r = new A2(this, "last_pause_time", 0L);
        this.f31300s = new A2(this, "session_id", 0L);
        this.f31296o = new C2(this, "non_personalized_ads", null);
        this.f31297p = new B2(this, "last_received_uri_timestamps_by_source", null);
        this.f31298q = new C5447x2(this, "allow_remote_dynamite", false);
        this.f31288g = new A2(this, "first_open_time", 0L);
        this.f31289h = new A2(this, "app_install_time", 0L);
        this.f31290i = new C2(this, "app_instance_id", null);
        this.f31302u = new C5447x2(this, "app_backgrounded", false);
        this.f31303v = new C5447x2(this, "deep_link_retrieval_complete", false);
        this.f31304w = new A2(this, "deep_link_retrieval_attempts", 0L);
        this.f31305x = new C2(this, "firebase_feature_rollouts", null);
        this.f31306y = new C2(this, "deferred_attribution_cache", null);
        this.f31307z = new A2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f31283A = new B2(this, "default_event_parameters", null);
    }

    protected final boolean A(C5464z5 c5464z5) {
        l();
        String string = H().getString("stored_tcf_param", "");
        String g8 = c5464z5.g();
        if (g8.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = H().edit();
        edit.putString("stored_tcf_param", g8);
        edit.apply();
        return true;
    }

    final boolean B() {
        SharedPreferences sharedPreferences = this.f31284c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final void C(Boolean bool) {
        l();
        SharedPreferences.Editor edit = H().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    final void D(String str) {
        l();
        SharedPreferences.Editor edit = H().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    final void E(boolean z7) {
        l();
        h().I().b("App measurement setting deferred collection", Boolean.valueOf(z7));
        SharedPreferences.Editor edit = H().edit();
        edit.putBoolean("deferred_analytics_collection", z7);
        edit.apply();
    }

    protected final SharedPreferences F() {
        l();
        n();
        if (this.f31286e == null) {
            synchronized (this.f31285d) {
                try {
                    if (this.f31286e == null) {
                        String str = zza().getPackageName() + "_preferences";
                        h().I().b("Default prefs file", str);
                        this.f31286e = zza().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f31286e;
    }

    final void G(String str) {
        l();
        SharedPreferences.Editor edit = H().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    protected final SharedPreferences H() {
        l();
        n();
        Z2.r.l(this.f31284c);
        return this.f31284c;
    }

    final SparseArray I() {
        Bundle a8 = this.f31297p.a();
        if (a8 == null) {
            return new SparseArray();
        }
        int[] intArray = a8.getIntArray("uriSources");
        long[] longArray = a8.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            h().E().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i8 = 0; i8 < intArray.length; i8++) {
            sparseArray.put(intArray[i8], Long.valueOf(longArray[i8]));
        }
        return sparseArray;
    }

    final C5430v J() {
        l();
        return C5430v.c(H().getString("dma_consent_settings", null));
    }

    final A3 K() {
        l();
        return A3.e(H().getString("consent_settings", "G1"), H().getInt("consent_source", 100));
    }

    final Boolean L() {
        l();
        if (H().contains("use_service")) {
            return Boolean.valueOf(H().getBoolean("use_service", false));
        }
        return null;
    }

    final Boolean M() {
        l();
        if (H().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(H().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    final Boolean N() {
        l();
        if (H().contains("measurement_enabled")) {
            return Boolean.valueOf(H().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String O() {
        l();
        String string = H().getString("previous_os_version", null);
        c().n();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = H().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    final String P() {
        l();
        return H().getString("admob_app_id", null);
    }

    final String Q() {
        l();
        return H().getString("gmp_app_id", null);
    }

    final void R() {
        l();
        Boolean N7 = N();
        SharedPreferences.Editor edit = H().edit();
        edit.clear();
        edit.apply();
        if (N7 != null) {
            u(N7);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5462z3
    protected final void m() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f31284c = sharedPreferences;
        boolean z7 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f31301t = z7;
        if (!z7) {
            SharedPreferences.Editor edit = this.f31284c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f31287f = new D2(this, "health_monitor", Math.max(0L, ((Long) G.f30431d.a(null)).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5462z3
    protected final boolean r() {
        return true;
    }

    final Pair s(String str) {
        l();
        if (!K().m(A3.a.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long b8 = zzb().b();
        if (this.f31291j != null && b8 < this.f31293l) {
            return new Pair(this.f31291j, Boolean.valueOf(this.f31292k));
        }
        this.f31293l = b8 + a().A(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.f31291j = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f31291j = id;
            }
            this.f31292k = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e8) {
            h().D().b("Unable to get advertising id", e8);
            this.f31291j = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f31291j, Boolean.valueOf(this.f31292k));
    }

    final void t(SparseArray sparseArray) {
        if (sparseArray == null) {
            this.f31297p.b(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            iArr[i8] = sparseArray.keyAt(i8);
            jArr[i8] = ((Long) sparseArray.valueAt(i8)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f31297p.b(bundle);
    }

    final void u(Boolean bool) {
        l();
        SharedPreferences.Editor edit = H().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    final void v(boolean z7) {
        l();
        SharedPreferences.Editor edit = H().edit();
        edit.putBoolean("use_service", z7);
        edit.apply();
    }

    final boolean w(int i8) {
        return A3.l(i8, H().getInt("consent_source", 100));
    }

    final boolean x(long j8) {
        return j8 - this.f31294m.a() > this.f31299r.a();
    }

    final boolean y(C5430v c5430v) {
        l();
        if (!A3.l(c5430v.a(), J().a())) {
            return false;
        }
        SharedPreferences.Editor edit = H().edit();
        edit.putString("dma_consent_settings", c5430v.j());
        edit.apply();
        return true;
    }

    final boolean z(A3 a32) {
        l();
        int b8 = a32.b();
        if (!w(b8)) {
            return false;
        }
        SharedPreferences.Editor edit = H().edit();
        edit.putString("consent_settings", a32.x());
        edit.putInt("consent_source", b8);
        edit.apply();
        return true;
    }
}
