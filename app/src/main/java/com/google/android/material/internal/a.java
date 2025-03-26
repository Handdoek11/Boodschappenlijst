package com.google.android.material.internal;

import S3.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import t0.AbstractC6779a;
import z0.AbstractC7048s;
import z0.X;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f32030t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final Paint f32031u0 = null;

    /* renamed from: A, reason: collision with root package name */
    private Typeface f32032A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f32033B;

    /* renamed from: C, reason: collision with root package name */
    private Typeface f32034C;

    /* renamed from: D, reason: collision with root package name */
    private S3.a f32035D;

    /* renamed from: E, reason: collision with root package name */
    private S3.a f32036E;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f32038G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f32039H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f32040I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f32042K;

    /* renamed from: L, reason: collision with root package name */
    private Bitmap f32043L;

    /* renamed from: M, reason: collision with root package name */
    private Paint f32044M;

    /* renamed from: N, reason: collision with root package name */
    private float f32045N;

    /* renamed from: O, reason: collision with root package name */
    private float f32046O;

    /* renamed from: P, reason: collision with root package name */
    private float f32047P;

    /* renamed from: Q, reason: collision with root package name */
    private float f32048Q;

    /* renamed from: R, reason: collision with root package name */
    private float f32049R;

    /* renamed from: S, reason: collision with root package name */
    private int f32050S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f32051T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f32052U;

    /* renamed from: V, reason: collision with root package name */
    private final TextPaint f32053V;

    /* renamed from: W, reason: collision with root package name */
    private final TextPaint f32054W;

    /* renamed from: X, reason: collision with root package name */
    private TimeInterpolator f32055X;

    /* renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f32056Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f32057Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f32058a;

    /* renamed from: a0, reason: collision with root package name */
    private float f32059a0;

    /* renamed from: b, reason: collision with root package name */
    private float f32060b;

    /* renamed from: b0, reason: collision with root package name */
    private float f32061b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32062c;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f32063c0;

    /* renamed from: d, reason: collision with root package name */
    private float f32064d;

    /* renamed from: d0, reason: collision with root package name */
    private float f32065d0;

    /* renamed from: e, reason: collision with root package name */
    private float f32066e;

    /* renamed from: e0, reason: collision with root package name */
    private float f32067e0;

    /* renamed from: f, reason: collision with root package name */
    private int f32068f;

    /* renamed from: f0, reason: collision with root package name */
    private float f32069f0;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f32070g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f32071g0;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f32072h;

    /* renamed from: h0, reason: collision with root package name */
    private float f32073h0;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f32074i;

    /* renamed from: i0, reason: collision with root package name */
    private float f32075i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f32077j0;

    /* renamed from: k0, reason: collision with root package name */
    private StaticLayout f32079k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f32081l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f32083m0;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f32084n;

    /* renamed from: n0, reason: collision with root package name */
    private float f32085n0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f32086o;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f32087o0;

    /* renamed from: p, reason: collision with root package name */
    private int f32088p;

    /* renamed from: q, reason: collision with root package name */
    private float f32090q;

    /* renamed from: r, reason: collision with root package name */
    private float f32092r;

    /* renamed from: s, reason: collision with root package name */
    private float f32094s;

    /* renamed from: t, reason: collision with root package name */
    private float f32096t;

    /* renamed from: u, reason: collision with root package name */
    private float f32097u;

    /* renamed from: v, reason: collision with root package name */
    private float f32098v;

    /* renamed from: w, reason: collision with root package name */
    private Typeface f32099w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f32100x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f32101y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f32102z;

    /* renamed from: j, reason: collision with root package name */
    private int f32076j = 16;

    /* renamed from: k, reason: collision with root package name */
    private int f32078k = 16;

    /* renamed from: l, reason: collision with root package name */
    private float f32080l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f32082m = 15.0f;

    /* renamed from: F, reason: collision with root package name */
    private TextUtils.TruncateAt f32037F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    private boolean f32041J = true;

    /* renamed from: p0, reason: collision with root package name */
    private int f32089p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private float f32091q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    private float f32093r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    private int f32095s0 = h.f32119n;

    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0237a implements a.InterfaceC0100a {
        C0237a() {
        }

        @Override // S3.a.InterfaceC0100a
        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f32058a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f32053V = textPaint;
        this.f32054W = new TextPaint(textPaint);
        this.f32072h = new Rect();
        this.f32070g = new Rect();
        this.f32074i = new RectF();
        this.f32066e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f32080l);
        textPaint.setTypeface(this.f32102z);
        textPaint.setLetterSpacing(this.f32075i0);
    }

    private void B(float f8) {
        if (this.f32062c) {
            this.f32074i.set(f8 < this.f32066e ? this.f32070g : this.f32072h);
            return;
        }
        this.f32074i.left = G(this.f32070g.left, this.f32072h.left, f8, this.f32055X);
        this.f32074i.top = G(this.f32090q, this.f32092r, f8, this.f32055X);
        this.f32074i.right = G(this.f32070g.right, this.f32072h.right, f8, this.f32055X);
        this.f32074i.bottom = G(this.f32070g.bottom, this.f32072h.bottom, f8, this.f32055X);
    }

    private static boolean C(float f8, float f9) {
        return Math.abs(f8 - f9) < 1.0E-5f;
    }

    private boolean D() {
        return X.z(this.f32058a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z7) {
        return (z7 ? x0.o.f44413d : x0.o.f44412c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f8, float f9, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return E3.a.a(f8, f9, f10);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i8, int i9, int i10, int i11) {
        return rect.left == i8 && rect.top == i9 && rect.right == i10 && rect.bottom == i11;
    }

    private void Q(float f8) {
        this.f32083m0 = f8;
        X.e0(this.f32058a);
    }

    private boolean U(Typeface typeface) {
        S3.a aVar = this.f32036E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f32101y == typeface) {
            return false;
        }
        this.f32101y = typeface;
        Typeface b8 = S3.h.b(this.f32058a.getContext().getResources().getConfiguration(), typeface);
        this.f32100x = b8;
        if (b8 == null) {
            b8 = this.f32101y;
        }
        this.f32099w = b8;
        return true;
    }

    private void Y(float f8) {
        this.f32085n0 = f8;
        X.e0(this.f32058a);
    }

    private static int a(int i8, int i9, float f8) {
        float f9 = 1.0f - f8;
        return Color.argb(Math.round((Color.alpha(i8) * f9) + (Color.alpha(i9) * f8)), Math.round((Color.red(i8) * f9) + (Color.red(i9) * f8)), Math.round((Color.green(i8) * f9) + (Color.green(i9) * f8)), Math.round((Color.blue(i8) * f9) + (Color.blue(i9) * f8)));
    }

    private void b(boolean z7) {
        StaticLayout staticLayout;
        i(1.0f, z7);
        CharSequence charSequence = this.f32039H;
        if (charSequence != null && (staticLayout = this.f32079k0) != null) {
            this.f32087o0 = TextUtils.ellipsize(charSequence, this.f32053V, staticLayout.getWidth(), this.f32037F);
        }
        CharSequence charSequence2 = this.f32087o0;
        float f8 = 0.0f;
        if (charSequence2 != null) {
            this.f32081l0 = I(this.f32053V, charSequence2);
        } else {
            this.f32081l0 = 0.0f;
        }
        int b8 = AbstractC7048s.b(this.f32078k, this.f32040I ? 1 : 0);
        int i8 = b8 & 112;
        if (i8 == 48) {
            this.f32092r = this.f32072h.top;
        } else if (i8 != 80) {
            this.f32092r = this.f32072h.centerY() - ((this.f32053V.descent() - this.f32053V.ascent()) / 2.0f);
        } else {
            this.f32092r = this.f32072h.bottom + this.f32053V.ascent();
        }
        int i9 = b8 & 8388615;
        if (i9 == 1) {
            this.f32096t = this.f32072h.centerX() - (this.f32081l0 / 2.0f);
        } else if (i9 != 5) {
            this.f32096t = this.f32072h.left;
        } else {
            this.f32096t = this.f32072h.right - this.f32081l0;
        }
        i(0.0f, z7);
        float height = this.f32079k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f32079k0;
        if (staticLayout2 == null || this.f32089p0 <= 1) {
            CharSequence charSequence3 = this.f32039H;
            if (charSequence3 != null) {
                f8 = I(this.f32053V, charSequence3);
            }
        } else {
            f8 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f32079k0;
        this.f32088p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int b9 = AbstractC7048s.b(this.f32076j, this.f32040I ? 1 : 0);
        int i10 = b9 & 112;
        if (i10 == 48) {
            this.f32090q = this.f32070g.top;
        } else if (i10 != 80) {
            this.f32090q = this.f32070g.centerY() - (height / 2.0f);
        } else {
            this.f32090q = (this.f32070g.bottom - height) + this.f32053V.descent();
        }
        int i11 = b9 & 8388615;
        if (i11 == 1) {
            this.f32094s = this.f32070g.centerX() - (f8 / 2.0f);
        } else if (i11 != 5) {
            this.f32094s = this.f32070g.left;
        } else {
            this.f32094s = this.f32070g.right - f8;
        }
        j();
        d0(this.f32060b);
    }

    private boolean b0(Typeface typeface) {
        S3.a aVar = this.f32035D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f32033B == typeface) {
            return false;
        }
        this.f32033B = typeface;
        Typeface b8 = S3.h.b(this.f32058a.getContext().getResources().getConfiguration(), typeface);
        this.f32032A = b8;
        if (b8 == null) {
            b8 = this.f32033B;
        }
        this.f32102z = b8;
        return true;
    }

    private void c() {
        g(this.f32060b);
    }

    private float d(float f8) {
        float f9 = this.f32066e;
        return f8 <= f9 ? E3.a.b(1.0f, 0.0f, this.f32064d, f9, f8) : E3.a.b(0.0f, 1.0f, f9, 1.0f, f8);
    }

    private void d0(float f8) {
        h(f8);
        boolean z7 = f32030t0 && this.f32045N != 1.0f;
        this.f32042K = z7;
        if (z7) {
            n();
        }
        X.e0(this.f32058a);
    }

    private float e() {
        float f8 = this.f32064d;
        return f8 + ((1.0f - f8) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean D7 = D();
        return this.f32041J ? F(charSequence, D7) : D7;
    }

    private void g(float f8) {
        float f9;
        B(f8);
        if (!this.f32062c) {
            this.f32097u = G(this.f32094s, this.f32096t, f8, this.f32055X);
            this.f32098v = G(this.f32090q, this.f32092r, f8, this.f32055X);
            d0(f8);
            f9 = f8;
        } else if (f8 < this.f32066e) {
            this.f32097u = this.f32094s;
            this.f32098v = this.f32090q;
            d0(0.0f);
            f9 = 0.0f;
        } else {
            this.f32097u = this.f32096t;
            this.f32098v = this.f32092r - Math.max(0, this.f32068f);
            d0(1.0f);
            f9 = 1.0f;
        }
        TimeInterpolator timeInterpolator = E3.a.f2146b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f8, timeInterpolator));
        Y(G(1.0f, 0.0f, f8, timeInterpolator));
        if (this.f32086o != this.f32084n) {
            this.f32053V.setColor(a(v(), t(), f9));
        } else {
            this.f32053V.setColor(t());
        }
        int i8 = Build.VERSION.SDK_INT;
        float f10 = this.f32073h0;
        float f11 = this.f32075i0;
        if (f10 != f11) {
            this.f32053V.setLetterSpacing(G(f11, f10, f8, timeInterpolator));
        } else {
            this.f32053V.setLetterSpacing(f10);
        }
        this.f32047P = G(this.f32065d0, this.f32057Z, f8, null);
        this.f32048Q = G(this.f32067e0, this.f32059a0, f8, null);
        this.f32049R = G(this.f32069f0, this.f32061b0, f8, null);
        int a8 = a(u(this.f32071g0), u(this.f32063c0), f8);
        this.f32050S = a8;
        this.f32053V.setShadowLayer(this.f32047P, this.f32048Q, this.f32049R, a8);
        if (this.f32062c) {
            this.f32053V.setAlpha((int) (d(f8) * this.f32053V.getAlpha()));
            if (i8 >= 31) {
                TextPaint textPaint = this.f32053V;
                textPaint.setShadowLayer(this.f32047P, this.f32048Q, this.f32049R, L3.a.a(this.f32050S, textPaint.getAlpha()));
            }
        }
        X.e0(this.f32058a);
    }

    private void h(float f8) {
        i(f8, false);
    }

    private void i(float f8, boolean z7) {
        float f9;
        float f10;
        Typeface typeface;
        if (this.f32038G == null) {
            return;
        }
        float width = this.f32072h.width();
        float width2 = this.f32070g.width();
        if (C(f8, 1.0f)) {
            f9 = this.f32082m;
            f10 = this.f32073h0;
            this.f32045N = 1.0f;
            typeface = this.f32099w;
        } else {
            float f11 = this.f32080l;
            float f12 = this.f32075i0;
            Typeface typeface2 = this.f32102z;
            if (C(f8, 0.0f)) {
                this.f32045N = 1.0f;
            } else {
                this.f32045N = G(this.f32080l, this.f32082m, f8, this.f32056Y) / this.f32080l;
            }
            float f13 = this.f32082m / this.f32080l;
            width = (z7 || this.f32062c || width2 * f13 <= width) ? width2 : Math.min(width / f13, width2);
            f9 = f11;
            f10 = f12;
            typeface = typeface2;
        }
        if (width > 0.0f) {
            boolean z8 = this.f32046O != f9;
            boolean z9 = this.f32077j0 != f10;
            boolean z10 = this.f32034C != typeface;
            StaticLayout staticLayout = this.f32079k0;
            boolean z11 = z8 || z9 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z10 || this.f32052U;
            this.f32046O = f9;
            this.f32077j0 = f10;
            this.f32034C = typeface;
            this.f32052U = false;
            this.f32053V.setLinearText(this.f32045N != 1.0f);
            r5 = z11;
        }
        if (this.f32039H == null || r5) {
            this.f32053V.setTextSize(this.f32046O);
            this.f32053V.setTypeface(this.f32034C);
            this.f32053V.setLetterSpacing(this.f32077j0);
            this.f32040I = f(this.f32038G);
            StaticLayout k8 = k(j0() ? this.f32089p0 : 1, width, this.f32040I);
            this.f32079k0 = k8;
            this.f32039H = k8.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f32043L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f32043L = null;
        }
    }

    private boolean j0() {
        return this.f32089p0 > 1 && (!this.f32040I || this.f32062c) && !this.f32042K;
    }

    private StaticLayout k(int i8, float f8, boolean z7) {
        return (StaticLayout) y0.i.g(h.b(this.f32038G, this.f32053V, (int) f8).d(this.f32037F).g(z7).c(i8 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i8).h(this.f32091q0, this.f32093r0).e(this.f32095s0).j(null).a());
    }

    private void m(Canvas canvas, float f8, float f9) {
        int alpha = this.f32053V.getAlpha();
        canvas.translate(f8, f9);
        if (!this.f32062c) {
            this.f32053V.setAlpha((int) (this.f32085n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f32053V;
                textPaint.setShadowLayer(this.f32047P, this.f32048Q, this.f32049R, L3.a.a(this.f32050S, textPaint.getAlpha()));
            }
            this.f32079k0.draw(canvas);
        }
        if (!this.f32062c) {
            this.f32053V.setAlpha((int) (this.f32083m0 * alpha));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            TextPaint textPaint2 = this.f32053V;
            textPaint2.setShadowLayer(this.f32047P, this.f32048Q, this.f32049R, L3.a.a(this.f32050S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f32079k0.getLineBaseline(0);
        CharSequence charSequence = this.f32087o0;
        float f10 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f10, this.f32053V);
        if (i8 >= 31) {
            this.f32053V.setShadowLayer(this.f32047P, this.f32048Q, this.f32049R, this.f32050S);
        }
        if (this.f32062c) {
            return;
        }
        String trim = this.f32087o0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f32053V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f32079k0.getLineEnd(0), str.length()), 0.0f, f10, (Paint) this.f32053V);
    }

    private void n() {
        if (this.f32043L != null || this.f32070g.isEmpty() || TextUtils.isEmpty(this.f32039H)) {
            return;
        }
        g(0.0f);
        int width = this.f32079k0.getWidth();
        int height = this.f32079k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f32043L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f32079k0.draw(new Canvas(this.f32043L));
        if (this.f32044M == null) {
            this.f32044M = new Paint(3);
        }
    }

    private float r(int i8, int i9) {
        return (i9 == 17 || (i9 & 7) == 1) ? (i8 / 2.0f) - (this.f32081l0 / 2.0f) : ((i9 & 8388613) == 8388613 || (i9 & 5) == 5) ? this.f32040I ? this.f32072h.left : this.f32072h.right - this.f32081l0 : this.f32040I ? this.f32072h.right - this.f32081l0 : this.f32072h.left;
    }

    private float s(RectF rectF, int i8, int i9) {
        return (i9 == 17 || (i9 & 7) == 1) ? (i8 / 2.0f) + (this.f32081l0 / 2.0f) : ((i9 & 8388613) == 8388613 || (i9 & 5) == 5) ? this.f32040I ? rectF.left + this.f32081l0 : this.f32072h.right : this.f32040I ? this.f32072h.right : rectF.left + this.f32081l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f32051T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f32084n);
    }

    private Layout.Alignment y() {
        int b8 = AbstractC7048s.b(this.f32076j, this.f32040I ? 1 : 0) & 7;
        return b8 != 1 ? b8 != 5 ? this.f32040I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f32040I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f32082m);
        textPaint.setTypeface(this.f32099w);
        textPaint.setLetterSpacing(this.f32073h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f32086o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f32084n) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f32101y;
            if (typeface != null) {
                this.f32100x = S3.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.f32033B;
            if (typeface2 != null) {
                this.f32032A = S3.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f32100x;
            if (typeface3 == null) {
                typeface3 = this.f32101y;
            }
            this.f32099w = typeface3;
            Typeface typeface4 = this.f32032A;
            if (typeface4 == null) {
                typeface4 = this.f32033B;
            }
            this.f32102z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z7) {
        if ((this.f32058a.getHeight() <= 0 || this.f32058a.getWidth() <= 0) && !z7) {
            return;
        }
        b(z7);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f32086o == colorStateList && this.f32084n == colorStateList) {
            return;
        }
        this.f32086o = colorStateList;
        this.f32084n = colorStateList;
        J();
    }

    public void N(int i8, int i9, int i10, int i11) {
        if (L(this.f32072h, i8, i9, i10, i11)) {
            return;
        }
        this.f32072h.set(i8, i9, i10, i11);
        this.f32052U = true;
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i8) {
        S3.d dVar = new S3.d(this.f32058a.getContext(), i8);
        if (dVar.i() != null) {
            this.f32086o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f32082m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f5089c;
        if (colorStateList != null) {
            this.f32063c0 = colorStateList;
        }
        this.f32059a0 = dVar.f5094h;
        this.f32061b0 = dVar.f5095i;
        this.f32057Z = dVar.f5096j;
        this.f32073h0 = dVar.f5098l;
        S3.a aVar = this.f32036E;
        if (aVar != null) {
            aVar.c();
        }
        this.f32036E = new S3.a(new C0237a(), dVar.e());
        dVar.g(this.f32058a.getContext(), this.f32036E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f32086o != colorStateList) {
            this.f32086o = colorStateList;
            J();
        }
    }

    public void S(int i8) {
        if (this.f32078k != i8) {
            this.f32078k = i8;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i8, int i9, int i10, int i11) {
        if (L(this.f32070g, i8, i9, i10, i11)) {
            return;
        }
        this.f32070g.set(i8, i9, i10, i11);
        this.f32052U = true;
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f8) {
        if (this.f32075i0 != f8) {
            this.f32075i0 = f8;
            J();
        }
    }

    public void Z(int i8) {
        if (this.f32076j != i8) {
            this.f32076j = i8;
            J();
        }
    }

    public void a0(float f8) {
        if (this.f32080l != f8) {
            this.f32080l = f8;
            J();
        }
    }

    public void c0(float f8) {
        float a8 = AbstractC6779a.a(f8, 0.0f, 1.0f);
        if (a8 != this.f32060b) {
            this.f32060b = a8;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.f32055X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.f32051T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f32038G, charSequence)) {
            this.f32038G = charSequence;
            this.f32039H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.f32056Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean U7 = U(typeface);
        boolean b02 = b0(typeface);
        if (U7 || b02) {
            J();
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.f32039H == null || this.f32074i.width() <= 0.0f || this.f32074i.height() <= 0.0f) {
            return;
        }
        this.f32053V.setTextSize(this.f32046O);
        float f8 = this.f32097u;
        float f9 = this.f32098v;
        boolean z7 = this.f32042K && this.f32043L != null;
        float f10 = this.f32045N;
        if (f10 != 1.0f && !this.f32062c) {
            canvas.scale(f10, f10, f8, f9);
        }
        if (z7) {
            canvas.drawBitmap(this.f32043L, f8, f9, this.f32044M);
            canvas.restoreToCount(save);
            return;
        }
        if (!j0() || (this.f32062c && this.f32060b <= this.f32066e)) {
            canvas.translate(f8, f9);
            this.f32079k0.draw(canvas);
        } else {
            m(canvas, this.f32097u - this.f32079k0.getLineStart(0), f9);
        }
        canvas.restoreToCount(save);
    }

    public void o(RectF rectF, int i8, int i9) {
        this.f32040I = f(this.f32038G);
        rectF.left = Math.max(r(i8, i9), this.f32072h.left);
        rectF.top = this.f32072h.top;
        rectF.right = Math.min(s(rectF, i8, i9), this.f32072h.right);
        rectF.bottom = this.f32072h.top + q();
    }

    public ColorStateList p() {
        return this.f32086o;
    }

    public float q() {
        z(this.f32054W);
        return -this.f32054W.ascent();
    }

    public int t() {
        return u(this.f32086o);
    }

    public float w() {
        A(this.f32054W);
        return -this.f32054W.ascent();
    }

    public float x() {
        return this.f32060b;
    }
}
