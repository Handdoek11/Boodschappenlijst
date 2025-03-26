package com.google.android.gms.internal.ads;

import M2.AbstractC0658e;
import M2.InterfaceC0657d;

/* renamed from: com.google.android.gms.internal.ads.Mv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1571Mv implements InterfaceC0657d {

    /* renamed from: a, reason: collision with root package name */
    private final C3107jv f17426a;

    /* renamed from: b, reason: collision with root package name */
    private SB f17427b;

    /* renamed from: c, reason: collision with root package name */
    private M2.B f17428c;

    /* synthetic */ C1571Mv(C3107jv c3107jv, AbstractC1676Pv abstractC1676Pv) {
        this.f17426a = c3107jv;
    }

    @Override // M2.InterfaceC0657d
    public final AbstractC0658e a() {
        AbstractC3332ly0.c(this.f17427b, SB.class);
        AbstractC3332ly0.c(this.f17428c, M2.B.class);
        return new C1606Nv(this.f17426a, this.f17428c, new C4009sA(), new C4120tB(), new XN(), this.f17427b, null, null, null);
    }

    @Override // M2.InterfaceC0657d
    public final /* bridge */ /* synthetic */ InterfaceC0657d b(M2.B b8) {
        this.f17428c = b8;
        return this;
    }

    @Override // M2.InterfaceC0657d
    public final /* bridge */ /* synthetic */ InterfaceC0657d c(SB sb) {
        this.f17427b = sb;
        return this;
    }
}
