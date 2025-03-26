package L3;

import S3.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import o0.AbstractC6278a;
import q0.AbstractC6410a;

/* loaded from: classes2.dex */
public abstract class a {
    public static int a(int i8, int i9) {
        return AbstractC6410a.k(i8, (Color.alpha(i8) * i9) / 255);
    }

    public static int b(Context context, int i8, int i9) {
        Integer f8 = f(context, i8);
        return f8 != null ? f8.intValue() : i9;
    }

    public static int c(Context context, int i8, String str) {
        return l(context, b.e(context, i8, str));
    }

    public static int d(View view, int i8) {
        return l(view.getContext(), b.f(view, i8));
    }

    public static int e(View view, int i8, int i9) {
        return b(view.getContext(), i8, i9);
    }

    public static Integer f(Context context, int i8) {
        TypedValue a8 = b.a(context, i8);
        if (a8 != null) {
            return Integer.valueOf(l(context, a8));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i8) {
        TypedValue a8 = b.a(context, i8);
        if (a8 == null) {
            return null;
        }
        int i9 = a8.resourceId;
        if (i9 != 0) {
            return AbstractC6278a.d(context, i9);
        }
        int i10 = a8.data;
        if (i10 != 0) {
            return ColorStateList.valueOf(i10);
        }
        return null;
    }

    public static boolean h(int i8) {
        return i8 != 0 && AbstractC6410a.d(i8) > 0.5d;
    }

    public static int i(int i8, int i9) {
        return AbstractC6410a.g(i9, i8);
    }

    public static int j(int i8, int i9, float f8) {
        return i(i8, AbstractC6410a.k(i9, Math.round(Color.alpha(i9) * f8)));
    }

    public static int k(View view, int i8, int i9, float f8) {
        return j(d(view, i8), d(view, i9), f8);
    }

    private static int l(Context context, TypedValue typedValue) {
        int i8 = typedValue.resourceId;
        return i8 != 0 ? AbstractC6278a.c(context, i8) : typedValue.data;
    }
}
