package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class IS implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4333v80 f15949a;

    IS(JS js, InterfaceC4333v80 interfaceC4333v80) {
        this.f15949a = interfaceC4333v80;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        H2.p.d("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            this.f15949a.a((SQLiteDatabase) obj);
        } catch (Exception e8) {
            H2.p.d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
