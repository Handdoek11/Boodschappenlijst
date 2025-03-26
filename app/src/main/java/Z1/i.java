package Z1;

import Z1.d;

/* loaded from: classes.dex */
public class i implements d, c {

    /* renamed from: a, reason: collision with root package name */
    private final d f6237a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6238b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f6239c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f6240d;

    /* renamed from: e, reason: collision with root package name */
    private d.a f6241e;

    /* renamed from: f, reason: collision with root package name */
    private d.a f6242f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6243g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f6241e = aVar;
        this.f6242f = aVar;
        this.f6238b = obj;
        this.f6237a = dVar;
    }

    private boolean m() {
        d dVar = this.f6237a;
        return dVar == null || dVar.a(this);
    }

    private boolean n() {
        d dVar = this.f6237a;
        return dVar == null || dVar.g(this);
    }

    private boolean o() {
        d dVar = this.f6237a;
        return dVar == null || dVar.c(this);
    }

    @Override // Z1.d
    public boolean a(c cVar) {
        boolean z7;
        synchronized (this.f6238b) {
            try {
                z7 = m() && cVar.equals(this.f6239c) && this.f6241e != d.a.PAUSED;
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.d, Z1.c
    public boolean b() {
        boolean z7;
        synchronized (this.f6238b) {
            try {
                z7 = this.f6240d.b() || this.f6239c.b();
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.d
    public boolean c(c cVar) {
        boolean z7;
        synchronized (this.f6238b) {
            try {
                z7 = o() && (cVar.equals(this.f6239c) || this.f6241e != d.a.SUCCESS);
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.c
    public void clear() {
        synchronized (this.f6238b) {
            this.f6243g = false;
            d.a aVar = d.a.CLEARED;
            this.f6241e = aVar;
            this.f6242f = aVar;
            this.f6240d.clear();
            this.f6239c.clear();
        }
    }

    @Override // Z1.d
    public d d() {
        d d8;
        synchronized (this.f6238b) {
            try {
                d dVar = this.f6237a;
                d8 = dVar != null ? dVar.d() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d8;
    }

    @Override // Z1.c
    public void e() {
        synchronized (this.f6238b) {
            try {
                if (!this.f6242f.c()) {
                    this.f6242f = d.a.PAUSED;
                    this.f6240d.e();
                }
                if (!this.f6241e.c()) {
                    this.f6241e = d.a.PAUSED;
                    this.f6239c.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.d
    public void f(c cVar) {
        synchronized (this.f6238b) {
            try {
                if (!cVar.equals(this.f6239c)) {
                    this.f6242f = d.a.FAILED;
                    return;
                }
                this.f6241e = d.a.FAILED;
                d dVar = this.f6237a;
                if (dVar != null) {
                    dVar.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.d
    public boolean g(c cVar) {
        boolean z7;
        synchronized (this.f6238b) {
            try {
                z7 = n() && cVar.equals(this.f6239c) && !b();
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.d
    public void h(c cVar) {
        synchronized (this.f6238b) {
            try {
                if (cVar.equals(this.f6240d)) {
                    this.f6242f = d.a.SUCCESS;
                    return;
                }
                this.f6241e = d.a.SUCCESS;
                d dVar = this.f6237a;
                if (dVar != null) {
                    dVar.h(this);
                }
                if (!this.f6242f.c()) {
                    this.f6240d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.c
    public boolean i(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f6239c == null) {
            if (iVar.f6239c != null) {
                return false;
            }
        } else if (!this.f6239c.i(iVar.f6239c)) {
            return false;
        }
        if (this.f6240d == null) {
            if (iVar.f6240d != null) {
                return false;
            }
        } else if (!this.f6240d.i(iVar.f6240d)) {
            return false;
        }
        return true;
    }

    @Override // Z1.c
    public boolean isRunning() {
        boolean z7;
        synchronized (this.f6238b) {
            z7 = this.f6241e == d.a.RUNNING;
        }
        return z7;
    }

    @Override // Z1.c
    public boolean j() {
        boolean z7;
        synchronized (this.f6238b) {
            z7 = this.f6241e == d.a.CLEARED;
        }
        return z7;
    }

    @Override // Z1.c
    public void k() {
        synchronized (this.f6238b) {
            try {
                this.f6243g = true;
                try {
                    if (this.f6241e != d.a.SUCCESS) {
                        d.a aVar = this.f6242f;
                        d.a aVar2 = d.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f6242f = aVar2;
                            this.f6240d.k();
                        }
                    }
                    if (this.f6243g) {
                        d.a aVar3 = this.f6241e;
                        d.a aVar4 = d.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f6241e = aVar4;
                            this.f6239c.k();
                        }
                    }
                    this.f6243g = false;
                } catch (Throwable th) {
                    this.f6243g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Z1.c
    public boolean l() {
        boolean z7;
        synchronized (this.f6238b) {
            z7 = this.f6241e == d.a.SUCCESS;
        }
        return z7;
    }

    public void p(c cVar, c cVar2) {
        this.f6239c = cVar;
        this.f6240d = cVar2;
    }
}
