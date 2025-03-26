package m6;

import a6.AbstractC0829f;
import a6.j;
import d6.InterfaceC5732b;
import g6.EnumC5814b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final long f39362s;

    /* renamed from: t, reason: collision with root package name */
    final TimeUnit f39363t;

    /* renamed from: u, reason: collision with root package name */
    final a6.j f39364u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f39365v;

    static final class a extends AtomicInteger implements a6.i, InterfaceC5732b, Runnable {

        /* renamed from: A, reason: collision with root package name */
        volatile boolean f39366A;

        /* renamed from: B, reason: collision with root package name */
        volatile boolean f39367B;

        /* renamed from: C, reason: collision with root package name */
        boolean f39368C;

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39369o;

        /* renamed from: s, reason: collision with root package name */
        final long f39370s;

        /* renamed from: t, reason: collision with root package name */
        final TimeUnit f39371t;

        /* renamed from: u, reason: collision with root package name */
        final j.c f39372u;

        /* renamed from: v, reason: collision with root package name */
        final boolean f39373v;

        /* renamed from: w, reason: collision with root package name */
        final AtomicReference f39374w = new AtomicReference();

        /* renamed from: x, reason: collision with root package name */
        InterfaceC5732b f39375x;

        /* renamed from: y, reason: collision with root package name */
        volatile boolean f39376y;

        /* renamed from: z, reason: collision with root package name */
        Throwable f39377z;

        a(a6.i iVar, long j8, TimeUnit timeUnit, j.c cVar, boolean z7) {
            this.f39369o = iVar;
            this.f39370s = j8;
            this.f39371t = timeUnit;
            this.f39372u = cVar;
            this.f39373v = z7;
        }

        @Override // a6.i
        public void a() {
            this.f39376y = true;
            e();
        }

        @Override // a6.i
        public void b(Object obj) {
            this.f39374w.set(obj);
            e();
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            this.f39366A = true;
            this.f39375x.c();
            this.f39372u.c();
            if (getAndIncrement() == 0) {
                this.f39374w.lazySet(null);
            }
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            if (EnumC5814b.l(this.f39375x, interfaceC5732b)) {
                this.f39375x = interfaceC5732b;
                this.f39369o.d(this);
            }
        }

        void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference atomicReference = this.f39374w;
            a6.i iVar = this.f39369o;
            int i8 = 1;
            while (!this.f39366A) {
                boolean z7 = this.f39376y;
                if (z7 && this.f39377z != null) {
                    atomicReference.lazySet(null);
                    iVar.onError(this.f39377z);
                    this.f39372u.c();
                    return;
                }
                boolean z8 = atomicReference.get() == null;
                if (z7) {
                    Object andSet = atomicReference.getAndSet(null);
                    if (!z8 && this.f39373v) {
                        iVar.b(andSet);
                    }
                    iVar.a();
                    this.f39372u.c();
                    return;
                }
                if (z8) {
                    if (this.f39367B) {
                        this.f39368C = false;
                        this.f39367B = false;
                    }
                } else if (!this.f39368C || this.f39367B) {
                    iVar.b(atomicReference.getAndSet(null));
                    this.f39367B = false;
                    this.f39368C = true;
                    this.f39372u.d(this, this.f39370s, this.f39371t);
                }
                i8 = addAndGet(-i8);
                if (i8 == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // a6.i
        public void onError(Throwable th) {
            this.f39377z = th;
            this.f39376y = true;
            e();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39367B = true;
            e();
        }
    }

    public r(AbstractC0829f abstractC0829f, long j8, TimeUnit timeUnit, a6.j jVar, boolean z7) {
        super(abstractC0829f);
        this.f39362s = j8;
        this.f39363t = timeUnit;
        this.f39364u = jVar;
        this.f39365v = z7;
    }

    @Override // a6.AbstractC0829f
    protected void G(a6.i iVar) {
        this.f39239o.c(new a(iVar, this.f39362s, this.f39363t, this.f39364u.b(), this.f39365v));
    }
}
