package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class V60 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W60 f19548a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f19549b;

    V60(W60 w60, int i8) {
        this.f19549b = i8;
        this.f19548a = w60;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        C2.v.s().x(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        int i8 = this.f19549b;
        this.f19548a.b((String) obj, i8);
    }
}
