package m7;

import k7.AbstractC6117b;

/* loaded from: classes2.dex */
public final class H extends j7.b implements l7.l {

    /* renamed from: a, reason: collision with root package name */
    private final C6232f f39422a;

    /* renamed from: b, reason: collision with root package name */
    private final l7.a f39423b;

    /* renamed from: c, reason: collision with root package name */
    private final M f39424c;

    /* renamed from: d, reason: collision with root package name */
    private final l7.l[] f39425d;

    /* renamed from: e, reason: collision with root package name */
    private final n7.b f39426e;

    /* renamed from: f, reason: collision with root package name */
    private final l7.f f39427f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39428g;

    /* renamed from: h, reason: collision with root package name */
    private String f39429h;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39430a;

        static {
            int[] iArr = new int[M.values().length];
            try {
                iArr[M.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[M.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[M.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39430a = iArr;
        }
    }

    public H(C6232f c6232f, l7.a aVar, M m8, l7.l[] lVarArr) {
        J6.r.e(c6232f, "composer");
        J6.r.e(aVar, "json");
        J6.r.e(m8, "mode");
        this.f39422a = c6232f;
        this.f39423b = aVar;
        this.f39424c = m8;
        this.f39425d = lVarArr;
        this.f39426e = b().a();
        this.f39427f = b().d();
        int ordinal = m8.ordinal();
        if (lVarArr != null) {
            l7.l lVar = lVarArr[ordinal];
            if (lVar == null && lVar == this) {
                return;
            }
            lVarArr[ordinal] = this;
        }
    }

    private final C6232f G() {
        C6232f c6232f = this.f39422a;
        return c6232f instanceof C6240n ? c6232f : new C6240n(c6232f.f39456a, this.f39428g);
    }

    private final void H(i7.f fVar) {
        this.f39422a.c();
        String str = this.f39429h;
        J6.r.b(str);
        E(str);
        this.f39422a.e(':');
        this.f39422a.o();
        E(fVar.a());
    }

    @Override // j7.b, j7.f
    public void C(long j8) {
        if (this.f39428g) {
            E(String.valueOf(j8));
        } else {
            this.f39422a.i(j8);
        }
    }

    @Override // j7.b, j7.f
    public j7.f D(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        return I.a(fVar) ? new H(G(), b(), this.f39424c, (l7.l[]) null) : super.D(fVar);
    }

    @Override // j7.b, j7.f
    public void E(String str) {
        J6.r.e(str, "value");
        this.f39422a.m(str);
    }

    @Override // j7.b
    public boolean F(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        int i9 = a.f39430a[this.f39424c.ordinal()];
        if (i9 != 1) {
            boolean z7 = false;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (!this.f39422a.a()) {
                        this.f39422a.e(',');
                    }
                    this.f39422a.c();
                    E(fVar.h(i8));
                    this.f39422a.e(':');
                    this.f39422a.o();
                } else {
                    if (i8 == 0) {
                        this.f39428g = true;
                    }
                    if (i8 == 1) {
                        this.f39422a.e(',');
                        this.f39422a.o();
                        this.f39428g = false;
                    }
                }
            } else if (this.f39422a.a()) {
                this.f39428g = true;
                this.f39422a.c();
            } else {
                if (i8 % 2 == 0) {
                    this.f39422a.e(',');
                    this.f39422a.c();
                    z7 = true;
                } else {
                    this.f39422a.e(':');
                    this.f39422a.o();
                }
                this.f39428g = z7;
            }
        } else {
            if (!this.f39422a.a()) {
                this.f39422a.e(',');
            }
            this.f39422a.c();
        }
        return true;
    }

    @Override // j7.f
    public n7.b a() {
        return this.f39426e;
    }

    @Override // l7.l
    public l7.a b() {
        return this.f39423b;
    }

    @Override // j7.b, j7.d
    public void c(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        if (this.f39424c.f39441s != 0) {
            this.f39422a.p();
            this.f39422a.c();
            this.f39422a.e(this.f39424c.f39441s);
        }
    }

    @Override // j7.b, j7.f
    public j7.d d(i7.f fVar) {
        l7.l lVar;
        J6.r.e(fVar, "descriptor");
        M b8 = N.b(b(), fVar);
        char c8 = b8.f39440o;
        if (c8 != 0) {
            this.f39422a.e(c8);
            this.f39422a.b();
        }
        if (this.f39429h != null) {
            H(fVar);
            this.f39429h = null;
        }
        if (this.f39424c == b8) {
            return this;
        }
        l7.l[] lVarArr = this.f39425d;
        return (lVarArr == null || (lVar = lVarArr[b8.ordinal()]) == null) ? new H(this.f39422a, b(), b8, this.f39425d) : lVar;
    }

    @Override // j7.b, j7.d
    public boolean e(i7.f fVar, int i8) {
        J6.r.e(fVar, "descriptor");
        return this.f39427f.e();
    }

    @Override // j7.f
    public void f() {
        this.f39422a.j("null");
    }

    @Override // j7.b, j7.f
    public void i(double d8) {
        if (this.f39428g) {
            E(String.valueOf(d8));
        } else {
            this.f39422a.f(d8);
        }
        if (this.f39427f.a()) {
            return;
        }
        if (Double.isInfinite(d8) || Double.isNaN(d8)) {
            throw u.b(Double.valueOf(d8), this.f39422a.f39456a.toString());
        }
    }

    @Override // j7.b, j7.f
    public void j(short s8) {
        if (this.f39428g) {
            E(String.valueOf((int) s8));
        } else {
            this.f39422a.k(s8);
        }
    }

    @Override // j7.f
    public void k(i7.f fVar, int i8) {
        J6.r.e(fVar, "enumDescriptor");
        E(fVar.h(i8));
    }

    @Override // j7.b, j7.f
    public void l(byte b8) {
        if (this.f39428g) {
            E(String.valueOf((int) b8));
        } else {
            this.f39422a.d(b8);
        }
    }

    @Override // j7.b, j7.f
    public void m(boolean z7) {
        if (this.f39428g) {
            E(String.valueOf(z7));
        } else {
            this.f39422a.l(z7);
        }
    }

    @Override // j7.b, j7.f
    public void n(g7.h hVar, Object obj) {
        J6.r.e(hVar, "serializer");
        if (!(hVar instanceof AbstractC6117b) || b().d().k()) {
            hVar.serialize(this, obj);
            return;
        }
        AbstractC6117b abstractC6117b = (AbstractC6117b) hVar;
        String c8 = E.c(hVar.getDescriptor(), b());
        J6.r.c(obj, "null cannot be cast to non-null type kotlin.Any");
        g7.h b8 = g7.e.b(abstractC6117b, this, obj);
        E.f(abstractC6117b, b8, c8);
        E.b(b8.getDescriptor().e());
        this.f39429h = c8;
        b8.serialize(this, obj);
    }

    @Override // j7.b, j7.f
    public void o(float f8) {
        if (this.f39428g) {
            E(String.valueOf(f8));
        } else {
            this.f39422a.g(f8);
        }
        if (this.f39427f.a()) {
            return;
        }
        if (Float.isInfinite(f8) || Float.isNaN(f8)) {
            throw u.b(Float.valueOf(f8), this.f39422a.f39456a.toString());
        }
    }

    @Override // j7.b, j7.f
    public void q(char c8) {
        E(String.valueOf(c8));
    }

    @Override // j7.b, j7.f
    public void z(int i8) {
        if (this.f39428g) {
            E(String.valueOf(i8));
        } else {
            this.f39422a.h(i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H(D d8, l7.a aVar, M m8, l7.l[] lVarArr) {
        this(p.a(d8, aVar), aVar, m8, lVarArr);
        J6.r.e(d8, "output");
        J6.r.e(aVar, "json");
        J6.r.e(m8, "mode");
        J6.r.e(lVarArr, "modeReuseCache");
    }
}
