package z0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: z0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6997A {

    /* renamed from: z0.A$a */
    static class a {
        static MenuItem a(MenuItem menuItem, char c8, int i8) {
            return menuItem.setAlphabeticShortcut(c8, i8);
        }

        static MenuItem b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem e(MenuItem menuItem, char c8, int i8) {
            return menuItem.setNumericShortcut(c8, i8);
        }

        static MenuItem f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem a(MenuItem menuItem, AbstractC7015b abstractC7015b) {
        if (menuItem instanceof s0.b) {
            return ((s0.b) menuItem).a(abstractC7015b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c8, int i8) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setAlphabeticShortcut(c8, i8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.a(menuItem, c8, i8);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.b(menuItem, charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.c(menuItem, colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.d(menuItem, mode);
        }
    }

    public static void f(MenuItem menuItem, char c8, int i8) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setNumericShortcut(c8, i8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.e(menuItem, c8, i8);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof s0.b) {
            ((s0.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.f(menuItem, charSequence);
        }
    }
}
