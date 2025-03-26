package androidx.recyclerview.widget;

import A0.z;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I, reason: collision with root package name */
    boolean f10759I;

    /* renamed from: J, reason: collision with root package name */
    int f10760J;

    /* renamed from: K, reason: collision with root package name */
    int[] f10761K;

    /* renamed from: L, reason: collision with root package name */
    View[] f10762L;

    /* renamed from: M, reason: collision with root package name */
    final SparseIntArray f10763M;

    /* renamed from: N, reason: collision with root package name */
    final SparseIntArray f10764N;

    /* renamed from: O, reason: collision with root package name */
    c f10765O;

    /* renamed from: P, reason: collision with root package name */
    final Rect f10766P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f10767Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i8, int i9) {
            return i8 % i9;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i8) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f10770a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f10771b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f10772c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10773d = false;

        static int a(SparseIntArray sparseIntArray, int i8) {
            int size = sparseIntArray.size() - 1;
            int i9 = 0;
            while (i9 <= size) {
                int i10 = (i9 + size) >>> 1;
                if (sparseIntArray.keyAt(i10) < i8) {
                    i9 = i10 + 1;
                } else {
                    size = i10 - 1;
                }
            }
            int i11 = i9 - 1;
            if (i11 < 0 || i11 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i11);
        }

        int b(int i8, int i9) {
            if (!this.f10773d) {
                return d(i8, i9);
            }
            int i10 = this.f10771b.get(i8, -1);
            if (i10 != -1) {
                return i10;
            }
            int d8 = d(i8, i9);
            this.f10771b.put(i8, d8);
            return d8;
        }

        int c(int i8, int i9) {
            if (!this.f10772c) {
                return e(i8, i9);
            }
            int i10 = this.f10770a.get(i8, -1);
            if (i10 != -1) {
                return i10;
            }
            int e8 = e(i8, i9);
            this.f10770a.put(i8, e8);
            return e8;
        }

        public int d(int i8, int i9) {
            int i10;
            int i11;
            int i12;
            int a8;
            if (!this.f10773d || (a8 = a(this.f10771b, i8)) == -1) {
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                i10 = this.f10771b.get(a8);
                i11 = a8 + 1;
                i12 = c(a8, i9) + f(a8);
                if (i12 == i9) {
                    i10++;
                    i12 = 0;
                }
            }
            int f8 = f(i8);
            while (i11 < i8) {
                int f9 = f(i11);
                i12 += f9;
                if (i12 == i9) {
                    i10++;
                    i12 = 0;
                } else if (i12 > i9) {
                    i10++;
                    i12 = f9;
                }
                i11++;
            }
            return i12 + f8 > i9 ? i10 + 1 : i10;
        }

        public abstract int e(int i8, int i9);

        public abstract int f(int i8);

        public void g() {
            this.f10771b.clear();
        }

        public void h() {
            this.f10770a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f10759I = false;
        this.f10760J = -1;
        this.f10763M = new SparseIntArray();
        this.f10764N = new SparseIntArray();
        this.f10765O = new a();
        this.f10766P = new Rect();
        h3(RecyclerView.p.m0(context, attributeSet, i8, i9).f11008b);
    }

    private void Q2(RecyclerView.w wVar, RecyclerView.B b8, int i8, boolean z7) {
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        if (z7) {
            i11 = 1;
            i10 = i8;
            i9 = 0;
        } else {
            i9 = i8 - 1;
            i10 = -1;
            i11 = -1;
        }
        while (i9 != i10) {
            View view = this.f10762L[i9];
            b bVar = (b) view.getLayoutParams();
            int d32 = d3(wVar, b8, l0(view));
            bVar.f10769f = d32;
            bVar.f10768e = i12;
            i12 += d32;
            i9 += i11;
        }
    }

    private void R2() {
        int O7 = O();
        for (int i8 = 0; i8 < O7; i8++) {
            b bVar = (b) N(i8).getLayoutParams();
            int a8 = bVar.a();
            this.f10763M.put(a8, bVar.f());
            this.f10764N.put(a8, bVar.e());
        }
    }

    private void S2(int i8) {
        this.f10761K = T2(this.f10761K, this.f10760J, i8);
    }

    static int[] T2(int[] iArr, int i8, int i9) {
        int i10;
        if (iArr == null || iArr.length != i8 + 1 || iArr[iArr.length - 1] != i9) {
            iArr = new int[i8 + 1];
        }
        int i11 = 0;
        iArr[0] = 0;
        int i12 = i9 / i8;
        int i13 = i9 % i8;
        int i14 = 0;
        for (int i15 = 1; i15 <= i8; i15++) {
            i11 += i13;
            if (i11 <= 0 || i8 - i11 >= i13) {
                i10 = i12;
            } else {
                i10 = i12 + 1;
                i11 -= i8;
            }
            i14 += i10;
            iArr[i15] = i14;
        }
        return iArr;
    }

    private void U2() {
        this.f10763M.clear();
        this.f10764N.clear();
    }

    private int V2(RecyclerView.B b8) {
        if (O() != 0 && b8.b() != 0) {
            X1();
            boolean t22 = t2();
            View c22 = c2(!t22, true);
            View b22 = b2(!t22, true);
            if (c22 != null && b22 != null) {
                int b9 = this.f10765O.b(l0(c22), this.f10760J);
                int b10 = this.f10765O.b(l0(b22), this.f10760J);
                int max = this.f10787x ? Math.max(0, ((this.f10765O.b(b8.b() - 1, this.f10760J) + 1) - Math.max(b9, b10)) - 1) : Math.max(0, Math.min(b9, b10));
                if (t22) {
                    return Math.round((max * (Math.abs(this.f10784u.d(b22) - this.f10784u.g(c22)) / ((this.f10765O.b(l0(b22), this.f10760J) - this.f10765O.b(l0(c22), this.f10760J)) + 1))) + (this.f10784u.m() - this.f10784u.g(c22)));
                }
                return max;
            }
        }
        return 0;
    }

    private int W2(RecyclerView.B b8) {
        if (O() != 0 && b8.b() != 0) {
            X1();
            View c22 = c2(!t2(), true);
            View b22 = b2(!t2(), true);
            if (c22 != null && b22 != null) {
                if (!t2()) {
                    return this.f10765O.b(b8.b() - 1, this.f10760J) + 1;
                }
                int d8 = this.f10784u.d(b22) - this.f10784u.g(c22);
                int b9 = this.f10765O.b(l0(c22), this.f10760J);
                return (int) ((d8 / ((this.f10765O.b(l0(b22), this.f10760J) - b9) + 1)) * (this.f10765O.b(b8.b() - 1, this.f10760J) + 1));
            }
        }
        return 0;
    }

    private void X2(RecyclerView.w wVar, RecyclerView.B b8, LinearLayoutManager.a aVar, int i8) {
        boolean z7 = i8 == 1;
        int c32 = c3(wVar, b8, aVar.f10791b);
        if (z7) {
            while (c32 > 0) {
                int i9 = aVar.f10791b;
                if (i9 <= 0) {
                    return;
                }
                int i10 = i9 - 1;
                aVar.f10791b = i10;
                c32 = c3(wVar, b8, i10);
            }
            return;
        }
        int b9 = b8.b() - 1;
        int i11 = aVar.f10791b;
        while (i11 < b9) {
            int i12 = i11 + 1;
            int c33 = c3(wVar, b8, i12);
            if (c33 <= c32) {
                break;
            }
            i11 = i12;
            c32 = c33;
        }
        aVar.f10791b = i11;
    }

    private void Y2() {
        View[] viewArr = this.f10762L;
        if (viewArr == null || viewArr.length != this.f10760J) {
            this.f10762L = new View[this.f10760J];
        }
    }

    private int b3(RecyclerView.w wVar, RecyclerView.B b8, int i8) {
        if (!b8.e()) {
            return this.f10765O.b(i8, this.f10760J);
        }
        int f8 = wVar.f(i8);
        if (f8 != -1) {
            return this.f10765O.b(f8, this.f10760J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i8);
        return 0;
    }

    private int c3(RecyclerView.w wVar, RecyclerView.B b8, int i8) {
        if (!b8.e()) {
            return this.f10765O.c(i8, this.f10760J);
        }
        int i9 = this.f10764N.get(i8, -1);
        if (i9 != -1) {
            return i9;
        }
        int f8 = wVar.f(i8);
        if (f8 != -1) {
            return this.f10765O.c(f8, this.f10760J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i8);
        return 0;
    }

    private int d3(RecyclerView.w wVar, RecyclerView.B b8, int i8) {
        if (!b8.e()) {
            return this.f10765O.f(i8);
        }
        int i9 = this.f10763M.get(i8, -1);
        if (i9 != -1) {
            return i9;
        }
        int f8 = wVar.f(i8);
        if (f8 != -1) {
            return this.f10765O.f(f8);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i8);
        return 1;
    }

    private void e3(float f8, int i8) {
        S2(Math.max(Math.round(f8 * this.f10760J), i8));
    }

    private void f3(View view, int i8, boolean z7) {
        int i9;
        int i10;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f11012b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int Z22 = Z2(bVar.f10768e, bVar.f10769f);
        if (this.f10782s == 1) {
            i10 = RecyclerView.p.P(Z22, i8, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i9 = RecyclerView.p.P(this.f10784u.n(), c0(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int P7 = RecyclerView.p.P(Z22, i8, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int P8 = RecyclerView.p.P(this.f10784u.n(), t0(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i9 = P7;
            i10 = P8;
        }
        g3(view, i10, i9, z7);
    }

    private void g3(View view, int i8, int i9, boolean z7) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z7 ? L1(view, i8, i9, qVar) : J1(view, i8, i9, qVar)) {
            view.measure(i8, i9);
        }
    }

    private void i3() {
        int b02;
        int k02;
        if (r2() == 1) {
            b02 = s0() - j0();
            k02 = i0();
        } else {
            b02 = b0() - h0();
            k02 = k0();
        }
        S2(b02 - k02);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.B b8) {
        return this.f10767Q ? W2(b8) : super.A(b8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        i3();
        Y2();
        return super.A1(i8, wVar, b8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        i3();
        Y2();
        return super.C1(i8, wVar, b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(Rect rect, int i8, int i9) {
        int s8;
        int s9;
        if (this.f10761K == null) {
            super.G1(rect, i8, i9);
        }
        int i02 = i0() + j0();
        int k02 = k0() + h0();
        if (this.f10782s == 1) {
            s9 = RecyclerView.p.s(i9, rect.height() + k02, f0());
            int[] iArr = this.f10761K;
            s8 = RecyclerView.p.s(i8, iArr[iArr.length - 1] + i02, g0());
        } else {
            s8 = RecyclerView.p.s(i8, rect.width() + i02, g0());
            int[] iArr2 = this.f10761K;
            s9 = RecyclerView.p.s(i9, iArr2[iArr2.length - 1] + k02, f0());
        }
        F1(s8, s9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void H2(boolean z7) {
        if (z7) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.H2(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return this.f10782s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View N0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.B r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f10777D == null && !this.f10759I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView.w wVar, RecyclerView.B b8, z zVar) {
        super.R0(wVar, b8, zVar);
        zVar.k0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void R1(RecyclerView.B b8, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i8 = this.f10760J;
        for (int i9 = 0; i9 < this.f10760J && cVar.c(b8) && i8 > 0; i9++) {
            int i10 = cVar.f10802d;
            cVar2.a(i10, Math.max(0, cVar.f10805g));
            i8 -= this.f10765O.f(i10);
            cVar.f10802d += cVar.f10803e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int S(RecyclerView.w wVar, RecyclerView.B b8) {
        if (this.f10782s == 1) {
            return this.f10760J;
        }
        if (b8.b() < 1) {
            return 0;
        }
        return b3(wVar, b8, b8.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView.w wVar, RecyclerView.B b8, View view, z zVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.S0(view, zVar);
            return;
        }
        b bVar = (b) layoutParams;
        int b32 = b3(wVar, b8, bVar.a());
        if (this.f10782s == 0) {
            zVar.n0(z.f.a(bVar.e(), bVar.f(), b32, 1, false, false));
        } else {
            zVar.n0(z.f.a(b32, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i8, int i9) {
        this.f10765O.h();
        this.f10765O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        this.f10765O.h();
        this.f10765O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i8, int i9, int i10) {
        this.f10765O.h();
        this.f10765O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i8, int i9) {
        this.f10765O.h();
        this.f10765O.g();
    }

    int Z2(int i8, int i9) {
        if (this.f10782s != 1 || !s2()) {
            int[] iArr = this.f10761K;
            return iArr[i9 + i8] - iArr[i8];
        }
        int[] iArr2 = this.f10761K;
        int i10 = this.f10760J;
        return iArr2[i10 - i8] - iArr2[(i10 - i8) - i9];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i8, int i9, Object obj) {
        this.f10765O.h();
        this.f10765O.g();
    }

    public int a3() {
        return this.f10760J;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.B b8) {
        if (b8.e()) {
            R2();
        }
        super.b1(wVar, b8);
        U2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.B b8) {
        super.c1(b8);
        this.f10759I = false;
    }

    public void h3(int i8) {
        if (i8 == this.f10760J) {
            return;
        }
        this.f10759I = true;
        if (i8 >= 1) {
            this.f10760J = i8;
            this.f10765O.h();
            x1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i8);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View l2(RecyclerView.w wVar, RecyclerView.B b8, boolean z7, boolean z8) {
        int i8;
        int i9;
        int O7 = O();
        int i10 = 1;
        if (z8) {
            i9 = O() - 1;
            i8 = -1;
            i10 = -1;
        } else {
            i8 = O7;
            i9 = 0;
        }
        int b9 = b8.b();
        X1();
        int m8 = this.f10784u.m();
        int i11 = this.f10784u.i();
        View view = null;
        View view2 = null;
        while (i9 != i8) {
            View N7 = N(i9);
            int l02 = l0(N7);
            if (l02 >= 0 && l02 < b9 && c3(wVar, b8, l02) == 0) {
                if (((RecyclerView.q) N7.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = N7;
                    }
                } else {
                    if (this.f10784u.g(N7) < i11 && this.f10784u.d(N7) >= m8) {
                        return N7;
                    }
                    if (view == null) {
                        view = N7;
                    }
                }
            }
            i9 += i10;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int o0(RecyclerView.w wVar, RecyclerView.B b8) {
        if (this.f10782s == 0) {
            return this.f10760J;
        }
        if (b8.b() < 1) {
            return 0;
        }
        return b3(wVar, b8, b8.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(RecyclerView.w wVar, RecyclerView.B b8, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int f8;
        int i17;
        int P7;
        int i18;
        View d8;
        int l8 = this.f10784u.l();
        boolean z7 = l8 != 1073741824;
        int i19 = O() > 0 ? this.f10761K[this.f10760J] : 0;
        if (z7) {
            i3();
        }
        boolean z8 = cVar.f10803e == 1;
        int i20 = this.f10760J;
        if (!z8) {
            i20 = c3(wVar, b8, cVar.f10802d) + d3(wVar, b8, cVar.f10802d);
        }
        int i21 = 0;
        while (i21 < this.f10760J && cVar.c(b8) && i20 > 0) {
            int i22 = cVar.f10802d;
            int d32 = d3(wVar, b8, i22);
            if (d32 > this.f10760J) {
                throw new IllegalArgumentException("Item at position " + i22 + " requires " + d32 + " spans but GridLayoutManager has only " + this.f10760J + " spans.");
            }
            i20 -= d32;
            if (i20 < 0 || (d8 = cVar.d(wVar)) == null) {
                break;
            }
            this.f10762L[i21] = d8;
            i21++;
        }
        if (i21 == 0) {
            bVar.f10796b = true;
            return;
        }
        Q2(wVar, b8, i21, z8);
        float f9 = 0.0f;
        int i23 = 0;
        for (int i24 = 0; i24 < i21; i24++) {
            View view = this.f10762L[i24];
            if (cVar.f10810l == null) {
                if (z8) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z8) {
                g(view);
            } else {
                h(view, 0);
            }
            o(view, this.f10766P);
            f3(view, l8, false);
            int e8 = this.f10784u.e(view);
            if (e8 > i23) {
                i23 = e8;
            }
            float f10 = (this.f10784u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f10769f;
            if (f10 > f9) {
                f9 = f10;
            }
        }
        if (z7) {
            e3(f9, i19);
            i23 = 0;
            for (int i25 = 0; i25 < i21; i25++) {
                View view2 = this.f10762L[i25];
                f3(view2, 1073741824, true);
                int e9 = this.f10784u.e(view2);
                if (e9 > i23) {
                    i23 = e9;
                }
            }
        }
        for (int i26 = 0; i26 < i21; i26++) {
            View view3 = this.f10762L[i26];
            if (this.f10784u.e(view3) != i23) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f11012b;
                int i27 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i28 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int Z22 = Z2(bVar2.f10768e, bVar2.f10769f);
                if (this.f10782s == 1) {
                    i18 = RecyclerView.p.P(Z22, 1073741824, i28, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    P7 = View.MeasureSpec.makeMeasureSpec(i23 - i27, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i28, 1073741824);
                    P7 = RecyclerView.p.P(Z22, 1073741824, i27, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    i18 = makeMeasureSpec;
                }
                g3(view3, i18, P7, true);
            }
        }
        bVar.f10795a = i23;
        if (this.f10782s == 1) {
            if (cVar.f10804f == -1) {
                i13 = cVar.f10800b;
                i17 = i13 - i23;
            } else {
                i17 = cVar.f10800b;
                i13 = i17 + i23;
            }
            i11 = i17;
            i12 = 0;
            i10 = 0;
        } else {
            if (cVar.f10804f == -1) {
                i9 = cVar.f10800b;
                i8 = i9 - i23;
            } else {
                i8 = cVar.f10800b;
                i9 = i8 + i23;
            }
            i10 = i8;
            i11 = 0;
            i12 = i9;
            i13 = 0;
        }
        int i29 = 0;
        while (i29 < i21) {
            View view4 = this.f10762L[i29];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f10782s == 1) {
                if (s2()) {
                    int i02 = i0() + this.f10761K[this.f10760J - bVar3.f10768e];
                    f8 = i13;
                    i15 = i02;
                    i16 = i02 - this.f10784u.f(view4);
                } else {
                    int i03 = i0() + this.f10761K[bVar3.f10768e];
                    f8 = i13;
                    i16 = i03;
                    i15 = this.f10784u.f(view4) + i03;
                }
                i14 = i11;
            } else {
                int k02 = k0() + this.f10761K[bVar3.f10768e];
                i14 = k02;
                i15 = i12;
                i16 = i10;
                f8 = this.f10784u.f(view4) + k02;
            }
            D0(view4, i16, i14, i15, f8);
            if (bVar3.c() || bVar3.b()) {
                bVar.f10797c = true;
            }
            bVar.f10798d |= view4.hasFocusable();
            i29++;
            i13 = f8;
            i12 = i15;
            i10 = i16;
            i11 = i14;
        }
        Arrays.fill(this.f10762L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.B b8) {
        return this.f10767Q ? V2(b8) : super.w(b8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void w2(RecyclerView.w wVar, RecyclerView.B b8, LinearLayoutManager.a aVar, int i8) {
        super.w2(wVar, b8, aVar, i8);
        i3();
        if (b8.b() > 0 && !b8.e()) {
            X2(wVar, b8, aVar, i8);
        }
        Y2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.B b8) {
        return this.f10767Q ? W2(b8) : super.x(b8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.B b8) {
        return this.f10767Q ? V2(b8) : super.z(b8);
    }

    public static class b extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        int f10768e;

        /* renamed from: f, reason: collision with root package name */
        int f10769f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10768e = -1;
            this.f10769f = 0;
        }

        public int e() {
            return this.f10768e;
        }

        public int f() {
            return this.f10769f;
        }

        public b(int i8, int i9) {
            super(i8, i9);
            this.f10768e = -1;
            this.f10769f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10768e = -1;
            this.f10769f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10768e = -1;
            this.f10769f = 0;
        }
    }

    public GridLayoutManager(Context context, int i8, int i9, boolean z7) {
        super(context, i9, z7);
        this.f10759I = false;
        this.f10760J = -1;
        this.f10763M = new SparseIntArray();
        this.f10764N = new SparseIntArray();
        this.f10765O = new a();
        this.f10766P = new Rect();
        h3(i8);
    }
}
