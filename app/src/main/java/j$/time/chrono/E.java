package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class E extends AbstractC5884d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f37023a;

    E(j$.time.h hVar) {
        Objects.requireNonNull(hVar, "isoDate");
        this.f37023a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC5882b
    public final n a() {
        return C.f37021d;
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b
    public final int hashCode() {
        C.f37021d.getClass();
        return this.f37023a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC5884d
    public final o D() {
        return J() >= 1 ? F.ROC : F.BEFORE_ROC;
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
        int i8 = D.f37022a[aVar.ordinal()];
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            return this.f37023a.n(rVar);
        }
        if (i8 != 4) {
            return C.f37021d.m(aVar);
        }
        j$.time.temporal.w j8 = j$.time.temporal.a.YEAR.j();
        return j$.time.temporal.w.j(1L, J() <= 0 ? (-j8.e()) + 1912 : j8.d() - 1911);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i8 = D.f37022a[((j$.time.temporal.a) rVar).ordinal()];
            if (i8 == 4) {
                int J7 = J();
                if (J7 < 1) {
                    J7 = 1 - J7;
                }
                return J7;
            }
            j$.time.h hVar = this.f37023a;
            if (i8 == 5) {
                return ((J() * 12) + hVar.I()) - 1;
            }
            if (i8 == 6) {
                return J();
            }
            if (i8 != 7) {
                return hVar.s(rVar);
            }
            return J() < 1 ? 0 : 1;
        }
        return rVar.k(this);
    }

    private int J() {
        return this.f37023a.J() - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.E d(long r9, j$.time.temporal.r r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L99
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.s(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.D.f37022a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.h r3 = r8.f37023a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4b
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            goto L61
        L27:
            j$.time.chrono.C r11 = j$.time.chrono.C.f37021d
            j$.time.temporal.w r11 = r11.m(r0)
            r11.b(r9, r0)
            int r11 = r8.J()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.I()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.h r9 = r3.S(r9)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L4b:
            j$.time.chrono.C r2 = j$.time.chrono.C.f37021d
            j$.time.temporal.w r2 = r2.m(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L84
            if (r0 == r5) goto L79
            if (r0 == r4) goto L6a
        L61:
            j$.time.h r9 = r3.d(r9, r11)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L6a:
            int r9 = r8.J()
            int r9 = 1912 - r9
            j$.time.h r9 = r3.Y(r9)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L79:
            int r2 = r2 + 1911
            j$.time.h r9 = r3.Y(r2)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L84:
            int r9 = r8.J()
            r10 = 1
            if (r9 < r10) goto L8e
            int r2 = r2 + 1911
            goto L90
        L8e:
            int r2 = 1912 - r2
        L90:
            j$.time.h r9 = r3.Y(r2)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L99:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.E r9 = (j$.time.chrono.E) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.E.d(long, j$.time.temporal.r):j$.time.chrono.E");
    }

    @Override // j$.time.chrono.AbstractC5884d
    /* renamed from: I */
    public final InterfaceC5882b m(j$.time.temporal.p pVar) {
        return (E) super.m(pVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (E) super.m(hVar);
    }

    @Override // j$.time.chrono.AbstractC5884d
    final InterfaceC5882b H(long j8) {
        return L(this.f37023a.T(j8));
    }

    @Override // j$.time.chrono.AbstractC5884d
    final InterfaceC5882b G(long j8) {
        return L(this.f37023a.S(j8));
    }

    @Override // j$.time.chrono.AbstractC5884d
    final InterfaceC5882b F(long j8) {
        return L(this.f37023a.R(j8));
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b, j$.time.temporal.m
    public final InterfaceC5882b e(long j8, j$.time.temporal.u uVar) {
        return (E) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j8, j$.time.temporal.u uVar) {
        return (E) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC5884d
    /* renamed from: E */
    public final InterfaceC5882b j(long j8, j$.time.temporal.u uVar) {
        return (E) super.j(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j8, j$.time.temporal.b bVar) {
        return (E) super.j(j8, bVar);
    }

    private E L(j$.time.h hVar) {
        return hVar.equals(this.f37023a) ? this : new E(hVar);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b
    public final long t() {
        return this.f37023a.t();
    }

    @Override // j$.time.chrono.AbstractC5884d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            return this.f37023a.equals(((E) obj).f37023a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC5884d, j$.time.chrono.InterfaceC5882b
    public final InterfaceC5885e u(j$.time.k kVar) {
        return C5887g.D(this, kVar);
    }
}
