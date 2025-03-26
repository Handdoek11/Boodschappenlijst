package U6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: U6.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0738s extends C {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f5478c = AtomicIntegerFieldUpdater.newUpdater(C0738s.class, "_resumed");
    private volatile int _resumed;

    public C0738s(A6.d dVar, Throwable th, boolean z7) {
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th, z7);
        this._resumed = 0;
    }

    public final boolean c() {
        return f5478c.compareAndSet(this, 0, 1);
    }
}
