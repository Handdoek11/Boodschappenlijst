package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* renamed from: D2.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524n0 extends AbstractC3612ob implements InterfaceC0530p0 {
    C0524n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // D2.InterfaceC0530p0
    public final void a() {
        J0(3, w0());
    }

    @Override // D2.InterfaceC0530p0
    public final void b() {
        J0(4, w0());
    }

    @Override // D2.InterfaceC0530p0
    public final void c() {
        J0(2, w0());
    }

    @Override // D2.InterfaceC0530p0
    public final void m0(W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(1, w03);
    }

    @Override // D2.InterfaceC0530p0
    public final void zzb() {
        J0(5, w0());
    }
}
