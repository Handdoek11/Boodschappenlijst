package i5;

import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import f5.C5786a;
import java.lang.ref.WeakReference;
import l5.AbstractC6177c;
import l5.AbstractC6179e;
import z0.X;

/* renamed from: i5.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5873m {

    /* renamed from: f0, reason: collision with root package name */
    public static final Interpolator f36596f0 = new InterpolatorC5863c();

    /* renamed from: g0, reason: collision with root package name */
    public static final Interpolator f36597g0 = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    private C5867g f36598A;

    /* renamed from: B, reason: collision with root package name */
    RecyclerView.F f36599B;

    /* renamed from: C, reason: collision with root package name */
    private C5870j f36600C;

    /* renamed from: D, reason: collision with root package name */
    private C5868h f36601D;

    /* renamed from: E, reason: collision with root package name */
    private C5874n f36602E;

    /* renamed from: F, reason: collision with root package name */
    private NestedScrollView f36603F;

    /* renamed from: G, reason: collision with root package name */
    private int f36604G;

    /* renamed from: H, reason: collision with root package name */
    private int f36605H;

    /* renamed from: I, reason: collision with root package name */
    private int f36606I;

    /* renamed from: J, reason: collision with root package name */
    private int f36607J;

    /* renamed from: K, reason: collision with root package name */
    private int f36608K;

    /* renamed from: L, reason: collision with root package name */
    private int f36609L;

    /* renamed from: M, reason: collision with root package name */
    private int f36610M;

    /* renamed from: N, reason: collision with root package name */
    private int f36611N;

    /* renamed from: O, reason: collision with root package name */
    private int f36612O;

    /* renamed from: P, reason: collision with root package name */
    private int f36613P;

    /* renamed from: Q, reason: collision with root package name */
    private int f36614Q;

    /* renamed from: R, reason: collision with root package name */
    private int f36615R;

    /* renamed from: T, reason: collision with root package name */
    private int f36617T;

    /* renamed from: U, reason: collision with root package name */
    private C5871k f36618U;

    /* renamed from: V, reason: collision with root package name */
    private C5871k f36619V;

    /* renamed from: W, reason: collision with root package name */
    private e f36620W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f36621X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f36622Y;

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView f36624a;

    /* renamed from: b0, reason: collision with root package name */
    private Object f36627b0;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC5862b f36634f;

    /* renamed from: g, reason: collision with root package name */
    private NinePatchDrawable f36635g;

    /* renamed from: h, reason: collision with root package name */
    private float f36636h;

    /* renamed from: i, reason: collision with root package name */
    private int f36637i;

    /* renamed from: j, reason: collision with root package name */
    private int f36638j;

    /* renamed from: k, reason: collision with root package name */
    private int f36639k;

    /* renamed from: l, reason: collision with root package name */
    private int f36640l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f36642n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f36643o;

    /* renamed from: r, reason: collision with root package name */
    private boolean f36646r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f36647s;

    /* renamed from: t, reason: collision with root package name */
    private int f36648t;

    /* renamed from: u, reason: collision with root package name */
    private int f36649u;

    /* renamed from: b, reason: collision with root package name */
    private Interpolator f36626b = f36596f0;

    /* renamed from: m, reason: collision with root package name */
    private long f36641m = -1;

    /* renamed from: p, reason: collision with root package name */
    private boolean f36644p = true;

    /* renamed from: v, reason: collision with root package name */
    private final Rect f36650v = new Rect();

    /* renamed from: w, reason: collision with root package name */
    private int f36651w = 200;

    /* renamed from: x, reason: collision with root package name */
    private Interpolator f36652x = f36597g0;

    /* renamed from: y, reason: collision with root package name */
    private int f36653y = 0;

    /* renamed from: z, reason: collision with root package name */
    private C5869i f36654z = new C5869i();

    /* renamed from: S, reason: collision with root package name */
    private int f36616S = 0;

    /* renamed from: Z, reason: collision with root package name */
    private float f36623Z = 1.0f;

    /* renamed from: a0, reason: collision with root package name */
    private int f36625a0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    private g f36629c0 = new g();

    /* renamed from: d0, reason: collision with root package name */
    private d f36631d0 = new d();

    /* renamed from: e0, reason: collision with root package name */
    private final Runnable f36633e0 = new c();

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView.t f36630d = new a();

    /* renamed from: e, reason: collision with root package name */
    private RecyclerView.u f36632e = new b();

    /* renamed from: c, reason: collision with root package name */
    private f f36628c = new f(this);

    /* renamed from: q, reason: collision with root package name */
    private int f36645q = ViewConfiguration.getLongPressTimeout();

    /* renamed from: i5.m$a */
    class a implements RecyclerView.t {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C5873m.this.R(recyclerView, motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
            return C5873m.this.K(recyclerView, motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void c(boolean z7) {
            C5873m.this.O(z7);
        }
    }

    /* renamed from: i5.m$b */
    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i8) {
            C5873m.this.P(recyclerView, i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i8, int i9) {
            C5873m.this.Q(recyclerView, i8, i9);
        }
    }

    /* renamed from: i5.m$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5873m c5873m = C5873m.this;
            if (c5873m.f36599B != null) {
                c5873m.f(c5873m.v());
            }
        }
    }

    /* renamed from: i5.m$d */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView f36658a;

        /* renamed from: b, reason: collision with root package name */
        public C5870j f36659b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.F f36660c;

        /* renamed from: d, reason: collision with root package name */
        public int f36661d;

        /* renamed from: e, reason: collision with root package name */
        public int f36662e;

        /* renamed from: f, reason: collision with root package name */
        public int f36663f;

        /* renamed from: g, reason: collision with root package name */
        public int f36664g;

        /* renamed from: h, reason: collision with root package name */
        public int f36665h;

        /* renamed from: i, reason: collision with root package name */
        public int f36666i;

        /* renamed from: j, reason: collision with root package name */
        public int f36667j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f36668k;

        /* renamed from: l, reason: collision with root package name */
        public C5871k f36669l;

        /* renamed from: m, reason: collision with root package name */
        public C5871k f36670m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f36671n;

        d() {
        }

        public void a() {
            this.f36658a = null;
            this.f36659b = null;
            this.f36660c = null;
        }

        public void b(RecyclerView recyclerView, RecyclerView.F f8, C5870j c5870j, int i8, int i9, C5871k c5871k, C5871k c5871k2, boolean z7) {
            this.f36658a = recyclerView;
            this.f36659b = c5870j;
            this.f36660c = f8;
            this.f36661d = i8;
            this.f36662e = i9;
            this.f36669l = c5871k;
            this.f36670m = c5871k2;
            this.f36671n = z7;
            int q8 = AbstractC6177c.q(recyclerView);
            this.f36667j = q8;
            boolean z8 = AbstractC6177c.a(q8) == 1;
            this.f36668k = z8;
            int i10 = i8 - c5870j.f36590f;
            this.f36665h = i10;
            this.f36663f = i10;
            int i11 = i9 - c5870j.f36591g;
            this.f36666i = i11;
            this.f36664g = i11;
            if (z8) {
                int max = Math.max(i10, recyclerView.getPaddingLeft());
                this.f36663f = max;
                this.f36663f = Math.min(max, Math.max(0, (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f36659b.f36585a));
            } else {
                int max2 = Math.max(i11, recyclerView.getPaddingTop());
                this.f36664g = max2;
                this.f36664g = Math.min(max2, Math.max(0, (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - this.f36659b.f36586b));
            }
        }
    }

    /* renamed from: i5.m$e */
    private static class e extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private C5873m f36672a;

        /* renamed from: b, reason: collision with root package name */
        private MotionEvent f36673b;

        public e(C5873m c5873m) {
            super(Looper.getMainLooper());
            this.f36672a = c5873m;
        }

        public void a() {
            removeMessages(1);
            MotionEvent motionEvent = this.f36673b;
            if (motionEvent != null) {
                motionEvent.recycle();
                this.f36673b = null;
            }
        }

        public boolean b() {
            return hasMessages(2);
        }

        public void c() {
            removeCallbacksAndMessages(null);
            this.f36672a = null;
        }

        public void d() {
            removeMessages(2);
        }

        public void e() {
            removeMessages(3);
        }

        public void f() {
            if (b()) {
                return;
            }
            sendEmptyMessage(2);
        }

        public void g() {
            sendEmptyMessage(3);
        }

        public void h(MotionEvent motionEvent, int i8) {
            a();
            this.f36673b = MotionEvent.obtain(motionEvent);
            sendEmptyMessageAtTime(1, motionEvent.getDownTime() + i8);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                this.f36672a.C(this.f36673b);
            } else if (i8 == 2) {
                this.f36672a.d(true);
            } else {
                if (i8 != 3) {
                    return;
                }
                this.f36672a.B();
            }
        }
    }

    /* renamed from: i5.m$f */
    private static class f implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final WeakReference f36674o;

        /* renamed from: s, reason: collision with root package name */
        private boolean f36675s;

        public f(C5873m c5873m) {
            this.f36674o = new WeakReference(c5873m);
        }

        public void a() {
            this.f36674o.clear();
            this.f36675s = false;
        }

        public void b() {
            C5873m c5873m;
            RecyclerView v7;
            if (this.f36675s || (c5873m = (C5873m) this.f36674o.get()) == null || (v7 = c5873m.v()) == null) {
                return;
            }
            X.f0(v7, this);
            this.f36675s = true;
        }

        public void c() {
            if (this.f36675s) {
                this.f36675s = false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C5873m c5873m = (C5873m) this.f36674o.get();
            if (c5873m != null && this.f36675s) {
                c5873m.D();
                RecyclerView v7 = c5873m.v();
                if (v7 == null || !this.f36675s) {
                    this.f36675s = false;
                } else {
                    X.f0(v7, this);
                }
            }
        }
    }

    /* renamed from: i5.m$g */
    static class g {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f36676a;

        /* renamed from: b, reason: collision with root package name */
        public int f36677b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f36678c;

        g() {
        }

        public void a() {
            this.f36676a = null;
            this.f36677b = -1;
            this.f36678c = false;
        }
    }

    private boolean A(int i8, boolean z7) {
        boolean z8 = i8 == 1;
        boolean G7 = G();
        e eVar = this.f36620W;
        if (eVar != null) {
            eVar.a();
        }
        this.f36639k = 0;
        this.f36640l = 0;
        this.f36606I = 0;
        this.f36607J = 0;
        this.f36608K = 0;
        this.f36609L = 0;
        this.f36610M = 0;
        this.f36611N = 0;
        this.f36612O = 0;
        this.f36613P = 0;
        this.f36614Q = 0;
        this.f36615R = 0;
        this.f36641m = -1L;
        this.f36621X = false;
        this.f36622Y = false;
        if (z7 && G()) {
            q(z8);
        }
        return G7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void E(androidx.recyclerview.widget.RecyclerView r8, boolean r9) {
        /*
            r7 = this;
            androidx.core.widget.NestedScrollView r0 = r7.f36603F
            int r1 = r0.getScrollX()
            int r2 = r0.getScrollY()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            int r4 = r7.t()
            r3.right = r4
            r3.left = r4
            int r4 = r7.u()
            r3.bottom = r4
            r3.top = r4
            androidx.recyclerview.widget.RecyclerView r4 = r7.f36624a
            I(r4, r0, r3)
            int r4 = r3.left
            int r4 = r4 - r1
            int r1 = r3.top
            int r1 = r1 - r2
            if (r9 == 0) goto L31
            int r2 = r0.getWidth()
            goto L35
        L31:
            int r2 = r0.getHeight()
        L35:
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = (float) r2
            float r3 = r3 / r2
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            r4 = r1
        L3d:
            float r1 = (float) r4
            float r1 = r1 * r3
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 - r2
            float r3 = java.lang.Math.abs(r1)
            r4 = 1050253722(0x3e99999a, float:0.3)
            float r3 = r2 - r3
            float r4 = r4 - r3
            r3 = 0
            float r3 = java.lang.Math.max(r3, r4)
            r4 = 1079334229(0x40555555, float:3.3333333)
            float r3 = r3 * r4
            int r4 = r7.f36616S
            float r1 = java.lang.Math.signum(r1)
            int r1 = (int) r1
            r5 = 1103626240(0x41c80000, float:25.0)
            float r6 = r7.f36623Z
            float r6 = r6 * r5
            float r5 = r7.f36636h
            float r6 = r6 * r5
            float r6 = r6 * r3
            float r6 = r6 + r2
            int r2 = (int) r6
            int r1 = r1 * r2
            r2 = 0
            if (r1 <= 0) goto L76
            if (r9 == 0) goto L70
            r3 = 8
            goto L71
        L70:
            r3 = 2
        L71:
            r3 = r3 & r4
            if (r3 != 0) goto L81
        L74:
            r1 = r2
            goto L81
        L76:
            if (r1 >= 0) goto L81
            if (r9 == 0) goto L7c
            r3 = 4
            goto L7d
        L7c:
            r3 = 1
        L7d:
            r3 = r3 & r4
            if (r3 != 0) goto L81
            goto L74
        L81:
            if (r1 == 0) goto L8f
            r7.W(r8)
            if (r9 == 0) goto L8c
            r0.scrollBy(r1, r2)
            goto L8f
        L8c:
            r0.scrollBy(r2, r1)
        L8f:
            i5.h r9 = r7.f36601D
            int r0 = r7.t()
            int r1 = r7.u()
            boolean r9 = r9.M(r0, r1, r2)
            if (r9 == 0) goto Lb8
            i5.n r9 = r7.f36602E
            if (r9 == 0) goto Lb2
            i5.h r0 = r7.f36601D
            int r0 = r0.u()
            i5.h r1 = r7.f36601D
            int r1 = r1.v()
            r9.w(r0, r1)
        Lb2:
            r7.f(r8)
            r7.L()
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C5873m.E(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0153, code lost:
    
        r1 = r17.f36636h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013e, code lost:
    
        r1 = -r17.f36636h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0141, code lost:
    
        r5 = r1 * 0.005f;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F(androidx.recyclerview.widget.RecyclerView r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C5873m.F(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    private static boolean I(View view, View view2, Rect rect) {
        Object parent;
        do {
            parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ((ViewGroup) parent).offsetDescendantRectToMyCoords(view, rect);
            view = (View) parent;
        } while (parent != view2);
        return true;
    }

    private void J() {
        Log.i("ARVDragDropManager", "a view holder object which is bound to currently dragging item is recycled");
        this.f36599B = null;
        this.f36601D.B();
    }

    private void S(RecyclerView recyclerView, RecyclerView.F f8, RecyclerView.F f9, Rect rect, int i8, int i9) {
        int X7;
        int i10;
        RecyclerView.p layoutManager = this.f36624a.getLayoutManager();
        int q8 = AbstractC6177c.q(this.f36624a);
        boolean z7 = AbstractC6177c.a(q8) == 1;
        int f10 = AbstractC6177c.f(this.f36624a, false);
        View view = f8 != null ? f8.f10944a : null;
        View view2 = f9.f10944a;
        View l8 = AbstractC6177c.l(layoutManager, f10);
        int G7 = f8 != null ? f8.G() : -1;
        int G8 = f9.G();
        Integer s8 = s(view, z7);
        Integer s9 = s(view2, z7);
        Integer s10 = s(l8, z7);
        this.f36598A.u0(i8, i9, q8);
        if (f10 == G7 && s10 != null && s9 != null) {
            X(recyclerView, -(s9.intValue() - s10.intValue()), z7);
            V(recyclerView);
            return;
        }
        if (f10 != G8 || view == null || s8 == null || s8.equals(s9)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (z7) {
            X7 = layoutManager.W(view) + marginLayoutParams.topMargin;
            i10 = marginLayoutParams.bottomMargin;
        } else {
            X7 = layoutManager.X(view) + marginLayoutParams.leftMargin;
            i10 = marginLayoutParams.rightMargin;
        }
        X(recyclerView, -(X7 + i10), z7);
        V(recyclerView);
    }

    private static void U(RecyclerView recyclerView, RecyclerView.F f8) {
        RecyclerView.m itemAnimator = recyclerView != null ? recyclerView.getItemAnimator() : null;
        if (itemAnimator != null) {
            itemAnimator.j(f8);
        }
    }

    private static void V(RecyclerView recyclerView) {
        RecyclerView.m itemAnimator = recyclerView != null ? recyclerView.getItemAnimator() : null;
        if (itemAnimator != null) {
            itemAnimator.k();
        }
    }

    private void W(RecyclerView recyclerView) {
        if (this.f36602E != null) {
            V(recyclerView);
        }
    }

    private static void X(RecyclerView recyclerView, int i8, boolean z7) {
        if (z7) {
            recyclerView.scrollBy(0, i8);
        } else {
            recyclerView.scrollBy(i8, 0);
        }
    }

    private int Y(int i8) {
        this.f36648t = 0;
        this.f36647s = true;
        this.f36624a.scrollBy(i8, 0);
        this.f36647s = false;
        return this.f36648t;
    }

    private int Z(int i8) {
        this.f36649u = 0;
        this.f36647s = true;
        this.f36624a.scrollBy(0, i8);
        this.f36647s = false;
        return this.f36649u;
    }

    private boolean b(RecyclerView.F f8, int i8, int i9) {
        int C7 = f8.C();
        int f9 = AbstractC6179e.f(this.f36624a.getAdapter(), this.f36598A, null, C7);
        if (f9 == -1) {
            return false;
        }
        View view = f8.f10944a;
        return this.f36598A.m0(f8, f9, i8 - (view.getLeft() + ((int) (view.getTranslationX() + 0.5f))), i9 - (view.getTop() + ((int) (view.getTranslationY() + 0.5f)))) && f8.C() == C7;
    }

    private boolean e(RecyclerView recyclerView, MotionEvent motionEvent, boolean z7) {
        RecyclerView.F c8;
        if (this.f36600C != null) {
            return false;
        }
        int x7 = (int) (motionEvent.getX() + 0.5f);
        int y7 = (int) (motionEvent.getY() + 0.5f);
        this.f36606I = x7;
        this.f36607J = y7;
        if (this.f36641m == -1) {
            return false;
        }
        if ((z7 && ((!this.f36621X || Math.abs(x7 - this.f36639k) <= this.f36637i) && (!this.f36622Y || Math.abs(y7 - this.f36640l) <= this.f36637i))) || (c8 = AbstractC6177c.c(recyclerView, this.f36639k, this.f36640l)) == null || !b(c8, x7, y7)) {
            return false;
        }
        RecyclerView.h adapter = this.f36624a.getAdapter();
        C5786a c5786a = new C5786a();
        int g8 = AbstractC6179e.g(adapter, this.f36598A, null, c8.C(), c5786a);
        C5871k r02 = this.f36598A.r0(c8, g8);
        if (r02 == null) {
            r02 = new C5871k(0, Math.max(0, this.f36598A.E() - 1));
        }
        C5871k c5871k = r02;
        m0(c5871k, g8);
        f0(recyclerView, motionEvent, c8, c5871k, c5786a, g8, c5786a.e().f35886b);
        return true;
    }

    private void f0(RecyclerView recyclerView, MotionEvent motionEvent, RecyclerView.F f8, C5871k c5871k, C5786a c5786a, int i8, Object obj) {
        U(recyclerView, f8);
        this.f36620W.a();
        this.f36600C = new C5870j(recyclerView, f8, this.f36606I, this.f36607J);
        this.f36599B = f8;
        this.f36618U = c5871k;
        this.f36619V = h(c5786a, c5871k);
        NestedScrollView j8 = j(this.f36624a);
        if (j8 == null || this.f36624a.isNestedScrollingEnabled()) {
            this.f36603F = null;
        } else {
            this.f36603F = j8;
        }
        this.f36617T = recyclerView.getOverScrollMode();
        recyclerView.setOverScrollMode(2);
        this.f36606I = (int) (motionEvent.getX() + 0.5f);
        this.f36607J = (int) (motionEvent.getY() + 0.5f);
        NestedScrollView nestedScrollView = this.f36603F;
        this.f36604G = nestedScrollView != null ? nestedScrollView.getScrollX() : 0;
        NestedScrollView nestedScrollView2 = this.f36603F;
        this.f36605H = nestedScrollView2 != null ? nestedScrollView2.getScrollY() : 0;
        int i9 = this.f36607J;
        this.f36613P = i9;
        this.f36611N = i9;
        this.f36609L = i9;
        int i10 = this.f36606I;
        this.f36612O = i10;
        this.f36610M = i10;
        this.f36608K = i10;
        this.f36616S = 0;
        this.f36625a0 = this.f36653y;
        this.f36627b0 = obj;
        this.f36624a.getParent().requestDisallowInterceptTouchEvent(true);
        g0();
        this.f36598A.z0(this.f36600C, f8, this.f36618U, i8, this.f36625a0);
        this.f36598A.S(f8, i8);
        C5868h c5868h = new C5868h(this.f36624a, f8, this.f36619V);
        this.f36601D = c5868h;
        c5868h.J(this.f36635g);
        this.f36601D.K(this.f36654z);
        this.f36601D.L(this.f36600C, this.f36606I, this.f36607J);
        int q8 = AbstractC6177c.q(this.f36624a);
        if (!this.f36646r && AbstractC6177c.x(q8)) {
            C5874n c5874n = new C5874n(this.f36624a, f8, this.f36600C);
            this.f36602E = c5874n;
            c5874n.u(this.f36626b);
            this.f36602E.v();
            this.f36602E.w(this.f36601D.u(), this.f36601D.v());
        }
        AbstractC5862b abstractC5862b = this.f36634f;
        if (abstractC5862b != null) {
            abstractC5862b.s();
        }
        this.f36598A.w0();
    }

    private boolean g(RecyclerView recyclerView, RecyclerView.F f8) {
        if (!(f8 instanceof InterfaceC5866f)) {
            return false;
        }
        int w7 = w(f8);
        return w7 >= 0 && w7 < this.f36598A.E();
    }

    private void g0() {
        this.f36628c.b();
    }

    private C5871k h(C5786a c5786a, C5871k c5871k) {
        RecyclerView.h adapter = this.f36624a.getAdapter();
        return new C5871k(AbstractC6179e.i(c5786a, this.f36598A, adapter, c5871k.d()), AbstractC6179e.i(c5786a, this.f36598A, adapter, c5871k.c()));
    }

    private void h0() {
        f fVar = this.f36628c;
        if (fVar != null) {
            fVar.c();
        }
    }

    private static boolean i0() {
        return true;
    }

    private static NestedScrollView j(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof NestedScrollView) {
                return (NestedScrollView) parent;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[PHI: r9
  0x004d: PHI (r9v3 boolean) = (r9v0 boolean), (r9v1 boolean), (r9v1 boolean), (r9v1 boolean), (r9v1 boolean) binds: [B:15:0x004b, B:30:0x00a9, B:32:0x00ad, B:39:0x00f0, B:36:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j0(androidx.recyclerview.widget.RecyclerView r17, int r18, androidx.recyclerview.widget.RecyclerView.F r19, androidx.recyclerview.widget.RecyclerView.F r20) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C5873m.j0(androidx.recyclerview.widget.RecyclerView, int, androidx.recyclerview.widget.RecyclerView$F, androidx.recyclerview.widget.RecyclerView$F):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private i5.C5873m.g k(i5.C5873m.g r9, i5.C5873m.d r10, boolean r11) {
        /*
            r8 = this;
            r9.a()
            androidx.recyclerview.widget.RecyclerView$F r0 = r10.f36660c
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L1e
            int r0 = r8.w(r0)
            if (r0 == r2) goto L30
            androidx.recyclerview.widget.RecyclerView$F r0 = r10.f36660c
            long r4 = r0.E()
            i5.j r0 = r10.f36659b
            long r6 = r0.f36587c
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L30
        L1e:
            int r0 = r10.f36667j
            if (r0 == 0) goto L3c
            if (r0 == r1) goto L3c
            r4 = 2
            if (r0 == r4) goto L37
            r4 = 3
            if (r0 == r4) goto L37
            r4 = 4
            if (r0 == r4) goto L32
            r4 = 5
            if (r0 == r4) goto L32
        L30:
            r11 = r3
            goto L40
        L32:
            androidx.recyclerview.widget.RecyclerView$F r11 = p(r10, r11)
            goto L40
        L37:
            androidx.recyclerview.widget.RecyclerView$F r11 = l(r10, r11)
            goto L40
        L3c:
            androidx.recyclerview.widget.RecyclerView$F r11 = o(r10, r11)
        L40:
            androidx.recyclerview.widget.RecyclerView$F r0 = r10.f36660c
            if (r11 != r0) goto L47
            r9.f36678c = r1
            r11 = r3
        L47:
            int r0 = r8.w(r11)
            if (r11 == 0) goto L58
            i5.k r10 = r10.f36669l
            if (r10 == 0) goto L58
            boolean r10 = r10.a(r0)
            if (r10 != 0) goto L58
            goto L59
        L58:
            r3 = r11
        L59:
            r9.f36676a = r3
            if (r3 == 0) goto L5e
            r2 = r0
        L5e:
            r9.f36677b = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C5873m.k(i5.m$g, i5.m$d, boolean):i5.m$g");
    }

    private void k0() {
        int s8 = AbstractC6177c.s(this.f36624a);
        if (s8 == 0) {
            int t7 = t();
            int i8 = this.f36608K;
            int i9 = this.f36610M;
            int i10 = i8 - i9;
            int i11 = this.f36638j;
            if (i10 > i11 || this.f36612O - t7 > i11) {
                this.f36616S |= 4;
            }
            if (this.f36612O - i8 > i11 || t7 - i9 > i11) {
                this.f36616S |= 8;
                return;
            }
            return;
        }
        if (s8 != 1) {
            return;
        }
        int u7 = u();
        int i12 = this.f36609L;
        int i13 = this.f36611N;
        int i14 = i12 - i13;
        int i15 = this.f36638j;
        if (i14 > i15 || this.f36613P - u7 > i15) {
            this.f36616S = 1 | this.f36616S;
        }
        if (this.f36613P - i12 > i15 || u7 - i13 > i15) {
            this.f36616S |= 2;
        }
    }

    private static RecyclerView.F l(d dVar, boolean z7) {
        if (z7) {
            return null;
        }
        RecyclerView.F m8 = m(dVar);
        return m8 == null ? n(dVar) : m8;
    }

    private void l0(float f8) {
        if (f8 == 0.0f) {
            this.f36634f.r();
        } else if (f8 < 0.0f) {
            this.f36634f.p(f8);
        } else {
            this.f36634f.q(f8);
        }
    }

    private static RecyclerView.F m(d dVar) {
        return AbstractC6177c.c(dVar.f36658a, dVar.f36661d, dVar.f36662e);
    }

    private void m0(C5871k c5871k, int i8) {
        int max = Math.max(0, this.f36598A.E() - 1);
        if (c5871k.d() > c5871k.c()) {
            throw new IllegalStateException("Invalid wrappedAdapterRange specified --- start > wrappedAdapterRange (wrappedAdapterRange = " + c5871k + ")");
        }
        if (c5871k.d() < 0) {
            throw new IllegalStateException("Invalid wrappedAdapterRange specified --- start < 0 (wrappedAdapterRange = " + c5871k + ")");
        }
        if (c5871k.c() > max) {
            throw new IllegalStateException("Invalid wrappedAdapterRange specified --- end >= count (wrappedAdapterRange = " + c5871k + ")");
        }
        if (c5871k.a(i8)) {
            return;
        }
        throw new IllegalStateException("Invalid wrappedAdapterRange specified --- does not contain drag target item (wrappedAdapterRange = " + c5871k + ", position = " + i8 + ")");
    }

    private static RecyclerView.F n(d dVar) {
        float f8;
        float f9;
        int t7 = AbstractC6177c.t(dVar.f36658a);
        int height = dVar.f36658a.getHeight();
        int width = dVar.f36658a.getWidth();
        int paddingLeft = dVar.f36668k ? dVar.f36658a.getPaddingLeft() : 0;
        int paddingTop = !dVar.f36668k ? dVar.f36658a.getPaddingTop() : 0;
        int paddingRight = ((width - paddingLeft) - (dVar.f36668k ? dVar.f36658a.getPaddingRight() : 0)) / t7;
        int paddingBottom = ((height - paddingTop) - (!dVar.f36668k ? dVar.f36658a.getPaddingBottom() : 0)) / t7;
        int i8 = dVar.f36661d;
        int i9 = dVar.f36662e;
        int d8 = dVar.f36670m.d();
        int c8 = dVar.f36670m.c();
        if (dVar.f36668k) {
            f8 = i8 - paddingLeft;
            f9 = paddingRight;
        } else {
            f8 = i9 - paddingTop;
            f9 = paddingBottom;
        }
        for (int min = Math.min(Math.max((int) (f8 / f9), 0), t7 - 1); min >= 0; min--) {
            boolean z7 = dVar.f36668k;
            RecyclerView.F c9 = AbstractC6177c.c(dVar.f36658a, z7 ? (paddingRight * min) + paddingLeft + (paddingRight / 2) : i8, !z7 ? (paddingBottom * min) + paddingTop + (paddingBottom / 2) : i9);
            if (c9 != null) {
                int C7 = c9.C();
                if (C7 == -1 || C7 < d8 || C7 > c8) {
                    return null;
                }
                return c9;
            }
        }
        return null;
    }

    private static RecyclerView.F o(d dVar, boolean z7) {
        RecyclerView.F f8 = dVar.f36660c;
        if (f8 == null) {
            return null;
        }
        if (dVar.f36671n || z7) {
            float f9 = f8.f10944a.getResources().getDisplayMetrics().density * 8.0f;
            float min = Math.min(dVar.f36659b.f36585a * 0.2f, f9);
            float min2 = Math.min(dVar.f36659b.f36586b * 0.2f, f9);
            float f10 = dVar.f36663f;
            C5870j c5870j = dVar.f36659b;
            float f11 = f10 + (c5870j.f36585a * 0.5f);
            float f12 = dVar.f36664g + (c5870j.f36586b * 0.5f);
            RecyclerView.F c8 = AbstractC6177c.c(dVar.f36658a, f11 - min, f12 - min2);
            if (c8 == AbstractC6177c.c(dVar.f36658a, f11 + min, f12 + min2)) {
                return c8;
            }
            return null;
        }
        int C7 = f8.C();
        int top = dVar.f36668k ? dVar.f36660c.f10944a.getTop() : dVar.f36660c.f10944a.getLeft();
        int i8 = dVar.f36668k ? dVar.f36664g : dVar.f36663f;
        if (i8 < top) {
            if (C7 > 0) {
                return dVar.f36658a.e0(C7 - 1);
            }
            return null;
        }
        if (i8 <= top || C7 >= dVar.f36658a.getAdapter().E() - 1) {
            return null;
        }
        return dVar.f36658a.e0(C7 + 1);
    }

    private static RecyclerView.F p(d dVar, boolean z7) {
        RecyclerView.F f8;
        RecyclerView.F f9;
        RecyclerView.F f10;
        if (z7 || dVar.f36660c == null) {
            return null;
        }
        int i8 = dVar.f36663f;
        int i9 = i8 + 1;
        C5870j c5870j = dVar.f36659b;
        int i10 = c5870j.f36585a;
        int i11 = ((i10 / 2) + i8) - 1;
        int i12 = (i8 + i10) - 2;
        int i13 = dVar.f36664g;
        int i14 = i13 + 1;
        int i15 = c5870j.f36586b;
        int i16 = ((i15 / 2) + i13) - 1;
        int i17 = (i13 + i15) - 2;
        if (dVar.f36668k) {
            float f11 = i16;
            f8 = AbstractC6177c.c(dVar.f36658a, i9, f11);
            f9 = AbstractC6177c.c(dVar.f36658a, i12, f11);
            f10 = AbstractC6177c.c(dVar.f36658a, i11, f11);
        } else {
            float f12 = i11;
            RecyclerView.F c8 = AbstractC6177c.c(dVar.f36658a, f12, i14);
            RecyclerView.F c9 = AbstractC6177c.c(dVar.f36658a, f12, i16);
            RecyclerView.F c10 = AbstractC6177c.c(dVar.f36658a, f12, i17);
            f8 = c8;
            f9 = c9;
            f10 = c10;
        }
        if (f10 == dVar.f36660c) {
            return null;
        }
        if (f10 == f8 || f10 == f9) {
            return f10;
        }
        return null;
    }

    private void q(boolean z7) {
        if (G()) {
            e eVar = this.f36620W;
            if (eVar != null) {
                eVar.d();
                this.f36620W.e();
            }
            RecyclerView recyclerView = this.f36624a;
            if (recyclerView != null && this.f36599B != null) {
                recyclerView.setOverScrollMode(this.f36617T);
            }
            C5868h c5868h = this.f36601D;
            if (c5868h != null) {
                c5868h.n(this.f36651w);
                this.f36601D.o(this.f36652x);
                this.f36601D.t(true);
            }
            C5874n c5874n = this.f36602E;
            if (c5874n != null) {
                c5874n.n(this.f36651w);
                this.f36601D.o(this.f36652x);
                this.f36602E.r(true);
            }
            AbstractC5862b abstractC5862b = this.f36634f;
            if (abstractC5862b != null) {
                abstractC5862b.r();
            }
            h0();
            RecyclerView recyclerView2 = this.f36624a;
            if (recyclerView2 != null && recyclerView2.getParent() != null) {
                this.f36624a.getParent().requestDisallowInterceptTouchEvent(false);
            }
            RecyclerView recyclerView3 = this.f36624a;
            if (recyclerView3 != null) {
                recyclerView3.invalidate();
            }
            this.f36618U = null;
            this.f36619V = null;
            this.f36601D = null;
            this.f36602E = null;
            this.f36599B = null;
            this.f36600C = null;
            this.f36627b0 = null;
            this.f36603F = null;
            this.f36606I = 0;
            this.f36607J = 0;
            this.f36604G = 0;
            this.f36605H = 0;
            this.f36608K = 0;
            this.f36609L = 0;
            this.f36610M = 0;
            this.f36611N = 0;
            this.f36612O = 0;
            this.f36613P = 0;
            this.f36614Q = 0;
            this.f36615R = 0;
            this.f36621X = false;
            this.f36622Y = false;
            C5867g c5867g = this.f36598A;
            if (c5867g != null) {
                this.f36598A.v0(c5867g.q0(), this.f36598A.p0(), z7);
            }
        }
    }

    private static Integer s(View view, boolean z7) {
        if (view != null) {
            return Integer.valueOf(z7 ? view.getTop() : view.getLeft());
        }
        return null;
    }

    private int t() {
        int i8 = this.f36606I;
        NestedScrollView nestedScrollView = this.f36603F;
        return nestedScrollView != null ? i8 + (nestedScrollView.getScrollX() - this.f36604G) : i8;
    }

    private int u() {
        int i8 = this.f36607J;
        NestedScrollView nestedScrollView = this.f36603F;
        return nestedScrollView != null ? i8 + (nestedScrollView.getScrollY() - this.f36605H) : i8;
    }

    private int w(RecyclerView.F f8) {
        if (f8 == null) {
            return -1;
        }
        return AbstractC6179e.f(this.f36624a.getAdapter(), this.f36598A, this.f36627b0, f8.C());
    }

    private boolean x(RecyclerView recyclerView, MotionEvent motionEvent) {
        RecyclerView.F c8 = AbstractC6177c.c(recyclerView, motionEvent.getX(), motionEvent.getY());
        if (!g(recyclerView, c8)) {
            return false;
        }
        int x7 = (int) (motionEvent.getX() + 0.5f);
        int y7 = (int) (motionEvent.getY() + 0.5f);
        if (!b(c8, x7, y7)) {
            return false;
        }
        int s8 = AbstractC6177c.s(this.f36624a);
        int t7 = AbstractC6177c.t(this.f36624a);
        this.f36606I = x7;
        this.f36639k = x7;
        this.f36607J = y7;
        this.f36640l = y7;
        this.f36641m = c8.E();
        boolean z7 = true;
        this.f36621X = s8 == 0 || (s8 == 1 && t7 > 1);
        if (s8 != 1 && (s8 != 0 || t7 <= 1)) {
            z7 = false;
        }
        this.f36622Y = z7;
        if (this.f36643o) {
            return e(recyclerView, motionEvent, false);
        }
        if (!this.f36642n) {
            return false;
        }
        this.f36620W.h(motionEvent, this.f36645q);
        return false;
    }

    private void y(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f36606I = (int) (motionEvent.getX() + 0.5f);
        this.f36607J = (int) (motionEvent.getY() + 0.5f);
        NestedScrollView nestedScrollView = this.f36603F;
        this.f36604G = nestedScrollView != null ? nestedScrollView.getScrollX() : 0;
        NestedScrollView nestedScrollView2 = this.f36603F;
        this.f36605H = nestedScrollView2 != null ? nestedScrollView2.getScrollY() : 0;
        this.f36610M = Math.min(this.f36610M, this.f36606I);
        this.f36611N = Math.min(this.f36611N, this.f36607J);
        this.f36612O = Math.max(this.f36612O, this.f36606I);
        this.f36613P = Math.max(this.f36613P, this.f36607J);
        k0();
        if (this.f36601D.M(t(), u(), false)) {
            C5874n c5874n = this.f36602E;
            if (c5874n != null) {
                c5874n.w(this.f36601D.u(), this.f36601D.v());
            }
            f(recyclerView);
            L();
        }
    }

    private boolean z(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f36644p) {
            return e(recyclerView, motionEvent, true);
        }
        return false;
    }

    void B() {
        RecyclerView.F f02 = this.f36624a.f0(this.f36600C.f36587c);
        if (f02 == null) {
            return;
        }
        int width = f02.f10944a.getWidth();
        int height = f02.f10944a.getHeight();
        C5870j c5870j = this.f36600C;
        if (width == c5870j.f36585a && height == c5870j.f36586b) {
            return;
        }
        C5870j a8 = C5870j.a(c5870j, f02);
        this.f36600C = a8;
        this.f36601D.O(a8, f02);
    }

    void C(MotionEvent motionEvent) {
        if (this.f36642n) {
            e(this.f36624a, motionEvent, false);
        }
    }

    void D() {
        RecyclerView recyclerView = this.f36624a;
        int s8 = AbstractC6177c.s(recyclerView);
        boolean z7 = true;
        if (s8 != 0) {
            if (s8 != 1) {
                return;
            } else {
                z7 = false;
            }
        }
        if (this.f36603F != null) {
            E(recyclerView, z7);
        } else {
            F(recyclerView, z7);
        }
    }

    public boolean G() {
        return (this.f36600C == null || this.f36620W.b()) ? false : true;
    }

    public boolean H() {
        return this.f36630d == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        if (r0 != 3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean K(androidx.recyclerview.widget.RecyclerView r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            int r0 = r5.getActionMasked()
            if (r0 == 0) goto L26
            r1 = 1
            if (r0 == r1) goto L21
            r2 = 2
            if (r0 == r2) goto L10
            r4 = 3
            if (r0 == r4) goto L21
            goto L31
        L10:
            boolean r0 = r3.G()
            if (r0 == 0) goto L1a
            r3.y(r4, r5)
            goto L32
        L1a:
            boolean r4 = r3.z(r4, r5)
            if (r4 == 0) goto L31
            goto L32
        L21:
            boolean r1 = r3.A(r0, r1)
            goto L32
        L26:
            boolean r0 = r3.G()
            if (r0 != 0) goto L31
            boolean r1 = r3.x(r4, r5)
            goto L32
        L31:
            r1 = 0
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C5873m.K(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    void M(RecyclerView.F f8) {
        if (f8 == this.f36599B) {
            J();
            return;
        }
        C5874n c5874n = this.f36602E;
        if (c5874n != null) {
            c5874n.s(f8);
        }
    }

    void N(RecyclerView.F f8) {
        if (this.f36599B != null) {
            J();
        }
        this.f36599B = f8;
        this.f36601D.H(f8);
    }

    void O(boolean z7) {
        if (z7) {
            d(true);
        }
    }

    void P(RecyclerView recyclerView, int i8) {
        if (i8 == 1) {
            d(true);
        }
    }

    void Q(RecyclerView recyclerView, int i8, int i9) {
        if (this.f36647s) {
            this.f36648t = i8;
            this.f36649u = i9;
        } else if (G()) {
            X.g0(this.f36624a, this.f36633e0, 500L);
        }
    }

    void R(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (G()) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    y(recyclerView, motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    return;
                }
            }
            A(actionMasked, true);
        }
    }

    public void T() {
        RecyclerView.u uVar;
        RecyclerView.t tVar;
        d(true);
        e eVar = this.f36620W;
        if (eVar != null) {
            eVar.c();
            this.f36620W = null;
        }
        AbstractC5862b abstractC5862b = this.f36634f;
        if (abstractC5862b != null) {
            abstractC5862b.m();
            this.f36634f = null;
        }
        RecyclerView recyclerView = this.f36624a;
        if (recyclerView != null && (tVar = this.f36630d) != null) {
            recyclerView.k1(tVar);
        }
        this.f36630d = null;
        RecyclerView recyclerView2 = this.f36624a;
        if (recyclerView2 != null && (uVar = this.f36632e) != null) {
            recyclerView2.l1(uVar);
        }
        this.f36632e = null;
        f fVar = this.f36628c;
        if (fVar != null) {
            fVar.a();
            this.f36628c = null;
        }
        this.f36598A = null;
        this.f36624a = null;
        this.f36626b = null;
    }

    public void a(RecyclerView recyclerView) {
        if (H()) {
            throw new IllegalStateException("Accessing released object");
        }
        if (this.f36624a != null) {
            throw new IllegalStateException("RecyclerView instance has already been set");
        }
        this.f36624a = recyclerView;
        recyclerView.n(this.f36632e);
        this.f36624a.m(this.f36630d);
        this.f36636h = this.f36624a.getResources().getDisplayMetrics().density;
        int scaledTouchSlop = ViewConfiguration.get(this.f36624a.getContext()).getScaledTouchSlop();
        this.f36637i = scaledTouchSlop;
        this.f36638j = (int) ((scaledTouchSlop * 1.5f) + 0.5f);
        this.f36620W = new e(this);
        if (i0()) {
            int s8 = AbstractC6177c.s(this.f36624a);
            if (s8 == 0) {
                this.f36634f = new C5872l(this.f36624a);
            } else if (s8 == 1) {
                this.f36634f = new C5875o(this.f36624a);
            }
            AbstractC5862b abstractC5862b = this.f36634f;
            if (abstractC5862b != null) {
                abstractC5862b.t();
            }
        }
    }

    public void a0(boolean z7) {
        this.f36646r = z7;
    }

    public void b0(NinePatchDrawable ninePatchDrawable) {
        this.f36635g = ninePatchDrawable;
    }

    public void c() {
        d(false);
    }

    public void c0(boolean z7) {
        this.f36642n = z7;
    }

    void d(boolean z7) {
        A(3, false);
        if (z7) {
            q(false);
        } else if (G()) {
            this.f36620W.f();
        }
    }

    public void d0(boolean z7) {
        this.f36644p = z7;
    }

    public void e0(boolean z7) {
        this.f36643o = z7;
    }

    void f(RecyclerView recyclerView) {
        int i8;
        RecyclerView.F f8 = this.f36599B;
        d dVar = this.f36631d0;
        dVar.b(recyclerView, f8, this.f36600C, t(), u(), this.f36618U, this.f36619V, this.f36646r);
        int q02 = this.f36598A.q0();
        int p02 = this.f36598A.p0();
        boolean z7 = false;
        g k8 = k(this.f36629c0, dVar, false);
        int i9 = k8.f36677b;
        if (i9 != -1) {
            boolean z8 = this.f36646r;
            z7 = z8 ? this.f36598A.l0(q02, i9) : !z8;
            if (!z7 && (i8 = (k8 = k(this.f36629c0, dVar, true)).f36677b) != -1) {
                z7 = this.f36598A.l0(q02, i8);
            }
        }
        if (z7 && k8.f36676a == null) {
            throw new IllegalStateException("bug check");
        }
        if (z7) {
            j0(recyclerView, p02, f8, k8.f36676a);
        }
        C5874n c5874n = this.f36602E;
        if (c5874n != null) {
            c5874n.t(z7 ? k8.f36676a : null);
        }
        if (z7) {
            this.f36620W.g();
        }
        k8.a();
        dVar.a();
    }

    public RecyclerView.h i(RecyclerView.h hVar) {
        if (!hVar.I()) {
            throw new IllegalArgumentException("The passed adapter does not support stable IDs");
        }
        if (this.f36598A != null) {
            throw new IllegalStateException("already have a wrapped adapter");
        }
        C5867g c5867g = new C5867g(this, hVar);
        this.f36598A = c5867g;
        return c5867g;
    }

    RecyclerView.F r() {
        return this.f36599B;
    }

    RecyclerView v() {
        return this.f36624a;
    }

    private void L() {
    }
}
