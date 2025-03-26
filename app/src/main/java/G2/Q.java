package G2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class Q extends AbstractC3612ob implements T {
    Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // G2.T
    public final void zze(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(2, w02);
    }

    @Override // G2.T
    public final boolean zzf(InterfaceC5852a interfaceC5852a, String str, String str2) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        w02.writeString(str);
        w02.writeString(str2);
        Parcel D02 = D0(1, w02);
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // G2.T
    public final boolean zzg(InterfaceC5852a interfaceC5852a, E2.a aVar) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, aVar);
        Parcel D02 = D0(3, w02);
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }
}
