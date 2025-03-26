package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f8029a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f8031c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f8032d;

    /* renamed from: e, reason: collision with root package name */
    private float f8033e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f8036h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f8037i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f8038j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8034f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8035g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f8039k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f8030b = new Paint(5);

    d(ColorStateList colorStateList, float f8) {
        this.f8029a = f8;
        e(colorStateList);
        this.f8031c = new RectF();
        this.f8032d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f8036h = colorStateList;
        this.f8030b.setColor(colorStateList.getColorForState(getState(), this.f8036h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f8031c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f8032d.set(rect);
        if (this.f8034f) {
            this.f8032d.inset((int) Math.ceil(e.a(this.f8033e, this.f8029a, this.f8035g)), (int) Math.ceil(e.b(this.f8033e, this.f8029a, this.f8035g)));
            this.f8031c.set(this.f8032d);
        }
    }

    public ColorStateList b() {
        return this.f8036h;
    }

    float c() {
        return this.f8033e;
    }

    public float d() {
        return this.f8029a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z7;
        Paint paint = this.f8030b;
        if (this.f8037i == null || paint.getColorFilter() != null) {
            z7 = false;
        } else {
            paint.setColorFilter(this.f8037i);
            z7 = true;
        }
        RectF rectF = this.f8031c;
        float f8 = this.f8029a;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        if (z7) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f8, boolean z7, boolean z8) {
        if (f8 == this.f8033e && this.f8034f == z7 && this.f8035g == z8) {
            return;
        }
        this.f8033e = f8;
        this.f8034f = z7;
        this.f8035g = z8;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f8032d, this.f8029a);
    }

    void h(float f8) {
        if (f8 == this.f8029a) {
            return;
        }
        this.f8029a = f8;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f8038j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f8036h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f8036h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z7 = colorForState != this.f8030b.getColor();
        if (z7) {
            this.f8030b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f8038j;
        if (colorStateList2 == null || (mode = this.f8039k) == null) {
            return z7;
        }
        this.f8037i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f8030b.setAlpha(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8030b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f8038j = colorStateList;
        this.f8037i = a(colorStateList, this.f8039k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f8039k = mode;
        this.f8037i = a(this.f8038j, mode);
        invalidateSelf();
    }
}
