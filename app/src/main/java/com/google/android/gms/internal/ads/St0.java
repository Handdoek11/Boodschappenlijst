package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class St0 implements Ik0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2334co0 f18979a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f18980b;

    private St0(byte[] bArr, byte[] bArr2) {
        this.f18979a = new C2334co0(bArr);
        this.f18980b = bArr2;
    }

    public static Ik0 b(C3201kn0 c3201kn0) {
        return new St0(c3201kn0.d().d(Rk0.a()), c3201kn0.c().c());
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f18979a.b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f18980b;
        if (bArr3.length == 0) {
            return c(bArr, bArr2);
        }
        if (!Wp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f18980b;
        return c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
