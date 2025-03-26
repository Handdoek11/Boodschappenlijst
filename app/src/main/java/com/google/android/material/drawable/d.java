package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import r0.AbstractC6641a;

/* loaded from: classes2.dex */
public abstract class d {

    private static class a {
        static void a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    private static class b {
        static void a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    public static Drawable a(Drawable drawable, Drawable drawable2) {
        return b(drawable, drawable2, -1, -1);
    }

    public static Drawable b(Drawable drawable, Drawable drawable2, int i8, int i9) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i8 == -1) {
            i8 = h(drawable, drawable2);
        }
        if (i9 == -1) {
            i9 = g(drawable, drawable2);
        }
        if (i8 > drawable.getIntrinsicWidth() || i9 > drawable.getIntrinsicHeight()) {
            float f8 = i8 / i9;
            if (f8 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i9 = (int) (intrinsicWidth / f8);
                i8 = intrinsicWidth;
            } else {
                i9 = drawable.getIntrinsicHeight();
                i8 = (int) (f8 * i9);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i8, i9);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return d(drawable, colorStateList, mode, false);
    }

    private static Drawable d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z7) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = AbstractC6641a.r(drawable).mutate();
            if (mode != null) {
                AbstractC6641a.p(drawable, mode);
            }
        } else if (z7) {
            drawable.mutate();
        }
        return drawable;
    }

    public static int[] e(int[] iArr) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            if (i9 == 16842912) {
                return iArr;
            }
            if (i9 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i8] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static ColorStateList f(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !com.google.android.material.drawable.a.a(drawable)) {
            return null;
        }
        return com.google.android.material.drawable.b.a(drawable).getColorStateList();
    }

    private static int g(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int h(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    public static AttributeSet i(Context context, int i8, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i8);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e8) {
            e = e8;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i8));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e9) {
            e = e9;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i8));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void j(Outline outline, Path path) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            b.a(outline, path);
            return;
        }
        if (i8 >= 29) {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.a(outline, path);
        }
    }

    public static void k(Drawable drawable, int i8) {
        if (i8 != 0) {
            AbstractC6641a.n(drawable, i8);
        } else {
            AbstractC6641a.o(drawable, null);
        }
    }

    public static PorterDuffColorFilter l(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
