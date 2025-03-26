package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4193tt0 {
    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8) {
        if (i8 < 0 || byteBuffer2.remaining() < i8 || byteBuffer3.remaining() < i8 || byteBuffer.remaining() < i8) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] b(byte[]... bArr) {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= bArr.length) {
                byte[] bArr2 = new byte[i9];
                int i10 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i10, length);
                    i10 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i8].length;
            if (i9 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i9 += length2;
            i8++;
        }
    }

    public static final byte[] c(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        if (bArr.length - 16 < i8) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11 + i8] ^ bArr2[i11]);
        }
        return bArr3;
    }
}
