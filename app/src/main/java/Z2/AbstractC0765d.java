package Z2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.C1109h;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Z2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0765d {

    /* renamed from: A, reason: collision with root package name */
    private boolean f6281A;

    /* renamed from: B, reason: collision with root package name */
    private volatile j0 f6282B;

    /* renamed from: C, reason: collision with root package name */
    protected AtomicInteger f6283C;

    /* renamed from: a, reason: collision with root package name */
    private int f6284a;

    /* renamed from: b, reason: collision with root package name */
    private long f6285b;

    /* renamed from: c, reason: collision with root package name */
    private long f6286c;

    /* renamed from: d, reason: collision with root package name */
    private int f6287d;

    /* renamed from: e, reason: collision with root package name */
    private long f6288e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f6289f;

    /* renamed from: g, reason: collision with root package name */
    u0 f6290g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f6291h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f6292i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC0770i f6293j;

    /* renamed from: k, reason: collision with root package name */
    private final C1109h f6294k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f6295l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f6296m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f6297n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC0774m f6298o;

    /* renamed from: p, reason: collision with root package name */
    protected c f6299p;

    /* renamed from: q, reason: collision with root package name */
    private IInterface f6300q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f6301r;

    /* renamed from: s, reason: collision with root package name */
    private g0 f6302s;

    /* renamed from: t, reason: collision with root package name */
    private int f6303t;

    /* renamed from: u, reason: collision with root package name */
    private final a f6304u;

    /* renamed from: v, reason: collision with root package name */
    private final b f6305v;

    /* renamed from: w, reason: collision with root package name */
    private final int f6306w;

    /* renamed from: x, reason: collision with root package name */
    private final String f6307x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f6308y;

    /* renamed from: z, reason: collision with root package name */
    private C1103b f6309z;

    /* renamed from: E, reason: collision with root package name */
    private static final C1105d[] f6280E = new C1105d[0];

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f6279D = {"service_esmobile", "service_googleme"};

    /* renamed from: Z2.d$a */
    public interface a {
        void J0(Bundle bundle);

        void w0(int i8);
    }

    /* renamed from: Z2.d$b */
    public interface b {
        void D0(C1103b c1103b);
    }

    /* renamed from: Z2.d$c */
    public interface c {
        void a(C1103b c1103b);
    }

    /* renamed from: Z2.d$d, reason: collision with other inner class name */
    protected class C0127d implements c {
        public C0127d() {
        }

        @Override // Z2.AbstractC0765d.c
        public final void a(C1103b c1103b) {
            if (c1103b.E0()) {
                AbstractC0765d abstractC0765d = AbstractC0765d.this;
                abstractC0765d.n(null, abstractC0765d.C());
            } else if (AbstractC0765d.this.f6305v != null) {
                AbstractC0765d.this.f6305v.D0(c1103b);
            }
        }
    }

    /* renamed from: Z2.d$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC0765d(Context context, Looper looper, int i8, a aVar, b bVar, String str) {
        AbstractC0770i a8 = AbstractC0770i.a(context);
        C1109h f8 = C1109h.f();
        r.l(aVar);
        r.l(bVar);
        this(context, looper, a8, f8, i8, aVar, bVar, str);
    }

    static /* bridge */ /* synthetic */ void c0(AbstractC0765d abstractC0765d, j0 j0Var) {
        abstractC0765d.f6282B = j0Var;
        if (abstractC0765d.S()) {
            C0767f c0767f = j0Var.f6372u;
            C0779s.b().c(c0767f == null ? null : c0767f.F0());
        }
    }

    static /* bridge */ /* synthetic */ void d0(AbstractC0765d abstractC0765d, int i8) {
        int i9;
        int i10;
        synchronized (abstractC0765d.f6296m) {
            i9 = abstractC0765d.f6303t;
        }
        if (i9 == 3) {
            abstractC0765d.f6281A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        Handler handler = abstractC0765d.f6295l;
        handler.sendMessage(handler.obtainMessage(i10, abstractC0765d.f6283C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean g0(AbstractC0765d abstractC0765d, int i8, int i9, IInterface iInterface) {
        synchronized (abstractC0765d.f6296m) {
            try {
                if (abstractC0765d.f6303t != i8) {
                    return false;
                }
                abstractC0765d.i0(i9, iInterface);
                return true;
            } finally {
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean h0(AbstractC0765d abstractC0765d) {
        if (abstractC0765d.f6281A || TextUtils.isEmpty(abstractC0765d.E()) || TextUtils.isEmpty(abstractC0765d.B())) {
            return false;
        }
        try {
            Class.forName(abstractC0765d.E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i8, IInterface iInterface) {
        u0 u0Var;
        r.a((i8 == 4) == (iInterface != null));
        synchronized (this.f6296m) {
            try {
                this.f6303t = i8;
                this.f6300q = iInterface;
                if (i8 == 1) {
                    g0 g0Var = this.f6302s;
                    if (g0Var != null) {
                        AbstractC0770i abstractC0770i = this.f6293j;
                        String b8 = this.f6290g.b();
                        r.l(b8);
                        abstractC0770i.d(b8, this.f6290g.a(), 4225, g0Var, X(), this.f6290g.c());
                        this.f6302s = null;
                    }
                } else if (i8 == 2 || i8 == 3) {
                    g0 g0Var2 = this.f6302s;
                    if (g0Var2 != null && (u0Var = this.f6290g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + u0Var.b() + " on " + u0Var.a());
                        AbstractC0770i abstractC0770i2 = this.f6293j;
                        String b9 = this.f6290g.b();
                        r.l(b9);
                        abstractC0770i2.d(b9, this.f6290g.a(), 4225, g0Var2, X(), this.f6290g.c());
                        this.f6283C.incrementAndGet();
                    }
                    g0 g0Var3 = new g0(this, this.f6283C.get());
                    this.f6302s = g0Var3;
                    u0 u0Var2 = (this.f6303t != 3 || B() == null) ? new u0(G(), F(), false, 4225, I()) : new u0(y().getPackageName(), B(), true, 4225, false);
                    this.f6290g = u0Var2;
                    if (u0Var2.c() && j() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f6290g.b())));
                    }
                    AbstractC0770i abstractC0770i3 = this.f6293j;
                    String b10 = this.f6290g.b();
                    r.l(b10);
                    if (!abstractC0770i3.e(new n0(b10, this.f6290g.a(), 4225, this.f6290g.c()), g0Var3, X(), w())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f6290g.b() + " on " + this.f6290g.a());
                        e0(16, null, this.f6283C.get());
                    }
                } else if (i8 == 4) {
                    r.l(iInterface);
                    K(iInterface);
                }
            } finally {
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set C() {
        return Collections.emptySet();
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.f6296m) {
            try {
                if (this.f6303t == 5) {
                    throw new DeadObjectException();
                }
                r();
                iInterface = this.f6300q;
                r.m(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    protected abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public C0767f H() {
        j0 j0Var = this.f6282B;
        if (j0Var == null) {
            return null;
        }
        return j0Var.f6372u;
    }

    protected boolean I() {
        return j() >= 211700000;
    }

    public boolean J() {
        return this.f6282B != null;
    }

    protected void K(IInterface iInterface) {
        this.f6286c = System.currentTimeMillis();
    }

    protected void L(C1103b c1103b) {
        this.f6287d = c1103b.A0();
        this.f6288e = System.currentTimeMillis();
    }

    protected void M(int i8) {
        this.f6284a = i8;
        this.f6285b = System.currentTimeMillis();
    }

    protected void N(int i8, IBinder iBinder, Bundle bundle, int i9) {
        this.f6295l.sendMessage(this.f6295l.obtainMessage(1, i9, -1, new h0(this, i8, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f6308y = str;
    }

    public void Q(int i8) {
        this.f6295l.sendMessage(this.f6295l.obtainMessage(6, this.f6283C.get(), i8));
    }

    protected void R(c cVar, int i8, PendingIntent pendingIntent) {
        r.m(cVar, "Connection progress callbacks cannot be null.");
        this.f6299p = cVar;
        this.f6295l.sendMessage(this.f6295l.obtainMessage(3, this.f6283C.get(), i8, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String str = this.f6307x;
        return str == null ? this.f6291h.getClass().getName() : str;
    }

    public void c(String str) {
        this.f6289f = str;
        g();
    }

    public void d(e eVar) {
        eVar.a();
    }

    public boolean e() {
        boolean z7;
        synchronized (this.f6296m) {
            int i8 = this.f6303t;
            z7 = true;
            if (i8 != 2 && i8 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    protected final void e0(int i8, Bundle bundle, int i9) {
        this.f6295l.sendMessage(this.f6295l.obtainMessage(7, i9, -1, new i0(this, i8, null)));
    }

    public String f() {
        u0 u0Var;
        if (!h() || (u0Var = this.f6290g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return u0Var.a();
    }

    public void g() {
        this.f6283C.incrementAndGet();
        synchronized (this.f6301r) {
            try {
                int size = this.f6301r.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((e0) this.f6301r.get(i8)).d();
                }
                this.f6301r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f6297n) {
            this.f6298o = null;
        }
        i0(1, null);
    }

    public boolean h() {
        boolean z7;
        synchronized (this.f6296m) {
            z7 = this.f6303t == 4;
        }
        return z7;
    }

    public boolean i() {
        return true;
    }

    public int j() {
        return C1109h.f13414a;
    }

    public final C1105d[] k() {
        j0 j0Var = this.f6282B;
        if (j0Var == null) {
            return null;
        }
        return j0Var.f6370s;
    }

    public void l(c cVar) {
        r.m(cVar, "Connection progress callbacks cannot be null.");
        this.f6299p = cVar;
        i0(2, null);
    }

    public String m() {
        return this.f6289f;
    }

    public void n(InterfaceC0772k interfaceC0772k, Set set) {
        Bundle A7 = A();
        String str = this.f6308y;
        int i8 = C1109h.f13414a;
        Scope[] scopeArr = C0768g.f6338F;
        Bundle bundle = new Bundle();
        int i9 = this.f6306w;
        C1105d[] c1105dArr = C0768g.f6339G;
        C0768g c0768g = new C0768g(6, i9, i8, null, null, scopeArr, bundle, null, c1105dArr, c1105dArr, true, 0, false, str);
        c0768g.f6348u = this.f6291h.getPackageName();
        c0768g.f6351x = A7;
        if (set != null) {
            c0768g.f6350w = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account u7 = u();
            if (u7 == null) {
                u7 = new Account("<<default account>>", "com.google");
            }
            c0768g.f6352y = u7;
            if (interfaceC0772k != null) {
                c0768g.f6349v = interfaceC0772k.asBinder();
            }
        } else if (O()) {
            c0768g.f6352y = u();
        }
        c0768g.f6353z = f6280E;
        c0768g.f6340A = v();
        if (S()) {
            c0768g.f6343D = true;
        }
        try {
            synchronized (this.f6297n) {
                try {
                    InterfaceC0774m interfaceC0774m = this.f6298o;
                    if (interfaceC0774m != null) {
                        interfaceC0774m.w5(new f0(this, this.f6283C.get()), c0768g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            Q(3);
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f6283C.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f6283C.get());
        }
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int h8 = this.f6294k.h(this.f6291h, j());
        if (h8 == 0) {
            l(new C0127d());
        } else {
            i0(1, null);
            R(new C0127d(), h8, null);
        }
    }

    protected final void r() {
        if (!h()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface s(IBinder iBinder);

    protected boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C1105d[] v() {
        return f6280E;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f6291h;
    }

    public int z() {
        return this.f6306w;
    }

    protected AbstractC0765d(Context context, Looper looper, AbstractC0770i abstractC0770i, C1109h c1109h, int i8, a aVar, b bVar, String str) {
        this.f6289f = null;
        this.f6296m = new Object();
        this.f6297n = new Object();
        this.f6301r = new ArrayList();
        this.f6303t = 1;
        this.f6309z = null;
        this.f6281A = false;
        this.f6282B = null;
        this.f6283C = new AtomicInteger(0);
        r.m(context, "Context must not be null");
        this.f6291h = context;
        r.m(looper, "Looper must not be null");
        this.f6292i = looper;
        r.m(abstractC0770i, "Supervisor must not be null");
        this.f6293j = abstractC0770i;
        r.m(c1109h, "API availability must not be null");
        this.f6294k = c1109h;
        this.f6295l = new d0(this, looper);
        this.f6306w = i8;
        this.f6304u = aVar;
        this.f6305v = bVar;
        this.f6307x = str;
    }
}
