package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class O3 extends V3 {

    /* renamed from: v, reason: collision with root package name */
    private final int f28973v;

    /* renamed from: w, reason: collision with root package name */
    private final int f28974w;

    O3(byte[] bArr, int i8, int i9) {
        super(bArr);
        K3.e(i8, i8 + i9, bArr.length);
        this.f28973v = i8;
        this.f28974w = i9;
    }

    @Override // com.google.android.gms.internal.measurement.V3, com.google.android.gms.internal.measurement.K3
    public final byte b(int i8) {
        int s8 = s();
        if (((s8 - (i8 + 1)) | i8) >= 0) {
            return this.f29039u[this.f28973v + i8];
        }
        if (i8 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + s8);
    }

    @Override // com.google.android.gms.internal.measurement.V3, com.google.android.gms.internal.measurement.K3
    final byte r(int i8) {
        return this.f29039u[this.f28973v + i8];
    }

    @Override // com.google.android.gms.internal.measurement.V3, com.google.android.gms.internal.measurement.K3
    public final int s() {
        return this.f28974w;
    }

    @Override // com.google.android.gms.internal.measurement.V3
    protected final int x() {
        return this.f28973v;
    }
}
