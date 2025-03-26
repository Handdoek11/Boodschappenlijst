package com.headcode.ourgroceries.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.headcode.ourgroceries.android.C2;
import com.headcode.ourgroceries.android.P1;

/* loaded from: classes2.dex */
public class CapsuleView extends View {

    /* renamed from: o, reason: collision with root package name */
    private final int f35062o;

    /* renamed from: s, reason: collision with root package name */
    private final int f35063s;

    /* renamed from: t, reason: collision with root package name */
    private final int f35064t;

    /* renamed from: u, reason: collision with root package name */
    private final int f35065u;

    /* renamed from: v, reason: collision with root package name */
    private final Paint f35066v;

    /* renamed from: w, reason: collision with root package name */
    private final Paint f35067w;

    /* renamed from: x, reason: collision with root package name */
    private final RectF f35068x;

    /* renamed from: y, reason: collision with root package name */
    private String f35069y;

    public CapsuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35068x = new RectF();
        this.f35069y = "";
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f35062o = Math.round(36.0f * f8);
        this.f35063s = Math.round(24.0f * f8);
        int round = Math.round(f8 * 18.0f);
        this.f35064t = round;
        int v7 = P1.v(context, C2.f33312c, -1);
        int v8 = P1.v(context, C2.f33311b, -7829368);
        Paint paint = new Paint(1);
        this.f35066v = paint;
        paint.setColor(v8);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(129);
        this.f35067w = paint2;
        paint2.setColor(v7);
        paint2.setTextSize(round);
        paint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint2.setTextAlign(Paint.Align.CENTER);
        Rect rect = new Rect();
        paint2.getTextBounds("X", 0, 1, rect);
        this.f35065u = rect.height();
    }

    private int a(int i8) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = this.f35063s + getPaddingTop() + getPaddingBottom();
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    private int b(int i8) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode == 1073741824) {
            return size;
        }
        int paddingLeft = this.f35062o + getPaddingLeft() + getPaddingRight();
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f35068x;
        int i8 = this.f35063s;
        canvas.drawRoundRect(rectF, i8 / 2, i8 / 2, this.f35066v);
        String str = this.f35069y;
        float paddingLeft = getPaddingLeft() + (this.f35062o / 2);
        int paddingTop = getPaddingTop();
        int i9 = this.f35063s;
        int i10 = this.f35065u;
        canvas.drawText(str, paddingLeft, paddingTop + ((i9 - i10) / 2) + i10, this.f35067w);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(b(i8), a(i9));
        this.f35068x.set(getPaddingLeft(), getPaddingTop(), this.f35062o, this.f35063s);
    }

    public void setText(String str) {
        if (str == null) {
            str = "";
        }
        if (this.f35069y.equals(str)) {
            return;
        }
        this.f35069y = str;
        invalidate();
    }
}
