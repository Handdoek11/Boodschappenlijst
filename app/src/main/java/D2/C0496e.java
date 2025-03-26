package D2;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC4180tn;
import com.google.android.gms.internal.ads.AbstractBinderC4507wn;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import com.google.android.gms.internal.ads.InterfaceC4616xn;
import i3.BinderC5853b;

/* renamed from: D2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0496e extends AbstractC0552x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f1230b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0549w f1231c;

    C0496e(C0549w c0549w, Activity activity) {
        this.f1230b = activity;
        this.f1231c = c0549w;
    }

    @Override // D2.AbstractC0552x
    protected final /* bridge */ /* synthetic */ Object a() {
        C0549w.q(this.f1230b, "ad_overlay");
        return null;
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC0518l0 interfaceC0518l0) {
        return interfaceC0518l0.v0(BinderC5853b.p2(this.f1230b));
    }

    @Override // D2.AbstractC0552x
    public final /* bridge */ /* synthetic */ Object c() {
        AbstractC3184kf.a(this.f1230b);
        if (!((Boolean) A.c().a(AbstractC3184kf.Ba)).booleanValue()) {
            C0549w c0549w = this.f1231c;
            return c0549w.f1356e.c(this.f1230b);
        }
        try {
            return AbstractBinderC4180tn.t7(((InterfaceC4616xn) H2.s.b(this.f1230b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new H2.r() { // from class: D2.d
                @Override // H2.r
                public final Object a(Object obj) {
                    return AbstractBinderC4507wn.t7((IBinder) obj);
                }
            })).zze(BinderC5853b.p2(this.f1230b)));
        } catch (RemoteException | zzr | NullPointerException e8) {
            this.f1231c.f1358g = C1773Sn.c(this.f1230b.getApplicationContext());
            this.f1231c.f1358g.a(e8, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
