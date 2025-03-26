package com.google.android.material.appbar;

import D3.k;
import V3.g;
import V3.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.l;
import com.google.android.material.internal.m;
import r0.AbstractC6641a;
import z0.X;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: t0, reason: collision with root package name */
    private static final int f31361t0 = k.f1632v;

    /* renamed from: u0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f31362u0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: o0, reason: collision with root package name */
    private Integer f31363o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f31364p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f31365q0;

    /* renamed from: r0, reason: collision with root package name */
    private ImageView.ScaleType f31366r0;

    /* renamed from: s0, reason: collision with root package name */
    private Boolean f31367s0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1401Y);
    }

    private Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i8 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i8 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i8 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.d.f(background);
        if (valueOf != null) {
            g gVar = new g();
            gVar.U(valueOf);
            gVar.J(context);
            gVar.T(X.u(this));
            X.r0(this, gVar);
        }
    }

    private void U(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i8 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i9 = measuredWidth2 + i8;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i8, 0), Math.max(i9 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i8 += max;
            i9 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i9 - i8, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i8, view.getTop(), i9, view.getBottom());
    }

    private void V() {
        if (this.f31364p0 || this.f31365q0) {
            TextView e8 = m.e(this);
            TextView c8 = m.c(this);
            if (e8 == null && c8 == null) {
                return;
            }
            Pair S7 = S(e8, c8);
            if (this.f31364p0 && e8 != null) {
                U(e8, S7);
            }
            if (!this.f31365q0 || c8 == null) {
                return;
            }
            U(c8, S7);
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.f31363o0 == null) {
            return drawable;
        }
        Drawable r8 = AbstractC6641a.r(drawable.mutate());
        AbstractC6641a.n(r8, this.f31363o0.intValue());
        return r8;
    }

    private void X() {
        ImageView b8 = m.b(this);
        if (b8 != null) {
            Boolean bool = this.f31367s0;
            if (bool != null) {
                b8.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f31366r0;
            if (scaleType != null) {
                b8.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f31366r0;
    }

    public Integer getNavigationIconTint() {
        return this.f31363o0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        V();
        X();
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        h.d(this, f8);
    }

    public void setLogoAdjustViewBounds(boolean z7) {
        Boolean bool = this.f31367s0;
        if (bool == null || bool.booleanValue() != z7) {
            this.f31367s0 = Boolean.valueOf(z7);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f31366r0 != scaleType) {
            this.f31366r0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i8) {
        this.f31363o0 = Integer.valueOf(i8);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z7) {
        if (this.f31365q0 != z7) {
            this.f31365q0 = z7;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z7) {
        if (this.f31364p0 != z7) {
            this.f31364p0 = z7;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i8) {
        Menu menu = getMenu();
        boolean z7 = menu instanceof e;
        if (z7) {
            ((e) menu).e0();
        }
        super.x(i8);
        if (z7) {
            ((e) menu).d0();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f31361t0;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        Context context2 = getContext();
        TypedArray i10 = l.i(context2, attributeSet, D3.l.f1981p4, i8, i9, new int[0]);
        if (i10.hasValue(D3.l.f2008s4)) {
            setNavigationIconTint(i10.getColor(D3.l.f2008s4, -1));
        }
        this.f31364p0 = i10.getBoolean(D3.l.f2025u4, false);
        this.f31365q0 = i10.getBoolean(D3.l.f2017t4, false);
        int i11 = i10.getInt(D3.l.f1999r4, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f31362u0;
            if (i11 < scaleTypeArr.length) {
                this.f31366r0 = scaleTypeArr[i11];
            }
        }
        if (i10.hasValue(D3.l.f1990q4)) {
            this.f31367s0 = Boolean.valueOf(i10.getBoolean(D3.l.f1990q4, false));
        }
        i10.recycle();
        T(context2);
    }
}
