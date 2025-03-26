package O;

import c0.C0970b;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private int f4213a;

    /* renamed from: b, reason: collision with root package name */
    private int f4214b;

    /* renamed from: c, reason: collision with root package name */
    private long f4215c = c0.p.a(0, 0);

    /* renamed from: d, reason: collision with root package name */
    private long f4216d = q.f4219b;

    /* renamed from: e, reason: collision with root package name */
    private long f4217e = c0.m.f12088b.a();

    public static abstract class a {
        public static /* synthetic */ void b(a aVar, p pVar, int i8, int i9, float f8, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i10 & 4) != 0) {
                f8 = 0.0f;
            }
            aVar.a(pVar, i8, i9, f8);
        }

        public final void a(p pVar, int i8, int i9, float f8) {
            long a8 = c0.n.a(i8, i9);
            long j8 = pVar.f4217e;
            pVar.C(c0.n.a(c0.m.f(a8) + c0.m.f(j8), c0.m.g(a8) + c0.m.g(j8)), f8, null);
        }

        public final void c(p pVar, long j8, float f8) {
            long j9 = pVar.f4217e;
            pVar.C(c0.n.a(c0.m.f(j8) + c0.m.f(j9), c0.m.g(j8) + c0.m.g(j9)), f8, null);
        }

        public final void d(p pVar, long j8, float f8, I6.l lVar) {
            long j9 = pVar.f4217e;
            pVar.C(c0.n.a(c0.m.f(j8) + c0.m.f(j9), c0.m.g(j8) + c0.m.g(j9)), f8, lVar);
        }
    }

    private final void B() {
        this.f4213a = P6.m.i(c0.o.e(this.f4215c), C0970b.j(this.f4216d), C0970b.h(this.f4216d));
        this.f4214b = P6.m.i(c0.o.d(this.f4215c), C0970b.i(this.f4216d), C0970b.g(this.f4216d));
        this.f4217e = c0.n.a((this.f4213a - c0.o.e(this.f4215c)) / 2, (this.f4214b - c0.o.d(this.f4215c)) / 2);
    }

    public final int A() {
        return this.f4213a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void C(long j8, float f8, I6.l lVar);

    protected final void D(long j8) {
        if (c0.o.c(this.f4215c, j8)) {
            return;
        }
        this.f4215c = j8;
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E(long j8) {
        if (C0970b.e(this.f4216d, j8)) {
            return;
        }
        this.f4216d = j8;
        B();
    }

    protected final long u() {
        return this.f4217e;
    }

    public final int v() {
        return this.f4214b;
    }

    public int w() {
        return c0.o.d(this.f4215c);
    }

    protected final long x() {
        return this.f4215c;
    }

    public int y() {
        return c0.o.e(this.f4215c);
    }

    protected final long z() {
        return this.f4216d;
    }
}
