package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    private int[] f7429A;

    /* renamed from: B, reason: collision with root package name */
    private Drawable f7430B;

    /* renamed from: C, reason: collision with root package name */
    private int f7431C;

    /* renamed from: D, reason: collision with root package name */
    private int f7432D;

    /* renamed from: E, reason: collision with root package name */
    private int f7433E;

    /* renamed from: F, reason: collision with root package name */
    private int f7434F;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7435o;

    /* renamed from: s, reason: collision with root package name */
    private int f7436s;

    /* renamed from: t, reason: collision with root package name */
    private int f7437t;

    /* renamed from: u, reason: collision with root package name */
    private int f7438u;

    /* renamed from: v, reason: collision with root package name */
    private int f7439v;

    /* renamed from: w, reason: collision with root package name */
    private int f7440w;

    /* renamed from: x, reason: collision with root package name */
    private float f7441x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f7442y;

    /* renamed from: z, reason: collision with root package name */
    private int[] f7443z;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i8, int i9) {
            super(i8, i9);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A(View view, int i8, int i9, int i10, int i11) {
        view.layout(i8, i9, i10 + i8, i11 + i9);
    }

    private void k(int i8, int i9) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i10 = 0; i10 < i8; i10++) {
            View s8 = s(i10);
            if (s8.getVisibility() != 8) {
                a aVar = (a) s8.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i11 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = s8.getMeasuredWidth();
                    measureChildWithMargins(s8, i9, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i11;
                }
            }
        }
    }

    private void l(int i8, int i9) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i10 = 0; i10 < i8; i10++) {
            View s8 = s(i10);
            if (s8.getVisibility() != 8) {
                a aVar = (a) s8.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i11 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = s8.getMeasuredHeight();
                    measureChildWithMargins(s8, makeMeasureSpec, 0, i9, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i11;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void f(Canvas canvas) {
        int right;
        int left;
        int i8;
        int virtualChildCount = getVirtualChildCount();
        boolean b8 = q0.b(this);
        for (int i9 = 0; i9 < virtualChildCount; i9++) {
            View s8 = s(i9);
            if (s8 != null && s8.getVisibility() != 8 && t(i9)) {
                a aVar = (a) s8.getLayoutParams();
                j(canvas, b8 ? s8.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (s8.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f7431C);
            }
        }
        if (t(virtualChildCount)) {
            View s9 = s(virtualChildCount - 1);
            if (s9 != null) {
                a aVar2 = (a) s9.getLayoutParams();
                if (b8) {
                    left = s9.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i8 = this.f7431C;
                    right = left - i8;
                } else {
                    right = s9.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b8) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i8 = this.f7431C;
                right = left - i8;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i8;
        if (this.f7436s < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i9 = this.f7436s;
        if (childCount <= i9) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i9);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f7436s == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i10 = this.f7437t;
        if (this.f7438u == 1 && (i8 = this.f7439v & 112) != 48) {
            if (i8 == 16) {
                i10 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f7440w) / 2;
            } else if (i8 == 80) {
                i10 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f7440w;
            }
        }
        return i10 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f7436s;
    }

    public Drawable getDividerDrawable() {
        return this.f7430B;
    }

    public int getDividerPadding() {
        return this.f7434F;
    }

    public int getDividerWidth() {
        return this.f7431C;
    }

    public int getGravity() {
        return this.f7439v;
    }

    public int getOrientation() {
        return this.f7438u;
    }

    public int getShowDividers() {
        return this.f7433E;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f7441x;
    }

    void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View s8 = s(i8);
            if (s8 != null && s8.getVisibility() != 8 && t(i8)) {
                i(canvas, (s8.getTop() - ((LinearLayout.LayoutParams) ((a) s8.getLayoutParams())).topMargin) - this.f7432D);
            }
        }
        if (t(virtualChildCount)) {
            View s9 = s(virtualChildCount - 1);
            i(canvas, s9 == null ? (getHeight() - getPaddingBottom()) - this.f7432D : s9.getBottom() + ((LinearLayout.LayoutParams) ((a) s9.getLayoutParams())).bottomMargin);
        }
    }

    void i(Canvas canvas, int i8) {
        this.f7430B.setBounds(getPaddingLeft() + this.f7434F, i8, (getWidth() - getPaddingRight()) - this.f7434F, this.f7432D + i8);
        this.f7430B.draw(canvas);
    }

    void j(Canvas canvas, int i8) {
        this.f7430B.setBounds(i8, getPaddingTop() + this.f7434F, this.f7431C + i8, (getHeight() - getPaddingBottom()) - this.f7434F);
        this.f7430B.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i8 = this.f7438u;
        if (i8 == 0) {
            return new a(-2, -2);
        }
        if (i8 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f7430B == null) {
            return;
        }
        if (this.f7438u == 1) {
            h(canvas);
        } else {
            f(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        if (this.f7438u == 1) {
            v(i8, i9, i10, i11);
        } else {
            u(i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.f7438u == 1) {
            z(i8, i9);
        } else {
            x(i8, i9);
        }
    }

    int p(View view, int i8) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i8) {
        return getChildAt(i8);
    }

    public void setBaselineAligned(boolean z7) {
        this.f7435o = z7;
    }

    public void setBaselineAlignedChildIndex(int i8) {
        if (i8 >= 0 && i8 < getChildCount()) {
            this.f7436s = i8;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f7430B) {
            return;
        }
        this.f7430B = drawable;
        if (drawable != null) {
            this.f7431C = drawable.getIntrinsicWidth();
            this.f7432D = drawable.getIntrinsicHeight();
        } else {
            this.f7431C = 0;
            this.f7432D = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i8) {
        this.f7434F = i8;
    }

    public void setGravity(int i8) {
        if (this.f7439v != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.f7439v = i8;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i8) {
        int i9 = i8 & 8388615;
        int i10 = this.f7439v;
        if ((8388615 & i10) != i9) {
            this.f7439v = i9 | ((-8388616) & i10);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f7442y = z7;
    }

    public void setOrientation(int i8) {
        if (this.f7438u != i8) {
            this.f7438u = i8;
            requestLayout();
        }
    }

    public void setShowDividers(int i8) {
        if (i8 != this.f7433E) {
            requestLayout();
        }
        this.f7433E = i8;
    }

    public void setVerticalGravity(int i8) {
        int i9 = i8 & 112;
        int i10 = this.f7439v;
        if ((i10 & 112) != i9) {
            this.f7439v = i9 | (i10 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.f7441x = Math.max(0.0f, f8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int i8) {
        if (i8 == 0) {
            return (this.f7433E & 1) != 0;
        }
        if (i8 == getChildCount()) {
            return (this.f7433E & 4) != 0;
        }
        if ((this.f7433E & 2) == 0) {
            return false;
        }
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            if (getChildAt(i9).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f7439v
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f7440w
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f7440w
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lcb
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L5a
            int r1 = r6.y(r12)
            int r0 = r0 + r1
        L57:
            r1 = r14
            goto Lc8
        L5a:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L57
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L76
            r1 = r11
        L76:
            int r2 = r17.getLayoutDirection()
            int r1 = z0.AbstractC7048s.b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L90
            r2 = 5
            if (r1 == r2) goto L8a
            int r1 = r5.leftMargin
            int r1 = r1 + r7
        L88:
            r2 = r1
            goto L9b
        L8a:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
        L8e:
            int r1 = r1 - r2
            goto L88
        L90:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
            goto L8e
        L9b:
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto La4
            int r1 = r6.f7432D
            int r0 = r0 + r1
        La4:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
        Lc8:
            int r12 = r12 + r1
            goto L49
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.v(int, int, int, int):void");
    }

    void w(View view, int i8, int i9, int i10, int i11, int i12) {
        measureChildWithMargins(view, i9, i10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void x(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.x(int, int):void");
    }

    int y(int i8) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.z(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f7435o = true;
        this.f7436s = -1;
        this.f7437t = 0;
        this.f7439v = 8388659;
        f0 v7 = f0.v(context, attributeSet, f.j.f35671a1, i8, 0);
        z0.X.l0(this, context, f.j.f35671a1, attributeSet, v7.r(), i8, 0);
        int k8 = v7.k(f.j.f35681c1, -1);
        if (k8 >= 0) {
            setOrientation(k8);
        }
        int k9 = v7.k(f.j.f35676b1, -1);
        if (k9 >= 0) {
            setGravity(k9);
        }
        boolean a8 = v7.a(f.j.f35686d1, true);
        if (!a8) {
            setBaselineAligned(a8);
        }
        this.f7441x = v7.i(f.j.f35696f1, -1.0f);
        this.f7436s = v7.k(f.j.f35691e1, -1);
        this.f7442y = v7.a(f.j.f35711i1, false);
        setDividerDrawable(v7.g(f.j.f35701g1));
        this.f7433E = v7.k(f.j.f35716j1, 0);
        this.f7434F = v7.f(f.j.f35706h1, 0);
        v7.x();
    }
}
