package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class GG0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15340a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15342c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15343d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15344e;

    private GG0(Object obj, int i8, int i9, long j8, int i10) {
        this.f15340a = obj;
        this.f15341b = i8;
        this.f15342c = i9;
        this.f15343d = j8;
        this.f15344e = i10;
    }

    public final GG0 a(Object obj) {
        return this.f15340a.equals(obj) ? this : new GG0(obj, this.f15341b, this.f15342c, this.f15343d, this.f15344e);
    }

    public final boolean b() {
        return this.f15341b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GG0)) {
            return false;
        }
        GG0 gg0 = (GG0) obj;
        return this.f15340a.equals(gg0.f15340a) && this.f15341b == gg0.f15341b && this.f15342c == gg0.f15342c && this.f15343d == gg0.f15343d && this.f15344e == gg0.f15344e;
    }

    public final int hashCode() {
        return ((((((((this.f15340a.hashCode() + 527) * 31) + this.f15341b) * 31) + this.f15342c) * 31) + ((int) this.f15343d)) * 31) + this.f15344e;
    }

    public GG0(Object obj, int i8, int i9, long j8) {
        this(obj, i8, i9, j8, -1);
    }

    public GG0(Object obj, long j8) {
        this(obj, -1, -1, j8, -1);
    }

    public GG0(Object obj, long j8, int i8) {
        this(obj, -1, -1, j8, i8);
    }
}
