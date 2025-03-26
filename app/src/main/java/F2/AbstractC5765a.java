package f2;

import android.view.View;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5765a {
    public static void a(View view, Runnable runnable) {
        b(view, runnable);
    }

    private static void b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
