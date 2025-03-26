package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ut0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4302ut0 implements Ik0 {

    /* renamed from: a, reason: collision with root package name */
    private final Yn0 f27134a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27135b;

    private C4302ut0(byte[] bArr, byte[] bArr2) {
        this.f27134a = new Yn0(bArr);
        this.f27135b = bArr2;
    }

    public static Ik0 b(C3744pm0 c3744pm0) {
        return new C4302ut0(c3744pm0.d().d(Rk0.a()), c3744pm0.c().c());
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f27134a.b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f27135b;
        if (bArr3.length == 0) {
            return c(bArr, bArr2);
        }
        if (!Wp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f27135b;
        return c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
