package com.google.android.material.bottomappbar;

import D3.b;
import D3.k;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.E;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import z0.X;

/* loaded from: classes2.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: o0, reason: collision with root package name */
    private static final int f31423o0 = k.f1623m;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f31424p0 = b.f1426y;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f31425q0 = b.f1384H;

    static /* synthetic */ void S(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View T(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ boolean V(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ void W(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        throw null;
    }

    static /* synthetic */ int X(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Y(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.f) view.getLayoutParams()).f9048d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m, reason: collision with root package name */
        private final Rect f31426m;

        /* renamed from: n, reason: collision with root package name */
        private WeakReference f31427n;

        /* renamed from: o, reason: collision with root package name */
        private int f31428o;

        /* renamed from: p, reason: collision with root package name */
        private final View.OnLayoutChangeListener f31429p;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                E.a(Behavior.this.f31427n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f31429p = new a();
            this.f31426m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i9) {
            E.a(view);
            return P(coordinatorLayout, null, view2, view3, i8, i9);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i8) {
            this.f31427n = new WeakReference(bottomAppBar);
            View T7 = BottomAppBar.T(bottomAppBar);
            if (T7 != null && !X.R(T7)) {
                BottomAppBar.Y(bottomAppBar, T7);
                this.f31428o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) T7.getLayoutParams())).bottomMargin;
                if (T7 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) T7;
                    if (BottomAppBar.X(bottomAppBar) == 0 && BottomAppBar.V(bottomAppBar)) {
                        X.u0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(D3.a.f1374b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(D3.a.f1373a);
                    }
                    BottomAppBar.W(bottomAppBar, floatingActionButton);
                }
                T7.addOnLayoutChangeListener(this.f31429p);
                BottomAppBar.S(bottomAppBar);
            }
            coordinatorLayout.H(bottomAppBar, i8);
            return super.l(coordinatorLayout, bottomAppBar, i8);
        }

        public boolean P(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i8, int i9) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
            E.a(view);
            return O(coordinatorLayout, null, i8);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31429p = new a();
            this.f31426m = new Rect();
        }
    }
}
