package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.rt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3975rt0 implements Ik0 {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f26231f = new C3758pt0();

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal f26232g = new C3867qt0();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f26233a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f26234b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f26235c;

    /* renamed from: d, reason: collision with root package name */
    private final SecretKeySpec f26236d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26237e;

    private C3975rt0(byte[] bArr, int i8, byte[] bArr2) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i8 != 12 && i8 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f26237e = i8;
        Rt0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f26236d = secretKeySpec;
        Cipher cipher = (Cipher) f26231f.get();
        cipher.init(1, secretKeySpec);
        byte[] d8 = d(cipher.doFinal(new byte[16]));
        this.f26233a = d8;
        this.f26234b = d(d8);
        this.f26235c = bArr2;
    }

    public static Ik0 b(Kl0 kl0) {
        if (AbstractC4183to0.a(1)) {
            return new C3975rt0(kl0.d().d(Rk0.a()), kl0.b().b(), kl0.c().c());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            bArr[i8] = (byte) (bArr[i8] ^ bArr2[i8]);
        }
    }

    private static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i8 = 0;
        while (i8 < 15) {
            byte b8 = bArr[i8];
            int i9 = i8 + 1;
            bArr2[i8] = (byte) (((b8 + b8) ^ ((bArr[i9] & 255) >>> 7)) & 255);
            i8 = i9;
        }
        byte b9 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b9 + b9));
        return bArr2;
    }

    private final byte[] e(Cipher cipher, int i8, byte[] bArr, int i9, int i10) {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i8;
        if (i10 == 0) {
            c(bArr2, this.f26233a);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i11 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i10 - i11 <= 16) {
                break;
            }
            for (int i12 = 0; i12 < 16; i12++) {
                bArr2[i12] = (byte) (bArr[(i9 + i11) + i12] ^ bArr2[i12]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i11 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i11 + i9, i9 + i10);
        if (copyOfRange.length == 16) {
            c(copyOfRange, this.f26233a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f26234b, 16);
            int i13 = 0;
            while (true) {
                length = copyOfRange.length;
                if (i13 >= length) {
                    break;
                }
                copyOf[i13] = (byte) (copyOf[i13] ^ copyOfRange[i13]);
                i13++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            copyOfRange = copyOf;
        }
        c(bArr2, copyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f26235c;
        int length = bArr.length;
        int length2 = ((length - bArr3.length) - this.f26237e) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Wp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f26231f.get();
        cipher.init(1, this.f26236d);
        byte[] e8 = e(cipher, 0, bArr, this.f26235c.length, this.f26237e);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] e9 = e(cipher, 1, bArr4, 0, bArr4.length);
        byte[] e10 = e(cipher, 2, bArr, this.f26235c.length + this.f26237e, length2);
        int i8 = length - 16;
        byte b8 = 0;
        for (int i9 = 0; i9 < 16; i9++) {
            b8 = (byte) (b8 | (((bArr[i8 + i9] ^ e9[i9]) ^ e8[i9]) ^ e10[i9]));
        }
        if (b8 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f26232g.get();
        cipher2.init(1, this.f26236d, new IvParameterSpec(e8));
        return cipher2.doFinal(bArr, this.f26235c.length + this.f26237e, length2);
    }
}
