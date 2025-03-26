package A3;

import X2.InterfaceC0759g;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class M extends LifecycleCallback {

    /* renamed from: s, reason: collision with root package name */
    private final List f193s;

    private M(InterfaceC0759g interfaceC0759g) {
        super(interfaceC0759g);
        this.f193s = new ArrayList();
        this.f13281o.a("TaskOnStopCallback", this);
    }

    public static M l(Activity activity) {
        M m8;
        InterfaceC0759g d8 = LifecycleCallback.d(activity);
        synchronized (d8) {
            try {
                m8 = (M) d8.d("TaskOnStopCallback", M.class);
                if (m8 == null) {
                    m8 = new M(d8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m8;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        synchronized (this.f193s) {
            try {
                Iterator it = this.f193s.iterator();
                while (it.hasNext()) {
                    H h8 = (H) ((WeakReference) it.next()).get();
                    if (h8 != null) {
                        h8.a();
                    }
                }
                this.f193s.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(H h8) {
        synchronized (this.f193s) {
            this.f193s.add(new WeakReference(h8));
        }
    }
}
