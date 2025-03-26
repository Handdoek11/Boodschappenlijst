package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12831a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f12832b = new HashMap();

    p() {
    }

    private Map b(boolean z7) {
        return z7 ? this.f12832b : this.f12831a;
    }

    k a(J1.e eVar, boolean z7) {
        return (k) b(z7).get(eVar);
    }

    void c(J1.e eVar, k kVar) {
        b(kVar.p()).put(eVar, kVar);
    }

    void d(J1.e eVar, k kVar) {
        Map b8 = b(kVar.p());
        if (kVar.equals(b8.get(eVar))) {
            b8.remove(eVar);
        }
    }
}
