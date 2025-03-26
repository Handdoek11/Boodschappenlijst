package S3;

import D3.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import p0.h;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f5087a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f5088b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f5089c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5090d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5091e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5092f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5093g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5094h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5095i;

    /* renamed from: j, reason: collision with root package name */
    public final float f5096j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5097k;

    /* renamed from: l, reason: collision with root package name */
    public final float f5098l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f5099m;

    /* renamed from: n, reason: collision with root package name */
    private float f5100n;

    /* renamed from: o, reason: collision with root package name */
    private final int f5101o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5102p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f5103q;

    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f5104a;

        a(f fVar) {
            this.f5104a = fVar;
        }

        @Override // p0.h.e
        /* renamed from: h */
        public void f(int i8) {
            d.this.f5102p = true;
            this.f5104a.a(i8);
        }

        @Override // p0.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f5103q = Typeface.create(typeface, dVar.f5091e);
            d.this.f5102p = true;
            this.f5104a.b(d.this.f5103q, false);
        }
    }

    class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f5107b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f5108c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f5106a = context;
            this.f5107b = textPaint;
            this.f5108c = fVar;
        }

        @Override // S3.f
        public void a(int i8) {
            this.f5108c.a(i8);
        }

        @Override // S3.f
        public void b(Typeface typeface, boolean z7) {
            d.this.p(this.f5106a, this.f5107b, typeface);
            this.f5108c.b(typeface, z7);
        }
    }

    public d(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, l.f1974o6);
        l(obtainStyledAttributes.getDimension(l.f1983p6, 0.0f));
        k(c.a(context, obtainStyledAttributes, l.f2010s6));
        this.f5087a = c.a(context, obtainStyledAttributes, l.f2019t6);
        this.f5088b = c.a(context, obtainStyledAttributes, l.f2027u6);
        this.f5091e = obtainStyledAttributes.getInt(l.f2001r6, 0);
        this.f5092f = obtainStyledAttributes.getInt(l.f1992q6, 1);
        int f8 = c.f(obtainStyledAttributes, l.f1640A6, l.f2067z6);
        this.f5101o = obtainStyledAttributes.getResourceId(f8, 0);
        this.f5090d = obtainStyledAttributes.getString(f8);
        this.f5093g = obtainStyledAttributes.getBoolean(l.f1648B6, false);
        this.f5089c = c.a(context, obtainStyledAttributes, l.f2035v6);
        this.f5094h = obtainStyledAttributes.getFloat(l.f2043w6, 0.0f);
        this.f5095i = obtainStyledAttributes.getFloat(l.f2051x6, 0.0f);
        this.f5096j = obtainStyledAttributes.getFloat(l.f2059y6, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i8, l.f1900g4);
        this.f5097k = obtainStyledAttributes2.hasValue(l.f1909h4);
        this.f5098l = obtainStyledAttributes2.getFloat(l.f1909h4, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f5103q == null && (str = this.f5090d) != null) {
            this.f5103q = Typeface.create(str, this.f5091e);
        }
        if (this.f5103q == null) {
            int i8 = this.f5092f;
            if (i8 == 1) {
                this.f5103q = Typeface.SANS_SERIF;
            } else if (i8 == 2) {
                this.f5103q = Typeface.SERIF;
            } else if (i8 != 3) {
                this.f5103q = Typeface.DEFAULT;
            } else {
                this.f5103q = Typeface.MONOSPACE;
            }
            this.f5103q = Typeface.create(this.f5103q, this.f5091e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i8 = this.f5101o;
        return (i8 != 0 ? p0.h.c(context, i8) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f5103q;
    }

    public Typeface f(Context context) {
        if (this.f5102p) {
            return this.f5103q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g8 = p0.h.g(context, this.f5101o);
                this.f5103q = g8;
                if (g8 != null) {
                    this.f5103q = Typeface.create(g8, this.f5091e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e8) {
                Log.d("TextAppearance", "Error loading font " + this.f5090d, e8);
            }
        }
        d();
        this.f5102p = true;
        return this.f5103q;
    }

    public void g(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i8 = this.f5101o;
        if (i8 == 0) {
            this.f5102p = true;
        }
        if (this.f5102p) {
            fVar.b(this.f5103q, true);
            return;
        }
        try {
            p0.h.i(context, i8, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f5102p = true;
            fVar.a(1);
        } catch (Exception e8) {
            Log.d("TextAppearance", "Error loading font " + this.f5090d, e8);
            this.f5102p = true;
            fVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, fVar));
    }

    public ColorStateList i() {
        return this.f5099m;
    }

    public float j() {
        return this.f5100n;
    }

    public void k(ColorStateList colorStateList) {
        this.f5099m = colorStateList;
    }

    public void l(float f8) {
        this.f5100n = f8;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f5099m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f8 = this.f5096j;
        float f9 = this.f5094h;
        float f10 = this.f5095i;
        ColorStateList colorStateList2 = this.f5089c;
        textPaint.setShadowLayer(f8, f9, f10, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a8 = h.a(context, typeface);
        if (a8 != null) {
            typeface = a8;
        }
        textPaint.setTypeface(typeface);
        int i8 = this.f5091e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i8 & 1) != 0);
        textPaint.setTextSkewX((i8 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f5100n);
        if (this.f5097k) {
            textPaint.setLetterSpacing(this.f5098l);
        }
    }
}
