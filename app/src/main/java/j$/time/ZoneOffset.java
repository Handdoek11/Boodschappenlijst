package j$.time;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ZoneOffset extends w implements j$.time.temporal.o, j$.time.temporal.p, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b, reason: collision with root package name */
    private final int f37012b;

    /* renamed from: c, reason: collision with root package name */
    private final transient String f37013c;

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f37008d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f37009e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = L(0);

    /* renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f37010f = L(-64800);

    /* renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f37011g = L(64800);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.ZoneOffset J(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.requireNonNull(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.f37009e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r6, r2)
            int r2 = M(r7, r5, r2)
            goto L85
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r1, r3)
            int r2 = M(r7, r4, r3)
            goto L85
        L50:
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = M(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = K(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = K(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.J(java.lang.String):j$.time.ZoneOffset");
    }

    private static int M(String str, int i8, boolean z7) {
        if (z7 && str.charAt(i8 - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char charAt = str.charAt(i8);
        char charAt2 = str.charAt(i8 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset K(int i8, int i9, int i10) {
        if (i8 < -18 || i8 > 18) {
            throw new c("Zone offset hours not in valid range: value " + i8 + " is not in the range -18 to 18");
        }
        if (i8 > 0) {
            if (i9 < 0 || i10 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i8 < 0) {
            if (i9 > 0 || i10 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i9 > 0 && i10 < 0) || (i9 < 0 && i10 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i9 < -59 || i9 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i9 + " is not in the range -59 to 59");
        }
        if (i10 < -59 || i10 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i10 + " is not in the range -59 to 59");
        }
        if (Math.abs(i8) == 18 && (i9 | i10) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return L((i9 * 60) + (i8 * 3600) + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset L(int i8) {
        if (i8 < -64800 || i8 > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i8 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i8);
            ConcurrentHashMap concurrentHashMap = f37008d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i8));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            f37009e.putIfAbsent(zoneOffset2.f37013c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i8);
    }

    private ZoneOffset(int i8) {
        String sb;
        this.f37012b = i8;
        if (i8 == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i8);
            StringBuilder sb2 = new StringBuilder();
            int i9 = abs / 3600;
            int i10 = (abs / 60) % 60;
            sb2.append(i8 < 0 ? "-" : "+");
            sb2.append(i9 < 10 ? "0" : "");
            sb2.append(i9);
            sb2.append(i10 < 10 ? ":0" : ":");
            sb2.append(i10);
            int i11 = abs % 60;
            if (i11 != 0) {
                sb2.append(i11 < 10 ? ":0" : ":");
                sb2.append(i11);
            }
            sb = sb2.toString();
        }
        this.f37013c = sb;
    }

    public final int I() {
        return this.f37012b;
    }

    @Override // j$.time.w
    public final String i() {
        return this.f37013c;
    }

    @Override // j$.time.w
    public final j$.time.zone.f C() {
        return j$.time.zone.f.h(this);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f37012b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return j$.time.temporal.n.d(this, rVar).a(s(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f37012b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.k(this);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) ? this : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(this.f37012b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f37012b - this.f37012b;
    }

    @Override // j$.time.w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f37012b == ((ZoneOffset) obj).f37012b;
        }
        return false;
    }

    @Override // j$.time.w
    public final int hashCode() {
        return this.f37012b;
    }

    @Override // j$.time.w
    public final String toString() {
        return this.f37013c;
    }

    private Object writeReplace() {
        return new s((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.w
    final void G(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        O(objectOutput);
    }

    final void O(DataOutput dataOutput) {
        int i8 = this.f37012b;
        int i9 = i8 % 900 == 0 ? i8 / 900 : 127;
        dataOutput.writeByte(i9);
        if (i9 == 127) {
            dataOutput.writeInt(i8);
        }
    }

    static ZoneOffset N(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? L(objectInput.readInt()) : L(readByte * 900);
    }
}
