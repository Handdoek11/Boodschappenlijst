package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1220Cz {

    /* renamed from: a, reason: collision with root package name */
    private final ED f14305a;

    /* renamed from: b, reason: collision with root package name */
    private final NE f14306b;

    public C1220Cz(ED ed, NE ne) {
        this.f14305a = ed;
        this.f14306b = ne;
    }

    public final ED a() {
        return this.f14305a;
    }

    final NE b() {
        return this.f14306b;
    }

    final C3041jG c() {
        NE ne = this.f14306b;
        return ne != null ? new C3041jG(ne, AbstractC1497Kq.f16650g) : new C3041jG(new C1184Bz(this), AbstractC1497Kq.f16650g);
    }
}
