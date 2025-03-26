package r0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6641a {

    /* renamed from: r0.a$a, reason: collision with other inner class name */
    static class C0323a {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f8, float f9) {
            drawable.setHotspot(f8, f9);
        }

        static void f(Drawable drawable, int i8, int i9, int i10, int i11) {
            drawable.setHotspotBounds(i8, i9, i10, i11);
        }

        static void g(Drawable drawable, int i8) {
            drawable.setTint(i8);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: r0.a$b */
    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i8) {
            return drawable.setLayoutDirection(i8);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        C0323a.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return C0323a.b(drawable);
    }

    public static void c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter e(Drawable drawable) {
        return C0323a.c(drawable);
    }

    public static int f(Drawable drawable) {
        return b.a(drawable);
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0323a.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(Drawable drawable, boolean z7) {
        drawable.setAutoMirrored(z7);
    }

    public static void k(Drawable drawable, float f8, float f9) {
        C0323a.e(drawable, f8, f9);
    }

    public static void l(Drawable drawable, int i8, int i9, int i10, int i11) {
        C0323a.f(drawable, i8, i9, i10, i11);
    }

    public static boolean m(Drawable drawable, int i8) {
        return b.b(drawable, i8);
    }

    public static void n(Drawable drawable, int i8) {
        C0323a.g(drawable, i8);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        C0323a.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        C0323a.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable q(Drawable drawable) {
        return drawable instanceof r0.b ? ((r0.b) drawable).b() : drawable;
    }

    public static Drawable r(Drawable drawable) {
        return drawable;
    }
}
