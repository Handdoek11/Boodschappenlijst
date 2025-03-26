package com.google.android.material.chip;

import A0.z;
import D3.j;
import D3.k;
import S3.d;
import S3.f;
import V3.h;
import V3.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0847g;
import com.google.android.material.chip.a;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import java.util.List;
import z0.X;

/* loaded from: classes2.dex */
public class Chip extends C0847g implements a.InterfaceC0232a, n, Checkable {

    /* renamed from: N, reason: collision with root package name */
    private static final int f31670N = k.f1625o;

    /* renamed from: O, reason: collision with root package name */
    private static final Rect f31671O = new Rect();

    /* renamed from: P, reason: collision with root package name */
    private static final int[] f31672P = {R.attr.state_selected};

    /* renamed from: Q, reason: collision with root package name */
    private static final int[] f31673Q = {R.attr.state_checkable};

    /* renamed from: A, reason: collision with root package name */
    private boolean f31674A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f31675B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f31676C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f31677D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f31678E;

    /* renamed from: F, reason: collision with root package name */
    private int f31679F;

    /* renamed from: G, reason: collision with root package name */
    private int f31680G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f31681H;

    /* renamed from: I, reason: collision with root package name */
    private final c f31682I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f31683J;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f31684K;

    /* renamed from: L, reason: collision with root package name */
    private final RectF f31685L;

    /* renamed from: M, reason: collision with root package name */
    private final f f31686M;

    /* renamed from: v, reason: collision with root package name */
    private com.google.android.material.chip.a f31687v;

    /* renamed from: w, reason: collision with root package name */
    private InsetDrawable f31688w;

    /* renamed from: x, reason: collision with root package name */
    private RippleDrawable f31689x;

    /* renamed from: y, reason: collision with root package name */
    private View.OnClickListener f31690y;

