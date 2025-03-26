package D2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC1843Un;
import i3.BinderC5853b;

/* loaded from: classes.dex */
public final class V1 extends RemoteCreator {

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1843Un f1161c;

    public V1() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof W ? (W) queryLocalInterface : new W(iBinder);
    }

    public final V c(Context context, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        AbstractC3184kf.a(context);
        if (!((Boolean) A.c().a(AbstractC3184kf.Ba)).booleanValue()) {
            try {
                IBinder q22 = ((W) b(context)).q2(BinderC5853b.p2(context), c2Var, str, interfaceC1242Dl, 244410000, i8);
                if (q22 == null) {
                    return null;
                }
                IInterface queryLocalInterface = q22.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof V ? (V) queryLocalInterface : new T(q22);
            } catch (RemoteException e8) {
                e = e8;
                H2.p.c("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e9) {
                e = e9;
                H2.p.c("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder q23 = ((W) H2.s.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new H2.r() { // from class: D2.U1
                @Override // H2.r
                public final Object a(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return queryLocalInterface2 instanceof W ? (W) queryLocalInterface2 : new W(iBinder);
                }
            })).q2(BinderC5853b.p2(context), c2Var, str, interfaceC1242Dl, 244410000, i8);
            if (q23 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = q23.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof V ? (V) queryLocalInterface2 : new T(q23);
        } catch (RemoteException e10) {
            e = e10;
            InterfaceC1843Un c8 = C1773Sn.c(context);
            this.f1161c = c8;
            c8.a(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            H2.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (zzr e11) {
            e = e11;
            InterfaceC1843Un c82 = C1773Sn.c(context);
            this.f1161c = c82;
            c82.a(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            H2.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            InterfaceC1843Un c822 = C1773Sn.c(context);
            this.f1161c = c822;
            c822.a(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            H2.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
