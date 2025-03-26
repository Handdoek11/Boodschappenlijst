package Z6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Z6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0788b extends x {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6468a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0788b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0787a.f6467a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6468a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC0787a.f6467a;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    @Override // Z6.x
    public final Object a(Object obj) {
        Object obj2 = f6468a.get(this);
        if (obj2 == AbstractC0787a.f6467a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Object d(Object obj);
}
