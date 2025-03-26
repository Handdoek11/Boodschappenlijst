package com.google.android.material.snackbar;

import A0.z;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.d;
import java.util.ArrayList;
import java.util.List;
import r0.AbstractC6641a;
import z0.C7013a;
import z0.C7061y0;
import z0.InterfaceC7004H;
import z0.X;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar {

    /* renamed from: a, reason: collision with root package name */
    private final int f32197a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32198b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32199c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f32200d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f32201e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f32202f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f32203g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f32204h;

    /* renamed from: i, reason: collision with root package name */
    protected final s f32205i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f32206j;

    /* renamed from: k, reason: collision with root package name */
    private int f32207k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f32208l;

    /* renamed from: o, reason: collision with root package name */
    private int f32211o;

    /* renamed from: p, reason: collision with root package name */
    private int f32212p;

    /* renamed from: q, reason: collision with root package name */
    private int f32213q;

    /* renamed from: r, reason: collision with root package name */
    private int f32214r;

    /* renamed from: s, reason: collision with root package name */
    private int f32215s;

    /* renamed from: t, reason: collision with root package name */
    private int f32216t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f32217u;

    /* renamed from: v, reason: collision with root package name */
    private List f32218v;

    /* renamed from: w, reason: collision with root package name */
    private Behavior f32219w;

    /* renamed from: x, reason: collision with root package name */
    private final AccessibilityManager f32220x;

    /* renamed from: z, reason: collision with root package name */
    private static final TimeInterpolator f32196z = E3.a.f2146b;

    /* renamed from: A, reason: collision with root package name */
    private static final TimeInterpolator f32190A = E3.a.f2145a;

    /* renamed from: B, reason: collision with root package name */
    private static final TimeInterpolator f32191B = E3.a.f2148d;

    /* renamed from: D, reason: collision with root package name */
    private static final boolean f32193D = false;

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f32194E = {D3.b.f1390N};

    /* renamed from: F, reason: collision with root package name */
    private static final String f32195F = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: C, reason: collision with root package name */
    static final Handler f32192C = new Handler(Looper.getMainLooper(), new h());

    /* renamed from: m, reason: collision with root package name */
    private boolean f32209m = false;

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f32210n = new i();

    /* renamed from: y, reason: collision with root package name */
    d.b f32221y = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: l, reason: collision with root package name */
        private final r f32222l = new r(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void Q(BaseTransientBottomBar baseTransientBottomBar) {
            this.f32222l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f32222l.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f32222l.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32223a;

        a(int i8) {
            this.f32223a = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f32223a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f32205i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f32205i.setScaleX(floatValue);
            BaseTransientBottomBar.this.f32205i.setScaleY(floatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f32206j.a(BaseTransientBottomBar.this.f32199c - BaseTransientBottomBar.this.f32197a, BaseTransientBottomBar.this.f32197a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f32228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32229b;

        e(int i8) {
            this.f32229b = i8;
            this.f32228a = i8;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f32193D) {
                X.Y(BaseTransientBottomBar.this.f32205i, intValue - this.f32228a);
            } else {
                BaseTransientBottomBar.this.f32205i.setTranslationY(intValue);
            }
            this.f32228a = intValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32231a;

        f(int i8) {
            this.f32231a = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f32231a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f32206j.b(0, BaseTransientBottomBar.this.f32198b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f32233a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f32193D) {
                X.Y(BaseTransientBottomBar.this.f32205i, intValue - this.f32233a);
            } else {
                BaseTransientBottomBar.this.f32205i.setTranslationY(intValue);
            }
            this.f32233a = intValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 0) {
                ((BaseTransientBottomBar) message.obj).Z();
                return true;
            }
            if (i8 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).L(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f32205i == null || baseTransientBottomBar.f32204h == null) {
                return;
            }
            int height = (com.google.android.material.internal.q.a(BaseTransientBottomBar.this.f32204h).height() - BaseTransientBottomBar.this.J()) + ((int) BaseTransientBottomBar.this.f32205i.getTranslationY());
            if (height >= BaseTransientBottomBar.this.f32215s) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f32216t = baseTransientBottomBar2.f32215s;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f32205i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f32195F, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f32216t = baseTransientBottomBar3.f32215s;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f32215s - height;
            BaseTransientBottomBar.this.f32205i.requestLayout();
        }
    }

    class j implements InterfaceC7004H {
        j() {
        }

        @Override // z0.InterfaceC7004H
        public C7061y0 a(View view, C7061y0 c7061y0) {
            BaseTransientBottomBar.this.f32211o = c7061y0.h();
            BaseTransientBottomBar.this.f32212p = c7061y0.i();
            BaseTransientBottomBar.this.f32213q = c7061y0.j();
            BaseTransientBottomBar.this.f0();
            return c7061y0;
        }
    }

    class k extends C7013a {
        k() {
        }

        @Override // z0.C7013a
        public void k(View view, z zVar) {
            super.k(view, zVar);
            zVar.a(1048576);
            zVar.p0(true);
        }

        @Override // z0.C7013a
        public boolean n(View view, int i8, Bundle bundle) {
            if (i8 != 1048576) {
                return super.n(view, i8, bundle);
            }
            BaseTransientBottomBar.this.y();
            return true;
        }
    }

    class l implements d.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.d.b
        public void b() {
            Handler handler = BaseTransientBottomBar.f32192C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.d.b
        public void c(int i8) {
            Handler handler = BaseTransientBottomBar.f32192C;
            handler.sendMessage(handler.obtainMessage(1, i8, 0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.R(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.z(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i8) {
            if (i8 == 0) {
                com.google.android.material.snackbar.d.c().k(BaseTransientBottomBar.this.f32221y);
            } else if (i8 == 1 || i8 == 2) {
                com.google.android.material.snackbar.d.c().j(BaseTransientBottomBar.this.f32221y);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = BaseTransientBottomBar.this.f32205i;
            if (sVar == null) {
                return;
            }
            if (sVar.getParent() != null) {
                BaseTransientBottomBar.this.f32205i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f32205i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.b0();
            } else {
                BaseTransientBottomBar.this.d0();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }
    }

    public static abstract class q {
        public void a(Object obj, int i8) {
        }

        public void b(Object obj) {
        }
    }

    public static class r {

        /* renamed from: a, reason: collision with root package name */
        private d.b f32243a;

        public r(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.M(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.N(0);
        }

        public boolean a(View view) {
            return view instanceof s;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.A(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.d.c().j(this.f32243a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.d.c().k(this.f32243a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f32243a = baseTransientBottomBar.f32221y;
        }
    }

    protected static class s extends FrameLayout {

        /* renamed from: C, reason: collision with root package name */
        private static final View.OnTouchListener f32244C = new a();

        /* renamed from: A, reason: collision with root package name */
        private Rect f32245A;

        /* renamed from: B, reason: collision with root package name */
        private boolean f32246B;

        /* renamed from: o, reason: collision with root package name */
        private BaseTransientBottomBar f32247o;

        /* renamed from: s, reason: collision with root package name */
        V3.k f32248s;

        /* renamed from: t, reason: collision with root package name */
        private int f32249t;

        /* renamed from: u, reason: collision with root package name */
        private final float f32250u;

        /* renamed from: v, reason: collision with root package name */
        private final float f32251v;

        /* renamed from: w, reason: collision with root package name */
        private final int f32252w;

        /* renamed from: x, reason: collision with root package name */
        private final int f32253x;

        /* renamed from: y, reason: collision with root package name */
        private ColorStateList f32254y;

        /* renamed from: z, reason: collision with root package name */
        private PorterDuff.Mode f32255z;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected s(Context context, AttributeSet attributeSet) {
            super(Z3.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, D3.l.f2009s5);
            if (obtainStyledAttributes.hasValue(D3.l.f2066z5)) {
                X.u0(this, obtainStyledAttributes.getDimensionPixelSize(D3.l.f2066z5, 0));
            }
            this.f32249t = obtainStyledAttributes.getInt(D3.l.f2034v5, 0);
            if (obtainStyledAttributes.hasValue(D3.l.f1647B5) || obtainStyledAttributes.hasValue(D3.l.f1655C5)) {
                this.f32248s = V3.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f32250u = obtainStyledAttributes.getFloat(D3.l.f2042w5, 1.0f);
            setBackgroundTintList(S3.c.a(context2, obtainStyledAttributes, D3.l.f2050x5));
            setBackgroundTintMode(com.google.android.material.internal.o.i(obtainStyledAttributes.getInt(D3.l.f2058y5, -1), PorterDuff.Mode.SRC_IN));
            this.f32251v = obtainStyledAttributes.getFloat(D3.l.f2026u5, 1.0f);
            this.f32252w = obtainStyledAttributes.getDimensionPixelSize(D3.l.f2018t5, -1);
            this.f32253x = obtainStyledAttributes.getDimensionPixelSize(D3.l.f1639A5, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f32244C);
            setFocusable(true);
            if (getBackground() == null) {
                X.r0(this, d());
            }
        }

        private Drawable d() {
            int k8 = L3.a.k(this, D3.b.f1413l, D3.b.f1410i, getBackgroundOverlayColorAlpha());
            V3.k kVar = this.f32248s;
            Drawable x7 = kVar != null ? BaseTransientBottomBar.x(k8, kVar) : BaseTransientBottomBar.w(k8, getResources());
            if (this.f32254y == null) {
                return AbstractC6641a.r(x7);
            }
            Drawable r8 = AbstractC6641a.r(x7);
            AbstractC6641a.o(r8, this.f32254y);
            return r8;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f32245A = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f32247o = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f32246B = true;
            viewGroup.addView(this);
            this.f32246B = false;
        }

        float getActionTextColorAlpha() {
            return this.f32251v;
        }

        int getAnimationMode() {
            return this.f32249t;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f32250u;
        }

        int getMaxInlineActionWidth() {
            return this.f32253x;
        }

        int getMaxWidth() {
            return this.f32252w;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f32247o;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
            X.k0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f32247o;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
            super.onLayout(z7, i8, i9, i10, i11);
            BaseTransientBottomBar baseTransientBottomBar = this.f32247o;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            if (this.f32252w > 0) {
                int measuredWidth = getMeasuredWidth();
                int i10 = this.f32252w;
                if (measuredWidth > i10) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i9);
                }
            }
        }

        void setAnimationMode(int i8) {
            this.f32249t = i8;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f32254y != null) {
                drawable = AbstractC6641a.r(drawable.mutate());
                AbstractC6641a.o(drawable, this.f32254y);
                AbstractC6641a.p(drawable, this.f32255z);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f32254y = colorStateList;
            if (getBackground() != null) {
                Drawable r8 = AbstractC6641a.r(getBackground().mutate());
                AbstractC6641a.o(r8, colorStateList);
                AbstractC6641a.p(r8, this.f32255z);
                if (r8 != getBackground()) {
                    super.setBackgroundDrawable(r8);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f32255z = mode;
            if (getBackground() != null) {
                Drawable r8 = AbstractC6641a.r(getBackground().mutate());
                AbstractC6641a.p(r8, mode);
                if (r8 != getBackground()) {
                    super.setBackgroundDrawable(r8);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f32246B || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f32247o;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.f0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f32244C);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f32203g = viewGroup;
        this.f32206j = aVar;
        this.f32204h = context;
        com.google.android.material.internal.l.a(context);
        s sVar = (s) LayoutInflater.from(context).inflate(G(), viewGroup, false);
        this.f32205i = sVar;
        sVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(sVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(sVar.getMaxInlineActionWidth());
        }
        sVar.addView(view);
        X.p0(sVar, 1);
        X.w0(sVar, 1);
        X.v0(sVar, true);
        X.A0(sVar, new j());
        X.n0(sVar, new k());
        this.f32220x = (AccessibilityManager) context.getSystemService("accessibility");
        this.f32199c = Q3.d.f(context, D3.b.f1426y, 250);
        this.f32197a = Q3.d.f(context, D3.b.f1426y, 150);
        this.f32198b = Q3.d.f(context, D3.b.f1427z, 75);
        this.f32200d = Q3.d.g(context, D3.b.f1384H, f32190A);
        this.f32202f = Q3.d.g(context, D3.b.f1384H, f32191B);
        this.f32201e = Q3.d.g(context, D3.b.f1384H, f32196z);
    }

    private ValueAnimator A(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f32200d);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private ValueAnimator F(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f32202f);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    private int H() {
        int height = this.f32205i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f32205i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J() {
        int[] iArr = new int[2];
        this.f32205i.getLocationInWindow(iArr);
        return iArr[1] + this.f32205i.getHeight();
    }

    private boolean N() {
        ViewGroup.LayoutParams layoutParams = this.f32205i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void T() {
        this.f32214r = v();
        f0();
    }

    private void V(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f32219w;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = E();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).Q(this);
        }
        swipeDismissBehavior.L(new n());
        fVar.o(swipeDismissBehavior);
        if (B() == null) {
            fVar.f9051g = 80;
        }
    }

    private boolean X() {
        return this.f32215s > 0 && !this.f32208l && N();
    }

    private void a0() {
        if (W()) {
            t();
            return;
        }
        if (this.f32205i.getParent() != null) {
            this.f32205i.setVisibility(0);
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        ValueAnimator A7 = A(0.0f, 1.0f);
        ValueAnimator F7 = F(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(A7, F7);
        animatorSet.setDuration(this.f32197a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void c0(int i8) {
        ValueAnimator A7 = A(1.0f, 0.0f);
        A7.setDuration(this.f32198b);
        A7.addListener(new a(i8));
        A7.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        int H7 = H();
        if (f32193D) {
            X.Y(this.f32205i, H7);
        } else {
            this.f32205i.setTranslationY(H7);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(H7, 0);
        valueAnimator.setInterpolator(this.f32201e);
        valueAnimator.setDuration(this.f32199c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(H7));
        valueAnimator.start();
    }

    private void e0(int i8) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, H());
        valueAnimator.setInterpolator(this.f32201e);
        valueAnimator.setDuration(this.f32199c);
        valueAnimator.addListener(new f(i8));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        ViewGroup.LayoutParams layoutParams = this.f32205i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f32195F, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f32205i.f32245A == null) {
            Log.w(f32195F, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f32205i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i8 = this.f32205i.f32245A.bottom + (B() != null ? this.f32214r : this.f32211o);
        int i9 = this.f32205i.f32245A.left + this.f32212p;
        int i10 = this.f32205i.f32245A.right + this.f32213q;
        int i11 = this.f32205i.f32245A.top;
        boolean z7 = (marginLayoutParams.bottomMargin == i8 && marginLayoutParams.leftMargin == i9 && marginLayoutParams.rightMargin == i10 && marginLayoutParams.topMargin == i11) ? false : true;
        if (z7) {
            marginLayoutParams.bottomMargin = i8;
            marginLayoutParams.leftMargin = i9;
            marginLayoutParams.rightMargin = i10;
            marginLayoutParams.topMargin = i11;
            this.f32205i.requestLayout();
        }
        if ((z7 || this.f32216t != this.f32215s) && Build.VERSION.SDK_INT >= 29 && X()) {
            this.f32205i.removeCallbacks(this.f32210n);
            this.f32205i.post(this.f32210n);
        }
    }

    private void u(int i8) {
        if (this.f32205i.getAnimationMode() == 1) {
            c0(i8);
        } else {
            e0(i8);
        }
    }

    private int v() {
        if (B() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        B().getLocationOnScreen(iArr);
        int i8 = iArr[1];
        int[] iArr2 = new int[2];
        this.f32203g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f32203g.getHeight()) - i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable w(int i8, Resources resources) {
        float dimension = resources.getDimension(D3.d.f1475f0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i8);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static V3.g x(int i8, V3.k kVar) {
        V3.g gVar = new V3.g(kVar);
        gVar.U(ColorStateList.valueOf(i8));
        return gVar;
    }

    public View B() {
        return null;
    }

    public Context C() {
        return this.f32204h;
    }

    public int D() {
        return this.f32207k;
    }

    protected SwipeDismissBehavior E() {
        return new Behavior();
    }

    protected int G() {
        return K() ? D3.h.f1578u : D3.h.f1558a;
    }

    public View I() {
        return this.f32205i;
    }

    protected boolean K() {
        TypedArray obtainStyledAttributes = this.f32204h.obtainStyledAttributes(f32194E);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void L(int i8) {
        if (W() && this.f32205i.getVisibility() == 0) {
            u(i8);
        } else {
            R(i8);
        }
    }

    public boolean M() {
        return com.google.android.material.snackbar.d.c().e(this.f32221y);
    }

    void O() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f32205i.getRootWindowInsets()) == null) {
            return;
        }
        this.f32215s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        f0();
    }

    void P() {
        if (M()) {
            f32192C.post(new m());
        }
    }

    void Q() {
        if (this.f32217u) {
            a0();
            this.f32217u = false;
        }
    }

    void R(int i8) {
        com.google.android.material.snackbar.d.c().h(this.f32221y);
        List list = this.f32218v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.f32218v.get(size)).a(this, i8);
            }
        }
        ViewParent parent = this.f32205i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f32205i);
        }
    }

    void S() {
        com.google.android.material.snackbar.d.c().i(this.f32221y);
        List list = this.f32218v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.f32218v.get(size)).b(this);
            }
        }
    }

    public BaseTransientBottomBar U(int i8) {
        this.f32207k = i8;
        return this;
    }

    boolean W() {
        AccessibilityManager accessibilityManager = this.f32220x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void Y() {
        com.google.android.material.snackbar.d.c().m(D(), this.f32221y);
    }

    final void Z() {
        if (this.f32205i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f32205i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                V((CoordinatorLayout.f) layoutParams);
            }
            this.f32205i.c(this.f32203g);
            T();
            this.f32205i.setVisibility(4);
        }
        if (X.R(this.f32205i)) {
            a0();
        } else {
            this.f32217u = true;
        }
    }

    public BaseTransientBottomBar s(q qVar) {
        if (qVar == null) {
            return this;
        }
        if (this.f32218v == null) {
            this.f32218v = new ArrayList();
        }
        this.f32218v.add(qVar);
        return this;
    }

    void t() {
        this.f32205i.post(new o());
    }

    public void y() {
        z(3);
    }

    protected void z(int i8) {
        com.google.android.material.snackbar.d.c().b(this.f32221y, i8);
    }
}
