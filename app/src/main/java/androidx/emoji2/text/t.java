package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;

/* loaded from: classes.dex */
class t implements Spannable {

    /* renamed from: o, reason: collision with root package name */
    private boolean f9710o = false;

    /* renamed from: s, reason: collision with root package name */
    private Spannable f9711s;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.chars());
        }

        static IntStream b(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof x0.m;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.t.b
        boolean a(CharSequence charSequence) {
            return u.a(charSequence) || (charSequence instanceof x0.m);
        }
    }

    t(Spannable spannable) {
        this.f9711s = spannable;
    }

    private void a() {
        Spannable spannable = this.f9711s;
        if (!this.f9710o && c().a(spannable)) {
            this.f9711s = new SpannableString(spannable);
        }
        this.f9710o = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f9711s;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i8) {
        return this.f9711s.charAt(i8);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f9711s.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f9711s.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f9711s.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i8, int i9, Class cls) {
        return this.f9711s.getSpans(i8, i9, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f9711s.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i8, int i9, Class cls) {
        return this.f9711s.nextSpanTransition(i8, i9, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f9711s.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i8, int i9, int i10) {
        a();
        this.f9711s.setSpan(obj, i8, i9, i10);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        return this.f9711s.subSequence(i8, i9);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f9711s.toString();
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f9711s);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f9711s);
    }

    t(CharSequence charSequence) {
        this.f9711s = new SpannableString(charSequence);
    }
}
