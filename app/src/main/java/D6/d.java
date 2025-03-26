package d6;

import h6.AbstractC5844b;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
abstract class d extends AtomicReference implements InterfaceC5732b {
    d(Object obj) {
        super(AbstractC5844b.e(obj, "value is null"));
    }

    public final boolean a() {
        return get() == null;
    }

    protected abstract void b(Object obj);

    @Override // d6.InterfaceC5732b
    public final void c() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        b(andSet);
    }
}
