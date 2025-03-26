package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class D {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f11430a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Field f11431b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f11432c;

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f8) {
            view.setTransitionAlpha(f8);
        }
    }

    D() {
    }

    public void a(View view) {
    }

    public float b(View view) {
        if (f11430a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f11430a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    public abstract void d(View view, int i8, int i9, int i10, int i11);

    public void e(View view, float f8) {
        if (f11430a) {
            try {
                a.b(view, f8);
                return;
            } catch (NoSuchMethodError unused) {
                f11430a = false;
            }
        }
        view.setAlpha(f8);
    }

    public void f(View view, int i8) {
        if (!f11432c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f11431b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f11432c = true;
        }
        Field field = f11431b;
        if (field != null) {
            try {
                f11431b.setInt(view, i8 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
