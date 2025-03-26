package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class X extends A {
    protected X() {
        this.f28788a.add(Z.ASSIGN);
        this.f28788a.add(Z.CONST);
        this.f28788a.add(Z.CREATE_ARRAY);
        this.f28788a.add(Z.CREATE_OBJECT);
        this.f28788a.add(Z.EXPRESSION_LIST);
        this.f28788a.add(Z.GET);
        this.f28788a.add(Z.GET_INDEX);
        this.f28788a.add(Z.GET_PROPERTY);
        this.f28788a.add(Z.NULL);
        this.f28788a.add(Z.SET_PROPERTY);
        this.f28788a.add(Z.TYPEOF);
        this.f28788a.add(Z.UNDEFINED);
        this.f28788a.add(Z.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC5013s b(String str, Z2 z22, List list) {
        String str2;
        int i8 = 0;
        switch (W.f29042a[AbstractC5048w2.c(str).ordinal()]) {
            case 1:
                AbstractC5048w2.f(Z.ASSIGN, 2, list);
                InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(0));
                if (!(b8 instanceof C5029u)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b8.getClass().getCanonicalName()));
                }
                if (!z22.g(b8.c())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b8.c()));
                }
                InterfaceC5013s b9 = z22.b((InterfaceC5013s) list.get(1));
                z22.h(b8.c(), b9);
                return b9;
            case 2:
                AbstractC5048w2.j(Z.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                for (int i9 = 0; i9 < list.size() - 1; i9 += 2) {
                    InterfaceC5013s b10 = z22.b((InterfaceC5013s) list.get(i9));
                    if (!(b10 instanceof C5029u)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b10.getClass().getCanonicalName()));
                    }
                    z22.f(b10.c(), z22.b((InterfaceC5013s) list.get(i9 + 1)));
                }
                return InterfaceC5013s.f29548h;
            case 3:
                if (list.isEmpty()) {
                    return new C4914g();
                }
                C4914g c4914g = new C4914g();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC5013s b11 = z22.b((InterfaceC5013s) it.next());
                    if (b11 instanceof C4958l) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    c4914g.x(i8, b11);
                    i8++;
                }
                return c4914g;
            case 4:
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                r rVar = new r();
                while (i8 < list.size() - 1) {
                    InterfaceC5013s b12 = z22.b((InterfaceC5013s) list.get(i8));
                    InterfaceC5013s b13 = z22.b((InterfaceC5013s) list.get(i8 + 1));
                    if ((b12 instanceof C4958l) || (b13 instanceof C4958l)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    rVar.o(b12.c(), b13);
                    i8 += 2;
                }
                return rVar;
            case 5:
                AbstractC5048w2.j(Z.EXPRESSION_LIST, 1, list);
                InterfaceC5013s interfaceC5013s = InterfaceC5013s.f29548h;
                while (i8 < list.size()) {
                    interfaceC5013s = z22.b((InterfaceC5013s) list.get(i8));
                    if (interfaceC5013s instanceof C4958l) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i8++;
                }
                return interfaceC5013s;
            case 6:
                AbstractC5048w2.f(Z.GET, 1, list);
                InterfaceC5013s b14 = z22.b((InterfaceC5013s) list.get(0));
                if (b14 instanceof C5029u) {
                    return z22.c(b14.c());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b14.getClass().getCanonicalName()));
            case 7:
            case 8:
                AbstractC5048w2.f(Z.GET_PROPERTY, 2, list);
                InterfaceC5013s b15 = z22.b((InterfaceC5013s) list.get(0));
                InterfaceC5013s b16 = z22.b((InterfaceC5013s) list.get(1));
                if ((b15 instanceof C4914g) && AbstractC5048w2.l(b16)) {
                    return ((C4914g) b15).q(b16.b().intValue());
                }
                if (b15 instanceof InterfaceC4966m) {
                    return ((InterfaceC4966m) b15).n(b16.c());
                }
                if (b15 instanceof C5029u) {
                    if ("length".equals(b16.c())) {
                        return new C4950k(Double.valueOf(b15.c().length()));
                    }
                    if (AbstractC5048w2.l(b16) && b16.b().doubleValue() < b15.c().length()) {
                        return new C5029u(String.valueOf(b15.c().charAt(b16.b().intValue())));
                    }
                }
                return InterfaceC5013s.f29548h;
            case 9:
                AbstractC5048w2.f(Z.NULL, 0, list);
                return InterfaceC5013s.f29549i;
            case 10:
                AbstractC5048w2.f(Z.SET_PROPERTY, 3, list);
                InterfaceC5013s b17 = z22.b((InterfaceC5013s) list.get(0));
                InterfaceC5013s b18 = z22.b((InterfaceC5013s) list.get(1));
                InterfaceC5013s b19 = z22.b((InterfaceC5013s) list.get(2));
                if (b17 == InterfaceC5013s.f29548h || b17 == InterfaceC5013s.f29549i) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", b18.c(), b17.c()));
                }
                if ((b17 instanceof C4914g) && (b18 instanceof C4950k)) {
                    ((C4914g) b17).x(b18.b().intValue(), b19);
                } else if (b17 instanceof InterfaceC4966m) {
                    ((InterfaceC4966m) b17).o(b18.c(), b19);
                }
                return b19;
            case 11:
                AbstractC5048w2.f(Z.TYPEOF, 1, list);
                InterfaceC5013s b20 = z22.b((InterfaceC5013s) list.get(0));
                if (b20 instanceof C5069z) {
                    str2 = "undefined";
                } else if (b20 instanceof C4923h) {
                    str2 = "boolean";
                } else if (b20 instanceof C4950k) {
                    str2 = "number";
                } else if (b20 instanceof C5029u) {
                    str2 = "string";
                } else if (b20 instanceof C5021t) {
                    str2 = "function";
                } else {
                    if ((b20 instanceof C5037v) || (b20 instanceof C4958l)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b20));
                    }
                    str2 = "object";
                }
                return new C5029u(str2);
            case 12:
                AbstractC5048w2.f(Z.UNDEFINED, 0, list);
                return InterfaceC5013s.f29548h;
            case 13:
                AbstractC5048w2.j(Z.VAR, 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC5013s b21 = z22.b((InterfaceC5013s) it2.next());
                    if (!(b21 instanceof C5029u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b21.getClass().getCanonicalName()));
                    }
                    z22.e(b21.c(), InterfaceC5013s.f29548h);
                }
                return InterfaceC5013s.f29548h;
            default:
                return super.a(str);
        }
    }
}
