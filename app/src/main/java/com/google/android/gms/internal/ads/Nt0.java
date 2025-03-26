package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class Nt0 implements InterfaceC2123ar0 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f17656d = new Mt0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f17657a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f17658b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f17659c;

    public Nt0(byte[] bArr) {
        Rt0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f17657a = secretKeySpec;
        Cipher b8 = b();
        b8.init(1, secretKeySpec);
        byte[] a8 = Rq0.a(b8.doFinal(new byte[16]));
        this.f17658b = a8;
        this.f17659c = Rq0.a(a8);
    }

    private static Cipher b() {
        if (AbstractC4183to0.a(1)) {
            return (Cipher) f17656d.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2, int i8, byte[] bArr3) {
        for (int i9 = 0; i9 < 16; i9++) {
            bArr3[i9] = (byte) (bArr[i9] ^ bArr2[i9 + i8]);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2123ar0
    public final byte[] a(byte[] bArr, int i8) {
        byte[] c8;
        if (i8 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.f17657a;
        Cipher b8 = b();
        b8.init(1, secretKey);
        int length = bArr.length;
        int i9 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i10 = i9 - 1;
        int i11 = i10 * 16;
        if (i9 * 16 == length) {
            c8 = AbstractC4193tt0.c(bArr, i11, this.f17658b, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i11, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            byte[] bArr2 = this.f17659c;
            if (copyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            c8 = AbstractC4193tt0.c(copyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i12 = 0; i12 < i10; i12++) {
            c(bArr3, bArr, i12 * 16, bArr4);
            if (b8.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        c(bArr3, c8, 0, bArr4);
        if (b8.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i8 == 16 ? bArr3 : Arrays.copyOf(bArr3, i8);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
