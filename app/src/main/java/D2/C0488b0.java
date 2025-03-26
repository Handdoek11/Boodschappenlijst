package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* renamed from: D2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488b0 extends AbstractC3612ob implements InterfaceC0491c0 {
    C0488b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // D2.InterfaceC0491c0
    public final void N4(I1 i12) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, i12);
        J0(1, w02);
    }

    @Override // D2.InterfaceC0491c0
    public final void V3(I1 i12) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, i12);
        J0(2, w02);
    }
}
