package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.oV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3605oV extends AbstractC2844hV {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4630xu f25192a;

    /* renamed from: b, reason: collision with root package name */
    private final QB f25193b;

    /* renamed from: c, reason: collision with root package name */
    private final C3039jF f25194c;

    /* renamed from: d, reason: collision with root package name */
    private final C4040sV f25195d;

    /* renamed from: e, reason: collision with root package name */
    private final D60 f25196e;

    /* renamed from: f, reason: collision with root package name */
    private final BT f25197f;

    public C3605oV(AbstractC4630xu abstractC4630xu, QB qb, C3039jF c3039jF, D60 d60, C4040sV c4040sV, BT bt) {
        this.f25192a = abstractC4630xu;
        this.f25193b = qb;
        this.f25194c = c3039jF;
        this.f25196e = d60;
        this.f25195d = c4040sV;
        this.f25197f = bt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2844hV
    protected final com.google.common.util.concurrent.d c(L60 l60, Bundle bundle, C3785q60 c3785q60, C60 c60) {
        D60 d60;
        QB qb = this.f25193b;
        qb.k(l60);
        qb.g(bundle);
        qb.h(new IB(c60, c3785q60, this.f25195d));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23682G3)).booleanValue() && (d60 = this.f25196e) != null) {
            this.f25193b.j(d60);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23690H3)).booleanValue()) {
            this.f25193b.e(this.f25197f);
        }
        AbstractC4630xu abstractC4630xu = this.f25192a;
        QB qb2 = this.f25193b;
        ML p8 = abstractC4630xu.p();
        p8.a(qb2.l());
        p8.d(this.f25194c);
        C3792qA zzb = p8.b().zzb();
        return zzb.h(zzb.i());
    }
}
