package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import r0.AbstractC6641a;

/* loaded from: classes.dex */
abstract class g extends Drawable {

    /* renamed from: o, reason: collision with root package name */
    Drawable f11622o;

    g() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.i(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.setLevel(i8) : super.onLevelChange(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i8) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.setChangingConfigurations(i8);
        } else {
            super.setChangingConfigurations(i8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i8, PorterDuff.Mode mode) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.setColorFilter(i8, mode);
        } else {
            super.setColorFilter(i8, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z7) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            drawable.setFilterBitmap(z7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f8, float f9) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.k(drawable, f8, f9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i8, int i9, int i10, int i11) {
        Drawable drawable = this.f11622o;
        if (drawable != null) {
            AbstractC6641a.l(drawable, i8, i9, i10, i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f11622o;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
