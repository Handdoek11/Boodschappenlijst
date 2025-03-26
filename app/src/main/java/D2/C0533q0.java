package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1206Cl;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;

/* renamed from: D2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533q0 extends AbstractC3612ob implements InterfaceC0538s0 {
    C0533q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // D2.InterfaceC0538s0
    public final InterfaceC1242Dl getAdapterCreator() {
        Parcel D02 = D0(2, w0());
        InterfaceC1242Dl t7 = AbstractBinderC1206Cl.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // D2.InterfaceC0538s0
    public final C0542t1 getLiteSdkVersion() {
        Parcel D02 = D0(1, w0());
        C0542t1 c0542t1 = (C0542t1) AbstractC3830qb.a(D02, C0542t1.CREATOR);
        D02.recycle();
        return c0542t1;
    }
}
