package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import z0.X;

/* loaded from: classes2.dex */
final class v {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f32548A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f32549B;

    /* renamed from: a, reason: collision with root package name */
    private final int f32550a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32551b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32552c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f32553d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f32554e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f32555f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f32556g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f32557h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f32558i;

    /* renamed from: j, reason: collision with root package name */
    private int f32559j;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f32560k;

    /* renamed from: l, reason: collision with root package name */
    private Animator f32561l;

    /* renamed from: m, reason: collision with root package name */
    private final float f32562m;

    /* renamed from: n, reason: collision with root package name */
    private int f32563n;

    /* renamed from: o, reason: collision with root package name */
    private int f32564o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f32565p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f32566q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f32567r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f32568s;

    /* renamed from: t, reason: collision with root package name */
    private int f32569t;

    /* renamed from: u, reason: collision with root package name */
    private int f32570u;

    /* renamed from: v, reason: collision with root package name */
    private ColorStateList f32571v;

    /* renamed from: w, reason: collision with root package name */
    private CharSequence f32572w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f32573x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f32574y;

    /* renamed from: z, reason: collision with root package name */
    private int f32575z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32576a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f32577b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32578c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f32579d;

        a(int i8, TextView textView, int i9, TextView textView2) {
            this.f32576a = i8;
            this.f32577b = textView;
            this.f32578c = i9;
            this.f32579d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            v.this.f32563n = this.f32576a;
            v.this.f32561l = null;
            TextView textView = this.f32577b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f32578c == 1 && v.this.f32567r != null) {
                    v.this.f32567r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f32579d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f32579d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f32579d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f32579d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = v.this.f32557h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f32556g = context;
        this.f32557h = textInputLayout;
        this.f32562m = context.getResources().getDimensionPixelSize(D3.d.f1480i);
        this.f32550a = Q3.d.f(context, D3.b.f1381E, 217);
        this.f32551b = Q3.d.f(context, D3.b.f1378B, 167);
        this.f32552c = Q3.d.f(context, D3.b.f1381E, 167);
        this.f32553d = Q3.d.g(context, D3.b.f1383G, E3.a.f2148d);
        int i8 = D3.b.f1383G;
        TimeInterpolator timeInterpolator = E3.a.f2145a;
        this.f32554e = Q3.d.g(context, i8, timeInterpolator);
        this.f32555f = Q3.d.g(context, D3.b.f1385I, timeInterpolator);
    }

