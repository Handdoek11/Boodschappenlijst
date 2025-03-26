package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import q0.AbstractC6410a;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f7763a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f7764b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f7765c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f7766d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f7767e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f7768f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f7769g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f7770h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f7771i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f7772j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.j.f35790y0);
        try {
            if (!obtainStyledAttributes.hasValue(f.j.f35563D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i8) {
        ColorStateList e8 = e(context, i8);
        if (e8 != null && e8.isStateful()) {
            return e8.getColorForState(f7764b, e8.getDefaultColor());
        }
        TypedValue f8 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f8, true);
        return d(context, i8, f8.getFloat());
    }

    public static int c(Context context, int i8) {
        int[] iArr = f7772j;
        iArr[0] = i8;
        f0 u7 = f0.u(context, null, iArr);
        try {
            return u7.b(0, 0);
        } finally {
            u7.x();
        }
    }

    static int d(Context context, int i8, float f8) {
        return AbstractC6410a.k(c(context, i8), Math.round(Color.alpha(r0) * f8));
    }

    public static ColorStateList e(Context context, int i8) {
        int[] iArr = f7772j;
        iArr[0] = i8;
        f0 u7 = f0.u(context, null, iArr);
        try {
            return u7.c(0);
        } finally {
            u7.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f7763a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
