package k3;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class e extends AbstractBinderC6100b implements f {
    public static f w0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new d(iBinder);
    }
}
