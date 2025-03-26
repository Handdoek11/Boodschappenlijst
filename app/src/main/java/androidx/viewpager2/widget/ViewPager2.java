package androidx.viewpager2.widget;

import A0.C;
import A0.z;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p1.AbstractC6321a;
import z0.X;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: L, reason: collision with root package name */
    static boolean f11706L = true;

    /* renamed from: A, reason: collision with root package name */
    RecyclerView f11707A;

    /* renamed from: B, reason: collision with root package name */
    private androidx.recyclerview.widget.n f11708B;

    /* renamed from: C, reason: collision with root package name */
    androidx.viewpager2.widget.e f11709C;

    /* renamed from: D, reason: collision with root package name */
    private androidx.viewpager2.widget.b f11710D;

    /* renamed from: E, reason: collision with root package name */
    private androidx.viewpager2.widget.c f11711E;

    /* renamed from: F, reason: collision with root package name */
    private androidx.viewpager2.widget.d f11712F;

    /* renamed from: G, reason: collision with root package name */
    private RecyclerView.m f11713G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f11714H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f11715I;

    /* renamed from: J, reason: collision with root package name */
    private int f11716J;

    /* renamed from: K, reason: collision with root package name */
    e f11717K;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f11718o;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f11719s;

    /* renamed from: t, reason: collision with root package name */
    private androidx.viewpager2.widget.b f11720t;

    /* renamed from: u, reason: collision with root package name */
    int f11721u;

    /* renamed from: v, reason: collision with root package name */
    boolean f11722v;

    /* renamed from: w, reason: collision with root package name */
    private RecyclerView.j f11723w;

    /* renamed from: x, reason: collision with root package name */
    LinearLayoutManager f11724x;

    /* renamed from: y, reason: collision with root package name */
    private int f11725y;

    /* renamed from: z, reason: collision with root package name */
    private Parcelable f11726z;

    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f11722v = true;
            viewPager2.f11709C.l();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i8) {
            if (i8 == 0) {
                ViewPager2.this.o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i8) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f11721u != i8) {
                viewPager2.f11721u = i8;
                viewPager2.f11717K.r();
            }
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i8) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f11707A.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.r {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i8) {
            return false;
        }

        boolean c(int i8, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(RecyclerView.h hVar) {
        }

        void f(RecyclerView.h hVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        boolean l(int i8) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i8, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void n() {
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        void p(AccessibilityEvent accessibilityEvent) {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        void j(z zVar) {
        }

        void k(View view, z zVar) {
        }
    }

    class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i8) {
            return (i8 == 8192 || i8 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(z zVar) {
            if (ViewPager2.this.e()) {
                return;
            }
            zVar.c0(z.a.f47r);
            zVar.c0(z.a.f46q);
            zVar.E0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i8) {
            if (b(i8)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i8, int i9, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i8, int i9) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i8, int i9, int i10) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i8, int i9) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void Q1(RecyclerView.B b8, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.Q1(b8, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void R0(RecyclerView.w wVar, RecyclerView.B b8, z zVar) {
            super.R0(wVar, b8, zVar);
            ViewPager2.this.f11717K.j(zVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void T0(RecyclerView.w wVar, RecyclerView.B b8, View view, z zVar) {
            ViewPager2.this.f11717K.k(view, zVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean l1(RecyclerView.w wVar, RecyclerView.B b8, int i8, Bundle bundle) {
            return ViewPager2.this.f11717K.b(i8) ? ViewPager2.this.f11717K.l(i8) : super.l1(wVar, b8, i8, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
            return false;
        }
    }

    public static abstract class i {
        public void a(int i8) {
        }

        public void b(int i8, float f8, int i9) {
        }

        public abstract void c(int i8);
    }

    class j extends e {

        /* renamed from: b, reason: collision with root package name */
        private final C f11734b;

        /* renamed from: c, reason: collision with root package name */
        private final C f11735c;

        /* renamed from: d, reason: collision with root package name */
        private RecyclerView.j f11736d;

        class a implements C {
            a() {
            }

            @Override // A0.C
            public boolean a(View view, C.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements C {
            b() {
            }

            @Override // A0.C
            public boolean a(View view, C.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        j() {
            super(ViewPager2.this, null);
            this.f11734b = new a();
            this.f11735c = new b();
        }

        private void u(z zVar) {
            int i8;
            int i9;
            if (ViewPager2.this.getAdapter() != null) {
                i9 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    i9 = ViewPager2.this.getAdapter().E();
                    i8 = 1;
                } else {
                    i8 = ViewPager2.this.getAdapter().E();
                }
            } else {
                i8 = 0;
                i9 = 0;
            }
            zVar.m0(z.e.a(i9, i8, false, 0));
        }

        private void v(View view, z zVar) {
            zVar.n0(z.f.a(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f11724x.l0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f11724x.l0(view) : 0, 1, false, false));
        }

        private void w(z zVar) {
            int E7;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (E7 = adapter.E()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f11721u > 0) {
                zVar.a(8192);
            }
            if (ViewPager2.this.f11721u < E7 - 1) {
                zVar.a(4096);
            }
            zVar.E0(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i8, Bundle bundle) {
            return i8 == 8192 || i8 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h hVar) {
            y();
            if (hVar != null) {
                hVar.a0(this.f11736d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h hVar) {
            if (hVar != null) {
                hVar.c0(this.f11736d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            X.w0(recyclerView, 2);
            this.f11736d = new c();
            if (X.x(ViewPager2.this) == 0) {
                X.w0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            z M02 = z.M0(accessibilityNodeInfo);
            u(M02);
            w(M02);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(View view, z zVar) {
            v(view, zVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i8, Bundle bundle) {
            if (!c(i8, bundle)) {
                throw new IllegalStateException();
            }
            x(i8 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        void x(int i8) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i8, true);
            }
        }

        void y() {
            int E7;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i8 = R.id.accessibilityActionPageLeft;
            X.h0(viewPager2, R.id.accessibilityActionPageLeft);
            X.h0(viewPager2, R.id.accessibilityActionPageRight);
            X.h0(viewPager2, R.id.accessibilityActionPageUp);
            X.h0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (E7 = ViewPager2.this.getAdapter().E()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f11721u < E7 - 1) {
                    X.j0(viewPager2, new z.a(R.id.accessibilityActionPageDown, null), null, this.f11734b);
                }
                if (ViewPager2.this.f11721u > 0) {
                    X.j0(viewPager2, new z.a(R.id.accessibilityActionPageUp, null), null, this.f11735c);
                    return;
                }
                return;
            }
            boolean d8 = ViewPager2.this.d();
            int i9 = d8 ? 16908360 : 16908361;
            if (d8) {
                i8 = 16908361;
            }
            if (ViewPager2.this.f11721u < E7 - 1) {
                X.j0(viewPager2, new z.a(i9, null), null, this.f11734b);
            }
            if (ViewPager2.this.f11721u > 0) {
                X.j0(viewPager2, new z.a(i8, null), null, this.f11735c);
            }
        }
    }

    public interface k {
    }

    private class l extends androidx.recyclerview.widget.n {
        l() {
        }

        @Override // androidx.recyclerview.widget.n, androidx.recyclerview.widget.r
        public View f(RecyclerView.p pVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.f(pVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f11717K.d() ? ViewPager2.this.f11717K.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f11721u);
            accessibilityEvent.setToIndex(ViewPager2.this.f11721u);
            ViewPager2.this.f11717K.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    private static class o implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final int f11746o;

        /* renamed from: s, reason: collision with root package name */
        private final RecyclerView f11747s;

        o(int i8, RecyclerView recyclerView) {
            this.f11746o = i8;
            this.f11747s = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11747s.D1(this.f11746o);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11718o = new Rect();
        this.f11719s = new Rect();
        this.f11720t = new androidx.viewpager2.widget.b(3);
        this.f11722v = false;
        this.f11723w = new a();
        this.f11725y = -1;
        this.f11713G = null;
        this.f11714H = false;
        this.f11715I = true;
        this.f11716J = -1;
        b(context, attributeSet);
    }

    private RecyclerView.r a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f11717K = f11706L ? new j() : new f();
        m mVar = new m(context);
        this.f11707A = mVar;
        mVar.setId(X.k());
        this.f11707A.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f11724x = hVar;
        this.f11707A.setLayoutManager(hVar);
        this.f11707A.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f11707A.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f11707A.l(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f11709C = eVar;
        this.f11711E = new androidx.viewpager2.widget.c(this, eVar, this.f11707A);
        l lVar = new l();
        this.f11708B = lVar;
        lVar.b(this.f11707A);
        this.f11707A.n(this.f11709C);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f11710D = bVar;
        this.f11709C.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f11710D.d(bVar2);
        this.f11710D.d(cVar);
        this.f11717K.h(this.f11710D, this.f11707A);
        this.f11710D.d(this.f11720t);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f11724x);
        this.f11712F = dVar;
        this.f11710D.d(dVar);
        RecyclerView recyclerView = this.f11707A;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.a0(this.f11723w);
        }
    }

    private void i() {
        RecyclerView.h adapter;
        if (this.f11725y == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f11726z != null) {
            this.f11726z = null;
        }
        int max = Math.max(0, Math.min(this.f11725y, adapter.E() - 1));
        this.f11721u = max;
        this.f11725y = -1;
        this.f11707A.u1(max);
        this.f11717K.n();
    }

    private void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6321a.f40125a);
        X.l0(this, context, AbstractC6321a.f40125a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(AbstractC6321a.f40126b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.c0(this.f11723w);
        }
    }

    public boolean c() {
        return this.f11711E.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i8) {
        return this.f11707A.canScrollHorizontally(i8);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i8) {
        return this.f11707A.canScrollVertically(i8);
    }

    boolean d() {
        return this.f11724x.d0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i8 = ((n) parcelable).f11743o;
            sparseArray.put(this.f11707A.getId(), (Parcelable) sparseArray.get(i8));
            sparseArray.remove(i8);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f11715I;
    }

    public void g(i iVar) {
        this.f11720t.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f11717K.a() ? this.f11717K.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f11707A.getAdapter();
    }

    public int getCurrentItem() {
        return this.f11721u;
    }

    public int getItemDecorationCount() {
        return this.f11707A.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f11716J;
    }

    public int getOrientation() {
        return this.f11724x.r2() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f11707A;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f11709C.h();
    }

    public void h() {
        this.f11712F.d();
    }

    public void j(int i8, boolean z7) {
        if (c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        k(i8, z7);
    }

    void k(int i8, boolean z7) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f11725y != -1) {
                this.f11725y = Math.max(i8, 0);
                return;
            }
            return;
        }
        if (adapter.E() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i8, 0), adapter.E() - 1);
        if (min == this.f11721u && this.f11709C.j()) {
            return;
        }
        int i9 = this.f11721u;
        if (min == i9 && z7) {
            return;
        }
        double d8 = i9;
        this.f11721u = min;
        this.f11717K.r();
        if (!this.f11709C.j()) {
            d8 = this.f11709C.g();
        }
        this.f11709C.m(min, z7);
        if (!z7) {
            this.f11707A.u1(min);
            return;
        }
        double d9 = min;
        if (Math.abs(d9 - d8) <= 3.0d) {
            this.f11707A.D1(min);
            return;
        }
        this.f11707A.u1(d9 > d8 ? min - 3 : min + 3);
        RecyclerView recyclerView = this.f11707A;
        recyclerView.post(new o(min, recyclerView));
    }

    public void n(i iVar) {
        this.f11720t.e(iVar);
    }

    void o() {
        androidx.recyclerview.widget.n nVar = this.f11708B;
        if (nVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View f8 = nVar.f(this.f11724x);
        if (f8 == null) {
            return;
        }
        int l02 = this.f11724x.l0(f8);
        if (l02 != this.f11721u && getScrollState() == 0) {
            this.f11710D.c(l02);
        }
        this.f11722v = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f11717K.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int measuredWidth = this.f11707A.getMeasuredWidth();
        int measuredHeight = this.f11707A.getMeasuredHeight();
        this.f11718o.left = getPaddingLeft();
        this.f11718o.right = (i10 - i8) - getPaddingRight();
        this.f11718o.top = getPaddingTop();
        this.f11718o.bottom = (i11 - i9) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f11718o, this.f11719s);
        RecyclerView recyclerView = this.f11707A;
        Rect rect = this.f11719s;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f11722v) {
            o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        measureChild(this.f11707A, i8, i9);
        int measuredWidth = this.f11707A.getMeasuredWidth();
        int measuredHeight = this.f11707A.getMeasuredHeight();
        int measuredState = this.f11707A.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i8, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i9, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f11725y = nVar.f11744s;
        this.f11726z = nVar.f11745t;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f11743o = this.f11707A.getId();
        int i8 = this.f11725y;
        if (i8 == -1) {
            i8 = this.f11721u;
        }
        nVar.f11744s = i8;
        Parcelable parcelable = this.f11726z;
        if (parcelable != null) {
            nVar.f11745t = parcelable;
        } else {
            this.f11707A.getAdapter();
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i8, Bundle bundle) {
        return this.f11717K.c(i8, bundle) ? this.f11717K.m(i8, bundle) : super.performAccessibilityAction(i8, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f11707A.getAdapter();
        this.f11717K.f(adapter);
        m(adapter);
        this.f11707A.setAdapter(hVar);
        this.f11721u = 0;
        i();
        this.f11717K.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i8) {
        j(i8, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i8) {
        super.setLayoutDirection(i8);
        this.f11717K.q();
    }

    public void setOffscreenPageLimit(int i8) {
        if (i8 < 1 && i8 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f11716J = i8;
        this.f11707A.requestLayout();
    }

    public void setOrientation(int i8) {
        this.f11724x.F2(i8);
        this.f11717K.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f11714H) {
                this.f11713G = this.f11707A.getItemAnimator();
                this.f11714H = true;
            }
            this.f11707A.setItemAnimator(null);
        } else if (this.f11714H) {
            this.f11707A.setItemAnimator(this.f11713G);
            this.f11713G = null;
            this.f11714H = false;
        }
        this.f11712F.d();
        if (kVar == null) {
            return;
        }
        this.f11712F.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z7) {
        this.f11715I = z7;
        this.f11717K.t();
    }

    static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f11743o;

        /* renamed from: s, reason: collision with root package name */
        int f11744s;

        /* renamed from: t, reason: collision with root package name */
        Parcelable f11745t;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new n(parcel, classLoader) : new n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i8) {
                return new n[i8];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f11743o = parcel.readInt();
            this.f11744s = parcel.readInt();
            this.f11745t = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f11743o);
            parcel.writeInt(this.f11744s);
            parcel.writeParcelable(this.f11745t, i8);
        }

        n(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
