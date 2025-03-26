package B1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class r {

    /* renamed from: f, reason: collision with root package name */
    private static final String f382f = s1.j.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f383a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f384b;

    /* renamed from: c, reason: collision with root package name */
    final Map f385c;

    /* renamed from: d, reason: collision with root package name */
    final Map f386d;

    /* renamed from: e, reason: collision with root package name */
    final Object f387e;

    class a implements ThreadFactory {

        /* renamed from: o, reason: collision with root package name */
        private int f388o = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f388o);
            this.f388o = this.f388o + 1;
            return newThread;
        }
    }

    public interface b {
        void a(String str);
    }

    public static class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final r f390o;

        /* renamed from: s, reason: collision with root package name */
        private final String f391s;

        c(r rVar, String str) {
            this.f390o = rVar;
            this.f391s = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f390o.f387e) {
                try {
                    if (((c) this.f390o.f385c.remove(this.f391s)) != null) {
                        b bVar = (b) this.f390o.f386d.remove(this.f391s);
                        if (bVar != null) {
                            bVar.a(this.f391s);
                        }
                    } else {
                        s1.j.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f391s), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public r() {
        a aVar = new a();
        this.f383a = aVar;
        this.f385c = new HashMap();
        this.f386d = new HashMap();
        this.f387e = new Object();
        this.f384b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f384b.isShutdown()) {
            return;
        }
        this.f384b.shutdownNow();
    }

    public void b(String str, long j8, b bVar) {
        synchronized (this.f387e) {
            s1.j.c().a(f382f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f385c.put(str, cVar);
            this.f386d.put(str, bVar);
            this.f384b.schedule(cVar, j8, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f387e) {
            try {
                if (((c) this.f385c.remove(str)) != null) {
                    s1.j.c().a(f382f, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f386d.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
