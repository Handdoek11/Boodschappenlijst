package Z2;

import android.os.IBinder;
import android.os.IInterface;
import o3.AbstractBinderC6287b;

/* loaded from: classes.dex */
public abstract class Y extends AbstractBinderC6287b implements Z {
    public static Z D0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof Z ? (Z) queryLocalInterface : new X(iBinder);
    }
}
