package y1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s1.j;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6939c extends AbstractC6940d {

    /* renamed from: h, reason: collision with root package name */
    private static final String f44532h = j.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f44533g;

    /* renamed from: y1.c$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC6939c.this.h(context, intent);
            }
        }
    }

    public AbstractC6939c(Context context, C1.a aVar) {
        super(context, aVar);
        this.f44533g = new a();
    }

    @Override // y1.AbstractC6940d
    public void e() {
        j.c().a(f44532h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f44537b.registerReceiver(this.f44533g, g());
    }

    @Override // y1.AbstractC6940d
    public void f() {
        j.c().a(f44532h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f44537b.unregisterReceiver(this.f44533g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
