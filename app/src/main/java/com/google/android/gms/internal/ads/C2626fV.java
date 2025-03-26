package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.fV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2626fV extends AbstractC2844hV {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4630xu f22045a;

    /* renamed from: b, reason: collision with root package name */
    private final LH f22046b;

    /* renamed from: c, reason: collision with root package name */
    private final QB f22047c;

    /* renamed from: d, reason: collision with root package name */
    private final C3039jF f22048d;

    /* renamed from: e, reason: collision with root package name */
    private final C4040sV f22049e;

    /* renamed from: f, reason: collision with root package name */
    private final BT f22050f;

    public C2626fV(AbstractC4630xu abstractC4630xu, LH lh, QB qb, C3039jF c3039jF, C4040sV c4040sV, BT bt) {
        this.f22045a = abstractC4630xu;
        this.f22046b = lh;
        this.f22047c = qb;
        this.f22048d = c3039jF;
        this.f22049e = c4040sV;
        this.f22050f = bt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2844hV
    protected final com.google.common.util.concurrent.d c(L60 l60, Bundle bundle, C3785q60 c3785q60, C60 c60) {
        QB qb = this.f22047c;
        qb.k(l60);
        qb.g(bundle);
        qb.h(new IB(c60, c3785q60, this.f22049e));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23690H3)).booleanValue()) {
            this.f22047c.e(this.f22050f);
        }
        AbstractC4630xu abstractC4630xu = this.f22045a;
        QB qb2 = this.f22047c;
        PH o8 = abstractC4630xu.o();
        o8.p(qb2.l());
        o8.r(this.f22048d);
        o8.f(this.f22046b);
        o8.h(new C4093sy(null));
        C3792qA a8 = o8.g().a();
        return a8.h(a8.i());
    }
}
