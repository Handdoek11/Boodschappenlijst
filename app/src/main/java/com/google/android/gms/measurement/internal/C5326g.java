package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import f3.InterfaceC5781e;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5326g extends AbstractC5441w3 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f30950b;

    /* renamed from: c, reason: collision with root package name */
    private String f30951c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC5340i f30952d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f30953e;

    C5326g(S2 s22) {
        super(s22);
        this.f30952d = new InterfaceC5340i() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.InterfaceC5340i
            public final String b(String str, String str2) {
                return null;
            }
        };
    }

    public static long G() {
        return ((Long) G.f30434e.a(null)).longValue();
    }

    public static long I() {
        return ((Integer) G.f30455l.a(null)).intValue();
    }

    public static long N() {
        return ((Long) G.f30380F.a(null)).longValue();
    }

    public static long O() {
        return ((Long) G.f30370A.a(null)).longValue();
    }

    private final String b(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            Z2.r.l(str3);
            return str3;
        } catch (ClassNotFoundException e8) {
            h().E().b("Could not find SystemProperties class", e8);
            return str2;
        } catch (IllegalAccessException e9) {
            h().E().b("Could not access SystemProperties.get()", e9);
            return str2;
        } catch (NoSuchMethodException e10) {
            h().E().b("Could not find SystemProperties.get() method", e10);
            return str2;
        } catch (InvocationTargetException e11) {
            h().E().b("SystemProperties.get() threw an exception", e11);
            return str2;
        }
    }

    private final Bundle s() {
        try {
            if (zza().getPackageManager() == null) {
                h().E().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c8 = h3.e.a(zza()).c(zza().getPackageName(), 128);
            if (c8 != null) {
                return c8.metaData;
            }
            h().E().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            h().E().b("Failed to load metadata: Package name not found", e8);
            return null;
        }
    }

    final long A(String str) {
        return y(str, G.f30425b);
    }

    public final String B(String str, C5294b2 c5294b2) {
        return TextUtils.isEmpty(str) ? (String) c5294b2.a(null) : (String) c5294b2.a(this.f30952d.b(str, c5294b2.b()));
    }

    final Boolean C(String str) {
        Z2.r.f(str);
        Bundle s8 = s();
        if (s8 == null) {
            h().E().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (s8.containsKey(str)) {
            return Boolean.valueOf(s8.getBoolean(str));
        }
        return null;
    }

    public final boolean D(String str, C5294b2 c5294b2) {
        return F(str, c5294b2);
    }

    final String E(String str) {
        return B(str, G.f30398O);
    }

    public final boolean F(String str, C5294b2 c5294b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c5294b2.a(null)).booleanValue();
        }
        String b8 = this.f30952d.b(str, c5294b2.b());
        return TextUtils.isEmpty(b8) ? ((Boolean) c5294b2.a(null)).booleanValue() : ((Boolean) c5294b2.a(Boolean.valueOf("1".equals(b8)))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List H(java.lang.String r4) {
        /*
            r3 = this;
            Z2.r.f(r4)
            android.os.Bundle r0 = r3.s()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.n2 r4 = r3.h()
            com.google.android.gms.measurement.internal.p2 r4 = r4.E()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.zza()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.n2 r0 = r3.h()
            com.google.android.gms.measurement.internal.p2 r0 = r0.E()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5326g.H(java.lang.String):java.util.List");
    }

    public final void J(String str) {
        this.f30951c = str;
    }

    final boolean K(String str) {
        return F(str, G.f30396N);
    }

    public final boolean L(String str) {
        return "1".equals(this.f30952d.b(str, "gaia_collection_enabled"));
    }

    public final boolean M(String str) {
        return "1".equals(this.f30952d.b(str, "measurement.event_sampling_enabled"));
    }

    public final String P() {
        return b("debug.firebase.analytics.app", "");
    }

    public final String Q() {
        return b("debug.deferred.deeplink", "");
    }

    public final String R() {
        return this.f30951c;
    }

    public final boolean S() {
        Boolean C7 = C("google_analytics_adid_collection_enabled");
        return C7 == null || C7.booleanValue();
    }

    public final boolean T() {
        Boolean C7 = C("google_analytics_automatic_screen_reporting_enabled");
        return C7 == null || C7.booleanValue();
    }

    public final boolean U() {
        Boolean C7 = C("firebase_analytics_collection_deactivated");
        return C7 != null && C7.booleanValue();
    }

    final boolean V() {
        if (this.f30950b == null) {
            Boolean C7 = C("app_measurement_lite");
            this.f30950b = C7;
            if (C7 == null) {
                this.f30950b = Boolean.FALSE;
            }
        }
        return this.f30950b.booleanValue() || !this.f31239a.r();
    }

    public final boolean W() {
        if (this.f30953e == null) {
            synchronized (this) {
                try {
                    if (this.f30953e == null) {
                        ApplicationInfo applicationInfo = zza().getApplicationInfo();
                        String a8 = f3.o.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f30953e = Boolean.valueOf(str != null && str.equals(a8));
                        }
                        if (this.f30953e == null) {
                            this.f30953e = Boolean.TRUE;
                            h().E().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f30953e.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final double m(String str, C5294b2 c5294b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c5294b2.a(null)).doubleValue();
        }
        String b8 = this.f30952d.b(str, c5294b2.b());
        if (TextUtils.isEmpty(b8)) {
            return ((Double) c5294b2.a(null)).doubleValue();
        }
        try {
            return ((Double) c5294b2.a(Double.valueOf(Double.parseDouble(b8)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c5294b2.a(null)).doubleValue();
        }
    }

    final int n(String str) {
        return o(str, G.f30390K, 500, 2000);
    }

    public final int o(String str, C5294b2 c5294b2, int i8, int i9) {
        return Math.max(Math.min(u(str, c5294b2), i9), i8);
    }

    final int p(String str, boolean z7) {
        if (z7) {
            return o(str, G.f30410U, 100, 500);
        }
        return 500;
    }

    final void q(InterfaceC5340i interfaceC5340i) {
        this.f30952d = interfaceC5340i;
    }

    public final boolean r(C5294b2 c5294b2) {
        return F(null, c5294b2);
    }

    public final int t(String str) {
        return o(str, G.f30392L, 25, 100);
    }

    public final int u(String str, C5294b2 c5294b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c5294b2.a(null)).intValue();
        }
        String b8 = this.f30952d.b(str, c5294b2.b());
        if (TextUtils.isEmpty(b8)) {
            return ((Integer) c5294b2.a(null)).intValue();
        }
        try {
            return ((Integer) c5294b2.a(Integer.valueOf(Integer.parseInt(b8)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c5294b2.a(null)).intValue();
        }
    }

    final int v(String str, boolean z7) {
        return Math.max(p(str, z7), 256);
    }

    public final int w() {
        return g().a0(201500000, true) ? 100 : 25;
    }

    public final int x(String str) {
        return u(str, G.f30465p);
    }

    public final long y(String str, C5294b2 c5294b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c5294b2.a(null)).longValue();
        }
        String b8 = this.f30952d.b(str, c5294b2.b());
        if (TextUtils.isEmpty(b8)) {
            return ((Long) c5294b2.a(null)).longValue();
        }
        try {
            return ((Long) c5294b2.a(Long.valueOf(Long.parseLong(b8)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c5294b2.a(null)).longValue();
        }
    }

    public final w3.p z(String str, boolean z7) {
        Object obj;
        Z2.r.f(str);
        Bundle s8 = s();
        if (s8 == null) {
            h().E().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = s8.get(str);
        }
        if (obj == null) {
            return w3.p.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return w3.p.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return w3.p.DENIED;
        }
        if (z7 && "eu_consent_policy".equals(obj)) {
            return w3.p.POLICY;
        }
        h().J().b("Invalid manifest metadata for", str);
        return w3.p.UNINITIALIZED;
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
