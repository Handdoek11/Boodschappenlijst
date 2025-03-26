package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class q extends j {

    /* renamed from: g, reason: collision with root package name */
    private static Paint f9708g;

    /* renamed from: f, reason: collision with root package name */
    private TextPaint f9709f;

    public q(p pVar) {
        super(pVar);
    }

    private TextPaint c(CharSequence charSequence, int i8, int i9, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i8, i9, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f9709f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f9709f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    private static Paint e() {
        if (f9708g == null) {
            TextPaint textPaint = new TextPaint();
            f9708g = textPaint;
            textPaint.setColor(f.c().d());
            f9708g.setStyle(Paint.Style.FILL);
        }
        return f9708g;
    }

    void d(Canvas canvas, TextPaint textPaint, float f8, float f9, float f10, float f11) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f8, f10, f9, f11, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i8, int i9, float f8, int i10, int i11, int i12, Paint paint) {
        Paint paint2 = paint;
        TextPaint c8 = c(charSequence, i8, i9, paint2);
        if (c8 != null && c8.bgColor != 0) {
            d(canvas, c8, f8, f8 + b(), i10, i12);
        }
        if (f.c().j()) {
            canvas.drawRect(f8, i10, f8 + b(), i12, e());
        }
        p a8 = a();
        float f9 = i11;
        if (c8 != null) {
            paint2 = c8;
        }
        a8.a(canvas, f8, f9, paint2);
    }
}
