package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.C0377k;
import A3.InterfaceC0371e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import e3.C5745b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class m0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33002a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f33003b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f33004c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f33005d;

    /* renamed from: e, reason: collision with root package name */
    private j0 f33006e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33007f;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f33008a;

        /* renamed from: b, reason: collision with root package name */
        private final C0377k f33009b = new C0377k();

        a(Intent intent) {
            this.f33008a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f33008a.getAction() + " finishing.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33000o.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().d(scheduledExecutorService, new InterfaceC0371e() { // from class: com.google.firebase.messaging.l0
                @Override // A3.InterfaceC0371e
                public final void a(AbstractC0376j abstractC0376j) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f33009b.e(null);
        }

        AbstractC0376j e() {
            return this.f33009b.a();
        }
    }

    m0(Context context, String str) {
        this(context, str, a());
    }

    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f33005d.isEmpty()) {
            ((a) this.f33005d.poll()).d();
        }
    }

    private synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f33005d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                j0 j0Var = this.f33006e;
                if (j0Var == null || !j0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f33006e.c((a) this.f33005d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f33007f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f33007f) {
            return;
        }
        this.f33007f = true;
        try {
        } catch (SecurityException e8) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e8);
        }
        if (C5745b.b().a(this.f33002a, this.f33003b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f33007f = false;
        b();
    }

    synchronized AbstractC0376j d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f33004c);
            this.f33005d.add(aVar);
            c();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f33007f = false;
            if (iBinder instanceof j0) {
                this.f33006e = (j0) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    m0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f33005d = new ArrayDeque();
        this.f33007f = false;
        Context applicationContext = context.getApplicationContext();
        this.f33002a = applicationContext;
        this.f33003b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f33004c = scheduledExecutorService;
    }
}
