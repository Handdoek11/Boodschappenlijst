package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.C1455Jj;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC1699Qj;
import i3.InterfaceC5852a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: D2.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541t0 extends AbstractC3612ob implements InterfaceC0547v0 {
    C0541t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // D2.InterfaceC0547v0
    public final void Q0(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        J0(18, w02);
    }

    @Override // D2.InterfaceC0547v0
    public final void U0(String str, InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        w02.writeString(null);
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(6, w02);
    }

    @Override // D2.InterfaceC0547v0
    public final void X2(InterfaceC1699Qj interfaceC1699Qj) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC1699Qj);
        J0(12, w02);
    }

    @Override // D2.InterfaceC0547v0
    public final void Z0(InterfaceC1242Dl interfaceC1242Dl) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        J0(11, w02);
    }

    @Override // D2.InterfaceC0547v0
    public final void b4(K1 k12) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, k12);
        J0(14, w02);
    }

    @Override // D2.InterfaceC0547v0
    public final List g() {
        Parcel D02 = D0(13, w0());
        ArrayList createTypedArrayList = D02.createTypedArrayList(C1455Jj.CREATOR);
        D02.recycle();
        return createTypedArrayList;
    }

    @Override // D2.InterfaceC0547v0
    public final void i() {
        J0(1, w0());
    }
}
