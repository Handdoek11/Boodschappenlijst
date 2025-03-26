package l3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends AbstractC6172a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void J0(S2.d dVar, f fVar) {
        Parcel w02 = w0();
        c.b(w02, dVar);
        c.c(w02, fVar);
        D0(1, w02);
    }
}
