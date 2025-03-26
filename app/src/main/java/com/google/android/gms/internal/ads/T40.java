package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class T40 implements InterfaceC2477e50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2477e50 f19062a;

    /* renamed from: b, reason: collision with root package name */
    private OB f19063b;

    public T40(InterfaceC2477e50 interfaceC2477e50) {
        this.f19062a = interfaceC2477e50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.d a(C2586f50 c2586f50, InterfaceC2369d50 interfaceC2369d50, Object obj) {
        return c(c2586f50, interfaceC2369d50, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized OB d() {
        return this.f19063b;
    }

    public final synchronized com.google.common.util.concurrent.d c(C2586f50 c2586f50, InterfaceC2369d50 interfaceC2369d50, OB ob) {
        C4618xo c4618xo;
        this.f19063b = ob;
        if (ob == null || (c4618xo = c2586f50.f21930a) == null) {
            return ((S40) this.f19062a).c(c2586f50, interfaceC2369d50, ob);
        }
        C3792qA zzb = ob.zzb();
        return zzb.h(zzb.j(AbstractC2326ck0.h(c4618xo)));
    }
}
