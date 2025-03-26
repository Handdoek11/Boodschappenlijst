package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import f.AbstractC5752a;
import f.AbstractC5757f;
import q0.C6411b;
import z0.C7003G;
import z0.C7061y0;
import z0.InterfaceC7001E;
import z0.InterfaceC7002F;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements I, InterfaceC7001E, InterfaceC7002F {

    /* renamed from: a0, reason: collision with root package name */
    static final int[] f7309a0 = {AbstractC5752a.f35375b, R.attr.windowContentOverlay};

    /* renamed from: b0, reason: collision with root package name */
    private static final C7061y0 f7310b0 = new C7061y0.a().d(C6411b.b(0, 1, 0, 1)).a();

    /* renamed from: c0, reason: collision with root package name */
    private static final Rect f7311c0 = new Rect();

    /* renamed from: A, reason: collision with root package name */
    boolean f7312A;

    /* renamed from: B, reason: collision with root package name */
    private int f7313B;

    /* renamed from: C, reason: collision with root package name */
    private int f7314C;

    /* renamed from: D, reason: collision with root package name */
    private final Rect f7315D;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f7316E;

    /* renamed from: F, reason: collision with root package name */
    private final Rect f7317F;

    /* renamed from: G, reason: collision with root package name */
    private final Rect f7318G;

    /* renamed from: H, reason: collision with root package name */
    private final Rect f7319H;

    /* renamed from: I, reason: collision with root package name */
    private final Rect f7320I;

    /* renamed from: J, reason: collision with root package name */
    private final Rect f7321J;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f7322K;

    /* renamed from: L, reason: collision with root package name */
    private C7061y0 f7323L;

    /* renamed from: M, reason: collision with root package name */
    private C7061y0 f7324M;

    /* renamed from: N, reason: collision with root package name */
    private C7061y0 f7325N;

    /* renamed from: O, reason: collision with root package name */
    private C7061y0 f7326O;

    /* renamed from: P, reason: collision with root package name */
    private d f7327P;

    /* renamed from: Q, reason: collision with root package name */
    private OverScroller f7328Q;

    /* renamed from: R, reason: collision with root package name */
    ViewPropertyAnimator f7329R;

    /* renamed from: S, reason: collision with root package name */
    final AnimatorListenerAdapter f7330S;

    /* renamed from: T, reason: collision with root package name */
    private final Runnable f7331T;

    /* renamed from: U, reason: collision with root package name */
    private final Runnable f7332U;

    /* renamed from: V, reason: collision with root package name */
    private final C7003G f7333V;

    /* renamed from: W, reason: collision with root package name */
    private final f f7334W;

    /* renamed from: o, reason: collision with root package name */
    private int f7335o;

    /* renamed from: s, reason: collision with root package name */
    private int f7336s;

    /* renamed from: t, reason: collision with root package name */
    private ContentFrameLayout f7337t;

    /* renamed from: u, reason: collision with root package name */
    ActionBarContainer f7338u;

    /* renamed from: v, reason: collision with root package name */
    private J f7339v;

    /* renamed from: w, reason: collision with root package name */
    private Drawable f7340w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7341x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f7342y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7343z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f7329R = null;
            actionBarOverlayLayout.f7312A = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f7329R = null;
            actionBarOverlayLayout.f7312A = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f7329R = actionBarOverlayLayout.f7338u.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f7330S);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f7329R = actionBarOverlayLayout.f7338u.animate().translationY(-ActionBarOverlayLayout.this.f7338u.getHeight()).setListener(ActionBarOverlayLayout.this.f7330S);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z7);

        void d();

        void e();

        void onWindowVisibilityChanged(int i8);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i8, int i9) {
            super(i8, i9);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7336s = 0;
        this.f7315D = new Rect();
        this.f7316E = new Rect();
        this.f7317F = new Rect();
        this.f7318G = new Rect();
        this.f7319H = new Rect();
        this.f7320I = new Rect();
        this.f7321J = new Rect();
        this.f7322K = new Rect();
        C7061y0 c7061y0 = C7061y0.f44816b;
        this.f7323L = c7061y0;
        this.f7324M = c7061y0;
        this.f7325N = c7061y0;
        this.f7326O = c7061y0;
        this.f7330S = new a();
        this.f7331T = new b();
        this.f7332U = new c();
        w(context);
        this.f7333V = new C7003G(this);
        f fVar = new f(context);
        this.f7334W = fVar;
        addView(fVar);
    }

    private void B() {
        v();
        this.f7331T.run();
    }

    private boolean C(float f8) {
        this.f7328Q.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f7328Q.getFinalY() > this.f7338u.getHeight();
    }

    private void p() {
        v();
        this.f7332U.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private boolean r() {
        z0.X.f(this.f7334W, f7310b0, this.f7318G);
        return !this.f7318G.equals(f7311c0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J u(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void w(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f7309a0);
        this.f7335o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f7340w = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f7328Q = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.f7332U, 600L);
    }

    private void z() {
        v();
        postDelayed(this.f7331T, 600L);
    }

    void A() {
        if (this.f7337t == null) {
            this.f7337t = (ContentFrameLayout) findViewById(AbstractC5757f.f35484b);
            this.f7338u = (ActionBarContainer) findViewById(AbstractC5757f.f35485c);
            this.f7339v = u(findViewById(AbstractC5757f.f35483a));
        }
    }

    @Override // androidx.appcompat.widget.I
    public void a(Menu menu, j.a aVar) {
        A();
        this.f7339v.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.I
    public boolean b() {
        A();
        return this.f7339v.b();
    }

    @Override // androidx.appcompat.widget.I
    public void c() {
        A();
        this.f7339v.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.I
    public boolean d() {
        A();
        return this.f7339v.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f7340w != null) {
            int bottom = this.f7338u.getVisibility() == 0 ? (int) (this.f7338u.getBottom() + this.f7338u.getTranslationY() + 0.5f) : 0;
            this.f7340w.setBounds(0, bottom, getWidth(), this.f7340w.getIntrinsicHeight() + bottom);
            this.f7340w.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.I
    public boolean e() {
        A();
        return this.f7339v.e();
    }

    @Override // androidx.appcompat.widget.I
    public boolean f() {
        A();
        return this.f7339v.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.I
    public boolean g() {
        A();
        return this.f7339v.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f7338u;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f7333V.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f7339v.getTitle();
    }

    @Override // androidx.appcompat.widget.I
    public void h(int i8) {
        A();
        if (i8 == 2) {
            this.f7339v.w();
        } else if (i8 == 5) {
            this.f7339v.x();
        } else {
            if (i8 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.I
    public void i() {
        A();
        this.f7339v.h();
    }

    @Override // z0.InterfaceC7002F
    public void j(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        k(view, i8, i9, i10, i11, i12);
    }

    @Override // z0.InterfaceC7001E
    public void k(View view, int i8, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            onNestedScroll(view, i8, i9, i10, i11);
        }
    }

    @Override // z0.InterfaceC7001E
    public boolean l(View view, View view2, int i8, int i9) {
        return i9 == 0 && onStartNestedScroll(view, view2, i8);
    }

    @Override // z0.InterfaceC7001E
    public void m(View view, View view2, int i8, int i9) {
        if (i9 == 0) {
            onNestedScrollAccepted(view, view2, i8);
        }
    }

    @Override // z0.InterfaceC7001E
    public void n(View view, int i8) {
        if (i8 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // z0.InterfaceC7001E
    public void o(View view, int i8, int i9, int[] iArr, int i10) {
        if (i10 == 0) {
            onNestedPreScroll(view, i8, i9, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        C7061y0 v7 = C7061y0.v(windowInsets, this);
        boolean q8 = q(this.f7338u, new Rect(v7.i(), v7.k(), v7.j(), v7.h()), true, true, false, true);
        z0.X.f(this, v7, this.f7315D);
        Rect rect = this.f7315D;
        C7061y0 l8 = v7.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f7323L = l8;
        boolean z7 = true;
        if (!this.f7324M.equals(l8)) {
            this.f7324M = this.f7323L;
            q8 = true;
        }
        if (this.f7316E.equals(this.f7315D)) {
            z7 = q8;
        } else {
            this.f7316E.set(this.f7315D);
        }
        if (z7) {
            requestLayout();
        }
        return v7.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        z0.X.k0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f7338u, i8, 0, i9, 0);
        e eVar = (e) this.f7338u.getLayoutParams();
        int max = Math.max(0, this.f7338u.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f7338u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f7338u.getMeasuredState());
        boolean z7 = (z0.X.K(this) & 256) != 0;
        if (z7) {
            measuredHeight = this.f7335o;
            if (this.f7342y && this.f7338u.getTabContainer() != null) {
                measuredHeight += this.f7335o;
            }
        } else {
            measuredHeight = this.f7338u.getVisibility() != 8 ? this.f7338u.getMeasuredHeight() : 0;
        }
        this.f7317F.set(this.f7315D);
        this.f7325N = this.f7323L;
        if (this.f7341x || z7 || !r()) {
            this.f7325N = new C7061y0.a(this.f7325N).d(C6411b.b(this.f7325N.i(), this.f7325N.k() + measuredHeight, this.f7325N.j(), this.f7325N.h())).a();
        } else {
            Rect rect = this.f7317F;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f7325N = this.f7325N.l(0, measuredHeight, 0, 0);
        }
        q(this.f7337t, this.f7317F, true, true, true, true);
        if (!this.f7326O.equals(this.f7325N)) {
            C7061y0 c7061y0 = this.f7325N;
            this.f7326O = c7061y0;
            z0.X.g(this.f7337t, c7061y0);
        }
        measureChildWithMargins(this.f7337t, i8, 0, i9, 0);
        e eVar2 = (e) this.f7337t.getLayoutParams();
        int max3 = Math.max(max, this.f7337t.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f7337t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f7337t.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        if (!this.f7343z || !z7) {
            return false;
        }
        if (C(f9)) {
            p();
        } else {
            B();
        }
        this.f7312A = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        int i12 = this.f7313B + i9;
        this.f7313B = i12;
        setActionBarHideOffset(i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        this.f7333V.b(view, view2, i8);
        this.f7313B = getActionBarHideOffset();
        v();
        d dVar = this.f7327P;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        if ((i8 & 2) == 0 || this.f7338u.getVisibility() != 0) {
            return false;
        }
        return this.f7343z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f7343z && !this.f7312A) {
            if (this.f7313B <= this.f7338u.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f7327P;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i8) {
        super.onWindowSystemUiVisibilityChanged(i8);
        A();
        int i9 = this.f7314C ^ i8;
        this.f7314C = i8;
        boolean z7 = (i8 & 4) == 0;
        boolean z8 = (i8 & 256) != 0;
        d dVar = this.f7327P;
        if (dVar != null) {
            dVar.c(!z8);
            if (z7 || !z8) {
                this.f7327P.a();
            } else {
                this.f7327P.d();
            }
        }
        if ((i9 & 256) == 0 || this.f7327P == null) {
            return;
        }
        z0.X.k0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
        this.f7336s = i8;
        d dVar = this.f7327P;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i8) {
        v();
        this.f7338u.setTranslationY(-Math.max(0, Math.min(i8, this.f7338u.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f7327P = dVar;
        if (getWindowToken() != null) {
            this.f7327P.onWindowVisibilityChanged(this.f7336s);
            int i8 = this.f7314C;
            if (i8 != 0) {
                onWindowSystemUiVisibilityChanged(i8);
                z0.X.k0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.f7342y = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.f7343z) {
            this.f7343z = z7;
            if (z7) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i8) {
        A();
        this.f7339v.setIcon(i8);
    }

    public void setLogo(int i8) {
        A();
        this.f7339v.n(i8);
    }

    public void setOverlayMode(boolean z7) {
        this.f7341x = z7;
    }

    public void setShowingForActionMode(boolean z7) {
    }

    public void setUiOptions(int i8) {
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f7339v.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f7339v.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void v() {
        removeCallbacks(this.f7331T);
        removeCallbacks(this.f7332U);
        ViewPropertyAnimator viewPropertyAnimator = this.f7329R;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f7341x;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f7339v.setIcon(drawable);
    }
}
