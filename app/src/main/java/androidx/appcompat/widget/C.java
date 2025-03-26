package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p0.h;

/* loaded from: classes.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f7372a;

    /* renamed from: b, reason: collision with root package name */
    private d0 f7373b;

    /* renamed from: c, reason: collision with root package name */
    private d0 f7374c;

    /* renamed from: d, reason: collision with root package name */
    private d0 f7375d;

    /* renamed from: e, reason: collision with root package name */
    private d0 f7376e;

    /* renamed from: f, reason: collision with root package name */
    private d0 f7377f;

    /* renamed from: g, reason: collision with root package name */
    private d0 f7378g;

    /* renamed from: h, reason: collision with root package name */
    private d0 f7379h;

    /* renamed from: i, reason: collision with root package name */
    private final E f7380i;

    /* renamed from: j, reason: collision with root package name */
    private int f7381j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f7382k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f7383l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7384m;

    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f7387c;

        a(int i8, int i9, WeakReference weakReference) {
            this.f7385a = i8;
            this.f7386b = i9;
            this.f7387c = weakReference;
        }

        @Override // p0.h.e
        /* renamed from: h */
        public void f(int i8) {
        }

        @Override // p0.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i8;
            if (Build.VERSION.SDK_INT >= 28 && (i8 = this.f7385a) != -1) {
                typeface = f.a(typeface, i8, (this.f7386b & 2) != 0);
            }
            C.this.n(this.f7387c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ TextView f7389o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Typeface f7390s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f7391t;

        b(TextView textView, Typeface typeface, int i8) {
            this.f7389o = textView;
            this.f7390s = typeface;
            this.f7391t = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7389o.setTypeface(this.f7390s, this.f7391t);
        }
    }

    static class c {
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class d {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class e {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i8, int i9, int i10, int i11) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
        }

        static void c(TextView textView, int[] iArr, int i8) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class f {
        static Typeface a(Typeface typeface, int i8, boolean z7) {
            return Typeface.create(typeface, i8, z7);
        }
    }

    C(TextView textView) {
        this.f7372a = textView;
        this.f7380i = new E(textView);
    }

    private void B(int i8, float f8) {
        this.f7380i.t(i8, f8);
    }

    private void C(Context context, f0 f0Var) {
        String o8;
        this.f7381j = f0Var.k(f.j.f35652V2, this.f7381j);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int k8 = f0Var.k(f.j.f35664Y2, -1);
            this.f7382k = k8;
            if (k8 != -1) {
                this.f7381j &= 2;
            }
        }
        if (!f0Var.s(f.j.f35660X2) && !f0Var.s(f.j.f35668Z2)) {
            if (f0Var.s(f.j.f35648U2)) {
                this.f7384m = false;
                int k9 = f0Var.k(f.j.f35648U2, 1);
                if (k9 == 1) {
                    this.f7383l = Typeface.SANS_SERIF;
                    return;
                } else if (k9 == 2) {
                    this.f7383l = Typeface.SERIF;
                    return;
                } else {
                    if (k9 != 3) {
                        return;
                    }
                    this.f7383l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f7383l = null;
        int i9 = f0Var.s(f.j.f35668Z2) ? f.j.f35668Z2 : f.j.f35660X2;
        int i10 = this.f7382k;
        int i11 = this.f7381j;
        if (!context.isRestricted()) {
            try {
                Typeface j8 = f0Var.j(i9, this.f7381j, new a(i10, i11, new WeakReference(this.f7372a)));
                if (j8 != null) {
                    if (i8 < 28 || this.f7382k == -1) {
                        this.f7383l = j8;
                    } else {
                        this.f7383l = f.a(Typeface.create(j8, 0), this.f7382k, (this.f7381j & 2) != 0);
                    }
                }
                this.f7384m = this.f7383l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7383l != null || (o8 = f0Var.o(i9)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f7382k == -1) {
            this.f7383l = Typeface.create(o8, this.f7381j);
        } else {
            this.f7383l = f.a(Typeface.create(o8, 0), this.f7382k, (this.f7381j & 2) != 0);
        }
    }

    private void a(Drawable drawable, d0 d0Var) {
        if (drawable == null || d0Var == null) {
            return;
        }
        C0851k.i(drawable, d0Var, this.f7372a.getDrawableState());
    }

    private static d0 d(Context context, C0851k c0851k, int i8) {
        ColorStateList f8 = c0851k.f(context, i8);
        if (f8 == null) {
            return null;
        }
        d0 d0Var = new d0();
        d0Var.f7813d = true;
        d0Var.f7810a = f8;
        return d0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f7372a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f7372a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f7372a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f7372a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f7372a.getCompoundDrawables();
        TextView textView2 = this.f7372a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        d0 d0Var = this.f7379h;
        this.f7373b = d0Var;
        this.f7374c = d0Var;
        this.f7375d = d0Var;
        this.f7376e = d0Var;
        this.f7377f = d0Var;
        this.f7378g = d0Var;
    }

    void A(int i8, float f8) {
        if (q0.f7925c || l()) {
            return;
        }
        B(i8, f8);
    }

    void b() {
        if (this.f7373b != null || this.f7374c != null || this.f7375d != null || this.f7376e != null) {
            Drawable[] compoundDrawables = this.f7372a.getCompoundDrawables();
            a(compoundDrawables[0], this.f7373b);
            a(compoundDrawables[1], this.f7374c);
            a(compoundDrawables[2], this.f7375d);
            a(compoundDrawables[3], this.f7376e);
        }
        if (this.f7377f == null && this.f7378g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f7372a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f7377f);
        a(compoundDrawablesRelative[2], this.f7378g);
    }

    void c() {
        this.f7380i.a();
    }

    int e() {
        return this.f7380i.f();
    }

    int f() {
        return this.f7380i.g();
    }

    int g() {
        return this.f7380i.h();
    }

    int[] h() {
        return this.f7380i.i();
    }

    int i() {
        return this.f7380i.j();
    }

    ColorStateList j() {
        d0 d0Var = this.f7379h;
        if (d0Var != null) {
            return d0Var.f7810a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        d0 d0Var = this.f7379h;
        if (d0Var != null) {
            return d0Var.f7811b;
        }
        return null;
    }

    boolean l() {
        return this.f7380i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f7384m) {
            this.f7383l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f7381j));
                } else {
                    textView.setTypeface(typeface, this.f7381j);
                }
            }
        }
    }

    void o(boolean z7, int i8, int i9, int i10, int i11) {
        if (q0.f7925c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i8) {
        String o8;
        f0 t7 = f0.t(context, i8, f.j.f35640S2);
        if (t7.s(f.j.f35678b3)) {
            s(t7.a(f.j.f35678b3, false));
        }
        int i9 = Build.VERSION.SDK_INT;
        if (t7.s(f.j.f35644T2) && t7.f(f.j.f35644T2, -1) == 0) {
            this.f7372a.setTextSize(0, 0.0f);
        }
        C(context, t7);
        if (i9 >= 26 && t7.s(f.j.f35673a3) && (o8 = t7.o(f.j.f35673a3)) != null) {
            e.d(this.f7372a, o8);
        }
        t7.x();
        Typeface typeface = this.f7383l;
        if (typeface != null) {
            this.f7372a.setTypeface(typeface, this.f7381j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C0.c.f(editorInfo, textView.getText());
    }

    void s(boolean z7) {
        this.f7372a.setAllCaps(z7);
    }

    void t(int i8, int i9, int i10, int i11) {
        this.f7380i.p(i8, i9, i10, i11);
    }

    void u(int[] iArr, int i8) {
        this.f7380i.q(iArr, i8);
    }

    void v(int i8) {
        this.f7380i.r(i8);
    }

    void w(ColorStateList colorStateList) {
        if (this.f7379h == null) {
            this.f7379h = new d0();
        }
        d0 d0Var = this.f7379h;
        d0Var.f7810a = colorStateList;
        d0Var.f7813d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f7379h == null) {
            this.f7379h = new d0();
        }
        d0 d0Var = this.f7379h;
        d0Var.f7811b = mode;
        d0Var.f7812c = mode != null;
        z();
    }
}
