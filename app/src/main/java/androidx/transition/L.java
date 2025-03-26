package androidx.transition;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class L extends J {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f11436g = true;

    static class a {
        static void a(View view, int i8) {
            view.setTransitionVisibility(i8);
        }
    }

    L() {
    }

    @Override // androidx.transition.D
    public void f(View view, int i8) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i8);
        } else if (f11436g) {
            try {
                a.a(view, i8);
            } catch (NoSuchMethodError unused) {
                f11436g = false;
            }
        }
    }
}
