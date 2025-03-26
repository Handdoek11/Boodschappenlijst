package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
class f0 implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    private static final Object f32968w = new Object();

    /* renamed from: x, reason: collision with root package name */
    private static Boolean f32969x;

    /* renamed from: y, reason: collision with root package name */
    private static Boolean f32970y;

    /* renamed from: o, reason: collision with root package name */
    private final Context f32971o;

    /* renamed from: s, reason: collision with root package name */
    private final I f32972s;

    /* renamed from: t, reason: collision with root package name */
    private final PowerManager.WakeLock f32973t;

    /* renamed from: u, reason: collision with root package name */
    private final e0 f32974u;

    /* renamed from: v, reason: collision with root package name */
    private final long f32975v;

    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private f0 f32976a;

        public a(f0 f0Var) {
            this.f32976a = f0Var;
        }

        public void a() {
            if (f0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            f0.this.f32971o.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                f0 f0Var = this.f32976a;
                if (f0Var == null) {
                    return;
                }
                if (f0Var.i()) {
                    if (f0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f32976a.f32974u.l(this.f32976a, 0L);
                    context.unregisterReceiver(this);
                    this.f32976a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    f0(e0 e0Var, Context context, I i8, long j8) {
        this.f32974u = e0Var;
        this.f32971o = context;
        this.f32975v = j8;
        this.f32972s = i8;
        this.f32973t = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f32968w) {
            try {
                Boolean bool = f32970y;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f32970y = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z7 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z7 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z7;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f32968w) {
            try {
                Boolean bool = f32969x;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f32969x = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f32971o     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.f0.i():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f32971o)) {
            this.f32973t.acquire(AbstractC5479e.f32955a);
        }
        try {
            try {
                try {
                    this.f32974u.m(true);
                } catch (IOException e8) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e8.getMessage());
                    this.f32974u.m(false);
                    if (!h(this.f32971o)) {
                        return;
                    } else {
                        wakeLock = this.f32973t;
                    }
                }
                if (!this.f32972s.g()) {
                    this.f32974u.m(false);
                    if (h(this.f32971o)) {
                        try {
                            this.f32973t.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (f(this.f32971o) && !i()) {
                    new a(this).a();
                    if (h(this.f32971o)) {
                        try {
                            this.f32973t.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f32974u.p()) {
                    this.f32974u.m(false);
                } else {
                    this.f32974u.q(this.f32975v);
                }
                if (h(this.f32971o)) {
                    wakeLock = this.f32973t;
                    wakeLock.release();
                }
            } catch (Throwable th) {
                if (h(this.f32971o)) {
                    try {
                        this.f32973t.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
