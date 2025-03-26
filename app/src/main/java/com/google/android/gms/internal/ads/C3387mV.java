package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.mV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3387mV extends AbstractC2844hV {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4630xu f24522a;

    /* renamed from: b, reason: collision with root package name */
    private final QB f24523b;

    /* renamed from: c, reason: collision with root package name */
    private final C4804zW f24524c;

    /* renamed from: d, reason: collision with root package name */
    private final C3039jF f24525d;

    /* renamed from: e, reason: collision with root package name */
    private final C4040sV f24526e;

    /* renamed from: f, reason: collision with root package name */
    private final BT f24527f;

    public C3387mV(AbstractC4630xu abstractC4630xu, QB qb, C4804zW c4804zW, C3039jF c3039jF, C4040sV c4040sV, BT bt) {
        this.f24522a = abstractC4630xu;
        this.f24523b = qb;
        this.f24524c = c4804zW;
        this.f24525d = c3039jF;
        this.f24526e = c4040sV;
        this.f24527f = bt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2844hV
    protected final com.google.common.util.concurrent.d c(L60 l60, Bundle bundle, C3785q60 c3785q60, C60 c60) {
        QB qb = this.f24523b;
        qb.k(l60);
        qb.g(bundle);
        qb.h(new IB(c60, c3785q60, this.f24526e));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23690H3)).booleanValue()) {
            this.f24523b.e(this.f24527f);
        }
        AbstractC4630xu abstractC4630xu = this.f24522a;
        QB qb2 = this.f24523b;
        InterfaceC4132tH n8 = abstractC4630xu.n();
        n8.s(qb2.l());
        n8.t(this.f24525d);
        n8.o(this.f24524c);
        C3792qA a8 = n8.c().a();
        return a8.h(a8.i());
    }
}
