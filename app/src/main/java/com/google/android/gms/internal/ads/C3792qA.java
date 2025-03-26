package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.qA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3792qA {

    /* renamed from: a, reason: collision with root package name */
    private final FQ f25844a;

    /* renamed from: b, reason: collision with root package name */
    private final L60 f25845b;

    /* renamed from: c, reason: collision with root package name */
    private final S80 f25846c;

    /* renamed from: d, reason: collision with root package name */
    private final C1217Cw f25847d;

    /* renamed from: e, reason: collision with root package name */
    private final C4694yV f25848e;

    /* renamed from: f, reason: collision with root package name */
    private final XE f25849f;

    /* renamed from: g, reason: collision with root package name */
    private C60 f25850g;

    /* renamed from: h, reason: collision with root package name */
    private final C3492nR f25851h;

    /* renamed from: i, reason: collision with root package name */
    private final LB f25852i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f25853j;

    /* renamed from: k, reason: collision with root package name */
    private final ZQ f25854k;

    /* renamed from: l, reason: collision with root package name */
    private final BT f25855l;

    C3792qA(FQ fq, L60 l60, S80 s80, C1217Cw c1217Cw, C4694yV c4694yV, XE xe, C60 c60, C3492nR c3492nR, LB lb, Executor executor, ZQ zq, BT bt) {
        this.f25844a = fq;
        this.f25845b = l60;
        this.f25846c = s80;
        this.f25847d = c1217Cw;
        this.f25848e = c4694yV;
        this.f25849f = xe;
        this.f25850g = c60;
        this.f25851h = c3492nR;
        this.f25852i = lb;
        this.f25853j = executor;
        this.f25854k = zq;
        this.f25855l = bt;
    }

    public final D2.W0 a(Throwable th) {
        return AbstractC3351m70.b(th, this.f25855l);
    }

    public final XE c() {
        return this.f25849f;
    }

    final /* synthetic */ C60 d(C60 c60) {
        this.f25847d.a(c60);
        return c60;
    }

    public final com.google.common.util.concurrent.d e(final G70 g70) {
        C4551x80 a8 = this.f25846c.b(M80.GET_CACHE_KEY, this.f25852i.c()).f(new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.lA
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f24279a.f(g70, (C4618xo) obj);
            }
        }).a();
        AbstractC2326ck0.r(a8, new C3574oA(this), this.f25853j);
        return a8;
    }

    final /* synthetic */ com.google.common.util.concurrent.d f(G70 g70, C4618xo c4618xo) {
        c4618xo.f27924z = g70;
        return this.f25851h.a(c4618xo);
    }

    public final com.google.common.util.concurrent.d g(C4618xo c4618xo) {
        C4551x80 a8 = this.f25846c.b(M80.NOTIFY_CACHE_HIT, this.f25851h.f(c4618xo)).a();
        AbstractC2326ck0.r(a8, new C3683pA(this), this.f25853j);
        return a8;
    }

    public final com.google.common.util.concurrent.d h(com.google.common.util.concurrent.d dVar) {
        I80 f8 = this.f25846c.b(M80.RENDERER, dVar).e(new InterfaceC4333v80() { // from class: com.google.android.gms.internal.ads.kA
            @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
            public final Object a(Object obj) {
                C60 c60 = (C60) obj;
                this.f23519a.d(c60);
                return c60;
            }
        }).f(this.f25848e);
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f24047x5)).booleanValue()) {
            f8 = f8.i(((Integer) D2.A.c().a(AbstractC3184kf.f24055y5)).intValue(), TimeUnit.SECONDS);
        }
        return f8.a();
    }

    public final com.google.common.util.concurrent.d i() {
        D2.X1 x12 = this.f25845b.f16766d;
        if (x12.f1183O == null && x12.f1178J == null) {
            return j(this.f25852i.c());
        }
        S80 s80 = this.f25846c;
        FQ fq = this.f25844a;
        return B80.c(fq.a(), M80.PRELOADED_LOADER, s80).a();
    }

    public final com.google.common.util.concurrent.d j(com.google.common.util.concurrent.d dVar) {
        C60 c60 = this.f25850g;
        if (c60 != null) {
            S80 s80 = this.f25846c;
            return B80.c(AbstractC2326ck0.h(c60), M80.SERVER_TRANSACTION, s80).a();
        }
        C2.v.f().j();
        I80 b8 = this.f25846c.b(M80.SERVER_TRANSACTION, dVar);
        final ZQ zq = this.f25854k;
        Objects.requireNonNull(zq);
        return b8.f(new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.nA
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return zq.a((C4618xo) obj);
            }
        }).a();
    }

    public final void k(C60 c60) {
        this.f25850g = c60;
    }
}
