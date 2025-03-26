package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public abstract class f extends AbstractC6278a {
    public static Intent p(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (e.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != e.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
