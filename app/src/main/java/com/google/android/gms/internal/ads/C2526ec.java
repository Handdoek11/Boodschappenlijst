package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2526ec extends AbstractC1998Zb {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f21849c;

    @Override // com.google.android.gms.internal.ads.AbstractC1998Zb
    public final byte[] b(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i8 = 4;
        if (length == 1) {
            int a8 = AbstractC2418dc.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a8);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i9 = 0; i9 < split.length; i9++) {
                    int a9 = AbstractC2418dc.a(split[i9]);
                    int i10 = (a9 >> 16) ^ ((char) a9);
                    byte b8 = (byte) i10;
                    byte b9 = (byte) (i10 >> 8);
                    int i11 = i9 + i9;
                    bArr[i11] = new byte[]{b8, b9}[0];
                    bArr[i11 + 1] = b9;
                }
            } else {
                bArr = new byte[length];
                for (int i12 = 0; i12 < split.length; i12++) {
                    int a10 = AbstractC2418dc.a(split[i12]);
                    bArr[i12] = (byte) ((a10 >> 24) ^ (((a10 & 255) ^ ((a10 >> 8) & 255)) ^ ((a10 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f21849c = a();
        synchronized (this.f20508a) {
            try {
                MessageDigest messageDigest = this.f21849c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f21849c.update(bArr2);
                byte[] digest = this.f21849c.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i8 = length2;
                }
                byte[] bArr3 = new byte[i8];
                System.arraycopy(digest, 0, bArr3, 0, i8);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
