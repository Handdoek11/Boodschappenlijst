package com.headcode.ourgroceries.android.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.headcode.ourgroceries.android.P1;

/* loaded from: classes2.dex */
public class WelcomeLayout extends ViewGroup {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final View f35080a;

        /* renamed from: b, reason: collision with root package name */
        private final View f35081b;

        /* renamed from: c, reason: collision with root package name */
        private final View f35082c;

        /* renamed from: d, reason: collision with root package name */
        private final View f35083d;

        /* renamed from: e, reason: collision with root package name */
        private final Rect f35084e;

        /* renamed from: f, reason: collision with root package name */
        private final Rect f35085f;

        /* renamed from: g, reason: collision with root package name */
        private final Rect f35086g;

        /* renamed from: h, reason: collision with root package name */
        private final Rect f35087h;

        public a(View view, View view2, View view3, View view4, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            this.f35080a = view;
            this.f35081b = view2;
            this.f35082c = view3;
            this.f35083d = view4;
            this.f35084e = rect;
            this.f35085f = rect2;
            this.f35086g = rect3;
            this.f35087h = rect4;
        }
    }

    public WelcomeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private a a(boolean z7) {
        View view;
        View view2;
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        View childAt3 = getChildAt(2);
        View childAt4 = getChildAt(3);
        int i8 = P1.i(20);
        int i9 = P1.i(20);
        int i10 = P1.i(10);
        int i11 = P1.i(20);
        int measuredWidth = getMeasuredWidth() - (i8 * 2);
        int measuredHeight = getMeasuredHeight() - (i9 * 2);
        int min = Math.min(measuredWidth, Math.max(childAt3.getMeasuredWidth(), childAt4.getMeasuredWidth()));
        if (z7) {
            childAt3.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            childAt4.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int measuredHeight2 = childAt3.getMeasuredHeight();
        int measuredHeight3 = childAt4.getMeasuredHeight();
        int measuredWidth2 = (getMeasuredWidth() - childAt3.getMeasuredWidth()) / 2;
        int measuredHeight4 = (getMeasuredHeight() - i9) - measuredHeight3;
        int i12 = (measuredHeight4 - i10) - measuredHeight2;
        if (z7) {
            view2 = childAt4;
            view = childAt3;
            childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
        } else {
            view = childAt3;
            view2 = childAt4;
        }
        int measuredWidth3 = childAt2.getMeasuredWidth();
        int measuredHeight5 = childAt2.getMeasuredHeight();
        int max = Math.max(0, (i12 - i9) - (i10 * 2));
        int max2 = Math.max(0, (max - i11) - measuredHeight5);
        int measuredWidth4 = childAt.getMeasuredWidth();
        int min2 = Math.min(childAt.getMeasuredHeight(), max2);
        if (min2 < i11 * 2) {
            i11 = 0;
            min2 = 0;
        }
        int max3 = Math.max(0, ((max - min2) - i11) - measuredHeight5);
        int i13 = ((measuredWidth - measuredWidth4) / 2) + i8;
        int i14 = i9 + (max3 / 3);
        int i15 = i14 + min2;
        childAt.layout(i13, i14, i13 + measuredWidth4, i15);
        int i16 = i8 + ((measuredWidth - measuredWidth3) / 2);
        int i17 = i15 + i11 + (max3 / 6);
        childAt2.layout(i16, i17, i16 + measuredWidth3, i17 + measuredHeight5);
        return new a(childAt, childAt2, view, view2, c(i13, i14, measuredWidth4, min2), c(i16, i17, measuredWidth3, measuredHeight5), c(measuredWidth2, i12, min, measuredHeight2), c(measuredWidth2, measuredHeight4, min, measuredHeight3));
    }

    private static void b(View view, Rect rect) {
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    private static Rect c(int i8, int i9, int i10, int i11) {
        return new Rect(i8, i9, i10 + i8, i11 + i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        a a8 = a(false);
        b(a8.f35080a, a8.f35084e);
        b(a8.f35081b, a8.f35085f);
        b(a8.f35082c, a8.f35086g);
        b(a8.f35083d, a8.f35087h);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        measureChildren(i8, i9);
        a a8 = a(true);
        a8.f35080a.measure(View.MeasureSpec.makeMeasureSpec(a8.f35084e.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(a8.f35084e.height(), 1073741824));
        a8.f35081b.measure(View.MeasureSpec.makeMeasureSpec(a8.f35085f.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(a8.f35085f.height(), 1073741824));
        a8.f35082c.measure(View.MeasureSpec.makeMeasureSpec(a8.f35086g.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(a8.f35086g.height(), 1073741824));
        a8.f35083d.measure(View.MeasureSpec.makeMeasureSpec(a8.f35087h.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(a8.f35087h.height(), 1073741824));
        super.onMeasure(i8, i9);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public WelcomeLayout(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public WelcomeLayout(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }
}
