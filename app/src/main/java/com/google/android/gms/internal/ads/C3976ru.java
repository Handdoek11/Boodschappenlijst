package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ru, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3976ru {

    /* renamed from: a, reason: collision with root package name */
    private final int f26238a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26239b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26240c;

    private C3976ru(int i8, int i9, int i10) {
        this.f26238a = i8;
        this.f26240c = i9;
        this.f26239b = i10;
    }

    public static C3976ru a() {
        return new C3976ru(0, 0, 0);
    }

    public static C3976ru b(int i8, int i9) {
        return new C3976ru(1, i8, i9);
    }

    public static C3976ru c(D2.c2 c2Var) {
        return c2Var.f1224u ? new C3976ru(3, 0, 0) : c2Var.f1229z ? new C3976ru(2, 0, 0) : c2Var.f1228y ? new C3976ru(0, 0, 0) : new C3976ru(1, c2Var.f1226w, c2Var.f1223t);
    }

    public static C3976ru d() {
        return new C3976ru(5, 0, 0);
    }

    public static C3976ru e() {
        return new C3976ru(4, 0, 0);
    }

    public final boolean f() {
        return this.f26238a == 0;
    }

    public final boolean g() {
        return this.f26238a == 2;
    }

    public final boolean h() {
        return this.f26238a == 5;
    }

    public final boolean i() {
        return this.f26238a == 3;
    }

    public final boolean j() {
        return this.f26238a == 4;
    }
}
