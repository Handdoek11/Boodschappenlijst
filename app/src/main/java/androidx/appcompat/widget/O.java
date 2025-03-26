package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r0.AbstractC6641a;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f7444a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7445b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f7446c = new Rect();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final boolean f7447a;

        /* renamed from: b, reason: collision with root package name */
        private static final Method f7448b;

        /* renamed from: c, reason: collision with root package name */
        private static final Field f7449c;

        /* renamed from: d, reason: collision with root package name */
        private static final Field f7450d;

        /* renamed from: e, reason: collision with root package name */
        private static final Field f7451e;

        /* renamed from: f, reason: collision with root package name */
        private static final Field f7452f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L3a
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2d java.lang.ClassNotFoundException -> L30 java.lang.NoSuchMethodException -> L32
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L46
                r8 = r0
                goto L48
            L2b:
                r7 = r1
                goto L46
            L2d:
                r6 = r1
            L2e:
                r7 = r6
                goto L46
            L30:
                r6 = r1
                goto L2e
            L32:
                r6 = r1
                goto L2e
            L34:
                r5 = r1
            L35:
                r6 = r5
                goto L2e
            L37:
                r5 = r1
            L38:
                r6 = r5
                goto L2e
            L3a:
                r5 = r1
            L3b:
                r6 = r5
                goto L2e
            L3d:
                r4 = r1
                r5 = r4
                goto L35
            L40:
                r4 = r1
                r5 = r4
                goto L38
            L43:
                r4 = r1
                r5 = r4
                goto L3b
            L46:
                r3 = r1
                r8 = r2
            L48:
                if (r8 == 0) goto L57
                androidx.appcompat.widget.O.a.f7448b = r4
                androidx.appcompat.widget.O.a.f7449c = r5
                androidx.appcompat.widget.O.a.f7450d = r6
                androidx.appcompat.widget.O.a.f7451e = r7
                androidx.appcompat.widget.O.a.f7452f = r3
                androidx.appcompat.widget.O.a.f7447a = r0
                goto L63
            L57:
                androidx.appcompat.widget.O.a.f7448b = r1
                androidx.appcompat.widget.O.a.f7449c = r1
                androidx.appcompat.widget.O.a.f7450d = r1
                androidx.appcompat.widget.O.a.f7451e = r1
                androidx.appcompat.widget.O.a.f7452f = r1
                androidx.appcompat.widget.O.a.f7447a = r2
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.O.a.<clinit>():void");
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f7447a) {
                try {
                    Object invoke = f7448b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(f7449c.getInt(invoke), f7450d.getInt(invoke), f7451e.getInt(invoke), f7452f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return O.f7446c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 29 || i8 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f7444a);
        } else {
            drawable.setState(f7445b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(AbstractC6641a.q(drawable));
        }
        Insets a8 = b.a(drawable);
        return new Rect(a8.left, a8.top, a8.right, a8.bottom);
    }

    public static PorterDuff.Mode e(int i8, PorterDuff.Mode mode) {
        if (i8 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i8 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i8 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i8) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
