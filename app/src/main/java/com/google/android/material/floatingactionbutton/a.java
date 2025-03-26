package com.google.android.material.floatingactionbutton;

import V3.k;
import V3.l;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.drawable.d;
import q0.AbstractC6410a;

/* loaded from: classes2.dex */
class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    private final Paint f31922b;

    /* renamed from: h, reason: collision with root package name */
    float f31928h;

    /* renamed from: i, reason: collision with root package name */
    private int f31929i;

    /* renamed from: j, reason: collision with root package name */
    private int f31930j;

    /* renamed from: k, reason: collision with root package name */
    private int f31931k;

    /* renamed from: l, reason: collision with root package name */
    private int f31932l;

    /* renamed from: m, reason: collision with root package name */
    private int f31933m;

    /* renamed from: o, reason: collision with root package name */
    private k f31935o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f31936p;

    /* renamed from: a, reason: collision with root package name */
    private final l f31921a = l.k();

    /* renamed from: c, reason: collision with root package name */
    private final Path f31923c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final Rect f31924d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final RectF f31925e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    private final RectF f31926f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final b f31927g = new b();

    /* renamed from: n, reason: collision with root package name */
    private boolean f31934n = true;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return a.this;
        }
    }

    a(k kVar) {
        this.f31935o = kVar;
        Paint paint = new Paint(1);
        this.f31922b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        copyBounds(this.f31924d);
        float height = this.f31928h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{AbstractC6410a.g(this.f31929i, this.f31933m), AbstractC6410a.g(this.f31930j, this.f31933m), AbstractC6410a.g(AbstractC6410a.k(this.f31930j, 0), this.f31933m), AbstractC6410a.g(AbstractC6410a.k(this.f31932l, 0), this.f31933m), AbstractC6410a.g(this.f31932l, this.f31933m), AbstractC6410a.g(this.f31931k, this.f31933m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    protected RectF b() {
        this.f31926f.set(getBounds());
        return this.f31926f;
    }

    void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f31933m = colorStateList.getColorForState(getState(), this.f31933m);
        }
        this.f31936p = colorStateList;
        this.f31934n = true;
        invalidateSelf();
    }

    public void d(float f8) {
        if (this.f31928h != f8) {
            this.f31928h = f8;
            this.f31922b.setStrokeWidth(f8 * 1.3333f);
            this.f31934n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f31934n) {
            this.f31922b.setShader(a());
            this.f31934n = false;
        }
        float strokeWidth = this.f31922b.getStrokeWidth() / 2.0f;
        copyBounds(this.f31924d);
        this.f31925e.set(this.f31924d);
        float min = Math.min(this.f31935o.r().a(b()), this.f31925e.width() / 2.0f);
        if (this.f31935o.u(b())) {
            this.f31925e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f31925e, min, min, this.f31922b);
        }
    }

    void e(int i8, int i9, int i10, int i11) {
        this.f31929i = i8;
        this.f31930j = i9;
        this.f31931k = i10;
        this.f31932l = i11;
    }

    public void f(k kVar) {
        this.f31935o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f31927g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f31928h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f31935o.u(b())) {
            outline.setRoundRect(getBounds(), this.f31935o.r().a(b()));
        } else {
            copyBounds(this.f31924d);
            this.f31925e.set(this.f31924d);
            this.f31921a.e(this.f31935o, 1.0f, this.f31925e, this.f31923c);
            d.j(outline, this.f31923c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f31935o.u(b())) {
            return true;
        }
        int round = Math.round(this.f31928h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f31936p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f31934n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f31936p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f31933m)) != this.f31933m) {
            this.f31934n = true;
            this.f31933m = colorForState;
        }
        if (this.f31934n) {
            invalidateSelf();
        }
        return this.f31934n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f31922b.setAlpha(i8);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f31922b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
