package com.google.android.material.checkbox;

import D3.e;
import D3.f;
import D3.j;
import D3.k;
import D3.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.app.E;
import androidx.appcompat.widget.C0847g;
import androidx.appcompat.widget.f0;
import androidx.vectordrawable.graphics.drawable.c;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.o;
import g.AbstractC5794a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r0.AbstractC6641a;

/* loaded from: classes2.dex */
public class MaterialCheckBox extends C0847g {

    /* renamed from: P, reason: collision with root package name */
    private static final int f31643P = k.f1626p;

    /* renamed from: Q, reason: collision with root package name */
    private static final int[] f31644Q = {D3.b.f1393Q};

    /* renamed from: R, reason: collision with root package name */
    private static final int[] f31645R;

    /* renamed from: S, reason: collision with root package name */
    private static final int[][] f31646S;

    /* renamed from: T, reason: collision with root package name */
    private static final int f31647T;

    /* renamed from: A, reason: collision with root package name */
    private boolean f31648A;

    /* renamed from: B, reason: collision with root package name */
    private CharSequence f31649B;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f31650C;

    /* renamed from: D, reason: collision with root package name */
    private Drawable f31651D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f31652E;

    /* renamed from: F, reason: collision with root package name */
    ColorStateList f31653F;

    /* renamed from: G, reason: collision with root package name */
    ColorStateList f31654G;

    /* renamed from: H, reason: collision with root package name */
    private PorterDuff.Mode f31655H;

    /* renamed from: I, reason: collision with root package name */
    private int f31656I;

    /* renamed from: J, reason: collision with root package name */
    private int[] f31657J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f31658K;

    /* renamed from: L, reason: collision with root package name */
    private CharSequence f31659L;

    /* renamed from: M, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f31660M;

    /* renamed from: N, reason: collision with root package name */
    private final c f31661N;

    /* renamed from: O, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f31662O;

    /* renamed from: v, reason: collision with root package name */
    private final LinkedHashSet f31663v;

    /* renamed from: w, reason: collision with root package name */
    private final LinkedHashSet f31664w;

    /* renamed from: x, reason: collision with root package name */
    private ColorStateList f31665x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f31666y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f31667z;

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f31653F;
            if (colorStateList != null) {
                AbstractC6641a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f31653F;
            if (colorStateList != null) {
                AbstractC6641a.n(drawable, colorStateList.getColorForState(materialCheckBox.f31657J, MaterialCheckBox.this.f31653F.getDefaultColor()));
            }
        }
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f31669o;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String a() {
            int i8 = this.f31669o;
            return i8 != 1 ? i8 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeValue(Integer.valueOf(this.f31669o));
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f31669o = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i8 = D3.b.f1392P;
        f31645R = new int[]{i8};
        f31646S = new int[][]{new int[]{R.attr.state_enabled, i8}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f31647T = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1405d);
    }

    private boolean c(f0 f0Var) {
        return f0Var.n(l.f1741N3, 0) == f31647T && f0Var.n(l.f1749O3, 0) == 0;
    }

