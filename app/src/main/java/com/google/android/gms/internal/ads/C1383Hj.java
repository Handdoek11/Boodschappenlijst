package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import com.google.android.gms.common.C1103b;

/* renamed from: com.google.android.gms.internal.ads.Hj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1383Hj implements AbstractC0765d.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1811Tq f15781a;

    C1383Hj(C1419Ij c1419Ij, C1811Tq c1811Tq) {
        this.f15781a = c1811Tq;
    }

    @Override // Z2.AbstractC0765d.b
    public final void D0(C1103b c1103b) {
        this.f15781a.d(new RuntimeException("Connection failed."));
    }
}
