package com.google.android.material.floatingactionbutton;

import D3.d;
import D3.k;
import D3.l;
import E3.f;
import V3.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C0851k;
import androidx.appcompat.widget.C0857q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.o;
import com.google.android.material.internal.p;
import java.util.List;
import r0.AbstractC6641a;
import y0.i;
import z0.X;

/* loaded from: classes2.dex */
public class FloatingActionButton extends p implements O3.a, n, CoordinatorLayout.b {

    /* renamed from: I, reason: collision with root package name */
    private static final int f31902I = k.f1617g;

    /* renamed from: A, reason: collision with root package name */
    private int f31903A;

    /* renamed from: B, reason: collision with root package name */
    private int f31904B;

    /* renamed from: C, reason: collision with root package name */
    boolean f31905C;

    /* renamed from: D, reason: collision with root package name */
    final Rect f31906D;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f31907E;

    /* renamed from: F, reason: collision with root package name */
    private final C0857q f31908F;

    /* renamed from: G, reason: collision with root package name */
    private final O3.b f31909G;

    /* renamed from: H, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.b f31910H;

    /* renamed from: s, reason: collision with root package name */
    private ColorStateList f31911s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuff.Mode f31912t;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f31913u;

    /* renamed from: v, reason: collision with root package name */
    private PorterDuff.Mode f31914v;

    /* renamed from: w, reason: collision with root package name */
    private ColorStateList f31915w;

    /* renamed from: x, reason: collision with root package name */
    private int f31916x;

    /* renamed from: y, reason: collision with root package name */
    private int f31917y;

