package androidx.recyclerview.widget;

import A0.AbstractC0365b;
import A0.z;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.t;
import b1.AbstractC0952a;
import b1.AbstractC0953b;
import b1.AbstractC0954c;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import z0.AbstractC6999C;
import z0.AbstractC7014a0;
import z0.C7000D;
import z0.C7013a;
import z0.X;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: S0, reason: collision with root package name */
    static boolean f10815S0 = false;

    /* renamed from: T0, reason: collision with root package name */
    static boolean f10816T0 = false;

    /* renamed from: U0, reason: collision with root package name */
    private static final int[] f10817U0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: V0, reason: collision with root package name */
    private static final float f10818V0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: W0, reason: collision with root package name */
    static final boolean f10819W0 = false;

    /* renamed from: X0, reason: collision with root package name */
    static final boolean f10820X0 = true;

    /* renamed from: Y0, reason: collision with root package name */
    static final boolean f10821Y0 = true;

    /* renamed from: Z0, reason: collision with root package name */
    static final boolean f10822Z0 = true;

    /* renamed from: a1, reason: collision with root package name */
    private static final boolean f10823a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    private static final boolean f10824b1 = false;

    /* renamed from: c1, reason: collision with root package name */
    private static final Class[] f10825c1;

    /* renamed from: d1, reason: collision with root package name */
    static final Interpolator f10826d1;

    /* renamed from: e1, reason: collision with root package name */
    static final C f10827e1;

    /* renamed from: A, reason: collision with root package name */
    final Rect f10828A;

    /* renamed from: A0, reason: collision with root package name */
    private u f10829A0;

    /* renamed from: B, reason: collision with root package name */
    private final Rect f10830B;

    /* renamed from: B0, reason: collision with root package name */
    private List f10831B0;

    /* renamed from: C, reason: collision with root package name */
    final RectF f10832C;

    /* renamed from: C0, reason: collision with root package name */
    boolean f10833C0;

    /* renamed from: D, reason: collision with root package name */
    h f10834D;

    /* renamed from: D0, reason: collision with root package name */
    boolean f10835D0;

    /* renamed from: E, reason: collision with root package name */
    p f10836E;

    /* renamed from: E0, reason: collision with root package name */
    private m.a f10837E0;

    /* renamed from: F, reason: collision with root package name */
    final List f10838F;

    /* renamed from: F0, reason: collision with root package name */
    boolean f10839F0;

    /* renamed from: G, reason: collision with root package name */
    final ArrayList f10840G;

    /* renamed from: G0, reason: collision with root package name */
    androidx.recyclerview.widget.o f10841G0;

    /* renamed from: H, reason: collision with root package name */
    private final ArrayList f10842H;

    /* renamed from: H0, reason: collision with root package name */
    private final int[] f10843H0;

    /* renamed from: I, reason: collision with root package name */
    private t f10844I;

    /* renamed from: I0, reason: collision with root package name */
    private C7000D f10845I0;

    /* renamed from: J, reason: collision with root package name */
    boolean f10846J;

    /* renamed from: J0, reason: collision with root package name */
    private final int[] f10847J0;

    /* renamed from: K, reason: collision with root package name */
    boolean f10848K;

    /* renamed from: K0, reason: collision with root package name */
    private final int[] f10849K0;

    /* renamed from: L, reason: collision with root package name */
    boolean f10850L;

    /* renamed from: L0, reason: collision with root package name */
    final int[] f10851L0;

    /* renamed from: M, reason: collision with root package name */
    boolean f10852M;

    /* renamed from: M0, reason: collision with root package name */
    final List f10853M0;

    /* renamed from: N, reason: collision with root package name */
    private int f10854N;

    /* renamed from: N0, reason: collision with root package name */
    private Runnable f10855N0;

    /* renamed from: O, reason: collision with root package name */
    boolean f10856O;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f10857O0;

    /* renamed from: P, reason: collision with root package name */
    boolean f10858P;

    /* renamed from: P0, reason: collision with root package name */
    private int f10859P0;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f10860Q;

    /* renamed from: Q0, reason: collision with root package name */
    private int f10861Q0;

    /* renamed from: R, reason: collision with root package name */
    private int f10862R;

    /* renamed from: R0, reason: collision with root package name */
    private final t.b f10863R0;

    /* renamed from: S, reason: collision with root package name */
    boolean f10864S;

    /* renamed from: T, reason: collision with root package name */
    private final AccessibilityManager f10865T;

    /* renamed from: U, reason: collision with root package name */
    private List f10866U;

    /* renamed from: V, reason: collision with root package name */
    boolean f10867V;

    /* renamed from: W, reason: collision with root package name */
    boolean f10868W;

    /* renamed from: a0, reason: collision with root package name */
    private int f10869a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f10870b0;

    /* renamed from: c0, reason: collision with root package name */
    private l f10871c0;

    /* renamed from: d0, reason: collision with root package name */
    private EdgeEffect f10872d0;

    /* renamed from: e0, reason: collision with root package name */
    private EdgeEffect f10873e0;

    /* renamed from: f0, reason: collision with root package name */
    private EdgeEffect f10874f0;

    /* renamed from: g0, reason: collision with root package name */
    private EdgeEffect f10875g0;

    /* renamed from: h0, reason: collision with root package name */
    m f10876h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f10877i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f10878j0;

    /* renamed from: k0, reason: collision with root package name */
    private VelocityTracker f10879k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f10880l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f10881m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f10882n0;

    /* renamed from: o, reason: collision with root package name */
    private final float f10883o;

    /* renamed from: o0, reason: collision with root package name */
    private int f10884o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f10885p0;

    /* renamed from: q0, reason: collision with root package name */
    private s f10886q0;

    /* renamed from: r0, reason: collision with root package name */
    private final int f10887r0;

    /* renamed from: s, reason: collision with root package name */
    private final y f10888s;

    /* renamed from: s0, reason: collision with root package name */
    private final int f10889s0;

    /* renamed from: t, reason: collision with root package name */
    final w f10890t;

    /* renamed from: t0, reason: collision with root package name */
    private float f10891t0;

    /* renamed from: u, reason: collision with root package name */
    z f10892u;

    /* renamed from: u0, reason: collision with root package name */
    private float f10893u0;

    /* renamed from: v, reason: collision with root package name */
    a f10894v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f10895v0;

    /* renamed from: w, reason: collision with root package name */
    d f10896w;

    /* renamed from: w0, reason: collision with root package name */
    final E f10897w0;

    /* renamed from: x, reason: collision with root package name */
    final androidx.recyclerview.widget.t f10898x;

    /* renamed from: x0, reason: collision with root package name */
    androidx.recyclerview.widget.h f10899x0;

    /* renamed from: y, reason: collision with root package name */
    boolean f10900y;

    /* renamed from: y0, reason: collision with root package name */
    h.b f10901y0;

    /* renamed from: z, reason: collision with root package name */
    final Runnable f10902z;

    /* renamed from: z0, reason: collision with root package name */
    final B f10903z0;

    public static abstract class A {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f10905b;

        /* renamed from: c, reason: collision with root package name */
        private p f10906c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10907d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f10908e;

        /* renamed from: f, reason: collision with root package name */
        private View f10909f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f10911h;

        /* renamed from: a, reason: collision with root package name */
        private int f10904a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f10910g = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f10912a;

            /* renamed from: b, reason: collision with root package name */
            private int f10913b;

            /* renamed from: c, reason: collision with root package name */
            private int f10914c;

            /* renamed from: d, reason: collision with root package name */
            private int f10915d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f10916e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f10917f;

            /* renamed from: g, reason: collision with root package name */
            private int f10918g;

            public a(int i8, int i9) {
                this(i8, i9, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f10916e != null && this.f10914c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f10914c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f10915d >= 0;
            }

            public void b(int i8) {
                this.f10915d = i8;
            }

            void c(RecyclerView recyclerView) {
                int i8 = this.f10915d;
                if (i8 >= 0) {
                    this.f10915d = -1;
                    recyclerView.G0(i8);
                    this.f10917f = false;
                } else {
                    if (!this.f10917f) {
                        this.f10918g = 0;
                        return;
                    }
                    e();
                    recyclerView.f10897w0.e(this.f10912a, this.f10913b, this.f10914c, this.f10916e);
                    int i9 = this.f10918g + 1;
                    this.f10918g = i9;
                    if (i9 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f10917f = false;
                }
            }

            public void d(int i8, int i9, int i10, Interpolator interpolator) {
                this.f10912a = i8;
                this.f10913b = i9;
                this.f10914c = i10;
                this.f10916e = interpolator;
                this.f10917f = true;
            }

            public a(int i8, int i9, int i10, Interpolator interpolator) {
                this.f10915d = -1;
                this.f10917f = false;
                this.f10918g = 0;
                this.f10912a = i8;
                this.f10913b = i9;
                this.f10914c = i10;
                this.f10916e = interpolator;
            }
        }

        public interface b {
            PointF c(int i8);
        }

        public PointF a(int i8) {
            Object e8 = e();
            if (e8 instanceof b) {
                return ((b) e8).c(i8);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i8) {
            return this.f10905b.f10836E.H(i8);
        }

        public int c() {
            return this.f10905b.f10836E.O();
        }

        public int d(View view) {
            return this.f10905b.l0(view);
        }

        public p e() {
            return this.f10906c;
        }

        public int f() {
            return this.f10904a;
        }

        public boolean g() {
            return this.f10907d;
        }

        public boolean h() {
            return this.f10908e;
        }

        protected void i(PointF pointF) {
            float f8 = pointF.x;
            float f9 = pointF.y;
            float sqrt = (float) Math.sqrt((f8 * f8) + (f9 * f9));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void j(int i8, int i9) {
            PointF a8;
            RecyclerView recyclerView = this.f10905b;
            if (this.f10904a == -1 || recyclerView == null) {
                r();
            }
            if (this.f10907d && this.f10909f == null && this.f10906c != null && (a8 = a(this.f10904a)) != null) {
                float f8 = a8.x;
                if (f8 != 0.0f || a8.y != 0.0f) {
                    recyclerView.t1((int) Math.signum(f8), (int) Math.signum(a8.y), null);
                }
            }
            this.f10907d = false;
            View view = this.f10909f;
            if (view != null) {
                if (d(view) == this.f10904a) {
                    o(this.f10909f, recyclerView.f10903z0, this.f10910g);
                    this.f10910g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f10909f = null;
                }
            }
            if (this.f10908e) {
                l(i8, i9, recyclerView.f10903z0, this.f10910g);
                boolean a9 = this.f10910g.a();
                this.f10910g.c(recyclerView);
                if (a9 && this.f10908e) {
                    this.f10907d = true;
                    recyclerView.f10897w0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f10909f = view;
                if (RecyclerView.f10816T0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void l(int i8, int i9, B b8, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, B b8, a aVar);

        public void p(int i8) {
            this.f10904a = i8;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.f10897w0.f();
            if (this.f10911h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f10905b = recyclerView;
            this.f10906c = pVar;
            int i8 = this.f10904a;
            if (i8 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f10903z0.f10919a = i8;
            this.f10908e = true;
            this.f10907d = true;
            this.f10909f = b(f());
            m();
            this.f10905b.f10897w0.d();
            this.f10911h = true;
        }

        protected final void r() {
            if (this.f10908e) {
                this.f10908e = false;
                n();
                this.f10905b.f10903z0.f10919a = -1;
                this.f10909f = null;
                this.f10904a = -1;
                this.f10907d = false;
                this.f10906c.j1(this);
                this.f10906c = null;
                this.f10905b = null;
            }
        }
    }

    public static class B {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f10920b;

        /* renamed from: m, reason: collision with root package name */
        int f10931m;

        /* renamed from: n, reason: collision with root package name */
        long f10932n;

        /* renamed from: o, reason: collision with root package name */
        int f10933o;

        /* renamed from: p, reason: collision with root package name */
        int f10934p;

        /* renamed from: q, reason: collision with root package name */
        int f10935q;

        /* renamed from: a, reason: collision with root package name */
        int f10919a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f10921c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f10922d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f10923e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f10924f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f10925g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f10926h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f10927i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f10928j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f10929k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f10930l = false;

        void a(int i8) {
            if ((this.f10923e & i8) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i8) + " but it is " + Integer.toBinaryString(this.f10923e));
        }

        public int b() {
            return this.f10926h ? this.f10921c - this.f10922d : this.f10924f;
        }

        public int c() {
            return this.f10919a;
        }

        public boolean d() {
            return this.f10919a != -1;
        }

        public boolean e() {
            return this.f10926h;
        }

        void f(h hVar) {
            this.f10923e = 1;
            this.f10924f = hVar.E();
            this.f10926h = false;
            this.f10927i = false;
            this.f10928j = false;
        }

        public boolean g() {
            return this.f10930l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f10919a + ", mData=" + this.f10920b + ", mItemCount=" + this.f10924f + ", mIsMeasuring=" + this.f10928j + ", mPreviousLayoutItemCount=" + this.f10921c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f10922d + ", mStructureChanged=" + this.f10925g + ", mInPreLayout=" + this.f10926h + ", mRunSimpleAnimations=" + this.f10929k + ", mRunPredictiveAnimations=" + this.f10930l + '}';
        }
    }

    static class C extends l {
        C() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i8) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class D {
    }

    class E implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private int f10936o;

        /* renamed from: s, reason: collision with root package name */
        private int f10937s;

        /* renamed from: t, reason: collision with root package name */
        OverScroller f10938t;

        /* renamed from: u, reason: collision with root package name */
        Interpolator f10939u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f10940v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f10941w;

        E() {
            Interpolator interpolator = RecyclerView.f10826d1;
            this.f10939u = interpolator;
            this.f10940v = false;
            this.f10941w = false;
            this.f10938t = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i8, int i9) {
            int abs = Math.abs(i8);
            int abs2 = Math.abs(i9);
            boolean z7 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z7 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z7) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            X.f0(RecyclerView.this, this);
        }

        public void b(int i8, int i9) {
            RecyclerView.this.setScrollState(2);
            this.f10937s = 0;
            this.f10936o = 0;
            Interpolator interpolator = this.f10939u;
            Interpolator interpolator2 = RecyclerView.f10826d1;
            if (interpolator != interpolator2) {
                this.f10939u = interpolator2;
                this.f10938t = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f10938t.fling(0, 0, i8, i9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f10940v) {
                this.f10941w = true;
            } else {
                c();
            }
        }

        public void e(int i8, int i9, int i10, Interpolator interpolator) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = a(i8, i9);
            }
            int i11 = i10;
            if (interpolator == null) {
                interpolator = RecyclerView.f10826d1;
            }
            if (this.f10939u != interpolator) {
                this.f10939u = interpolator;
                this.f10938t = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f10937s = 0;
            this.f10936o = 0;
            RecyclerView.this.setScrollState(2);
            this.f10938t.startScroll(0, 0, i8, i9, i11);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f10938t.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8;
            int i9;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10836E == null) {
                f();
                return;
            }
            this.f10941w = false;
            this.f10940v = true;
            recyclerView.A();
            OverScroller overScroller = this.f10938t;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i10 = currX - this.f10936o;
                int i11 = currY - this.f10937s;
                this.f10936o = currX;
                this.f10937s = currY;
                int x7 = RecyclerView.this.x(i10);
                int z7 = RecyclerView.this.z(i11);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f10851L0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(x7, z7, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f10851L0;
                    x7 -= iArr2[0];
                    z7 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(x7, z7);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f10834D != null) {
                    int[] iArr3 = recyclerView3.f10851L0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.t1(x7, z7, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f10851L0;
                    i9 = iArr4[0];
                    i8 = iArr4[1];
                    x7 -= i9;
                    z7 -= i8;
                    A a8 = recyclerView4.f10836E.f10993g;
                    if (a8 != null && !a8.g() && a8.h()) {
                        int b8 = RecyclerView.this.f10903z0.b();
                        if (b8 == 0) {
                            a8.r();
                        } else if (a8.f() >= b8) {
                            a8.p(b8 - 1);
                            a8.j(i9, i8);
                        } else {
                            a8.j(i9, i8);
                        }
                    }
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if (!RecyclerView.this.f10840G.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f10851L0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i9, i8, x7, z7, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f10851L0;
                int i12 = x7 - iArr6[0];
                int i13 = z7 - iArr6[1];
                if (i9 != 0 || i8 != 0) {
                    recyclerView6.O(i9, i8);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z8 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                A a9 = RecyclerView.this.f10836E.f10993g;
                if ((a9 == null || !a9.g()) && z8) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i14, currVelocity);
                    }
                    if (RecyclerView.f10822Z0) {
                        RecyclerView.this.f10901y0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.h hVar = recyclerView7.f10899x0;
                    if (hVar != null) {
                        hVar.f(recyclerView7, i9, i8);
                    }
                }
            }
            A a10 = RecyclerView.this.f10836E.f10993g;
            if (a10 != null && a10.g()) {
                a10.j(0, 0);
            }
            this.f10940v = false;
            if (this.f10941w) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.I1(1);
            }
        }
    }

    public static abstract class F {

        /* renamed from: t, reason: collision with root package name */
        private static final List f10943t = Collections.emptyList();

        /* renamed from: a, reason: collision with root package name */
        public final View f10944a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference f10945b;

        /* renamed from: j, reason: collision with root package name */
        int f10953j;

        /* renamed from: r, reason: collision with root package name */
        RecyclerView f10961r;

        /* renamed from: s, reason: collision with root package name */
        h f10962s;

        /* renamed from: c, reason: collision with root package name */
        int f10946c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f10947d = -1;

        /* renamed from: e, reason: collision with root package name */
        long f10948e = -1;

        /* renamed from: f, reason: collision with root package name */
        int f10949f = -1;

        /* renamed from: g, reason: collision with root package name */
        int f10950g = -1;

        /* renamed from: h, reason: collision with root package name */
        F f10951h = null;

        /* renamed from: i, reason: collision with root package name */
        F f10952i = null;

        /* renamed from: k, reason: collision with root package name */
        List f10954k = null;

        /* renamed from: l, reason: collision with root package name */
        List f10955l = null;

        /* renamed from: m, reason: collision with root package name */
        private int f10956m = 0;

        /* renamed from: n, reason: collision with root package name */
        w f10957n = null;

        /* renamed from: o, reason: collision with root package name */
        boolean f10958o = false;

        /* renamed from: p, reason: collision with root package name */
        private int f10959p = 0;

        /* renamed from: q, reason: collision with root package name */
        int f10960q = -1;

        public F(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f10944a = view;
        }

        private void y() {
            if (this.f10954k == null) {
                ArrayList arrayList = new ArrayList();
                this.f10954k = arrayList;
                this.f10955l = DesugarCollections.unmodifiableList(arrayList);
            }
        }

        void A(int i8, int i9, boolean z7) {
            t(8);
            U(i9, z7);
            this.f10946c = i8;
        }

        public final int B() {
            RecyclerView recyclerView = this.f10961r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.i0(this);
        }

        public final int C() {
            return D();
        }

        public final int D() {
            RecyclerView recyclerView;
            h adapter;
            int i02;
            if (this.f10962s == null || (recyclerView = this.f10961r) == null || (adapter = recyclerView.getAdapter()) == null || (i02 = this.f10961r.i0(this)) == -1) {
                return -1;
            }
            return adapter.D(this.f10962s, this, i02);
        }

        public final long E() {
            return this.f10948e;
        }

        public final int F() {
            return this.f10949f;
        }

        public final int G() {
            int i8 = this.f10950g;
            return i8 == -1 ? this.f10946c : i8;
        }

        public final int H() {
            return this.f10947d;
        }

        List I() {
            if ((this.f10953j & 1024) != 0) {
                return f10943t;
            }
            List list = this.f10954k;
            return (list == null || list.size() == 0) ? f10943t : this.f10955l;
        }

        boolean J(int i8) {
            return (i8 & this.f10953j) != 0;
        }

        boolean K() {
            return (this.f10953j & 512) != 0 || N();
        }

        boolean L() {
            return (this.f10944a.getParent() == null || this.f10944a.getParent() == this.f10961r) ? false : true;
        }

        boolean M() {
            return (this.f10953j & 1) != 0;
        }

        boolean N() {
            return (this.f10953j & 4) != 0;
        }

        public final boolean O() {
            return (this.f10953j & 16) == 0 && !X.O(this.f10944a);
        }

        boolean P() {
            return (this.f10953j & 8) != 0;
        }

        boolean Q() {
            return this.f10957n != null;
        }

        boolean R() {
            return (this.f10953j & 256) != 0;
        }

        boolean S() {
            return (this.f10953j & 2) != 0;
        }

        boolean T() {
            return (this.f10953j & 2) != 0;
        }

        void U(int i8, boolean z7) {
            if (this.f10947d == -1) {
                this.f10947d = this.f10946c;
            }
            if (this.f10950g == -1) {
                this.f10950g = this.f10946c;
            }
            if (z7) {
                this.f10950g += i8;
            }
            this.f10946c += i8;
            if (this.f10944a.getLayoutParams() != null) {
                ((q) this.f10944a.getLayoutParams()).f11013c = true;
            }
        }

        void V(RecyclerView recyclerView) {
            int i8 = this.f10960q;
            if (i8 != -1) {
                this.f10959p = i8;
            } else {
                this.f10959p = X.x(this.f10944a);
            }
            recyclerView.w1(this, 4);
        }

        void W(RecyclerView recyclerView) {
            recyclerView.w1(this, this.f10959p);
            this.f10959p = 0;
        }

        void X() {
            if (RecyclerView.f10815S0 && R()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f10953j = 0;
            this.f10946c = -1;
            this.f10947d = -1;
            this.f10948e = -1L;
            this.f10950g = -1;
            this.f10956m = 0;
            this.f10951h = null;
            this.f10952i = null;
            v();
            this.f10959p = 0;
            this.f10960q = -1;
            RecyclerView.u(this);
        }

        void Y() {
            if (this.f10947d == -1) {
                this.f10947d = this.f10946c;
            }
        }

        void Z(int i8, int i9) {
            this.f10953j = (i8 & i9) | (this.f10953j & (~i9));
        }

        public final void a0(boolean z7) {
            int i8 = this.f10956m;
            int i9 = z7 ? i8 - 1 : i8 + 1;
            this.f10956m = i9;
            if (i9 < 0) {
                this.f10956m = 0;
                if (RecyclerView.f10815S0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z7 && i9 == 1) {
                this.f10953j |= 16;
            } else if (z7 && i9 == 0) {
                this.f10953j &= -17;
            }
            if (RecyclerView.f10816T0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z7 + ":" + this);
            }
        }

        void b0(w wVar, boolean z7) {
            this.f10957n = wVar;
            this.f10958o = z7;
        }

        boolean c0() {
            return (this.f10953j & 16) != 0;
        }

        boolean d0() {
            return (this.f10953j & 128) != 0;
        }

        void e0() {
            this.f10957n.O(this);
        }

        boolean f0() {
            return (this.f10953j & 32) != 0;
        }

        void s(Object obj) {
            if (obj == null) {
                t(1024);
            } else if ((1024 & this.f10953j) == 0) {
                y();
                this.f10954k.add(obj);
            }
        }

        void t(int i8) {
            this.f10953j = i8 | this.f10953j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f10946c + " id=" + this.f10948e + ", oldPos=" + this.f10947d + ", pLpos:" + this.f10950g);
            if (Q()) {
                sb.append(" scrap ");
                sb.append(this.f10958o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (N()) {
                sb.append(" invalid");
            }
            if (!M()) {
                sb.append(" unbound");
            }
            if (T()) {
                sb.append(" update");
            }
            if (P()) {
                sb.append(" removed");
            }
            if (d0()) {
                sb.append(" ignored");
            }
            if (R()) {
                sb.append(" tmpDetached");
            }
            if (!O()) {
                sb.append(" not recyclable(" + this.f10956m + ")");
            }
            if (K()) {
                sb.append(" undefined adapter position");
            }
            if (this.f10944a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void u() {
            this.f10947d = -1;
            this.f10950g = -1;
        }

        void v() {
            List list = this.f10954k;
            if (list != null) {
                list.clear();
            }
            this.f10953j &= -1025;
        }

        void w() {
            this.f10953j &= -33;
        }

        void x() {
            this.f10953j &= -257;
        }

        boolean z() {
            return (this.f10953j & 16) == 0 && X.O(this.f10944a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC0929a implements Runnable {
        RunnableC0929a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f10852M || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f10846J) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f10858P) {
                recyclerView2.f10856O = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC0930b implements Runnable {
        RunnableC0930b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f10876h0;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.f10839F0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    class InterpolatorC0931c implements Interpolator {
        InterpolatorC0931c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (f9 * f9 * f9 * f9 * f9) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    class C0932d implements t.b {
        C0932d() {
        }

        @Override // androidx.recyclerview.widget.t.b
        public void a(F f8) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10836E.q1(f8.f10944a, recyclerView.f10890t);
        }

        @Override // androidx.recyclerview.widget.t.b
        public void b(F f8, m.b bVar, m.b bVar2) {
            RecyclerView.this.o(f8, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.t.b
        public void c(F f8, m.b bVar, m.b bVar2) {
            RecyclerView.this.f10890t.O(f8);
            RecyclerView.this.q(f8, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.t.b
        public void d(F f8, m.b bVar, m.b bVar2) {
            f8.a0(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10867V) {
                if (recyclerView.f10876h0.b(f8, f8, bVar, bVar2)) {
                    RecyclerView.this.X0();
                }
            } else if (recyclerView.f10876h0.d(f8, bVar, bVar2)) {
                RecyclerView.this.X0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    class C0933e implements d.b {
        C0933e() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public View a(int i8) {
            return RecyclerView.this.getChildAt(i8);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void b(View view) {
            F n02 = RecyclerView.n0(view);
            if (n02 != null) {
                n02.V(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.d.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.d.b
        public void d() {
            int c8 = c();
            for (int i8 = 0; i8 < c8; i8++) {
                View a8 = a(i8);
                RecyclerView.this.F(a8);
                a8.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.d.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public F f(View view) {
            return RecyclerView.n0(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void g(int i8) {
            View a8 = a(i8);
            if (a8 != null) {
                F n02 = RecyclerView.n0(a8);
                if (n02 != null) {
                    if (n02.R() && !n02.d0()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + n02 + RecyclerView.this.V());
                    }
                    if (RecyclerView.f10816T0) {
                        Log.d("RecyclerView", "tmpDetach " + n02);
                    }
                    n02.t(256);
                }
            } else if (RecyclerView.f10815S0) {
                throw new IllegalArgumentException("No view at offset " + i8 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i8);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void h(View view) {
            F n02 = RecyclerView.n0(view);
            if (n02 != null) {
                n02.W(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.d.b
        public void i(View view, int i8) {
            RecyclerView.this.addView(view, i8);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void j(int i8) {
            View childAt = RecyclerView.this.getChildAt(i8);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i8);
        }

        @Override // androidx.recyclerview.widget.d.b
        public void k(View view, int i8, ViewGroup.LayoutParams layoutParams) {
            F n02 = RecyclerView.n0(view);
            if (n02 != null) {
                if (!n02.R() && !n02.d0()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + n02 + RecyclerView.this.V());
                }
                if (RecyclerView.f10816T0) {
                    Log.d("RecyclerView", "reAttach " + n02);
                }
                n02.x();
            } else if (RecyclerView.f10815S0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i8 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i8, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f, reason: case insensitive filesystem */
    class C0934f implements a.InterfaceC0181a {
        C0934f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0181a
        public void a(int i8, int i9) {
            RecyclerView.this.N0(i8, i9);
            RecyclerView.this.f10833C0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0181a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0181a
        public void c(int i8, int i9, Object obj) {
            RecyclerView.this.L1(i8, i9, obj);
            RecyclerView.this.f10835D0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0181a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0181a
        public F e(int i8) {
            F g02 = RecyclerView.this.g0(i8, true);
            if (g02 == null) {
                return null;
            }
            if (!RecyclerView.this.f10896w.n(g02.f10944a)) {
                return g02;
            }
            if (RecyclerView.f10816T0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0181a
        public void f(int i8, int i9) {
            RecyclerView.this.O0(i8, i9, false);
            RecyclerView.this.f10833C0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0181a
        public void g(int i8, int i9) {
            RecyclerView.this.M0(i8, i9);
            RecyclerView.this.f10833C0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0181a
        public void h(int i8, int i9) {
            RecyclerView.this.O0(i8, i9, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10833C0 = true;
            recyclerView.f10903z0.f10922d += i9;
        }

        void i(a.b bVar) {
            int i8 = bVar.f11096a;
            if (i8 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f10836E.V0(recyclerView, bVar.f11097b, bVar.f11099d);
                return;
            }
            if (i8 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f10836E.Y0(recyclerView2, bVar.f11097b, bVar.f11099d);
            } else if (i8 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f10836E.a1(recyclerView3, bVar.f11097b, bVar.f11099d, bVar.f11098c);
            } else {
                if (i8 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f10836E.X0(recyclerView4, bVar.f11097b, bVar.f11099d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10968a;

        static {
            int[] iArr = new int[h.a.values().length];
            f10968a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10968a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        private final i f10969a = new i();

        /* renamed from: b, reason: collision with root package name */
        private boolean f10970b = false;

        /* renamed from: c, reason: collision with root package name */
        private a f10971c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void A(F f8, int i8) {
            boolean z7 = f8.f10962s == null;
            if (z7) {
                f8.f10946c = i8;
                if (I()) {
                    f8.f10948e = F(i8);
                }
                f8.Z(1, 519);
                v0.u.a("RV OnBindView");
            }
            f8.f10962s = this;
            if (RecyclerView.f10815S0) {
                if (f8.f10944a.getParent() == null && X.Q(f8.f10944a) != f8.R()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + f8.R() + ", attached to window: " + X.Q(f8.f10944a) + ", holder: " + f8);
                }
                if (f8.f10944a.getParent() == null && X.Q(f8.f10944a)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + f8);
                }
            }
            T(f8, i8, f8.I());
            if (z7) {
                f8.v();
                ViewGroup.LayoutParams layoutParams = f8.f10944a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f11013c = true;
                }
                v0.u.b();
            }
        }

        boolean B() {
            int i8 = g.f10968a[this.f10971c.ordinal()];
            if (i8 != 1) {
                return i8 != 2 || E() > 0;
            }
            return false;
        }

        public final F C(ViewGroup viewGroup, int i8) {
            try {
                v0.u.a("RV CreateView");
                F U7 = U(viewGroup, i8);
                if (U7.f10944a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                U7.f10949f = i8;
                return U7;
            } finally {
                v0.u.b();
            }
        }

        public int D(h hVar, F f8, int i8) {
            if (hVar == this) {
                return i8;
            }
            return -1;
        }

        public abstract int E();

        public long F(int i8) {
            return -1L;
        }

        public int G(int i8) {
            return 0;
        }

        public final boolean H() {
            return this.f10969a.a();
        }

        public final boolean I() {
            return this.f10970b;
        }

        public final void J() {
            this.f10969a.b();
        }

        public final void K(int i8) {
            this.f10969a.d(i8, 1);
        }

        public final void L(int i8, Object obj) {
            this.f10969a.e(i8, 1, obj);
        }

        public final void M(int i8, int i9) {
            this.f10969a.c(i8, i9);
        }

        public final void N(int i8, int i9) {
            this.f10969a.d(i8, i9);
        }

        public final void O(int i8, int i9, Object obj) {
            this.f10969a.e(i8, i9, obj);
        }

        public final void P(int i8, int i9) {
            this.f10969a.f(i8, i9);
        }

        public final void Q(int i8, int i9) {
            this.f10969a.g(i8, i9);
        }

        public void R(RecyclerView recyclerView) {
        }

        public abstract void S(F f8, int i8);

        public void T(F f8, int i8, List list) {
            S(f8, i8);
        }

        public abstract F U(ViewGroup viewGroup, int i8);

        public void V(RecyclerView recyclerView) {
        }

        public boolean W(F f8) {
            return false;
        }

        public void X(F f8) {
        }

        public void Y(F f8) {
        }

        public void Z(F f8) {
        }

        public void a0(j jVar) {
            this.f10969a.registerObserver(jVar);
        }

        public void b0(boolean z7) {
            if (H()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f10970b = z7;
        }

        public void c0(j jVar) {
            this.f10969a.unregisterObserver(jVar);
        }
    }

    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i8, i9, 1);
            }
        }

        public void d(int i8, int i9) {
            e(i8, i9, null);
        }

        public void e(int i8, int i9, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i8, i9, obj);
            }
        }

        public void f(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i8, i9);
            }
        }

        public void g(int i8, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i8, i9);
            }
        }
    }

    public static abstract class j {
        public abstract void a();

        public abstract void b(int i8, int i9, Object obj);

        public abstract void c(int i8, int i9);

        public abstract void d(int i8, int i9, int i10);

        public abstract void e(int i8, int i9);
    }

    public interface k {
    }

    public static class l {
        protected abstract EdgeEffect a(RecyclerView recyclerView, int i8);
    }

    public static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        private a f10976a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList f10977b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private long f10978c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f10979d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f10980e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f10981f = 250;

        interface a {
            void a(F f8);
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f10982a;

            /* renamed from: b, reason: collision with root package name */
            public int f10983b;

            /* renamed from: c, reason: collision with root package name */
            public int f10984c;

            /* renamed from: d, reason: collision with root package name */
            public int f10985d;

            public b a(F f8) {
                return b(f8, 0);
            }

            public b b(F f8, int i8) {
                View view = f8.f10944a;
                this.f10982a = view.getLeft();
                this.f10983b = view.getTop();
                this.f10984c = view.getRight();
                this.f10985d = view.getBottom();
                return this;
            }
        }

        static int e(F f8) {
            int i8 = f8.f10953j;
            int i9 = i8 & 14;
            if (f8.N()) {
                return 4;
            }
            if ((i8 & 4) != 0) {
                return i9;
            }
            int H7 = f8.H();
            int B7 = f8.B();
            return (H7 == -1 || B7 == -1 || H7 == B7) ? i9 : i9 | 2048;
        }

        public abstract boolean a(F f8, b bVar, b bVar2);

        public abstract boolean b(F f8, F f9, b bVar, b bVar2);

        public abstract boolean c(F f8, b bVar, b bVar2);

        public abstract boolean d(F f8, b bVar, b bVar2);

        public abstract boolean f(F f8);

        public boolean g(F f8, List list) {
            return f(f8);
        }

        public final void h(F f8) {
            r(f8);
            a aVar = this.f10976a;
            if (aVar != null) {
                aVar.a(f8);
            }
        }

        public final void i() {
            if (this.f10977b.size() <= 0) {
                this.f10977b.clear();
            } else {
                androidx.appcompat.app.E.a(this.f10977b.get(0));
                throw null;
            }
        }

        public abstract void j(F f8);

        public abstract void k();

        public long l() {
            return this.f10978c;
        }

        public long m() {
            return this.f10981f;
        }

        public long n() {
            return this.f10980e;
        }

        public long o() {
            return this.f10979d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(F f8) {
        }

        public b s(B b8, F f8) {
            return q().a(f8);
        }

        public b t(B b8, F f8, int i8, List list) {
            return q().a(f8);
        }

        public abstract void u();

        void v(a aVar) {
            this.f10976a = aVar;
        }
    }

    private class n implements m.a {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public void a(F f8) {
            f8.a0(true);
            if (f8.f10951h != null && f8.f10952i == null) {
                f8.f10951h = null;
            }
            f8.f10952i = null;
            if (f8.c0() || RecyclerView.this.i1(f8.f10944a) || !f8.R()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f8.f10944a, false);
        }
    }

    public static abstract class o {
        public void d(Rect rect, int i8, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, B b8) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, B b8) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, B b8) {
            h(canvas, recyclerView);
        }
    }

    public interface r {
        void a(View view);

        void b(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i8, int i9);
    }

    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z7);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i8) {
        }

        public abstract void b(RecyclerView recyclerView, int i8, int i9);
    }

    public static class v {

        /* renamed from: a, reason: collision with root package name */
        SparseArray f11015a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        int f11016b = 0;

        /* renamed from: c, reason: collision with root package name */
        Set f11017c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList f11018a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            int f11019b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f11020c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f11021d = 0;

            a() {
            }
        }

        private a i(int i8) {
            a aVar = (a) this.f11015a.get(i8);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f11015a.put(i8, aVar2);
            return aVar2;
        }

        void a() {
            this.f11016b++;
        }

        void b(h hVar) {
            this.f11017c.add(hVar);
        }

        public void c() {
            for (int i8 = 0; i8 < this.f11015a.size(); i8++) {
                a aVar = (a) this.f11015a.valueAt(i8);
                Iterator it = aVar.f11018a.iterator();
                while (it.hasNext()) {
                    E0.a.a(((F) it.next()).f10944a);
                }
                aVar.f11018a.clear();
            }
        }

        void d() {
            this.f11016b--;
        }

        void e(h hVar, boolean z7) {
            this.f11017c.remove(hVar);
            if (this.f11017c.size() != 0 || z7) {
                return;
            }
            for (int i8 = 0; i8 < this.f11015a.size(); i8++) {
                SparseArray sparseArray = this.f11015a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i8))).f11018a;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    E0.a.a(((F) arrayList.get(i9)).f10944a);
                }
            }
        }

        void f(int i8, long j8) {
            a i9 = i(i8);
            i9.f11021d = l(i9.f11021d, j8);
        }

        void g(int i8, long j8) {
            a i9 = i(i8);
            i9.f11020c = l(i9.f11020c, j8);
        }

        public F h(int i8) {
            a aVar = (a) this.f11015a.get(i8);
            if (aVar == null || aVar.f11018a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f11018a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((F) arrayList.get(size)).L()) {
                    return (F) arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h hVar, h hVar2, boolean z7) {
            if (hVar != null) {
                d();
            }
            if (!z7 && this.f11016b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(F f8) {
            int F7 = f8.F();
            ArrayList arrayList = i(F7).f11018a;
            if (((a) this.f11015a.get(F7)).f11019b <= arrayList.size()) {
                E0.a.a(f8.f10944a);
            } else {
                if (RecyclerView.f10815S0 && arrayList.contains(f8)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f8.X();
                arrayList.add(f8);
            }
        }

        long l(long j8, long j9) {
            return j8 == 0 ? j9 : ((j8 / 4) * 3) + (j9 / 4);
        }

        boolean m(int i8, long j8, long j9) {
            long j10 = i(i8).f11021d;
            return j10 == 0 || j8 + j10 < j9;
        }

        boolean n(int i8, long j8, long j9) {
            long j10 = i(i8).f11020c;
            return j10 == 0 || j8 + j10 < j9;
        }
    }

    public final class w {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f11022a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f11023b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f11024c;

        /* renamed from: d, reason: collision with root package name */
        private final List f11025d;

        /* renamed from: e, reason: collision with root package name */
        private int f11026e;

        /* renamed from: f, reason: collision with root package name */
        int f11027f;

        /* renamed from: g, reason: collision with root package name */
        v f11028g;

        public w() {
            ArrayList arrayList = new ArrayList();
            this.f11022a = arrayList;
            this.f11023b = null;
            this.f11024c = new ArrayList();
            this.f11025d = DesugarCollections.unmodifiableList(arrayList);
            this.f11026e = 2;
            this.f11027f = 2;
        }

        private void B(h hVar) {
            C(hVar, false);
        }

        private void C(h hVar, boolean z7) {
            v vVar = this.f11028g;
            if (vVar != null) {
                vVar.e(hVar, z7);
            }
        }

        private boolean M(F f8, int i8, int i9, long j8) {
            f8.f10962s = null;
            f8.f10961r = RecyclerView.this;
            int F7 = f8.F();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z7 = false;
            if (j8 != Long.MAX_VALUE && !this.f11028g.m(F7, nanoTime, j8)) {
                return false;
            }
            if (f8.R()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f8.f10944a, recyclerView.getChildCount(), f8.f10944a.getLayoutParams());
                z7 = true;
            }
            RecyclerView.this.f10834D.A(f8, i8);
            if (z7) {
                RecyclerView.this.detachViewFromParent(f8.f10944a);
            }
            this.f11028g.f(f8.F(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f8);
            if (RecyclerView.this.f10903z0.e()) {
                f8.f10950g = i9;
            }
            return true;
        }

        private void b(F f8) {
            if (RecyclerView.this.D0()) {
                View view = f8.f10944a;
                if (X.x(view) == 0) {
                    X.w0(view, 1);
                }
                androidx.recyclerview.widget.o oVar = RecyclerView.this.f10841G0;
                if (oVar == null) {
                    return;
                }
                C7013a r8 = oVar.r();
                if (r8 instanceof o.a) {
                    ((o.a) r8).s(view);
                }
                X.n0(view, r8);
            }
        }

        private void q(ViewGroup viewGroup, boolean z7) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z7) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(F f8) {
            View view = f8.f10944a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f11028g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f10834D == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f11028g.b(RecyclerView.this.f10834D);
            }
        }

        void A() {
            for (int i8 = 0; i8 < this.f11024c.size(); i8++) {
                E0.a.a(((F) this.f11024c.get(i8)).f10944a);
            }
            B(RecyclerView.this.f10834D);
        }

        void D(View view) {
            F n02 = RecyclerView.n0(view);
            n02.f10957n = null;
            n02.f10958o = false;
            n02.w();
            H(n02);
        }

        void E() {
            for (int size = this.f11024c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f11024c.clear();
            if (RecyclerView.f10822Z0) {
                RecyclerView.this.f10901y0.b();
            }
        }

        void F(int i8) {
            if (RecyclerView.f10816T0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i8);
            }
            F f8 = (F) this.f11024c.get(i8);
            if (RecyclerView.f10816T0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f8);
            }
            a(f8, true);
            this.f11024c.remove(i8);
        }

        public void G(View view) {
            F n02 = RecyclerView.n0(view);
            if (n02.R()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (n02.Q()) {
                n02.e0();
            } else if (n02.f0()) {
                n02.w();
            }
            H(n02);
            if (RecyclerView.this.f10876h0 == null || n02.O()) {
                return;
            }
            RecyclerView.this.f10876h0.j(n02);
        }

        void H(F f8) {
            boolean z7;
            boolean z8 = true;
            if (f8.Q() || f8.f10944a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(f8.Q());
                sb.append(" isAttached:");
                sb.append(f8.f10944a.getParent() != null);
                sb.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb.toString());
            }
            if (f8.R()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f8 + RecyclerView.this.V());
            }
            if (f8.d0()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean z9 = f8.z();
            h hVar = RecyclerView.this.f10834D;
            boolean z10 = hVar != null && z9 && hVar.W(f8);
            if (RecyclerView.f10815S0 && this.f11024c.contains(f8)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + f8 + RecyclerView.this.V());
            }
            if (z10 || f8.O()) {
                if (this.f11027f <= 0 || f8.J(526)) {
                    z7 = false;
                } else {
                    int size = this.f11024c.size();
                    if (size >= this.f11027f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.f10822Z0 && size > 0 && !RecyclerView.this.f10901y0.d(f8.f10946c)) {
                        int i8 = size - 1;
                        while (i8 >= 0) {
                            if (!RecyclerView.this.f10901y0.d(((F) this.f11024c.get(i8)).f10946c)) {
                                break;
                            } else {
                                i8--;
                            }
                        }
                        size = i8 + 1;
                    }
                    this.f11024c.add(size, f8);
                    z7 = true;
                }
                if (z7) {
                    z8 = false;
                } else {
                    a(f8, true);
                }
                r1 = z7;
            } else {
                if (RecyclerView.f10816T0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.V());
                }
                z8 = false;
            }
            RecyclerView.this.f10898x.q(f8);
            if (r1 || z8 || !z9) {
                return;
            }
            E0.a.a(f8.f10944a);
            f8.f10962s = null;
            f8.f10961r = null;
        }

        void I(View view) {
            F n02 = RecyclerView.n0(view);
            if (!n02.J(12) && n02.S() && !RecyclerView.this.s(n02)) {
                if (this.f11023b == null) {
                    this.f11023b = new ArrayList();
                }
                n02.b0(this, true);
                this.f11023b.add(n02);
                return;
            }
            if (!n02.N() || n02.P() || RecyclerView.this.f10834D.I()) {
                n02.b0(this, false);
                this.f11022a.add(n02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        void J(v vVar) {
            B(RecyclerView.this.f10834D);
            v vVar2 = this.f11028g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.f11028g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f11028g.a();
            }
            u();
        }

        void K(D d8) {
        }

        public void L(int i8) {
            this.f11026e = i8;
            P();
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0226 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x020a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.F N(int r19, boolean r20, long r21) {
            /*
                Method dump skipped, instructions count: 613
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$F");
        }

        void O(F f8) {
            if (f8.f10958o) {
                this.f11023b.remove(f8);
            } else {
                this.f11022a.remove(f8);
            }
            f8.f10957n = null;
            f8.f10958o = false;
            f8.w();
        }

        void P() {
            p pVar = RecyclerView.this.f10836E;
            this.f11027f = this.f11026e + (pVar != null ? pVar.f10999m : 0);
            for (int size = this.f11024c.size() - 1; size >= 0 && this.f11024c.size() > this.f11027f; size--) {
                F(size);
            }
        }

        boolean Q(F f8) {
            if (f8.P()) {
                if (!RecyclerView.f10815S0 || RecyclerView.this.f10903z0.e()) {
                    return RecyclerView.this.f10903z0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i8 = f8.f10946c;
            if (i8 >= 0 && i8 < RecyclerView.this.f10834D.E()) {
                if (RecyclerView.this.f10903z0.e() || RecyclerView.this.f10834D.G(f8.f10946c) == f8.F()) {
                    return !RecyclerView.this.f10834D.I() || f8.E() == RecyclerView.this.f10834D.F(f8.f10946c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f8 + RecyclerView.this.V());
        }

        void R(int i8, int i9) {
            int i10;
            int i11 = i9 + i8;
            for (int size = this.f11024c.size() - 1; size >= 0; size--) {
                F f8 = (F) this.f11024c.get(size);
                if (f8 != null && (i10 = f8.f10946c) >= i8 && i10 < i11) {
                    f8.t(2);
                    F(size);
                }
            }
        }

        void a(F f8, boolean z7) {
            RecyclerView.u(f8);
            View view = f8.f10944a;
            androidx.recyclerview.widget.o oVar = RecyclerView.this.f10841G0;
            if (oVar != null) {
                C7013a r8 = oVar.r();
                X.n0(view, r8 instanceof o.a ? ((o.a) r8).r(view) : null);
            }
            if (z7) {
                g(f8);
            }
            f8.f10962s = null;
            f8.f10961r = null;
            i().k(f8);
        }

        public void c() {
            this.f11022a.clear();
            E();
        }

        void d() {
            int size = this.f11024c.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((F) this.f11024c.get(i8)).u();
            }
            int size2 = this.f11022a.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((F) this.f11022a.get(i9)).u();
            }
            ArrayList arrayList = this.f11023b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    ((F) this.f11023b.get(i10)).u();
                }
            }
        }

        void e() {
            this.f11022a.clear();
            ArrayList arrayList = this.f11023b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i8) {
            if (i8 >= 0 && i8 < RecyclerView.this.f10903z0.b()) {
                return !RecyclerView.this.f10903z0.e() ? i8 : RecyclerView.this.f10894v.m(i8);
            }
            throw new IndexOutOfBoundsException("invalid position " + i8 + ". State item count is " + RecyclerView.this.f10903z0.b() + RecyclerView.this.V());
        }

        void g(F f8) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f10838F.size() > 0) {
                androidx.appcompat.app.E.a(RecyclerView.this.f10838F.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f10834D;
            if (hVar != null) {
                hVar.Z(f8);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10903z0 != null) {
                recyclerView.f10898x.q(f8);
            }
            if (RecyclerView.f10816T0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + f8);
            }
        }

        F h(int i8) {
            int size;
            int m8;
            ArrayList arrayList = this.f11023b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    F f8 = (F) this.f11023b.get(i9);
                    if (!f8.f0() && f8.G() == i8) {
                        f8.t(32);
                        return f8;
                    }
                }
                if (RecyclerView.this.f10834D.I() && (m8 = RecyclerView.this.f10894v.m(i8)) > 0 && m8 < RecyclerView.this.f10834D.E()) {
                    long F7 = RecyclerView.this.f10834D.F(m8);
                    for (int i10 = 0; i10 < size; i10++) {
                        F f9 = (F) this.f11023b.get(i10);
                        if (!f9.f0() && f9.E() == F7) {
                            f9.t(32);
                            return f9;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f11028g == null) {
                this.f11028g = new v();
                u();
            }
            return this.f11028g;
        }

        int j() {
            return this.f11022a.size();
        }

        public List k() {
            return this.f11025d;
        }

        F l(long j8, int i8, boolean z7) {
            for (int size = this.f11022a.size() - 1; size >= 0; size--) {
                F f8 = (F) this.f11022a.get(size);
                if (f8.E() == j8 && !f8.f0()) {
                    if (i8 == f8.F()) {
                        f8.t(32);
                        if (f8.P() && !RecyclerView.this.f10903z0.e()) {
                            f8.Z(2, 14);
                        }
                        return f8;
                    }
                    if (!z7) {
                        this.f11022a.remove(size);
                        RecyclerView.this.removeDetachedView(f8.f10944a, false);
                        D(f8.f10944a);
                    }
                }
            }
            int size2 = this.f11024c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                F f9 = (F) this.f11024c.get(size2);
                if (f9.E() == j8 && !f9.L()) {
                    if (i8 == f9.F()) {
                        if (!z7) {
                            this.f11024c.remove(size2);
                        }
                        return f9;
                    }
                    if (!z7) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        F m(int i8, boolean z7) {
            View e8;
            int size = this.f11022a.size();
            for (int i9 = 0; i9 < size; i9++) {
                F f8 = (F) this.f11022a.get(i9);
                if (!f8.f0() && f8.G() == i8 && !f8.N() && (RecyclerView.this.f10903z0.f10926h || !f8.P())) {
                    f8.t(32);
                    return f8;
                }
            }
            if (!z7 && (e8 = RecyclerView.this.f10896w.e(i8)) != null) {
                F n02 = RecyclerView.n0(e8);
                RecyclerView.this.f10896w.s(e8);
                int m8 = RecyclerView.this.f10896w.m(e8);
                if (m8 != -1) {
                    RecyclerView.this.f10896w.d(m8);
                    I(e8);
                    n02.t(8224);
                    return n02;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + n02 + RecyclerView.this.V());
            }
            int size2 = this.f11024c.size();
            for (int i10 = 0; i10 < size2; i10++) {
                F f9 = (F) this.f11024c.get(i10);
                if (!f9.N() && f9.G() == i8 && !f9.L()) {
                    if (!z7) {
                        this.f11024c.remove(i10);
                    }
                    if (RecyclerView.f10816T0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i8 + ") found match in cache: " + f9);
                    }
                    return f9;
                }
            }
            return null;
        }

        View n(int i8) {
            return ((F) this.f11022a.get(i8)).f10944a;
        }

        public View o(int i8) {
            return p(i8, false);
        }

        View p(int i8, boolean z7) {
            return N(i8, z7, Long.MAX_VALUE).f10944a;
        }

        void s() {
            int size = this.f11024c.size();
            for (int i8 = 0; i8 < size; i8++) {
                q qVar = (q) ((F) this.f11024c.get(i8)).f10944a.getLayoutParams();
                if (qVar != null) {
                    qVar.f11013c = true;
                }
            }
        }

        void t() {
            int size = this.f11024c.size();
            for (int i8 = 0; i8 < size; i8++) {
                F f8 = (F) this.f11024c.get(i8);
                if (f8 != null) {
                    f8.t(6);
                    f8.s(null);
                }
            }
            h hVar = RecyclerView.this.f10834D;
            if (hVar == null || !hVar.I()) {
                E();
            }
        }

        void v(int i8, int i9) {
            int size = this.f11024c.size();
            for (int i10 = 0; i10 < size; i10++) {
                F f8 = (F) this.f11024c.get(i10);
                if (f8 != null && f8.f10946c >= i8) {
                    if (RecyclerView.f10816T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i10 + " holder " + f8 + " now at position " + (f8.f10946c + i9));
                    }
                    f8.U(i9, false);
                }
            }
        }

        void w(int i8, int i9) {
            int i10;
            int i11;
            int i12;
            int i13;
            if (i8 < i9) {
                i10 = -1;
                i12 = i8;
                i11 = i9;
            } else {
                i10 = 1;
                i11 = i8;
                i12 = i9;
            }
            int size = this.f11024c.size();
            for (int i14 = 0; i14 < size; i14++) {
                F f8 = (F) this.f11024c.get(i14);
                if (f8 != null && (i13 = f8.f10946c) >= i12 && i13 <= i11) {
                    if (i13 == i8) {
                        f8.U(i9 - i8, false);
                    } else {
                        f8.U(i10, false);
                    }
                    if (RecyclerView.f10816T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i14 + " holder " + f8);
                    }
                }
            }
        }

        void x(int i8, int i9, boolean z7) {
            int i10 = i8 + i9;
            for (int size = this.f11024c.size() - 1; size >= 0; size--) {
                F f8 = (F) this.f11024c.get(size);
                if (f8 != null) {
                    int i11 = f8.f10946c;
                    if (i11 >= i10) {
                        if (RecyclerView.f10816T0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f8 + " now at position " + (f8.f10946c - i9));
                        }
                        f8.U(-i9, z7);
                    } else if (i11 >= i8) {
                        f8.t(8);
                        F(size);
                    }
                }
            }
        }

        void y(h hVar, h hVar2, boolean z7) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z7);
            u();
        }

        void z() {
            u();
        }
    }

    public interface x {
    }

    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10903z0.f10925g = true;
            recyclerView.a1(true);
            if (RecyclerView.this.f10894v.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i8, int i9, Object obj) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f10894v.r(i8, i9, obj)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i8, int i9) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f10894v.s(i8, i9)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i8, int i9, int i10) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f10894v.t(i8, i9, i10)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i8, int i9) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f10894v.u(i8, i9)) {
                f();
            }
        }

        void f() {
            if (RecyclerView.f10821Y0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f10848K && recyclerView.f10846J) {
                    X.f0(recyclerView, recyclerView.f10902z);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f10864S = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f10825c1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f10826d1 = new InterpolatorC0931c();
        f10827e1 = new C();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void B(Context context, String str, AttributeSet attributeSet, int i8, int i9) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String r02 = r0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(r02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = asSubclass.getConstructor(f10825c1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i8), Integer.valueOf(i9)};
                } catch (NoSuchMethodException e8) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e9) {
                        e9.initCause(e8);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + r02, e9);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + r02, e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + r02, e11);
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + r02, e12);
            } catch (InstantiationException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r02, e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r02, e14);
            }
        }
    }

    private boolean D(int i8, int i9) {
        b0(this.f10843H0);
        int[] iArr = this.f10843H0;
        return (iArr[0] == i8 && iArr[1] == i9) ? false : true;
    }

    private boolean F0(View view, View view2, int i8) {
        int i9;
        if (view2 == null || view2 == this || view2 == view || Y(view2) == null) {
            return false;
        }
        if (view == null || Y(view) == null) {
            return true;
        }
        this.f10828A.set(0, 0, view.getWidth(), view.getHeight());
        this.f10830B.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f10828A);
        offsetDescendantRectToMyCoords(view2, this.f10830B);
        char c8 = 65535;
        int i10 = this.f10836E.d0() == 1 ? -1 : 1;
        Rect rect = this.f10828A;
        int i11 = rect.left;
        Rect rect2 = this.f10830B;
        int i12 = rect2.left;
        if ((i11 < i12 || rect.right <= i12) && rect.right < rect2.right) {
            i9 = 1;
        } else {
            int i13 = rect.right;
            int i14 = rect2.right;
            i9 = ((i13 > i14 || i11 >= i14) && i11 > i12) ? -1 : 0;
        }
        int i15 = rect.top;
        int i16 = rect2.top;
        if ((i15 < i16 || rect.bottom <= i16) && rect.bottom < rect2.bottom) {
            c8 = 1;
        } else {
            int i17 = rect.bottom;
            int i18 = rect2.bottom;
            if ((i17 <= i18 && i15 < i18) || i15 <= i16) {
                c8 = 0;
            }
        }
        if (i8 == 1) {
            return c8 < 0 || (c8 == 0 && i9 * i10 < 0);
        }
        if (i8 == 2) {
            return c8 > 0 || (c8 == 0 && i9 * i10 > 0);
        }
        if (i8 == 17) {
            return i9 < 0;
        }
        if (i8 == 33) {
            return c8 < 0;
        }
        if (i8 == 66) {
            return i9 > 0;
        }
        if (i8 == 130) {
            return c8 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i8 + V());
    }

    private void G() {
        int i8 = this.f10862R;
        this.f10862R = 0;
        if (i8 == 0 || !D0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        AbstractC0365b.b(obtain, i8);
        sendAccessibilityEventUnchecked(obtain);
    }

    private boolean G1(MotionEvent motionEvent) {
        boolean z7;
        EdgeEffect edgeEffect = this.f10872d0;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z7 = false;
        } else {
            androidx.core.widget.d.d(this.f10872d0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z7 = true;
        }
        EdgeEffect edgeEffect2 = this.f10874f0;
        if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.d.d(this.f10874f0, 0.0f, motionEvent.getY() / getHeight());
            z7 = true;
        }
        EdgeEffect edgeEffect3 = this.f10873e0;
        if (edgeEffect3 != null && androidx.core.widget.d.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.d.d(this.f10873e0, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        }
        EdgeEffect edgeEffect4 = this.f10875g0;
        if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z7;
        }
        androidx.core.widget.d.d(this.f10875g0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void I() {
        this.f10903z0.a(1);
        W(this.f10903z0);
        this.f10903z0.f10928j = false;
        E1();
        this.f10898x.f();
        R0();
        Z0();
        q1();
        B b8 = this.f10903z0;
        b8.f10927i = b8.f10929k && this.f10835D0;
        this.f10835D0 = false;
        this.f10833C0 = false;
        b8.f10926h = b8.f10930l;
        b8.f10924f = this.f10834D.E();
        b0(this.f10843H0);
        if (this.f10903z0.f10929k) {
            int g8 = this.f10896w.g();
            for (int i8 = 0; i8 < g8; i8++) {
                F n02 = n0(this.f10896w.f(i8));
                if (!n02.d0() && (!n02.N() || this.f10834D.I())) {
                    this.f10898x.e(n02, this.f10876h0.t(this.f10903z0, n02, m.e(n02), n02.I()));
                    if (this.f10903z0.f10927i && n02.S() && !n02.P() && !n02.d0() && !n02.N()) {
                        this.f10898x.c(j0(n02), n02);
                    }
                }
            }
        }
        if (this.f10903z0.f10930l) {
            r1();
            B b9 = this.f10903z0;
            boolean z7 = b9.f10925g;
            b9.f10925g = false;
            this.f10836E.b1(this.f10890t, b9);
            this.f10903z0.f10925g = z7;
            for (int i9 = 0; i9 < this.f10896w.g(); i9++) {
                F n03 = n0(this.f10896w.f(i9));
                if (!n03.d0() && !this.f10898x.i(n03)) {
                    int e8 = m.e(n03);
                    boolean J7 = n03.J(8192);
                    if (!J7) {
                        e8 |= 4096;
                    }
                    m.b t7 = this.f10876h0.t(this.f10903z0, n03, e8, n03.I());
                    if (J7) {
                        c1(n03, t7);
                    } else {
                        this.f10898x.a(n03, t7);
                    }
                }
            }
            v();
        } else {
            v();
        }
        S0();
        H1(false);
        this.f10903z0.f10923e = 2;
    }

    private void J() {
        E1();
        R0();
        this.f10903z0.a(6);
        this.f10894v.j();
        this.f10903z0.f10924f = this.f10834D.E();
        this.f10903z0.f10922d = 0;
        if (this.f10892u != null && this.f10834D.B()) {
            Parcelable parcelable = this.f10892u.f11031t;
            if (parcelable != null) {
                this.f10836E.g1(parcelable);
            }
            this.f10892u = null;
        }
        B b8 = this.f10903z0;
        b8.f10926h = false;
        this.f10836E.b1(this.f10890t, b8);
        B b9 = this.f10903z0;
        b9.f10925g = false;
        b9.f10929k = b9.f10929k && this.f10876h0 != null;
        b9.f10923e = 4;
        S0();
        H1(false);
    }

    private void J0(int i8, int i9, MotionEvent motionEvent, int i10) {
        p pVar = this.f10836E;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10858P) {
            return;
        }
        int[] iArr = this.f10851L0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean p8 = pVar.p();
        boolean q8 = this.f10836E.q();
        int i11 = q8 ? (p8 ? 1 : 0) | 2 : p8 ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int f12 = i8 - f1(i8, height);
        int g12 = i9 - g1(i9, width);
        F1(i11, i10);
        if (L(p8 ? f12 : 0, q8 ? g12 : 0, this.f10851L0, this.f10847J0, i10)) {
            int[] iArr2 = this.f10851L0;
            f12 -= iArr2[0];
            g12 -= iArr2[1];
        }
        s1(p8 ? f12 : 0, q8 ? g12 : 0, motionEvent, i10);
        androidx.recyclerview.widget.h hVar = this.f10899x0;
        if (hVar != null && (f12 != 0 || g12 != 0)) {
            hVar.f(this, f12, g12);
        }
        I1(i10);
    }

    private void K() {
        this.f10903z0.a(4);
        E1();
        R0();
        B b8 = this.f10903z0;
        b8.f10923e = 1;
        if (b8.f10929k) {
            for (int g8 = this.f10896w.g() - 1; g8 >= 0; g8--) {
                F n02 = n0(this.f10896w.f(g8));
                if (!n02.d0()) {
                    long j02 = j0(n02);
                    m.b s8 = this.f10876h0.s(this.f10903z0, n02);
                    F g9 = this.f10898x.g(j02);
                    if (g9 == null || g9.d0()) {
                        this.f10898x.d(n02, s8);
                    } else {
                        boolean h8 = this.f10898x.h(g9);
                        boolean h9 = this.f10898x.h(n02);
                        if (h8 && g9 == n02) {
                            this.f10898x.d(n02, s8);
                        } else {
                            m.b n8 = this.f10898x.n(g9);
                            this.f10898x.d(n02, s8);
                            m.b m8 = this.f10898x.m(n02);
                            if (n8 == null) {
                                u0(j02, n02, g9);
                            } else {
                                p(g9, n02, n8, m8, h8, h9);
                            }
                        }
                    }
                }
            }
            this.f10898x.o(this.f10863R0);
        }
        this.f10836E.p1(this.f10890t);
        B b9 = this.f10903z0;
        b9.f10921c = b9.f10924f;
        this.f10867V = false;
        this.f10868W = false;
        b9.f10929k = false;
        b9.f10930l = false;
        this.f10836E.f10994h = false;
        ArrayList arrayList = this.f10890t.f11023b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.f10836E;
        if (pVar.f11000n) {
            pVar.f10999m = 0;
            pVar.f11000n = false;
            this.f10890t.P();
        }
        this.f10836E.c1(this.f10903z0);
        S0();
        H1(false);
        this.f10898x.f();
        int[] iArr = this.f10843H0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        d1();
        o1();
    }

    private void K1() {
        this.f10897w0.f();
        p pVar = this.f10836E;
        if (pVar != null) {
            pVar.O1();
        }
    }

    private boolean Q(MotionEvent motionEvent) {
        t tVar = this.f10844I;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return a0(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f10844I = null;
        }
        return true;
    }

    private void U0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10878j0) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f10878j0 = motionEvent.getPointerId(i8);
            int x7 = (int) (motionEvent.getX(i8) + 0.5f);
            this.f10882n0 = x7;
            this.f10880l0 = x7;
            int y7 = (int) (motionEvent.getY(i8) + 0.5f);
            this.f10884o0 = y7;
            this.f10881m0 = y7;
        }
    }

    private boolean Y0() {
        return this.f10876h0 != null && this.f10836E.P1();
    }

    private void Z0() {
        boolean z7;
        if (this.f10867V) {
            this.f10894v.y();
            if (this.f10868W) {
                this.f10836E.W0(this);
            }
        }
        if (Y0()) {
            this.f10894v.w();
        } else {
            this.f10894v.j();
        }
        boolean z8 = this.f10833C0 || this.f10835D0;
        this.f10903z0.f10929k = this.f10852M && this.f10876h0 != null && ((z7 = this.f10867V) || z8 || this.f10836E.f10994h) && (!z7 || this.f10834D.I());
        B b8 = this.f10903z0;
        b8.f10930l = b8.f10929k && z8 && !this.f10867V && Y0();
    }

    private boolean a0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f10842H.size();
        for (int i8 = 0; i8 < size; i8++) {
            t tVar = (t) this.f10842H.get(i8);
            if (tVar.b(this, motionEvent) && action != 3) {
                this.f10844I = tVar;
                return true;
            }
        }
        return false;
    }

    private void b0(int[] iArr) {
        int g8 = this.f10896w.g();
        if (g8 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i8 = Integer.MAX_VALUE;
        int i9 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < g8; i10++) {
            F n02 = n0(this.f10896w.f(i10));
            if (!n02.d0()) {
                int G7 = n02.G();
                if (G7 < i8) {
                    i8 = G7;
                }
                if (G7 > i9) {
                    i9 = G7;
                }
            }
        }
        iArr[0] = i8;
        iArr[1] = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.S()
            android.widget.EdgeEffect r1 = r6.f10872d0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.d.d(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.T()
            android.widget.EdgeEffect r1 = r6.f10874f0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.d(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.U()
            android.widget.EdgeEffect r9 = r6.f10873e0
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.d.d(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.R()
            android.widget.EdgeEffect r9 = r6.f10875g0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.d.d(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            z0.X.e0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b1(float, float, float, float):void");
    }

    static RecyclerView c0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            RecyclerView c02 = c0(viewGroup.getChildAt(i8));
            if (c02 != null) {
                return c02;
            }
        }
        return null;
    }

    private View d0() {
        F e02;
        B b8 = this.f10903z0;
        int i8 = b8.f10931m;
        if (i8 == -1) {
            i8 = 0;
        }
        int b9 = b8.b();
        for (int i9 = i8; i9 < b9; i9++) {
            F e03 = e0(i9);
            if (e03 == null) {
                break;
            }
            if (e03.f10944a.hasFocusable()) {
                return e03.f10944a;
            }
        }
        int min = Math.min(b9, i8);
        do {
            min--;
            if (min < 0 || (e02 = e0(min)) == null) {
                return null;
            }
        } while (!e02.f10944a.hasFocusable());
        return e02.f10944a;
    }

    private void d1() {
        View findViewById;
        if (!this.f10895v0 || this.f10834D == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f10824b1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f10896w.n(focusedChild)) {
                    return;
                }
            } else if (this.f10896w.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        F f02 = (this.f10903z0.f10932n == -1 || !this.f10834D.I()) ? null : f0(this.f10903z0.f10932n);
        if (f02 != null && !this.f10896w.n(f02.f10944a) && f02.f10944a.hasFocusable()) {
            view = f02.f10944a;
        } else if (this.f10896w.g() > 0) {
            view = d0();
        }
        if (view != null) {
            int i8 = this.f10903z0.f10933o;
            if (i8 != -1 && (findViewById = view.findViewById(i8)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void e1() {
        boolean z7;
        EdgeEffect edgeEffect = this.f10872d0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z7 = this.f10872d0.isFinished();
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = this.f10873e0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z7 |= this.f10873e0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10874f0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z7 |= this.f10874f0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10875g0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z7 |= this.f10875g0.isFinished();
        }
        if (z7) {
            X.e0(this);
        }
    }

    private int f1(int i8, float f8) {
        float height = f8 / getHeight();
        float width = i8 / getWidth();
        EdgeEffect edgeEffect = this.f10872d0;
        float f9 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f10874f0;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f10874f0.onRelease();
                } else {
                    float d8 = androidx.core.widget.d.d(this.f10874f0, width, height);
                    if (androidx.core.widget.d.b(this.f10874f0) == 0.0f) {
                        this.f10874f0.onRelease();
                    }
                    f9 = d8;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f10872d0.onRelease();
            } else {
                float f10 = -androidx.core.widget.d.d(this.f10872d0, -width, 1.0f - height);
                if (androidx.core.widget.d.b(this.f10872d0) == 0.0f) {
                    this.f10872d0.onRelease();
                }
                f9 = f10;
            }
            invalidate();
        }
        return Math.round(f9 * getWidth());
    }

    private int g1(int i8, float f8) {
        float width = f8 / getWidth();
        float height = i8 / getHeight();
        EdgeEffect edgeEffect = this.f10873e0;
        float f9 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f10875g0;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f10875g0.onRelease();
                } else {
                    float d8 = androidx.core.widget.d.d(this.f10875g0, height, 1.0f - width);
                    if (androidx.core.widget.d.b(this.f10875g0) == 0.0f) {
                        this.f10875g0.onRelease();
                    }
                    f9 = d8;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f10873e0.onRelease();
            } else {
                float f10 = -androidx.core.widget.d.d(this.f10873e0, -height, width);
                if (androidx.core.widget.d.b(this.f10873e0) == 0.0f) {
                    this.f10873e0.onRelease();
                }
                f9 = f10;
            }
            invalidate();
        }
        return Math.round(f9 * getHeight());
    }

    private C7000D getScrollingChildHelper() {
        if (this.f10845I0 == null) {
            this.f10845I0 = new C7000D(this);
        }
        return this.f10845I0;
    }

    private void i(F f8) {
        View view = f8.f10944a;
        boolean z7 = view.getParent() == this;
        this.f10890t.O(m0(view));
        if (f8.R()) {
            this.f10896w.c(view, -1, view.getLayoutParams(), true);
        } else if (z7) {
            this.f10896w.k(view);
        } else {
            this.f10896w.b(view, true);
        }
    }

    static F n0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f11011a;
    }

    private void n1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f10828A.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f11013c) {
                Rect rect = qVar.f11012b;
                Rect rect2 = this.f10828A;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f10828A);
            offsetRectIntoDescendantCoords(view, this.f10828A);
        }
        this.f10836E.w1(this, view, this.f10828A, !this.f10852M, view2 == null);
    }

    private void o1() {
        B b8 = this.f10903z0;
        b8.f10932n = -1L;
        b8.f10931m = -1;
        b8.f10933o = -1;
    }

    private void p(F f8, F f9, m.b bVar, m.b bVar2, boolean z7, boolean z8) {
        f8.a0(false);
        if (z7) {
            i(f8);
        }
        if (f8 != f9) {
            if (z8) {
                i(f9);
            }
            f8.f10951h = f9;
            i(f8);
            this.f10890t.O(f8);
            f9.a0(false);
            f9.f10952i = f8;
        }
        if (this.f10876h0.b(f8, f9, bVar, bVar2)) {
            X0();
        }
    }

    static void p0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f11012b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private void p1() {
        VelocityTracker velocityTracker = this.f10879k0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        I1(0);
        e1();
    }

    private int q0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private void q1() {
        View focusedChild = (this.f10895v0 && hasFocus() && this.f10834D != null) ? getFocusedChild() : null;
        F Z7 = focusedChild != null ? Z(focusedChild) : null;
        if (Z7 == null) {
            o1();
            return;
        }
        this.f10903z0.f10932n = this.f10834D.I() ? Z7.E() : -1L;
        this.f10903z0.f10931m = this.f10867V ? -1 : Z7.P() ? Z7.f10947d : Z7.B();
        this.f10903z0.f10933o = q0(Z7.f10944a);
    }

    private String r0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public static void setDebugAssertionsEnabled(boolean z7) {
        f10815S0 = z7;
    }

    public static void setVerboseLoggingEnabled(boolean z7) {
        f10816T0 = z7;
    }

    private void t() {
        p1();
        setScrollState(0);
    }

    private float t0(int i8) {
        double log = Math.log((Math.abs(i8) * 0.35f) / (this.f10883o * 0.015f));
        float f8 = f10818V0;
        return (float) (this.f10883o * 0.015f * Math.exp((f8 / (f8 - 1.0d)) * log));
    }

    static void u(F f8) {
        WeakReference weakReference = f8.f10945b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == f8.f10944a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            f8.f10945b = null;
        }
    }

    private void u0(long j8, F f8, F f9) {
        int g8 = this.f10896w.g();
        for (int i8 = 0; i8 < g8; i8++) {
            F n02 = n0(this.f10896w.f(i8));
            if (n02 != f8 && j0(n02) == j8) {
                h hVar = this.f10834D;
                if (hVar == null || !hVar.I()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + n02 + " \n View Holder 2:" + f8 + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + n02 + " \n View Holder 2:" + f8 + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f9 + " cannot be found but it is necessary for " + f8 + V());
    }

    private void v1(h hVar, boolean z7, boolean z8) {
        h hVar2 = this.f10834D;
        if (hVar2 != null) {
            hVar2.c0(this.f10888s);
            this.f10834D.V(this);
        }
        if (!z7 || z8) {
            h1();
        }
        this.f10894v.y();
        h hVar3 = this.f10834D;
        this.f10834D = hVar;
        if (hVar != null) {
            hVar.a0(this.f10888s);
            hVar.R(this);
        }
        p pVar = this.f10836E;
        if (pVar != null) {
            pVar.I0(hVar3, this.f10834D);
        }
        this.f10890t.y(hVar3, this.f10834D, z7);
        this.f10903z0.f10925g = true;
    }

    private boolean w0() {
        int g8 = this.f10896w.g();
        for (int i8 = 0; i8 < g8; i8++) {
            F n02 = n0(this.f10896w.f(i8));
            if (n02 != null && !n02.d0() && n02.S()) {
                return true;
            }
        }
        return false;
    }

    private boolean x1(EdgeEffect edgeEffect, int i8, int i9) {
        if (i8 > 0) {
            return true;
        }
        return t0(-i8) < androidx.core.widget.d.b(edgeEffect) * ((float) i9);
    }

    private int y(int i8, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i9) {
        if (i8 > 0 && edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != 0.0f) {
            int round = Math.round(((-i9) / 4.0f) * androidx.core.widget.d.d(edgeEffect, ((-i8) * 4.0f) / i9, 0.5f));
            if (round != i8) {
                edgeEffect.finish();
            }
            return i8 - round;
        }
        if (i8 >= 0 || edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
            return i8;
        }
        float f8 = i9;
        int round2 = Math.round((f8 / 4.0f) * androidx.core.widget.d.d(edgeEffect2, (i8 * 4.0f) / f8, 0.5f));
        if (round2 != i8) {
            edgeEffect2.finish();
        }
        return i8 - round2;
    }

    private void y0() {
        if (X.y(this) == 0) {
            X.y0(this, 8);
        }
    }

    private void z0() {
        this.f10896w = new d(new C0933e());
    }

    void A() {
        if (!this.f10852M || this.f10867V) {
            v0.u.a("RV FullInvalidate");
            H();
            v0.u.b();
            return;
        }
        if (this.f10894v.p()) {
            if (!this.f10894v.o(4) || this.f10894v.o(11)) {
                if (this.f10894v.p()) {
                    v0.u.a("RV FullInvalidate");
                    H();
                    v0.u.b();
                    return;
                }
                return;
            }
            v0.u.a("RV PartialInvalidate");
            E1();
            R0();
            this.f10894v.w();
            if (!this.f10856O) {
                if (w0()) {
                    H();
                } else {
                    this.f10894v.i();
                }
            }
            H1(true);
            S0();
            v0.u.b();
        }
    }

    void A0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC0953b.f11970a), resources.getDimensionPixelSize(AbstractC0953b.f11972c), resources.getDimensionPixelOffset(AbstractC0953b.f11971b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    public void A1(int i8, int i9, Interpolator interpolator) {
        B1(i8, i9, interpolator, Integer.MIN_VALUE);
    }

    void B0() {
        this.f10875g0 = null;
        this.f10873e0 = null;
        this.f10874f0 = null;
        this.f10872d0 = null;
    }

    public void B1(int i8, int i9, Interpolator interpolator, int i10) {
        C1(i8, i9, interpolator, i10, false);
    }

    void C(int i8, int i9) {
        setMeasuredDimension(p.s(i8, getPaddingLeft() + getPaddingRight(), X.B(this)), p.s(i9, getPaddingTop() + getPaddingBottom(), X.A(this)));
    }

    public void C0() {
        if (this.f10840G.size() == 0) {
            return;
        }
        p pVar = this.f10836E;
        if (pVar != null) {
            pVar.l("Cannot invalidate item decorations during a scroll or layout");
        }
        H0();
        requestLayout();
    }

    void C1(int i8, int i9, Interpolator interpolator, int i10, boolean z7) {
        p pVar = this.f10836E;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10858P) {
            return;
        }
        if (!pVar.p()) {
            i8 = 0;
        }
        if (!this.f10836E.q()) {
            i9 = 0;
        }
        if (i8 == 0 && i9 == 0) {
            return;
        }
        if (i10 != Integer.MIN_VALUE && i10 <= 0) {
            scrollBy(i8, i9);
            return;
        }
        if (z7) {
            int i11 = i8 != 0 ? 1 : 0;
            if (i9 != 0) {
                i11 |= 2;
            }
            F1(i11, 1);
        }
        this.f10897w0.e(i8, i9, i10, interpolator);
    }

    boolean D0() {
        AccessibilityManager accessibilityManager = this.f10865T;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void D1(int i8) {
        if (this.f10858P) {
            return;
        }
        p pVar = this.f10836E;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.M1(this, this.f10903z0, i8);
        }
    }

    void E(View view) {
        F n02 = n0(view);
        P0(view);
        h hVar = this.f10834D;
        if (hVar != null && n02 != null) {
            hVar.X(n02);
        }
        List list = this.f10866U;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f10866U.get(size)).b(view);
            }
        }
    }

    public boolean E0() {
        return this.f10869a0 > 0;
    }

    void E1() {
        int i8 = this.f10854N + 1;
        this.f10854N = i8;
        if (i8 != 1 || this.f10858P) {
            return;
        }
        this.f10856O = false;
    }

    void F(View view) {
        F n02 = n0(view);
        Q0(view);
        h hVar = this.f10834D;
        if (hVar != null && n02 != null) {
            hVar.Y(n02);
        }
        List list = this.f10866U;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f10866U.get(size)).a(view);
            }
        }
    }

    public boolean F1(int i8, int i9) {
        return getScrollingChildHelper().p(i8, i9);
    }

    void G0(int i8) {
        if (this.f10836E == null) {
            return;
        }
        setScrollState(2);
        this.f10836E.B1(i8);
        awakenScrollBars();
    }

    void H() {
        if (this.f10834D == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f10836E == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f10903z0.f10928j = false;
        boolean z7 = this.f10857O0 && !(this.f10859P0 == getWidth() && this.f10861Q0 == getHeight());
        this.f10859P0 = 0;
        this.f10861Q0 = 0;
        this.f10857O0 = false;
        if (this.f10903z0.f10923e == 1) {
            I();
            this.f10836E.D1(this);
            J();
        } else if (this.f10894v.q() || z7 || this.f10836E.s0() != getWidth() || this.f10836E.b0() != getHeight()) {
            this.f10836E.D1(this);
            J();
        } else {
            this.f10836E.D1(this);
        }
        K();
    }

    void H0() {
        int j8 = this.f10896w.j();
        for (int i8 = 0; i8 < j8; i8++) {
            ((q) this.f10896w.i(i8).getLayoutParams()).f11013c = true;
        }
        this.f10890t.s();
    }

    void H1(boolean z7) {
        if (this.f10854N < 1) {
            if (f10815S0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.f10854N = 1;
        }
        if (!z7 && !this.f10858P) {
            this.f10856O = false;
        }
        if (this.f10854N == 1) {
            if (z7 && this.f10856O && !this.f10858P && this.f10836E != null && this.f10834D != null) {
                H();
            }
            if (!this.f10858P) {
                this.f10856O = false;
            }
        }
        this.f10854N--;
    }

    void I0() {
        int j8 = this.f10896w.j();
        for (int i8 = 0; i8 < j8; i8++) {
            F n02 = n0(this.f10896w.i(i8));
            if (n02 != null && !n02.d0()) {
                n02.t(6);
            }
        }
        H0();
        this.f10890t.t();
    }

    public void I1(int i8) {
        getScrollingChildHelper().r(i8);
    }

    public void J1() {
        setScrollState(0);
        K1();
    }

    public void K0(int i8) {
        int g8 = this.f10896w.g();
        for (int i9 = 0; i9 < g8; i9++) {
            this.f10896w.f(i9).offsetLeftAndRight(i8);
        }
    }

    public boolean L(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        return getScrollingChildHelper().d(i8, i9, iArr, iArr2, i10);
    }

    public void L0(int i8) {
        int g8 = this.f10896w.g();
        for (int i9 = 0; i9 < g8; i9++) {
            this.f10896w.f(i9).offsetTopAndBottom(i8);
        }
    }

    void L1(int i8, int i9, Object obj) {
        int i10;
        int j8 = this.f10896w.j();
        int i11 = i8 + i9;
        for (int i12 = 0; i12 < j8; i12++) {
            View i13 = this.f10896w.i(i12);
            F n02 = n0(i13);
            if (n02 != null && !n02.d0() && (i10 = n02.f10946c) >= i8 && i10 < i11) {
                n02.t(2);
                n02.s(obj);
                ((q) i13.getLayoutParams()).f11013c = true;
            }
        }
        this.f10890t.R(i8, i9);
    }

    public final void M(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        getScrollingChildHelper().e(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    void M0(int i8, int i9) {
        int j8 = this.f10896w.j();
        for (int i10 = 0; i10 < j8; i10++) {
            F n02 = n0(this.f10896w.i(i10));
            if (n02 != null && !n02.d0() && n02.f10946c >= i8) {
                if (f10816T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i10 + " holder " + n02 + " now at position " + (n02.f10946c + i9));
                }
                n02.U(i9, false);
                this.f10903z0.f10925g = true;
            }
        }
        this.f10890t.v(i8, i9);
        requestLayout();
    }

    void N(int i8) {
        p pVar = this.f10836E;
        if (pVar != null) {
            pVar.i1(i8);
        }
        V0(i8);
        u uVar = this.f10829A0;
        if (uVar != null) {
            uVar.a(this, i8);
        }
        List list = this.f10831B0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f10831B0.get(size)).a(this, i8);
            }
        }
    }

    void N0(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int j8 = this.f10896w.j();
        if (i8 < i9) {
            i12 = -1;
            i11 = i8;
            i10 = i9;
        } else {
            i10 = i8;
            i11 = i9;
            i12 = 1;
        }
        for (int i14 = 0; i14 < j8; i14++) {
            F n02 = n0(this.f10896w.i(i14));
            if (n02 != null && (i13 = n02.f10946c) >= i11 && i13 <= i10) {
                if (f10816T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i14 + " holder " + n02);
                }
                if (n02.f10946c == i8) {
                    n02.U(i9 - i8, false);
                } else {
                    n02.U(i12, false);
                }
                this.f10903z0.f10925g = true;
            }
        }
        this.f10890t.w(i8, i9);
        requestLayout();
    }

    void O(int i8, int i9) {
        this.f10870b0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i8, scrollY - i9);
        W0(i8, i9);
        u uVar = this.f10829A0;
        if (uVar != null) {
            uVar.b(this, i8, i9);
        }
        List list = this.f10831B0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f10831B0.get(size)).b(this, i8, i9);
            }
        }
        this.f10870b0--;
    }

    void O0(int i8, int i9, boolean z7) {
        int i10 = i8 + i9;
        int j8 = this.f10896w.j();
        for (int i11 = 0; i11 < j8; i11++) {
            F n02 = n0(this.f10896w.i(i11));
            if (n02 != null && !n02.d0()) {
                int i12 = n02.f10946c;
                if (i12 >= i10) {
                    if (f10816T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i11 + " holder " + n02 + " now at position " + (n02.f10946c - i9));
                    }
                    n02.U(-i9, z7);
                    this.f10903z0.f10925g = true;
                } else if (i12 >= i8) {
                    if (f10816T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i11 + " holder " + n02 + " now REMOVED");
                    }
                    n02.A(i8 - 1, -i9, z7);
                    this.f10903z0.f10925g = true;
                }
            }
        }
        this.f10890t.x(i8, i9, z7);
        requestLayout();
    }

    void P() {
        int i8;
        for (int size = this.f10853M0.size() - 1; size >= 0; size--) {
            F f8 = (F) this.f10853M0.get(size);
            if (f8.f10944a.getParent() == this && !f8.d0() && (i8 = f8.f10960q) != -1) {
                X.w0(f8.f10944a, i8);
                f8.f10960q = -1;
            }
        }
        this.f10853M0.clear();
    }

    public void P0(View view) {
    }

    public void Q0(View view) {
    }

    void R() {
        if (this.f10875g0 != null) {
            return;
        }
        EdgeEffect a8 = this.f10871c0.a(this, 3);
        this.f10875g0 = a8;
        if (this.f10900y) {
            a8.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a8.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void R0() {
        this.f10869a0++;
    }

    void S() {
        if (this.f10872d0 != null) {
            return;
        }
        EdgeEffect a8 = this.f10871c0.a(this, 0);
        this.f10872d0 = a8;
        if (this.f10900y) {
            a8.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a8.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void S0() {
        T0(true);
    }

    void T() {
        if (this.f10874f0 != null) {
            return;
        }
        EdgeEffect a8 = this.f10871c0.a(this, 2);
        this.f10874f0 = a8;
        if (this.f10900y) {
            a8.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a8.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void T0(boolean z7) {
        int i8 = this.f10869a0 - 1;
        this.f10869a0 = i8;
        if (i8 < 1) {
            if (f10815S0 && i8 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.f10869a0 = 0;
            if (z7) {
                G();
                P();
            }
        }
    }

    void U() {
        if (this.f10873e0 != null) {
            return;
        }
        EdgeEffect a8 = this.f10871c0.a(this, 1);
        this.f10873e0 = a8;
        if (this.f10900y) {
            a8.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a8.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String V() {
        return " " + super.toString() + ", adapter:" + this.f10834D + ", layout:" + this.f10836E + ", context:" + getContext();
    }

    public void V0(int i8) {
    }

    final void W(B b8) {
        if (getScrollState() != 2) {
            b8.f10934p = 0;
            b8.f10935q = 0;
        } else {
            OverScroller overScroller = this.f10897w0.f10938t;
            b8.f10934p = overScroller.getFinalX() - overScroller.getCurrX();
            b8.f10935q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void W0(int i8, int i9) {
    }

    public View X(float f8, float f9) {
        for (int g8 = this.f10896w.g() - 1; g8 >= 0; g8--) {
            View f10 = this.f10896w.f(g8);
            float translationX = f10.getTranslationX();
            float translationY = f10.getTranslationY();
            if (f8 >= f10.getLeft() + translationX && f8 <= f10.getRight() + translationX && f9 >= f10.getTop() + translationY && f9 <= f10.getBottom() + translationY) {
                return f10;
            }
        }
        return null;
    }

    void X0() {
        if (this.f10839F0 || !this.f10846J) {
            return;
        }
        X.f0(this, this.f10855N0);
        this.f10839F0 = true;
    }

    public View Y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public F Z(View view) {
        View Y7 = Y(view);
        if (Y7 == null) {
            return null;
        }
        return m0(Y7);
    }

    void a(int i8, int i9) {
        if (i8 < 0) {
            S();
            if (this.f10872d0.isFinished()) {
                this.f10872d0.onAbsorb(-i8);
            }
        } else if (i8 > 0) {
            T();
            if (this.f10874f0.isFinished()) {
                this.f10874f0.onAbsorb(i8);
            }
        }
        if (i9 < 0) {
            U();
            if (this.f10873e0.isFinished()) {
                this.f10873e0.onAbsorb(-i9);
            }
        } else if (i9 > 0) {
            R();
            if (this.f10875g0.isFinished()) {
                this.f10875g0.onAbsorb(i9);
            }
        }
        if (i8 == 0 && i9 == 0) {
            return;
        }
        X.e0(this);
    }

    void a1(boolean z7) {
        this.f10868W = z7 | this.f10868W;
        this.f10867V = true;
        I0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i8, int i9) {
        p pVar = this.f10836E;
        if (pVar == null || !pVar.J0(this, arrayList, i8, i9)) {
            super.addFocusables(arrayList, i8, i9);
        }
    }

    void c1(F f8, m.b bVar) {
        f8.Z(0, 8192);
        if (this.f10903z0.f10927i && f8.S() && !f8.P() && !f8.d0()) {
            this.f10898x.c(j0(f8), f8);
        }
        this.f10898x.e(f8, bVar);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f10836E.r((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.f10836E;
        if (pVar != null && pVar.p()) {
            return this.f10836E.v(this.f10903z0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.f10836E;
        if (pVar != null && pVar.p()) {
            return this.f10836E.w(this.f10903z0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.f10836E;
        if (pVar != null && pVar.p()) {
            return this.f10836E.x(this.f10903z0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.f10836E;
        if (pVar != null && pVar.q()) {
            return this.f10836E.y(this.f10903z0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.f10836E;
        if (pVar != null && pVar.q()) {
            return this.f10836E.z(this.f10903z0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.f10836E;
        if (pVar != null && pVar.q()) {
            return this.f10836E.A(this.f10903z0);
        }
        return 0;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f8, float f9, boolean z7) {
        return getScrollingChildHelper().a(f8, f9, z7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f8, float f9) {
        return getScrollingChildHelper().b(f8, f9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i8, i9, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return getScrollingChildHelper().f(i8, i9, i10, i11, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z7;
        super.draw(canvas);
        int size = this.f10840G.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            ((o) this.f10840G.get(i8)).i(canvas, this, this.f10903z0);
        }
        EdgeEffect edgeEffect = this.f10872d0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z7 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f10900y ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f10872d0;
            z7 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f10873e0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f10900y) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f10873e0;
            z7 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f10874f0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f10900y ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f10874f0;
            z7 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f10875g0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f10900y) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f10875g0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z8 = true;
            }
            z7 |= z8;
            canvas.restoreToCount(save4);
        }
        if ((z7 || this.f10876h0 == null || this.f10840G.size() <= 0 || !this.f10876h0.p()) ? z7 : true) {
            X.e0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j8) {
        return super.drawChild(canvas, view, j8);
    }

    public F e0(int i8) {
        F f8 = null;
        if (this.f10867V) {
            return null;
        }
        int j8 = this.f10896w.j();
        for (int i9 = 0; i9 < j8; i9++) {
            F n02 = n0(this.f10896w.i(i9));
            if (n02 != null && !n02.P() && i0(n02) == i8) {
                if (!this.f10896w.n(n02.f10944a)) {
                    return n02;
                }
                f8 = n02;
            }
        }
        return f8;
    }

    public F f0(long j8) {
        h hVar = this.f10834D;
        F f8 = null;
        if (hVar != null && hVar.I()) {
            int j9 = this.f10896w.j();
            for (int i8 = 0; i8 < j9; i8++) {
                F n02 = n0(this.f10896w.i(i8));
                if (n02 != null && !n02.P() && n02.E() == j8) {
                    if (!this.f10896w.n(n02.f10944a)) {
                        return n02;
                    }
                    f8 = n02;
                }
            }
        }
        return f8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i8) {
        View view2;
        boolean z7;
        View U02 = this.f10836E.U0(view, i8);
        if (U02 != null) {
            return U02;
        }
        boolean z8 = (this.f10834D == null || this.f10836E == null || E0() || this.f10858P) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z8 && (i8 == 2 || i8 == 1)) {
            if (this.f10836E.q()) {
                int i9 = i8 == 2 ? 130 : 33;
                z7 = focusFinder.findNextFocus(this, view, i9) == null;
                if (f10823a1) {
                    i8 = i9;
                }
            } else {
                z7 = false;
            }
            if (!z7 && this.f10836E.p()) {
                int i10 = (this.f10836E.d0() == 1) ^ (i8 == 2) ? 66 : 17;
                boolean z9 = focusFinder.findNextFocus(this, view, i10) == null;
                if (f10823a1) {
                    i8 = i10;
                }
                z7 = z9;
            }
            if (z7) {
                A();
                if (Y(view) == null) {
                    return null;
                }
                E1();
                this.f10836E.N0(view, i8, this.f10890t, this.f10903z0);
                H1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i8);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i8);
            if (findNextFocus == null && z8) {
                A();
                if (Y(view) == null) {
                    return null;
                }
                E1();
                view2 = this.f10836E.N0(view, i8, this.f10890t, this.f10903z0);
                H1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return F0(view, view2, i8) ? view2 : super.focusSearch(view, i8);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i8);
        }
        n1(view2, null);
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.F g0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.d r0 = r5.f10896w
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.d r3 = r5.f10896w
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$F r3 = n0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.P()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f10946c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.G()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.d r1 = r5.f10896w
            android.view.View r4 = r3.f10944a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(int, boolean):androidx.recyclerview.widget.RecyclerView$F");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f10836E;
        if (pVar != null) {
            return pVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f10836E;
        if (pVar != null) {
            return pVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f10834D;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f10836E;
        return pVar != null ? pVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i8, int i9) {
        return super.getChildDrawingOrder(i8, i9);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f10900y;
    }

    public androidx.recyclerview.widget.o getCompatAccessibilityDelegate() {
        return this.f10841G0;
    }

    public l getEdgeEffectFactory() {
        return this.f10871c0;
    }

    public m getItemAnimator() {
        return this.f10876h0;
    }

    public int getItemDecorationCount() {
        return this.f10840G.size();
    }

    public p getLayoutManager() {
        return this.f10836E;
    }

    public int getMaxFlingVelocity() {
        return this.f10889s0;
    }

    public int getMinFlingVelocity() {
        return this.f10887r0;
    }

    long getNanoTime() {
        if (f10822Z0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.f10886q0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f10895v0;
    }

    public v getRecycledViewPool() {
        return this.f10890t.i();
    }

    public int getScrollState() {
        return this.f10877i0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean h0(int i8, int i9) {
        int i10;
        int i11;
        p pVar = this.f10836E;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f10858P) {
            return false;
        }
        int p8 = pVar.p();
        boolean q8 = this.f10836E.q();
        if (p8 == 0 || Math.abs(i8) < this.f10887r0) {
            i8 = 0;
        }
        if (!q8 || Math.abs(i9) < this.f10887r0) {
            i9 = 0;
        }
        if (i8 == 0 && i9 == 0) {
            return false;
        }
        if (i8 == 0) {
            i10 = 0;
        } else {
            EdgeEffect edgeEffect = this.f10872d0;
            if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f10874f0;
                if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                    if (x1(this.f10874f0, i8, getWidth())) {
                        this.f10874f0.onAbsorb(i8);
                        i8 = 0;
                    }
                    i10 = i8;
                    i8 = 0;
                }
                i10 = 0;
            } else {
                int i12 = -i8;
                if (x1(this.f10872d0, i12, getWidth())) {
                    this.f10872d0.onAbsorb(i12);
                    i8 = 0;
                }
                i10 = i8;
                i8 = 0;
            }
        }
        if (i9 == 0) {
            i11 = i9;
            i9 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.f10873e0;
            if (edgeEffect3 == null || androidx.core.widget.d.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f10875g0;
                if (edgeEffect4 != null && androidx.core.widget.d.b(edgeEffect4) != 0.0f) {
                    if (x1(this.f10875g0, i9, getHeight())) {
                        this.f10875g0.onAbsorb(i9);
                        i9 = 0;
                    }
                    i11 = 0;
                }
                i11 = i9;
                i9 = 0;
            } else {
                int i13 = -i9;
                if (x1(this.f10873e0, i13, getHeight())) {
                    this.f10873e0.onAbsorb(i13);
                    i9 = 0;
                }
                i11 = 0;
            }
        }
        if (i10 != 0 || i9 != 0) {
            int i14 = this.f10889s0;
            i10 = Math.max(-i14, Math.min(i10, i14));
            int i15 = this.f10889s0;
            i9 = Math.max(-i15, Math.min(i9, i15));
            this.f10897w0.b(i10, i9);
        }
        if (i8 == 0 && i11 == 0) {
            return (i10 == 0 && i9 == 0) ? false : true;
        }
        float f8 = i8;
        float f9 = i11;
        if (!dispatchNestedPreFling(f8, f9)) {
            boolean z7 = p8 != 0 || q8;
            dispatchNestedFling(f8, f9, z7);
            s sVar = this.f10886q0;
            if (sVar != null && sVar.a(i8, i11)) {
                return true;
            }
            if (z7) {
                if (q8) {
                    p8 = (p8 == true ? 1 : 0) | 2;
                }
                F1(p8, 1);
                int i16 = this.f10889s0;
                int max = Math.max(-i16, Math.min(i8, i16));
                int i17 = this.f10889s0;
                this.f10897w0.b(max, Math.max(-i17, Math.min(i11, i17)));
                return true;
            }
        }
        return false;
    }

    void h1() {
        m mVar = this.f10876h0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f10836E;
        if (pVar != null) {
            pVar.o1(this.f10890t);
            this.f10836E.p1(this.f10890t);
        }
        this.f10890t.c();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    int i0(F f8) {
        if (f8.J(524) || !f8.M()) {
            return -1;
        }
        return this.f10894v.e(f8.f10946c);
    }

    boolean i1(View view) {
        E1();
        boolean r8 = this.f10896w.r(view);
        if (r8) {
            F n02 = n0(view);
            this.f10890t.O(n02);
            this.f10890t.H(n02);
            if (f10816T0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        H1(!r8);
        return r8;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f10846J;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f10858P;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(o oVar) {
        k(oVar, -1);
    }

    long j0(F f8) {
        return this.f10834D.I() ? f8.E() : f8.f10946c;
    }

    public void j1(o oVar) {
        p pVar = this.f10836E;
        if (pVar != null) {
            pVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f10840G.remove(oVar);
        if (this.f10840G.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        H0();
        requestLayout();
    }

    public void k(o oVar, int i8) {
        p pVar = this.f10836E;
        if (pVar != null) {
            pVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f10840G.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i8 < 0) {
            this.f10840G.add(oVar);
        } else {
            this.f10840G.add(i8, oVar);
        }
        H0();
        requestLayout();
    }

    public int k0(View view) {
        F n02 = n0(view);
        if (n02 != null) {
            return n02.B();
        }
        return -1;
    }

    public void k1(t tVar) {
        this.f10842H.remove(tVar);
        if (this.f10844I == tVar) {
            this.f10844I = null;
        }
    }

    public void l(r rVar) {
        if (this.f10866U == null) {
            this.f10866U = new ArrayList();
        }
        this.f10866U.add(rVar);
    }

    public int l0(View view) {
        F n02 = n0(view);
        if (n02 != null) {
            return n02.G();
        }
        return -1;
    }

    public void l1(u uVar) {
        List list = this.f10831B0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void m(t tVar) {
        this.f10842H.add(tVar);
    }

    public F m0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return n0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    void m1() {
        F f8;
        int g8 = this.f10896w.g();
        for (int i8 = 0; i8 < g8; i8++) {
            View f9 = this.f10896w.f(i8);
            F m02 = m0(f9);
            if (m02 != null && (f8 = m02.f10952i) != null) {
                View view = f8.f10944a;
                int left = f9.getLeft();
                int top = f9.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void n(u uVar) {
        if (this.f10831B0 == null) {
            this.f10831B0 = new ArrayList();
        }
        this.f10831B0.add(uVar);
    }

    void o(F f8, m.b bVar, m.b bVar2) {
        f8.a0(false);
        if (this.f10876h0.a(f8, bVar, bVar2)) {
            X0();
        }
    }

    public void o0(View view, Rect rect) {
        p0(view, rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f10869a0 = r0
            r1 = 1
            r5.f10846J = r1
            boolean r2 = r5.f10852M
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f10852M = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.f10890t
            r1.z()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.f10836E
            if (r1 == 0) goto L23
            r1.E(r5)
        L23:
            r5.f10839F0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f10822Z0
            if (r0 == 0) goto L66
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.h.f11225v
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.h r1 = (androidx.recyclerview.widget.h) r1
            r5.f10899x0 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.h r1 = new androidx.recyclerview.widget.h
            r1.<init>()
            r5.f10899x0 = r1
            android.view.Display r1 = z0.X.t(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.h r2 = r5.f10899x0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f11229t = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.h r0 = r5.f10899x0
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.h hVar;
        super.onDetachedFromWindow();
        m mVar = this.f10876h0;
        if (mVar != null) {
            mVar.k();
        }
        J1();
        this.f10846J = false;
        p pVar = this.f10836E;
        if (pVar != null) {
            pVar.F(this, this.f10890t);
        }
        this.f10853M0.clear();
        removeCallbacks(this.f10855N0);
        this.f10898x.j();
        this.f10890t.A();
        E0.a.b(this);
        if (!f10822Z0 || (hVar = this.f10899x0) == null) {
            return;
        }
        hVar.j(this);
        this.f10899x0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f10840G.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((o) this.f10840G.get(i8)).g(canvas, this, this.f10903z0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f10836E
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f10858P
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f10836E
            boolean r0 = r0.q()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f10836E
            boolean r3 = r3.p()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f10836E
            boolean r3 = r3.q()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f10836E
            boolean r3 = r3.p()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f10891t0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f10893u0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.J0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        if (this.f10858P) {
            return false;
        }
        this.f10844I = null;
        if (a0(motionEvent)) {
            t();
            return true;
        }
        p pVar = this.f10836E;
        if (pVar == null) {
            return false;
        }
        boolean p8 = pVar.p();
        boolean q8 = this.f10836E.q();
        if (this.f10879k0 == null) {
            this.f10879k0 = VelocityTracker.obtain();
        }
        this.f10879k0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f10860Q) {
                this.f10860Q = false;
            }
            this.f10878j0 = motionEvent.getPointerId(0);
            int x7 = (int) (motionEvent.getX() + 0.5f);
            this.f10882n0 = x7;
            this.f10880l0 = x7;
            int y7 = (int) (motionEvent.getY() + 0.5f);
            this.f10884o0 = y7;
            this.f10881m0 = y7;
            if (G1(motionEvent) || this.f10877i0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                I1(1);
            }
            int[] iArr = this.f10849K0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i8 = p8;
            if (q8) {
                i8 = (p8 ? 1 : 0) | 2;
            }
            F1(i8, 0);
        } else if (actionMasked == 1) {
            this.f10879k0.clear();
            I1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f10878j0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f10878j0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x8 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y8 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f10877i0 != 1) {
                int i9 = x8 - this.f10880l0;
                int i10 = y8 - this.f10881m0;
                if (p8 == 0 || Math.abs(i9) <= this.f10885p0) {
                    z7 = false;
                } else {
                    this.f10882n0 = x8;
                    z7 = true;
                }
                if (q8 && Math.abs(i10) > this.f10885p0) {
                    this.f10884o0 = y8;
                    z7 = true;
                }
                if (z7) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.f10878j0 = motionEvent.getPointerId(actionIndex);
            int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f10882n0 = x9;
            this.f10880l0 = x9;
            int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f10884o0 = y9;
            this.f10881m0 = y9;
        } else if (actionMasked == 6) {
            U0(motionEvent);
        }
        return this.f10877i0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        v0.u.a("RV OnLayout");
        H();
        v0.u.b();
        this.f10852M = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        p pVar = this.f10836E;
        if (pVar == null) {
            C(i8, i9);
            return;
        }
        boolean z7 = false;
        if (pVar.w0()) {
            int mode = View.MeasureSpec.getMode(i8);
            int mode2 = View.MeasureSpec.getMode(i9);
            this.f10836E.d1(this.f10890t, this.f10903z0, i8, i9);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z7 = true;
            }
            this.f10857O0 = z7;
            if (z7 || this.f10834D == null) {
                return;
            }
            if (this.f10903z0.f10923e == 1) {
                I();
            }
            this.f10836E.E1(i8, i9);
            this.f10903z0.f10928j = true;
            J();
            this.f10836E.H1(i8, i9);
            if (this.f10836E.K1()) {
                this.f10836E.E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f10903z0.f10928j = true;
                J();
                this.f10836E.H1(i8, i9);
            }
            this.f10859P0 = getMeasuredWidth();
            this.f10861Q0 = getMeasuredHeight();
            return;
        }
        if (this.f10848K) {
            this.f10836E.d1(this.f10890t, this.f10903z0, i8, i9);
            return;
        }
        if (this.f10864S) {
            E1();
            R0();
            Z0();
            S0();
            B b8 = this.f10903z0;
            if (b8.f10930l) {
                b8.f10926h = true;
            } else {
                this.f10894v.j();
                this.f10903z0.f10926h = false;
            }
            this.f10864S = false;
            H1(false);
        } else if (this.f10903z0.f10930l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f10834D;
        if (hVar != null) {
            this.f10903z0.f10924f = hVar.E();
        } else {
            this.f10903z0.f10924f = 0;
        }
        E1();
        this.f10836E.d1(this.f10890t, this.f10903z0, i8, i9);
        H1(false);
        this.f10903z0.f10926h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (E0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i8, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f10892u = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f10892u;
        if (zVar2 != null) {
            zVar.b(zVar2);
        } else {
            p pVar = this.f10836E;
            if (pVar != null) {
                zVar.f11031t = pVar.h1();
            } else {
                zVar.f11031t = null;
            }
        }
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 == i10 && i9 == i11) {
            return;
        }
        B0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r0
  0x00df: PHI (r0v37 int) = (r0v26 int), (r0v41 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void q(F f8, m.b bVar, m.b bVar2) {
        i(f8);
        f8.a0(false);
        if (this.f10876h0.c(f8, bVar, bVar2)) {
            X0();
        }
    }

    void r(String str) {
        if (E0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.f10870b0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + V()));
        }
    }

    void r1() {
        int j8 = this.f10896w.j();
        for (int i8 = 0; i8 < j8; i8++) {
            F n02 = n0(this.f10896w.i(i8));
            if (f10815S0 && n02.f10946c == -1 && !n02.P()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!n02.d0()) {
                n02.Y();
            }
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z7) {
        F n02 = n0(view);
        if (n02 != null) {
            if (n02.R()) {
                n02.x();
            } else if (!n02.d0()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + n02 + V());
            }
        } else if (f10815S0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f10836E.f1(this, this.f10903z0, view, view2) && view2 != null) {
            n1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        return this.f10836E.v1(this, view, rect, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        int size = this.f10842H.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((t) this.f10842H.get(i8)).c(z7);
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f10854N != 0 || this.f10858P) {
            this.f10856O = true;
        } else {
            super.requestLayout();
        }
    }

    boolean s(F f8) {
        m mVar = this.f10876h0;
        return mVar == null || mVar.g(f8, f8.I());
    }

    Rect s0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f11013c) {
            return qVar.f11012b;
        }
        if (this.f10903z0.e() && (qVar.b() || qVar.d())) {
            return qVar.f11012b;
        }
        Rect rect = qVar.f11012b;
        rect.set(0, 0, 0, 0);
        int size = this.f10840G.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f10828A.set(0, 0, 0, 0);
            ((o) this.f10840G.get(i8)).e(this.f10828A, view, this, this.f10903z0);
            int i9 = rect.left;
            Rect rect2 = this.f10828A;
            rect.left = i9 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f11013c = false;
        return rect;
    }

    boolean s1(int i8, int i9, MotionEvent motionEvent, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        A();
        if (this.f10834D != null) {
            int[] iArr = this.f10851L0;
            iArr[0] = 0;
            iArr[1] = 0;
            t1(i8, i9, iArr);
            int[] iArr2 = this.f10851L0;
            int i15 = iArr2[0];
            int i16 = iArr2[1];
            i11 = i16;
            i12 = i15;
            i13 = i8 - i15;
            i14 = i9 - i16;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (!this.f10840G.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f10851L0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i12, i11, i13, i14, this.f10847J0, i10, iArr3);
        int[] iArr4 = this.f10851L0;
        int i17 = iArr4[0];
        int i18 = i13 - i17;
        int i19 = iArr4[1];
        int i20 = i14 - i19;
        boolean z7 = (i17 == 0 && i19 == 0) ? false : true;
        int i21 = this.f10882n0;
        int[] iArr5 = this.f10847J0;
        int i22 = iArr5[0];
        this.f10882n0 = i21 - i22;
        int i23 = this.f10884o0;
        int i24 = iArr5[1];
        this.f10884o0 = i23 - i24;
        int[] iArr6 = this.f10849K0;
        iArr6[0] = iArr6[0] + i22;
        iArr6[1] = iArr6[1] + i24;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC6999C.a(motionEvent, 8194)) {
                b1(motionEvent.getX(), i18, motionEvent.getY(), i20);
            }
            w(i8, i9);
        }
        if (i12 != 0 || i11 != 0) {
            O(i12, i11);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z7 && i12 == 0 && i11 == 0) ? false : true;
    }

    @Override // android.view.View
    public void scrollBy(int i8, int i9) {
        p pVar = this.f10836E;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10858P) {
            return;
        }
        boolean p8 = pVar.p();
        boolean q8 = this.f10836E.q();
        if (p8 || q8) {
            if (!p8) {
                i8 = 0;
            }
            if (!q8) {
                i9 = 0;
            }
            s1(i8, i9, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i8, int i9) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (y1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.o oVar) {
        this.f10841G0 = oVar;
        X.n0(this, oVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        v1(hVar, false, true);
        a1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z7) {
        if (z7 != this.f10900y) {
            B0();
        }
        this.f10900y = z7;
        super.setClipToPadding(z7);
        if (this.f10852M) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        y0.i.g(lVar);
        this.f10871c0 = lVar;
        B0();
    }

    public void setHasFixedSize(boolean z7) {
        this.f10848K = z7;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f10876h0;
        if (mVar2 != null) {
            mVar2.k();
            this.f10876h0.v(null);
        }
        this.f10876h0 = mVar;
        if (mVar != null) {
            mVar.v(this.f10837E0);
        }
    }

    public void setItemViewCacheSize(int i8) {
        this.f10890t.L(i8);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z7) {
        suppressLayout(z7);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f10836E) {
            return;
        }
        J1();
        if (this.f10836E != null) {
            m mVar = this.f10876h0;
            if (mVar != null) {
                mVar.k();
            }
            this.f10836E.o1(this.f10890t);
            this.f10836E.p1(this.f10890t);
            this.f10890t.c();
            if (this.f10846J) {
                this.f10836E.F(this, this.f10890t);
            }
            this.f10836E.I1(null);
            this.f10836E = null;
        } else {
            this.f10890t.c();
        }
        this.f10896w.o();
        this.f10836E = pVar;
        if (pVar != null) {
            if (pVar.f10988b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f10988b.V());
            }
            pVar.I1(this);
            if (this.f10846J) {
                this.f10836E.E(this);
            }
        }
        this.f10890t.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        getScrollingChildHelper().m(z7);
    }

    public void setOnFlingListener(s sVar) {
        this.f10886q0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f10829A0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z7) {
        this.f10895v0 = z7;
    }

    public void setRecycledViewPool(v vVar) {
        this.f10890t.J(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    void setScrollState(int i8) {
        if (i8 == this.f10877i0) {
            return;
        }
        if (f10816T0) {
            Log.d("RecyclerView", "setting scroll state to " + i8 + " from " + this.f10877i0, new Exception());
        }
        this.f10877i0 = i8;
        if (i8 != 2) {
            K1();
        }
        N(i8);
    }

    public void setScrollingTouchSlop(int i8) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i8 != 0) {
            if (i8 == 1) {
                this.f10885p0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i8 + "; using default value");
        }
        this.f10885p0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d8) {
        this.f10890t.K(d8);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i8) {
        return getScrollingChildHelper().o(i8);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z7) {
        if (z7 != this.f10858P) {
            r("Do not suppressLayout in layout or scroll");
            if (z7) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f10858P = true;
                this.f10860Q = true;
                J1();
                return;
            }
            this.f10858P = false;
            if (this.f10856O && this.f10836E != null && this.f10834D != null) {
                requestLayout();
            }
            this.f10856O = false;
        }
    }

    void t1(int i8, int i9, int[] iArr) {
        E1();
        R0();
        v0.u.a("RV Scroll");
        W(this.f10903z0);
        int A12 = i8 != 0 ? this.f10836E.A1(i8, this.f10890t, this.f10903z0) : 0;
        int C12 = i9 != 0 ? this.f10836E.C1(i9, this.f10890t, this.f10903z0) : 0;
        v0.u.b();
        m1();
        S0();
        H1(false);
        if (iArr != null) {
            iArr[0] = A12;
            iArr[1] = C12;
        }
    }

    public void u1(int i8) {
        if (this.f10858P) {
            return;
        }
        J1();
        p pVar = this.f10836E;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.B1(i8);
            awakenScrollBars();
        }
    }

    void v() {
        int j8 = this.f10896w.j();
        for (int i8 = 0; i8 < j8; i8++) {
            F n02 = n0(this.f10896w.i(i8));
            if (!n02.d0()) {
                n02.u();
            }
        }
        this.f10890t.d();
    }

    public boolean v0() {
        return !this.f10852M || this.f10867V || this.f10894v.p();
    }

    void w(int i8, int i9) {
        boolean z7;
        EdgeEffect edgeEffect = this.f10872d0;
        if (edgeEffect == null || edgeEffect.isFinished() || i8 <= 0) {
            z7 = false;
        } else {
            this.f10872d0.onRelease();
            z7 = this.f10872d0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f10874f0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i8 < 0) {
            this.f10874f0.onRelease();
            z7 |= this.f10874f0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10873e0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i9 > 0) {
            this.f10873e0.onRelease();
            z7 |= this.f10873e0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10875g0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i9 < 0) {
            this.f10875g0.onRelease();
            z7 |= this.f10875g0.isFinished();
        }
        if (z7) {
            X.e0(this);
        }
    }

    boolean w1(F f8, int i8) {
        if (!E0()) {
            X.w0(f8.f10944a, i8);
            return true;
        }
        f8.f10960q = i8;
        this.f10853M0.add(f8);
        return false;
    }

    int x(int i8) {
        return y(i8, this.f10872d0, this.f10874f0, getWidth());
    }

    void x0() {
        this.f10894v = new a(new C0934f());
    }

    boolean y1(AccessibilityEvent accessibilityEvent) {
        if (!E0()) {
            return false;
        }
        int a8 = accessibilityEvent != null ? AbstractC0365b.a(accessibilityEvent) : 0;
        this.f10862R |= a8 != 0 ? a8 : 0;
        return true;
    }

    int z(int i8) {
        return y(i8, this.f10873e0, this.f10875g0, getHeight());
    }

    public void z1(int i8, int i9) {
        A1(i8, i9, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0952a.f11969a);
    }

    public static class z extends F0.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        Parcelable f11031t;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i8) {
                return new z[i8];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11031t = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.f11031t = zVar.f11031t;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeParcelable(this.f11031t, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f10888s = new y();
        this.f10890t = new w();
        this.f10898x = new androidx.recyclerview.widget.t();
        this.f10902z = new RunnableC0929a();
        this.f10828A = new Rect();
        this.f10830B = new Rect();
        this.f10832C = new RectF();
        this.f10838F = new ArrayList();
        this.f10840G = new ArrayList();
        this.f10842H = new ArrayList();
        this.f10854N = 0;
        this.f10867V = false;
        this.f10868W = false;
        this.f10869a0 = 0;
        this.f10870b0 = 0;
        this.f10871c0 = f10827e1;
        this.f10876h0 = new e();
        this.f10877i0 = 0;
        this.f10878j0 = -1;
        this.f10891t0 = Float.MIN_VALUE;
        this.f10893u0 = Float.MIN_VALUE;
        this.f10895v0 = true;
        this.f10897w0 = new E();
        this.f10901y0 = f10822Z0 ? new h.b() : null;
        this.f10903z0 = new B();
        this.f10833C0 = false;
        this.f10835D0 = false;
        this.f10837E0 = new n();
        this.f10839F0 = false;
        this.f10843H0 = new int[2];
        this.f10847J0 = new int[2];
        this.f10849K0 = new int[2];
        this.f10851L0 = new int[2];
        this.f10853M0 = new ArrayList();
        this.f10855N0 = new RunnableC0930b();
        this.f10859P0 = 0;
        this.f10861Q0 = 0;
        this.f10863R0 = new C0932d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10885p0 = viewConfiguration.getScaledTouchSlop();
        this.f10891t0 = AbstractC7014a0.f(viewConfiguration, context);
        this.f10893u0 = AbstractC7014a0.j(viewConfiguration, context);
        this.f10887r0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10889s0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10883o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f10876h0.v(this.f10837E0);
        x0();
        z0();
        y0();
        if (X.x(this) == 0) {
            X.w0(this, 1);
        }
        this.f10865T = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.o(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0954c.f11973a, i8, 0);
        X.l0(this, context, AbstractC0954c.f11973a, attributeSet, obtainStyledAttributes, i8, 0);
        String string = obtainStyledAttributes.getString(AbstractC0954c.f11982j);
        if (obtainStyledAttributes.getInt(AbstractC0954c.f11976d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f10900y = obtainStyledAttributes.getBoolean(AbstractC0954c.f11975c, true);
        boolean z7 = obtainStyledAttributes.getBoolean(AbstractC0954c.f11977e, false);
        this.f10850L = z7;
        if (z7) {
            A0((StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC0954c.f11980h), obtainStyledAttributes.getDrawable(AbstractC0954c.f11981i), (StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC0954c.f11978f), obtainStyledAttributes.getDrawable(AbstractC0954c.f11979g));
        }
        obtainStyledAttributes.recycle();
        B(context, string, attributeSet, i8, 0);
        int[] iArr = f10817U0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i8, 0);
        X.l0(this, context, iArr, attributeSet, obtainStyledAttributes2, i8, 0);
        boolean z8 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z8);
        E0.a.d(this, true);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        F f11011a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f11012b;

        /* renamed from: c, reason: collision with root package name */
        boolean f11013c;

        /* renamed from: d, reason: collision with root package name */
        boolean f11014d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11012b = new Rect();
            this.f11013c = true;
            this.f11014d = false;
        }

        public int a() {
            return this.f11011a.G();
        }

        public boolean b() {
            return this.f11011a.S();
        }

        public boolean c() {
            return this.f11011a.P();
        }

        public boolean d() {
            return this.f11011a.N();
        }

        public q(int i8, int i9) {
            super(i8, i9);
            this.f11012b = new Rect();
            this.f11013c = true;
            this.f11014d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11012b = new Rect();
            this.f11013c = true;
            this.f11014d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11012b = new Rect();
            this.f11013c = true;
            this.f11014d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f11012b = new Rect();
            this.f11013c = true;
            this.f11014d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f10836E;
        if (pVar != null) {
            return pVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    public static abstract class p {

        /* renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.d f10987a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f10988b;

        /* renamed from: c, reason: collision with root package name */
        private final s.b f10989c;

        /* renamed from: d, reason: collision with root package name */
        private final s.b f10990d;

        /* renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.s f10991e;

        /* renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.s f10992f;

        /* renamed from: g, reason: collision with root package name */
        A f10993g;

        /* renamed from: h, reason: collision with root package name */
        boolean f10994h;

        /* renamed from: i, reason: collision with root package name */
        boolean f10995i;

        /* renamed from: j, reason: collision with root package name */
        boolean f10996j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f10997k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f10998l;

        /* renamed from: m, reason: collision with root package name */
        int f10999m;

        /* renamed from: n, reason: collision with root package name */
        boolean f11000n;

        /* renamed from: o, reason: collision with root package name */
        private int f11001o;

        /* renamed from: p, reason: collision with root package name */
        private int f11002p;

        /* renamed from: q, reason: collision with root package name */
        private int f11003q;

        /* renamed from: r, reason: collision with root package name */
        private int f11004r;

        class a implements s.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.s.b
            public View a(int i8) {
                return p.this.N(i8);
            }

            @Override // androidx.recyclerview.widget.s.b
            public int b(View view) {
                return p.this.V(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.s.b
            public int c() {
                return p.this.i0();
            }

            @Override // androidx.recyclerview.widget.s.b
            public int d() {
                return p.this.s0() - p.this.j0();
            }

            @Override // androidx.recyclerview.widget.s.b
            public int e(View view) {
                return p.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements s.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.s.b
            public View a(int i8) {
                return p.this.N(i8);
            }

            @Override // androidx.recyclerview.widget.s.b
            public int b(View view) {
                return p.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.s.b
            public int c() {
                return p.this.k0();
            }

            @Override // androidx.recyclerview.widget.s.b
            public int d() {
                return p.this.b0() - p.this.h0();
            }

            @Override // androidx.recyclerview.widget.s.b
            public int e(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i8, int i9);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f11007a;

            /* renamed from: b, reason: collision with root package name */
            public int f11008b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f11009c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f11010d;
        }

        public p() {
            a aVar = new a();
            this.f10989c = aVar;
            b bVar = new b();
            this.f10990d = bVar;
            this.f10991e = new androidx.recyclerview.widget.s(aVar);
            this.f10992f = new androidx.recyclerview.widget.s(bVar);
            this.f10994h = false;
            this.f10995i = false;
            this.f10996j = false;
            this.f10997k = true;
            this.f10998l = true;
        }

        private static boolean A0(int i8, int i9, int i10) {
            int mode = View.MeasureSpec.getMode(i9);
            int size = View.MeasureSpec.getSize(i9);
            if (i10 > 0 && i8 != i10) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i8;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i8;
            }
            return true;
        }

        private void D(int i8, View view) {
            this.f10987a.d(i8);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.P(int, int, int, int, boolean):int");
        }

        private int[] Q(View view, Rect rect) {
            int i02 = i0();
            int k02 = k0();
            int s02 = s0() - j0();
            int b02 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i8 = left - i02;
            int min = Math.min(0, i8);
            int i9 = top - k02;
            int min2 = Math.min(0, i9);
            int i10 = width - s02;
            int max = Math.max(0, i10);
            int max2 = Math.max(0, height - b02);
            if (d0() != 1) {
                if (min == 0) {
                    min = Math.min(i8, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i10);
            }
            if (min2 == 0) {
                min2 = Math.min(i9, max2);
            }
            return new int[]{max, min2};
        }

        private void k(View view, int i8, boolean z7) {
            F n02 = RecyclerView.n0(view);
            if (z7 || n02.P()) {
                this.f10988b.f10898x.b(n02);
            } else {
                this.f10988b.f10898x.p(n02);
            }
            q qVar = (q) view.getLayoutParams();
            if (n02.f0() || n02.Q()) {
                if (n02.Q()) {
                    n02.e0();
                } else {
                    n02.w();
                }
                this.f10987a.c(view, i8, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f10988b) {
                int m8 = this.f10987a.m(view);
                if (i8 == -1) {
                    i8 = this.f10987a.g();
                }
                if (m8 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f10988b.indexOfChild(view) + this.f10988b.V());
                }
                if (m8 != i8) {
                    this.f10988b.f10836E.F0(m8, i8);
                }
            } else {
                this.f10987a.a(view, i8, false);
                qVar.f11013c = true;
                A a8 = this.f10993g;
                if (a8 != null && a8.h()) {
                    this.f10993g.k(view);
                }
            }
            if (qVar.f11014d) {
                if (RecyclerView.f10816T0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + qVar.f11011a);
                }
                n02.f10944a.invalidate();
                qVar.f11014d = false;
            }
        }

        public static d m0(Context context, AttributeSet attributeSet, int i8, int i9) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0954c.f11973a, i8, i9);
            dVar.f11007a = obtainStyledAttributes.getInt(AbstractC0954c.f11974b, 1);
            dVar.f11008b = obtainStyledAttributes.getInt(AbstractC0954c.f11984l, 1);
            dVar.f11009c = obtainStyledAttributes.getBoolean(AbstractC0954c.f11983k, false);
            dVar.f11010d = obtainStyledAttributes.getBoolean(AbstractC0954c.f11985m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i8, int i9, int i10) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i9, i10) : size : Math.min(size, Math.max(i9, i10));
        }

        private boolean x0(RecyclerView recyclerView, int i8, int i9) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int i02 = i0();
            int k02 = k0();
            int s02 = s0() - j0();
            int b02 = b0() - h0();
            Rect rect = this.f10988b.f10828A;
            U(focusedChild, rect);
            return rect.left - i8 < s02 && rect.right - i8 > i02 && rect.top - i9 < b02 && rect.bottom - i9 > k02;
        }

        private void z1(w wVar, int i8, View view) {
            F n02 = RecyclerView.n0(view);
            if (n02.d0()) {
                if (RecyclerView.f10816T0) {
                    Log.d("RecyclerView", "ignoring view " + n02);
                    return;
                }
                return;
            }
            if (n02.N() && !n02.P() && !this.f10988b.f10834D.I()) {
                u1(i8);
                wVar.H(n02);
            } else {
                C(i8);
                wVar.I(view);
                this.f10988b.f10898x.k(n02);
            }
        }

        public abstract int A(B b8);

        public abstract int A1(int i8, w wVar, B b8);

        public void B(w wVar) {
            for (int O7 = O() - 1; O7 >= 0; O7--) {
                z1(wVar, O7, N(O7));
            }
        }

        public boolean B0() {
            A a8 = this.f10993g;
            return a8 != null && a8.h();
        }

        public abstract void B1(int i8);

        public void C(int i8) {
            D(i8, N(i8));
        }

        public boolean C0(View view, boolean z7, boolean z8) {
            boolean z9 = this.f10991e.b(view, 24579) && this.f10992f.b(view, 24579);
            return z7 ? z9 : !z9;
        }

        public abstract int C1(int i8, w wVar, B b8);

        public void D0(View view, int i8, int i9, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f11012b;
            view.layout(i8 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i9 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i10 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i11 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void D1(RecyclerView recyclerView) {
            E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void E(RecyclerView recyclerView) {
            this.f10995i = true;
            K0(recyclerView);
        }

        public void E0(View view, int i8, int i9) {
            q qVar = (q) view.getLayoutParams();
            Rect s02 = this.f10988b.s0(view);
            int i10 = i8 + s02.left + s02.right;
            int i11 = i9 + s02.top + s02.bottom;
            int P7 = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i10, ((ViewGroup.MarginLayoutParams) qVar).width, p());
            int P8 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) qVar).height, q());
            if (J1(view, P7, P8, qVar)) {
                view.measure(P7, P8);
            }
        }

        void E1(int i8, int i9) {
            this.f11003q = View.MeasureSpec.getSize(i8);
            int mode = View.MeasureSpec.getMode(i8);
            this.f11001o = mode;
            if (mode == 0 && !RecyclerView.f10820X0) {
                this.f11003q = 0;
            }
            this.f11004r = View.MeasureSpec.getSize(i9);
            int mode2 = View.MeasureSpec.getMode(i9);
            this.f11002p = mode2;
            if (mode2 != 0 || RecyclerView.f10820X0) {
                return;
            }
            this.f11004r = 0;
        }

        void F(RecyclerView recyclerView, w wVar) {
            this.f10995i = false;
            M0(recyclerView, wVar);
        }

        public void F0(int i8, int i9) {
            View N7 = N(i8);
            if (N7 != null) {
                C(i8);
                m(N7, i9);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i8 + this.f10988b.toString());
            }
        }

        public void F1(int i8, int i9) {
            this.f10988b.setMeasuredDimension(i8, i9);
        }

        public View G(View view) {
            View Y7;
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView == null || (Y7 = recyclerView.Y(view)) == null || this.f10987a.n(Y7)) {
                return null;
            }
            return Y7;
        }

        public void G0(int i8) {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView != null) {
                recyclerView.K0(i8);
            }
        }

        public void G1(Rect rect, int i8, int i9) {
            F1(s(i8, rect.width() + i0() + j0(), g0()), s(i9, rect.height() + k0() + h0(), f0()));
        }

        public View H(int i8) {
            int O7 = O();
            for (int i9 = 0; i9 < O7; i9++) {
                View N7 = N(i9);
                F n02 = RecyclerView.n0(N7);
                if (n02 != null && n02.G() == i8 && !n02.d0() && (this.f10988b.f10903z0.e() || !n02.P())) {
                    return N7;
                }
            }
            return null;
        }

        public void H0(int i8) {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView != null) {
                recyclerView.L0(i8);
            }
        }

        void H1(int i8, int i9) {
            int O7 = O();
            if (O7 == 0) {
                this.f10988b.C(i8, i9);
                return;
            }
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < O7; i14++) {
                View N7 = N(i14);
                Rect rect = this.f10988b.f10828A;
                U(N7, rect);
                int i15 = rect.left;
                if (i15 < i13) {
                    i13 = i15;
                }
                int i16 = rect.right;
                if (i16 > i10) {
                    i10 = i16;
                }
                int i17 = rect.top;
                if (i17 < i11) {
                    i11 = i17;
                }
                int i18 = rect.bottom;
                if (i18 > i12) {
                    i12 = i18;
                }
            }
            this.f10988b.f10828A.set(i13, i11, i10, i12);
            G1(this.f10988b.f10828A, i8, i9);
        }

        public abstract q I();

        public void I0(h hVar, h hVar2) {
        }

        void I1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f10988b = null;
                this.f10987a = null;
                this.f11003q = 0;
                this.f11004r = 0;
            } else {
                this.f10988b = recyclerView;
                this.f10987a = recyclerView.f10896w;
                this.f11003q = recyclerView.getWidth();
                this.f11004r = recyclerView.getHeight();
            }
            this.f11001o = 1073741824;
            this.f11002p = 1073741824;
        }

        public q J(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean J0(RecyclerView recyclerView, ArrayList arrayList, int i8, int i9) {
            return false;
        }

        boolean J1(View view, int i8, int i9, q qVar) {
            return (!view.isLayoutRequested() && this.f10997k && A0(view.getWidth(), i8, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getHeight(), i9, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public q K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void K0(RecyclerView recyclerView) {
        }

        boolean K1() {
            return false;
        }

        public int L() {
            return -1;
        }

        public void L0(RecyclerView recyclerView) {
        }

        boolean L1(View view, int i8, int i9, q qVar) {
            return (this.f10997k && A0(view.getMeasuredWidth(), i8, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getMeasuredHeight(), i9, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((q) view.getLayoutParams()).f11012b.bottom;
        }

        public void M0(RecyclerView recyclerView, w wVar) {
            L0(recyclerView);
        }

        public abstract void M1(RecyclerView recyclerView, B b8, int i8);

        public View N(int i8) {
            androidx.recyclerview.widget.d dVar = this.f10987a;
            if (dVar != null) {
                return dVar.f(i8);
            }
            return null;
        }

        public abstract View N0(View view, int i8, w wVar, B b8);

        public void N1(A a8) {
            A a9 = this.f10993g;
            if (a9 != null && a8 != a9 && a9.h()) {
                this.f10993g.r();
            }
            this.f10993g = a8;
            a8.q(this.f10988b, this);
        }

        public int O() {
            androidx.recyclerview.widget.d dVar = this.f10987a;
            if (dVar != null) {
                return dVar.g();
            }
            return 0;
        }

        public void O0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f10988b;
            P0(recyclerView.f10890t, recyclerView.f10903z0, accessibilityEvent);
        }

        void O1() {
            A a8 = this.f10993g;
            if (a8 != null) {
                a8.r();
            }
        }

        public void P0(w wVar, B b8, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z7 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f10988b.canScrollVertically(-1) && !this.f10988b.canScrollHorizontally(-1) && !this.f10988b.canScrollHorizontally(1)) {
                z7 = false;
            }
            accessibilityEvent.setScrollable(z7);
            h hVar = this.f10988b.f10834D;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.E());
            }
        }

        public boolean P1() {
            return false;
        }

        void Q0(A0.z zVar) {
            RecyclerView recyclerView = this.f10988b;
            R0(recyclerView.f10890t, recyclerView.f10903z0, zVar);
        }

        public boolean R() {
            RecyclerView recyclerView = this.f10988b;
            return recyclerView != null && recyclerView.f10900y;
        }

        public void R0(w wVar, B b8, A0.z zVar) {
            if (this.f10988b.canScrollVertically(-1) || this.f10988b.canScrollHorizontally(-1)) {
                zVar.a(8192);
                zVar.E0(true);
            }
            if (this.f10988b.canScrollVertically(1) || this.f10988b.canScrollHorizontally(1)) {
                zVar.a(4096);
                zVar.E0(true);
            }
            zVar.m0(z.e.a(o0(wVar, b8), S(wVar, b8), z0(wVar, b8), p0(wVar, b8)));
        }

        public int S(w wVar, B b8) {
            return -1;
        }

        void S0(View view, A0.z zVar) {
            F n02 = RecyclerView.n0(view);
            if (n02 == null || n02.P() || this.f10987a.n(n02.f10944a)) {
                return;
            }
            RecyclerView recyclerView = this.f10988b;
            T0(recyclerView.f10890t, recyclerView.f10903z0, view, zVar);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void U(View view, Rect rect) {
            RecyclerView.p0(view, rect);
        }

        public View U0(View view, int i8) {
            return null;
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(RecyclerView recyclerView, int i8, int i9) {
        }

        public int W(View view) {
            Rect rect = ((q) view.getLayoutParams()).f11012b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(RecyclerView recyclerView) {
        }

        public int X(View view) {
            Rect rect = ((q) view.getLayoutParams()).f11012b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView, int i8, int i9, int i10) {
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(RecyclerView recyclerView, int i8, int i9) {
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(RecyclerView recyclerView, int i8, int i9) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f10987a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i8, int i9, Object obj) {
            Z0(recyclerView, i8, i9);
        }

        public int b0() {
            return this.f11004r;
        }

        public abstract void b1(w wVar, B b8);

        public int c0() {
            return this.f11002p;
        }

        public void c1(B b8) {
        }

        public int d0() {
            return X.z(this.f10988b);
        }

        public void d1(w wVar, B b8, int i8, int i9) {
            this.f10988b.C(i8, i9);
        }

        public int e() {
            RecyclerView recyclerView = this.f10988b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.E();
            }
            return 0;
        }

        public int e0(View view) {
            return ((q) view.getLayoutParams()).f11012b.left;
        }

        public boolean e1(RecyclerView recyclerView, View view, View view2) {
            return B0() || recyclerView.E0();
        }

        public int f0() {
            return X.A(this.f10988b);
        }

        public boolean f1(RecyclerView recyclerView, B b8, View view, View view2) {
            return e1(recyclerView, view, view2);
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return X.B(this.f10988b);
        }

        public void g1(Parcelable parcelable) {
        }

        public void h(View view, int i8) {
            k(view, i8, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable h1() {
            return null;
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void i1(int i8) {
        }

        public void j(View view, int i8) {
            k(view, i8, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void j1(A a8) {
            if (this.f10993g == a8) {
                this.f10993g = null;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean k1(int i8, Bundle bundle) {
            RecyclerView recyclerView = this.f10988b;
            return l1(recyclerView.f10890t, recyclerView.f10903z0, i8, bundle);
        }

        public void l(String str) {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int l0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean l1(w wVar, B b8, int i8, Bundle bundle) {
            int k02;
            int i02;
            int i9;
            int i10;
            if (this.f10988b == null) {
                return false;
            }
            int b02 = b0();
            int s02 = s0();
            Rect rect = new Rect();
            if (this.f10988b.getMatrix().isIdentity() && this.f10988b.getGlobalVisibleRect(rect)) {
                b02 = rect.height();
                s02 = rect.width();
            }
            if (i8 == 4096) {
                k02 = this.f10988b.canScrollVertically(1) ? (b02 - k0()) - h0() : 0;
                if (this.f10988b.canScrollHorizontally(1)) {
                    i02 = (s02 - i0()) - j0();
                    i9 = k02;
                    i10 = i02;
                }
                i9 = k02;
                i10 = 0;
            } else if (i8 != 8192) {
                i10 = 0;
                i9 = 0;
            } else {
                k02 = this.f10988b.canScrollVertically(-1) ? -((b02 - k0()) - h0()) : 0;
                if (this.f10988b.canScrollHorizontally(-1)) {
                    i02 = -((s02 - i0()) - j0());
                    i9 = k02;
                    i10 = i02;
                }
                i9 = k02;
                i10 = 0;
            }
            if (i9 == 0 && i10 == 0) {
                return false;
            }
            this.f10988b.C1(i10, i9, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void m(View view, int i8) {
            n(view, i8, (q) view.getLayoutParams());
        }

        boolean m1(View view, int i8, Bundle bundle) {
            RecyclerView recyclerView = this.f10988b;
            return n1(recyclerView.f10890t, recyclerView.f10903z0, view, i8, bundle);
        }

        public void n(View view, int i8, q qVar) {
            F n02 = RecyclerView.n0(view);
            if (n02.P()) {
                this.f10988b.f10898x.b(n02);
            } else {
                this.f10988b.f10898x.p(n02);
            }
            this.f10987a.c(view, i8, qVar, n02.P());
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).f11012b.right;
        }

        public boolean n1(w wVar, B b8, View view, int i8, Bundle bundle) {
            return false;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.s0(view));
            }
        }

        public int o0(w wVar, B b8) {
            return -1;
        }

        public void o1(w wVar) {
            for (int O7 = O() - 1; O7 >= 0; O7--) {
                if (!RecyclerView.n0(N(O7)).d0()) {
                    r1(O7, wVar);
                }
            }
        }

        public abstract boolean p();

        public int p0(w wVar, B b8) {
            return 0;
        }

        void p1(w wVar) {
            int j8 = wVar.j();
            for (int i8 = j8 - 1; i8 >= 0; i8--) {
                View n8 = wVar.n(i8);
                F n02 = RecyclerView.n0(n8);
                if (!n02.d0()) {
                    n02.a0(false);
                    if (n02.R()) {
                        this.f10988b.removeDetachedView(n8, false);
                    }
                    m mVar = this.f10988b.f10876h0;
                    if (mVar != null) {
                        mVar.j(n02);
                    }
                    n02.a0(true);
                    wVar.D(n8);
                }
            }
            wVar.e();
            if (j8 > 0) {
                this.f10988b.invalidate();
            }
        }

        public abstract boolean q();

        public int q0(View view) {
            return ((q) view.getLayoutParams()).f11012b.top;
        }

        public void q1(View view, w wVar) {
            t1(view);
            wVar.G(view);
        }

        public boolean r(q qVar) {
            return qVar != null;
        }

        public void r0(View view, boolean z7, Rect rect) {
            Matrix matrix;
            if (z7) {
                Rect rect2 = ((q) view.getLayoutParams()).f11012b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f10988b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f10988b.f10832C;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(int i8, w wVar) {
            View N7 = N(i8);
            u1(i8);
            wVar.G(N7);
        }

        public int s0() {
            return this.f11003q;
        }

        public boolean s1(Runnable runnable) {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void t(int i8, int i9, B b8, c cVar) {
        }

        public int t0() {
            return this.f11001o;
        }

        public void t1(View view) {
            this.f10987a.p(view);
        }

        public void u(int i8, c cVar) {
        }

        boolean u0() {
            int O7 = O();
            for (int i8 = 0; i8 < O7; i8++) {
                ViewGroup.LayoutParams layoutParams = N(i8).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int i8) {
            if (N(i8) != null) {
                this.f10987a.q(i8);
            }
        }

        public abstract int v(B b8);

        public boolean v0() {
            return this.f10995i;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z7) {
            return w1(recyclerView, view, rect, z7, false);
        }

        public abstract int w(B b8);

        public abstract boolean w0();

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
            int[] Q7 = Q(view, rect);
            int i8 = Q7[0];
            int i9 = Q7[1];
            if ((z8 && !x0(recyclerView, i8, i9)) || (i8 == 0 && i9 == 0)) {
                return false;
            }
            if (z7) {
                recyclerView.scrollBy(i8, i9);
            } else {
                recyclerView.z1(i8, i9);
            }
            return true;
        }

        public abstract int x(B b8);

        public void x1() {
            RecyclerView recyclerView = this.f10988b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int y(B b8);

        public final boolean y0() {
            return this.f10998l;
        }

        public void y1() {
            this.f10994h = true;
        }

        public abstract int z(B b8);

        public boolean z0(w wVar, B b8) {
            return false;
        }

        public void T0(w wVar, B b8, View view, A0.z zVar) {
        }
    }
}
