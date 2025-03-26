package com.google.android.gms.internal.ads;

import F2.InterfaceC0572d;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.oL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3595oL {

    /* renamed from: a, reason: collision with root package name */
    private final C2817hC f25157a;

    /* renamed from: b, reason: collision with root package name */
    private final SC f25158b;

    /* renamed from: c, reason: collision with root package name */
    private final C2601fD f25159c;

    /* renamed from: d, reason: collision with root package name */
    private final C3906rD f25160d;

    /* renamed from: e, reason: collision with root package name */
    private final LE f25161e;

    /* renamed from: f, reason: collision with root package name */
    private final C3785q60 f25162f;

    /* renamed from: g, reason: collision with root package name */
    private final C4111t60 f25163g;

    /* renamed from: h, reason: collision with root package name */
    private final C3874qx f25164h;

    public C3595oL(C2817hC c2817hC, SC sc, C2601fD c2601fD, C3906rD c3906rD, LE le, C3785q60 c3785q60, C4111t60 c4111t60, C3874qx c3874qx) {
        this.f25157a = c2817hC;
        this.f25158b = sc;
        this.f25159c = c2601fD;
        this.f25160d = c3906rD;
        this.f25161e = le;
        this.f25162f = c3785q60;
        this.f25163g = c4111t60;
        this.f25164h = c3874qx;
    }

    public final void a(C4030sL c4030sL) {
        final SC sc = this.f25158b;
        C2507eL c2507eL = c4030sL.f26637a;
        Objects.requireNonNull(sc);
        c2507eL.a(this.f25157a, this.f25159c, this.f25160d, this.f25161e, new InterfaceC0572d() { // from class: com.google.android.gms.internal.ads.nL
            @Override // F2.InterfaceC0572d
            public final void g() {
                sc.zzb();
            }
        });
        c4030sL.h(this.f25162f, this.f25163g, this.f25164h);
    }
}
