package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class FP extends I2.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f15143a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f15144b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LP f15145c;

    FP(LP lp, String str, String str2) {
        this.f15143a = str;
        this.f15144b = str2;
        this.f15145c = lp;
    }

    @Override // w2.AbstractC6879e
    public final void a(w2.m mVar) {
        this.f15145c.D7(LP.C7(mVar), this.f15144b);
    }

    @Override // w2.AbstractC6879e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.f15144b;
        this.f15145c.x7(this.f15143a, (I2.a) obj, str);
    }
}
