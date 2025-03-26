package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;

/* loaded from: classes.dex */
public final class OA implements InterfaceC2388dF, ZC {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5781e f17844o;

    /* renamed from: s, reason: collision with root package name */
    private final QA f17845s;

    /* renamed from: t, reason: collision with root package name */
    private final L60 f17846t;

    /* renamed from: u, reason: collision with root package name */
    private final String f17847u;

    OA(InterfaceC5781e interfaceC5781e, QA qa, L60 l60, String str) {
        this.f17844o = interfaceC5781e;
        this.f17845s = qa;
        this.f17846t = l60;
        this.f17847u = str;
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void s() {
        InterfaceC5781e interfaceC5781e = this.f17844o;
        this.f17845s.d(this.f17846t.f16768f, this.f17847u, interfaceC5781e.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2388dF
    public final void zza() {
        this.f17845s.e(this.f17847u, this.f17844o.b());
    }
}
