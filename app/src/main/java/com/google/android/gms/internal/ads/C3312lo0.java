package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.lo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3312lo0 implements Ik0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24386a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f24387b;

    private C3312lo0(byte[] bArr, byte[] bArr2) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!c()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f24386a = bArr;
        this.f24387b = bArr2;
    }

    public static Ik0 b(C3201kn0 c3201kn0) {
        return new C3312lo0(c3201kn0.d().d(Rk0.a()), c3201kn0.c().c());
    }

    public static boolean c() {
        return Pn0.c() != null;
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f24387b;
        if (bArr.length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Wp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.f24387b.length, bArr4, 0, 24);
        int[] d8 = Vn0.d(Vn0.e(this.f24386a), Vn0.e(bArr4));
        ByteBuffer order = ByteBuffer.allocate(d8.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Cipher c8 = Pn0.c();
        c8.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            c8.updateAAD(bArr2);
        }
        return c8.doFinal(bArr, this.f24387b.length + 24, (r1 - r10) - 24);
    }
}
