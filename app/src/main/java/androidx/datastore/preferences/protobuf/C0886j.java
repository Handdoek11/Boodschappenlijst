package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.p0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0886j implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f9416a;

    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9417a;

        static {
            int[] iArr = new int[o0.b.values().length];
            f9417a = iArr;
            try {
                iArr[o0.b.f9468A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9417a[o0.b.f9486z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9417a[o0.b.f9484x.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9417a[o0.b.f9475H.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9417a[o0.b.f9477J.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9417a[o0.b.f9473F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9417a[o0.b.f9485y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9417a[o0.b.f9482v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9417a[o0.b.f9476I.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9417a[o0.b.f9478K.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9417a[o0.b.f9483w.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9417a[o0.b.f9469B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C0886j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) AbstractC0899x.b(codedOutputStream, "output");
        this.f9416a = codedOutputStream2;
        codedOutputStream2.f9288a = this;
    }

    public static C0886j P(CodedOutputStream codedOutputStream) {
        C0886j c0886j = codedOutputStream.f9288a;
        return c0886j != null ? c0886j : new C0886j(codedOutputStream);
    }

    private void Q(int i8, boolean z7, Object obj, F.a aVar) {
        this.f9416a.N0(i8, 2);
        this.f9416a.P0(F.b(aVar, Boolean.valueOf(z7), obj));
        F.e(this.f9416a, aVar, Boolean.valueOf(z7), obj);
    }

    private void R(int i8, F.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Integer) it.next()).intValue();
            i9++;
        }
        Arrays.sort(iArr);
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = iArr[i10];
            Object obj = map.get(Integer.valueOf(i11));
            this.f9416a.N0(i8, 2);
            this.f9416a.P0(F.b(aVar, Integer.valueOf(i11), obj));
            F.e(this.f9416a, aVar, Integer.valueOf(i11), obj);
        }
    }

    private void S(int i8, F.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        Arrays.sort(jArr);
        for (int i10 = 0; i10 < size; i10++) {
            long j8 = jArr[i10];
            Object obj = map.get(Long.valueOf(j8));
            this.f9416a.N0(i8, 2);
            this.f9416a.P0(F.b(aVar, Long.valueOf(j8), obj));
            F.e(this.f9416a, aVar, Long.valueOf(j8), obj);
        }
    }

    private void T(int i8, F.a aVar, Map map) {
        switch (a.f9417a[aVar.f9301a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i8, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i8, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i8, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i8, aVar, map);
                return;
            case 12:
                U(i8, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f9301a);
        }
    }

    private void U(int i8, F.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            strArr[i9] = (String) it.next();
            i9++;
        }
        Arrays.sort(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            String str = strArr[i10];
            Object obj = map.get(str);
            this.f9416a.N0(i8, 2);
            this.f9416a.P0(F.b(aVar, str, obj));
            F.e(this.f9416a, aVar, str, obj);
        }
    }

    private void V(int i8, Object obj) {
        if (obj instanceof String) {
            this.f9416a.L0(i8, (String) obj);
        } else {
            this.f9416a.f0(i8, (AbstractC0883g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void A(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.b0(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.d(((Boolean) list.get(i11)).booleanValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.c0(((Boolean) list.get(i9)).booleanValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void B(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.O0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.R(((Integer) list.get(i11)).intValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.P0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void C(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.J0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.M(((Long) list.get(i11)).longValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.K0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void D(int i8, long j8) {
        this.f9416a.J0(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void E(int i8, float f8) {
        this.f9416a.p0(i8, f8);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void F(int i8) {
        this.f9416a.N0(i8, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void G(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.H0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.K(((Integer) list.get(i11)).intValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.I0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void H(int i8, int i9) {
        this.f9416a.j0(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void I(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.x0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.x(((Long) list.get(i11)).longValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.y0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void J(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.j0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.k(((Integer) list.get(i11)).intValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.k0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void K(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.h0(i8, ((Double) list.get(i9)).doubleValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.i(((Double) list.get(i11)).doubleValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.i0(((Double) list.get(i9)).doubleValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void L(int i8, F.a aVar, Map map) {
        if (this.f9416a.Y()) {
            T(i8, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f9416a.N0(i8, 2);
            this.f9416a.P0(F.b(aVar, entry.getKey(), entry.getValue()));
            F.e(this.f9416a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void M(int i8, int i9) {
        this.f9416a.H0(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void N(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f9416a.f0(i8, (AbstractC0883g) list.get(i9));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void O(int i8, Object obj, c0 c0Var) {
        this.f9416a.s0(i8, (M) obj, c0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void a(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.p0(i8, ((Float) list.get(i9)).floatValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.q(((Float) list.get(i11)).floatValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.q0(((Float) list.get(i9)).floatValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void b(int i8, int i9) {
        this.f9416a.O0(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final void c(int i8, Object obj) {
        if (obj instanceof AbstractC0883g) {
            this.f9416a.C0(i8, (AbstractC0883g) obj);
        } else {
            this.f9416a.B0(i8, (M) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void d(int i8, int i9) {
        this.f9416a.l0(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void e(int i8, double d8) {
        this.f9416a.h0(i8, d8);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void f(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.F0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.I(((Long) list.get(i11)).longValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.G0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void g(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.Q0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.T(((Long) list.get(i11)).longValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.R0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void h(int i8, long j8) {
        this.f9416a.n0(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public p0.a i() {
        return p0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void j(int i8, List list, c0 c0Var) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            z(i8, list.get(i9), c0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void k(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof B)) {
            while (i9 < list.size()) {
                this.f9416a.L0(i8, (String) list.get(i9));
                i9++;
            }
        } else {
            B b8 = (B) list;
            while (i9 < list.size()) {
                V(i8, b8.p0(i9));
                i9++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void l(int i8, List list, c0 c0Var) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            O(i8, list.get(i9), c0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void m(int i8, String str) {
        this.f9416a.L0(i8, str);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void n(int i8, long j8) {
        this.f9416a.Q0(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void o(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.v0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.v(((Integer) list.get(i11)).intValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.w0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void p(int i8, long j8) {
        this.f9416a.x0(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void q(int i8, boolean z7) {
        this.f9416a.b0(i8, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void r(int i8, int i9) {
        this.f9416a.D0(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void s(int i8) {
        this.f9416a.N0(i8, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void t(int i8, int i9) {
        this.f9416a.v0(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void u(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.n0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.o(((Long) list.get(i11)).longValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.o0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void v(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.D0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.G(((Integer) list.get(i11)).intValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.E0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void w(int i8, AbstractC0883g abstractC0883g) {
        this.f9416a.f0(i8, abstractC0883g);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void x(int i8, long j8) {
        this.f9416a.F0(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void y(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.f9416a.l0(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f9416a.N0(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += CodedOutputStream.m(((Integer) list.get(i11)).intValue());
        }
        this.f9416a.P0(i10);
        while (i9 < list.size()) {
            this.f9416a.m0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void z(int i8, Object obj, c0 c0Var) {
        this.f9416a.z0(i8, (M) obj, c0Var);
    }
}
