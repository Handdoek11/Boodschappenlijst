package com.google.android.material.textfield;

import A0.AbstractC0366c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.f0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g.AbstractC5794a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r0.AbstractC6641a;
import z0.AbstractC7054v;
import z0.X;

/* loaded from: classes2.dex */
class s extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    private final LinkedHashSet f32514A;

    /* renamed from: B, reason: collision with root package name */
    private ColorStateList f32515B;

    /* renamed from: C, reason: collision with root package name */
    private PorterDuff.Mode f32516C;

    /* renamed from: D, reason: collision with root package name */
    private int f32517D;

    /* renamed from: E, reason: collision with root package name */
    private ImageView.ScaleType f32518E;

    /* renamed from: F, reason: collision with root package name */
    private View.OnLongClickListener f32519F;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f32520G;

    /* renamed from: H, reason: collision with root package name */
    private final TextView f32521H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f32522I;

    /* renamed from: J, reason: collision with root package name */
    private EditText f32523J;

    /* renamed from: K, reason: collision with root package name */
    private final AccessibilityManager f32524K;

    /* renamed from: L, reason: collision with root package name */
    private AbstractC0366c.a f32525L;

    /* renamed from: M, reason: collision with root package name */
    private final TextWatcher f32526M;

    /* renamed from: N, reason: collision with root package name */
    private final TextInputLayout.f f32527N;

    /* renamed from: o, reason: collision with root package name */
    final TextInputLayout f32528o;

    /* renamed from: s, reason: collision with root package name */
    private final FrameLayout f32529s;

    /* renamed from: t, reason: collision with root package name */
    private final CheckableImageButton f32530t;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f32531u;

    /* renamed from: v, reason: collision with root package name */
    private PorterDuff.Mode f32532v;

    /* renamed from: w, reason: collision with root package name */
    private View.OnLongClickListener f32533w;

    /* renamed from: x, reason: collision with root package name */
    private final CheckableImageButton f32534x;

    /* renamed from: y, reason: collision with root package name */
    private final d f32535y;

    /* renamed from: z, reason: collision with root package name */
    private int f32536z;

    class a extends com.google.android.material.internal.k {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            s.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.k, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            s.this.m().b(charSequence, i8, i9, i10);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (s.this.f32523J == textInputLayout.getEditText()) {
                return;
            }
            if (s.this.f32523J != null) {
                s.this.f32523J.removeTextChangedListener(s.this.f32526M);
                if (s.this.f32523J.getOnFocusChangeListener() == s.this.m().e()) {
                    s.this.f32523J.setOnFocusChangeListener(null);
                }
            }
            s.this.f32523J = textInputLayout.getEditText();
            if (s.this.f32523J != null) {
                s.this.f32523J.addTextChangedListener(s.this.f32526M);
            }
            s.this.m().n(s.this.f32523J);
            s sVar = s.this;
            sVar.h0(sVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            s.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            s.this.M();
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f32540a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        private final s f32541b;

        /* renamed from: c, reason: collision with root package name */
        private final int f32542c;

        /* renamed from: d, reason: collision with root package name */
        private final int f32543d;

        d(s sVar, f0 f0Var) {
            this.f32541b = sVar;
            this.f32542c = f0Var.n(D3.l.f1912h7, 0);
            this.f32543d = f0Var.n(D3.l.F7, 0);
        }

        private t b(int i8) {
            if (i8 == -1) {
                return new C5472g(this.f32541b);
            }
            if (i8 == 0) {
                return new x(this.f32541b);
            }
            if (i8 == 1) {
                return new z(this.f32541b, this.f32543d);
            }
            if (i8 == 2) {
                return new C5471f(this.f32541b);
            }
            if (i8 == 3) {
                return new q(this.f32541b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i8);
        }

        t c(int i8) {
            t tVar = (t) this.f32540a.get(i8);
            if (tVar != null) {
                return tVar;
            }
            t b8 = b(i8);
            this.f32540a.append(i8, b8);
            return b8;
        }
    }

    s(TextInputLayout textInputLayout, f0 f0Var) {
        super(textInputLayout.getContext());
        this.f32536z = 0;
        this.f32514A = new LinkedHashSet();
        this.f32526M = new a();
        b bVar = new b();
        this.f32527N = bVar;
        this.f32524K = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f32528o = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f32529s = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i8 = i(this, from, D3.f.f1522L);
        this.f32530t = i8;
        CheckableImageButton i9 = i(frameLayout, from, D3.f.f1521K);
        this.f32534x = i9;
        this.f32535y = new d(this, f0Var);
        androidx.appcompat.widget.D d8 = new androidx.appcompat.widget.D(getContext());
        this.f32521H = d8;
        C(f0Var);
        B(f0Var);
        D(f0Var);
        frameLayout.addView(i9);
        addView(d8);
        addView(frameLayout);
        addView(i8);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(f0 f0Var) {
        if (!f0Var.s(D3.l.G7)) {
            if (f0Var.s(D3.l.f1948l7)) {
                this.f32515B = S3.c.b(getContext(), f0Var, D3.l.f1948l7);
            }
            if (f0Var.s(D3.l.f1957m7)) {
                this.f32516C = com.google.android.material.internal.o.i(f0Var.k(D3.l.f1957m7, -1), null);
            }
        }
        if (f0Var.s(D3.l.f1930j7)) {
            U(f0Var.k(D3.l.f1930j7, 0));
            if (f0Var.s(D3.l.f1903g7)) {
                Q(f0Var.p(D3.l.f1903g7));
            }
            O(f0Var.a(D3.l.f1894f7, true));
        } else if (f0Var.s(D3.l.G7)) {
            if (f0Var.s(D3.l.H7)) {
                this.f32515B = S3.c.b(getContext(), f0Var, D3.l.H7);
            }
            if (f0Var.s(D3.l.I7)) {
                this.f32516C = com.google.android.material.internal.o.i(f0Var.k(D3.l.I7, -1), null);
            }
            U(f0Var.a(D3.l.G7, false) ? 1 : 0);
            Q(f0Var.p(D3.l.E7));
        }
        T(f0Var.f(D3.l.f1921i7, getResources().getDimensionPixelSize(D3.d.f1471d0)));
        if (f0Var.s(D3.l.f1939k7)) {
            X(u.b(f0Var.k(D3.l.f1939k7, -1)));
        }
    }

    private void C(f0 f0Var) {
        if (f0Var.s(D3.l.f2002r7)) {
            this.f32531u = S3.c.b(getContext(), f0Var, D3.l.f2002r7);
        }
        if (f0Var.s(D3.l.f2011s7)) {
            this.f32532v = com.google.android.material.internal.o.i(f0Var.k(D3.l.f2011s7, -1), null);
        }
        if (f0Var.s(D3.l.f1993q7)) {
            c0(f0Var.g(D3.l.f1993q7));
        }
        this.f32530t.setContentDescription(getResources().getText(D3.j.f1590f));
        X.w0(this.f32530t, 2);
        this.f32530t.setClickable(false);
        this.f32530t.setPressable(false);
        this.f32530t.setFocusable(false);
    }

    private void D(f0 f0Var) {
        this.f32521H.setVisibility(8);
        this.f32521H.setId(D3.f.f1528R);
        this.f32521H.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        X.p0(this.f32521H, 1);
        q0(f0Var.n(D3.l.X7, 0));
        if (f0Var.s(D3.l.Y7)) {
            r0(f0Var.c(D3.l.Y7));
        }
        p0(f0Var.p(D3.l.W7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        AbstractC0366c.a aVar = this.f32525L;
        if (aVar == null || (accessibilityManager = this.f32524K) == null) {
            return;
        }
        AbstractC0366c.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f32525L == null || this.f32524K == null || !X.Q(this)) {
            return;
        }
        AbstractC0366c.a(this.f32524K, this.f32525L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(t tVar) {
        if (this.f32523J == null) {
            return;
        }
        if (tVar.e() != null) {
            this.f32523J.setOnFocusChangeListener(tVar.e());
        }
        if (tVar.g() != null) {
            this.f32534x.setOnFocusChangeListener(tVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i8) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(D3.h.f1563f, viewGroup, false);
        checkableImageButton.setId(i8);
        u.e(checkableImageButton);
        if (S3.c.h(getContext())) {
            AbstractC7054v.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i8) {
        Iterator it = this.f32514A.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.E.a(it.next());
            throw null;
        }
    }

    private void s0(t tVar) {
        tVar.s();
        this.f32525L = tVar.h();
        g();
    }

    private int t(t tVar) {
        int i8 = this.f32535y.f32542c;
        return i8 == 0 ? tVar.d() : i8;
    }

    private void t0(t tVar) {
        M();
        this.f32525L = null;
        tVar.u();
    }

    private void u0(boolean z7) {
        if (!z7 || n() == null) {
            u.a(this.f32528o, this.f32534x, this.f32515B, this.f32516C);
            return;
        }
        Drawable mutate = AbstractC6641a.r(n()).mutate();
        AbstractC6641a.n(mutate, this.f32528o.getErrorCurrentTextColors());
        this.f32534x.setImageDrawable(mutate);
    }

    private void v0() {
        this.f32529s.setVisibility((this.f32534x.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f32520G == null || this.f32522I) ? 8 : false)) ? 0 : 8);
    }

    private void w0() {
        this.f32530t.setVisibility(s() != null && this.f32528o.N() && this.f32528o.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f32528o.o0();
    }

    private void y0() {
        int visibility = this.f32521H.getVisibility();
        int i8 = (this.f32520G == null || this.f32522I) ? 8 : 0;
        if (visibility != i8) {
            m().q(i8 == 0);
        }
        v0();
        this.f32521H.setVisibility(i8);
        this.f32528o.o0();
    }

    boolean A() {
        return this.f32536z != 0;
    }

    boolean E() {
        return A() && this.f32534x.isChecked();
    }

    boolean F() {
        return this.f32529s.getVisibility() == 0 && this.f32534x.getVisibility() == 0;
    }

    boolean G() {
        return this.f32530t.getVisibility() == 0;
    }

    void H(boolean z7) {
        this.f32522I = z7;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f32528o.d0());
        }
    }

    void J() {
        u.d(this.f32528o, this.f32534x, this.f32515B);
    }

    void K() {
        u.d(this.f32528o, this.f32530t, this.f32531u);
    }

    void L(boolean z7) {
        boolean z8;
        boolean isActivated;
        boolean isChecked;
        t m8 = m();
        boolean z9 = true;
        if (!m8.l() || (isChecked = this.f32534x.isChecked()) == m8.m()) {
            z8 = false;
        } else {
            this.f32534x.setChecked(!isChecked);
            z8 = true;
        }
        if (!m8.j() || (isActivated = this.f32534x.isActivated()) == m8.k()) {
            z9 = z8;
        } else {
            N(!isActivated);
        }
        if (z7 || z9) {
            J();
        }
    }

    void N(boolean z7) {
        this.f32534x.setActivated(z7);
    }

    void O(boolean z7) {
        this.f32534x.setCheckable(z7);
    }

    void P(int i8) {
        Q(i8 != 0 ? getResources().getText(i8) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f32534x.setContentDescription(charSequence);
        }
    }

    void R(int i8) {
        S(i8 != 0 ? AbstractC5794a.b(getContext(), i8) : null);
    }

    void S(Drawable drawable) {
        this.f32534x.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f32528o, this.f32534x, this.f32515B, this.f32516C);
            J();
        }
    }

    void T(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i8 != this.f32517D) {
            this.f32517D = i8;
            u.g(this.f32534x, i8);
            u.g(this.f32530t, i8);
        }
    }

    void U(int i8) {
        if (this.f32536z == i8) {
            return;
        }
        t0(m());
        int i9 = this.f32536z;
        this.f32536z = i8;
        j(i9);
        a0(i8 != 0);
        t m8 = m();
        R(t(m8));
        P(m8.c());
        O(m8.l());
        if (!m8.i(this.f32528o.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f32528o.getBoxBackgroundMode() + " is not supported by the end icon mode " + i8);
        }
        s0(m8);
        V(m8.f());
        EditText editText = this.f32523J;
        if (editText != null) {
            m8.n(editText);
            h0(m8);
        }
        u.a(this.f32528o, this.f32534x, this.f32515B, this.f32516C);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        u.h(this.f32534x, onClickListener, this.f32519F);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f32519F = onLongClickListener;
        u.i(this.f32534x, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f32518E = scaleType;
        u.j(this.f32534x, scaleType);
        u.j(this.f32530t, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f32515B != colorStateList) {
            this.f32515B = colorStateList;
            u.a(this.f32528o, this.f32534x, colorStateList, this.f32516C);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f32516C != mode) {
            this.f32516C = mode;
            u.a(this.f32528o, this.f32534x, this.f32515B, mode);
        }
    }

    void a0(boolean z7) {
        if (F() != z7) {
            this.f32534x.setVisibility(z7 ? 0 : 8);
            v0();
            x0();
            this.f32528o.o0();
        }
    }

    void b0(int i8) {
        c0(i8 != 0 ? AbstractC5794a.b(getContext(), i8) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f32530t.setImageDrawable(drawable);
        w0();
        u.a(this.f32528o, this.f32530t, this.f32531u, this.f32532v);
    }

    void d0(View.OnClickListener onClickListener) {
        u.h(this.f32530t, onClickListener, this.f32533w);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f32533w = onLongClickListener;
        u.i(this.f32530t, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f32531u != colorStateList) {
            this.f32531u = colorStateList;
            u.a(this.f32528o, this.f32530t, colorStateList, this.f32532v);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f32532v != mode) {
            this.f32532v = mode;
            u.a(this.f32528o, this.f32530t, this.f32531u, mode);
        }
    }

    void h() {
        this.f32534x.performClick();
        this.f32534x.jumpDrawablesToCurrentState();
    }

    void i0(int i8) {
        j0(i8 != 0 ? getResources().getText(i8) : null);
    }

    void j0(CharSequence charSequence) {
        this.f32534x.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f32530t;
        }
        if (A() && F()) {
            return this.f32534x;
        }
        return null;
    }

    void k0(int i8) {
        l0(i8 != 0 ? AbstractC5794a.b(getContext(), i8) : null);
    }

    CharSequence l() {
        return this.f32534x.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f32534x.setImageDrawable(drawable);
    }

    t m() {
        return this.f32535y.c(this.f32536z);
    }

    void m0(boolean z7) {
        if (z7 && this.f32536z != 1) {
            U(1);
        } else {
            if (z7) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f32534x.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f32515B = colorStateList;
        u.a(this.f32528o, this.f32534x, colorStateList, this.f32516C);
    }

    int o() {
        return this.f32517D;
    }

    void o0(PorterDuff.Mode mode) {
        this.f32516C = mode;
        u.a(this.f32528o, this.f32534x, this.f32515B, mode);
    }

    int p() {
        return this.f32536z;
    }

    void p0(CharSequence charSequence) {
        this.f32520G = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f32521H.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f32518E;
    }

    void q0(int i8) {
        androidx.core.widget.h.p(this.f32521H, i8);
    }

    CheckableImageButton r() {
        return this.f32534x;
    }

    void r0(ColorStateList colorStateList) {
        this.f32521H.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f32530t.getDrawable();
    }

    CharSequence u() {
        return this.f32534x.getContentDescription();
    }

    Drawable v() {
        return this.f32534x.getDrawable();
    }

    CharSequence w() {
        return this.f32520G;
    }

    ColorStateList x() {
        return this.f32521H.getTextColors();
    }

    void x0() {
        if (this.f32528o.f32453u == null) {
            return;
        }
        X.B0(this.f32521H, getContext().getResources().getDimensionPixelSize(D3.d.f1447J), this.f32528o.f32453u.getPaddingTop(), (F() || G()) ? 0 : X.D(this.f32528o.f32453u), this.f32528o.f32453u.getPaddingBottom());
    }

    int y() {
        return X.D(this) + X.D(this.f32521H) + ((F() || G()) ? this.f32534x.getMeasuredWidth() + AbstractC7054v.b((ViewGroup.MarginLayoutParams) this.f32534x.getLayoutParams()) : 0);
    }

    TextView z() {
        return this.f32521H;
    }
}
