package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class S implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    private final float f7473o;

    /* renamed from: s, reason: collision with root package name */
    private final int f7474s;

    /* renamed from: t, reason: collision with root package name */
    private final int f7475t;

    /* renamed from: u, reason: collision with root package name */
    final View f7476u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f7477v;

    /* renamed from: w, reason: collision with root package name */
    private Runnable f7478w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7479x;

    /* renamed from: y, reason: collision with root package name */
    private int f7480y;

    /* renamed from: z, reason: collision with root package name */
    private final int[] f7481z = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = S.this.f7476u.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.m();
        }
    }

    public S(View view) {
        this.f7476u = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f7473o = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f7474s = tapTimeout;
        this.f7475t = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f7478w;
        if (runnable != null) {
            this.f7476u.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f7477v;
        if (runnable2 != null) {
            this.f7476u.removeCallbacks(runnable2);
        }
    }

    private boolean n(MotionEvent motionEvent) {
        P p8;
        View view = this.f7476u;
        k.e b8 = b();
        if (b8 == null || !b8.a() || (p8 = (P) b8.j()) == null || !p8.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        s(view, obtainNoHistory);
        t(p8, obtainNoHistory);
        boolean e8 = p8.e(obtainNoHistory, this.f7480y);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e8 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f7476u
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f7480y
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f7473o
            boolean r6 = r(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f7480y = r6
            java.lang.Runnable r6 = r5.f7477v
            if (r6 != 0) goto L52
            androidx.appcompat.widget.S$a r6 = new androidx.appcompat.widget.S$a
            r6.<init>()
            r5.f7477v = r6
        L52:
            java.lang.Runnable r6 = r5.f7477v
            int r1 = r5.f7474s
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f7478w
            if (r6 != 0) goto L65
            androidx.appcompat.widget.S$b r6 = new androidx.appcompat.widget.S$b
            r6.<init>()
            r5.f7478w = r6
        L65:
            java.lang.Runnable r6 = r5.f7478w
            int r1 = r5.f7475t
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.S.q(android.view.MotionEvent):boolean");
    }

    private static boolean r(View view, float f8, float f9, float f10) {
        float f11 = -f10;
        return f8 >= f11 && f9 >= f11 && f8 < ((float) (view.getRight() - view.getLeft())) + f10 && f9 < ((float) (view.getBottom() - view.getTop())) + f10;
    }

    private boolean s(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f7481z);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean t(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f7481z);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract k.e b();

    protected abstract boolean d();

    protected boolean g() {
        k.e b8 = b();
        if (b8 == null || !b8.a()) {
            return true;
        }
        b8.dismiss();
        return true;
    }

    void m() {
        a();
        View view = this.f7476u;
        if (view.isEnabled() && !view.isLongClickable() && d()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f7479x = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z7;
        boolean z8 = this.f7479x;
        if (z8) {
            z7 = n(motionEvent) || !g();
        } else {
            z7 = q(motionEvent) && d();
            if (z7) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f7476u.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f7479x = z7;
        return z7 || z8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f7479x = false;
        this.f7480y = -1;
        Runnable runnable = this.f7477v;
        if (runnable != null) {
            this.f7476u.removeCallbacks(runnable);
        }
    }
}
