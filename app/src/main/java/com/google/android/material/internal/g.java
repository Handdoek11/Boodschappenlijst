package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f32112a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private b f32113b = null;

    /* renamed from: c, reason: collision with root package name */
    ValueAnimator f32114c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f32115d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g gVar = g.this;
            if (gVar.f32114c == animator) {
                gVar.f32114c = null;
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f32117a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f32118b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f32117a = iArr;
            this.f32118b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f32115d);
        this.f32112a.add(bVar);
    }
}
