package com.bumptech.glide.load.engine;

import d2.AbstractC5709k;
import e2.AbstractC5742a;

/* loaded from: classes.dex */
final class r implements L1.c, AbstractC5742a.f {

    /* renamed from: v, reason: collision with root package name */
    private static final y0.f f12837v = AbstractC5742a.d(20, new a());

    /* renamed from: o, reason: collision with root package name */
    private final e2.c f12838o = e2.c.a();

    /* renamed from: s, reason: collision with root package name */
    private L1.c f12839s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12840t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f12841u;

    class a implements AbstractC5742a.d {
        a() {
        }

        @Override // e2.AbstractC5742a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a() {
            return new r();
        }
    }

    r() {
    }

    private void a(L1.c cVar) {
        this.f12841u = false;
        this.f12840t = true;
        this.f12839s = cVar;
    }

    static r e(L1.c cVar) {
        r rVar = (r) AbstractC5709k.d((r) f12837v.b());
        rVar.a(cVar);
        return rVar;
    }

    private void f() {
        this.f12839s = null;
        f12837v.a(this);
    }

    @Override // L1.c
    public synchronized void b() {
        this.f12838o.c();
        this.f12841u = true;
        if (!this.f12840t) {
            this.f12839s.b();
            f();
        }
    }

    @Override // L1.c
    public int c() {
        return this.f12839s.c();
    }

    @Override // L1.c
    public Class d() {
        return this.f12839s.d();
    }

    synchronized void g() {
        this.f12838o.c();
        if (!this.f12840t) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f12840t = false;
        if (this.f12841u) {
            b();
        }
    }

    @Override // L1.c
    public Object get() {
        return this.f12839s.get();
    }

    @Override // e2.AbstractC5742a.f
    public e2.c h() {
        return this.f12838o;
    }
}
