package j$.time;

import j$.time.chrono.AbstractC5889i;
import j$.time.chrono.InterfaceC5882b;
import j$.time.chrono.InterfaceC5885e;
import j$.time.chrono.InterfaceC5891k;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public final class z implements j$.time.temporal.m, InterfaceC5891k, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a, reason: collision with root package name */
    private final LocalDateTime f37206a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset f37207b;

    /* renamed from: c, reason: collision with root package name */
    private final w f37208c;

    @Override // j$.time.chrono.InterfaceC5891k
    public final /* synthetic */ long B() {
        return AbstractC5889i.o(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC5889i.d(this, (InterfaceC5891k) obj);
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final InterfaceC5885e y() {
        return this.f37206a;
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final j$.time.chrono.n a() {
        return ((h) c()).a();
    }

    public static z C(LocalDateTime localDateTime, w wVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(wVar, "zone");
        if (wVar instanceof ZoneOffset) {
            return new z(localDateTime, wVar, (ZoneOffset) wVar);
        }
        j$.time.zone.f C7 = wVar.C();
        List g8 = C7.g(localDateTime);
        if (g8.size() == 1) {
            zoneOffset = (ZoneOffset) g8.get(0);
        } else if (g8.size() == 0) {
            j$.time.zone.b f8 = C7.f(localDateTime);
            localDateTime = localDateTime.N(f8.m().k());
            zoneOffset = f8.n();
        } else if (zoneOffset == null || !g8.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) g8.get(0), "offset");
        }
        return new z(localDateTime, wVar, zoneOffset);
    }

    private static z w(long j8, int i8, w wVar) {
        ZoneOffset d8 = wVar.C().d(Instant.F(j8, i8));
        return new z(LocalDateTime.L(j8, i8, d8), wVar, d8);
    }

    private z(LocalDateTime localDateTime, w wVar, ZoneOffset zoneOffset) {
        this.f37206a = localDateTime;
        this.f37207b = zoneOffset;
        this.f37208c = wVar;
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
            return this.f37206a.n(rVar);
        }
        return rVar.s(this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i8 = y.f37205a[((j$.time.temporal.a) rVar).ordinal()];
            if (i8 == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i8 == 2) {
                return this.f37207b.I();
            }
            return this.f37206a.k(rVar);
        }
        return AbstractC5889i.e(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i8 = y.f37205a[((j$.time.temporal.a) rVar).ordinal()];
        return i8 != 1 ? i8 != 2 ? this.f37206a.s(rVar) : this.f37207b.I() : AbstractC5889i.o(this);
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final ZoneOffset g() {
        return this.f37207b;
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final w q() {
        return this.f37208c;
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final InterfaceC5891k h(w wVar) {
        Objects.requireNonNull(wVar, "zone");
        return this.f37208c.equals(wVar) ? this : C(this.f37206a, wVar, this.f37207b);
    }

    public final LocalDateTime F() {
        return this.f37206a;
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final InterfaceC5882b c() {
        return this.f37206a.P();
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final k b() {
        return this.f37206a.b();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return C(LocalDateTime.K(hVar, this.f37206a.b()), this.f37208c, this.f37207b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j8, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i8 = y.f37205a[aVar.ordinal()];
            LocalDateTime localDateTime = this.f37206a;
            w wVar = this.f37208c;
            if (i8 == 1) {
                return w(j8, localDateTime.E(), wVar);
            }
            ZoneOffset zoneOffset = this.f37207b;
            if (i8 != 2) {
                return C(localDateTime.d(j8, rVar), wVar, zoneOffset);
            }
            ZoneOffset L7 = ZoneOffset.L(aVar.w(j8));
            return (L7.equals(zoneOffset) || !wVar.C().g(localDateTime).contains(L7)) ? this : new z(localDateTime, wVar, L7);
        }
        return (z) rVar.n(this, j8);
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final z e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (z) uVar.j(this, j8);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        int compareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
        ZoneOffset zoneOffset = this.f37207b;
        w wVar = this.f37208c;
        LocalDateTime localDateTime = this.f37206a;
        if (compareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return C(localDateTime.e(j8, uVar), wVar, zoneOffset);
        }
        LocalDateTime e8 = localDateTime.e(j8, uVar);
        Objects.requireNonNull(e8, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(wVar, "zone");
        if (wVar.C().g(e8).contains(zoneOffset)) {
            return new z(e8, wVar, zoneOffset);
        }
        e8.getClass();
        return w(AbstractC5889i.n(e8, zoneOffset), e8.E(), wVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j8, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.f()) {
            return this.f37206a.P();
        }
        return AbstractC5889i.l(this, tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f37206a.equals(zVar.f37206a) && this.f37207b.equals(zVar.f37207b) && this.f37208c.equals(zVar.f37208c);
    }

    public final int hashCode() {
        return (this.f37206a.hashCode() ^ this.f37207b.hashCode()) ^ Integer.rotateLeft(this.f37208c.hashCode(), 3);
    }

    public final String toString() {
        String localDateTime = this.f37206a.toString();
        ZoneOffset zoneOffset = this.f37207b;
        String str = localDateTime + zoneOffset.toString();
        w wVar = this.f37208c;
        if (zoneOffset == wVar) {
            return str;
        }
        return str + "[" + wVar.toString() + "]";
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void G(DataOutput dataOutput) {
        this.f37206a.T(dataOutput);
        this.f37207b.O(dataOutput);
        this.f37208c.G((ObjectOutput) dataOutput);
    }

    static z E(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f37000c;
        h hVar = h.f37132d;
        LocalDateTime K7 = LocalDateTime.K(h.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.R(objectInput));
        ZoneOffset N7 = ZoneOffset.N(objectInput);
        w wVar = (w) s.a(objectInput);
        Objects.requireNonNull(K7, "localDateTime");
        Objects.requireNonNull(N7, "offset");
        Objects.requireNonNull(wVar, "zone");
        if ((wVar instanceof ZoneOffset) && !N7.equals(wVar)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new z(K7, wVar, N7);
    }
}
