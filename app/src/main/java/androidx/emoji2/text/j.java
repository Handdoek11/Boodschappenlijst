package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    private final p f9675b;

    /* renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f9674a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    private short f9676c = -1;

    /* renamed from: d, reason: collision with root package name */
    private short f9677d = -1;

    /* renamed from: e, reason: collision with root package name */
    private float f9678e = 1.0f;

    j(p pVar) {
        y0.i.h(pVar, "rasterizer cannot be null");
        this.f9675b = pVar;
    }

    public final p a() {
        return this.f9675b;
    }

    final int b() {
        return this.f9676c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f9674a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f9674a;
        this.f9678e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f9675b.e();
        this.f9677d = (short) (this.f9675b.e() * this.f9678e);
        short i10 = (short) (this.f9675b.i() * this.f9678e);
        this.f9676c = i10;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f9674a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i10;
    }
}
