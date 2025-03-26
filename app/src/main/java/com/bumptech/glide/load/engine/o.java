package com.bumptech.glide.load.engine;

import d2.AbstractC5709k;

/* loaded from: classes.dex */
class o implements L1.c {

    /* renamed from: o, reason: collision with root package name */
    private final boolean f12824o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f12825s;

    /* renamed from: t, reason: collision with root package name */
    private final L1.c f12826t;

    /* renamed from: u, reason: collision with root package name */
    private final a f12827u;

    /* renamed from: v, reason: collision with root package name */
    private final J1.e f12828v;

    /* renamed from: w, reason: collision with root package name */
    private int f12829w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f12830x;

    interface a {
        void d(J1.e eVar, o oVar);
    }

    o(L1.c cVar, boolean z7, boolean z8, J1.e eVar, a aVar) {
        this.f12826t = (L1.c) AbstractC5709k.d(cVar);
        this.f12824o = z7;
        this.f12825s = z8;
        this.f12828v = eVar;
        this.f12827u = (a) AbstractC5709k.d(aVar);
    }

    synchronized void a() {
        if (this.f12830x) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f12829w++;
    }

    @Override // L1.c
    public synchronized void b() {
        if (this.f12829w > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f12830x) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f12830x = true;
        if (this.f12825s) {
            this.f12826t.b();
        }
    }

    @Override // L1.c
    public int c() {
        return this.f12826t.c();
    }

    @Override // L1.c
    public Class d() {
        return this.f12826t.d();
    }

    L1.c e() {
        return this.f12826t;
    }

    boolean f() {
        return this.f12824o;
    }

    void g() {
        boolean z7;
        synchronized (this) {
            int i8 = this.f12829w;
            if (i8 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z7 = true;
            int i9 = i8 - 1;
            this.f12829w = i9;
            if (i9 != 0) {
                z7 = false;
            }
        }
        if (z7) {
            this.f12827u.d(this.f12828v, this);
        }
    }

    @Override // L1.c
    public Object get() {
        return this.f12826t.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f12824o + ", listener=" + this.f12827u + ", key=" + this.f12828v + ", acquired=" + this.f12829w + ", isRecycled=" + this.f12830x + ", resource=" + this.f12826t + '}';
    }
}
