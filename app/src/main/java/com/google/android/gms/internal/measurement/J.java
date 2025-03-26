package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class J extends A {
    protected J() {
        this.f28788a.add(Z.AND);
        this.f28788a.add(Z.NOT);
        this.f28788a.add(Z.OR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC5013s b(String str, Z2 z22, List list) {
        int i8 = M.f28938a[AbstractC5048w2.c(str).ordinal()];
        if (i8 == 1) {
            AbstractC5048w2.f(Z.AND, 2, list);
            InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(0));
            return !b8.d().booleanValue() ? b8 : z22.b((InterfaceC5013s) list.get(1));
        }
        if (i8 == 2) {
            AbstractC5048w2.f(Z.NOT, 1, list);
            return new C4923h(Boolean.valueOf(!z22.b((InterfaceC5013s) list.get(0)).d().booleanValue()));
        }
        if (i8 != 3) {
            return super.a(str);
        }
        AbstractC5048w2.f(Z.OR, 2, list);
        InterfaceC5013s b9 = z22.b((InterfaceC5013s) list.get(0));
        return b9.d().booleanValue() ? b9 : z22.b((InterfaceC5013s) list.get(1));
    }
}
