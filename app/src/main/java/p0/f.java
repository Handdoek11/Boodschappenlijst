package p0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import n0.AbstractC6245d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
abstract class f {
    private static a a(a aVar, int i8, int i9, boolean z7, int i10) {
        return aVar != null ? aVar : z7 ? new a(i8, i10, i9) : new a(i8, i9);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray s8 = k.s(resources, theme, attributeSet, AbstractC6245d.f39529B);
        float j8 = k.j(s8, xmlPullParser, "startX", AbstractC6245d.f39538K, 0.0f);
        float j9 = k.j(s8, xmlPullParser, "startY", AbstractC6245d.f39539L, 0.0f);
        float j10 = k.j(s8, xmlPullParser, "endX", AbstractC6245d.f39540M, 0.0f);
        float j11 = k.j(s8, xmlPullParser, "endY", AbstractC6245d.f39541N, 0.0f);
        float j12 = k.j(s8, xmlPullParser, "centerX", AbstractC6245d.f39533F, 0.0f);
        float j13 = k.j(s8, xmlPullParser, "centerY", AbstractC6245d.f39534G, 0.0f);
        int k8 = k.k(s8, xmlPullParser, "type", AbstractC6245d.f39532E, 0);
        int f8 = k.f(s8, xmlPullParser, "startColor", AbstractC6245d.f39530C, 0);
        boolean r8 = k.r(xmlPullParser, "centerColor");
        int f9 = k.f(s8, xmlPullParser, "centerColor", AbstractC6245d.f39537J, 0);
        int f10 = k.f(s8, xmlPullParser, "endColor", AbstractC6245d.f39531D, 0);
        int k9 = k.k(s8, xmlPullParser, "tileMode", AbstractC6245d.f39536I, 0);
        float j14 = k.j(s8, xmlPullParser, "gradientRadius", AbstractC6245d.f39535H, 0.0f);
        s8.recycle();
        a a8 = a(c(resources, xmlPullParser, attributeSet, theme), f8, f10, r8, f9);
        if (k8 != 1) {
            return k8 != 2 ? new LinearGradient(j8, j9, j10, j11, a8.f40097a, a8.f40098b, d(k9)) : new SweepGradient(j12, j13, a8.f40097a, a8.f40098b);
        }
        if (j14 > 0.0f) {
            return new RadialGradient(j12, j13, j14, a8.f40097a, a8.f40098b, d(k9));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new p0.f.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p0.f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = n0.AbstractC6245d.f39542O
            android.content.res.TypedArray r3 = p0.k.s(r8, r11, r10, r3)
            int r5 = n0.AbstractC6245d.f39543P
            boolean r5 = r3.hasValue(r5)
            int r6 = n0.AbstractC6245d.f39544Q
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = n0.AbstractC6245d.f39543P
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = n0.AbstractC6245d.f39544Q
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            p0.f$a r8 = new p0.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):p0.f$a");
    }

    private static Shader.TileMode d(int i8) {
        return i8 != 1 ? i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f40097a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f40098b;

        a(List list, List list2) {
            int size = list.size();
            this.f40097a = new int[size];
            this.f40098b = new float[size];
            for (int i8 = 0; i8 < size; i8++) {
                this.f40097a[i8] = ((Integer) list.get(i8)).intValue();
                this.f40098b[i8] = ((Float) list2.get(i8)).floatValue();
            }
        }

        a(int i8, int i9) {
            this.f40097a = new int[]{i8, i9};
            this.f40098b = new float[]{0.0f, 1.0f};
        }

        a(int i8, int i9, int i10) {
            this.f40097a = new int[]{i8, i9, i10};
            this.f40098b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
