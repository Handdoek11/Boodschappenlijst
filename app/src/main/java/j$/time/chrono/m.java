package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
final class m implements InterfaceC5891k, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a, reason: collision with root package name */
    private final transient C5887g f37046a;

    /* renamed from: b, reason: collision with root package name */
    private final transient ZoneOffset f37047b;

    /* renamed from: c, reason: collision with root package name */
    private final transient j$.time.w f37048c;

    @Override // j$.time.chrono.InterfaceC5891k
    public final /* synthetic */ long B() {
        return AbstractC5889i.o(this);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int k(j$.time.temporal.r rVar) {
        return AbstractC5889i.e(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object v(j$.time.temporal.t tVar) {
        return AbstractC5889i.l(this, tVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC5889i.d(this, (InterfaceC5891k) obj);
    }

    static InterfaceC5891k C(j$.time.w wVar, ZoneOffset zoneOffset, C5887g c5887g) {
        Objects.requireNonNull(c5887g, "localDateTime");
        Objects.requireNonNull(wVar, "zone");
        if (wVar instanceof ZoneOffset) {
            return new m(wVar, (ZoneOffset) wVar, c5887g);
        }
        j$.time.zone.f C7 = wVar.C();
        LocalDateTime D7 = LocalDateTime.D(c5887g);
        List g8 = C7.g(D7);
        if (g8.size() == 1) {
            zoneOffset = (ZoneOffset) g8.get(0);
        } else if (g8.size() == 0) {
            j$.time.zone.b f8 = C7.f(D7);
            c5887g = c5887g.F(f8.m().k());
            zoneOffset = f8.n();
        } else if (zoneOffset == null || !g8.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g8.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new m(wVar, zoneOffset, c5887g);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).j();
            }
            return ((C5887g) y()).n(rVar);
        }
        return rVar.s(this);
    }

    static m w(n nVar, j$.time.temporal.m mVar) {
        m mVar2 = (m) mVar;
        if (nVar.equals(mVar2.a())) {
            return mVar2;
        }
        throw new ClassCastException("Chronology mismatch, required: " + nVar.i() + ", actual: " + mVar2.a().i());
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i8 = AbstractC5890j.f37044a[((j$.time.temporal.a) rVar).ordinal()];
            if (i8 == 1) {
                return B();
            }
            if (i8 == 2) {
                return g().I();
            }
            return ((C5887g) y()).s(rVar);
        }
        return rVar.k(this);
    }

    private m(j$.time.w wVar, ZoneOffset zoneOffset, C5887g c5887g) {
        this.f37046a = (C5887g) Objects.requireNonNull(c5887g, "dateTime");
        this.f37047b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.f37048c = (j$.time.w) Objects.requireNonNull(wVar, "zone");
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final ZoneOffset g() {
        return this.f37047b;
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final InterfaceC5882b c() {
        return ((C5887g) y()).c();
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final j$.time.k b() {
        return ((C5887g) y()).b();
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final InterfaceC5885e y() {
        return this.f37046a;
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final j$.time.w q() {
        return this.f37048c;
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final n a() {
        return c().a();
    }

    @Override // j$.time.chrono.InterfaceC5891k
    public final InterfaceC5891k h(j$.time.w wVar) {
        return C(wVar, this.f37047b, this.f37046a);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.m(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return w(a(), rVar.n(this, j8));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = AbstractC5892l.f37045a[aVar.ordinal()];
        if (i8 == 1) {
            return e(j8 - AbstractC5889i.o(this), j$.time.temporal.b.SECONDS);
        }
        j$.time.w wVar = this.f37048c;
        C5887g c5887g = this.f37046a;
        if (i8 != 2) {
            return C(wVar, this.f37047b, c5887g.d(j8, rVar));
        }
        ZoneOffset L7 = ZoneOffset.L(aVar.w(j8));
        c5887g.getClass();
        Instant F7 = Instant.F(AbstractC5889i.n(c5887g, L7), c5887g.b().H());
        n a8 = a();
        ZoneOffset d8 = wVar.C().d(F7);
        Objects.requireNonNull(d8, "offset");
        return new m(wVar, d8, (C5887g) a8.o(LocalDateTime.L(F7.D(), F7.E(), d8)));
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5891k e(long j8, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return w(a(), this.f37046a.e(j8, uVar).w(this));
        }
        return w(a(), uVar.j(this, j8));
    }

    private Object writeReplace() {
        return new G((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f37046a);
        objectOutput.writeObject(this.f37047b);
        objectOutput.writeObject(this.f37048c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC5891k) && AbstractC5889i.d(this, (InterfaceC5891k) obj) == 0;
    }

    public final int hashCode() {
        return (this.f37046a.hashCode() ^ this.f37047b.hashCode()) ^ Integer.rotateLeft(this.f37048c.hashCode(), 3);
    }

    public final String toString() {
        String c5887g = this.f37046a.toString();
        ZoneOffset zoneOffset = this.f37047b;
        String str = c5887g + zoneOffset.toString();
        j$.time.w wVar = this.f37048c;
        if (zoneOffset == wVar) {
            return str;
        }
        return str + "[" + wVar.toString() + "]";
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return w(a(), hVar.w(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return w(a(), j$.time.temporal.n.b(this, j8, bVar));
    }
}
