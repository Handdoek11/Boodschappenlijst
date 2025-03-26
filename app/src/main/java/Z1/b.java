package Z1;

import Z1.d;

/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6186a;

    /* renamed from: b, reason: collision with root package name */
    private final d f6187b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f6188c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f6189d;

    /* renamed from: e, reason: collision with root package name */
    private d.a f6190e;

    /* renamed from: f, reason: collision with root package name */
    private d.a f6191f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f6190e = aVar;
        this.f6191f = aVar;
        this.f6186a = obj;
        this.f6187b = dVar;
    }

    private boolean m(c cVar) {
        d.a aVar;
        d.a aVar2 = this.f6190e;
        d.a aVar3 = d.a.FAILED;
        return aVar2 != aVar3 ? cVar.equals(this.f6188c) : cVar.equals(this.f6189d) && ((aVar = this.f6191f) == d.a.SUCCESS || aVar == aVar3);
    }

    private boolean n() {
        d dVar = this.f6187b;
        return dVar == null || dVar.a(this);
    }

    private boolean o() {
        d dVar = this.f6187b;
        return dVar == null || dVar.g(this);
    }

    private boolean p() {
        d dVar = this.f6187b;
        return dVar == null || dVar.c(this);
    }

    @Override // Z1.d
    public boolean a(c cVar) {
        boolean z7;
        synchronized (this.f6186a) {
            try {
                z7 = n() && cVar.equals(this.f6188c);
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.d, Z1.c
    public boolean b() {
        boolean z7;
        synchronized (this.f6186a) {
            try {
                z7 = this.f6188c.b() || this.f6189d.b();
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.d
    public boolean c(c cVar) {
        boolean p8;
        synchronized (this.f6186a) {
            p8 = p();
        }
        return p8;
    }

    @Override // Z1.c
    public void clear() {
        synchronized (this.f6186a) {
            try {
                d.a aVar = d.a.CLEARED;
                this.f6190e = aVar;
                this.f6188c.clear();
                if (this.f6191f != aVar) {
                    this.f6191f = aVar;
                    this.f6189d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.d
    public d d() {
        d d8;
        synchronized (this.f6186a) {
            try {
                d dVar = this.f6187b;
                d8 = dVar != null ? dVar.d() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d8;
    }

    @Override // Z1.c
    public void e() {
        synchronized (this.f6186a) {
            try {
                d.a aVar = this.f6190e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar == aVar2) {
                    this.f6190e = d.a.PAUSED;
                    this.f6188c.e();
                }
                if (this.f6191f == aVar2) {
                    this.f6191f = d.a.PAUSED;
                    this.f6189d.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.d
    public void f(c cVar) {
        synchronized (this.f6186a) {
            try {
                if (cVar.equals(this.f6189d)) {
                    this.f6191f = d.a.FAILED;
                    d dVar = this.f6187b;
                    if (dVar != null) {
                        dVar.f(this);
                    }
                    return;
                }
                this.f6190e = d.a.FAILED;
                d.a aVar = this.f6191f;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f6191f = aVar2;
                    this.f6189d.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.d
    public boolean g(c cVar) {
        boolean z7;
        synchronized (this.f6186a) {
            try {
                z7 = o() && m(cVar);
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.d
    public void h(c cVar) {
        synchronized (this.f6186a) {
            try {
                if (cVar.equals(this.f6188c)) {
                    this.f6190e = d.a.SUCCESS;
                } else if (cVar.equals(this.f6189d)) {
                    this.f6191f = d.a.SUCCESS;
                }
                d dVar = this.f6187b;
                if (dVar != null) {
                    dVar.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.c
    public boolean i(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f6188c.i(bVar.f6188c) && this.f6189d.i(bVar.f6189d);
    }

    @Override // Z1.c
    public boolean isRunning() {
        boolean z7;
        synchronized (this.f6186a) {
            try {
                d.a aVar = this.f6190e;
                d.a aVar2 = d.a.RUNNING;
                z7 = aVar == aVar2 || this.f6191f == aVar2;
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.c
    public boolean j() {
        boolean z7;
        synchronized (this.f6186a) {
            try {
                d.a aVar = this.f6190e;
                d.a aVar2 = d.a.CLEARED;
                z7 = aVar == aVar2 && this.f6191f == aVar2;
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.c
    public void k() {
        synchronized (this.f6186a) {
            try {
                d.a aVar = this.f6190e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f6190e = aVar2;
                    this.f6188c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.c
    public boolean l() {
        boolean z7;
        synchronized (this.f6186a) {
            try {
                d.a aVar = this.f6190e;
                d.a aVar2 = d.a.SUCCESS;
                z7 = aVar == aVar2 || this.f6191f == aVar2;
            } finally {
            }
        }
        return z7;
    }

    public void q(c cVar, c cVar2) {
        this.f6188c = cVar;
        this.f6189d = cVar2;
    }
}
