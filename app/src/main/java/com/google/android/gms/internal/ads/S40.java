package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class S40 implements InterfaceC2477e50 {

    /* renamed from: a, reason: collision with root package name */
    private OB f18821a;

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.d a(C2586f50 c2586f50, InterfaceC2369d50 interfaceC2369d50, Object obj) {
        return c(c2586f50, interfaceC2369d50, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized OB d() {
        return this.f18821a;
    }

    public final synchronized com.google.common.util.concurrent.d c(C2586f50 c2586f50, InterfaceC2369d50 interfaceC2369d50, OB ob) {
        C3792qA zzb;
        try {
            if (ob != null) {
                this.f18821a = ob;
            } else {
                this.f18821a = (OB) interfaceC2369d50.a(c2586f50.f21931b).e();
            }
            zzb = this.f18821a.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzb.h(zzb.i());
    }
}
