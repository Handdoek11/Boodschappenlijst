package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3811qJ0 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f25896c;

    /* renamed from: e, reason: collision with root package name */
    private int f25898e;

    /* renamed from: a, reason: collision with root package name */
    private C3702pJ0 f25894a = new C3702pJ0();

    /* renamed from: b, reason: collision with root package name */
    private C3702pJ0 f25895b = new C3702pJ0();

    /* renamed from: d, reason: collision with root package name */
    private long f25897d = -9223372036854775807L;

    public final float a() {
        if (this.f25894a.f()) {
            return (float) (1.0E9d / this.f25894a.a());
        }
        return -1.0f;
    }

    public final int b() {
        return this.f25898e;
    }

    public final long c() {
        if (this.f25894a.f()) {
            return this.f25894a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (this.f25894a.f()) {
            return this.f25894a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j8) {
        this.f25894a.c(j8);
        if (this.f25894a.f()) {
            this.f25896c = false;
        } else if (this.f25897d != -9223372036854775807L) {
            if (!this.f25896c || this.f25895b.e()) {
                this.f25895b.d();
                this.f25895b.c(this.f25897d);
            }
            this.f25896c = true;
            this.f25895b.c(j8);
        }
        if (this.f25896c && this.f25895b.f()) {
            C3702pJ0 c3702pJ0 = this.f25894a;
            this.f25894a = this.f25895b;
            this.f25895b = c3702pJ0;
            this.f25896c = false;
        }
        this.f25897d = j8;
        this.f25898e = this.f25894a.f() ? 0 : this.f25898e + 1;
    }

    public final void f() {
        this.f25894a.d();
        this.f25895b.d();
        this.f25896c = false;
        this.f25897d = -9223372036854775807L;
        this.f25898e = 0;
    }

    public final boolean g() {
        return this.f25894a.f();
    }
}
