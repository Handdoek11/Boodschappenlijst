package j$.time;

import j$.time.chrono.AbstractC5889i;
import j$.time.chrono.InterfaceC5882b;
import j$.time.chrono.InterfaceC5885e;
import j$.time.chrono.InterfaceC5891k;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.p, InterfaceC5885e, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f37000c = K(h.f37132d, k.f37140e);

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f37001d = K(h.f37133e, k.f37141f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a, reason: collision with root package name */
    private final h f37002a;

    /* renamed from: b, reason: collision with root package name */
    private final k f37003b;

    @Override // j$.time.chrono.InterfaceC5885e
    public final InterfaceC5882b c() {
        return this.f37002a;
    }

    @Override // j$.time.chrono.InterfaceC5885e
    public final j$.time.chrono.n a() {
        return ((h) c()).a();
    }

    @Override // j$.time.chrono.InterfaceC5885e
    public final InterfaceC5891k p(ZoneOffset zoneOffset) {
        return z.C(this, zoneOffset, null);
    }

    public static LocalDateTime J(int i8) {
        return new LocalDateTime(h.N(i8, 12, 31), k.J(0));
    }

    public static LocalDateTime K(h hVar, k kVar) {
        Objects.requireNonNull(hVar, "date");
        Objects.requireNonNull(kVar, "time");
        return new LocalDateTime(hVar, kVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(((h) c()).t(), j$.time.temporal.a.EPOCH_DAY).d(b().S(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime L(long j8, int i8, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j9 = i8;
        j$.time.temporal.a.NANO_OF_SECOND.C(j9);
        return new LocalDateTime(h.P(j$.com.android.tools.r8.a.i(j8 + zoneOffset.I(), 86400)), k.K((((int) j$.com.android.tools.r8.a.h(r5, r7)) * 1000000000) + j9));
    }

    public static LocalDateTime D(j$.time.temporal.o oVar) {
        if (oVar instanceof LocalDateTime) {
            return (LocalDateTime) oVar;
        }
        if (oVar instanceof z) {
            return ((z) oVar).F();
        }
        if (oVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) oVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(h.E(oVar), k.E(oVar));
        } catch (c e8) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName(), e8);
        }
    }

    private LocalDateTime(h hVar, k kVar) {
        this.f37002a = hVar;
        this.f37003b = kVar;
    }

    private LocalDateTime S(h hVar, k kVar) {
        return (this.f37002a == hVar && this.f37003b == kVar) ? this : new LocalDateTime(hVar, kVar);
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
            if (((j$.time.temporal.a) rVar).D()) {
                k kVar = this.f37003b;
                kVar.getClass();
                return j$.time.temporal.n.d(kVar, rVar);
            }
            return this.f37002a.n(rVar);
        }
        return rVar.s(this);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).D() ? this.f37003b.k(rVar) : this.f37002a.k(rVar);
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).D() ? this.f37003b.s(rVar) : this.f37002a.s(rVar);
        }
        return rVar.k(this);
    }

    private int C(LocalDateTime localDateTime) {
        int C7 = this.f37002a.C(localDateTime.f37002a);
        return C7 == 0 ? this.f37003b.compareTo(localDateTime.f37003b) : C7;
    }

    public final h P() {
        return this.f37002a;
    }

    public final int G() {
        return this.f37002a.J();
    }

    @Override // j$.time.chrono.InterfaceC5885e
    public final k b() {
        return this.f37003b;
    }

    public final int F() {
        return this.f37003b.I();
    }

    public final int E() {
        return this.f37003b.H();
    }

    public final LocalDateTime R(h hVar) {
        return S(hVar, this.f37003b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return S(hVar, this.f37003b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j8, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            boolean D7 = ((j$.time.temporal.a) rVar).D();
            k kVar = this.f37003b;
            h hVar = this.f37002a;
            if (D7) {
                return S(hVar, kVar.d(j8, rVar));
            }
            return S(hVar.d(j8, rVar), kVar);
        }
        return (LocalDateTime) rVar.n(this, j8);
    }

    @Override // j$.time.temporal.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j8, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            int i8 = i.f37137a[((j$.time.temporal.b) uVar).ordinal()];
            k kVar = this.f37003b;
            h hVar = this.f37002a;
            switch (i8) {
                case 1:
                    return O(this.f37002a, 0L, 0L, 0L, j8);
                case 2:
                    LocalDateTime S7 = S(hVar.R(j8 / 86400000000L), kVar);
                    return S7.O(S7.f37002a, 0L, 0L, 0L, (j8 % 86400000000L) * 1000);
                case 3:
                    LocalDateTime S8 = S(hVar.R(j8 / 86400000), kVar);
                    return S8.O(S8.f37002a, 0L, 0L, 0L, (j8 % 86400000) * 1000000);
                case 4:
                    return N(j8);
                case 5:
                    return O(this.f37002a, 0L, j8, 0L, 0L);
                case 6:
                    return O(this.f37002a, j8, 0L, 0L, 0L);
                case 7:
                    LocalDateTime S9 = S(hVar.R(j8 / 256), kVar);
                    return S9.O(S9.f37002a, (j8 % 256) * 12, 0L, 0L, 0L);
                default:
                    return S(hVar.e(j8, uVar), kVar);
            }
        }
        return (LocalDateTime) uVar.j(this, j8);
    }

    public final LocalDateTime N(long j8) {
        return O(this.f37002a, 0L, 0L, j8, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j8, bVar);
    }

    private LocalDateTime O(h hVar, long j8, long j9, long j10, long j11) {
        long j12 = j8 | j9 | j10 | j11;
        k kVar = this.f37003b;
        if (j12 == 0) {
            return S(hVar, kVar);
        }
        long j13 = j8 / 24;
        long j14 = j13 + (j9 / 1440) + (j10 / 86400) + (j11 / 86400000000000L);
        long j15 = 1;
        long j16 = ((j8 % 24) * 3600000000000L) + ((j9 % 1440) * 60000000000L) + ((j10 % 86400) * 1000000000) + (j11 % 86400000000000L);
        long S7 = kVar.S();
        long j17 = (j16 * j15) + S7;
        long i8 = j$.com.android.tools.r8.a.i(j17, 86400000000000L) + (j14 * j15);
        long h8 = j$.com.android.tools.r8.a.h(j17, 86400000000000L);
        if (h8 != S7) {
            kVar = k.K(h8);
        }
        return S(hVar.R(i8), kVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.f()) {
            return this.f37002a;
        }
        return AbstractC5889i.k(this, tVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC5885e interfaceC5885e) {
        if (interfaceC5885e instanceof LocalDateTime) {
            return C((LocalDateTime) interfaceC5885e);
        }
        return AbstractC5889i.c(this, interfaceC5885e);
    }

    public final boolean H(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return C(localDateTime) > 0;
        }
        long t7 = this.f37002a.t();
        long t8 = localDateTime.f37002a.t();
        return t7 > t8 || (t7 == t8 && this.f37003b.S() > localDateTime.f37003b.S());
    }

    public final boolean I(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return C(localDateTime) < 0;
        }
        long t7 = this.f37002a.t();
        long t8 = localDateTime.f37002a.t();
        return t7 < t8 || (t7 == t8 && this.f37003b.S() < localDateTime.f37003b.S());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f37002a.equals(localDateTime.f37002a) && this.f37003b.equals(localDateTime.f37003b);
    }

    public final int hashCode() {
        return this.f37002a.hashCode() ^ this.f37003b.hashCode();
    }

    public final String toString() {
        return this.f37002a.toString() + "T" + this.f37003b.toString();
    }

    private Object writeReplace() {
        return new s((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void T(DataOutput dataOutput) {
        this.f37002a.Z(dataOutput);
        this.f37003b.W(dataOutput);
    }
}
