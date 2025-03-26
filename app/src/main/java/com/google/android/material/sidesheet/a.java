package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    final SideSheetBehavior f32187a;

    a(SideSheetBehavior sideSheetBehavior) {
        this.f32187a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i8) {
        float d8 = d();
        return (i8 - d8) / (c() - d8);
    }

    @Override // com.google.android.material.sidesheet.c
    int c() {
        return Math.max(0, this.f32187a.f0() + this.f32187a.d0());
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return (-this.f32187a.Y()) - this.f32187a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return this.f32187a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return -this.f32187a.Y();
    }

    @Override // com.google.android.material.sidesheet.c
    int g(View view) {
        return view.getRight() + this.f32187a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.c
    int i() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean j(float f8) {
        return f8 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(float f8, float f9) {
        return d.a(f8, f9) && Math.abs(f8) > ((float) this.f32187a.h0());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(View view, float f8) {
        return Math.abs(((float) view.getLeft()) + (f8 * this.f32187a.b0())) > this.f32187a.c0();
    }

    @Override // com.google.android.material.sidesheet.c
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i8, int i9) {
        if (i8 <= this.f32187a.g0()) {
            marginLayoutParams.leftMargin = i9;
        }
    }
}