    /* renamed from: z, reason: collision with root package name */
    private int f31918z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i8) {
            return super.l(coordinatorLayout, floatingActionButton, i8);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
    }

    private class b implements U3.b {
        b() {
        }

        @Override // U3.b
        public void a(int i8, int i9, int i10, int i11) {
            FloatingActionButton.this.f31906D.set(i8, i9, i10, i11);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i8 + floatingActionButton.f31903A, i9 + FloatingActionButton.this.f31903A, i10 + FloatingActionButton.this.f31903A, i11 + FloatingActionButton.this.f31903A);
        }

        @Override // U3.b
        public void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // U3.b
        public boolean d() {
            return FloatingActionButton.this.f31905C;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1418q);
    }

    private com.google.android.material.floatingactionbutton.b e() {
        return new c(this, new b());
    }

    private int g(int i8) {
        int i9 = this.f31918z;
        if (i9 != 0) {
            return i9;
        }
        Resources resources = getResources();
        return i8 != -1 ? i8 != 1 ? resources.getDimensionPixelSize(d.f1468c) : resources.getDimensionPixelSize(d.f1466b) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.f31910H == null) {
            this.f31910H = e();
        }
        return this.f31910H;
    }

    private void h(Rect rect) {
        f(rect);
        int i8 = -this.f31910H.s();
        rect.inset(i8, i8);
    }

    private void j(Rect rect) {
        int i8 = rect.left;
        Rect rect2 = this.f31906D;
        rect.left = i8 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f31913u;
        if (colorStateList == null) {
            AbstractC6641a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f31914v;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0851k.e(colorForState, mode));
    }

    private b.k m(a aVar) {
        return null;
    }

    @Override // O3.a
    public boolean a() {
        return this.f31909G.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().B(getDrawableState());
    }

    public void f(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        j(rect);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f31911s;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f31912t;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().j();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().p();
    }

    public Drawable getContentBackground() {
        return getImpl().i();
    }

    public int getCustomSize() {
        return this.f31918z;
    }

    public int getExpandedComponentIdHint() {
        return this.f31909G.b();
    }

    public f getHideMotionSpec() {
        return getImpl().l();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f31915w;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f31915w;
    }

    public V3.k getShapeAppearanceModel() {
        return (V3.k) i.g(getImpl().q());
    }

    public f getShowMotionSpec() {
        return getImpl().r();
    }

    public int getSize() {
        return this.f31917y;
    }

    int getSizeDimension() {
        return g(this.f31917y);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f31913u;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f31914v;
    }

    public boolean getUseCompatPadding() {
        return this.f31905C;
    }

    void i(a aVar, boolean z7) {
        getImpl().t(m(aVar), z7);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().x();
    }

    void l(a aVar, boolean z7) {
        getImpl().Z(m(aVar), z7);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().y();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().A();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i8, int i9) {
        int sizeDimension = getSizeDimension();
        this.f31903A = (sizeDimension - this.f31904B) / 2;
        getImpl().c0();
        int min = Math.min(View.resolveSize(sizeDimension, i8), View.resolveSize(sizeDimension, i9));
        Rect rect = this.f31906D;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof X3.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        X3.a aVar = (X3.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.f31909G.d((Bundle) i.g((Bundle) aVar.f5940t.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        X3.a aVar = new X3.a(onSaveInstanceState);
        aVar.f5940t.put("expandableWidgetHelper", this.f31909G.e());
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            h(this.f31907E);
            if (!this.f31907E.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f31911s != colorStateList) {
            this.f31911s = colorStateList;
            getImpl().I(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f31912t != mode) {
            this.f31912t = mode;
            getImpl().J(mode);
        }
    }

    public void setCompatElevation(float f8) {
        getImpl().K(f8);
    }

    public void setCompatElevationResource(int i8) {
        setCompatElevation(getResources().getDimension(i8));
    }

    public void setCompatHoveredFocusedTranslationZ(float f8) {
        getImpl().N(f8);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i8) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i8));
    }

    public void setCompatPressedTranslationZ(float f8) {
        getImpl().R(f8);
    }

    public void setCompatPressedTranslationZResource(int i8) {
        setCompatPressedTranslationZ(getResources().getDimension(i8));
    }

    public void setCustomSize(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i8 != this.f31918z) {
            this.f31918z = i8;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        getImpl().d0(f8);
    }

    public void setEnsureMinTouchTargetSize(boolean z7) {
        if (z7 != getImpl().k()) {
            getImpl().L(z7);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i8) {
        this.f31909G.f(i8);
    }

    public void setHideMotionSpec(f fVar) {
        getImpl().M(fVar);
    }

    public void setHideMotionSpecResource(int i8) {
        setHideMotionSpec(f.c(getContext(), i8));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().b0();
            if (this.f31913u != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i8) {
        this.f31908F.i(i8);
        k();
    }

    public void setMaxImageSize(int i8) {
        this.f31904B = i8;
        getImpl().P(i8);
    }

    public void setRippleColor(int i8) {
        setRippleColor(ColorStateList.valueOf(i8));
    }

    @Override // android.view.View
    public void setScaleX(float f8) {
        super.setScaleX(f8);
        getImpl().F();
    }

    @Override // android.view.View
    public void setScaleY(float f8) {
        super.setScaleY(f8);
        getImpl().F();
    }

    public void setShadowPaddingEnabled(boolean z7) {
        getImpl().T(z7);
    }

    @Override // V3.n
    public void setShapeAppearanceModel(V3.k kVar) {
        getImpl().U(kVar);
    }

    public void setShowMotionSpec(f fVar) {
        getImpl().V(fVar);
    }

    public void setShowMotionSpecResource(int i8) {
        setShowMotionSpec(f.c(getContext(), i8));
    }

    public void setSize(int i8) {
        this.f31918z = 0;
        if (i8 != this.f31917y) {
            this.f31917y = i8;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f31913u != colorStateList) {
            this.f31913u = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f31914v != mode) {
            this.f31914v = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f8) {
        super.setTranslationX(f8);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationY(float f8) {
        super.setTranslationY(f8);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationZ(float f8) {
        super.setTranslationZ(f8);
        getImpl().G();
    }

    public void setUseCompatPadding(boolean z7) {
        if (this.f31905C != z7) {
            this.f31905C = z7;
            getImpl().z();
        }
    }

    @Override // com.google.android.material.internal.p, android.widget.ImageView, android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        private boolean f31919a;

        public BaseBehavior() {
            this.f31919a = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f31906D;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i8 = 0;
            int i9 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i8 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i8 = -rect.top;
            }
            if (i8 != 0) {
                X.Y(floatingActionButton, i8);
            }
            if (i9 != 0) {
                X.X(floatingActionButton, i9);
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.f31919a && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean K(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f31906D;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (!F(view)) {
                return false;
            }
            K(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i8) {
            List r8 = coordinatorLayout.r(floatingActionButton);
            int size = r8.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = (View) r8.get(i9);
                if (F(view) && K(view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.H(floatingActionButton, i8);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f9052h == 0) {
                fVar.f9052h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f1907h2);
            this.f31919a = obtainStyledAttributes.getBoolean(l.f1916i2, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f31902I;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        this.f31906D = new Rect();
        this.f31907E = new Rect();
        Context context2 = getContext();
        TypedArray i10 = com.google.android.material.internal.l.i(context2, attributeSet, l.f1771R1, i8, i9, new int[0]);
        this.f31911s = S3.c.a(context2, i10, l.f1787T1);
        this.f31912t = o.i(i10.getInt(l.f1795U1, -1), null);
        this.f31915w = S3.c.a(context2, i10, l.f1880e2);
        this.f31917y = i10.getInt(l.f1835Z1, -1);
        this.f31918z = i10.getDimensionPixelSize(l.f1827Y1, 0);
        this.f31916x = i10.getDimensionPixelSize(l.f1803V1, 0);
        float dimension = i10.getDimension(l.f1811W1, 0.0f);
        float dimension2 = i10.getDimension(l.f1853b2, 0.0f);
        float dimension3 = i10.getDimension(l.f1871d2, 0.0f);
        this.f31905C = i10.getBoolean(l.f1898g2, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.f1469c0);
        setMaxImageSize(i10.getDimensionPixelSize(l.f1862c2, 0));
        f b8 = f.b(context2, i10, l.f1889f2);
        f b9 = f.b(context2, i10, l.f1844a2);
        V3.k m8 = V3.k.g(context2, attributeSet, i8, i9, V3.k.f5652m).m();
        boolean z7 = i10.getBoolean(l.f1819X1, false);
        setEnabled(i10.getBoolean(l.f1779S1, true));
        i10.recycle();
        C0857q c0857q = new C0857q(this);
        this.f31908F = c0857q;
        c0857q.g(attributeSet, i8);
        this.f31909G = new O3.b(this);
        getImpl().U(m8);
        getImpl().u(this.f31911s, this.f31912t, this.f31915w, this.f31916x);
        getImpl().Q(dimensionPixelSize);
        getImpl().K(dimension);
        getImpl().N(dimension2);
        getImpl().R(dimension3);
        getImpl().V(b8);
        getImpl().M(b9);
        getImpl().L(z7);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f31915w != colorStateList) {
            this.f31915w = colorStateList;
            getImpl().S(this.f31915w);
        }
    }
}
