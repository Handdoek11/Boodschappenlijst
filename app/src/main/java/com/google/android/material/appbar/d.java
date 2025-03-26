package com.google.android.material.appbar;

import android.view.View;
import z0.X;

/* loaded from: classes2.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final View f31385a;

    /* renamed from: b, reason: collision with root package name */
    private int f31386b;

    /* renamed from: c, reason: collision with root package name */
    private int f31387c;

    /* renamed from: d, reason: collision with root package name */
    private int f31388d;

    /* renamed from: e, reason: collision with root package name */
    private int f31389e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31390f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31391g = true;

    public d(View view) {
        this.f31385a = view;
    }

    void a() {
        View view = this.f31385a;
        X.Y(view, this.f31388d - (view.getTop() - this.f31386b));
        View view2 = this.f31385a;
        X.X(view2, this.f31389e - (view2.getLeft() - this.f31387c));
    }

    public int b() {
        return this.f31388d;
    }

    void c() {
        this.f31386b = this.f31385a.getTop();
        this.f31387c = this.f31385a.getLeft();
    }

    public boolean d(int i8) {
        if (!this.f31391g || this.f31389e == i8) {
            return false;
        }
        this.f31389e = i8;
        a();
        return true;
    }

    public boolean e(int i8) {
        if (!this.f31390f || this.f31388d == i8) {
            return false;
        }
        this.f31388d = i8;
        a();
        return true;
    }
}
