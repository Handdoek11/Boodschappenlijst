package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2853hc extends AbstractC1998Zb {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f22587c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22588d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22589e;

    public C2853hc(int i8) {
        int i9 = i8 >> 3;
        this.f22588d = (i8 & 7) > 0 ? i9 + 1 : i9;
        this.f22589e = i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1998Zb
    public final byte[] b(String str) {
        synchronized (this.f20508a) {
            try {
                MessageDigest a8 = a();
                this.f22587c = a8;
                if (a8 == null) {
                    return new byte[0];
                }
                a8.reset();
                this.f22587c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] digest = this.f22587c.digest();
                int length = digest.length;
                int i8 = this.f22588d;
                if (length > i8) {
                    length = i8;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                if ((this.f22589e & 7) > 0) {
                    long j8 = 0;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 > 0) {
                            j8 <<= 8;
                        }
                        j8 += bArr[i9] & 255;
                    }
                    long j9 = j8 >>> (8 - (this.f22589e & 7));
                    int i10 = this.f22588d;
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) (255 & j9);
                        j9 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
