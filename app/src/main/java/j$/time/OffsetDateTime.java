package j$.time;

import j$.time.chrono.AbstractC5889i;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.p, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a, reason: collision with root package name */
    private final LocalDateTime f37004a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset f37005b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int H7;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f37005b;
        ZoneOffset zoneOffset2 = this.f37005b;
        if (zoneOffset2.equals(zoneOffset)) {
            H7 = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f37004a;
            localDateTime.getClass();
            long n8 = AbstractC5889i.n(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.f37004a;
            localDateTime2.getClass();
            int compare = Long.compare(n8, AbstractC5889i.n(localDateTime2, offsetDateTime2.f37005b));
            H7 = compare == 0 ? localDateTime.b().H() - localDateTime2.b().H() : compare;
        }
        return H7 == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : H7;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f37000c;
        ZoneOffset zoneOffset = ZoneOffset.f37011g;
        localDateTime.getClass();
        C(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f37001d;
        ZoneOffset zoneOffset2 = ZoneOffset.f37010f;
        localDateTime2.getClass();
        C(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime C(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime D(Instant instant, w wVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(wVar, "zone");
        ZoneOffset d8 = wVar.C().d(instant);
        return new OffsetDateTime(LocalDateTime.L(instant.D(), instant.E(), d8), d8);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f37004a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f37005b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    private OffsetDateTime G(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f37004a == localDateTime && this.f37005b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.m(this));
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).j();
            }
            return this.f37004a.n(rVar);
        }
        return rVar.s(this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i8 = p.f37154a[((j$.time.temporal.a) rVar).ordinal()];
            if (i8 == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i8 == 2) {
                return this.f37005b.I();
            }
            return this.f37004a.k(rVar);
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i8 = p.f37154a[((j$.time.temporal.a) rVar).ordinal()];
        ZoneOffset zoneOffset = this.f37005b;
        LocalDateTime localDateTime = this.f37004a;
        if (i8 != 1) {
            return i8 != 2 ? localDateTime.s(rVar) : zoneOffset.I();
        }
        localDateTime.getClass();
        return AbstractC5889i.n(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f37004a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return G(this.f37004a.R(hVar), this.f37005b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j8, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i8 = p.f37154a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.f37005b;
            LocalDateTime localDateTime = this.f37004a;
            if (i8 == 1) {
                return D(Instant.F(j8, localDateTime.E()), zoneOffset);
            }
            if (i8 == 2) {
                return G(localDateTime, ZoneOffset.L(aVar.w(j8)));
            }
            return G(localDateTime.d(j8, rVar), zoneOffset);
        }
        return (OffsetDateTime) rVar.n(this, j8);
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime e(long j8, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return G(this.f37004a.e(j8, uVar), this.f37005b);
        }
        return (OffsetDateTime) uVar.j(this, j8);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j8, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.f37005b;
        }
        if (tVar == j$.time.temporal.n.k()) {
            return null;
        }
        j$.time.temporal.t f8 = j$.time.temporal.n.f();
        LocalDateTime localDateTime = this.f37004a;
        if (tVar == f8) {
            return localDateTime.P();
        }
        if (tVar == j$.time.temporal.n.g()) {
            return localDateTime.b();
        }
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.u.f37068d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f37004a;
        return mVar.d(localDateTime.P().t(), aVar).d(localDateTime.b().S(), j$.time.temporal.a.NANO_OF_DAY).d(this.f37005b.I(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f37004a.equals(offsetDateTime.f37004a) && this.f37005b.equals(offsetDateTime.f37005b);
    }

    public final int hashCode() {
        return this.f37004a.hashCode() ^ this.f37005b.hashCode();
    }

    public final String toString() {
        return this.f37004a.toString() + this.f37005b.toString();
    }

    private Object writeReplace() {
        return new s((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f37004a.T(objectOutput);
        this.f37005b.O(objectOutput);
    }

    static OffsetDateTime F(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f37000c;
        h hVar = h.f37132d;
        return new OffsetDateTime(LocalDateTime.K(h.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.R(objectInput)), ZoneOffset.N(objectInput));
    }
}
