package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
final class L extends O {

    /* renamed from: u, reason: collision with root package name */
    private final int f30061u;

    L(byte[] bArr, int i8, int i9) {
        super(bArr);
        Q.p(0, i9, bArr.length);
        this.f30061u = i9;
    }

    @Override // com.google.android.gms.internal.wearable.O, com.google.android.gms.internal.wearable.Q
    public final byte b(int i8) {
        int i9 = this.f30061u;
        if (((i9 - (i8 + 1)) | i8) >= 0) {
            return this.f30079t[i8];
        }
        if (i8 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
    }

    @Override // com.google.android.gms.internal.wearable.O, com.google.android.gms.internal.wearable.Q
    final byte c(int i8) {
        return this.f30079t[i8];
    }

    @Override // com.google.android.gms.internal.wearable.O, com.google.android.gms.internal.wearable.Q
    public final int d() {
        return this.f30061u;
    }

    @Override // com.google.android.gms.internal.wearable.O, com.google.android.gms.internal.wearable.Q
    protected final void e(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f30079t, 0, bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.wearable.O
    protected final int t() {
        return 0;
    }
}
