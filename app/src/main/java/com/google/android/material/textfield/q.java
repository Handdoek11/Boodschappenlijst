package com.google.android.material.textfield;

import A0.AbstractC0366c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import z0.X;

/* loaded from: classes2.dex */
class q extends t {

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f32498s = true;

    /* renamed from: e, reason: collision with root package name */
    private final int f32499e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32500f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f32501g;

    /* renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f32502h;

    /* renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f32503i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f32504j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC0366c.a f32505k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f32506l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f32507m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f32508n;

    /* renamed from: o, reason: collision with root package name */
    private long f32509o;

    /* renamed from: p, reason: collision with root package name */
    private AccessibilityManager f32510p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f32511q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f32512r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f32512r.start();
        }
    }

    q(s sVar) {
        super(sVar);
        this.f32503i = new View.OnClickListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32494o.J(view);
            }
        };
        this.f32504j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z7) {
                this.f32495a.K(view, z7);
            }
        };
        this.f32505k = new AbstractC0366c.a() { // from class: com.google.android.material.textfield.o
            @Override // A0.AbstractC0366c.a
            public final void onTouchExplorationStateChanged(boolean z7) {
                this.f32496a.L(z7);
            }
        };
        this.f32509o = Long.MAX_VALUE;
        this.f32500f = Q3.d.f(sVar.getContext(), D3.b.f1380D, 67);
        this.f32499e = Q3.d.f(sVar.getContext(), D3.b.f1380D, 50);
        this.f32501g = Q3.d.g(sVar.getContext(), D3.b.f1385I, E3.a.f2145a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i8, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f32501g);
        ofFloat.setDuration(i8);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f32491a.I(valueAnimator);
            }
        });
        return ofFloat;
    }

    private void F() {
        this.f32512r = E(this.f32500f, 0.0f, 1.0f);
        ValueAnimator E7 = E(this.f32499e, 1.0f, 0.0f);
        this.f32511q = E7;
        E7.addListener(new a());
    }

    private boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f32509o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean isPopupShowing = this.f32502h.isPopupShowing();
        O(isPopupShowing);
        this.f32507m = isPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f32547d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z7) {
        this.f32506l = z7;
        r();
        if (z7) {
            return;
        }
        O(false);
        this.f32507m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z7) {
        AutoCompleteTextView autoCompleteTextView = this.f32502h;
        if (autoCompleteTextView == null || r.a(autoCompleteTextView)) {
            return;
        }
        X.w0(this.f32547d, z7 ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f32507m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z7) {
        if (this.f32508n != z7) {
            this.f32508n = z7;
            this.f32512r.cancel();
            this.f32511q.start();
        }
    }

    private void P() {
        this.f32502h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f32492o.M(view, motionEvent);
            }
        });
        if (f32498s) {
            this.f32502h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.l
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f32493a.N();
                }
            });
        }
        this.f32502h.setThreshold(0);
    }

    private void Q() {
        if (this.f32502h == null) {
            return;
        }
        if (G()) {
            this.f32507m = false;
        }
        if (this.f32507m) {
            this.f32507m = false;
            return;
        }
        if (f32498s) {
            O(!this.f32508n);
        } else {
            this.f32508n = !this.f32508n;
            r();
        }
        if (!this.f32508n) {
            this.f32502h.dismissDropDown();
        } else {
            this.f32502h.requestFocus();
            this.f32502h.showDropDown();
        }
    }

    private void R() {
        this.f32507m = true;
        this.f32509o = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.t
    public void a(Editable editable) {
        if (this.f32510p.isTouchExplorationEnabled() && r.a(this.f32502h) && !this.f32547d.hasFocus()) {
            this.f32502h.dismissDropDown();
        }
        this.f32502h.post(new Runnable() { // from class: com.google.android.material.textfield.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f32497o.H();
            }
        });
    }

    @Override // com.google.android.material.textfield.t
    int c() {
        return D3.j.f1591g;
    }

    @Override // com.google.android.material.textfield.t
    int d() {
        return f32498s ? D3.e.f1507g : D3.e.f1508h;
    }

    @Override // com.google.android.material.textfield.t
    View.OnFocusChangeListener e() {
        return this.f32504j;
    }

    @Override // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.f32503i;
    }

    @Override // com.google.android.material.textfield.t
    public AbstractC0366c.a h() {
        return this.f32505k;
    }

    @Override // com.google.android.material.textfield.t
    boolean i(int i8) {
        return i8 != 0;
    }

    @Override // com.google.android.material.textfield.t
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    boolean k() {
        return this.f32506l;
    }

    @Override // com.google.android.material.textfield.t
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    boolean m() {
        return this.f32508n;
    }

    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f32502h = D(editText);
        P();
        this.f32544a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f32510p.isTouchExplorationEnabled()) {
            X.w0(this.f32547d, 2);
        }
        this.f32544a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.t
    public void o(View view, A0.z zVar) {
        if (!r.a(this.f32502h)) {
            zVar.k0(Spinner.class.getName());
        }
        if (zVar.U()) {
            zVar.v0(null);
        }
    }

    @Override // com.google.android.material.textfield.t
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f32510p.isEnabled() || r.a(this.f32502h)) {
            return;
        }
        boolean z7 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f32508n && !this.f32502h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z7) {
            Q();
            R();
        }
    }

    @Override // com.google.android.material.textfield.t
    void s() {
        F();
        this.f32510p = (AccessibilityManager) this.f32546c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.t
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f32502h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f32498s) {
                this.f32502h.setOnDismissListener(null);
            }
        }
    }
}
