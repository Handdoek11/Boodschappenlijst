package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Fx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1326Fx implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1469Jx f15225a;

    C1326Fx(C1469Jx c1469Jx) {
        this.f15225a = c1469Jx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        if (C1469Jx.g(this.f15225a, map)) {
            this.f15225a.f16466c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ex
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15026o.f15225a.f16467d.a();
                }
            });
        }
    }
}
