package E3;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f2145a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f2146b = new Q0.b();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f2147c = new Q0.a();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f2148d = new Q0.c();

    /* renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f2149e = new DecelerateInterpolator();

    public static float a(float f8, float f9, float f10) {
        return f8 + (f10 * (f9 - f8));
    }

    public static float b(float f8, float f9, float f10, float f11, float f12) {
        return f12 <= f10 ? f8 : f12 >= f11 ? f9 : a(f8, f9, (f12 - f10) / (f11 - f10));
    }

    public static int c(int i8, int i9, float f8) {
        return i8 + Math.round(f8 * (i9 - i8));
    }
}
