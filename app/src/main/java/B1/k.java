package B1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class k implements Executor {

    /* renamed from: s, reason: collision with root package name */
    private final Executor f341s;

    /* renamed from: u, reason: collision with root package name */
    private volatile Runnable f343u;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayDeque f340o = new ArrayDeque();

    /* renamed from: t, reason: collision with root package name */
    private final Object f342t = new Object();

    static class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final k f344o;

        /* renamed from: s, reason: collision with root package name */
        final Runnable f345s;

        a(k kVar, Runnable runnable) {
            this.f344o = kVar;
            this.f345s = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f345s.run();
            } finally {
                this.f344o.b();
            }
        }
    }

    public k(Executor executor) {
        this.f341s = executor;
    }

    public boolean a() {
        boolean z7;
        synchronized (this.f342t) {
            z7 = !this.f340o.isEmpty();
        }
        return z7;
    }

    void b() {
        synchronized (this.f342t) {
            try {
                Runnable runnable = (Runnable) this.f340o.poll();
                this.f343u = runnable;
                if (runnable != null) {
                    this.f341s.execute(this.f343u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f342t) {
            try {
                this.f340o.add(new a(this, runnable));
                if (this.f343u == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
