package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class C extends AbstractC5881a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C f37021d = new C();
    private static final long serialVersionUID = 1039765215346859963L;

    private C() {
    }

    @Override // j$.time.chrono.n
    public final String i() {
        return "Minguo";
    }

    @Override // j$.time.chrono.n
    public final o A(int i8) {
        if (i8 == 0) {
            return F.BEFORE_ROC;
        }
        if (i8 == 1) {
            return F.ROC;
        }
        throw new j$.time.c("Invalid era: " + i8);
    }

    @Override // j$.time.chrono.n
    public final String r() {
        return "roc";
    }

    @Override // j$.time.chrono.n
    public final InterfaceC5882b l(j$.time.temporal.o oVar) {
        if (oVar instanceof E) {
            return (E) oVar;
        }
        return new E(j$.time.h.E(oVar));
    }

    public final j$.time.temporal.w m(j$.time.temporal.a aVar) {
        int i8 = B.f37020a[aVar.ordinal()];
        if (i8 == 1) {
            j$.time.temporal.w j8 = j$.time.temporal.a.PROLEPTIC_MONTH.j();
            return j$.time.temporal.w.j(j8.e() - 22932, j8.d() - 22932);
        }
        if (i8 == 2) {
            j$.time.temporal.w j9 = j$.time.temporal.a.YEAR.j();
            return j$.time.temporal.w.k(j9.d() - 1911, (-j9.e()) + 1912);
        }
        if (i8 == 3) {
            j$.time.temporal.w j10 = j$.time.temporal.a.YEAR.j();
            return j$.time.temporal.w.j(j10.e() - 1911, j10.d() - 1911);
        }
        return aVar.j();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
