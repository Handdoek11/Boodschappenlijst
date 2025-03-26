package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.r;
import d2.AbstractC5710l;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class k implements ComponentCallbacks2, com.bumptech.glide.manager.k {

    /* renamed from: D, reason: collision with root package name */
    private static final Z1.f f12582D = (Z1.f) Z1.f.p0(Bitmap.class).T();

    /* renamed from: E, reason: collision with root package name */
    private static final Z1.f f12583E = (Z1.f) Z1.f.p0(V1.c.class).T();

    /* renamed from: F, reason: collision with root package name */
    private static final Z1.f f12584F = (Z1.f) ((Z1.f) Z1.f.q0(L1.a.f3694c).b0(g.LOW)).i0(true);

    /* renamed from: A, reason: collision with root package name */
    private Z1.f f12585A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f12586B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f12587C;

    /* renamed from: o, reason: collision with root package name */
    protected final com.bumptech.glide.b f12588o;

    /* renamed from: s, reason: collision with root package name */
    protected final Context f12589s;

    /* renamed from: t, reason: collision with root package name */
    final com.bumptech.glide.manager.j f12590t;

    /* renamed from: u, reason: collision with root package name */
    private final p f12591u;

    /* renamed from: v, reason: collision with root package name */
    private final o f12592v;

    /* renamed from: w, reason: collision with root package name */
    private final r f12593w;

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f12594x;

    /* renamed from: y, reason: collision with root package name */
    private final com.bumptech.glide.manager.b f12595y;

    /* renamed from: z, reason: collision with root package name */
    private final CopyOnWriteArrayList f12596z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f12590t.a(kVar);
        }
    }

    private class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final p f12598a;

        b(p pVar) {
            this.f12598a = pVar;
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z7) {
            if (z7) {
                synchronized (k.this) {
                    this.f12598a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, com.bumptech.glide.manager.j jVar, o oVar, Context context) {
        this(bVar, jVar, oVar, new p(), bVar.g(), context);
    }

    private void B(a2.h hVar) {
        boolean A7 = A(hVar);
        Z1.c i8 = hVar.i();
        if (A7 || this.f12588o.p(hVar) || i8 == null) {
            return;
        }
        hVar.c(null);
        i8.clear();
    }

    private synchronized void o() {
        try {
            Iterator it = this.f12593w.l().iterator();
            while (it.hasNext()) {
                n((a2.h) it.next());
            }
            this.f12593w.k();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized boolean A(a2.h hVar) {
        Z1.c i8 = hVar.i();
        if (i8 == null) {
            return true;
        }
        if (!this.f12591u.a(i8)) {
            return false;
        }
        this.f12593w.n(hVar);
        hVar.c(null);
        return true;
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void a() {
        x();
        this.f12593w.a();
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void f() {
        try {
            this.f12593w.f();
            if (this.f12587C) {
                o();
            } else {
                w();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public j k(Class cls) {
        return new j(this.f12588o, this, cls, this.f12589s);
    }

    public j l() {
        return k(Bitmap.class).b(f12582D);
    }

    public j m() {
        return k(Drawable.class);
    }

    public void n(a2.h hVar) {
        if (hVar == null) {
            return;
        }
        B(hVar);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onDestroy() {
        this.f12593w.onDestroy();
        o();
        this.f12591u.b();
        this.f12590t.b(this);
        this.f12590t.b(this.f12595y);
        AbstractC5710l.w(this.f12594x);
        this.f12588o.s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i8) {
        if (i8 == 60 && this.f12586B) {
            v();
        }
    }

    List p() {
        return this.f12596z;
    }

    synchronized Z1.f q() {
        return this.f12585A;
    }

    l r(Class cls) {
        return this.f12588o.i().e(cls);
    }

    public j s(File file) {
        return m().D0(file);
    }

    public j t(String str) {
        return m().F0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f12591u + ", treeNode=" + this.f12592v + "}";
    }

    public synchronized void u() {
        this.f12591u.c();
    }

    public synchronized void v() {
        u();
        Iterator it = this.f12592v.a().iterator();
        while (it.hasNext()) {
            ((k) it.next()).u();
        }
    }

    public synchronized void w() {
        this.f12591u.d();
    }

    public synchronized void x() {
        this.f12591u.f();
    }

    protected synchronized void y(Z1.f fVar) {
        this.f12585A = (Z1.f) ((Z1.f) fVar.clone()).c();
    }

    synchronized void z(a2.h hVar, Z1.c cVar) {
        this.f12593w.m(hVar);
        this.f12591u.g(cVar);
    }

    k(com.bumptech.glide.b bVar, com.bumptech.glide.manager.j jVar, o oVar, p pVar, com.bumptech.glide.manager.c cVar, Context context) {
        this.f12593w = new r();
        a aVar = new a();
        this.f12594x = aVar;
        this.f12588o = bVar;
        this.f12590t = jVar;
        this.f12592v = oVar;
        this.f12591u = pVar;
        this.f12589s = context;
        com.bumptech.glide.manager.b a8 = cVar.a(context.getApplicationContext(), new b(pVar));
        this.f12595y = a8;
        bVar.o(this);
        if (AbstractC5710l.r()) {
            AbstractC5710l.v(aVar);
        } else {
            jVar.a(this);
        }
        jVar.a(a8);
        this.f12596z = new CopyOnWriteArrayList(bVar.i().c());
        y(bVar.i().d());
    }
}
