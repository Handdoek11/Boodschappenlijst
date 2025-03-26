package D2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import i3.BinderC5853b;

/* renamed from: D2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0532q extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1333b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f1334c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC1242Dl f1335d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C0549w f1336e;

    C0532q(C0549w c0549w, Context context, String str, InterfaceC1242Dl interfaceC1242Dl) {
        this.f1333b = context;
        this.f1334c = str;
        this.f1335d = interfaceC1242Dl;
        this.f1336e = c0549w;
    }

    @Override // D2.AbstractC0552x
    protected final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1333b, "native_ad");
        return new BinderC0560z1();
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.z2(BinderC5853b.p2(this.f1333b), this.f1334c, this.f1335d, 244410000);
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        AbstractC3184kf.a(this.f1333b);
        if (!((Boolean) A.c().a(AbstractC3184kf.Ba)).booleanValue()) {
            return this.f1336e.f1353b.c(this.f1333b, this.f1334c, this.f1335d);
        }
        try {
            IBinder q22 = ((S) H2.s.b(this.f1333b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new H2.r() { // from class: D2.p
                @Override // H2.r
                public final Object a(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof S ? (S) queryLocalInterface : new S(iBinder);
                }
            })).q2(BinderC5853b.p2(this.f1333b), this.f1334c, this.f1335d, 244410000);
            if (q22 == null) {
                return null;
            }
            IInterface queryLocalInterface = q22.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof Q ? (Q) queryLocalInterface : new O(q22);
        } catch (RemoteException e8) {
            e = e8;
            this.f1336e.f1358g = C1773Sn.c(this.f1333b);
            this.f1336e.f1358g.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (zzr e9) {
            e = e9;
            this.f1336e.f1358g = C1773Sn.c(this.f1333b);
            this.f1336e.f1358g.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            this.f1336e.f1358g = C1773Sn.c(this.f1333b);
            this.f1336e.f1358g.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
