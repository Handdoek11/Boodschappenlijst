package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import d2.AbstractC5703e;
import d2.AbstractC5709k;
import e2.AbstractC5742a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class k implements h.b, AbstractC5742a.f {

    /* renamed from: Q, reason: collision with root package name */
    private static final c f12782Q = new c();

    /* renamed from: A, reason: collision with root package name */
    private final O1.a f12783A;

    /* renamed from: B, reason: collision with root package name */
    private final AtomicInteger f12784B;

    /* renamed from: C, reason: collision with root package name */
    private J1.e f12785C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f12786D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f12787E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f12788F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f12789G;

    /* renamed from: H, reason: collision with root package name */
    private L1.c f12790H;

    /* renamed from: I, reason: collision with root package name */
    J1.a f12791I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f12792J;

    /* renamed from: K, reason: collision with root package name */
    GlideException f12793K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f12794L;

    /* renamed from: M, reason: collision with root package name */
    o f12795M;

    /* renamed from: N, reason: collision with root package name */
    private h f12796N;

    /* renamed from: O, reason: collision with root package name */
    private volatile boolean f12797O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f12798P;

    /* renamed from: o, reason: collision with root package name */
    final e f12799o;

    /* renamed from: s, reason: collision with root package name */
    private final e2.c f12800s;

    /* renamed from: t, reason: collision with root package name */
    private final o.a f12801t;

    /* renamed from: u, reason: collision with root package name */
    private final y0.f f12802u;

    /* renamed from: v, reason: collision with root package name */
    private final c f12803v;

    /* renamed from: w, reason: collision with root package name */
    private final l f12804w;

    /* renamed from: x, reason: collision with root package name */
    private final O1.a f12805x;

    /* renamed from: y, reason: collision with root package name */
    private final O1.a f12806y;

    /* renamed from: z, reason: collision with root package name */
    private final O1.a f12807z;

    private class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final Z1.g f12808o;

        a(Z1.g gVar) {
            this.f12808o = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f12808o.f()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f12799o.c(this.f12808o)) {
                            k.this.e(this.f12808o);
                        }
                        k.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final Z1.g f12810o;

        b(Z1.g gVar) {
            this.f12810o = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f12810o.f()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f12799o.c(this.f12810o)) {
                            k.this.f12795M.a();
                            k.this.f(this.f12810o);
                            k.this.r(this.f12810o);
                        }
                        k.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public o a(L1.c cVar, boolean z7, J1.e eVar, o.a aVar) {
            return new o(cVar, z7, true, eVar, aVar);
        }
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Z1.g f12812a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f12813b;

        d(Z1.g gVar, Executor executor) {
            this.f12812a = gVar;
            this.f12813b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f12812a.equals(((d) obj).f12812a);
            }
            return false;
        }

        public int hashCode() {
            return this.f12812a.hashCode();
        }
    }

    static final class e implements Iterable {

        /* renamed from: o, reason: collision with root package name */
        private final List f12814o;

        e() {
            this(new ArrayList(2));
        }

        private static d e(Z1.g gVar) {
            return new d(gVar, AbstractC5703e.a());
        }

        void b(Z1.g gVar, Executor executor) {
            this.f12814o.add(new d(gVar, executor));
        }

        boolean c(Z1.g gVar) {
            return this.f12814o.contains(e(gVar));
        }

        void clear() {
            this.f12814o.clear();
        }

        e d() {
            return new e(new ArrayList(this.f12814o));
        }

        boolean isEmpty() {
            return this.f12814o.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f12814o.iterator();
        }

        void j(Z1.g gVar) {
            this.f12814o.remove(e(gVar));
        }

        int size() {
            return this.f12814o.size();
        }

        e(List list) {
            this.f12814o = list;
        }
    }

    k(O1.a aVar, O1.a aVar2, O1.a aVar3, O1.a aVar4, l lVar, o.a aVar5, y0.f fVar) {
        this(aVar, aVar2, aVar3, aVar4, lVar, aVar5, fVar, f12782Q);
    }

    private O1.a j() {
        return this.f12787E ? this.f12807z : this.f12788F ? this.f12783A : this.f12806y;
    }

    private boolean m() {
        return this.f12794L || this.f12792J || this.f12797O;
    }

    private synchronized void q() {
        if (this.f12785C == null) {
            throw new IllegalArgumentException();
        }
        this.f12799o.clear();
        this.f12785C = null;
        this.f12795M = null;
        this.f12790H = null;
        this.f12794L = false;
        this.f12797O = false;
        this.f12792J = false;
        this.f12798P = false;
        this.f12796N.C(false);
        this.f12796N = null;
        this.f12793K = null;
        this.f12791I = null;
        this.f12802u.a(this);
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void a(GlideException glideException) {
        synchronized (this) {
            this.f12793K = glideException;
        }
        n();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void b(h hVar) {
        j().execute(hVar);
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(L1.c cVar, J1.a aVar, boolean z7) {
        synchronized (this) {
            this.f12790H = cVar;
            this.f12791I = aVar;
            this.f12798P = z7;
        }
        o();
    }

    synchronized void d(Z1.g gVar, Executor executor) {
        try {
            this.f12800s.c();
            this.f12799o.b(gVar, executor);
            if (this.f12792J) {
                k(1);
                executor.execute(new b(gVar));
            } else if (this.f12794L) {
                k(1);
                executor.execute(new a(gVar));
            } else {
                AbstractC5709k.a(!this.f12797O, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void e(Z1.g gVar) {
        try {
            gVar.a(this.f12793K);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    void f(Z1.g gVar) {
        try {
            gVar.c(this.f12795M, this.f12791I, this.f12798P);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    void g() {
        if (m()) {
            return;
        }
        this.f12797O = true;
        this.f12796N.a();
        this.f12804w.c(this, this.f12785C);
    }

    @Override // e2.AbstractC5742a.f
    public e2.c h() {
        return this.f12800s;
    }

    void i() {
        o oVar;
        synchronized (this) {
            try {
                this.f12800s.c();
                AbstractC5709k.a(m(), "Not yet complete!");
                int decrementAndGet = this.f12784B.decrementAndGet();
                AbstractC5709k.a(decrementAndGet >= 0, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    oVar = this.f12795M;
                    q();
                } else {
                    oVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oVar != null) {
            oVar.g();
        }
    }

    synchronized void k(int i8) {
        o oVar;
        AbstractC5709k.a(m(), "Not yet complete!");
        if (this.f12784B.getAndAdd(i8) == 0 && (oVar = this.f12795M) != null) {
            oVar.a();
        }
    }

    synchronized k l(J1.e eVar, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f12785C = eVar;
        this.f12786D = z7;
        this.f12787E = z8;
        this.f12788F = z9;
        this.f12789G = z10;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f12800s.c();
                if (this.f12797O) {
                    q();
                    return;
                }
                if (this.f12799o.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f12794L) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f12794L = true;
                J1.e eVar = this.f12785C;
                e d8 = this.f12799o.d();
                k(d8.size() + 1);
                this.f12804w.b(this, eVar, null);
                Iterator it = d8.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f12813b.execute(new a(dVar.f12812a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.f12800s.c();
                if (this.f12797O) {
                    this.f12790H.b();
                    q();
                    return;
                }
                if (this.f12799o.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f12792J) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f12795M = this.f12803v.a(this.f12790H, this.f12786D, this.f12785C, this.f12801t);
                this.f12792J = true;
                e d8 = this.f12799o.d();
                k(d8.size() + 1);
                this.f12804w.b(this, this.f12785C, this.f12795M);
                Iterator it = d8.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f12813b.execute(new b(dVar.f12812a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean p() {
        return this.f12789G;
    }

    synchronized void r(Z1.g gVar) {
        try {
            this.f12800s.c();
            this.f12799o.j(gVar);
            if (this.f12799o.isEmpty()) {
                g();
                if (this.f12792J || this.f12794L) {
                    if (this.f12784B.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(h hVar) {
        try {
            this.f12796N = hVar;
            (hVar.J() ? this.f12805x : j()).execute(hVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    k(O1.a aVar, O1.a aVar2, O1.a aVar3, O1.a aVar4, l lVar, o.a aVar5, y0.f fVar, c cVar) {
        this.f12799o = new e();
        this.f12800s = e2.c.a();
        this.f12784B = new AtomicInteger();
        this.f12805x = aVar;
        this.f12806y = aVar2;
        this.f12807z = aVar3;
        this.f12783A = aVar4;
        this.f12804w = lVar;
        this.f12801t = aVar5;
        this.f12802u = fVar;
        this.f12803v = cVar;
    }
}
