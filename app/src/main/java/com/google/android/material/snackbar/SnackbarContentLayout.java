package com.google.android.material.snackbar;

import D3.f;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import z0.X;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: o, reason: collision with root package name */
    private TextView f32260o;

    /* renamed from: s, reason: collision with root package name */
    private Button f32261s;

    /* renamed from: t, reason: collision with root package name */
    private final TimeInterpolator f32262t;

    /* renamed from: u, reason: collision with root package name */
    private int f32263u;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32262t = Q3.d.g(context, D3.b.f1384H, E3.a.f2146b);
    }

    private static void d(View view, int i8, int i9) {
        if (X.T(view)) {
            X.B0(view, X.E(view), i8, X.D(view), i9);
        } else {
            view.setPadding(view.getPaddingLeft(), i8, view.getPaddingRight(), i9);
        }
    }

    private boolean e(int i8, int i9, int i10) {
        boolean z7;
        if (i8 != getOrientation()) {
            setOrientation(i8);
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f32260o.getPaddingTop() == i9 && this.f32260o.getPaddingBottom() == i10) {
            return z7;
        }
        d(this.f32260o, i9, i10);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i8, int i9) {
        this.f32260o.setAlpha(0.0f);
        long j8 = i9;
        long j9 = i8;
        this.f32260o.animate().alpha(1.0f).setDuration(j8).setInterpolator(this.f32262t).setStartDelay(j9).start();
        if (this.f32261s.getVisibility() == 0) {
            this.f32261s.setAlpha(0.0f);
            this.f32261s.animate().alpha(1.0f).setDuration(j8).setInterpolator(this.f32262t).setStartDelay(j9).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i8, int i9) {
        this.f32260o.setAlpha(1.0f);
        long j8 = i9;
        long j9 = i8;
        this.f32260o.animate().alpha(0.0f).setDuration(j8).setInterpolator(this.f32262t).setStartDelay(j9).start();
        if (this.f32261s.getVisibility() == 0) {
            this.f32261s.setAlpha(1.0f);
            this.f32261s.animate().alpha(0.0f).setDuration(j8).setInterpolator(this.f32262t).setStartDelay(j9).start();
        }
    }

    void c(float f8) {
        if (f8 != 1.0f) {
            this.f32261s.setTextColor(L3.a.j(L3.a.d(this, D3.b.f1413l), this.f32261s.getCurrentTextColor(), f8));
        }
    }

    public Button getActionView() {
        return this.f32261s;
    }

    public TextView getMessageView() {
        return this.f32260o;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f32260o = (TextView) findViewById(f.f1520J);
        this.f32261s = (Button) findViewById(f.f1519I);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(D3.d.f1474f);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(D3.d.f1472e);
        Layout layout = this.f32260o.getLayout();
        boolean z7 = layout != null && layout.getLineCount() > 1;
        if (!z7 || this.f32263u <= 0 || this.f32261s.getMeasuredWidth() <= this.f32263u) {
            if (!z7) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i8, i9);
    }

    public void setMaxInlineActionWidth(int i8) {
        this.f32263u = i8;
    }
}
