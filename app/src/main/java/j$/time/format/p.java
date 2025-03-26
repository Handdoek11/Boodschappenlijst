package j$.time.format;

import j$.time.chrono.InterfaceC5882b;
import j$.time.w;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes3.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private j$.time.temporal.o f37122a;

    /* renamed from: b, reason: collision with root package name */
    private DateTimeFormatter f37123b;

    /* renamed from: c, reason: collision with root package name */
    private int f37124c;

    p(j$.time.temporal.o oVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.n b8 = dateTimeFormatter.b();
        if (b8 != null) {
            j$.time.chrono.n nVar = (j$.time.chrono.n) oVar.v(j$.time.temporal.n.e());
            w wVar = (w) oVar.v(j$.time.temporal.n.k());
            InterfaceC5882b interfaceC5882b = null;
            b8 = Objects.equals(b8, nVar) ? null : b8;
            Objects.equals(null, wVar);
            if (b8 != null) {
                j$.time.chrono.n nVar2 = b8 != null ? b8 : nVar;
                if (b8 != null) {
                    if (oVar.f(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC5882b = nVar2.l(oVar);
                    } else if (b8 != j$.time.chrono.u.f37068d || nVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.v() && oVar.f(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + b8 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + oVar);
                            }
                        }
                    }
                }
                oVar = new o(interfaceC5882b, oVar, nVar2, wVar);
            }
        }
        this.f37122a = oVar;
        this.f37123b = dateTimeFormatter;
    }

    final j$.time.temporal.o d() {
        return this.f37122a;
    }

    final Locale c() {
        return this.f37123b.d();
    }

    final s b() {
        return this.f37123b.c();
    }

    final void g() {
        this.f37124c++;
    }

    final void a() {
        this.f37124c--;
    }

    final Object f(a aVar) {
        j$.time.temporal.o oVar = this.f37122a;
        Object v7 = oVar.v(aVar);
        if (v7 != null || this.f37124c != 0) {
            return v7;
        }
        throw new j$.time.c("Unable to extract " + aVar + " from temporal " + oVar);
    }

    final Long e(j$.time.temporal.r rVar) {
        int i8 = this.f37124c;
        j$.time.temporal.o oVar = this.f37122a;
        if (i8 <= 0 || oVar.f(rVar)) {
            return Long.valueOf(oVar.s(rVar));
        }
        return null;
    }

    public final String toString() {
        return this.f37122a.toString();
    }
}
