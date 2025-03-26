package T3;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import q0.AbstractC6410a;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f5184a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f5185b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f5186c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f5187d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f5188e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f5189f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f5190g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f5191h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f5192i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f5193j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f5194k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    static final String f5195l = b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f5184a) {
            int[] iArr = f5187d;
            return new ColorStateList(new int[][]{f5193j, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, f5189f), c(colorStateList, iArr), c(colorStateList, f5185b)});
        }
        int[] iArr2 = f5189f;
        int[] iArr3 = f5190g;
        int[] iArr4 = f5191h;
        int[] iArr5 = f5192i;
        int[] iArr6 = f5185b;
        int[] iArr7 = f5186c;
        int[] iArr8 = f5187d;
        int[] iArr9 = f5188e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f5193j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), c(colorStateList, iArr5), 0, c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), c(colorStateList, iArr9), 0});
    }

    private static int b(int i8) {
        return AbstractC6410a.k(i8, Math.min(Color.alpha(i8) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f5184a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f5194k, 0)) != 0) {
            Log.w(f5195l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z7 = false;
        boolean z8 = false;
        for (int i8 : iArr) {
            if (i8 == 16842910) {
                z7 = true;
            } else if (i8 == 16842908 || i8 == 16842919 || i8 == 16843623) {
                z8 = true;
            }
        }
        return z7 && z8;
    }
}
