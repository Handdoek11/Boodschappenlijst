package j$.time;

import j$.time.chrono.AbstractC5889i;
import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.p, Comparable<Instant>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Instant f36997c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a, reason: collision with root package name */
    private final long f36998a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36999b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.f36998a, instant2.f36998a);
        return compare != 0 ? compare : this.f36999b - instant2.f36999b;
    }

    static {
        F(-31557014167219200L, 0L);
        F(31556889864403199L, 999999999L);
    }

    public static Instant F(long j8, long j9) {
        return C(j$.com.android.tools.r8.a.d(j8, j$.com.android.tools.r8.a.i(j9, 1000000000L)), (int) j$.com.android.tools.r8.a.h(j9, 1000000000L));
    }

    public static Instant ofEpochMilli(long j8) {
        long j9 = 1000;
        return C(j$.com.android.tools.r8.a.i(j8, j9), ((int) j$.com.android.tools.r8.a.h(j8, j9)) * 1000000);
    }

    private static Instant C(long j8, int i8) {
        if ((i8 | j8) == 0) {
            return f36997c;
        }
        if (j8 < -31557014167219200L || j8 > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j8, i8);
    }

    private Instant(long j8, int i8) {
        this.f36998a = j8;
        this.f36999b = i8;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.NANO_OF_SECOND || rVar == j$.time.temporal.a.MICRO_OF_SECOND || rVar == j$.time.temporal.a.MILLI_OF_SECOND : rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.d(this, rVar).a(rVar.k(this), rVar);
        }
        int i8 = f.f37079a[((j$.time.temporal.a) rVar).ordinal()];
        int i9 = this.f36999b;
        if (i8 == 1) {
            return i9;
        }
        if (i8 == 2) {
            return i9 / 1000;
        }
        if (i8 == 3) {
            return i9 / 1000000;
        }
        if (i8 == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.w(this.f36998a);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        int i8;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = f.f37079a[((j$.time.temporal.a) rVar).ordinal()];
        int i10 = this.f36999b;
        if (i9 == 1) {
            return i10;
        }
        if (i9 == 2) {
            i8 = i10 / 1000;
        } else {
            if (i9 != 3) {
                if (i9 == 4) {
                    return this.f36998a;
                }
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
            }
            i8 = i10 / 1000000;
        }
        return i8;
    }

    public final long D() {
        return this.f36998a;
    }

    public final int E() {
        return this.f36999b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (Instant) rVar.n(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.C(j8);
        int i8 = f.f37079a[aVar.ordinal()];
        int i9 = this.f36999b;
        long j9 = this.f36998a;
        if (i8 != 1) {
            if (i8 == 2) {
                int i10 = ((int) j8) * 1000;
                if (i10 != i9) {
                    return C(j9, i10);
                }
            } else if (i8 == 3) {
                int i11 = ((int) j8) * 1000000;
                if (i11 != i9) {
                    return C(j9, i11);
                }
            } else {
                if (i8 != 4) {
                    throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
                }
                if (j8 != j9) {
                    return C(j8, i9);
                }
            }
        } else if (j8 != i9) {
            return C(j9, (int) j8);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (Instant) uVar.j(this, j8);
        }
        switch (f.f37080b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return G(0L, j8);
            case 2:
                return G(j8 / 1000000, (j8 % 1000000) * 1000);
            case 3:
                return G(j8 / 1000, (j8 % 1000) * 1000000);
            case 4:
                return G(j8, 0L);
            case 5:
                return G(j$.com.android.tools.r8.a.j(j8, 60), 0L);
            case 6:
                return G(j$.com.android.tools.r8.a.j(j8, 3600), 0L);
            case 7:
                return G(j$.com.android.tools.r8.a.j(j8, 43200), 0L);
            case 8:
                return G(j$.com.android.tools.r8.a.j(j8, 86400), 0L);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    private Instant G(long j8, long j9) {
        if ((j8 | j9) == 0) {
            return this;
        }
        return F(j$.com.android.tools.r8.a.d(j$.com.android.tools.r8.a.d(this.f36998a, j8), j9 / 1000000000), this.f36999b + (j9 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j8, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.f() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(this.f36998a, j$.time.temporal.a.INSTANT_SECONDS).d(this.f36999b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.D(this, zoneOffset);
    }

    public final long I() {
        long j8 = this.f36998a;
        return (j8 >= 0 || this.f36999b <= 0) ? j$.com.android.tools.r8.a.d(j$.com.android.tools.r8.a.j(j8, 1000), r5 / 1000000) : j$.com.android.tools.r8.a.d(j$.com.android.tools.r8.a.j(j8 + 1, 1000), (r5 / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f36998a == instant.f36998a && this.f36999b == instant.f36999b;
    }

    public final int hashCode() {
        long j8 = this.f36998a;
        return (this.f36999b * 51) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f37081e.a(this);
    }

    private Object writeReplace() {
        return new s((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void J(DataOutput dataOutput) {
        dataOutput.writeLong(this.f36998a);
        dataOutput.writeInt(this.f36999b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (Instant) AbstractC5889i.a(hVar, this);
    }
}
