package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import com.google.android.gms.common.C1103b;

/* renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1825Uc implements AbstractC0765d.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1811Tq f19423a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1860Vc f19424b;

    C1825Uc(C1860Vc c1860Vc, C1811Tq c1811Tq) {
        this.f19423a = c1811Tq;
        this.f19424b = c1860Vc;
    }

    @Override // Z2.AbstractC0765d.b
    public final void D0(C1103b c1103b) {
        synchronized (this.f19424b.f19634d) {
            this.f19423a.d(new RuntimeException("Connection failed."));
        }
    }
}
