package K1;

import android.net.Uri;

/* loaded from: classes.dex */
public abstract class b {
    public static boolean a(Uri uri) {
        return c(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean b(Uri uri) {
        return c(uri) && !f(uri);
    }

    public static boolean c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return c(uri) && f(uri);
    }

    public static boolean e(int i8, int i9) {
        return i8 != Integer.MIN_VALUE && i9 != Integer.MIN_VALUE && i8 <= 512 && i9 <= 384;
    }

    private static boolean f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
