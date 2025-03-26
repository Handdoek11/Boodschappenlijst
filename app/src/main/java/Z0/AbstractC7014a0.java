package z0;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import j$.util.Objects;
import java.lang.reflect.Method;

/* renamed from: z0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7014a0 {

    /* renamed from: a, reason: collision with root package name */
    private static Method f44731a;

    /* renamed from: z0.a0$a */
    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: z0.a0$b */
    static class b {
        static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* renamed from: z0.a0$c */
    static class c {
        static int a(ViewConfiguration viewConfiguration, int i8, int i9, int i10) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i8, i9, i10);
        }

        static int b(ViewConfiguration viewConfiguration, int i8, int i9, int i10) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i8, i9, i10);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f44731a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private static int a(Resources resources, int i8, y0.j jVar, int i9) {
        int dimensionPixelSize;
        return i8 != -1 ? (i8 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i8)) < 0) ? i9 : dimensionPixelSize : ((Integer) jVar.get()).intValue();
    }

    private static float b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f44731a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int d(Resources resources, int i8, int i9) {
        if (i8 == 4194304 && i9 == 26) {
            return c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int e(Resources resources, int i8, int i9) {
        if (i8 == 4194304 && i9 == 26) {
            return c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float f(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.a(viewConfiguration) : b(viewConfiguration, context);
    }

    public static int g(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int h(Context context, final ViewConfiguration viewConfiguration, int i8, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i8, i9, i10);
        }
        if (!k(i8, i9, i10)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int d8 = d(resources, i10, i9);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, d8, new y0.j() { // from class: z0.Y
            @Override // y0.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int i(Context context, final ViewConfiguration viewConfiguration, int i8, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i8, i9, i10);
        }
        if (!k(i8, i9, i10)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int e8 = e(resources, i10, i9);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, e8, new y0.j() { // from class: z0.Z
            @Override // y0.j
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float j(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.b(viewConfiguration) : b(viewConfiguration, context);
    }

    private static boolean k(int i8, int i9, int i10) {
        InputDevice device = InputDevice.getDevice(i8);
        return (device == null || device.getMotionRange(i9, i10) == null) ? false : true;
    }

    public static boolean l(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int c8 = c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return c8 != 0 && resources.getBoolean(c8);
    }
}
