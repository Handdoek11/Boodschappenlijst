package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o extends SpannableStringBuilder {

    /* renamed from: o, reason: collision with root package name */
    private final Class f9700o;

    /* renamed from: s, reason: collision with root package name */
    private final List f9701s;

    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: o, reason: collision with root package name */
        final Object f9702o;

        /* renamed from: s, reason: collision with root package name */
        private final AtomicInteger f9703s = new AtomicInteger(0);

        a(Object obj) {
            this.f9702o = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof j;
        }

        final void a() {
            this.f9703s.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f9702o).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            ((TextWatcher) this.f9702o).beforeTextChanged(charSequence, i8, i9, i10);
        }

        final void c() {
            this.f9703s.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i8, int i9) {
            if (this.f9703s.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f9702o).onSpanAdded(spannable, obj, i8, i9);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r11
  0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
            /*
                r8 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r8.f9703s
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r8.b(r10)
                if (r0 == 0) goto Lf
                return
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L1e
                r0 = 0
                if (r11 <= r12) goto L19
                r11 = r0
            L19:
                if (r13 <= r14) goto L1e
                r4 = r11
                r6 = r0
                goto L20
            L1e:
                r4 = r11
                r6 = r13
            L20:
                java.lang.Object r11 = r8.f9702o
                r1 = r11
                android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
                r2 = r9
                r3 = r10
                r5 = r12
                r7 = r14
                r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.o.a.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i8, int i9) {
            if (this.f9703s.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f9702o).onSpanRemoved(spannable, obj, i8, i9);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            ((TextWatcher) this.f9702o).onTextChanged(charSequence, i8, i9, i10);
        }
    }

    o(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f9701s = new ArrayList();
        y0.i.h(cls, "watcherClass cannot be null");
        this.f9700o = cls;
    }

    private void b() {
        for (int i8 = 0; i8 < this.f9701s.size(); i8++) {
            ((a) this.f9701s.get(i8)).a();
        }
    }

    public static o c(Class cls, CharSequence charSequence) {
        return new o(cls, charSequence);
    }

    private void e() {
        for (int i8 = 0; i8 < this.f9701s.size(); i8++) {
            ((a) this.f9701s.get(i8)).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i8 = 0; i8 < this.f9701s.size(); i8++) {
            a aVar = (a) this.f9701s.get(i8);
            if (aVar.f9702o == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class cls) {
        return this.f9700o == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i8 = 0; i8 < this.f9701s.size(); i8++) {
            ((a) this.f9701s.get(i8)).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a f8;
        if (h(obj) && (f8 = f(obj)) != null) {
            obj = f8;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a f8;
        if (h(obj) && (f8 = f(obj)) != null) {
            obj = f8;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a f8;
        if (h(obj) && (f8 = f(obj)) != null) {
            obj = f8;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i8, int i9, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i8, i9, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i8, i9, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            objArr[i10] = aVarArr[i10].f9702o;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i8, int i9, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i8, i9, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f9701s.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i8, int i9, int i10) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f9701s.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i8, i9, i10);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        return new o(this.f9700o, this, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i8, int i9) {
        super.delete(i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i8, CharSequence charSequence) {
        super.insert(i8, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i8, int i9, CharSequence charSequence) {
        b();
        super.replace(i8, i9, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i8, CharSequence charSequence, int i9, int i10) {
        super.insert(i8, charSequence, i9, i10);
        return this;
    }

    o(Class cls, CharSequence charSequence, int i8, int i9) {
        super(charSequence, i8, i9);
        this.f9701s = new ArrayList();
        y0.i.h(cls, "watcherClass cannot be null");
        this.f9700o = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i8, int i9, CharSequence charSequence, int i10, int i11) {
        b();
        super.replace(i8, i9, charSequence, i10, i11);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i8, int i9) {
        super.append(charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i8) {
        super.append(charSequence, obj, i8);
        return this;
    }
}
