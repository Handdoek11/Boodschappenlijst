package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2226bo0 extends Xn0 {
    public C2226bo0(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.Xn0
    final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.Xn0
    final int[] b(int[] iArr, int i8) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        Vn0.b(iArr2, Vn0.d(this.f20138a, iArr));
        iArr2[12] = i8;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
