package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC5889i;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class f implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final long[] f37226i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    private static final e[] f37227j = new e[0];

    /* renamed from: k, reason: collision with root package name */
    private static final LocalDateTime[] f37228k = new LocalDateTime[0];

    /* renamed from: l, reason: collision with root package name */
    private static final b[] f37229l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a, reason: collision with root package name */
    private final long[] f37230a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset[] f37231b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f37232c;

    /* renamed from: d, reason: collision with root package name */
    private final LocalDateTime[] f37233d;

    /* renamed from: e, reason: collision with root package name */
    private final ZoneOffset[] f37234e;

    /* renamed from: f, reason: collision with root package name */
    private final e[] f37235f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeZone f37236g;

    /* renamed from: h, reason: collision with root package name */
    private final transient ConcurrentHashMap f37237h = new ConcurrentHashMap();

    public static f h(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new f(zoneOffset);
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f37230a = jArr;
        this.f37231b = zoneOffsetArr;
        this.f37232c = jArr2;
        this.f37234e = zoneOffsetArr2;
        this.f37235f = eVarArr;
        if (jArr2.length == 0) {
            this.f37233d = f37228k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i8 = 0;
            while (i8 < jArr2.length) {
                int i9 = i8 + 1;
                b bVar = new b(jArr2[i8], zoneOffsetArr2[i8], zoneOffsetArr2[i9]);
                if (bVar.w()) {
                    arrayList.add(bVar.k());
                    arrayList.add(bVar.j());
                } else {
                    arrayList.add(bVar.j());
                    arrayList.add(bVar.k());
                }
                i8 = i9;
            }
            this.f37233d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f37236g = null;
    }

    private f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f37231b = zoneOffsetArr;
        long[] jArr = f37226i;
        this.f37230a = jArr;
        this.f37232c = jArr;
        this.f37233d = f37228k;
        this.f37234e = zoneOffsetArr;
        this.f37235f = f37227j;
        this.f37236g = null;
    }

    f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.f37231b = zoneOffsetArr;
        long[] jArr = f37226i;
        this.f37230a = jArr;
        this.f37232c = jArr;
        this.f37233d = f37228k;
        this.f37234e = zoneOffsetArr;
        this.f37235f = f37227j;
        this.f37236g = timeZone;
    }

    private static ZoneOffset i(int i8) {
        return ZoneOffset.L(i8 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f37236g != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        long[] jArr = this.f37230a;
        objectOutput.writeInt(jArr.length);
        for (long j8 : jArr) {
            a.c(j8, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.f37231b) {
            a.d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.f37232c;
        objectOutput.writeInt(jArr2.length);
        for (long j9 : jArr2) {
            a.c(j9, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f37234e) {
            a.d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = this.f37235f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    final void k(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f37236g.getID());
    }

    static f j(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        long[] jArr = f37226i;
        long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            jArr2[i8] = a.a(objectInput);
        }
        int i9 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            zoneOffsetArr[i10] = a.b(objectInput);
        }
        int readInt2 = objectInput.readInt();
        if (readInt2 != 0) {
            jArr = new long[readInt2];
        }
        long[] jArr3 = jArr;
        for (int i11 = 0; i11 < readInt2; i11++) {
            jArr3[i11] = a.a(objectInput);
        }
        int i12 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            zoneOffsetArr2[i13] = a.b(objectInput);
        }
        int readByte = objectInput.readByte();
        e[] eVarArr = readByte == 0 ? f37227j : new e[readByte];
        for (int i14 = 0; i14 < readByte; i14++) {
            eVarArr[i14] = e.b(objectInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f37236g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.I()));
        }
        long[] jArr = this.f37232c;
        if (jArr.length == 0) {
            return this.f37231b[0];
        }
        long D7 = instant.D();
        int length = this.f37235f.length;
        ZoneOffset[] zoneOffsetArr = this.f37234e;
        if (length > 0 && D7 > jArr[jArr.length - 1]) {
            b[] b8 = b(c(D7, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i8 = 0; i8 < b8.length; i8++) {
                bVar = b8[i8];
                if (D7 < bVar.B()) {
                    return bVar.s();
                }
            }
            return bVar.n();
        }
        int binarySearch = Arrays.binarySearch(jArr, D7);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return zoneOffsetArr[binarySearch + 1];
    }

    public final List g(LocalDateTime localDateTime) {
        Object e8 = e(localDateTime);
        if (e8 instanceof b) {
            return ((b) e8).v();
        }
        return Collections.singletonList((ZoneOffset) e8);
    }

    public final b f(LocalDateTime localDateTime) {
        Object e8 = e(localDateTime);
        if (e8 instanceof b) {
            return (b) e8;
        }
        return null;
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f37231b;
        int i8 = 0;
        TimeZone timeZone = this.f37236g;
        if (timeZone != null) {
            b[] b8 = b(localDateTime.G());
            if (b8.length == 0) {
                return i(timeZone.getOffset(AbstractC5889i.n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = b8.length;
            while (i8 < length) {
                b bVar = b8[i8];
                Object a8 = a(localDateTime, bVar);
                if ((a8 instanceof b) || a8.equals(bVar.s())) {
                    return a8;
                }
                i8++;
                obj = a8;
            }
            return obj;
        }
        if (this.f37232c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f37235f.length;
        LocalDateTime[] localDateTimeArr = this.f37233d;
        if (length2 > 0 && localDateTime.H(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] b9 = b(localDateTime.G());
            int length3 = b9.length;
            while (i8 < length3) {
                b bVar2 = b9[i8];
                Object a9 = a(localDateTime, bVar2);
                if ((a9 instanceof b) || a9.equals(bVar2.s())) {
                    return a9;
                }
                i8++;
                obj = a9;
            }
            return obj;
        }
        int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.f37234e;
        if (binarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else if (binarySearch < localDateTimeArr.length - 1) {
            int i9 = binarySearch + 1;
            if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i9])) {
                binarySearch = i9;
            }
        }
        if ((binarySearch & 1) != 0) {
            return zoneOffsetArr2[(binarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
        int i10 = binarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i10];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i10 + 1];
        return zoneOffset2.I() > zoneOffset.I() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime k8 = bVar.k();
        if (bVar.w()) {
            if (localDateTime.I(k8)) {
                return bVar.s();
            }
            return localDateTime.I(bVar.j()) ? bVar : bVar.n();
        }
        if (localDateTime.I(k8)) {
            return localDateTime.I(bVar.j()) ? bVar.s() : bVar;
        }
        return bVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b[] b(int i8) {
        long j8;
        Integer valueOf = Integer.valueOf(i8);
        ConcurrentHashMap concurrentHashMap = this.f37237h;
        b[] bVarArr = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f37236g;
        if (timeZone == null) {
            e[] eVarArr = this.f37235f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i9 = 0; i9 < eVarArr.length; i9++) {
                bVarArr2[i9] = eVarArr[i9].a(i8);
            }
            if (i8 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = f37229l;
        if (i8 < 1800) {
            return bVarArr3;
        }
        long n8 = AbstractC5889i.n(LocalDateTime.J(i8 - 1), this.f37231b[0]);
        int offset = timeZone.getOffset(n8 * 1000);
        long j9 = 31968000 + n8;
        while (n8 < j9) {
            long j10 = 7776000 + n8;
            long j11 = n8;
            if (offset != timeZone.getOffset(j10 * 1000)) {
                n8 = j11;
                while (j10 - n8 > 1) {
                    int i10 = offset;
                    long j12 = j9;
                    long i11 = j$.com.android.tools.r8.a.i(j10 + n8, 2L);
                    if (timeZone.getOffset(i11 * 1000) == i10) {
                        n8 = i11;
                    } else {
                        j10 = i11;
                    }
                    offset = i10;
                    j9 = j12;
                }
                j8 = j9;
                int i12 = offset;
                if (timeZone.getOffset(n8 * 1000) == i12) {
                    n8 = j10;
                }
                ZoneOffset i13 = i(i12);
                offset = timeZone.getOffset(n8 * 1000);
                ZoneOffset i14 = i(offset);
                if (c(n8, i14) == i8) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(n8, i13, i14);
                }
            } else {
                j8 = j9;
                n8 = j10;
            }
            j9 = j8;
        }
        if (1916 <= i8 && i8 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j8, ZoneOffset zoneOffset) {
        return j$.time.h.P(j$.com.android.tools.r8.a.i(j8 + zoneOffset.I(), 86400)).J();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f37236g, fVar.f37236g) && Arrays.equals(this.f37230a, fVar.f37230a) && Arrays.equals(this.f37231b, fVar.f37231b) && Arrays.equals(this.f37232c, fVar.f37232c) && Arrays.equals(this.f37234e, fVar.f37234e) && Arrays.equals(this.f37235f, fVar.f37235f);
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f37236g) ^ Arrays.hashCode(this.f37230a)) ^ Arrays.hashCode(this.f37231b)) ^ Arrays.hashCode(this.f37232c)) ^ Arrays.hashCode(this.f37234e)) ^ Arrays.hashCode(this.f37235f);
    }

    public final String toString() {
        TimeZone timeZone = this.f37236g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f37231b[r1.length - 1] + "]";
    }
}
