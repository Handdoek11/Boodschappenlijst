package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5887g implements InterfaceC5885e, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a, reason: collision with root package name */
    private final transient InterfaceC5882b f37037a;

    /* renamed from: b, reason: collision with root package name */
    private final transient j$.time.k f37038b;

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object v(j$.time.temporal.t tVar) {
        return AbstractC5889i.k(this, tVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: x */
    public final /* synthetic */ int compareTo(InterfaceC5885e interfaceC5885e) {
        return AbstractC5889i.c(this, interfaceC5885e);
    }

    static C5887g D(InterfaceC5882b interfaceC5882b, j$.time.k kVar) {
        return new C5887g(interfaceC5882b, kVar);
    }

    static C5887g C(n nVar, j$.time.temporal.m mVar) {
        C5887g c5887g = (C5887g) mVar;
        if (nVar.equals(c5887g.f37037a.a())) {
            return c5887g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + nVar.i() + ", actual: " + c5887g.f37037a.a().i());
    }

    @Override // j$.time.chrono.InterfaceC5885e
    public final n a() {
        return this.f37037a.a();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return C(this.f37037a.a(), j$.time.temporal.n.b(this, j8, bVar));
    }

    private C5887g(InterfaceC5882b interfaceC5882b, j$.time.k kVar) {
        Objects.requireNonNull(interfaceC5882b, "date");
        Objects.requireNonNull(kVar, "time");
        this.f37037a = interfaceC5882b;
        this.f37038b = kVar;
    }

    private C5887g I(j$.time.temporal.m mVar, j$.time.k kVar) {
        InterfaceC5882b interfaceC5882b = this.f37037a;
        return (interfaceC5882b == mVar && this.f37038b == kVar) ? this : new C5887g(AbstractC5884d.C(interfaceC5882b.a(), mVar), kVar);
    }

    @Override // j$.time.chrono.InterfaceC5885e
    public final InterfaceC5882b c() {
        return this.f37037a;
    }

    @Override // j$.time.chrono.InterfaceC5885e
    public final j$.time.k b() {
        return this.f37038b;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.m(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.v() || aVar.D();
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) rVar).D()) {
                return this.f37037a.n(rVar);
            }
            j$.time.k kVar = this.f37038b;
            kVar.getClass();
            return j$.time.temporal.n.d(kVar, rVar);
        }
        return rVar.s(this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).D() ? this.f37038b.k(rVar) : this.f37037a.k(rVar);
        }
        return n(rVar).a(s(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).D() ? this.f37038b.s(rVar) : this.f37037a.s(rVar);
        }
        return rVar.k(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return I(hVar, this.f37038b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final C5887g d(long j8, j$.time.temporal.r rVar) {
        boolean z7 = rVar instanceof j$.time.temporal.a;
        InterfaceC5882b interfaceC5882b = this.f37037a;
        if (z7) {
            boolean D7 = ((j$.time.temporal.a) rVar).D();
            j$.time.k kVar = this.f37038b;
            if (D7) {
                return I(interfaceC5882b, kVar.d(j8, rVar));
            }
            return I(interfaceC5882b.d(j8, rVar), kVar);
        }
        return C(interfaceC5882b.a(), rVar.n(this, j8));
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final C5887g e(long j8, j$.time.temporal.u uVar) {
        boolean z7 = uVar instanceof j$.time.temporal.b;
        InterfaceC5882b interfaceC5882b = this.f37037a;
        if (z7) {
            int i8 = AbstractC5886f.f37036a[((j$.time.temporal.b) uVar).ordinal()];
            j$.time.k kVar = this.f37038b;
            switch (i8) {
                case 1:
                    return G(this.f37037a, 0L, 0L, 0L, j8);
                case 2:
                    C5887g I7 = I(interfaceC5882b.e(j8 / 86400000000L, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                    return I7.G(I7.f37037a, 0L, 0L, 0L, (j8 % 86400000000L) * 1000);
                case 3:
                    C5887g I8 = I(interfaceC5882b.e(j8 / 86400000, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                    return I8.G(I8.f37037a, 0L, 0L, 0L, (j8 % 86400000) * 1000000);
                case 4:
                    return F(j8);
                case 5:
                    return G(this.f37037a, 0L, j8, 0L, 0L);
                case 6:
                    return G(this.f37037a, j8, 0L, 0L, 0L);
                case 7:
                    C5887g I9 = I(interfaceC5882b.e(j8 / 256, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                    return I9.G(I9.f37037a, (j8 % 256) * 12, 0L, 0L, 0L);
                default:
                    return I(interfaceC5882b.e(j8, uVar), kVar);
            }
        }
        return C(interfaceC5882b.a(), uVar.j(this, j8));
    }

    final C5887g F(long j8) {
        return G(this.f37037a, 0L, 0L, j8, 0L);
    }

    private C5887g G(InterfaceC5882b interfaceC5882b, long j8, long j9, long j10, long j11) {
        long j12 = j8 | j9 | j10 | j11;
        j$.time.k kVar = this.f37038b;
        if (j12 == 0) {
            return I(interfaceC5882b, kVar);
        }
        long j13 = j9 / 1440;
        long j14 = j8 / 24;
        long j15 = (j9 % 1440) * 60000000000L;
        long j16 = ((j8 % 24) * 3600000000000L) + j15 + ((j10 % 86400) * 1000000000) + (j11 % 86400000000000L);
        long S7 = kVar.S();
        long j17 = j16 + S7;
        long i8 = j$.com.android.tools.r8.a.i(j17, 86400000000000L) + j14 + j13 + (j10 / 86400) + (j11 / 86400000000000L);
        long h8 = j$.com.android.tools.r8.a.h(j17, 86400000000000L);
        if (h8 != S7) {
            kVar = j$.time.k.K(h8);
        }
        return I(interfaceC5882b.e(i8, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
    }

    @Override // j$.time.chrono.InterfaceC5885e
    public final InterfaceC5891k p(ZoneOffset zoneOffset) {
        return m.C(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(c().t(), j$.time.temporal.a.EPOCH_DAY).d(b().S(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new G((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f37037a);
        objectOutput.writeObject(this.f37038b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC5885e) && AbstractC5889i.c(this, (InterfaceC5885e) obj) == 0;
    }

    public final int hashCode() {
        return this.f37037a.hashCode() ^ this.f37038b.hashCode();
    }

    public final String toString() {
        return this.f37037a.toString() + "T" + this.f37038b.toString();
    }
}
