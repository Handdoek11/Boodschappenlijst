package j1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import y0.i;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6051a extends Drawable implements Animatable {

    /* renamed from: x, reason: collision with root package name */
    private static final Interpolator f38099x = new LinearInterpolator();

    /* renamed from: y, reason: collision with root package name */
    private static final Interpolator f38100y = new Q0.b();

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f38101z = {-16777216};

    /* renamed from: o, reason: collision with root package name */
    private final c f38102o;

    /* renamed from: s, reason: collision with root package name */
    private float f38103s;

    /* renamed from: t, reason: collision with root package name */
    private Resources f38104t;

    /* renamed from: u, reason: collision with root package name */
    private Animator f38105u;

    /* renamed from: v, reason: collision with root package name */
    float f38106v;

    /* renamed from: w, reason: collision with root package name */
    boolean f38107w;

    /* renamed from: j1.a$a, reason: collision with other inner class name */
    class C0278a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f38108a;

        C0278a(c cVar) {
            this.f38108a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C6051a.this.i(floatValue, this.f38108a);
            C6051a.this.b(floatValue, this.f38108a, false);
            C6051a.this.invalidateSelf();
        }
    }

    /* renamed from: j1.a$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final RectF f38112a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f38113b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f38114c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f38115d;

        /* renamed from: e, reason: collision with root package name */
        float f38116e;

        /* renamed from: f, reason: collision with root package name */
        float f38117f;

        /* renamed from: g, reason: collision with root package name */
        float f38118g;

        /* renamed from: h, reason: collision with root package name */
        float f38119h;

        /* renamed from: i, reason: collision with root package name */
        int[] f38120i;

        /* renamed from: j, reason: collision with root package name */
        int f38121j;

        /* renamed from: k, reason: collision with root package name */
        float f38122k;

        /* renamed from: l, reason: collision with root package name */
        float f38123l;

        /* renamed from: m, reason: collision with root package name */
        float f38124m;

        /* renamed from: n, reason: collision with root package name */
        boolean f38125n;

        /* renamed from: o, reason: collision with root package name */
        Path f38126o;

        /* renamed from: p, reason: collision with root package name */
        float f38127p;

        /* renamed from: q, reason: collision with root package name */
        float f38128q;

        /* renamed from: r, reason: collision with root package name */
        int f38129r;

        /* renamed from: s, reason: collision with root package name */
        int f38130s;

        /* renamed from: t, reason: collision with root package name */
        int f38131t;

        /* renamed from: u, reason: collision with root package name */
        int f38132u;

        c() {
            Paint paint = new Paint();
            this.f38113b = paint;
            Paint paint2 = new Paint();
            this.f38114c = paint2;
            Paint paint3 = new Paint();
            this.f38115d = paint3;
            this.f38116e = 0.0f;
            this.f38117f = 0.0f;
            this.f38118g = 0.0f;
            this.f38119h = 5.0f;
            this.f38127p = 1.0f;
            this.f38131t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f38112a;
            float f8 = this.f38128q;
            float f9 = (this.f38119h / 2.0f) + f8;
            if (f8 <= 0.0f) {
                f9 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f38129r * this.f38127p) / 2.0f, this.f38119h / 2.0f);
            }
            rectF.set(rect.centerX() - f9, rect.centerY() - f9, rect.centerX() + f9, rect.centerY() + f9);
            float f10 = this.f38116e;
            float f11 = this.f38118g;
            float f12 = (f10 + f11) * 360.0f;
            float f13 = ((this.f38117f + f11) * 360.0f) - f12;
            this.f38113b.setColor(this.f38132u);
            this.f38113b.setAlpha(this.f38131t);
            float f14 = this.f38119h / 2.0f;
            rectF.inset(f14, f14);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f38115d);
            float f15 = -f14;
            rectF.inset(f15, f15);
            canvas.drawArc(rectF, f12, f13, false, this.f38113b);
            b(canvas, f12, f13, rectF);
        }

        void b(Canvas canvas, float f8, float f9, RectF rectF) {
            if (this.f38125n) {
                Path path = this.f38126o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f38126o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f10 = (this.f38129r * this.f38127p) / 2.0f;
                this.f38126o.moveTo(0.0f, 0.0f);
                this.f38126o.lineTo(this.f38129r * this.f38127p, 0.0f);
                Path path3 = this.f38126o;
                float f11 = this.f38129r;
                float f12 = this.f38127p;
                path3.lineTo((f11 * f12) / 2.0f, this.f38130s * f12);
                this.f38126o.offset((min + rectF.centerX()) - f10, rectF.centerY() + (this.f38119h / 2.0f));
                this.f38126o.close();
                this.f38114c.setColor(this.f38132u);
                this.f38114c.setAlpha(this.f38131t);
                canvas.save();
                canvas.rotate(f8 + f9, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f38126o, this.f38114c);
                canvas.restore();
            }
        }

        int c() {
            return this.f38131t;
        }

        float d() {
            return this.f38117f;
        }

        int e() {
            return this.f38120i[f()];
        }

        int f() {
            return (this.f38121j + 1) % this.f38120i.length;
        }

        float g() {
            return this.f38116e;
        }

        int h() {
            return this.f38120i[this.f38121j];
        }

        float i() {
            return this.f38123l;
        }

        float j() {
            return this.f38124m;
        }

        float k() {
            return this.f38122k;
        }

        void l() {
            r(f());
        }

        void m() {
            this.f38122k = 0.0f;
            this.f38123l = 0.0f;
            this.f38124m = 0.0f;
            w(0.0f);
            t(0.0f);
            u(0.0f);
        }

        void n(int i8) {
            this.f38131t = i8;
        }

        void o(float f8) {
            this.f38128q = f8;
        }

        void p(int i8) {
            this.f38132u = i8;
        }

        void q(ColorFilter colorFilter) {
            this.f38113b.setColorFilter(colorFilter);
        }

        void r(int i8) {
            this.f38121j = i8;
            this.f38132u = this.f38120i[i8];
        }

        void s(int[] iArr) {
            this.f38120i = iArr;
            r(0);
        }

        void t(float f8) {
            this.f38117f = f8;
        }

        void u(float f8) {
            this.f38118g = f8;
        }

        void v(boolean z7) {
            if (this.f38125n != z7) {
                this.f38125n = z7;
            }
        }

        void w(float f8) {
            this.f38116e = f8;
        }

        void x(float f8) {
            this.f38119h = f8;
            this.f38113b.setStrokeWidth(f8);
        }

        void y() {
            this.f38122k = this.f38116e;
            this.f38123l = this.f38117f;
            this.f38124m = this.f38118g;
        }
    }

    public C6051a(Context context) {
        this.f38104t = ((Context) i.g(context)).getResources();
        c cVar = new c();
        this.f38102o = cVar;
        cVar.s(f38101z);
        g(2.5f);
        h();
    }

    private void a(float f8, c cVar) {
        i(f8, cVar);
        float floor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.w(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f8));
        cVar.t(cVar.i());
        cVar.u(cVar.j() + ((floor - cVar.j()) * f8));
    }

    private int c(float f8, int i8, int i9) {
        return ((((i8 >> 24) & 255) + ((int) ((((i9 >> 24) & 255) - r0) * f8))) << 24) | ((((i8 >> 16) & 255) + ((int) ((((i9 >> 16) & 255) - r1) * f8))) << 16) | ((((i8 >> 8) & 255) + ((int) ((((i9 >> 8) & 255) - r2) * f8))) << 8) | ((i8 & 255) + ((int) (f8 * ((i9 & 255) - r8))));
    }

    private void f(float f8) {
        this.f38103s = f8;
    }

    private void h() {
        c cVar = this.f38102o;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C0278a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f38099x);
        ofFloat.addListener(new b(cVar));
        this.f38105u = ofFloat;
    }

    void b(float f8, c cVar, boolean z7) {
        float interpolation;
        float f9;
        if (this.f38107w) {
            a(f8, cVar);
            return;
        }
        if (f8 != 1.0f || z7) {
            float j8 = cVar.j();
            if (f8 < 0.5f) {
                interpolation = cVar.k();
                f9 = (f38100y.getInterpolation(f8 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k8 = cVar.k() + 0.79f;
                interpolation = k8 - (((1.0f - f38100y.getInterpolation((f8 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f9 = k8;
            }
            float f10 = j8 + (0.20999998f * f8);
            float f11 = (f8 + this.f38106v) * 216.0f;
            cVar.w(interpolation);
            cVar.t(f9);
            cVar.u(f10);
            f(f11);
        }
    }

    public void d(float f8) {
        this.f38102o.o(f8);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f38103s, bounds.exactCenterX(), bounds.exactCenterY());
        this.f38102o.a(canvas, bounds);
        canvas.restore();
    }

    public void e(int... iArr) {
        this.f38102o.s(iArr);
        this.f38102o.r(0);
        invalidateSelf();
    }

    public void g(float f8) {
        this.f38102o.x(f8);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f38102o.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    void i(float f8, c cVar) {
        if (f8 > 0.75f) {
            cVar.p(c((f8 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.p(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f38105u.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f38102o.n(i8);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38102o.q(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f38105u.cancel();
        this.f38102o.y();
        if (this.f38102o.d() != this.f38102o.g()) {
            this.f38107w = true;
            this.f38105u.setDuration(666L);
            this.f38105u.start();
        } else {
            this.f38102o.r(0);
            this.f38102o.m();
            this.f38105u.setDuration(1332L);
            this.f38105u.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f38105u.cancel();
        f(0.0f);
        this.f38102o.v(false);
        this.f38102o.r(0);
        this.f38102o.m();
        invalidateSelf();
    }

    /* renamed from: j1.a$b */
    class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f38110a;

        b(c cVar) {
            this.f38110a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C6051a.this.b(1.0f, this.f38110a, true);
            this.f38110a.y();
            this.f38110a.l();
            C6051a c6051a = C6051a.this;
            if (!c6051a.f38107w) {
                c6051a.f38106v += 1.0f;
                return;
            }
            c6051a.f38107w = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f38110a.v(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C6051a.this.f38106v = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
