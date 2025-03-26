package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.os.Bundle;
import android.os.DeadObjectException;

/* renamed from: com.google.android.gms.internal.ads.Ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1261Ec implements AbstractC0765d.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1333Gc f14753a;

    C1261Ec(C1333Gc c1333Gc) {
        this.f14753a = c1333Gc;
    }

    @Override // Z2.AbstractC0765d.a
    public final void J0(Bundle bundle) {
        C1333Gc c1333Gc;
        synchronized (this.f14753a.f15411c) {
            try {
                c1333Gc = this.f14753a;
            } catch (DeadObjectException e8) {
                H2.p.e("Unable to obtain a cache service instance.", e8);
                C1333Gc.h(this.f14753a);
            }
            if (c1333Gc.f15412d != null) {
                c1333Gc.f15414f = c1333Gc.f15412d.k0();
                this.f14753a.f15411c.notifyAll();
            } else {
                this.f14753a.f15411c.notifyAll();
            }
        }
    }

    @Override // Z2.AbstractC0765d.a
    public final void w0(int i8) {
        synchronized (this.f14753a.f15411c) {
            this.f14753a.f15414f = null;
            this.f14753a.f15411c.notifyAll();
        }
    }
}
