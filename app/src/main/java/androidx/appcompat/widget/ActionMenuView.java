package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements e.b, androidx.appcompat.view.menu.k {

    /* renamed from: G, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f7347G;

    /* renamed from: H, reason: collision with root package name */
    private Context f7348H;

    /* renamed from: I, reason: collision with root package name */
    private int f7349I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f7350J;

    /* renamed from: K, reason: collision with root package name */
    private C0843c f7351K;

    /* renamed from: L, reason: collision with root package name */
    private j.a f7352L;

    /* renamed from: M, reason: collision with root package name */
    e.a f7353M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f7354N;

    /* renamed from: O, reason: collision with root package name */
    private int f7355O;

    /* renamed from: P, reason: collision with root package name */
    private int f7356P;

    /* renamed from: Q, reason: collision with root package name */
    private int f7357Q;

    /* renamed from: R, reason: collision with root package name */
    e f7358R;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7359a;

        /* renamed from: b, reason: collision with root package name */
        public int f7360b;

        /* renamed from: c, reason: collision with root package name */
        public int f7361c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7362d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7363e;

        /* renamed from: f, reason: collision with root package name */
        boolean f7364f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f7359a = cVar.f7359a;
        }

        public c(int i8, int i9) {
            super(i8, i9);
            this.f7359a = false;
        }
    }

    private class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f7358R;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f7353M;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int L(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.C()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.f7359a
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.f7362d = r1
            r0.f7360b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.L(android.view.View, int, int, int, int):int");
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void M(int i8, int i9) {
        int i10;
        int i11;
        boolean z7;
        int i12;
        int i13;
        boolean z8;
        boolean z9;
        int i14;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingTop, -2);
        int i15 = size - paddingLeft;
        int i16 = this.f7356P;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = i16 + (i18 / i17);
        int childCount = getChildCount();
        int i20 = 0;
        int i21 = 0;
        boolean z10 = false;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        long j8 = 0;
        while (i21 < childCount) {
            View childAt = getChildAt(i21);
            int i25 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i26 = i22 + 1;
                if (z11) {
                    int i27 = this.f7357Q;
                    i14 = i26;
                    r14 = 0;
                    childAt.setPadding(i27, 0, i27, 0);
                } else {
                    i14 = i26;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f7364f = r14;
                cVar.f7361c = r14;
                cVar.f7360b = r14;
                cVar.f7362d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f7363e = z11 && ((ActionMenuItemView) childAt).C();
                int L7 = L(childAt, i19, cVar.f7359a ? 1 : i17, childMeasureSpec, paddingTop);
                i23 = Math.max(i23, L7);
                if (cVar.f7362d) {
                    i24++;
                }
                if (cVar.f7359a) {
                    z10 = true;
                }
                i17 -= L7;
                i20 = Math.max(i20, childAt.getMeasuredHeight());
                if (L7 == 1) {
                    j8 |= 1 << i21;
                    i20 = i20;
                }
                i22 = i14;
            }
            i21++;
            size2 = i25;
        }
        int i28 = size2;
        boolean z12 = z10 && i22 == 2;
        boolean z13 = false;
        while (i24 > 0 && i17 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j9 = 0;
            while (i31 < childCount) {
                boolean z14 = z13;
                c cVar2 = (c) getChildAt(i31).getLayoutParams();
                int i32 = i20;
                if (cVar2.f7362d) {
                    int i33 = cVar2.f7360b;
                    if (i33 < i29) {
                        j9 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        i30++;
                        j9 |= 1 << i31;
                    }
                }
                i31++;
                i20 = i32;
                z13 = z14;
            }
            z7 = z13;
            i12 = i20;
            j8 |= j9;
            if (i30 > i17) {
                i10 = mode;
                i11 = i15;
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount) {
                View childAt2 = getChildAt(i35);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i36 = i15;
                int i37 = mode;
                long j10 = 1 << i35;
                if ((j9 & j10) == 0) {
                    if (cVar3.f7360b == i34) {
                        j8 |= j10;
                    }
                    z9 = z12;
                } else {
                    if (z12 && cVar3.f7363e && i17 == 1) {
                        int i38 = this.f7357Q;
                        z9 = z12;
                        childAt2.setPadding(i38 + i19, 0, i38, 0);
                    } else {
                        z9 = z12;
                    }
                    cVar3.f7360b++;
                    cVar3.f7364f = true;
                    i17--;
                }
                i35++;
                mode = i37;
                i15 = i36;
                z12 = z9;
            }
            i20 = i12;
            z13 = true;
        }
        i10 = mode;
        i11 = i15;
        z7 = z13;
        i12 = i20;
        boolean z15 = !z10 && i22 == 1;
        if (i17 <= 0 || j8 == 0 || (i17 >= i22 - 1 && !z15 && i23 <= 1)) {
            i13 = 0;
            z8 = z7;
        } else {
            float bitCount = Long.bitCount(j8);
            if (z15) {
                i13 = 0;
            } else {
                i13 = 0;
                if ((j8 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f7363e) {
                    bitCount -= 0.5f;
                }
                int i39 = childCount - 1;
                if ((j8 & (1 << i39)) != 0 && !((c) getChildAt(i39).getLayoutParams()).f7363e) {
                    bitCount -= 0.5f;
                }
            }
            int i40 = bitCount > 0.0f ? (int) ((i17 * i19) / bitCount) : i13;
            z8 = z7;
            for (int i41 = i13; i41 < childCount; i41++) {
                if ((j8 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f7361c = i40;
                        cVar4.f7364f = true;
                        if (i41 == 0 && !cVar4.f7363e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i40) / 2;
                        }
                        z8 = true;
                    } else if (cVar4.f7359a) {
                        cVar4.f7361c = i40;
                        cVar4.f7364f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i40) / 2;
                        z8 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i40 / 2;
                        }
                    }
                }
            }
        }
        if (z8) {
            for (int i42 = i13; i42 < childCount; i42++) {
                View childAt4 = getChildAt(i42);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f7364f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f7360b * i19) + cVar5.f7361c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, i10 != 1073741824 ? i12 : i28);
    }

    public void B() {
        C0843c c0843c = this.f7351K;
        if (c0843c != null) {
            c0843c.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f7359a = true;
        return generateDefaultLayoutParams;
    }

    protected boolean G(int i8) {
        boolean z7 = false;
        if (i8 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i8 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i8);
        if (i8 < getChildCount() && (childAt instanceof a)) {
            z7 = ((a) childAt).a();
        }
        return (i8 <= 0 || !(childAt2 instanceof a)) ? z7 : z7 | ((a) childAt2).b();
    }

    public boolean H() {
        C0843c c0843c = this.f7351K;
        return c0843c != null && c0843c.B();
    }

    public boolean I() {
        C0843c c0843c = this.f7351K;
        return c0843c != null && c0843c.D();
    }

    public boolean J() {
        C0843c c0843c = this.f7351K;
        return c0843c != null && c0843c.E();
    }

    public boolean K() {
        return this.f7350J;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f7347G;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f7352L = aVar;
        this.f7353M = aVar2;
    }

    public boolean P() {
        C0843c c0843c = this.f7351K;
        return c0843c != null && c0843c.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f7347G.M(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f7347G = eVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f7347G == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f7347G = eVar;
            eVar.S(new d());
            C0843c c0843c = new C0843c(context);
            this.f7351K = c0843c;
            c0843c.J(true);
            C0843c c0843c2 = this.f7351K;
            j.a aVar = this.f7352L;
            if (aVar == null) {
                aVar = new b();
            }
            c0843c2.h(aVar);
            this.f7347G.c(this.f7351K, this.f7348H);
            this.f7351K.H(this);
        }
        return this.f7347G;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f7351K.A();
    }

    public int getPopupTheme() {
        return this.f7349I;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0843c c0843c = this.f7351K;
        if (c0843c != null) {
            c0843c.d(false);
            if (this.f7351K.E()) {
                this.f7351K.B();
                this.f7351K.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int width;
        int i12;
        if (!this.f7354N) {
            super.onLayout(z7, i8, i9, i10, i11);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i11 - i9) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i10 - i8;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean b8 = q0.b(this);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f7359a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b8) {
                        i12 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i12 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i12 = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(i12, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int max = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (b8) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f7359a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f7359a) {
                int i26 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft = i26 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i8, int i9) {
        androidx.appcompat.view.menu.e eVar;
        boolean z7 = this.f7354N;
        boolean z8 = View.MeasureSpec.getMode(i8) == 1073741824;
        this.f7354N = z8;
        if (z7 != z8) {
            this.f7355O = 0;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (this.f7354N && (eVar = this.f7347G) != null && size != this.f7355O) {
            this.f7355O = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.f7354N && childCount > 0) {
            M(i8, i9);
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            c cVar = (c) getChildAt(i10).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i8, i9);
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.f7351K.G(z7);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f7358R = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f7351K.I(drawable);
    }

    public void setOverflowReserved(boolean z7) {
        this.f7350J = z7;
    }

    public void setPopupTheme(int i8) {
        if (this.f7349I != i8) {
            this.f7349I = i8;
            if (i8 == 0) {
                this.f7348H = getContext();
            } else {
                this.f7348H = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setPresenter(C0843c c0843c) {
        this.f7351K = c0843c;
        c0843c.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f7356P = (int) (56.0f * f8);
        this.f7357Q = (int) (f8 * 4.0f);
        this.f7348H = context;
        this.f7349I = 0;
    }
}
