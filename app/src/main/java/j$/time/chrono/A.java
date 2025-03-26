package j$.time.chrono;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class A implements o, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final A f37015d;

    /* renamed from: e, reason: collision with root package name */
    private static final A[] f37016e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a, reason: collision with root package name */
    private final transient int f37017a;

    /* renamed from: b, reason: collision with root package name */
    private final transient j$.time.h f37018b;

    /* renamed from: c, reason: collision with root package name */
    private final transient String f37019c;

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC5889i.i(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int k(j$.time.temporal.r rVar) {
        return AbstractC5889i.f(this, (j$.time.temporal.a) rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ long s(j$.time.temporal.r rVar) {
        return AbstractC5889i.g(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object v(j$.time.temporal.t tVar) {
        return AbstractC5889i.m(this, tVar);
    }

    static {
        A a8 = new A(-1, j$.time.h.N(1868, 1, 1), "Meiji");
        f37015d = a8;
        f37016e = new A[]{a8, new A(0, j$.time.h.N(1912, 7, 30), "Taisho"), new A(1, j$.time.h.N(1926, 12, 25), "Showa"), new A(2, j$.time.h.N(1989, 1, 8), "Heisei"), new A(3, j$.time.h.N(2019, 5, 1), "Reiwa")};
    }

    static A l() {
        return f37016e[r0.length - 1];
    }

    static long D() {
        int J7 = 1000000000 - l().f37018b.J();
        A[] aArr = f37016e;
        int J8 = aArr[0].f37018b.J();
        for (int i8 = 1; i8 < aArr.length; i8++) {
            A a8 = aArr[i8];
            J7 = Math.min(J7, (a8.f37018b.J() - J8) + 1);
            J8 = a8.f37018b.J();
        }
        return J7;
    }

    static long C() {
        long f8 = j$.time.temporal.a.DAY_OF_YEAR.j().f();
        for (A a8 : f37016e) {
            f8 = Math.min(f8, ((a8.f37018b.L() ? 366 : 365) - a8.f37018b.H()) + 1);
            if (a8.r() != null) {
                f8 = Math.min(f8, a8.r().f37018b.H() - 1);
            }
        }
        return f8;
    }

    private A(int i8, j$.time.h hVar, String str) {
        this.f37017a = i8;
        this.f37018b = hVar;
        this.f37019c = str;
    }

    final j$.time.h o() {
        return this.f37018b;
    }

    public static A A(int i8) {
        int i9 = i8 + 1;
        if (i9 >= 0) {
            A[] aArr = f37016e;
            if (i9 < aArr.length) {
                return aArr[i9];
            }
        }
        throw new j$.time.c("Invalid era: " + i8);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }

    static A i(j$.time.h hVar) {
        if (hVar.K(z.f37073d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        A[] aArr = f37016e;
        for (int length = aArr.length - 1; length >= 0; length--) {
            A a8 = aArr[length];
            if (hVar.compareTo(a8.f37018b) >= 0) {
                return a8;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return this.f37017a;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (rVar != aVar) {
            return j$.time.temporal.n.d(this, rVar);
        }
        return x.f37071d.m(aVar);
    }

    final A r() {
        if (this == l()) {
            return null;
        }
        return A(this.f37017a + 1);
    }

    public final String toString() {
        return this.f37019c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 5, this);
    }

    final void E(DataOutput dataOutput) {
        dataOutput.writeByte(this.f37017a);
    }
}
