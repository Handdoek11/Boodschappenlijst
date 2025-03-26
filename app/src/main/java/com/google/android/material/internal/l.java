package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.f0;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f32141a = {D3.b.f1411j};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f32142b = {D3.b.f1412k};

    public static void a(Context context) {
        e(context, f32141a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i8, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D3.l.Z7, i8, i9);
        boolean z7 = obtainStyledAttributes.getBoolean(D3.l.b8, false);
        obtainStyledAttributes.recycle();
        if (z7) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(D3.b.f1420s, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f32142b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, int... iArr2) {
        boolean z7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D3.l.Z7, i8, i9);
        if (!obtainStyledAttributes.getBoolean(D3.l.c8, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z7 = obtainStyledAttributes.getResourceId(D3.l.a8, -1) != -1;
        } else {
            z7 = f(context, attributeSet, iArr, i8, i9, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z7) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i8, i9);
        for (int i10 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i10, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(Context context) {
        return S3.b.b(context, D3.b.f1419r, false);
    }

    private static boolean h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i8 = 0; i8 < iArr.length; i8++) {
            if (!obtainStyledAttributes.hasValue(i8)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray i(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, int... iArr2) {
        b(context, attributeSet, i8, i9);
        d(context, attributeSet, iArr, i8, i9, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i8, i9);
    }

    public static f0 j(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, int... iArr2) {
        b(context, attributeSet, i8, i9);
        d(context, attributeSet, iArr, i8, i9, iArr2);
        return f0.v(context, attributeSet, iArr, i8, i9);
    }
}
