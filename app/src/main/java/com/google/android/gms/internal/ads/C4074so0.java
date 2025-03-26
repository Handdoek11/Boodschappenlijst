package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.so0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4074so0 implements Ik0 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f26736c = Kt0.a("7a806c");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f26737d = Kt0.a("46bb91c3c5");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f26738e = Kt0.a("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f26739f = Kt0.a("bae8e37fc83441b16034566b");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f26740g = Kt0.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal f26741h = new C3965ro0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f26742a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f26743b;

    private C4074so0(byte[] bArr, byte[] bArr2) {
        this.f26743b = bArr2;
        Rt0.a(bArr.length);
        this.f26742a = new SecretKeySpec(bArr, "AES");
    }

    public static Ik0 b(C2765gm0 c2765gm0) {
        return new C4074so0(c2765gm0.d().d(Rk0.a()), c2765gm0.c().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Cipher cipher) {
        try {
            byte[] bArr = f26739f;
            cipher.init(2, new SecretKeySpec(f26738e, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f26737d);
            byte[] bArr2 = f26740g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f26736c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private final byte[] e(byte[] bArr, byte[] bArr2) {
        Cipher cipher = (Cipher) f26741h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f26742a, new GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f26743b;
        if (bArr3.length == 0) {
            return e(bArr, bArr2);
        }
        if (!Wp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f26743b;
        return e(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
