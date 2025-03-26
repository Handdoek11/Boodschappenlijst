package com.google.android.material.textfield;

import V3.k;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0851k;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.f0;
import androidx.transition.C0937c;
import com.google.android.material.internal.CheckableImageButton;
import g.AbstractC5794a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0.AbstractC6278a;
import r0.AbstractC6641a;
import x0.C6897a;
import z0.AbstractC7054v;
import z0.C7013a;
import z0.X;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: T0, reason: collision with root package name */
    private static final int f32386T0 = D3.k.f1620j;

    /* renamed from: U0, reason: collision with root package name */
    private static final int[][] f32387U0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    private final v f32388A;

    /* renamed from: A0, reason: collision with root package name */
    private ColorStateList f32389A0;

    /* renamed from: B, reason: collision with root package name */
    boolean f32390B;

    /* renamed from: B0, reason: collision with root package name */
    private int f32391B0;

    /* renamed from: C, reason: collision with root package name */
    private int f32392C;

    /* renamed from: C0, reason: collision with root package name */
    private int f32393C0;

    /* renamed from: D, reason: collision with root package name */
    private boolean f32394D;

    /* renamed from: D0, reason: collision with root package name */
    private int f32395D0;

    /* renamed from: E, reason: collision with root package name */
    private e f32396E;

    /* renamed from: E0, reason: collision with root package name */
    private ColorStateList f32397E0;

    /* renamed from: F, reason: collision with root package name */
    private TextView f32398F;

    /* renamed from: F0, reason: collision with root package name */
    private int f32399F0;

    /* renamed from: G, reason: collision with root package name */
    private int f32400G;

    /* renamed from: G0, reason: collision with root package name */
    private int f32401G0;

    /* renamed from: H, reason: collision with root package name */
    private int f32402H;

    /* renamed from: H0, reason: collision with root package name */
    private int f32403H0;

    /* renamed from: I, reason: collision with root package name */
    private CharSequence f32404I;

    /* renamed from: I0, reason: collision with root package name */
    private int f32405I0;

    /* renamed from: J, reason: collision with root package name */
    private boolean f32406J;

    /* renamed from: J0, reason: collision with root package name */
    private int f32407J0;

    /* renamed from: K, reason: collision with root package name */
    private TextView f32408K;

    /* renamed from: K0, reason: collision with root package name */
    int f32409K0;

    /* renamed from: L, reason: collision with root package name */
    private ColorStateList f32410L;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f32411L0;

    /* renamed from: M, reason: collision with root package name */
    private int f32412M;

    /* renamed from: M0, reason: collision with root package name */
    final com.google.android.material.internal.a f32413M0;

    /* renamed from: N, reason: collision with root package name */
    private C0937c f32414N;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f32415N0;

    /* renamed from: O, reason: collision with root package name */
    private C0937c f32416O;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f32417O0;

    /* renamed from: P, reason: collision with root package name */
    private ColorStateList f32418P;

    /* renamed from: P0, reason: collision with root package name */
    private ValueAnimator f32419P0;

    /* renamed from: Q, reason: collision with root package name */
    private ColorStateList f32420Q;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f32421Q0;

    /* renamed from: R, reason: collision with root package name */
    private ColorStateList f32422R;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f32423R0;

    /* renamed from: S, reason: collision with root package name */
    private ColorStateList f32424S;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f32425S0;

    /* renamed from: T, reason: collision with root package name */
    private boolean f32426T;

    /* renamed from: U, reason: collision with root package name */
    private CharSequence f32427U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f32428V;

    /* renamed from: W, reason: collision with root package name */
    private V3.g f32429W;

    /* renamed from: a0, reason: collision with root package name */
    private V3.g f32430a0;

    /* renamed from: b0, reason: collision with root package name */
    private StateListDrawable f32431b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f32432c0;

    /* renamed from: d0, reason: collision with root package name */
    private V3.g f32433d0;

    /* renamed from: e0, reason: collision with root package name */
    private V3.g f32434e0;

    /* renamed from: f0, reason: collision with root package name */
    private V3.k f32435f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f32436g0;

    /* renamed from: h0, reason: collision with root package name */
    private final int f32437h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f32438i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f32439j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f32440k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f32441l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f32442m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f32443n0;

    /* renamed from: o, reason: collision with root package name */
    private final FrameLayout f32444o;

    /* renamed from: o0, reason: collision with root package name */
    private int f32445o0;

    /* renamed from: p0, reason: collision with root package name */
    private final Rect f32446p0;

    /* renamed from: q0, reason: collision with root package name */
    private final Rect f32447q0;

    /* renamed from: r0, reason: collision with root package name */
    private final RectF f32448r0;

    /* renamed from: s, reason: collision with root package name */
    private final A f32449s;

    /* renamed from: s0, reason: collision with root package name */
    private Typeface f32450s0;

    /* renamed from: t, reason: collision with root package name */
    private final s f32451t;

    /* renamed from: t0, reason: collision with root package name */
    private Drawable f32452t0;

    /* renamed from: u, reason: collision with root package name */
    EditText f32453u;

    /* renamed from: u0, reason: collision with root package name */
    private int f32454u0;

    /* renamed from: v, reason: collision with root package name */
    private CharSequence f32455v;

    /* renamed from: v0, reason: collision with root package name */
    private final LinkedHashSet f32456v0;

    /* renamed from: w, reason: collision with root package name */
    private int f32457w;

    /* renamed from: w0, reason: collision with root package name */
    private Drawable f32458w0;

    /* renamed from: x, reason: collision with root package name */
    private int f32459x;

    /* renamed from: x0, reason: collision with root package name */
    private int f32460x0;

    /* renamed from: y, reason: collision with root package name */
    private int f32461y;

    /* renamed from: y0, reason: collision with root package name */
    private Drawable f32462y0;

    /* renamed from: z, reason: collision with root package name */
    private int f32463z;

    /* renamed from: z0, reason: collision with root package name */
    private ColorStateList f32464z0;

    class a implements TextWatcher {

        /* renamed from: o, reason: collision with root package name */
        int f32465o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ EditText f32466s;

        a(EditText editText) {
            this.f32466s = editText;
            this.f32465o = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.u0(!r0.f32423R0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f32390B) {
                textInputLayout.k0(editable);
            }
            if (TextInputLayout.this.f32406J) {
                TextInputLayout.this.y0(editable);
            }
            int lineCount = this.f32466s.getLineCount();
            int i8 = this.f32465o;
            if (lineCount != i8) {
                if (lineCount < i8) {
                    int A7 = X.A(this.f32466s);
                    int i9 = TextInputLayout.this.f32409K0;
                    if (A7 != i9) {
                        this.f32466s.setMinimumHeight(i9);
                    }
                }
                this.f32465o = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f32451t.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f32413M0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C7013a {

        /* renamed from: u, reason: collision with root package name */
        private final TextInputLayout f32470u;

        public d(TextInputLayout textInputLayout) {
            this.f32470u = textInputLayout;
        }

        @Override // z0.C7013a
        public void k(View view, A0.z zVar) {
            super.k(view, zVar);
            EditText editText = this.f32470u.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f32470u.getHint();
            CharSequence error = this.f32470u.getError();
            CharSequence placeholderText = this.f32470u.getPlaceholderText();
            int counterMaxLength = this.f32470u.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f32470u.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean P7 = this.f32470u.P();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z7 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String charSequence = !isEmpty2 ? hint.toString() : "";
            this.f32470u.f32449s.A(zVar);
            if (!isEmpty) {
                zVar.I0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                zVar.I0(charSequence);
                if (!P7 && placeholderText != null) {
                    zVar.I0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                zVar.I0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    zVar.v0(charSequence);
                } else {
                    if (!isEmpty) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    zVar.I0(charSequence);
                }
                zVar.F0(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            zVar.x0(counterMaxLength);
            if (z7) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                zVar.r0(error);
            }
            View t7 = this.f32470u.f32388A.t();
            if (t7 != null) {
                zVar.w0(t7);
            }
            this.f32470u.f32451t.m().o(view, zVar);
        }

        @Override // z0.C7013a
        public void l(View view, AccessibilityEvent accessibilityEvent) {
            super.l(view, accessibilityEvent);
            this.f32470u.f32451t.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    static class g extends F0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        CharSequence f32471t;

        /* renamed from: u, reason: collision with root package name */
        boolean f32472u;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i8) {
                return new g[i8];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f32471t) + "}";
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            TextUtils.writeToParcel(this.f32471t, parcel, i8);
            parcel.writeInt(this.f32472u ? 1 : 0);
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32471t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f32472u = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1399W);
    }

    private C0937c A() {
        C0937c c0937c = new C0937c();
        c0937c.f0(Q3.d.f(getContext(), D3.b.f1379C, 87));
        c0937c.h0(Q3.d.g(getContext(), D3.b.f1385I, E3.a.f2145a));
        return c0937c;
    }

    private boolean B() {
        return this.f32426T && !TextUtils.isEmpty(this.f32427U) && (this.f32429W instanceof AbstractC5473h);
    }

    private void C() {
        Iterator it = this.f32456v0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void D(Canvas canvas) {
        V3.g gVar;
        if (this.f32434e0 == null || (gVar = this.f32433d0) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f32453u.isFocused()) {
            Rect bounds = this.f32434e0.getBounds();
            Rect bounds2 = this.f32433d0.getBounds();
            float x7 = this.f32413M0.x();
            int centerX = bounds2.centerX();
            bounds.left = E3.a.c(centerX, bounds2.left, x7);
            bounds.right = E3.a.c(centerX, bounds2.right, x7);
            this.f32434e0.draw(canvas);
        }
    }

    private void E(Canvas canvas) {
        if (this.f32426T) {
            this.f32413M0.l(canvas);
        }
    }

    private void F(boolean z7) {
        ValueAnimator valueAnimator = this.f32419P0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f32419P0.cancel();
        }
        if (z7 && this.f32417O0) {
            l(0.0f);
        } else {
            this.f32413M0.c0(0.0f);
        }
        if (B() && ((AbstractC5473h) this.f32429W).i0()) {
            y();
        }
        this.f32411L0 = true;
        L();
        this.f32449s.l(true);
        this.f32451t.H(true);
    }

    private V3.g G(boolean z7) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(D3.d.f1473e0);
        float f8 = z7 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f32453u;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(D3.d.f1496v);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(D3.d.f1467b0);
        V3.k m8 = V3.k.a().A(f8).E(f8).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f32453u;
        V3.g m9 = V3.g.m(getContext(), popupElevation, editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null);
        m9.setShapeAppearanceModel(m8);
        m9.W(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m9;
    }

    private static Drawable H(V3.g gVar, int i8, int i9, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{L3.a.j(i9, i8, 0.1f), i8}), gVar, gVar);
    }

    private int I(int i8, boolean z7) {
        return i8 + ((z7 || getPrefixText() == null) ? (!z7 || getSuffixText() == null) ? this.f32453u.getCompoundPaddingLeft() : this.f32451t.y() : this.f32449s.c());
    }

    private int J(int i8, boolean z7) {
        return i8 - ((z7 || getSuffixText() == null) ? (!z7 || getPrefixText() == null) ? this.f32453u.getCompoundPaddingRight() : this.f32449s.c() : this.f32451t.y());
    }

    private static Drawable K(Context context, V3.g gVar, int i8, int[][] iArr) {
        int c8 = L3.a.c(context, D3.b.f1413l, "TextInputLayout");
        V3.g gVar2 = new V3.g(gVar.A());
        int j8 = L3.a.j(i8, c8, 0.1f);
        gVar2.U(new ColorStateList(iArr, new int[]{j8, 0}));
        gVar2.setTint(c8);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{j8, c8});
        V3.g gVar3 = new V3.g(gVar.A());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void L() {
        TextView textView = this.f32408K;
        if (textView == null || !this.f32406J) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.t.a(this.f32444o, this.f32416O);
        this.f32408K.setVisibility(4);
    }

    private boolean Q() {
        return d0() || (this.f32398F != null && this.f32394D);
    }

    private boolean S() {
        return this.f32438i0 == 1 && this.f32453u.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int T(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f32453u.requestLayout();
    }

    private void V() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.f32438i0 != 0) {
            t0();
        }
        b0();
    }

    private void W() {
        if (B()) {
            RectF rectF = this.f32448r0;
            this.f32413M0.o(rectF, this.f32453u.getWidth(), this.f32453u.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f32440k0);
            ((AbstractC5473h) this.f32429W).l0(rectF);
        }
    }

    private void X() {
        if (!B() || this.f32411L0) {
            return;
        }
        y();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z7) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            childAt.setEnabled(z7);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z7);
            }
        }
    }

    private void a0() {
        TextView textView = this.f32408K;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        EditText editText = this.f32453u;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i8 = this.f32438i0;
                if (i8 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i8 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private boolean e0() {
        return (this.f32451t.G() || ((this.f32451t.A() && M()) || this.f32451t.w() != null)) && this.f32451t.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f32449s.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f32408K == null || !this.f32406J || TextUtils.isEmpty(this.f32404I)) {
            return;
        }
        this.f32408K.setText(this.f32404I);
        androidx.transition.t.a(this.f32444o, this.f32414N);
        this.f32408K.setVisibility(0);
        this.f32408K.bringToFront();
        announceForAccessibility(this.f32404I);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f32453u;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.f32429W;
        }
        int d8 = L3.a.d(this.f32453u, D3.b.f1408g);
        int i8 = this.f32438i0;
        if (i8 == 2) {
            return K(getContext(), this.f32429W, d8, f32387U0);
        }
        if (i8 == 1) {
            return H(this.f32429W, this.f32445o0, d8, f32387U0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f32431b0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f32431b0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f32431b0.addState(new int[0], G(false));
        }
        return this.f32431b0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f32430a0 == null) {
            this.f32430a0 = G(true);
        }
        return this.f32430a0;
    }

    private void h0() {
        if (this.f32438i0 == 1) {
            if (S3.c.i(getContext())) {
                this.f32439j0 = getResources().getDimensionPixelSize(D3.d.f1443F);
            } else if (S3.c.h(getContext())) {
                this.f32439j0 = getResources().getDimensionPixelSize(D3.d.f1442E);
            }
        }
    }

    private void i0(Rect rect) {
        V3.g gVar = this.f32433d0;
        if (gVar != null) {
            int i8 = rect.bottom;
            gVar.setBounds(rect.left, i8 - this.f32441l0, rect.right, i8);
        }
        V3.g gVar2 = this.f32434e0;
        if (gVar2 != null) {
            int i9 = rect.bottom;
            gVar2.setBounds(rect.left, i9 - this.f32442m0, rect.right, i9);
        }
    }

    private void j() {
        TextView textView = this.f32408K;
        if (textView != null) {
            this.f32444o.addView(textView);
            this.f32408K.setVisibility(0);
        }
    }

    private void j0() {
        if (this.f32398F != null) {
            EditText editText = this.f32453u;
            k0(editText == null ? null : editText.getText());
        }
    }

    private void k() {
        if (this.f32453u == null || this.f32438i0 != 1) {
            return;
        }
        if (S3.c.i(getContext())) {
            EditText editText = this.f32453u;
            X.B0(editText, X.E(editText), getResources().getDimensionPixelSize(D3.d.f1441D), X.D(this.f32453u), getResources().getDimensionPixelSize(D3.d.f1440C));
        } else if (S3.c.h(getContext())) {
            EditText editText2 = this.f32453u;
            X.B0(editText2, X.E(editText2), getResources().getDimensionPixelSize(D3.d.f1439B), X.D(this.f32453u), getResources().getDimensionPixelSize(D3.d.f1438A));
        }
    }

    private static void l0(Context context, TextView textView, int i8, int i9, boolean z7) {
        textView.setContentDescription(context.getString(z7 ? D3.j.f1587c : D3.j.f1586b, Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    private void m() {
        V3.g gVar = this.f32429W;
        if (gVar == null) {
            return;
        }
        V3.k A7 = gVar.A();
        V3.k kVar = this.f32435f0;
        if (A7 != kVar) {
            this.f32429W.setShapeAppearanceModel(kVar);
        }
        if (w()) {
            this.f32429W.Y(this.f32440k0, this.f32443n0);
        }
        int q8 = q();
        this.f32445o0 = q8;
        this.f32429W.U(ColorStateList.valueOf(q8));
        n();
        r0();
    }

    private void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f32398F;
        if (textView != null) {
            c0(textView, this.f32394D ? this.f32400G : this.f32402H);
            if (!this.f32394D && (colorStateList2 = this.f32418P) != null) {
                this.f32398F.setTextColor(colorStateList2);
            }
            if (!this.f32394D || (colorStateList = this.f32420Q) == null) {
                return;
            }
            this.f32398F.setTextColor(colorStateList);
        }
    }

    private void n() {
        if (this.f32433d0 == null || this.f32434e0 == null) {
            return;
        }
        if (x()) {
            this.f32433d0.U(this.f32453u.isFocused() ? ColorStateList.valueOf(this.f32391B0) : ColorStateList.valueOf(this.f32443n0));
            this.f32434e0.U(ColorStateList.valueOf(this.f32443n0));
        }
        invalidate();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f32422R;
        if (colorStateList2 == null) {
            colorStateList2 = L3.a.g(getContext(), D3.b.f1407f);
        }
        EditText editText = this.f32453u;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = AbstractC6641a.r(this.f32453u.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.f32424S) != null) {
            colorStateList2 = colorStateList;
        }
        AbstractC6641a.o(mutate, colorStateList2);
    }

    private void o(RectF rectF) {
        float f8 = rectF.left;
        int i8 = this.f32437h0;
        rectF.left = f8 - i8;
        rectF.right += i8;
    }

    private void p() {
        int i8 = this.f32438i0;
        if (i8 == 0) {
            this.f32429W = null;
            this.f32433d0 = null;
            this.f32434e0 = null;
            return;
        }
        if (i8 == 1) {
            this.f32429W = new V3.g(this.f32435f0);
            this.f32433d0 = new V3.g();
            this.f32434e0 = new V3.g();
        } else {
            if (i8 != 2) {
                throw new IllegalArgumentException(this.f32438i0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f32426T || (this.f32429W instanceof AbstractC5473h)) {
                this.f32429W = new V3.g(this.f32435f0);
            } else {
                this.f32429W = AbstractC5473h.g0(this.f32435f0);
            }
            this.f32433d0 = null;
            this.f32434e0 = null;
        }
    }

    private int q() {
        return this.f32438i0 == 1 ? L3.a.i(L3.a.e(this, D3.b.f1413l, 0), this.f32445o0) : this.f32445o0;
    }

    private void q0() {
        X.r0(this.f32453u, getEditTextBoxBackground());
    }

    private Rect r(Rect rect) {
        if (this.f32453u == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f32447q0;
        boolean g8 = com.google.android.material.internal.o.g(this);
        rect2.bottom = rect.bottom;
        int i8 = this.f32438i0;
        if (i8 == 1) {
            rect2.left = I(rect.left, g8);
            rect2.top = rect.top + this.f32439j0;
            rect2.right = J(rect.right, g8);
            return rect2;
        }
        if (i8 != 2) {
            rect2.left = I(rect.left, g8);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, g8);
            return rect2;
        }
        rect2.left = rect.left + this.f32453u.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f32453u.getPaddingRight();
        return rect2;
    }

    private int s(Rect rect, Rect rect2, float f8) {
        return S() ? (int) (rect2.top + f8) : rect.bottom - this.f32453u.getCompoundPaddingBottom();
    }

    private boolean s0() {
        int max;
        if (this.f32453u == null || this.f32453u.getMeasuredHeight() >= (max = Math.max(this.f32451t.getMeasuredHeight(), this.f32449s.getMeasuredHeight()))) {
            return false;
        }
        this.f32453u.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f32453u != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f32453u = editText;
        int i8 = this.f32457w;
        if (i8 != -1) {
            setMinEms(i8);
        } else {
            setMinWidth(this.f32461y);
        }
        int i9 = this.f32459x;
        if (i9 != -1) {
            setMaxEms(i9);
        } else {
            setMaxWidth(this.f32463z);
        }
        this.f32432c0 = false;
        V();
        setTextInputAccessibilityDelegate(new d(this));
        this.f32413M0.i0(this.f32453u.getTypeface());
        this.f32413M0.a0(this.f32453u.getTextSize());
        int i10 = Build.VERSION.SDK_INT;
        this.f32413M0.X(this.f32453u.getLetterSpacing());
        int gravity = this.f32453u.getGravity();
        this.f32413M0.S((gravity & (-113)) | 48);
        this.f32413M0.Z(gravity);
        this.f32409K0 = X.A(editText);
        this.f32453u.addTextChangedListener(new a(editText));
        if (this.f32464z0 == null) {
            this.f32464z0 = this.f32453u.getHintTextColors();
        }
        if (this.f32426T) {
            if (TextUtils.isEmpty(this.f32427U)) {
                CharSequence hint = this.f32453u.getHint();
                this.f32455v = hint;
                setHint(hint);
                this.f32453u.setHint((CharSequence) null);
            }
            this.f32428V = true;
        }
        if (i10 >= 29) {
            n0();
        }
        if (this.f32398F != null) {
            k0(this.f32453u.getText());
        }
        p0();
        this.f32388A.f();
        this.f32449s.bringToFront();
        this.f32451t.bringToFront();
        C();
        this.f32451t.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f32427U)) {
            return;
        }
        this.f32427U = charSequence;
        this.f32413M0.g0(charSequence);
        if (this.f32411L0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z7) {
        if (this.f32406J == z7) {
            return;
        }
        if (z7) {
            j();
        } else {
            a0();
            this.f32408K = null;
        }
        this.f32406J = z7;
    }

    private int t(Rect rect, float f8) {
        return S() ? (int) (rect.centerY() - (f8 / 2.0f)) : rect.top + this.f32453u.getCompoundPaddingTop();
    }

    private void t0() {
        if (this.f32438i0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f32444o.getLayoutParams();
            int v7 = v();
            if (v7 != layoutParams.topMargin) {
                layoutParams.topMargin = v7;
                this.f32444o.requestLayout();
            }
        }
    }

    private Rect u(Rect rect) {
        if (this.f32453u == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f32447q0;
        float w7 = this.f32413M0.w();
        rect2.left = rect.left + this.f32453u.getCompoundPaddingLeft();
        rect2.top = t(rect, w7);
        rect2.right = rect.right - this.f32453u.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, w7);
        return rect2;
    }

    private int v() {
        float q8;
        if (!this.f32426T) {
            return 0;
        }
        int i8 = this.f32438i0;
        if (i8 == 0) {
            q8 = this.f32413M0.q();
        } else {
            if (i8 != 2) {
                return 0;
            }
            q8 = this.f32413M0.q() / 2.0f;
        }
        return (int) q8;
    }

    private void v0(boolean z7, boolean z8) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f32453u;
        boolean z9 = false;
        boolean z10 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f32453u;
        if (editText2 != null && editText2.hasFocus()) {
            z9 = true;
        }
        ColorStateList colorStateList2 = this.f32464z0;
        if (colorStateList2 != null) {
            this.f32413M0.M(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f32464z0;
            this.f32413M0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f32407J0) : this.f32407J0));
        } else if (d0()) {
            this.f32413M0.M(this.f32388A.r());
        } else if (this.f32394D && (textView = this.f32398F) != null) {
            this.f32413M0.M(textView.getTextColors());
        } else if (z9 && (colorStateList = this.f32389A0) != null) {
            this.f32413M0.R(colorStateList);
        }
        if (z10 || !this.f32415N0 || (isEnabled() && z9)) {
            if (z8 || this.f32411L0) {
                z(z7);
                return;
            }
            return;
        }
        if (z8 || !this.f32411L0) {
            F(z7);
        }
    }

    private boolean w() {
        return this.f32438i0 == 2 && x();
    }

    private void w0() {
        EditText editText;
        if (this.f32408K == null || (editText = this.f32453u) == null) {
            return;
        }
        this.f32408K.setGravity(editText.getGravity());
        this.f32408K.setPadding(this.f32453u.getCompoundPaddingLeft(), this.f32453u.getCompoundPaddingTop(), this.f32453u.getCompoundPaddingRight(), this.f32453u.getCompoundPaddingBottom());
    }

    private boolean x() {
        return this.f32440k0 > -1 && this.f32443n0 != 0;
    }

    private void x0() {
        EditText editText = this.f32453u;
        y0(editText == null ? null : editText.getText());
    }

    private void y() {
        if (B()) {
            ((AbstractC5473h) this.f32429W).j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(Editable editable) {
        if (this.f32396E.a(editable) != 0 || this.f32411L0) {
            L();
        } else {
            g0();
        }
    }

    private void z(boolean z7) {
        ValueAnimator valueAnimator = this.f32419P0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f32419P0.cancel();
        }
        if (z7 && this.f32417O0) {
            l(1.0f);
        } else {
            this.f32413M0.c0(1.0f);
        }
        this.f32411L0 = false;
        if (B()) {
            W();
        }
        x0();
        this.f32449s.l(false);
        this.f32451t.H(false);
    }

    private void z0(boolean z7, boolean z8) {
        int defaultColor = this.f32397E0.getDefaultColor();
        int colorForState = this.f32397E0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f32397E0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z7) {
            this.f32443n0 = colorForState2;
        } else if (z8) {
            this.f32443n0 = colorForState;
        } else {
            this.f32443n0 = defaultColor;
        }
    }

    void A0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f32429W == null || this.f32438i0 == 0) {
            return;
        }
        boolean z7 = false;
        boolean z8 = isFocused() || ((editText2 = this.f32453u) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f32453u) != null && editText.isHovered())) {
            z7 = true;
        }
        if (!isEnabled()) {
            this.f32443n0 = this.f32407J0;
        } else if (d0()) {
            if (this.f32397E0 != null) {
                z0(z8, z7);
            } else {
                this.f32443n0 = getErrorCurrentTextColors();
            }
        } else if (!this.f32394D || (textView = this.f32398F) == null) {
            if (z8) {
                this.f32443n0 = this.f32395D0;
            } else if (z7) {
                this.f32443n0 = this.f32393C0;
            } else {
                this.f32443n0 = this.f32391B0;
            }
        } else if (this.f32397E0 != null) {
            z0(z8, z7);
        } else {
            this.f32443n0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n0();
        }
        this.f32451t.I();
        Z();
        if (this.f32438i0 == 2) {
            int i8 = this.f32440k0;
            if (z8 && isEnabled()) {
                this.f32440k0 = this.f32442m0;
            } else {
                this.f32440k0 = this.f32441l0;
            }
            if (this.f32440k0 != i8) {
                X();
            }
        }
        if (this.f32438i0 == 1) {
            if (!isEnabled()) {
                this.f32445o0 = this.f32401G0;
            } else if (z7 && !z8) {
                this.f32445o0 = this.f32405I0;
            } else if (z8) {
                this.f32445o0 = this.f32403H0;
            } else {
                this.f32445o0 = this.f32399F0;
            }
        }
        m();
    }

    public boolean M() {
        return this.f32451t.F();
    }

    public boolean N() {
        return this.f32388A.A();
    }

    public boolean O() {
        return this.f32388A.B();
    }

    final boolean P() {
        return this.f32411L0;
    }

    public boolean R() {
        return this.f32428V;
    }

    public void Z() {
        this.f32449s.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i8, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f32444o.addView(view, layoutParams2);
        this.f32444o.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i8) {
        try {
            androidx.core.widget.h.p(textView, i8);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.h.p(textView, D3.k.f1612b);
        textView.setTextColor(AbstractC6278a.c(getContext(), D3.c.f1428a));
    }

    boolean d0() {
        return this.f32388A.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i8) {
        EditText editText = this.f32453u;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i8);
            return;
        }
        if (this.f32455v != null) {
            boolean z7 = this.f32428V;
            this.f32428V = false;
            CharSequence hint = editText.getHint();
            this.f32453u.setHint(this.f32455v);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i8);
                return;
            } finally {
                this.f32453u.setHint(hint);
                this.f32428V = z7;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i8);
        onProvideAutofillVirtualStructure(viewStructure, i8);
        viewStructure.setChildCount(this.f32444o.getChildCount());
        for (int i9 = 0; i9 < this.f32444o.getChildCount(); i9++) {
            View childAt = this.f32444o.getChildAt(i9);
            ViewStructure newChild = viewStructure.newChild(i9);
            childAt.dispatchProvideAutofillStructure(newChild, i8);
            if (childAt == this.f32453u) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f32423R0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f32423R0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f32421Q0) {
            return;
        }
        this.f32421Q0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f32413M0;
        boolean f02 = aVar != null ? aVar.f0(drawableState) : false;
        if (this.f32453u != null) {
            u0(X.R(this) && isEnabled());
        }
        p0();
        A0();
        if (f02) {
            invalidate();
        }
        this.f32421Q0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f32453u;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    V3.g getBoxBackground() {
        int i8 = this.f32438i0;
        if (i8 == 1 || i8 == 2) {
            return this.f32429W;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f32445o0;
    }

    public int getBoxBackgroundMode() {
        return this.f32438i0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f32439j0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.o.g(this) ? this.f32435f0.j().a(this.f32448r0) : this.f32435f0.l().a(this.f32448r0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.o.g(this) ? this.f32435f0.l().a(this.f32448r0) : this.f32435f0.j().a(this.f32448r0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.o.g(this) ? this.f32435f0.r().a(this.f32448r0) : this.f32435f0.t().a(this.f32448r0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.o.g(this) ? this.f32435f0.t().a(this.f32448r0) : this.f32435f0.r().a(this.f32448r0);
    }

    public int getBoxStrokeColor() {
        return this.f32395D0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f32397E0;
    }

    public int getBoxStrokeWidth() {
        return this.f32441l0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f32442m0;
    }

    public int getCounterMaxLength() {
        return this.f32392C;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f32390B && this.f32394D && (textView = this.f32398F) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f32420Q;
    }

    public ColorStateList getCounterTextColor() {
        return this.f32418P;
    }

    public ColorStateList getCursorColor() {
        return this.f32422R;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f32424S;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f32464z0;
    }

    public EditText getEditText() {
        return this.f32453u;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f32451t.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f32451t.n();
    }

    public int getEndIconMinSize() {
        return this.f32451t.o();
    }

    public int getEndIconMode() {
        return this.f32451t.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f32451t.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f32451t.r();
    }

    public CharSequence getError() {
        if (this.f32388A.A()) {
            return this.f32388A.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f32388A.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f32388A.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f32388A.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f32451t.s();
    }

    public CharSequence getHelperText() {
        if (this.f32388A.B()) {
            return this.f32388A.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f32388A.u();
    }

    public CharSequence getHint() {
        if (this.f32426T) {
            return this.f32427U;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f32413M0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f32413M0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f32389A0;
    }

    public e getLengthCounter() {
        return this.f32396E;
    }

    public int getMaxEms() {
        return this.f32459x;
    }

    public int getMaxWidth() {
        return this.f32463z;
    }

    public int getMinEms() {
        return this.f32457w;
    }

    public int getMinWidth() {
        return this.f32461y;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f32451t.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f32451t.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f32406J) {
            return this.f32404I;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f32412M;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f32410L;
    }

    public CharSequence getPrefixText() {
        return this.f32449s.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f32449s.b();
    }

    public TextView getPrefixTextView() {
        return this.f32449s.d();
    }

    public V3.k getShapeAppearanceModel() {
        return this.f32435f0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f32449s.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f32449s.f();
    }

    public int getStartIconMinSize() {
        return this.f32449s.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f32449s.h();
    }

    public CharSequence getSuffixText() {
        return this.f32451t.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f32451t.x();
    }

    public TextView getSuffixTextView() {
        return this.f32451t.z();
    }

    public Typeface getTypeface() {
        return this.f32450s0;
    }

    public void i(f fVar) {
        this.f32456v0.add(fVar);
        if (this.f32453u != null) {
            fVar.a(this);
        }
    }

    void k0(Editable editable) {
        int a8 = this.f32396E.a(editable);
        boolean z7 = this.f32394D;
        int i8 = this.f32392C;
        if (i8 == -1) {
            this.f32398F.setText(String.valueOf(a8));
            this.f32398F.setContentDescription(null);
            this.f32394D = false;
        } else {
            this.f32394D = a8 > i8;
            l0(getContext(), this.f32398F, a8, this.f32392C, this.f32394D);
            if (z7 != this.f32394D) {
                m0();
            }
            this.f32398F.setText(C6897a.c().j(getContext().getString(D3.j.f1588d, Integer.valueOf(a8), Integer.valueOf(this.f32392C))));
        }
        if (this.f32453u == null || z7 == this.f32394D) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    void l(float f8) {
        if (this.f32413M0.x() == f8) {
            return;
        }
        if (this.f32419P0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f32419P0 = valueAnimator;
            valueAnimator.setInterpolator(Q3.d.g(getContext(), D3.b.f1384H, E3.a.f2146b));
            this.f32419P0.setDuration(Q3.d.f(getContext(), D3.b.f1378B, 167));
            this.f32419P0.addUpdateListener(new c());
        }
        this.f32419P0.setFloatValues(this.f32413M0.x(), f8);
        this.f32419P0.start();
    }

    boolean o0() {
        boolean z7;
        if (this.f32453u == null) {
            return false;
        }
        boolean z8 = true;
        if (f0()) {
            int measuredWidth = this.f32449s.getMeasuredWidth() - this.f32453u.getPaddingLeft();
            if (this.f32452t0 == null || this.f32454u0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f32452t0 = colorDrawable;
                this.f32454u0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a8 = androidx.core.widget.h.a(this.f32453u);
            Drawable drawable = a8[0];
            Drawable drawable2 = this.f32452t0;
            if (drawable != drawable2) {
                androidx.core.widget.h.j(this.f32453u, drawable2, a8[1], a8[2], a8[3]);
                z7 = true;
            }
            z7 = false;
        } else {
            if (this.f32452t0 != null) {
                Drawable[] a9 = androidx.core.widget.h.a(this.f32453u);
                androidx.core.widget.h.j(this.f32453u, null, a9[1], a9[2], a9[3]);
                this.f32452t0 = null;
                z7 = true;
            }
            z7 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f32451t.z().getMeasuredWidth() - this.f32453u.getPaddingRight();
            CheckableImageButton k8 = this.f32451t.k();
            if (k8 != null) {
                measuredWidth2 = measuredWidth2 + k8.getMeasuredWidth() + AbstractC7054v.b((ViewGroup.MarginLayoutParams) k8.getLayoutParams());
            }
            Drawable[] a10 = androidx.core.widget.h.a(this.f32453u);
            Drawable drawable3 = this.f32458w0;
            if (drawable3 == null || this.f32460x0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f32458w0 = colorDrawable2;
                    this.f32460x0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a10[2];
                Drawable drawable5 = this.f32458w0;
                if (drawable4 != drawable5) {
                    this.f32462y0 = drawable4;
                    androidx.core.widget.h.j(this.f32453u, a10[0], a10[1], drawable5, a10[3]);
                } else {
                    z8 = z7;
                }
            } else {
                this.f32460x0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.h.j(this.f32453u, a10[0], a10[1], this.f32458w0, a10[3]);
            }
        } else {
            if (this.f32458w0 == null) {
                return z7;
            }
            Drawable[] a11 = androidx.core.widget.h.a(this.f32453u);
            if (a11[2] == this.f32458w0) {
                androidx.core.widget.h.j(this.f32453u, a11[0], a11[1], this.f32462y0, a11[3]);
            } else {
                z8 = z7;
            }
            this.f32458w0 = null;
        }
        return z8;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f32413M0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f32451t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f32425S0 = false;
        boolean s02 = s0();
        boolean o02 = o0();
        if (s02 || o02) {
            this.f32453u.post(new Runnable() { // from class: com.google.android.material.textfield.H
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32383o.U();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        EditText editText = this.f32453u;
        if (editText != null) {
            Rect rect = this.f32446p0;
            com.google.android.material.internal.b.a(this, editText, rect);
            i0(rect);
            if (this.f32426T) {
                this.f32413M0.a0(this.f32453u.getTextSize());
                int gravity = this.f32453u.getGravity();
                this.f32413M0.S((gravity & (-113)) | 48);
                this.f32413M0.Z(gravity);
                this.f32413M0.O(r(rect));
                this.f32413M0.W(u(rect));
                this.f32413M0.J();
                if (!B() || this.f32411L0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (!this.f32425S0) {
            this.f32451t.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f32425S0 = true;
        }
        w0();
        this.f32451t.x0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        setError(gVar.f32471t);
        if (gVar.f32472u) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        boolean z7 = i8 == 1;
        if (z7 != this.f32436g0) {
            float a8 = this.f32435f0.r().a(this.f32448r0);
            float a9 = this.f32435f0.t().a(this.f32448r0);
            V3.k m8 = V3.k.a().z(this.f32435f0.s()).D(this.f32435f0.q()).r(this.f32435f0.k()).v(this.f32435f0.i()).A(a9).E(a8).s(this.f32435f0.l().a(this.f32448r0)).w(this.f32435f0.j().a(this.f32448r0)).m();
            this.f32436g0 = z7;
            setShapeAppearanceModel(m8);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        if (d0()) {
            gVar.f32471t = getError();
        }
        gVar.f32472u = this.f32451t.E();
        return gVar;
    }

    void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f32453u;
        if (editText == null || this.f32438i0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (O.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(C0851k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f32394D && (textView = this.f32398F) != null) {
            background.setColorFilter(C0851k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC6641a.c(background);
            this.f32453u.refreshDrawableState();
        }
    }

    void r0() {
        EditText editText = this.f32453u;
        if (editText == null || this.f32429W == null) {
            return;
        }
        if ((this.f32432c0 || editText.getBackground() == null) && this.f32438i0 != 0) {
            q0();
            this.f32432c0 = true;
        }
    }

    public void setBoxBackgroundColor(int i8) {
        if (this.f32445o0 != i8) {
            this.f32445o0 = i8;
            this.f32399F0 = i8;
            this.f32403H0 = i8;
            this.f32405I0 = i8;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i8) {
        setBoxBackgroundColor(AbstractC6278a.c(getContext(), i8));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f32399F0 = defaultColor;
        this.f32445o0 = defaultColor;
        this.f32401G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f32403H0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f32405I0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i8) {
        if (i8 == this.f32438i0) {
            return;
        }
        this.f32438i0 = i8;
        if (this.f32453u != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i8) {
        this.f32439j0 = i8;
    }

    public void setBoxCornerFamily(int i8) {
        this.f32435f0 = this.f32435f0.v().y(i8, this.f32435f0.r()).C(i8, this.f32435f0.t()).q(i8, this.f32435f0.j()).u(i8, this.f32435f0.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i8) {
        if (this.f32395D0 != i8) {
            this.f32395D0 = i8;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f32391B0 = colorStateList.getDefaultColor();
            this.f32407J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f32393C0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f32395D0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f32395D0 != colorStateList.getDefaultColor()) {
            this.f32395D0 = colorStateList.getDefaultColor();
        }
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f32397E0 != colorStateList) {
            this.f32397E0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i8) {
        this.f32441l0 = i8;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i8) {
        this.f32442m0 = i8;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i8) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i8));
    }

    public void setBoxStrokeWidthResource(int i8) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i8));
    }

    public void setCounterEnabled(boolean z7) {
        if (this.f32390B != z7) {
            if (z7) {
                androidx.appcompat.widget.D d8 = new androidx.appcompat.widget.D(getContext());
                this.f32398F = d8;
                d8.setId(D3.f.f1523M);
                Typeface typeface = this.f32450s0;
                if (typeface != null) {
                    this.f32398F.setTypeface(typeface);
                }
                this.f32398F.setMaxLines(1);
                this.f32388A.e(this.f32398F, 2);
                AbstractC7054v.d((ViewGroup.MarginLayoutParams) this.f32398F.getLayoutParams(), getResources().getDimensionPixelOffset(D3.d.f1485k0));
                m0();
                j0();
            } else {
                this.f32388A.C(this.f32398F, 2);
                this.f32398F = null;
            }
            this.f32390B = z7;
        }
    }

    public void setCounterMaxLength(int i8) {
        if (this.f32392C != i8) {
            if (i8 > 0) {
                this.f32392C = i8;
            } else {
                this.f32392C = -1;
            }
            if (this.f32390B) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i8) {
        if (this.f32400G != i8) {
            this.f32400G = i8;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f32420Q != colorStateList) {
            this.f32420Q = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i8) {
        if (this.f32402H != i8) {
            this.f32402H = i8;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f32418P != colorStateList) {
            this.f32418P = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f32422R != colorStateList) {
            this.f32422R = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f32424S != colorStateList) {
            this.f32424S = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f32464z0 = colorStateList;
        this.f32389A0 = colorStateList;
        if (this.f32453u != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        Y(this, z7);
        super.setEnabled(z7);
    }

    public void setEndIconActivated(boolean z7) {
        this.f32451t.N(z7);
    }

    public void setEndIconCheckable(boolean z7) {
        this.f32451t.O(z7);
    }

    public void setEndIconContentDescription(int i8) {
        this.f32451t.P(i8);
    }

    public void setEndIconDrawable(int i8) {
        this.f32451t.R(i8);
    }

    public void setEndIconMinSize(int i8) {
        this.f32451t.T(i8);
    }

    public void setEndIconMode(int i8) {
        this.f32451t.U(i8);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f32451t.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f32451t.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f32451t.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f32451t.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f32451t.Z(mode);
    }

    public void setEndIconVisible(boolean z7) {
        this.f32451t.a0(z7);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f32388A.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f32388A.w();
        } else {
            this.f32388A.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i8) {
        this.f32388A.E(i8);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f32388A.F(charSequence);
    }

    public void setErrorEnabled(boolean z7) {
        this.f32388A.G(z7);
    }

    public void setErrorIconDrawable(int i8) {
        this.f32451t.b0(i8);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f32451t.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f32451t.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f32451t.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f32451t.g0(mode);
    }

    public void setErrorTextAppearance(int i8) {
        this.f32388A.H(i8);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f32388A.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z7) {
        if (this.f32415N0 != z7) {
            this.f32415N0 = z7;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f32388A.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f32388A.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z7) {
        this.f32388A.K(z7);
    }

    public void setHelperTextTextAppearance(int i8) {
        this.f32388A.J(i8);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f32426T) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z7) {
        this.f32417O0 = z7;
    }

    public void setHintEnabled(boolean z7) {
        if (z7 != this.f32426T) {
            this.f32426T = z7;
            if (z7) {
                CharSequence hint = this.f32453u.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f32427U)) {
                        setHint(hint);
                    }
                    this.f32453u.setHint((CharSequence) null);
                }
                this.f32428V = true;
            } else {
                this.f32428V = false;
                if (!TextUtils.isEmpty(this.f32427U) && TextUtils.isEmpty(this.f32453u.getHint())) {
                    this.f32453u.setHint(this.f32427U);
                }
                setHintInternal(null);
            }
            if (this.f32453u != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i8) {
        this.f32413M0.P(i8);
        this.f32389A0 = this.f32413M0.p();
        if (this.f32453u != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f32389A0 != colorStateList) {
            if (this.f32464z0 == null) {
                this.f32413M0.R(colorStateList);
            }
            this.f32389A0 = colorStateList;
            if (this.f32453u != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f32396E = eVar;
    }

    public void setMaxEms(int i8) {
        this.f32459x = i8;
        EditText editText = this.f32453u;
        if (editText == null || i8 == -1) {
            return;
        }
        editText.setMaxEms(i8);
    }

    public void setMaxWidth(int i8) {
        this.f32463z = i8;
        EditText editText = this.f32453u;
        if (editText == null || i8 == -1) {
            return;
        }
        editText.setMaxWidth(i8);
    }

    public void setMaxWidthResource(int i8) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i8));
    }

    public void setMinEms(int i8) {
        this.f32457w = i8;
        EditText editText = this.f32453u;
        if (editText == null || i8 == -1) {
            return;
        }
        editText.setMinEms(i8);
    }

    public void setMinWidth(int i8) {
        this.f32461y = i8;
        EditText editText = this.f32453u;
        if (editText == null || i8 == -1) {
            return;
        }
        editText.setMinWidth(i8);
    }

    public void setMinWidthResource(int i8) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i8));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i8) {
        this.f32451t.i0(i8);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i8) {
        this.f32451t.k0(i8);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z7) {
        this.f32451t.m0(z7);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f32451t.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f32451t.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f32408K == null) {
            androidx.appcompat.widget.D d8 = new androidx.appcompat.widget.D(getContext());
            this.f32408K = d8;
            d8.setId(D3.f.f1526P);
            X.w0(this.f32408K, 2);
            C0937c A7 = A();
            this.f32414N = A7;
            A7.k0(67L);
            this.f32416O = A();
            setPlaceholderTextAppearance(this.f32412M);
            setPlaceholderTextColor(this.f32410L);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f32406J) {
                setPlaceholderTextEnabled(true);
            }
            this.f32404I = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i8) {
        this.f32412M = i8;
        TextView textView = this.f32408K;
        if (textView != null) {
            androidx.core.widget.h.p(textView, i8);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f32410L != colorStateList) {
            this.f32410L = colorStateList;
            TextView textView = this.f32408K;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f32449s.n(charSequence);
    }

    public void setPrefixTextAppearance(int i8) {
        this.f32449s.o(i8);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f32449s.p(colorStateList);
    }

    public void setShapeAppearanceModel(V3.k kVar) {
        V3.g gVar = this.f32429W;
        if (gVar == null || gVar.A() == kVar) {
            return;
        }
        this.f32435f0 = kVar;
        m();
    }

    public void setStartIconCheckable(boolean z7) {
        this.f32449s.q(z7);
    }

    public void setStartIconContentDescription(int i8) {
        setStartIconContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setStartIconDrawable(int i8) {
        setStartIconDrawable(i8 != 0 ? AbstractC5794a.b(getContext(), i8) : null);
    }

    public void setStartIconMinSize(int i8) {
        this.f32449s.t(i8);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f32449s.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f32449s.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f32449s.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f32449s.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f32449s.y(mode);
    }

    public void setStartIconVisible(boolean z7) {
        this.f32449s.z(z7);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f32451t.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i8) {
        this.f32451t.q0(i8);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f32451t.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f32453u;
        if (editText != null) {
            X.n0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f32450s0) {
            this.f32450s0 = typeface;
            this.f32413M0.i0(typeface);
            this.f32388A.N(typeface);
            TextView textView = this.f32398F;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void u0(boolean z7) {
        v0(z7, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f32386T0;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        this.f32457w = -1;
        this.f32459x = -1;
        this.f32461y = -1;
        this.f32463z = -1;
        this.f32388A = new v(this);
        this.f32396E = new e() { // from class: com.google.android.material.textfield.I
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.T(editable);
            }
        };
        this.f32446p0 = new Rect();
        this.f32447q0 = new Rect();
        this.f32448r0 = new RectF();
        this.f32456v0 = new LinkedHashSet();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f32413M0 = aVar;
        this.f32425S0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f32444o = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = E3.a.f2145a;
        aVar.h0(timeInterpolator);
        aVar.e0(timeInterpolator);
        aVar.S(8388659);
        f0 j8 = com.google.android.material.internal.l.j(context2, attributeSet, D3.l.f1672E6, i8, i9, D3.l.f1858b7, D3.l.f1840Z6, D3.l.t7, D3.l.y7, D3.l.C7);
        A a8 = new A(this, j8);
        this.f32449s = a8;
        this.f32426T = j8.a(D3.l.B7, true);
        setHint(j8.p(D3.l.f1712J6));
        this.f32417O0 = j8.a(D3.l.A7, true);
        this.f32415N0 = j8.a(D3.l.v7, true);
        if (j8.s(D3.l.f1728L6)) {
            setMinEms(j8.k(D3.l.f1728L6, -1));
        } else if (j8.s(D3.l.f1704I6)) {
            setMinWidth(j8.f(D3.l.f1704I6, -1));
        }
        if (j8.s(D3.l.f1720K6)) {
            setMaxEms(j8.k(D3.l.f1720K6, -1));
        } else if (j8.s(D3.l.f1696H6)) {
            setMaxWidth(j8.f(D3.l.f1696H6, -1));
        }
        this.f32435f0 = V3.k.e(context2, attributeSet, i8, i9).m();
        this.f32437h0 = context2.getResources().getDimensionPixelOffset(D3.d.f1479h0);
        this.f32439j0 = j8.e(D3.l.f1752O6, 0);
        this.f32441l0 = j8.f(D3.l.f1808V6, context2.getResources().getDimensionPixelSize(D3.d.f1481i0));
        this.f32442m0 = j8.f(D3.l.f1816W6, context2.getResources().getDimensionPixelSize(D3.d.f1483j0));
        this.f32440k0 = this.f32441l0;
        float d8 = j8.d(D3.l.f1784S6, -1.0f);
        float d9 = j8.d(D3.l.f1776R6, -1.0f);
        float d10 = j8.d(D3.l.f1760P6, -1.0f);
        float d11 = j8.d(D3.l.f1768Q6, -1.0f);
        k.b v7 = this.f32435f0.v();
        if (d8 >= 0.0f) {
            v7.A(d8);
        }
        if (d9 >= 0.0f) {
            v7.E(d9);
        }
        if (d10 >= 0.0f) {
            v7.w(d10);
        }
        if (d11 >= 0.0f) {
            v7.s(d11);
        }
        this.f32435f0 = v7.m();
        ColorStateList b8 = S3.c.b(context2, j8, D3.l.f1736M6);
        if (b8 != null) {
            int defaultColor = b8.getDefaultColor();
            this.f32399F0 = defaultColor;
            this.f32445o0 = defaultColor;
            if (b8.isStateful()) {
                this.f32401G0 = b8.getColorForState(new int[]{-16842910}, -1);
                this.f32403H0 = b8.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f32405I0 = b8.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f32403H0 = this.f32399F0;
                ColorStateList a9 = AbstractC5794a.a(context2, D3.c.f1434g);
                this.f32401G0 = a9.getColorForState(new int[]{-16842910}, -1);
                this.f32405I0 = a9.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f32445o0 = 0;
            this.f32399F0 = 0;
            this.f32401G0 = 0;
            this.f32403H0 = 0;
            this.f32405I0 = 0;
        }
        if (j8.s(D3.l.f1688G6)) {
            ColorStateList c8 = j8.c(D3.l.f1688G6);
            this.f32389A0 = c8;
            this.f32464z0 = c8;
        }
        ColorStateList b9 = S3.c.b(context2, j8, D3.l.f1792T6);
        this.f32395D0 = j8.b(D3.l.f1792T6, 0);
        this.f32391B0 = AbstractC6278a.c(context2, D3.c.f1435h);
        this.f32407J0 = AbstractC6278a.c(context2, D3.c.f1436i);
        this.f32393C0 = AbstractC6278a.c(context2, D3.c.f1437j);
        if (b9 != null) {
            setBoxStrokeColorStateList(b9);
        }
        if (j8.s(D3.l.f1800U6)) {
            setBoxStrokeErrorColor(S3.c.b(context2, j8, D3.l.f1800U6));
        }
        if (j8.n(D3.l.C7, -1) != -1) {
            setHintTextAppearance(j8.n(D3.l.C7, 0));
        }
        this.f32422R = j8.c(D3.l.f1876d7);
        this.f32424S = j8.c(D3.l.f1885e7);
        int n8 = j8.n(D3.l.t7, 0);
        CharSequence p8 = j8.p(D3.l.f1975o7);
        int k8 = j8.k(D3.l.f1966n7, 1);
        boolean a10 = j8.a(D3.l.f1984p7, false);
        int n9 = j8.n(D3.l.y7, 0);
        boolean a11 = j8.a(D3.l.x7, false);
        CharSequence p9 = j8.p(D3.l.w7);
        int n10 = j8.n(D3.l.K7, 0);
        CharSequence p10 = j8.p(D3.l.J7);
        boolean a12 = j8.a(D3.l.f1824X6, false);
        setCounterMaxLength(j8.k(D3.l.f1832Y6, -1));
        this.f32402H = j8.n(D3.l.f1858b7, 0);
        this.f32400G = j8.n(D3.l.f1840Z6, 0);
        setBoxBackgroundMode(j8.k(D3.l.f1744N6, 0));
        setErrorContentDescription(p8);
        setErrorAccessibilityLiveRegion(k8);
        setCounterOverflowTextAppearance(this.f32400G);
        setHelperTextTextAppearance(n9);
        setErrorTextAppearance(n8);
        setCounterTextAppearance(this.f32402H);
        setPlaceholderText(p10);
        setPlaceholderTextAppearance(n10);
        if (j8.s(D3.l.u7)) {
            setErrorTextColor(j8.c(D3.l.u7));
        }
        if (j8.s(D3.l.z7)) {
            setHelperTextColor(j8.c(D3.l.z7));
        }
        if (j8.s(D3.l.D7)) {
            setHintTextColor(j8.c(D3.l.D7));
        }
        if (j8.s(D3.l.f1867c7)) {
            setCounterTextColor(j8.c(D3.l.f1867c7));
        }
        if (j8.s(D3.l.f1849a7)) {
            setCounterOverflowTextColor(j8.c(D3.l.f1849a7));
        }
        if (j8.s(D3.l.L7)) {
            setPlaceholderTextColor(j8.c(D3.l.L7));
        }
        s sVar = new s(this, j8);
        this.f32451t = sVar;
        boolean a13 = j8.a(D3.l.f1680F6, true);
        j8.x();
        X.w0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            X.y0(this, 1);
        }
        frameLayout.addView(a8);
        frameLayout.addView(sVar);
        addView(frameLayout);
        setEnabled(a13);
        setHelperTextEnabled(a11);
        setErrorEnabled(a10);
        setCounterEnabled(a12);
        setHelperText(p9);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f32451t.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f32451t.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f32451t.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f32451t.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f32451t.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f32449s.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f32449s.s(drawable);
    }

    public void setHint(int i8) {
        setHint(i8 != 0 ? getResources().getText(i8) : null);
    }
}
