package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class Pn0 implements Ik0 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f18271c = Kt0.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f18272d = Kt0.a("070000004041424344454647");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f18273e = Kt0.a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f18274f = new On0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f18275a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f18276b;

    private Pn0(byte[] bArr, byte[] bArr2) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!e()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f18275a = new SecretKeySpec(bArr, "ChaCha20");
        this.f18276b = bArr2;
    }

    public static Ik0 b(C3744pm0 c3744pm0) {
        return new Pn0(c3744pm0.d().d(Rk0.a()), c3744pm0.c().c());
    }

    static Cipher c() {
        return (Cipher) f18274f.get();
    }

    public static boolean e() {
        return f18274f.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f18272d);
            byte[] bArr = f18271c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f18273e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f18276b;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Wp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f18276b.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f18274f.get();
        cipher.init(2, this.f18275a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, this.f18276b.length + 12, (r1 - r7) - 12);
    }
}
