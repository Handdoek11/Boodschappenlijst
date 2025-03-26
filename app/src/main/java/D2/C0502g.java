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
import i3.InterfaceC5852a;

/* renamed from: D2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0502g extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1265b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1242Dl f1266c;

    C0502g(C0549w c0549w, Context context, InterfaceC1242Dl interfaceC1242Dl) {
        this.f1265b = context;
        this.f1266c = interfaceC1242Dl;
    }

    @Override // D2.AbstractC0552x
    protected final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1265b, "out_of_context_tester");
        return null;
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        Context context = this.f1265b;
        InterfaceC5852a p22 = BinderC5853b.p2(context);
        AbstractC3184kf.a(context);
        if (((Boolean) A.c().a(AbstractC3184kf.n9)).booleanValue()) {
            return interfaceC0518l0.d6(p22, this.f1266c, 244410000);
        }
        return null;
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        Context context = this.f1265b;
        InterfaceC5852a p22 = BinderC5853b.p2(context);
        AbstractC3184kf.a(context);
        if (!((Boolean) A.c().a(AbstractC3184kf.n9)).booleanValue()) {
            return null;
        }
        try {
            return ((R0) H2.s.b(this.f1265b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new H2.r() { // from class: D2.f
                @Override // H2.r
                public final Object a(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return queryLocalInterface instanceof R0 ? (R0) queryLocalInterface : new R0(iBinder);
                }
            })).q2(p22, this.f1266c, 244410000);
        } catch (RemoteException | zzr | NullPointerException e8) {
            C1773Sn.c(this.f1265b).a(e8, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
