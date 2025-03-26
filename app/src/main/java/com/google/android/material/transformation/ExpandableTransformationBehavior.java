package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    private AnimatorSet f32671b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f32671b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean H(View view, View view2, boolean z7, boolean z8) {
        AnimatorSet animatorSet = this.f32671b;
        boolean z9 = animatorSet != null;
        if (z9) {
            animatorSet.cancel();
        }
        AnimatorSet J7 = J(view, view2, z7, z9);
        this.f32671b = J7;
        J7.addListener(new a());
        this.f32671b.start();
        if (!z8) {
            this.f32671b.end();
        }
        return true;
    }

    protected abstract AnimatorSet J(View view, View view2, boolean z7, boolean z8);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
