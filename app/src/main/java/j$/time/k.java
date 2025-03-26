package j$.time;

import j$.time.chrono.AbstractC5889i;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class k implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final k f37140e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f37141f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f37142g;

    /* renamed from: h, reason: collision with root package name */
    private static final k[] f37143h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a, reason: collision with root package name */
    private final byte f37144a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f37145b;

    /* renamed from: c, reason: collision with root package name */
    private final byte f37146c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37147d;

    static {
        int i8 = 0;
        while (true) {
            k[] kVarArr = f37143h;
            if (i8 < kVarArr.length) {
                kVarArr[i8] = new k(i8, 0, 0, 0);
                i8++;
            } else {
                k kVar = kVarArr[0];
                f37142g = kVar;
                k kVar2 = kVarArr[12];
                f37140e = kVar;
                f37141f = new k(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static k J(int i8) {
        j$.time.temporal.a.HOUR_OF_DAY.C(i8);
        return f37143h[i8];
    }

    public static k L(long j8) {
        j$.time.temporal.a.SECOND_OF_DAY.C(j8);
        int i8 = (int) (j8 / 3600);
        long j9 = j8 - (i8 * 3600);
        return D(i8, (int) (j9 / 60), (int) (j9 - (r1 * 60)), 0);
    }

    public static k K(long j8) {
        j$.time.temporal.a.NANO_OF_DAY.C(j8);
        int i8 = (int) (j8 / 3600000000000L);
        long j9 = j8 - (i8 * 3600000000000L);
        int i9 = (int) (j9 / 60000000000L);
        long j10 = j9 - (i9 * 60000000000L);
        int i10 = (int) (j10 / 1000000000);
        return D(i8, i9, i10, (int) (j10 - (i10 * 1000000000)));
    }

    public static k E(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "temporal");
        k kVar = (k) oVar.v(j$.time.temporal.n.g());
        if (kVar != null) {
            return kVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName());
    }

    private static k D(int i8, int i9, int i10, int i11) {
        if ((i9 | i10 | i11) == 0) {
            return f37143h[i8];
        }
        return new k(i8, i9, i10, i11);
    }

    private k(int i8, int i9, int i10, int i11) {
        this.f37144a = (byte) i8;
        this.f37145b = (byte) i9;
        this.f37146c = (byte) i10;
        this.f37147d = i11;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).D();
        }
        return rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return F(rVar);
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.NANO_OF_DAY) {
                return S();
            }
            if (rVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return S() / 1000;
            }
            return F(rVar);
        }
        return rVar.k(this);
    }

    private int F(j$.time.temporal.r rVar) {
        int i8 = j.f37138a[((j$.time.temporal.a) rVar).ordinal()];
        byte b8 = this.f37145b;
        int i9 = this.f37147d;
        byte b9 = this.f37144a;
        switch (i8) {
            case 1:
                return i9;
            case 2:
                throw new j$.time.temporal.v("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i9 / 1000;
            case 4:
                throw new j$.time.temporal.v("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i9 / 1000000;
            case 6:
                return (int) (S() / 1000000);
            case 7:
                return this.f37146c;
            case 8:
                return T();
            case 9:
                return b8;
            case 10:
                return (b9 * 60) + b8;
            case 11:
                return b9 % 12;
            case 12:
                int i10 = b9 % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return b9;
            case 14:
                if (b9 == 0) {
                    return 24;
                }
                return b9;
            case 15:
                return b9 / 12;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final int G() {
        return this.f37144a;
    }

    public final int I() {
        return this.f37146c;
    }

    public final int H() {
        return this.f37147d;
    }

    @Override // j$.time.temporal.m
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final k d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (k) rVar.n(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.C(j8);
        int i8 = j.f37138a[aVar.ordinal()];
        byte b8 = this.f37145b;
        byte b9 = this.f37146c;
        int i9 = this.f37147d;
        byte b10 = this.f37144a;
        switch (i8) {
            case 1:
                return V((int) j8);
            case 2:
                return K(j8);
            case 3:
                return V(((int) j8) * 1000);
            case 4:
                return K(j8 * 1000);
            case 5:
                return V(((int) j8) * 1000000);
            case 6:
                return K(j8 * 1000000);
            case 7:
                int i10 = (int) j8;
                if (b9 == i10) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.C(i10);
                return D(b10, b8, i10, i9);
            case 8:
                return Q(j8 - T());
            case 9:
                int i11 = (int) j8;
                if (b8 == i11) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.C(i11);
                return D(b10, i11, b9, i9);
            case 10:
                return O(j8 - ((b10 * 60) + b8));
            case 11:
                return N(j8 - (b10 % 12));
            case 12:
                if (j8 == 12) {
                    j8 = 0;
                }
                return N(j8 - (b10 % 12));
            case 13:
                int i12 = (int) j8;
                if (b10 == i12) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.C(i12);
                return D(i12, b8, b9, i9);
            case 14:
                if (j8 == 24) {
                    j8 = 0;
                }
                int i13 = (int) j8;
                if (b10 == i13) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.C(i13);
                return D(i13, b8, b9, i9);
            case 15:
                return N((j8 - (b10 / 12)) * 12);
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final k V(int i8) {
        if (this.f37147d == i8) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.C(i8);
        return D(this.f37144a, this.f37145b, this.f37146c, i8);
    }

    @Override // j$.time.temporal.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final k e(long j8, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (j.f37139b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return P(j8);
                case 2:
                    return P((j8 % 86400000000L) * 1000);
                case 3:
                    return P((j8 % 86400000) * 1000000);
                case 4:
                    return Q(j8);
                case 5:
                    return O(j8);
                case 6:
                    return N(j8);
                case 7:
                    return N((j8 % 2) * 12);
                default:
                    throw new j$.time.temporal.v("Unsupported unit: " + uVar);
            }
        }
        return (k) uVar.j(this, j8);
    }

    public final k N(long j8) {
        if (j8 == 0) {
            return this;
        }
        return D(((((int) (j8 % 24)) + this.f37144a) + 24) % 24, this.f37145b, this.f37146c, this.f37147d);
    }

    public final k O(long j8) {
        if (j8 == 0) {
            return this;
        }
        int i8 = (this.f37144a * 60) + this.f37145b;
        int i9 = ((((int) (j8 % 1440)) + i8) + 1440) % 1440;
        return i8 == i9 ? this : D(i9 / 60, i9 % 60, this.f37146c, this.f37147d);
    }

    public final k Q(long j8) {
        if (j8 == 0) {
            return this;
        }
        int i8 = (this.f37145b * 60) + (this.f37144a * 3600) + this.f37146c;
        int i9 = ((((int) (j8 % 86400)) + i8) + 86400) % 86400;
        return i8 == i9 ? this : D(i9 / 3600, (i9 / 60) % 60, i9 % 60, this.f37147d);
    }

    public final k P(long j8) {
        if (j8 == 0) {
            return this;
        }
        long S7 = S();
        long j9 = (((j8 % 86400000000000L) + S7) + 86400000000000L) % 86400000000000L;
        return S7 == j9 ? this : D((int) (j9 / 3600000000000L), (int) ((j9 / 60000000000L) % 60), (int) ((j9 / 1000000000) % 60), (int) (j9 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j8, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return this;
        }
        if (tVar == j$.time.temporal.n.f()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(S(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int T() {
        return (this.f37145b * 60) + (this.f37144a * 3600) + this.f37146c;
    }

    public final long S() {
        return (this.f37146c * 1000000000) + (this.f37145b * 60000000000L) + (this.f37144a * 3600000000000L) + this.f37147d;
    }

    @Override // java.lang.Comparable
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        int compare = Integer.compare(this.f37144a, kVar.f37144a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f37145b, kVar.f37145b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f37146c, kVar.f37146c);
        return compare3 == 0 ? Integer.compare(this.f37147d, kVar.f37147d) : compare3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f37144a == kVar.f37144a && this.f37145b == kVar.f37145b && this.f37146c == kVar.f37146c && this.f37147d == kVar.f37147d;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(h hVar) {
        return (k) AbstractC5889i.a(hVar, this);
    }

    public final int hashCode() {
        long S7 = S();
        return (int) (S7 ^ (S7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b8 = this.f37144a;
        sb.append(b8 < 10 ? "0" : "");
        sb.append((int) b8);
        byte b9 = this.f37145b;
        sb.append(b9 < 10 ? ":0" : ":");
        sb.append((int) b9);
        byte b10 = this.f37146c;
        int i8 = this.f37147d;
        if (b10 > 0 || i8 > 0) {
            sb.append(b10 < 10 ? ":0" : ":");
            sb.append((int) b10);
            if (i8 > 0) {
                sb.append('.');
                if (i8 % 1000000 == 0) {
                    sb.append(Integer.toString((i8 / 1000000) + 1000).substring(1));
                } else if (i8 % 1000 == 0) {
                    sb.append(Integer.toString((i8 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i8 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void W(DataOutput dataOutput) {
        byte b8 = this.f37146c;
        byte b9 = this.f37144a;
        byte b10 = this.f37145b;
        int i8 = this.f37147d;
        if (i8 != 0) {
            dataOutput.writeByte(b9);
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b8);
            dataOutput.writeInt(i8);
            return;
        }
        if (b8 != 0) {
            dataOutput.writeByte(b9);
            dataOutput.writeByte(b10);
            dataOutput.writeByte(~b8);
        } else if (b10 == 0) {
            dataOutput.writeByte(~b9);
        } else {
            dataOutput.writeByte(b9);
            dataOutput.writeByte(~b10);
        }
    }

    static k R(ObjectInput objectInput) {
        int i8;
        int i9;
        int readByte = objectInput.readByte();
        int i10 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i8 = 0;
            i9 = 0;
        } else {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                int i11 = ~readByte2;
                i9 = 0;
                i10 = i11;
                i8 = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i8 = ~readByte3;
                } else {
                    i10 = objectInput.readInt();
                    i8 = readByte3;
                }
                i9 = i10;
                i10 = readByte2;
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.C(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.C(i10);
        j$.time.temporal.a.SECOND_OF_MINUTE.C(i8);
        j$.time.temporal.a.NANO_OF_SECOND.C(i9);
        return D(readByte, i10, i8, i9);
    }
}
