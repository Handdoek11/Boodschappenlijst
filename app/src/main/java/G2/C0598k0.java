package G2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: G2.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0598k0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0600l0 f2636a;

    C0598k0(C0600l0 c0600l0) {
        this.f2636a = c0600l0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2636a.e(context, intent);
    }
}
