package com.headcode.ourgroceries.android;

import android.content.Context;
import com.headcode.ourgroceries.android.P1;
import j$.util.Objects;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t5.AbstractC6802d;
import t5.AbstractC6803e;
import t5.AbstractC6804f;

/* loaded from: classes2.dex */
public final class Z0 implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public static final Comparator f34616A;

    /* renamed from: B, reason: collision with root package name */
    public static final Comparator f34617B;

    /* renamed from: C, reason: collision with root package name */
    public static final Comparator f34618C;

    /* renamed from: D, reason: collision with root package name */
    public static final Comparator f34619D;

    /* renamed from: E, reason: collision with root package name */
    public static final Comparator f34620E;

    /* renamed from: u, reason: collision with root package name */
    private static Z0 f34621u;

    /* renamed from: v, reason: collision with root package name */
    public static final Comparator f34622v = P1.f34314f;

    /* renamed from: w, reason: collision with root package name */
    public static final Comparator f34623w = new Comparator() { // from class: com.headcode.ourgroceries.android.R0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Z0.Q((Z0) obj, (Z0) obj2);
        }
    };

    /* renamed from: x, reason: collision with root package name */
    public static final Comparator f34624x = new Comparator() { // from class: com.headcode.ourgroceries.android.S0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Z0.R((Z0) obj, (Z0) obj2);
        }
    };

    /* renamed from: y, reason: collision with root package name */
    public static final Comparator f34625y;

    /* renamed from: z, reason: collision with root package name */
    public static final Comparator f34626z;

    /* renamed from: o, reason: collision with root package name */
    private final s5.N f34627o;

    /* renamed from: s, reason: collision with root package name */
    private final String f34628s;

    /* renamed from: t, reason: collision with root package name */
    private String f34629t;

    public class a {
        public a() {
        }

        private String a() {
            return Z0.this.t();
        }

        private String b() {
            return Z0.this.y();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a().equals(aVar.a()) && b().equals(aVar.b());
        }

        public int hashCode() {
            return Objects.hash(a(), b());
        }
    }

    public static class b implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        private final Map f34631o;

        public b(Map map) {
            this.f34631o = map;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Z0 z02, Z0 z03) {
            Z0 z04 = (Z0) this.f34631o.get(z02.m());
            Z0 z05 = (Z0) this.f34631o.get(z03.m());
            int r8 = z04 == null ? 1 : z04.r();
            int r9 = z05 == null ? 1 : z05.r();
            if (r8 < r9) {
                return 1;
            }
            if (r8 > r9) {
                return -1;
            }
            long x7 = z04 == null ? 0L : z04.x();
            long x8 = z05 != null ? z05.x() : 0L;
            if (x7 < x8) {
                return 1;
            }
            if (x7 > x8) {
                return -1;
            }
            return z02.compareTo(z03);
        }
    }

    static {
        Comparator comparator = new Comparator() { // from class: com.headcode.ourgroceries.android.T0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Z0.S((Z0) obj, (Z0) obj2);
            }
        };
        f34625y = comparator;
        f34626z = new Comparator() { // from class: com.headcode.ourgroceries.android.U0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Z0.T((Z0) obj, (Z0) obj2);
            }
        };
        f34616A = new P1.d(comparator);
        f34617B = new Comparator() { // from class: com.headcode.ourgroceries.android.V0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Z0.U((Z0) obj, (Z0) obj2);
            }
        };
        f34618C = new Comparator() { // from class: com.headcode.ourgroceries.android.W0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Z0.V((Z0) obj, (Z0) obj2);
            }
        };
        f34619D = new Comparator() { // from class: com.headcode.ourgroceries.android.X0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Z0.W((Z0) obj, (Z0) obj2);
            }
        };
        f34620E = new Comparator() { // from class: com.headcode.ourgroceries.android.Y0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Z0.X((Z0) obj, (Z0) obj2);
            }
        };
    }

    public Z0(String str) {
        this(str, AbstractC6804f.a());
    }

    public static Z0 F() {
        return f34621u;
    }

    public static int M(List list, String str) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((Z0) list.get(i8)).w().equals(str)) {
                return i8;
            }
        }
        return -1;
    }

    public static int N(List list, Z0 z02) {
        if (z02 == null) {
            return -1;
        }
        return M(list, z02.w());
    }

    public static void O(Context context) {
        f34621u = new Z0(context.getString(M2.f34087g6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int Q(Z0 z02, Z0 z03) {
        Comparator comparator = f34622v;
        int compare = comparator.compare(z02.E(), z03.E());
        if (compare != 0) {
            return compare;
        }
        int compare2 = comparator.compare(z02.y(), z03.y());
        return compare2 == 0 ? z02.w().compareTo(z03.w()) : compare2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int R(Z0 z02, Z0 z03) {
        int c8 = AbstractC6802d.c(z02.B(), z03.B());
        return c8 != 0 ? c8 : z02.compareTo(z03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int S(Z0 z02, Z0 z03) {
        int compare = Long.compare(z02.v(), z03.v());
        return compare != 0 ? compare : f34624x.compare(z02, z03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int T(Z0 z02, Z0 z03) {
        int compare = Long.compare(z02.v(), z03.v());
        return compare != 0 ? compare : z02.compareTo(z03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int U(Z0 z02, Z0 z03) {
        int i8 = -Integer.compare(z02.r(), z03.r());
        if (i8 != 0) {
            return i8;
        }
        int i9 = -Long.compare(z02.x(), z03.x());
        return i9 != 0 ? i9 : z02.compareTo(z03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int V(Z0 z02, Z0 z03) {
        return f34622v.compare(z02.E(), z03.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int W(Z0 z02, Z0 z03) {
        Z0 z04 = f34621u;
        int compare = Boolean.compare(z02 == z04, z03 == z04);
        if (compare != 0) {
            return compare;
        }
        int c8 = AbstractC6802d.c(z02.B(), z03.B());
        return c8 != 0 ? c8 : f34618C.compare(z02, z03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int X(Z0 z02, Z0 z03) {
        long v7 = z02.v();
        long v8 = z03.v();
        if (v7 == 0 && v8 != 0) {
            return -1;
        }
        if ((v7 != 0 && v8 == 0) || v7 < v8) {
            return 1;
        }
        if (v7 > v8) {
            return -1;
        }
        return z02.compareTo(z03);
    }

    private Z0 f0() {
        return new Z0(s5.N.q0(this.f34627o).A(AbstractC6804f.a()).m());
    }

    public static Z0 q(Collection collection, String str) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Z0 z02 = (Z0) it.next();
            if (z02.w().equals(str)) {
                return z02;
            }
        }
        return null;
    }

    public String A() {
        return AbstractC6803e.w(this.f34627o.S());
    }

    public String B() {
        return this.f34627o.U();
    }

    public s5.r0 C() {
        s5.r0 c8 = this.f34627o.l0() ? s5.r0.c(this.f34627o.W()) : null;
        return c8 == null ? s5.r0.STAR_NONE : c8;
    }

    public String D() {
        return this.f34627o.X();
    }

    public String E() {
        return this.f34627o.Z();
    }

    public String G() {
        if (this.f34629t == null) {
            this.f34629t = Units.b(E());
        }
        return this.f34629t;
    }

    public boolean H(String str, String str2) {
        return t().equalsIgnoreCase(str) && y().equalsIgnoreCase(str2);
    }

    public boolean I(String str, String str2) {
        return t().equals(str) && y().equals(str2);
    }

    public boolean J(Z0 z02) {
        return t().equalsIgnoreCase(z02.t()) && y().equalsIgnoreCase(z02.y());
    }

    public boolean K(Z0 z02) {
        return this == z02 || w().equals(z02.w());
    }

    public boolean L(String str, String str2) {
        return G().equalsIgnoreCase(str) && y().equalsIgnoreCase(str2);
    }

    public boolean P() {
        return v() != 0;
    }

    public Z0 Y(Z0 z02) {
        Z0 d02 = !AbstractC6803e.o(z02.u()) ? d0(z02.u()) : this;
        if (!AbstractC6803e.o(z02.s())) {
            d02 = d02.b0(z02.s());
        }
        return !AbstractC6803e.o(z02.A()) ? d02.h0(z02.A()) : d02;
    }

    public Z0 Z() {
        return f0().c0().k0(null).e0(false).j0(null);
    }

    public boolean a0(Z0 z02) {
        return Objects.equals(E(), z02.E()) && Objects.equals(y(), z02.y()) && Objects.equals(A(), z02.A()) && Objects.equals(C(), z02.C()) && P() == z02.P();
    }

    public Z0 b0(String str) {
        return new Z0(s5.N.q0(this.f34627o).x(AbstractC6803e.w(str)).m());
    }

    public Z0 c0() {
        return new Z0(s5.N.q0(this.f34627o).H(AbstractC6803e.w(this.f34628s)).m());
    }

    public Z0 d0(String str) {
        return new Z0(s5.N.q0(this.f34627o).y(AbstractC6803e.w(str)).m());
    }

    public Z0 e0(boolean z7) {
        return new Z0(s5.N.q0(this.f34627o).z(z7 ? P1.x() : 0L).m());
    }

    public Z0 g0(String str) {
        return new Z0(s5.N.q0(this.f34627o).C(str).m());
    }

    public Z0 h0(String str) {
        return new Z0(s5.N.q0(this.f34627o).D(AbstractC6803e.w(str)).m());
    }

    public Z0 i0(String str) {
        return new Z0(s5.N.q0(this.f34627o).E(AbstractC6803e.w(str)).m());
    }

    public Z0 j0(s5.r0 r0Var) {
        if (r0Var == null) {
            r0Var = s5.r0.STAR_NONE;
        }
        return new Z0(s5.N.q0(this.f34627o).F(r0Var.e()).m());
    }

    public Z0 k0(String str) {
        return new Z0(s5.N.q0(this.f34627o).G(AbstractC6803e.w(str)).m());
    }

    public Z0 l0(String str) {
        return new Z0(s5.N.q0(this.f34627o).H(AbstractC6803e.w(str)).m());
    }

    public a m() {
        return new a();
    }

    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(Z0 z02) {
        return f34623w.compare(this, z02);
    }

    public int r() {
        return this.f34627o.F();
    }

    public String s() {
        return AbstractC6803e.w(this.f34627o.H());
    }

    public String t() {
        return this.f34628s;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(E());
        if (y().isEmpty()) {
            str = "";
        } else {
            str = " (" + y() + ")";
        }
        sb.append(str);
        return sb.toString();
    }

    public String u() {
        return this.f34627o.J();
    }

    public long v() {
        return this.f34627o.L();
    }

    public String w() {
        return this.f34627o.N();
    }

    public long x() {
        return this.f34627o.P();
    }

    public String y() {
        return this.f34627o.Q();
    }

    public s5.N z() {
        return this.f34627o;
    }

    public Z0(String str, String str2) {
        this.f34629t = null;
        str = str == null ? "" : str;
        this.f34627o = s5.N.p0().A(str2).H(str).m();
        this.f34628s = AbstractC6803e.k(str);
    }

    public Z0(s5.N n8) {
        this.f34629t = null;
        this.f34627o = n8;
        this.f34628s = AbstractC6803e.k(n8.Z());
    }
}
