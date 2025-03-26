package com.google.android.gms.internal.wearable;

import java.util.List;

/* loaded from: classes2.dex */
abstract class W0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Y0 f30102a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30103b = 0;

    static {
        int i8 = R0.f30084d;
        f30102a = new C5230a1();
    }

    public static void A(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.A(i8, list, z7);
    }

    public static void B(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.p(i8, list, z7);
    }

    public static void C(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.x(i8, list, z7);
    }

    public static void D(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.j(i8, list, z7);
    }

    public static void E(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.o(i8, list, z7);
    }

    public static void a(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.s(i8, list, z7);
    }

    public static void b(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.z(i8, list, z7);
    }

    public static void c(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.n(i8, list, z7);
    }

    public static void d(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.v(i8, list, z7);
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5260n0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += X.a(((Integer) list.get(i9)).intValue());
        }
        return i8;
    }

    static int g(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (X.z(i8 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (X.z(i8 << 3) + 8);
    }

    static int j(List list) {
        return list.size() * 8;
    }

    static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5260n0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += X.a(((Integer) list.get(i9)).intValue());
        }
        return i8;
    }

    static int l(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5281y0) {
            C5281y0 c5281y0 = (C5281y0) list;
            i8 = 0;
            while (i9 < size) {
                i8 += X.a(c5281y0.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += X.a(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    static int m(int i8, Object obj, U0 u02) {
        return X.z(i8 << 3) + X.x((I0) obj, u02);
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5260n0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            int intValue = ((Integer) list.get(i9)).intValue();
            i8 += X.z((intValue >> 31) ^ (intValue + intValue));
        }
        return i8;
    }

    static int o(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5281y0) {
            C5281y0 c5281y0 = (C5281y0) list;
            i8 = 0;
            while (i9 < size) {
                long c8 = c5281y0.c(i9);
                i8 += X.a((c8 >> 63) ^ (c8 + c8));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                long longValue = ((Long) list.get(i9)).longValue();
                i8 += X.a((longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
        }
        return i8;
    }

    static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5260n0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += X.z(((Integer) list.get(i9)).intValue());
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
        if (list instanceof C5281y0) {
            C5281y0 c5281y0 = (C5281y0) list;
            i8 = 0;
            while (i9 < size) {
                i8 += X.a(c5281y0.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += X.a(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static Y0 r() {
        return f30102a;
    }

    static Object s(Object obj, int i8, int i9, Object obj2, Y0 y02) {
        Object obj3 = obj2;
        if (obj2 == null) {
            AbstractC5258m0 abstractC5258m0 = (AbstractC5258m0) obj;
            Z0 z02 = abstractC5258m0.zzc;
            obj3 = z02;
            if (z02 == Z0.c()) {
                Z0 f8 = Z0.f();
                abstractC5258m0.zzc = f8;
                obj3 = f8;
            }
        }
        ((Z0) obj3).j(i8 << 3, Long.valueOf(i9));
        return obj3;
    }

    static void t(AbstractC5241e0 abstractC5241e0, Object obj, Object obj2) {
        androidx.appcompat.app.E.a(obj2);
        throw null;
    }

    static void u(Y0 y02, Object obj, Object obj2) {
        AbstractC5258m0 abstractC5258m0 = (AbstractC5258m0) obj;
        Z0 z02 = abstractC5258m0.zzc;
        Z0 z03 = ((AbstractC5258m0) obj2).zzc;
        if (!Z0.c().equals(z03)) {
            if (Z0.c().equals(z02)) {
                z02 = Z0.e(z02, z03);
            } else {
                z02.d(z03);
            }
        }
        abstractC5258m0.zzc = z02;
    }

    public static void v(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.a(i8, list, z7);
    }

    public static void w(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.f(i8, list, z7);
    }

    public static void x(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.c(i8, list, z7);
    }

    public static void y(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.b(i8, list, z7);
    }

    public static void z(int i8, List list, k1 k1Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k1Var.e(i8, list, z7);
    }
}
