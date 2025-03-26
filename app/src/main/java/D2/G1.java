package D2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2335cp;
import com.google.android.gms.internal.ads.C3313lp;
import com.google.android.gms.internal.ads.C4075sp;
import com.google.android.gms.internal.ads.InterfaceC2118ap;
import com.google.android.gms.internal.ads.InterfaceC2770gp;
import com.google.android.gms.internal.ads.InterfaceC3204kp;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class G1 extends AbstractBinderC2335cp {
    private static void u7(final InterfaceC3204kp interfaceC3204kp) {
        H2.p.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        H2.g.f2925b.post(new Runnable() { // from class: D2.F1
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC3204kp interfaceC3204kp2 = interfaceC3204kp;
                if (interfaceC3204kp2 != null) {
                    try {
                        interfaceC3204kp2.D(1);
                    } catch (RemoteException e8) {
                        H2.p.i("#007 Could not call remote method.", e8);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final U0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final String b() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final InterfaceC2118ap d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void k3(X1 x12, InterfaceC3204kp interfaceC3204kp) {
        u7(interfaceC3204kp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void n2(X1 x12, InterfaceC3204kp interfaceC3204kp) {
        u7(interfaceC3204kp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final boolean o() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void E3(C4075sp c4075sp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void G3(InterfaceC2770gp interfaceC2770gp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void M3(N0 n02) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void Z2(C3313lp c3313lp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void o7(K0 k02) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void t5(InterfaceC5852a interfaceC5852a) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void x4(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void f2(InterfaceC5852a interfaceC5852a, boolean z7) {
    }
}
