package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes3.dex */
public final class s extends AbstractC5884d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a, reason: collision with root package name */
    private final transient q f37063a;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f37064b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f37065c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f37066d;

    @Override // j$.time.chrono.InterfaceC5882b
    public final n a() {
        return this.f37063a;
    }

    static s K(q qVar, int i8, int i9, int i10) {
        return new s(qVar, i8, i9, i10);
    }

    static s L(q qVar, long j8) {
        return new s(qVar, j8);
    }

    private s(q qVar, int i8, int i9, int i10) {
        qVar.w(i8, i9, i10);
        this.f37063a = qVar;
        this.f37064b = i8;
        this.f37065c = i9;
        this.f37066d = i10;
    }

    private s(q qVar, long j8) {
        int[] C7 = qVar.C((int) j8);
        this.f37063a = qVar;
        this.f37064b = C7[0];
        this.f37065c = C7[1];
        this.f37066d = C7[2];
    }

    @Override // j$.time.chrono.AbstractC5884d
    public final o D() {
        return t.AH;
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.s(this);
        }
        if (!AbstractC5889i.h(this, rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = r.f37062a[aVar.ordinal()];
        int i9 = this.f37064b;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? this.f37063a.G(aVar) : j$.time.temporal.w.j(1L, 5L) : j$.time.temporal.w.j(1L, r3.E(i9)) : j$.time.temporal.w.j(1L, r3.D(i9, this.f37065c));
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i8 = r.f37062a[((j$.time.temporal.a) rVar).ordinal()];
        int i9 = this.f37065c;
        int i10 = this.f37066d;
        int i11 = this.f37064b;
        switch (i8) {
            case 1:
                return i10;
            case 2:
                return J();
            case 3:
                return ((i10 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.h(t() + 3, 7)) + 1;
            case 5:
                return ((i10 - 1) % 7) + 1;
            case 6:
                return ((J() - 1) % 7) + 1;
            case 7:
                return t();
            case 8:
                return ((J() - 1) / 7) + 1;
            case 9:
                return i9;
            case 10:
                return ((i11 * 12) + i9) - 1;
            case 11:
                return i11;
            case 12:
                return i11;
            case 13:
                return i11 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final s d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (s) super.d(j8, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        q qVar = this.f37063a;
        qVar.G(aVar).b(j8, aVar);
        int i8 = (int) j8;
        int i9 = r.f37062a[aVar.ordinal()];
        int i10 = this.f37066d;
        int i11 = this.f37065c;
        int i12 = this.f37064b;
        switch (i9) {
            case 1:
                return O(i12, i11, i8);
            case 2:
                return F(Math.min(i8, qVar.E(i12)) - J());
            case 3:
                return F((j8 - s(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return F(j8 - (((int) j$.com.android.tools.r8.a.h(t() + 3, 7)) + 1));
            case 5:
                return F(j8 - s(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return F(j8 - s(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new s(qVar, j8);
            case 8:
                return F((j8 - s(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return O(i12, i8, i10);
            case 10:
                return G(j8 - (((i12 * 12) + i11) - 1));
            case 11:
                if (i12 < 1) {
                    i8 = 1 - i8;
                }
                return O(i8, i11, i10);
            case 12:
                return O(i8, i11, i10);
            case 13:
                return O(1 - i12, i11, i10);
            default:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    private s O(int i8, int i9, int i10) {
        q qVar = this.f37063a;
        int D7 = qVar.D(i8, i9);
        if (i10 > D7) {
            i10 = D7;
        }
        return new s(qVar, i8, i9, i10);
    }

    @Override // j$.time.chrono.AbstractC5884d
    /* renamed from: I */
    public final InterfaceC5882b m(j$.time.temporal.p pVar) {
        return (s) super.m(pVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (s) super.m(hVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b
    public final long t() {
        return this.f37063a.w(this.f37064b, this.f37065c, this.f37066d);
    }

    private int J() {
        return this.f37063a.v(this.f37064b, this.f37065c) + this.f37066d;
    }

    @Override // j$.time.chrono.AbstractC5884d
    final InterfaceC5882b H(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = this.f37064b + ((int) j8);
        int i8 = (int) j9;
        if (j9 == i8) {
            return O(i8, this.f37065c, this.f37066d);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC5884d
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final s G(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = (this.f37064b * 12) + (this.f37065c - 1) + j8;
        return O(this.f37063a.n(j$.com.android.tools.r8.a.i(j9, 12L)), ((int) j$.com.android.tools.r8.a.h(j9, 12L)) + 1, this.f37066d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC5884d
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final s F(long j8) {
        return new s(this.f37063a, t() + j8);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b, j$.time.temporal.m
    public final InterfaceC5882b e(long j8, j$.time.temporal.u uVar) {
        return (s) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j8, j$.time.temporal.u uVar) {
        return (s) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC5884d
    /* renamed from: E */
    public final InterfaceC5882b j(long j8, j$.time.temporal.u uVar) {
        return (s) super.j(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return (s) super.j(j8, bVar);
    }

    @Override // j$.time.chrono.AbstractC5884d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f37064b == sVar.f37064b && this.f37065c == sVar.f37065c && this.f37066d == sVar.f37066d && this.f37063a.equals(sVar.f37063a);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b
    public final int hashCode() {
        int hashCode = this.f37063a.i().hashCode();
        int i8 = this.f37064b;
        return (hashCode ^ (i8 & (-2048))) ^ (((i8 << 11) + (this.f37065c << 6)) + this.f37066d);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b
    public final InterfaceC5885e u(j$.time.k kVar) {
        return C5887g.D(this, kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f37063a);
        objectOutput.writeInt(j$.time.temporal.n.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }
}
