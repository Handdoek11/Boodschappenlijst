package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5061y extends A {
    public C5061y() {
        this.f28788a.add(Z.BITWISE_AND);
        this.f28788a.add(Z.BITWISE_LEFT_SHIFT);
        this.f28788a.add(Z.BITWISE_NOT);
        this.f28788a.add(Z.BITWISE_OR);
        this.f28788a.add(Z.BITWISE_RIGHT_SHIFT);
        this.f28788a.add(Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f28788a.add(Z.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC5013s b(String str, Z2 z22, List list) {
        switch (B.f28799a[AbstractC5048w2.c(str).ordinal()]) {
            case 1:
                AbstractC5048w2.f(Z.BITWISE_AND, 2, list);
                return new C4950k(Double.valueOf(AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue()) & AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue())));
            case 2:
                AbstractC5048w2.f(Z.BITWISE_LEFT_SHIFT, 2, list);
                return new C4950k(Double.valueOf(AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue()) << ((int) (AbstractC5048w2.m(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue()) & 31))));
            case 3:
                AbstractC5048w2.f(Z.BITWISE_NOT, 1, list);
                return new C4950k(Double.valueOf(~AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue())));
            case 4:
                AbstractC5048w2.f(Z.BITWISE_OR, 2, list);
                return new C4950k(Double.valueOf(AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue()) | AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue())));
            case 5:
                AbstractC5048w2.f(Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new C4950k(Double.valueOf(AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue()) >> ((int) (AbstractC5048w2.m(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue()) & 31))));
            case 6:
                AbstractC5048w2.f(Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new C4950k(Double.valueOf(AbstractC5048w2.m(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue()) >>> ((int) (AbstractC5048w2.m(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue()) & 31))));
            case 7:
                AbstractC5048w2.f(Z.BITWISE_XOR, 2, list);
                return new C4950k(Double.valueOf(AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue()) ^ AbstractC5048w2.i(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
