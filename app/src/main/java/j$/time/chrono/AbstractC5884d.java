package j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5884d implements InterfaceC5882b, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    abstract InterfaceC5882b F(long j8);

    abstract InterfaceC5882b G(long j8);

    abstract InterfaceC5882b H(long j8);

    @Override // j$.time.chrono.InterfaceC5882b, j$.time.temporal.o
    public /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC5889i.h(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int k(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public /* synthetic */ j$.time.temporal.w n(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object v(j$.time.temporal.t tVar) {
        return AbstractC5889i.j(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final /* synthetic */ j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return AbstractC5889i.a(this, mVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: z */
    public final /* synthetic */ int compareTo(InterfaceC5882b interfaceC5882b) {
        return AbstractC5889i.b(this, interfaceC5882b);
    }

    static InterfaceC5882b C(n nVar, j$.time.temporal.m mVar) {
        InterfaceC5882b interfaceC5882b = (InterfaceC5882b) mVar;
        if (nVar.equals(interfaceC5882b.a())) {
            return interfaceC5882b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + nVar.i() + ", actual: " + interfaceC5882b.a().i());
    }

    AbstractC5884d() {
    }

    @Override // j$.time.temporal.m
    public InterfaceC5882b e(long j8, j$.time.temporal.u uVar) {
        boolean z7 = uVar instanceof j$.time.temporal.b;
        if (!z7) {
            if (!z7) {
                return C(a(), uVar.j(this, j8));
            }
            throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
        switch (AbstractC5883c.f37035a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return F(j8);
            case 2:
                return F(j$.com.android.tools.r8.a.j(j8, 7));
            case 3:
                return G(j8);
            case 4:
                return H(j8);
            case 5:
                return H(j$.com.android.tools.r8.a.j(j8, 10));
            case 6:
                return H(j$.com.android.tools.r8.a.j(j8, 100));
            case 7:
                return H(j$.com.android.tools.r8.a.j(j8, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.d(s(aVar), j8), (j$.time.temporal.r) aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public o D() {
        return a().A(j$.time.temporal.n.a(this, j$.time.temporal.a.ERA));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC5882b) && AbstractC5889i.b(this, (InterfaceC5882b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public int hashCode() {
        long t7 = t();
        return ((int) (t7 ^ (t7 >>> 32))) ^ a().hashCode();
    }

    @Override // j$.time.temporal.m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public InterfaceC5882b m(j$.time.temporal.p pVar) {
        return C(a(), pVar.w(this));
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public String toString() {
        long s8 = s(j$.time.temporal.a.YEAR_OF_ERA);
        long s9 = s(j$.time.temporal.a.MONTH_OF_YEAR);
        long s10 = s(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(D());
        sb.append(" ");
        sb.append(s8);
        sb.append(s9 < 10 ? "-0" : "-");
        sb.append(s9);
        sb.append(s10 < 10 ? "-0" : "-");
        sb.append(s10);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public InterfaceC5882b d(long j8, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return C(a(), rVar.n(this, j8));
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public InterfaceC5882b j(long j8, j$.time.temporal.u uVar) {
        return C(a(), j$.time.temporal.n.b(this, j8, uVar));
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public InterfaceC5885e u(j$.time.k kVar) {
        return C5887g.D(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public long t() {
        return s(j$.time.temporal.a.EPOCH_DAY);
    }
}
