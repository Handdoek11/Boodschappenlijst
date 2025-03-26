package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0899x;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f9353a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final i0 f9354b = B(false);

    /* renamed from: c, reason: collision with root package name */
    private static final i0 f9355c = B(true);

    /* renamed from: d, reason: collision with root package name */
    private static final i0 f9356d = new k0();

    private static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static i0 B(boolean z7) {
        try {
            Class C7 = C();
            if (C7 == null) {
                return null;
            }
            return (i0) C7.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC0891o abstractC0891o, Object obj, Object obj2) {
        r c8 = abstractC0891o.c(obj2);
        if (c8.j()) {
            return;
        }
        abstractC0891o.d(obj).p(c8);
    }

    static void E(H h8, Object obj, Object obj2, long j8) {
        m0.O(obj, j8, h8.a(m0.A(obj, j8), m0.A(obj2, j8)));
    }

    static void F(i0 i0Var, Object obj, Object obj2) {
        i0Var.p(obj, i0Var.k(i0Var.g(obj), i0Var.g(obj2)));
    }

    public static i0 G() {
        return f9354b;
    }

    public static i0 H() {
        return f9355c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC0897v.class.isAssignableFrom(cls) && (cls2 = f9353a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object K(int i8, int i9, Object obj, i0 i0Var) {
        if (obj == null) {
            obj = i0Var.n();
        }
        i0Var.e(obj, i8, i9);
        return obj;
    }

    public static i0 L() {
        return f9356d;
    }

    public static void M(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.A(i8, list, z7);
    }

    public static void N(int i8, List list, p0 p0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.N(i8, list);
    }

    public static void O(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.K(i8, list, z7);
    }

    public static void P(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.J(i8, list, z7);
    }

    public static void Q(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.y(i8, list, z7);
    }

    public static void R(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.u(i8, list, z7);
    }

    public static void S(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.a(i8, list, z7);
    }

    public static void T(int i8, List list, p0 p0Var, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.l(i8, list, c0Var);
    }

    public static void U(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.o(i8, list, z7);
    }

    public static void V(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.I(i8, list, z7);
    }

    public static void W(int i8, List list, p0 p0Var, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.j(i8, list, c0Var);
    }

    public static void X(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.v(i8, list, z7);
    }

    public static void Y(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.f(i8, list, z7);
    }

    public static void Z(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.G(i8, list, z7);
    }

    static int a(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(size) : size * CodedOutputStream.c(i8, true);
    }

    public static void a0(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.C(i8, list, z7);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i8, List list, p0 p0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.k(i8, list);
    }

    static int c(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int P7 = size * CodedOutputStream.P(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            P7 += CodedOutputStream.g((AbstractC0883g) list.get(i9));
        }
        return P7;
    }

    public static void c0(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.B(i8, list, z7);
    }

    static int d(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e8 = e(list);
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(e8) : e8 + (size * CodedOutputStream.P(i8));
    }

    public static void d0(int i8, List list, p0 p0Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.g(i8, list, z7);
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0898w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += CodedOutputStream.k(((Integer) list.get(i9)).intValue());
        }
        return i8;
    }

    static int f(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(size * 4) : size * CodedOutputStream.l(i8, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(size * 8) : size * CodedOutputStream.n(i8, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i8, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += CodedOutputStream.r(i8, (M) list.get(i10), c0Var);
        }
        return i9;
    }

    static int k(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l8 = l(list);
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(l8) : l8 + (size * CodedOutputStream.P(i8));
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0898w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += CodedOutputStream.v(((Integer) list.get(i9)).intValue());
        }
        return i8;
    }

    static int m(int i8, List list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        int n8 = n(list);
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(n8) : n8 + (list.size() * CodedOutputStream.P(i8));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += CodedOutputStream.x(((Long) list.get(i9)).longValue());
        }
        return i8;
    }

    static int o(int i8, Object obj, c0 c0Var) {
        return CodedOutputStream.z(i8, (M) obj, c0Var);
    }

    static int p(int i8, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int P7 = CodedOutputStream.P(i8) * size;
        for (int i9 = 0; i9 < size; i9++) {
            P7 += CodedOutputStream.B((M) list.get(i9), c0Var);
        }
        return P7;
    }

    static int q(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r8 = r(list);
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(r8) : r8 + (size * CodedOutputStream.P(i8));
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0898w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += CodedOutputStream.K(((Integer) list.get(i9)).intValue());
        }
        return i8;
    }

    static int s(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t7 = t(list);
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(t7) : t7 + (size * CodedOutputStream.P(i8));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += CodedOutputStream.M(((Long) list.get(i9)).longValue());
        }
        return i8;
    }

    static int u(int i8, List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int P7 = CodedOutputStream.P(i8) * size;
        if (list instanceof B) {
            B b8 = (B) list;
            while (i9 < size) {
                Object p02 = b8.p0(i9);
                P7 += p02 instanceof AbstractC0883g ? CodedOutputStream.g((AbstractC0883g) p02) : CodedOutputStream.O((String) p02);
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                P7 += obj instanceof AbstractC0883g ? CodedOutputStream.g((AbstractC0883g) obj) : CodedOutputStream.O((String) obj);
                i9++;
            }
        }
        return P7;
    }

    static int v(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w7 = w(list);
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(w7) : w7 + (size * CodedOutputStream.P(i8));
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0898w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += CodedOutputStream.R(((Integer) list.get(i9)).intValue());
        }
        return i8;
    }

    static int x(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y7 = y(list);
        return z7 ? CodedOutputStream.P(i8) + CodedOutputStream.y(y7) : y7 + (size * CodedOutputStream.P(i8));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += CodedOutputStream.T(((Long) list.get(i9)).longValue());
        }
        return i8;
    }

    static Object z(int i8, List list, AbstractC0899x.a aVar, Object obj, i0 i0Var) {
        if (aVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) list.get(i10);
                int intValue = num.intValue();
                if (aVar.a(intValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    obj = K(i8, intValue, obj, i0Var);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!aVar.a(intValue2)) {
                    obj = K(i8, intValue2, obj, i0Var);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
