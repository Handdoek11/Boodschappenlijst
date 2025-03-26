package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.b {

    public static class Behavior extends CoordinatorLayout.c {
        public Behavior() {
        }

        public boolean E(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            E.a(view);
            return E(coordinatorLayout, null, view2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
