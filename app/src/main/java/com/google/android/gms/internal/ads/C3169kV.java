package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* renamed from: com.google.android.gms.internal.ads.kV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3169kV extends AbstractC2844hV {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4630xu f23603a;

    /* renamed from: b, reason: collision with root package name */
    private final QB f23604b;

    /* renamed from: c, reason: collision with root package name */
    private final C4804zW f23605c;

    /* renamed from: d, reason: collision with root package name */
    private final C3039jF f23606d;

    /* renamed from: e, reason: collision with root package name */
    private final LH f23607e;

    /* renamed from: f, reason: collision with root package name */
    private final ED f23608f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f23609g;

    /* renamed from: h, reason: collision with root package name */
    private final NE f23610h;

    /* renamed from: i, reason: collision with root package name */
    private final C4040sV f23611i;

    /* renamed from: j, reason: collision with root package name */
    private final BT f23612j;

    public C3169kV(AbstractC4630xu abstractC4630xu, QB qb, C4804zW c4804zW, C3039jF c3039jF, LH lh, ED ed, ViewGroup viewGroup, NE ne, C4040sV c4040sV, BT bt) {
        this.f23603a = abstractC4630xu;
        this.f23604b = qb;
        this.f23605c = c4804zW;
        this.f23606d = c3039jF;
        this.f23607e = lh;
        this.f23608f = ed;
        this.f23609g = viewGroup;
        this.f23610h = ne;
        this.f23611i = c4040sV;
        this.f23612j = bt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2844hV
    protected final com.google.common.util.concurrent.d c(L60 l60, Bundle bundle, C3785q60 c3785q60, C60 c60) {
        QB qb = this.f23604b;
        qb.k(l60);
        qb.g(bundle);
        qb.h(new IB(c60, c3785q60, this.f23611i));
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23690H3)).booleanValue()) {
            this.f23604b.e(this.f23612j);
        }
        AbstractC4630xu abstractC4630xu = this.f23603a;
        QB qb2 = this.f23604b;
        InterfaceC2029Zy l8 = abstractC4630xu.l();
        l8.k(qb2.l());
        l8.n(this.f23606d);
        l8.m(this.f23605c);
        l8.f(this.f23607e);
        l8.j(new C1220Cz(this.f23608f, this.f23610h));
        l8.h(new C4093sy(this.f23609g));
        C3792qA d8 = l8.i().d();
        return d8.h(d8.i());
    }
}
