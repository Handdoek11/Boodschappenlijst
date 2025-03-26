package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    int f10774A;

    /* renamed from: B, reason: collision with root package name */
    int f10775B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f10776C;

    /* renamed from: D, reason: collision with root package name */
    d f10777D;

    /* renamed from: E, reason: collision with root package name */
    final a f10778E;

    /* renamed from: F, reason: collision with root package name */
    private final b f10779F;

    /* renamed from: G, reason: collision with root package name */
    private int f10780G;

    /* renamed from: H, reason: collision with root package name */
    private int[] f10781H;

    /* renamed from: s, reason: collision with root package name */
    int f10782s;

    /* renamed from: t, reason: collision with root package name */
    private c f10783t;

    /* renamed from: u, reason: collision with root package name */
    m f10784u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10785v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10786w;

    /* renamed from: x, reason: collision with root package name */
    boolean f10787x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10788y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10789z;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        m f10790a;

        /* renamed from: b, reason: collision with root package name */
        int f10791b;

        /* renamed from: c, reason: collision with root package name */
        int f10792c;

        /* renamed from: d, reason: collision with root package name */
        boolean f10793d;

        /* renamed from: e, reason: collision with root package name */
        boolean f10794e;

        a() {
            e();
        }

        void a() {
            this.f10792c = this.f10793d ? this.f10790a.i() : this.f10790a.m();
        }

        public void b(View view, int i8) {
            if (this.f10793d) {
                this.f10792c = this.f10790a.d(view) + this.f10790a.o();
            } else {
                this.f10792c = this.f10790a.g(view);
            }
            this.f10791b = i8;
        }

        public void c(View view, int i8) {
            int o8 = this.f10790a.o();
            if (o8 >= 0) {
                b(view, i8);
                return;
            }
            this.f10791b = i8;
            if (this.f10793d) {
                int i9 = (this.f10790a.i() - o8) - this.f10790a.d(view);
                this.f10792c = this.f10790a.i() - i9;
                if (i9 > 0) {
                    int e8 = this.f10792c - this.f10790a.e(view);
                    int m8 = this.f10790a.m();
                    int min = e8 - (m8 + Math.min(this.f10790a.g(view) - m8, 0));
                    if (min < 0) {
                        this.f10792c += Math.min(i9, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g8 = this.f10790a.g(view);
            int m9 = g8 - this.f10790a.m();
            this.f10792c = g8;
            if (m9 > 0) {
                int i10 = (this.f10790a.i() - Math.min(0, (this.f10790a.i() - o8) - this.f10790a.d(view))) - (g8 + this.f10790a.e(view));
                if (i10 < 0) {
                    this.f10792c -= Math.min(m9, -i10);
                }
            }
        }

        boolean d(View view, RecyclerView.B b8) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b8.b();
        }

        void e() {
            this.f10791b = -1;
            this.f10792c = Integer.MIN_VALUE;
            this.f10793d = false;
            this.f10794e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f10791b + ", mCoordinate=" + this.f10792c + ", mLayoutFromEnd=" + this.f10793d + ", mValid=" + this.f10794e + '}';
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f10795a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10796b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10797c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f10798d;

        protected b() {
        }

        void a() {
            this.f10795a = 0;
            this.f10796b = false;
            this.f10797c = false;
            this.f10798d = false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f10800b;

        /* renamed from: c, reason: collision with root package name */
        int f10801c;

        /* renamed from: d, reason: collision with root package name */
        int f10802d;

        /* renamed from: e, reason: collision with root package name */
        int f10803e;

        /* renamed from: f, reason: collision with root package name */
        int f10804f;

        /* renamed from: g, reason: collision with root package name */
        int f10805g;

        /* renamed from: k, reason: collision with root package name */
        int f10809k;

        /* renamed from: m, reason: collision with root package name */
        boolean f10811m;

        /* renamed from: a, reason: collision with root package name */
        boolean f10799a = true;

        /* renamed from: h, reason: collision with root package name */
        int f10806h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f10807i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f10808j = false;

        /* renamed from: l, reason: collision with root package name */
        List f10810l = null;

        c() {
        }

        private View e() {
            int size = this.f10810l.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = ((RecyclerView.F) this.f10810l.get(i8)).f10944a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f10802d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f8 = f(view);
            if (f8 == null) {
                this.f10802d = -1;
            } else {
                this.f10802d = ((RecyclerView.q) f8.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.B b8) {
            int i8 = this.f10802d;
            return i8 >= 0 && i8 < b8.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.f10810l != null) {
                return e();
            }
            View o8 = wVar.o(this.f10802d);
            this.f10802d += this.f10803e;
            return o8;
        }

        public View f(View view) {
            int a8;
            int size = this.f10810l.size();
            View view2 = null;
            int i8 = Integer.MAX_VALUE;
            for (int i9 = 0; i9 < size; i9++) {
                View view3 = ((RecyclerView.F) this.f10810l.get(i9)).f10944a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a8 = (qVar.a() - this.f10802d) * this.f10803e) >= 0 && a8 < i8) {
                    view2 = view3;
                    if (a8 == 0) {
                        break;
                    }
                    i8 = a8;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f10812o;

        /* renamed from: s, reason: collision with root package name */
        int f10813s;

        /* renamed from: t, reason: collision with root package name */
        boolean f10814t;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f10812o >= 0;
        }

        void b() {
            this.f10812o = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f10812o);
            parcel.writeInt(this.f10813s);
            parcel.writeInt(this.f10814t ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f10812o = parcel.readInt();
            this.f10813s = parcel.readInt();
            this.f10814t = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f10812o = dVar.f10812o;
            this.f10813s = dVar.f10813s;
            this.f10814t = dVar.f10814t;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2(RecyclerView.w wVar, int i8, int i9) {
        if (i8 < 0) {
            return;
        }
        int i10 = i8 - i9;
        int O7 = O();
        if (!this.f10787x) {
            for (int i11 = 0; i11 < O7; i11++) {
                View N7 = N(i11);
                if (this.f10784u.d(N7) > i10 || this.f10784u.p(N7) > i10) {
                    y2(wVar, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = O7 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View N8 = N(i13);
            if (this.f10784u.d(N8) > i10 || this.f10784u.p(N8) > i10) {
                y2(wVar, i12, i13);
                return;
            }
        }
    }

    private void C2() {
        if (this.f10782s == 1 || !s2()) {
            this.f10787x = this.f10786w;
        } else {
            this.f10787x = !this.f10786w;
        }
    }

    private boolean I2(RecyclerView.w wVar, RecyclerView.B b8, a aVar) {
        View l22;
        boolean z7 = false;
        if (O() == 0) {
            return false;
        }
        View a02 = a0();
        if (a02 != null && aVar.d(a02, b8)) {
            aVar.c(a02, l0(a02));
            return true;
        }
        boolean z8 = this.f10785v;
        boolean z9 = this.f10788y;
        if (z8 != z9 || (l22 = l2(wVar, b8, aVar.f10793d, z9)) == null) {
            return false;
        }
        aVar.b(l22, l0(l22));
        if (!b8.e() && P1()) {
            int g8 = this.f10784u.g(l22);
            int d8 = this.f10784u.d(l22);
            int m8 = this.f10784u.m();
            int i8 = this.f10784u.i();
            boolean z10 = d8 <= m8 && g8 < m8;
            if (g8 >= i8 && d8 > i8) {
                z7 = true;
            }
            if (z10 || z7) {
                if (aVar.f10793d) {
                    m8 = i8;
                }
                aVar.f10792c = m8;
            }
        }
        return true;
    }

    private boolean J2(RecyclerView.B b8, a aVar) {
        int i8;
        if (!b8.e() && (i8 = this.f10774A) != -1) {
            if (i8 >= 0 && i8 < b8.b()) {
                aVar.f10791b = this.f10774A;
                d dVar = this.f10777D;
                if (dVar != null && dVar.a()) {
                    boolean z7 = this.f10777D.f10814t;
                    aVar.f10793d = z7;
                    if (z7) {
                        aVar.f10792c = this.f10784u.i() - this.f10777D.f10813s;
                    } else {
                        aVar.f10792c = this.f10784u.m() + this.f10777D.f10813s;
                    }
                    return true;
                }
                if (this.f10775B != Integer.MIN_VALUE) {
                    boolean z8 = this.f10787x;
                    aVar.f10793d = z8;
                    if (z8) {
                        aVar.f10792c = this.f10784u.i() - this.f10775B;
                    } else {
                        aVar.f10792c = this.f10784u.m() + this.f10775B;
                    }
                    return true;
                }
                View H7 = H(this.f10774A);
                if (H7 == null) {
                    if (O() > 0) {
                        aVar.f10793d = (this.f10774A < l0(N(0))) == this.f10787x;
                    }
                    aVar.a();
                } else {
                    if (this.f10784u.e(H7) > this.f10784u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f10784u.g(H7) - this.f10784u.m() < 0) {
                        aVar.f10792c = this.f10784u.m();
                        aVar.f10793d = false;
                        return true;
                    }
                    if (this.f10784u.i() - this.f10784u.d(H7) < 0) {
                        aVar.f10792c = this.f10784u.i();
                        aVar.f10793d = true;
                        return true;
                    }
                    aVar.f10792c = aVar.f10793d ? this.f10784u.d(H7) + this.f10784u.o() : this.f10784u.g(H7);
                }
                return true;
            }
            this.f10774A = -1;
            this.f10775B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void K2(RecyclerView.w wVar, RecyclerView.B b8, a aVar) {
        if (J2(b8, aVar) || I2(wVar, b8, aVar)) {
            return;
        }
        aVar.a();
        aVar.f10791b = this.f10788y ? b8.b() - 1 : 0;
    }

    private void L2(int i8, int i9, boolean z7, RecyclerView.B b8) {
        int m8;
        this.f10783t.f10811m = B2();
        this.f10783t.f10804f = i8;
        int[] iArr = this.f10781H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(b8, iArr);
        int max = Math.max(0, this.f10781H[0]);
        int max2 = Math.max(0, this.f10781H[1]);
        boolean z8 = i8 == 1;
        c cVar = this.f10783t;
        int i10 = z8 ? max2 : max;
        cVar.f10806h = i10;
        if (!z8) {
            max = max2;
        }
        cVar.f10807i = max;
        if (z8) {
            cVar.f10806h = i10 + this.f10784u.j();
            View o22 = o2();
            c cVar2 = this.f10783t;
            cVar2.f10803e = this.f10787x ? -1 : 1;
            int l02 = l0(o22);
            c cVar3 = this.f10783t;
            cVar2.f10802d = l02 + cVar3.f10803e;
            cVar3.f10800b = this.f10784u.d(o22);
            m8 = this.f10784u.d(o22) - this.f10784u.i();
        } else {
            View p22 = p2();
            this.f10783t.f10806h += this.f10784u.m();
            c cVar4 = this.f10783t;
            cVar4.f10803e = this.f10787x ? 1 : -1;
            int l03 = l0(p22);
            c cVar5 = this.f10783t;
            cVar4.f10802d = l03 + cVar5.f10803e;
            cVar5.f10800b = this.f10784u.g(p22);
            m8 = (-this.f10784u.g(p22)) + this.f10784u.m();
        }
        c cVar6 = this.f10783t;
        cVar6.f10801c = i9;
        if (z7) {
            cVar6.f10801c = i9 - m8;
        }
        cVar6.f10805g = m8;
    }

    private void M2(int i8, int i9) {
        this.f10783t.f10801c = this.f10784u.i() - i9;
        c cVar = this.f10783t;
        cVar.f10803e = this.f10787x ? -1 : 1;
        cVar.f10802d = i8;
        cVar.f10804f = 1;
        cVar.f10800b = i9;
        cVar.f10805g = Integer.MIN_VALUE;
    }

    private void N2(a aVar) {
        M2(aVar.f10791b, aVar.f10792c);
    }

    private void O2(int i8, int i9) {
        this.f10783t.f10801c = i9 - this.f10784u.m();
        c cVar = this.f10783t;
        cVar.f10802d = i8;
        cVar.f10803e = this.f10787x ? 1 : -1;
        cVar.f10804f = -1;
        cVar.f10800b = i9;
        cVar.f10805g = Integer.MIN_VALUE;
    }

    private void P2(a aVar) {
        O2(aVar.f10791b, aVar.f10792c);
    }

    private int S1(RecyclerView.B b8) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return p.a(b8, this.f10784u, c2(!this.f10789z, true), b2(!this.f10789z, true), this, this.f10789z);
    }

    private int T1(RecyclerView.B b8) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return p.b(b8, this.f10784u, c2(!this.f10789z, true), b2(!this.f10789z, true), this, this.f10789z, this.f10787x);
    }

    private int U1(RecyclerView.B b8) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return p.c(b8, this.f10784u, c2(!this.f10789z, true), b2(!this.f10789z, true), this, this.f10789z);
    }

    private View a2() {
        return h2(0, O());
    }

    private View f2() {
        return h2(O() - 1, -1);
    }

    private View j2() {
        return this.f10787x ? a2() : f2();
    }

    private View k2() {
        return this.f10787x ? f2() : a2();
    }

    private int m2(int i8, RecyclerView.w wVar, RecyclerView.B b8, boolean z7) {
        int i9;
        int i10 = this.f10784u.i() - i8;
        if (i10 <= 0) {
            return 0;
        }
        int i11 = -D2(-i10, wVar, b8);
        int i12 = i8 + i11;
        if (!z7 || (i9 = this.f10784u.i() - i12) <= 0) {
            return i11;
        }
        this.f10784u.r(i9);
        return i9 + i11;
    }

    private int n2(int i8, RecyclerView.w wVar, RecyclerView.B b8, boolean z7) {
        int m8;
        int m9 = i8 - this.f10784u.m();
        if (m9 <= 0) {
            return 0;
        }
        int i9 = -D2(m9, wVar, b8);
        int i10 = i8 + i9;
        if (!z7 || (m8 = i10 - this.f10784u.m()) <= 0) {
            return i9;
        }
        this.f10784u.r(-m8);
        return i9 - m8;
    }

    private View o2() {
        return N(this.f10787x ? 0 : O() - 1);
    }

    private View p2() {
        return N(this.f10787x ? O() - 1 : 0);
    }

    private void v2(RecyclerView.w wVar, RecyclerView.B b8, int i8, int i9) {
        if (!b8.g() || O() == 0 || b8.e() || !P1()) {
            return;
        }
        List k8 = wVar.k();
        int size = k8.size();
        int l02 = l0(N(0));
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.F f8 = (RecyclerView.F) k8.get(i12);
            if (!f8.P()) {
                if ((f8.G() < l02) != this.f10787x) {
                    i10 += this.f10784u.e(f8.f10944a);
                } else {
                    i11 += this.f10784u.e(f8.f10944a);
                }
            }
        }
        this.f10783t.f10810l = k8;
        if (i10 > 0) {
            O2(l0(p2()), i8);
            c cVar = this.f10783t;
            cVar.f10806h = i10;
            cVar.f10801c = 0;
            cVar.a();
            Y1(wVar, this.f10783t, b8, false);
        }
        if (i11 > 0) {
            M2(l0(o2()), i9);
            c cVar2 = this.f10783t;
            cVar2.f10806h = i11;
            cVar2.f10801c = 0;
            cVar2.a();
            Y1(wVar, this.f10783t, b8, false);
        }
        this.f10783t.f10810l = null;
    }

    private void x2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f10799a || cVar.f10811m) {
            return;
        }
        int i8 = cVar.f10805g;
        int i9 = cVar.f10807i;
        if (cVar.f10804f == -1) {
            z2(wVar, i8, i9);
        } else {
            A2(wVar, i8, i9);
        }
    }

    private void y2(RecyclerView.w wVar, int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        if (i9 <= i8) {
            while (i8 > i9) {
                r1(i8, wVar);
                i8--;
            }
        } else {
            for (int i10 = i9 - 1; i10 >= i8; i10--) {
                r1(i10, wVar);
            }
        }
    }

    private void z2(RecyclerView.w wVar, int i8, int i9) {
        int O7 = O();
        if (i8 < 0) {
            return;
        }
        int h8 = (this.f10784u.h() - i8) + i9;
        if (this.f10787x) {
            for (int i10 = 0; i10 < O7; i10++) {
                View N7 = N(i10);
                if (this.f10784u.g(N7) < h8 || this.f10784u.q(N7) < h8) {
                    y2(wVar, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = O7 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View N8 = N(i12);
            if (this.f10784u.g(N8) < h8 || this.f10784u.q(N8) < h8) {
                y2(wVar, i11, i12);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.B b8) {
        return U1(b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        if (this.f10782s == 1) {
            return 0;
        }
        return D2(i8, wVar, b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i8) {
        this.f10774A = i8;
        this.f10775B = Integer.MIN_VALUE;
        d dVar = this.f10777D;
        if (dVar != null) {
            dVar.b();
        }
        x1();
    }

    boolean B2() {
        return this.f10784u.k() == 0 && this.f10784u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        if (this.f10782s == 0) {
            return 0;
        }
        return D2(i8, wVar, b8);
    }

    int D2(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        if (O() == 0 || i8 == 0) {
            return 0;
        }
        X1();
        this.f10783t.f10799a = true;
        int i9 = i8 > 0 ? 1 : -1;
        int abs = Math.abs(i8);
        L2(i9, abs, true, b8);
        c cVar = this.f10783t;
        int Y12 = cVar.f10805g + Y1(wVar, cVar, b8, false);
        if (Y12 < 0) {
            return 0;
        }
        if (abs > Y12) {
            i8 = i9 * Y12;
        }
        this.f10784u.r(-i8);
        this.f10783t.f10809k = i8;
        return i8;
    }

    public void E2(int i8, int i9) {
        this.f10774A = i8;
        this.f10775B = i9;
        d dVar = this.f10777D;
        if (dVar != null) {
            dVar.b();
        }
        x1();
    }

    public void F2(int i8) {
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i8);
        }
        l(null);
        if (i8 != this.f10782s || this.f10784u == null) {
            m b8 = m.b(this, i8);
            this.f10784u = b8;
            this.f10778E.f10790a = b8;
            this.f10782s = i8;
            x1();
        }
    }

    public void G2(boolean z7) {
        l(null);
        if (z7 == this.f10786w) {
            return;
        }
        this.f10786w = z7;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View H(int i8) {
        int O7 = O();
        if (O7 == 0) {
            return null;
        }
        int l02 = i8 - l0(N(0));
        if (l02 >= 0 && l02 < O7) {
            View N7 = N(l02);
            if (l0(N7) == i8) {
                return N7;
            }
        }
        return super.H(i8);
    }

    public void H2(boolean z7) {
        l(null);
        if (this.f10788y == z7) {
            return;
        }
        this.f10788y = z7;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean K1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        if (this.f10776C) {
            o1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.B b8, int i8) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i8);
        N1(jVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View N0(View view, int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        int V12;
        C2();
        if (O() == 0 || (V12 = V1(i8)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        L2(V12, (int) (this.f10784u.n() * 0.33333334f), false, b8);
        c cVar = this.f10783t;
        cVar.f10805g = Integer.MIN_VALUE;
        cVar.f10799a = false;
        Y1(wVar, cVar, b8, true);
        View k22 = V12 == -1 ? k2() : j2();
        View p22 = V12 == -1 ? p2() : o2();
        if (!p22.hasFocusable()) {
            return k22;
        }
        if (k22 == null) {
            return null;
        }
        return p22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(d2());
            accessibilityEvent.setToIndex(g2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f10777D == null && this.f10785v == this.f10788y;
    }

    protected void Q1(RecyclerView.B b8, int[] iArr) {
        int i8;
        int q22 = q2(b8);
        if (this.f10783t.f10804f == -1) {
            i8 = 0;
        } else {
            i8 = q22;
            q22 = 0;
        }
        iArr[0] = q22;
        iArr[1] = i8;
    }

    void R1(RecyclerView.B b8, c cVar, RecyclerView.p.c cVar2) {
        int i8 = cVar.f10802d;
        if (i8 < 0 || i8 >= b8.b()) {
            return;
        }
        cVar2.a(i8, Math.max(0, cVar.f10805g));
    }

    int V1(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 17 ? i8 != 33 ? i8 != 66 ? (i8 == 130 && this.f10782s == 1) ? 1 : Integer.MIN_VALUE : this.f10782s == 0 ? 1 : Integer.MIN_VALUE : this.f10782s == 1 ? -1 : Integer.MIN_VALUE : this.f10782s == 0 ? -1 : Integer.MIN_VALUE : (this.f10782s != 1 && s2()) ? -1 : 1 : (this.f10782s != 1 && s2()) ? 1 : -1;
    }

    c W1() {
        return new c();
    }

    void X1() {
        if (this.f10783t == null) {
            this.f10783t = W1();
        }
    }

    int Y1(RecyclerView.w wVar, c cVar, RecyclerView.B b8, boolean z7) {
        int i8 = cVar.f10801c;
        int i9 = cVar.f10805g;
        if (i9 != Integer.MIN_VALUE) {
            if (i8 < 0) {
                cVar.f10805g = i9 + i8;
            }
            x2(wVar, cVar);
        }
        int i10 = cVar.f10801c + cVar.f10806h;
        b bVar = this.f10779F;
        while (true) {
            if ((!cVar.f10811m && i10 <= 0) || !cVar.c(b8)) {
                break;
            }
            bVar.a();
            u2(wVar, b8, cVar, bVar);
            if (!bVar.f10796b) {
                cVar.f10800b += bVar.f10795a * cVar.f10804f;
                if (!bVar.f10797c || cVar.f10810l != null || !b8.e()) {
                    int i11 = cVar.f10801c;
                    int i12 = bVar.f10795a;
                    cVar.f10801c = i11 - i12;
                    i10 -= i12;
                }
                int i13 = cVar.f10805g;
                if (i13 != Integer.MIN_VALUE) {
                    int i14 = i13 + bVar.f10795a;
                    cVar.f10805g = i14;
                    int i15 = cVar.f10801c;
                    if (i15 < 0) {
                        cVar.f10805g = i14 + i15;
                    }
                    x2(wVar, cVar);
                }
                if (z7 && bVar.f10798d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i8 - cVar.f10801c;
    }

    public int Z1() {
        View i22 = i2(0, O(), true, false);
        if (i22 == null) {
            return -1;
        }
        return l0(i22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.B b8) {
        int i8;
        int i9;
        int i10;
        int i11;
        int m22;
        int i12;
        View H7;
        int g8;
        int i13;
        int i14 = -1;
        if (!(this.f10777D == null && this.f10774A == -1) && b8.b() == 0) {
            o1(wVar);
            return;
        }
        d dVar = this.f10777D;
        if (dVar != null && dVar.a()) {
            this.f10774A = this.f10777D.f10812o;
        }
        X1();
        this.f10783t.f10799a = false;
        C2();
        View a02 = a0();
        a aVar = this.f10778E;
        if (!aVar.f10794e || this.f10774A != -1 || this.f10777D != null) {
            aVar.e();
            a aVar2 = this.f10778E;
            aVar2.f10793d = this.f10787x ^ this.f10788y;
            K2(wVar, b8, aVar2);
            this.f10778E.f10794e = true;
        } else if (a02 != null && (this.f10784u.g(a02) >= this.f10784u.i() || this.f10784u.d(a02) <= this.f10784u.m())) {
            this.f10778E.c(a02, l0(a02));
        }
        c cVar = this.f10783t;
        cVar.f10804f = cVar.f10809k >= 0 ? 1 : -1;
        int[] iArr = this.f10781H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(b8, iArr);
        int max = Math.max(0, this.f10781H[0]) + this.f10784u.m();
        int max2 = Math.max(0, this.f10781H[1]) + this.f10784u.j();
        if (b8.e() && (i12 = this.f10774A) != -1 && this.f10775B != Integer.MIN_VALUE && (H7 = H(i12)) != null) {
            if (this.f10787x) {
                i13 = this.f10784u.i() - this.f10784u.d(H7);
                g8 = this.f10775B;
            } else {
                g8 = this.f10784u.g(H7) - this.f10784u.m();
                i13 = this.f10775B;
            }
            int i15 = i13 - g8;
            if (i15 > 0) {
                max += i15;
            } else {
                max2 -= i15;
            }
        }
        a aVar3 = this.f10778E;
        if (!aVar3.f10793d ? !this.f10787x : this.f10787x) {
            i14 = 1;
        }
        w2(wVar, b8, aVar3, i14);
        B(wVar);
        this.f10783t.f10811m = B2();
        this.f10783t.f10808j = b8.e();
        this.f10783t.f10807i = 0;
        a aVar4 = this.f10778E;
        if (aVar4.f10793d) {
            P2(aVar4);
            c cVar2 = this.f10783t;
            cVar2.f10806h = max;
            Y1(wVar, cVar2, b8, false);
            c cVar3 = this.f10783t;
            i9 = cVar3.f10800b;
            int i16 = cVar3.f10802d;
            int i17 = cVar3.f10801c;
            if (i17 > 0) {
                max2 += i17;
            }
            N2(this.f10778E);
            c cVar4 = this.f10783t;
            cVar4.f10806h = max2;
            cVar4.f10802d += cVar4.f10803e;
            Y1(wVar, cVar4, b8, false);
            c cVar5 = this.f10783t;
            i8 = cVar5.f10800b;
            int i18 = cVar5.f10801c;
            if (i18 > 0) {
                O2(i16, i9);
                c cVar6 = this.f10783t;
                cVar6.f10806h = i18;
                Y1(wVar, cVar6, b8, false);
                i9 = this.f10783t.f10800b;
            }
        } else {
            N2(aVar4);
            c cVar7 = this.f10783t;
            cVar7.f10806h = max2;
            Y1(wVar, cVar7, b8, false);
            c cVar8 = this.f10783t;
            i8 = cVar8.f10800b;
            int i19 = cVar8.f10802d;
            int i20 = cVar8.f10801c;
            if (i20 > 0) {
                max += i20;
            }
            P2(this.f10778E);
            c cVar9 = this.f10783t;
            cVar9.f10806h = max;
            cVar9.f10802d += cVar9.f10803e;
            Y1(wVar, cVar9, b8, false);
            c cVar10 = this.f10783t;
            i9 = cVar10.f10800b;
            int i21 = cVar10.f10801c;
            if (i21 > 0) {
                M2(i19, i8);
                c cVar11 = this.f10783t;
                cVar11.f10806h = i21;
                Y1(wVar, cVar11, b8, false);
                i8 = this.f10783t.f10800b;
            }
        }
        if (O() > 0) {
            if (this.f10787x ^ this.f10788y) {
                int m23 = m2(i8, wVar, b8, true);
                i10 = i9 + m23;
                i11 = i8 + m23;
                m22 = n2(i10, wVar, b8, false);
            } else {
                int n22 = n2(i9, wVar, b8, true);
                i10 = i9 + n22;
                i11 = i8 + n22;
                m22 = m2(i11, wVar, b8, false);
            }
            i9 = i10 + m22;
            i8 = i11 + m22;
        }
        v2(wVar, b8, i9, i8);
        if (b8.e()) {
            this.f10778E.e();
        } else {
            this.f10784u.s();
        }
        this.f10785v = this.f10788y;
    }

    View b2(boolean z7, boolean z8) {
        return this.f10787x ? i2(0, O(), z7, z8) : i2(O() - 1, -1, z7, z8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF c(int i8) {
        if (O() == 0) {
            return null;
        }
        int i9 = (i8 < l0(N(0))) != this.f10787x ? -1 : 1;
        return this.f10782s == 0 ? new PointF(i9, 0.0f) : new PointF(0.0f, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.B b8) {
        super.c1(b8);
        this.f10777D = null;
        this.f10774A = -1;
        this.f10775B = Integer.MIN_VALUE;
        this.f10778E.e();
    }

    View c2(boolean z7, boolean z8) {
        return this.f10787x ? i2(O() - 1, -1, z7, z8) : i2(0, O(), z7, z8);
    }

    public int d2() {
        View i22 = i2(0, O(), false, true);
        if (i22 == null) {
            return -1;
        }
        return l0(i22);
    }

    public int e2() {
        View i22 = i2(O() - 1, -1, true, false);
        if (i22 == null) {
            return -1;
        }
        return l0(i22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f10777D = dVar;
            if (this.f10774A != -1) {
                dVar.b();
            }
            x1();
        }
    }

    public int g2() {
        View i22 = i2(O() - 1, -1, false, true);
        if (i22 == null) {
            return -1;
        }
        return l0(i22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable h1() {
        if (this.f10777D != null) {
            return new d(this.f10777D);
        }
        d dVar = new d();
        if (O() > 0) {
            X1();
            boolean z7 = this.f10785v ^ this.f10787x;
            dVar.f10814t = z7;
            if (z7) {
                View o22 = o2();
                dVar.f10813s = this.f10784u.i() - this.f10784u.d(o22);
                dVar.f10812o = l0(o22);
            } else {
                View p22 = p2();
                dVar.f10812o = l0(p22);
                dVar.f10813s = this.f10784u.g(p22) - this.f10784u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    View h2(int i8, int i9) {
        int i10;
        int i11;
        X1();
        if (i9 <= i8 && i9 >= i8) {
            return N(i8);
        }
        if (this.f10784u.g(N(i8)) < this.f10784u.m()) {
            i10 = 16644;
            i11 = 16388;
        } else {
            i10 = 4161;
            i11 = 4097;
        }
        return this.f10782s == 0 ? this.f10991e.a(i8, i9, i10, i11) : this.f10992f.a(i8, i9, i10, i11);
    }

    View i2(int i8, int i9, boolean z7, boolean z8) {
        X1();
        int i10 = z7 ? 24579 : 320;
        int i11 = z8 ? 320 : 0;
        return this.f10782s == 0 ? this.f10991e.a(i8, i9, i10, i11) : this.f10992f.a(i8, i9, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(String str) {
        if (this.f10777D == null) {
            super.l(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View l2(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.B r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.X1()
            int r1 = r16.O()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.O()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.m r7 = r0.f10784u
            int r7 = r7.m()
            androidx.recyclerview.widget.m r8 = r0.f10784u
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.N(r1)
            int r13 = r0.l0(r12)
            androidx.recyclerview.widget.m r14 = r0.f10784u
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.m r15 = r0.f10784u
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            goto L82
        L7d:
            if (r10 == 0) goto L81
            r9 = r10
            goto L82
        L81:
            r9 = r11
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.l2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.f10782s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.f10782s == 1;
    }

    protected int q2(RecyclerView.B b8) {
        if (b8.d()) {
            return this.f10784u.n();
        }
        return 0;
    }

    public int r2() {
        return this.f10782s;
    }

    protected boolean s2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i8, int i9, RecyclerView.B b8, RecyclerView.p.c cVar) {
        if (this.f10782s != 0) {
            i8 = i9;
        }
        if (O() == 0 || i8 == 0) {
            return;
        }
        X1();
        L2(i8 > 0 ? 1 : -1, Math.abs(i8), true, b8);
        R1(b8, this.f10783t, cVar);
    }

    public boolean t2() {
        return this.f10789z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void u(int i8, RecyclerView.p.c cVar) {
        boolean z7;
        int i9;
        d dVar = this.f10777D;
        if (dVar == null || !dVar.a()) {
            C2();
            z7 = this.f10787x;
            i9 = this.f10774A;
            if (i9 == -1) {
                i9 = z7 ? i8 - 1 : 0;
            }
        } else {
            d dVar2 = this.f10777D;
            z7 = dVar2.f10814t;
            i9 = dVar2.f10812o;
        }
        int i10 = z7 ? -1 : 1;
        for (int i11 = 0; i11 < this.f10780G && i9 >= 0 && i9 < i8; i11++) {
            cVar.a(i9, 0);
            i9 += i10;
        }
    }

    void u2(RecyclerView.w wVar, RecyclerView.B b8, c cVar, b bVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int f8;
        View d8 = cVar.d(wVar);
        if (d8 == null) {
            bVar.f10796b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d8.getLayoutParams();
        if (cVar.f10810l == null) {
            if (this.f10787x == (cVar.f10804f == -1)) {
                i(d8);
            } else {
                j(d8, 0);
            }
        } else {
            if (this.f10787x == (cVar.f10804f == -1)) {
                g(d8);
            } else {
                h(d8, 0);
            }
        }
        E0(d8, 0, 0);
        bVar.f10795a = this.f10784u.e(d8);
        if (this.f10782s == 1) {
            if (s2()) {
                f8 = s0() - j0();
                i11 = f8 - this.f10784u.f(d8);
            } else {
                i11 = i0();
                f8 = this.f10784u.f(d8) + i11;
            }
            if (cVar.f10804f == -1) {
                int i12 = cVar.f10800b;
                i10 = i12;
                i9 = f8;
                i8 = i12 - bVar.f10795a;
            } else {
                int i13 = cVar.f10800b;
                i8 = i13;
                i9 = f8;
                i10 = bVar.f10795a + i13;
            }
        } else {
            int k02 = k0();
            int f9 = this.f10784u.f(d8) + k02;
            if (cVar.f10804f == -1) {
                int i14 = cVar.f10800b;
                i9 = i14;
                i8 = k02;
                i10 = f9;
                i11 = i14 - bVar.f10795a;
            } else {
                int i15 = cVar.f10800b;
                i8 = k02;
                i9 = bVar.f10795a + i15;
                i10 = f9;
                i11 = i15;
            }
        }
        D0(d8, i11, i8, i9, i10);
        if (qVar.c() || qVar.b()) {
            bVar.f10797c = true;
        }
        bVar.f10798d = d8.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.B b8) {
        return S1(b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.B b8) {
        return T1(b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return true;
    }

    void w2(RecyclerView.w wVar, RecyclerView.B b8, a aVar, int i8) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.B b8) {
        return U1(b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.B b8) {
        return S1(b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.B b8) {
        return T1(b8);
    }

    public LinearLayoutManager(Context context, int i8, boolean z7) {
        this.f10782s = 1;
        this.f10786w = false;
        this.f10787x = false;
        this.f10788y = false;
        this.f10789z = true;
        this.f10774A = -1;
        this.f10775B = Integer.MIN_VALUE;
        this.f10777D = null;
        this.f10778E = new a();
        this.f10779F = new b();
        this.f10780G = 2;
        this.f10781H = new int[2];
        F2(i8);
        G2(z7);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f10782s = 1;
        this.f10786w = false;
        this.f10787x = false;
        this.f10788y = false;
        this.f10789z = true;
        this.f10774A = -1;
        this.f10775B = Integer.MIN_VALUE;
        this.f10777D = null;
        this.f10778E = new a();
        this.f10779F = new b();
        this.f10780G = 2;
        this.f10781H = new int[2];
        RecyclerView.p.d m02 = RecyclerView.p.m0(context, attributeSet, i8, i9);
        F2(m02.f11007a);
        G2(m02.f11009c);
        H2(m02.f11010d);
    }
}
