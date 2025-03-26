package q0;

import android.graphics.Color;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6410a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f40895a = new ThreadLocal();

    public static void a(int i8, int i9, int i10, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d8 = i8 / 255.0d;
        double pow = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        double d9 = i9 / 255.0d;
        double pow2 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        double d10 = i10 / 255.0d;
        double pow3 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
    }

    public static int b(double d8, double d9, double d10) {
        double d11 = (((3.2406d * d8) + ((-1.5372d) * d9)) + ((-0.4986d) * d10)) / 100.0d;
        double d12 = ((((-0.9689d) * d8) + (1.8758d * d9)) + (0.0415d * d10)) / 100.0d;
        double d13 = (((0.0557d * d8) + ((-0.204d) * d9)) + (1.057d * d10)) / 100.0d;
        return Color.rgb(i((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255), i((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255), i((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255));
    }

    public static int c(int i8, int i9, float f8) {
        float f9 = 1.0f - f8;
        return Color.argb((int) ((Color.alpha(i8) * f9) + (Color.alpha(i9) * f8)), (int) ((Color.red(i8) * f9) + (Color.red(i9) * f8)), (int) ((Color.green(i8) * f9) + (Color.green(i9) * f8)), (int) ((Color.blue(i8) * f9) + (Color.blue(i9) * f8)));
    }

    public static double d(int i8) {
        double[] j8 = j();
        e(i8, j8);
        return j8[1] / 100.0d;
    }

    public static void e(int i8, double[] dArr) {
        a(Color.red(i8), Color.green(i8), Color.blue(i8), dArr);
    }

    private static int f(int i8, int i9) {
        return 255 - (((255 - i9) * (255 - i8)) / 255);
    }

    public static int g(int i8, int i9) {
        int alpha = Color.alpha(i9);
        int alpha2 = Color.alpha(i8);
        int f8 = f(alpha2, alpha);
        return Color.argb(f8, h(Color.red(i8), alpha2, Color.red(i9), alpha, f8), h(Color.green(i8), alpha2, Color.green(i9), alpha, f8), h(Color.blue(i8), alpha2, Color.blue(i9), alpha, f8));
    }

    private static int h(int i8, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        return (((i8 * 255) * i9) + ((i10 * i11) * (255 - i9))) / (i12 * 255);
    }

    private static int i(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : Math.min(i8, i10);
    }

    private static double[] j() {
        ThreadLocal threadLocal = f40895a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int k(int i8, int i9) {
        if (i9 < 0 || i9 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i8 & 16777215) | (i9 << 24);
    }
}
