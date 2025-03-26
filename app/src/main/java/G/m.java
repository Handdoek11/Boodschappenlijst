package G;

import J6.AbstractC0650j;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2491a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public static /* synthetic */ float[] b(float[] fArr, int i8, AbstractC0650j abstractC0650j) {
        if ((i8 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return a(fArr);
    }

    public static final long c(float[] fArr, long j8) {
        float f8 = F.d.f(j8);
        float g8 = F.d.g(j8);
        float f9 = 1 / (((fArr[3] * f8) + (fArr[7] * g8)) + fArr[15]);
        if (Float.isInfinite(f9) || Float.isNaN(f9)) {
            f9 = 0.0f;
        }
        return F.e.a(((fArr[0] * f8) + (fArr[4] * g8) + fArr[12]) * f9, f9 * ((fArr[1] * f8) + (fArr[5] * g8) + fArr[13]));
    }

    public static float[] a(float[] fArr) {
        return fArr;
    }
}
