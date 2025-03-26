package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class IA0 implements Zz0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15902a;

    /* renamed from: b, reason: collision with root package name */
    private long f15903b;

    /* renamed from: c, reason: collision with root package name */
    private long f15904c;

    /* renamed from: d, reason: collision with root package name */
    private C2006Zf f15905d = C2006Zf.f20520d;

    public IA0(RC rc) {
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final void P(C2006Zf c2006Zf) {
        if (this.f15902a) {
            b(zza());
        }
        this.f15905d = c2006Zf;
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final C2006Zf a() {
        return this.f15905d;
    }

    public final void b(long j8) {
        this.f15903b = j8;
        if (this.f15902a) {
            this.f15904c = SystemClock.elapsedRealtime();
        }
    }

    public final void c() {
        if (this.f15902a) {
            return;
        }
        this.f15904c = SystemClock.elapsedRealtime();
        this.f15902a = true;
    }

    public final void d() {
        if (this.f15902a) {
            b(zza());
            this.f15902a = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Zz0
    public final long zza() {
        long j8 = this.f15903b;
        if (!this.f15902a) {
            return j8;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f15904c;
        C2006Zf c2006Zf = this.f15905d;
        return j8 + (c2006Zf.f20521a == 1.0f ? AbstractC2301cW.K(elapsedRealtime) : c2006Zf.a(elapsedRealtime));
    }
}
