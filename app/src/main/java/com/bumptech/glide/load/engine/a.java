package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.o;
import d2.AbstractC5709k;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12653a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12654b;

    /* renamed from: c, reason: collision with root package name */
    final Map f12655c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f12656d;

    /* renamed from: e, reason: collision with root package name */
    private o.a f12657e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f12658f;

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0218a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC0219a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Runnable f12659o;

            RunnableC0219a(Runnable runnable) {
                this.f12659o = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f12659o.run();
            }
        }

        ThreadFactoryC0218a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0219a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final J1.e f12662a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f12663b;

        /* renamed from: c, reason: collision with root package name */
        L1.c f12664c;

        c(J1.e eVar, o oVar, ReferenceQueue referenceQueue, boolean z7) {
            super(oVar, referenceQueue);
            this.f12662a = (J1.e) AbstractC5709k.d(eVar);
            this.f12664c = (oVar.f() && z7) ? (L1.c) AbstractC5709k.d(oVar.e()) : null;
            this.f12663b = oVar.f();
        }

        void a() {
            this.f12664c = null;
            clear();
        }
    }

    a(boolean z7) {
        this(z7, Executors.newSingleThreadExecutor(new ThreadFactoryC0218a()));
    }

    synchronized void a(J1.e eVar, o oVar) {
        c cVar = (c) this.f12655c.put(eVar, new c(eVar, oVar, this.f12656d, this.f12653a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f12658f) {
            try {
                c((c) this.f12656d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        L1.c cVar2;
        synchronized (this) {
            this.f12655c.remove(cVar.f12662a);
            if (cVar.f12663b && (cVar2 = cVar.f12664c) != null) {
                this.f12657e.d(cVar.f12662a, new o(cVar2, true, false, cVar.f12662a, this.f12657e));
            }
        }
    }

    synchronized void d(J1.e eVar) {
        c cVar = (c) this.f12655c.remove(eVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized o e(J1.e eVar) {
        c cVar = (c) this.f12655c.get(eVar);
        if (cVar == null) {
            return null;
        }
        o oVar = (o) cVar.get();
        if (oVar == null) {
            c(cVar);
        }
        return oVar;
    }

    void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f12657e = aVar;
            }
        }
    }

    a(boolean z7, Executor executor) {
        this.f12655c = new HashMap();
        this.f12656d = new ReferenceQueue();
        this.f12653a = z7;
        this.f12654b = executor;
        executor.execute(new b());
    }
}
