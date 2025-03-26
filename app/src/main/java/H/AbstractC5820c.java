package h;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import r0.AbstractC6641a;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5820c extends Drawable implements Drawable.Callback {

    /* renamed from: o, reason: collision with root package name */
    private Drawable f36177o;

    public AbstractC5820c(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f36177o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f36177o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f36177o.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f36177o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f36177o.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f36177o.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f36177o.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f36177o.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f36177o.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f36177o.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f36177o.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f36177o.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f36177o.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return AbstractC6641a.h(this.f36177o);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f36177o.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f36177o.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f36177o.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        return this.f36177o.setLevel(i8);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        scheduleSelf(runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f36177o.setAlpha(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        AbstractC6641a.j(this.f36177o, z7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i8) {
        this.f36177o.setChangingConfigurations(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36177o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z7) {
        this.f36177o.setDither(z7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z7) {
        this.f36177o.setFilterBitmap(z7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f8, float f9) {
        AbstractC6641a.k(this.f36177o, f8, f9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i8, int i9, int i10, int i11) {
        AbstractC6641a.l(this.f36177o, i8, i9, i10, i11);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f36177o.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i8) {
        AbstractC6641a.n(this.f36177o, i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC6641a.o(this.f36177o, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC6641a.p(this.f36177o, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        return super.setVisible(z7, z8) || this.f36177o.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
