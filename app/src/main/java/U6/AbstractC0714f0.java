package U6;

import Z6.AbstractC0799m;
import y6.C6979g;

/* renamed from: U6.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0714f0 extends I {

    /* renamed from: t, reason: collision with root package name */
    private long f5449t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f5450u;

    /* renamed from: v, reason: collision with root package name */
    private C6979g f5451v;

    public static /* synthetic */ void B0(AbstractC0714f0 abstractC0714f0, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        abstractC0714f0.A0(z7);
    }

    private final long C0(boolean z7) {
        return z7 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void G0(AbstractC0714f0 abstractC0714f0, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        abstractC0714f0.F0(z7);
    }

    public final void A0(boolean z7) {
        long C02 = this.f5449t - C0(z7);
        this.f5449t = C02;
        if (C02 <= 0 && this.f5450u) {
            shutdown();
        }
    }

    public final void D0(Z z7) {
        C6979g c6979g = this.f5451v;
        if (c6979g == null) {
            c6979g = new C6979g();
            this.f5451v = c6979g;
        }
        c6979g.addLast(z7);
    }

    protected long E0() {
        C6979g c6979g = this.f5451v;
        return (c6979g == null || c6979g.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void F0(boolean z7) {
        this.f5449t += C0(z7);
        if (z7) {
            return;
        }
        this.f5450u = true;
    }

    public final boolean H0() {
        return this.f5449t >= C0(true);
    }

    public final boolean I0() {
        C6979g c6979g = this.f5451v;
        if (c6979g != null) {
            return c6979g.isEmpty();
        }
        return true;
    }

    public abstract long J0();

    public final boolean K0() {
        Z z7;
        C6979g c6979g = this.f5451v;
        if (c6979g == null || (z7 = (Z) c6979g.s()) == null) {
            return false;
        }
        z7.run();
        return true;
    }

    public boolean L0() {
        return false;
    }

    public abstract void shutdown();

    @Override // U6.I
    public final I z0(int i8) {
        AbstractC0799m.a(i8);
        return this;
    }
}
