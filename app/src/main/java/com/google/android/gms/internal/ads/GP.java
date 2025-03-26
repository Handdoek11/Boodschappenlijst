package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class GP extends P2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f15365a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f15366b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LP f15367c;

    GP(LP lp, String str, String str2) {
        this.f15365a = str;
        this.f15366b = str2;
        this.f15367c = lp;
    }

    @Override // w2.AbstractC6879e
    public final void a(w2.m mVar) {
        this.f15367c.D7(LP.C7(mVar), this.f15366b);
    }

    @Override // w2.AbstractC6879e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.f15366b;
        this.f15367c.x7(this.f15365a, (P2.c) obj, str);
    }
}
