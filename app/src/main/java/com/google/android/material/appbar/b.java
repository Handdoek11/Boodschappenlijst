package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import t0.AbstractC6779a;
import z0.AbstractC7048s;
import z0.C7061y0;
import z0.X;

/* loaded from: classes2.dex */
abstract class b extends c {

    /* renamed from: d, reason: collision with root package name */
    final Rect f31378d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f31379e;

    /* renamed from: f, reason: collision with root package name */
    private int f31380f;

    /* renamed from: g, reason: collision with root package name */
    private int f31381g;

    public b() {
        this.f31378d = new Rect();
        this.f31379e = new Rect();
        this.f31380f = 0;
    }

    private static int L(int i8) {
        if (i8 == 0) {
            return 8388659;
        }
        return i8;
    }

    @Override // com.google.android.material.appbar.c
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i8) {
        View G7 = G(coordinatorLayout.r(view));
        if (G7 == null) {
            super.F(coordinatorLayout, view, i8);
            this.f31380f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f31378d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, G7.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + G7.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        C7061y0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && X.w(coordinatorLayout) && !X.w(view)) {
            rect.left += lastWindowInsets.i();
            rect.right -= lastWindowInsets.j();
        }
        Rect rect2 = this.f31379e;
        AbstractC7048s.a(L(fVar.f9047c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i8);
        int H7 = H(G7);
        view.layout(rect2.left, rect2.top - H7, rect2.right, rect2.bottom - H7);
        this.f31380f = rect2.top - G7.getBottom();
    }

    abstract View G(List list);

    final int H(View view) {
        if (this.f31381g == 0) {
            return 0;
        }
        float I7 = I(view);
        int i8 = this.f31381g;
        return AbstractC6779a.b((int) (I7 * i8), 0, i8);
    }

    abstract float I(View view);

    int J(View view) {
        return view.getMeasuredHeight();
    }

    final int K() {
        return this.f31380f;
    }

    public final void M(int i8) {
        this.f31381g = i8;
    }

    protected boolean N() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int i11) {
        View G7;
        C7061y0 lastWindowInsets;
        int i12 = view.getLayoutParams().height;
        if ((i12 != -1 && i12 != -2) || (G7 = G(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (X.w(G7) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.k() + lastWindowInsets.h();
        }
        int J7 = size + J(G7);
        int measuredHeight = G7.getMeasuredHeight();
        if (N()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            J7 -= measuredHeight;
        }
        coordinatorLayout.I(view, i8, i9, View.MeasureSpec.makeMeasureSpec(J7, i12 == -1 ? 1073741824 : Integer.MIN_VALUE), i11);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31378d = new Rect();
        this.f31379e = new Rect();
        this.f31380f = 0;
    }
}
