package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3669p3 implements InterfaceC3233l3 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f25323a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25324b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25325c;

    /* renamed from: d, reason: collision with root package name */
    private int f25326d;

    /* renamed from: e, reason: collision with root package name */
    private int f25327e;

    public C3669p3(C3064jZ c3064jZ) {
        UQ uq = c3064jZ.f23275b;
        this.f25323a = uq;
        uq.l(12);
        this.f25325c = uq.F() & 255;
        this.f25324b = uq.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3233l3
    public final int a() {
        int i8 = this.f25325c;
        if (i8 == 8) {
            return this.f25323a.C();
        }
        if (i8 == 16) {
            return this.f25323a.G();
        }
        int i9 = this.f25326d;
        this.f25326d = i9 + 1;
        if (i9 % 2 != 0) {
            return this.f25327e & 15;
        }
        int C7 = this.f25323a.C();
        this.f25327e = C7;
        return (C7 & 240) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3233l3
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3233l3
    public final int zzb() {
        return this.f25324b;
    }
}
