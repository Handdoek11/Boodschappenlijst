package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.Ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137Ao {

    /* renamed from: A, reason: collision with root package name */
    private int f13627A;

    /* renamed from: B, reason: collision with root package name */
    private final String f13628B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f13629C;

    /* renamed from: a, reason: collision with root package name */
    private int f13630a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13631b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13632c;

    /* renamed from: d, reason: collision with root package name */
    private int f13633d;

    /* renamed from: e, reason: collision with root package name */
    private int f13634e;

    /* renamed from: f, reason: collision with root package name */
    private int f13635f;

    /* renamed from: g, reason: collision with root package name */
    private String f13636g;

    /* renamed from: h, reason: collision with root package name */
    private int f13637h;

    /* renamed from: i, reason: collision with root package name */
    private int f13638i;

    /* renamed from: j, reason: collision with root package name */
    private int f13639j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13640k;

    /* renamed from: l, reason: collision with root package name */
    private int f13641l;

    /* renamed from: m, reason: collision with root package name */
    private double f13642m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13643n;

    /* renamed from: o, reason: collision with root package name */
    private String f13644o;

    /* renamed from: p, reason: collision with root package name */
    private String f13645p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f13646q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f13647r;

    /* renamed from: s, reason: collision with root package name */
    private final String f13648s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f13649t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f13650u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f13651v;

    /* renamed from: w, reason: collision with root package name */
    private final String f13652w;

    /* renamed from: x, reason: collision with root package name */
    private final String f13653x;

    /* renamed from: y, reason: collision with root package name */
    private float f13654y;

    /* renamed from: z, reason: collision with root package name */
    private int f13655z;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1137Ao(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.AbstractC3184kf.a(r7)
            r6.c(r7)
            r6.e(r7)
            r6.d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = r3
            goto L24
        L23:
            r2 = r4
        L24:
            r6.f13646q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = r4
        L30:
            r6.f13647r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f13648s = r2
            C2.v.t()
            D2.C0555y.b()
            boolean r2 = H2.g.v()
            r6.f13649t = r2
            boolean r2 = f3.i.c(r7)
            r6.f13650u = r2
            boolean r2 = f3.i.d(r7)
            r6.f13651v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f13652w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L63
        L61:
            r0 = r2
            goto L8a
        L63:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L68
            goto L61
        L68:
            h3.d r3 = h3.e.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.PackageInfo r3 = r3.f(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 == 0) goto L61
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
        L8a:
            r6.f13653x = r0
            h3.d r0 = h3.e.a(r7)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.f(r3, r4)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto Lb0
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r4.<init>()     // Catch: java.lang.Exception -> Lb0
            r4.append(r3)     // Catch: java.lang.Exception -> Lb0
            r4.append(r1)     // Catch: java.lang.Exception -> Lb0
            r4.append(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            r6.f13628B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lb9
            goto Lcb
        Lb9:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto Lcb
            float r0 = r7.density
            r6.f13654y = r0
            int r0 = r7.widthPixels
            r6.f13655z = r0
            int r7 = r7.heightPixels
            r6.f13627A = r7
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1137Ao.<init>(android.content.Context):void");
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C2.v.s().x(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f13630a = audioManager.getMode();
                this.f13631b = audioManager.isMusicActive();
                this.f13632c = audioManager.isSpeakerphoneOn();
                this.f13633d = audioManager.getStreamVolume(3);
                this.f13634e = audioManager.getRingerMode();
                this.f13635f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C2.v.s().x(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f13630a = -2;
        this.f13631b = false;
        this.f13632c = false;
        this.f13633d = 0;
        this.f13634e = 2;
        this.f13635f = 0;
    }

    private final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) D2.A.c().a(AbstractC3184kf.Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver == null) {
            this.f13642m = -1.0d;
            this.f13643n = false;
        } else {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f13642m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            this.f13643n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f13636g = r2
            boolean r2 = f3.m.l()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.AbstractC3184kf.z8
            com.google.android.gms.internal.ads.if r4 = D2.A.c()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f13638i = r2
            int r0 = r0.getPhoneType()
            r5.f13639j = r0
            r0 = -2
            r5.f13637h = r0
            r5.f13640k = r3
            r0 = -1
            r5.f13641l = r0
            C2.v.t()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = G2.D0.b(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.f13637h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f13641l = r6
            goto L69
        L67:
            r5.f13637h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f13640k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1137Ao.e(android.content.Context):void");
    }

    public final C1173Bo a() {
        return new C1173Bo(this.f13630a, this.f13646q, this.f13647r, this.f13636g, this.f13648s, this.f13649t, this.f13650u, this.f13651v, this.f13631b, this.f13632c, this.f13652w, this.f13653x, this.f13628B, this.f13633d, this.f13637h, this.f13638i, this.f13639j, this.f13634e, this.f13635f, this.f13654y, this.f13655z, this.f13627A, this.f13642m, this.f13643n, this.f13640k, this.f13641l, this.f13644o, this.f13629C, this.f13645p);
    }

    public C1137Ao(Context context, C1173Bo c1173Bo) {
        AbstractC3184kf.a(context);
        c(context);
        e(context);
        d(context);
        this.f13644o = Build.FINGERPRINT;
        this.f13645p = Build.DEVICE;
        this.f13629C = C1517Lf.g(context);
        this.f13646q = c1173Bo.f13862a;
        this.f13647r = c1173Bo.f13863b;
        this.f13648s = c1173Bo.f13864c;
        this.f13649t = c1173Bo.f13865d;
        this.f13650u = c1173Bo.f13866e;
        this.f13651v = c1173Bo.f13867f;
        this.f13652w = c1173Bo.f13868g;
        this.f13653x = c1173Bo.f13869h;
        this.f13628B = c1173Bo.f13870i;
        this.f13654y = c1173Bo.f13873l;
        this.f13655z = c1173Bo.f13874m;
        this.f13627A = c1173Bo.f13875n;
    }
}
