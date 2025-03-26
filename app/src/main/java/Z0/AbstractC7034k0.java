package z0;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: z0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7034k0 {

    /* renamed from: z0.k0$a */
    static class a {
        static void a(Window window, boolean z7) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: z0.k0$b */
    static class b {
        static void a(Window window, boolean z7) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z7);
        }
    }

    /* renamed from: z0.k0$c */
    static class c {
        static void a(Window window, boolean z7) {
            window.setDecorFitsSystemWindows(z7);
        }
    }

    public static X0 a(Window window, View view) {
        return new X0(window, view);
    }

    public static void b(Window window, boolean z7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 35) {
            c.a(window, z7);
        } else if (i8 >= 30) {
            b.a(window, z7);
        } else {
            a.a(window, z7);
        }
    }
}
