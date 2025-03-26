package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3338m1 implements InterfaceC2795h1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24410a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24411b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24412c;

    private C3338m1(int i8, int i9, int i10, int i11) {
        this.f24410a = i8;
        this.f24411b = i9;
        this.f24412c = i10;
    }

    public static C3338m1 a(UQ uq) {
        int y7 = uq.y();
        uq.m(8);
        int y8 = uq.y();
        int y9 = uq.y();
        uq.m(4);
        int y10 = uq.y();
        uq.m(12);
        return new C3338m1(y7, y8, y9, y10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2795h1
    public final int zza() {
        return 1751742049;
    }
}
