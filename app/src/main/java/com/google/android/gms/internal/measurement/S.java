package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class S extends A {
    protected S() {
        this.f28788a.add(Z.ADD);
        this.f28788a.add(Z.DIVIDE);
        this.f28788a.add(Z.MODULUS);
        this.f28788a.add(Z.MULTIPLY);
        this.f28788a.add(Z.NEGATE);
        this.f28788a.add(Z.POST_DECREMENT);
        this.f28788a.add(Z.POST_INCREMENT);
        this.f28788a.add(Z.PRE_DECREMENT);
        this.f28788a.add(Z.PRE_INCREMENT);
        this.f28788a.add(Z.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC5013s b(String str, Z2 z22, List list) {
        switch (V.f29036a[AbstractC5048w2.c(str).ordinal()]) {
            case 1:
                AbstractC5048w2.f(Z.ADD, 2, list);
                InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(0));
                InterfaceC5013s b9 = z22.b((InterfaceC5013s) list.get(1));
                if (!(b8 instanceof InterfaceC4966m) && !(b8 instanceof C5029u) && !(b9 instanceof InterfaceC4966m) && !(b9 instanceof C5029u)) {
                    return new C4950k(Double.valueOf(b8.b().doubleValue() + b9.b().doubleValue()));
                }
                return new C5029u(b8.c() + b9.c());
            case 2:
                AbstractC5048w2.f(Z.DIVIDE, 2, list);
                return new C4950k(Double.valueOf(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue() / z22.b((InterfaceC5013s) list.get(1)).b().doubleValue()));
            case 3:
                AbstractC5048w2.f(Z.MODULUS, 2, list);
                return new C4950k(Double.valueOf(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue() % z22.b((InterfaceC5013s) list.get(1)).b().doubleValue()));
            case 4:
                AbstractC5048w2.f(Z.MULTIPLY, 2, list);
                return new C4950k(Double.valueOf(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue() * z22.b((InterfaceC5013s) list.get(1)).b().doubleValue()));
            case 5:
                AbstractC5048w2.f(Z.NEGATE, 1, list);
                return new C4950k(Double.valueOf(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                AbstractC5048w2.g(str, 2, list);
                InterfaceC5013s b10 = z22.b((InterfaceC5013s) list.get(0));
                z22.b((InterfaceC5013s) list.get(1));
                return b10;
            case 8:
            case 9:
                AbstractC5048w2.g(str, 1, list);
                return z22.b((InterfaceC5013s) list.get(0));
            case 10:
                AbstractC5048w2.f(Z.SUBTRACT, 2, list);
                return new C4950k(Double.valueOf(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue() + new C4950k(Double.valueOf(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue() * (-1.0d))).b().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
