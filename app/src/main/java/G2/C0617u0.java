package G2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC2317cg;
import com.google.android.gms.internal.ads.AbstractC2426dg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1928Xb;
import com.google.android.gms.internal.ads.C4404vq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: G2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617u0 implements InterfaceC0611r0 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f2681b;

    /* renamed from: d, reason: collision with root package name */
    private com.google.common.util.concurrent.d f2683d;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f2685f;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f2686g;

    /* renamed from: i, reason: collision with root package name */
    private String f2688i;

    /* renamed from: j, reason: collision with root package name */
    private String f2689j;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2680a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f2682c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private C1928Xb f2684e = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2687h = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2690k = true;

    /* renamed from: l, reason: collision with root package name */
    private String f2691l = "-1";

    /* renamed from: m, reason: collision with root package name */
    private int f2692m = -1;

    /* renamed from: n, reason: collision with root package name */
    private C4404vq f2693n = new C4404vq("", 0);

    /* renamed from: o, reason: collision with root package name */
    private long f2694o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f2695p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f2696q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f2697r = 0;

    /* renamed from: s, reason: collision with root package name */
    private Set f2698s = Collections.emptySet();

    /* renamed from: t, reason: collision with root package name */
    private JSONObject f2699t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    private boolean f2700u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f2701v = true;

    /* renamed from: w, reason: collision with root package name */
    private String f2702w = null;

    /* renamed from: x, reason: collision with root package name */
    private String f2703x = "";

    /* renamed from: y, reason: collision with root package name */
    private boolean f2704y = false;

    /* renamed from: z, reason: collision with root package name */
    private String f2705z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f2676A = "{}";

    /* renamed from: B, reason: collision with root package name */
    private int f2677B = -1;

    /* renamed from: C, reason: collision with root package name */
    private int f2678C = -1;

    /* renamed from: D, reason: collision with root package name */
    private long f2679D = 0;

    private final void o() {
        com.google.common.util.concurrent.d dVar = this.f2683d;
        if (dVar == null || dVar.isDone()) {
            return;
        }
        try {
            this.f2683d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            H2.p.h("Interrupted while waiting for preferences loaded.", e8);
        } catch (CancellationException e9) {
            e = e9;
            H2.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e10) {
            e = e10;
            H2.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e11) {
            e = e11;
            H2.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void p() {
        AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: G2.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2669o.m();
            }
        });
    }

    @Override // G2.InterfaceC0611r0
    public final boolean H() {
        o();
        synchronized (this.f2680a) {
            try {
                SharedPreferences sharedPreferences = this.f2685f;
                boolean z7 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f2685f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f2690k) {
                    z7 = true;
                }
                return z7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final boolean J() {
        boolean z7;
        o();
        synchronized (this.f2680a) {
            z7 = this.f2704y;
        }
        return z7;
    }

    @Override // G2.InterfaceC0611r0
    public final boolean L() {
        boolean z7;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23687H0)).booleanValue()) {
            return false;
        }
        o();
        synchronized (this.f2680a) {
            z7 = this.f2690k;
        }
        return z7;
    }

    @Override // G2.InterfaceC0611r0
    public final boolean O() {
        boolean z7;
        o();
        synchronized (this.f2680a) {
            z7 = this.f2701v;
        }
        return z7;
    }

    @Override // G2.InterfaceC0611r0
    public final boolean R() {
        boolean z7;
        o();
        synchronized (this.f2680a) {
            z7 = this.f2700u;
        }
        return z7;
    }

    @Override // G2.InterfaceC0611r0
    public final void S(boolean z7) {
        o();
        synchronized (this.f2680a) {
            try {
                if (this.f2701v == z7) {
                    return;
                }
                this.f2701v = z7;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z7);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final void T(int i8) {
        o();
        synchronized (this.f2680a) {
            try {
                this.f2692m = i8;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    if (i8 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i8);
                    }
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final void U(boolean z7) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue()) {
            o();
            synchronized (this.f2680a) {
                try {
                    if (this.f2704y == z7) {
                        return;
                    }
                    this.f2704y = z7;
                    SharedPreferences.Editor editor = this.f2686g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z7);
                        this.f2686g.apply();
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final void V(boolean z7) {
        o();
        synchronized (this.f2680a) {
            try {
                if (this.f2700u == z7) {
                    return;
                }
                this.f2700u = z7;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z7);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final void W(String str) {
        o();
        synchronized (this.f2680a) {
            try {
                this.f2691l = str;
                if (this.f2686g != null) {
                    if (str.equals("-1")) {
                        this.f2686g.remove("IABTCF_TCString");
                    } else {
                        this.f2686g.putString("IABTCF_TCString", str);
                    }
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final void X(final Context context) {
        synchronized (this.f2680a) {
            try {
                if (this.f2685f != null) {
                    return;
                }
                final String str = "admob";
                this.f2683d = AbstractC1497Kq.f16644a.k(new Runnable(context, str) { // from class: G2.t0

                    /* renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ Context f2673s;

                    /* renamed from: t, reason: collision with root package name */
                    public final /* synthetic */ String f2674t = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2672o.n(this.f2673s, this.f2674t);
                    }
                });
                this.f2681b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final void Y(String str) {
        o();
        synchronized (this.f2680a) {
            try {
                long a8 = C2.v.c().a();
                if (str != null && !str.equals(this.f2693n.c())) {
                    this.f2693n = new C4404vq(str, a8);
                    SharedPreferences.Editor editor = this.f2686g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f2686g.putLong("app_settings_last_update_ms", a8);
                        this.f2686g.apply();
                    }
                    p();
                    Iterator it = this.f2682c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f2693n.g(a8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final void Z(String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.q9)).booleanValue()) {
            o();
            synchronized (this.f2680a) {
                try {
                    if (this.f2676A.equals(str)) {
                        return;
                    }
                    this.f2676A = str;
                    SharedPreferences.Editor editor = this.f2686g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f2686g.apply();
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final int a() {
        int i8;
        o();
        synchronized (this.f2680a) {
            i8 = this.f2696q;
        }
        return i8;
    }

    @Override // G2.InterfaceC0611r0
    public final void a0(Runnable runnable) {
        this.f2682c.add(runnable);
    }

    @Override // G2.InterfaceC0611r0
    public final long b() {
        long j8;
        o();
        synchronized (this.f2680a) {
            j8 = this.f2695p;
        }
        return j8;
    }

    @Override // G2.InterfaceC0611r0
    public final void b0(String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue()) {
            o();
            synchronized (this.f2680a) {
                try {
                    if (this.f2705z.equals(str)) {
                        return;
                    }
                    this.f2705z = str;
                    SharedPreferences.Editor editor = this.f2686g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f2686g.apply();
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final long c() {
        long j8;
        o();
        synchronized (this.f2680a) {
            j8 = this.f2679D;
        }
        return j8;
    }

    @Override // G2.InterfaceC0611r0
    public final void c0(long j8) {
        o();
        synchronized (this.f2680a) {
            try {
                if (this.f2679D == j8) {
                    return;
                }
                this.f2679D = j8;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j8);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final long d() {
        long j8;
        o();
        synchronized (this.f2680a) {
            j8 = this.f2694o;
        }
        return j8;
    }

    @Override // G2.InterfaceC0611r0
    public final void d0(int i8) {
        o();
        synchronized (this.f2680a) {
            try {
                if (this.f2697r == i8) {
                    return;
                }
                this.f2697r = i8;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putInt("version_code", i8);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final C4404vq e() {
        C4404vq c4404vq;
        synchronized (this.f2680a) {
            c4404vq = this.f2693n;
        }
        return c4404vq;
    }

    @Override // G2.InterfaceC0611r0
    public final void e0(String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue()) {
            o();
            synchronized (this.f2680a) {
                try {
                    if (this.f2703x.equals(str)) {
                        return;
                    }
                    this.f2703x = str;
                    SharedPreferences.Editor editor = this.f2686g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f2686g.apply();
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final String f() {
        String str;
        o();
        synchronized (this.f2680a) {
            str = this.f2705z;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        r3.put("timestamp_ms", C2.v.c().a());
        r1.put(r2, r3);
        r7.f2699t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        H2.p.h("Could not update native advanced settings", r8);
     */
    @Override // G2.InterfaceC0611r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r7.o()
            java.lang.Object r0 = r7.f2680a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f2699t     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L8c
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = r3
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "timestamp_ms"
            f3.e r10 = C2.v.c()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            long r4 = r10.a()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            org.json.JSONObject r9 = r7.f2699t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            goto L73
        L6d:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            H2.p.h(r9, r8)     // Catch: java.lang.Throwable -> L14
        L73:
            android.content.SharedPreferences$Editor r8 = r7.f2686g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L87
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f2699t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.f2686g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L87:
            r7.p()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.C0617u0.f0(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // G2.InterfaceC0611r0
    public final C4404vq g() {
        C4404vq c4404vq;
        o();
        synchronized (this.f2680a) {
            try {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.Ab)).booleanValue() && this.f2693n.j()) {
                    Iterator it = this.f2682c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c4404vq = this.f2693n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4404vq;
    }

    @Override // G2.InterfaceC0611r0
    public final void g0(long j8) {
        o();
        synchronized (this.f2680a) {
            try {
                if (this.f2695p == j8) {
                    return;
                }
                this.f2695p = j8;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j8);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final String h() {
        String str;
        o();
        synchronized (this.f2680a) {
            str = this.f2702w;
        }
        return str;
    }

    @Override // G2.InterfaceC0611r0
    public final void h0(String str) {
        o();
        synchronized (this.f2680a) {
            try {
                if (TextUtils.equals(this.f2702w, str)) {
                    return;
                }
                this.f2702w = str;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final String i() {
        String str;
        o();
        synchronized (this.f2680a) {
            str = this.f2703x;
        }
        return str;
    }

    @Override // G2.InterfaceC0611r0
    public final void i0(int i8) {
        o();
        synchronized (this.f2680a) {
            try {
                if (this.f2696q == i8) {
                    return;
                }
                this.f2696q = i8;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i8);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final String j() {
        String str;
        o();
        synchronized (this.f2680a) {
            str = this.f2676A;
        }
        return str;
    }

    @Override // G2.InterfaceC0611r0
    public final void j0(long j8) {
        o();
        synchronized (this.f2680a) {
            try {
                if (this.f2694o == j8) {
                    return;
                }
                this.f2694o = j8;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j8);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final String k() {
        o();
        return this.f2691l;
    }

    @Override // G2.InterfaceC0611r0
    public final void k0(int i8) {
        o();
        synchronized (this.f2680a) {
            try {
                if (this.f2678C == i8) {
                    return;
                }
                this.f2678C = i8;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i8);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final JSONObject l() {
        JSONObject jSONObject;
        o();
        synchronized (this.f2680a) {
            jSONObject = this.f2699t;
        }
        return jSONObject;
    }

    @Override // G2.InterfaceC0611r0
    public final void l0(boolean z7) {
        o();
        synchronized (this.f2680a) {
            try {
                if (z7 == this.f2690k) {
                    return;
                }
                this.f2690k = z7;
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z7);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1928Xb m() {
        if (!this.f2681b) {
            return null;
        }
        if ((R() && O()) || !((Boolean) AbstractC2317cg.f21264b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.f2680a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f2684e == null) {
                    this.f2684e = new C1928Xb();
                }
                this.f2684e.d();
                H2.p.f("start fetching content...");
                return this.f2684e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final void m0(boolean z7) {
        o();
        synchronized (this.f2680a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) D2.A.c().a(AbstractC3184kf.qa)).longValue();
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z7);
                    this.f2686g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void n(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (this.f2680a) {
                try {
                    this.f2685f = sharedPreferences;
                    this.f2686g = edit;
                    if (f3.m.g()) {
                        NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    }
                    this.f2687h = this.f2685f.getBoolean("use_https", this.f2687h);
                    this.f2700u = this.f2685f.getBoolean("content_url_opted_out", this.f2700u);
                    this.f2688i = this.f2685f.getString("content_url_hashes", this.f2688i);
                    this.f2690k = this.f2685f.getBoolean("gad_idless", this.f2690k);
                    this.f2701v = this.f2685f.getBoolean("content_vertical_opted_out", this.f2701v);
                    this.f2689j = this.f2685f.getString("content_vertical_hashes", this.f2689j);
                    this.f2697r = this.f2685f.getInt("version_code", this.f2697r);
                    if (((Boolean) AbstractC2426dg.f21632g.e()).booleanValue() && D2.A.c().e()) {
                        this.f2693n = new C4404vq("", 0L);
                    } else {
                        this.f2693n = new C4404vq(this.f2685f.getString("app_settings_json", this.f2693n.c()), this.f2685f.getLong("app_settings_last_update_ms", this.f2693n.a()));
                    }
                    this.f2694o = this.f2685f.getLong("app_last_background_time_ms", this.f2694o);
                    this.f2696q = this.f2685f.getInt("request_in_session_count", this.f2696q);
                    this.f2695p = this.f2685f.getLong("first_ad_req_time_ms", this.f2695p);
                    this.f2698s = this.f2685f.getStringSet("never_pool_slots", this.f2698s);
                    this.f2702w = this.f2685f.getString("display_cutout", this.f2702w);
                    this.f2677B = this.f2685f.getInt("app_measurement_npa", this.f2677B);
                    this.f2678C = this.f2685f.getInt("sd_app_measure_npa", this.f2678C);
                    this.f2679D = this.f2685f.getLong("sd_app_measure_npa_ts", this.f2679D);
                    this.f2703x = this.f2685f.getString("inspector_info", this.f2703x);
                    this.f2704y = this.f2685f.getBoolean("linked_device", this.f2704y);
                    this.f2705z = this.f2685f.getString("linked_ad_unit", this.f2705z);
                    this.f2676A = this.f2685f.getString("inspector_ui_storage", this.f2676A);
                    this.f2691l = this.f2685f.getString("IABTCF_TCString", this.f2691l);
                    this.f2692m = this.f2685f.getInt("gad_has_consent_for_cookies", this.f2692m);
                    try {
                        this.f2699t = new JSONObject(this.f2685f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e8) {
                        H2.p.h("Could not convert native advanced settings to json object", e8);
                    }
                    p();
                } finally {
                }
            }
        } catch (Throwable th) {
            C2.v.s().x(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            AbstractC0608p0.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // G2.InterfaceC0611r0
    public final void q() {
        o();
        synchronized (this.f2680a) {
            try {
                this.f2699t = new JSONObject();
                SharedPreferences.Editor editor = this.f2686g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f2686g.apply();
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G2.InterfaceC0611r0
    public final int zza() {
        int i8;
        o();
        synchronized (this.f2680a) {
            i8 = this.f2697r;
        }
        return i8;
    }

    @Override // G2.InterfaceC0611r0
    public final int zzb() {
        o();
        return this.f2692m;
    }
}
