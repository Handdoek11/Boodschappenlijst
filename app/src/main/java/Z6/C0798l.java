package Z6;

import U6.InterfaceC0731o;
import U6.T;
import U6.W;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Z6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0798l extends U6.I implements W {

    /* renamed from: y, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f6482y = AtomicIntegerFieldUpdater.newUpdater(C0798l.class, "runningWorkers");
    private volatile int runningWorkers;

    /* renamed from: t, reason: collision with root package name */
    private final U6.I f6483t;

    /* renamed from: u, reason: collision with root package name */
    private final int f6484u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ W f6485v;

    /* renamed from: w, reason: collision with root package name */
    private final q f6486w;

    /* renamed from: x, reason: collision with root package name */
    private final Object f6487x;

    /* renamed from: Z6.l$a */
    private final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private Runnable f6488o;

        public a(Runnable runnable) {
            this.f6488o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = 0;
            while (true) {
                try {
                    this.f6488o.run();
                } catch (Throwable th) {
                    U6.K.a(A6.h.f250o, th);
                }
                Runnable C02 = C0798l.this.C0();
                if (C02 == null) {
                    return;
                }
                this.f6488o = C02;
                i8++;
                if (i8 >= 16 && C0798l.this.f6483t.x0(C0798l.this)) {
                    C0798l.this.f6483t.q0(C0798l.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0798l(U6.I i8, int i9) {
        this.f6483t = i8;
        this.f6484u = i9;
        W w7 = i8 instanceof W ? (W) i8 : null;
        this.f6485v = w7 == null ? T.a() : w7;
        this.f6486w = new q(false);
        this.f6487x = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable C0() {
        while (true) {
            Runnable runnable = (Runnable) this.f6486w.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f6487x) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6482y;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f6486w.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean D0() {
        synchronized (this.f6487x) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6482y;
            if (atomicIntegerFieldUpdater.get(this) >= this.f6484u) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // U6.W
    public void E(long j8, InterfaceC0731o interfaceC0731o) {
        this.f6485v.E(j8, interfaceC0731o);
    }

    @Override // U6.I
    public void q0(A6.g gVar, Runnable runnable) {
        Runnable C02;
        this.f6486w.a(runnable);
        if (f6482y.get(this) >= this.f6484u || !D0() || (C02 = C0()) == null) {
            return;
        }
        this.f6483t.q0(this, new a(C02));
    }

    @Override // U6.I
    public void u0(A6.g gVar, Runnable runnable) {
        Runnable C02;
        this.f6486w.a(runnable);
        if (f6482y.get(this) >= this.f6484u || !D0() || (C02 = C0()) == null) {
            return;
        }
        this.f6483t.u0(this, new a(C02));
    }

    @Override // U6.I
    public U6.I z0(int i8) {
        AbstractC0799m.a(i8);
        return i8 >= this.f6484u ? this : super.z0(i8);
    }
}
