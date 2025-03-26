package p3;

import android.os.Build;

/* renamed from: p3.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6368u0 {
    public static boolean a(boolean z7) {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }
}
