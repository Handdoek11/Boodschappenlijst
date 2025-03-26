package A3;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f207a = new CountDownLatch(1);

    /* synthetic */ p(AbstractC0381o abstractC0381o) {
    }

    public final void a() {
        this.f207a.await();
    }

    @Override // A3.InterfaceC0373g
    public final void b(Object obj) {
        this.f207a.countDown();
    }

    @Override // A3.InterfaceC0370d
    public final void c() {
        this.f207a.countDown();
    }

    public final boolean d(long j8, TimeUnit timeUnit) {
        return this.f207a.await(j8, timeUnit);
    }

    @Override // A3.InterfaceC0372f
    public final void e(Exception exc) {
        this.f207a.countDown();
    }
}
