package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
abstract class c extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private d f31382a;

    /* renamed from: b, reason: collision with root package name */
    private int f31383b;

    /* renamed from: c, reason: collision with root package name */
    private int f31384c;

    public c() {
        this.f31383b = 0;
        this.f31384c = 0;
    }

    public int E() {
        d dVar = this.f31382a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i8) {
        coordinatorLayout.H(view, i8);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
        F(coordinatorLayout, view, i8);
        if (this.f31382a == null) {
            this.f31382a = new d(view);
        }
        this.f31382a.c();
        this.f31382a.a();
        int i9 = this.f31383b;
        if (i9 != 0) {
            this.f31382a.e(i9);
            this.f31383b = 0;
        }
        int i10 = this.f31384c;
        if (i10 == 0) {
            return true;
        }
        this.f31382a.d(i10);
        this.f31384c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31383b = 0;
        this.f31384c = 0;
    }
}
