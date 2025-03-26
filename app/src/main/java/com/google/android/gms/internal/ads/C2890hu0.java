package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2890hu0 extends C3215ku0 {

    /* renamed from: u, reason: collision with root package name */
    private final int f22644u;

    /* renamed from: v, reason: collision with root package name */
    private final int f22645v;

    C2890hu0(byte[] bArr, int i8, int i9) {
        super(bArr);
        AbstractC3542nu0.w(i8, i8 + i9, bArr.length);
        this.f22644u = i8;
        this.f22645v = i9;
    }

    @Override // com.google.android.gms.internal.ads.C3215ku0
    protected final int O() {
        return this.f22644u;
    }

    @Override // com.google.android.gms.internal.ads.C3215ku0, com.google.android.gms.internal.ads.AbstractC3542nu0
    public final byte c(int i8) {
        AbstractC3542nu0.J(i8, this.f22645v);
        return this.f24108t[this.f22644u + i8];
    }

    @Override // com.google.android.gms.internal.ads.C3215ku0, com.google.android.gms.internal.ads.AbstractC3542nu0
    final byte d(int i8) {
        return this.f24108t[this.f22644u + i8];
    }

    @Override // com.google.android.gms.internal.ads.C3215ku0, com.google.android.gms.internal.ads.AbstractC3542nu0
    public final int j() {
        return this.f22645v;
    }

    @Override // com.google.android.gms.internal.ads.C3215ku0, com.google.android.gms.internal.ads.AbstractC3542nu0
    protected final void n(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f24108t, this.f22644u + i8, bArr, i9, i10);
    }
}
