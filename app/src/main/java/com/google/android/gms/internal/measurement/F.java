package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class F extends A {
    protected F() {
        this.f28788a.add(Z.APPLY);
        this.f28788a.add(Z.BLOCK);
        this.f28788a.add(Z.BREAK);
        this.f28788a.add(Z.CASE);
        this.f28788a.add(Z.DEFAULT);
        this.f28788a.add(Z.CONTINUE);
        this.f28788a.add(Z.DEFINE_FUNCTION);
        this.f28788a.add(Z.FN);
        this.f28788a.add(Z.IF);
        this.f28788a.add(Z.QUOTE);
        this.f28788a.add(Z.RETURN);
        this.f28788a.add(Z.SWITCH);
        this.f28788a.add(Z.TERNARY);
    }

    private static InterfaceC5013s c(Z2 z22, List list) {
        AbstractC5048w2.j(Z.FN, 2, list);
        InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(0));
        InterfaceC5013s b9 = z22.b((InterfaceC5013s) list.get(1));
        if (!(b9 instanceof C4914g)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b9.getClass().getCanonicalName()));
        }
        List H7 = ((C4914g) b9).H();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C5021t(b8.c(), H7, arrayList, z22);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC5013s b(String str, Z2 z22, List list) {
        int i8 = 0;
        switch (I.f28888a[AbstractC5048w2.c(str).ordinal()]) {
            case 1:
                AbstractC5048w2.f(Z.APPLY, 3, list);
                InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(0));
                String c8 = z22.b((InterfaceC5013s) list.get(1)).c();
                InterfaceC5013s b9 = z22.b((InterfaceC5013s) list.get(2));
                if (!(b9 instanceof C4914g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", b9.getClass().getCanonicalName()));
                }
                if (c8.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return b8.j(c8, z22, ((C4914g) b9).H());
            case 2:
                return z22.d().a(new C4914g(list));
            case 3:
                AbstractC5048w2.f(Z.BREAK, 0, list);
                return InterfaceC5013s.f29551k;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    InterfaceC5013s b10 = z22.b((InterfaceC5013s) list.get(0));
                    if (b10 instanceof C4914g) {
                        return z22.a((C4914g) b10);
                    }
                }
                return InterfaceC5013s.f29548h;
            case 6:
                AbstractC5048w2.f(Z.BREAK, 0, list);
                return InterfaceC5013s.f29550j;
            case 7:
                AbstractC5048w2.j(Z.DEFINE_FUNCTION, 2, list);
                C5021t c5021t = (C5021t) c(z22, list);
                if (c5021t.g() == null) {
                    z22.h("", c5021t);
                } else {
                    z22.h(c5021t.g(), c5021t);
                }
                return c5021t;
            case 8:
                return c(z22, list);
            case 9:
                AbstractC5048w2.j(Z.IF, 2, list);
                InterfaceC5013s b11 = z22.b((InterfaceC5013s) list.get(0));
                InterfaceC5013s b12 = z22.b((InterfaceC5013s) list.get(1));
                InterfaceC5013s b13 = list.size() > 2 ? z22.b((InterfaceC5013s) list.get(2)) : null;
                InterfaceC5013s interfaceC5013s = InterfaceC5013s.f29548h;
                InterfaceC5013s a8 = b11.d().booleanValue() ? z22.a((C4914g) b12) : b13 != null ? z22.a((C4914g) b13) : interfaceC5013s;
                return a8 instanceof C4958l ? a8 : interfaceC5013s;
            case 10:
                return new C4914g(list);
            case 11:
                if (list.isEmpty()) {
                    return InterfaceC5013s.f29552l;
                }
                AbstractC5048w2.f(Z.RETURN, 1, list);
                return new C4958l("return", z22.b((InterfaceC5013s) list.get(0)));
            case 12:
                AbstractC5048w2.f(Z.SWITCH, 3, list);
                InterfaceC5013s b14 = z22.b((InterfaceC5013s) list.get(0));
                InterfaceC5013s b15 = z22.b((InterfaceC5013s) list.get(1));
                InterfaceC5013s b16 = z22.b((InterfaceC5013s) list.get(2));
                if (!(b15 instanceof C4914g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(b16 instanceof C4914g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C4914g c4914g = (C4914g) b15;
                C4914g c4914g2 = (C4914g) b16;
                boolean z7 = false;
                while (true) {
                    if (i8 < c4914g.t()) {
                        if (z7 || b14.equals(z22.b(c4914g.q(i8)))) {
                            InterfaceC5013s b17 = z22.b(c4914g2.q(i8));
                            if (!(b17 instanceof C4958l)) {
                                z7 = true;
                            } else if (!((C4958l) b17).g().equals("break")) {
                                return b17;
                            }
                        }
                        i8++;
                    } else if (c4914g.t() + 1 == c4914g2.t()) {
                        InterfaceC5013s b18 = z22.b(c4914g2.q(c4914g.t()));
                        if (b18 instanceof C4958l) {
                            String g8 = ((C4958l) b18).g();
                            if (g8.equals("return") || g8.equals("continue")) {
                                return b18;
                            }
                        }
                    }
                }
                return InterfaceC5013s.f29548h;
            case 13:
                AbstractC5048w2.f(Z.TERNARY, 3, list);
                return z22.b((InterfaceC5013s) list.get(0)).d().booleanValue() ? z22.b((InterfaceC5013s) list.get(1)) : z22.b((InterfaceC5013s) list.get(2));
            default:
                return super.a(str);
        }
    }
}
