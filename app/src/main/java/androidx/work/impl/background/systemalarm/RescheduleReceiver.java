package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import s1.j;
import t1.C6789j;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11848a = j.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        j.c().a(f11848a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            C6789j.k(context).t(goAsync());
        } catch (IllegalStateException e8) {
            j.c().b(f11848a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e8);
        }
    }
}
