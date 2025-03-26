package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import z0.ViewTreeObserverOnPreDrawListenerC7007K;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0912k {
    private static int a(Fragment fragment, boolean z7, boolean z8) {
        return z8 ? z7 ? fragment.c0() : fragment.d0() : z7 ? fragment.C() : fragment.Q();
    }

    static a b(Context context, Fragment fragment, boolean z7, boolean z8) {
        int Y7 = fragment.Y();
        int a8 = a(fragment, z7, z8);
        fragment.Q1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f9883Y;
        if (viewGroup != null && viewGroup.getTag(O0.b.f4229c) != null) {
            fragment.f9883Y.setTag(O0.b.f4229c, null);
        }
        ViewGroup viewGroup2 = fragment.f9883Y;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation K02 = fragment.K0(Y7, z7, a8);
        if (K02 != null) {
            return new a(K02);
        }
        Animator L02 = fragment.L0(Y7, z7, a8);
        if (L02 != null) {
            return new a(L02);
        }
        if (a8 == 0 && Y7 != 0) {
            a8 = d(context, Y7, z7);
        }
        if (a8 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a8));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a8);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e8) {
                    throw e8;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a8);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e9) {
                    if (equals) {
                        throw e9;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a8);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i8});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i8, boolean z7) {
        if (i8 == 4097) {
            return z7 ? O0.a.f4225e : O0.a.f4226f;
        }
        if (i8 == 8194) {
            return z7 ? O0.a.f4221a : O0.a.f4222b;
        }
        if (i8 == 8197) {
            return z7 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i8 == 4099) {
            return z7 ? O0.a.f4223c : O0.a.f4224d;
        }
        if (i8 != 4100) {
            return -1;
        }
        return z7 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* renamed from: androidx.fragment.app.k$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f10097a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f10098b;

        a(Animation animation) {
            this.f10097a = animation;
            this.f10098b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f10097a = null;
            this.f10098b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final ViewGroup f10099o;

        /* renamed from: s, reason: collision with root package name */
        private final View f10100s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f10101t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f10102u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f10103v;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f10103v = true;
            this.f10099o = viewGroup;
            this.f10100s = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j8, Transformation transformation) {
            this.f10103v = true;
            if (this.f10101t) {
                return !this.f10102u;
            }
            if (!super.getTransformation(j8, transformation)) {
                this.f10101t = true;
                ViewTreeObserverOnPreDrawListenerC7007K.a(this.f10099o, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10101t || !this.f10103v) {
                this.f10099o.endViewTransition(this.f10100s);
                this.f10102u = true;
            } else {
                this.f10103v = false;
                this.f10099o.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j8, Transformation transformation, float f8) {
            this.f10103v = true;
            if (this.f10101t) {
                return !this.f10102u;
            }
            if (!super.getTransformation(j8, transformation, f8)) {
                this.f10101t = true;
                ViewTreeObserverOnPreDrawListenerC7007K.a(this.f10099o, this);
            }
            return true;
        }
    }
}
