package com.google.android.gms.internal.ads;

import android.net.Uri;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.yl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4721yl {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f28182o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final E7 f28183p;

    /* renamed from: b, reason: collision with root package name */
    public Object f28185b;

    /* renamed from: d, reason: collision with root package name */
    public long f28187d;

    /* renamed from: e, reason: collision with root package name */
    public long f28188e;

    /* renamed from: f, reason: collision with root package name */
    public long f28189f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28190g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28191h;

    /* renamed from: i, reason: collision with root package name */
    public J4 f28192i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28193j;

    /* renamed from: k, reason: collision with root package name */
    public long f28194k;

    /* renamed from: l, reason: collision with root package name */
    public long f28195l;

    /* renamed from: m, reason: collision with root package name */
    public int f28196m;

    /* renamed from: n, reason: collision with root package name */
    public int f28197n;

    /* renamed from: a, reason: collision with root package name */
    public Object f28184a = f28182o;

    /* renamed from: c, reason: collision with root package name */
    public E7 f28186c = f28183p;

    static {
        F1 f12 = new F1();
        f12.a("androidx.media3.common.Timeline");
        f12.b(Uri.EMPTY);
        f28183p = f12.c();
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final C4721yl a(Object obj, E7 e72, Object obj2, long j8, long j9, long j10, boolean z7, boolean z8, J4 j42, long j11, long j12, int i8, int i9, long j13) {
        this.f28184a = obj;
        this.f28186c = e72 == null ? f28183p : e72;
        this.f28185b = null;
        this.f28187d = -9223372036854775807L;
        this.f28188e = -9223372036854775807L;
        this.f28189f = -9223372036854775807L;
        this.f28190g = z7;
        this.f28191h = z8;
        this.f28192i = j42;
        this.f28194k = 0L;
        this.f28195l = j12;
        this.f28196m = 0;
        this.f28197n = 0;
        this.f28193j = false;
        return this;
    }

    public final boolean b() {
        return this.f28192i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4721yl.class.equals(obj.getClass())) {
            C4721yl c4721yl = (C4721yl) obj;
            if (Objects.equals(this.f28184a, c4721yl.f28184a) && Objects.equals(this.f28186c, c4721yl.f28186c) && Objects.equals(this.f28192i, c4721yl.f28192i) && this.f28187d == c4721yl.f28187d && this.f28188e == c4721yl.f28188e && this.f28189f == c4721yl.f28189f && this.f28190g == c4721yl.f28190g && this.f28191h == c4721yl.f28191h && this.f28193j == c4721yl.f28193j && this.f28195l == c4721yl.f28195l && this.f28196m == c4721yl.f28196m && this.f28197n == c4721yl.f28197n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.f28184a.hashCode() + 217) * 31) + this.f28186c.hashCode();
        J4 j42 = this.f28192i;
        int hashCode2 = ((hashCode * 961) + (j42 == null ? 0 : j42.hashCode())) * 31;
        long j8 = this.f28187d;
        int i8 = (hashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f28188e;
        int i9 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f28189f;
        int i10 = ((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f28190g ? 1 : 0)) * 31) + (this.f28191h ? 1 : 0)) * 31) + (this.f28193j ? 1 : 0);
        long j11 = this.f28195l;
        return ((((((i10 * 961) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f28196m) * 31) + this.f28197n) * 31;
    }
}
