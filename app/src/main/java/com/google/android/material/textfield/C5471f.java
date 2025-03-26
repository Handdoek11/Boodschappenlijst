package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.google.android.material.textfield.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5471f extends t {

    /* renamed from: e, reason: collision with root package name */
    private final int f32478e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32479f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f32480g;

    /* renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f32481h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f32482i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f32483j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f32484k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f32485l;

    /* renamed from: m, reason: collision with root package name */
    private ValueAnimator f32486m;

    /* renamed from: com.google.android.material.textfield.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C5471f.this.f32545b.a0(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.f$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5471f.this.f32545b.a0(false);
        }
    }

    C5471f(s sVar) {
        super(sVar);
        this.f32483j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32473o.G(view);
            }
        };
        this.f32484k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z7) {
                this.f32474a.H(view, z7);
            }
        };
        this.f32478e = Q3.d.f(sVar.getContext(), D3.b.f1380D, 100);
        this.f32479f = Q3.d.f(sVar.getContext(), D3.b.f1380D, 150);
        this.f32480g = Q3.d.g(sVar.getContext(), D3.b.f1385I, E3.a.f2145a);
        this.f32481h = Q3.d.g(sVar.getContext(), D3.b.f1384H, E3.a.f2148d);
    }

    private void A(boolean z7) {
        boolean z8 = this.f32545b.F() == z7;
        if (z7 && !this.f32485l.isRunning()) {
            this.f32486m.cancel();
            this.f32485l.start();
            if (z8) {
                this.f32485l.end();
                return;
            }
            return;
        }
        if (z7) {
            return;
        }
        this.f32485l.cancel();
        this.f32486m.start();
        if (z8) {
            this.f32486m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f32480g);
        ofFloat.setDuration(this.f32478e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f32475a.E(valueAnimator);
            }
        });
        return ofFloat;
    }

    private ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f32481h);
        ofFloat.setDuration(this.f32479f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f32477a.F(valueAnimator);
            }
        });
        return ofFloat;
    }

    private void D() {
        ValueAnimator C7 = C();
        ValueAnimator B7 = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32485l = animatorSet;
        animatorSet.playTogether(C7, B7);
        this.f32485l.addListener(new a());
        ValueAnimator B8 = B(1.0f, 0.0f);
        this.f32486m = B8;
        B8.addListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f32547d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f32547d.setScaleX(floatValue);
        this.f32547d.setScaleY(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f32482i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z7) {
        A(J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f32482i;
        return editText != null && (editText.hasFocus() || this.f32547d.hasFocus()) && this.f32482i.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.t
    void a(Editable editable) {
        if (this.f32545b.w() != null) {
            return;
        }
        A(J());
    }

    @Override // com.google.android.material.textfield.t
    int c() {
        return D3.j.f1589e;
    }

    @Override // com.google.android.material.textfield.t
    int d() {
        return D3.e.f1509i;
    }

    @Override // com.google.android.material.textfield.t
    View.OnFocusChangeListener e() {
        return this.f32484k;
    }

    @Override // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.f32483j;
    }

    @Override // com.google.android.material.textfield.t
    View.OnFocusChangeListener g() {
        return this.f32484k;
    }

    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f32482i = editText;
        this.f32544a.setEndIconVisible(J());
    }

    @Override // com.google.android.material.textfield.t
    void q(boolean z7) {
        if (this.f32545b.w() == null) {
            return;
        }
        A(z7);
    }

    @Override // com.google.android.material.textfield.t
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.t
    void u() {
        EditText editText = this.f32482i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32476o.I();
                }
            });
        }
    }
}
