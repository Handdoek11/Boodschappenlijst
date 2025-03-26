package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class L extends A {
    protected L() {
        this.f28788a.add(Z.FOR_IN);
        this.f28788a.add(Z.FOR_IN_CONST);
        this.f28788a.add(Z.FOR_IN_LET);
        this.f28788a.add(Z.FOR_LET);
        this.f28788a.add(Z.FOR_OF);
        this.f28788a.add(Z.FOR_OF_CONST);
        this.f28788a.add(Z.FOR_OF_LET);
        this.f28788a.add(Z.WHILE);
    }

    private static InterfaceC5013s c(P p8, InterfaceC5013s interfaceC5013s, InterfaceC5013s interfaceC5013s2) {
        return d(p8, interfaceC5013s.e(), interfaceC5013s2);
    }

    private static InterfaceC5013s d(P p8, Iterator it, InterfaceC5013s interfaceC5013s) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC5013s a8 = p8.a((InterfaceC5013s) it.next()).a((C4914g) interfaceC5013s);
                if (a8 instanceof C4958l) {
                    C4958l c4958l = (C4958l) a8;
                    if ("break".equals(c4958l.g())) {
                        return InterfaceC5013s.f29548h;
                    }
                    if ("return".equals(c4958l.g())) {
                        return c4958l;
                    }
                }
            }
        }
        return InterfaceC5013s.f29548h;
    }

    private static InterfaceC5013s e(P p8, InterfaceC5013s interfaceC5013s, InterfaceC5013s interfaceC5013s2) {
        if (interfaceC5013s instanceof Iterable) {
            return d(p8, ((Iterable) interfaceC5013s).iterator(), interfaceC5013s2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC5013s b(java.lang.String r11, com.google.android.gms.internal.measurement.Z2 r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.L.b(java.lang.String, com.google.android.gms.internal.measurement.Z2, java.util.List):com.google.android.gms.internal.measurement.s");
    }
}
