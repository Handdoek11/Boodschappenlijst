package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: com.google.android.gms.internal.ads.fo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2660fo0 implements Ik0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f22113a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22114b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2123ar0 f22115c;

    private C2660fo0(byte[] bArr, Tt0 tt0, int i8) {
        this.f22115c = new Nt0(bArr);
        this.f22113a = tt0.c();
        this.f22114b = i8;
    }

    public static Ik0 b(C2549en0 c2549en0) {
        return new C2660fo0(c2549en0.d().d(Rk0.a()), c2549en0.c(), c2549en0.b().b());
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f22113a;
        int i8 = this.f22114b;
        int length = bArr.length;
        if (length < bArr3.length + i8 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Wp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f22113a;
        int i9 = this.f22114b;
        int length2 = bArr4.length;
        int i10 = i9 + length2;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i10);
        byte[] bArr5 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr6 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = copyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
        System.arraycopy(copyOfRange, 0, bArr6, 4, length3);
        byte[] bArr7 = new byte[32];
        System.arraycopy(this.f22115c.a(bArr5, 16), 0, bArr7, 0, 16);
        System.arraycopy(this.f22115c.a(bArr6, 16), 0, bArr7, 16, 16);
        if (!AbstractC4183to0.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey c8 = Dn0.c(bArr7);
        int i11 = i10 + 12;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i10, i11);
        if (copyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i10 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec a8 = Dn0.a(copyOfRange2, 0, 12);
        Cipher b8 = Dn0.b();
        b8.init(2, c8, a8);
        if (bArr2 != null && bArr2.length != 0) {
            b8.updateAAD(bArr2);
        }
        return b8.doFinal(bArr, i11, length - i11);
    }
}
