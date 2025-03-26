package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4980n5 {

    /* renamed from: a, reason: collision with root package name */
    private static final A5 f29480a = new C5();

    static int A(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.P(i8, 0L);
    }

    static int B(List list) {
        return list.size() << 3;
    }

    public static void C(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.F(i8, list, z7);
    }

    static int D(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * zzjc.s0(i8));
    }

    static int E(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5034u4) {
            C5034u4 c5034u4 = (C5034u4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.g0(c5034u4.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.g0(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void F(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.C(i8, list, z7);
    }

    static int G(int i8, List list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * zzjc.s0(i8));
    }

    static int H(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.a0(g42.A(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.a0(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static void I(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.L(i8, list, z7);
    }

    static int J(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * zzjc.s0(i8));
    }

    static int K(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5034u4) {
            C5034u4 c5034u4 = (C5034u4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.o0(c5034u4.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.o0(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void L(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.f(i8, list, z7);
    }

    static int M(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * zzjc.s0(i8));
    }

    static int N(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.j0(g42.A(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.j0(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static void O(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.r(i8, list, z7);
    }

    static int P(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * zzjc.s0(i8));
    }

    static int Q(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5034u4) {
            C5034u4 c5034u4 = (C5034u4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.v0(c5034u4.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.v0(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void R(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.j(i8, list, z7);
    }

    static int S(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * zzjc.s0(i8));
    }

    static int T(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.n0(g42.A(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.n0(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static void U(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.c(i8, list, z7);
    }

    public static void V(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.x(i8, list, z7);
    }

    public static void W(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.b(i8, list, z7);
    }

    public static void X(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.H(i8, list, z7);
    }

    public static void Y(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.e(i8, list, z7);
    }

    static int a(int i8, Object obj, InterfaceC4964l5 interfaceC4964l5) {
        return zzjc.R(i8, (W4) obj, interfaceC4964l5);
    }

    static int b(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s02 = size * zzjc.s0(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            s02 += zzjc.A((K3) list.get(i9));
        }
        return s02;
    }

    static int c(int i8, List list, InterfaceC4964l5 interfaceC4964l5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += zzjc.x(i8, (W4) list.get(i10), interfaceC4964l5);
        }
        return i9;
    }

    static int d(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.z(i8, true);
    }

    static int e(List list) {
        return list.size();
    }

    public static A5 f() {
        return f29480a;
    }

    static Object g(Object obj, int i8, int i9, Object obj2, A5 a52) {
        if (obj2 == null) {
            obj2 = a52.i(obj);
        }
        a52.f(obj2, i8, i9);
        return obj2;
    }

    static Object h(Object obj, int i8, List list, InterfaceC5042v4 interfaceC5042v4, Object obj2, A5 a52) {
        if (interfaceC5042v4 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) list.get(i10);
                int intValue = num.intValue();
                if (interfaceC5042v4.m(intValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    obj2 = g(obj, i8, intValue, obj2, a52);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC5042v4.m(intValue2)) {
                    obj2 = g(obj, i8, intValue2, obj2, a52);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void i(int i8, List list, S5 s52) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.N(i8, list);
    }

    public static void j(int i8, List list, S5 s52, InterfaceC4964l5 interfaceC4964l5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.s(i8, list, interfaceC4964l5);
    }

    public static void k(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.p(i8, list, z7);
    }

    static void l(AbstractC4919g4 abstractC4919g4, Object obj, Object obj2) {
        C4955k4 b8 = abstractC4919g4.b(obj2);
        if (b8.f29384a.isEmpty()) {
            return;
        }
        abstractC4919g4.e(obj).f(b8);
    }

    static void m(O4 o42, Object obj, Object obj2, long j8) {
        B5.j(obj, j8, o42.f(B5.B(obj, j8), B5.B(obj2, j8)));
    }

    static void n(A5 a52, Object obj, Object obj2) {
        a52.j(obj, a52.b(a52.k(obj), a52.k(obj2)));
    }

    public static void o(Class cls) {
        AbstractC5010r4.class.isAssignableFrom(cls);
    }

    static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int q(int i8, List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int s02 = zzjc.s0(i8) * size;
        if (list instanceof D4) {
            D4 d42 = (D4) list;
            while (i9 < size) {
                Object m8 = d42.m(i9);
                s02 += m8 instanceof K3 ? zzjc.A((K3) m8) : zzjc.C((String) m8);
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                s02 += obj instanceof K3 ? zzjc.A((K3) obj) : zzjc.C((String) obj);
                i9++;
            }
        }
        return s02;
    }

    static int r(int i8, List list, InterfaceC4964l5 interfaceC4964l5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s02 = zzjc.s0(i8) * size;
        for (int i9 = 0; i9 < size; i9++) {
            s02 += zzjc.g((W4) list.get(i9), interfaceC4964l5);
        }
        return s02;
    }

    static int s(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * zzjc.s0(i8));
    }

    static int t(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5034u4) {
            C5034u4 c5034u4 = (C5034u4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.X(c5034u4.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzjc.X(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void u(int i8, List list, S5 s52) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.I(i8, list);
    }

    public static void v(int i8, List list, S5 s52, InterfaceC4964l5 interfaceC4964l5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.k(i8, list, interfaceC4964l5);
    }

    public static void w(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.w(i8, list, z7);
    }

    static int x(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.h0(i8, 0);
    }

    static int y(List list) {
        return list.size() << 2;
    }

    public static void z(int i8, List list, S5 s52, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s52.a(i8, list, z7);
    }
}
