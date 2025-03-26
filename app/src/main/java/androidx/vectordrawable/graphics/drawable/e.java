package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.k;
import q0.AbstractC6413d;

/* loaded from: classes.dex */
public abstract class e {

    private static class a implements TypeEvaluator {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC6413d.b[] f11620a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6413d.b[] evaluate(float f8, AbstractC6413d.b[] bVarArr, AbstractC6413d.b[] bVarArr2) {
            if (!AbstractC6413d.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!AbstractC6413d.b(this.f11620a, bVarArr)) {
                this.f11620a = AbstractC6413d.f(bVarArr);
            }
            for (int i8 = 0; i8 < bVarArr.length; i8++) {
                this.f11620a[i8].h(bVarArr[i8], bVarArr2[i8], f8);
            }
            return this.f11620a;
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f8) {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r2.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r24 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe c(Keyframe keyframe, float f8) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f8) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f8) : Keyframe.ofObject(f8);
    }

    private static void d(Keyframe[] keyframeArr, float f8, int i8, int i9) {
        float f9 = f8 / ((i9 - i8) + 2);
        while (i8 <= i9) {
            keyframeArr[i8].setFraction(keyframeArr[i8 - 1].getFraction() + f9);
            i8++;
        }
    }

    private static PropertyValuesHolder e(TypedArray typedArray, int i8, int i9, int i10, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i9);
        boolean z7 = peekValue != null;
        int i11 = z7 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i10);
        boolean z8 = peekValue2 != null;
        int i12 = z8 ? peekValue2.type : 0;
        if (i8 == 4) {
            i8 = ((z7 && h(i11)) || (z8 && h(i12))) ? 3 : 0;
        }
        boolean z9 = i8 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i8 != 2) {
            f a8 = i8 == 3 ? f.a() : null;
            if (z9) {
                if (z7) {
                    float dimension = i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f);
                    if (z8) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i12 == 5 ? typedArray.getDimension(i10, 0.0f) : typedArray.getFloat(i10, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i12 == 5 ? typedArray.getDimension(i10, 0.0f) : typedArray.getFloat(i10, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z7) {
                int dimension2 = i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : h(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0);
                if (z8) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i12 == 5 ? (int) typedArray.getDimension(i10, 0.0f) : h(i12) ? typedArray.getColor(i10, 0) : typedArray.getInt(i10, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z8) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i12 == 5 ? (int) typedArray.getDimension(i10, 0.0f) : h(i12) ? typedArray.getColor(i10, 0) : typedArray.getInt(i10, 0));
            }
            if (propertyValuesHolder == null || a8 == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(a8);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i9);
        String string2 = typedArray.getString(i10);
        AbstractC6413d.b[] d8 = AbstractC6413d.d(string);
        AbstractC6413d.b[] d9 = AbstractC6413d.d(string2);
        if (d8 == null && d9 == null) {
            return null;
        }
        if (d8 == null) {
            if (d9 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), d9);
            }
            return null;
        }
        a aVar = new a();
        if (d9 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d8);
        } else {
            if (!AbstractC6413d.b(d8, d9)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d8, d9);
        }
        return ofObject;
    }

    private static int f(TypedArray typedArray, int i8, int i9) {
        TypedValue peekValue = typedArray.peekValue(i8);
        boolean z7 = peekValue != null;
        int i10 = z7 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i9);
        boolean z8 = peekValue2 != null;
        return ((z7 && h(i10)) || (z8 && h(z8 ? peekValue2.type : 0))) ? 3 : 0;
    }

    private static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s8 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11600j);
        int i8 = 0;
        TypedValue t7 = k.t(s8, xmlPullParser, "value", 0);
        if (t7 != null && h(t7.type)) {
            i8 = 3;
        }
        s8.recycle();
        return i8;
    }

    private static boolean h(int i8) {
        return i8 >= 28 && i8 <= 31;
    }

    public static Animator i(Context context, int i8) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i8) : j(context, context.getResources(), context.getTheme(), i8);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i8) {
        return k(context, resources, theme, i8, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i8, float f8) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i8);
                    return a(context, resources, theme, xmlResourceParser, f8);
                } catch (XmlPullParserException e8) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i8));
                    notFoundException.initCause(e8);
                    throw notFoundException;
                }
            } catch (IOException e9) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i8));
                notFoundException2.initCause(e9);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f8, XmlPullParser xmlPullParser) {
        TypedArray s8 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11597g);
        TypedArray s9 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11601k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, s8, s9, f8, xmlPullParser);
        int l8 = k.l(s8, xmlPullParser, "interpolator", 0, 0);
        if (l8 > 0) {
            valueAnimator.setInterpolator(d.a(context, l8));
        }
        s8.recycle();
        if (s9 != null) {
            s9.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i8, XmlPullParser xmlPullParser) {
        TypedArray s8 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11600j);
        float j8 = k.j(s8, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue t7 = k.t(s8, xmlPullParser, "value", 0);
        boolean z7 = t7 != null;
        if (i8 == 4) {
            i8 = (z7 && h(t7.type)) ? 3 : 0;
        }
        Keyframe ofInt = z7 ? i8 != 0 ? (i8 == 1 || i8 == 3) ? Keyframe.ofInt(j8, k.k(s8, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(j8, k.j(s8, xmlPullParser, "value", 0, 0.0f)) : i8 == 0 ? Keyframe.ofFloat(j8) : Keyframe.ofInt(j8);
        int l8 = k.l(s8, xmlPullParser, "interpolator", 1, 0);
        if (l8 > 0) {
            ofInt.setInterpolator(d.a(context, l8));
        }
        s8.recycle();
        return ofInt;
    }

    private static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f8, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f8, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i8) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i8 == 4) {
                    i8 = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m8 = m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i8, xmlPullParser);
                if (m8 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m8);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i9 = 0; i9 < size; i9++) {
                Keyframe keyframe3 = keyframeArr[i9];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i9 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i10 = size - 1;
                        if (i9 == i10) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i11 = i9;
                            for (int i12 = i9 + 1; i12 < i10 && keyframeArr[i12].getFraction() < 0.0f; i12++) {
                                i11 = i12;
                            }
                            d(keyframeArr, keyframeArr[i11 + 1].getFraction() - keyframeArr[i9 - 1].getFraction(), i9, i11);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i8 == 3) {
                propertyValuesHolder.setEvaluator(f.a());
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i8;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray s8 = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11599i);
                    String m8 = k.m(s8, xmlPullParser, "propertyName", 3);
                    int k8 = k.k(s8, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder o8 = o(context, resources, theme, xmlPullParser, m8, k8);
                    if (o8 == null) {
                        o8 = e(s8, k8, 0, 1, m8);
                    }
                    if (o8 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(o8);
                    }
                    s8.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i8 = 0; i8 < size; i8++) {
                propertyValuesHolderArr[i8] = (PropertyValuesHolder) arrayList.get(i8);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f8, XmlPullParser xmlPullParser) {
        long k8 = k.k(typedArray, xmlPullParser, "duration", 1, 300);
        long k9 = k.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int k10 = k.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (k.r(xmlPullParser, "valueFrom") && k.r(xmlPullParser, "valueTo")) {
            if (k10 == 4) {
                k10 = f(typedArray, 5, 6);
            }
            PropertyValuesHolder e8 = e(typedArray, k10, 5, 6, "");
            if (e8 != null) {
                valueAnimator.setValues(e8);
            }
        }
        valueAnimator.setDuration(k8);
        valueAnimator.setStartDelay(k9);
        valueAnimator.setRepeatCount(k.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, k10, f8, xmlPullParser);
        }
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i8, float f8, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m8 = k.m(typedArray, xmlPullParser, "pathData", 1);
        if (m8 == null) {
            objectAnimator.setPropertyName(k.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m9 = k.m(typedArray, xmlPullParser, "propertyXName", 2);
        String m10 = k.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i8 != 2) {
        }
        if (m9 != null || m10 != null) {
            s(AbstractC6413d.e(m8), objectAnimator, f8 * 0.5f, m9, m10);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void s(Path path, ObjectAnimator objectAnimator, float f8, String str, String str2) {
        int i8 = 1;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f9 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f10 = 0.0f;
        do {
            f10 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f10));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f10 / f8)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f11 = f10 / (min - 1);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f9 - ((Float) arrayList.get(i10)).floatValue(), fArr3, null);
            fArr[i9] = fArr3[0];
            fArr2[i9] = fArr3[1];
            f9 += f11;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && f9 > ((Float) arrayList.get(i11)).floatValue()) {
                pathMeasure2.nextContour();
                i10 = i11;
            }
            i8 = 1;
            i9++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[i8];
            propertyValuesHolderArr[0] = ofFloat2;
            objectAnimator.setValues(propertyValuesHolderArr);
        } else if (ofFloat2 == null) {
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[i8];
            propertyValuesHolderArr2[0] = ofFloat;
            objectAnimator.setValues(propertyValuesHolderArr2);
        } else {
            PropertyValuesHolder[] propertyValuesHolderArr3 = new PropertyValuesHolder[2];
            propertyValuesHolderArr3[0] = ofFloat;
            propertyValuesHolderArr3[i8] = ofFloat2;
            objectAnimator.setValues(propertyValuesHolderArr3);
        }
    }
}
