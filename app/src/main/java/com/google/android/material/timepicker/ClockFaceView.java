package com.google.android.material.timepicker;

import A0.z;
import D3.h;
import D3.k;
import D3.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import g.AbstractC5794a;
import java.util.Arrays;
import z0.C7013a;
import z0.X;

/* loaded from: classes2.dex */
class ClockFaceView extends e implements ClockHandView.b {

    /* renamed from: T, reason: collision with root package name */
    private final ClockHandView f32604T;

    /* renamed from: U, reason: collision with root package name */
    private final Rect f32605U;

    /* renamed from: V, reason: collision with root package name */
    private final RectF f32606V;

    /* renamed from: W, reason: collision with root package name */
    private final Rect f32607W;

    /* renamed from: a0, reason: collision with root package name */
    private final SparseArray f32608a0;

    /* renamed from: b0, reason: collision with root package name */
    private final C7013a f32609b0;

    /* renamed from: c0, reason: collision with root package name */
    private final int[] f32610c0;

    /* renamed from: d0, reason: collision with root package name */
    private final float[] f32611d0;

    /* renamed from: e0, reason: collision with root package name */
    private final int f32612e0;

    /* renamed from: f0, reason: collision with root package name */
    private final int f32613f0;

    /* renamed from: g0, reason: collision with root package name */
    private final int f32614g0;

    /* renamed from: h0, reason: collision with root package name */
    private final int f32615h0;

    /* renamed from: i0, reason: collision with root package name */
    private String[] f32616i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f32617j0;

    /* renamed from: k0, reason: collision with root package name */
    private final ColorStateList f32618k0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.H(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f32604T.i()) - ClockFaceView.this.f32612e0);
            return true;
        }
    }

    class b extends C7013a {
        b() {
        }

        @Override // z0.C7013a
        public void k(View view, z zVar) {
            super.k(view, zVar);
            int intValue = ((Integer) view.getTag(D3.f.f1545p)).intValue();
            if (intValue > 0) {
                zVar.J0((View) ClockFaceView.this.f32608a0.get(intValue - 1));
            }
            zVar.n0(z.f.a(0, 1, intValue, 1, false, view.isSelected()));
            zVar.l0(true);
            zVar.b(z.a.f38i);
        }

        @Override // z0.C7013a
        public boolean n(View view, int i8, Bundle bundle) {
            if (i8 != 16) {
                return super.n(view, i8, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f32605U);
            float centerX = ClockFaceView.this.f32605U.centerX();
            float centerY = ClockFaceView.this.f32605U.centerY();
            ClockFaceView.this.f32604T.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            ClockFaceView.this.f32604T.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D3.b.f1424w);
    }

    private void P() {
        RectF e8 = this.f32604T.e();
        TextView R7 = R(e8);
        for (int i8 = 0; i8 < this.f32608a0.size(); i8++) {
            TextView textView = (TextView) this.f32608a0.get(i8);
            if (textView != null) {
                textView.setSelected(textView == R7);
                textView.getPaint().setShader(Q(e8, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient Q(RectF rectF, TextView textView) {
        textView.getHitRect(this.f32605U);
        this.f32606V.set(this.f32605U);
        textView.getLineBounds(0, this.f32607W);
        RectF rectF2 = this.f32606V;
        Rect rect = this.f32607W;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f32606V)) {
            return new RadialGradient(rectF.centerX() - this.f32606V.left, rectF.centerY() - this.f32606V.top, rectF.width() * 0.5f, this.f32610c0, this.f32611d0, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView R(RectF rectF) {
        float f8 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i8 = 0; i8 < this.f32608a0.size(); i8++) {
            TextView textView2 = (TextView) this.f32608a0.get(i8);
            if (textView2 != null) {
                textView2.getHitRect(this.f32605U);
                this.f32606V.set(this.f32605U);
                this.f32606V.union(rectF);
                float width = this.f32606V.width() * this.f32606V.height();
                if (width < f8) {
                    textView = textView2;
                    f8 = width;
                }
            }
        }
        return textView;
    }

    private static float S(float f8, float f9, float f10) {
        return Math.max(Math.max(f8, f9), f10);
    }

    private void U(int i8) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f32608a0.size();
        boolean z7 = false;
        for (int i9 = 0; i9 < Math.max(this.f32616i0.length, size); i9++) {
            TextView textView = (TextView) this.f32608a0.get(i9);
            if (i9 >= this.f32616i0.length) {
                removeView(textView);
                this.f32608a0.remove(i9);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(h.f1565h, (ViewGroup) this, false);
                    this.f32608a0.put(i9, textView);
                    addView(textView);
                }
                textView.setText(this.f32616i0[i9]);
                textView.setTag(D3.f.f1545p, Integer.valueOf(i9));
                int i10 = (i9 / 12) + 1;
                textView.setTag(D3.f.f1540k, Integer.valueOf(i10));
                if (i10 > 1) {
                    z7 = true;
                }
                X.n0(textView, this.f32609b0);
                textView.setTextColor(this.f32618k0);
                if (i8 != 0) {
                    textView.setContentDescription(getResources().getString(i8, this.f32616i0[i9]));
                }
            }
        }
        this.f32604T.q(z7);
    }

    @Override // com.google.android.material.timepicker.e
    public void H(int i8) {
        if (i8 != G()) {
            super.H(i8);
            this.f32604T.m(G());
        }
    }

    @Override // com.google.android.material.timepicker.e
    protected void J() {
        super.J();
        for (int i8 = 0; i8 < this.f32608a0.size(); i8++) {
            ((TextView) this.f32608a0.get(i8)).setVisibility(0);
        }
    }

    public void T(String[] strArr, int i8) {
        this.f32616i0 = strArr;
        U(i8);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f8, boolean z7) {
        if (Math.abs(this.f32617j0 - f8) > 0.001f) {
            this.f32617j0 = f8;
            P();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.M0(accessibilityNodeInfo).m0(z.e.a(1, this.f32616i0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        P();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int S7 = (int) (this.f32615h0 / S(this.f32613f0 / displayMetrics.heightPixels, this.f32614g0 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(S7, 1073741824);
        setMeasuredDimension(S7, S7);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f32605U = new Rect();
        this.f32606V = new RectF();
        this.f32607W = new Rect();
        this.f32608a0 = new SparseArray();
        this.f32611d0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f2014t1, i8, k.f1631u);
        Resources resources = getResources();
        ColorStateList a8 = S3.c.a(context, obtainStyledAttributes, l.f2030v1);
        this.f32618k0 = a8;
        LayoutInflater.from(context).inflate(h.f1566i, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(D3.f.f1539j);
        this.f32604T = clockHandView;
        this.f32612e0 = resources.getDimensionPixelSize(D3.d.f1498x);
        int colorForState = a8.getColorForState(new int[]{R.attr.state_selected}, a8.getDefaultColor());
        this.f32610c0 = new int[]{colorForState, colorForState, a8.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC5794a.a(context, D3.c.f1433f).getDefaultColor();
        ColorStateList a9 = S3.c.a(context, obtainStyledAttributes, l.f2022u1);
        setBackgroundColor(a9 != null ? a9.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f32609b0 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        T(strArr, 0);
        this.f32613f0 = resources.getDimensionPixelSize(D3.d.f1448K);
        this.f32614g0 = resources.getDimensionPixelSize(D3.d.f1449L);
        this.f32615h0 = resources.getDimensionPixelSize(D3.d.f1500z);
    }
}
