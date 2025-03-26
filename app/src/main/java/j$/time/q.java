package j$.time;

import j$.time.chrono.AbstractC5889i;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class q implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a, reason: collision with root package name */
    private final k f37155a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset f37156b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        ZoneOffset zoneOffset = qVar.f37156b;
        boolean equals = this.f37156b.equals(zoneOffset);
        k kVar = qVar.f37155a;
        k kVar2 = this.f37155a;
        if (equals) {
            return kVar2.compareTo(kVar);
        }
        int compare = Long.compare(kVar2.S() - (r1.I() * 1000000000), kVar.S() - (qVar.f37156b.I() * 1000000000));
        return compare == 0 ? kVar2.compareTo(kVar) : compare;
    }

    static {
        k kVar = k.f37140e;
        ZoneOffset zoneOffset = ZoneOffset.f37011g;
        kVar.getClass();
        C(kVar, zoneOffset);
        k kVar2 = k.f37141f;
        ZoneOffset zoneOffset2 = ZoneOffset.f37010f;
        kVar2.getClass();
        C(kVar2, zoneOffset2);
    }

    public static q C(k kVar, ZoneOffset zoneOffset) {
        return new q(kVar, zoneOffset);
    }

    private q(k kVar, ZoneOffset zoneOffset) {
        this.f37155a = (k) Objects.requireNonNull(kVar, "time");
        this.f37156b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    private q F(k kVar, ZoneOffset zoneOffset) {
        return (this.f37155a == kVar && this.f37156b.equals(zoneOffset)) ? this : new q(kVar, zoneOffset);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).D() || rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).j();
            }
            k kVar = this.f37155a;
            kVar.getClass();
            return j$.time.temporal.n.d(kVar, rVar);
        }
        return rVar.s(this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f37156b.I();
            }
            return this.f37155a.s(rVar);
        }
        return rVar.k(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j8, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            k kVar = this.f37155a;
            if (rVar == aVar) {
                return F(kVar, ZoneOffset.L(((j$.time.temporal.a) rVar).w(j8)));
            }
            return F(kVar.d(j8, rVar), this.f37156b);
        }
        return (q) rVar.n(this, j8);
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final q e(long j8, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return F(this.f37155a.e(j8, uVar), this.f37156b);
        }
        return (q) uVar.j(this, j8);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j8, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.f37156b;
        }
        if (((tVar == j$.time.temporal.n.k()) || (tVar == j$.time.temporal.n.e())) || tVar == j$.time.temporal.n.f()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return this.f37155a;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(this.f37155a.S(), j$.time.temporal.a.NANO_OF_DAY).d(this.f37156b.I(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f37155a.equals(qVar.f37155a) && this.f37156b.equals(qVar.f37156b);
    }

    public final int hashCode() {
        return this.f37155a.hashCode() ^ this.f37156b.hashCode();
    }

    public final String toString() {
        return this.f37155a.toString() + this.f37156b.toString();
    }

    private Object writeReplace() {
        return new s((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f37155a.W(objectOutput);
        this.f37156b.O(objectOutput);
    }

    static q E(ObjectInput objectInput) {
        return new q(k.R(objectInput), ZoneOffset.N(objectInput));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (q) AbstractC5889i.a(hVar, this);
    }
}
