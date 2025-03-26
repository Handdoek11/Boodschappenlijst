package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3447n1 implements InterfaceC2795h1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24855a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24856b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24857c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24858d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24859e;

    private C3447n1(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f24855a = i8;
        this.f24856b = i10;
        this.f24857c = i11;
        this.f24858d = i12;
        this.f24859e = i13;
    }

    public static C3447n1 a(UQ uq) {
        int y7 = uq.y();
        uq.m(12);
        int y8 = uq.y();
        int y9 = uq.y();
        int y10 = uq.y();
        uq.m(4);
        int y11 = uq.y();
        int y12 = uq.y();
        uq.m(8);
        return new C3447n1(y7, y8, y9, y10, y11, y12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2795h1
    public final int zza() {
        return 1752331379;
    }
}
