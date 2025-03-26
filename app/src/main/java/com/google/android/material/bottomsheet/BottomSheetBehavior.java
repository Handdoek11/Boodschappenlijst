package com.google.android.material.bottomsheet;

import A0.C;
import A0.z;
import D3.j;
import D3.k;
import D3.l;
import G0.c;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import t0.AbstractC6779a;
import z0.X;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: i0, reason: collision with root package name */
    private static final int f31431i0 = k.f1616f;

    /* renamed from: A, reason: collision with root package name */
    private boolean f31432A;

    /* renamed from: B, reason: collision with root package name */
    private final g f31433B;

    /* renamed from: C, reason: collision with root package name */
    private ValueAnimator f31434C;

    /* renamed from: D, reason: collision with root package name */
    int f31435D;

    /* renamed from: E, reason: collision with root package name */
    int f31436E;

    /* renamed from: F, reason: collision with root package name */
    int f31437F;

    /* renamed from: G, reason: collision with root package name */
    float f31438G;

    /* renamed from: H, reason: collision with root package name */
    int f31439H;

    /* renamed from: I, reason: collision with root package name */
    float f31440I;

    /* renamed from: J, reason: collision with root package name */
    boolean f31441J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f31442K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f31443L;

    /* renamed from: M, reason: collision with root package name */
    int f31444M;

    /* renamed from: N, reason: collision with root package name */
    int f31445N;

    /* renamed from: O, reason: collision with root package name */
    G0.c f31446O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f31447P;

    /* renamed from: Q, reason: collision with root package name */
    private int f31448Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f31449R;

    /* renamed from: S, reason: collision with root package name */
    private float f31450S;

    /* renamed from: T, reason: collision with root package name */
    private int f31451T;

    /* renamed from: U, reason: collision with root package name */
    int f31452U;

    /* renamed from: V, reason: collision with root package name */
    int f31453V;

    /* renamed from: W, reason: collision with root package name */
    WeakReference f31454W;

    /* renamed from: X, reason: collision with root package name */
    WeakReference f31455X;

    /* renamed from: Y, reason: collision with root package name */
    WeakReference f31456Y;

    /* renamed from: Z, reason: collision with root package name */
    private final ArrayList f31457Z;

    /* renamed from: a, reason: collision with root package name */
    private int f31458a;

    /* renamed from: a0, reason: collision with root package name */
    private VelocityTracker f31459a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31460b;

    /* renamed from: b0, reason: collision with root package name */
    Q3.b f31461b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31462c;

    /* renamed from: c0, reason: collision with root package name */
    int f31463c0;

    /* renamed from: d, reason: collision with root package name */
    private float f31464d;

    /* renamed from: d0, reason: collision with root package name */
    private int f31465d0;

    /* renamed from: e, reason: collision with root package name */
    private int f31466e;

    /* renamed from: e0, reason: collision with root package name */
    boolean f31467e0;

    /* renamed from: f, reason: collision with root package name */
    private int f31468f;

    /* renamed from: f0, reason: collision with root package name */
    private Map f31469f0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31470g;

    /* renamed from: g0, reason: collision with root package name */
    final SparseIntArray f31471g0;

    /* renamed from: h, reason: collision with root package name */
    private int f31472h;

    /* renamed from: h0, reason: collision with root package name */
    private final c.AbstractC0042c f31473h0;

    /* renamed from: i, reason: collision with root package name */
    private int f31474i;

    /* renamed from: j, reason: collision with root package name */
    private V3.g f31475j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f31476k;

    /* renamed from: l, reason: collision with root package name */
    private int f31477l;

    /* renamed from: m, reason: collision with root package name */
    private int f31478m;

    /* renamed from: n, reason: collision with root package name */
    private int f31479n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f31480o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f31481p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f31482q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f31483r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f31484s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f31485t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f31486u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f31487v;

    /* renamed from: w, reason: collision with root package name */
    private int f31488w;

    /* renamed from: x, reason: collision with root package name */
    private int f31489x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f31490y;

    /* renamed from: z, reason: collision with root package name */
    private V3.k f31491z;

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f31492o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f31493s;

        a(View view, int i8) {
            this.f31492o = view;
            this.f31493s = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.V0(this.f31492o, this.f31493s, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f31475j != null) {
                BottomSheetBehavior.this.f31475j.V(floatValue);
            }
        }
    }

    class c implements o.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31496a;

        c(boolean z7) {
            this.f31496a = z7;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.o.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public z0.C7061y0 a(android.view.View r11, z0.C7061y0 r12, com.google.android.material.internal.o.d r13) {
            /*
                r10 = this;
                int r0 = z0.C7061y0.l.d()
                q0.b r0 = r12.f(r0)
                int r1 = z0.C7061y0.l.c()
                q0.b r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f40898b
                com.google.android.material.bottomsheet.BottomSheetBehavior.P(r2, r3)
                boolean r2 = com.google.android.material.internal.o.g(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.h()
                com.google.android.material.bottomsheet.BottomSheetBehavior.S(r3, r6)
                int r3 = r13.f32151d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f32150c
                goto L50
            L4e:
                int r4 = r13.f32148a
            L50:
                int r6 = r0.f40897a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f32148a
                goto L62
            L60:
                int r13 = r13.f32150c
            L62:
                int r2 = r0.f40899c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f40897a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.W(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f40899c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f40898b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f31496a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f40900d
                com.google.android.material.bottomsheet.BottomSheetBehavior.G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f31496a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.H(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, z0.y0, com.google.android.material.internal.o$d):z0.y0");
        }
    }

    class d extends c.AbstractC0042c {

        /* renamed from: a, reason: collision with root package name */
        private long f31498a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f31453V + bottomSheetBehavior.m0()) / 2;
        }

        @Override // G0.c.AbstractC0042c
        public int a(View view, int i8, int i9) {
            return view.getLeft();
        }

        @Override // G0.c.AbstractC0042c
        public int b(View view, int i8, int i9) {
            return AbstractC6779a.b(i8, BottomSheetBehavior.this.m0(), e(view));
        }

        @Override // G0.c.AbstractC0042c
        public int e(View view) {
            return BottomSheetBehavior.this.e0() ? BottomSheetBehavior.this.f31453V : BottomSheetBehavior.this.f31439H;
        }

        @Override // G0.c.AbstractC0042c
        public void j(int i8) {
            if (i8 == 1 && BottomSheetBehavior.this.f31443L) {
                BottomSheetBehavior.this.O0(1);
            }
        }

        @Override // G0.c.AbstractC0042c
        public void k(View view, int i8, int i9, int i10, int i11) {
            BottomSheetBehavior.this.j0(i9);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // G0.c.AbstractC0042c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // G0.c.AbstractC0042c
        public boolean m(View view, int i8) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i9 = bottomSheetBehavior.f31444M;
            if (i9 == 1 || bottomSheetBehavior.f31467e0) {
                return false;
            }
            if (i9 == 3 && bottomSheetBehavior.f31463c0 == i8) {
                WeakReference weakReference = bottomSheetBehavior.f31456Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f31498a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f31454W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31500a;

        e(int i8) {
            this.f31500a = i8;
        }

        @Override // A0.C
        public boolean a(View view, C.a aVar) {
            BottomSheetBehavior.this.N0(this.f31500a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f31458a = 0;
        this.f31460b = true;
        this.f31462c = false;
        this.f31477l = -1;
        this.f31478m = -1;
        this.f31433B = new g(this, null);
        this.f31438G = 0.5f;
        this.f31440I = -1.0f;
        this.f31443L = true;
        this.f31444M = 4;
        this.f31445N = 4;
        this.f31450S = 0.1f;
        this.f31457Z = new ArrayList();
        this.f31465d0 = -1;
        this.f31471g0 = new SparseIntArray();
        this.f31473h0 = new d();
    }

    private void P0(View view) {
        boolean z7 = (Build.VERSION.SDK_INT < 29 || r0() || this.f31470g) ? false : true;
        if (this.f31481p || this.f31482q || this.f31483r || this.f31485t || this.f31486u || this.f31487v || z7) {
            o.b(view, new c(z7));
        }
    }

    private boolean R0() {
        return this.f31446O != null && (this.f31443L || this.f31444M == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(View view, int i8, boolean z7) {
        int n02 = n0(i8);
        G0.c cVar = this.f31446O;
        if (cVar == null || (!z7 ? cVar.H(view, view.getLeft(), n02) : cVar.F(view.getLeft(), n02))) {
            O0(i8);
            return;
        }
        O0(2);
        Y0(i8, true);
        this.f31433B.c(i8);
    }

    private void W0() {
        WeakReference weakReference = this.f31454W;
        if (weakReference != null) {
            X0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f31455X;
        if (weakReference2 != null) {
            X0((View) weakReference2.get(), 1);
        }
    }

    private int X(View view, int i8, int i9) {
        return X.c(view, view.getResources().getString(i8), g0(i9));
    }

    private void X0(View view, int i8) {
        if (view == null) {
            return;
        }
        f0(view, i8);
        if (!this.f31460b && this.f31444M != 6) {
            this.f31471g0.put(i8, X(view, j.f1585a, 6));
        }
        if (this.f31441J && t0() && this.f31444M != 5) {
            w0(view, z.a.f54y, 5);
        }
        int i9 = this.f31444M;
        if (i9 == 3) {
            w0(view, z.a.f53x, this.f31460b ? 4 : 6);
            return;
        }
        if (i9 == 4) {
            w0(view, z.a.f52w, this.f31460b ? 3 : 6);
        } else {
            if (i9 != 6) {
                return;
            }
            w0(view, z.a.f53x, 4);
            w0(view, z.a.f52w, 3);
        }
    }

    private void Y() {
        int c02 = c0();
        if (this.f31460b) {
            this.f31439H = Math.max(this.f31453V - c02, this.f31436E);
        } else {
            this.f31439H = this.f31453V - c02;
        }
    }

    private void Y0(int i8, boolean z7) {
        boolean q02;
        ValueAnimator valueAnimator;
        if (i8 == 2 || this.f31432A == (q02 = q0()) || this.f31475j == null) {
            return;
        }
        this.f31432A = q02;
        if (!z7 || (valueAnimator = this.f31434C) == null) {
            ValueAnimator valueAnimator2 = this.f31434C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f31434C.cancel();
            }
            this.f31475j.V(this.f31432A ? b0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f31434C.reverse();
        } else {
            this.f31434C.setFloatValues(this.f31475j.w(), q02 ? b0() : 1.0f);
            this.f31434C.start();
        }
    }

    private float Z(float f8, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f8 > 0.0f) {
                return radius / f8;
            }
        }
        return 0.0f;
    }

    private void Z0(boolean z7) {
        Map map;
        WeakReference weakReference = this.f31454W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z7) {
                if (this.f31469f0 != null) {
                    return;
                } else {
                    this.f31469f0 = new HashMap(childCount);
                }
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                if (childAt != this.f31454W.get()) {
                    if (z7) {
                        this.f31469f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f31462c) {
                            X.w0(childAt, 4);
                        }
                    } else if (this.f31462c && (map = this.f31469f0) != null && map.containsKey(childAt)) {
                        X.w0(childAt, ((Integer) this.f31469f0.get(childAt)).intValue());
                    }
                }
            }
            if (!z7) {
                this.f31469f0 = null;
            } else if (this.f31462c) {
                ((View) this.f31454W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void a0() {
        this.f31437F = (int) (this.f31453V * (1.0f - this.f31438G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(boolean z7) {
        View view;
        if (this.f31454W != null) {
            Y();
            if (this.f31444M != 4 || (view = (View) this.f31454W.get()) == null) {
                return;
            }
            if (z7) {
                N0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private float b0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f31475j == null || (weakReference = this.f31454W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f31454W.get();
        if (!p0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(Z(this.f31475j.C(), rootWindowInsets.getRoundedCorner(0)), Z(this.f31475j.D(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int c0() {
        int i8;
        return this.f31470g ? Math.min(Math.max(this.f31472h, this.f31453V - ((this.f31452U * 9) / 16)), this.f31451T) + this.f31488w : (this.f31480o || this.f31481p || (i8 = this.f31479n) <= 0) ? this.f31468f + this.f31488w : Math.max(this.f31468f, i8 + this.f31474i);
    }

    private float d0(int i8) {
        float f8;
        float f9;
        int i9 = this.f31439H;
        if (i8 > i9 || i9 == m0()) {
            int i10 = this.f31439H;
            f8 = i10 - i8;
            f9 = this.f31453V - i10;
        } else {
            int i11 = this.f31439H;
            f8 = i11 - i8;
            f9 = i11 - m0();
        }
        return f8 / f9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e0() {
        return s0() && t0();
    }

    private void f0(View view, int i8) {
        if (view == null) {
            return;
        }
        X.h0(view, 524288);
        X.h0(view, 262144);
        X.h0(view, 1048576);
        int i9 = this.f31471g0.get(i8, -1);
        if (i9 != -1) {
            X.h0(view, i9);
            this.f31471g0.delete(i8);
        }
    }

    private C g0(int i8) {
        return new e(i8);
    }

    private void h0(Context context) {
        if (this.f31491z == null) {
            return;
        }
        V3.g gVar = new V3.g(this.f31491z);
        this.f31475j = gVar;
        gVar.J(context);
        ColorStateList colorStateList = this.f31476k;
        if (colorStateList != null) {
            this.f31475j.U(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f31475j.setTint(typedValue.data);
    }

    private void i0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(b0(), 1.0f);
        this.f31434C = ofFloat;
        ofFloat.setDuration(500L);
        this.f31434C.addUpdateListener(new b());
    }

    private int l0(int i8, int i9, int i10, int i11) {
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

    private int n0(int i8) {
        if (i8 == 3) {
            return m0();
        }
        if (i8 == 4) {
            return this.f31439H;
        }
        if (i8 == 5) {
            return this.f31453V;
        }
        if (i8 == 6) {
            return this.f31437F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i8);
    }

    private float o0() {
        VelocityTracker velocityTracker = this.f31459a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f31464d);
        return this.f31459a0.getYVelocity(this.f31463c0);
    }

    private boolean p0() {
        WeakReference weakReference = this.f31454W;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f31454W.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean q0() {
        return this.f31444M == 3 && (this.f31490y || p0());
    }

    private boolean u0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && X.Q(view);
    }

    private void w0(View view, z.a aVar, int i8) {
        X.j0(view, aVar, null, g0(i8));
    }

    private void x0() {
        this.f31463c0 = -1;
        this.f31465d0 = -1;
        VelocityTracker velocityTracker = this.f31459a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f31459a0 = null;
        }
    }

    private void y0(f fVar) {
        int i8 = this.f31458a;
        if (i8 == 0) {
            return;
        }
        if (i8 == -1 || (i8 & 1) == 1) {
            this.f31468f = fVar.f31503u;
        }
        if (i8 == -1 || (i8 & 2) == 2) {
            this.f31460b = fVar.f31504v;
        }
        if (i8 == -1 || (i8 & 4) == 4) {
            this.f31441J = fVar.f31505w;
        }
        if (i8 == -1 || (i8 & 8) == 8) {
            this.f31442K = fVar.f31506x;
        }
    }

    private void z0(View view, Runnable runnable) {
        if (u0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i9) {
        this.f31448Q = 0;
        this.f31449R = false;
        return (i8 & 2) != 0;
    }

    public void A0(boolean z7) {
        this.f31443L = z7;
    }

    public void B0(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f31435D = i8;
        Y0(this.f31444M, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.O0(r0)
            return
        Lf:
            boolean r3 = r2.v0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f31456Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f31449R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f31448Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f31460b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f31437F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f31441J
            if (r3 == 0) goto L49
            float r3 = r2.o0()
            boolean r3 = r2.S0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f31448Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f31460b
            if (r1 == 0) goto L68
            int r5 = r2.f31436E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f31439H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f31437F
            if (r3 >= r1) goto L7e
            int r1 = r2.f31439H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.T0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f31439H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f31460b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f31437F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f31439H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.V0(r4, r0, r3)
            r2.f31449R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(boolean z7) {
        if (this.f31460b == z7) {
            return;
        }
        this.f31460b = z7;
        if (this.f31454W != null) {
            Y();
        }
        O0((this.f31460b && this.f31444M == 6) ? 3 : this.f31444M);
        Y0(this.f31444M, true);
        W0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f31444M == 1 && actionMasked == 0) {
            return true;
        }
        if (R0()) {
            this.f31446O.z(motionEvent);
        }
        if (actionMasked == 0) {
            x0();
        }
        if (this.f31459a0 == null) {
            this.f31459a0 = VelocityTracker.obtain();
        }
        this.f31459a0.addMovement(motionEvent);
        if (R0() && actionMasked == 2 && !this.f31447P && Math.abs(this.f31465d0 - motionEvent.getY()) > this.f31446O.u()) {
            this.f31446O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f31447P;
    }

    public void D0(boolean z7) {
        this.f31480o = z7;
    }

    public void E0(float f8) {
        if (f8 <= 0.0f || f8 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f31438G = f8;
        if (this.f31454W != null) {
            a0();
        }
    }

    public void F0(boolean z7) {
        if (this.f31441J != z7) {
            this.f31441J = z7;
            if (!z7 && this.f31444M == 5) {
                N0(4);
            }
            W0();
        }
    }

    public void G0(int i8) {
        this.f31478m = i8;
    }

    public void H0(int i8) {
        this.f31477l = i8;
    }

    public void I0(int i8) {
        J0(i8, false);
    }

    public final void J0(int i8, boolean z7) {
        if (i8 == -1) {
            if (this.f31470g) {
                return;
            } else {
                this.f31470g = true;
            }
        } else {
            if (!this.f31470g && this.f31468f == i8) {
                return;
            }
            this.f31470g = false;
            this.f31468f = Math.max(0, i8);
        }
        a1(z7);
    }

    public void K0(int i8) {
        this.f31458a = i8;
    }

    public void L0(int i8) {
        this.f31466e = i8;
    }

    public void M0(boolean z7) {
        this.f31442K = z7;
    }

    public void N0(int i8) {
        if (i8 == 1 || i8 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i8 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f31441J && i8 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i8);
            return;
        }
        int i9 = (i8 == 6 && this.f31460b && n0(i8) <= this.f31436E) ? 3 : i8;
        WeakReference weakReference = this.f31454W;
        if (weakReference == null || weakReference.get() == null) {
            O0(i8);
        } else {
            View view = (View) this.f31454W.get();
            z0(view, new a(view, i9));
        }
    }

    void O0(int i8) {
        if (this.f31444M == i8) {
            return;
        }
        this.f31444M = i8;
        if (i8 == 4 || i8 == 3 || i8 == 6 || (this.f31441J && i8 == 5)) {
            this.f31445N = i8;
        }
        WeakReference weakReference = this.f31454W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i8 == 3) {
            Z0(true);
        } else if (i8 == 6 || i8 == 5 || i8 == 4) {
            Z0(false);
        }
        Y0(i8, true);
        if (this.f31457Z.size() <= 0) {
            W0();
        } else {
            E.a(this.f31457Z.get(0));
            throw null;
        }
    }

    public boolean Q0(long j8, float f8) {
        return false;
    }

    boolean S0(View view, float f8) {
        if (this.f31442K) {
            return true;
        }
        if (t0() && view.getTop() >= this.f31439H) {
            return Math.abs((((float) view.getTop()) + (f8 * this.f31450S)) - ((float) this.f31439H)) / ((float) c0()) > 0.5f;
        }
        return false;
    }

    public boolean T0() {
        return false;
    }

    public boolean U0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f31454W = null;
        this.f31446O = null;
        this.f31461b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f31454W = null;
        this.f31446O = null;
        this.f31461b0 = null;
    }

    void j0(int i8) {
        if (((View) this.f31454W.get()) == null || this.f31457Z.isEmpty()) {
            return;
        }
        d0(i8);
        if (this.f31457Z.size() <= 0) {
            return;
        }
        E.a(this.f31457Z.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i8;
        G0.c cVar;
        if (!view.isShown() || !this.f31443L) {
            this.f31447P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x0();
        }
        if (this.f31459a0 == null) {
            this.f31459a0 = VelocityTracker.obtain();
        }
        this.f31459a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x7 = (int) motionEvent.getX();
            this.f31465d0 = (int) motionEvent.getY();
            if (this.f31444M != 2) {
                WeakReference weakReference = this.f31456Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.A(view2, x7, this.f31465d0)) {
                    this.f31463c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f31467e0 = true;
                }
            }
            this.f31447P = this.f31463c0 == -1 && !coordinatorLayout.A(view, x7, this.f31465d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f31467e0 = false;
            this.f31463c0 = -1;
            if (this.f31447P) {
                this.f31447P = false;
                return false;
            }
        }
        if (!this.f31447P && (cVar = this.f31446O) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f31456Y;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f31447P || this.f31444M == 1 || coordinatorLayout.A(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f31446O == null || (i8 = this.f31465d0) == -1 || Math.abs(((float) i8) - motionEvent.getY()) <= ((float) this.f31446O.u())) ? false : true;
    }

    View k0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (X.S(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View k02 = k0(viewGroup.getChildAt(i8));
                if (k02 != null) {
                    return k02;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
        if (X.w(coordinatorLayout) && !X.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f31454W == null) {
            this.f31472h = coordinatorLayout.getResources().getDimensionPixelSize(D3.d.f1464a);
            P0(view);
            X.I0(view, new com.google.android.material.bottomsheet.a(view));
            this.f31454W = new WeakReference(view);
            this.f31461b0 = new Q3.b(view);
            V3.g gVar = this.f31475j;
            if (gVar != null) {
                X.r0(view, gVar);
                V3.g gVar2 = this.f31475j;
                float f8 = this.f31440I;
                if (f8 == -1.0f) {
                    f8 = X.u(view);
                }
                gVar2.T(f8);
            } else {
                ColorStateList colorStateList = this.f31476k;
                if (colorStateList != null) {
                    X.s0(view, colorStateList);
                }
            }
            W0();
            if (X.x(view) == 0) {
                X.w0(view, 1);
            }
        }
        if (this.f31446O == null) {
            this.f31446O = G0.c.m(coordinatorLayout, this.f31473h0);
        }
        int top = view.getTop();
        coordinatorLayout.H(view, i8);
        this.f31452U = coordinatorLayout.getWidth();
        this.f31453V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f31451T = height;
        int i9 = this.f31453V;
        int i10 = i9 - height;
        int i11 = this.f31489x;
        if (i10 < i11) {
            if (this.f31484s) {
                int i12 = this.f31478m;
                if (i12 != -1) {
                    i9 = Math.min(i9, i12);
                }
                this.f31451T = i9;
            } else {
                int i13 = i9 - i11;
                int i14 = this.f31478m;
                if (i14 != -1) {
                    i13 = Math.min(i13, i14);
                }
                this.f31451T = i13;
            }
        }
        this.f31436E = Math.max(0, this.f31453V - this.f31451T);
        a0();
        Y();
        int i15 = this.f31444M;
        if (i15 == 3) {
            X.Y(view, m0());
        } else if (i15 == 6) {
            X.Y(view, this.f31437F);
        } else if (this.f31441J && i15 == 5) {
            X.Y(view, this.f31453V);
        } else if (i15 == 4) {
            X.Y(view, this.f31439H);
        } else if (i15 == 1 || i15 == 2) {
            X.Y(view, top - view.getTop());
        }
        Y0(this.f31444M, false);
        this.f31456Y = new WeakReference(k0(view));
        if (this.f31457Z.size() <= 0) {
            return true;
        }
        E.a(this.f31457Z.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(l0(i8, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, this.f31477l, marginLayoutParams.width), l0(i10, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, this.f31478m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        if (this.f31460b) {
            return this.f31436E;
        }
        return Math.max(this.f31435D, this.f31484s ? 0 : this.f31489x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f8, float f9) {
        WeakReference weakReference;
        if (v0() && (weakReference = this.f31456Y) != null && view2 == weakReference.get()) {
            return this.f31444M != 3 || super.o(coordinatorLayout, view, view2, f8, f9);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int[] iArr, int i10) {
        if (i10 == 1) {
            return;
        }
        WeakReference weakReference = this.f31456Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!v0() || view2 == view3) {
            int top = view.getTop();
            int i11 = top - i9;
            if (i9 > 0) {
                if (i11 < m0()) {
                    int m02 = top - m0();
                    iArr[1] = m02;
                    X.Y(view, -m02);
                    O0(3);
                } else {
                    if (!this.f31443L) {
                        return;
                    }
                    iArr[1] = i9;
                    X.Y(view, -i9);
                    O0(1);
                }
            } else if (i9 < 0 && !view2.canScrollVertically(-1)) {
                if (i11 > this.f31439H && !e0()) {
                    int i12 = top - this.f31439H;
                    iArr[1] = i12;
                    X.Y(view, -i12);
                    O0(4);
                } else {
                    if (!this.f31443L) {
                        return;
                    }
                    iArr[1] = i9;
                    X.Y(view, -i9);
                    O0(1);
                }
            }
            j0(view.getTop());
            this.f31448Q = i9;
            this.f31449R = true;
        }
    }

    public boolean r0() {
        return this.f31480o;
    }

    public boolean s0() {
        return this.f31441J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
    }

    public boolean t0() {
        return true;
    }

    public boolean v0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        y0(fVar);
        int i8 = fVar.f31502t;
        if (i8 == 1 || i8 == 2) {
            this.f31444M = 4;
            this.f31445N = 4;
        } else {
            this.f31444M = i8;
            this.f31445N = i8;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    private class g {

        /* renamed from: a, reason: collision with root package name */
        private int f31507a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31508b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f31509c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f31508b = false;
                G0.c cVar = BottomSheetBehavior.this.f31446O;
                if (cVar != null && cVar.k(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f31507a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f31444M == 2) {
                    bottomSheetBehavior.O0(gVar2.f31507a);
                }
            }
        }

        private g() {
            this.f31509c = new a();
        }

        void c(int i8) {
            WeakReference weakReference = BottomSheetBehavior.this.f31454W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f31507a = i8;
            if (this.f31508b) {
                return;
            }
            X.f0((View) BottomSheetBehavior.this.f31454W.get(), this.f31509c);
            this.f31508b = true;
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class f extends F0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        final int f31502t;

        /* renamed from: u, reason: collision with root package name */
        int f31503u;

        /* renamed from: v, reason: collision with root package name */
        boolean f31504v;

        /* renamed from: w, reason: collision with root package name */
        boolean f31505w;

        /* renamed from: x, reason: collision with root package name */
        boolean f31506x;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i8) {
                return new f[i8];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31502t = parcel.readInt();
            this.f31503u = parcel.readInt();
            this.f31504v = parcel.readInt() == 1;
            this.f31505w = parcel.readInt() == 1;
            this.f31506x = parcel.readInt() == 1;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f31502t);
            parcel.writeInt(this.f31503u);
            parcel.writeInt(this.f31504v ? 1 : 0);
            parcel.writeInt(this.f31505w ? 1 : 0);
            parcel.writeInt(this.f31506x ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f31502t = bottomSheetBehavior.f31444M;
            this.f31503u = bottomSheetBehavior.f31468f;
            this.f31504v = bottomSheetBehavior.f31460b;
            this.f31505w = bottomSheetBehavior.f31441J;
            this.f31506x = bottomSheetBehavior.f31442K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i8;
        super(context, attributeSet);
        this.f31458a = 0;
        this.f31460b = true;
        this.f31462c = false;
        this.f31477l = -1;
        this.f31478m = -1;
        this.f31433B = new g(this, null);
        this.f31438G = 0.5f;
        this.f31440I = -1.0f;
        this.f31443L = true;
        this.f31444M = 4;
        this.f31445N = 4;
        this.f31450S = 0.1f;
        this.f31457Z = new ArrayList();
        this.f31465d0 = -1;
        this.f31471g0 = new SparseIntArray();
        this.f31473h0 = new d();
        this.f31474i = context.getResources().getDimensionPixelSize(D3.d.f1471d0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f1825Y);
        if (obtainStyledAttributes.hasValue(l.f1860c0)) {
            this.f31476k = S3.c.a(context, obtainStyledAttributes, l.f1860c0);
        }
        if (obtainStyledAttributes.hasValue(l.f2021u0)) {
            this.f31491z = V3.k.e(context, attributeSet, D3.b.f1404c, f31431i0).m();
        }
        h0(context);
        i0();
        this.f31440I = obtainStyledAttributes.getDimension(l.f1851b0, -1.0f);
        if (obtainStyledAttributes.hasValue(l.f1833Z)) {
            H0(obtainStyledAttributes.getDimensionPixelSize(l.f1833Z, -1));
        }
        if (obtainStyledAttributes.hasValue(l.f1842a0)) {
            G0(obtainStyledAttributes.getDimensionPixelSize(l.f1842a0, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(l.f1914i0);
        if (peekValue != null && (i8 = peekValue.data) == -1) {
            I0(i8);
        } else {
            I0(obtainStyledAttributes.getDimensionPixelSize(l.f1914i0, -1));
        }
        F0(obtainStyledAttributes.getBoolean(l.f1905h0, false));
        D0(obtainStyledAttributes.getBoolean(l.f1950m0, false));
        C0(obtainStyledAttributes.getBoolean(l.f1887f0, true));
        M0(obtainStyledAttributes.getBoolean(l.f1941l0, false));
        A0(obtainStyledAttributes.getBoolean(l.f1869d0, true));
        K0(obtainStyledAttributes.getInt(l.f1923j0, 0));
        E0(obtainStyledAttributes.getFloat(l.f1896g0, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(l.f1878e0);
        if (peekValue2 != null && peekValue2.type == 16) {
            B0(peekValue2.data);
        } else {
            B0(obtainStyledAttributes.getDimensionPixelOffset(l.f1878e0, 0));
        }
        L0(obtainStyledAttributes.getInt(l.f1932k0, 500));
        this.f31481p = obtainStyledAttributes.getBoolean(l.f1986q0, false);
        this.f31482q = obtainStyledAttributes.getBoolean(l.f1995r0, false);
        this.f31483r = obtainStyledAttributes.getBoolean(l.f2004s0, false);
        this.f31484s = obtainStyledAttributes.getBoolean(l.f2013t0, true);
        this.f31485t = obtainStyledAttributes.getBoolean(l.f1959n0, false);
        this.f31486u = obtainStyledAttributes.getBoolean(l.f1968o0, false);
        this.f31487v = obtainStyledAttributes.getBoolean(l.f1977p0, false);
        this.f31490y = obtainStyledAttributes.getBoolean(l.f2029v0, true);
        obtainStyledAttributes.recycle();
        this.f31464d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
