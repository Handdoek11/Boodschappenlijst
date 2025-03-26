package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
abstract class H extends D {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f11433d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f11434e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    H() {
    }

    @Override // androidx.transition.D
    public void g(View view, Matrix matrix) {
        if (f11433d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11433d = false;
            }
        }
    }

    @Override // androidx.transition.D
    public void h(View view, Matrix matrix) {
        if (f11434e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11434e = false;
            }
        }
    }
}
