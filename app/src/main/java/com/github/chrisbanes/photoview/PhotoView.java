package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.r;
import f2.InterfaceC5768d;
import f2.InterfaceC5769e;
import f2.InterfaceC5770f;
import f2.InterfaceC5771g;
import f2.InterfaceC5772h;
import f2.InterfaceC5773i;
import f2.InterfaceC5774j;
import f2.ViewOnTouchListenerC5775k;

/* loaded from: classes.dex */
public class PhotoView extends r {

    /* renamed from: u, reason: collision with root package name */
    private ViewOnTouchListenerC5775k f13027u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView.ScaleType f13028v;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c() {
        this.f13027u = new ViewOnTouchListenerC5775k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f13028v;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f13028v = null;
        }
    }

    public ViewOnTouchListenerC5775k getAttacher() {
        return this.f13027u;
    }

    public RectF getDisplayRect() {
        return this.f13027u.N();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f13027u.R();
    }

    public float getMaximumScale() {
        return this.f13027u.U();
    }

    public float getMediumScale() {
        return this.f13027u.V();
    }

    public float getMinimumScale() {
        return this.f13027u.W();
    }

    public float getScale() {
        return this.f13027u.X();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f13027u.Y();
    }

    public void setAllowParentInterceptOnEdge(boolean z7) {
        this.f13027u.b0(z7);
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i8, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i8, i9, i10, i11);
        if (frame) {
            this.f13027u.y0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC5775k viewOnTouchListenerC5775k = this.f13027u;
        if (viewOnTouchListenerC5775k != null) {
            viewOnTouchListenerC5775k.y0();
        }
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageResource(int i8) {
        super.setImageResource(i8);
        ViewOnTouchListenerC5775k viewOnTouchListenerC5775k = this.f13027u;
        if (viewOnTouchListenerC5775k != null) {
            viewOnTouchListenerC5775k.y0();
        }
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC5775k viewOnTouchListenerC5775k = this.f13027u;
        if (viewOnTouchListenerC5775k != null) {
            viewOnTouchListenerC5775k.y0();
        }
    }

    public void setMaximumScale(float f8) {
        this.f13027u.d0(f8);
    }

    public void setMediumScale(float f8) {
        this.f13027u.e0(f8);
    }

    public void setMinimumScale(float f8) {
        this.f13027u.f0(f8);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13027u.g0(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f13027u.h0(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13027u.i0(onLongClickListener);
    }

    public void setOnMatrixChangeListener(InterfaceC5768d interfaceC5768d) {
        this.f13027u.j0(interfaceC5768d);
    }

    public void setOnOutsidePhotoTapListener(InterfaceC5769e interfaceC5769e) {
        this.f13027u.k0(interfaceC5769e);
    }

    public void setOnPhotoTapListener(InterfaceC5770f interfaceC5770f) {
        this.f13027u.l0(interfaceC5770f);
    }

    public void setOnScaleChangeListener(InterfaceC5771g interfaceC5771g) {
        this.f13027u.m0(interfaceC5771g);
    }

    public void setOnSingleFlingListener(InterfaceC5772h interfaceC5772h) {
        this.f13027u.n0(interfaceC5772h);
    }

    public void setOnViewDragListener(InterfaceC5773i interfaceC5773i) {
        this.f13027u.o0(interfaceC5773i);
    }

    public void setOnViewTapListener(InterfaceC5774j interfaceC5774j) {
        this.f13027u.p0(interfaceC5774j);
    }

    public void setRotationBy(float f8) {
        this.f13027u.q0(f8);
    }

    public void setRotationTo(float f8) {
        this.f13027u.r0(f8);
    }

    public void setScale(float f8) {
        this.f13027u.s0(f8);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC5775k viewOnTouchListenerC5775k = this.f13027u;
        if (viewOnTouchListenerC5775k == null) {
            this.f13028v = scaleType;
        } else {
            viewOnTouchListenerC5775k.v0(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i8) {
        this.f13027u.w0(i8);
    }

    public void setZoomable(boolean z7) {
        this.f13027u.x0(z7);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        c();
    }
}
