package w3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C4922g7;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.S2;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class F extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final S2 f44332a;

    public F(S2 s22) {
        this.f44332a = s22;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f44332a.h().J().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f44332a.h().J().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f44332a.h().J().a("App receiver called with unknown action");
            return;
        }
        final S2 s22 = this.f44332a;
        if (C4922g7.a() && s22.x().F(null, G.f30389J0)) {
            s22.h().I().a("App receiver notified triggers are available");
            s22.j().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.f6
                @Override // java.lang.Runnable
                public final void run() {
                    S2 s23 = s22;
                    if (!s23.J().V0()) {
                        s23.h().J().a("registerTrigger called but app not eligible");
                        return;
                    }
                    final F3 F7 = s23.F();
                    Objects.requireNonNull(F7);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.g6
                        @Override // java.lang.Runnable
                        public final void run() {
                            F7.C0();
                        }
                    }).start();
                }
            });
        }
    }
}
