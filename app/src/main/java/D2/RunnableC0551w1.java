package D2;

import android.os.RemoteException;

/* renamed from: D2.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0551w1 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ BinderC0554x1 f1360o;

    RunnableC0551w1(BinderC0554x1 binderC0554x1) {
        this.f1360o = binderC0554x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC0560z1 binderC0560z1 = this.f1360o.f1362o;
        if (binderC0560z1.f1372o != null) {
            try {
                binderC0560z1.f1372o.D(1);
            } catch (RemoteException e8) {
                H2.p.h("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}
