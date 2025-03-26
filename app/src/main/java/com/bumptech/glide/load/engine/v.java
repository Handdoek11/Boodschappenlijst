package com.bumptech.glide.load.engine;

import P1.n;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import d2.AbstractC5705g;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class v implements f, f.a {

    /* renamed from: o, reason: collision with root package name */
    private final g f12863o;

    /* renamed from: s, reason: collision with root package name */
    private final f.a f12864s;

    /* renamed from: t, reason: collision with root package name */
    private volatile int f12865t;

    /* renamed from: u, reason: collision with root package name */
    private volatile c f12866u;

    /* renamed from: v, reason: collision with root package name */
    private volatile Object f12867v;

    /* renamed from: w, reason: collision with root package name */
    private volatile n.a f12868w;

    /* renamed from: x, reason: collision with root package name */
    private volatile d f12869x;

    class a implements d.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ n.a f12870o;

        a(n.a aVar) {
            this.f12870o = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (v.this.e(this.f12870o)) {
                v.this.i(this.f12870o, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (v.this.e(this.f12870o)) {
                v.this.h(this.f12870o, obj);
            }
        }
    }

    v(g gVar, f.a aVar) {
        this.f12863o = gVar;
        this.f12864s = aVar;
    }

    private boolean b(Object obj) {
        long b8 = AbstractC5705g.b();
        boolean z7 = false;
        try {
            com.bumptech.glide.load.data.e o8 = this.f12863o.o(obj);
            Object a8 = o8.a();
            J1.d q8 = this.f12863o.q(a8);
            e eVar = new e(q8, a8, this.f12863o.k());
            d dVar = new d(this.f12868w.f4351a, this.f12863o.p());
            N1.a d8 = this.f12863o.d();
            d8.b(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + q8 + ", duration: " + AbstractC5705g.a(b8));
            }
            if (d8.a(dVar) != null) {
                this.f12869x = dVar;
                this.f12866u = new c(Collections.singletonList(this.f12868w.f4351a), this.f12863o, this);
                this.f12868w.f4353c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f12869x + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f12864s.c(this.f12868w.f4351a, o8.a(), this.f12868w.f4353c, this.f12868w.f4353c.d(), this.f12868w.f4351a);
                return false;
            } catch (Throwable th) {
                th = th;
                z7 = true;
                if (!z7) {
                    this.f12868w.f4353c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean d() {
        return this.f12865t < this.f12863o.g().size();
    }

    private void j(n.a aVar) {
        this.f12868w.f4353c.e(this.f12863o.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        if (this.f12867v != null) {
            Object obj = this.f12867v;
            this.f12867v = null;
            try {
                if (!b(obj)) {
                    return true;
                }
            } catch (IOException e8) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e8);
                }
            }
        }
        if (this.f12866u != null && this.f12866u.a()) {
            return true;
        }
        this.f12866u = null;
        this.f12868w = null;
        boolean z7 = false;
        while (!z7 && d()) {
            List g8 = this.f12863o.g();
            int i8 = this.f12865t;
            this.f12865t = i8 + 1;
            this.f12868w = (n.a) g8.get(i8);
            if (this.f12868w != null && (this.f12863o.e().c(this.f12868w.f4353c.d()) || this.f12863o.u(this.f12868w.f4353c.a()))) {
                j(this.f12868w);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(J1.e eVar, Object obj, com.bumptech.glide.load.data.d dVar, J1.a aVar, J1.e eVar2) {
        this.f12864s.c(eVar, obj, dVar, this.f12868w.f4353c.d(), eVar);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a aVar = this.f12868w;
        if (aVar != null) {
            aVar.f4353c.cancel();
        }
    }

    boolean e(n.a aVar) {
        n.a aVar2 = this.f12868w;
        return aVar2 != null && aVar2 == aVar;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void f(J1.e eVar, Exception exc, com.bumptech.glide.load.data.d dVar, J1.a aVar) {
        this.f12864s.f(eVar, exc, dVar, this.f12868w.f4353c.d());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void g() {
        throw new UnsupportedOperationException();
    }

    void h(n.a aVar, Object obj) {
        L1.a e8 = this.f12863o.e();
        if (obj != null && e8.c(aVar.f4353c.d())) {
            this.f12867v = obj;
            this.f12864s.g();
        } else {
            f.a aVar2 = this.f12864s;
            J1.e eVar = aVar.f4351a;
            com.bumptech.glide.load.data.d dVar = aVar.f4353c;
            aVar2.c(eVar, obj, dVar, dVar.d(), this.f12869x);
        }
    }

    void i(n.a aVar, Exception exc) {
        f.a aVar2 = this.f12864s;
        d dVar = this.f12869x;
        com.bumptech.glide.load.data.d dVar2 = aVar.f4353c;
        aVar2.f(dVar, exc, dVar2, dVar2.d());
    }
}
