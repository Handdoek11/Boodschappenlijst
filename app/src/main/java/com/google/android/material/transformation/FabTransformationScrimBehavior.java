package com.google.android.material.transformation;

import E3.b;
import E3.g;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final g f32685c;

    /* renamed from: d, reason: collision with root package name */
    private final g f32686d;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32687a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f32688b;

        a(boolean z7, View view) {
            this.f32687a = z7;
            this.f32688b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f32687a) {
                return;
            }
            this.f32688b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f32687a) {
                this.f32688b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f32685c = new g(75L, 150L);
        this.f32686d = new g(0L, 150L);
    }

    private void K(View view, boolean z7, boolean z8, List list, List list2) {
        ObjectAnimator ofFloat;
        g gVar = z7 ? this.f32685c : this.f32686d;
        if (z7) {
            if (!z8) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        gVar.a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z7, boolean z8) {
        ArrayList arrayList = new ArrayList();
        K(view2, z7, z8, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z7, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32685c = new g(75L, 150L);
        this.f32686d = new g(0L, 150L);
    }
}
