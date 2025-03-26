package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class P40 implements InterfaceC2477e50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4658y70 f18126a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f18127b;

    /* renamed from: c, reason: collision with root package name */
    private final Yj0 f18128c = new N40(this);

    public P40(InterfaceC4658y70 interfaceC4658y70, Executor executor) {
        this.f18126a = interfaceC4658y70;
        this.f18127b = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.d a(C2586f50 c2586f50, InterfaceC2369d50 interfaceC2369d50, Object obj) {
        return c(c2586f50, interfaceC2369d50, null);
    }

    final /* synthetic */ com.google.common.util.concurrent.d b(OB ob, X40 x40) {
        InterfaceC4658y70 interfaceC4658y70 = this.f18126a;
        J70 j70 = x40.f19970b;
        C4618xo c4618xo = x40.f19969a;
        I70 b8 = interfaceC4658y70.b(j70);
        if (b8 != null && c4618xo != null) {
            AbstractC2326ck0.r(ob.zzb().g(c4618xo), this.f18128c, this.f18127b);
        }
        return AbstractC2326ck0.h(new O40(j70, c4618xo, b8));
    }

    public final com.google.common.util.concurrent.d c(C2586f50 c2586f50, InterfaceC2369d50 interfaceC2369d50, final OB ob) {
        return (Sj0) AbstractC2326ck0.e((Sj0) AbstractC2326ck0.n(Sj0.D(new C2043a50(this.f18126a, ob, this.f18127b).c()), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.L40
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f16759a.b(ob, (X40) obj);
            }
        }, this.f18127b), Exception.class, new M40(this), this.f18127b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    public final /* bridge */ /* synthetic */ Object d() {
        return null;
    }
}
