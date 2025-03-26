package D2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import i3.BinderC5853b;

/* loaded from: classes.dex */
public final class T1 extends RemoteCreator {
    public T1() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof S ? (S) queryLocalInterface : new S(iBinder);
    }

    public final Q c(Context context, String str, InterfaceC1242Dl interfaceC1242Dl) {
        try {
            IBinder q22 = ((S) b(context)).q2(BinderC5853b.p2(context), str, interfaceC1242Dl, 244410000);
            if (q22 == null) {
                return null;
            }
            IInterface queryLocalInterface = q22.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof Q ? (Q) queryLocalInterface : new O(q22);
        } catch (RemoteException e8) {
            e = e8;
            H2.p.h("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e9) {
            e = e9;
            H2.p.h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
