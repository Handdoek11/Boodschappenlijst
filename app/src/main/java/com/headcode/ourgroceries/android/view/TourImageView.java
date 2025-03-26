package com.headcode.ourgroceries.android.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.r;
import com.headcode.ourgroceries.android.P1;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public class TourImageView extends r {

    /* renamed from: u, reason: collision with root package name */
    private a f35076u;

    public enum a {
        FIT_HORIZONTALLY,
        FIT_VERTICALLY
    }

    public TourImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35076u = a.FIT_HORIZONTALLY;
        c();
    }

    private void c() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void d() {
        float min;
        float f8;
        float f9;
        float f10;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            AbstractC6635a.b("OG-TourImageView", "recomputeMatrix(): No drawable");
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == 0.0f || intrinsicHeight == 0.0f) {
            AbstractC6635a.b("OG-TourImageView", "recomputeMatrix(): Drawable width or height is zero");
            return;
        }
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float i8 = P1.i(this.f35076u == a.FIT_HORIZONTALLY ? 20 : 0);
        int ordinal = this.f35076u.ordinal();
        if (ordinal == 0) {
            min = Math.min(width - (i8 * 2.0f), (height * intrinsicWidth) / (intrinsicHeight / 3.0f));
            f8 = (width - min) / 2.0f;
            float f11 = (min * intrinsicHeight) / intrinsicWidth;
            f9 = f11 <= height ? (height - f11) / 2.0f : 0.0f;
            f10 = f11;
        } else {
            if (ordinal != 1) {
                return;
            }
            f10 = height - (i8 * 2.0f);
            float f12 = (f10 * intrinsicWidth) / intrinsicHeight;
            f8 = (width - f12) / 2.0f;
            min = f12;
            f9 = i8;
        }
        Matrix matrix = new Matrix();
        matrix.preTranslate(f8, f9);
        matrix.preScale(min / intrinsicWidth, f10 / intrinsicHeight);
        setImageMatrix(matrix);
    }

    @Override // android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        d();
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i8, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i8, i9, i10, i11);
        d();
        return frame;
    }

    public void setMode(a aVar) {
        this.f35076u = aVar;
        d();
    }
}
