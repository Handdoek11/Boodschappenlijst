package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* renamed from: com.google.android.gms.internal.ads.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2653fl implements InterfaceC1951Xq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1491Kk f22106a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f22107b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1811Tq f22108c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2979il f22109d;

    C2653fl(C2979il c2979il, C1491Kk c1491Kk, Object obj, C1811Tq c1811Tq) {
        this.f22106a = c1491Kk;
        this.f22107b = obj;
        this.f22108c = c1811Tq;
        this.f22109d = c2979il;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1951Xq
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        AbstractC0608p0.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f22107b;
        C1811Tq c1811Tq = this.f22108c;
        C2979il.d(this.f22109d, this.f22106a, (InterfaceC1735Rk) obj, obj2, c1811Tq);
    }
}
