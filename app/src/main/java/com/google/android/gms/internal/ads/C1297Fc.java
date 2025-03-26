package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import com.google.android.gms.common.C1103b;

/* renamed from: com.google.android.gms.internal.ads.Fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1297Fc implements AbstractC0765d.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1333Gc f15181a;

    C1297Fc(C1333Gc c1333Gc) {
        this.f15181a = c1333Gc;
    }

    @Override // Z2.AbstractC0765d.b
    public final void D0(C1103b c1103b) {
        synchronized (this.f15181a.f15411c) {
            try {
                this.f15181a.f15414f = null;
                C1333Gc c1333Gc = this.f15181a;
                if (c1333Gc.f15412d != null) {
                    c1333Gc.f15412d = null;
                }
                this.f15181a.f15411c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
