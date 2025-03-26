package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ga0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2741ga0 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f22378a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC3464n90 f22379b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2959ia0 f22380c;

    C2741ga0(C2959ia0 c2959ia0, InterfaceC2160b90 interfaceC2160b90, RunnableC3464n90 runnableC3464n90) {
        this.f22378a = interfaceC2160b90;
        this.f22379b = runnableC3464n90;
        this.f22380c = c2959ia0;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        this.f22378a.I0(false);
        RunnableC3464n90 runnableC3464n90 = this.f22379b;
        if (runnableC3464n90 != null) {
            runnableC3464n90.a(this.f22378a);
            runnableC3464n90.h();
        } else {
            this.f22380c.f22998f.b(this.f22378a.k());
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.f22378a.I0(((H2.t) obj) == H2.t.SUCCESS);
        RunnableC3464n90 runnableC3464n90 = this.f22379b;
        if (runnableC3464n90 == null) {
            this.f22380c.f22998f.b(this.f22378a.k());
        } else {
            runnableC3464n90.a(this.f22378a);
            runnableC3464n90.h();
        }
    }
}
