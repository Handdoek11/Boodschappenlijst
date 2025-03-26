package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes2.dex */
public abstract class d extends LinearLayoutCompat {

    /* renamed from: G, reason: collision with root package name */
    private Drawable f32106G;

    /* renamed from: H, reason: collision with root package name */
    private final Rect f32107H;

    /* renamed from: I, reason: collision with root package name */
    private final Rect f32108I;

    /* renamed from: J, reason: collision with root package name */
    private int f32109J;

    /* renamed from: K, reason: collision with root package name */
    protected boolean f32110K;

    /* renamed from: L, reason: collision with root package name */
    boolean f32111L;

    public d(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f32107H = new Rect();
        this.f32108I = new Rect();
        this.f32109J = 119;
        this.f32110K = true;
        this.f32111L = false;
        TypedArray i9 = l.i(context, attributeSet, D3.l.f1952m2, i8, 0, new int[0]);
        this.f32109J = i9.getInt(D3.l.f1970o2, this.f32109J);
        Drawable drawable = i9.getDrawable(D3.l.f1961n2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f32110K = i9.getBoolean(D3.l.f1979p2, true);
        i9.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f32106G;
        if (drawable != null) {
            if (this.f32111L) {
                this.f32111L = false;
                Rect rect = this.f32107H;
                Rect rect2 = this.f32108I;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f32110K) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f32109J, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.f32106G;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f32106G;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f32106G.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f32106G;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f32109J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f32106G;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        this.f32111L = z7 | this.f32111L;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.f32111L = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f32106G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f32106G);
            }
            this.f32106G = drawable;
            this.f32111L = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f32109J == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i8) {
        if (this.f32109J != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.f32109J = i8;
            if (i8 == 119 && this.f32106G != null) {
                this.f32106G.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f32106G;
    }
}
