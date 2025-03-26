package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class l implements Executor {

    /* renamed from: o, reason: collision with root package name */
    private final Executor f11407o;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayDeque f11408s = new ArrayDeque();

    /* renamed from: t, reason: collision with root package name */
    private Runnable f11409t;

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Runnable f11410o;

        a(Runnable runnable) {
            this.f11410o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11410o.run();
            } finally {
                l.this.a();
            }
        }
    }

    l(Executor executor) {
        this.f11407o = executor;
    }

    synchronized void a() {
        Runnable runnable = (Runnable) this.f11408s.poll();
        this.f11409t = runnable;
        if (runnable != null) {
            this.f11407o.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f11408s.offer(new a(runnable));
        if (this.f11409t == null) {
            a();
        }
    }
}
