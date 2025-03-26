package f3;

import android.util.Base64;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5779c {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
