package com.google.android.material.behavior;

import D3.b;
import Q3.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: j, reason: collision with root package name */
    private static final int f31392j = b.f1426y;

    /* renamed from: k, reason: collision with root package name */
    private static final int f31393k = b.f1378B;

    /* renamed from: l, reason: collision with root package name */
    private static final int f31394l = b.f1384H;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f31395a;

    /* renamed from: b, reason: collision with root package name */
    private int f31396b;

    /* renamed from: c, reason: collision with root package name */
    private int f31397c;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f31398d;

    /* renamed from: e, reason: collision with root package name */
    private TimeInterpolator f31399e;

    /* renamed from: f, reason: collision with root package name */
    private int f31400f;

    /* renamed from: g, reason: collision with root package name */
    private int f31401g;

    /* renamed from: h, reason: collision with root package name */
    private int f31402h;

    /* renamed from: i, reason: collision with root package name */
    private ViewPropertyAnimator f31403i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f31403i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f31395a = new LinkedHashSet();
        this.f31400f = 0;
        this.f31401g = 2;
        this.f31402h = 0;
    }

    private void F(View view, int i8, long j8, TimeInterpolator timeInterpolator) {
        this.f31403i = view.animate().translationY(i8).setInterpolator(timeInterpolator).setDuration(j8).setListener(new a());
    }

    private void M(View view, int i8) {
        this.f31401g = i8;
        Iterator it = this.f31395a.iterator();
        if (it.hasNext()) {
            E.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i9) {
        return i8 == 2;
    }

    public boolean G() {
        return this.f31401g == 1;
    }

    public boolean H() {
        return this.f31401g == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z7) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f31403i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 1);
        int i8 = this.f31400f + this.f31402h;
        if (z7) {
            F(view, i8, this.f31397c, this.f31399e);
        } else {
            view.setTranslationY(i8);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z7) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f31403i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 2);
        if (z7) {
            F(view, 0, this.f31396b, this.f31398d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
        this.f31400f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f31396b = d.f(view.getContext(), f31392j, 225);
        this.f31397c = d.f(view.getContext(), f31393k, 175);
        Context context = view.getContext();
        int i9 = f31394l;
        this.f31398d = d.g(context, i9, E3.a.f2148d);
        this.f31399e = d.g(view.getContext(), i9, E3.a.f2147c);
        return super.l(coordinatorLayout, view, i8);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        if (i9 > 0) {
            I(view);
        } else if (i9 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31395a = new LinkedHashSet();
        this.f31400f = 0;
        this.f31401g = 2;
        this.f31402h = 0;
    }
}
