package com.google.android.material.floatingactionbutton;

import D3.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        private boolean f31900a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31901b;

        public ExtendedFloatingActionButtonBehavior() {
            this.f31900a = false;
            this.f31901b = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean I(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (I(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean G(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (!F(view)) {
                return false;
            }
            J(view, extendedFloatingActionButton);
            return false;
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i8) {
            List r8 = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r8.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = (View) r8.get(i9);
                if (F(view) && J(view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.H(extendedFloatingActionButton, i8);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            E.a(view);
            return E(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f9052h == 0) {
                fVar.f9052h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            E.a(view);
            return G(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
            E.a(view);
            return H(coordinatorLayout, null, i8);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f1747O1);
            this.f31900a = obtainStyledAttributes.getBoolean(l.f1755P1, false);
            this.f31901b = obtainStyledAttributes.getBoolean(l.f1763Q1, true);
            obtainStyledAttributes.recycle();
        }
    }
}
