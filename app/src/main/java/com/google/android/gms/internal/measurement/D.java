package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class D extends A {
    public D() {
        this.f28788a.add(Z.EQUALS);
        this.f28788a.add(Z.GREATER_THAN);
        this.f28788a.add(Z.GREATER_THAN_EQUALS);
        this.f28788a.add(Z.IDENTITY_EQUALS);
        this.f28788a.add(Z.IDENTITY_NOT_EQUALS);
        this.f28788a.add(Z.LESS_THAN);
        this.f28788a.add(Z.LESS_THAN_EQUALS);
        this.f28788a.add(Z.NOT_EQUALS);
    }

    private static boolean c(InterfaceC5013s interfaceC5013s, InterfaceC5013s interfaceC5013s2) {
        InterfaceC5013s c4950k;
        InterfaceC5013s c4950k2;
        while (!interfaceC5013s.getClass().equals(interfaceC5013s2.getClass())) {
            if (((interfaceC5013s instanceof C5069z) || (interfaceC5013s instanceof C4998q)) && ((interfaceC5013s2 instanceof C5069z) || (interfaceC5013s2 instanceof C4998q))) {
                return true;
            }
            boolean z7 = interfaceC5013s instanceof C4950k;
            if (z7 && (interfaceC5013s2 instanceof C5029u)) {
                c4950k2 = new C4950k(interfaceC5013s2.b());
            } else {
                boolean z8 = interfaceC5013s instanceof C5029u;
                if (z8 && (interfaceC5013s2 instanceof C4950k)) {
                    c4950k = new C4950k(interfaceC5013s.b());
                } else if (interfaceC5013s instanceof C4923h) {
                    c4950k = new C4950k(interfaceC5013s.b());
                } else if (interfaceC5013s2 instanceof C4923h) {
                    c4950k2 = new C4950k(interfaceC5013s2.b());
                } else if ((z8 || z7) && (interfaceC5013s2 instanceof InterfaceC4966m)) {
                    c4950k2 = new C5029u(interfaceC5013s2.c());
                } else {
                    if (!(interfaceC5013s instanceof InterfaceC4966m) || (!(interfaceC5013s2 instanceof C5029u) && !(interfaceC5013s2 instanceof C4950k))) {
                        return false;
                    }
                    c4950k = new C5029u(interfaceC5013s.c());
                }
                interfaceC5013s = c4950k;
            }
            interfaceC5013s2 = c4950k2;
        }
        if ((interfaceC5013s instanceof C5069z) || (interfaceC5013s instanceof C4998q)) {
            return true;
        }
        return interfaceC5013s instanceof C4950k ? (Double.isNaN(interfaceC5013s.b().doubleValue()) || Double.isNaN(interfaceC5013s2.b().doubleValue()) || interfaceC5013s.b().doubleValue() != interfaceC5013s2.b().doubleValue()) ? false : true : interfaceC5013s instanceof C5029u ? interfaceC5013s.c().equals(interfaceC5013s2.c()) : interfaceC5013s instanceof C4923h ? interfaceC5013s.d().equals(interfaceC5013s2.d()) : interfaceC5013s == interfaceC5013s2;
    }

    private static boolean d(InterfaceC5013s interfaceC5013s, InterfaceC5013s interfaceC5013s2) {
        if (interfaceC5013s instanceof InterfaceC4966m) {
            interfaceC5013s = new C5029u(interfaceC5013s.c());
        }
        if (interfaceC5013s2 instanceof InterfaceC4966m) {
            interfaceC5013s2 = new C5029u(interfaceC5013s2.c());
        }
        if ((interfaceC5013s instanceof C5029u) && (interfaceC5013s2 instanceof C5029u)) {
            return interfaceC5013s.c().compareTo(interfaceC5013s2.c()) < 0;
        }
        double doubleValue = interfaceC5013s.b().doubleValue();
        double doubleValue2 = interfaceC5013s2.b().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == -0.0d) || ((doubleValue == -0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(InterfaceC5013s interfaceC5013s, InterfaceC5013s interfaceC5013s2) {
        if (interfaceC5013s instanceof InterfaceC4966m) {
            interfaceC5013s = new C5029u(interfaceC5013s.c());
        }
        if (interfaceC5013s2 instanceof InterfaceC4966m) {
            interfaceC5013s2 = new C5029u(interfaceC5013s2.c());
        }
        return (((interfaceC5013s instanceof C5029u) && (interfaceC5013s2 instanceof C5029u)) || !(Double.isNaN(interfaceC5013s.b().doubleValue()) || Double.isNaN(interfaceC5013s2.b().doubleValue()))) && !d(interfaceC5013s2, interfaceC5013s);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC5013s b(java.lang.String r4, com.google.android.gms.internal.measurement.Z2 r5, java.util.List r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.Z r0 = com.google.android.gms.internal.measurement.AbstractC5048w2.c(r4)
            r1 = 2
            com.google.android.gms.internal.measurement.AbstractC5048w2.f(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.s r0 = (com.google.android.gms.internal.measurement.InterfaceC5013s) r0
            com.google.android.gms.internal.measurement.s r0 = r5.b(r0)
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.measurement.s r6 = (com.google.android.gms.internal.measurement.InterfaceC5013s) r6
            com.google.android.gms.internal.measurement.s r5 = r5.b(r6)
            int[] r6 = com.google.android.gms.internal.measurement.G.f28869a
            com.google.android.gms.internal.measurement.Z r2 = com.google.android.gms.internal.measurement.AbstractC5048w2.c(r4)
            int r2 = r2.ordinal()
            r6 = r6[r2]
            switch(r6) {
                case 1: goto L56;
                case 2: goto L51;
                case 3: goto L4c;
                case 4: goto L47;
                case 5: goto L42;
                case 6: goto L3d;
                case 7: goto L38;
                case 8: goto L32;
                default: goto L2d;
            }
        L2d:
            com.google.android.gms.internal.measurement.s r4 = super.a(r4)
            return r4
        L32:
            boolean r4 = c(r0, r5)
        L36:
            r4 = r4 ^ r1
            goto L5a
        L38:
            boolean r4 = e(r0, r5)
            goto L5a
        L3d:
            boolean r4 = d(r0, r5)
            goto L5a
        L42:
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC5048w2.h(r0, r5)
            goto L36
        L47:
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC5048w2.h(r0, r5)
            goto L5a
        L4c:
            boolean r4 = e(r5, r0)
            goto L5a
        L51:
            boolean r4 = d(r5, r0)
            goto L5a
        L56:
            boolean r4 = c(r0, r5)
        L5a:
            if (r4 == 0) goto L5f
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC5013s.f29553m
            return r4
        L5f:
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC5013s.f29554n
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D.b(java.lang.String, com.google.android.gms.internal.measurement.Z2, java.util.List):com.google.android.gms.internal.measurement.s");
    }
}
