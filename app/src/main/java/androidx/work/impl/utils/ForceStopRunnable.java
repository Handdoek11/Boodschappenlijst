package androidx.work.impl.utils;

import A1.n;
import A1.p;
import A1.q;
import B1.d;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import s1.j;
import s1.s;
import t1.AbstractC6785f;
import t1.AbstractC6787h;
import t1.C6789j;
import v0.C6822a;
import v1.l;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    private static final String f11921u = j.f("ForceStopRunnable");

    /* renamed from: v, reason: collision with root package name */
    private static final long f11922v = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: o, reason: collision with root package name */
    private final Context f11923o;

    /* renamed from: s, reason: collision with root package name */
    private final C6789j f11924s;

    /* renamed from: t, reason: collision with root package name */
    private int f11925t = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f11926a = j.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            j.c().g(f11926a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, C6789j c6789j) {
        this.f11923o = context.getApplicationContext();
        this.f11924s = c6789j;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i8) {
        return PendingIntent.getBroadcast(context, -1, c(context), i8);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d8 = d(context, C6822a.b() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f11922v;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d8);
        }
    }

    public boolean a() {
        boolean i8 = l.i(this.f11923o, this.f11924s);
        WorkDatabase o8 = this.f11924s.o();
        q B7 = o8.B();
        n A7 = o8.A();
        o8.c();
        try {
            List<p> i9 = B7.i();
            boolean z7 = (i9 == null || i9.isEmpty()) ? false : true;
            if (z7) {
                for (p pVar : i9) {
                    B7.u(s.ENQUEUED, pVar.f95a);
                    B7.c(pVar.f95a, -1L);
                }
            }
            A7.c();
            o8.r();
            o8.g();
            return z7 || i8;
        } catch (Throwable th) {
            o8.g();
            throw th;
        }
    }

    public void b() {
        boolean a8 = a();
        if (h()) {
            j.c().a(f11921u, "Rescheduling Workers.", new Throwable[0]);
            this.f11924s.s();
            this.f11924s.l().c(false);
        } else if (e()) {
            j.c().a(f11921u, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f11924s.s();
        } else if (a8) {
            j.c().a(f11921u, "Found unfinished work, scheduling it.", new Throwable[0]);
            AbstractC6785f.b(this.f11924s.i(), this.f11924s.o(), this.f11924s.n());
        }
    }

    public boolean e() {
        try {
            PendingIntent d8 = d(this.f11923o, C6822a.b() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d8 != null) {
                    d8.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f11923o.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i8 = 0; i8 < historicalProcessExitReasons.size(); i8++) {
                        if (d.a(historicalProcessExitReasons.get(i8)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d8 == null) {
                g(this.f11923o);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e8) {
            e = e8;
            j.c().h(f11921u, "Ignoring exception", e);
            return true;
        } catch (SecurityException e9) {
            e = e9;
            j.c().h(f11921u, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a i8 = this.f11924s.i();
        if (TextUtils.isEmpty(i8.c())) {
            j.c().a(f11921u, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b8 = B1.j.b(this.f11923o, i8);
        j.c().a(f11921u, String.format("Is default app process = %s", Boolean.valueOf(b8)), new Throwable[0]);
        return b8;
    }

    boolean h() {
        return this.f11924s.l().a();
    }

    public void i(long j8) {
        try {
            Thread.sleep(j8);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i8;
        try {
            if (!f()) {
                return;
            }
            while (true) {
                AbstractC6787h.e(this.f11923o);
                j.c().a(f11921u, "Performing cleanup operations.", new Throwable[0]);
                try {
                    b();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e8) {
                    i8 = this.f11925t + 1;
                    this.f11925t = i8;
                    if (i8 >= 3) {
                        j.c().b(f11921u, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                        this.f11924s.i().d();
                        throw illegalStateException;
                    }
                    j.c().a(f11921u, String.format("Retrying after %s", Long.valueOf(i8 * 300)), e8);
                    i(this.f11925t * 300);
                }
                j.c().a(f11921u, String.format("Retrying after %s", Long.valueOf(i8 * 300)), e8);
                i(this.f11925t * 300);
            }
        } finally {
            this.f11924s.r();
        }
    }
}
