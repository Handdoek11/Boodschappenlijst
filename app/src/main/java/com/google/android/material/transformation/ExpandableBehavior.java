package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import z0.X;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private int f32666a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f32667o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f32668s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ O3.a f32669t;

        a(View view, int i8, O3.a aVar) {
            this.f32667o = view;
            this.f32668s = i8;
            this.f32669t = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f32667o.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f32666a == this.f32668s) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                O3.a aVar = this.f32669t;
                expandableBehavior.H((View) aVar, this.f32667o, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f32666a = 0;
    }

    private boolean F(boolean z7) {
        if (!z7) {
            return this.f32666a == 1;
        }
        int i8 = this.f32666a;
        return i8 == 0 || i8 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected O3.a G(CoordinatorLayout coordinatorLayout, View view) {
        List r8 = coordinatorLayout.r(view);
        int size = r8.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) r8.get(i8);
            if (e(coordinatorLayout, view, view2)) {
                return (O3.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z7, boolean z8);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        O3.a aVar = (O3.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.f32666a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
        O3.a G7;
        if (X.R(view) || (G7 = G(coordinatorLayout, view)) == null || !F(G7.a())) {
            return false;
        }
        int i9 = G7.a() ? 1 : 2;
        this.f32666a = i9;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i9, G7));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32666a = 0;
    }
}
