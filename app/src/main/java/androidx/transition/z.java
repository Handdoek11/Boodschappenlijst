package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f11590a = true;

    static class a {
        static int a(ViewGroup viewGroup, int i8) {
            return viewGroup.getChildDrawingOrder(i8);
        }

        static void b(ViewGroup viewGroup, boolean z7) {
            viewGroup.suppressLayout(z7);
        }
    }

    private static void a(ViewGroup viewGroup, boolean z7) {
        if (f11590a) {
            try {
                a.b(viewGroup, z7);
            } catch (NoSuchMethodError unused) {
                f11590a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z7) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z7);
        } else {
            a(viewGroup, z7);
        }
    }
}
