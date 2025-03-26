package com.google.ads.mediation;

import J2.l;
import w2.m;

/* loaded from: classes.dex */
final class c extends I2.b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f13031a;

    /* renamed from: b, reason: collision with root package name */
    final l f13032b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        this.f13031a = abstractAdViewAdapter;
        this.f13032b = lVar;
    }

    @Override // w2.AbstractC6879e
    public final void a(m mVar) {
        this.f13032b.m(this.f13031a, mVar);
    }

    @Override // w2.AbstractC6879e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f13031a;
        I2.a aVar = (I2.a) obj;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        aVar.c(new d(abstractAdViewAdapter, this.f13032b));
        this.f13032b.o(this.f13031a);
    }
}
