package androidx.work.impl.background.systemalarm;

import A1.g;
import A1.h;
import B1.f;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import s1.j;
import t1.C6789j;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11852a = j.f("Alarms");

    public static void a(Context context, C6789j c6789j, String str) {
        h y7 = c6789j.o().y();
        g c8 = y7.c(str);
        if (c8 != null) {
            b(context, str, c8.f73b);
            j.c().a(f11852a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            y7.d(str);
        }
    }

    private static void b(Context context, String str, int i8) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i8, b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        j.c().a(f11852a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i8)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, C6789j c6789j, String str, long j8) {
        WorkDatabase o8 = c6789j.o();
        h y7 = o8.y();
        g c8 = y7.c(str);
        if (c8 != null) {
            b(context, str, c8.f73b);
            d(context, str, c8.f73b, j8);
        } else {
            int b8 = new f(o8).b();
            y7.b(new g(str, b8));
            d(context, str, b8, j8);
        }
    }

    private static void d(Context context, String str, int i8, long j8) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i8, b.b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j8, service);
        }
    }
}
