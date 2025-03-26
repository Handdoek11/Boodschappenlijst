package com.headcode.ourgroceries.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.headcode.ourgroceries.android.O2;

/* loaded from: classes2.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private int f35088a;

    /* renamed from: b, reason: collision with root package name */
    private int f35089b;

    public a(Context context, AttributeSet attributeSet) {
        this.f35088a = Integer.MAX_VALUE;
        this.f35089b = Integer.MAX_VALUE;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O2.f34274a);
            this.f35088a = obtainStyledAttributes.getDimensionPixelSize(O2.f34276c, Integer.MAX_VALUE);
            this.f35089b = obtainStyledAttributes.getDimensionPixelSize(O2.f34275b, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }

    private static int b(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), mode) : i9 == Integer.MAX_VALUE ? i8 : View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    public int a(int i8) {
        return b(i8, this.f35089b);
    }

    public int c(int i8) {
        return b(i8, this.f35088a);
    }
}
