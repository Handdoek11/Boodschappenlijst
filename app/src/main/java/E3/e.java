package E3;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes2.dex */
public abstract class e implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f2152a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f2153b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f2154c = new Matrix();

    public Matrix a(float f8, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f2152a);
        matrix2.getValues(this.f2153b);
        for (int i8 = 0; i8 < 9; i8++) {
            float[] fArr = this.f2153b;
            float f9 = fArr[i8];
            float f10 = this.f2152a[i8];
            fArr[i8] = f10 + ((f9 - f10) * f8);
        }
        this.f2154c.setValues(this.f2153b);
        return this.f2154c;
    }
}
