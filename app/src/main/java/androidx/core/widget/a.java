package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import z0.X;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: I, reason: collision with root package name */
    private static final int f9243I = ViewConfiguration.getTapTimeout();

    /* renamed from: C, reason: collision with root package name */
    private boolean f9246C;

    /* renamed from: D, reason: collision with root package name */
    boolean f9247D;

    /* renamed from: E, reason: collision with root package name */
    boolean f9248E;

    /* renamed from: F, reason: collision with root package name */
    boolean f9249F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f9250G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f9251H;

    /* renamed from: t, reason: collision with root package name */
    final View f9254t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f9255u;

    /* renamed from: x, reason: collision with root package name */
    private int f9258x;

    /* renamed from: y, reason: collision with root package name */
    private int f9259y;

    /* renamed from: o, reason: collision with root package name */
    final C0155a f9252o = new C0155a();

    /* renamed from: s, reason: collision with root package name */
    private final Interpolator f9253s = new AccelerateInterpolator();

    /* renamed from: v, reason: collision with root package name */
    private float[] f9256v = {0.0f, 0.0f};

    /* renamed from: w, reason: collision with root package name */
    private float[] f9257w = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: z, reason: collision with root package name */
    private float[] f9260z = {0.0f, 0.0f};

    /* renamed from: A, reason: collision with root package name */
    private float[] f9244A = {0.0f, 0.0f};

    /* renamed from: B, reason: collision with root package name */
    private float[] f9245B = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0155a {

        /* renamed from: a, reason: collision with root package name */
        private int f9261a;

        /* renamed from: b, reason: collision with root package name */
        private int f9262b;

        /* renamed from: c, reason: collision with root package name */
        private float f9263c;

        /* renamed from: d, reason: collision with root package name */
        private float f9264d;

        /* renamed from: j, reason: collision with root package name */
        private float f9270j;

        /* renamed from: k, reason: collision with root package name */
        private int f9271k;

        /* renamed from: e, reason: collision with root package name */
        private long f9265e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f9269i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f9266f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f9267g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f9268h = 0;

        C0155a() {
        }

        private float e(long j8) {
            if (j8 < this.f9265e) {
                return 0.0f;
            }
            long j9 = this.f9269i;
            if (j9 < 0 || j8 < j9) {
                return a.m((j8 - r0) / this.f9261a, 0.0f, 1.0f) * 0.5f;
            }
            float f8 = this.f9270j;
            return (1.0f - f8) + (f8 * a.m((j8 - j9) / this.f9271k, 0.0f, 1.0f));
        }

        private float g(float f8) {
            return ((-4.0f) * f8 * f8) + (f8 * 4.0f);
        }

        public void a() {
            if (this.f9266f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g8 = g(e(currentAnimationTimeMillis));
            long j8 = currentAnimationTimeMillis - this.f9266f;
            this.f9266f = currentAnimationTimeMillis;
            float f8 = j8 * g8;
            this.f9267g = (int) (this.f9263c * f8);
            this.f9268h = (int) (f8 * this.f9264d);
        }

        public int b() {
            return this.f9267g;
        }

        public int c() {
            return this.f9268h;
        }

        public int d() {
            float f8 = this.f9263c;
            return (int) (f8 / Math.abs(f8));
        }

        public int f() {
            float f8 = this.f9264d;
            return (int) (f8 / Math.abs(f8));
        }

        public boolean h() {
            return this.f9269i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f9269i + ((long) this.f9271k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9271k = a.n((int) (currentAnimationTimeMillis - this.f9265e), 0, this.f9262b);
            this.f9270j = e(currentAnimationTimeMillis);
            this.f9269i = currentAnimationTimeMillis;
        }

        public void j(int i8) {
            this.f9262b = i8;
        }

        public void k(int i8) {
            this.f9261a = i8;
        }

        public void l(float f8, float f9) {
            this.f9263c = f8;
            this.f9264d = f9;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9265e = currentAnimationTimeMillis;
            this.f9269i = -1L;
            this.f9266f = currentAnimationTimeMillis;
            this.f9270j = 0.5f;
            this.f9267g = 0;
            this.f9268h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f9249F) {
                if (aVar.f9247D) {
                    aVar.f9247D = false;
                    aVar.f9252o.m();
                }
                C0155a c0155a = a.this.f9252o;
                if (c0155a.h() || !a.this.E()) {
                    a.this.f9249F = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f9248E) {
                    aVar2.f9248E = false;
                    aVar2.d();
                }
                c0155a.a();
                a.this.t(c0155a.b(), c0155a.c());
                X.f0(a.this.f9254t, this);
            }
        }
    }

    public a(View view) {
        this.f9254t = view;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = (int) ((1575.0f * f8) + 0.5f);
        y(f9, f9);
        float f10 = (int) ((f8 * 315.0f) + 0.5f);
        z(f10, f10);
        v(1);
        x(Float.MAX_VALUE, Float.MAX_VALUE);
        C(0.2f, 0.2f);
        D(1.0f, 1.0f);
        u(f9243I);
        B(500);
        A(500);
    }

    private void F() {
        int i8;
        if (this.f9255u == null) {
            this.f9255u = new b();
        }
        this.f9249F = true;
        this.f9247D = true;
        if (this.f9246C || (i8 = this.f9259y) <= 0) {
            this.f9255u.run();
        } else {
            X.g0(this.f9254t, this.f9255u, i8);
        }
        this.f9246C = true;
    }

    private float g(int i8, float f8, float f9, float f10) {
        float r8 = r(this.f9256v[i8], f9, this.f9257w[i8], f8);
        if (r8 == 0.0f) {
            return 0.0f;
        }
        float f11 = this.f9260z[i8];
        float f12 = this.f9244A[i8];
        float f13 = this.f9245B[i8];
        float f14 = f11 * f10;
        return r8 > 0.0f ? m(r8 * f14, f12, f13) : -m((-r8) * f14, f12, f13);
    }

    static float m(float f8, float f9, float f10) {
        return f8 > f10 ? f10 : f8 < f9 ? f9 : f8;
    }

    static int n(int i8, int i9, int i10) {
        return i8 > i10 ? i10 : i8 < i9 ? i9 : i8;
    }

    private float q(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        int i8 = this.f9258x;
        if (i8 == 0 || i8 == 1) {
            if (f8 < f9) {
                if (f8 >= 0.0f) {
                    return 1.0f - (f8 / f9);
                }
                if (this.f9249F && i8 == 1) {
                    return 1.0f;
                }
            }
        } else if (i8 == 2 && f8 < 0.0f) {
            return f8 / (-f9);
        }
        return 0.0f;
    }

    private float r(float f8, float f9, float f10, float f11) {
        float interpolation;
        float m8 = m(f8 * f9, 0.0f, f10);
        float q8 = q(f9 - f11, m8) - q(f11, m8);
        if (q8 < 0.0f) {
            interpolation = -this.f9253s.getInterpolation(-q8);
        } else {
            if (q8 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f9253s.getInterpolation(q8);
        }
        return m(interpolation, -1.0f, 1.0f);
    }

    private void s() {
        if (this.f9247D) {
            this.f9249F = false;
        } else {
            this.f9252o.i();
        }
    }

    public a A(int i8) {
        this.f9252o.j(i8);
        return this;
    }

    public a B(int i8) {
        this.f9252o.k(i8);
        return this;
    }

    public a C(float f8, float f9) {
        float[] fArr = this.f9256v;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a D(float f8, float f9) {
        float[] fArr = this.f9260z;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    boolean E() {
        C0155a c0155a = this.f9252o;
        int f8 = c0155a.f();
        int d8 = c0155a.d();
        return (f8 != 0 && b(f8)) || (d8 != 0 && a(d8));
    }

    public abstract boolean a(int i8);

    public abstract boolean b(int i8);

    void d() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f9254t.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f9250G
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.s()
            goto L58
        L1a:
            r5.f9248E = r2
            r5.f9246C = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f9254t
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.g(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f9254t
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.g(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f9252o
            r7.l(r0, r6)
            boolean r6 = r5.f9249F
            if (r6 != 0) goto L58
            boolean r6 = r5.E()
            if (r6 == 0) goto L58
            r5.F()
        L58:
            boolean r6 = r5.f9251H
            if (r6 == 0) goto L61
            boolean r6 = r5.f9249F
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void t(int i8, int i9);

    public a u(int i8) {
        this.f9259y = i8;
        return this;
    }

    public a v(int i8) {
        this.f9258x = i8;
        return this;
    }

    public a w(boolean z7) {
        if (this.f9250G && !z7) {
            s();
        }
        this.f9250G = z7;
        return this;
    }

    public a x(float f8, float f9) {
        float[] fArr = this.f9257w;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a y(float f8, float f9) {
        float[] fArr = this.f9245B;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    public a z(float f8, float f9) {
        float[] fArr = this.f9244A;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }
}
