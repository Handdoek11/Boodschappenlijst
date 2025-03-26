package j5;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
class e implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float f38323a;

    public e(float f8) {
        this.f38323a = f8;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        float f9 = 1.0f - f8;
        return this.f38323a * (1.0f - (f9 * f9));
    }
}
