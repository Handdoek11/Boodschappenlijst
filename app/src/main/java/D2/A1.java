package D2;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class A1 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ B1 f1139o;

    A1(B1 b12) {
        this.f1139o = b12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B1 b12 = this.f1139o;
        if (b12.f1141o != null) {
            try {
                b12.f1141o.D(1);
            } catch (RemoteException e8) {
                H2.p.h("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}
