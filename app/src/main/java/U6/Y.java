package U6;

import Z6.AbstractC0796j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class Y extends Z6.A {

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f5431v = AtomicIntegerFieldUpdater.newUpdater(Y.class, "_decision");
    private volatile int _decision;

    public Y(A6.g gVar, A6.d dVar) {
        super(gVar, dVar);
    }

    private final boolean a1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5431v;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f5431v.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean b1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5431v;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f5431v.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // Z6.A, U6.AbstractC0703a
    protected void V0(Object obj) {
        if (a1()) {
            return;
        }
        AbstractC0796j.c(B6.b.c(this.f6446u), F.a(obj, this.f6446u), null, 2, null);
    }

    public final Object Z0() {
        if (b1()) {
            return B6.b.e();
        }
        Object h8 = D0.h(n0());
        if (h8 instanceof C) {
            throw ((C) h8).f5374a;
        }
        return h8;
    }

    @Override // Z6.A, U6.C0
    protected void v(Object obj) {
        V0(obj);
    }
}
