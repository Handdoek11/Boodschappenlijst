package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    final SideSheetBehavior f32188a;

    b(SideSheetBehavior sideSheetBehavior) {
        this.f32188a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i8) {
        float d8 = d();
        return (d8 - i8) / (d8 - c());
    }

    @Override // com.google.android.material.sidesheet.c
    int c() {
        return Math.max(0, (d() - this.f32188a.Y()) - this.f32188a.d0());
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return this.f32188a.g0();
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return this.f32188a.g0();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return c();
    }

    @Override // com.google.android.material.sidesheet.c
    int g(View view) {
        return view.getLeft() - this.f32188a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.c
    int i() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean j(float f8) {
        return f8 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(float f8, float f9) {
        return d.a(f8, f9) && Math.abs(f8) > ((float) this.f32188a.h0());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(View view, float f8) {
        return Math.abs(((float) view.getRight()) + (f8 * this.f32188a.b0())) > this.f32188a.c0();
    }

    @Override // com.google.android.material.sidesheet.c
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i8, int i9) {
        int g02 = this.f32188a.g0();
        if (i8 <= g02) {
            marginLayoutParams.rightMargin = g02 - i8;
        }
    }
}
