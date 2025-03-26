package D2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;

/* renamed from: D2.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0559z0 extends AbstractBinderC3721pb implements A0 {
    public static A0 t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof A0 ? (A0) queryLocalInterface : new C0556y0(iBinder);
    }
}
