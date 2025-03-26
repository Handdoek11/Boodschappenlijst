package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    private int f32007o;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f32007o = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f32007o;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i10 - i8) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f32007o == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f32007o + paddingTop) - childAt.getBaseline();
                childAt.layout(i13, baseline, measuredWidth + i13, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i8, i9);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i13 = Math.max(i13, baseline);
                    i14 = Math.max(i14, childAt.getMeasuredHeight() - baseline);
                }
                i11 = Math.max(i11, childAt.getMeasuredWidth());
                i10 = Math.max(i10, childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        if (i13 != -1) {
            i10 = Math.max(i10, Math.max(i14, getPaddingBottom()) + i13);
            this.f32007o = i13;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i11, getSuggestedMinimumWidth()), i8, i12), View.resolveSizeAndState(Math.max(i10, getSuggestedMinimumHeight()), i9, i12 << 16));
    }
}
