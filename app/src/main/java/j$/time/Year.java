package j$.time;

import j$.time.chrono.AbstractC5889i;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class Year implements j$.time.temporal.m, j$.time.temporal.p, Comparable<Year>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f37006b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37007a;

    @Override // java.lang.Comparable
    public final int compareTo(Year year) {
        return this.f37007a - year.f37007a;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.v();
    }

    public static Year now() {
        String id = TimeZone.getDefault().getID();
        Map map = w.f37201a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        Object obj = (String) map.get(id);
        if (obj == null) {
            obj = Objects.requireNonNull(id, "defaultObj");
        }
        a aVar = new a(w.D((String) obj, true));
        h hVar = h.f37132d;
        Objects.requireNonNull(aVar, "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        w a8 = aVar.a();
        Objects.requireNonNull(ofEpochMilli, "instant");
        Objects.requireNonNull(a8, "zone");
        return C(h.P(j$.com.android.tools.r8.a.i(ofEpochMilli.D() + a8.C().d(ofEpochMilli).I(), 86400)).J());
    }

    public static Year C(int i8) {
        j$.time.temporal.a.YEAR.C(i8);
        return new Year(i8);
    }

    private Year(int i8) {
        this.f37007a = i8;
    }

    public int getValue() {
        return this.f37007a;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f37007a <= 0 ? 1000000000L : 999999999L);
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
        int i8 = t.f37163a[((j$.time.temporal.a) rVar).ordinal()];
        int i9 = this.f37007a;
        if (i8 == 1) {
            if (i9 < 1) {
                i9 = 1 - i9;
            }
            return i9;
        }
        if (i8 == 2) {
            return i9;
        }
        if (i8 == 3) {
            return i9 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final Year d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (Year) rVar.n(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.C(j8);
        int i8 = t.f37163a[aVar.ordinal()];
        int i9 = this.f37007a;
        if (i8 == 1) {
            if (i9 < 1) {
                j8 = 1 - j8;
            }
            return C((int) j8);
        }
        if (i8 == 2) {
            return C((int) j8);
        }
        if (i8 == 3) {
            return s(j$.time.temporal.a.ERA) == j8 ? this : C(1 - i9);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Year e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (Year) uVar.j(this, j8);
        }
        int i8 = t.f37164b[((j$.time.temporal.b) uVar).ordinal()];
        if (i8 == 1) {
            return E(j8);
        }
        if (i8 == 2) {
            return E(j$.com.android.tools.r8.a.j(j8, 10));
        }
        if (i8 == 3) {
            return E(j$.com.android.tools.r8.a.j(j8, 100));
        }
        if (i8 == 4) {
            return E(j$.com.android.tools.r8.a.j(j8, 1000));
        }
        if (i8 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(j$.com.android.tools.r8.a.d(s(aVar), j8), aVar);
        }
        throw new j$.time.temporal.v("Unsupported unit: " + uVar);
    }

    public final Year E(long j8) {
        return j8 == 0 ? this : C(j$.time.temporal.a.YEAR.w(this.f37007a + j8));
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
            return j$.time.temporal.b.YEARS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!AbstractC5889i.p(mVar).equals(j$.time.chrono.u.f37068d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.d(this.f37007a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Year) {
            return this.f37007a == ((Year) obj).f37007a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37007a;
    }

    public final String toString() {
        return Integer.toString(this.f37007a);
    }

    private Object writeReplace() {
        return new s((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void G(DataOutput dataOutput) {
        dataOutput.writeInt(this.f37007a);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (Year) AbstractC5889i.a(hVar, this);
    }
}
