package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2514eS {

    /* renamed from: a, reason: collision with root package name */
    private long f21812a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f21813b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f21814c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f21815d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f21816e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f21817f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f21818g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f21819h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Object f21820i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final Object f21821j = new Object();

    public final int a() {
        int i8;
        synchronized (this.f21818g) {
            i8 = this.f21813b;
        }
        return i8;
    }

    public final synchronized long b() {
        long j8;
        synchronized (this.f21821j) {
            j8 = this.f21816e;
        }
        return j8;
    }

    public final synchronized long c() {
        long j8;
        synchronized (this.f21820i) {
            j8 = this.f21815d;
        }
        return j8;
    }

    public final synchronized long d() {
        long j8;
        synchronized (this.f21817f) {
            j8 = this.f21812a;
        }
        return j8;
    }

    public final long e() {
        long j8;
        synchronized (this.f21819h) {
            j8 = this.f21814c;
        }
        return j8;
    }

    public final synchronized void f(long j8) {
        synchronized (this.f21821j) {
            this.f21816e = j8;
        }
    }

    public final synchronized void g(long j8) {
        synchronized (this.f21820i) {
            this.f21815d = j8;
        }
    }

    public final synchronized void h(long j8) {
        synchronized (this.f21817f) {
            this.f21812a = j8;
        }
    }

    public final void i(int i8) {
        synchronized (this.f21818g) {
            this.f21813b = i8;
        }
    }

    public final void j(long j8) {
        synchronized (this.f21819h) {
            this.f21814c = j8;
        }
    }
}
