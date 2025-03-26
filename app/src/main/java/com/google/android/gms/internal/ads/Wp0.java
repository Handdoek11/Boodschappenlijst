package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Wp0 {
    static {
        Charset.forName("UTF-8");
    }

    public static final Tt0 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i8] = (byte) charAt;
        }
        return Tt0.b(bArr);
    }

    public static final Tt0 b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt < '!' || charAt > '~') {
                throw new zzgnt("Not a printable ASCII character: " + charAt);
            }
            bArr[i8] = (byte) charAt;
        }
        return Tt0.b(bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i8 = 0; i8 < bArr.length; i8++) {
            if (bArr2[i8] != bArr[i8]) {
                return false;
            }
        }
        return true;
    }
}
