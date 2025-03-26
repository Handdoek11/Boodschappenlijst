package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class H {
    private static C4914g a(C4914g c4914g, Z2 z22, AbstractC4974n abstractC4974n) {
        return b(c4914g, z22, abstractC4974n, null, null);
    }

    private static C4914g b(C4914g c4914g, Z2 z22, AbstractC4974n abstractC4974n, Boolean bool, Boolean bool2) {
        C4914g c4914g2 = new C4914g();
        Iterator F7 = c4914g.F();
        while (F7.hasNext()) {
            int intValue = ((Integer) F7.next()).intValue();
            if (c4914g.y(intValue)) {
                InterfaceC5013s f8 = abstractC4974n.f(z22, Arrays.asList(c4914g.q(intValue), new C4950k(Double.valueOf(intValue)), c4914g));
                if (f8.d().equals(bool)) {
                    return c4914g2;
                }
                if (bool2 == null || f8.d().equals(bool2)) {
                    c4914g2.x(intValue, f8);
                }
            }
        }
        return c4914g2;
    }

    private static InterfaceC5013s c(C4914g c4914g, Z2 z22, List list, boolean z7) {
        InterfaceC5013s interfaceC5013s;
        AbstractC5048w2.k("reduce", 1, list);
        AbstractC5048w2.n("reduce", 2, list);
        InterfaceC5013s b8 = z22.b((InterfaceC5013s) list.get(0));
        if (!(b8 instanceof AbstractC4974n)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC5013s = z22.b((InterfaceC5013s) list.get(1));
            if (interfaceC5013s instanceof C4958l) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c4914g.t() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC5013s = null;
        }
        AbstractC4974n abstractC4974n = (AbstractC4974n) b8;
        int t7 = c4914g.t();
        int i8 = z7 ? 0 : t7 - 1;
        int i9 = z7 ? t7 - 1 : 0;
        int i10 = z7 ? 1 : -1;
        if (interfaceC5013s == null) {
            interfaceC5013s = c4914g.q(i8);
            i8 += i10;
        }
        while ((i9 - i8) * i10 >= 0) {
            if (c4914g.y(i8)) {
                interfaceC5013s = abstractC4974n.f(z22, Arrays.asList(interfaceC5013s, c4914g.q(i8), new C4950k(Double.valueOf(i8)), c4914g));
                if (interfaceC5013s instanceof C4958l) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i8 += i10;
            } else {
                i8 += i10;
            }
        }
        return interfaceC5013s;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static InterfaceC5013s d(String str, C4914g c4914g, Z2 z22, List list) {
        String str2;
        char c8;
        double d8;
        String str3;
        AbstractC4974n abstractC4974n;
        int i8;
        Z2 z23;
        Double d9;
        double d10;
        str.hashCode();
        Double valueOf = Double.valueOf(-1.0d);
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c8 = 0;
                    break;
                } else {
                    c8 = 65535;
                    break;
                }
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c8 = 1;
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c8 = 2;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    c8 = 3;
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c8 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c8 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c8 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c8 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c8 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c8 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c8 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c8 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c8 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c8 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c8 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c8 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c8 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c8 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c8 = 18;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c8 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            default:
                str2 = "toString";
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                AbstractC5048w2.g(str2, 0, list);
                return new C5029u(c4914g.toString());
            case 1:
                C4914g c4914g2 = (C4914g) c4914g.a();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC5013s b8 = z22.b((InterfaceC5013s) it.next());
                        if (b8 instanceof C4958l) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int t7 = c4914g2.t();
                        if (b8 instanceof C4914g) {
                            C4914g c4914g3 = (C4914g) b8;
                            Iterator F7 = c4914g3.F();
                            while (F7.hasNext()) {
                                Integer num = (Integer) F7.next();
                                c4914g2.x(num.intValue() + t7, c4914g3.q(num.intValue()));
                            }
                        } else {
                            c4914g2.x(t7, b8);
                        }
                    }
                }
                return c4914g2;
            case 2:
                AbstractC5048w2.g("filter", 1, list);
                InterfaceC5013s b9 = z22.b((InterfaceC5013s) list.get(0));
                if (!(b9 instanceof C5021t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c4914g.p() == 0) {
                    return new C4914g();
                }
                C4914g c4914g4 = (C4914g) c4914g.a();
                C4914g b10 = b(c4914g, z22, (C5021t) b9, null, Boolean.TRUE);
                C4914g c4914g5 = new C4914g();
                Iterator F8 = b10.F();
                while (F8.hasNext()) {
                    c4914g5.s(c4914g4.q(((Integer) F8.next()).intValue()));
                }
                return c4914g5;
            case 3:
                return c(c4914g, z22, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new C4914g();
                }
                int a8 = (int) AbstractC5048w2.a(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue());
                if (a8 < 0) {
                    a8 = Math.max(0, a8 + c4914g.t());
                } else if (a8 > c4914g.t()) {
                    a8 = c4914g.t();
                }
                int t8 = c4914g.t();
                C4914g c4914g6 = new C4914g();
                if (list.size() <= 1) {
                    while (a8 < t8) {
                        c4914g6.s(c4914g.q(a8));
                        c4914g.x(a8, null);
                        a8++;
                    }
                    return c4914g6;
                }
                int max = Math.max(0, (int) AbstractC5048w2.a(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue()));
                if (max > 0) {
                    for (int i9 = a8; i9 < Math.min(t8, a8 + max); i9++) {
                        c4914g6.s(c4914g.q(a8));
                        c4914g.w(a8);
                    }
                }
                if (list.size() > 2) {
                    for (int i10 = 2; i10 < list.size(); i10++) {
                        InterfaceC5013s b11 = z22.b((InterfaceC5013s) list.get(i10));
                        if (b11 instanceof C4958l) {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                        c4914g.r((a8 + i10) - 2, b11);
                    }
                }
                return c4914g6;
            case 5:
                AbstractC5048w2.g("forEach", 1, list);
                InterfaceC5013s b12 = z22.b((InterfaceC5013s) list.get(0));
                if (!(b12 instanceof C5021t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c4914g.p() == 0) {
                    return InterfaceC5013s.f29548h;
                }
                a(c4914g, z22, (C5021t) b12);
                return InterfaceC5013s.f29548h;
            case 6:
                AbstractC5048w2.n("lastIndexOf", 2, list);
                InterfaceC5013s interfaceC5013s = InterfaceC5013s.f29548h;
                if (!list.isEmpty()) {
                    interfaceC5013s = z22.b((InterfaceC5013s) list.get(0));
                }
                double t9 = c4914g.t() - 1;
                if (list.size() > 1) {
                    InterfaceC5013s b13 = z22.b((InterfaceC5013s) list.get(1));
                    t9 = Double.isNaN(b13.b().doubleValue()) ? c4914g.t() - 1 : AbstractC5048w2.a(b13.b().doubleValue());
                    d8 = 0.0d;
                    if (t9 < 0.0d) {
                        t9 += c4914g.t();
                    }
                } else {
                    d8 = 0.0d;
                }
                if (t9 < d8) {
                    return new C4950k(valueOf);
                }
                for (int min = (int) Math.min(c4914g.t(), t9); min >= 0; min--) {
                    if (c4914g.y(min) && AbstractC5048w2.h(c4914g.q(min), interfaceC5013s)) {
                        return new C4950k(Double.valueOf(min));
                    }
                }
                return new C4950k(valueOf);
            case 7:
                if (!list.isEmpty()) {
                    C4914g c4914g7 = new C4914g();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC5013s b14 = z22.b((InterfaceC5013s) it2.next());
                        if (b14 instanceof C4958l) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c4914g7.s(b14);
                    }
                    int t10 = c4914g7.t();
                    Iterator F9 = c4914g.F();
                    while (F9.hasNext()) {
                        Integer num2 = (Integer) F9.next();
                        c4914g7.x(num2.intValue() + t10, c4914g.q(num2.intValue()));
                    }
                    c4914g.I();
                    Iterator F10 = c4914g7.F();
                    while (F10.hasNext()) {
                        Integer num3 = (Integer) F10.next();
                        c4914g.x(num3.intValue(), c4914g7.q(num3.intValue()));
                    }
                }
                return new C4950k(Double.valueOf(c4914g.t()));
            case '\b':
                AbstractC5048w2.g("map", 1, list);
                InterfaceC5013s b15 = z22.b((InterfaceC5013s) list.get(0));
                if (b15 instanceof C5021t) {
                    return c4914g.t() == 0 ? new C4914g() : a(c4914g, z22, (C5021t) b15);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                AbstractC5048w2.g("pop", 0, list);
                int t11 = c4914g.t();
                if (t11 == 0) {
                    return InterfaceC5013s.f29548h;
                }
                int i11 = t11 - 1;
                InterfaceC5013s q8 = c4914g.q(i11);
                c4914g.w(i11);
                return q8;
            case '\n':
                AbstractC5048w2.n("join", 1, list);
                if (c4914g.t() == 0) {
                    return InterfaceC5013s.f29555p;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    InterfaceC5013s b16 = z22.b((InterfaceC5013s) list.get(0));
                    str3 = ((b16 instanceof C4998q) || (b16 instanceof C5069z)) ? "" : b16.c();
                }
                return new C5029u(c4914g.v(str3));
            case 11:
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c4914g.s(z22.b((InterfaceC5013s) it3.next()));
                    }
                }
                return new C4950k(Double.valueOf(c4914g.t()));
            case '\f':
                AbstractC5048w2.g("some", 1, list);
                InterfaceC5013s b17 = z22.b((InterfaceC5013s) list.get(0));
                if (!(b17 instanceof AbstractC4974n)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c4914g.t() != 0) {
                    AbstractC4974n abstractC4974n2 = (AbstractC4974n) b17;
                    Iterator F11 = c4914g.F();
                    while (F11.hasNext()) {
                        int intValue = ((Integer) F11.next()).intValue();
                        if (c4914g.y(intValue) && abstractC4974n2.f(z22, Arrays.asList(c4914g.q(intValue), new C4950k(Double.valueOf(intValue)), c4914g)).d().booleanValue()) {
                            return InterfaceC5013s.f29553m;
                        }
                    }
                }
                return InterfaceC5013s.f29554n;
            case '\r':
                AbstractC5048w2.n("sort", 1, list);
                if (c4914g.t() >= 2) {
                    List H7 = c4914g.H();
                    if (list.isEmpty()) {
                        abstractC4974n = null;
                    } else {
                        InterfaceC5013s b18 = z22.b((InterfaceC5013s) list.get(0));
                        if (!(b18 instanceof AbstractC4974n)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC4974n = (AbstractC4974n) b18;
                    }
                    Collections.sort(H7, new K(abstractC4974n, z22));
                    c4914g.I();
                    Iterator it4 = H7.iterator();
                    int i12 = 0;
                    while (it4.hasNext()) {
                        c4914g.x(i12, (InterfaceC5013s) it4.next());
                        i12++;
                    }
                }
                return c4914g;
            case 14:
                AbstractC5048w2.g("every", 1, list);
                InterfaceC5013s b19 = z22.b((InterfaceC5013s) list.get(0));
                if (b19 instanceof C5021t) {
                    return (c4914g.t() == 0 || b(c4914g, z22, (C5021t) b19, Boolean.FALSE, Boolean.TRUE).t() == c4914g.t()) ? InterfaceC5013s.f29553m : InterfaceC5013s.f29554n;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                AbstractC5048w2.g("shift", 0, list);
                if (c4914g.t() == 0) {
                    return InterfaceC5013s.f29548h;
                }
                InterfaceC5013s q9 = c4914g.q(0);
                c4914g.w(0);
                return q9;
            case 16:
                AbstractC5048w2.n("slice", 2, list);
                if (list.isEmpty()) {
                    return c4914g.a();
                }
                double t12 = c4914g.t();
                double a9 = AbstractC5048w2.a(z22.b((InterfaceC5013s) list.get(0)).b().doubleValue());
                double max2 = a9 < 0.0d ? Math.max(a9 + t12, 0.0d) : Math.min(a9, t12);
                if (list.size() == 2) {
                    double a10 = AbstractC5048w2.a(z22.b((InterfaceC5013s) list.get(1)).b().doubleValue());
                    t12 = a10 < 0.0d ? Math.max(t12 + a10, 0.0d) : Math.min(t12, a10);
                }
                C4914g c4914g8 = new C4914g();
                for (int i13 = (int) max2; i13 < t12; i13++) {
                    c4914g8.s(c4914g.q(i13));
                }
                return c4914g8;
            case 17:
                return c(c4914g, z22, list, false);
            case 18:
                AbstractC5048w2.g("reverse", 0, list);
                int t13 = c4914g.t();
                if (t13 != 0) {
                    int i14 = 0;
                    while (i14 < t13 / 2) {
                        if (c4914g.y(i14)) {
                            InterfaceC5013s q10 = c4914g.q(i14);
                            c4914g.x(i14, null);
                            i8 = 1;
                            int i15 = (t13 - 1) - i14;
                            if (c4914g.y(i15)) {
                                c4914g.x(i14, c4914g.q(i15));
                            }
                            c4914g.x(i15, q10);
                        } else {
                            i8 = 1;
                        }
                        i14 += i8;
                    }
                }
                return c4914g;
            case 19:
                AbstractC5048w2.n("indexOf", 2, list);
                InterfaceC5013s interfaceC5013s2 = InterfaceC5013s.f29548h;
                if (list.isEmpty()) {
                    z23 = z22;
                } else {
                    z23 = z22;
                    interfaceC5013s2 = z23.b((InterfaceC5013s) list.get(0));
                }
                if (list.size() > 1) {
                    d10 = AbstractC5048w2.a(z23.b((InterfaceC5013s) list.get(1)).b().doubleValue());
                    if (d10 >= c4914g.t()) {
                        return new C4950k(valueOf);
                    }
                    d9 = valueOf;
                    if (d10 < 0.0d) {
                        d10 += c4914g.t();
                    }
                } else {
                    d9 = valueOf;
                    d10 = 0.0d;
                }
                Iterator F12 = c4914g.F();
                while (F12.hasNext()) {
                    int intValue2 = ((Integer) F12.next()).intValue();
                    double d11 = intValue2;
                    if (d11 >= d10 && AbstractC5048w2.h(c4914g.q(intValue2), interfaceC5013s2)) {
                        return new C4950k(Double.valueOf(d11));
                    }
                }
                return new C4950k(d9);
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
