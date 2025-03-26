package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class z extends AbstractC5884d {

    /* renamed from: d, reason: collision with root package name */
    static final j$.time.h f37073d = j$.time.h.N(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f37074a;

    /* renamed from: b, reason: collision with root package name */
    private transient A f37075b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f37076c;

    @Override // j$.time.chrono.AbstractC5884d
    public final o D() {
        return this.f37075b;
    }

    z(j$.time.h hVar) {
        if (hVar.K(f37073d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        A i8 = A.i(hVar);
        this.f37075b = i8;
        this.f37076c = (hVar.J() - i8.o().J()) + 1;
        this.f37074a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public final n a() {
        return x.f37071d;
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b
    public final int hashCode() {
        x.f37071d.getClass();
        return this.f37074a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b, j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).v();
        }
        return rVar != null && rVar.m(this);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.s(this);
        }
        if (!f(rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = y.f37072a[aVar.ordinal()];
        j$.time.h hVar = this.f37074a;
        if (i8 == 1) {
            return j$.time.temporal.w.j(1L, hVar.M());
        }
        A a8 = this.f37075b;
        if (i8 != 2) {
            if (i8 != 3) {
                return x.f37071d.m(aVar);
            }
            int J7 = a8.o().J();
            return a8.r() != null ? j$.time.temporal.w.j(1L, (r0.o().J() - J7) + 1) : j$.time.temporal.w.j(1L, 999999999 - J7);
        }
        A r8 = a8.r();
        int H7 = (r8 == null || r8.o().J() != hVar.J()) ? hVar.L() ? 366 : 365 : r8.o().H() - 1;
        if (this.f37076c == 1) {
            H7 -= a8.o().H() - 1;
        }
        return j$.time.temporal.w.j(1L, H7);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i8 = y.f37072a[((j$.time.temporal.a) rVar).ordinal()];
        int i9 = this.f37076c;
        A a8 = this.f37075b;
        j$.time.h hVar = this.f37074a;
        switch (i8) {
            case 2:
                return i9 == 1 ? (hVar.H() - a8.o().H()) + 1 : hVar.H();
            case 3:
                return i9;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
            case 8:
                return a8.getValue();
            default:
                return hVar.s(rVar);
        }
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final z d(long j8, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (s(aVar) == j8) {
                return this;
            }
            int[] iArr = y.f37072a;
            int i8 = iArr[aVar.ordinal()];
            j$.time.h hVar = this.f37074a;
            if (i8 == 3 || i8 == 8 || i8 == 9) {
                int a8 = x.f37071d.m(aVar).a(j8, aVar);
                int i9 = iArr[aVar.ordinal()];
                if (i9 == 3) {
                    return L(this.f37075b, a8);
                }
                if (i9 == 8) {
                    return L(A.A(a8), this.f37076c);
                }
                if (i9 == 9) {
                    return K(hVar.Y(a8));
                }
            }
            return K(hVar.d(j8, rVar));
        }
        return (z) super.d(j8, rVar);
    }

    @Override // j$.time.chrono.AbstractC5884d
    /* renamed from: I */
    public final InterfaceC5882b m(j$.time.temporal.p pVar) {
        return (z) super.m(pVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (z) super.m(hVar);
    }

    private z L(A a8, int i8) {
        x.f37071d.getClass();
        if (!(a8 instanceof A)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int J7 = (a8.o().J() + i8) - 1;
        if (i8 != 1 && (J7 < -999999999 || J7 > 999999999 || J7 < a8.o().J() || a8 != A.i(j$.time.h.N(J7, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return K(this.f37074a.Y(J7));
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b
    public final InterfaceC5885e u(j$.time.k kVar) {
        return C5887g.D(this, kVar);
    }

    @Override // j$.time.chrono.AbstractC5884d
    final InterfaceC5882b H(long j8) {
        return K(this.f37074a.T(j8));
    }

    @Override // j$.time.chrono.AbstractC5884d
    final InterfaceC5882b G(long j8) {
        return K(this.f37074a.S(j8));
    }

    @Override // j$.time.chrono.AbstractC5884d
    final InterfaceC5882b F(long j8) {
        return K(this.f37074a.R(j8));
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b, j$.time.temporal.m
    public final InterfaceC5882b e(long j8, j$.time.temporal.u uVar) {
        return (z) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j8, j$.time.temporal.u uVar) {
        return (z) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC5884d
    /* renamed from: E */
    public final InterfaceC5882b j(long j8, j$.time.temporal.u uVar) {
        return (z) super.j(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return (z) super.j(j8, bVar);
    }

    private z K(j$.time.h hVar) {
        return hVar.equals(this.f37074a) ? this : new z(hVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b
    public final long t() {
        return this.f37074a.t();
    }

    @Override // j$.time.chrono.AbstractC5884d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f37074a.equals(((z) obj).f37074a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 4, this);
    }
}
