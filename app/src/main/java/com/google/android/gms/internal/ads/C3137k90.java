package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3137k90 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RunnableC3464n90 f23516a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f23517b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f23518c;

    C3137k90(RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90, boolean z7) {
        this.f23516a = runnableC3464n90;
        this.f23517b = interfaceC2160b90;
        this.f23518c = z7;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        InterfaceC2160b90 interfaceC2160b90 = this.f23517b;
        if (interfaceC2160b90.i()) {
            RunnableC3464n90 runnableC3464n90 = this.f23516a;
            interfaceC2160b90.c(th);
            interfaceC2160b90.I0(false);
            runnableC3464n90.a(interfaceC2160b90);
            if (this.f23518c) {
                this.f23516a.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void c(Object obj) {
        InterfaceC2160b90 interfaceC2160b90 = this.f23517b;
        interfaceC2160b90.I0(true);
        this.f23516a.a(interfaceC2160b90);
        if (this.f23518c) {
            this.f23516a.h();
        }
    }
}
