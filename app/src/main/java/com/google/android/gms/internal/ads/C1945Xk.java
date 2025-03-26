package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Xk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1945Xk {

    /* renamed from: a, reason: collision with root package name */
    public Object f20116a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20117b;

    /* renamed from: c, reason: collision with root package name */
    public int f20118c;

    /* renamed from: d, reason: collision with root package name */
    public long f20119d;

    /* renamed from: e, reason: collision with root package name */
    public long f20120e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20121f;

    /* renamed from: g, reason: collision with root package name */
    public C3505nc f20122g = C3505nc.f25000e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final int a(int i8) {
        return this.f20122g.a(i8).f20604b;
    }

    public final int b() {
        int i8 = this.f20122g.f25002a;
        return 0;
    }

    public final int c(long j8) {
        return -1;
    }

    public final int d(long j8) {
        this.f20122g.b(-1);
        return -1;
    }

    public final int e(int i8) {
        return this.f20122g.a(i8).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1945Xk.class.equals(obj.getClass())) {
            C1945Xk c1945Xk = (C1945Xk) obj;
            if (Objects.equals(this.f20116a, c1945Xk.f20116a) && Objects.equals(this.f20117b, c1945Xk.f20117b) && this.f20118c == c1945Xk.f20118c && this.f20119d == c1945Xk.f20119d && this.f20121f == c1945Xk.f20121f && Objects.equals(this.f20122g, c1945Xk.f20122g)) {
                return true;
            }
        }
        return false;
    }

    public final long f(int i8, int i9) {
        C2031a a8 = this.f20122g.a(i8);
        if (a8.f20604b != -1) {
            return a8.f20608f[i9];
        }
        return -9223372036854775807L;
    }

    public final long g(int i8) {
        long j8 = this.f20122g.a(i8).f20603a;
        return 0L;
    }

    public final long h() {
        long j8 = this.f20122g.f25003b;
        return 0L;
    }

    public final int hashCode() {
        Object obj = this.f20116a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f20117b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f20118c;
        long j8 = this.f20119d;
        return (((((hashCode2 * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 961) + (this.f20121f ? 1 : 0)) * 31) + this.f20122g.hashCode();
    }

    public final C1945Xk i(Object obj, Object obj2, int i8, long j8, long j9, C3505nc c3505nc, boolean z7) {
        this.f20116a = obj;
        this.f20117b = obj2;
        this.f20118c = i8;
        this.f20119d = j8;
        this.f20120e = 0L;
        this.f20122g = c3505nc;
        this.f20121f = z7;
        return this;
    }

    public final boolean j(int i8) {
        b();
        if (i8 != -1) {
            return false;
        }
        this.f20122g.b(-1);
        return false;
    }

    public final boolean k(int i8) {
        boolean z7 = this.f20122g.a(i8).f20610h;
        return false;
    }
}
