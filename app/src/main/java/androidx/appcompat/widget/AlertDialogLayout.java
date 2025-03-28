package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import f.AbstractC5757f;

/* loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void A(View view, int i8, int i9, int i10, int i11) {
        view.layout(i8, i9, i10 + i8, i11 + i9);
    }

    private static int B(View view) {
        int A7 = z0.X.A(view);
        if (A7 > 0) {
            return A7;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return B(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean C(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == AbstractC5757f.f35482P) {
                    view = childAt;
                } else if (id == AbstractC5757f.f35493k) {
                    view2 = childAt;
                } else {
                    if ((id != AbstractC5757f.f35495m && id != AbstractC5757f.f35497o) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i8);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i8, 0);
            paddingTop += view.getMeasuredHeight();
            i10 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i10 = 0;
        }
        if (view2 != null) {
            view2.measure(i8, 0);
            i11 = B(view2);
            i12 = view2.getMeasuredHeight() - i11;
            paddingTop += i11;
            i10 = View.combineMeasuredStates(i10, view2.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (view3 != null) {
            view3.measure(i8, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i13 = view3.getMeasuredHeight();
            paddingTop += i13;
            i10 = View.combineMeasuredStates(i10, view3.getMeasuredState());
        } else {
            i13 = 0;
        }
        int i15 = size - paddingTop;
        if (view2 != null) {
            int i16 = paddingTop - i11;
            int min = Math.min(i15, i12);
            if (min > 0) {
                i15 -= min;
                i11 += min;
            }
            view2.measure(i8, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
            paddingTop = i16 + view2.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, view2.getMeasuredState());
        }
        if (view3 != null && i15 > 0) {
            view3.measure(i8, View.MeasureSpec.makeMeasureSpec(i13 + i15, mode));
            paddingTop = (paddingTop - i13) + view3.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, view3.getMeasuredState());
        }
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                i17 = Math.max(i17, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i17 + getPaddingLeft() + getPaddingRight(), i8, i10), View.resolveSizeAndState(paddingTop, i9, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        l(childCount, i9);
        return true;
    }

    private void l(int i8, int i9) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i10 = 0; i10 < i8; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i11 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i9, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i11;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.getGravity()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            if (r2 == r1) goto L40
            r1 = 80
            if (r2 == r1) goto L35
            int r0 = r17.getPaddingTop()
            goto L4b
        L35:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L4b
        L40:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r0 = r1 + r2
        L4b:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L54
            r12 = r2
            goto L59
        L54:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L59:
            r13 = r2
        L5a:
            if (r13 >= r10) goto Lc0
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto Lbd
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto Lbd
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            androidx.appcompat.widget.LinearLayoutCompat$a r15 = (androidx.appcompat.widget.LinearLayoutCompat.a) r15
            int r2 = r15.gravity
            if (r2 >= 0) goto L7e
            r2 = r11
        L7e:
            int r3 = r17.getLayoutDirection()
            int r2 = z0.AbstractC7048s.b(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L98
            r3 = 5
            if (r2 == r3) goto L92
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto La3
        L92:
            int r2 = r8 - r4
            int r3 = r15.rightMargin
        L96:
            int r2 = r2 - r3
            goto La3
        L98:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
            int r3 = r15.rightMargin
            goto L96
        La3:
            boolean r3 = r6.t(r13)
            if (r3 == 0) goto Laa
            int r0 = r0 + r12
        Laa:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        Lbd:
            int r13 = r13 + 1
            goto L5a
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (C(i8, i9)) {
            return;
        }
        super.onMeasure(i8, i9);
    }
}
