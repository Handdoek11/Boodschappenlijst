package U6;

import U6.AbstractC0716g0;
import java.util.concurrent.locks.LockSupport;

/* renamed from: U6.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0718h0 extends AbstractC0714f0 {
    protected abstract Thread M0();

    protected void N0(long j8, AbstractC0716g0.b bVar) {
        S.f5421z.X0(j8, bVar);
    }

    protected final void O0() {
        Thread M02 = M0();
        if (Thread.currentThread() != M02) {
            AbstractC0707c.a();
            LockSupport.unpark(M02);
        }
    }
}
