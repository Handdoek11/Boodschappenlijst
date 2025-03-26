package j$.time.temporal;

import j$.time.ZoneOffset;

/* loaded from: classes3.dex */
final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37192a;

    public /* synthetic */ s(int i8) {
        this.f37192a = i8;
    }

    @Override // j$.time.temporal.t
    public final Object a(o oVar) {
        switch (this.f37192a) {
            case 0:
                return (j$.time.w) oVar.v(n.f37183a);
            case 1:
                return (j$.time.chrono.n) oVar.v(n.f37184b);
            case 2:
                return (u) oVar.v(n.f37185c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (oVar.f(aVar)) {
                    return ZoneOffset.L(oVar.k(aVar));
                }
                return null;
            case 4:
                j$.time.w wVar = (j$.time.w) oVar.v(n.f37183a);
                return wVar != null ? wVar : (j$.time.w) oVar.v(n.f37186d);
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (oVar.f(aVar2)) {
                    return j$.time.h.P(oVar.s(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (oVar.f(aVar3)) {
                    return j$.time.k.K(oVar.s(aVar3));
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f37192a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
