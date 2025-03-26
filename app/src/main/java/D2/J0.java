package D2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;

/* loaded from: classes.dex */
public abstract class J0 extends AbstractBinderC3721pb implements K0 {
    public static K0 t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof K0 ? (K0) queryLocalInterface : new I0(iBinder);
    }
}
