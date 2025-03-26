package w0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import y0.InterfaceC6936a;

/* loaded from: classes.dex */
abstract class m {

    private static class a implements ThreadFactory {

        /* renamed from: o, reason: collision with root package name */
        private String f44227o;

        /* renamed from: s, reason: collision with root package name */
        private int f44228s;

        /* renamed from: w0.m$a$a, reason: collision with other inner class name */
        private static class C0344a extends Thread {

            /* renamed from: o, reason: collision with root package name */
            private final int f44229o;

            C0344a(Runnable runnable, String str, int i8) {
                super(runnable, str);
                this.f44229o = i8;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f44229o);
                super.run();
            }
        }

        a(String str, int i8) {
            this.f44227o = str;
            this.f44228s = i8;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0344a(runnable, this.f44227o, this.f44228s);
        }
    }

    private static class b implements Executor {

        /* renamed from: o, reason: collision with root package name */
        private final Handler f44230o;

        b(Handler handler) {
            this.f44230o = (Handler) y0.i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f44230o.post((Runnable) y0.i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f44230o + " is shutting down");
        }
    }

    private static class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private Callable f44231o;

        /* renamed from: s, reason: collision with root package name */
        private InterfaceC6936a f44232s;

        /* renamed from: t, reason: collision with root package name */
        private Handler f44233t;

        class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ InterfaceC6936a f44234o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Object f44235s;

            a(InterfaceC6936a interfaceC6936a, Object obj) {
                this.f44234o = interfaceC6936a;
                this.f44235s = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f44234o.accept(this.f44235s);
            }
        }

        c(Handler handler, Callable callable, InterfaceC6936a interfaceC6936a) {
            this.f44231o = callable;
            this.f44232s = interfaceC6936a;
            this.f44233t = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f44231o.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f44233t.post(new a(this.f44232s, obj));
        }
    }

    static ThreadPoolExecutor a(String str, int i8, int i9) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i9, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i8));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, InterfaceC6936a interfaceC6936a) {
        executor.execute(new c(AbstractC6864b.a(), callable, interfaceC6936a));
    }

    static Object d(ExecutorService executorService, Callable callable, int i8) {
        try {
            return executorService.submit(callable).get(i8, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw e8;
        } catch (ExecutionException e9) {
            throw new RuntimeException(e9);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
