package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.f0;
import com.google.android.material.internal.CheckableImageButton;
import z0.AbstractC7054v;
import z0.X;

/* loaded from: classes2.dex */
class A extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    private boolean f32373A;

    /* renamed from: o, reason: collision with root package name */
    private final TextInputLayout f32374o;

    /* renamed from: s, reason: collision with root package name */
    private final TextView f32375s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f32376t;

    /* renamed from: u, reason: collision with root package name */
    private final CheckableImageButton f32377u;

    /* renamed from: v, reason: collision with root package name */
    private ColorStateList f32378v;

    /* renamed from: w, reason: collision with root package name */
    private PorterDuff.Mode f32379w;

    /* renamed from: x, reason: collision with root package name */
    private int f32380x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView.ScaleType f32381y;

    /* renamed from: z, reason: collision with root package name */
    private View.OnLongClickListener f32382z;

    A(TextInputLayout textInputLayout, f0 f0Var) {
        super(textInputLayout.getContext());
        this.f32374o = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(D3.h.f1564g, (ViewGroup) this, false);
        this.f32377u = checkableImageButton;
        u.e(checkableImageButton);
        androidx.appcompat.widget.D d8 = new androidx.appcompat.widget.D(getContext());
        this.f32375s = d8;
        j(f0Var);
        i(f0Var);
        addView(checkableImageButton);
        addView(d8);
    }

    private void C() {
        int i8 = (this.f32376t == null || this.f32373A) ? 8 : 0;
        setVisibility((this.f32377u.getVisibility() == 0 || i8 == 0) ? 0 : 8);
        this.f32375s.setVisibility(i8);
        this.f32374o.o0();
    }

    private void i(f0 f0Var) {
        this.f32375s.setVisibility(8);
        this.f32375s.setId(D3.f.f1527Q);
        this.f32375s.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        X.p0(this.f32375s, 1);
        o(f0Var.n(D3.l.N7, 0));
        if (f0Var.s(D3.l.O7)) {
            p(f0Var.c(D3.l.O7));
        }
        n(f0Var.p(D3.l.M7));
    }

    private void j(f0 f0Var) {
        if (S3.c.h(getContext())) {
            AbstractC7054v.c((ViewGroup.MarginLayoutParams) this.f32377u.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        if (f0Var.s(D3.l.U7)) {
            this.f32378v = S3.c.b(getContext(), f0Var, D3.l.U7);
        }
        if (f0Var.s(D3.l.V7)) {
            this.f32379w = com.google.android.material.internal.o.i(f0Var.k(D3.l.V7, -1), null);
        }
        if (f0Var.s(D3.l.R7)) {
            s(f0Var.g(D3.l.R7));
            if (f0Var.s(D3.l.Q7)) {
                r(f0Var.p(D3.l.Q7));
            }
            q(f0Var.a(D3.l.P7, true));
        }
        t(f0Var.f(D3.l.S7, getResources().getDimensionPixelSize(D3.d.f1471d0)));
        if (f0Var.s(D3.l.T7)) {
            w(u.b(f0Var.k(D3.l.T7, -1)));
        }
    }

    void A(A0.z zVar) {
        if (this.f32375s.getVisibility() != 0) {
            zVar.J0(this.f32377u);
        } else {
            zVar.w0(this.f32375s);
            zVar.J0(this.f32375s);
        }
    }

    void B() {
        EditText editText = this.f32374o.f32453u;
        if (editText == null) {
            return;
        }
        X.B0(this.f32375s, k() ? 0 : X.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(D3.d.f1447J), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f32376t;
    }

    ColorStateList b() {
        return this.f32375s.getTextColors();
    }

    int c() {
        return X.E(this) + X.E(this.f32375s) + (k() ? this.f32377u.getMeasuredWidth() + AbstractC7054v.a((ViewGroup.MarginLayoutParams) this.f32377u.getLayoutParams()) : 0);
    }

    TextView d() {
        return this.f32375s;
    }

    CharSequence e() {
        return this.f32377u.getContentDescription();
    }

    Drawable f() {
        return this.f32377u.getDrawable();
    }

    int g() {
        return this.f32380x;
    }

    ImageView.ScaleType h() {
        return this.f32381y;
    }

    boolean k() {
        return this.f32377u.getVisibility() == 0;
    }

    void l(boolean z7) {
        this.f32373A = z7;
        C();
    }

    void m() {
        u.d(this.f32374o, this.f32377u, this.f32378v);
    }

    void n(CharSequence charSequence) {
        this.f32376t = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f32375s.setText(charSequence);
        C();
    }

    void o(int i8) {
        androidx.core.widget.h.p(this.f32375s, i8);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.f32375s.setTextColor(colorStateList);
    }

    void q(boolean z7) {
        this.f32377u.setCheckable(z7);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f32377u.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f32377u.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f32374o, this.f32377u, this.f32378v, this.f32379w);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i8 != this.f32380x) {
            this.f32380x = i8;
            u.g(this.f32377u, i8);
        }
    }

    void u(View.OnClickListener onClickListener) {
        u.h(this.f32377u, onClickListener, this.f32382z);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f32382z = onLongClickListener;
        u.i(this.f32377u, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f32381y = scaleType;
        u.j(this.f32377u, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f32378v != colorStateList) {
            this.f32378v = colorStateList;
            u.a(this.f32374o, this.f32377u, colorStateList, this.f32379w);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f32379w != mode) {
            this.f32379w = mode;
            u.a(this.f32374o, this.f32377u, this.f32378v, mode);
        }
    }

    void z(boolean z7) {
        if (k() != z7) {
            this.f32377u.setVisibility(z7 ? 0 : 8);
            B();
            C();
        }
    }
}