    private void e() {
        this.f31650C = d.c(this.f31650C, this.f31653F, androidx.core.widget.c.c(this));
        this.f31651D = d.c(this.f31651D, this.f31654G, this.f31655H);
        g();
        h();
        super.setButtonDrawable(d.a(this.f31650C, this.f31651D));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f31659L != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        c cVar;
        if (this.f31652E) {
            c cVar2 = this.f31661N;
            if (cVar2 != null) {
                cVar2.g(this.f31662O);
                this.f31661N.c(this.f31662O);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f31650C;
                if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f31661N) == null) {
                    return;
                }
                ((AnimatedStateListDrawable) drawable).addTransition(f.f1531b, f.f1529S, cVar, false);
                ((AnimatedStateListDrawable) this.f31650C).addTransition(f.f1537h, f.f1529S, this.f31661N, false);
            }
        }
    }

    private String getButtonStateDescription() {
        int i8 = this.f31656I;
        return i8 == 1 ? getResources().getString(j.f1595k) : i8 == 0 ? getResources().getString(j.f1597m) : getResources().getString(j.f1596l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f31665x == null) {
            int[][] iArr = f31646S;
            int[] iArr2 = new int[iArr.length];
            int d8 = L3.a.d(this, D3.b.f1407f);
            int d9 = L3.a.d(this, D3.b.f1409h);
            int d10 = L3.a.d(this, D3.b.f1413l);
            int d11 = L3.a.d(this, D3.b.f1410i);
            iArr2[0] = L3.a.j(d10, d9, 1.0f);
            iArr2[1] = L3.a.j(d10, d8, 1.0f);
            iArr2[2] = L3.a.j(d10, d11, 0.54f);
            iArr2[3] = L3.a.j(d10, d11, 0.38f);
            iArr2[4] = L3.a.j(d10, d11, 0.38f);
            this.f31665x = new ColorStateList(iArr, iArr2);
        }
        return this.f31665x;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f31653F;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f31650C;
        if (drawable != null && (colorStateList2 = this.f31653F) != null) {
            AbstractC6641a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f31651D;
        if (drawable2 == null || (colorStateList = this.f31654G) == null) {
            return;
        }
        AbstractC6641a.o(drawable2, colorStateList);
    }

    private void i() {
    }

    public boolean d() {
        return this.f31648A;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f31650C;
    }

    public Drawable getButtonIconDrawable() {
        return this.f31651D;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f31654G;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f31655H;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f31653F;
    }

    public int getCheckedState() {
        return this.f31656I;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f31649B;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f31656I == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f31666y && this.f31653F == null && this.f31654G == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f31644Q);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f31645R);
        }
        this.f31657J = d.e(onCreateDrawableState);
        i();
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a8;
        if (!this.f31667z || !TextUtils.isEmpty(getText()) || (a8 = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a8.getIntrinsicWidth()) / 2) * (o.g(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a8.getBounds();
            AbstractC6641a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f31649B));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f31669o);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f31669o = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.C0847g, android.widget.CompoundButton
    public void setButtonDrawable(int i8) {
        setButtonDrawable(AbstractC5794a.b(getContext(), i8));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f31651D = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i8) {
        setButtonIconDrawable(AbstractC5794a.b(getContext(), i8));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f31654G == colorStateList) {
            return;
        }
        this.f31654G = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f31655H == mode) {
            return;
        }
        this.f31655H = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f31653F == colorStateList) {
            return;
        }
        this.f31653F = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z7) {
        this.f31667z = z7;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        setCheckedState(z7 ? 1 : 0);
    }

    public void setCheckedState(int i8) {
        AutofillManager a8;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f31656I != i8) {
            this.f31656I = i8;
            super.setChecked(i8 == 1);
            refreshDrawableState();
            f();
            if (this.f31658K) {
                return;
            }
            this.f31658K = true;
            LinkedHashSet linkedHashSet = this.f31664w;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    E.a(it.next());
                    throw null;
                }
            }
            if (this.f31656I != 2 && (onCheckedChangeListener = this.f31660M) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (a8 = J3.b.a(getContext().getSystemService(J3.a.a()))) != null) {
                a8.notifyValueChanged(this);
            }
            this.f31658K = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f31649B = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i8) {
        setErrorAccessibilityLabel(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setErrorShown(boolean z7) {
        if (this.f31648A == z7) {
            return;
        }
        this.f31648A = z7;
        refreshDrawableState();
        Iterator it = this.f31663v.iterator();
        if (it.hasNext()) {
            E.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f31660M = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f31659L = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f31666y = z7;
        if (z7) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f31643P;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        this.f31663v = new LinkedHashSet();
        this.f31664w = new LinkedHashSet();
        this.f31661N = c.a(getContext(), e.f1505e);
        this.f31662O = new a();
        Context context2 = getContext();
        this.f31650C = androidx.core.widget.c.a(this);
        this.f31653F = getSuperButtonTintList();
        setSupportButtonTintList(null);
        f0 j8 = com.google.android.material.internal.l.j(context2, attributeSet, l.f1733M3, i8, i9, new int[0]);
        this.f31651D = j8.g(l.f1757P3);
        if (this.f31650C != null && com.google.android.material.internal.l.g(context2) && c(j8)) {
            super.setButtonDrawable((Drawable) null);
            this.f31650C = AbstractC5794a.b(context2, e.f1504d);
            this.f31652E = true;
            if (this.f31651D == null) {
                this.f31651D = AbstractC5794a.b(context2, e.f1506f);
            }
        }
        this.f31654G = S3.c.b(context2, j8, l.f1765Q3);
        this.f31655H = o.i(j8.k(l.f1773R3, -1), PorterDuff.Mode.SRC_IN);
        this.f31666y = j8.a(l.f1813W3, false);
        this.f31667z = j8.a(l.f1781S3, true);
        this.f31648A = j8.a(l.f1805V3, false);
        this.f31649B = j8.p(l.f1797U3);
        if (j8.s(l.f1789T3)) {
            setCheckedState(j8.k(l.f1789T3, 0));
        }
        j8.x();
        e();
    }

    @Override // androidx.appcompat.widget.C0847g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f31650C = drawable;
        this.f31652E = false;
        e();
    }
}
