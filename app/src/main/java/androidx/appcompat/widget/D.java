package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import g.AbstractC5794a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import x0.m;

/* loaded from: classes.dex */
public class D extends TextView implements androidx.core.widget.k {

    /* renamed from: o, reason: collision with root package name */
    private final C0845e f7401o;

    /* renamed from: s, reason: collision with root package name */
    private final C f7402s;

    /* renamed from: t, reason: collision with root package name */
    private final B f7403t;

    /* renamed from: u, reason: collision with root package name */
    private C0854n f7404u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7405v;

    /* renamed from: w, reason: collision with root package name */
    private a f7406w;

    /* renamed from: x, reason: collision with root package name */
    private Future f7407x;

    private interface a {
        void a(int[] iArr, int i8);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i8);

        void g(int i8, int i9, int i10, int i11);

        int h();

        int i();

        void j(int i8);

        int k();

        void l(int i8);

        void m(int i8, float f8);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.D.a
        public void a(int[] iArr, int i8) {
            D.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
        }

        @Override // androidx.appcompat.widget.D.a
        public int[] b() {
            return D.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.D.a
        public TextClassifier c() {
            return D.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.D.a
        public int d() {
            return D.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void e(TextClassifier textClassifier) {
            D.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.D.a
        public void f(int i8) {
        }

        @Override // androidx.appcompat.widget.D.a
        public void g(int i8, int i9, int i10, int i11) {
            D.super.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
        }

        @Override // androidx.appcompat.widget.D.a
        public int h() {
            return D.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.D.a
        public int i() {
            return D.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void j(int i8) {
        }

        @Override // androidx.appcompat.widget.D.a
        public int k() {
            return D.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.D.a
        public void l(int i8) {
            D.super.setAutoSizeTextTypeWithDefaults(i8);
        }

        @Override // androidx.appcompat.widget.D.a
        public void m(int i8, float f8) {
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void f(int i8) {
            D.super.setLastBaselineToBottomHeight(i8);
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void j(int i8) {
            D.super.setFirstBaselineToTopHeight(i8);
        }
    }

    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void m(int i8, float f8) {
            D.super.setLineHeight(i8, f8);
        }
    }

    public D(Context context) {
        this(context, null);
    }

    private void B() {
        Future future = this.f7407x;
        if (future != null) {
            try {
                this.f7407x = null;
                androidx.appcompat.app.E.a(future.get());
                androidx.core.widget.h.o(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C0854n getEmojiTextViewHelper() {
        if (this.f7404u == null) {
            this.f7404u = new C0854n(this);
        }
        return this.f7404u;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7401o;
        if (c0845e != null) {
            c0845e.b();
        }
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q0.f7925c) {
            return getSuperCaller().d();
        }
        C c8 = this.f7402s;
        if (c8 != null) {
            return c8.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q0.f7925c) {
            return getSuperCaller().i();
        }
        C c8 = this.f7402s;
        if (c8 != null) {
            return c8.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q0.f7925c) {
            return getSuperCaller().k();
        }
        C c8 = this.f7402s;
        if (c8 != null) {
            return c8.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q0.f7925c) {
            return getSuperCaller().b();
        }
        C c8 = this.f7402s;
        return c8 != null ? c8.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (q0.f7925c) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        C c8 = this.f7402s;
        if (c8 != null) {
            return c8.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.r(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.h.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.h.c(this);
    }

    a getSuperCaller() {
        if (this.f7406w == null) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 34) {
                this.f7406w = new d();
            } else if (i8 >= 28) {
                this.f7406w = new c();
            } else if (i8 >= 26) {
                this.f7406w = new b();
            }
        }
        return this.f7406w;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7401o;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7401o;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7402s.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7402s.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        B();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B b8;
        return (Build.VERSION.SDK_INT >= 28 || (b8 = this.f7403t) == null) ? getSuperCaller().c() : b8.a();
    }

    public m.a getTextMetricsParamsCompat() {
        return androidx.core.widget.h.g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f7402s.r(this, onCreateInputConnection, editorInfo);
        return AbstractC0855o.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30 || i8 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.o(z7, i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        B();
        super.onMeasure(i8, i9);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        C c8 = this.f7402s;
        if (c8 == null || q0.f7925c || !c8.l()) {
            return;
        }
        this.f7402s.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        if (q0.f7925c) {
            getSuperCaller().g(i8, i9, i10, i11);
            return;
        }
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.t(i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8) {
        if (q0.f7925c) {
            getSuperCaller().a(iArr, i8);
            return;
        }
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.u(iArr, i8);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i8) {
        if (q0.f7925c) {
            getSuperCaller().l(i8);
            return;
        }
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.v(i8);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7401o;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7401o;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().e(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i8);
        } else {
            androidx.core.widget.h.k(this, i8);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i8);
        } else {
            androidx.core.widget.h.l(this, i8);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i8) {
        androidx.core.widget.h.m(this, i8);
    }

    public void setPrecomputedText(x0.m mVar) {
        androidx.core.widget.h.o(this, mVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7401o;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7401o;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7402s.w(colorStateList);
        this.f7402s.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7402s.x(mode);
        this.f7402s.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b8;
        if (Build.VERSION.SDK_INT >= 28 || (b8 = this.f7403t) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            b8.b(textClassifier);
        }
    }

    public void setTextFuture(Future<x0.m> future) {
        this.f7407x = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m.a aVar) {
        androidx.core.widget.h.q(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i8, float f8) {
        if (q0.f7925c) {
            super.setTextSize(i8, f8);
            return;
        }
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.A(i8, f8);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i8) {
        if (this.f7405v) {
            return;
        }
        Typeface a8 = (typeface == null || i8 <= 0) ? null : q0.h.a(getContext(), typeface, i8);
        this.f7405v = true;
        if (a8 != null) {
            typeface = a8;
        }
        try {
            super.setTypeface(typeface, i8);
        } finally {
            this.f7405v = false;
        }
    }

    public D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i8, float f8) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().m(i8, f8);
        } else {
            androidx.core.widget.h.n(this, i8, f8);
        }
    }

    public D(Context context, AttributeSet attributeSet, int i8) {
        super(c0.b(context), attributeSet, i8);
        this.f7405v = false;
        this.f7406w = null;
        b0.a(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f7401o = c0845e;
        c0845e.e(attributeSet, i8);
        C c8 = new C(this);
        this.f7402s = c8;
        c8.m(attributeSet, i8);
        c8.b();
        this.f7403t = new B(this);
        getEmojiTextViewHelper().c(attributeSet, i8);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i8 != 0 ? AbstractC5794a.b(context, i8) : null, i9 != 0 ? AbstractC5794a.b(context, i9) : null, i10 != 0 ? AbstractC5794a.b(context, i10) : null, i11 != 0 ? AbstractC5794a.b(context, i11) : null);
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i8 != 0 ? AbstractC5794a.b(context, i8) : null, i9 != 0 ? AbstractC5794a.b(context, i9) : null, i10 != 0 ? AbstractC5794a.b(context, i10) : null, i11 != 0 ? AbstractC5794a.b(context, i11) : null);
        C c8 = this.f7402s;
        if (c8 != null) {
            c8.p();
        }
    }
}
