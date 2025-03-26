package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Q5 extends r {

    /* renamed from: s, reason: collision with root package name */
    private final C4887d f28999s;

    public Q5(C4887d c4887d) {
        this.f28999s = c4887d;
    }

    @Override // com.google.android.gms.internal.measurement.r, com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s j(String str, Z2 z22, List list) {
        str.hashCode();
        switch (str) {
            case "getEventName":
                AbstractC5048w2.g("getEventName", 0, list);
                return new C5029u(this.f28999s.d().e());
            case "getTimestamp":
                AbstractC5048w2.g("getTimestamp", 0, list);
                return new C4950k(Double.valueOf(this.f28999s.d().a()));
            case "getParamValue":
                AbstractC5048w2.g("getParamValue", 1, list);
                return AbstractC4865a4.b(this.f28999s.d().b(z22.b((InterfaceC5013s) list.get(0)).c()));
            case "getParams":
                AbstractC5048w2.g("getParams", 0, list);
                Map g8 = this.f28999s.d().g();
                r rVar = new r();
                for (String str2 : g8.keySet()) {
                    rVar.o(str2, AbstractC4865a4.b(g8.get(str2)));
                }
                return rVar;
            case "setParamValue":
                AbstractC5048w2.g("setParamValue", 2, list);
                String c8 = z22.b((InterfaceC5013s) list.get(0)).c();
                InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(1));
                this.f28999s.d().d(c8, AbstractC5048w2.d(b8));
                return b8;
            case "setEventName":
                AbstractC5048w2.g("setEventName", 1, list);
                InterfaceC5013s b9 = z22.b((InterfaceC5013s) list.get(0));
                if (InterfaceC5013s.f29548h.equals(b9) || InterfaceC5013s.f29549i.equals(b9)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.f28999s.d().f(b9.c());
                return new C5029u(b9.c());
            default:
                return super.j(str, z22, list);
        }
    }
}
