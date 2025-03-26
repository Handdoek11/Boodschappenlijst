package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class T4 implements InterfaceC3126k4 {

    /* renamed from: a, reason: collision with root package name */
    private final M4 f19057a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f19058b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f19059c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f19060d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f19061e;

    public T4(M4 m42, Map map, Map map2, Map map3) {
        this.f19057a = m42;
        this.f19060d = map2;
        this.f19061e = map3;
        this.f19059c = DesugarCollections.unmodifiableMap(map);
        this.f19058b = m42.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126k4
    public final long A(int i8) {
        return this.f19058b[i8];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126k4
    public final List a(long j8) {
        return this.f19057a.e(j8, this.f19059c, this.f19060d, this.f19061e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126k4
    public final int zza() {
        return this.f19058b.length;
    }
}
