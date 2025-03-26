package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class M1 implements InterfaceC4207u0 {

    /* renamed from: o, reason: collision with root package name */
    private final long f17190o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC4207u0 f17191s;

    public M1(long j8, InterfaceC4207u0 interfaceC4207u0) {
        this.f17190o = j8;
        this.f17191s = interfaceC4207u0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207u0
    public final void P() {
        this.f17191s.P();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207u0
    public final void Q(R0 r02) {
        this.f17191s.Q(new L1(this, r02, r02));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207u0
    public final Y0 R(int i8, int i9) {
        return this.f17191s.R(i8, i9);
    }
}
