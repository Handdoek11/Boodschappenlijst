package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import f.AbstractC5752a;
import f.AbstractC5757f;
import f.AbstractC5758g;
import z0.C7026g0;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0841a {

    /* renamed from: A, reason: collision with root package name */
    private CharSequence f7295A;

    /* renamed from: B, reason: collision with root package name */
    private View f7296B;

    /* renamed from: C, reason: collision with root package name */
    private View f7297C;

    /* renamed from: D, reason: collision with root package name */
    private View f7298D;

    /* renamed from: E, reason: collision with root package name */
    private LinearLayout f7299E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f7300F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f7301G;

    /* renamed from: H, reason: collision with root package name */
    private int f7302H;

    /* renamed from: I, reason: collision with root package name */
    private int f7303I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f7304J;

    /* renamed from: K, reason: collision with root package name */
    private int f7305K;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f7306z;

    class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f7307o;

        a(androidx.appcompat.view.b bVar) {
            this.f7307o = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f7307o.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f7299E == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC5758g.f35509a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f7299E = linearLayout;
            this.f7300F = (TextView) linearLayout.findViewById(AbstractC5757f.f35487e);
            this.f7301G = (TextView) this.f7299E.findViewById(AbstractC5757f.f35486d);
            if (this.f7302H != 0) {
                this.f7300F.setTextAppearance(getContext(), this.f7302H);
            }
            if (this.f7303I != 0) {
                this.f7301G.setTextAppearance(getContext(), this.f7303I);
            }
        }
        this.f7300F.setText(this.f7306z);
        this.f7301G.setText(this.f7295A);
        boolean isEmpty = TextUtils.isEmpty(this.f7306z);
        boolean isEmpty2 = TextUtils.isEmpty(this.f7295A);
        this.f7301G.setVisibility(!isEmpty2 ? 0 : 8);
        this.f7299E.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f7299E.getParent() == null) {
            addView(this.f7299E);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ C7026g0 f(int i8, long j8) {
        return super.f(i8, j8);
    }

    public void g() {
        if (this.f7296B == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f7295A;
    }

    public CharSequence getTitle() {
        return this.f7306z;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f7296B;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f7305K, (ViewGroup) this, false);
            this.f7296B = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f7296B);
        }
        View findViewById = this.f7296B.findViewById(AbstractC5757f.f35491i);
        this.f7297C = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        C0843c c0843c = this.f7735u;
        if (c0843c != null) {
            c0843c.y();
        }
        C0843c c0843c2 = new C0843c(getContext());
        this.f7735u = c0843c2;
        c0843c2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f7735u, this.f7733s);
        ActionMenuView actionMenuView = (ActionMenuView) this.f7735u.o(this);
        this.f7734t = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f7734t, layoutParams);
    }

    public boolean j() {
        return this.f7304J;
    }

    public void k() {
        removeAllViews();
        this.f7298D = null;
        this.f7734t = null;
        this.f7735u = null;
        View view = this.f7297C;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        C0843c c0843c = this.f7735u;
        if (c0843c != null) {
            return c0843c.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0843c c0843c = this.f7735u;
        if (c0843c != null) {
            c0843c.B();
            this.f7735u.C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0841a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        boolean b8 = q0.b(this);
        int paddingRight = b8 ? (i10 - i8) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
        View view = this.f7296B;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7296B.getLayoutParams();
            int i12 = b8 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i13 = b8 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d8 = AbstractC0841a.d(paddingRight, i12, b8);
            paddingRight = AbstractC0841a.d(d8 + e(this.f7296B, d8, paddingTop, paddingTop2, b8), i13, b8);
        }
        int i14 = paddingRight;
        LinearLayout linearLayout = this.f7299E;
        if (linearLayout != null && this.f7298D == null && linearLayout.getVisibility() != 8) {
            i14 += e(this.f7299E, i14, paddingTop, paddingTop2, b8);
        }
        int i15 = i14;
        View view2 = this.f7298D;
        if (view2 != null) {
            e(view2, i15, paddingTop, paddingTop2, b8);
        }
        int paddingLeft = b8 ? getPaddingLeft() : (i10 - i8) - getPaddingRight();
        ActionMenuView actionMenuView = this.f7734t;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b8);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i9) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i8);
        int i10 = this.f7736v;
        if (i10 <= 0) {
            i10 = View.MeasureSpec.getSize(i9);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i11 = i10 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        View view = this.f7296B;
        if (view != null) {
            int c8 = c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7296B.getLayoutParams();
            paddingLeft = c8 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f7734t;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f7734t, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f7299E;
        if (linearLayout != null && this.f7298D == null) {
            if (this.f7304J) {
                this.f7299E.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f7299E.getMeasuredWidth();
                boolean z7 = measuredWidth <= paddingLeft;
                if (z7) {
                    paddingLeft -= measuredWidth;
                }
                this.f7299E.setVisibility(z7 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f7298D;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                i11 = Math.min(i14, i11);
            }
            this.f7298D.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(i11, i15));
        }
        if (this.f7736v > 0) {
            setMeasuredDimension(size, i10);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC0841a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0841a
    public void setContentHeight(int i8) {
        this.f7736v = i8;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f7298D;
        if (view2 != null) {
            removeView(view2);
        }
        this.f7298D = view;
        if (view != null && (linearLayout = this.f7299E) != null) {
            removeView(linearLayout);
            this.f7299E = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f7295A = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f7306z = charSequence;
        i();
        z0.X.q0(this, charSequence);
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.f7304J) {
            requestLayout();
        }
        this.f7304J = z7;
    }

    @Override // androidx.appcompat.widget.AbstractC0841a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i8) {
        super.setVisibility(i8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35380g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        f0 v7 = f0.v(context, attributeSet, f.j.f35789y, i8, 0);
        setBackground(v7.g(f.j.f35794z));
        this.f7302H = v7.n(f.j.f35562D, 0);
        this.f7303I = v7.n(f.j.f35557C, 0);
        this.f7736v = v7.m(f.j.f35552B, 0);
        this.f7305K = v7.n(f.j.f35547A, AbstractC5758g.f35512d);
        v7.x();
    }
}