    /* renamed from: z, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f31691z;

    class a extends f {
        a() {
        }

        @Override // S3.f
        public void a(int i8) {
        }

        @Override // S3.f
        public void b(Typeface typeface, boolean z7) {
            Chip chip = Chip.this;
            chip.setText(chip.f31687v.H2() ? Chip.this.f31687v.c1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f31687v != null) {
                Chip.this.f31687v.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends G0.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // G0.a
        protected int F(float f8, float f9) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f8, f9)) ? 1 : 0;
        }

        @Override // G0.a
        protected void G(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f31690y != null) {
                list.add(1);
            }
        }

        @Override // G0.a
        protected boolean N(int i8, int i9, Bundle bundle) {
            if (i9 != 16) {
                return false;
            }
            if (i8 == 0) {
                return Chip.this.performClick();
            }
            if (i8 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override // G0.a
        protected void Q(z zVar) {
            zVar.i0(Chip.this.r());
            zVar.l0(Chip.this.isClickable());
            zVar.k0(Chip.this.getAccessibilityClassName());
            zVar.I0(Chip.this.getText());
        }

        @Override // G0.a
        protected void R(int i8, z zVar) {
            if (i8 != 1) {
                zVar.o0("");
                zVar.g0(Chip.f31671O);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                zVar.o0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                zVar.o0(Chip.this.getContext().getString(j.f1598n, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            zVar.g0(Chip.this.getCloseIconTouchBoundsInt());
            zVar.b(z.a.f38i);
            zVar.q0(Chip.this.isEnabled());
        }

        @Override // G0.a
        protected void S(int i8, boolean z7) {
            if (i8 == 1) {
                Chip.this.f31677D = z7;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1406e);
    }

    private void A() {
        this.f31689x = new RippleDrawable(T3.b.d(this.f31687v.a1()), getBackgroundDrawable(), null);
        this.f31687v.G2(false);
        X.r0(this, this.f31689x);
        B();
    }

    private void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f31687v) == null) {
            return;
        }
        int E02 = (int) (aVar.E0() + this.f31687v.e1() + this.f31687v.l0());
        int J02 = (int) (this.f31687v.J0() + this.f31687v.f1() + this.f31687v.h0());
        if (this.f31688w != null) {
            Rect rect = new Rect();
            this.f31688w.getPadding(rect);
            J02 += rect.left;
            E02 += rect.right;
        }
        X.B0(this, J02, getPaddingTop(), E02, getPaddingBottom());
    }

    private void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f31686M);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f31685L.setEmpty();
        if (n() && this.f31690y != null) {
            this.f31687v.T0(this.f31685L);
        }
        return this.f31685L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f31684K.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f31684K;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    private void j(com.google.android.material.chip.a aVar) {
        aVar.k2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] k() {
        ?? isEnabled = isEnabled();
        int i8 = isEnabled;
        if (this.f31677D) {
            i8 = isEnabled + 1;
        }
        int i9 = i8;
        if (this.f31676C) {
            i9 = i8 + 1;
        }
        int i10 = i9;
        if (this.f31675B) {
            i10 = i9 + 1;
        }
        int i11 = i10;
        if (isChecked()) {
            i11 = i10 + 1;
        }
        int[] iArr = new int[i11];
        int i12 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i12 = 1;
        }
        if (this.f31677D) {
            iArr[i12] = 16842908;
            i12++;
        }
        if (this.f31676C) {
            iArr[i12] = 16843623;
            i12++;
        }
        if (this.f31675B) {
            iArr[i12] = 16842919;
            i12++;
        }
        if (isChecked()) {
            iArr[i12] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f31688w && this.f31687v.getCallback() == null) {
            this.f31687v.setCallback(this.f31688w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f31687v;
        return (aVar == null || aVar.M0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i8) {
        TypedArray i9 = l.i(context, attributeSet, D3.l.f1650C0, i8, f31670N, new int[0]);
        this.f31678E = i9.getBoolean(D3.l.f1915i1, false);
        this.f31680G = (int) Math.ceil(i9.getDimension(D3.l.f1810W0, (float) Math.ceil(o.c(getContext(), 48))));
        i9.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i8, int i9, int i10, int i11) {
        this.f31688w = new InsetDrawable((Drawable) this.f31687v, i8, i9, i10, i11);
    }

    private void setCloseIconHovered(boolean z7) {
        if (this.f31676C != z7) {
            this.f31676C = z7;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z7) {
        if (this.f31675B != z7) {
            this.f31675B = z7;
            refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(CompoundButton compoundButton, boolean z7) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f31691z;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z7);
        }
    }

    private void v() {
        if (this.f31688w != null) {
            this.f31688w = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.k2(null);
        }
    }

    private void y() {
        if (n() && s() && this.f31690y != null) {
            X.n0(this, this.f31682I);
            this.f31683J = true;
        } else {
            X.n0(this, null);
            this.f31683J = false;
        }
    }

    private void z() {
        if (T3.b.f5184a) {
            A();
            return;
        }
        this.f31687v.G2(true);
        X.r0(this, getBackgroundDrawable());
        B();
        m();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0232a
    public void a() {
        l(this.f31680G);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f31683J ? super.dispatchHoverEvent(motionEvent) : this.f31682I.z(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f31683J) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f31682I.A(keyEvent) || this.f31682I.E() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C0847g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f31687v;
        if ((aVar == null || !aVar.k1()) ? false : this.f31687v.g2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f31681H)) {
            return this.f31681H;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f31688w;
        return insetDrawable == null ? this.f31687v : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.A0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return Math.max(0.0f, aVar.D0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f31687v;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.E0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.G0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f31683J && (this.f31682I.E() == 1 || this.f31682I.B() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public E3.f getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public V3.k getShapeAppearanceModel() {
        return this.f31687v.A();
    }

    public E3.f getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public boolean l(int i8) {
        this.f31680G = i8;
        if (!w()) {
            if (this.f31688w != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int max = Math.max(0, i8 - this.f31687v.getIntrinsicHeight());
        int max2 = Math.max(0, i8 - this.f31687v.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f31688w != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i9 = max2 > 0 ? max2 / 2 : 0;
        int i10 = max > 0 ? max / 2 : 0;
        if (this.f31688w != null) {
            Rect rect = new Rect();
            this.f31688w.getPadding(rect);
            if (rect.top == i10 && rect.bottom == i10 && rect.left == i9 && rect.right == i9) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i8) {
            setMinHeight(i8);
        }
        if (getMinWidth() != i8) {
            setMinWidth(i8);
        }
        q(i9, i10, i9, i10);
        z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f31687v);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f31672P);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, f31673Q);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z7, int i8, Rect rect) {
        super.onFocusChanged(z7, i8, rect);
        if (this.f31683J) {
            this.f31682I.M(z7, i8, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i8) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i8);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        if (this.f31679F != i8) {
            this.f31679F = i8;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f31675B
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f31675B
            if (r0 == 0) goto L35
            r5.u()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f31687v;
        return aVar != null && aVar.j1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f31687v;
        return aVar != null && aVar.l1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f31681H = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f31689x) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0847g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f31689x) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0847g, android.view.View
    public void setBackgroundResource(int i8) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z7) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.s1(z7);
        }
    }

    public void setCheckableResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.t1(i8);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar == null) {
            this.f31674A = z7;
        } else if (aVar.j1()) {
            super.setChecked(z7);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.u1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z7) {
        setCheckedIconVisible(z7);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i8) {
        setCheckedIconVisible(i8);
    }

    public void setCheckedIconResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.v1(i8);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.w1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.x1(i8);
        }
    }

    public void setCheckedIconVisible(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.y1(i8);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.A1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.B1(i8);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.C1(f8);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.D1(i8);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f31687v;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f31687v = aVar;
            aVar.v2(false);
            j(this.f31687v);
            l(this.f31680G);
        }
    }

    public void setChipEndPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.E1(f8);
        }
    }

    public void setChipEndPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.F1(i8);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.G1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z7) {
        setChipIconVisible(z7);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i8) {
        setChipIconVisible(i8);
    }

    public void setChipIconResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.H1(i8);
        }
    }

    public void setChipIconSize(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.I1(f8);
        }
    }

    public void setChipIconSizeResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.J1(i8);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.K1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.L1(i8);
        }
    }

    public void setChipIconVisible(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.M1(i8);
        }
    }

    public void setChipMinHeight(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.O1(f8);
        }
    }

    public void setChipMinHeightResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.P1(i8);
        }
    }

    public void setChipStartPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.Q1(f8);
        }
    }

    public void setChipStartPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.R1(i8);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.S1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.T1(i8);
        }
    }

    public void setChipStrokeWidth(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.U1(f8);
        }
    }

    public void setChipStrokeWidthResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.V1(i8);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i8) {
        setText(getResources().getString(i8));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.X1(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.Y1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z7) {
        setCloseIconVisible(z7);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i8) {
        setCloseIconVisible(i8);
    }

    public void setCloseIconEndPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.Z1(f8);
        }
    }

    public void setCloseIconEndPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.a2(i8);
        }
    }

    public void setCloseIconResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.b2(i8);
        }
        y();
    }

    public void setCloseIconSize(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.c2(f8);
        }
    }

    public void setCloseIconSizeResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.d2(i8);
        }
    }

    public void setCloseIconStartPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.e2(f8);
        }
    }

    public void setCloseIconStartPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.f2(i8);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.h2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.i2(i8);
        }
    }

    public void setCloseIconVisible(int i8) {
        setCloseIconVisible(getResources().getBoolean(i8));
    }

    @Override // androidx.appcompat.widget.C0847g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C0847g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i8, i9, i10, i11);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i8, i9, i10, i11);
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.T(f8);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f31687v == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.l2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z7) {
        this.f31678E = z7;
        l(this.f31680G);
    }

    @Override // android.widget.TextView
    public void setGravity(int i8) {
        if (i8 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i8);
        }
    }

    public void setHideMotionSpec(E3.f fVar) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.m2(fVar);
        }
    }

    public void setHideMotionSpecResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.n2(i8);
        }
    }

    public void setIconEndPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.o2(f8);
        }
    }

    public void setIconEndPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.p2(i8);
        }
    }

    public void setIconStartPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.q2(f8);
        }
    }

    public void setIconStartPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.r2(i8);
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.f fVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i8) {
        if (this.f31687v == null) {
            return;
        }
        super.setLayoutDirection(i8);
    }

    @Override // android.widget.TextView
    public void setLines(int i8) {
        if (i8 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i8);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i8) {
        if (i8 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i8);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i8) {
        super.setMaxWidth(i8);
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.s2(i8);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i8) {
        if (i8 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i8);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f31691z = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f31690y = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.t2(colorStateList);
        }
        if (this.f31687v.h1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.u2(i8);
            if (this.f31687v.h1()) {
                return;
            }
            A();
        }
    }

    @Override // V3.n
    public void setShapeAppearanceModel(V3.k kVar) {
        this.f31687v.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(E3.f fVar) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.w2(fVar);
        }
    }

    public void setShowMotionSpecResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.x2(i8);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z7) {
        if (!z7) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z7);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.H2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f31687v;
        if (aVar2 != null) {
            aVar2.y2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.z2(dVar);
        }
        C();
    }

    public void setTextAppearanceResource(int i8) {
        setTextAppearance(getContext(), i8);
    }

    public void setTextEndPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.B2(f8);
        }
    }

    public void setTextEndPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.C2(i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i8, float f8) {
        super.setTextSize(i8, f8);
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.D2(TypedValue.applyDimension(i8, f8, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.E2(f8);
        }
    }

    public void setTextStartPaddingResource(int i8) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.F2(i8);
        }
    }

    public boolean u() {
        boolean z7 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f31690y;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z7 = true;
        }
        if (this.f31683J) {
            this.f31682I.Y(1, 1);
        }
        return z7;
    }

    public boolean w() {
        return this.f31678E;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f31670N;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        this.f31684K = new Rect();
        this.f31685L = new RectF();
        this.f31686M = new a();
        Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a q02 = com.google.android.material.chip.a.q0(context2, attributeSet, i8, i9);
        o(context2, attributeSet, i8);
        setChipDrawable(q02);
        q02.T(X.u(this));
        TypedArray i10 = l.i(context2, attributeSet, D3.l.f1650C0, i8, i9, new int[0]);
        boolean hasValue = i10.hasValue(D3.l.f1960n1);
        i10.recycle();
        this.f31682I = new c(this);
        y();
        if (!hasValue) {
            p();
        }
        setChecked(this.f31674A);
        setText(q02.c1());
        setEllipsize(q02.W0());
        C();
        if (!this.f31687v.H2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.f31680G);
        }
        this.f31679F = X.z(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: K3.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                this.f3622a.t(compoundButton, z7);
            }
        });
    }

    public void setCloseIconVisible(boolean z7) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.j2(z7);
        }
        y();
    }

    public void setCheckedIconVisible(boolean z7) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.z1(z7);
        }
    }

    public void setChipIconVisible(boolean z7) {
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.N1(z7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.A2(i8);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i8) {
        super.setTextAppearance(i8);
        com.google.android.material.chip.a aVar = this.f31687v;
        if (aVar != null) {
            aVar.A2(i8);
        }
        C();
    }
}
