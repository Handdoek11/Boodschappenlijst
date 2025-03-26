package com.google.android.material.tabs;

import A0.z;
import D3.j;
import D3.k;
import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import g.AbstractC5794a;
import java.util.ArrayList;
import java.util.Iterator;
import o1.AbstractC6281a;
import o1.AbstractC6282b;
import r0.AbstractC6641a;
import y0.g;
import y0.h;
import z0.C7008L;
import z0.X;

/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: m0, reason: collision with root package name */
    private static final int f32281m0 = k.f1618h;

    /* renamed from: n0, reason: collision with root package name */
    private static final y0.f f32282n0 = new h(16);

    /* renamed from: A, reason: collision with root package name */
    private final int f32283A;

    /* renamed from: B, reason: collision with root package name */
    private int f32284B;

    /* renamed from: C, reason: collision with root package name */
    ColorStateList f32285C;

    /* renamed from: D, reason: collision with root package name */
    ColorStateList f32286D;

    /* renamed from: E, reason: collision with root package name */
    ColorStateList f32287E;

    /* renamed from: F, reason: collision with root package name */
    Drawable f32288F;

    /* renamed from: G, reason: collision with root package name */
    private int f32289G;

    /* renamed from: H, reason: collision with root package name */
    PorterDuff.Mode f32290H;

    /* renamed from: I, reason: collision with root package name */
    float f32291I;

    /* renamed from: J, reason: collision with root package name */
    float f32292J;

    /* renamed from: K, reason: collision with root package name */
    float f32293K;

    /* renamed from: L, reason: collision with root package name */
    final int f32294L;

    /* renamed from: M, reason: collision with root package name */
    int f32295M;

    /* renamed from: N, reason: collision with root package name */
    private final int f32296N;

    /* renamed from: O, reason: collision with root package name */
    private final int f32297O;

    /* renamed from: P, reason: collision with root package name */
    private final int f32298P;

    /* renamed from: Q, reason: collision with root package name */
    private int f32299Q;

    /* renamed from: R, reason: collision with root package name */
    int f32300R;

    /* renamed from: S, reason: collision with root package name */
    int f32301S;

    /* renamed from: T, reason: collision with root package name */
    int f32302T;

    /* renamed from: U, reason: collision with root package name */
    int f32303U;

    /* renamed from: V, reason: collision with root package name */
    boolean f32304V;

    /* renamed from: W, reason: collision with root package name */
    boolean f32305W;

    /* renamed from: a0, reason: collision with root package name */
    int f32306a0;

    /* renamed from: b0, reason: collision with root package name */
    int f32307b0;

    /* renamed from: c0, reason: collision with root package name */
    boolean f32308c0;

    /* renamed from: d0, reason: collision with root package name */
    private com.google.android.material.tabs.c f32309d0;

    /* renamed from: e0, reason: collision with root package name */
    private final TimeInterpolator f32310e0;

    /* renamed from: f0, reason: collision with root package name */
    private b f32311f0;

    /* renamed from: g0, reason: collision with root package name */
    private final ArrayList f32312g0;

    /* renamed from: h0, reason: collision with root package name */
    private b f32313h0;

    /* renamed from: i0, reason: collision with root package name */
    private ValueAnimator f32314i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f32315j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f32316k0;

    /* renamed from: l0, reason: collision with root package name */
    private final y0.f f32317l0;

    /* renamed from: o, reason: collision with root package name */
    int f32318o;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList f32319s;

    /* renamed from: t, reason: collision with root package name */
    private e f32320t;

    /* renamed from: u, reason: collision with root package name */
    final d f32321u;

    /* renamed from: v, reason: collision with root package name */
    int f32322v;

    /* renamed from: w, reason: collision with root package name */
    int f32323w;

    /* renamed from: x, reason: collision with root package name */
    int f32324x;

    /* renamed from: y, reason: collision with root package name */
    int f32325y;

    /* renamed from: z, reason: collision with root package name */
    private final int f32326z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public interface b {
        void a(e eVar);

        void b(e eVar);

        void c(e eVar);
    }

    public interface c extends b {
    }

    class d extends LinearLayout {

        /* renamed from: o, reason: collision with root package name */
        ValueAnimator f32328o;

        /* renamed from: s, reason: collision with root package name */
        private int f32329s;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f32331a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f32332b;

            a(View view, View view2) {
                this.f32331a = view;
                this.f32332b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.this.j(this.f32331a, this.f32332b, valueAnimator.getAnimatedFraction());
            }
        }

        d(Context context) {
            super(context);
            this.f32329s = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f32318o == -1) {
                tabLayout.f32318o = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f32318o);
        }

        private void f(int i8) {
            if (TabLayout.this.f32316k0 == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i8);
                com.google.android.material.tabs.c cVar = TabLayout.this.f32309d0;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f32288F);
                TabLayout.this.f32318o = i8;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f8) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f32288F;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f32288F.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.f32309d0;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f8, tabLayout.f32288F);
            }
            X.e0(this);
        }

        private void k(boolean z7, int i8, int i9) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f32318o == i8) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i8);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f32318o = i8;
            a aVar = new a(childAt, childAt2);
            if (!z7) {
                this.f32328o.removeAllUpdateListeners();
                this.f32328o.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f32328o = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f32310e0);
            valueAnimator.setDuration(i9);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i8, int i9) {
            ValueAnimator valueAnimator = this.f32328o;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f32318o != i8) {
                this.f32328o.cancel();
            }
            k(true, i8, i9);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f32288F.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f32288F.getIntrinsicHeight();
            }
            int i8 = TabLayout.this.f32302T;
            if (i8 == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i8 != 1) {
                height = 0;
                if (i8 != 2) {
                    height2 = i8 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (TabLayout.this.f32288F.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f32288F.getBounds();
                TabLayout.this.f32288F.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.f32288F.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i8, float f8) {
            TabLayout.this.f32318o = Math.round(i8 + f8);
            ValueAnimator valueAnimator = this.f32328o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f32328o.cancel();
            }
            j(getChildAt(i8), getChildAt(i8 + 1), f8);
        }

        void i(int i8) {
            Rect bounds = TabLayout.this.f32288F.getBounds();
            TabLayout.this.f32288F.setBounds(bounds.left, 0, bounds.right, i8);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
            super.onLayout(z7, i8, i9, i10, i11);
            ValueAnimator valueAnimator = this.f32328o;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            if (View.MeasureSpec.getMode(i8) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z7 = true;
            if (tabLayout.f32300R == 1 || tabLayout.f32303U == 2) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() == 0) {
                        i10 = Math.max(i10, childAt.getMeasuredWidth());
                    }
                }
                if (i10 <= 0) {
                    return;
                }
                if (i10 * childCount <= getMeasuredWidth() - (((int) o.c(getContext(), 16)) * 2)) {
                    boolean z8 = false;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i12).getLayoutParams();
                        if (layoutParams.width != i10 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i10;
                            layoutParams.weight = 0.0f;
                            z8 = true;
                        }
                    }
                    z7 = z8;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f32300R = 0;
                    tabLayout2.S(false);
                }
                if (z7) {
                    super.onMeasure(i8, i9);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i8) {
            super.onRtlPropertiesChanged(i8);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private Object f32334a;

        /* renamed from: b, reason: collision with root package name */
        private Drawable f32335b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f32336c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f32337d;

        /* renamed from: f, reason: collision with root package name */
        private View f32339f;

        /* renamed from: h, reason: collision with root package name */
        public TabLayout f32341h;

        /* renamed from: i, reason: collision with root package name */
        public f f32342i;

        /* renamed from: e, reason: collision with root package name */
        private int f32338e = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f32340g = 1;

        /* renamed from: j, reason: collision with root package name */
        private int f32343j = -1;

        public View e() {
            return this.f32339f;
        }

        public Drawable f() {
            return this.f32335b;
        }

        public int g() {
            return this.f32338e;
        }

        public int h() {
            return this.f32340g;
        }

        public CharSequence i() {
            return this.f32336c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f32341h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f32338e;
        }

        void k() {
            this.f32341h = null;
            this.f32342i = null;
            this.f32334a = null;
            this.f32335b = null;
            this.f32343j = -1;
            this.f32336c = null;
            this.f32337d = null;
            this.f32338e = -1;
            this.f32339f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f32341h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.I(this);
        }

        void m(int i8) {
            this.f32338e = i8;
        }

        void n() {
            f fVar = this.f32342i;
            if (fVar != null) {
                fVar.r();
            }
        }
    }

    public final class f extends LinearLayout {

        /* renamed from: A, reason: collision with root package name */
        private int f32344A;

        /* renamed from: o, reason: collision with root package name */
        private e f32346o;

        /* renamed from: s, reason: collision with root package name */
        private TextView f32347s;

        /* renamed from: t, reason: collision with root package name */
        private ImageView f32348t;

        /* renamed from: u, reason: collision with root package name */
        private View f32349u;

        /* renamed from: v, reason: collision with root package name */
        private F3.a f32350v;

        /* renamed from: w, reason: collision with root package name */
        private View f32351w;

        /* renamed from: x, reason: collision with root package name */
        private TextView f32352x;

        /* renamed from: y, reason: collision with root package name */
        private ImageView f32353y;

        /* renamed from: z, reason: collision with root package name */
        private Drawable f32354z;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ View f32355o;

            a(View view) {
                this.f32355o = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                if (this.f32355o.getVisibility() == 0) {
                    f.this.q(this.f32355o);
                }
            }
        }

        public f(Context context) {
            super(context);
            this.f32344A = 2;
            s(context);
            X.B0(this, TabLayout.this.f32322v, TabLayout.this.f32323w, TabLayout.this.f32324x, TabLayout.this.f32325y);
            setGravity(17);
            setOrientation(!TabLayout.this.f32304V ? 1 : 0);
            setClickable(true);
            X.C0(this, C7008L.b(getContext(), 1002));
        }

        private void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float e(Layout layout, int i8, float f8) {
            return layout.getLineWidth(i8) * (f8 / layout.getPaint().getTextSize());
        }

        private void f(boolean z7) {
            setClipChildren(z7);
            setClipToPadding(z7);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z7);
                viewGroup.setClipToPadding(z7);
            }
        }

        private FrameLayout g() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        private F3.a getBadge() {
            return this.f32350v;
        }

        private F3.a getOrCreateBadge() {
            if (this.f32350v == null) {
                this.f32350v = F3.a.d(getContext());
            }
            p();
            F3.a aVar = this.f32350v;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(Canvas canvas) {
            Drawable drawable = this.f32354z;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f32354z.draw(canvas);
            }
        }

        private FrameLayout i(View view) {
            if ((view == this.f32348t || view == this.f32347s) && F3.e.f2363a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        private boolean j() {
            return this.f32350v != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void k() {
            FrameLayout frameLayout;
            if (F3.e.f2363a) {
                frameLayout = g();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(D3.h.f1560c, (ViewGroup) frameLayout, false);
            this.f32348t = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void l() {
            FrameLayout frameLayout;
            if (F3.e.f2363a) {
                frameLayout = g();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(D3.h.f1561d, (ViewGroup) frameLayout, false);
            this.f32347s = textView;
            frameLayout.addView(textView);
        }

        private void n(View view) {
            if (j() && view != null) {
                f(false);
                F3.e.a(this.f32350v, view, i(view));
                this.f32349u = view;
            }
        }

        private void o() {
            if (j()) {
                f(true);
                View view = this.f32349u;
                if (view != null) {
                    F3.e.b(this.f32350v, view);
                    this.f32349u = null;
                }
            }
        }

        private void p() {
            e eVar;
            e eVar2;
            if (j()) {
                if (this.f32351w != null) {
                    o();
                    return;
                }
                if (this.f32348t != null && (eVar2 = this.f32346o) != null && eVar2.f() != null) {
                    View view = this.f32349u;
                    ImageView imageView = this.f32348t;
                    if (view == imageView) {
                        q(imageView);
                        return;
                    } else {
                        o();
                        n(this.f32348t);
                        return;
                    }
                }
                if (this.f32347s == null || (eVar = this.f32346o) == null || eVar.h() != 1) {
                    o();
                    return;
                }
                View view2 = this.f32349u;
                TextView textView = this.f32347s;
                if (view2 == textView) {
                    q(textView);
                } else {
                    o();
                    n(this.f32347s);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(View view) {
            if (j() && view == this.f32349u) {
                F3.e.c(this.f32350v, view, i(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void s(Context context) {
            int i8 = TabLayout.this.f32294L;
            if (i8 != 0) {
                Drawable b8 = AbstractC5794a.b(context, i8);
                this.f32354z = b8;
                if (b8 != null && b8.isStateful()) {
                    this.f32354z.setState(getDrawableState());
                }
            } else {
                this.f32354z = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f32287E != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a8 = T3.b.a(TabLayout.this.f32287E);
                boolean z7 = TabLayout.this.f32308c0;
                if (z7) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a8, gradientDrawable, z7 ? null : gradientDrawable2);
            }
            X.r0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void v(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout$e r0 = r7.f32346o
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.f()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$e r0 = r7.f32346o
                android.graphics.drawable.Drawable r0 = r0.f()
                android.graphics.drawable.Drawable r0 = r0.AbstractC6641a.r(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                if (r0 == 0) goto L2d
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f32286D
                r0.AbstractC6641a.o(r0, r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.f32290H
                if (r2 == 0) goto L2d
                r0.AbstractC6641a.p(r0, r2)
            L2d:
                com.google.android.material.tabs.TabLayout$e r2 = r7.f32346o
                if (r2 == 0) goto L36
                java.lang.CharSequence r2 = r2.i()
                goto L37
            L36:
                r2 = r1
            L37:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L4e
                if (r0 == 0) goto L48
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L4e
            L48:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L4e:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r8 == 0) goto L77
                if (r0 != 0) goto L60
                com.google.android.material.tabs.TabLayout$e r5 = r7.f32346o
                int r5 = com.google.android.material.tabs.TabLayout.e.b(r5)
                r6 = 1
                if (r5 != r6) goto L60
                goto L61
            L60:
                r6 = r4
            L61:
                if (r0 != 0) goto L65
                r5 = r2
                goto L66
            L65:
                r5 = r1
            L66:
                r8.setText(r5)
                if (r6 == 0) goto L6d
                r5 = r4
                goto L6e
            L6d:
                r5 = r3
            L6e:
                r8.setVisibility(r5)
                if (r0 != 0) goto L78
                r7.setVisibility(r4)
                goto L78
            L77:
                r6 = r4
            L78:
                if (r10 == 0) goto Lbc
                if (r9 == 0) goto Lbc
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r6 == 0) goto L94
                int r10 = r9.getVisibility()
                if (r10 != 0) goto L94
                android.content.Context r10 = r7.getContext()
                float r10 = com.google.android.material.internal.o.c(r10, r3)
                int r10 = (int) r10
                goto L95
            L94:
                r10 = r4
            L95:
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.f32304V
                if (r3 == 0) goto Lad
                int r3 = z0.AbstractC7054v.a(r8)
                if (r10 == r3) goto Lbc
                z0.AbstractC7054v.c(r8, r10)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto Lbc
            Lad:
                int r3 = r8.bottomMargin
                if (r10 == r3) goto Lbc
                r8.bottomMargin = r10
                z0.AbstractC7054v.c(r8, r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            Lbc:
                com.google.android.material.tabs.TabLayout$e r8 = r7.f32346o
                if (r8 == 0) goto Lc4
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.e.c(r8)
            Lc4:
                int r8 = android.os.Build.VERSION.SDK_INT
                r9 = 23
                if (r8 <= r9) goto Ld1
                if (r0 != 0) goto Lcd
                goto Lce
            Lcd:
                r2 = r1
            Lce:
                androidx.appcompat.widget.k0.a(r7, r2)
            Ld1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f.v(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f32354z;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f32354z.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f32347s, this.f32348t, this.f32351w};
            int i8 = 0;
            int i9 = 0;
            boolean z7 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    i9 = z7 ? Math.min(i9, view.getTop()) : view.getTop();
                    i8 = z7 ? Math.max(i8, view.getBottom()) : view.getBottom();
                    z7 = true;
                }
            }
            return i8 - i9;
        }

        int getContentWidth() {
            View[] viewArr = {this.f32347s, this.f32348t, this.f32351w};
            int i8 = 0;
            int i9 = 0;
            boolean z7 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    i9 = z7 ? Math.min(i9, view.getLeft()) : view.getLeft();
                    i8 = z7 ? Math.max(i8, view.getRight()) : view.getRight();
                    z7 = true;
                }
            }
            return i8 - i9;
        }

        public e getTab() {
            return this.f32346o;
        }

        void m() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            z M02 = z.M0(accessibilityNodeInfo);
            F3.a aVar = this.f32350v;
            if (aVar != null && aVar.isVisible()) {
                M02.o0(this.f32350v.h());
            }
            M02.n0(z.f.a(0, 1, this.f32346o.g(), 1, false, isSelected()));
            if (isSelected()) {
                M02.l0(false);
                M02.c0(z.a.f38i);
            }
            M02.C0(getResources().getString(j.f1592h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i8, int i9) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i8);
            int mode = View.MeasureSpec.getMode(i8);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i8 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f32295M, Integer.MIN_VALUE);
            }
            super.onMeasure(i8, i9);
            if (this.f32347s != null) {
                float f8 = TabLayout.this.f32291I;
                int i10 = this.f32344A;
                ImageView imageView = this.f32348t;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f32347s;
                    if (textView != null && textView.getLineCount() > 1) {
                        f8 = TabLayout.this.f32293K;
                    }
                } else {
                    i10 = 1;
                }
                float textSize = this.f32347s.getTextSize();
                int lineCount = this.f32347s.getLineCount();
                int d8 = androidx.core.widget.h.d(this.f32347s);
                if (f8 != textSize || (d8 >= 0 && i10 != d8)) {
                    if (TabLayout.this.f32303U != 1 || f8 <= textSize || lineCount != 1 || ((layout = this.f32347s.getLayout()) != null && e(layout, 0, f8) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f32347s.setTextSize(0, f8);
                        this.f32347s.setMaxLines(i10);
                        super.onMeasure(i8, i9);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f32346o == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f32346o.l();
            return true;
        }

        final void r() {
            u();
            e eVar = this.f32346o;
            setSelected(eVar != null && eVar.j());
        }

        @Override // android.view.View
        public void setSelected(boolean z7) {
            isSelected();
            super.setSelected(z7);
            TextView textView = this.f32347s;
            if (textView != null) {
                textView.setSelected(z7);
            }
            ImageView imageView = this.f32348t;
            if (imageView != null) {
                imageView.setSelected(z7);
            }
            View view = this.f32351w;
            if (view != null) {
                view.setSelected(z7);
            }
        }

        void setTab(e eVar) {
            if (eVar != this.f32346o) {
                this.f32346o = eVar;
                r();
            }
        }

        final void t() {
            setOrientation(!TabLayout.this.f32304V ? 1 : 0);
            TextView textView = this.f32352x;
            if (textView == null && this.f32353y == null) {
                v(this.f32347s, this.f32348t, true);
            } else {
                v(textView, this.f32353y, false);
            }
        }

        final void u() {
            ViewParent parent;
            e eVar = this.f32346o;
            View e8 = eVar != null ? eVar.e() : null;
            if (e8 != null) {
                ViewParent parent2 = e8.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(e8);
                    }
                    View view = this.f32351w;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f32351w);
                    }
                    addView(e8);
                }
                this.f32351w = e8;
                TextView textView = this.f32347s;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f32348t;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f32348t.setImageDrawable(null);
                }
                TextView textView2 = (TextView) e8.findViewById(R.id.text1);
                this.f32352x = textView2;
                if (textView2 != null) {
                    this.f32344A = androidx.core.widget.h.d(textView2);
                }
                this.f32353y = (ImageView) e8.findViewById(R.id.icon);
            } else {
                View view2 = this.f32351w;
                if (view2 != null) {
                    removeView(view2);
                    this.f32351w = null;
                }
                this.f32352x = null;
                this.f32353y = null;
            }
            if (this.f32351w == null) {
                if (this.f32348t == null) {
                    k();
                }
                if (this.f32347s == null) {
                    l();
                    this.f32344A = androidx.core.widget.h.d(this.f32347s);
                }
                androidx.core.widget.h.p(this.f32347s, TabLayout.this.f32326z);
                if (!isSelected() || TabLayout.this.f32284B == -1) {
                    androidx.core.widget.h.p(this.f32347s, TabLayout.this.f32283A);
                } else {
                    androidx.core.widget.h.p(this.f32347s, TabLayout.this.f32284B);
                }
                ColorStateList colorStateList = TabLayout.this.f32285C;
                if (colorStateList != null) {
                    this.f32347s.setTextColor(colorStateList);
                }
                v(this.f32347s, this.f32348t, true);
                p();
                d(this.f32348t);
                d(this.f32347s);
            } else {
                TextView textView3 = this.f32352x;
                if (textView3 != null || this.f32353y != null) {
                    v(textView3, this.f32353y, false);
                }
            }
            if (eVar == null || TextUtils.isEmpty(eVar.f32337d)) {
                return;
            }
            setContentDescription(eVar.f32337d);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1395S);
    }

    private boolean A() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void H(int i8) {
        f fVar = (f) this.f32321u.getChildAt(i8);
        this.f32321u.removeViewAt(i8);
        if (fVar != null) {
            fVar.m();
            this.f32317l0.a(fVar);
        }
        requestLayout();
    }

    private void P(AbstractC6282b abstractC6282b, boolean z7, boolean z8) {
        b bVar = this.f32313h0;
        if (bVar != null) {
            G(bVar);
            this.f32313h0 = null;
        }
        K(null, false);
        this.f32315j0 = z8;
    }

    private void Q() {
        int size = this.f32319s.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((e) this.f32319s.get(i8)).n();
        }
    }

    private void R(LinearLayout.LayoutParams layoutParams) {
        if (this.f32303U == 1 && this.f32300R == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.f32319s.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            e eVar = (e) this.f32319s.get(i8);
            if (eVar == null || eVar.f() == null || TextUtils.isEmpty(eVar.i())) {
                i8++;
            } else if (!this.f32304V) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i8 = this.f32296N;
        if (i8 != -1) {
            return i8;
        }
        int i9 = this.f32303U;
        if (i9 == 0 || i9 == 2) {
            return this.f32298P;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f32321u.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void k(e eVar) {
        f fVar = eVar.f32342i;
        fVar.setSelected(false);
        fVar.setActivated(false);
        this.f32321u.addView(fVar, eVar.g(), s());
    }

    private void l(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void m(int i8) {
        if (i8 == -1) {
            return;
        }
        if (getWindowToken() == null || !X.R(this) || this.f32321u.d()) {
            L(i8, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int p8 = p(i8, 0.0f);
        if (scrollX != p8) {
            y();
            this.f32314i0.setIntValues(scrollX, p8);
            this.f32314i0.start();
        }
        this.f32321u.c(i8, this.f32301S);
    }

    private void n(int i8) {
        if (i8 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i8 == 1) {
            this.f32321u.setGravity(1);
            return;
        } else if (i8 != 2) {
            return;
        }
        this.f32321u.setGravity(8388611);
    }

    private void o() {
        int i8 = this.f32303U;
        X.B0(this.f32321u, (i8 == 0 || i8 == 2) ? Math.max(0, this.f32299Q - this.f32322v) : 0, 0, 0, 0);
        int i9 = this.f32303U;
        if (i9 == 0) {
            n(this.f32300R);
        } else if (i9 == 1 || i9 == 2) {
            if (this.f32300R == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f32321u.setGravity(1);
        }
        S(true);
    }

    private int p(int i8, float f8) {
        View childAt;
        int i9 = this.f32303U;
        if ((i9 != 0 && i9 != 2) || (childAt = this.f32321u.getChildAt(i8)) == null) {
            return 0;
        }
        int i10 = i8 + 1;
        View childAt2 = i10 < this.f32321u.getChildCount() ? this.f32321u.getChildAt(i10) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i11 = (int) ((width + width2) * 0.5f * f8);
        return X.z(this) == 0 ? left + i11 : left - i11;
    }

    private void q(e eVar, int i8) {
        eVar.m(i8);
        this.f32319s.add(i8, eVar);
        int size = this.f32319s.size();
        int i9 = -1;
        for (int i10 = i8 + 1; i10 < size; i10++) {
            if (((e) this.f32319s.get(i10)).g() == this.f32318o) {
                i9 = i10;
            }
            ((e) this.f32319s.get(i10)).m(i10);
        }
        this.f32318o = i9;
    }

    private static ColorStateList r(int i8, int i9) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i9, i8});
    }

    private LinearLayout.LayoutParams s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        R(layoutParams);
        return layoutParams;
    }

    private void setSelectedTabView(int i8) {
        int childCount = this.f32321u.getChildCount();
        if (i8 < childCount) {
            int i9 = 0;
            while (i9 < childCount) {
                View childAt = this.f32321u.getChildAt(i9);
                if ((i9 != i8 || childAt.isSelected()) && (i9 == i8 || !childAt.isSelected())) {
                    childAt.setSelected(i9 == i8);
                    childAt.setActivated(i9 == i8);
                } else {
                    childAt.setSelected(i9 == i8);
                    childAt.setActivated(i9 == i8);
                    if (childAt instanceof f) {
                        ((f) childAt).u();
                    }
                }
                i9++;
            }
        }
    }

    private f u(e eVar) {
        y0.f fVar = this.f32317l0;
        f fVar2 = fVar != null ? (f) fVar.b() : null;
        if (fVar2 == null) {
            fVar2 = new f(getContext());
        }
        fVar2.setTab(eVar);
        fVar2.setFocusable(true);
        fVar2.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(eVar.f32337d)) {
            fVar2.setContentDescription(eVar.f32336c);
        } else {
            fVar2.setContentDescription(eVar.f32337d);
        }
        return fVar2;
    }

    private void v(e eVar) {
        for (int size = this.f32312g0.size() - 1; size >= 0; size--) {
            ((b) this.f32312g0.get(size)).a(eVar);
        }
    }

    private void w(e eVar) {
        for (int size = this.f32312g0.size() - 1; size >= 0; size--) {
            ((b) this.f32312g0.get(size)).b(eVar);
        }
    }

    private void x(e eVar) {
        for (int size = this.f32312g0.size() - 1; size >= 0; size--) {
            ((b) this.f32312g0.get(size)).c(eVar);
        }
    }

    private void y() {
        if (this.f32314i0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f32314i0 = valueAnimator;
            valueAnimator.setInterpolator(this.f32310e0);
            this.f32314i0.setDuration(this.f32301S);
            this.f32314i0.addUpdateListener(new a());
        }
    }

    public boolean B() {
        return this.f32305W;
    }

    public e C() {
        e t7 = t();
        t7.f32341h = this;
        t7.f32342i = u(t7);
        if (t7.f32343j != -1) {
            t7.f32342i.setId(t7.f32343j);
        }
        return t7;
    }

    void D() {
        F();
    }

    protected boolean E(e eVar) {
        return f32282n0.a(eVar);
    }

    public void F() {
        for (int childCount = this.f32321u.getChildCount() - 1; childCount >= 0; childCount--) {
            H(childCount);
        }
        Iterator it = this.f32319s.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            it.remove();
            eVar.k();
            E(eVar);
        }
        this.f32320t = null;
    }

    public void G(b bVar) {
        this.f32312g0.remove(bVar);
    }

    public void I(e eVar) {
        J(eVar, true);
    }

    public void J(e eVar, boolean z7) {
        e eVar2 = this.f32320t;
        if (eVar2 == eVar) {
            if (eVar2 != null) {
                v(eVar);
                m(eVar.g());
                return;
            }
            return;
        }
        int g8 = eVar != null ? eVar.g() : -1;
        if (z7) {
            if ((eVar2 == null || eVar2.g() == -1) && g8 != -1) {
                L(g8, 0.0f, true);
            } else {
                m(g8);
            }
            if (g8 != -1) {
                setSelectedTabView(g8);
            }
        }
        this.f32320t = eVar;
        if (eVar2 != null && eVar2.f32341h != null) {
            x(eVar2);
        }
        if (eVar != null) {
            w(eVar);
        }
    }

    void K(AbstractC6281a abstractC6281a, boolean z7) {
        D();
    }

    public void L(int i8, float f8, boolean z7) {
        M(i8, f8, z7, true);
    }

    public void M(int i8, float f8, boolean z7, boolean z8) {
        N(i8, f8, z7, z8, true);
    }

    void N(int i8, float f8, boolean z7, boolean z8, boolean z9) {
        int round = Math.round(i8 + f8);
        if (round < 0 || round >= this.f32321u.getChildCount()) {
            return;
        }
        if (z8) {
            this.f32321u.h(i8, f8);
        }
        ValueAnimator valueAnimator = this.f32314i0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f32314i0.cancel();
        }
        int p8 = p(i8, f8);
        int scrollX = getScrollX();
        boolean z10 = (i8 < getSelectedTabPosition() && p8 >= scrollX) || (i8 > getSelectedTabPosition() && p8 <= scrollX) || i8 == getSelectedTabPosition();
        if (X.z(this) == 1) {
            z10 = (i8 < getSelectedTabPosition() && p8 <= scrollX) || (i8 > getSelectedTabPosition() && p8 >= scrollX) || i8 == getSelectedTabPosition();
        }
        if (z10 || this.f32316k0 == 1 || z9) {
            if (i8 < 0) {
                p8 = 0;
            }
            scrollTo(p8, 0);
        }
        if (z7) {
            setSelectedTabView(round);
        }
    }

    public void O(AbstractC6282b abstractC6282b, boolean z7) {
        P(abstractC6282b, z7, false);
    }

    void S(boolean z7) {
        for (int i8 = 0; i8 < this.f32321u.getChildCount(); i8++) {
            View childAt = this.f32321u.getChildAt(i8);
            childAt.setMinimumWidth(getTabMinWidth());
            R((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z7) {
                childAt.requestLayout();
            }
        }
    }

    void T(int i8) {
        this.f32316k0 = i8;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        l(view);
    }

    public void g(b bVar) {
        if (this.f32312g0.contains(bVar)) {
            return;
        }
        this.f32312g0.add(bVar);
    }

    public int getSelectedTabPosition() {
        e eVar = this.f32320t;
        if (eVar != null) {
            return eVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f32319s.size();
    }

    public int getTabGravity() {
        return this.f32300R;
    }

    public ColorStateList getTabIconTint() {
        return this.f32286D;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f32307b0;
    }

    public int getTabIndicatorGravity() {
        return this.f32302T;
    }

    int getTabMaxWidth() {
        return this.f32295M;
    }

    public int getTabMode() {
        return this.f32303U;
    }

    public ColorStateList getTabRippleColor() {
        return this.f32287E;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f32288F;
    }

    public ColorStateList getTabTextColors() {
        return this.f32285C;
    }

    public void h(c cVar) {
        g(cVar);
    }

    public void i(e eVar, int i8, boolean z7) {
        if (eVar.f32341h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        q(eVar, i8);
        k(eVar);
        if (z7) {
            eVar.l();
        }
    }

    public void j(e eVar, boolean z7) {
        i(eVar, this.f32319s.size(), z7);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        V3.h.e(this);
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f32315j0) {
            setupWithViewPager(null);
            this.f32315j0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i8 = 0; i8 < this.f32321u.getChildCount(); i8++) {
            View childAt = this.f32321u.getChildAt(i8);
            if (childAt instanceof f) {
                ((f) childAt).h(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.M0(accessibilityNodeInfo).m0(z.e.a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return A() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.o.c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f32297O
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.o.c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f32295M = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La9
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f32303U
            if (r0 == 0) goto L81
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L81
            goto La9
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La9
            goto L8b
        L81:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La9
        L8b:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || A()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        V3.h.d(this, f8);
    }

    public void setInlineLabel(boolean z7) {
        if (this.f32304V != z7) {
            this.f32304V = z7;
            for (int i8 = 0; i8 < this.f32321u.getChildCount(); i8++) {
                View childAt = this.f32321u.getChildAt(i8);
                if (childAt instanceof f) {
                    ((f) childAt).t();
                }
            }
            o();
        }
    }

    public void setInlineLabelResource(int i8) {
        setInlineLabel(getResources().getBoolean(i8));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        setOnTabSelectedListener((b) cVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        y();
        this.f32314i0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = AbstractC6641a.r(drawable).mutate();
        this.f32288F = mutate;
        com.google.android.material.drawable.d.k(mutate, this.f32289G);
        int i8 = this.f32306a0;
        if (i8 == -1) {
            i8 = this.f32288F.getIntrinsicHeight();
        }
        this.f32321u.i(i8);
    }

    public void setSelectedTabIndicatorColor(int i8) {
        this.f32289G = i8;
        com.google.android.material.drawable.d.k(this.f32288F, i8);
        S(false);
    }

    public void setSelectedTabIndicatorGravity(int i8) {
        if (this.f32302T != i8) {
            this.f32302T = i8;
            X.e0(this.f32321u);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i8) {
        this.f32306a0 = i8;
        this.f32321u.i(i8);
    }

    public void setTabGravity(int i8) {
        if (this.f32300R != i8) {
            this.f32300R = i8;
            o();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f32286D != colorStateList) {
            this.f32286D = colorStateList;
            Q();
        }
    }

    public void setTabIconTintResource(int i8) {
        setTabIconTint(AbstractC5794a.a(getContext(), i8));
    }

    public void setTabIndicatorAnimationMode(int i8) {
        this.f32307b0 = i8;
        if (i8 == 0) {
            this.f32309d0 = new com.google.android.material.tabs.c();
            return;
        }
        if (i8 == 1) {
            this.f32309d0 = new com.google.android.material.tabs.a();
        } else {
            if (i8 == 2) {
                this.f32309d0 = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i8 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z7) {
        this.f32305W = z7;
        this.f32321u.g();
        X.e0(this.f32321u);
    }

    public void setTabMode(int i8) {
        if (i8 != this.f32303U) {
            this.f32303U = i8;
            o();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f32287E != colorStateList) {
            this.f32287E = colorStateList;
            for (int i8 = 0; i8 < this.f32321u.getChildCount(); i8++) {
                View childAt = this.f32321u.getChildAt(i8);
                if (childAt instanceof f) {
                    ((f) childAt).s(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i8) {
        setTabRippleColor(AbstractC5794a.a(getContext(), i8));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f32285C != colorStateList) {
            this.f32285C = colorStateList;
            Q();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC6281a abstractC6281a) {
        K(abstractC6281a, false);
    }

    public void setUnboundedRipple(boolean z7) {
        if (this.f32308c0 != z7) {
            this.f32308c0 = z7;
            for (int i8 = 0; i8 < this.f32321u.getChildCount(); i8++) {
                View childAt = this.f32321u.getChildAt(i8);
                if (childAt instanceof f) {
                    ((f) childAt).s(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i8) {
        setUnboundedRipple(getResources().getBoolean(i8));
    }

    public void setupWithViewPager(AbstractC6282b abstractC6282b) {
        O(abstractC6282b, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected e t() {
        e eVar = (e) f32282n0.b();
        return eVar == null ? new e() : eVar;
    }

    public e z(int i8) {
        if (i8 < 0 || i8 >= getTabCount()) {
            return null;
        }
        return (e) this.f32319s.get(i8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f32281m0;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        this.f32318o = -1;
        this.f32319s = new ArrayList();
        this.f32284B = -1;
        this.f32289G = 0;
        this.f32295M = Integer.MAX_VALUE;
        this.f32306a0 = -1;
        this.f32312g0 = new ArrayList();
        this.f32317l0 = new g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        d dVar = new d(context2);
        this.f32321u = dVar;
        super.addView(dVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray i10 = l.i(context2, attributeSet, D3.l.f1735M5, i8, i9, D3.l.f1947l6);
        ColorStateList f8 = com.google.android.material.drawable.d.f(getBackground());
        if (f8 != null) {
            V3.g gVar = new V3.g();
            gVar.U(f8);
            gVar.J(context2);
            gVar.T(X.u(this));
            X.r0(this, gVar);
        }
        setSelectedTabIndicator(S3.c.d(context2, i10, D3.l.f1783S5));
        setSelectedTabIndicatorColor(i10.getColor(D3.l.f1807V5, 0));
        dVar.i(i10.getDimensionPixelSize(D3.l.f1831Y5, -1));
        setSelectedTabIndicatorGravity(i10.getInt(D3.l.f1823X5, 0));
        setTabIndicatorAnimationMode(i10.getInt(D3.l.f1799U5, 0));
        setTabIndicatorFullWidth(i10.getBoolean(D3.l.f1815W5, true));
        int dimensionPixelSize = i10.getDimensionPixelSize(D3.l.f1875d6, 0);
        this.f32325y = dimensionPixelSize;
        this.f32324x = dimensionPixelSize;
        this.f32323w = dimensionPixelSize;
        this.f32322v = dimensionPixelSize;
        this.f32322v = i10.getDimensionPixelSize(D3.l.f1902g6, dimensionPixelSize);
        this.f32323w = i10.getDimensionPixelSize(D3.l.f1911h6, this.f32323w);
        this.f32324x = i10.getDimensionPixelSize(D3.l.f1893f6, this.f32324x);
        this.f32325y = i10.getDimensionPixelSize(D3.l.f1884e6, this.f32325y);
        if (l.g(context2)) {
            this.f32326z = D3.b.f1398V;
        } else {
            this.f32326z = D3.b.f1396T;
        }
        int resourceId = i10.getResourceId(D3.l.f1947l6, k.f1613c);
        this.f32283A = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, f.j.f35640S2);
        try {
            this.f32291I = obtainStyledAttributes.getDimensionPixelSize(f.j.f35644T2, 0);
            this.f32285C = S3.c.a(context2, obtainStyledAttributes, f.j.f35656W2);
            obtainStyledAttributes.recycle();
            if (i10.hasValue(D3.l.f1929j6)) {
                this.f32284B = i10.getResourceId(D3.l.f1929j6, resourceId);
            }
            int i11 = this.f32284B;
            if (i11 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i11, f.j.f35640S2);
                try {
                    this.f32292J = obtainStyledAttributes.getDimensionPixelSize(f.j.f35644T2, (int) this.f32291I);
                    ColorStateList a8 = S3.c.a(context2, obtainStyledAttributes, f.j.f35656W2);
                    if (a8 != null) {
                        this.f32285C = r(this.f32285C.getDefaultColor(), a8.getColorForState(new int[]{R.attr.state_selected}, a8.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (i10.hasValue(D3.l.f1956m6)) {
                this.f32285C = S3.c.a(context2, i10, D3.l.f1956m6);
            }
            if (i10.hasValue(D3.l.f1938k6)) {
                this.f32285C = r(this.f32285C.getDefaultColor(), i10.getColor(D3.l.f1938k6, 0));
            }
            this.f32286D = S3.c.a(context2, i10, D3.l.f1767Q5);
            this.f32290H = o.i(i10.getInt(D3.l.f1775R5, -1), null);
            this.f32287E = S3.c.a(context2, i10, D3.l.f1920i6);
            this.f32301S = i10.getInt(D3.l.f1791T5, 300);
            this.f32310e0 = Q3.d.g(context2, D3.b.f1384H, E3.a.f2146b);
            this.f32296N = i10.getDimensionPixelSize(D3.l.f1857b6, -1);
            this.f32297O = i10.getDimensionPixelSize(D3.l.f1848a6, -1);
            this.f32294L = i10.getResourceId(D3.l.f1743N5, 0);
            this.f32299Q = i10.getDimensionPixelSize(D3.l.f1751O5, 0);
            this.f32303U = i10.getInt(D3.l.f1866c6, 1);
            this.f32300R = i10.getInt(D3.l.f1759P5, 0);
            this.f32304V = i10.getBoolean(D3.l.f1839Z5, false);
            this.f32308c0 = i10.getBoolean(D3.l.f1965n6, false);
            i10.recycle();
            Resources resources = getResources();
            this.f32293K = resources.getDimensionPixelSize(D3.d.f1478h);
            this.f32298P = resources.getDimensionPixelSize(D3.d.f1476g);
            o();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i8) {
        l(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(b bVar) {
        b bVar2 = this.f32311f0;
        if (bVar2 != null) {
            G(bVar2);
        }
        this.f32311f0 = bVar;
        if (bVar != null) {
            g(bVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        l(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        l(view);
    }

    public void setSelectedTabIndicator(int i8) {
        if (i8 != 0) {
            setSelectedTabIndicator(AbstractC5794a.b(getContext(), i8));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
