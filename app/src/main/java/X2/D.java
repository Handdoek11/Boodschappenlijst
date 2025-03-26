package X2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract /* synthetic */ class D {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
