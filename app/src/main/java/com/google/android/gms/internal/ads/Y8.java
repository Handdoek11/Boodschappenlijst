package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes.dex */
public abstract class Y8 {
    public static String a(byte[] bArr, boolean z7) {
        return Base64.encodeToString(bArr, true != z7 ? 2 : 11);
    }

    public static byte[] b(String str, boolean z7) {
        byte[] decode = Base64.decode(str, 2);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
