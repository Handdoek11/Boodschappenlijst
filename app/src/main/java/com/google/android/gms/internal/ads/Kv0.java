package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class Kv0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ov0 f16687a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16688b = 0;

    static {
        int i8 = C4851zv0.f28729d;
        f16687a = new Qv0();
    }

    static void A(Ov0 ov0, Object obj, Object obj2) {
        Qu0 qu0 = (Qu0) obj;
        Pv0 pv0 = qu0.zzt;
        Pv0 pv02 = ((Qu0) obj2).zzt;
        if (!Pv0.c().equals(pv02)) {
            if (Pv0.c().equals(pv0)) {
                pv0 = Pv0.e(pv0, pv02);
            } else {
                pv0.d(pv02);
            }
        }
        qu0.zzt = pv0;
    }

    public static void B(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.a(i8, list, z7);
    }

    public static void C(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.g(i8, list);
    }

    public static void D(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.f(i8, list, z7);
    }

    public static void E(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.c(i8, list, z7);
    }

    public static void F(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.b(i8, list, z7);
    }

    public static void G(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.e(i8, list, z7);
    }

    public static void H(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.A(i8, list, z7);
    }

    public static void I(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, Iv0 iv0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((C4849zu0) interfaceC2242bw0).J(i8, list.get(i9), iv0);
        }
    }

    public static void J(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.p(i8, list, z7);
    }

    public static void a(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.x(i8, list, z7);
    }

    public static void b(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, Iv0 iv0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((C4849zu0) interfaceC2242bw0).H(i8, list.get(i9), iv0);
        }
    }

    public static void c(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.j(i8, list, z7);
    }

    public static void d(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.o(i8, list, z7);
    }

    public static void e(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.s(i8, list, z7);
    }

    public static void f(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.z(i8, list, z7);
    }

    public static void g(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.D(i8, list);
    }

    public static void h(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.n(i8, list, z7);
    }

    public static void i(int i8, List list, InterfaceC2242bw0 interfaceC2242bw0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2242bw0.v(i8, list, z7);
    }

    static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int k(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.f(ru0.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.f(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    static int l(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC4740yu0.e(i8 << 3) + 4);
    }

    static int m(List list) {
        return list.size() * 4;
    }

    static int n(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC4740yu0.e(i8 << 3) + 8);
    }

    static int o(List list) {
        return list.size() * 8;
    }

    static int p(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.f(ru0.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.f(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    static int q(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2783gv0) {
            C2783gv0 c2783gv0 = (C2783gv0) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.f(c2783gv0.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.f(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    static int r(int i8, Object obj, Iv0 iv0) {
        return AbstractC4740yu0.e(i8 << 3) + AbstractC4740yu0.b((InterfaceC3871qv0) obj, iv0);
    }

    static int s(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            i8 = 0;
            while (i9 < size) {
                int c8 = ru0.c(i9);
                i8 += AbstractC4740yu0.e((c8 >> 31) ^ (c8 + c8));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i8 += AbstractC4740yu0.e((intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
        }
        return i8;
    }

    static int t(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2783gv0) {
            C2783gv0 c2783gv0 = (C2783gv0) list;
            i8 = 0;
            while (i9 < size) {
                long c8 = c2783gv0.c(i9);
                i8 += AbstractC4740yu0.f((c8 >> 63) ^ (c8 + c8));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                long longValue = ((Long) list.get(i9)).longValue();
                i8 += AbstractC4740yu0.f((longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
        }
        return i8;
    }

    static int u(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.e(ru0.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.e(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    static int v(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2783gv0) {
            C2783gv0 c2783gv0 = (C2783gv0) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.f(c2783gv0.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC4740yu0.f(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static Ov0 w() {
        return f16687a;
    }

    static Object x(Object obj, int i8, List list, Uu0 uu0, Object obj2, Ov0 ov0) {
        if (uu0 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) list.get(i10);
                int intValue = num.intValue();
                if (uu0.m(intValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    obj2 = y(obj, i8, intValue, obj2, ov0);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!uu0.m(intValue2)) {
                    obj2 = y(obj, i8, intValue2, obj2, ov0);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object y(Object obj, int i8, int i9, Object obj2, Ov0 ov0) {
        if (obj2 == null) {
            obj2 = ov0.a(obj);
        }
        ov0.h(obj2, i8, i9);
        return obj2;
    }

    static void z(Fu0 fu0, Object obj, Object obj2) {
        androidx.appcompat.app.E.a(obj2);
        throw null;
    }
}
