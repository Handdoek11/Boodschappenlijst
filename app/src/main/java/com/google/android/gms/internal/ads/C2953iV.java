package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.iV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2953iV extends AbstractC2844hV {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4630xu f22981a;

    /* renamed from: b, reason: collision with root package name */
    private final QB f22982b;

    /* renamed from: c, reason: collision with root package name */
    private final C3039jF f22983c;

    /* renamed from: d, reason: collision with root package name */
    private final C4040sV f22984d;

    /* renamed from: e, reason: collision with root package name */
    private final BT f22985e;

    C2953iV(AbstractC4630xu abstractC4630xu, QB qb, C3039jF c3039jF, C4040sV c4040sV, BT bt) {
        this.f22981a = abstractC4630xu;
        this.f22982b = qb;
        this.f22983c = c3039jF;
        this.f22984d = c4040sV;
        this.f22985e = bt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2844hV
    protected final com.google.common.util.concurrent.d c(L60 l60, Bundle bundle, C3785q60 c3785q60, C60 c60) {
        QB qb = this.f22982b;
        qb.k(l60);
        qb.g(bundle);
        qb.h(new IB(c60, c3785q60, this.f22984d));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23690H3)).booleanValue()) {
            this.f22982b.e(this.f22985e);
        }
        AbstractC4630xu abstractC4630xu = this.f22981a;
        QB qb2 = this.f22982b;
        InterfaceC2897hy k8 = abstractC4630xu.k();
        k8.a(qb2.l());
        k8.d(this.f22983c);
        C3792qA zzb = k8.b().zzb();
        return zzb.h(zzb.i());
    }
}
