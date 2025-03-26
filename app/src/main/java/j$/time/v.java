package j$.time;

import j$.time.chrono.AbstractC5889i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37199a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37200b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i8 = this.f37199a - vVar.f37199a;
        return i8 == 0 ? this.f37200b - vVar.f37200b : i8;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.v();
    }

    private v(int i8, int i9) {
        this.f37199a = i8;
        this.f37200b = i9;
    }

    private v H(int i8, int i9) {
        return (this.f37199a == i8 && this.f37200b == i9) ? this : new v(i8, i9);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.PROLEPTIC_MONTH || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f37199a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        return n(rVar).a(s(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i8 = u.f37197a[((j$.time.temporal.a) rVar).ordinal()];
        if (i8 == 1) {
            return this.f37200b;
        }
        if (i8 == 2) {
            return C();
        }
        int i9 = this.f37199a;
        if (i8 == 3) {
            if (i9 < 1) {
                i9 = 1 - i9;
            }
            return i9;
        }
        if (i8 == 4) {
            return i9;
        }
        if (i8 == 5) {
            return i9 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    private long C() {
        return ((this.f37199a * 12) + this.f37200b) - 1;
    }

    @Override // j$.time.temporal.m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final v d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (v) rVar.n(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.C(j8);
        int i8 = u.f37197a[aVar.ordinal()];
        int i9 = this.f37199a;
        if (i8 == 1) {
            int i10 = (int) j8;
            j$.time.temporal.a.MONTH_OF_YEAR.C(i10);
            return H(i9, i10);
        }
        if (i8 == 2) {
            return E(j8 - C());
        }
        int i11 = this.f37200b;
        if (i8 == 3) {
            if (i9 < 1) {
                j8 = 1 - j8;
            }
            int i12 = (int) j8;
            j$.time.temporal.a.YEAR.C(i12);
            return H(i12, i11);
        }
        if (i8 == 4) {
            int i13 = (int) j8;
            j$.time.temporal.a.YEAR.C(i13);
            return H(i13, i11);
        }
        if (i8 != 5) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        if (s(j$.time.temporal.a.ERA) == j8) {
            return this;
        }
        int i14 = 1 - i9;
        j$.time.temporal.a.YEAR.C(i14);
        return H(i14, i11);
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final v e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (v) uVar.j(this, j8);
        }
        switch (u.f37198b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return E(j8);
            case 2:
                return F(j8);
            case 3:
                return F(j$.com.android.tools.r8.a.j(j8, 10));
            case 4:
                return F(j$.com.android.tools.r8.a.j(j8, 100));
            case 5:
                return F(j$.com.android.tools.r8.a.j(j8, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.d(s(aVar), j8), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final v F(long j8) {
        return j8 == 0 ? this : H(j$.time.temporal.a.YEAR.w(this.f37199a + j8), this.f37200b);
    }

    public final v E(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = (this.f37199a * 12) + (this.f37200b - 1) + j8;
        long j10 = 12;
        return H(j$.time.temporal.a.YEAR.w(j$.com.android.tools.r8.a.i(j9, j10)), ((int) j$.com.android.tools.r8.a.h(j9, j10)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j8, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.u.f37068d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!AbstractC5889i.p(mVar).equals(j$.time.chrono.u.f37068d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.d(C(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f37199a == vVar.f37199a && this.f37200b == vVar.f37200b;
    }

    public final int hashCode() {
        return (this.f37200b << 27) ^ this.f37199a;
    }

    public final String toString() {
        int i8 = this.f37199a;
        int abs = Math.abs(i8);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i8);
        } else if (i8 < 0) {
            sb.append(i8 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i8 + 10000);
            sb.deleteCharAt(0);
        }
        int i9 = this.f37200b;
        sb.append(i9 < 10 ? "-0" : "-");
        sb.append(i9);
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void J(DataOutput dataOutput) {
        dataOutput.writeInt(this.f37199a);
        dataOutput.writeByte(this.f37200b);
    }

    static v G(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        byte readByte = objectInput.readByte();
        j$.time.temporal.a.YEAR.C(readInt);
        j$.time.temporal.a.MONTH_OF_YEAR.C(readByte);
        return new v(readInt, readByte);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (v) AbstractC5889i.a(hVar, this);
    }
}
