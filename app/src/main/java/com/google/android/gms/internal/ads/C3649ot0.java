package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.ot0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3649ot0 implements Lt0 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f25285d = new C3540nt0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f25286a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25287b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25288c;

    public C3649ot0(byte[] bArr, int i8) {
        if (!AbstractC4183to0.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        Rt0.a(bArr.length);
        this.f25286a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f25285d.get()).getBlockSize();
        this.f25288c = blockSize;
        if (i8 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f25287b = i8;
    }

    @Override // com.google.android.gms.internal.ads.Lt0
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i8 = this.f25287b;
        if (length < i8) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        int i9 = this.f25287b;
        int i10 = length - i9;
        byte[] bArr3 = new byte[i10];
        Cipher cipher = (Cipher) f25285d.get();
        byte[] bArr4 = new byte[this.f25288c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.f25287b);
        cipher.init(2, this.f25286a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i9, i10, bArr3, 0) == i10) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
