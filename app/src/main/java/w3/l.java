package w3;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C5378n2;
import com.google.android.gms.measurement.internal.S2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final a f44334a;

    public interface a {
        void a(Context context, Intent intent);
    }

    public l(a aVar) {
        Z2.r.l(aVar);
        this.f44334a = aVar;
    }

    public final void a(Context context, Intent intent) {
        C5378n2 h8 = S2.a(context, null, null).h();
        if (intent == null) {
            h8.J().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        h8.I().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                h8.J().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            h8.I().a("Starting wakeful intent.");
            this.f44334a.a(context, className);
        }
    }
}
