package com.google.android.material.button;

import D3.k;
import S3.c;
import V3.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.app.E;
import androidx.appcompat.widget.C0846f;
import androidx.core.widget.h;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import g.AbstractC5794a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r0.AbstractC6641a;
import z0.X;

/* loaded from: classes2.dex */
public class MaterialButton extends C0846f implements Checkable, n {

    /* renamed from: I, reason: collision with root package name */
    private static final int[] f31516I = {R.attr.state_checkable};

    /* renamed from: J, reason: collision with root package name */
    private static final int[] f31517J = {R.attr.state_checked};

    /* renamed from: K, reason: collision with root package name */
    private static final int f31518K = k.f1624n;

    /* renamed from: A, reason: collision with root package name */
    private String f31519A;

    /* renamed from: B, reason: collision with root package name */
    private int f31520B;

    /* renamed from: C, reason: collision with root package name */
    private int f31521C;

    /* renamed from: D, reason: collision with root package name */
    private int f31522D;

    /* renamed from: E, reason: collision with root package name */
    private int f31523E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f31524F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f31525G;

    /* renamed from: H, reason: collision with root package name */
    private int f31526H;

    /* renamed from: u, reason: collision with root package name */
    private final com.google.android.material.button.a f31527u;

    /* renamed from: v, reason: collision with root package name */
    private final LinkedHashSet f31528v;

    /* renamed from: w, reason: collision with root package name */
    private a f31529w;

    /* renamed from: x, reason: collision with root package name */
    private PorterDuff.Mode f31530x;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f31531y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f31532z;

    interface a {
        void a(MaterialButton materialButton, boolean z7);
    }

