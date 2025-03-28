package y1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s1.j;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6938b extends AbstractC6939c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f44531i = j.f("BatteryNotLowTracker");

    public C6938b(Context context, C1.a aVar) {
        super(context, aVar);
    }

    @Override // y1.AbstractC6939c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // y1.AbstractC6939c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        j.c().a(f44531i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // y1.AbstractC6940d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent registerReceiver = this.f44537b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        j.c().b(f44531i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
