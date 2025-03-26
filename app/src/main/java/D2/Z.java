package D2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;

/* loaded from: classes.dex */
public abstract class Z extends AbstractBinderC3721pb implements InterfaceC0485a0 {
    public static InterfaceC0485a0 t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof InterfaceC0485a0 ? (InterfaceC0485a0) queryLocalInterface : new Y(iBinder);
    }
}
