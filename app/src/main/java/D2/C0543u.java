package D2;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC2102ah;
import com.google.android.gms.internal.ads.AbstractBinderC2536eh;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import com.google.android.gms.internal.ads.InterfaceC2645fh;
import i3.BinderC5853b;

/* renamed from: D2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0543u extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f1347b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FrameLayout f1348c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f1349d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C0549w f1350e;

    C0543u(C0549w c0549w, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f1347b = frameLayout;
        this.f1348c = frameLayout2;
        this.f1349d = context;
        this.f1350e = c0549w;
    }

    @Override // D2.AbstractC0552x
    protected final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1349d, "native_ad_view_delegate");
        return new E1();
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.b6(BinderC5853b.p2(this.f1347b), BinderC5853b.p2(this.f1348c));
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        AbstractC3184kf.a(this.f1349d);
        if (!((Boolean) A.c().a(AbstractC3184kf.Ba)).booleanValue()) {
            C0549w c0549w = this.f1350e;
            return c0549w.f1355d.c(this.f1349d, this.f1347b, this.f1348c);
        }
        try {
            return AbstractBinderC2102ah.t7(((InterfaceC2645fh) H2.s.b(this.f1349d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new H2.r() { // from class: D2.t
                @Override // H2.r
                public final Object a(Object obj) {
                    return AbstractBinderC2536eh.t7((IBinder) obj);
                }
            })).D3(BinderC5853b.p2(this.f1349d), BinderC5853b.p2(this.f1347b), BinderC5853b.p2(this.f1348c), 244410000));
        } catch (RemoteException | zzr | NullPointerException e8) {
            this.f1350e.f1358g = C1773Sn.c(this.f1349d);
            this.f1350e.f1358g.a(e8, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
