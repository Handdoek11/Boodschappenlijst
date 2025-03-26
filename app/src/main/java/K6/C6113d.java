package k6;

import a6.AbstractC0825b;
import a6.InterfaceC0826c;
import a6.j;
import e6.AbstractC5751a;
import i6.InterfaceC5878c;
import i6.InterfaceC5880e;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import n6.C6275a;
import q6.AbstractC6638a;
import q6.EnumC6639b;
import r6.AbstractC6711c;
import t6.AbstractC6805a;

/* renamed from: k6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6113d extends AbstractC6110a {

    /* renamed from: t, reason: collision with root package name */
    final j f38537t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f38538u;

    /* renamed from: v, reason: collision with root package name */
    final int f38539v;

    /* renamed from: k6.d$a */
    static abstract class a extends AbstractC6638a implements InterfaceC0826c, Runnable {

        /* renamed from: A, reason: collision with root package name */
        Throwable f38540A;

        /* renamed from: B, reason: collision with root package name */
        int f38541B;

        /* renamed from: C, reason: collision with root package name */
        long f38542C;

        /* renamed from: D, reason: collision with root package name */
        boolean f38543D;

        /* renamed from: o, reason: collision with root package name */
        final j.c f38544o;

        /* renamed from: s, reason: collision with root package name */
        final boolean f38545s;

        /* renamed from: t, reason: collision with root package name */
        final int f38546t;

        /* renamed from: u, reason: collision with root package name */
        final int f38547u;

        /* renamed from: v, reason: collision with root package name */
        final AtomicLong f38548v = new AtomicLong();

        /* renamed from: w, reason: collision with root package name */
        p7.b f38549w;

        /* renamed from: x, reason: collision with root package name */
        InterfaceC5880e f38550x;

        /* renamed from: y, reason: collision with root package name */
        volatile boolean f38551y;

        /* renamed from: z, reason: collision with root package name */
        volatile boolean f38552z;

        a(j.c cVar, boolean z7, int i8) {
            this.f38544o = cVar;
            this.f38545s = z7;
            this.f38546t = i8;
            this.f38547u = i8 - (i8 >> 2);
        }

        @Override // p7.a
        public final void a() {
            if (this.f38552z) {
                return;
            }
            this.f38552z = true;
            l();
        }

        @Override // p7.a
        public final void b(Object obj) {
            if (this.f38552z) {
                return;
            }
            if (this.f38541B == 2) {
                l();
                return;
            }
            if (!this.f38550x.g(obj)) {
                this.f38549w.cancel();
                this.f38540A = new MissingBackpressureException("Queue is full?!");
                this.f38552z = true;
            }
            l();
        }

        final boolean c(boolean z7, boolean z8, p7.a aVar) {
            if (this.f38551y) {
                clear();
                return true;
            }
            if (!z7) {
                return false;
            }
            if (this.f38545s) {
                if (!z8) {
                    return false;
                }
                this.f38551y = true;
                Throwable th = this.f38540A;
                if (th != null) {
                    aVar.onError(th);
                } else {
                    aVar.a();
                }
                this.f38544o.c();
                return true;
            }
            Throwable th2 = this.f38540A;
            if (th2 != null) {
                this.f38551y = true;
                clear();
                aVar.onError(th2);
                this.f38544o.c();
                return true;
            }
            if (!z8) {
                return false;
            }
            this.f38551y = true;
            aVar.a();
            this.f38544o.c();
            return true;
        }

        @Override // p7.b
        public final void cancel() {
            if (this.f38551y) {
                return;
            }
            this.f38551y = true;
            this.f38549w.cancel();
            this.f38544o.c();
            if (this.f38543D || getAndIncrement() != 0) {
                return;
            }
            this.f38550x.clear();
        }

        @Override // i6.InterfaceC5880e
        public final void clear() {
            this.f38550x.clear();
        }

        abstract void e();

        @Override // p7.b
        public final void h(long j8) {
            if (EnumC6639b.g(j8)) {
                AbstractC6711c.a(this.f38548v, j8);
                l();
            }
        }

        @Override // i6.InterfaceC5877b
        public final int i(int i8) {
            if ((i8 & 2) == 0) {
                return 0;
            }
            this.f38543D = true;
            return 2;
        }

        @Override // i6.InterfaceC5880e
        public final boolean isEmpty() {
            return this.f38550x.isEmpty();
        }

        abstract void j();

        abstract void k();

        final void l() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f38544o.b(this);
        }

        @Override // p7.a
        public final void onError(Throwable th) {
            if (this.f38552z) {
                AbstractC6805a.m(th);
                return;
            }
            this.f38540A = th;
            this.f38552z = true;
            l();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f38543D) {
                j();
            } else if (this.f38541B == 1) {
                k();
            } else {
                e();
            }
        }
    }

    /* renamed from: k6.d$b */
    static final class b extends a implements InterfaceC0826c {

        /* renamed from: E, reason: collision with root package name */
        final p7.a f38553E;

        b(p7.a aVar, j.c cVar, boolean z7, int i8) {
            super(cVar, z7, i8);
            this.f38553E = aVar;
        }

        @Override // p7.a
        public void d(p7.b bVar) {
            if (EnumC6639b.i(this.f38549w, bVar)) {
                this.f38549w = bVar;
                if (bVar instanceof InterfaceC5878c) {
                    InterfaceC5878c interfaceC5878c = (InterfaceC5878c) bVar;
                    int i8 = interfaceC5878c.i(7);
                    if (i8 == 1) {
                        this.f38541B = 1;
                        this.f38550x = interfaceC5878c;
                        this.f38552z = true;
                        this.f38553E.d(this);
                        return;
                    }
                    if (i8 == 2) {
                        this.f38541B = 2;
                        this.f38550x = interfaceC5878c;
                        this.f38553E.d(this);
                        bVar.h(this.f38546t);
                        return;
                    }
                }
                this.f38550x = new C6275a(this.f38546t);
                this.f38553E.d(this);
                bVar.h(this.f38546t);
            }
        }

        @Override // k6.C6113d.a
        void e() {
            p7.a aVar = this.f38553E;
            InterfaceC5880e interfaceC5880e = this.f38550x;
            long j8 = this.f38542C;
            int i8 = 1;
            while (true) {
                long j9 = this.f38548v.get();
                while (j8 != j9) {
                    boolean z7 = this.f38552z;
                    try {
                        Object f8 = interfaceC5880e.f();
                        boolean z8 = f8 == null;
                        if (c(z7, z8, aVar)) {
                            return;
                        }
                        if (z8) {
                            break;
                        }
                        aVar.b(f8);
                        j8++;
                        if (j8 == this.f38547u) {
                            if (j9 != Long.MAX_VALUE) {
                                j9 = this.f38548v.addAndGet(-j8);
                            }
                            this.f38549w.h(j8);
                            j8 = 0;
                        }
                    } catch (Throwable th) {
                        AbstractC5751a.b(th);
                        this.f38551y = true;
                        this.f38549w.cancel();
                        interfaceC5880e.clear();
                        aVar.onError(th);
                        this.f38544o.c();
                        return;
                    }
                }
                if (j8 == j9 && c(this.f38552z, interfaceC5880e.isEmpty(), aVar)) {
                    return;
                }
                int i9 = get();
                if (i8 == i9) {
                    this.f38542C = j8;
                    i8 = addAndGet(-i8);
                    if (i8 == 0) {
                        return;
                    }
                } else {
                    i8 = i9;
                }
            }
        }

        @Override // i6.InterfaceC5880e
        public Object f() {
            Object f8 = this.f38550x.f();
            if (f8 != null && this.f38541B != 1) {
                long j8 = this.f38542C + 1;
                if (j8 == this.f38547u) {
                    this.f38542C = 0L;
                    this.f38549w.h(j8);
                } else {
                    this.f38542C = j8;
                }
            }
            return f8;
        }

        @Override // k6.C6113d.a
        void j() {
            int i8 = 1;
            while (!this.f38551y) {
                boolean z7 = this.f38552z;
                this.f38553E.b(null);
                if (z7) {
                    this.f38551y = true;
                    Throwable th = this.f38540A;
                    if (th != null) {
                        this.f38553E.onError(th);
                    } else {
                        this.f38553E.a();
                    }
                    this.f38544o.c();
                    return;
                }
                i8 = addAndGet(-i8);
                if (i8 == 0) {
                    return;
                }
            }
        }

        @Override // k6.C6113d.a
        void k() {
            p7.a aVar = this.f38553E;
            InterfaceC5880e interfaceC5880e = this.f38550x;
            long j8 = this.f38542C;
            int i8 = 1;
            while (true) {
                long j9 = this.f38548v.get();
                while (j8 != j9) {
                    try {
                        Object f8 = interfaceC5880e.f();
                        if (this.f38551y) {
                            return;
                        }
                        if (f8 == null) {
                            this.f38551y = true;
                            aVar.a();
                            this.f38544o.c();
                            return;
                        }
                        aVar.b(f8);
                        j8++;
                    } catch (Throwable th) {
                        AbstractC5751a.b(th);
                        this.f38551y = true;
                        this.f38549w.cancel();
                        aVar.onError(th);
                        this.f38544o.c();
                        return;
                    }
                }
                if (this.f38551y) {
                    return;
                }
                if (interfaceC5880e.isEmpty()) {
                    this.f38551y = true;
                    aVar.a();
                    this.f38544o.c();
                    return;
                } else {
                    int i9 = get();
                    if (i8 == i9) {
                        this.f38542C = j8;
                        i8 = addAndGet(-i8);
                        if (i8 == 0) {
                            return;
                        }
                    } else {
                        i8 = i9;
                    }
                }
            }
        }
    }

    public C6113d(AbstractC0825b abstractC0825b, j jVar, boolean z7, int i8) {
        super(abstractC0825b);
        this.f38537t = jVar;
        this.f38538u = z7;
        this.f38539v = i8;
    }

    @Override // a6.AbstractC0825b
    public void j(p7.a aVar) {
        this.f38531s.i(new b(aVar, this.f38537t.b(), this.f38538u, this.f38539v));
    }
}
