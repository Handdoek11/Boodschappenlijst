package s6;

import a6.i;
import d6.InterfaceC5732b;
import g6.EnumC5814b;
import r6.C6709a;
import r6.EnumC6715g;
import t6.AbstractC6805a;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6761b implements i, InterfaceC5732b {

    /* renamed from: o, reason: collision with root package name */
    final i f43727o;

    /* renamed from: s, reason: collision with root package name */
    final boolean f43728s;

    /* renamed from: t, reason: collision with root package name */
    InterfaceC5732b f43729t;

    /* renamed from: u, reason: collision with root package name */
    boolean f43730u;

    /* renamed from: v, reason: collision with root package name */
    C6709a f43731v;

    /* renamed from: w, reason: collision with root package name */
    volatile boolean f43732w;

    public C6761b(i iVar) {
        this(iVar, false);
    }

    @Override // a6.i
    public void a() {
        if (this.f43732w) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f43732w) {
                    return;
                }
                if (!this.f43730u) {
                    this.f43732w = true;
                    this.f43730u = true;
                    this.f43727o.a();
                } else {
                    C6709a c6709a = this.f43731v;
                    if (c6709a == null) {
                        c6709a = new C6709a(4);
                        this.f43731v = c6709a;
                    }
                    c6709a.b(EnumC6715g.f());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a6.i
    public void b(Object obj) {
        if (this.f43732w) {
            return;
        }
        if (obj == null) {
            this.f43729t.c();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f43732w) {
                    return;
                }
                if (!this.f43730u) {
                    this.f43730u = true;
                    this.f43727o.b(obj);
                    e();
                } else {
                    C6709a c6709a = this.f43731v;
                    if (c6709a == null) {
                        c6709a = new C6709a(4);
                        this.f43731v = c6709a;
                    }
                    c6709a.b(EnumC6715g.l(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        this.f43729t.c();
    }

    @Override // a6.i
    public void d(InterfaceC5732b interfaceC5732b) {
        if (EnumC5814b.l(this.f43729t, interfaceC5732b)) {
            this.f43729t = interfaceC5732b;
            this.f43727o.d(this);
        }
    }

    void e() {
        C6709a c6709a;
        do {
            synchronized (this) {
                try {
                    c6709a = this.f43731v;
                    if (c6709a == null) {
                        this.f43730u = false;
                        return;
                    }
                    this.f43731v = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!c6709a.a(this.f43727o));
    }

    @Override // a6.i
    public void onError(Throwable th) {
        if (this.f43732w) {
            AbstractC6805a.m(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z7 = true;
                if (!this.f43732w) {
                    if (this.f43730u) {
                        this.f43732w = true;
                        C6709a c6709a = this.f43731v;
                        if (c6709a == null) {
                            c6709a = new C6709a(4);
                            this.f43731v = c6709a;
                        }
                        Object g8 = EnumC6715g.g(th);
                        if (this.f43728s) {
                            c6709a.b(g8);
                        } else {
                            c6709a.d(g8);
                        }
                        return;
                    }
                    this.f43732w = true;
                    this.f43730u = true;
                    z7 = false;
                }
                if (z7) {
                    AbstractC6805a.m(th);
                } else {
                    this.f43727o.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C6761b(i iVar, boolean z7) {
        this.f43727o = iVar;
        this.f43728s = z7;
    }
}
