package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.ph0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3734ph0 extends AbstractC1554Mg0 implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    final Object f25487o;

    /* renamed from: s, reason: collision with root package name */
    final Object f25488s;

    C3734ph0(Object obj, Object obj2) {
        this.f25487o = obj;
        this.f25488s = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1554Mg0, java.util.Map.Entry
    public final Object getKey() {
        return this.f25487o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1554Mg0, java.util.Map.Entry
    public final Object getValue() {
        return this.f25488s;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
