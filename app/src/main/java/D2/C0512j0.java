package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC2102ah;
import com.google.android.gms.internal.ads.AbstractBinderC2335cp;
import com.google.android.gms.internal.ads.AbstractBinderC2989iq;
import com.google.android.gms.internal.ads.AbstractBinderC3309ln;
import com.google.android.gms.internal.ads.AbstractBinderC4180tn;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC2319ch;
import com.google.android.gms.internal.ads.InterfaceC2443dp;
import com.google.android.gms.internal.ads.InterfaceC3097jq;
import com.google.android.gms.internal.ads.InterfaceC3418mn;
import com.google.android.gms.internal.ads.InterfaceC4289un;
import i3.InterfaceC5852a;

/* renamed from: D2.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512j0 extends AbstractC3612ob implements InterfaceC0518l0 {
    C0512j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // D2.InterfaceC0518l0
    public final V A4(InterfaceC5852a interfaceC5852a, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        V t7;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, c2Var);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(2, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            t7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t7 = queryLocalInterface instanceof V ? (V) queryLocalInterface : new T(readStrongBinder);
        }
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0518l0
    public final V F2(InterfaceC5852a interfaceC5852a, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        V t7;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, c2Var);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(13, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            t7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t7 = queryLocalInterface instanceof V ? (V) queryLocalInterface : new T(readStrongBinder);
        }
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0518l0
    public final V F3(InterfaceC5852a interfaceC5852a, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        V t7;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, c2Var);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(1, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            t7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t7 = queryLocalInterface instanceof V ? (V) queryLocalInterface : new T(readStrongBinder);
        }
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC3418mn K2(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(15, w02);
        InterfaceC3418mn t7 = AbstractBinderC3309ln.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC3097jq L5(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(14, w02);
        InterfaceC3097jq t7 = AbstractBinderC2989iq.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC0547v0 N3(InterfaceC5852a interfaceC5852a, int i8) {
        InterfaceC0547v0 c0541t0;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        w02.writeInt(244410000);
        Parcel D02 = D0(9, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c0541t0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c0541t0 = queryLocalInterface instanceof InterfaceC0547v0 ? (InterfaceC0547v0) queryLocalInterface : new C0541t0(readStrongBinder);
        }
        D02.recycle();
        return c0541t0;
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC2443dp O6(InterfaceC5852a interfaceC5852a, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(12, w02);
        InterfaceC2443dp t7 = AbstractBinderC2335cp.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0518l0
    public final V V5(InterfaceC5852a interfaceC5852a, c2 c2Var, String str, int i8) {
        V t7;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, c2Var);
        w02.writeString(str);
        w02.writeInt(244410000);
        Parcel D02 = D0(10, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            t7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t7 = queryLocalInterface instanceof V ? (V) queryLocalInterface : new T(readStrongBinder);
        }
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC2319ch b6(InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC5852a2);
        Parcel D02 = D0(5, w02);
        InterfaceC2319ch t7 = AbstractBinderC2102ah.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0518l0
    public final Q0 d6(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Q0 o02;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(17, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            o02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            o02 = queryLocalInterface instanceof Q0 ? (Q0) queryLocalInterface : new O0(readStrongBinder);
        }
        D02.recycle();
        return o02;
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC4289un v0(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        Parcel D02 = D0(8, w02);
        InterfaceC4289un t7 = AbstractBinderC4180tn.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0518l0
    public final Q z2(InterfaceC5852a interfaceC5852a, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Q o8;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(3, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            o8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            o8 = queryLocalInterface instanceof Q ? (Q) queryLocalInterface : new O(readStrongBinder);
        }
        D02.recycle();
        return o8;
    }
}
