package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.v10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4319v10 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final ApplicationInfo f27167a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f27168b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f27169c;

    C4319v10(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.f27167a = applicationInfo;
        this.f27168b = packageInfo;
        this.f27169c = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 29;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.d zzb() {
        /*
            r10 = this;
            android.content.pm.ApplicationInfo r0 = r10.f27167a
            java.lang.String r2 = r0.packageName
            android.content.pm.PackageInfo r0 = r10.f27168b
            r1 = 0
            if (r0 != 0) goto Lb
            r3 = r1
            goto L12
        Lb:
            int r0 = r0.versionCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = r0
        L12:
            android.content.pm.PackageInfo r0 = r10.f27168b
            if (r0 != 0) goto L18
            r4 = r1
            goto L1b
        L18:
            java.lang.String r0 = r0.versionName
            r4 = r0
        L1b:
            android.content.Context r0 = r10.f27169c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            com.google.android.gms.internal.ads.Yd0 r5 = G2.D0.f2566l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            h3.d r0 = h3.e.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            java.lang.CharSequence r0 = r0.d(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r5 = r0
            goto L2e
        L2d:
            r5 = r1
        L2e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r0 < r6) goto L7e
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.Ec
            com.google.android.gms.internal.ads.if r6 = D2.A.c()
            java.lang.Object r0 = r6.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7e
            android.content.Context r0 = r10.f27169c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.content.pm.InstallSourceInfo r0 = com.google.android.gms.internal.ads.AbstractC3992s10.a(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            if (r0 == 0) goto L7e
            java.lang.String r6 = com.google.android.gms.internal.ads.AbstractC4101t10.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7c
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            if (r7 == 0) goto L62
            java.lang.String r7 = "No installing package name found"
            G2.AbstractC0608p0.k(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r6 = r1
        L62:
            java.lang.String r0 = com.google.android.gms.internal.ads.AbstractC4210u10.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r7 == 0) goto L75
            java.lang.String r7 = "No initiating package name found"
            G2.AbstractC0608p0.k(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r7 = r1
            goto L8e
        L73:
            r1 = move-exception
            goto L84
        L75:
            r7 = r0
            goto L8e
        L77:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L84
        L7c:
            r0 = move-exception
            goto L81
        L7e:
            r6 = r1
            r7 = r6
            goto L8e
        L81:
            r6 = r1
            r1 = r0
            r0 = r6
        L84:
            java.lang.String r7 = "PackageInfoSignalSource.getInstallSourceInfo"
            com.google.android.gms.internal.ads.Bq r8 = C2.v.s()
            r8.x(r1, r7)
            goto L75
        L8e:
            com.google.android.gms.internal.ads.w10 r0 = new com.google.android.gms.internal.ads.w10
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.d r0 = com.google.android.gms.internal.ads.AbstractC2326ck0.h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4319v10.zzb():com.google.common.util.concurrent.d");
    }
}
