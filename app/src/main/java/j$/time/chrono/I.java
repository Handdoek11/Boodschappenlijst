package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class I extends AbstractC5881a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final I f37028d = new I();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.n
    public final o A(int i8) {
        if (i8 == 0) {
            return L.BEFORE_BE;
        }
        if (i8 == 1) {
            return L.BE;
        }
        throw new j$.time.c("Invalid era: " + i8);
    }

    private I() {
    }

    @Override // j$.time.chrono.n
    public final String i() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.n
    public final String r() {
        return "buddhist";
    }

    @Override // j$.time.chrono.n
    public final InterfaceC5882b l(j$.time.temporal.o oVar) {
        if (oVar instanceof K) {
            return (K) oVar;
        }
        return new K(j$.time.h.E(oVar));
    }

    public final j$.time.temporal.w m(j$.time.temporal.a aVar) {
        int i8 = H.f37027a[aVar.ordinal()];
        if (i8 == 1) {
            j$.time.temporal.w j8 = j$.time.temporal.a.PROLEPTIC_MONTH.j();
            return j$.time.temporal.w.j(j8.e() + 6516, j8.d() + 6516);
        }
        if (i8 == 2) {
            j$.time.temporal.w j9 = j$.time.temporal.a.YEAR.j();
            return j$.time.temporal.w.k((-(j9.e() + 543)) + 1, j9.d() + 543);
        }
        if (i8 == 3) {
            j$.time.temporal.w j10 = j$.time.temporal.a.YEAR.j();
            return j$.time.temporal.w.j(j10.e() + 543, j10.d() + 543);
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
