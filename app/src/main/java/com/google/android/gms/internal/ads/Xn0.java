package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class Xn0 {

    /* renamed from: a, reason: collision with root package name */
    int[] f20138a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20139b;

    public Xn0(byte[] bArr, int i8) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f20138a = Vn0.e(bArr);
        this.f20139b = i8;
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i8);

    final ByteBuffer c(byte[] bArr, int i8) {
        int[] b8 = b(Vn0.e(bArr), i8);
        int[] iArr = (int[]) b8.clone();
        Vn0.c(iArr);
        for (int i9 = 0; i9 < 16; i9++) {
            b8[i9] = b8[i9] + iArr[i9];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b8, 0, 16);
        return order;
    }

    public final byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int remaining = byteBuffer.remaining();
        int i8 = remaining / 64;
        for (int i9 = 0; i9 < i8 + 1; i9++) {
            ByteBuffer c8 = c(bArr, this.f20139b + i9);
            if (i9 == i8) {
                AbstractC4193tt0.a(allocate, byteBuffer, c8, remaining % 64);
            } else {
                AbstractC4193tt0.a(allocate, byteBuffer, c8, 64);
            }
        }
        return allocate.array();
    }
}
