package G2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* loaded from: classes.dex */
final class B0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D0 f2563a;

    /* synthetic */ B0(D0 d02, C0 c02) {
        this.f2563a = d02;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.f2563a.f2571e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f2563a.f2571e = false;
        }
    }
}
