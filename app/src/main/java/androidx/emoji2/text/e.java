package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;
import q0.AbstractC6412c;

/* loaded from: classes.dex */
class e implements f.e {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f9619b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f9620a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f9620a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f9619b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(CharSequence charSequence, int i8, int i9, int i10) {
        StringBuilder b8 = b();
        b8.setLength(0);
        while (i8 < i9) {
            b8.append(charSequence.charAt(i8));
            i8++;
        }
        return AbstractC6412c.a(this.f9620a, b8.toString());
    }
}
