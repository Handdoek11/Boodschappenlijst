package D2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import i3.BinderC5853b;

/* renamed from: D2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0537s extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1339b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0549w f1340c;

    C0537s(C0549w c0549w, Context context) {
        this.f1339b = context;
        this.f1340c = c0549w;
    }

    @Override // D2.AbstractC0552x
    protected final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1339b, "mobile_ads_settings");
        return new D1();
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.N3(BinderC5853b.p2(this.f1339b), 244410000);
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        AbstractC3184kf.a(this.f1339b);
        if (!((Boolean) A.c().a(AbstractC3184kf.Ba)).booleanValue()) {
            return this.f1340c.f1354c.c(this.f1339b);
        }
        try {
            IBinder q22 = ((C0553x0) H2.s.b(this.f1339b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new H2.r() { // from class: D2.r
                @Override // H2.r
                public final Object a(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return queryLocalInterface instanceof C0553x0 ? (C0553x0) queryLocalInterface : new C0553x0(iBinder);
                }
            })).q2(BinderC5853b.p2(this.f1339b), 244410000);
            if (q22 == null) {
                return null;
            }
            IInterface queryLocalInterface = q22.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof InterfaceC0547v0 ? (InterfaceC0547v0) queryLocalInterface : new C0541t0(q22);
        } catch (RemoteException e8) {
            e = e8;
            this.f1340c.f1358g = C1773Sn.c(this.f1339b);
            this.f1340c.f1358g.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (zzr e9) {
            e = e9;
            this.f1340c.f1358g = C1773Sn.c(this.f1339b);
            this.f1340c.f1358g.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            this.f1340c.f1358g = C1773Sn.c(this.f1339b);
            this.f1340c.f1358g.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
