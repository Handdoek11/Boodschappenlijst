package D2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import i3.BinderC5853b;

/* renamed from: D2.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548v1 extends RemoteCreator {
    public C0548v1() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof C0553x0 ? (C0553x0) queryLocalInterface : new C0553x0(iBinder);
    }

    public final InterfaceC0547v0 c(Context context) {
        try {
            IBinder q22 = ((C0553x0) b(context)).q2(BinderC5853b.p2(context), 244410000);
            if (q22 == null) {
                return null;
            }
            IInterface queryLocalInterface = q22.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof InterfaceC0547v0 ? (InterfaceC0547v0) queryLocalInterface : new C0541t0(q22);
        } catch (RemoteException e8) {
            e = e8;
            H2.p.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e9) {
            e = e9;
            H2.p.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
