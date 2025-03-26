package com.google.android.material.snackbar;

import D3.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar {

    /* renamed from: I, reason: collision with root package name */
    private static final int[] f32256I;

    /* renamed from: J, reason: collision with root package name */
    private static final int[] f32257J;

    /* renamed from: G, reason: collision with root package name */
    private final AccessibilityManager f32258G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f32259H;

    public static final class SnackbarLayout extends BaseTransientBottomBar.s {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i8 = D3.b.f1389M;
        f32256I = new int[]{i8};
        f32257J = new int[]{i8, D3.b.f1391O};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, a aVar) {
        super(context, viewGroup, view, aVar);
        this.f32258G = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup h0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button i0() {
        return j0().getActionView();
    }

    private SnackbarContentLayout j0() {
        return (SnackbarContentLayout) this.f32205i.getChildAt(0);
    }

    private TextView k0() {
        return j0().getMessageView();
    }

    private static boolean l0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f32257J);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        z(1);
    }

    public static Snackbar n0(View view, int i8, int i9) {
        return o0(view, view.getResources().getText(i8), i9);
    }

    public static Snackbar o0(View view, CharSequence charSequence, int i8) {
        return p0(null, view, charSequence, i8);
    }

    private static Snackbar p0(Context context, View view, CharSequence charSequence, int i8) {
        ViewGroup h02 = h0(view);
        if (h02 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = h02.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(l0(context) ? h.f1579v : h.f1559b, h02, false);
        Snackbar snackbar = new Snackbar(context, h02, snackbarContentLayout, snackbarContentLayout);
        snackbar.s0(charSequence);
        snackbar.U(i8);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int D() {
        int D7 = super.D();
        if (D7 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f32258G.getRecommendedTimeoutMillis(D7, (this.f32259H ? 4 : 0) | 3);
        }
        if (this.f32259H && this.f32258G.isTouchExplorationEnabled()) {
            return -2;
        }
        return D7;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void Y() {
        super.Y();
    }

    public Snackbar q0(int i8, View.OnClickListener onClickListener) {
        return r0(C().getText(i8), onClickListener);
    }

    public Snackbar r0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button i02 = i0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            i02.setVisibility(8);
            i02.setOnClickListener(null);
            this.f32259H = false;
        } else {
            this.f32259H = true;
            i02.setVisibility(0);
            i02.setText(charSequence);
            i02.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32264o.m0(onClickListener, view);
                }
            });
        }
        return this;
    }

    public Snackbar s0(CharSequence charSequence) {
        k0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void y() {
        super.y();
    }
}
