package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class H40 implements T70 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2477e50 f15621a;

    public H40(InterfaceC2477e50 interfaceC2477e50) {
        this.f15621a = interfaceC2477e50;
    }

    @Override // com.google.android.gms.internal.ads.T70
    public final com.google.common.util.concurrent.d a(U70 u70) {
        I40 i40 = (I40) u70;
        return ((E40) this.f15621a).c(i40.f15858b, i40.f15857a, null);
    }

    @Override // com.google.android.gms.internal.ads.T70
    public final void b(I70 i70) {
        i70.f15870a = ((E40) this.f15621a).b();
    }
}
