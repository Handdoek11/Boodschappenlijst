package com.google.android.material.floatingactionbutton;

import V3.n;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import r0.AbstractC6641a;
import z0.X;

/* loaded from: classes2.dex */
abstract class b {

    /* renamed from: D, reason: collision with root package name */
    static final TimeInterpolator f31938D = E3.a.f2147c;

    /* renamed from: E, reason: collision with root package name */
    private static final int f31939E = D3.b.f1426y;

    /* renamed from: F, reason: collision with root package name */
    private static final int f31940F = D3.b.f1384H;

    /* renamed from: G, reason: collision with root package name */
    private static final int f31941G = D3.b.f1427z;

    /* renamed from: H, reason: collision with root package name */
    private static final int f31942H = D3.b.f1382F;

    /* renamed from: I, reason: collision with root package name */
    static final int[] f31943I = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    static final int[] f31944J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: K, reason: collision with root package name */
    static final int[] f31945K = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: L, reason: collision with root package name */
    static final int[] f31946L = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: M, reason: collision with root package name */
    static final int[] f31947M = {R.attr.state_enabled};

    /* renamed from: N, reason: collision with root package name */
    static final int[] f31948N = new int[0];

    /* renamed from: C, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f31951C;

    /* renamed from: a, reason: collision with root package name */
    V3.k f31952a;

    /* renamed from: b, reason: collision with root package name */
    V3.g f31953b;

    /* renamed from: c, reason: collision with root package name */
    Drawable f31954c;

    /* renamed from: d, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.a f31955d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f31956e;

    /* renamed from: f, reason: collision with root package name */
    boolean f31957f;

    /* renamed from: h, reason: collision with root package name */
    float f31959h;

    /* renamed from: i, reason: collision with root package name */
    float f31960i;

    /* renamed from: j, reason: collision with root package name */
    float f31961j;

    /* renamed from: k, reason: collision with root package name */
    int f31962k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.android.material.internal.g f31963l;

    /* renamed from: m, reason: collision with root package name */
    private Animator f31964m;

    /* renamed from: n, reason: collision with root package name */
    private E3.f f31965n;

    /* renamed from: o, reason: collision with root package name */
    private E3.f f31966o;

    /* renamed from: p, reason: collision with root package name */
    private float f31967p;

    /* renamed from: r, reason: collision with root package name */
    private int f31969r;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f31971t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f31972u;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f31973v;

    /* renamed from: w, reason: collision with root package name */
    final FloatingActionButton f31974w;

    /* renamed from: x, reason: collision with root package name */
    final U3.b f31975x;

    /* renamed from: g, reason: collision with root package name */
    boolean f31958g = true;

    /* renamed from: q, reason: collision with root package name */
    private float f31968q = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    private int f31970s = 0;

    /* renamed from: y, reason: collision with root package name */
    private final Rect f31976y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    private final RectF f31977z = new RectF();

    /* renamed from: A, reason: collision with root package name */
    private final RectF f31949A = new RectF();

    /* renamed from: B, reason: collision with root package name */
    private final Matrix f31950B = new Matrix();

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f31978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31979b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f31980c;

        a(boolean z7, k kVar) {
            this.f31979b = z7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f31978a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.f31970s = 0;
            b.this.f31964m = null;
            if (this.f31978a) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.f31974w;
            boolean z7 = this.f31979b;
            floatingActionButton.b(z7 ? 8 : 4, z7);
            k kVar = this.f31980c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f31974w.b(0, this.f31979b);
            b.this.f31970s = 1;
            b.this.f31964m = animator;
            this.f31978a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    class C0236b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31982a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f31983b;

        C0236b(boolean z7, k kVar) {
            this.f31982a = z7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.f31970s = 0;
            b.this.f31964m = null;
            k kVar = this.f31983b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f31974w.b(0, this.f31982a);
            b.this.f31970s = 2;
            b.this.f31964m = animator;
        }
    }

    class c extends E3.e {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f8, Matrix matrix, Matrix matrix2) {
            b.this.f31968q = f8;
            return super.evaluate(f8, matrix, matrix2);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f31986a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f31987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f31988c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f31989d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f31990e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f31991f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f31992g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Matrix f31993h;

        d(float f8, float f9, float f10, float f11, float f12, float f13, float f14, Matrix matrix) {
            this.f31986a = f8;
            this.f31987b = f9;
            this.f31988c = f10;
            this.f31989d = f11;
            this.f31990e = f12;
            this.f31991f = f13;
            this.f31992g = f14;
            this.f31993h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.f31974w.setAlpha(E3.a.b(this.f31986a, this.f31987b, 0.0f, 0.2f, floatValue));
            b.this.f31974w.setScaleX(E3.a.a(this.f31988c, this.f31989d, floatValue));
            b.this.f31974w.setScaleY(E3.a.a(this.f31990e, this.f31989d, floatValue));
            b.this.f31968q = E3.a.a(this.f31991f, this.f31992g, floatValue);
            b.this.e(E3.a.a(this.f31991f, this.f31992g, floatValue), this.f31993h);
            b.this.f31974w.setImageMatrix(this.f31993h);
        }
    }

