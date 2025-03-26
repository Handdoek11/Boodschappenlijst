package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5048w2 {
    public static double a(double d8) {
        if (Double.isNaN(d8)) {
            return 0.0d;
        }
        if (Double.isInfinite(d8) || d8 == 0.0d || d8 == -0.0d) {
            return d8;
        }
        return (d8 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d8));
    }

    public static int b(Z2 z22) {
        int i8 = i(z22.c("runtime.counter").b().doubleValue() + 1.0d);
        if (i8 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        z22.h("runtime.counter", new C4950k(Double.valueOf(i8)));
        return i8;
    }

    public static Z c(String str) {
        Z a8 = (str == null || str.isEmpty()) ? null : Z.a(Integer.parseInt(str));
        if (a8 != null) {
            return a8;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(InterfaceC5013s interfaceC5013s) {
        if (InterfaceC5013s.f29549i.equals(interfaceC5013s)) {
            return null;
        }
        if (InterfaceC5013s.f29548h.equals(interfaceC5013s)) {
            return "";
        }
        if (interfaceC5013s instanceof r) {
            return e((r) interfaceC5013s);
        }
        if (!(interfaceC5013s instanceof C4914g)) {
            return !interfaceC5013s.b().isNaN() ? interfaceC5013s.b() : interfaceC5013s.c();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C4914g) interfaceC5013s).iterator();
        while (it.hasNext()) {
            Object d8 = d((InterfaceC5013s) it.next());
            if (d8 != null) {
                arrayList.add(d8);
            }
        }
        return arrayList;
    }

    public static Map e(r rVar) {
        HashMap hashMap = new HashMap();
        for (String str : rVar.f()) {
            Object d8 = d(rVar.n(str));
            if (d8 != null) {
                hashMap.put(str, d8);
            }
        }
        return hashMap;
    }

    public static void f(Z z7, int i8, List list) {
        g(z7.name(), i8, list);
    }

    public static void g(String str, int i8, List list) {
        if (list.size() != i8) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }

    public static boolean h(InterfaceC5013s interfaceC5013s, InterfaceC5013s interfaceC5013s2) {
        if (!interfaceC5013s.getClass().equals(interfaceC5013s2.getClass())) {
            return false;
        }
        if ((interfaceC5013s instanceof C5069z) || (interfaceC5013s instanceof C4998q)) {
            return true;
        }
        if (!(interfaceC5013s instanceof C4950k)) {
            return interfaceC5013s instanceof C5029u ? interfaceC5013s.c().equals(interfaceC5013s2.c()) : interfaceC5013s instanceof C4923h ? interfaceC5013s.d().equals(interfaceC5013s2.d()) : interfaceC5013s == interfaceC5013s2;
        }
        if (Double.isNaN(interfaceC5013s.b().doubleValue()) || Double.isNaN(interfaceC5013s2.b().doubleValue())) {
            return false;
        }
        return interfaceC5013s.b().equals(interfaceC5013s2.b());
    }

    public static int i(double d8) {
        if (Double.isNaN(d8) || Double.isInfinite(d8) || d8 == 0.0d) {
            return 0;
        }
        return (int) (((d8 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d8))) % 4.294967296E9d);
    }

    public static void j(Z z7, int i8, List list) {
        k(z7.name(), i8, list);
    }

    public static void k(String str, int i8, List list) {
        if (list.size() < i8) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }

    public static boolean l(InterfaceC5013s interfaceC5013s) {
        if (interfaceC5013s == null) {
            return false;
        }
        Double b8 = interfaceC5013s.b();
        return !b8.isNaN() && b8.doubleValue() >= 0.0d && b8.equals(Double.valueOf(Math.floor(b8.doubleValue())));
    }

    public static long m(double d8) {
        return i(d8) & 4294967295L;
    }

    public static void n(String str, int i8, List list) {
        if (list.size() > i8) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }
}
