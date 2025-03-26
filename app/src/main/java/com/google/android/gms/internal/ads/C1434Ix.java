package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ix, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1434Ix implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1469Jx f16074a;

    C1434Ix(C1469Jx c1469Jx) {
        this.f16074a = c1469Jx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        if (C1469Jx.g(this.f16074a, map)) {
            this.f16074a.f16466c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Hx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15821o.f16074a.f16467d.d();
                }
            });
        }
    }
}