    static class b extends F0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        boolean f31533t;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f31533t = parcel.readInt() == 1;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f31533t ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1421t);
    }

    private boolean b() {
        int i8 = this.f31526H;
        return i8 == 3 || i8 == 4;
    }

    private boolean c() {
        int i8 = this.f31526H;
        return i8 == 1 || i8 == 2;
    }

    private boolean d() {
        int i8 = this.f31526H;
        return i8 == 16 || i8 == 32;
    }

    private boolean e() {
        return X.z(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f31527u;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            h.j(this, this.f31532z, null, null, null);
        } else if (b()) {
            h.j(this, null, null, this.f31532z, null);
        } else if (d()) {
            h.j(this, null, this.f31532z, null, null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f8 = 0.0f;
        for (int i8 = 0; i8 < lineCount; i8++) {
            f8 = Math.max(f8, getLayout().getLineWidth(i8));
        }
        return (int) Math.ceil(f8);
    }

    private void h(boolean z7) {
        Drawable drawable = this.f31532z;
        if (drawable != null) {
            Drawable mutate = AbstractC6641a.r(drawable).mutate();
            this.f31532z = mutate;
            AbstractC6641a.o(mutate, this.f31531y);
            PorterDuff.Mode mode = this.f31530x;
            if (mode != null) {
                AbstractC6641a.p(this.f31532z, mode);
            }
            int i8 = this.f31520B;
            if (i8 == 0) {
                i8 = this.f31532z.getIntrinsicWidth();
            }
            int i9 = this.f31520B;
            if (i9 == 0) {
                i9 = this.f31532z.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f31532z;
            int i10 = this.f31521C;
            int i11 = this.f31522D;
            drawable2.setBounds(i10, i11, i8 + i10, i9 + i11);
            this.f31532z.setVisible(true, z7);
        }
        if (z7) {
            g();
            return;
        }
        Drawable[] a8 = h.a(this);
        Drawable drawable3 = a8[0];
        Drawable drawable4 = a8[1];
        Drawable drawable5 = a8[2];
        if ((!c() || drawable3 == this.f31532z) && ((!b() || drawable5 == this.f31532z) && (!d() || drawable4 == this.f31532z))) {
            return;
        }
        g();
    }

    private void i(int i8, int i9) {
        if (this.f31532z == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f31521C = 0;
                if (this.f31526H == 16) {
                    this.f31522D = 0;
                    h(false);
                    return;
                }
                int i10 = this.f31520B;
                if (i10 == 0) {
                    i10 = this.f31532z.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i9 - getTextHeight()) - getPaddingTop()) - i10) - this.f31523E) - getPaddingBottom()) / 2);
                if (this.f31522D != max) {
                    this.f31522D = max;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f31522D = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i11 = this.f31526H;
        if (i11 == 1 || i11 == 3 || ((i11 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i11 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f31521C = 0;
            h(false);
            return;
        }
        int i12 = this.f31520B;
        if (i12 == 0) {
            i12 = this.f31532z.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i8 - getTextLayoutWidth()) - X.D(this)) - i12) - this.f31523E) - X.E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f31526H == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f31521C != textLayoutWidth) {
            this.f31521C = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f31527u;
        return aVar != null && aVar.p();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f31519A)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f31519A;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f31527u.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f31532z;
    }

    public int getIconGravity() {
        return this.f31526H;
    }

    public int getIconPadding() {
        return this.f31523E;
    }

    public int getIconSize() {
        return this.f31520B;
    }

    public ColorStateList getIconTint() {
        return this.f31531y;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f31530x;
    }

    public int getInsetBottom() {
        return this.f31527u.c();
    }

    public int getInsetTop() {
        return this.f31527u.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f31527u.h();
        }
        return null;
    }

    public V3.k getShapeAppearanceModel() {
        if (f()) {
            return this.f31527u.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f31527u.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f31527u.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0846f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f31527u.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0846f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f31527u.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f31524F;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            V3.h.f(this, this.f31527u.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f31516I);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f31517J);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0846f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0846f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0846f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f31533t);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f31533t = this.f31524F;
        return bVar;
    }

    @Override // androidx.appcompat.widget.C0846f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f31527u.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f31532z != null) {
            if (this.f31532z.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    void setA11yClassName(String str) {
        this.f31519A = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        if (f()) {
            this.f31527u.s(i8);
        } else {
            super.setBackgroundColor(i8);
        }
    }

    @Override // androidx.appcompat.widget.C0846f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f31527u.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C0846f, android.view.View
    public void setBackgroundResource(int i8) {
        setBackgroundDrawable(i8 != 0 ? AbstractC5794a.b(getContext(), i8) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z7) {
        if (f()) {
            this.f31527u.u(z7);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        if (a() && isEnabled() && this.f31524F != z7) {
            this.f31524F = z7;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f31524F);
            }
            if (this.f31525G) {
                return;
            }
            this.f31525G = true;
            Iterator it = this.f31528v.iterator();
            if (it.hasNext()) {
                E.a(it.next());
                throw null;
            }
            this.f31525G = false;
        }
    }

    public void setCornerRadius(int i8) {
        if (f()) {
            this.f31527u.v(i8);
        }
    }

    public void setCornerRadiusResource(int i8) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i8));
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        if (f()) {
            this.f31527u.f().T(f8);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f31532z != drawable) {
            this.f31532z = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i8) {
        if (this.f31526H != i8) {
            this.f31526H = i8;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i8) {
        if (this.f31523E != i8) {
            this.f31523E = i8;
            setCompoundDrawablePadding(i8);
        }
    }

    public void setIconResource(int i8) {
        setIcon(i8 != 0 ? AbstractC5794a.b(getContext(), i8) : null);
    }

    public void setIconSize(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f31520B != i8) {
            this.f31520B = i8;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f31531y != colorStateList) {
            this.f31531y = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f31530x != mode) {
            this.f31530x = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i8) {
        setIconTint(AbstractC5794a.a(getContext(), i8));
    }

    public void setInsetBottom(int i8) {
        this.f31527u.w(i8);
    }

    public void setInsetTop(int i8) {
        this.f31527u.x(i8);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(a aVar) {
        this.f31529w = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z7) {
        a aVar = this.f31529w;
        if (aVar != null) {
            aVar.a(this, z7);
        }
        super.setPressed(z7);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f31527u.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i8) {
        if (f()) {
            setRippleColor(AbstractC5794a.a(getContext(), i8));
        }
    }

    @Override // V3.n
    public void setShapeAppearanceModel(V3.k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f31527u.z(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z7) {
        if (f()) {
            this.f31527u.A(z7);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f31527u.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i8) {
        if (f()) {
            setStrokeColor(AbstractC5794a.a(getContext(), i8));
        }
    }

    public void setStrokeWidth(int i8) {
        if (f()) {
            this.f31527u.C(i8);
        }
    }

    public void setStrokeWidthResource(int i8) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i8));
        }
    }

    @Override // androidx.appcompat.widget.C0846f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f31527u.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0846f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f31527u.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i8) {
        super.setTextAlignment(i8);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z7) {
        this.f31527u.F(z7);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f31524F);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f31518K;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        this.f31528v = new LinkedHashSet();
        this.f31524F = false;
        this.f31525G = false;
        Context context2 = getContext();
        TypedArray i10 = l.i(context2, attributeSet, D3.l.f1764Q2, i8, i9, new int[0]);
        this.f31523E = i10.getDimensionPixelSize(D3.l.f1872d3, 0);
        this.f31530x = o.i(i10.getInt(D3.l.f1899g3, -1), PorterDuff.Mode.SRC_IN);
        this.f31531y = c.a(getContext(), i10, D3.l.f1890f3);
        this.f31532z = c.d(getContext(), i10, D3.l.f1854b3);
        this.f31526H = i10.getInteger(D3.l.f1863c3, 1);
        this.f31520B = i10.getDimensionPixelSize(D3.l.f1881e3, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, V3.k.e(context2, attributeSet, i8, i9).m());
        this.f31527u = aVar;
        aVar.r(i10);
        i10.recycle();
        setCompoundDrawablePadding(this.f31523E);
        h(this.f31532z != null);
    }
}
