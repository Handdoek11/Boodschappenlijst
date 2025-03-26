package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.a50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2043a50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4658y70 f20628a;

    /* renamed from: b, reason: collision with root package name */
    private final OB f20629b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f20630c;

    /* renamed from: d, reason: collision with root package name */
    private X40 f20631d;

    public C2043a50(InterfaceC4658y70 interfaceC4658y70, OB ob, Executor executor) {
        this.f20628a = interfaceC4658y70;
        this.f20629b = ob;
        this.f20630c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J70 e() {
        L60 g8 = this.f20629b.g();
        return this.f20628a.c(g8.f16766d, g8.f16768f, g8.f16772j);
    }

    public final com.google.common.util.concurrent.d c() {
        com.google.common.util.concurrent.d dVar;
        X40 x40 = this.f20631d;
        if (x40 != null) {
            return AbstractC2326ck0.h(x40);
        }
        if (((Boolean) AbstractC4057sg.f26721a.e()).booleanValue()) {
            dVar = (Sj0) AbstractC2326ck0.e((Sj0) AbstractC2326ck0.m(Sj0.D(this.f20629b.zzb().e(this.f20628a.zza())), new W40(this), this.f20630c), zzdyh.class, new V40(this), this.f20630c);
        } else {
            X40 x402 = new X40(null, e(), null);
            this.f20631d = x402;
            dVar = AbstractC2326ck0.h(x402);
        }
        return AbstractC2326ck0.m(dVar, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.U40
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return (X40) obj;
            }
        }, this.f20630c);
    }
}
