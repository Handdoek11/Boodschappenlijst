package m5;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Arrays;
import java.util.List;
import t0.AbstractC6779a;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final List f39209a = Arrays.asList("B425AD07E71F6F9D614AE8F8B5CC9E23", "BB986D9A0000D0FECDB561BFD538B815", "6E66FE60B75FDBFD9DA1799FB4DA7193");

    public static int a(Resources resources) {
        DisplayMetrics displayMetrics;
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 50;
        }
        return AbstractC6779a.b(Math.round(Math.min(Math.round(displayMetrics.widthPixels / displayMetrics.density) / 6.4f, Math.round(displayMetrics.heightPixels / displayMetrics.density) * 0.15f)), 50, 90);
    }

    public static boolean b(String str) {
        return !str.contains("@");
    }

    public static boolean c(String str) {
        return !str.toLowerCase().contains("password");
    }
}
