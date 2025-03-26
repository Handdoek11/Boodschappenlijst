package com.google.android.gms.internal.ads;

import D2.InterfaceC0491c0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import f3.InterfaceC5781e;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Predicate;
import w2.EnumC6877c;

/* renamed from: com.google.android.gms.internal.ads.Pa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1647Pa0 {

    /* renamed from: a, reason: collision with root package name */
    protected final ClientApi f18207a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f18208b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f18209c;

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC1242Dl f18210d;

    /* renamed from: e, reason: collision with root package name */
    protected D2.I1 f18211e;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC0491c0 f18213g;

    /* renamed from: i, reason: collision with root package name */
    private final C3502na0 f18215i;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f18217k;

    /* renamed from: n, reason: collision with root package name */
    private C4482wa0 f18220n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5781e f18221o;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentLinkedQueue f18214h = new ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    protected final AtomicBoolean f18212f = new AtomicBoolean(true);

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f18216j = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f18218l = new AtomicBoolean(true);

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f18219m = new AtomicBoolean(false);

    public AbstractC1647Pa0(ClientApi clientApi, Context context, int i8, InterfaceC1242Dl interfaceC1242Dl, D2.I1 i12, InterfaceC0491c0 interfaceC0491c0, ScheduledExecutorService scheduledExecutorService, C3502na0 c3502na0, InterfaceC5781e interfaceC5781e) {
        this.f18207a = clientApi;
        this.f18208b = context;
        this.f18209c = i8;
        this.f18210d = interfaceC1242Dl;
        this.f18211e = i12;
        this.f18213g = interfaceC0491c0;
        this.f18217k = scheduledExecutorService;
        this.f18215i = c3502na0;
        this.f18221o = interfaceC5781e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void A(Object obj) {
        try {
            this.f18216j.set(false);
            if (obj != null) {
                this.f18215i.c();
                this.f18219m.set(true);
                y(obj);
            }
            c(obj == null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void B() {
        if (this.f18218l.get()) {
            try {
                this.f18213g.N4(this.f18211e);
            } catch (RemoteException unused) {
                H2.p.g("Failed to call onAdsAvailable");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void C() {
        if (this.f18218l.get()) {
            try {
                this.f18213g.V3(this.f18211e);
            } catch (RemoteException unused) {
                H2.p.g("Failed to call onAdsExhausted");
            }
        }
    }

    private final synchronized void D() {
        if (this.f18219m.get() && this.f18214h.isEmpty()) {
            this.f18219m.set(false);
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ma0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17371o.C();
                }
            });
            this.f18217k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Na0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17553o.r();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void a(D2.W0 w02) {
        this.f18216j.set(false);
        int i8 = w02.f1162o;
        if (i8 != 1 && i8 != 8 && i8 != 10 && i8 != 11) {
            c(true);
            return;
        }
        D2.I1 i12 = this.f18211e;
        H2.p.f("Preloading " + i12.f1148s + ", for adUnitId:" + i12.f1147o + ", Ad load failed. Stop preloading due to non-retriable error:");
        this.f18212f.set(false);
    }

    private final synchronized void b() {
        Iterator it = this.f18214h.iterator();
        while (it.hasNext()) {
            if (((C1258Ea0) it.next()).c()) {
                it.remove();
            }
        }
    }

    private final synchronized void c(boolean z7) {
        try {
            if (this.f18215i.e()) {
                return;
            }
            if (z7) {
                this.f18215i.b();
            }
            this.f18217k.schedule(new RunnableC1294Fa0(this), this.f18215i.a(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final Optional d(Optional optional) {
        final Class<BinderC2273cC> cls = BinderC2273cC.class;
        return optional.filter(new Predicate() { // from class: com.google.android.gms.internal.ads.Ga0
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance((D2.U0) obj);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.Ia0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (BinderC2273cC) cls.cast((D2.U0) obj);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.Ja0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((BinderC2273cC) obj).i();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    private final synchronized void y(Object obj) {
        C1258Ea0 c1258Ea0 = new C1258Ea0(obj, this.f18221o);
        this.f18214h.add(c1258Ea0);
        InterfaceC5781e interfaceC5781e = this.f18221o;
        final Optional f8 = f(obj);
        final long a8 = interfaceC5781e.a();
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ka0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16600o.B();
            }
        });
        this.f18217k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.La0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16848o.q(a8, f8);
            }
        });
        this.f18217k.schedule(new RunnableC1294Fa0(this), c1258Ea0.a(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void z(Throwable th) {
        try {
            this.f18216j.set(false);
            if ((th instanceof zzfjc) && ((zzfjc) th).a() == 0) {
                throw null;
            }
            c(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected abstract com.google.common.util.concurrent.d e();

    protected abstract Optional f(Object obj);

    public final synchronized AbstractC1647Pa0 g() {
        this.f18217k.submit(new RunnableC1294Fa0(this));
        return this;
    }

    protected final synchronized Object h() {
        C1258Ea0 c1258Ea0 = (C1258Ea0) this.f18214h.peek();
        if (c1258Ea0 == null) {
            return null;
        }
        return c1258Ea0.b();
    }

    public final synchronized Object i() {
        this.f18215i.c();
        C1258Ea0 c1258Ea0 = (C1258Ea0) this.f18214h.poll();
        this.f18219m.set(c1258Ea0 != null);
        p();
        if (c1258Ea0 == null) {
            return null;
        }
        return c1258Ea0.b();
    }

    public final synchronized Optional j() {
        Object h8;
        try {
            h8 = h();
        } catch (Throwable th) {
            throw th;
        }
        return d(h8 == null ? Optional.empty() : f(h8));
    }

    protected final synchronized void p() {
        b();
        D();
        if (!this.f18216j.get() && this.f18212f.get() && this.f18214h.size() < this.f18211e.f1150u) {
            this.f18216j.set(true);
            AbstractC2326ck0.r(e(), new C1612Oa0(this), this.f18217k);
        }
    }

    final /* synthetic */ void q(long j8, Optional optional) {
        C4482wa0 c4482wa0 = this.f18220n;
        if (c4482wa0 != null) {
            c4482wa0.b(EnumC6877c.a(this.f18211e.f1148s), j8, d(optional));
        }
    }

    final /* synthetic */ void r() {
        C4482wa0 c4482wa0 = this.f18220n;
        if (c4482wa0 != null) {
            c4482wa0.c(EnumC6877c.a(this.f18211e.f1148s), this.f18221o.a());
        }
    }

    public final synchronized void s(int i8) {
        Z2.r.a(i8 >= 5);
        this.f18215i.d(i8);
    }

    public final synchronized void t() {
        this.f18212f.set(true);
        this.f18218l.set(true);
        this.f18217k.submit(new RunnableC1294Fa0(this));
    }

    public final void u(C4482wa0 c4482wa0) {
        this.f18220n = c4482wa0;
    }

    public final void v() {
        this.f18212f.set(false);
        this.f18218l.set(false);
    }

    protected final synchronized void w(int i8) {
        try {
            Z2.r.a(i8 > 0);
            D2.I1 i12 = this.f18211e;
            String str = i12.f1147o;
            int i9 = i12.f1148s;
            D2.X1 x12 = i12.f1149t;
            if (i8 <= 0) {
                i8 = i12.f1150u;
            }
            this.f18211e = new D2.I1(str, i9, x12, i8);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean x() {
        b();
        return !this.f18214h.isEmpty();
    }
}
