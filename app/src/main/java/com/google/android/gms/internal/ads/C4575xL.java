package com.google.android.gms.internal.ads;

import F2.InterfaceC0572d;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4575xL {

    /* renamed from: a, reason: collision with root package name */
    private final C2817hC f27843a;

    /* renamed from: b, reason: collision with root package name */
    private final SC f27844b;

    /* renamed from: c, reason: collision with root package name */
    private final C2601fD f27845c;

    /* renamed from: d, reason: collision with root package name */
    private final C3906rD f27846d;

    /* renamed from: e, reason: collision with root package name */
    private final LE f27847e;

    /* renamed from: f, reason: collision with root package name */
    private final C3695pG f27848f;

    /* renamed from: g, reason: collision with root package name */
    private final HN f27849g;

    /* renamed from: h, reason: collision with root package name */
    private final C2959ia0 f27850h;

    /* renamed from: i, reason: collision with root package name */
    private final JS f27851i;

    /* renamed from: j, reason: collision with root package name */
    private final C3874qx f27852j;

    C4575xL(C2817hC c2817hC, SC sc, C2601fD c2601fD, C3906rD c3906rD, LE le, C3695pG c3695pG, HN hn, C2959ia0 c2959ia0, JS js, C3874qx c3874qx) {
        this.f27843a = c2817hC;
        this.f27844b = sc;
        this.f27845c = c2601fD;
        this.f27846d = c3906rD;
        this.f27847e = le;
        this.f27848f = c3695pG;
        this.f27849g = hn;
        this.f27850h = c2959ia0;
        this.f27851i = js;
        this.f27852j = c3874qx;
    }

    public final void a(C4684yL c4684yL, InterfaceC4410vt interfaceC4410vt) {
        C4357vL c4357vL = c4684yL.f28107a;
        final SC sc = this.f27844b;
        Objects.requireNonNull(sc);
        c4357vL.c(this.f27843a, this.f27845c, this.f27846d, this.f27847e, new InterfaceC0572d() { // from class: com.google.android.gms.internal.ads.wL
            @Override // F2.InterfaceC0572d
            public final void g() {
                sc.zzb();
            }
        }, this.f27848f);
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.aa)).booleanValue() || interfaceC4410vt == null || interfaceC4410vt.L() == null) {
            return;
        }
        InterfaceC3759pu L7 = interfaceC4410vt.L();
        L7.o0(this.f27852j, this.f27851i, this.f27850h);
        L7.b1(this.f27852j, this.f27851i, this.f27849g);
    }
}
