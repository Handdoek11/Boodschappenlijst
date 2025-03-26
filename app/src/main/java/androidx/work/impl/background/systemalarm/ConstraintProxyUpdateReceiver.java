package androidx.work.impl.background.systemalarm;

import B1.g;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import s1.j;
import t1.C6789j;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final String f11843a = j.f("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Intent f11844o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f11845s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f11846t;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f11844o = intent;
            this.f11845s = context;
            this.f11846t = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f11844o.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f11844o.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f11844o.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f11844o.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                j.c().a(ConstraintProxyUpdateReceiver.f11843a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                g.a(this.f11845s, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(this.f11845s, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(this.f11845s, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(this.f11845s, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f11846t.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z7, boolean z8, boolean z9, boolean z10) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z8).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z10);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C6789j.k(context).p().b(new a(intent, context, goAsync()));
        } else {
            j.c().a(f11843a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
