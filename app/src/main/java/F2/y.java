package F2;

import D2.InterfaceC0484a;
import G2.D0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.InterfaceC3912rG;

/* loaded from: classes.dex */
public final class y {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z7, HN hn) {
        if (adOverlayInfoParcel.f13071B == 4 && adOverlayInfoParcel.f13087t == null) {
            InterfaceC0484a interfaceC0484a = adOverlayInfoParcel.f13086s;
            if (interfaceC0484a != null) {
                interfaceC0484a.I0();
            }
            InterfaceC3912rG interfaceC3912rG = adOverlayInfoParcel.f13081L;
            if (interfaceC3912rG != null) {
                interfaceC3912rG.K0();
            }
            Activity f8 = adOverlayInfoParcel.f13088u.f();
            l lVar = adOverlayInfoParcel.f13085o;
            Context context2 = (lVar == null || !lVar.f2259A || f8 == null) ? context : f8;
            C2.v.l();
            l lVar2 = adOverlayInfoParcel.f13085o;
            C0569a.b(context2, lVar2, adOverlayInfoParcel.f13093z, lVar2 != null ? lVar2.f2268z : null, hn, adOverlayInfoParcel.f13077H);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f13073D.f2917u);
        intent.putExtra("shouldCallOnOverlayOpened", z7);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!f3.m.f()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Vc)).booleanValue()) {
            C2.v.t();
            D0.x(context, intent, hn, adOverlayInfoParcel.f13077H);
        } else {
            C2.v.t();
            D0.t(context, intent);
        }
    }
}
