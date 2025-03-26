package p3;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p3.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ExecutorC6362r0 implements Executor {

    /* renamed from: s, reason: collision with root package name */
    private final ThreadPoolExecutor f40381s;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicInteger f40380o = new AtomicInteger(1);

    /* renamed from: t, reason: collision with root package name */
    private WeakReference f40382t = new WeakReference(null);

    ExecutorC6362r0(String str) {
        final String str2 = "Google consent worker";
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(str2) { // from class: p3.q0

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f40375s = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.f40374o.a(this.f40375s, runnable);
            }
        });
        this.f40381s = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    final /* synthetic */ Thread a(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, "Google consent worker #" + this.f40380o.getAndIncrement());
        this.f40382t = new WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f40382t.get()) {
            runnable.run();
        } else {
            this.f40381s.execute(runnable);
        }
    }
}
