package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class DH0 extends AbstractC1981Yl {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f14447g = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final long f14448b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14449c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14450d;

    /* renamed from: e, reason: collision with root package name */
    private final E7 f14451e;

    /* renamed from: f, reason: collision with root package name */
    private final J4 f14452f;

    static {
        F1 f12 = new F1();
        f12.a("SinglePeriodTimeline");
        f12.b(Uri.EMPTY);
        f12.c();
    }

    public DH0(long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z7, boolean z8, boolean z9, Object obj, E7 e72, J4 j42) {
        this.f14448b = j11;
        this.f14449c = j12;
        this.f14450d = z7;
        e72.getClass();
        this.f14451e = e72;
        this.f14452f = j42;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int a(Object obj) {
        return f14447g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final C1945Xk d(int i8, C1945Xk c1945Xk, boolean z7) {
        AbstractC3796qC.a(i8, 0, 1);
        c1945Xk.i(null, z7 ? f14447g : null, 0, this.f14448b, 0L, C3505nc.f25000e, false);
        return c1945Xk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final C4721yl e(int i8, C4721yl c4721yl, long j8) {
        AbstractC3796qC.a(i8, 0, 1);
        Object obj = C4721yl.f28182o;
        E7 e72 = this.f14451e;
        long j9 = this.f14449c;
        c4721yl.a(obj, e72, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f14450d, false, this.f14452f, 0L, j9, 0, 0, 0L);
        return c4721yl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final Object f(int i8) {
        AbstractC3796qC.a(i8, 0, 1);
        return f14447g;
    }
}
