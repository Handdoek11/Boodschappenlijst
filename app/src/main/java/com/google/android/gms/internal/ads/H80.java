package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class H80 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4551x80 f15652a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I80 f15653b;

    H80(I80 i80, C4551x80 c4551x80) {
        this.f15652a = c4551x80;
        this.f15653b = i80;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        this.f15653b.f15879f.f16527c.M0(this.f15652a, th);
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void c(Object obj) {
        this.f15653b.f15879f.f16527c.p(this.f15652a);
    }
}
