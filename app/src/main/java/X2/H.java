package X2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class H implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f5913o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f5914s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ I f5915t;

    H(I i8, LifecycleCallback lifecycleCallback, String str) {
        this.f5915t = i8;
        this.f5913o = lifecycleCallback;
        this.f5914s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        I i8 = this.f5915t;
        if (i8.f5918u0 > 0) {
            LifecycleCallback lifecycleCallback = this.f5913o;
            if (i8.f5919v0 != null) {
                bundle = i8.f5919v0.getBundle(this.f5914s);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f5915t.f5918u0 >= 2) {
            this.f5913o.j();
        }
        if (this.f5915t.f5918u0 >= 3) {
            this.f5913o.h();
        }
        if (this.f5915t.f5918u0 >= 4) {
            this.f5913o.k();
        }
        if (this.f5915t.f5918u0 >= 5) {
            this.f5913o.g();
        }
    }
}
