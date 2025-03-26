package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class ZR implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4333v80 f20480a;

    ZR(C2080aS c2080aS, InterfaceC4333v80 interfaceC4333v80) {
        this.f20480a = interfaceC4333v80;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        H2.p.d("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            this.f20480a.a((SQLiteDatabase) obj);
        } catch (Exception e8) {
            H2.p.d("Error executing function on offline signal database: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
