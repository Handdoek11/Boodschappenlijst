package m4;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class G {

    class a implements ThreadFactory {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f38995o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ AtomicLong f38996s;

        /* renamed from: m4.G$a$a, reason: collision with other inner class name */
        class C0290a extends AbstractRunnableC6198d {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Runnable f38997o;

            C0290a(Runnable runnable) {
                this.f38997o = runnable;
            }

            @Override // m4.AbstractRunnableC6198d
            public void a() {
                this.f38997o.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f38995o = str;
            this.f38996s = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0290a(runnable));
            newThread.setName(this.f38995o + this.f38996s.getAndIncrement());
            return newThread;
        }
    }

    class b extends AbstractRunnableC6198d {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f38999o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ExecutorService f39000s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f39001t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ TimeUnit f39002u;

        b(String str, ExecutorService executorService, long j8, TimeUnit timeUnit) {
            this.f38999o = str;
            this.f39000s = executorService;
            this.f39001t = j8;
            this.f39002u = timeUnit;
        }

        @Override // m4.AbstractRunnableC6198d
        public void a() {
            try {
                j4.g.f().b("Executing shutdown hook for " + this.f38999o);
                this.f39000s.shutdown();
                if (this.f39000s.awaitTermination(this.f39001t, this.f39002u)) {
                    return;
                }
                j4.g.f().b(this.f38999o + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f39000s.shutdownNow();
            } catch (InterruptedException unused) {
                j4.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f38999o));
                this.f39000s.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j8, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j8, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e8 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e8);
        return e8;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
