package androidx.lifecycle;

import androidx.lifecycle.AbstractC0922h;
import java.util.Map;
import m.C6182b;

/* loaded from: classes.dex */
public abstract class LiveData {

    /* renamed from: k, reason: collision with root package name */
    static final Object f10252k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f10253a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private C6182b f10254b = new C6182b();

    /* renamed from: c, reason: collision with root package name */
    int f10255c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10256d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f10257e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f10258f;

    /* renamed from: g, reason: collision with root package name */
    private int f10259g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10260h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10261i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f10262j;

    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements InterfaceC0925k {

        /* renamed from: v, reason: collision with root package name */
        final InterfaceC0927m f10263v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ LiveData f10264w;

        void b() {
            this.f10263v.getLifecycle().c(this);
        }

        boolean c() {
            return this.f10263v.getLifecycle().b().c(AbstractC0922h.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC0925k
        public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
            AbstractC0922h.b b8 = this.f10263v.getLifecycle().b();
            if (b8 == AbstractC0922h.b.DESTROYED) {
                this.f10264w.i(this.f10267o);
                return;
            }
            AbstractC0922h.b bVar = null;
            while (bVar != b8) {
                a(c());
                bVar = b8;
                b8 = this.f10263v.getLifecycle().b();
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f10253a) {
                obj = LiveData.this.f10258f;
                LiveData.this.f10258f = LiveData.f10252k;
            }
            LiveData.this.j(obj);
        }
    }

    private class b extends c {
        b(s sVar) {
            super(sVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean c() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: o, reason: collision with root package name */
        final s f10267o;

        /* renamed from: s, reason: collision with root package name */
        boolean f10268s;

        /* renamed from: t, reason: collision with root package name */
        int f10269t = -1;

        c(s sVar) {
            this.f10267o = sVar;
        }

        void a(boolean z7) {
            if (z7 == this.f10268s) {
                return;
            }
            this.f10268s = z7;
            LiveData.this.b(z7 ? 1 : -1);
            if (this.f10268s) {
                LiveData.this.d(this);
            }
        }

        void b() {
        }

        abstract boolean c();
    }

    public LiveData() {
        Object obj = f10252k;
        this.f10258f = obj;
        this.f10262j = new a();
        this.f10257e = obj;
        this.f10259g = -1;
    }

    static void a(String str) {
        if (l.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(c cVar) {
        if (cVar.f10268s) {
            if (!cVar.c()) {
                cVar.a(false);
                return;
            }
            int i8 = cVar.f10269t;
            int i9 = this.f10259g;
            if (i8 >= i9) {
                return;
            }
            cVar.f10269t = i9;
            cVar.f10267o.a(this.f10257e);
        }
    }

    void b(int i8) {
        int i9 = this.f10255c;
        this.f10255c = i8 + i9;
        if (this.f10256d) {
            return;
        }
        this.f10256d = true;
        while (true) {
            try {
                int i10 = this.f10255c;
                if (i9 == i10) {
                    this.f10256d = false;
                    return;
                }
                boolean z7 = i9 == 0 && i10 > 0;
                boolean z8 = i9 > 0 && i10 == 0;
                if (z7) {
                    f();
                } else if (z8) {
                    g();
                }
                i9 = i10;
            } catch (Throwable th) {
                this.f10256d = false;
                throw th;
            }
        }
    }

    void d(c cVar) {
        if (this.f10260h) {
            this.f10261i = true;
            return;
        }
        this.f10260h = true;
        do {
            this.f10261i = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                C6182b.d d8 = this.f10254b.d();
                while (d8.hasNext()) {
                    c((c) ((Map.Entry) d8.next()).getValue());
                    if (this.f10261i) {
                        break;
                    }
                }
            }
        } while (this.f10261i);
        this.f10260h = false;
    }

    public void e(s sVar) {
        a("observeForever");
        b bVar = new b(sVar);
        c cVar = (c) this.f10254b.n(sVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void f() {
    }

    protected void g() {
    }

    protected void h(Object obj) {
        boolean z7;
        synchronized (this.f10253a) {
            z7 = this.f10258f == f10252k;
            this.f10258f = obj;
        }
        if (z7) {
            l.c.g().c(this.f10262j);
        }
    }

    public void i(s sVar) {
        a("removeObserver");
        c cVar = (c) this.f10254b.o(sVar);
        if (cVar == null) {
            return;
        }
        cVar.b();
        cVar.a(false);
    }

    protected void j(Object obj) {
        a("setValue");
        this.f10259g++;
        this.f10257e = obj;
        d(null);
    }
}
