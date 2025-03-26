package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0899x;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.p0;
import com.google.android.gms.internal.ads.C1445Je;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class P implements c0 {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f9310r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f9311s = m0.B();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f9312a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f9313b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9314c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9315d;

    /* renamed from: e, reason: collision with root package name */
    private final M f9316e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9317f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9318g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9319h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f9320i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f9321j;

    /* renamed from: k, reason: collision with root package name */
    private final int f9322k;

    /* renamed from: l, reason: collision with root package name */
    private final int f9323l;

    /* renamed from: m, reason: collision with root package name */
    private final S f9324m;

    /* renamed from: n, reason: collision with root package name */
    private final C f9325n;

    /* renamed from: o, reason: collision with root package name */
    private final i0 f9326o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC0891o f9327p;

    /* renamed from: q, reason: collision with root package name */
    private final H f9328q;

    private P(int[] iArr, Object[] objArr, int i8, int i9, M m8, boolean z7, boolean z8, int[] iArr2, int i10, int i11, S s8, C c8, i0 i0Var, AbstractC0891o abstractC0891o, H h8) {
        this.f9312a = iArr;
        this.f9313b = objArr;
        this.f9314c = i8;
        this.f9315d = i9;
        this.f9318g = m8 instanceof AbstractC0897v;
        this.f9319h = z7;
        this.f9317f = abstractC0891o != null && abstractC0891o.e(m8);
        this.f9320i = z8;
        this.f9321j = iArr2;
        this.f9322k = i10;
        this.f9323l = i11;
        this.f9324m = s8;
        this.f9325n = c8;
        this.f9326o = i0Var;
        this.f9327p = abstractC0891o;
        this.f9316e = m8;
        this.f9328q = h8;
    }

    private boolean A(Object obj, int i8, int i9) {
        List list = (List) m0.A(obj, Q(i8));
        if (list.isEmpty()) {
            return true;
        }
        c0 r8 = r(i9);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!r8.d(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private boolean B(Object obj, int i8, int i9) {
        Map h8 = this.f9328q.h(m0.A(obj, Q(i8)));
        if (h8.isEmpty()) {
            return true;
        }
        if (this.f9328q.c(q(i9)).f9303c.a() != o0.c.MESSAGE) {
            return true;
        }
        c0 c0Var = null;
        for (Object obj2 : h8.values()) {
            if (c0Var == null) {
                c0Var = Y.a().c(obj2.getClass());
            }
            if (!c0Var.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    private boolean C(Object obj, Object obj2, int i8) {
        long X7 = X(i8) & 1048575;
        return m0.x(obj, X7) == m0.x(obj2, X7);
    }

    private boolean D(Object obj, int i8, int i9) {
        return m0.x(obj, (long) (X(i9) & 1048575)) == i8;
    }

    private static boolean E(int i8) {
        return (i8 & 268435456) != 0;
    }

    private static List F(Object obj, long j8) {
        return (List) m0.A(obj, j8);
    }

    private static long G(Object obj, long j8) {
        return m0.y(obj, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:343:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r0 = r16.f9322k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r0 >= r16.f9323l) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        r13 = n(r19, r16.f9321j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r13 == null) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H(androidx.datastore.preferences.protobuf.i0 r17, androidx.datastore.preferences.protobuf.AbstractC0891o r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.b0 r20, androidx.datastore.preferences.protobuf.C0890n r21) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.H(androidx.datastore.preferences.protobuf.i0, androidx.datastore.preferences.protobuf.o, java.lang.Object, androidx.datastore.preferences.protobuf.b0, androidx.datastore.preferences.protobuf.n):void");
    }

    private final void I(Object obj, int i8, Object obj2, C0890n c0890n, b0 b0Var) {
        long Q7 = Q(h0(i8));
        Object A7 = m0.A(obj, Q7);
        if (A7 == null) {
            A7 = this.f9328q.e(obj2);
            m0.O(obj, Q7, A7);
        } else if (this.f9328q.g(A7)) {
            Object e8 = this.f9328q.e(obj2);
            this.f9328q.a(e8, A7);
            m0.O(obj, Q7, e8);
            A7 = e8;
        }
        b0Var.r(this.f9328q.d(A7), this.f9328q.c(obj2), c0890n);
    }

    private void J(Object obj, Object obj2, int i8) {
        long Q7 = Q(h0(i8));
        if (x(obj2, i8)) {
            Object A7 = m0.A(obj, Q7);
            Object A8 = m0.A(obj2, Q7);
            if (A7 != null && A8 != null) {
                m0.O(obj, Q7, AbstractC0899x.h(A7, A8));
                d0(obj, i8);
            } else if (A8 != null) {
                m0.O(obj, Q7, A8);
                d0(obj, i8);
            }
        }
    }

    private void K(Object obj, Object obj2, int i8) {
        int h02 = h0(i8);
        int P7 = P(i8);
        long Q7 = Q(h02);
        if (D(obj2, P7, i8)) {
            Object A7 = m0.A(obj, Q7);
            Object A8 = m0.A(obj2, Q7);
            if (A7 != null && A8 != null) {
                m0.O(obj, Q7, AbstractC0899x.h(A7, A8));
                e0(obj, P7, i8);
            } else if (A8 != null) {
                m0.O(obj, Q7, A8);
                e0(obj, P7, i8);
            }
        }
    }

    private void L(Object obj, Object obj2, int i8) {
        int h02 = h0(i8);
        long Q7 = Q(h02);
        int P7 = P(i8);
        switch (g0(h02)) {
            case 0:
                if (x(obj2, i8)) {
                    m0.K(obj, Q7, m0.v(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 1:
                if (x(obj2, i8)) {
                    m0.L(obj, Q7, m0.w(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 2:
                if (x(obj2, i8)) {
                    m0.N(obj, Q7, m0.y(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 3:
                if (x(obj2, i8)) {
                    m0.N(obj, Q7, m0.y(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 4:
                if (x(obj2, i8)) {
                    m0.M(obj, Q7, m0.x(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 5:
                if (x(obj2, i8)) {
                    m0.N(obj, Q7, m0.y(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 6:
                if (x(obj2, i8)) {
                    m0.M(obj, Q7, m0.x(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 7:
                if (x(obj2, i8)) {
                    m0.E(obj, Q7, m0.p(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 8:
                if (x(obj2, i8)) {
                    m0.O(obj, Q7, m0.A(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 9:
                J(obj, obj2, i8);
                break;
            case 10:
                if (x(obj2, i8)) {
                    m0.O(obj, Q7, m0.A(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 11:
                if (x(obj2, i8)) {
                    m0.M(obj, Q7, m0.x(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 12:
                if (x(obj2, i8)) {
                    m0.M(obj, Q7, m0.x(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 13:
                if (x(obj2, i8)) {
                    m0.M(obj, Q7, m0.x(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 14:
                if (x(obj2, i8)) {
                    m0.N(obj, Q7, m0.y(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 15:
                if (x(obj2, i8)) {
                    m0.M(obj, Q7, m0.x(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 16:
                if (x(obj2, i8)) {
                    m0.N(obj, Q7, m0.y(obj2, Q7));
                    d0(obj, i8);
                    break;
                }
                break;
            case 17:
                J(obj, obj2, i8);
                break;
            case 18:
            case 19:
            case 20:
            case C1445Je.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f9325n.d(obj, obj2, Q7);
                break;
            case 50:
                e0.E(this.f9328q, obj, obj2, Q7);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (D(obj2, P7, i8)) {
                    m0.O(obj, Q7, m0.A(obj2, Q7));
                    e0(obj, P7, i8);
                    break;
                }
                break;
            case 60:
                K(obj, obj2, i8);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (D(obj2, P7, i8)) {
                    m0.O(obj, Q7, m0.A(obj2, Q7));
                    e0(obj, P7, i8);
                    break;
                }
                break;
            case 68:
                K(obj, obj2, i8);
                break;
        }
    }

    static P M(Class cls, K k8, S s8, C c8, i0 i0Var, AbstractC0891o abstractC0891o, H h8) {
        if (k8 instanceof a0) {
            return O((a0) k8, s8, c8, i0Var, abstractC0891o, h8);
        }
        androidx.appcompat.app.E.a(k8);
        return N(null, s8, c8, i0Var, abstractC0891o, h8);
    }

    static P N(g0 g0Var, S s8, C c8, i0 i0Var, AbstractC0891o abstractC0891o, H h8) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.datastore.preferences.protobuf.P O(androidx.datastore.preferences.protobuf.a0 r35, androidx.datastore.preferences.protobuf.S r36, androidx.datastore.preferences.protobuf.C r37, androidx.datastore.preferences.protobuf.i0 r38, androidx.datastore.preferences.protobuf.AbstractC0891o r39, androidx.datastore.preferences.protobuf.H r40) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.O(androidx.datastore.preferences.protobuf.a0, androidx.datastore.preferences.protobuf.S, androidx.datastore.preferences.protobuf.C, androidx.datastore.preferences.protobuf.i0, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.H):androidx.datastore.preferences.protobuf.P");
    }

    private int P(int i8) {
        return this.f9312a[i8];
    }

    private static long Q(int i8) {
        return i8 & 1048575;
    }

    private static boolean R(Object obj, long j8) {
        return ((Boolean) m0.A(obj, j8)).booleanValue();
    }

    private static double S(Object obj, long j8) {
        return ((Double) m0.A(obj, j8)).doubleValue();
    }

    private static float T(Object obj, long j8) {
        return ((Float) m0.A(obj, j8)).floatValue();
    }

    private static int U(Object obj, long j8) {
        return ((Integer) m0.A(obj, j8)).intValue();
    }

    private static long V(Object obj, long j8) {
        return ((Long) m0.A(obj, j8)).longValue();
    }

    private int W(int i8) {
        if (i8 < this.f9314c || i8 > this.f9315d) {
            return -1;
        }
        return f0(i8, 0);
    }

    private int X(int i8) {
        return this.f9312a[i8 + 2];
    }

    private void Y(Object obj, long j8, b0 b0Var, c0 c0Var, C0890n c0890n) {
        b0Var.E(this.f9325n.e(obj, j8), c0Var, c0890n);
    }

    private void Z(Object obj, int i8, b0 b0Var, c0 c0Var, C0890n c0890n) {
        b0Var.J(this.f9325n.e(obj, Q(i8)), c0Var, c0890n);
    }

    private void a0(Object obj, int i8, b0 b0Var) {
        if (w(i8)) {
            m0.O(obj, Q(i8), b0Var.L());
        } else if (this.f9318g) {
            m0.O(obj, Q(i8), b0Var.x());
        } else {
            m0.O(obj, Q(i8), b0Var.B());
        }
    }

    private void b0(Object obj, int i8, b0 b0Var) {
        if (w(i8)) {
            b0Var.A(this.f9325n.e(obj, Q(i8)));
        } else {
            b0Var.z(this.f9325n.e(obj, Q(i8)));
        }
    }

    private static Field c0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void d0(Object obj, int i8) {
        if (this.f9319h) {
            return;
        }
        int X7 = X(i8);
        long j8 = X7 & 1048575;
        m0.M(obj, j8, m0.x(obj, j8) | (1 << (X7 >>> 20)));
    }

    private void e0(Object obj, int i8, int i9) {
        m0.M(obj, X(i9) & 1048575, i8);
    }

    private int f0(int i8, int i9) {
        int length = (this.f9312a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int P7 = P(i11);
            if (i8 == P7) {
                return i11;
            }
            if (i8 < P7) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    private static int g0(int i8) {
        return (i8 & 267386880) >>> 20;
    }

    private int h0(int i8) {
        return this.f9312a[i8 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i0(java.lang.Object r18, androidx.datastore.preferences.protobuf.p0 r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.i0(java.lang.Object, androidx.datastore.preferences.protobuf.p0):void");
    }

    private boolean j(Object obj, Object obj2, int i8) {
        return x(obj, i8) == x(obj2, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j0(java.lang.Object r13, androidx.datastore.preferences.protobuf.p0 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.j0(java.lang.Object, androidx.datastore.preferences.protobuf.p0):void");
    }

    private static boolean k(Object obj, long j8) {
        return m0.p(obj, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void k0(java.lang.Object r11, androidx.datastore.preferences.protobuf.p0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.k0(java.lang.Object, androidx.datastore.preferences.protobuf.p0):void");
    }

    private static double l(Object obj, long j8) {
        return m0.v(obj, j8);
    }

    private void l0(p0 p0Var, int i8, Object obj, int i9) {
        if (obj != null) {
            p0Var.L(i8, this.f9328q.c(q(i9)), this.f9328q.h(obj));
        }
    }

    private boolean m(Object obj, Object obj2, int i8) {
        int h02 = h0(i8);
        long Q7 = Q(h02);
        switch (g0(h02)) {
            case 0:
                if (j(obj, obj2, i8) && Double.doubleToLongBits(m0.v(obj, Q7)) == Double.doubleToLongBits(m0.v(obj2, Q7))) {
                    break;
                }
                break;
            case 1:
                if (j(obj, obj2, i8) && Float.floatToIntBits(m0.w(obj, Q7)) == Float.floatToIntBits(m0.w(obj2, Q7))) {
                    break;
                }
                break;
            case 2:
                if (j(obj, obj2, i8) && m0.y(obj, Q7) == m0.y(obj2, Q7)) {
                    break;
                }
                break;
            case 3:
                if (j(obj, obj2, i8) && m0.y(obj, Q7) == m0.y(obj2, Q7)) {
                    break;
                }
                break;
            case 4:
                if (j(obj, obj2, i8) && m0.x(obj, Q7) == m0.x(obj2, Q7)) {
                    break;
                }
                break;
            case 5:
                if (j(obj, obj2, i8) && m0.y(obj, Q7) == m0.y(obj2, Q7)) {
                    break;
                }
                break;
            case 6:
                if (j(obj, obj2, i8) && m0.x(obj, Q7) == m0.x(obj2, Q7)) {
                    break;
                }
                break;
            case 7:
                if (j(obj, obj2, i8) && m0.p(obj, Q7) == m0.p(obj2, Q7)) {
                    break;
                }
                break;
            case 8:
                if (j(obj, obj2, i8) && e0.J(m0.A(obj, Q7), m0.A(obj2, Q7))) {
                    break;
                }
                break;
            case 9:
                if (j(obj, obj2, i8) && e0.J(m0.A(obj, Q7), m0.A(obj2, Q7))) {
                    break;
                }
                break;
            case 10:
                if (j(obj, obj2, i8) && e0.J(m0.A(obj, Q7), m0.A(obj2, Q7))) {
                    break;
                }
                break;
            case 11:
                if (j(obj, obj2, i8) && m0.x(obj, Q7) == m0.x(obj2, Q7)) {
                    break;
                }
                break;
            case 12:
                if (j(obj, obj2, i8) && m0.x(obj, Q7) == m0.x(obj2, Q7)) {
                    break;
                }
                break;
            case 13:
                if (j(obj, obj2, i8) && m0.x(obj, Q7) == m0.x(obj2, Q7)) {
                    break;
                }
                break;
            case 14:
                if (j(obj, obj2, i8) && m0.y(obj, Q7) == m0.y(obj2, Q7)) {
                    break;
                }
                break;
            case 15:
                if (j(obj, obj2, i8) && m0.x(obj, Q7) == m0.x(obj2, Q7)) {
                    break;
                }
                break;
            case 16:
                if (j(obj, obj2, i8) && m0.y(obj, Q7) == m0.y(obj2, Q7)) {
                    break;
                }
                break;
            case 17:
                if (j(obj, obj2, i8) && e0.J(m0.A(obj, Q7), m0.A(obj2, Q7))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (C(obj, obj2, i8) && e0.J(m0.A(obj, Q7), m0.A(obj2, Q7))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void m0(int i8, Object obj, p0 p0Var) {
        if (obj instanceof String) {
            p0Var.m(i8, (String) obj);
        } else {
            p0Var.w(i8, (AbstractC0883g) obj);
        }
    }

    private final Object n(Object obj, int i8, Object obj2, i0 i0Var) {
        P(i8);
        if (m0.A(obj, Q(h0(i8))) == null) {
            return obj2;
        }
        p(i8);
        return obj2;
    }

    private void n0(i0 i0Var, Object obj, p0 p0Var) {
        i0Var.t(i0Var.g(obj), p0Var);
    }

    private static float o(Object obj, long j8) {
        return m0.w(obj, j8);
    }

    private AbstractC0899x.a p(int i8) {
        androidx.appcompat.app.E.a(this.f9313b[((i8 / 3) * 2) + 1]);
        return null;
    }

    private Object q(int i8) {
        return this.f9313b[(i8 / 3) * 2];
    }

    private c0 r(int i8) {
        int i9 = (i8 / 3) * 2;
        c0 c0Var = (c0) this.f9313b[i9];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c8 = Y.a().c((Class) this.f9313b[i9 + 1]);
        this.f9313b[i9] = c8;
        return c8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int s(Object obj) {
        int i8;
        int i9;
        int h8;
        int c8;
        int F7;
        boolean z7;
        int f8;
        int i10;
        int P7;
        int R7;
        Unsafe unsafe = f9311s;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < this.f9312a.length) {
            int h02 = h0(i12);
            int P8 = P(i12);
            int g02 = g0(h02);
            if (g02 <= 17) {
                i8 = this.f9312a[i12 + 2];
                int i15 = 1048575 & i8;
                int i16 = 1 << (i8 >>> 20);
                if (i15 != i11) {
                    i14 = unsafe.getInt(obj, i15);
                    i11 = i15;
                }
                i9 = i16;
            } else {
                i8 = (!this.f9320i || g02 < EnumC0894s.f9542f0.a() || g02 > EnumC0894s.f9555s0.a()) ? 0 : this.f9312a[i12 + 2] & 1048575;
                i9 = 0;
            }
            long Q7 = Q(h02);
            int i17 = i11;
            switch (g02) {
                case 0:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        h8 = CodedOutputStream.h(P8, 0.0d);
                        i13 += h8;
                        break;
                    }
                case 1:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        h8 = CodedOutputStream.p(P8, 0.0f);
                        i13 += h8;
                        break;
                    }
                case 2:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        h8 = CodedOutputStream.w(P8, unsafe.getLong(obj, Q7));
                        i13 += h8;
                        break;
                    }
                case 3:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        h8 = CodedOutputStream.S(P8, unsafe.getLong(obj, Q7));
                        i13 += h8;
                        break;
                    }
                case 4:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        h8 = CodedOutputStream.u(P8, unsafe.getInt(obj, Q7));
                        i13 += h8;
                        break;
                    }
                case 5:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        h8 = CodedOutputStream.n(P8, 0L);
                        i13 += h8;
                        break;
                    }
                case 6:
                    if ((i14 & i9) != 0) {
                        h8 = CodedOutputStream.l(P8, 0);
                        i13 += h8;
                        break;
                    }
                    break;
                case 7:
                    if ((i14 & i9) != 0) {
                        c8 = CodedOutputStream.c(P8, true);
                        i13 += c8;
                    }
                    break;
                case 8:
                    if ((i14 & i9) != 0) {
                        Object object = unsafe.getObject(obj, Q7);
                        c8 = object instanceof AbstractC0883g ? CodedOutputStream.f(P8, (AbstractC0883g) object) : CodedOutputStream.N(P8, (String) object);
                        i13 += c8;
                    }
                    break;
                case 9:
                    if ((i14 & i9) != 0) {
                        c8 = e0.o(P8, unsafe.getObject(obj, Q7), r(i12));
                        i13 += c8;
                    }
                    break;
                case 10:
                    if ((i14 & i9) != 0) {
                        c8 = CodedOutputStream.f(P8, (AbstractC0883g) unsafe.getObject(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 11:
                    if ((i14 & i9) != 0) {
                        c8 = CodedOutputStream.Q(P8, unsafe.getInt(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 12:
                    if ((i14 & i9) != 0) {
                        c8 = CodedOutputStream.j(P8, unsafe.getInt(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 13:
                    if ((i14 & i9) != 0) {
                        F7 = CodedOutputStream.F(P8, 0);
                        i13 += F7;
                    }
                    break;
                case 14:
                    if ((i14 & i9) != 0) {
                        c8 = CodedOutputStream.H(P8, 0L);
                        i13 += c8;
                    }
                    break;
                case 15:
                    if ((i14 & i9) != 0) {
                        c8 = CodedOutputStream.J(P8, unsafe.getInt(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 16:
                    if ((i14 & i9) != 0) {
                        c8 = CodedOutputStream.L(P8, unsafe.getLong(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 17:
                    if ((i14 & i9) != 0) {
                        c8 = CodedOutputStream.r(P8, (M) unsafe.getObject(obj, Q7), r(i12));
                        i13 += c8;
                    }
                    break;
                case 18:
                    c8 = e0.h(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += c8;
                    break;
                case 19:
                    z7 = false;
                    f8 = e0.f(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 20:
                    z7 = false;
                    f8 = e0.m(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case C1445Je.zzm /* 21 */:
                    z7 = false;
                    f8 = e0.x(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 22:
                    z7 = false;
                    f8 = e0.k(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 23:
                    z7 = false;
                    f8 = e0.h(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 24:
                    z7 = false;
                    f8 = e0.f(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 25:
                    z7 = false;
                    f8 = e0.a(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 26:
                    c8 = e0.u(P8, (List) unsafe.getObject(obj, Q7));
                    i13 += c8;
                    break;
                case 27:
                    c8 = e0.p(P8, (List) unsafe.getObject(obj, Q7), r(i12));
                    i13 += c8;
                    break;
                case 28:
                    c8 = e0.c(P8, (List) unsafe.getObject(obj, Q7));
                    i13 += c8;
                    break;
                case 29:
                    c8 = e0.v(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += c8;
                    break;
                case 30:
                    z7 = false;
                    f8 = e0.d(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 31:
                    z7 = false;
                    f8 = e0.f(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 32:
                    z7 = false;
                    f8 = e0.h(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 33:
                    z7 = false;
                    f8 = e0.q(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 34:
                    z7 = false;
                    f8 = e0.s(P8, (List) unsafe.getObject(obj, Q7), false);
                    i13 += f8;
                    break;
                case 35:
                    i10 = e0.i((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 36:
                    i10 = e0.g((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 37:
                    i10 = e0.n((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 38:
                    i10 = e0.y((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 39:
                    i10 = e0.l((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 40:
                    i10 = e0.i((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 41:
                    i10 = e0.g((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 42:
                    i10 = e0.b((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 43:
                    i10 = e0.w((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 44:
                    i10 = e0.e((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 45:
                    i10 = e0.g((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 46:
                    i10 = e0.i((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 47:
                    i10 = e0.r((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 48:
                    i10 = e0.t((List) unsafe.getObject(obj, Q7));
                    if (i10 > 0) {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i10);
                        F7 = P7 + R7 + i10;
                        i13 += F7;
                    }
                    break;
                case 49:
                    c8 = e0.j(P8, (List) unsafe.getObject(obj, Q7), r(i12));
                    i13 += c8;
                    break;
                case 50:
                    c8 = this.f9328q.f(P8, unsafe.getObject(obj, Q7), q(i12));
                    i13 += c8;
                    break;
                case 51:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.h(P8, 0.0d);
                        i13 += c8;
                    }
                    break;
                case 52:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.p(P8, 0.0f);
                        i13 += c8;
                    }
                    break;
                case 53:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.w(P8, V(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 54:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.S(P8, V(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 55:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.u(P8, U(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 56:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.n(P8, 0L);
                        i13 += c8;
                    }
                    break;
                case 57:
                    if (D(obj, P8, i12)) {
                        F7 = CodedOutputStream.l(P8, 0);
                        i13 += F7;
                    }
                    break;
                case 58:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.c(P8, true);
                        i13 += c8;
                    }
                    break;
                case 59:
                    if (D(obj, P8, i12)) {
                        Object object2 = unsafe.getObject(obj, Q7);
                        c8 = object2 instanceof AbstractC0883g ? CodedOutputStream.f(P8, (AbstractC0883g) object2) : CodedOutputStream.N(P8, (String) object2);
                        i13 += c8;
                    }
                    break;
                case 60:
                    if (D(obj, P8, i12)) {
                        c8 = e0.o(P8, unsafe.getObject(obj, Q7), r(i12));
                        i13 += c8;
                    }
                    break;
                case 61:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.f(P8, (AbstractC0883g) unsafe.getObject(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 62:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.Q(P8, U(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 63:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.j(P8, U(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 64:
                    if (D(obj, P8, i12)) {
                        F7 = CodedOutputStream.F(P8, 0);
                        i13 += F7;
                    }
                    break;
                case 65:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.H(P8, 0L);
                        i13 += c8;
                    }
                    break;
                case 66:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.J(P8, U(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 67:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.L(P8, V(obj, Q7));
                        i13 += c8;
                    }
                    break;
                case 68:
                    if (D(obj, P8, i12)) {
                        c8 = CodedOutputStream.r(P8, (M) unsafe.getObject(obj, Q7), r(i12));
                        i13 += c8;
                    }
                    break;
            }
            i12 += 3;
            i11 = i17;
        }
        int u7 = i13 + u(this.f9326o, obj);
        return this.f9317f ? u7 + this.f9327p.c(obj).h() : u7;
    }

    private int t(Object obj) {
        int h8;
        int i8;
        int P7;
        int R7;
        Unsafe unsafe = f9311s;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f9312a.length; i10 += 3) {
            int h02 = h0(i10);
            int g02 = g0(h02);
            int P8 = P(i10);
            long Q7 = Q(h02);
            int i11 = (g02 < EnumC0894s.f9542f0.a() || g02 > EnumC0894s.f9555s0.a()) ? 0 : this.f9312a[i10 + 2] & 1048575;
            switch (g02) {
                case 0:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.h(P8, 0.0d);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.p(P8, 0.0f);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.w(P8, m0.y(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.S(P8, m0.y(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.u(P8, m0.x(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.n(P8, 0L);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.l(P8, 0);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.c(P8, true);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (x(obj, i10)) {
                        Object A7 = m0.A(obj, Q7);
                        h8 = A7 instanceof AbstractC0883g ? CodedOutputStream.f(P8, (AbstractC0883g) A7) : CodedOutputStream.N(P8, (String) A7);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (x(obj, i10)) {
                        h8 = e0.o(P8, m0.A(obj, Q7), r(i10));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.f(P8, (AbstractC0883g) m0.A(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.Q(P8, m0.x(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.j(P8, m0.x(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.F(P8, 0);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.H(P8, 0L);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.J(P8, m0.x(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.L(P8, m0.y(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (x(obj, i10)) {
                        h8 = CodedOutputStream.r(P8, (M) m0.A(obj, Q7), r(i10));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h8 = e0.h(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 19:
                    h8 = e0.f(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 20:
                    h8 = e0.m(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case C1445Je.zzm /* 21 */:
                    h8 = e0.x(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 22:
                    h8 = e0.k(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 23:
                    h8 = e0.h(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 24:
                    h8 = e0.f(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 25:
                    h8 = e0.a(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 26:
                    h8 = e0.u(P8, F(obj, Q7));
                    i9 += h8;
                    break;
                case 27:
                    h8 = e0.p(P8, F(obj, Q7), r(i10));
                    i9 += h8;
                    break;
                case 28:
                    h8 = e0.c(P8, F(obj, Q7));
                    i9 += h8;
                    break;
                case 29:
                    h8 = e0.v(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 30:
                    h8 = e0.d(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 31:
                    h8 = e0.f(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 32:
                    h8 = e0.h(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 33:
                    h8 = e0.q(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 34:
                    h8 = e0.s(P8, F(obj, Q7), false);
                    i9 += h8;
                    break;
                case 35:
                    i8 = e0.i((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 36:
                    i8 = e0.g((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 37:
                    i8 = e0.n((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 38:
                    i8 = e0.y((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 39:
                    i8 = e0.l((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 40:
                    i8 = e0.i((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 41:
                    i8 = e0.g((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 42:
                    i8 = e0.b((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 43:
                    i8 = e0.w((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 44:
                    i8 = e0.e((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 45:
                    i8 = e0.g((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 46:
                    i8 = e0.i((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 47:
                    i8 = e0.r((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 48:
                    i8 = e0.t((List) unsafe.getObject(obj, Q7));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f9320i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        P7 = CodedOutputStream.P(P8);
                        R7 = CodedOutputStream.R(i8);
                        h8 = P7 + R7 + i8;
                        i9 += h8;
                        break;
                    }
                case 49:
                    h8 = e0.j(P8, F(obj, Q7), r(i10));
                    i9 += h8;
                    break;
                case 50:
                    h8 = this.f9328q.f(P8, m0.A(obj, Q7), q(i10));
                    i9 += h8;
                    break;
                case 51:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.h(P8, 0.0d);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.p(P8, 0.0f);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.w(P8, V(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.S(P8, V(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.u(P8, U(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.n(P8, 0L);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.l(P8, 0);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.c(P8, true);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (D(obj, P8, i10)) {
                        Object A8 = m0.A(obj, Q7);
                        h8 = A8 instanceof AbstractC0883g ? CodedOutputStream.f(P8, (AbstractC0883g) A8) : CodedOutputStream.N(P8, (String) A8);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (D(obj, P8, i10)) {
                        h8 = e0.o(P8, m0.A(obj, Q7), r(i10));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.f(P8, (AbstractC0883g) m0.A(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.Q(P8, U(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.j(P8, U(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.F(P8, 0);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.H(P8, 0L);
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.J(P8, U(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.L(P8, V(obj, Q7));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (D(obj, P8, i10)) {
                        h8 = CodedOutputStream.r(P8, (M) m0.A(obj, Q7), r(i10));
                        i9 += h8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i9 + u(this.f9326o, obj);
    }

    private int u(i0 i0Var, Object obj) {
        return i0Var.h(i0Var.g(obj));
    }

    private static int v(Object obj, long j8) {
        return m0.x(obj, j8);
    }

    private static boolean w(int i8) {
        return (i8 & 536870912) != 0;
    }

    private boolean x(Object obj, int i8) {
        if (!this.f9319h) {
            int X7 = X(i8);
            return (m0.x(obj, (long) (X7 & 1048575)) & (1 << (X7 >>> 20))) != 0;
        }
        int h02 = h0(i8);
        long Q7 = Q(h02);
        switch (g0(h02)) {
            case 0:
                return m0.v(obj, Q7) != 0.0d;
            case 1:
                return m0.w(obj, Q7) != 0.0f;
            case 2:
                return m0.y(obj, Q7) != 0;
            case 3:
                return m0.y(obj, Q7) != 0;
            case 4:
                return m0.x(obj, Q7) != 0;
            case 5:
                return m0.y(obj, Q7) != 0;
            case 6:
                return m0.x(obj, Q7) != 0;
            case 7:
                return m0.p(obj, Q7);
            case 8:
                Object A7 = m0.A(obj, Q7);
                if (A7 instanceof String) {
                    return !((String) A7).isEmpty();
                }
                if (A7 instanceof AbstractC0883g) {
                    return !AbstractC0883g.f9378s.equals(A7);
                }
                throw new IllegalArgumentException();
            case 9:
                return m0.A(obj, Q7) != null;
            case 10:
                return !AbstractC0883g.f9378s.equals(m0.A(obj, Q7));
            case 11:
                return m0.x(obj, Q7) != 0;
            case 12:
                return m0.x(obj, Q7) != 0;
            case 13:
                return m0.x(obj, Q7) != 0;
            case 14:
                return m0.y(obj, Q7) != 0;
            case 15:
                return m0.x(obj, Q7) != 0;
            case 16:
                return m0.y(obj, Q7) != 0;
            case 17:
                return m0.A(obj, Q7) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean y(Object obj, int i8, int i9, int i10) {
        return this.f9319h ? x(obj, i8) : (i9 & i10) != 0;
    }

    private static boolean z(Object obj, int i8, c0 c0Var) {
        return c0Var.d(m0.A(obj, Q(i8)));
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i8 = 0; i8 < this.f9312a.length; i8 += 3) {
            L(obj, obj2, i8);
        }
        if (this.f9319h) {
            return;
        }
        e0.F(this.f9326o, obj, obj2);
        if (this.f9317f) {
            e0.D(this.f9327p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void b(Object obj, b0 b0Var, C0890n c0890n) {
        c0890n.getClass();
        H(this.f9326o, this.f9327p, obj, b0Var, c0890n);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void c(Object obj) {
        int i8;
        int i9 = this.f9322k;
        while (true) {
            i8 = this.f9323l;
            if (i9 >= i8) {
                break;
            }
            long Q7 = Q(h0(this.f9321j[i9]));
            Object A7 = m0.A(obj, Q7);
            if (A7 != null) {
                m0.O(obj, Q7, this.f9328q.b(A7));
            }
            i9++;
        }
        int length = this.f9321j.length;
        while (i8 < length) {
            this.f9325n.c(obj, this.f9321j[i8]);
            i8++;
        }
        this.f9326o.j(obj);
        if (this.f9317f) {
            this.f9327p.f(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // androidx.datastore.preferences.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = -1
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r12.f9322k
            r5 = 1
            if (r2 >= r4) goto L94
            int[] r4 = r12.f9321j
            r4 = r4[r2]
            int r6 = r12.P(r4)
            int r7 = r12.h0(r4)
            boolean r8 = r12.f9319h
            if (r8 != 0) goto L31
            int[] r8 = r12.f9312a
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r5 = r5 << r8
            if (r9 == r0) goto L32
            sun.misc.Unsafe r0 = androidx.datastore.preferences.protobuf.P.f9311s
            long r10 = (long) r9
            int r3 = r0.getInt(r13, r10)
            r0 = r9
            goto L32
        L31:
            r5 = r1
        L32:
            boolean r8 = E(r7)
            if (r8 == 0) goto L3f
            boolean r8 = r12.y(r13, r4, r3, r5)
            if (r8 != 0) goto L3f
            return r1
        L3f:
            int r8 = g0(r7)
            r9 = 9
            if (r8 == r9) goto L7f
            r9 = 17
            if (r8 == r9) goto L7f
            r5 = 27
            if (r8 == r5) goto L78
            r5 = 60
            if (r8 == r5) goto L67
            r5 = 68
            if (r8 == r5) goto L67
            r5 = 49
            if (r8 == r5) goto L78
            r5 = 50
            if (r8 == r5) goto L60
            goto L90
        L60:
            boolean r4 = r12.B(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L67:
            boolean r5 = r12.D(r13, r6, r4)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.c0 r4 = r12.r(r4)
            boolean r4 = z(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L78:
            boolean r4 = r12.A(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L7f:
            boolean r5 = r12.y(r13, r4, r3, r5)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.c0 r4 = r12.r(r4)
            boolean r4 = z(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L90:
            int r2 = r2 + 1
            goto L4
        L94:
            boolean r0 = r12.f9317f
            if (r0 == 0) goto La5
            androidx.datastore.preferences.protobuf.o r0 = r12.f9327p
            androidx.datastore.preferences.protobuf.r r13 = r0.c(r13)
            boolean r13 = r13.k()
            if (r13 != 0) goto La5
            return r1
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.d(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public void e(Object obj, p0 p0Var) {
        if (p0Var.i() == p0.a.DESCENDING) {
            k0(obj, p0Var);
        } else if (this.f9319h) {
            j0(obj, p0Var);
        } else {
            i0(obj, p0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public boolean f(Object obj, Object obj2) {
        int length = this.f9312a.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            if (!m(obj, obj2, i8)) {
                return false;
            }
        }
        if (!this.f9326o.g(obj).equals(this.f9326o.g(obj2))) {
            return false;
        }
        if (this.f9317f) {
            return this.f9327p.c(obj).equals(this.f9327p.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int g(Object obj) {
        return this.f9319h ? t(obj) : s(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public Object h() {
        return this.f9324m.a(this.f9316e);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public int i(Object obj) {
        int i8;
        int f8;
        int length = this.f9312a.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int h02 = h0(i10);
            int P7 = P(i10);
            long Q7 = Q(h02);
            int i11 = 37;
            switch (g0(h02)) {
                case 0:
                    i8 = i9 * 53;
                    f8 = AbstractC0899x.f(Double.doubleToLongBits(m0.v(obj, Q7)));
                    i9 = i8 + f8;
                    break;
                case 1:
                    i8 = i9 * 53;
                    f8 = Float.floatToIntBits(m0.w(obj, Q7));
                    i9 = i8 + f8;
                    break;
                case 2:
                    i8 = i9 * 53;
                    f8 = AbstractC0899x.f(m0.y(obj, Q7));
                    i9 = i8 + f8;
                    break;
                case 3:
                    i8 = i9 * 53;
                    f8 = AbstractC0899x.f(m0.y(obj, Q7));
                    i9 = i8 + f8;
                    break;
                case 4:
                    i8 = i9 * 53;
                    f8 = m0.x(obj, Q7);
                    i9 = i8 + f8;
                    break;
                case 5:
                    i8 = i9 * 53;
                    f8 = AbstractC0899x.f(m0.y(obj, Q7));
                    i9 = i8 + f8;
                    break;
                case 6:
                    i8 = i9 * 53;
                    f8 = m0.x(obj, Q7);
                    i9 = i8 + f8;
                    break;
                case 7:
                    i8 = i9 * 53;
                    f8 = AbstractC0899x.c(m0.p(obj, Q7));
                    i9 = i8 + f8;
                    break;
                case 8:
                    i8 = i9 * 53;
                    f8 = ((String) m0.A(obj, Q7)).hashCode();
                    i9 = i8 + f8;
                    break;
                case 9:
                    Object A7 = m0.A(obj, Q7);
                    if (A7 != null) {
                        i11 = A7.hashCode();
                    }
                    i9 = (i9 * 53) + i11;
                    break;
                case 10:
                    i8 = i9 * 53;
                    f8 = m0.A(obj, Q7).hashCode();
                    i9 = i8 + f8;
                    break;
                case 11:
                    i8 = i9 * 53;
                    f8 = m0.x(obj, Q7);
                    i9 = i8 + f8;
                    break;
                case 12:
                    i8 = i9 * 53;
                    f8 = m0.x(obj, Q7);
                    i9 = i8 + f8;
                    break;
                case 13:
                    i8 = i9 * 53;
                    f8 = m0.x(obj, Q7);
                    i9 = i8 + f8;
                    break;
                case 14:
                    i8 = i9 * 53;
                    f8 = AbstractC0899x.f(m0.y(obj, Q7));
                    i9 = i8 + f8;
                    break;
                case 15:
                    i8 = i9 * 53;
                    f8 = m0.x(obj, Q7);
                    i9 = i8 + f8;
                    break;
                case 16:
                    i8 = i9 * 53;
                    f8 = AbstractC0899x.f(m0.y(obj, Q7));
                    i9 = i8 + f8;
                    break;
                case 17:
                    Object A8 = m0.A(obj, Q7);
                    if (A8 != null) {
                        i11 = A8.hashCode();
                    }
                    i9 = (i9 * 53) + i11;
                    break;
                case 18:
                case 19:
                case 20:
                case C1445Je.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i8 = i9 * 53;
                    f8 = m0.A(obj, Q7).hashCode();
                    i9 = i8 + f8;
                    break;
                case 50:
                    i8 = i9 * 53;
                    f8 = m0.A(obj, Q7).hashCode();
                    i9 = i8 + f8;
                    break;
                case 51:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = AbstractC0899x.f(Double.doubleToLongBits(S(obj, Q7)));
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = Float.floatToIntBits(T(obj, Q7));
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = AbstractC0899x.f(V(obj, Q7));
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = AbstractC0899x.f(V(obj, Q7));
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = U(obj, Q7);
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = AbstractC0899x.f(V(obj, Q7));
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = U(obj, Q7);
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = AbstractC0899x.c(R(obj, Q7));
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = ((String) m0.A(obj, Q7)).hashCode();
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = m0.A(obj, Q7).hashCode();
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = m0.A(obj, Q7).hashCode();
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = U(obj, Q7);
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = U(obj, Q7);
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = U(obj, Q7);
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = AbstractC0899x.f(V(obj, Q7));
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = U(obj, Q7);
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = AbstractC0899x.f(V(obj, Q7));
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (D(obj, P7, i10)) {
                        i8 = i9 * 53;
                        f8 = m0.A(obj, Q7).hashCode();
                        i9 = i8 + f8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i9 * 53) + this.f9326o.g(obj).hashCode();
        return this.f9317f ? (hashCode * 53) + this.f9327p.c(obj).hashCode() : hashCode;
    }
}
