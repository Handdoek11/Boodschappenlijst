package com.google.android.gms.internal.play_billing;

import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5200u3 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5217x3 f30015a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30016b = 0;

    static {
        int i8 = C5171p3.f29965d;
        f30015a = new C5227z3();
    }

    public static void A(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.A(i8, list, z7);
    }

    public static void B(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.p(i8, list, z7);
    }

    public static void C(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.x(i8, list, z7);
    }

    public static void D(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.j(i8, list, z7);
    }

    public static void E(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.o(i8, list, z7);
    }

    public static void a(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.s(i8, list, z7);
    }

    public static void b(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.z(i8, list, z7);
    }

    public static void c(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.n(i8, list, z7);
    }

    public static void d(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.v(i8, list, z7);
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N2) {
            N2 n22 = (N2) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC5211w2.a(n22.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC5211w2.a(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    static int g(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC5211w2.z(i8 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC5211w2.z(i8 << 3) + 8);
    }

    static int j(List list) {
        return list.size() * 8;
    }

    static int k(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N2) {
            N2 n22 = (N2) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC5211w2.a(n22.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC5211w2.a(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof X2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += AbstractC5211w2.a(((Long) list.get(i9)).longValue());
        }
        return i8;
    }

    static int m(int i8, Object obj, InterfaceC5188s3 interfaceC5188s3) {
        return AbstractC5211w2.z(i8 << 3) + AbstractC5211w2.x((InterfaceC5123h3) obj, interfaceC5188s3);
    }

    static int n(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N2) {
            N2 n22 = (N2) list;
            i8 = 0;
            while (i9 < size) {
                int c8 = n22.c(i9);
                i8 += AbstractC5211w2.z((c8 >> 31) ^ (c8 + c8));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i8 += AbstractC5211w2.z((intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
        }
        return i8;
    }

    static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof X2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            long longValue = ((Long) list.get(i9)).longValue();
            i8 += AbstractC5211w2.a((longValue >> 63) ^ (longValue + longValue));
        }
        return i8;
    }

    static int p(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof N2) {
            N2 n22 = (N2) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC5211w2.z(n22.c(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC5211w2.z(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof X2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += AbstractC5211w2.a(((Long) list.get(i9)).longValue());
        }
        return i8;
    }

    public static AbstractC5217x3 r() {
        return f30015a;
    }

    static Object s(Object obj, int i8, int i9, Object obj2, AbstractC5217x3 abstractC5217x3) {
        Object obj3 = obj2;
        if (obj2 == null) {
            M2 m22 = (M2) obj;
            C5222y3 c5222y3 = m22.zzc;
            obj3 = c5222y3;
            if (c5222y3 == C5222y3.c()) {
                C5222y3 f8 = C5222y3.f();
                m22.zzc = f8;
                obj3 = f8;
            }
        }
        ((C5222y3) obj3).j(i8 << 3, Long.valueOf(i9));
        return obj3;
    }

    static void t(C2 c22, Object obj, Object obj2) {
        androidx.appcompat.app.E.a(obj2);
        throw null;
    }

    static void u(AbstractC5217x3 abstractC5217x3, Object obj, Object obj2) {
        M2 m22 = (M2) obj;
        C5222y3 c5222y3 = m22.zzc;
        C5222y3 c5222y32 = ((M2) obj2).zzc;
        if (!C5222y3.c().equals(c5222y32)) {
            if (C5222y3.c().equals(c5222y3)) {
                c5222y3 = C5222y3.e(c5222y3, c5222y32);
            } else {
                c5222y3.d(c5222y32);
            }
        }
        m22.zzc = c5222y3;
    }

    public static void v(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.a(i8, list, z7);
    }

    public static void w(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.f(i8, list, z7);
    }

    public static void x(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.c(i8, list, z7);
    }

    public static void y(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.b(i8, list, z7);
    }

    public static void z(int i8, List list, I3 i32, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i32.e(i8, list, z7);
    }
}
