package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import g3.ThreadFactoryC5803b;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class a0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final long f32931o;

    /* renamed from: s, reason: collision with root package name */
    private final PowerManager.WakeLock f32932s;

    /* renamed from: t, reason: collision with root package name */
    private final FirebaseMessaging f32933t;

    /* renamed from: u, reason: collision with root package name */
    ExecutorService f32934u = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5803b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private a0 f32935a;

        public a(a0 a0Var) {
            this.f32935a = a0Var;
        }

        public void a() {
            if (a0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f32935a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a0 a0Var = this.f32935a;
            if (a0Var != null && a0Var.d()) {
                if (a0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f32935a.f32933t.l(this.f32935a, 0L);
                this.f32935a.b().unregisterReceiver(this);
                this.f32935a = null;
            }
        }
    }

    public a0(FirebaseMessaging firebaseMessaging, long j8) {
        this.f32933t = firebaseMessaging;
        this.f32931o = j8;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f32932s = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    Context b() {
        return this.f32933t.m();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() {
        try {
            if (this.f32933t.k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e8) {
            if (!D.h(e8.getMessage())) {
                if (e8.getMessage() != null) {
                    throw e8;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e8.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (W.b().e(b())) {
            this.f32932s.acquire();
        }
        try {
            try {
                this.f32933t.G(true);
            } catch (IOException e8) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e8.getMessage() + ". Won't retry the operation.");
                this.f32933t.G(false);
                if (!W.b().e(b())) {
                    return;
                }
            }
            if (!this.f32933t.x()) {
                this.f32933t.G(false);
                if (W.b().e(b())) {
                    this.f32932s.release();
                    return;
                }
                return;
            }
            if (W.b().d(b()) && !d()) {
                new a(this).a();
                if (W.b().e(b())) {
                    this.f32932s.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f32933t.G(false);
            } else {
                this.f32933t.K(this.f32931o);
            }
            if (!W.b().e(b())) {
                return;
            }
            this.f32932s.release();
        } catch (Throwable th) {
            if (W.b().e(b())) {
                this.f32932s.release();
            }
            throw th;
        }
    }
}
