package o6;

import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class h extends AbstractC6317a implements Runnable {
    public h(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f39971s = Thread.currentThread();
        try {
            this.f39970o.run();
            this.f39971s = null;
        } catch (Throwable th) {
            this.f39971s = null;
            lazySet(AbstractC6317a.f39968t);
            AbstractC6805a.m(th);
        }
    }
}
