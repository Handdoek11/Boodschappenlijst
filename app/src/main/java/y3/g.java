package y3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m3.AbstractC6193a;

/* loaded from: classes2.dex */
public final class g extends AbstractC6193a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void p2(j jVar, f fVar) {
        Parcel w02 = w0();
        m3.c.c(w02, jVar);
        m3.c.d(w02, fVar);
        D0(12, w02);
    }
}
