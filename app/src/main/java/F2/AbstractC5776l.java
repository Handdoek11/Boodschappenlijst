package f2;

import android.widget.ImageView;

/* renamed from: f2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5776l {

    /* renamed from: f2.l$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35860a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f35860a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static void a(float f8, float f9, float f10) {
        if (f8 >= f9) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f9 >= f10) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    static int b(int i8) {
        return (i8 & 65280) >> 8;
    }

    static boolean c(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    static boolean d(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (a.f35860a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
