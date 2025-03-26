package b3;

import Z2.C0782v;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m3.AbstractC6193a;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958a extends AbstractC6193a implements IInterface {
    C0958a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void p2(C0782v c0782v) {
        Parcel w02 = w0();
        m3.c.c(w02, c0782v);
        J0(1, w02);
    }
}
