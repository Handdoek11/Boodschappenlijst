package Z6;

import U6.J0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public abstract class B extends AbstractC0791e implements J0 {

    /* renamed from: u, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f6447u = AtomicIntegerFieldUpdater.newUpdater(B.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: t, reason: collision with root package name */
    public final long f6448t;

    public B(long j8, B b8, int i8) {
        super(b8);
        this.f6448t = j8;
        this.cleanedAndPointers = i8 << 16;
    }

    @Override // Z6.AbstractC0791e
    public boolean h() {
        return f6447u.get(this) == n() && !i();
    }

    public final boolean m() {
        return f6447u.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i8, Throwable th, A6.g gVar);

    public final void p() {
        if (f6447u.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6447u;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 65536 + i8));
        return true;
    }
}
