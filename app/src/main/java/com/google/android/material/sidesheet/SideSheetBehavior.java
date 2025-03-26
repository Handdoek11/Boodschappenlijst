package com.google.android.material.sidesheet;

import A0.C;
import A0.z;
import D3.j;
import D3.l;
import G0.c;
import V3.g;
import V3.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import t0.AbstractC6779a;
import z0.AbstractC7048s;
import z0.X;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.c f32156a;

    /* renamed from: b, reason: collision with root package name */
    private float f32157b;

    /* renamed from: c, reason: collision with root package name */
    private g f32158c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f32159d;

    /* renamed from: e, reason: collision with root package name */
    private k f32160e;

    /* renamed from: f, reason: collision with root package name */
    private final c f32161f;

    /* renamed from: g, reason: collision with root package name */
    private float f32162g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f32163h;

    /* renamed from: i, reason: collision with root package name */
    private int f32164i;

    /* renamed from: j, reason: collision with root package name */
    private int f32165j;

    /* renamed from: k, reason: collision with root package name */
    private G0.c f32166k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f32167l;

    /* renamed from: m, reason: collision with root package name */
    private float f32168m;

    /* renamed from: n, reason: collision with root package name */
    private int f32169n;

    /* renamed from: o, reason: collision with root package name */
    private int f32170o;

    /* renamed from: p, reason: collision with root package name */
    private int f32171p;

    /* renamed from: q, reason: collision with root package name */
    private int f32172q;

    /* renamed from: r, reason: collision with root package name */
    private WeakReference f32173r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f32174s;

    /* renamed from: t, reason: collision with root package name */
    private int f32175t;

    /* renamed from: u, reason: collision with root package name */
    private VelocityTracker f32176u;

    /* renamed from: v, reason: collision with root package name */
    private Q3.c f32177v;

    /* renamed from: w, reason: collision with root package name */
    private int f32178w;

    /* renamed from: x, reason: collision with root package name */
    private final Set f32179x;

    /* renamed from: y, reason: collision with root package name */
    private final c.AbstractC0042c f32180y;

    /* renamed from: z, reason: collision with root package name */
    private static final int f32155z = j.f1584B;

    /* renamed from: A, reason: collision with root package name */
    private static final int f32154A = D3.k.f1621k;

    class a extends c.AbstractC0042c {
        a() {
        }

        @Override // G0.c.AbstractC0042c
        public int a(View view, int i8, int i9) {
            return AbstractC6779a.b(i8, SideSheetBehavior.this.f32156a.f(), SideSheetBehavior.this.f32156a.e());
        }

        @Override // G0.c.AbstractC0042c
        public int b(View view, int i8, int i9) {
            return view.getTop();
        }

        @Override // G0.c.AbstractC0042c
        public int d(View view) {
            return SideSheetBehavior.this.f32169n + SideSheetBehavior.this.d0();
        }

        @Override // G0.c.AbstractC0042c
        public void j(int i8) {
            if (i8 == 1 && SideSheetBehavior.this.f32163h) {
                SideSheetBehavior.this.B0(1);
            }
        }

        @Override // G0.c.AbstractC0042c
        public void k(View view, int i8, int i9, int i10, int i11) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View Z7 = SideSheetBehavior.this.Z();
            if (Z7 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) Z7.getLayoutParams()) != null) {
                SideSheetBehavior.this.f32156a.n(marginLayoutParams, view.getLeft(), view.getRight());
                Z7.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i8);
        }

        @Override // G0.c.AbstractC0042c
        public void l(View view, float f8, float f9) {
            int R7 = SideSheetBehavior.this.R(view, f8, f9);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.G0(view, R7, sideSheetBehavior.F0());
        }

        @Override // G0.c.AbstractC0042c
        public boolean m(View view, int i8) {
            return (SideSheetBehavior.this.f32164i == 1 || SideSheetBehavior.this.f32173r == null || SideSheetBehavior.this.f32173r.get() != view) ? false : true;
        }
    }

    class c {

        /* renamed from: a, reason: collision with root package name */
        private int f32183a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32184b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f32185c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f32189o.c();
            }
        };

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f32184b = false;
            if (SideSheetBehavior.this.f32166k != null && SideSheetBehavior.this.f32166k.k(true)) {
                b(this.f32183a);
            } else if (SideSheetBehavior.this.f32164i == 2) {
                SideSheetBehavior.this.B0(this.f32183a);
            }
        }

        void b(int i8) {
            if (SideSheetBehavior.this.f32173r == null || SideSheetBehavior.this.f32173r.get() == null) {
                return;
            }
            this.f32183a = i8;
            if (this.f32184b) {
                return;
            }
            X.f0((View) SideSheetBehavior.this.f32173r.get(), this.f32185c);
            this.f32184b = true;
        }
    }

    public SideSheetBehavior() {
        this.f32161f = new c();
        this.f32163h = true;
        this.f32164i = 5;
        this.f32165j = 5;
        this.f32168m = 0.1f;
        this.f32175t = -1;
        this.f32179x = new LinkedHashSet();
        this.f32180y = new a();
    }

    private boolean C0() {
        return this.f32166k != null && (this.f32163h || this.f32164i == 1);
    }

    private boolean E0(View view) {
        return (view.isShown() || X.o(view) != null) && this.f32163h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(View view, int i8, boolean z7) {
        if (!p0(view, i8, z7)) {
            B0(i8);
        } else {
            B0(2);
            this.f32161f.b(i8);
        }
    }

    private void H0() {
        View view;
        WeakReference weakReference = this.f32173r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.h0(view, 262144);
        X.h0(view, 1048576);
        if (this.f32164i != 5) {
            t0(view, z.a.f54y, 5);
        }
        if (this.f32164i != 3) {
            t0(view, z.a.f52w, 3);
        }
    }

    private void I0(k kVar) {
        g gVar = this.f32158c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void J0(View view) {
        int i8 = this.f32164i == 5 ? 4 : 0;
        if (view.getVisibility() != i8) {
            view.setVisibility(i8);
        }
    }

    private int P(int i8, View view) {
        int i9 = this.f32164i;
        if (i9 == 1 || i9 == 2) {
            return i8 - this.f32156a.g(view);
        }
        if (i9 == 3) {
            return 0;
        }
        if (i9 == 5) {
            return this.f32156a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f32164i);
    }

    private float Q(float f8, float f9) {
        return Math.abs(f8 - f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(View view, float f8, float f9) {
        if (n0(f8)) {
            return 3;
        }
        if (D0(view, f8)) {
            if (!this.f32156a.l(f8, f9) && !this.f32156a.k(view)) {
                return 3;
            }
        } else if (f8 == 0.0f || !d.a(f8, f9)) {
            int left = view.getLeft();
            if (Math.abs(left - a0()) < Math.abs(left - this.f32156a.d())) {
                return 3;
            }
        }
        return 5;
    }

    private void S() {
        WeakReference weakReference = this.f32174s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f32174s = null;
    }

    private C T(final int i8) {
        return new C() { // from class: W3.a
            @Override // A0.C
            public final boolean a(View view, C.a aVar) {
                return this.f5819a.q0(i8, view, aVar);
            }
        };
    }

    private void U(Context context) {
        if (this.f32160e == null) {
            return;
        }
        g gVar = new g(this.f32160e);
        this.f32158c = gVar;
        gVar.J(context);
        ColorStateList colorStateList = this.f32159d;
        if (colorStateList != null) {
            this.f32158c.U(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f32158c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(View view, int i8) {
        if (this.f32179x.isEmpty()) {
            return;
        }
        this.f32156a.b(i8);
        Iterator it = this.f32179x.iterator();
        if (it.hasNext()) {
            E.a(it.next());
            throw null;
        }
    }

    private void W(View view) {
        if (X.o(view) == null) {
            X.q0(view, view.getResources().getString(f32155z));
        }
    }

    private int X(int i8, int i9, int i10, int i11) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i9, i11);
        if (i10 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), 1073741824);
        }
        if (size != 0) {
            i10 = Math.min(size, i10);
        }
        return View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    private CoordinatorLayout.f j0() {
        View view;
        WeakReference weakReference = this.f32173r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.f j02 = j0();
        return j02 != null && ((ViewGroup.MarginLayoutParams) j02).leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.f j02 = j0();
        return j02 != null && ((ViewGroup.MarginLayoutParams) j02).rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return C0() && Q((float) this.f32178w, motionEvent.getX()) > ((float) this.f32166k.u());
    }

    private boolean n0(float f8) {
        return this.f32156a.j(f8);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && X.Q(view);
    }

    private boolean p0(View view, int i8, boolean z7) {
        int e02 = e0(i8);
        G0.c i02 = i0();
        return i02 != null && (!z7 ? !i02.H(view, e02, view.getTop()) : !i02.F(e02, view.getTop()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean q0(int i8, View view, C.a aVar) {
        A0(i8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(int i8) {
        View view = (View) this.f32173r.get();
        if (view != null) {
            G0(view, i8, false);
        }
    }

    private void s0(CoordinatorLayout coordinatorLayout) {
        int i8;
        View findViewById;
        if (this.f32174s != null || (i8 = this.f32175t) == -1 || (findViewById = coordinatorLayout.findViewById(i8)) == null) {
            return;
        }
        this.f32174s = new WeakReference(findViewById);
    }

    private void t0(View view, z.a aVar, int i8) {
        X.j0(view, aVar, null, T(i8));
    }

    private void u0() {
        VelocityTracker velocityTracker = this.f32176u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f32176u = null;
        }
    }

    private void v0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void y0(int i8) {
        com.google.android.material.sidesheet.c cVar = this.f32156a;
        if (cVar == null || cVar.i() != i8) {
            if (i8 == 0) {
                this.f32156a = new com.google.android.material.sidesheet.b(this);
                if (this.f32160e == null || l0()) {
                    return;
                }
                k.b v7 = this.f32160e.v();
                v7.E(0.0f).w(0.0f);
                I0(v7.m());
                return;
            }
            if (i8 == 1) {
                this.f32156a = new com.google.android.material.sidesheet.a(this);
                if (this.f32160e == null || k0()) {
                    return;
                }
                k.b v8 = this.f32160e.v();
                v8.A(0.0f).s(0.0f);
                I0(v8.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i8 + ". Must be 0 or 1.");
        }
    }

    private void z0(View view, int i8) {
        y0(AbstractC7048s.b(((CoordinatorLayout.f) view.getLayoutParams()).f9047c, i8) == 3 ? 1 : 0);
    }

    public void A0(final int i8) {
        if (i8 == 1 || i8 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i8 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f32173r;
        if (weakReference == null || weakReference.get() == null) {
            B0(i8);
        } else {
            v0((View) this.f32173r.get(), new Runnable() { // from class: W3.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5821o.r0(i8);
                }
            });
        }
    }

    void B0(int i8) {
        View view;
        if (this.f32164i == i8) {
            return;
        }
        this.f32164i = i8;
        if (i8 == 3 || i8 == 5) {
            this.f32165j = i8;
        }
        WeakReference weakReference = this.f32173r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        J0(view);
        Iterator it = this.f32179x.iterator();
        if (it.hasNext()) {
            E.a(it.next());
            throw null;
        }
        H0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f32164i == 1 && actionMasked == 0) {
            return true;
        }
        if (C0()) {
            this.f32166k.z(motionEvent);
        }
        if (actionMasked == 0) {
            u0();
        }
        if (this.f32176u == null) {
            this.f32176u = VelocityTracker.obtain();
        }
        this.f32176u.addMovement(motionEvent);
        if (C0() && actionMasked == 2 && !this.f32167l && m0(motionEvent)) {
            this.f32166k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f32167l;
    }

    boolean D0(View view, float f8) {
        return this.f32156a.m(view, f8);
    }

    public boolean F0() {
        return true;
    }

    int Y() {
        return this.f32169n;
    }

    public View Z() {
        WeakReference weakReference = this.f32174s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f32156a.c();
    }

    public float b0() {
        return this.f32168m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f32172q;
    }

    int e0(int i8) {
        if (i8 == 3) {
            return a0();
        }
        if (i8 == 5) {
            return this.f32156a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i8);
    }

    int f0() {
        return this.f32171p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f32173r = null;
        this.f32166k = null;
        this.f32177v = null;
    }

    int g0() {
        return this.f32170o;
    }

    int h0() {
        return 500;
    }

    G0.c i0() {
        return this.f32166k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f32173r = null;
        this.f32166k = null;
        this.f32177v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        G0.c cVar;
        if (!E0(view)) {
            this.f32167l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u0();
        }
        if (this.f32176u == null) {
            this.f32176u = VelocityTracker.obtain();
        }
        this.f32176u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f32178w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f32167l) {
            this.f32167l = false;
            return false;
        }
        return (this.f32167l || (cVar = this.f32166k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
        if (X.w(coordinatorLayout) && !X.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f32173r == null) {
            this.f32173r = new WeakReference(view);
            this.f32177v = new Q3.c(view);
            g gVar = this.f32158c;
            if (gVar != null) {
                X.r0(view, gVar);
                g gVar2 = this.f32158c;
                float f8 = this.f32162g;
                if (f8 == -1.0f) {
                    f8 = X.u(view);
                }
                gVar2.T(f8);
            } else {
                ColorStateList colorStateList = this.f32159d;
                if (colorStateList != null) {
                    X.s0(view, colorStateList);
                }
            }
            J0(view);
            H0();
            if (X.x(view) == 0) {
                X.w0(view, 1);
            }
            W(view);
        }
        z0(view, i8);
        if (this.f32166k == null) {
            this.f32166k = G0.c.m(coordinatorLayout, this.f32180y);
        }
        int g8 = this.f32156a.g(view);
        coordinatorLayout.H(view, i8);
        this.f32170o = coordinatorLayout.getWidth();
        this.f32171p = this.f32156a.h(coordinatorLayout);
        this.f32169n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f32172q = marginLayoutParams != null ? this.f32156a.a(marginLayoutParams) : 0;
        X.X(view, P(g8, view));
        s0(coordinatorLayout);
        Iterator it = this.f32179x.iterator();
        while (it.hasNext()) {
            E.a(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i8, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, -1, marginLayoutParams.width), X(i10, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, -1, marginLayoutParams.height));
        return true;
    }

    public void w0(int i8) {
        this.f32175t = i8;
        S();
        WeakReference weakReference = this.f32173r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i8 == -1 || !X.R(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, view, bVar.a());
        }
        int i8 = bVar.f32182t;
        if (i8 == 1 || i8 == 2) {
            i8 = 5;
        }
        this.f32164i = i8;
        this.f32165j = i8;
    }

    public void x0(boolean z7) {
        this.f32163h = z7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    protected static class b extends F0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        final int f32182t;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32182t = parcel.readInt();
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f32182t);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f32182t = sideSheetBehavior.f32164i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32161f = new c();
        this.f32163h = true;
        this.f32164i = 5;
        this.f32165j = 5;
        this.f32168m = 0.1f;
        this.f32175t = -1;
        this.f32179x = new LinkedHashSet();
        this.f32180y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f1937k5);
        if (obtainStyledAttributes.hasValue(l.f1955m5)) {
            this.f32159d = S3.c.a(context, obtainStyledAttributes, l.f1955m5);
        }
        if (obtainStyledAttributes.hasValue(l.f1982p5)) {
            this.f32160e = k.e(context, attributeSet, 0, f32154A).m();
        }
        if (obtainStyledAttributes.hasValue(l.f1973o5)) {
            w0(obtainStyledAttributes.getResourceId(l.f1973o5, -1));
        }
        U(context);
        this.f32162g = obtainStyledAttributes.getDimension(l.f1946l5, -1.0f);
        x0(obtainStyledAttributes.getBoolean(l.f1964n5, true));
        obtainStyledAttributes.recycle();
        this.f32157b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
