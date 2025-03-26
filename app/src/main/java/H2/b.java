package H2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class b implements ThreadFactory {

    /* renamed from: o, reason: collision with root package name */
    private final AtomicInteger f2919o = new AtomicInteger(1);

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f2920s;

    b(String str) {
        this.f2920s = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f2920s + ") #" + this.f2919o.getAndIncrement());
    }
}
