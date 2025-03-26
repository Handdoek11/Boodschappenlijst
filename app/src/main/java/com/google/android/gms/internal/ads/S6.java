package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class S6 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f18831o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ long f18832s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ U6 f18833t;

    S6(U6 u62, String str, long j8) {
        this.f18831o = str;
        this.f18832s = j8;
        this.f18833t = u62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18833t.f19296o.a(this.f18831o, this.f18832s);
        U6 u62 = this.f18833t;
        u62.f19296o.b(u62.toString());
    }
}
