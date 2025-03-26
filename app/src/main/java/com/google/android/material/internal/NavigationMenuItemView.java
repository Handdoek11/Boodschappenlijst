package com.google.android.material.internal;

import A0.z;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.k0;
import f.AbstractC5752a;
import r0.AbstractC6641a;
import z0.C7013a;
import z0.X;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends d implements k.a {

    /* renamed from: a0, reason: collision with root package name */
    private static final int[] f32016a0 = {R.attr.state_checked};

    /* renamed from: M, reason: collision with root package name */
    private int f32017M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f32018N;

    /* renamed from: O, reason: collision with root package name */
    boolean f32019O;

    /* renamed from: P, reason: collision with root package name */
    boolean f32020P;

    /* renamed from: Q, reason: collision with root package name */
    private final CheckedTextView f32021Q;

    /* renamed from: R, reason: collision with root package name */
    private FrameLayout f32022R;

    /* renamed from: S, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f32023S;

    /* renamed from: T, reason: collision with root package name */
    private ColorStateList f32024T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f32025U;

    /* renamed from: V, reason: collision with root package name */
    private Drawable f32026V;

    /* renamed from: W, reason: collision with root package name */
    private final C7013a f32027W;

    class a extends C7013a {
        a() {
        }

        @Override // z0.C7013a
        public void k(View view, z zVar) {
            super.k(view, zVar);
            zVar.i0(NavigationMenuItemView.this.f32019O);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f32021Q.setVisibility(8);
            FrameLayout frameLayout = this.f32022R;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f32022R.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f32021Q.setVisibility(0);
        FrameLayout frameLayout2 = this.f32022R;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f32022R.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC5752a.f35393t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f32016a0, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.f32023S.getTitle() == null && this.f32023S.getIcon() == null && this.f32023S.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f32022R == null) {
                this.f32022R = (FrameLayout) ((ViewStub) findViewById(D3.f.f1534e)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f32022R.removeAllViews();
            this.f32022R.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void g(androidx.appcompat.view.menu.g gVar, int i8) {
        this.f32023S = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            X.r0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        k0.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f32023S;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 1);
        androidx.appcompat.view.menu.g gVar = this.f32023S;
        if (gVar != null && gVar.isCheckable() && this.f32023S.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f32016a0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z7) {
        refreshDrawableState();
        if (this.f32019O != z7) {
            this.f32019O = z7;
            this.f32027W.p(this.f32021Q, 2048);
        }
    }

    public void setChecked(boolean z7) {
        refreshDrawableState();
        this.f32021Q.setChecked(z7);
        CheckedTextView checkedTextView = this.f32021Q;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z7 && this.f32020P) ? 1 : 0);
    }

    public void setHorizontalPadding(int i8) {
        setPadding(i8, getPaddingTop(), i8, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f32025U) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC6641a.r(drawable).mutate();
                AbstractC6641a.o(drawable, this.f32024T);
            }
            int i8 = this.f32017M;
            drawable.setBounds(0, 0, i8, i8);
        } else if (this.f32018N) {
            if (this.f32026V == null) {
                Drawable e8 = p0.h.e(getResources(), D3.e.f1510j, getContext().getTheme());
                this.f32026V = e8;
                if (e8 != null) {
                    int i9 = this.f32017M;
                    e8.setBounds(0, 0, i9, i9);
                }
            }
            drawable = this.f32026V;
        }
        androidx.core.widget.h.j(this.f32021Q, drawable, null, null, null);
    }

    public void setIconPadding(int i8) {
        this.f32021Q.setCompoundDrawablePadding(i8);
    }

    public void setIconSize(int i8) {
        this.f32017M = i8;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f32024T = colorStateList;
        this.f32025U = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.f32023S;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i8) {
        this.f32021Q.setMaxLines(i8);
    }

    public void setNeedsEmptyIcon(boolean z7) {
        this.f32018N = z7;
    }

    public void setTextAppearance(int i8) {
        androidx.core.widget.h.p(this.f32021Q, i8);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f32021Q.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f32021Q.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f32020P = true;
        a aVar = new a();
        this.f32027W = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(D3.h.f1562e, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(D3.d.f1470d));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(D3.f.f1535f);
        this.f32021Q = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        X.n0(checkedTextView, aVar);
    }
}
