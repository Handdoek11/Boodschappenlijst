package j$.time;

import j$.time.chrono.AbstractC5889i;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class o implements j$.time.temporal.o, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37152a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37153b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i8 = this.f37152a - oVar.f37152a;
        return i8 == 0 ? this.f37153b - oVar.f37153b : i8;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.f("--");
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        nVar.v();
    }

    private o(int i8, int i9) {
        this.f37152a = i8;
        this.f37153b = i9;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH : rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.j();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.n.d(this, rVar);
        }
        m F7 = m.F(this.f37152a);
        F7.getClass();
        int i8 = l.f37148a[F7.ordinal()];
        return j$.time.temporal.w.k(i8 != 1 ? (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) ? 30 : 31 : 28, m.F(r5).E());
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        return n(rVar).a(s(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        int i8;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = n.f37151a[((j$.time.temporal.a) rVar).ordinal()];
        if (i9 == 1) {
            i8 = this.f37153b;
        } else {
            if (i9 != 2) {
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
            }
            i8 = this.f37152a;
        }
        return i8;
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.u.f37068d;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!AbstractC5889i.p(mVar).equals(j$.time.chrono.u.f37068d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m d8 = mVar.d(this.f37152a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return d8.d(Math.min(d8.n(aVar).d(), this.f37153b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f37152a == oVar.f37152a && this.f37153b == oVar.f37153b;
    }

    public final int hashCode() {
        return (this.f37152a << 6) + this.f37153b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i8 = this.f37152a;
        sb.append(i8 < 10 ? "0" : "");
        sb.append(i8);
        int i9 = this.f37153b;
        sb.append(i9 < 10 ? "-0" : "-");
        sb.append(i9);
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void D(DataOutput dataOutput) {
        dataOutput.writeByte(this.f37152a);
        dataOutput.writeByte(this.f37153b);
    }

    static o C(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        byte readByte2 = objectInput.readByte();
        m F7 = m.F(readByte);
        Objects.requireNonNull(F7, "month");
        j$.time.temporal.a.DAY_OF_MONTH.C(readByte2);
        if (readByte2 > F7.E()) {
            throw new c("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + F7.name());
        }
        return new o(F7.getValue(), readByte2);
    }
}
