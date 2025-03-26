package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2021Zq implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1951Xq f20555a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC1881Vq f20556b;

    C2021Zq(AbstractC2122ar abstractC2122ar, InterfaceC1951Xq interfaceC1951Xq, InterfaceC1881Vq interfaceC1881Vq) {
        this.f20555a = interfaceC1951Xq;
        this.f20556b = interfaceC1881Vq;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        this.f20556b.zza();
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void c(Object obj) {
        this.f20555a.a(obj);
    }
}
