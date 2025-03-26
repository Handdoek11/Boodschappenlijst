package Y4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r3.B;

/* loaded from: classes2.dex */
public class h extends B {

    /* renamed from: s, reason: collision with root package name */
    private static final ThreadLocal f6082s = new ThreadLocal();

    /* renamed from: o, reason: collision with root package name */
    private final ThreadPoolExecutor f6083o;

    public h() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: Y4.r
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: Y4.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.d(runnable);
                    }
                });
            }
        });
        this.f6083o = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void d(Runnable runnable) {
        f6082s.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Deque deque, Runnable runnable) {
        Z2.r.l(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // r3.AbstractC6689g
    protected final /* synthetic */ Object a() {
        return this.f6083o;
    }

    @Override // r3.B
    protected final ExecutorService b() {
        return this.f6083o;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f6082s.get();
        if (deque == null || deque.size() > 1) {
            this.f6083o.execute(new Runnable() { // from class: Y4.s
                @Override // java.lang.Runnable
                public final void run() {
                    h.e((Deque) h.f6082s.get(), runnable);
                }
            });
        } else {
            e(deque, runnable);
        }
    }
}
