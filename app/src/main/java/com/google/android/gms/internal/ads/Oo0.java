package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Oo0 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f17949a = new HashMap();

    public final Qo0 a() {
        if (this.f17949a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Qo0 qo0 = new Qo0(DesugarCollections.unmodifiableMap(this.f17949a), null);
        this.f17949a = null;
        return qo0;
    }
}
