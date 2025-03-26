package p0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class k {
    public static int a(Context context, int i8, int i9) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue.resourceId != 0 ? i8 : i9;
    }

    public static boolean b(TypedArray typedArray, int i8, int i9, boolean z7) {
        return typedArray.getBoolean(i8, typedArray.getBoolean(i9, z7));
    }

    public static Drawable c(TypedArray typedArray, int i8, int i9) {
        Drawable drawable = typedArray.getDrawable(i8);
        return drawable == null ? typedArray.getDrawable(i9) : drawable;
    }

    public static int d(TypedArray typedArray, int i8, int i9, int i10) {
        return typedArray.getInt(i8, typedArray.getInt(i9, i10));
    }

    public static boolean e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, boolean z7) {
        return !r(xmlPullParser, str) ? z7 : typedArray.getBoolean(i8, z7);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, int i9) {
        return !r(xmlPullParser, str) ? i9 : typedArray.getColor(i8, i9);
    }

    public static ColorStateList g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i8) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i8, typedValue);
        int i9 = typedValue.type;
        if (i9 != 2) {
            return (i9 < 28 || i9 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i8, 0), theme) : h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i8 + ": " + typedValue);
    }

    private static ColorStateList h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i8, int i9) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i8, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return d.b(typedValue.data);
            }
            d g8 = d.g(typedArray.getResources(), typedArray.getResourceId(i8, 0), theme);
            if (g8 != null) {
                return g8;
            }
        }
        return d.b(i9);
    }

    public static float j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, float f8) {
        return !r(xmlPullParser, str) ? f8 : typedArray.getFloat(i8, f8);
    }

    public static int k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, int i9) {
        return !r(xmlPullParser, str) ? i9 : typedArray.getInt(i8, i9);
    }

    public static int l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, int i9) {
        return !r(xmlPullParser, str) ? i9 : typedArray.getResourceId(i8, i9);
    }

    public static String m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i8);
        }
        return null;
    }

    public static int n(TypedArray typedArray, int i8, int i9, int i10) {
        return typedArray.getResourceId(i8, typedArray.getResourceId(i9, i10));
    }

    public static String o(TypedArray typedArray, int i8, int i9) {
        String string = typedArray.getString(i8);
        return string == null ? typedArray.getString(i9) : string;
    }

    public static CharSequence p(TypedArray typedArray, int i8, int i9) {
        CharSequence text = typedArray.getText(i8);
        return text == null ? typedArray.getText(i9) : text;
    }

    public static CharSequence[] q(TypedArray typedArray, int i8, int i9) {
        CharSequence[] textArray = typedArray.getTextArray(i8);
        return textArray == null ? typedArray.getTextArray(i9) : textArray;
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8) {
        if (r(xmlPullParser, str)) {
            return typedArray.peekValue(i8);
        }
        return null;
    }
}
