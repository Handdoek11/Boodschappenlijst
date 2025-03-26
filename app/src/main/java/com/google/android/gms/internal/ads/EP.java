package com.google.android.gms.internal.ads;

import w2.AbstractC6878d;

/* loaded from: classes.dex */
final class EP extends AbstractC6878d {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f14731o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ w2.i f14732s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ String f14733t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ LP f14734u;

    EP(LP lp, String str, w2.i iVar, String str2) {
        this.f14731o = str;
        this.f14732s = iVar;
        this.f14733t = str2;
        this.f14734u = lp;
    }

    @Override // w2.AbstractC6878d
    public final void i(w2.m mVar) {
        this.f14734u.D7(LP.C7(mVar), this.f14733t);
    }

    @Override // w2.AbstractC6878d
    public final void o() {
        this.f14734u.x7(this.f14731o, this.f14732s, this.f14733t);
    }
}