    class e implements TypeEvaluator {

        /* renamed from: a, reason: collision with root package name */
        FloatEvaluator f31995a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f8, Float f9, Float f10) {
            float floatValue = this.f31995a.evaluate(f8, (Number) f9, (Number) f10).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.E();
            return true;
        }
    }

    private class g extends m {
        g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            return 0.0f;
        }
    }

    private class h extends m {
        h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            b bVar = b.this;
            return bVar.f31959h + bVar.f31960i;
        }
    }

    private class i extends m {
        i() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            b bVar = b.this;
            return bVar.f31959h + bVar.f31961j;
        }
    }

    interface j {
        void a();

        void b();
    }

    interface k {
        void a();

        void b();
    }

    private class l extends m {
        l() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.m
        protected float a() {
            return b.this.f31959h;
        }
    }

    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f32002a;

        /* renamed from: b, reason: collision with root package name */
        private float f32003b;

        /* renamed from: c, reason: collision with root package name */
        private float f32004c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.d0((int) this.f32004c);
            this.f32002a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f32002a) {
                V3.g gVar = b.this.f31953b;
                this.f32003b = gVar == null ? 0.0f : gVar.u();
                this.f32004c = a();
                this.f32002a = true;
            }
            b bVar = b.this;
            float f8 = this.f32003b;
            bVar.d0((int) (f8 + ((this.f32004c - f8) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(b bVar, a aVar) {
            this();
        }
    }

    b(FloatingActionButton floatingActionButton, U3.b bVar) {
        this.f31974w = floatingActionButton;
        this.f31975x = bVar;
        com.google.android.material.internal.g gVar = new com.google.android.material.internal.g();
        this.f31963l = gVar;
        gVar.a(f31943I, h(new i()));
        gVar.a(f31944J, h(new h()));
        gVar.a(f31945K, h(new h()));
        gVar.a(f31946L, h(new h()));
        gVar.a(f31947M, h(new l()));
        gVar.a(f31948N, h(new g()));
        this.f31967p = floatingActionButton.getRotation();
    }

    private boolean X() {
        return X.R(this.f31974w) && !this.f31974w.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(float f8, Matrix matrix) {
        matrix.reset();
        if (this.f31974w.getDrawable() == null || this.f31969r == 0) {
            return;
        }
        RectF rectF = this.f31977z;
        RectF rectF2 = this.f31949A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i8 = this.f31969r;
        rectF2.set(0.0f, 0.0f, i8, i8);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i9 = this.f31969r;
        matrix.postScale(f8, f8, i9 / 2.0f, i9 / 2.0f);
    }

    private void e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    private AnimatorSet f(E3.f fVar, float f8, float f9, float f10) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f31974w, (Property<FloatingActionButton, Float>) View.ALPHA, f8);
        fVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f31974w, (Property<FloatingActionButton, Float>) View.SCALE_X, f9);
        fVar.e("scale").a(ofFloat2);
        e0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f31974w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f9);
        fVar.e("scale").a(ofFloat3);
        e0(ofFloat3);
        arrayList.add(ofFloat3);
        e(f10, this.f31950B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f31974w, new E3.d(), new c(), new Matrix(this.f31950B));
        fVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        E3.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet g(float f8, float f9, float f10, int i8, int i9) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d(this.f31974w.getAlpha(), f8, this.f31974w.getScaleX(), f9, this.f31974w.getScaleY(), this.f31968q, f10, new Matrix(this.f31950B)));
        arrayList.add(ofFloat);
        E3.b.a(animatorSet, arrayList);
        animatorSet.setDuration(Q3.d.f(this.f31974w.getContext(), i8, this.f31974w.getContext().getResources().getInteger(D3.g.f1556a)));
        animatorSet.setInterpolator(Q3.d.g(this.f31974w.getContext(), i9, E3.a.f2146b));
        return animatorSet;
    }

    private ValueAnimator h(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f31938D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener n() {
        if (this.f31951C == null) {
            this.f31951C = new f();
        }
        return this.f31951C;
    }

    void A() {
        ViewTreeObserver viewTreeObserver = this.f31974w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f31951C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f31951C = null;
        }
    }

    abstract void B(int[] iArr);

    abstract void C(float f8, float f9, float f10);

    void D(Rect rect) {
        y0.i.h(this.f31956e, "Didn't initialize content background");
        if (!W()) {
            this.f31975x.c(this.f31956e);
        } else {
            this.f31975x.c(new InsetDrawable(this.f31956e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void E() {
        float rotation = this.f31974w.getRotation();
        if (this.f31967p != rotation) {
            this.f31967p = rotation;
            a0();
        }
    }

    void F() {
        ArrayList arrayList = this.f31973v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b();
            }
        }
    }

    void G() {
        ArrayList arrayList = this.f31973v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a();
            }
        }
    }

    abstract boolean H();

    void I(ColorStateList colorStateList) {
        V3.g gVar = this.f31953b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f31955d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    void J(PorterDuff.Mode mode) {
        V3.g gVar = this.f31953b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    final void K(float f8) {
        if (this.f31959h != f8) {
            this.f31959h = f8;
            C(f8, this.f31960i, this.f31961j);
        }
    }

    void L(boolean z7) {
        this.f31957f = z7;
    }

    final void M(E3.f fVar) {
        this.f31966o = fVar;
    }

    final void N(float f8) {
        if (this.f31960i != f8) {
            this.f31960i = f8;
            C(this.f31959h, f8, this.f31961j);
        }
    }

    final void O(float f8) {
        this.f31968q = f8;
        Matrix matrix = this.f31950B;
        e(f8, matrix);
        this.f31974w.setImageMatrix(matrix);
    }

    final void P(int i8) {
        if (this.f31969r != i8) {
            this.f31969r = i8;
            b0();
        }
    }

    void Q(int i8) {
        this.f31962k = i8;
    }

    final void R(float f8) {
        if (this.f31961j != f8) {
            this.f31961j = f8;
            C(this.f31959h, this.f31960i, f8);
        }
    }

    void S(ColorStateList colorStateList) {
        Drawable drawable = this.f31954c;
        if (drawable != null) {
            AbstractC6641a.o(drawable, T3.b.d(colorStateList));
        }
    }

    void T(boolean z7) {
        this.f31958g = z7;
        c0();
    }

    final void U(V3.k kVar) {
        this.f31952a = kVar;
        V3.g gVar = this.f31953b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f31954c;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f31955d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    final void V(E3.f fVar) {
        this.f31965n = fVar;
    }

    abstract boolean W();

    final boolean Y() {
        return !this.f31957f || this.f31974w.getSizeDimension() >= this.f31962k;
    }

    void Z(k kVar, boolean z7) {
        if (w()) {
            return;
        }
        Animator animator = this.f31964m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z8 = this.f31965n == null;
        if (!X()) {
            this.f31974w.b(0, z7);
            this.f31974w.setAlpha(1.0f);
            this.f31974w.setScaleY(1.0f);
            this.f31974w.setScaleX(1.0f);
            O(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f31974w.getVisibility() != 0) {
            this.f31974w.setAlpha(0.0f);
            this.f31974w.setScaleY(z8 ? 0.4f : 0.0f);
            this.f31974w.setScaleX(z8 ? 0.4f : 0.0f);
            O(z8 ? 0.4f : 0.0f);
        }
        E3.f fVar = this.f31965n;
        AnimatorSet f8 = fVar != null ? f(fVar, 1.0f, 1.0f, 1.0f) : g(1.0f, 1.0f, 1.0f, f31939E, f31940F);
        f8.addListener(new C0236b(z7, kVar));
        ArrayList arrayList = this.f31971t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f8.addListener((Animator.AnimatorListener) it.next());
            }
        }
        f8.start();
    }

    abstract void a0();

    final void b0() {
        O(this.f31968q);
    }

    final void c0() {
        Rect rect = this.f31976y;
        o(rect);
        D(rect);
        this.f31975x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void d0(float f8) {
        V3.g gVar = this.f31953b;
        if (gVar != null) {
            gVar.T(f8);
        }
    }

    final Drawable i() {
        return this.f31956e;
    }

    abstract float j();

    boolean k() {
        return this.f31957f;
    }

    final E3.f l() {
        return this.f31966o;
    }

    float m() {
        return this.f31960i;
    }

    void o(Rect rect) {
        int s8 = s();
        int max = Math.max(s8, (int) Math.ceil(this.f31958g ? j() + this.f31961j : 0.0f));
        int max2 = Math.max(s8, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    float p() {
        return this.f31961j;
    }

    final V3.k q() {
        return this.f31952a;
    }

    final E3.f r() {
        return this.f31965n;
    }

    int s() {
        if (this.f31957f) {
            return Math.max((this.f31962k - this.f31974w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void t(k kVar, boolean z7) {
        if (v()) {
            return;
        }
        Animator animator = this.f31964m;
        if (animator != null) {
            animator.cancel();
        }
        if (!X()) {
            this.f31974w.b(z7 ? 8 : 4, z7);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        E3.f fVar = this.f31966o;
        AnimatorSet f8 = fVar != null ? f(fVar, 0.0f, 0.0f, 0.0f) : g(0.0f, 0.4f, 0.4f, f31941G, f31942H);
        f8.addListener(new a(z7, kVar));
        ArrayList arrayList = this.f31972u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f8.addListener((Animator.AnimatorListener) it.next());
            }
        }
        f8.start();
    }

    abstract void u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i8);

    boolean v() {
        return this.f31974w.getVisibility() == 0 ? this.f31970s == 1 : this.f31970s != 2;
    }

    boolean w() {
        return this.f31974w.getVisibility() != 0 ? this.f31970s == 2 : this.f31970s != 1;
    }

    abstract void x();

    void y() {
        V3.g gVar = this.f31953b;
        if (gVar != null) {
            V3.h.f(this.f31974w, gVar);
        }
        if (H()) {
            this.f31974w.getViewTreeObserver().addOnPreDrawListener(n());
        }
    }

    abstract void z();
}
