package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: com.google.android.gms.internal.ads.st0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4084st0 implements Ik0 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f26750a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f26751b;

    private C4084st0(byte[] bArr, Tt0 tt0) {
        if (!AbstractC4183to0.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f26750a = Dn0.c(bArr);
        this.f26751b = tt0.c();
    }

    public static Ik0 b(Ul0 ul0) {
        return new C4084st0(ul0.d().d(Rk0.a()), ul0.c());
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f26751b;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Wp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec a8 = Dn0.a(bArr, this.f26751b.length, 12);
        SecretKey secretKey = this.f26750a;
        Cipher b8 = Dn0.b();
        b8.init(2, secretKey, a8);
        if (bArr2 != null && bArr2.length != 0) {
            b8.updateAAD(bArr2);
        }
        return b8.doFinal(bArr, this.f26751b.length + 12, (r1 - r7) - 12);
    }
}
