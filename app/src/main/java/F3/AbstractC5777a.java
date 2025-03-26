package f3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5777a {
    public static byte[] a(Context context, String str) {
        MessageDigest b8;
        PackageInfo f8 = h3.e.a(context).f(str, 64);
        Signature[] signatureArr = f8.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b8 = b("SHA1")) == null) {
            return null;
        }
        return b8.digest(f8.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
