package com.google.android.material.floatingactionbutton;

import V3.g;
import V3.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import o0.AbstractC6278a;
import y0.i;

/* loaded from: classes2.dex */
class c extends b {

    /* renamed from: O, reason: collision with root package name */
    private StateListAnimator f32006O;

    static class a extends g {
        a(k kVar) {
            super(kVar);
        }

        @Override // V3.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    c(FloatingActionButton floatingActionButton, U3.b bVar) {
        super(floatingActionButton, bVar);
    }

    private StateListAnimator g0(float f8, float f9, float f10) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(b.f31943I, h0(f8, f10));
        stateListAnimator.addState(b.f31944J, h0(f8, f9));
        stateListAnimator.addState(b.f31945K, h0(f8, f9));
        stateListAnimator.addState(b.f31946L, h0(f8, f9));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f31974w, "elevation", f8).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f31974w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f31974w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(b.f31938D);
        stateListAnimator.addState(b.f31947M, animatorSet);
        stateListAnimator.addState(b.f31948N, h0(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator h0(float f8, float f9) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f31974w, "elevation", f8).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f31974w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f9).setDuration(100L));
        animatorSet.setInterpolator(b.f31938D);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void B(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void C(float f8, float f9, float f10) {
        if (this.f31974w.getStateListAnimator() == this.f32006O) {
            StateListAnimator g02 = g0(f8, f9, f10);
            this.f32006O = g02;
            this.f31974w.setStateListAnimator(g02);
        }
        if (W()) {
            c0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean H() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void S(ColorStateList colorStateList) {
        Drawable drawable = this.f31954c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(T3.b.d(colorStateList));
        } else {
            super.S(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean W() {
        return this.f31975x.d() || !Y();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void a0() {
    }

    com.google.android.material.floatingactionbutton.a f0(int i8, ColorStateList colorStateList) {
        Context context = this.f31974w.getContext();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a((k) i.g(this.f31952a));
        aVar.e(AbstractC6278a.c(context, D3.c.f1432e), AbstractC6278a.c(context, D3.c.f1431d), AbstractC6278a.c(context, D3.c.f1429b), AbstractC6278a.c(context, D3.c.f1430c));
        aVar.d(i8);
        aVar.c(colorStateList);
        return aVar;
    }

    g i0() {
        return new a((k) i.g(this.f31952a));
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float j() {
        return this.f31974w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void o(Rect rect) {
        if (this.f31975x.d()) {
            super.o(rect);
        } else if (Y()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f31962k - this.f31974w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i8) {
        Drawable drawable;
        g i02 = i0();
        this.f31953b = i02;
        i02.setTintList(colorStateList);
        if (mode != null) {
            this.f31953b.setTintMode(mode);
        }
        this.f31953b.J(this.f31974w.getContext());
        if (i8 > 0) {
            this.f31955d = f0(i8, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) i.g(this.f31955d), (Drawable) i.g(this.f31953b)});
        } else {
            this.f31955d = null;
            drawable = this.f31953b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(T3.b.d(colorStateList2), drawable, null);
        this.f31954c = rippleDrawable;
        this.f31956e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void x() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void z() {
        c0();
    }
}
