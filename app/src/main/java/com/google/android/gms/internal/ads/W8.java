package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class W8 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f19724a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f19725b;

    /* renamed from: c, reason: collision with root package name */
    private int f19726c;

    public W8(byte[] bArr) {
        for (int i8 = 0; i8 < 256; i8++) {
            this.f19724a[i8] = (byte) i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            byte[] bArr2 = this.f19724a;
            byte b8 = bArr2[i10];
            i9 = (i9 + b8 + bArr[i10 % bArr.length]) & 255;
            bArr2[i10] = bArr2[i9];
            bArr2[i9] = b8;
        }
        this.f19725b = 0;
        this.f19726c = 0;
    }

    public final void a(byte[] bArr) {
        int i8 = this.f19725b;
        int i9 = this.f19726c;
        for (int i10 = 0; i10 < 256; i10++) {
            byte[] bArr2 = this.f19724a;
            i8 = (i8 + 1) & 255;
            byte b8 = bArr2[i8];
            i9 = (i9 + b8) & 255;
            bArr2[i8] = bArr2[i9];
            bArr2[i9] = b8;
            bArr[i10] = (byte) (bArr2[(bArr2[i8] + b8) & 255] ^ bArr[i10]);
        }
        this.f19725b = i8;
        this.f19726c = i9;
    }
}
