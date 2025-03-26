package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC0945k;

/* renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0937c extends N {

    /* renamed from: androidx.transition.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC0945k.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f11489a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f11490b = false;

        a(View view) {
            this.f11489a = view;
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void a(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void b(AbstractC0945k abstractC0945k) {
            this.f11489a.setTag(AbstractC0942h.f11513d, Float.valueOf(this.f11489a.getVisibility() == 0 ? A.b(this.f11489a) : 0.0f));
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void c(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.a(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void e(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void f(AbstractC0945k abstractC0945k, boolean z7) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void g(AbstractC0945k abstractC0945k) {
            this.f11489a.setTag(AbstractC0942h.f11513d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            A.e(this.f11489a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f11489a.hasOverlappingRendering() && this.f11489a.getLayerType() == 0) {
                this.f11490b = true;
                this.f11489a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (this.f11490b) {
                this.f11489a.setLayerType(0, null);
            }
            if (z7) {
                return;
            }
            A.e(this.f11489a, 1.0f);
            A.a(this.f11489a);
        }
    }

    public C0937c(int i8) {
        t0(i8);
    }

    private Animator u0(View view, float f8, float f9) {
        if (f8 == f9) {
            return null;
        }
        A.e(view, f8);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) A.f11428b, f9);
        a aVar = new a(view);
        ofFloat.addListener(aVar);
        F().b(aVar);
        return ofFloat;
    }

    private static float v0(x xVar, float f8) {
        Float f9;
        return (xVar == null || (f9 = (Float) xVar.f11583a.get("android:fade:transitionAlpha")) == null) ? f8 : f9.floatValue();
    }

    @Override // androidx.transition.N
    public Animator p0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        A.c(view);
        return u0(view, v0(xVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.N, androidx.transition.AbstractC0945k
    public void q(x xVar) {
        super.q(xVar);
        Float f8 = (Float) xVar.f11584b.getTag(AbstractC0942h.f11513d);
        if (f8 == null) {
            f8 = xVar.f11584b.getVisibility() == 0 ? Float.valueOf(A.b(xVar.f11584b)) : Float.valueOf(0.0f);
        }
        xVar.f11583a.put("android:fade:transitionAlpha", f8);
    }

    @Override // androidx.transition.N
    public Animator r0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        A.c(view);
        Animator u02 = u0(view, v0(xVar, 1.0f), 0.0f);
        if (u02 == null) {
            A.e(view, v0(xVar2, 1.0f));
        }
        return u02;
    }

    public C0937c() {
    }
}
