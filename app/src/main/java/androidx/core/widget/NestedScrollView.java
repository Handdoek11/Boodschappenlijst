package androidx.core.widget;

import A0.B;
import A0.z;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import n0.AbstractC6242a;
import v0.C6822a;
import z0.AbstractC6999C;
import z0.C7000D;
import z0.C7003G;
import z0.C7013a;
import z0.C7041o;
import z0.InterfaceC7002F;
import z0.InterfaceC7043p;
import z0.X;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC7002F {

    /* renamed from: U, reason: collision with root package name */
    private static final float f9209U = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: V, reason: collision with root package name */
    private static final a f9210V = new a();

    /* renamed from: W, reason: collision with root package name */
    private static final int[] f9211W = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    private View f9212A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f9213B;

    /* renamed from: C, reason: collision with root package name */
    private VelocityTracker f9214C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f9215D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f9216E;

    /* renamed from: F, reason: collision with root package name */
    private int f9217F;

    /* renamed from: G, reason: collision with root package name */
    private int f9218G;

    /* renamed from: H, reason: collision with root package name */
    private int f9219H;

    /* renamed from: I, reason: collision with root package name */
    private int f9220I;

    /* renamed from: J, reason: collision with root package name */
    private final int[] f9221J;

    /* renamed from: K, reason: collision with root package name */
    private final int[] f9222K;

    /* renamed from: L, reason: collision with root package name */
    private int f9223L;

    /* renamed from: M, reason: collision with root package name */
    private int f9224M;

    /* renamed from: N, reason: collision with root package name */
    private f f9225N;

    /* renamed from: O, reason: collision with root package name */
    private final C7003G f9226O;

    /* renamed from: P, reason: collision with root package name */
    private final C7000D f9227P;

    /* renamed from: Q, reason: collision with root package name */
    private float f9228Q;

    /* renamed from: R, reason: collision with root package name */
    private e f9229R;

    /* renamed from: S, reason: collision with root package name */
    final d f9230S;

    /* renamed from: T, reason: collision with root package name */
    C7041o f9231T;

    /* renamed from: o, reason: collision with root package name */
    private final float f9232o;

    /* renamed from: s, reason: collision with root package name */
    private long f9233s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f9234t;

    /* renamed from: u, reason: collision with root package name */
    private OverScroller f9235u;

    /* renamed from: v, reason: collision with root package name */
    public EdgeEffect f9236v;

    /* renamed from: w, reason: collision with root package name */
    public EdgeEffect f9237w;

    /* renamed from: x, reason: collision with root package name */
    private int f9238x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f9239y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f9240z;

    static class a extends C7013a {
        a() {
        }

        @Override // z0.C7013a
        public void j(View view, AccessibilityEvent accessibilityEvent) {
            super.j(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            B.a(accessibilityEvent, nestedScrollView.getScrollX());
            B.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // z0.C7013a
        public void k(View view, z zVar) {
            int scrollRange;
            super.k(view, zVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            zVar.k0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            zVar.E0(true);
            if (nestedScrollView.getScrollY() > 0) {
                zVar.b(z.a.f47r);
                zVar.b(z.a.f14C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                zVar.b(z.a.f46q);
                zVar.b(z.a.f16E);
            }
        }

        @Override // z0.C7013a
        public boolean n(View view, int i8, Bundle bundle) {
            if (super.n(view, i8, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i8 != 4096) {
                if (i8 == 8192 || i8 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                }
                if (i8 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private static final class c {
        public static void a(View view, float f8) {
            try {
                view.setFrameContentVelocity(f8);
            } catch (LinkageError unused) {
            }
        }
    }

    class d implements InterfaceC7043p {
        d() {
        }

        @Override // z0.InterfaceC7043p
        public boolean a(float f8) {
            if (f8 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f8);
            return true;
        }

        @Override // z0.InterfaceC7043p
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // z0.InterfaceC7043p
        public void c() {
            NestedScrollView.this.f9235u.abortAnimation();
        }
    }

    public interface e {
        void a(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11);
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public int f9242o;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i8) {
                return new f[i8];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f9242o + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f9242o);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f9242o = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6242a.f39480c);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f9214C;
        if (velocityTracker == null) {
            this.f9214C = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f9235u = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9217F = viewConfiguration.getScaledTouchSlop();
        this.f9218G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9219H = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f9214C == null) {
            this.f9214C = VelocityTracker.obtain();
        }
    }

    private void D(int i8, int i9) {
        this.f9238x = i8;
        this.f9220I = i9;
        X(2, 0);
    }

    private boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private boolean G(View view, int i8, int i9) {
        view.getDrawingRect(this.f9234t);
        offsetDescendantRectToMyCoords(view, this.f9234t);
        return this.f9234t.bottom + i8 >= getScrollY() && this.f9234t.top - i8 <= getScrollY() + i9;
    }

    private void H(int i8, int i9, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i8);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f9227P.e(0, scrollY2, 0, i8 - scrollY2, null, i9, iArr);
    }

    private void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9220I) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f9238x = (int) motionEvent.getY(i8);
            this.f9220I = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.f9214C;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.f9214C;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9214C = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f9236v
            float r0 = androidx.core.widget.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f9236v
            float r4 = -r4
            float r4 = androidx.core.widget.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f9236v
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f9236v
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f9237w
            float r0 = androidx.core.widget.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f9237w
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f9237w
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f9237w
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    private void N(boolean z7) {
        if (z7) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f9224M = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean O(int i8, int i9, int i10) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        boolean z7 = false;
        boolean z8 = i8 == 33;
        View u7 = u(z8, i9, i10);
        if (u7 == null) {
            u7 = this;
        }
        if (i9 < scrollY || i10 > i11) {
            P(z8 ? i9 - scrollY : i10 - i11, 0, 1, true);
            z7 = true;
        }
        if (u7 != findFocus()) {
            u7.requestFocus(i8);
        }
        return z7;
    }

    private int P(int i8, int i9, int i10, boolean z7) {
        int i11;
        int i12;
        VelocityTracker velocityTracker;
        if (i10 == 1) {
            X(2, i10);
        }
        boolean z8 = false;
        if (i(0, i8, this.f9222K, this.f9221J, i10)) {
            i11 = i8 - this.f9222K[1];
            i12 = this.f9221J[1];
        } else {
            i11 = i8;
            i12 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z9 = d() && !z7;
        boolean z10 = J(0, i11, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i10);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f9222K;
        iArr[1] = 0;
        p(0, scrollY2, 0, i11 - scrollY2, this.f9221J, i10, iArr);
        int i13 = i12 + this.f9221J[1];
        int i14 = i11 - this.f9222K[1];
        int i15 = scrollY + i14;
        if (i15 < 0) {
            if (z9) {
                androidx.core.widget.d.d(this.f9236v, (-i14) / getHeight(), i9 / getWidth());
                if (!this.f9237w.isFinished()) {
                    this.f9237w.onRelease();
                }
            }
        } else if (i15 > scrollRange && z9) {
            androidx.core.widget.d.d(this.f9237w, i14 / getHeight(), 1.0f - (i9 / getWidth()));
            if (!this.f9236v.isFinished()) {
                this.f9236v.onRelease();
            }
        }
        if (this.f9236v.isFinished() && this.f9237w.isFinished()) {
            z8 = z10;
        } else {
            postInvalidateOnAnimation();
        }
        if (z8 && i10 == 0 && (velocityTracker = this.f9214C) != null) {
            velocityTracker.clear();
        }
        if (i10 == 1) {
            Z(i10);
            this.f9236v.onRelease();
            this.f9237w.onRelease();
        }
        return i13;
    }

    private void Q(View view) {
        view.getDrawingRect(this.f9234t);
        offsetDescendantRectToMyCoords(view, this.f9234t);
        int g8 = g(this.f9234t);
        if (g8 != 0) {
            scrollBy(0, g8);
        }
    }

    private boolean R(Rect rect, boolean z7) {
        int g8 = g(rect);
        boolean z8 = g8 != 0;
        if (z8) {
            if (z7) {
                scrollBy(0, g8);
            } else {
                T(0, g8);
            }
        }
        return z8;
    }

    private boolean S(EdgeEffect edgeEffect, int i8) {
        if (i8 > 0) {
            return true;
        }
        return x(-i8) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void U(int i8, int i9, int i10, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f9233s > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f9235u.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i9 + scrollY, Math.max(0, height - height2))) - scrollY, i10);
            N(z7);
        } else {
            if (!this.f9235u.isFinished()) {
                a();
            }
            scrollBy(i8, i9);
        }
        this.f9233s = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean Y(MotionEvent motionEvent) {
        boolean z7;
        if (androidx.core.widget.d.b(this.f9236v) != 0.0f) {
            androidx.core.widget.d.d(this.f9236v, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        if (androidx.core.widget.d.b(this.f9237w) == 0.0f) {
            return z7;
        }
        androidx.core.widget.d.d(this.f9237w, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f9235u.abortAnimation();
        Z(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i8, int i9, int i10) {
        if (i9 >= i10 || i8 < 0) {
            return 0;
        }
        return i9 + i8 > i10 ? i10 - i9 : i8;
    }

    private void q(int i8) {
        if (i8 != 0) {
            if (this.f9216E) {
                T(0, i8);
            } else {
                scrollBy(0, i8);
            }
        }
    }

    private boolean r(int i8) {
        if (androidx.core.widget.d.b(this.f9236v) != 0.0f) {
            if (S(this.f9236v, i8)) {
                this.f9236v.onAbsorb(i8);
            } else {
                v(-i8);
            }
        } else {
            if (androidx.core.widget.d.b(this.f9237w) == 0.0f) {
                return false;
            }
            int i9 = -i8;
            if (S(this.f9237w, i9)) {
                this.f9237w.onAbsorb(i9);
            } else {
                v(i9);
            }
        }
        return true;
    }

    private void s() {
        this.f9220I = -1;
        this.f9213B = false;
        L();
        Z(0);
        this.f9236v.onRelease();
        this.f9237w.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View u(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.u(boolean, int, int):android.view.View");
    }

    private float x(int i8) {
        double log = Math.log((Math.abs(i8) * 0.35f) / (this.f9232o * 0.015f));
        float f8 = f9209U;
        return (float) (this.f9232o * 0.015f * Math.exp((f8 / (f8 - 1.0d)) * log));
    }

    private boolean z(int i8, int i9) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i9 >= childAt.getTop() - scrollY && i9 < childAt.getBottom() - scrollY && i8 >= childAt.getLeft() && i8 < childAt.getRight();
    }

    boolean J(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z7) {
        boolean z8;
        boolean z9;
        int overScrollMode = getOverScrollMode();
        boolean z10 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z11 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        boolean z13 = overScrollMode == 0 || (overScrollMode == 1 && z11);
        int i16 = i10 + i8;
        int i17 = !z12 ? 0 : i14;
        int i18 = i11 + i9;
        int i19 = !z13 ? 0 : i15;
        int i20 = -i17;
        int i21 = i17 + i12;
        int i22 = -i19;
        int i23 = i19 + i13;
        if (i16 > i21) {
            i16 = i21;
            z8 = true;
        } else if (i16 < i20) {
            z8 = true;
            i16 = i20;
        } else {
            z8 = false;
        }
        if (i18 > i23) {
            i18 = i23;
            z9 = true;
        } else if (i18 < i22) {
            z9 = true;
            i18 = i22;
        } else {
            z9 = false;
        }
        if (z9 && !y(1)) {
            this.f9235u.springBack(i16, i18, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i16, i18, z8, z9);
        return z8 || z9;
    }

    public boolean K(int i8) {
        boolean z7 = i8 == 130;
        int height = getHeight();
        if (z7) {
            this.f9234t.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f9234t;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f9234t.top = getScrollY() - height;
            Rect rect2 = this.f9234t;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f9234t;
        int i9 = rect3.top;
        int i10 = height + i9;
        rect3.bottom = i10;
        return O(i8, i9, i10);
    }

    public final void T(int i8, int i9) {
        U(i8, i9, 250, false);
    }

    void V(int i8, int i9, int i10, boolean z7) {
        U(i8 - getScrollX(), i9 - getScrollY(), i10, z7);
    }

    void W(int i8, int i9, boolean z7) {
        V(i8, i9, 250, z7);
    }

    public boolean X(int i8, int i9) {
        return this.f9227P.p(i8, i9);
    }

    public void Z(int i8) {
        this.f9227P.r(i8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i8) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i8);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i8 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i8 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i8 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f9234t);
            offsetDescendantRectToMyCoords(findNextFocus, this.f9234t);
            P(g(this.f9234t), 0, 1, true);
            findNextFocus.requestFocus(i8);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f9235u.isFinished()) {
            return;
        }
        this.f9235u.computeScrollOffset();
        int currY = this.f9235u.getCurrY();
        int h8 = h(currY - this.f9224M);
        this.f9224M = currY;
        int[] iArr = this.f9222K;
        iArr[1] = 0;
        i(0, h8, iArr, null, 1);
        int i8 = h8 - this.f9222K[1];
        int scrollRange = getScrollRange();
        if (C6822a.c()) {
            c.a(this, Math.abs(this.f9235u.getCurrVelocity()));
        }
        if (i8 != 0) {
            int scrollY = getScrollY();
            J(0, i8, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i9 = i8 - scrollY2;
            int[] iArr2 = this.f9222K;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i9, this.f9221J, 1, iArr2);
            i8 = i9 - this.f9222K[1];
        }
        if (i8 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i8 < 0) {
                    if (this.f9236v.isFinished()) {
                        this.f9236v.onAbsorb((int) this.f9235u.getCurrVelocity());
                    }
                } else if (this.f9237w.isFinished()) {
                    this.f9237w.onAbsorb((int) this.f9235u.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f9235u.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f8, float f9, boolean z7) {
        return this.f9227P.a(f8, f9, z7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.f9227P.b(f8, f9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return i(i8, i9, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return this.f9227P.f(i8, i9, i10, i11, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i8;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i9 = 0;
        if (!this.f9236v.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i8 = getPaddingLeft();
            } else {
                i8 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i8, min);
            this.f9236v.setSize(width, height);
            if (this.f9236v.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.f9237w.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i9 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i9 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f9237w.setSize(width2, height2);
        if (this.f9237w.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i9 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i8 - verticalFadingEdgeLength : i8;
        int i10 = rect.bottom;
        if (i10 > i9 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i9, (childAt.getBottom() + layoutParams.bottomMargin) - i8);
        }
        if (rect.top >= scrollY || i10 >= i9) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i9 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f9226O.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f9228Q == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f9228Q = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f9228Q;
    }

    int h(int i8) {
        int height = getHeight();
        if (i8 > 0 && androidx.core.widget.d.b(this.f9236v) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f9236v, ((-i8) * 4.0f) / height, 0.5f));
            if (round != i8) {
                this.f9236v.finish();
            }
            return i8 - round;
        }
        if (i8 >= 0 || androidx.core.widget.d.b(this.f9237w) == 0.0f) {
            return i8;
        }
        float f8 = height;
        int round2 = Math.round((f8 / 4.0f) * androidx.core.widget.d.d(this.f9237w, (i8 * 4.0f) / f8, 0.5f));
        if (round2 != i8) {
            this.f9237w.finish();
        }
        return i8 - round2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public boolean i(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        return this.f9227P.d(i8, i9, iArr, iArr2, i10);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f9227P.l();
    }

    @Override // z0.InterfaceC7002F
    public void j(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        H(i11, i12, iArr);
    }

    @Override // z0.InterfaceC7001E
    public void k(View view, int i8, int i9, int i10, int i11, int i12) {
        H(i11, i12, null);
    }

    @Override // z0.InterfaceC7001E
    public boolean l(View view, View view2, int i8, int i9) {
        return (i8 & 2) != 0;
    }

    @Override // z0.InterfaceC7001E
    public void m(View view, View view2, int i8, int i9) {
        this.f9226O.c(view, view2, i8, i9);
        X(2, i9);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i8, int i9) {
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // z0.InterfaceC7001E
    public void n(View view, int i8) {
        this.f9226O.d(view, i8);
        Z(i8);
    }

    @Override // z0.InterfaceC7001E
    public void o(View view, int i8, int i9, int[] iArr, int i10) {
        i(i8, i9, iArr, null, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9240z = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i8;
        int i9;
        float f8;
        if (motionEvent.getAction() == 8 && !this.f9213B) {
            if (AbstractC6999C.a(motionEvent, 2)) {
                i8 = 9;
                f8 = motionEvent.getAxisValue(9);
                i9 = (int) motionEvent.getX();
            } else if (AbstractC6999C.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i9 = getWidth() / 2;
                i8 = 26;
                f8 = axisValue;
            } else {
                i8 = 0;
                i9 = 0;
                f8 = 0.0f;
            }
            if (f8 != 0.0f) {
                P(-((int) (f8 * getVerticalScrollFactorCompat())), i9, 1, AbstractC6999C.a(motionEvent, 8194));
                if (i8 != 0) {
                    this.f9231T.g(motionEvent, i8);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        int i12 = 0;
        this.f9239y = false;
        View view = this.f9212A;
        if (view != null && F(view, this)) {
            Q(this.f9212A);
        }
        this.f9212A = null;
        if (!this.f9240z) {
            if (this.f9225N != null) {
                scrollTo(getScrollX(), this.f9225N.f9242o);
                this.f9225N = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i12 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int f8 = f(scrollY, paddingTop, i12);
            if (f8 != scrollY) {
                scrollTo(getScrollX(), f8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f9240z = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f9215D && View.MeasureSpec.getMode(i9) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        if (z7) {
            return false;
        }
        dispatchNestedFling(0.0f, f9, true);
        v((int) f9);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return dispatchNestedPreFling(f8, f9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
        o(view, i8, i9, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        H(i11, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        m(view, view2, i8, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i8, int i9, boolean z7, boolean z8) {
        super.scrollTo(i8, i9);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (i8 == 2) {
            i8 = 130;
        } else if (i8 == 1) {
            i8 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i8) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i8);
        if (findNextFocus == null || E(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i8, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f9225N = fVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f9242o = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i8, int i9, int i10, int i11) {
        super.onScrollChanged(i8, i9, i10, i11);
        e eVar = this.f9229R;
        if (eVar != null) {
            eVar.a(this, i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !G(findFocus, 0, i11)) {
            return;
        }
        findFocus.getDrawingRect(this.f9234t);
        offsetDescendantRectToMyCoords(findFocus, this.f9234t);
        q(g(this.f9234t));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        return l(view, view2, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9223L = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f9223L);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f9214C;
                velocityTracker.computeCurrentVelocity(1000, this.f9219H);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f9220I);
                if (Math.abs(yVelocity) >= this.f9218G) {
                    if (!r(yVelocity)) {
                        int i8 = -yVelocity;
                        float f8 = i8;
                        if (!dispatchNestedPreFling(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            v(i8);
                        }
                    }
                } else if (this.f9235u.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f9220I);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f9220I + " in onTouchEvent");
                } else {
                    int y7 = (int) motionEvent.getY(findPointerIndex);
                    int i9 = this.f9238x - y7;
                    int M7 = i9 - M(i9, motionEvent.getX(findPointerIndex));
                    if (!this.f9213B && Math.abs(M7) > this.f9217F) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f9213B = true;
                        M7 = M7 > 0 ? M7 - this.f9217F : M7 + this.f9217F;
                    }
                    if (this.f9213B) {
                        int P7 = P(M7, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f9238x = y7 - P7;
                        this.f9223L += P7;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f9213B && getChildCount() > 0 && this.f9235u.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f9238x = (int) motionEvent.getY(actionIndex);
                this.f9220I = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f9238x = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f9220I));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f9213B && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f9235u.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f9214C;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        this.f9227P.e(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f9239y) {
            this.f9212A = view2;
        } else {
            Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        if (z7) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f9239y = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i8, int i9) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int f8 = f(i8, width, width2);
            int f9 = f(i9, height, height2);
            if (f8 == getScrollX() && f9 == getScrollY()) {
                return;
            }
            super.scrollTo(f8, f9);
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.f9215D) {
            this.f9215D = z7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        this.f9227P.m(z7);
    }

    public void setOnScrollChangeListener(e eVar) {
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.f9216E = z7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i8) {
        return X(i8, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f9234t.setEmpty();
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? w(33) : c(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? w(130) : c(130);
        }
        if (keyCode == 62) {
            K(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return w(33);
        }
        if (keyCode == 93) {
            return w(130);
        }
        if (keyCode == 122) {
            K(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        K(130);
        return false;
    }

    public void v(int i8) {
        if (getChildCount() > 0) {
            this.f9235u.fling(getScrollX(), getScrollY(), 0, i8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
            if (C6822a.c()) {
                c.a(this, Math.abs(this.f9235u.getCurrVelocity()));
            }
        }
    }

    public boolean w(int i8) {
        int childCount;
        boolean z7 = i8 == 130;
        int height = getHeight();
        Rect rect = this.f9234t;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f9234t.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f9234t;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f9234t;
        return O(i8, rect3.top, rect3.bottom);
    }

    public boolean y(int i8) {
        return this.f9227P.k(i8);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f9234t = new Rect();
        this.f9239y = true;
        this.f9240z = false;
        this.f9212A = null;
        this.f9213B = false;
        this.f9216E = true;
        this.f9220I = -1;
        this.f9221J = new int[2];
        this.f9222K = new int[2];
        d dVar = new d();
        this.f9230S = dVar;
        this.f9231T = new C7041o(getContext(), dVar);
        this.f9236v = androidx.core.widget.d.a(context, attributeSet);
        this.f9237w = androidx.core.widget.d.a(context, attributeSet);
        this.f9232o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9211W, i8, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f9226O = new C7003G(this);
        this.f9227P = new C7000D(this);
        setNestedScrollingEnabled(true);
        X.n0(this, f9210V);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8) {
        if (getChildCount() <= 0) {
            super.addView(view, i8);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
