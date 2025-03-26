package B0;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: B0.a$a, reason: collision with other inner class name */
    static class C0005a {
        static Interpolator a(float f8, float f9, float f10, float f11) {
            return new PathInterpolator(f8, f9, f10, f11);
        }

        static Interpolator b(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f8, float f9, float f10, float f11) {
        return C0005a.a(f8, f9, f10, f11);
    }

    public static Interpolator b(Path path) {
        return C0005a.b(path);
    }
}
