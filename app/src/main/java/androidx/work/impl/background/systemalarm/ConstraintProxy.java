package androidx.work.impl.background.systemalarm;

import A1.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import s1.C6722b;
import s1.j;
import s1.k;

/* loaded from: classes.dex */
abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11842a = j.f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List list) {
        Iterator it = list.iterator();
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (it.hasNext()) {
            C6722b c6722b = ((p) it.next()).f104j;
            z7 |= c6722b.f();
            z8 |= c6722b.g();
            z9 |= c6722b.i();
            z10 |= c6722b.b() != k.NOT_REQUIRED;
            if (z7 && z8 && z9 && z10) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z7, z8, z9, z10));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        j.c().a(f11842a, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(b.a(context));
    }
}
