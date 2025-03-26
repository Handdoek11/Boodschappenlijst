package O1;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: s, reason: collision with root package name */
    private static final long f4237s = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: t, reason: collision with root package name */
    private static volatile int f4238t;

    /* renamed from: o, reason: collision with root package name */
    private final ExecutorService f4239o;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f4240a;

        /* renamed from: b, reason: collision with root package name */
        private int f4241b;

        /* renamed from: c, reason: collision with root package name */
        private int f4242c;

        /* renamed from: d, reason: collision with root package name */
        private ThreadFactory f4243d = new c();

        /* renamed from: e, reason: collision with root package name */
        private e f4244e = e.f4258d;

        /* renamed from: f, reason: collision with root package name */
        private String f4245f;

        /* renamed from: g, reason: collision with root package name */
        private long f4246g;

        b(boolean z7) {
            this.f4240a = z7;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f4245f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f4245f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f4241b, this.f4242c, this.f4246g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f4243d, this.f4245f, this.f4244e, this.f4240a));
            if (this.f4246g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f4245f = str;
            return this;
        }

        public b c(int i8) {
            this.f4241b = i8;
            this.f4242c = i8;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* renamed from: O1.a$c$a, reason: collision with other inner class name */
        class C0079a extends Thread {
            C0079a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0079a(runnable);
        }
    }

    private static final class d implements ThreadFactory {

        /* renamed from: o, reason: collision with root package name */
        private final ThreadFactory f4248o;

        /* renamed from: s, reason: collision with root package name */
        private final String f4249s;

        /* renamed from: t, reason: collision with root package name */
        final e f4250t;

        /* renamed from: u, reason: collision with root package name */
        final boolean f4251u;

        /* renamed from: v, reason: collision with root package name */
        private final AtomicInteger f4252v = new AtomicInteger();

        /* renamed from: O1.a$d$a, reason: collision with other inner class name */
        class RunnableC0080a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Runnable f4253o;

            RunnableC0080a(Runnable runnable) {
                this.f4253o = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f4251u) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f4253o.run();
                } catch (Throwable th) {
                    d.this.f4250t.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z7) {
            this.f4248o = threadFactory;
            this.f4249s = str;
            this.f4250t = eVar;
            this.f4251u = z7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f4248o.newThread(new RunnableC0080a(runnable));
            newThread.setName("glide-" + this.f4249s + "-thread-" + this.f4252v.getAndIncrement());
            return newThread;
        }
    }

    a(ExecutorService executorService) {
        this.f4239o = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f4238t == 0) {
            f4238t = Math.min(4, O1.b.a());
        }
        return f4238t;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static a d() {
        return c().a();
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a f() {
        return e().a();
    }

    public static b g() {
        return new b(false).c(b()).b("source");
    }

    public static a h() {
        return g().a();
    }

    public static a i() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f4237s, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f4258d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f4239o.awaitTermination(j8, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4239o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f4239o.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f4239o.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f4239o.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f4239o.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f4239o.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f4239o.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f4239o.submit(runnable);
    }

    public String toString() {
        return this.f4239o.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j8, TimeUnit timeUnit) {
        return this.f4239o.invokeAll(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j8, TimeUnit timeUnit) {
        return this.f4239o.invokeAny(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f4239o.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f4239o.submit(callable);
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4255a = new C0081a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f4256b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f4257c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f4258d;

        class b implements e {
            b() {
            }

            @Override // O1.a.e
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        class c implements e {
            c() {
            }

            @Override // O1.a.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f4256b = bVar;
            f4257c = new c();
            f4258d = bVar;
        }

        void a(Throwable th);

        /* renamed from: O1.a$e$a, reason: collision with other inner class name */
        class C0081a implements e {
            C0081a() {
            }

            @Override // O1.a.e
            public void a(Throwable th) {
            }
        }
    }
}
