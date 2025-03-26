package m4;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f39017a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f39018b = new AtomicInteger();

    public void a() {
        this.f39018b.getAndIncrement();
    }

    public void b() {
        this.f39017a.getAndIncrement();
    }

    public void c() {
        this.f39018b.set(0);
    }
}
