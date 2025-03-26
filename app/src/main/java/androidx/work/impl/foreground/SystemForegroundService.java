package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.o;
import androidx.work.impl.foreground.a;
import s1.j;

/* loaded from: classes.dex */
public class SystemForegroundService extends o implements a.b {

    /* renamed from: w, reason: collision with root package name */
    private static final String f11892w = j.f("SystemFgService");

    /* renamed from: x, reason: collision with root package name */
    private static SystemForegroundService f11893x = null;

    /* renamed from: s, reason: collision with root package name */
    private Handler f11894s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f11895t;

    /* renamed from: u, reason: collision with root package name */
    androidx.work.impl.foreground.a f11896u;

    /* renamed from: v, reason: collision with root package name */
    NotificationManager f11897v;

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f11898o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Notification f11899s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f11900t;

        a(int i8, Notification notification, int i9) {
            this.f11898o = i8;
            this.f11899s = notification;
            this.f11900t = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f11898o, this.f11899s, this.f11900t);
            } else {
                SystemForegroundService.this.startForeground(this.f11898o, this.f11899s);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f11902o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Notification f11903s;

        b(int i8, Notification notification) {
            this.f11902o = i8;
            this.f11903s = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f11897v.notify(this.f11902o, this.f11903s);
        }
    }

    class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f11905o;

        c(int i8) {
            this.f11905o = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f11897v.cancel(this.f11905o);
        }
    }

    private void e() {
        this.f11894s = new Handler(Looper.getMainLooper());
        this.f11897v = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f11896u = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i8, int i9, Notification notification) {
        this.f11894s.post(new a(i8, notification, i9));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i8, Notification notification) {
        this.f11894s.post(new b(i8, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i8) {
        this.f11894s.post(new c(i8));
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public void onCreate() {
        super.onCreate();
        f11893x = this;
        e();
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f11896u.k();
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        super.onStartCommand(intent, i8, i9);
        if (this.f11895t) {
            j.c().d(f11892w, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f11896u.k();
            e();
            this.f11895t = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f11896u.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f11895t = true;
        j.c().a(f11892w, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f11893x = null;
        stopSelf();
    }
}
