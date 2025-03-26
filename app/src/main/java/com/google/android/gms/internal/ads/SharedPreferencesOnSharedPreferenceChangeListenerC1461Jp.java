package com.google.android.gms.internal.ads;

import G2.AbstractC0585e;
import G2.InterfaceC0611r0;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: com.google.android.gms.internal.ads.Jp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1461Jp implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: o, reason: collision with root package name */
    private final Context f16309o;

    /* renamed from: s, reason: collision with root package name */
    private final SharedPreferences f16310s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC0611r0 f16311t;

    /* renamed from: u, reason: collision with root package name */
    private String f16312u = "-1";

    /* renamed from: v, reason: collision with root package name */
    private int f16313v = -1;

    SharedPreferencesOnSharedPreferenceChangeListenerC1461Jp(Context context, InterfaceC0611r0 interfaceC0611r0) {
        this.f16310s = PreferenceManager.getDefaultSharedPreferences(context);
        this.f16311t = interfaceC0611r0;
        this.f16309o = context;
    }

    private final void b() {
        this.f16311t.l0(true);
        AbstractC0585e.c(this.f16309o);
    }

    private final void c(String str, int i8) {
        Context context;
        boolean z7 = true;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23703J0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i8 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z7 = false;
        }
        this.f16311t.l0(z7);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23854b6)).booleanValue() && z7 && (context = this.f16309o) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    final void a() {
        this.f16310s.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f16310s, "gad_has_consent_for_cookies");
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23719L0)).booleanValue()) {
            onSharedPreferenceChanged(this.f16310s, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(this.f16310s, "IABTCF_PurposeConsents");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.f23719L0     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "-1"
            r3 = -1
            java.lang.String r4 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L59
            boolean r0 = j$.util.Objects.equals(r10, r4)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L38
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L2f
            G2.r0 r10 = r8.f16311t     // Catch: java.lang.Throwable -> L2f
            int r10 = r10.zzb()     // Catch: java.lang.Throwable -> L2f
            if (r9 == r10) goto L32
            r8.b()     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r9 = move-exception
            goto Lbd
        L32:
            G2.r0 r10 = r8.f16311t     // Catch: java.lang.Throwable -> L2f
            r10.T(r9)     // Catch: java.lang.Throwable -> L2f
            return
        L38:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = j$.util.Objects.equals(r10, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto Lbc
            java.lang.String r9 = r9.getString(r10, r2)     // Catch: java.lang.Throwable -> L2f
            G2.r0 r10 = r8.f16311t     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = r10.k()     // Catch: java.lang.Throwable -> L2f
            boolean r10 = j$.util.Objects.equals(r9, r10)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto L53
            r8.b()     // Catch: java.lang.Throwable -> L2f
        L53:
            G2.r0 r10 = r8.f16311t     // Catch: java.lang.Throwable -> L2f
            r10.W(r9)     // Catch: java.lang.Throwable -> L2f
            return
        L59:
            java.lang.String r1 = r9.getString(r0, r2)     // Catch: java.lang.Throwable -> L2f
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L2f
            int r5 = r10.hashCode()     // Catch: java.lang.Throwable -> L2f
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L7d
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L75
            goto L85
        L75:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L85
            r10 = r7
            goto L86
        L7d:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L85
            r10 = 0
            goto L86
        L85:
            r10 = r3
        L86:
            if (r10 == 0) goto La9
            if (r10 == r7) goto L8b
            goto Lbc
        L8b:
            com.google.android.gms.internal.ads.bf r10 = com.google.android.gms.internal.ads.AbstractC3184kf.f23703J0     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.if r0 = D2.A.c()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r0.a(r10)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2f
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r10 == 0) goto Lbc
            if (r9 == r3) goto Lbc
            int r10 = r8.f16313v     // Catch: java.lang.Throwable -> L2f
            if (r10 == r9) goto Lbc
            r8.f16313v = r9     // Catch: java.lang.Throwable -> L2f
            r8.c(r1, r9)     // Catch: java.lang.Throwable -> L2f
            return
        La9:
            boolean r10 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto Lbc
            java.lang.String r10 = r8.f16312u     // Catch: java.lang.Throwable -> L2f
            boolean r10 = r10.equals(r1)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto Lbc
            r8.f16312u = r1     // Catch: java.lang.Throwable -> L2f
            r8.c(r1, r9)     // Catch: java.lang.Throwable -> L2f
        Lbc:
            return
        Lbd:
            java.lang.String r10 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            com.google.android.gms.internal.ads.Bq r0 = C2.v.s()
            r0.x(r9, r10)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            G2.AbstractC0608p0.l(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1461Jp.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
