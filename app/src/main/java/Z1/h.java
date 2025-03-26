package Z1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import b2.InterfaceC0957c;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.j;
import d2.AbstractC5705g;
import d2.AbstractC5710l;
import e2.AbstractC5743b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h implements c, a2.g, g {

    /* renamed from: E, reason: collision with root package name */
    private static final boolean f6199E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    private int f6200A;

    /* renamed from: B, reason: collision with root package name */
    private int f6201B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f6202C;

    /* renamed from: D, reason: collision with root package name */
    private RuntimeException f6203D;

    /* renamed from: a, reason: collision with root package name */
    private int f6204a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6205b;

    /* renamed from: c, reason: collision with root package name */
    private final e2.c f6206c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f6207d;

    /* renamed from: e, reason: collision with root package name */
    private final e f6208e;

    /* renamed from: f, reason: collision with root package name */
    private final d f6209f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f6210g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f6211h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f6212i;

    /* renamed from: j, reason: collision with root package name */
    private final Class f6213j;

    /* renamed from: k, reason: collision with root package name */
    private final Z1.a f6214k;

    /* renamed from: l, reason: collision with root package name */
    private final int f6215l;

    /* renamed from: m, reason: collision with root package name */
    private final int f6216m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.g f6217n;

    /* renamed from: o, reason: collision with root package name */
    private final a2.h f6218o;

    /* renamed from: p, reason: collision with root package name */
    private final List f6219p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC0957c f6220q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f6221r;

    /* renamed from: s, reason: collision with root package name */
    private L1.c f6222s;

    /* renamed from: t, reason: collision with root package name */
    private j.d f6223t;

    /* renamed from: u, reason: collision with root package name */
    private long f6224u;

    /* renamed from: v, reason: collision with root package name */
    private volatile j f6225v;

    /* renamed from: w, reason: collision with root package name */
    private a f6226w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f6227x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f6228y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f6229z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, Z1.a aVar, int i8, int i9, com.bumptech.glide.g gVar, a2.h hVar, e eVar, List list, d dVar2, j jVar, InterfaceC0957c interfaceC0957c, Executor executor) {
        this.f6205b = f6199E ? String.valueOf(super.hashCode()) : null;
        this.f6206c = e2.c.a();
        this.f6207d = obj;
        this.f6210g = context;
        this.f6211h = dVar;
        this.f6212i = obj2;
        this.f6213j = cls;
        this.f6214k = aVar;
        this.f6215l = i8;
        this.f6216m = i9;
        this.f6217n = gVar;
        this.f6218o = hVar;
        this.f6208e = eVar;
        this.f6219p = list;
        this.f6209f = dVar2;
        this.f6225v = jVar;
        this.f6220q = interfaceC0957c;
        this.f6221r = executor;
        this.f6226w = a.PENDING;
        if (this.f6203D == null && dVar.g().a(c.C0216c.class)) {
            this.f6203D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(GlideException glideException, int i8) {
        boolean z7;
        this.f6206c.c();
        synchronized (this.f6207d) {
            try {
                glideException.k(this.f6203D);
                int h8 = this.f6211h.h();
                if (h8 <= i8) {
                    Log.w("Glide", "Load failed for [" + this.f6212i + "] with dimensions [" + this.f6200A + "x" + this.f6201B + "]", glideException);
                    if (h8 <= 4) {
                        glideException.g("Glide");
                    }
                }
                this.f6223t = null;
                this.f6226w = a.FAILED;
                x();
                boolean z8 = true;
                this.f6202C = true;
                try {
                    List list = this.f6219p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        z7 = false;
                        while (it.hasNext()) {
                            z7 |= ((e) it.next()).b(glideException, this.f6212i, this.f6218o, t());
                        }
                    } else {
                        z7 = false;
                    }
                    e eVar = this.f6208e;
                    if (eVar == null || !eVar.b(glideException, this.f6212i, this.f6218o, t())) {
                        z8 = false;
                    }
                    if (!(z7 | z8)) {
                        C();
                    }
                    this.f6202C = false;
                    AbstractC5743b.f("GlideRequest", this.f6204a);
                } catch (Throwable th) {
                    this.f6202C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void B(L1.c cVar, Object obj, J1.a aVar, boolean z7) {
        boolean z8;
        boolean t7 = t();
        this.f6226w = a.COMPLETE;
        this.f6222s = cVar;
        if (this.f6211h.h() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f6212i + " with size [" + this.f6200A + "x" + this.f6201B + "] in " + AbstractC5705g.a(this.f6224u) + " ms");
        }
        y();
        boolean z9 = true;
        this.f6202C = true;
        try {
            List list = this.f6219p;
            if (list != null) {
                Iterator it = list.iterator();
                z8 = false;
                while (it.hasNext()) {
                    z8 |= ((e) it.next()).a(obj, this.f6212i, this.f6218o, aVar, t7);
                }
            } else {
                z8 = false;
            }
            e eVar = this.f6208e;
            if (eVar == null || !eVar.a(obj, this.f6212i, this.f6218o, aVar, t7)) {
                z9 = false;
            }
            if (!(z9 | z8)) {
                this.f6218o.g(obj, this.f6220q.a(aVar, t7));
            }
            this.f6202C = false;
            AbstractC5743b.f("GlideRequest", this.f6204a);
        } catch (Throwable th) {
            this.f6202C = false;
            throw th;
        }
    }

    private void C() {
        if (m()) {
            Drawable r8 = this.f6212i == null ? r() : null;
            if (r8 == null) {
                r8 = q();
            }
            if (r8 == null) {
                r8 = s();
            }
            this.f6218o.e(r8);
        }
    }

    private void g() {
        if (this.f6202C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean h() {
        d dVar = this.f6209f;
        return dVar == null || dVar.a(this);
    }

    private boolean m() {
        d dVar = this.f6209f;
        return dVar == null || dVar.g(this);
    }

    private boolean n() {
        d dVar = this.f6209f;
        return dVar == null || dVar.c(this);
    }

    private void o() {
        g();
        this.f6206c.c();
        this.f6218o.b(this);
        j.d dVar = this.f6223t;
        if (dVar != null) {
            dVar.a();
            this.f6223t = null;
        }
    }

    private void p(Object obj) {
        List<e> list = this.f6219p;
        if (list == null) {
            return;
        }
        for (e eVar : list) {
        }
    }

    private Drawable q() {
        if (this.f6227x == null) {
            Drawable q8 = this.f6214k.q();
            this.f6227x = q8;
            if (q8 == null && this.f6214k.p() > 0) {
                this.f6227x = u(this.f6214k.p());
            }
        }
        return this.f6227x;
    }

    private Drawable r() {
        if (this.f6229z == null) {
            Drawable r8 = this.f6214k.r();
            this.f6229z = r8;
            if (r8 == null && this.f6214k.s() > 0) {
                this.f6229z = u(this.f6214k.s());
            }
        }
        return this.f6229z;
    }

    private Drawable s() {
        if (this.f6228y == null) {
            Drawable y7 = this.f6214k.y();
            this.f6228y = y7;
            if (y7 == null && this.f6214k.z() > 0) {
                this.f6228y = u(this.f6214k.z());
            }
        }
        return this.f6228y;
    }

    private boolean t() {
        d dVar = this.f6209f;
        return dVar == null || !dVar.d().b();
    }

    private Drawable u(int i8) {
        return T1.i.a(this.f6210g, i8, this.f6214k.E() != null ? this.f6214k.E() : this.f6210g.getTheme());
    }

    private void v(String str) {
        Log.v("GlideRequest", str + " this: " + this.f6205b);
    }

    private static int w(int i8, float f8) {
        return i8 == Integer.MIN_VALUE ? i8 : Math.round(f8 * i8);
    }

    private void x() {
        d dVar = this.f6209f;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    private void y() {
        d dVar = this.f6209f;
        if (dVar != null) {
            dVar.h(this);
        }
    }

    public static h z(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, Z1.a aVar, int i8, int i9, com.bumptech.glide.g gVar, a2.h hVar, e eVar, List list, d dVar2, j jVar, InterfaceC0957c interfaceC0957c, Executor executor) {
        return new h(context, dVar, obj, obj2, cls, aVar, i8, i9, gVar, hVar, eVar, list, dVar2, jVar, interfaceC0957c, executor);
    }

    @Override // Z1.g
    public void a(GlideException glideException) {
        A(glideException, 5);
    }

    @Override // Z1.c
    public boolean b() {
        boolean z7;
        synchronized (this.f6207d) {
            z7 = this.f6226w == a.COMPLETE;
        }
        return z7;
    }

    @Override // Z1.g
    public void c(L1.c cVar, J1.a aVar, boolean z7) {
        this.f6206c.c();
        L1.c cVar2 = null;
        try {
            synchronized (this.f6207d) {
                try {
                    this.f6223t = null;
                    if (cVar == null) {
                        a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f6213j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cVar.get();
                    try {
                        if (obj != null && this.f6213j.isAssignableFrom(obj.getClass())) {
                            if (n()) {
                                B(cVar, obj, aVar, z7);
                                return;
                            }
                            this.f6222s = null;
                            this.f6226w = a.COMPLETE;
                            AbstractC5743b.f("GlideRequest", this.f6204a);
                            this.f6225v.k(cVar);
                            return;
                        }
                        this.f6222s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f6213j);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(cVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        a(new GlideException(sb.toString()));
                        this.f6225v.k(cVar);
                    } catch (Throwable th) {
                        cVar2 = cVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (cVar2 != null) {
                this.f6225v.k(cVar2);
            }
            throw th3;
        }
    }

    @Override // Z1.c
    public void clear() {
        synchronized (this.f6207d) {
            try {
                g();
                this.f6206c.c();
                a aVar = this.f6226w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                o();
                L1.c cVar = this.f6222s;
                if (cVar != null) {
                    this.f6222s = null;
                } else {
                    cVar = null;
                }
                if (h()) {
                    this.f6218o.j(s());
                }
                AbstractC5743b.f("GlideRequest", this.f6204a);
                this.f6226w = aVar2;
                if (cVar != null) {
                    this.f6225v.k(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a2.g
    public void d(int i8, int i9) {
        Object obj;
        this.f6206c.c();
        Object obj2 = this.f6207d;
        synchronized (obj2) {
            try {
                try {
                    boolean z7 = f6199E;
                    if (z7) {
                        v("Got onSizeReady in " + AbstractC5705g.a(this.f6224u));
                    }
                    if (this.f6226w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f6226w = aVar;
                        float D7 = this.f6214k.D();
                        this.f6200A = w(i8, D7);
                        this.f6201B = w(i9, D7);
                        if (z7) {
                            v("finished setup for calling load in " + AbstractC5705g.a(this.f6224u));
                        }
                        obj = obj2;
                        try {
                            this.f6223t = this.f6225v.f(this.f6211h, this.f6212i, this.f6214k.C(), this.f6200A, this.f6201B, this.f6214k.B(), this.f6213j, this.f6217n, this.f6214k.m(), this.f6214k.F(), this.f6214k.Q(), this.f6214k.M(), this.f6214k.v(), this.f6214k.K(), this.f6214k.H(), this.f6214k.G(), this.f6214k.u(), this, this.f6221r);
                            if (this.f6226w != aVar) {
                                this.f6223t = null;
                            }
                            if (z7) {
                                v("finished onSizeReady in " + AbstractC5705g.a(this.f6224u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // Z1.c
    public void e() {
        synchronized (this.f6207d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.g
    public Object f() {
        this.f6206c.c();
        return this.f6207d;
    }

    @Override // Z1.c
    public boolean i(c cVar) {
        int i8;
        int i9;
        Object obj;
        Class cls;
        Z1.a aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i10;
        int i11;
        Object obj2;
        Class cls2;
        Z1.a aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f6207d) {
            try {
                i8 = this.f6215l;
                i9 = this.f6216m;
                obj = this.f6212i;
                cls = this.f6213j;
                aVar = this.f6214k;
                gVar = this.f6217n;
                List list = this.f6219p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        h hVar = (h) cVar;
        synchronized (hVar.f6207d) {
            try {
                i10 = hVar.f6215l;
                i11 = hVar.f6216m;
                obj2 = hVar.f6212i;
                cls2 = hVar.f6213j;
                aVar2 = hVar.f6214k;
                gVar2 = hVar.f6217n;
                List list2 = hVar.f6219p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i8 == i10 && i9 == i11 && AbstractC5710l.c(obj, obj2) && cls.equals(cls2) && AbstractC5710l.b(aVar, aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // Z1.c
    public boolean isRunning() {
        boolean z7;
        synchronized (this.f6207d) {
            try {
                a aVar = this.f6226w;
                z7 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z7;
    }

    @Override // Z1.c
    public boolean j() {
        boolean z7;
        synchronized (this.f6207d) {
            z7 = this.f6226w == a.CLEARED;
        }
        return z7;
    }

    @Override // Z1.c
    public void k() {
        synchronized (this.f6207d) {
            try {
                g();
                this.f6206c.c();
                this.f6224u = AbstractC5705g.b();
                Object obj = this.f6212i;
                if (obj == null) {
                    if (AbstractC5710l.u(this.f6215l, this.f6216m)) {
                        this.f6200A = this.f6215l;
                        this.f6201B = this.f6216m;
                    }
                    A(new GlideException("Received null model"), r() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f6226w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    c(this.f6222s, J1.a.MEMORY_CACHE, false);
                    return;
                }
                p(obj);
                this.f6204a = AbstractC5743b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f6226w = aVar3;
                if (AbstractC5710l.u(this.f6215l, this.f6216m)) {
                    d(this.f6215l, this.f6216m);
                } else {
                    this.f6218o.d(this);
                }
                a aVar4 = this.f6226w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && m()) {
                    this.f6218o.h(s());
                }
                if (f6199E) {
                    v("finished run method in " + AbstractC5705g.a(this.f6224u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z1.c
    public boolean l() {
        boolean z7;
        synchronized (this.f6207d) {
            z7 = this.f6226w == a.COMPLETE;
        }
        return z7;
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f6207d) {
            obj = this.f6212i;
            cls = this.f6213j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
