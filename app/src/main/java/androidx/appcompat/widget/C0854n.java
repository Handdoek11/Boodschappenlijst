package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0854n {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f7892a;

    /* renamed from: b, reason: collision with root package name */
    private final N0.f f7893b;

    C0854n(TextView textView) {
        this.f7892a = textView;
        this.f7893b = new N0.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f7893b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f7893b.b();
    }

    void c(AttributeSet attributeSet, int i8) {
        TypedArray obtainStyledAttributes = this.f7892a.getContext().obtainStyledAttributes(attributeSet, f.j.f35700g0, i8, 0);
        try {
            boolean z7 = obtainStyledAttributes.hasValue(f.j.f35770u0) ? obtainStyledAttributes.getBoolean(f.j.f35770u0, true) : true;
            obtainStyledAttributes.recycle();
            e(z7);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z7) {
        this.f7893b.c(z7);
    }

    void e(boolean z7) {
        this.f7893b.d(z7);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f7893b.e(transformationMethod);
    }
}
