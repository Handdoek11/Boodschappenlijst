package o6;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i extends AbstractC6317a implements Callable {
    public i(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f39971s = Thread.currentThread();
        try {
            this.f39970o.run();
            return null;
        } finally {
            lazySet(AbstractC6317a.f39968t);
            this.f39971s = null;
        }
    }
}
