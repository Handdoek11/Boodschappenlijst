package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3246l90 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RunnableC3464n90 f24277a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f24278b;

    C3246l90(RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90) {
        this.f24277a = runnableC3464n90;
        this.f24278b = interfaceC2160b90;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        InterfaceC2160b90 interfaceC2160b90 = this.f24278b;
        interfaceC2160b90.c(th);
        interfaceC2160b90.I0(false);
        this.f24277a.a(interfaceC2160b90);
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void c(Object obj) {
    }
}
