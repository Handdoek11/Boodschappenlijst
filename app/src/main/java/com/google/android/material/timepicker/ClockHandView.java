package com.google.android.material.timepicker;

import D3.k;
import D3.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z0.X;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: A, reason: collision with root package name */
    private final List f32621A;

    /* renamed from: B, reason: collision with root package name */
    private final int f32622B;

    /* renamed from: C, reason: collision with root package name */
    private final float f32623C;

    /* renamed from: D, reason: collision with root package name */
    private final Paint f32624D;

    /* renamed from: E, reason: collision with root package name */
    private final RectF f32625E;

    /* renamed from: F, reason: collision with root package name */
    private final int f32626F;

    /* renamed from: G, reason: collision with root package name */
    private float f32627G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f32628H;

    /* renamed from: I, reason: collision with root package name */
    private double f32629I;

    /* renamed from: J, reason: collision with root package name */
    private int f32630J;

    /* renamed from: K, reason: collision with root package name */
    private int f32631K;

    /* renamed from: o, reason: collision with root package name */
    private final int f32632o;

    /* renamed from: s, reason: collision with root package name */
    private final TimeInterpolator f32633s;

    /* renamed from: t, reason: collision with root package name */
    private final ValueAnimator f32634t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f32635u;

    /* renamed from: v, reason: collision with root package name */
    private float f32636v;

    /* renamed from: w, reason: collision with root package name */
    private float f32637w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f32638x;

    /* renamed from: y, reason: collision with root package name */
    private final int f32639y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f32640z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f8, boolean z7);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1424w);
    }

    private void c(float f8, float f9) {
        this.f32631K = P3.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f8, f9) > ((float) h(2)) + o.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f8 = width;
        float h8 = h(this.f32631K);
        float cos = (((float) Math.cos(this.f32629I)) * h8) + f8;
        float f9 = height;
        float sin = (h8 * ((float) Math.sin(this.f32629I))) + f9;
        this.f32624D.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f32622B, this.f32624D);
        double sin2 = Math.sin(this.f32629I);
        double cos2 = Math.cos(this.f32629I);
        this.f32624D.setStrokeWidth(this.f32626F);
        canvas.drawLine(f8, f9, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.f32624D);
        canvas.drawCircle(f8, f9, this.f32623C, this.f32624D);
    }

    private int f(float f8, float f9) {
        int degrees = (int) Math.toDegrees(Math.atan2(f9 - (getHeight() / 2), f8 - (getWidth() / 2)));
        int i8 = degrees + 90;
        return i8 < 0 ? degrees + 450 : i8;
    }

    private int h(int i8) {
        return i8 == 2 ? Math.round(this.f32630J * 0.66f) : this.f32630J;
    }

    private Pair j(float f8) {
        float g8 = g();
        if (Math.abs(g8 - f8) > 180.0f) {
            if (g8 > 180.0f && f8 < 180.0f) {
                f8 += 360.0f;
            }
            if (g8 < 180.0f && f8 > 180.0f) {
                g8 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(g8), Float.valueOf(f8));
    }

    private boolean k(float f8, float f9, boolean z7, boolean z8, boolean z9) {
        float f10 = f(f8, f9);
        boolean z10 = false;
        boolean z11 = g() != f10;
        if (z8 && z11) {
            return true;
        }
        if (!z11 && !z7) {
            return false;
        }
        if (z9 && this.f32635u) {
            z10 = true;
        }
        o(f10, z10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f8, boolean z7) {
        float f9 = f8 % 360.0f;
        this.f32627G = f9;
        this.f32629I = Math.toRadians(f9 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float h8 = h(this.f32631K);
        float cos = width + (((float) Math.cos(this.f32629I)) * h8);
        float sin = height + (h8 * ((float) Math.sin(this.f32629I)));
        RectF rectF = this.f32625E;
        int i8 = this.f32622B;
        rectF.set(cos - i8, sin - i8, cos + i8, sin + i8);
        Iterator it = this.f32621A.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f9, z7);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f32621A.add(bVar);
    }

    public RectF e() {
        return this.f32625E;
    }

    public float g() {
        return this.f32627G;
    }

    public int i() {
        return this.f32622B;
    }

    public void m(int i8) {
        this.f32630J = i8;
        invalidate();
    }

    public void n(float f8) {
        o(f8, false);
    }

    public void o(float f8, boolean z7) {
        ValueAnimator valueAnimator = this.f32634t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z7) {
            p(f8, false);
            return;
        }
        Pair j8 = j(f8);
        this.f32634t.setFloatValues(((Float) j8.first).floatValue(), ((Float) j8.second).floatValue());
        this.f32634t.setDuration(this.f32632o);
        this.f32634t.setInterpolator(this.f32633s);
        this.f32634t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f32652a.l(valueAnimator2);
            }
        });
        this.f32634t.addListener(new a());
        this.f32634t.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        if (this.f32634t.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f32636v = x7;
            this.f32637w = y7;
            this.f32638x = true;
            this.f32628H = false;
            z7 = true;
            z8 = false;
            z9 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i8 = (int) (x7 - this.f32636v);
            int i9 = (int) (y7 - this.f32637w);
            this.f32638x = (i8 * i8) + (i9 * i9) > this.f32639y;
            z8 = this.f32628H;
            boolean z10 = actionMasked == 1;
            if (this.f32640z) {
                c(x7, y7);
            }
            z9 = z10;
            z7 = false;
        } else {
            z8 = false;
            z7 = false;
            z9 = false;
        }
        this.f32628H |= k(x7, y7, z8, z7, z9);
        return true;
    }

    void q(boolean z7) {
        if (this.f32640z && !z7) {
            this.f32631K = 1;
        }
        this.f32640z = z7;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f32634t = new ValueAnimator();
        this.f32621A = new ArrayList();
        Paint paint = new Paint();
        this.f32624D = paint;
        this.f32625E = new RectF();
        this.f32631K = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f2038w1, i8, k.f1631u);
        this.f32632o = Q3.d.f(context, D3.b.f1426y, 200);
        this.f32633s = Q3.d.g(context, D3.b.f1384H, E3.a.f2146b);
        this.f32630J = obtainStyledAttributes.getDimensionPixelSize(l.f2054y1, 0);
        this.f32622B = obtainStyledAttributes.getDimensionPixelSize(l.f2062z1, 0);
        this.f32626F = getResources().getDimensionPixelSize(D3.d.f1499y);
        this.f32623C = r7.getDimensionPixelSize(D3.d.f1497w);
        int color = obtainStyledAttributes.getColor(l.f2046x1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f32639y = ViewConfiguration.get(context).getScaledTouchSlop();
        X.w0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
