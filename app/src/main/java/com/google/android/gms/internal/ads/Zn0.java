package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: classes.dex */
abstract class Zn0 {

    /* renamed from: a, reason: collision with root package name */
    private final Xn0 f20548a;

    /* renamed from: b, reason: collision with root package name */
    private final Xn0 f20549b;

    public Zn0(byte[] bArr) {
        if (!AbstractC4183to0.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f20548a = a(bArr, 1);
        this.f20549b = a(bArr, 0);
    }

    abstract Xn0 a(byte[] bArr, int i8);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f20549b.c(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i8 = length & 15;
            int i9 = i8 == 0 ? length : (length + 16) - i8;
            int remaining = byteBuffer.remaining();
            int i10 = remaining % 16;
            int i11 = (i10 == 0 ? remaining : (remaining + 16) - i10) + i9;
            ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i9);
            order.put(byteBuffer);
            order.position(i11);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(AbstractC2551eo0.a(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            return this.f20548a.d(bArr, byteBuffer);
        } catch (GeneralSecurityException e8) {
            throw new AEADBadTagException(e8.toString());
        }
    }
}