    private void D(int i8, int i9) {
        TextView m8;
        TextView m9;
        if (i8 == i9) {
            return;
        }
        if (i9 != 0 && (m9 = m(i9)) != null) {
            m9.setVisibility(0);
            m9.setAlpha(1.0f);
        }
        if (i8 != 0 && (m8 = m(i8)) != null) {
            m8.setVisibility(4);
            if (i8 == 1) {
                m8.setText((CharSequence) null);
            }
        }
        this.f32563n = i9;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i8) {
        if (i8 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return X.R(this.f32557h) && this.f32557h.isEnabled() && !(this.f32564o == this.f32563n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i8, int i9, boolean z7) {
        if (i8 == i9) {
            return;
        }
        if (z7) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f32561l = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f32573x, this.f32574y, 2, i8, i9);
            i(arrayList, this.f32566q, this.f32567r, 1, i8, i9);
            E3.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i9, m(i8), i8, m(i9)));
            animatorSet.start();
        } else {
            D(i8, i9);
        }
        this.f32557h.p0();
        this.f32557h.u0(z7);
        this.f32557h.A0();
    }

    private boolean g() {
        return (this.f32558i == null || this.f32557h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z7, TextView textView, int i8, int i9, int i10) {
        if (textView == null || !z7) {
            return;
        }
        if (i8 == i10 || i8 == i9) {
            ObjectAnimator j8 = j(textView, i10 == i8);
            if (i8 == i10 && i9 != 0) {
                j8.setStartDelay(this.f32552c);
            }
            list.add(j8);
            if (i10 != i8 || i9 == 0) {
                return;
            }
            ObjectAnimator k8 = k(textView);
            k8.setStartDelay(this.f32552c);
            list.add(k8);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z7) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z7 ? 1.0f : 0.0f);
        ofFloat.setDuration(z7 ? this.f32551b : this.f32552c);
        ofFloat.setInterpolator(z7 ? this.f32554e : this.f32555f);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f32562m, 0.0f);
        ofFloat.setDuration(this.f32550a);
        ofFloat.setInterpolator(this.f32553d);
        return ofFloat;
    }

    private TextView m(int i8) {
        if (i8 == 1) {
            return this.f32567r;
        }
        if (i8 != 2) {
            return null;
        }
        return this.f32574y;
    }

    private int v(boolean z7, int i8, int i9) {
        return z7 ? this.f32556g.getResources().getDimensionPixelSize(i8) : i9;
    }

    private boolean y(int i8) {
        return (i8 != 1 || this.f32567r == null || TextUtils.isEmpty(this.f32565p)) ? false : true;
    }

    boolean A() {
        return this.f32566q;
    }

    boolean B() {
        return this.f32573x;
    }

    void C(TextView textView, int i8) {
        FrameLayout frameLayout;
        if (this.f32558i == null) {
            return;
        }
        if (!z(i8) || (frameLayout = this.f32560k) == null) {
            this.f32558i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i9 = this.f32559j - 1;
        this.f32559j = i9;
        O(this.f32558i, i9);
    }

    void E(int i8) {
        this.f32569t = i8;
        TextView textView = this.f32567r;
        if (textView != null) {
            X.p0(textView, i8);
        }
    }

    void F(CharSequence charSequence) {
        this.f32568s = charSequence;
        TextView textView = this.f32567r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z7) {
        if (this.f32566q == z7) {
            return;
        }
        h();
        if (z7) {
            androidx.appcompat.widget.D d8 = new androidx.appcompat.widget.D(this.f32556g);
            this.f32567r = d8;
            d8.setId(D3.f.f1524N);
            this.f32567r.setTextAlignment(5);
            Typeface typeface = this.f32549B;
            if (typeface != null) {
                this.f32567r.setTypeface(typeface);
            }
            H(this.f32570u);
            I(this.f32571v);
            F(this.f32568s);
            E(this.f32569t);
            this.f32567r.setVisibility(4);
            e(this.f32567r, 0);
        } else {
            w();
            C(this.f32567r, 0);
            this.f32567r = null;
            this.f32557h.p0();
            this.f32557h.A0();
        }
        this.f32566q = z7;
    }

    void H(int i8) {
        this.f32570u = i8;
        TextView textView = this.f32567r;
        if (textView != null) {
            this.f32557h.c0(textView, i8);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f32571v = colorStateList;
        TextView textView = this.f32567r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i8) {
        this.f32575z = i8;
        TextView textView = this.f32574y;
        if (textView != null) {
            androidx.core.widget.h.p(textView, i8);
        }
    }

    void K(boolean z7) {
        if (this.f32573x == z7) {
            return;
        }
        h();
        if (z7) {
            androidx.appcompat.widget.D d8 = new androidx.appcompat.widget.D(this.f32556g);
            this.f32574y = d8;
            d8.setId(D3.f.f1525O);
            this.f32574y.setTextAlignment(5);
            Typeface typeface = this.f32549B;
            if (typeface != null) {
                this.f32574y.setTypeface(typeface);
            }
            this.f32574y.setVisibility(4);
            X.p0(this.f32574y, 1);
            J(this.f32575z);
            L(this.f32548A);
            e(this.f32574y, 1);
            this.f32574y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f32574y, 1);
            this.f32574y = null;
            this.f32557h.p0();
            this.f32557h.A0();
        }
        this.f32573x = z7;
    }

    void L(ColorStateList colorStateList) {
        this.f32548A = colorStateList;
        TextView textView = this.f32574y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.f32549B) {
            this.f32549B = typeface;
            M(this.f32567r, typeface);
            M(this.f32574y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f32565p = charSequence;
        this.f32567r.setText(charSequence);
        int i8 = this.f32563n;
        if (i8 != 1) {
            this.f32564o = 1;
        }
        S(i8, this.f32564o, P(this.f32567r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f32572w = charSequence;
        this.f32574y.setText(charSequence);
        int i8 = this.f32563n;
        if (i8 != 2) {
            this.f32564o = 2;
        }
        S(i8, this.f32564o, P(this.f32574y, charSequence));
    }

    void e(TextView textView, int i8) {
        if (this.f32558i == null && this.f32560k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f32556g);
            this.f32558i = linearLayout;
            linearLayout.setOrientation(0);
            this.f32557h.addView(this.f32558i, -1, -2);
            this.f32560k = new FrameLayout(this.f32556g);
            this.f32558i.addView(this.f32560k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f32557h.getEditText() != null) {
                f();
            }
        }
        if (z(i8)) {
            this.f32560k.setVisibility(0);
            this.f32560k.addView(textView);
        } else {
            this.f32558i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f32558i.setVisibility(0);
        this.f32559j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f32557h.getEditText();
            boolean h8 = S3.c.h(this.f32556g);
            X.B0(this.f32558i, v(h8, D3.d.f1445H, X.E(editText)), v(h8, D3.d.f1446I, this.f32556g.getResources().getDimensionPixelSize(D3.d.f1444G)), v(h8, D3.d.f1445H, X.D(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f32561l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f32564o);
    }

    int n() {
        return this.f32569t;
    }

    CharSequence o() {
        return this.f32568s;
    }

    CharSequence p() {
        return this.f32565p;
    }

    int q() {
        TextView textView = this.f32567r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f32567r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f32572w;
    }

    View t() {
        return this.f32574y;
    }

    int u() {
        TextView textView = this.f32574y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f32565p = null;
        h();
        if (this.f32563n == 1) {
            if (!this.f32573x || TextUtils.isEmpty(this.f32572w)) {
                this.f32564o = 0;
            } else {
                this.f32564o = 2;
            }
        }
        S(this.f32563n, this.f32564o, P(this.f32567r, ""));
    }

    void x() {
        h();
        int i8 = this.f32563n;
        if (i8 == 2) {
            this.f32564o = 0;
        }
        S(i8, this.f32564o, P(this.f32574y, ""));
    }

    boolean z(int i8) {
        return i8 == 0 || i8 == 1;
    }
}
