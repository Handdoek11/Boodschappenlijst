package X2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class r extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f5928a;

    /* renamed from: b, reason: collision with root package name */
    private final q f5929b;

    public r(q qVar) {
        this.f5929b = qVar;
    }

    public final void a(Context context) {
        this.f5928a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f5928a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f5928a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5929b.a();
            b();
        }
    }
}
