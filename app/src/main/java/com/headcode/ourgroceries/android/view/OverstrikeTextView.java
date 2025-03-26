package com.headcode.ourgroceries.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0848h;

/* loaded from: classes2.dex */
public class OverstrikeTextView extends C0848h {

    /* renamed from: A, reason: collision with root package name */
    private final float[] f35070A;

    /* renamed from: v, reason: collision with root package name */
    private final int f35071v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f35072w;

    /* renamed from: x, reason: collision with root package name */
    private final Paint f35073x;

    /* renamed from: y, reason: collision with root package name */
    private final Rect f35074y;

    /* renamed from: z, reason: collision with root package name */
    private final Rect f35075z;

    public OverstrikeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35072w = false;
        this.f35074y = new Rect();
        this.f35075z = new Rect();
        this.f35070A = new float[3];
        setTextAlignment(1);
        float f8 = context.getResources().getDisplayMetrics().density;
        int round = Math.round(3.0f * f8);
        this.f35071v = Math.round(f8 * 6.0f);
        Paint paint = new Paint(1);
        this.f35073x = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(round);
        paint.setStyle(Paint.Style.STROKE);
    }

    private void a(Canvas canvas) {
        float lineRight;
        float f8;
        int lineCount = getLineCount();
        if (lineCount <= 0) {
            return;
        }
        TextPaint paint = getPaint();
        int color = paint.getColor();
        Color.colorToHSV(color, this.f35070A);
        this.f35073x.setColor(color);
        this.f35073x.setAlpha(((double) this.f35070A[2]) >= 0.5d ? 153 : 76);
        Layout layout = getLayout();
        for (int i8 = 0; i8 < lineCount; i8++) {
            int lineBounds = getLineBounds(i8, this.f35075z);
            Rect rect = this.f35075z;
            int i9 = rect.left;
            float f9 = i9;
            float f10 = i9;
            if (layout != null) {
                f9 += layout.getLineLeft(i8);
                lineRight = layout.getLineRight(i8);
            } else if (lineCount > 1) {
                f8 = rect.right;
                float xHeight = lineBounds - (getXHeight() / 2.0f);
                int i10 = this.f35071v;
                canvas.drawLine(f9 - i10, xHeight, f8 + i10, xHeight, this.f35073x);
            } else {
                lineRight = paint.measureText(getText().toString());
            }
            f8 = lineRight + f10;
            float xHeight2 = lineBounds - (getXHeight() / 2.0f);
            int i102 = this.f35071v;
            canvas.drawLine(f9 - i102, xHeight2, f8 + i102, xHeight2, this.f35073x);
        }
    }

    private int getXHeight() {
        getPaint().getTextBounds((Build.VERSION.SDK_INT < 28 || !isAllCaps()) ? "x" : "X", 0, 1, this.f35074y);
        return this.f35074y.height();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f35072w) {
            a(canvas);
        }
    }

    public void setDrawOverstrike(boolean z7) {
        this.f35072w = z7;
        invalidate();
    }
}
