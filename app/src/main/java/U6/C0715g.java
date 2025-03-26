package U6;

import java.util.concurrent.locks.LockSupport;

/* renamed from: U6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0715g extends AbstractC0703a {

    /* renamed from: u, reason: collision with root package name */
    private final Thread f5452u;

    /* renamed from: v, reason: collision with root package name */
    private final AbstractC0714f0 f5453v;

    public C0715g(A6.g gVar, Thread thread, AbstractC0714f0 abstractC0714f0) {
        super(gVar, true, true);
        this.f5452u = thread;
        this.f5453v = abstractC0714f0;
    }

    public final Object Z0() {
        AbstractC0707c.a();
        try {
            AbstractC0714f0 abstractC0714f0 = this.f5453v;
            if (abstractC0714f0 != null) {
                AbstractC0714f0.G0(abstractC0714f0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC0714f0 abstractC0714f02 = this.f5453v;
                    long J02 = abstractC0714f02 != null ? abstractC0714f02.J0() : Long.MAX_VALUE;
                    if (j()) {
                        AbstractC0714f0 abstractC0714f03 = this.f5453v;
                        if (abstractC0714f03 != null) {
                            AbstractC0714f0.B0(abstractC0714f03, false, 1, null);
                        }
                        AbstractC0707c.a();
                        Object h8 = D0.h(n0());
                        C c8 = h8 instanceof C ? (C) h8 : null;
                        if (c8 == null) {
                            return h8;
                        }
                        throw c8.f5374a;
                    }
                    AbstractC0707c.a();
                    LockSupport.parkNanos(this, J02);
                } catch (Throwable th) {
                    AbstractC0714f0 abstractC0714f04 = this.f5453v;
                    if (abstractC0714f04 != null) {
                        AbstractC0714f0.B0(abstractC0714f04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            y(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC0707c.a();
            throw th2;
        }
    }

    @Override // U6.C0
    protected boolean s0() {
        return true;
    }

    @Override // U6.C0
    protected void v(Object obj) {
        if (J6.r.a(Thread.currentThread(), this.f5452u)) {
            return;
        }
        Thread thread = this.f5452u;
        AbstractC0707c.a();
        LockSupport.unpark(thread);
    }
}
