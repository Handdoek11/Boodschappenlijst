package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Map;

/* loaded from: classes.dex */
abstract class Zx0 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f20579a;

    Zx0(Map map) {
        this.f20579a = DesugarCollections.unmodifiableMap(map);
    }

    final Map a() {
        return this.f20579a;
    }
}
