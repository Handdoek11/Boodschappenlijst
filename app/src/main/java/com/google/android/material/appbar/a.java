package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import z0.X;

/* loaded from: classes2.dex */
abstract class a extends c {

    /* renamed from: d, reason: collision with root package name */
    private Runnable f31368d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f31369e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31370f;

    /* renamed from: g, reason: collision with root package name */
    private int f31371g;

    /* renamed from: h, reason: collision with root package name */
    private int f31372h;

    /* renamed from: i, reason: collision with root package name */
    private int f31373i;

    /* renamed from: j, reason: collision with root package name */
    private VelocityTracker f31374j;

    /* renamed from: com.google.android.material.appbar.a$a, reason: collision with other inner class name */
    private class RunnableC0231a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final CoordinatorLayout f31375o;

        /* renamed from: s, reason: collision with root package name */
        private final View f31376s;

        RunnableC0231a(CoordinatorLayout coordinatorLayout, View view) {
            this.f31375o = coordinatorLayout;
            this.f31376s = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f31376s == null || (overScroller = a.this.f31369e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.M(this.f31375o, this.f31376s);
                return;
            }
            a aVar = a.this;
            aVar.O(this.f31375o, this.f31376s, aVar.f31369e.getCurrY());
            X.f0(this.f31376s, this);
        }
    }

    public a() {
        this.f31371g = -1;
        this.f31373i = -1;
    }

    private void H() {
        if (this.f31374j == null) {
            this.f31374j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f31371g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f31372h = r12
            goto L4c
        L2d:
            int r0 = r11.f31371g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f31372h
            int r7 = r1 - r0
            r11.f31372h = r0
            int r8 = r11.J(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.N(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f31374j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f31374j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f31374j
            int r4 = r11.f31371g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.K(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.I(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f31370f = r3
            r11.f31371g = r1
            android.view.VelocityTracker r13 = r11.f31374j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f31374j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f31374j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f31370f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    abstract boolean G(View view);

    final boolean I(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, float f8) {
        Runnable runnable = this.f31368d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f31368d = null;
        }
        if (this.f31369e == null) {
            this.f31369e = new OverScroller(view.getContext());
        }
        this.f31369e.fling(0, E(), 0, Math.round(f8), 0, 0, i8, i9);
        if (!this.f31369e.computeScrollOffset()) {
            M(coordinatorLayout, view);
            return false;
        }
        RunnableC0231a runnableC0231a = new RunnableC0231a(coordinatorLayout, view);
        this.f31368d = runnableC0231a;
        X.f0(view, runnableC0231a);
        return true;
    }

    abstract int J(View view);

    abstract int K(View view);

    abstract int L();

    abstract void M(CoordinatorLayout coordinatorLayout, View view);

    final int N(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10) {
        return P(coordinatorLayout, view, L() - i8, i9, i10);
    }

    int O(CoordinatorLayout coordinatorLayout, View view, int i8) {
        return P(coordinatorLayout, view, i8, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int P(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f31373i < 0) {
            this.f31373i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f31370f) {
            int i8 = this.f31371g;
            if (i8 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i8)) == -1) {
                return false;
            }
            int y7 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y7 - this.f31372h) > this.f31373i) {
                this.f31372h = y7;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f31371g = -1;
            int x7 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            boolean z7 = G(view) && coordinatorLayout.A(view, x7, y8);
            this.f31370f = z7;
            if (z7) {
                this.f31372h = y8;
                this.f31371g = motionEvent.getPointerId(0);
                H();
                OverScroller overScroller = this.f31369e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f31369e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f31374j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31371g = -1;
        this.f31373i = -1;
    }
}
