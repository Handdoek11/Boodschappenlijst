package O4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final O4.a f4268a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile O4.a f4269b;

    /* renamed from: O4.b$b, reason: collision with other inner class name */
    private static class C0082b implements O4.a {
        private C0082b() {
        }

        @Override // O4.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i8, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0082b c0082b = new C0082b();
        f4268a = c0082b;
        f4269b = c0082b;
    }

    public static O4.a a() {
        return f4269b;
    }
}
