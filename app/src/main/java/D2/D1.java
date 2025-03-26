package D2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC1699Qj;
import i3.InterfaceC5852a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class D1 extends AbstractBinderC0544u0 {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1699Qj f1143o;

    @Override // D2.InterfaceC0547v0
    public final void X2(InterfaceC1699Qj interfaceC1699Qj) {
        this.f1143o = interfaceC1699Qj;
    }

    @Override // D2.InterfaceC0547v0
    public final float b() {
        return 1.0f;
    }

    @Override // D2.InterfaceC0547v0
    public final String c() {
        return "";
    }

    @Override // D2.InterfaceC0547v0
    public final List g() {
        return Collections.emptyList();
    }

    @Override // D2.InterfaceC0547v0
    public final void i() {
        H2.p.d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        H2.g.f2925b.post(new Runnable() { // from class: D2.C1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1142o.zzb();
            }
        });
    }

    @Override // D2.InterfaceC0547v0
    public final boolean u() {
        return false;
    }

    final /* synthetic */ void zzb() {
        InterfaceC1699Qj interfaceC1699Qj = this.f1143o;
        if (interfaceC1699Qj != null) {
            try {
                interfaceC1699Qj.u5(Collections.emptyList());
            } catch (RemoteException e8) {
                H2.p.h("Could not notify onComplete event.", e8);
            }
        }
    }

    @Override // D2.InterfaceC0547v0
    public final void f() {
    }

    @Override // D2.InterfaceC0547v0
    public final void E5(String str) {
    }

    @Override // D2.InterfaceC0547v0
    public final void Q0(String str) {
    }

    @Override // D2.InterfaceC0547v0
    public final void Z0(InterfaceC1242Dl interfaceC1242Dl) {
    }

    @Override // D2.InterfaceC0547v0
    public final void b0(String str) {
    }

    @Override // D2.InterfaceC0547v0
    public final void b4(K1 k12) {
    }

    @Override // D2.InterfaceC0547v0
    public final void k0(boolean z7) {
    }

    @Override // D2.InterfaceC0547v0
    public final void l7(boolean z7) {
    }

    @Override // D2.InterfaceC0547v0
    public final void p6(H0 h02) {
    }

    @Override // D2.InterfaceC0547v0
    public final void t0(float f8) {
    }

    @Override // D2.InterfaceC0547v0
    public final void A6(InterfaceC5852a interfaceC5852a, String str) {
    }

    @Override // D2.InterfaceC0547v0
    public final void U0(String str, InterfaceC5852a interfaceC5852a) {
    }
}
