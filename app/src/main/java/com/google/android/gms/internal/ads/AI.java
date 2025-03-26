package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class AI implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f13534a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CI f13535b;

    AI(CI ci, View view) {
        this.f13534a = view;
        this.f13535b = ci;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23952m5)).booleanValue()) {
            C2.v.s().w(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.f13535b.N(this.f13534a, (C3929rT) obj);
    }
}
