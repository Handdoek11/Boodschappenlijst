package p3;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: p3.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6353m0 {

    /* renamed from: a, reason: collision with root package name */
    private static String f40349a;

    public static synchronized String a(Context context) {
        String str;
        synchronized (AbstractC6353m0.class) {
            try {
                if (f40349a == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                    if (string == null || AbstractC6368u0.a(true)) {
                        string = "emulator";
                    }
                    f40349a = b(string);
                }
                str = f40349a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    private static String b(String str) {
        for (int i8 = 0; i8 < 3; i8++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return "";
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }
}
