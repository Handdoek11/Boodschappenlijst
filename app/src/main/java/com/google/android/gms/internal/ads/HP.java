package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class HP extends Q2.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f15721a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f15722b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LP f15723c;

    HP(LP lp, String str, String str2) {
        this.f15721a = str;
        this.f15722b = str2;
        this.f15723c = lp;
    }

    @Override // w2.AbstractC6879e
    public final void a(w2.m mVar) {
        this.f15723c.D7(LP.C7(mVar), this.f15722b);
    }

    @Override // w2.AbstractC6879e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.f15722b;
        this.f15723c.x7(this.f15721a, (Q2.a) obj, str);
    }
}
