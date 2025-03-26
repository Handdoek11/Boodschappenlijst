package p0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import n0.AbstractC6242a;
import n0.AbstractC6245d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t0.AbstractC6779a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f40081a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal threadLocal = f40081a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int i8, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i8), theme);
        } catch (Exception e8) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e8);
            return null;
        }
    }

    private static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        Resources resources2 = resources;
        int i8 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i9 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i8 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray h8 = h(resources2, theme, attributeSet, AbstractC6245d.f39546b);
                int resourceId = h8.getResourceId(AbstractC6245d.f39547c, -1);
                if (resourceId == -1 || f(resources2, resourceId)) {
                    color = h8.getColor(AbstractC6245d.f39547c, -65281);
                } else {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = h8.getColor(AbstractC6245d.f39547c, -65281);
                    }
                }
                float f8 = 1.0f;
                if (h8.hasValue(AbstractC6245d.f39548d)) {
                    f8 = h8.getFloat(AbstractC6245d.f39548d, 1.0f);
                } else if (h8.hasValue(AbstractC6245d.f39550f)) {
                    f8 = h8.getFloat(AbstractC6245d.f39550f, 1.0f);
                }
                float f9 = (Build.VERSION.SDK_INT < 31 || !h8.hasValue(AbstractC6245d.f39549e)) ? h8.getFloat(AbstractC6245d.f39551g, -1.0f) : h8.getFloat(AbstractC6245d.f39549e, -1.0f);
                h8.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != AbstractC6242a.f39478a && attributeNameResource != AbstractC6242a.f39479b) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i10);
                iArr2 = g.a(iArr2, i9, g(color, f8, f9));
                iArr = (int[][]) g.b(iArr, i9, trimStateSet);
                i9++;
            }
            i8 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i9];
        int[][] iArr5 = new int[i9][];
        System.arraycopy(iArr2, 0, iArr4, 0, i9);
        System.arraycopy(iArr, 0, iArr5, 0, i9);
        return new ColorStateList(iArr5, iArr4);
    }

    private static boolean f(Resources resources, int i8) {
        TypedValue c8 = c();
        resources.getValue(i8, c8, true);
        int i9 = c8.type;
        return i9 >= 28 && i9 <= 31;
    }

    private static int g(int i8, float f8, float f9) {
        boolean z7 = f9 >= 0.0f && f9 <= 100.0f;
        if (f8 == 1.0f && !z7) {
            return i8;
        }
        int b8 = AbstractC6779a.b((int) ((Color.alpha(i8) * f8) + 0.5f), 0, 255);
        if (z7) {
            C6319a c8 = C6319a.c(i8);
            i8 = C6319a.m(c8.j(), c8.i(), f9);
        }
        return (i8 & 16777215) | (b8 << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
