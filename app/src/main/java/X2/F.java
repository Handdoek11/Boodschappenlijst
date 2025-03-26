package X2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class F implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f5906o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f5907s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ G f5908t;

    F(G g8, LifecycleCallback lifecycleCallback, String str) {
        this.f5908t = g8;
        this.f5906o = lifecycleCallback;
        this.f5907s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        G g8 = this.f5908t;
        if (g8.f5911s > 0) {
            LifecycleCallback lifecycleCallback = this.f5906o;
            if (g8.f5912t != null) {
                bundle = g8.f5912t.getBundle(this.f5907s);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f5908t.f5911s >= 2) {
            this.f5906o.j();
        }
        if (this.f5908t.f5911s >= 3) {
            this.f5906o.h();
        }
        if (this.f5908t.f5911s >= 4) {
            this.f5906o.k();
        }
        if (this.f5908t.f5911s >= 5) {
            this.f5906o.g();
        }
    }
}
