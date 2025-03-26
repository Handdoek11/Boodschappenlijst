package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import f.AbstractC5757f;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    private boolean f7369o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f7370s;

    /* renamed from: t, reason: collision with root package name */
    private int f7371t;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7371t = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f35613N0);
        z0.X.l0(this, context, f.j.f35613N0, attributeSet, obtainStyledAttributes, 0, 0);
        this.f7369o = obtainStyledAttributes.getBoolean(f.j.f35618O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f7369o);
        }
    }

    private int a(int i8) {
        int childCount = getChildCount();
        while (i8 < childCount) {
            if (getChildAt(i8).getVisibility() == 0) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private boolean b() {
        return this.f7370s;
    }

    private void setStacked(boolean z7) {
        if (this.f7370s != z7) {
            if (!z7 || this.f7369o) {
                this.f7370s = z7;
                setOrientation(z7 ? 1 : 0);
                setGravity(z7 ? 8388613 : 80);
                View findViewById = findViewById(AbstractC5757f.f35473G);
                if (findViewById != null) {
                    findViewById.setVisibility(z7 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        boolean z7;
        int size = View.MeasureSpec.getSize(i8);
        int i11 = 0;
        if (this.f7369o) {
            if (size > this.f7371t && b()) {
                setStacked(false);
            }
            this.f7371t = size;
        }
        if (b() || View.MeasureSpec.getMode(i8) != 1073741824) {
            i10 = i8;
            z7 = false;
        } else {
            i10 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z7 = true;
        }
        super.onMeasure(i10, i9);
        if (this.f7369o && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z7 = true;
        }
        if (z7) {
            super.onMeasure(i8, i9);
        }
        int a8 = a(0);
        if (a8 >= 0) {
            View childAt = getChildAt(a8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int a9 = a(a8 + 1);
                if (a9 >= 0) {
                    paddingTop += getChildAt(a9).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i11 = paddingTop;
            } else {
                i11 = paddingTop + getPaddingBottom();
            }
        }
        if (z0.X.A(this) != i11) {
            setMinimumHeight(i11);
            if (i9 == 0) {
                super.onMeasure(i8, i9);
            }
        }
    }

    public void setAllowStacking(boolean z7) {
        if (this.f7369o != z7) {
            this.f7369o = z7;
            if (!z7 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
