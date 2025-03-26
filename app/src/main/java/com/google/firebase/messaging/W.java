package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
public class W {

    /* renamed from: e, reason: collision with root package name */
    private static W f32893e;

    /* renamed from: a, reason: collision with root package name */
    private String f32894a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f32895b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f32896c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f32897d = new ArrayDeque();

    private W() {
    }

    private int a(Context context, Intent intent) {
        ComponentName startService;
        String f8 = f(context, intent);
        if (f8 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f8);
            }
            intent.setClassName(context.getPackageName(), f8);
        }
        try {
            if (e(context)) {
                startService = h0.h(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e8) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e8);
            return 402;
        } catch (SecurityException e9) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e9);
            return 401;
        }
    }

    static synchronized W b() {
        W w7;
        synchronized (W.class) {
            try {
                if (f32893e == null) {
                    f32893e = new W();
                }
                w7 = f32893e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w7;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f32894a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f32894a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f32894a = serviceInfo.name;
                    }
                    return this.f32894a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    Intent c() {
        return (Intent) this.f32897d.poll();
    }

    boolean d(Context context) {
        if (this.f32896c == null) {
            this.f32896c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f32895b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f32896c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f32895b == null) {
            this.f32895b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f32895b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f32895b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f32897d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
