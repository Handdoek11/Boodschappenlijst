package Z5;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i8, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }
}
