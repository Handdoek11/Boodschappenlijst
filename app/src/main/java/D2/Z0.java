package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public final class Z0 extends AbstractC3612ob implements InterfaceC0489b1 {
    Z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // D2.InterfaceC0489b1
    public final void C0(boolean z7) {
        Parcel w02 = w0();
        int i8 = AbstractC3830qb.f25953b;
        w02.writeInt(z7 ? 1 : 0);
        J0(5, w02);
    }

    @Override // D2.InterfaceC0489b1
    public final void b() {
        J0(4, w0());
    }

    @Override // D2.InterfaceC0489b1
    public final void e() {
        J0(2, w0());
    }

    @Override // D2.InterfaceC0489b1
    public final void f() {
        J0(1, w0());
    }

    @Override // D2.InterfaceC0489b1
    public final void g() {
        J0(3, w0());
    }
}
