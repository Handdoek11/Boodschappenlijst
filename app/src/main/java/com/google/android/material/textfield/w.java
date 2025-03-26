package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0844d;
import androidx.appcompat.widget.T;
import java.util.List;
import r0.AbstractC6641a;
import z0.X;

/* loaded from: classes2.dex */
public class w extends C0844d {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f32582A;

    /* renamed from: B, reason: collision with root package name */
    private int f32583B;

    /* renamed from: C, reason: collision with root package name */
    private ColorStateList f32584C;

    /* renamed from: v, reason: collision with root package name */
    private final T f32585v;

    /* renamed from: w, reason: collision with root package name */
    private final AccessibilityManager f32586w;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f32587x;

    /* renamed from: y, reason: collision with root package name */
    private final int f32588y;

    /* renamed from: z, reason: collision with root package name */
    private final float f32589z;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
            w wVar = w.this;
            w.this.l(i8 < 0 ? wVar.f32585v.v() : wVar.getAdapter().getItem(i8));
            AdapterView.OnItemClickListener onItemClickListener = w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i8 < 0) {
                    view = w.this.f32585v.y();
                    i8 = w.this.f32585v.x();
                    j8 = w.this.f32585v.w();
                }
                onItemClickListener.onItemClick(w.this.f32585v.j(), view, i8, j8);
            }
            w.this.f32585v.dismiss();
        }
    }

    private class b extends ArrayAdapter {

        /* renamed from: o, reason: collision with root package name */
        private ColorStateList f32591o;

        /* renamed from: s, reason: collision with root package name */
        private ColorStateList f32592s;

        b(Context context, int i8, String[] strArr) {
            super(context, i8, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{L3.a.i(w.this.f32583B, w.this.f32584C.getColorForState(iArr2, 0)), L3.a.i(w.this.f32583B, w.this.f32584C.getColorForState(iArr, 0)), w.this.f32583B});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(w.this.f32583B);
            if (this.f32592s == null) {
                return colorDrawable;
            }
            AbstractC6641a.o(colorDrawable, this.f32591o);
            return new RippleDrawable(this.f32592s, colorDrawable, null);
        }

        private boolean c() {
            return w.this.f32583B != 0;
        }

        private boolean d() {
            return w.this.f32584C != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{w.this.f32584C.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f32592s = e();
            this.f32591o = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i8, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                X.r0(textView, w.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1402a);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f32586w;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f32586w.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f32586w;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f8 = f();
        int i8 = 0;
        if (adapter == null || f8 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f32585v.x()) + 15);
        View view = null;
        int i9 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(max, view, f8);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i9 = Math.max(i9, view.getMeasuredWidth());
        }
        Drawable i10 = this.f32585v.i();
        if (i10 != null) {
            i10.getPadding(this.f32587x);
            Rect rect = this.f32587x;
            i9 += rect.left + rect.right;
        }
        return i9 + f8.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout f8 = f();
        if (f8 != null) {
            f8.r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f32585v.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f32582A;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout f8 = f();
        return (f8 == null || !f8.R()) ? super.getHint() : f8.getHint();
    }

    public float getPopupElevation() {
        return this.f32589z;
    }

    public int getSimpleItemSelectedColor() {
        return this.f32583B;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f32584C;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f8 = f();
        if (f8 != null && f8.R() && super.getHint() == null && com.google.android.material.internal.e.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32585v.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i8)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z7) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z7);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t7) {
        super.setAdapter(t7);
        this.f32585v.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        T t7 = this.f32585v;
        if (t7 != null) {
            t7.c(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i8) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i8));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f32582A = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof V3.g) {
            ((V3.g) dropDownBackground).U(this.f32582A);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f32585v.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i8) {
        super.setRawInputType(i8);
        k();
    }

    public void setSimpleItemSelectedColor(int i8) {
        this.f32583B = i8;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f32584C = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i8) {
        setSimpleItems(getResources().getStringArray(i8));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f32585v.b();
        } else {
            super.showDropDown();
        }
    }

    public w(Context context, AttributeSet attributeSet, int i8) {
        super(Z3.a.c(context, attributeSet, i8, 0), attributeSet, i8);
        this.f32587x = new Rect();
        Context context2 = getContext();
        TypedArray i9 = com.google.android.material.internal.l.i(context2, attributeSet, D3.l.f1700I2, i8, D3.k.f1615e, new int[0]);
        if (i9.hasValue(D3.l.f1708J2) && i9.getInt(D3.l.f1708J2, 0) == 0) {
            setKeyListener(null);
        }
        this.f32588y = i9.getResourceId(D3.l.f1732M2, D3.h.f1571n);
        this.f32589z = i9.getDimensionPixelOffset(D3.l.f1716K2, D3.d.f1465a0);
        if (i9.hasValue(D3.l.f1724L2)) {
            this.f32582A = ColorStateList.valueOf(i9.getColor(D3.l.f1724L2, 0));
        }
        this.f32583B = i9.getColor(D3.l.f1740N2, 0);
        this.f32584C = S3.c.a(context2, i9, D3.l.f1748O2);
        this.f32586w = (AccessibilityManager) context2.getSystemService("accessibility");
        T t7 = new T(context2);
        this.f32585v = t7;
        t7.J(true);
        t7.D(this);
        t7.I(2);
        t7.p(getAdapter());
        t7.L(new a());
        if (i9.hasValue(D3.l.f1756P2)) {
            setSimpleItems(i9.getResourceId(D3.l.f1756P2, 0));
        }
        i9.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f32588y, strArr));
    }
}
