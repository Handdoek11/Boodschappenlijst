package p0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f40082a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f40083b;

    /* renamed from: c, reason: collision with root package name */
    private int f40084c;

    private d(Shader shader, ColorStateList colorStateList, int i8) {
        this.f40082a = shader;
        this.f40083b = colorStateList;
        this.f40084c = i8;
    }

    private static d a(Resources resources, int i8, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i8);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i8) {
        return new d(null, null, i8);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i8, Resources.Theme theme) {
        try {
            return a(resources, i8, theme);
        } catch (Exception e8) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e8);
            return null;
        }
    }

    public int e() {
        return this.f40084c;
    }

    public Shader f() {
        return this.f40082a;
    }

    public boolean h() {
        return this.f40082a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f40082a == null && (colorStateList = this.f40083b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f40083b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f40084c) {
                this.f40084c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i8) {
        this.f40084c = i8;
    }

    public boolean l() {
        return h() || this.f40084c != 0;
    }
}
