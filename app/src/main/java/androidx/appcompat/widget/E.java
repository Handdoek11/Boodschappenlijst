package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
class E {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f7411l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f7412m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f7413a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7414b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f7415c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f7416d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f7417e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f7418f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f7419g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f7420h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f7421i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f7422j;

    /* renamed from: k, reason: collision with root package name */
    private final d f7423k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i8, int i9, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i8);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i9 == -1) {
                i9 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i9);
            try {
                dVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) E.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.E.b, androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.E.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class d {
        d() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) E.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    E(TextView textView) {
        this.f7421i = textView;
        this.f7422j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f7423k = new c();
        } else {
            this.f7423k = new b();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (i8 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i8)) < 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f7413a = 0;
        this.f7416d = -1.0f;
        this.f7417e = -1.0f;
        this.f7415c = -1.0f;
        this.f7418f = new int[0];
        this.f7414b = false;
    }

    private int e(RectF rectF) {
        int length = this.f7418f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i8 = 1;
        int i9 = length - 1;
        int i10 = 0;
        while (i8 <= i9) {
            int i11 = (i8 + i9) / 2;
            if (x(this.f7418f[i11], rectF)) {
                int i12 = i11 + 1;
                i10 = i8;
                i8 = i12;
            } else {
                i10 = i11 - 1;
                i9 = i10;
            }
        }
        return this.f7418f[i10];
    }

    private static Method k(String str) {
        try {
            Method method = (Method) f7412m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                f7412m.put(str, method);
            }
            return method;
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e8);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e8);
            return obj2;
        }
    }

    private void s(float f8) {
        if (f8 != this.f7421i.getPaint().getTextSize()) {
            this.f7421i.getPaint().setTextSize(f8);
            boolean isInLayout = this.f7421i.isInLayout();
            if (this.f7421i.getLayout() != null) {
                this.f7414b = false;
                try {
                    Method k8 = k("nullLayouts");
                    if (k8 != null) {
                        k8.invoke(this.f7421i, null);
                    }
                } catch (Exception e8) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e8);
                }
                if (isInLayout) {
                    this.f7421i.forceLayout();
                } else {
                    this.f7421i.requestLayout();
                }
                this.f7421i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f7413a == 1) {
            if (!this.f7419g || this.f7418f.length == 0) {
                int floor = ((int) Math.floor((this.f7417e - this.f7416d) / this.f7415c)) + 1;
                int[] iArr = new int[floor];
                for (int i8 = 0; i8 < floor; i8++) {
                    iArr[i8] = Math.round(this.f7416d + (i8 * this.f7415c));
                }
                this.f7418f = b(iArr);
            }
            this.f7414b = true;
        } else {
            this.f7414b = false;
        }
        return this.f7414b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i8 = 0; i8 < length; i8++) {
                iArr[i8] = typedArray.getDimensionPixelSize(i8, -1);
            }
            this.f7418f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z7 = this.f7418f.length > 0;
        this.f7419g = z7;
        if (z7) {
            this.f7413a = 1;
            this.f7416d = r0[0];
            this.f7417e = r0[r1 - 1];
            this.f7415c = -1.0f;
        }
        return z7;
    }

    private boolean x(int i8, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f7421i.getText();
        TransformationMethod transformationMethod = this.f7421i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f7421i)) != null) {
            text = transformation;
        }
        int maxLines = this.f7421i.getMaxLines();
        l(i8);
        StaticLayout d8 = d(text, (Layout.Alignment) m(this.f7421i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d8.getLineCount() <= maxLines && d8.getLineEnd(d8.getLineCount() - 1) == text.length())) && ((float) d8.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f7421i instanceof C0852l);
    }

    private void z(float f8, float f9, float f10) {
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
        }
        if (f9 <= f8) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f7413a = 1;
        this.f7416d = f8;
        this.f7417e = f9;
        this.f7415c = f10;
        this.f7419g = false;
    }

    void a() {
        if (n()) {
            if (this.f7414b) {
                if (this.f7421i.getMeasuredHeight() <= 0 || this.f7421i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f7423k.b(this.f7421i) ? 1048576 : (this.f7421i.getMeasuredWidth() - this.f7421i.getTotalPaddingLeft()) - this.f7421i.getTotalPaddingRight();
                int height = (this.f7421i.getHeight() - this.f7421i.getCompoundPaddingBottom()) - this.f7421i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f7411l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float e8 = e(rectF);
                        if (e8 != this.f7421i.getTextSize()) {
                            t(0, e8);
                        }
                    } finally {
                    }
                }
            }
            this.f7414b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i8, int i9) {
        return a.a(charSequence, alignment, i8, i9, this.f7421i, this.f7420h, this.f7423k);
    }

    int f() {
        return Math.round(this.f7417e);
    }

    int g() {
        return Math.round(this.f7416d);
    }

    int h() {
        return Math.round(this.f7415c);
    }

    int[] i() {
        return this.f7418f;
    }

    int j() {
        return this.f7413a;
    }

    void l(int i8) {
        TextPaint textPaint = this.f7420h;
        if (textPaint == null) {
            this.f7420h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f7420h.set(this.f7421i.getPaint());
        this.f7420h.setTextSize(i8);
    }

    boolean n() {
        return y() && this.f7413a != 0;
    }

    void o(AttributeSet attributeSet, int i8) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f7422j.obtainStyledAttributes(attributeSet, f.j.f35700g0, i8, 0);
        TextView textView = this.f7421i;
        z0.X.l0(textView, textView.getContext(), f.j.f35700g0, attributeSet, obtainStyledAttributes, i8, 0);
        if (obtainStyledAttributes.hasValue(f.j.f35725l0)) {
            this.f7413a = obtainStyledAttributes.getInt(f.j.f35725l0, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(f.j.f35720k0) ? obtainStyledAttributes.getDimension(f.j.f35720k0, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(f.j.f35710i0) ? obtainStyledAttributes.getDimension(f.j.f35710i0, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(f.j.f35705h0) ? obtainStyledAttributes.getDimension(f.j.f35705h0, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(f.j.f35715j0) && (resourceId = obtainStyledAttributes.getResourceId(f.j.f35715j0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f7413a = 0;
            return;
        }
        if (this.f7413a == 1) {
            if (!this.f7419g) {
                DisplayMetrics displayMetrics = this.f7422j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i8, int i9, int i10, int i11) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f7422j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i11, i8, displayMetrics), TypedValue.applyDimension(i11, i9, displayMetrics), TypedValue.applyDimension(i11, i10, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i8) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i8 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f7422j.getResources().getDisplayMetrics();
                    for (int i9 = 0; i9 < length; i9++) {
                        iArr2[i9] = Math.round(TypedValue.applyDimension(i8, iArr[i9], displayMetrics));
                    }
                }
                this.f7418f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f7419g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i8) {
        if (y()) {
            if (i8 == 0) {
                c();
                return;
            }
            if (i8 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i8);
            }
            DisplayMetrics displayMetrics = this.f7422j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i8, float f8) {
        Context context = this.f7422j;
        s(TypedValue.applyDimension(i8, f8, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
