package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public final class F extends AbstractC3612ob implements H {
    F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // D2.H
    public final void D(int i8) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        J0(2, w02);
    }

    @Override // D2.H
    public final void a() {
        J0(6, w0());
    }

    @Override // D2.H
    public final void d() {
        J0(1, w0());
    }

    @Override // D2.H
    public final void e() {
        J0(3, w0());
    }

    @Override // D2.H
    public final void f() {
        J0(4, w0());
    }

    @Override // D2.H
    public final void g() {
        J0(7, w0());
    }

    @Override // D2.H
    public final void h() {
        J0(5, w0());
    }

    @Override // D2.H
    public final void i() {
        J0(9, w0());
    }

    @Override // D2.H
    public final void y(W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(8, w03);
    }
}
