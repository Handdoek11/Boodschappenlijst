package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class S5 extends AbstractC2249c0 {
    public S5(BU bu, long j8, long j9) {
        super(new X(), new Q5(bu, null), j8, 0L, j8 + 1, 0L, j9, 188L, 1000);
    }

    static /* bridge */ /* synthetic */ int h(byte[] bArr, int i8) {
        return (bArr[i8 + 3] & 255) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
    }
}
