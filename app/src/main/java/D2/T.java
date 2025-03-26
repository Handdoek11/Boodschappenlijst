package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC4376vc;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class T extends AbstractC3612ob implements V {
    T(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // D2.V
    public final void B() {
        J0(2, w0());
    }

    @Override // D2.V
    public final void B6(InterfaceC4376vc interfaceC4376vc) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC4376vc);
        J0(40, w02);
    }

    @Override // D2.V
    public final void H2(E e8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, e8);
        J0(20, w02);
    }

    @Override // D2.V
    public final void I() {
        J0(5, w0());
    }

    @Override // D2.V
    public final void I5(boolean z7) {
        Parcel w02 = w0();
        int i8 = AbstractC3830qb.f25953b;
        w02.writeInt(z7 ? 1 : 0);
        J0(34, w02);
    }

    @Override // D2.V
    public final void J5(H h8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, h8);
        J0(7, w02);
    }

    @Override // D2.V
    public final void R4(X1 x12, K k8) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, x12);
        AbstractC3830qb.f(w02, k8);
        J0(43, w02);
    }

    @Override // D2.V
    public final void S5(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(44, w02);
    }

    @Override // D2.V
    public final boolean T3(X1 x12) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, x12);
        Parcel D02 = D0(4, w02);
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // D2.V
    public final void c0() {
        J0(6, w0());
    }

    @Override // D2.V
    public final void f7(boolean z7) {
        Parcel w02 = w0();
        int i8 = AbstractC3830qb.f25953b;
        w02.writeInt(z7 ? 1 : 0);
        J0(22, w02);
    }

    @Override // D2.V
    public final c2 g() {
        Parcel D02 = D0(12, w0());
        c2 c2Var = (c2) AbstractC3830qb.a(D02, c2.CREATOR);
        D02.recycle();
        return c2Var;
    }

    @Override // D2.V
    public final void h6(InterfaceC0509i0 interfaceC0509i0) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC0509i0);
        J0(8, w02);
    }

    @Override // D2.V
    public final U0 i() {
        U0 s02;
        Parcel D02 = D0(41, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            s02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            s02 = queryLocalInterface instanceof U0 ? (U0) queryLocalInterface : new S0(readStrongBinder);
        }
        D02.recycle();
        return s02;
    }

    @Override // D2.V
    public final void i3(N0 n02) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, n02);
        J0(42, w02);
    }

    @Override // D2.V
    public final Y0 j() {
        Y0 v02;
        Parcel D02 = D0(26, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            v02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            v02 = queryLocalInterface instanceof Y0 ? (Y0) queryLocalInterface : new V0(readStrongBinder);
        }
        D02.recycle();
        return v02;
    }

    @Override // D2.V
    public final InterfaceC5852a l() {
        Parcel D02 = D0(1, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // D2.V
    public final void m5(c2 c2Var) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c2Var);
        J0(13, w02);
    }

    @Override // D2.V
    public final String r() {
        Parcel D02 = D0(31, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // D2.V
    public final void r6(Q1 q12) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, q12);
        J0(29, w02);
    }

    @Override // D2.V
    public final void v4(InterfaceC0530p0 interfaceC0530p0) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC0530p0);
        J0(45, w02);
    }

    @Override // D2.V
    public final void y4(i2 i2Var) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, i2Var);
        J0(39, w02);
    }
}
