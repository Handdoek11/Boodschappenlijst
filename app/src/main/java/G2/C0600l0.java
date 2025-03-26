package G2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: G2.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600l0 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f2641d;

    /* renamed from: e, reason: collision with root package name */
    private Context f2642e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2640c = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map f2639b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f2638a = new C0598k0(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f2639b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((BroadcastReceiver) arrayList.get(i8)).onReceive(context, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        try {
            if (this.f2640c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f2642e = applicationContext;
            if (applicationContext == null) {
                this.f2642e = context;
            }
            AbstractC3184kf.a(this.f2642e);
            this.f2641d = ((Boolean) D2.A.c().a(AbstractC3184kf.f23794U3)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f2642e.registerReceiver(this.f2638a, intentFilter);
            } else {
                this.f2642e.registerReceiver(this.f2638a, intentFilter, 4);
            }
            this.f2640c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f2641d) {
            this.f2639b.put(broadcastReceiver, intentFilter);
            return;
        }
        AbstractC3184kf.a(context);
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f2641d) {
            this.f2639b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
