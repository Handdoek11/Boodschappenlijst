package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class Pt0 implements InterfaceC2123ar0 {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f18287a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18288b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f18289c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18290d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Pt0(java.lang.String r6, java.security.Key r7) {
        /*
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.Ot0 r0 = new com.google.android.gms.internal.ads.Ot0
            r0.<init>(r5)
            r5.f18287a = r0
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.AbstractC4183to0.a(r1)
            if (r2 == 0) goto L8e
            r5.f18288b = r6
            r5.f18289c = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L86
            int r7 = r6.hashCode()
            r2 = 1
            r3 = 3
            r4 = 4
            switch(r7) {
                case -1823053428: goto L51;
                case 392315023: goto L47;
                case 392315118: goto L3d;
                case 392316170: goto L33;
                case 392317873: goto L29;
                default: goto L28;
            }
        L28:
            goto L5b
        L29:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = r4
            goto L5c
        L33:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = r3
            goto L5c
        L3d:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = r1
            goto L5c
        L47:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = r2
            goto L5c
        L51:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 0
            goto L5c
        L5b:
            r7 = -1
        L5c:
            if (r7 == 0) goto L7e
            if (r7 == r2) goto L7b
            if (r7 == r1) goto L78
            if (r7 == r3) goto L75
            if (r7 != r4) goto L69
            r6 = 64
            goto L80
        L69:
            java.lang.String r7 = "unknown Hmac algorithm: "
            java.lang.String r6 = r7.concat(r6)
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            r7.<init>(r6)
            throw r7
        L75:
            r6 = 48
            goto L80
        L78:
            r6 = 32
            goto L80
        L7b:
            r6 = 28
            goto L80
        L7e:
            r6 = 20
        L80:
            r5.f18290d = r6
            r0.get()
            return
        L86:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L8e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Pt0.<init>(java.lang.String, java.security.Key):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2123ar0
    public final byte[] a(byte[] bArr, int i8) {
        if (i8 > this.f18290d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f18287a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f18287a.get()).doFinal(), i8);
    }
}
