package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    static final t f37183a = new s(0);

    /* renamed from: b, reason: collision with root package name */
    static final t f37184b = new s(1);

    /* renamed from: c, reason: collision with root package name */
    static final t f37185c = new s(2);

    /* renamed from: d, reason: collision with root package name */
    static final t f37186d = new s(3);

    /* renamed from: e, reason: collision with root package name */
    static final t f37187e = new s(4);

    /* renamed from: f, reason: collision with root package name */
    static final t f37188f = new s(5);

    /* renamed from: g, reason: collision with root package name */
    static final t f37189g = new s(6);

    public static t k() {
        return f37183a;
    }

    public static w d(o oVar, r rVar) {
        if (!(rVar instanceof a)) {
            Objects.requireNonNull(rVar, "field");
            return rVar.s(oVar);
        }
        if (oVar.f(rVar)) {
            return ((a) rVar).j();
        }
        throw new v(j$.time.d.a("Unsupported field: ", rVar));
    }

    public static t e() {
        return f37184b;
    }

    public static int a(o oVar, r rVar) {
        w n8 = oVar.n(rVar);
        if (!n8.h()) {
            throw new v("Invalid field " + rVar + " for get() method, use getLong() instead");
        }
        long s8 = oVar.s(rVar);
        if (n8.i(s8)) {
            return (int) s8;
        }
        throw new j$.time.c("Invalid value for " + rVar + " (valid values " + n8 + "): " + s8);
    }

    public static t i() {
        return f37185c;
    }

    public static t j() {
        return f37187e;
    }

    public static t h() {
        return f37186d;
    }

    public static Object c(o oVar, t tVar) {
        if (tVar == f37183a || tVar == f37184b || tVar == f37185c) {
            return null;
        }
        return tVar.a(oVar);
    }

    public static t f() {
        return f37188f;
    }

    public static t g() {
        return f37189g;
    }

    public static m b(m mVar, long j8, u uVar) {
        long j9;
        if (j8 == Long.MIN_VALUE) {
            mVar = mVar.e(Long.MAX_VALUE, uVar);
            j9 = 1;
        } else {
            j9 = -j8;
        }
        return mVar.e(j9, uVar);
    }
}
