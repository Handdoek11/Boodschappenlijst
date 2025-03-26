package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.El, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278El extends AbstractC3612ob implements InterfaceC1350Gl {
    C1278El(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void E1(InterfaceC5852a interfaceC5852a, InterfaceC1594Nj interfaceC1594Nj, List list) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC1594Nj);
        w02.writeTypedList(list);
        J0(31, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void F() {
        J0(4, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final C1631Ol H() {
        C1631Ol c1631Ol;
        Parcel D02 = D0(15, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c1631Ol = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c1631Ol = queryLocalInterface instanceof C1631Ol ? (C1631Ol) queryLocalInterface : new C1631Ol(readStrongBinder);
        }
        D02.recycle();
        return c1631Ol;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void I2(InterfaceC5852a interfaceC5852a, D2.c2 c2Var, D2.X1 x12, String str, String str2, InterfaceC1457Jl interfaceC1457Jl) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, c2Var);
        AbstractC3830qb.d(w02, x12);
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC3830qb.f(w02, interfaceC1457Jl);
        J0(6, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final boolean J() {
        Parcel D02 = D0(22, w0());
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final boolean L() {
        Parcel D02 = D0(13, w0());
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void M() {
        J0(9, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void O() {
        J0(12, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void Q2(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(37, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void W0(InterfaceC5852a interfaceC5852a, InterfaceC1879Vo interfaceC1879Vo, List list) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC1879Vo);
        w02.writeStringList(list);
        J0(23, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void Y3(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, String str2, InterfaceC1457Jl interfaceC1457Jl) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, x12);
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC3830qb.f(w02, interfaceC1457Jl);
        J0(7, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void b5(D2.X1 x12, String str) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, x12);
        w02.writeString(str);
        J0(11, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final C1666Pl d0() {
        C1666Pl c1666Pl;
        Parcel D02 = D0(16, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c1666Pl = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c1666Pl = queryLocalInterface instanceof C1666Pl ? (C1666Pl) queryLocalInterface : new C1666Pl(readStrongBinder);
        }
        D02.recycle();
        return c1666Pl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void d1(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(39, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final D2.Y0 e() {
        Parcel D02 = D0(26, w0());
        D2.Y0 t7 = D2.X0.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void e2(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, InterfaceC1457Jl interfaceC1457Jl) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, x12);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1457Jl);
        J0(38, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void e7(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, InterfaceC1457Jl interfaceC1457Jl) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, x12);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1457Jl);
        J0(32, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final InterfaceC1561Ml h() {
        InterfaceC1561Ml c1492Kl;
        Parcel D02 = D0(36, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c1492Kl = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c1492Kl = queryLocalInterface instanceof InterfaceC1561Ml ? (InterfaceC1561Ml) queryLocalInterface : new C1492Kl(readStrongBinder);
        }
        D02.recycle();
        return c1492Kl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void h5(InterfaceC5852a interfaceC5852a, D2.c2 c2Var, D2.X1 x12, String str, String str2, InterfaceC1457Jl interfaceC1457Jl) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, c2Var);
        AbstractC3830qb.d(w02, x12);
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC3830qb.f(w02, interfaceC1457Jl);
        J0(35, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final InterfaceC1771Sl i() {
        InterfaceC1771Sl c1701Ql;
        Parcel D02 = D0(27, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c1701Ql = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c1701Ql = queryLocalInterface instanceof InterfaceC1771Sl ? (InterfaceC1771Sl) queryLocalInterface : new C1701Ql(readStrongBinder);
        }
        D02.recycle();
        return c1701Ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final C1667Pm j() {
        Parcel D02 = D0(33, w0());
        C1667Pm c1667Pm = (C1667Pm) AbstractC3830qb.a(D02, C1667Pm.CREATOR);
        D02.recycle();
        return c1667Pm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final C1667Pm k() {
        Parcel D02 = D0(34, w0());
        C1667Pm c1667Pm = (C1667Pm) AbstractC3830qb.a(D02, C1667Pm.CREATOR);
        D02.recycle();
        return c1667Pm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void k6(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, InterfaceC1879Vo interfaceC1879Vo, String str2) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, x12);
        w02.writeString(null);
        AbstractC3830qb.f(w02, interfaceC1879Vo);
        w02.writeString(str2);
        J0(10, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final InterfaceC5852a l() {
        Parcel D02 = D0(2, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void m2(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, InterfaceC1457Jl interfaceC1457Jl) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, x12);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1457Jl);
        J0(28, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void m4(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(21, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void o() {
        J0(5, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void q0() {
        J0(8, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void r5(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(30, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void x2(InterfaceC5852a interfaceC5852a, D2.X1 x12, String str, String str2, InterfaceC1457Jl interfaceC1457Jl, C1553Mg c1553Mg, List list) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, x12);
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC3830qb.f(w02, interfaceC1457Jl);
        AbstractC3830qb.d(w02, c1553Mg);
        w02.writeStringList(list);
        J0(14, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1350Gl
    public final void y0(boolean z7) {
        Parcel w02 = w0();
        int i8 = AbstractC3830qb.f25953b;
        w02.writeInt(z7 ? 1 : 0);
        J0(25, w02);
    }
}
