package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: B, reason: collision with root package name */
    private BitSet f11033B;

    /* renamed from: G, reason: collision with root package name */
    private boolean f11038G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f11039H;

    /* renamed from: I, reason: collision with root package name */
    private e f11040I;

    /* renamed from: J, reason: collision with root package name */
    private int f11041J;

    /* renamed from: O, reason: collision with root package name */
    private int[] f11046O;

    /* renamed from: t, reason: collision with root package name */
    f[] f11049t;

    /* renamed from: u, reason: collision with root package name */
    m f11050u;

    /* renamed from: v, reason: collision with root package name */
    m f11051v;

    /* renamed from: w, reason: collision with root package name */
    private int f11052w;

    /* renamed from: x, reason: collision with root package name */
    private int f11053x;

    /* renamed from: y, reason: collision with root package name */
    private final i f11054y;

    /* renamed from: s, reason: collision with root package name */
    private int f11048s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f11055z = false;

    /* renamed from: A, reason: collision with root package name */
    boolean f11032A = false;

    /* renamed from: C, reason: collision with root package name */
    int f11034C = -1;

    /* renamed from: D, reason: collision with root package name */
    int f11035D = Integer.MIN_VALUE;

    /* renamed from: E, reason: collision with root package name */
    d f11036E = new d();

    /* renamed from: F, reason: collision with root package name */
    private int f11037F = 2;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f11042K = new Rect();

    /* renamed from: L, reason: collision with root package name */
    private final b f11043L = new b();

    /* renamed from: M, reason: collision with root package name */
    private boolean f11044M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f11045N = true;

    /* renamed from: P, reason: collision with root package name */
    private final Runnable f11047P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.W1();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f11057a;

        /* renamed from: b, reason: collision with root package name */
        int f11058b;

        /* renamed from: c, reason: collision with root package name */
        boolean f11059c;

        /* renamed from: d, reason: collision with root package name */
        boolean f11060d;

        /* renamed from: e, reason: collision with root package name */
        boolean f11061e;

        /* renamed from: f, reason: collision with root package name */
        int[] f11062f;

        b() {
            c();
        }

        void a() {
            this.f11058b = this.f11059c ? StaggeredGridLayoutManager.this.f11050u.i() : StaggeredGridLayoutManager.this.f11050u.m();
        }

        void b(int i8) {
            if (this.f11059c) {
                this.f11058b = StaggeredGridLayoutManager.this.f11050u.i() - i8;
            } else {
                this.f11058b = StaggeredGridLayoutManager.this.f11050u.m() + i8;
            }
        }

        void c() {
            this.f11057a = -1;
            this.f11058b = Integer.MIN_VALUE;
            this.f11059c = false;
            this.f11060d = false;
            this.f11061e = false;
            int[] iArr = this.f11062f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f11062f;
            if (iArr == null || iArr.length < length) {
                this.f11062f = new int[StaggeredGridLayoutManager.this.f11049t.length];
            }
            for (int i8 = 0; i8 < length; i8++) {
                this.f11062f[i8] = fVarArr[i8].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        f f11064e;

        /* renamed from: f, reason: collision with root package name */
        boolean f11065f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f11065f;
        }

        public c(int i8, int i9) {
            super(i8, i9);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: A, reason: collision with root package name */
        boolean f11072A;

        /* renamed from: o, reason: collision with root package name */
        int f11073o;

        /* renamed from: s, reason: collision with root package name */
        int f11074s;

        /* renamed from: t, reason: collision with root package name */
        int f11075t;

        /* renamed from: u, reason: collision with root package name */
        int[] f11076u;

        /* renamed from: v, reason: collision with root package name */
        int f11077v;

        /* renamed from: w, reason: collision with root package name */
        int[] f11078w;

        /* renamed from: x, reason: collision with root package name */
        List f11079x;

        /* renamed from: y, reason: collision with root package name */
        boolean f11080y;

        /* renamed from: z, reason: collision with root package name */
        boolean f11081z;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e() {
        }

        void a() {
            this.f11076u = null;
            this.f11075t = 0;
            this.f11073o = -1;
            this.f11074s = -1;
        }

        void b() {
            this.f11076u = null;
            this.f11075t = 0;
            this.f11077v = 0;
            this.f11078w = null;
            this.f11079x = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f11073o);
            parcel.writeInt(this.f11074s);
            parcel.writeInt(this.f11075t);
            if (this.f11075t > 0) {
                parcel.writeIntArray(this.f11076u);
            }
            parcel.writeInt(this.f11077v);
            if (this.f11077v > 0) {
                parcel.writeIntArray(this.f11078w);
            }
            parcel.writeInt(this.f11080y ? 1 : 0);
            parcel.writeInt(this.f11081z ? 1 : 0);
            parcel.writeInt(this.f11072A ? 1 : 0);
            parcel.writeList(this.f11079x);
        }

        e(Parcel parcel) {
            this.f11073o = parcel.readInt();
            this.f11074s = parcel.readInt();
            int readInt = parcel.readInt();
            this.f11075t = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f11076u = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f11077v = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f11078w = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f11080y = parcel.readInt() == 1;
            this.f11081z = parcel.readInt() == 1;
            this.f11072A = parcel.readInt() == 1;
            this.f11079x = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f11075t = eVar.f11075t;
            this.f11073o = eVar.f11073o;
            this.f11074s = eVar.f11074s;
            this.f11076u = eVar.f11076u;
            this.f11077v = eVar.f11077v;
            this.f11078w = eVar.f11078w;
            this.f11080y = eVar.f11080y;
            this.f11081z = eVar.f11081z;
            this.f11072A = eVar.f11072A;
            this.f11079x = eVar.f11079x;
        }
    }

    class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList f11082a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f11083b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f11084c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f11085d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f11086e;

        f(int i8) {
            this.f11086e = i8;
        }

        void a(View view) {
            c n8 = n(view);
            n8.f11064e = this;
            this.f11082a.add(view);
            this.f11084c = Integer.MIN_VALUE;
            if (this.f11082a.size() == 1) {
                this.f11083b = Integer.MIN_VALUE;
            }
            if (n8.c() || n8.b()) {
                this.f11085d += StaggeredGridLayoutManager.this.f11050u.e(view);
            }
        }

        void b(boolean z7, int i8) {
            int l8 = z7 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l8 == Integer.MIN_VALUE) {
                return;
            }
            if (!z7 || l8 >= StaggeredGridLayoutManager.this.f11050u.i()) {
                if (z7 || l8 <= StaggeredGridLayoutManager.this.f11050u.m()) {
                    if (i8 != Integer.MIN_VALUE) {
                        l8 += i8;
                    }
                    this.f11084c = l8;
                    this.f11083b = l8;
                }
            }
        }

        void c() {
            d.a f8;
            ArrayList arrayList = this.f11082a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n8 = n(view);
            this.f11084c = StaggeredGridLayoutManager.this.f11050u.d(view);
            if (n8.f11065f && (f8 = StaggeredGridLayoutManager.this.f11036E.f(n8.a())) != null && f8.f11069s == 1) {
                this.f11084c += f8.a(this.f11086e);
            }
        }

        void d() {
            d.a f8;
            View view = (View) this.f11082a.get(0);
            c n8 = n(view);
            this.f11083b = StaggeredGridLayoutManager.this.f11050u.g(view);
            if (n8.f11065f && (f8 = StaggeredGridLayoutManager.this.f11036E.f(n8.a())) != null && f8.f11069s == -1) {
                this.f11083b -= f8.a(this.f11086e);
            }
        }

        void e() {
            this.f11082a.clear();
            q();
            this.f11085d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f11055z ? i(this.f11082a.size() - 1, -1, true) : i(0, this.f11082a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f11055z ? i(0, this.f11082a.size(), true) : i(this.f11082a.size() - 1, -1, true);
        }

        int h(int i8, int i9, boolean z7, boolean z8, boolean z9) {
            int m8 = StaggeredGridLayoutManager.this.f11050u.m();
            int i10 = StaggeredGridLayoutManager.this.f11050u.i();
            int i11 = i9 > i8 ? 1 : -1;
            while (i8 != i9) {
                View view = (View) this.f11082a.get(i8);
                int g8 = StaggeredGridLayoutManager.this.f11050u.g(view);
                int d8 = StaggeredGridLayoutManager.this.f11050u.d(view);
                boolean z10 = false;
                boolean z11 = !z9 ? g8 >= i10 : g8 > i10;
                if (!z9 ? d8 > m8 : d8 >= m8) {
                    z10 = true;
                }
                if (z11 && z10) {
                    if (z7 && z8) {
                        if (g8 >= m8 && d8 <= i10) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z8) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (g8 < m8 || d8 > i10) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i8 += i11;
            }
            return -1;
        }

        int i(int i8, int i9, boolean z7) {
            return h(i8, i9, false, false, z7);
        }

        public int j() {
            return this.f11085d;
        }

        int k() {
            int i8 = this.f11084c;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            c();
            return this.f11084c;
        }

        int l(int i8) {
            int i9 = this.f11084c;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            if (this.f11082a.size() == 0) {
                return i8;
            }
            c();
            return this.f11084c;
        }

        public View m(int i8, int i9) {
            View view = null;
            if (i9 != -1) {
                int size = this.f11082a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f11082a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f11055z && staggeredGridLayoutManager.l0(view2) >= i8) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f11055z && staggeredGridLayoutManager2.l0(view2) <= i8) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f11082a.size();
                int i10 = 0;
                while (i10 < size2) {
                    View view3 = (View) this.f11082a.get(i10);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f11055z && staggeredGridLayoutManager3.l0(view3) <= i8) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f11055z && staggeredGridLayoutManager4.l0(view3) >= i8) || !view3.hasFocusable()) {
                        break;
                    }
                    i10++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i8 = this.f11083b;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            d();
            return this.f11083b;
        }

        int p(int i8) {
            int i9 = this.f11083b;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            if (this.f11082a.size() == 0) {
                return i8;
            }
            d();
            return this.f11083b;
        }

        void q() {
            this.f11083b = Integer.MIN_VALUE;
            this.f11084c = Integer.MIN_VALUE;
        }

        void r(int i8) {
            int i9 = this.f11083b;
            if (i9 != Integer.MIN_VALUE) {
                this.f11083b = i9 + i8;
            }
            int i10 = this.f11084c;
            if (i10 != Integer.MIN_VALUE) {
                this.f11084c = i10 + i8;
            }
        }

        void s() {
            int size = this.f11082a.size();
            View view = (View) this.f11082a.remove(size - 1);
            c n8 = n(view);
            n8.f11064e = null;
            if (n8.c() || n8.b()) {
                this.f11085d -= StaggeredGridLayoutManager.this.f11050u.e(view);
            }
            if (size == 1) {
                this.f11083b = Integer.MIN_VALUE;
            }
            this.f11084c = Integer.MIN_VALUE;
        }

        void t() {
            View view = (View) this.f11082a.remove(0);
            c n8 = n(view);
            n8.f11064e = null;
            if (this.f11082a.size() == 0) {
                this.f11084c = Integer.MIN_VALUE;
            }
            if (n8.c() || n8.b()) {
                this.f11085d -= StaggeredGridLayoutManager.this.f11050u.e(view);
            }
            this.f11083b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c n8 = n(view);
            n8.f11064e = this;
            this.f11082a.add(0, view);
            this.f11083b = Integer.MIN_VALUE;
            if (this.f11082a.size() == 1) {
                this.f11084c = Integer.MIN_VALUE;
            }
            if (n8.c() || n8.b()) {
                this.f11085d += StaggeredGridLayoutManager.this.f11050u.e(view);
            }
        }

        void v(int i8) {
            this.f11083b = i8;
            this.f11084c = i8;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        RecyclerView.p.d m02 = RecyclerView.p.m0(context, attributeSet, i8, i9);
        N2(m02.f11007a);
        P2(m02.f11008b);
        O2(m02.f11009c);
        this.f11054y = new i();
        e2();
    }

    private void A2(View view, int i8, int i9, boolean z7) {
        o(view, this.f11042K);
        c cVar = (c) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f11042K;
        int X22 = X2(i8, i10 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i11 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f11042K;
        int X23 = X2(i9, i11 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z7 ? L1(view, X22, X23, cVar) : J1(view, X22, X23, cVar)) {
            view.measure(X22, X23);
        }
    }

    private void B2(View view, c cVar, boolean z7) {
        if (cVar.f11065f) {
            if (this.f11052w == 1) {
                A2(view, this.f11041J, RecyclerView.p.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z7);
                return;
            } else {
                A2(view, RecyclerView.p.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f11041J, z7);
                return;
            }
        }
        if (this.f11052w == 1) {
            A2(view, RecyclerView.p.P(this.f11053x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z7);
        } else {
            A2(view, RecyclerView.p.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.P(this.f11053x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void C2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.B r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean):void");
    }

    private boolean D2(int i8) {
        if (this.f11052w == 0) {
            return (i8 == -1) != this.f11032A;
        }
        return ((i8 == -1) == this.f11032A) == z2();
    }

    private void F2(View view) {
        for (int i8 = this.f11048s - 1; i8 >= 0; i8--) {
            this.f11049t[i8].u(view);
        }
    }

    private void G2(RecyclerView.w wVar, i iVar) {
        if (!iVar.f11240a || iVar.f11248i) {
            return;
        }
        if (iVar.f11241b == 0) {
            if (iVar.f11244e == -1) {
                H2(wVar, iVar.f11246g);
                return;
            } else {
                I2(wVar, iVar.f11245f);
                return;
            }
        }
        if (iVar.f11244e != -1) {
            int r22 = r2(iVar.f11246g) - iVar.f11246g;
            I2(wVar, r22 < 0 ? iVar.f11245f : Math.min(r22, iVar.f11241b) + iVar.f11245f);
        } else {
            int i8 = iVar.f11245f;
            int q22 = i8 - q2(i8);
            H2(wVar, q22 < 0 ? iVar.f11246g : iVar.f11246g - Math.min(q22, iVar.f11241b));
        }
    }

    private void H2(RecyclerView.w wVar, int i8) {
        for (int O7 = O() - 1; O7 >= 0; O7--) {
            View N7 = N(O7);
            if (this.f11050u.g(N7) < i8 || this.f11050u.q(N7) < i8) {
                return;
            }
            c cVar = (c) N7.getLayoutParams();
            if (cVar.f11065f) {
                for (int i9 = 0; i9 < this.f11048s; i9++) {
                    if (this.f11049t[i9].f11082a.size() == 1) {
                        return;
                    }
                }
                for (int i10 = 0; i10 < this.f11048s; i10++) {
                    this.f11049t[i10].s();
                }
            } else if (cVar.f11064e.f11082a.size() == 1) {
                return;
            } else {
                cVar.f11064e.s();
            }
            q1(N7, wVar);
        }
    }

    private void I2(RecyclerView.w wVar, int i8) {
        while (O() > 0) {
            View N7 = N(0);
            if (this.f11050u.d(N7) > i8 || this.f11050u.p(N7) > i8) {
                return;
            }
            c cVar = (c) N7.getLayoutParams();
            if (cVar.f11065f) {
                for (int i9 = 0; i9 < this.f11048s; i9++) {
                    if (this.f11049t[i9].f11082a.size() == 1) {
                        return;
                    }
                }
                for (int i10 = 0; i10 < this.f11048s; i10++) {
                    this.f11049t[i10].t();
                }
            } else if (cVar.f11064e.f11082a.size() == 1) {
                return;
            } else {
                cVar.f11064e.t();
            }
            q1(N7, wVar);
        }
    }

    private void J2() {
        if (this.f11051v.k() == 1073741824) {
            return;
        }
        int O7 = O();
        float f8 = 0.0f;
        for (int i8 = 0; i8 < O7; i8++) {
            View N7 = N(i8);
            float e8 = this.f11051v.e(N7);
            if (e8 >= f8) {
                if (((c) N7.getLayoutParams()).e()) {
                    e8 = (e8 * 1.0f) / this.f11048s;
                }
                f8 = Math.max(f8, e8);
            }
        }
        int i9 = this.f11053x;
        int round = Math.round(f8 * this.f11048s);
        if (this.f11051v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f11051v.n());
        }
        V2(round);
        if (this.f11053x == i9) {
            return;
        }
        for (int i10 = 0; i10 < O7; i10++) {
            View N8 = N(i10);
            c cVar = (c) N8.getLayoutParams();
            if (!cVar.f11065f) {
                if (z2() && this.f11052w == 1) {
                    int i11 = this.f11048s;
                    int i12 = cVar.f11064e.f11086e;
                    N8.offsetLeftAndRight(((-((i11 - 1) - i12)) * this.f11053x) - ((-((i11 - 1) - i12)) * i9));
                } else {
                    int i13 = cVar.f11064e.f11086e;
                    int i14 = this.f11053x * i13;
                    int i15 = i13 * i9;
                    if (this.f11052w == 1) {
                        N8.offsetLeftAndRight(i14 - i15);
                    } else {
                        N8.offsetTopAndBottom(i14 - i15);
                    }
                }
            }
        }
    }

    private void K2() {
        if (this.f11052w == 1 || !z2()) {
            this.f11032A = this.f11055z;
        } else {
            this.f11032A = !this.f11055z;
        }
    }

    private void M2(int i8) {
        i iVar = this.f11054y;
        iVar.f11244e = i8;
        iVar.f11243d = this.f11032A != (i8 == -1) ? -1 : 1;
    }

    private void Q1(View view) {
        for (int i8 = this.f11048s - 1; i8 >= 0; i8--) {
            this.f11049t[i8].a(view);
        }
    }

    private void Q2(int i8, int i9) {
        for (int i10 = 0; i10 < this.f11048s; i10++) {
            if (!this.f11049t[i10].f11082a.isEmpty()) {
                W2(this.f11049t[i10], i8, i9);
            }
        }
    }

    private void R1(b bVar) {
        e eVar = this.f11040I;
        int i8 = eVar.f11075t;
        if (i8 > 0) {
            if (i8 == this.f11048s) {
                for (int i9 = 0; i9 < this.f11048s; i9++) {
                    this.f11049t[i9].e();
                    e eVar2 = this.f11040I;
                    int i10 = eVar2.f11076u[i9];
                    if (i10 != Integer.MIN_VALUE) {
                        i10 += eVar2.f11081z ? this.f11050u.i() : this.f11050u.m();
                    }
                    this.f11049t[i9].v(i10);
                }
            } else {
                eVar.b();
                e eVar3 = this.f11040I;
                eVar3.f11073o = eVar3.f11074s;
            }
        }
        e eVar4 = this.f11040I;
        this.f11039H = eVar4.f11072A;
        O2(eVar4.f11080y);
        K2();
        e eVar5 = this.f11040I;
        int i11 = eVar5.f11073o;
        if (i11 != -1) {
            this.f11034C = i11;
            bVar.f11059c = eVar5.f11081z;
        } else {
            bVar.f11059c = this.f11032A;
        }
        if (eVar5.f11077v > 1) {
            d dVar = this.f11036E;
            dVar.f11066a = eVar5.f11078w;
            dVar.f11067b = eVar5.f11079x;
        }
    }

    private boolean R2(RecyclerView.B b8, b bVar) {
        bVar.f11057a = this.f11038G ? k2(b8.b()) : g2(b8.b());
        bVar.f11058b = Integer.MIN_VALUE;
        return true;
    }

    private void U1(View view, c cVar, i iVar) {
        if (iVar.f11244e == 1) {
            if (cVar.f11065f) {
                Q1(view);
                return;
            } else {
                cVar.f11064e.a(view);
                return;
            }
        }
        if (cVar.f11065f) {
            F2(view);
        } else {
            cVar.f11064e.u(view);
        }
    }

    private void U2(int i8, RecyclerView.B b8) {
        int i9;
        int i10;
        int c8;
        i iVar = this.f11054y;
        boolean z7 = false;
        iVar.f11241b = 0;
        iVar.f11242c = i8;
        if (!B0() || (c8 = b8.c()) == -1) {
            i9 = 0;
            i10 = 0;
        } else {
            if (this.f11032A == (c8 < i8)) {
                i9 = this.f11050u.n();
                i10 = 0;
            } else {
                i10 = this.f11050u.n();
                i9 = 0;
            }
        }
        if (R()) {
            this.f11054y.f11245f = this.f11050u.m() - i10;
            this.f11054y.f11246g = this.f11050u.i() + i9;
        } else {
            this.f11054y.f11246g = this.f11050u.h() + i9;
            this.f11054y.f11245f = -i10;
        }
        i iVar2 = this.f11054y;
        iVar2.f11247h = false;
        iVar2.f11240a = true;
        if (this.f11050u.k() == 0 && this.f11050u.h() == 0) {
            z7 = true;
        }
        iVar2.f11248i = z7;
    }

    private int V1(int i8) {
        if (O() == 0) {
            return this.f11032A ? 1 : -1;
        }
        return (i8 < n2()) != this.f11032A ? -1 : 1;
    }

    private void W2(f fVar, int i8, int i9) {
        int j8 = fVar.j();
        if (i8 == -1) {
            if (fVar.o() + j8 <= i9) {
                this.f11033B.set(fVar.f11086e, false);
            }
        } else if (fVar.k() - j8 >= i9) {
            this.f11033B.set(fVar.f11086e, false);
        }
    }

    private boolean X1(f fVar) {
        if (this.f11032A) {
            if (fVar.k() < this.f11050u.i()) {
                ArrayList arrayList = fVar.f11082a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f11065f;
            }
        } else if (fVar.o() > this.f11050u.m()) {
            return !fVar.n((View) fVar.f11082a.get(0)).f11065f;
        }
        return false;
    }

    private int X2(int i8, int i9, int i10) {
        if (i9 == 0 && i10 == 0) {
            return i8;
        }
        int mode = View.MeasureSpec.getMode(i8);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - i9) - i10), mode) : i8;
    }

    private int Y1(RecyclerView.B b8) {
        if (O() == 0) {
            return 0;
        }
        return p.a(b8, this.f11050u, i2(!this.f11045N), h2(!this.f11045N), this, this.f11045N);
    }

    private int Z1(RecyclerView.B b8) {
        if (O() == 0) {
            return 0;
        }
        return p.b(b8, this.f11050u, i2(!this.f11045N), h2(!this.f11045N), this, this.f11045N, this.f11032A);
    }

    private int a2(RecyclerView.B b8) {
        if (O() == 0) {
            return 0;
        }
        return p.c(b8, this.f11050u, i2(!this.f11045N), h2(!this.f11045N), this, this.f11045N);
    }

    private int b2(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 17 ? i8 != 33 ? i8 != 66 ? (i8 == 130 && this.f11052w == 1) ? 1 : Integer.MIN_VALUE : this.f11052w == 0 ? 1 : Integer.MIN_VALUE : this.f11052w == 1 ? -1 : Integer.MIN_VALUE : this.f11052w == 0 ? -1 : Integer.MIN_VALUE : (this.f11052w != 1 && z2()) ? -1 : 1 : (this.f11052w != 1 && z2()) ? 1 : -1;
    }

    private d.a c2(int i8) {
        d.a aVar = new d.a();
        aVar.f11070t = new int[this.f11048s];
        for (int i9 = 0; i9 < this.f11048s; i9++) {
            aVar.f11070t[i9] = i8 - this.f11049t[i9].l(i8);
        }
        return aVar;
    }

    private d.a d2(int i8) {
        d.a aVar = new d.a();
        aVar.f11070t = new int[this.f11048s];
        for (int i9 = 0; i9 < this.f11048s; i9++) {
            aVar.f11070t[i9] = this.f11049t[i9].p(i8) - i8;
        }
        return aVar;
    }

    private void e2() {
        this.f11050u = m.b(this, this.f11052w);
        this.f11051v = m.b(this, 1 - this.f11052w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int f2(RecyclerView.w wVar, i iVar, RecyclerView.B b8) {
        f fVar;
        int e8;
        int i8;
        int i9;
        int e9;
        boolean z7;
        ?? r9 = 0;
        this.f11033B.set(0, this.f11048s, true);
        int i10 = this.f11054y.f11248i ? iVar.f11244e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : iVar.f11244e == 1 ? iVar.f11246g + iVar.f11241b : iVar.f11245f - iVar.f11241b;
        Q2(iVar.f11244e, i10);
        int i11 = this.f11032A ? this.f11050u.i() : this.f11050u.m();
        boolean z8 = false;
        while (iVar.a(b8) && (this.f11054y.f11248i || !this.f11033B.isEmpty())) {
            View b9 = iVar.b(wVar);
            c cVar = (c) b9.getLayoutParams();
            int a8 = cVar.a();
            int g8 = this.f11036E.g(a8);
            boolean z9 = g8 == -1 ? true : r9;
            if (z9) {
                fVar = cVar.f11065f ? this.f11049t[r9] : t2(iVar);
                this.f11036E.n(a8, fVar);
            } else {
                fVar = this.f11049t[g8];
            }
            f fVar2 = fVar;
            cVar.f11064e = fVar2;
            if (iVar.f11244e == 1) {
                i(b9);
            } else {
                j(b9, r9);
            }
            B2(b9, cVar, r9);
            if (iVar.f11244e == 1) {
                int p22 = cVar.f11065f ? p2(i11) : fVar2.l(i11);
                int e10 = this.f11050u.e(b9) + p22;
                if (z9 && cVar.f11065f) {
                    d.a c22 = c2(p22);
                    c22.f11069s = -1;
                    c22.f11068o = a8;
                    this.f11036E.a(c22);
                }
                i8 = e10;
                e8 = p22;
            } else {
                int s22 = cVar.f11065f ? s2(i11) : fVar2.p(i11);
                e8 = s22 - this.f11050u.e(b9);
                if (z9 && cVar.f11065f) {
                    d.a d22 = d2(s22);
                    d22.f11069s = 1;
                    d22.f11068o = a8;
                    this.f11036E.a(d22);
                }
                i8 = s22;
            }
            if (cVar.f11065f && iVar.f11243d == -1) {
                if (z9) {
                    this.f11044M = true;
                } else {
                    if (!(iVar.f11244e == 1 ? S1() : T1())) {
                        d.a f8 = this.f11036E.f(a8);
                        if (f8 != null) {
                            f8.f11071u = true;
                        }
                        this.f11044M = true;
                    }
                }
            }
            U1(b9, cVar, iVar);
            if (z2() && this.f11052w == 1) {
                int i12 = cVar.f11065f ? this.f11051v.i() : this.f11051v.i() - (((this.f11048s - 1) - fVar2.f11086e) * this.f11053x);
                e9 = i12;
                i9 = i12 - this.f11051v.e(b9);
            } else {
                int m8 = cVar.f11065f ? this.f11051v.m() : (fVar2.f11086e * this.f11053x) + this.f11051v.m();
                i9 = m8;
                e9 = this.f11051v.e(b9) + m8;
            }
            if (this.f11052w == 1) {
                D0(b9, i9, e8, e9, i8);
            } else {
                D0(b9, e8, i9, i8, e9);
            }
            if (cVar.f11065f) {
                Q2(this.f11054y.f11244e, i10);
            } else {
                W2(fVar2, this.f11054y.f11244e, i10);
            }
            G2(wVar, this.f11054y);
            if (!this.f11054y.f11247h || !b9.hasFocusable()) {
                z7 = false;
            } else if (cVar.f11065f) {
                this.f11033B.clear();
                z7 = false;
            } else {
                z7 = false;
                this.f11033B.set(fVar2.f11086e, false);
            }
            r9 = z7;
            z8 = true;
        }
        int i13 = r9;
        if (!z8) {
            G2(wVar, this.f11054y);
        }
        int m9 = this.f11054y.f11244e == -1 ? this.f11050u.m() - s2(this.f11050u.m()) : p2(this.f11050u.i()) - this.f11050u.i();
        return m9 > 0 ? Math.min(iVar.f11241b, m9) : i13;
    }

    private int g2(int i8) {
        int O7 = O();
        for (int i9 = 0; i9 < O7; i9++) {
            int l02 = l0(N(i9));
            if (l02 >= 0 && l02 < i8) {
                return l02;
            }
        }
        return 0;
    }

    private int k2(int i8) {
        for (int O7 = O() - 1; O7 >= 0; O7--) {
            int l02 = l0(N(O7));
            if (l02 >= 0 && l02 < i8) {
                return l02;
            }
        }
        return 0;
    }

    private void l2(RecyclerView.w wVar, RecyclerView.B b8, boolean z7) {
        int i8;
        int p22 = p2(Integer.MIN_VALUE);
        if (p22 != Integer.MIN_VALUE && (i8 = this.f11050u.i() - p22) > 0) {
            int i9 = i8 - (-L2(-i8, wVar, b8));
            if (!z7 || i9 <= 0) {
                return;
            }
            this.f11050u.r(i9);
        }
    }

    private void m2(RecyclerView.w wVar, RecyclerView.B b8, boolean z7) {
        int m8;
        int s22 = s2(Integer.MAX_VALUE);
        if (s22 != Integer.MAX_VALUE && (m8 = s22 - this.f11050u.m()) > 0) {
            int L22 = m8 - L2(m8, wVar, b8);
            if (!z7 || L22 <= 0) {
                return;
            }
            this.f11050u.r(-L22);
        }
    }

    private int p2(int i8) {
        int l8 = this.f11049t[0].l(i8);
        for (int i9 = 1; i9 < this.f11048s; i9++) {
            int l9 = this.f11049t[i9].l(i8);
            if (l9 > l8) {
                l8 = l9;
            }
        }
        return l8;
    }

    private int q2(int i8) {
        int p8 = this.f11049t[0].p(i8);
        for (int i9 = 1; i9 < this.f11048s; i9++) {
            int p9 = this.f11049t[i9].p(i8);
            if (p9 > p8) {
                p8 = p9;
            }
        }
        return p8;
    }

    private int r2(int i8) {
        int l8 = this.f11049t[0].l(i8);
        for (int i9 = 1; i9 < this.f11048s; i9++) {
            int l9 = this.f11049t[i9].l(i8);
            if (l9 < l8) {
                l8 = l9;
            }
        }
        return l8;
    }

    private int s2(int i8) {
        int p8 = this.f11049t[0].p(i8);
        for (int i9 = 1; i9 < this.f11048s; i9++) {
            int p9 = this.f11049t[i9].p(i8);
            if (p9 < p8) {
                p8 = p9;
            }
        }
        return p8;
    }

    private f t2(i iVar) {
        int i8;
        int i9;
        int i10;
        if (D2(iVar.f11244e)) {
            i9 = this.f11048s - 1;
            i8 = -1;
            i10 = -1;
        } else {
            i8 = this.f11048s;
            i9 = 0;
            i10 = 1;
        }
        f fVar = null;
        if (iVar.f11244e == 1) {
            int m8 = this.f11050u.m();
            int i11 = Integer.MAX_VALUE;
            while (i9 != i8) {
                f fVar2 = this.f11049t[i9];
                int l8 = fVar2.l(m8);
                if (l8 < i11) {
                    fVar = fVar2;
                    i11 = l8;
                }
                i9 += i10;
            }
            return fVar;
        }
        int i12 = this.f11050u.i();
        int i13 = Integer.MIN_VALUE;
        while (i9 != i8) {
            f fVar3 = this.f11049t[i9];
            int p8 = fVar3.p(i12);
            if (p8 > i13) {
                fVar = fVar3;
                i13 = p8;
            }
            i9 += i10;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f11032A
            if (r0 == 0) goto L9
            int r0 = r6.o2()
            goto Ld
        L9:
            int r0 = r6.n2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f11036E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f11036E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f11036E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f11036E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f11036E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f11032A
            if (r7 == 0) goto L4e
            int r7 = r6.n2()
            goto L52
        L4e:
            int r7 = r6.o2()
        L52:
            if (r3 > r7) goto L57
            r6.x1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.B b8) {
        return a2(b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        return L2(i8, wVar, b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i8) {
        e eVar = this.f11040I;
        if (eVar != null && eVar.f11073o != i8) {
            eVar.a();
        }
        this.f11034C = i8;
        this.f11035D = Integer.MIN_VALUE;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        return L2(i8, wVar, b8);
    }

    void E2(int i8, RecyclerView.B b8) {
        int n22;
        int i9;
        if (i8 > 0) {
            n22 = o2();
            i9 = 1;
        } else {
            n22 = n2();
            i9 = -1;
        }
        this.f11054y.f11240a = true;
        U2(n22, b8);
        M2(i9);
        i iVar = this.f11054y;
        iVar.f11242c = n22 + iVar.f11243d;
        iVar.f11241b = Math.abs(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G0(int i8) {
        super.G0(i8);
        for (int i9 = 0; i9 < this.f11048s; i9++) {
            this.f11049t[i9].r(i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(Rect rect, int i8, int i9) {
        int s8;
        int s9;
        int i02 = i0() + j0();
        int k02 = k0() + h0();
        if (this.f11052w == 1) {
            s9 = RecyclerView.p.s(i9, rect.height() + k02, f0());
            s8 = RecyclerView.p.s(i8, (this.f11053x * this.f11048s) + i02, g0());
        } else {
            s8 = RecyclerView.p.s(i8, rect.width() + i02, g0());
            s9 = RecyclerView.p.s(i9, (this.f11053x * this.f11048s) + k02, f0());
        }
        F1(s8, s9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(int i8) {
        super.H0(i8);
        for (int i9 = 0; i9 < this.f11048s; i9++) {
            this.f11049t[i9].r(i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return this.f11052w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f11036E.b();
        for (int i8 = 0; i8 < this.f11048s; i8++) {
            this.f11049t[i8].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int L2(int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        if (O() == 0 || i8 == 0) {
            return 0;
        }
        E2(i8, b8);
        int f22 = f2(wVar, this.f11054y, b8);
        if (this.f11054y.f11241b >= f22) {
            i8 = i8 < 0 ? -f22 : f22;
        }
        this.f11050u.r(-i8);
        this.f11038G = this.f11032A;
        i iVar = this.f11054y;
        iVar.f11241b = 0;
        G2(wVar, iVar);
        return i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        s1(this.f11047P);
        for (int i8 = 0; i8 < this.f11048s; i8++) {
            this.f11049t[i8].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.B b8, int i8) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i8);
        N1(jVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View N0(View view, int i8, RecyclerView.w wVar, RecyclerView.B b8) {
        View G7;
        View m8;
        if (O() == 0 || (G7 = G(view)) == null) {
            return null;
        }
        K2();
        int b22 = b2(i8);
        if (b22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) G7.getLayoutParams();
        boolean z7 = cVar.f11065f;
        f fVar = cVar.f11064e;
        int o22 = b22 == 1 ? o2() : n2();
        U2(o22, b8);
        M2(b22);
        i iVar = this.f11054y;
        iVar.f11242c = iVar.f11243d + o22;
        iVar.f11241b = (int) (this.f11050u.n() * 0.33333334f);
        i iVar2 = this.f11054y;
        iVar2.f11247h = true;
        iVar2.f11240a = false;
        f2(wVar, iVar2, b8);
        this.f11038G = this.f11032A;
        if (!z7 && (m8 = fVar.m(o22, b22)) != null && m8 != G7) {
            return m8;
        }
        if (D2(b22)) {
            for (int i9 = this.f11048s - 1; i9 >= 0; i9--) {
                View m9 = this.f11049t[i9].m(o22, b22);
                if (m9 != null && m9 != G7) {
                    return m9;
                }
            }
        } else {
            for (int i10 = 0; i10 < this.f11048s; i10++) {
                View m10 = this.f11049t[i10].m(o22, b22);
                if (m10 != null && m10 != G7) {
                    return m10;
                }
            }
        }
        boolean z8 = (this.f11055z ^ true) == (b22 == -1);
        if (!z7) {
            View H7 = H(z8 ? fVar.f() : fVar.g());
            if (H7 != null && H7 != G7) {
                return H7;
            }
        }
        if (D2(b22)) {
            for (int i11 = this.f11048s - 1; i11 >= 0; i11--) {
                if (i11 != fVar.f11086e) {
                    View H8 = H(z8 ? this.f11049t[i11].f() : this.f11049t[i11].g());
                    if (H8 != null && H8 != G7) {
                        return H8;
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f11048s; i12++) {
                View H9 = H(z8 ? this.f11049t[i12].f() : this.f11049t[i12].g());
                if (H9 != null && H9 != G7) {
                    return H9;
                }
            }
        }
        return null;
    }

    public void N2(int i8) {
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i8 == this.f11052w) {
            return;
        }
        this.f11052w = i8;
        m mVar = this.f11050u;
        this.f11050u = this.f11051v;
        this.f11051v = mVar;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            View i22 = i2(false);
            View h22 = h2(false);
            if (i22 == null || h22 == null) {
                return;
            }
            int l02 = l0(i22);
            int l03 = l0(h22);
            if (l02 < l03) {
                accessibilityEvent.setFromIndex(l02);
                accessibilityEvent.setToIndex(l03);
            } else {
                accessibilityEvent.setFromIndex(l03);
                accessibilityEvent.setToIndex(l02);
            }
        }
    }

    public void O2(boolean z7) {
        l(null);
        e eVar = this.f11040I;
        if (eVar != null && eVar.f11080y != z7) {
            eVar.f11080y = z7;
        }
        this.f11055z = z7;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f11040I == null;
    }

    public void P2(int i8) {
        l(null);
        if (i8 != this.f11048s) {
            y2();
            this.f11048s = i8;
            this.f11033B = new BitSet(this.f11048s);
            this.f11049t = new f[this.f11048s];
            for (int i9 = 0; i9 < this.f11048s; i9++) {
                this.f11049t[i9] = new f(i9);
            }
            x1();
        }
    }

    boolean S1() {
        int l8 = this.f11049t[0].l(Integer.MIN_VALUE);
        for (int i8 = 1; i8 < this.f11048s; i8++) {
            if (this.f11049t[i8].l(Integer.MIN_VALUE) != l8) {
                return false;
            }
        }
        return true;
    }

    boolean S2(RecyclerView.B b8, b bVar) {
        int i8;
        if (!b8.e() && (i8 = this.f11034C) != -1) {
            if (i8 >= 0 && i8 < b8.b()) {
                e eVar = this.f11040I;
                if (eVar == null || eVar.f11073o == -1 || eVar.f11075t < 1) {
                    View H7 = H(this.f11034C);
                    if (H7 != null) {
                        bVar.f11057a = this.f11032A ? o2() : n2();
                        if (this.f11035D != Integer.MIN_VALUE) {
                            if (bVar.f11059c) {
                                bVar.f11058b = (this.f11050u.i() - this.f11035D) - this.f11050u.d(H7);
                            } else {
                                bVar.f11058b = (this.f11050u.m() + this.f11035D) - this.f11050u.g(H7);
                            }
                            return true;
                        }
                        if (this.f11050u.e(H7) > this.f11050u.n()) {
                            bVar.f11058b = bVar.f11059c ? this.f11050u.i() : this.f11050u.m();
                            return true;
                        }
                        int g8 = this.f11050u.g(H7) - this.f11050u.m();
                        if (g8 < 0) {
                            bVar.f11058b = -g8;
                            return true;
                        }
                        int i9 = this.f11050u.i() - this.f11050u.d(H7);
                        if (i9 < 0) {
                            bVar.f11058b = i9;
                            return true;
                        }
                        bVar.f11058b = Integer.MIN_VALUE;
                    } else {
                        int i10 = this.f11034C;
                        bVar.f11057a = i10;
                        int i11 = this.f11035D;
                        if (i11 == Integer.MIN_VALUE) {
                            bVar.f11059c = V1(i10) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i11);
                        }
                        bVar.f11060d = true;
                    }
                } else {
                    bVar.f11058b = Integer.MIN_VALUE;
                    bVar.f11057a = this.f11034C;
                }
                return true;
            }
            this.f11034C = -1;
            this.f11035D = Integer.MIN_VALUE;
        }
        return false;
    }

    boolean T1() {
        int p8 = this.f11049t[0].p(Integer.MIN_VALUE);
        for (int i8 = 1; i8 < this.f11048s; i8++) {
            if (this.f11049t[i8].p(Integer.MIN_VALUE) != p8) {
                return false;
            }
        }
        return true;
    }

    void T2(RecyclerView.B b8, b bVar) {
        if (S2(b8, bVar) || R2(b8, bVar)) {
            return;
        }
        bVar.a();
        bVar.f11057a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i8, int i9) {
        w2(i8, i9, 1);
    }

    void V2(int i8) {
        this.f11053x = i8 / this.f11048s;
        this.f11041J = View.MeasureSpec.makeMeasureSpec(i8, this.f11051v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        this.f11036E.b();
        x1();
    }

    boolean W1() {
        int n22;
        int o22;
        if (O() == 0 || this.f11037F == 0 || !v0()) {
            return false;
        }
        if (this.f11032A) {
            n22 = o2();
            o22 = n2();
        } else {
            n22 = n2();
            o22 = o2();
        }
        if (n22 == 0 && x2() != null) {
            this.f11036E.b();
            y1();
            x1();
            return true;
        }
        if (!this.f11044M) {
            return false;
        }
        int i8 = this.f11032A ? -1 : 1;
        int i9 = o22 + 1;
        d.a e8 = this.f11036E.e(n22, i9, i8, true);
        if (e8 == null) {
            this.f11044M = false;
            this.f11036E.d(i9);
            return false;
        }
        d.a e9 = this.f11036E.e(n22, e8.f11068o, i8 * (-1), true);
        if (e9 == null) {
            this.f11036E.d(e8.f11068o);
        } else {
            this.f11036E.d(e9.f11068o + 1);
        }
        y1();
        x1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i8, int i9, int i10) {
        w2(i8, i9, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i8, int i9) {
        w2(i8, i9, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i8, int i9, Object obj) {
        w2(i8, i9, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.B b8) {
        C2(wVar, b8, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF c(int i8) {
        int V12 = V1(i8);
        PointF pointF = new PointF();
        if (V12 == 0) {
            return null;
        }
        if (this.f11052w == 0) {
            pointF.x = V12;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = V12;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.B b8) {
        super.c1(b8);
        this.f11034C = -1;
        this.f11035D = Integer.MIN_VALUE;
        this.f11040I = null;
        this.f11043L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f11040I = eVar;
            if (this.f11034C != -1) {
                eVar.a();
                this.f11040I.b();
            }
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable h1() {
        int p8;
        int m8;
        int[] iArr;
        if (this.f11040I != null) {
            return new e(this.f11040I);
        }
        e eVar = new e();
        eVar.f11080y = this.f11055z;
        eVar.f11081z = this.f11038G;
        eVar.f11072A = this.f11039H;
        d dVar = this.f11036E;
        if (dVar == null || (iArr = dVar.f11066a) == null) {
            eVar.f11077v = 0;
        } else {
            eVar.f11078w = iArr;
            eVar.f11077v = iArr.length;
            eVar.f11079x = dVar.f11067b;
        }
        if (O() > 0) {
            eVar.f11073o = this.f11038G ? o2() : n2();
            eVar.f11074s = j2();
            int i8 = this.f11048s;
            eVar.f11075t = i8;
            eVar.f11076u = new int[i8];
            for (int i9 = 0; i9 < this.f11048s; i9++) {
                if (this.f11038G) {
                    p8 = this.f11049t[i9].l(Integer.MIN_VALUE);
                    if (p8 != Integer.MIN_VALUE) {
                        m8 = this.f11050u.i();
                        p8 -= m8;
                    }
                } else {
                    p8 = this.f11049t[i9].p(Integer.MIN_VALUE);
                    if (p8 != Integer.MIN_VALUE) {
                        m8 = this.f11050u.m();
                        p8 -= m8;
                    }
                }
                eVar.f11076u[i9] = p8;
            }
        } else {
            eVar.f11073o = -1;
            eVar.f11074s = -1;
            eVar.f11075t = 0;
        }
        return eVar;
    }

    View h2(boolean z7) {
        int m8 = this.f11050u.m();
        int i8 = this.f11050u.i();
        View view = null;
        for (int O7 = O() - 1; O7 >= 0; O7--) {
            View N7 = N(O7);
            int g8 = this.f11050u.g(N7);
            int d8 = this.f11050u.d(N7);
            if (d8 > m8 && g8 < i8) {
                if (d8 <= i8 || !z7) {
                    return N7;
                }
                if (view == null) {
                    view = N7;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(int i8) {
        if (i8 == 0) {
            W1();
        }
    }

    View i2(boolean z7) {
        int m8 = this.f11050u.m();
        int i8 = this.f11050u.i();
        int O7 = O();
        View view = null;
        for (int i9 = 0; i9 < O7; i9++) {
            View N7 = N(i9);
            int g8 = this.f11050u.g(N7);
            if (this.f11050u.d(N7) > m8 && g8 < i8) {
                if (g8 >= m8 || !z7) {
                    return N7;
                }
                if (view == null) {
                    view = N7;
                }
            }
        }
        return view;
    }

    int j2() {
        View h22 = this.f11032A ? h2(true) : i2(true);
        if (h22 == null) {
            return -1;
        }
        return l0(h22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(String str) {
        if (this.f11040I == null) {
            super.l(str);
        }
    }

    int n2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    int o2() {
        int O7 = O();
        if (O7 == 0) {
            return 0;
        }
        return l0(N(O7 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.f11052w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.f11052w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i8, int i9, RecyclerView.B b8, RecyclerView.p.c cVar) {
        int l8;
        int i10;
        if (this.f11052w != 0) {
            i8 = i9;
        }
        if (O() == 0 || i8 == 0) {
            return;
        }
        E2(i8, b8);
        int[] iArr = this.f11046O;
        if (iArr == null || iArr.length < this.f11048s) {
            this.f11046O = new int[this.f11048s];
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f11048s; i12++) {
            i iVar = this.f11054y;
            if (iVar.f11243d == -1) {
                l8 = iVar.f11245f;
                i10 = this.f11049t[i12].p(l8);
            } else {
                l8 = this.f11049t[i12].l(iVar.f11246g);
                i10 = this.f11054y.f11246g;
            }
            int i13 = l8 - i10;
            if (i13 >= 0) {
                this.f11046O[i11] = i13;
                i11++;
            }
        }
        Arrays.sort(this.f11046O, 0, i11);
        for (int i14 = 0; i14 < i11 && this.f11054y.a(b8); i14++) {
            cVar.a(this.f11054y.f11242c, this.f11046O[i14]);
            i iVar2 = this.f11054y;
            iVar2.f11242c += iVar2.f11243d;
        }
    }

    public int u2() {
        return this.f11052w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.B b8) {
        return Y1(b8);
    }

    public int v2() {
        return this.f11048s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.B b8) {
        return Z1(b8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return this.f11037F != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.B b8) {
        return a2(b8);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View x2() {
        /*
            r12 = this;
            int r0 = r12.O()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f11048s
            r2.<init>(r3)
            int r3 = r12.f11048s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f11052w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.z2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f11032A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.N(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f11064e
            int r9 = r9.f11086e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f11064e
            boolean r9 = r12.X1(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f11064e
            int r9 = r9.f11086e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f11065f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.N(r9)
            boolean r10 = r12.f11032A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.m r10 = r12.f11050u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.m r11 = r12.f11050u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.m r10 = r12.f11050u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.m r11 = r12.f11050u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f11064e
            int r8 = r8.f11086e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f11064e
            int r9 = r9.f11086e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.x2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.B b8) {
        return Y1(b8);
    }

    public void y2() {
        this.f11036E.b();
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.B b8) {
        return Z1(b8);
    }

    boolean z2() {
        return d0() == 1;
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f11066a;

        /* renamed from: b, reason: collision with root package name */
        List f11067b;

        d() {
        }

        private int i(int i8) {
            if (this.f11067b == null) {
                return -1;
            }
            a f8 = f(i8);
            if (f8 != null) {
                this.f11067b.remove(f8);
            }
            int size = this.f11067b.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    i9 = -1;
                    break;
                }
                if (((a) this.f11067b.get(i9)).f11068o >= i8) {
                    break;
                }
                i9++;
            }
            if (i9 == -1) {
                return -1;
            }
            a aVar = (a) this.f11067b.get(i9);
            this.f11067b.remove(i9);
            return aVar.f11068o;
        }

        private void l(int i8, int i9) {
            List list = this.f11067b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f11067b.get(size);
                int i10 = aVar.f11068o;
                if (i10 >= i8) {
                    aVar.f11068o = i10 + i9;
                }
            }
        }

        private void m(int i8, int i9) {
            List list = this.f11067b;
            if (list == null) {
                return;
            }
            int i10 = i8 + i9;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f11067b.get(size);
                int i11 = aVar.f11068o;
                if (i11 >= i8) {
                    if (i11 < i10) {
                        this.f11067b.remove(size);
                    } else {
                        aVar.f11068o = i11 - i9;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f11067b == null) {
                this.f11067b = new ArrayList();
            }
            int size = this.f11067b.size();
            for (int i8 = 0; i8 < size; i8++) {
                a aVar2 = (a) this.f11067b.get(i8);
                if (aVar2.f11068o == aVar.f11068o) {
                    this.f11067b.remove(i8);
                }
                if (aVar2.f11068o >= aVar.f11068o) {
                    this.f11067b.add(i8, aVar);
                    return;
                }
            }
            this.f11067b.add(aVar);
        }

        void b() {
            int[] iArr = this.f11066a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11067b = null;
        }

        void c(int i8) {
            int[] iArr = this.f11066a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i8, 10) + 1];
                this.f11066a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i8 >= iArr.length) {
                int[] iArr3 = new int[o(i8)];
                this.f11066a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f11066a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i8) {
            List list = this.f11067b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f11067b.get(size)).f11068o >= i8) {
                        this.f11067b.remove(size);
                    }
                }
            }
            return h(i8);
        }

        public a e(int i8, int i9, int i10, boolean z7) {
            List list = this.f11067b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f11067b.get(i11);
                int i12 = aVar.f11068o;
                if (i12 >= i9) {
                    return null;
                }
                if (i12 >= i8 && (i10 == 0 || aVar.f11069s == i10 || (z7 && aVar.f11071u))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i8) {
            List list = this.f11067b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f11067b.get(size);
                if (aVar.f11068o == i8) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i8) {
            int[] iArr = this.f11066a;
            if (iArr == null || i8 >= iArr.length) {
                return -1;
            }
            return iArr[i8];
        }

        int h(int i8) {
            int[] iArr = this.f11066a;
            if (iArr == null || i8 >= iArr.length) {
                return -1;
            }
            int i9 = i(i8);
            if (i9 == -1) {
                int[] iArr2 = this.f11066a;
                Arrays.fill(iArr2, i8, iArr2.length, -1);
                return this.f11066a.length;
            }
            int min = Math.min(i9 + 1, this.f11066a.length);
            Arrays.fill(this.f11066a, i8, min, -1);
            return min;
        }

        void j(int i8, int i9) {
            int[] iArr = this.f11066a;
            if (iArr == null || i8 >= iArr.length) {
                return;
            }
            int i10 = i8 + i9;
            c(i10);
            int[] iArr2 = this.f11066a;
            System.arraycopy(iArr2, i8, iArr2, i10, (iArr2.length - i8) - i9);
            Arrays.fill(this.f11066a, i8, i10, -1);
            l(i8, i9);
        }

        void k(int i8, int i9) {
            int[] iArr = this.f11066a;
            if (iArr == null || i8 >= iArr.length) {
                return;
            }
            int i10 = i8 + i9;
            c(i10);
            int[] iArr2 = this.f11066a;
            System.arraycopy(iArr2, i10, iArr2, i8, (iArr2.length - i8) - i9);
            int[] iArr3 = this.f11066a;
            Arrays.fill(iArr3, iArr3.length - i9, iArr3.length, -1);
            m(i8, i9);
        }

        void n(int i8, f fVar) {
            c(i8);
            this.f11066a[i8] = fVar.f11086e;
        }

        int o(int i8) {
            int length = this.f11066a.length;
            while (length <= i8) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0180a();

            /* renamed from: o, reason: collision with root package name */
            int f11068o;

            /* renamed from: s, reason: collision with root package name */
            int f11069s;

            /* renamed from: t, reason: collision with root package name */
            int[] f11070t;

            /* renamed from: u, reason: collision with root package name */
            boolean f11071u;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0180a implements Parcelable.Creator {
                C0180a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            a(Parcel parcel) {
                this.f11068o = parcel.readInt();
                this.f11069s = parcel.readInt();
                this.f11071u = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f11070t = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i8) {
                int[] iArr = this.f11070t;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i8];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f11068o + ", mGapDir=" + this.f11069s + ", mHasUnwantedGapAfter=" + this.f11071u + ", mGapPerSpan=" + Arrays.toString(this.f11070t) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i8) {
                parcel.writeInt(this.f11068o);
                parcel.writeInt(this.f11069s);
                parcel.writeInt(this.f11071u ? 1 : 0);
                int[] iArr = this.f11070t;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f11070t);
                }
            }

            a() {
            }
        }
    }
}
