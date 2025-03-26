package com.bumptech.glide.load.engine;

import N1.a;
import N1.h;
import android.util.Log;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import d2.AbstractC5705g;
import d2.AbstractC5709k;
import e2.AbstractC5742a;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class j implements l, h.a, o.a {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f12756i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    private final p f12757a;

    /* renamed from: b, reason: collision with root package name */
    private final n f12758b;

    /* renamed from: c, reason: collision with root package name */
    private final N1.h f12759c;

    /* renamed from: d, reason: collision with root package name */
    private final b f12760d;

    /* renamed from: e, reason: collision with root package name */
    private final u f12761e;

    /* renamed from: f, reason: collision with root package name */
    private final c f12762f;

    /* renamed from: g, reason: collision with root package name */
    private final a f12763g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f12764h;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f12765a;

        /* renamed from: b, reason: collision with root package name */
        final y0.f f12766b = AbstractC5742a.d(150, new C0221a());

        /* renamed from: c, reason: collision with root package name */
        private int f12767c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a, reason: collision with other inner class name */
        class C0221a implements AbstractC5742a.d {
            C0221a() {
            }

            @Override // e2.AbstractC5742a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h a() {
                a aVar = a.this;
                return new h(aVar.f12765a, aVar.f12766b);
            }
        }

        a(h.e eVar) {
            this.f12765a = eVar;
        }

        h a(com.bumptech.glide.d dVar, Object obj, m mVar, J1.e eVar, int i8, int i9, Class cls, Class cls2, com.bumptech.glide.g gVar, L1.a aVar, Map map, boolean z7, boolean z8, boolean z9, J1.h hVar, h.b bVar) {
            h hVar2 = (h) AbstractC5709k.d((h) this.f12766b.b());
            int i10 = this.f12767c;
            this.f12767c = i10 + 1;
            return hVar2.t(dVar, obj, mVar, eVar, i8, i9, cls, cls2, gVar, aVar, map, z7, z8, z9, hVar, bVar, i10);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final O1.a f12769a;

        /* renamed from: b, reason: collision with root package name */
        final O1.a f12770b;

        /* renamed from: c, reason: collision with root package name */
        final O1.a f12771c;

        /* renamed from: d, reason: collision with root package name */
        final O1.a f12772d;

        /* renamed from: e, reason: collision with root package name */
        final l f12773e;

        /* renamed from: f, reason: collision with root package name */
        final o.a f12774f;

        /* renamed from: g, reason: collision with root package name */
        final y0.f f12775g = AbstractC5742a.d(150, new a());

        class a implements AbstractC5742a.d {
            a() {
            }

            @Override // e2.AbstractC5742a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k a() {
                b bVar = b.this;
                return new k(bVar.f12769a, bVar.f12770b, bVar.f12771c, bVar.f12772d, bVar.f12773e, bVar.f12774f, bVar.f12775g);
            }
        }

        b(O1.a aVar, O1.a aVar2, O1.a aVar3, O1.a aVar4, l lVar, o.a aVar5) {
            this.f12769a = aVar;
            this.f12770b = aVar2;
            this.f12771c = aVar3;
            this.f12772d = aVar4;
            this.f12773e = lVar;
            this.f12774f = aVar5;
        }

        k a(J1.e eVar, boolean z7, boolean z8, boolean z9, boolean z10) {
            return ((k) AbstractC5709k.d((k) this.f12775g.b())).l(eVar, z7, z8, z9, z10);
        }
    }

    private static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0073a f12777a;

        /* renamed from: b, reason: collision with root package name */
        private volatile N1.a f12778b;

        c(a.InterfaceC0073a interfaceC0073a) {
            this.f12777a = interfaceC0073a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public N1.a a() {
            if (this.f12778b == null) {
                synchronized (this) {
                    try {
                        if (this.f12778b == null) {
                            this.f12778b = this.f12777a.a();
                        }
                        if (this.f12778b == null) {
                            this.f12778b = new N1.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f12778b;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final k f12779a;

        /* renamed from: b, reason: collision with root package name */
        private final Z1.g f12780b;

        d(Z1.g gVar, k kVar) {
            this.f12780b = gVar;
            this.f12779a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.f12779a.r(this.f12780b);
            }
        }
    }

    public j(N1.h hVar, a.InterfaceC0073a interfaceC0073a, O1.a aVar, O1.a aVar2, O1.a aVar3, O1.a aVar4, boolean z7) {
        this(hVar, interfaceC0073a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z7);
    }

    private o e(J1.e eVar) {
        L1.c e8 = this.f12759c.e(eVar);
        if (e8 == null) {
            return null;
        }
        return e8 instanceof o ? (o) e8 : new o(e8, true, true, eVar, this);
    }

    private o g(J1.e eVar) {
        o e8 = this.f12764h.e(eVar);
        if (e8 != null) {
            e8.a();
        }
        return e8;
    }

    private o h(J1.e eVar) {
        o e8 = e(eVar);
        if (e8 != null) {
            e8.a();
            this.f12764h.a(eVar, e8);
        }
        return e8;
    }

    private o i(m mVar, boolean z7, long j8) {
        if (!z7) {
            return null;
        }
        o g8 = g(mVar);
        if (g8 != null) {
            if (f12756i) {
                j("Loaded resource from active resources", j8, mVar);
            }
            return g8;
        }
        o h8 = h(mVar);
        if (h8 == null) {
            return null;
        }
        if (f12756i) {
            j("Loaded resource from cache", j8, mVar);
        }
        return h8;
    }

    private static void j(String str, long j8, J1.e eVar) {
        Log.v("Engine", str + " in " + AbstractC5705g.a(j8) + "ms, key: " + eVar);
    }

    private d l(com.bumptech.glide.d dVar, Object obj, J1.e eVar, int i8, int i9, Class cls, Class cls2, com.bumptech.glide.g gVar, L1.a aVar, Map map, boolean z7, boolean z8, J1.h hVar, boolean z9, boolean z10, boolean z11, boolean z12, Z1.g gVar2, Executor executor, m mVar, long j8) {
        k a8 = this.f12757a.a(mVar, z12);
        if (a8 != null) {
            a8.d(gVar2, executor);
            if (f12756i) {
                j("Added to existing load", j8, mVar);
            }
            return new d(gVar2, a8);
        }
        k a9 = this.f12760d.a(mVar, z9, z10, z11, z12);
        h a10 = this.f12763g.a(dVar, obj, mVar, eVar, i8, i9, cls, cls2, gVar, aVar, map, z7, z8, z12, hVar, a9);
        this.f12757a.c(mVar, a9);
        a9.d(gVar2, executor);
        a9.s(a10);
        if (f12756i) {
            j("Started new load", j8, mVar);
        }
        return new d(gVar2, a9);
    }

    @Override // N1.h.a
    public void a(L1.c cVar) {
        this.f12761e.a(cVar, true);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void b(k kVar, J1.e eVar, o oVar) {
        if (oVar != null) {
            try {
                if (oVar.f()) {
                    this.f12764h.a(eVar, oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12757a.d(eVar, kVar);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void c(k kVar, J1.e eVar) {
        this.f12757a.d(eVar, kVar);
    }

    @Override // com.bumptech.glide.load.engine.o.a
    public void d(J1.e eVar, o oVar) {
        this.f12764h.d(eVar);
        if (oVar.f()) {
            this.f12759c.c(eVar, oVar);
        } else {
            this.f12761e.a(oVar, false);
        }
    }

    public d f(com.bumptech.glide.d dVar, Object obj, J1.e eVar, int i8, int i9, Class cls, Class cls2, com.bumptech.glide.g gVar, L1.a aVar, Map map, boolean z7, boolean z8, J1.h hVar, boolean z9, boolean z10, boolean z11, boolean z12, Z1.g gVar2, Executor executor) {
        long b8 = f12756i ? AbstractC5705g.b() : 0L;
        m a8 = this.f12758b.a(obj, eVar, i8, i9, map, cls, cls2, hVar);
        synchronized (this) {
            try {
                o i10 = i(a8, z9, b8);
                if (i10 == null) {
                    return l(dVar, obj, eVar, i8, i9, cls, cls2, gVar, aVar, map, z7, z8, hVar, z9, z10, z11, z12, gVar2, executor, a8, b8);
                }
                gVar2.c(i10, J1.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(L1.c cVar) {
        if (!(cVar instanceof o)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o) cVar).g();
    }

    j(N1.h hVar, a.InterfaceC0073a interfaceC0073a, O1.a aVar, O1.a aVar2, O1.a aVar3, O1.a aVar4, p pVar, n nVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, u uVar, boolean z7) {
        this.f12759c = hVar;
        c cVar = new c(interfaceC0073a);
        this.f12762f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z7) : aVar5;
        this.f12764h = aVar7;
        aVar7.f(this);
        this.f12758b = nVar == null ? new n() : nVar;
        this.f12757a = pVar == null ? new p() : pVar;
        this.f12760d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f12763g = aVar6 == null ? new a(cVar) : aVar6;
        this.f12761e = uVar == null ? new u() : uVar;
        hVar.d(this);
    }
}
