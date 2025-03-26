package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.os.Bundle;
import android.os.DeadObjectException;

/* renamed from: com.google.android.gms.internal.ads.Gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1347Gj implements AbstractC0765d.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1811Tq f15425a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1419Ij f15426b;

    C1347Gj(C1419Ij c1419Ij, C1811Tq c1811Tq) {
        this.f15425a = c1811Tq;
        this.f15426b = c1419Ij;
    }

    @Override // Z2.AbstractC0765d.a
    public final void J0(Bundle bundle) {
        try {
            this.f15425a.c(this.f15426b.f15987a.j0());
        } catch (DeadObjectException e8) {
            this.f15425a.d(e8);
        }
    }

    @Override // Z2.AbstractC0765d.a
    public final void w0(int i8) {
        this.f15425a.d(new RuntimeException("onConnectionSuspended: " + i8));
    }
}
