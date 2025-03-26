package Q0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f4664a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4665b;

    protected d(float[] fArr) {
        this.f4664a = fArr;
        this.f4665b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4664a;
        int min = Math.min((int) ((fArr.length - 1) * f8), fArr.length - 2);
        float f9 = this.f4665b;
        float f10 = (f8 - (min * f9)) / f9;
        float[] fArr2 = this.f4664a;
        float f11 = fArr2[min];
        return f11 + (f10 * (fArr2[min + 1] - f11));
    }
}
