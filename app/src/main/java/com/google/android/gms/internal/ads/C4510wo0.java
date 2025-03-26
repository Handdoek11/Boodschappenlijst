package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4510wo0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f27552a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final Map f27553b = new HashMap();

    /* synthetic */ C4510wo0(AbstractC4619xo0 abstractC4619xo0) {
    }

    public final C4510wo0 a(Enum r22, Object obj) {
        this.f27552a.put(r22, obj);
        this.f27553b.put(obj, r22);
        return this;
    }

    public final C4728yo0 b() {
        return new C4728yo0(DesugarCollections.unmodifiableMap(this.f27552a), DesugarCollections.unmodifiableMap(this.f27553b), null);
    }
}
