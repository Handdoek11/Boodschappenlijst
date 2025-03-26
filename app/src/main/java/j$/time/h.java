package j$.time;

import j$.time.chrono.AbstractC5889i;
import j$.time.chrono.InterfaceC5882b;
import j$.time.chrono.InterfaceC5885e;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class h implements j$.time.temporal.m, j$.time.temporal.p, InterfaceC5882b, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final h f37132d = N(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final h f37133e = N(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37134a;

    /* renamed from: b, reason: collision with root package name */
    private final short f37135b;

    /* renamed from: c, reason: collision with root package name */
    private final short f37136c;

    static {
        N(1970, 1, 1);
    }

    public static h O(int i8, m mVar, int i9) {
        j$.time.temporal.a.YEAR.C(i8);
        Objects.requireNonNull(mVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.C(i9);
        return D(i8, mVar.getValue(), i9);
    }

    public static h N(int i8, int i9, int i10) {
        j$.time.temporal.a.YEAR.C(i8);
        j$.time.temporal.a.MONTH_OF_YEAR.C(i9);
        j$.time.temporal.a.DAY_OF_MONTH.C(i10);
        return D(i8, i9, i10);
    }

    public static h P(long j8) {
        long j9;
        j$.time.temporal.a.EPOCH_DAY.C(j8);
        long j10 = 719468 + j8;
        if (j10 < 0) {
            long j11 = ((j8 + 719469) / 146097) - 1;
            j9 = j11 * 400;
            j10 += (-j11) * 146097;
        } else {
            j9 = 0;
        }
        long j12 = ((j10 * 400) + 591) / 146097;
        long j13 = j10 - ((j12 / 400) + (((j12 / 4) + (j12 * 365)) - (j12 / 100)));
        if (j13 < 0) {
            j12--;
            j13 = j10 - ((j12 / 400) + (((j12 / 4) + (365 * j12)) - (j12 / 100)));
        }
        int i8 = (int) j13;
        int i9 = ((i8 * 5) + 2) / 153;
        return new h(j$.time.temporal.a.YEAR.w(j12 + j9 + (i9 / 10)), ((i9 + 2) % 12) + 1, (i8 - (((i9 * 306) + 5) / 10)) + 1);
    }

    public static h E(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "temporal");
        h hVar = (h) oVar.v(j$.time.temporal.n.f());
        if (hVar != null) {
            return hVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName());
    }

    private static h D(int i8, int i9, int i10) {
        int i11 = 28;
        if (i10 > 28) {
            if (i9 != 2) {
                i11 = (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.u.f37068d.getClass();
                if (j$.time.chrono.u.m(i8)) {
                    i11 = 29;
                }
            }
            if (i10 > i11) {
                if (i10 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i8 + "' is not a leap year");
                }
                throw new c("Invalid date '" + m.F(i9).name() + " " + i10 + "'");
            }
        }
        return new h(i8, i9, i10);
    }

    private static h U(int i8, int i9, int i10) {
        if (i9 == 2) {
            j$.time.chrono.u.f37068d.getClass();
            i10 = Math.min(i10, j$.time.chrono.u.m((long) i8) ? 29 : 28);
        } else if (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) {
            i10 = Math.min(i10, 30);
        }
        return new h(i8, i9, i10);
    }

    private h(int i8, int i9, int i10) {
        this.f37134a = i8;
        this.f37135b = (short) i9;
        this.f37136c = (short) i10;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return AbstractC5889i.h(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.s(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (!aVar.v()) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        int i8 = g.f37130a[aVar.ordinal()];
        if (i8 == 1) {
            return j$.time.temporal.w.j(1L, M());
        }
        if (i8 == 2) {
            return j$.time.temporal.w.j(1L, L() ? 366 : 365);
        }
        if (i8 == 3) {
            return j$.time.temporal.w.j(1L, (m.F(this.f37135b) != m.FEBRUARY || L()) ? 5L : 4L);
        }
        if (i8 != 4) {
            return ((j$.time.temporal.a) rVar).j();
        }
        return j$.time.temporal.w.j(1L, this.f37134a <= 0 ? 1000000000L : 999999999L);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return F(rVar);
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.EPOCH_DAY) {
                return t();
            }
            if (rVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return F(rVar);
            }
            return ((this.f37134a * 12) + this.f37135b) - 1;
        }
        return rVar.k(this);
    }

    private int F(j$.time.temporal.r rVar) {
        int i8;
        int i9 = g.f37130a[((j$.time.temporal.a) rVar).ordinal()];
        short s8 = this.f37136c;
        int i10 = this.f37134a;
        switch (i9) {
            case 1:
                return s8;
            case 2:
                return H();
            case 3:
                i8 = (s8 - 1) / 7;
                break;
            case 4:
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return G().getValue();
            case 6:
                i8 = (s8 - 1) % 7;
                break;
            case 7:
                return ((H() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.v("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((H() - 1) / 7) + 1;
            case 10:
                return this.f37135b;
            case 11:
                throw new j$.time.temporal.v("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i10;
            case 13:
                return i10 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return i8 + 1;
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public final j$.time.chrono.n a() {
        return j$.time.chrono.u.f37068d;
    }

    public final int J() {
        return this.f37134a;
    }

    public final int I() {
        return this.f37135b;
    }

    public final int H() {
        return (m.F(this.f37135b).C(L()) + this.f37136c) - 1;
    }

    public final e G() {
        return e.C(((int) j$.com.android.tools.r8.a.h(t() + 3, 7)) + 1);
    }

    public final boolean L() {
        j$.time.chrono.u uVar = j$.time.chrono.u.f37068d;
        long j8 = this.f37134a;
        uVar.getClass();
        return j$.time.chrono.u.m(j8);
    }

    public final int M() {
        short s8 = this.f37135b;
        return s8 != 2 ? (s8 == 4 || s8 == 6 || s8 == 9 || s8 == 11) ? 30 : 31 : L() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final h m(j$.time.temporal.p pVar) {
        if (pVar instanceof h) {
            return (h) pVar;
        }
        return (h) pVar.w(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final h d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (h) rVar.n(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.C(j8);
        int i8 = g.f37130a[aVar.ordinal()];
        short s8 = this.f37136c;
        short s9 = this.f37135b;
        int i9 = this.f37134a;
        switch (i8) {
            case 1:
                int i10 = (int) j8;
                return s8 == i10 ? this : N(i9, s9, i10);
            case 2:
                return X((int) j8);
            case 3:
                return R(j$.com.android.tools.r8.a.j(j8 - s(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i9 < 1) {
                    j8 = 1 - j8;
                }
                return Y((int) j8);
            case 5:
                return R(j8 - G().getValue());
            case 6:
                return R(j8 - s(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return R(j8 - s(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return P(j8);
            case 9:
                return R(j$.com.android.tools.r8.a.j(j8 - s(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i11 = (int) j8;
                if (s9 == i11) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.C(i11);
                return U(i9, i11, s8);
            case 11:
                return S(j8 - (((i9 * 12) + s9) - 1));
            case 12:
                return Y((int) j8);
            case 13:
                return s(j$.time.temporal.a.ERA) == j8 ? this : Y(1 - i9);
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final h Y(int i8) {
        if (this.f37134a == i8) {
            return this;
        }
        j$.time.temporal.a.YEAR.C(i8);
        return U(i8, this.f37135b, this.f37136c);
    }

    public final h X(int i8) {
        if (H() == i8) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i9 = this.f37134a;
        long j8 = i9;
        aVar.C(j8);
        j$.time.temporal.a.DAY_OF_YEAR.C(i8);
        j$.time.chrono.u.f37068d.getClass();
        boolean m8 = j$.time.chrono.u.m(j8);
        if (i8 == 366 && !m8) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i9 + "' is not a leap year");
        }
        m F7 = m.F(((i8 - 1) / 31) + 1);
        if (i8 > (F7.D(m8) + F7.C(m8)) - 1) {
            F7 = F7.G();
        }
        return new h(i9, F7.getValue(), (i8 - F7.C(m8)) + 1);
    }

    @Override // j$.time.temporal.m
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final h e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (h) uVar.j(this, j8);
        }
        switch (g.f37131b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return R(j8);
            case 2:
                return R(j$.com.android.tools.r8.a.j(j8, 7));
            case 3:
                return S(j8);
            case 4:
                return T(j8);
            case 5:
                return T(j$.com.android.tools.r8.a.j(j8, 10));
            case 6:
                return T(j$.com.android.tools.r8.a.j(j8, 100));
            case 7:
                return T(j$.com.android.tools.r8.a.j(j8, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.d(s(aVar), j8), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final h T(long j8) {
        return j8 == 0 ? this : U(j$.time.temporal.a.YEAR.w(this.f37134a + j8), this.f37135b, this.f37136c);
    }

    public final h S(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = (this.f37134a * 12) + (this.f37135b - 1) + j8;
        long j10 = 12;
        return U(j$.time.temporal.a.YEAR.w(j$.com.android.tools.r8.a.i(j9, j10)), ((int) j$.com.android.tools.r8.a.h(j9, j10)) + 1, this.f37136c);
    }

    public final h R(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = this.f37136c + j8;
        if (j9 > 0) {
            short s8 = this.f37135b;
            int i8 = this.f37134a;
            if (j9 <= 28) {
                return new h(i8, s8, (int) j9);
            }
            if (j9 <= 59) {
                long M7 = M();
                if (j9 <= M7) {
                    return new h(i8, s8, (int) j9);
                }
                if (s8 < 12) {
                    return new h(i8, s8 + 1, (int) (j9 - M7));
                }
                int i9 = i8 + 1;
                j$.time.temporal.a.YEAR.C(i9);
                return new h(i9, 1, (int) (j9 - M7));
            }
        }
        return P(j$.com.android.tools.r8.a.d(t(), j8));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j8, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.f() ? this : AbstractC5889i.j(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return AbstractC5889i.a(this, mVar);
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public final InterfaceC5885e u(k kVar) {
        return LocalDateTime.K(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public final long t() {
        long j8 = this.f37134a;
        long j9 = this.f37135b;
        long j10 = 365 * j8;
        long j11 = (((367 * j9) - 362) / 12) + (j8 >= 0 ? ((j8 + 399) / 400) + (((3 + j8) / 4) - ((99 + j8) / 100)) + j10 : j10 - ((j8 / (-400)) + ((j8 / (-4)) - (j8 / (-100))))) + (this.f37136c - 1);
        if (j9 > 2) {
            j11 = !L() ? j11 - 2 : j11 - 1;
        }
        return j11 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC5882b interfaceC5882b) {
        if (interfaceC5882b instanceof h) {
            return C((h) interfaceC5882b);
        }
        return AbstractC5889i.b(this, interfaceC5882b);
    }

    final int C(h hVar) {
        int i8 = this.f37134a - hVar.f37134a;
        if (i8 != 0) {
            return i8;
        }
        int i9 = this.f37135b - hVar.f37135b;
        return i9 == 0 ? this.f37136c - hVar.f37136c : i9;
    }

    public final boolean K(h hVar) {
        return hVar instanceof h ? C(hVar) < 0 : t() < hVar.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && C((h) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public final int hashCode() {
        int i8 = this.f37134a;
        return (((i8 << 11) + (this.f37135b << 6)) + this.f37136c) ^ (i8 & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public final String toString() {
        int i8 = this.f37134a;
        int abs = Math.abs(i8);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i8 > 9999) {
                sb.append('+');
            }
            sb.append(i8);
        } else if (i8 < 0) {
            sb.append(i8 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i8 + 10000);
            sb.deleteCharAt(0);
        }
        short s8 = this.f37135b;
        sb.append(s8 < 10 ? "-0" : "-");
        sb.append((int) s8);
        short s9 = this.f37136c;
        sb.append(s9 < 10 ? "-0" : "-");
        sb.append((int) s9);
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void Z(DataOutput dataOutput) {
        dataOutput.writeInt(this.f37134a);
        dataOutput.writeByte(this.f37135b);
        dataOutput.writeByte(this.f37136c);
    }
}
