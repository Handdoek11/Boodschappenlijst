package U6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x6.C6916E;

/* renamed from: U6.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0741t0 extends AbstractC0747w0 {

    /* renamed from: w, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f5481w = AtomicIntegerFieldUpdater.newUpdater(C0741t0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: v, reason: collision with root package name */
    private final I6.l f5482v;

    public C0741t0(I6.l lVar) {
        this.f5482v = lVar;
    }

    @Override // I6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Throwable) obj);
        return C6916E.f44463a;
    }

    @Override // U6.E
    public void v(Throwable th) {
        if (f5481w.compareAndSet(this, 0, 1)) {
            this.f5482v.invoke(th);
        }
    }
}
