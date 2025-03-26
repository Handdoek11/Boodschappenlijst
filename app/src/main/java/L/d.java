package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38771a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f38772b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f38773c;

    class a implements ThreadFactory {

        /* renamed from: o, reason: collision with root package name */
        private final AtomicInteger f38774o = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f38774o.getAndIncrement());
            return thread;
        }
    }

    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // l.e
    public void a(Runnable runnable) {
        this.f38772b.execute(runnable);
    }

    @Override // l.e
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // l.e
    public void c(Runnable runnable) {
        if (this.f38773c == null) {
            synchronized (this.f38771a) {
                try {
                    if (this.f38773c == null) {
                        this.f38773c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f38773c.post(runnable);
    }
}
