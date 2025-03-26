package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: z0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7026g0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f44759a;

    /* renamed from: z0.g0$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7028h0 f44760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f44761b;

        a(InterfaceC7028h0 interfaceC7028h0, View view) {
            this.f44760a = interfaceC7028h0;
            this.f44761b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f44760a.a(this.f44761b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f44760a.b(this.f44761b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f44760a.c(this.f44761b);
        }
    }

    /* renamed from: z0.g0$b */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f8) {
            return viewPropertyAnimator.translationZ(f8);
        }
    }

    C7026g0(View view) {
        this.f44759a = new WeakReference(view);
    }

    private void l(View view, InterfaceC7028h0 interfaceC7028h0) {
        if (interfaceC7028h0 != null) {
            view.animate().setListener(new a(interfaceC7028h0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C7026g0 b(float f8) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f44759a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C7026g0 f(float f8) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().rotation(f8);
        }
        return this;
    }

    public C7026g0 g(float f8) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().scaleX(f8);
        }
        return this;
    }

    public C7026g0 h(float f8) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().scaleY(f8);
        }
        return this;
    }

    public C7026g0 i(long j8) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().setDuration(j8);
        }
        return this;
    }

    public C7026g0 j(Interpolator interpolator) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C7026g0 k(InterfaceC7028h0 interfaceC7028h0) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            l(view, interfaceC7028h0);
        }
        return this;
    }

    public C7026g0 m(long j8) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().setStartDelay(j8);
        }
        return this;
    }

    public C7026g0 n(final InterfaceC7032j0 interfaceC7032j0) {
        final View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC7032j0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: z0.f0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC7032j0.d(view);
                }
            } : null);
        }
        return this;
    }

    public void o() {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C7026g0 p(float f8) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().translationX(f8);
        }
        return this;
    }

    public C7026g0 q(float f8) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
        return this;
    }

    public C7026g0 r(float f8) {
        View view = (View) this.f44759a.get();
        if (view != null) {
            b.a(view.animate(), f8);
        }
        return this;
    }
}
