package S3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.f0;
import g.AbstractC5794a;

/* loaded from: classes2.dex */
public abstract class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i8) {
        int resourceId;
        ColorStateList a8;
        return (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0 || (a8 = AbstractC5794a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i8) : a8;
    }

    public static ColorStateList b(Context context, f0 f0Var, int i8) {
        int n8;
        ColorStateList a8;
        return (!f0Var.s(i8) || (n8 = f0Var.n(i8, 0)) == 0 || (a8 = AbstractC5794a.a(context, n8)) == null) ? f0Var.c(i8) : a8;
    }

    public static int c(Context context, TypedArray typedArray, int i8, int i9) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i8, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i8, i9);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i9);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i8) {
        int resourceId;
        Drawable b8;
        return (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0 || (b8 = AbstractC5794a.b(context, resourceId)) == null) ? typedArray.getDrawable(i8) : b8;
    }

    public static float e(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    static int f(TypedArray typedArray, int i8, int i9) {
        return typedArray.hasValue(i8) ? i8 : i9;
    }

    public static d g(Context context, TypedArray typedArray, int i8) {
        int resourceId;
        if (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
