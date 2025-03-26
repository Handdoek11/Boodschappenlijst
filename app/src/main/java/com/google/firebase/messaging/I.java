package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes2.dex */
class I {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32875a;

    /* renamed from: b, reason: collision with root package name */
    private String f32876b;

    /* renamed from: c, reason: collision with root package name */
    private String f32877c;

    /* renamed from: d, reason: collision with root package name */
    private int f32878d;

    /* renamed from: e, reason: collision with root package name */
    private int f32879e = 0;

    I(Context context) {
        this.f32875a = context;
    }

    static String c(com.google.firebase.f fVar) {
        String d8 = fVar.n().d();
        if (d8 != null) {
            return d8;
        }
        String c8 = fVar.n().c();
        if (!c8.startsWith("1:")) {
            return c8;
        }
        String[] split = c8.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f32875a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("FirebaseMessaging", "Failed to find package " + e8);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f8 = f(this.f32875a.getPackageName());
        if (f8 != null) {
            this.f32876b = Integer.toString(f8.versionCode);
            this.f32877c = f8.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f32876b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32876b;
    }

    synchronized String b() {
        try {
            if (this.f32877c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32877c;
    }

    synchronized int d() {
        PackageInfo f8;
        try {
            if (this.f32878d == 0 && (f8 = f("com.google.android.gms")) != null) {
                this.f32878d = f8.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32878d;
    }

    synchronized int e() {
        int i8 = this.f32879e;
        if (i8 != 0) {
            return i8;
        }
        PackageManager packageManager = this.f32875a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!f3.m.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f32879e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f32879e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (f3.m.i()) {
            this.f32879e = 2;
        } else {
            this.f32879e = 1;
        }
        return this.f32879e;
    }

    boolean g() {
        return e() != 0;
    }
}
