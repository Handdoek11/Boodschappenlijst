package y1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s1.j;

/* loaded from: classes.dex */
public class g extends AbstractC6939c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f44549i = j.f("StorageNotLowTracker");

    public g(Context context, C1.a aVar) {
        super(context, aVar);
    }

    @Override // y1.AbstractC6939c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // y1.AbstractC6939c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        j.c().a(f44549i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            d(Boolean.TRUE);
        }
    }

    @Override // y1.AbstractC6940d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent registerReceiver = this.f44537b.registerReceiver(null, g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
