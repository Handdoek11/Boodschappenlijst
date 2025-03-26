package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import z0.X;

/* loaded from: classes.dex */
class g extends RecyclerView.o implements RecyclerView.t {

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f11189D = {R.attr.state_pressed};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f11190E = new int[0];

    /* renamed from: A, reason: collision with root package name */
    int f11191A;

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f11192B;

    /* renamed from: C, reason: collision with root package name */
    private final RecyclerView.u f11193C;

    /* renamed from: a, reason: collision with root package name */
    private final int f11194a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11195b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f11196c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f11197d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11198e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11199f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f11200g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f11201h;

    /* renamed from: i, reason: collision with root package name */
    private final int f11202i;

    /* renamed from: j, reason: collision with root package name */
    private final int f11203j;

    /* renamed from: k, reason: collision with root package name */
    int f11204k;

    /* renamed from: l, reason: collision with root package name */
    int f11205l;

    /* renamed from: m, reason: collision with root package name */
    float f11206m;

    /* renamed from: n, reason: collision with root package name */
    int f11207n;

    /* renamed from: o, reason: collision with root package name */
    int f11208o;

    /* renamed from: p, reason: collision with root package name */
    float f11209p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f11212s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f11219z;

    /* renamed from: q, reason: collision with root package name */
    private int f11210q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f11211r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f11213t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11214u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f11215v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f11216w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f11217x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f11218y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.q(500);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i8, int i9) {
            g.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f11222a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11222a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f11222a) {
                this.f11222a = false;
                return;
            }
            if (((Float) g.this.f11219z.getAnimatedValue()).floatValue() == 0.0f) {
                g gVar = g.this;
                gVar.f11191A = 0;
                gVar.y(0);
            } else {
                g gVar2 = g.this;
                gVar2.f11191A = 2;
                gVar2.v();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            g.this.f11196c.setAlpha(floatValue);
            g.this.f11197d.setAlpha(floatValue);
            g.this.v();
        }
    }

    g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i8, int i9, int i10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11219z = ofFloat;
        this.f11191A = 0;
        this.f11192B = new a();
        this.f11193C = new b();
        this.f11196c = stateListDrawable;
        this.f11197d = drawable;
        this.f11200g = stateListDrawable2;
        this.f11201h = drawable2;
        this.f11198e = Math.max(i8, stateListDrawable.getIntrinsicWidth());
        this.f11199f = Math.max(i8, drawable.getIntrinsicWidth());
        this.f11202i = Math.max(i8, stateListDrawable2.getIntrinsicWidth());
        this.f11203j = Math.max(i8, drawable2.getIntrinsicWidth());
        this.f11194a = i9;
        this.f11195b = i10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    private void C(float f8) {
        int[] p8 = p();
        float max = Math.max(p8[0], Math.min(p8[1], f8));
        if (Math.abs(this.f11205l - max) < 2.0f) {
            return;
        }
        int x7 = x(this.f11206m, max, p8, this.f11212s.computeVerticalScrollRange(), this.f11212s.computeVerticalScrollOffset(), this.f11211r);
        if (x7 != 0) {
            this.f11212s.scrollBy(0, x7);
        }
        this.f11206m = max;
    }

    private void k() {
        this.f11212s.removeCallbacks(this.f11192B);
    }

    private void l() {
        this.f11212s.j1(this);
        this.f11212s.k1(this);
        this.f11212s.l1(this.f11193C);
        k();
    }

    private void m(Canvas canvas) {
        int i8 = this.f11211r;
        int i9 = this.f11202i;
        int i10 = this.f11208o;
        int i11 = this.f11207n;
        this.f11200g.setBounds(0, 0, i11, i9);
        this.f11201h.setBounds(0, 0, this.f11210q, this.f11203j);
        canvas.translate(0.0f, i8 - i9);
        this.f11201h.draw(canvas);
        canvas.translate(i10 - (i11 / 2), 0.0f);
        this.f11200g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i8 = this.f11210q;
        int i9 = this.f11198e;
        int i10 = i8 - i9;
        int i11 = this.f11205l;
        int i12 = this.f11204k;
        int i13 = i11 - (i12 / 2);
        this.f11196c.setBounds(0, 0, i9, i12);
        this.f11197d.setBounds(0, 0, this.f11199f, this.f11211r);
        if (!s()) {
            canvas.translate(i10, 0.0f);
            this.f11197d.draw(canvas);
            canvas.translate(0.0f, i13);
            this.f11196c.draw(canvas);
            canvas.translate(-i10, -i13);
            return;
        }
        this.f11197d.draw(canvas);
        canvas.translate(this.f11198e, i13);
        canvas.scale(-1.0f, 1.0f);
        this.f11196c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f11198e, -i13);
    }

    private int[] o() {
        int[] iArr = this.f11218y;
        int i8 = this.f11195b;
        iArr[0] = i8;
        iArr[1] = this.f11210q - i8;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f11217x;
        int i8 = this.f11195b;
        iArr[0] = i8;
        iArr[1] = this.f11211r - i8;
        return iArr;
    }

    private void r(float f8) {
        int[] o8 = o();
        float max = Math.max(o8[0], Math.min(o8[1], f8));
        if (Math.abs(this.f11208o - max) < 2.0f) {
            return;
        }
        int x7 = x(this.f11209p, max, o8, this.f11212s.computeHorizontalScrollRange(), this.f11212s.computeHorizontalScrollOffset(), this.f11210q);
        if (x7 != 0) {
            this.f11212s.scrollBy(x7, 0);
        }
        this.f11209p = max;
    }

    private boolean s() {
        return X.z(this.f11212s) == 1;
    }

    private void w(int i8) {
        k();
        this.f11212s.postDelayed(this.f11192B, i8);
    }

    private int x(float f8, float f9, int[] iArr, int i8, int i9, int i10) {
        int i11 = iArr[1] - iArr[0];
        if (i11 == 0) {
            return 0;
        }
        int i12 = i8 - i10;
        int i13 = (int) (((f9 - f8) / i11) * i12);
        int i14 = i9 + i13;
        if (i14 >= i12 || i14 < 0) {
            return 0;
        }
        return i13;
    }

    private void z() {
        this.f11212s.j(this);
        this.f11212s.m(this);
        this.f11212s.n(this.f11193C);
    }

    public void A() {
        int i8 = this.f11191A;
        if (i8 != 0) {
            if (i8 != 3) {
                return;
            } else {
                this.f11219z.cancel();
            }
        }
        this.f11191A = 1;
        ValueAnimator valueAnimator = this.f11219z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f11219z.setDuration(500L);
        this.f11219z.setStartDelay(0L);
        this.f11219z.start();
    }

    void B(int i8, int i9) {
        int computeVerticalScrollRange = this.f11212s.computeVerticalScrollRange();
        int i10 = this.f11211r;
        this.f11213t = computeVerticalScrollRange - i10 > 0 && i10 >= this.f11194a;
        int computeHorizontalScrollRange = this.f11212s.computeHorizontalScrollRange();
        int i11 = this.f11210q;
        boolean z7 = computeHorizontalScrollRange - i11 > 0 && i11 >= this.f11194a;
        this.f11214u = z7;
        boolean z8 = this.f11213t;
        if (!z8 && !z7) {
            if (this.f11215v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z8) {
            float f8 = i10;
            this.f11205l = (int) ((f8 * (i9 + (f8 / 2.0f))) / computeVerticalScrollRange);
            this.f11204k = Math.min(i10, (i10 * i10) / computeVerticalScrollRange);
        }
        if (this.f11214u) {
            float f9 = i11;
            this.f11208o = (int) ((f9 * (i8 + (f9 / 2.0f))) / computeHorizontalScrollRange);
            this.f11207n = Math.min(i11, (i11 * i11) / computeHorizontalScrollRange);
        }
        int i12 = this.f11215v;
        if (i12 == 0 || i12 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f11215v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean u7 = u(motionEvent.getX(), motionEvent.getY());
            boolean t7 = t(motionEvent.getX(), motionEvent.getY());
            if (u7 || t7) {
                if (t7) {
                    this.f11216w = 1;
                    this.f11209p = (int) motionEvent.getX();
                } else if (u7) {
                    this.f11216w = 2;
                    this.f11206m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f11215v == 2) {
            this.f11206m = 0.0f;
            this.f11209p = 0.0f;
            y(1);
            this.f11216w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f11215v == 2) {
            A();
            if (this.f11216w == 1) {
                r(motionEvent.getX());
            }
            if (this.f11216w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i8 = this.f11215v;
        if (i8 == 1) {
            boolean u7 = u(motionEvent.getX(), motionEvent.getY());
            boolean t7 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u7 && !t7) {
                return false;
            }
            if (t7) {
                this.f11216w = 1;
                this.f11209p = (int) motionEvent.getX();
            } else if (u7) {
                this.f11216w = 2;
                this.f11206m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i8 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z7) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
        if (this.f11210q != this.f11212s.getWidth() || this.f11211r != this.f11212s.getHeight()) {
            this.f11210q = this.f11212s.getWidth();
            this.f11211r = this.f11212s.getHeight();
            y(0);
        } else if (this.f11191A != 0) {
            if (this.f11213t) {
                n(canvas);
            }
            if (this.f11214u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f11212s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f11212s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i8) {
        int i9 = this.f11191A;
        if (i9 == 1) {
            this.f11219z.cancel();
        } else if (i9 != 2) {
            return;
        }
        this.f11191A = 3;
        ValueAnimator valueAnimator = this.f11219z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f11219z.setDuration(i8);
        this.f11219z.start();
    }

    boolean t(float f8, float f9) {
        if (f9 >= this.f11211r - this.f11202i) {
            int i8 = this.f11208o;
            int i9 = this.f11207n;
            if (f8 >= i8 - (i9 / 2) && f8 <= i8 + (i9 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f8, float f9) {
        if (!s() ? f8 >= this.f11210q - this.f11198e : f8 <= this.f11198e) {
            int i8 = this.f11205l;
            int i9 = this.f11204k;
            if (f9 >= i8 - (i9 / 2) && f9 <= i8 + (i9 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f11212s.invalidate();
    }

    void y(int i8) {
        if (i8 == 2 && this.f11215v != 2) {
            this.f11196c.setState(f11189D);
            k();
        }
        if (i8 == 0) {
            v();
        } else {
            A();
        }
        if (this.f11215v == 2 && i8 != 2) {
            this.f11196c.setState(f11190E);
            w(1200);
        } else if (i8 == 1) {
            w(1500);
        }
        this.f11215v = i8;
    }
}
