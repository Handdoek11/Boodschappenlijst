package U6;

import U6.AbstractC0716g0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class S extends AbstractC0716g0 implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    private static final long f5420A;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: z, reason: collision with root package name */
    public static final S f5421z;

    static {
        Long l8;
        S s8 = new S();
        f5421z = s8;
        AbstractC0714f0.G0(s8, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l8 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l8 = 1000L;
        }
        f5420A = timeUnit.toNanos(l8.longValue());
    }

    private S() {
    }

    private final synchronized void b1() {
        if (e1()) {
            debugStatus = 3;
            W0();
            J6.r.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread c1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean d1() {
        return debugStatus == 4;
    }

    private final boolean e1() {
        int i8 = debugStatus;
        return i8 == 2 || i8 == 3;
    }

    private final synchronized boolean f1() {
        if (e1()) {
            return false;
        }
        debugStatus = 1;
        J6.r.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void g1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // U6.AbstractC0718h0
    protected Thread M0() {
        Thread thread = _thread;
        return thread == null ? c1() : thread;
    }

    @Override // U6.AbstractC0718h0
    protected void N0(long j8, AbstractC0716g0.b bVar) {
        g1();
    }

    @Override // U6.AbstractC0716g0
    public void S0(Runnable runnable) {
        if (d1()) {
            g1();
        }
        super.S0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean U02;
        S0.f5422a.d(this);
        AbstractC0707c.a();
        try {
            if (!f1()) {
                if (U02) {
                    return;
                } else {
                    return;
                }
            }
            long j8 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long J02 = J0();
                if (J02 == Long.MAX_VALUE) {
                    AbstractC0707c.a();
                    long nanoTime = System.nanoTime();
                    if (j8 == Long.MAX_VALUE) {
                        j8 = f5420A + nanoTime;
                    }
                    long j9 = j8 - nanoTime;
                    if (j9 <= 0) {
                        _thread = null;
                        b1();
                        AbstractC0707c.a();
                        if (U0()) {
                            return;
                        }
                        M0();
                        return;
                    }
                    J02 = P6.m.f(J02, j9);
                } else {
                    j8 = Long.MAX_VALUE;
                }
                if (J02 > 0) {
                    if (e1()) {
                        _thread = null;
                        b1();
                        AbstractC0707c.a();
                        if (U0()) {
                            return;
                        }
                        M0();
                        return;
                    }
                    AbstractC0707c.a();
                    LockSupport.parkNanos(this, J02);
                }
            }
        } finally {
            _thread = null;
            b1();
            AbstractC0707c.a();
            if (!U0()) {
                M0();
            }
        }
    }

    @Override // U6.AbstractC0716g0, U6.AbstractC0714f0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
