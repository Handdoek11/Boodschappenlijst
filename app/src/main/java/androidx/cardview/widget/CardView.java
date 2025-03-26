package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p.AbstractC6318a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f8018y = {R.attr.colorBackground};

    /* renamed from: z, reason: collision with root package name */
    private static final c f8019z;

    /* renamed from: o, reason: collision with root package name */
    private boolean f8020o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f8021s;

    /* renamed from: t, reason: collision with root package name */
    int f8022t;

    /* renamed from: u, reason: collision with root package name */
    int f8023u;

    /* renamed from: v, reason: collision with root package name */
    final Rect f8024v;

    /* renamed from: w, reason: collision with root package name */
    final Rect f8025w;

    /* renamed from: x, reason: collision with root package name */
    private final b f8026x;

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f8027a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(int i8, int i9, int i10, int i11) {
            CardView.this.f8025w.set(i8, i9, i10, i11);
            CardView cardView = CardView.this;
            Rect rect = cardView.f8024v;
            CardView.super.setPadding(i8 + rect.left, i9 + rect.top, i10 + rect.right, i11 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public void b(Drawable drawable) {
            this.f8027a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean c() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public boolean d() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable e() {
            return this.f8027a;
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f8019z = aVar;
        aVar.i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6318a.f40050a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f8019z.h(this.f8026x);
    }

    public float getCardElevation() {
        return f8019z.c(this.f8026x);
    }

    public int getContentPaddingBottom() {
        return this.f8024v.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f8024v.left;
    }

    public int getContentPaddingRight() {
        return this.f8024v.right;
    }

    public int getContentPaddingTop() {
        return this.f8024v.top;
    }

    public float getMaxCardElevation() {
        return f8019z.g(this.f8026x);
    }

    public boolean getPreventCornerOverlap() {
        return this.f8021s;
    }

    public float getRadius() {
        return f8019z.d(this.f8026x);
    }

    public boolean getUseCompatPadding() {
        return this.f8020o;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (f8019z instanceof androidx.cardview.widget.a) {
            super.onMeasure(i8, i9);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.f8026x)), View.MeasureSpec.getSize(i8)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i9);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.j(this.f8026x)), View.MeasureSpec.getSize(i9)), mode2);
        }
        super.onMeasure(i8, i9);
    }

    public void setCardBackgroundColor(int i8) {
        f8019z.m(this.f8026x, ColorStateList.valueOf(i8));
    }

    public void setCardElevation(float f8) {
        f8019z.f(this.f8026x, f8);
    }

    public void setMaxCardElevation(float f8) {
        f8019z.n(this.f8026x, f8);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i8) {
        this.f8023u = i8;
        super.setMinimumHeight(i8);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i8) {
        this.f8022t = i8;
        super.setMinimumWidth(i8);
    }

    @Override // android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i8, int i9, int i10, int i11) {
    }

    public void setPreventCornerOverlap(boolean z7) {
        if (z7 != this.f8021s) {
            this.f8021s = z7;
            f8019z.l(this.f8026x);
        }
    }

    public void setRadius(float f8) {
        f8019z.b(this.f8026x, f8);
    }

    public void setUseCompatPadding(boolean z7) {
        if (this.f8020o != z7) {
            this.f8020o = z7;
            f8019z.e(this.f8026x);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i8) {
        ColorStateList valueOf;
        super(context, attributeSet, i8);
        Rect rect = new Rect();
        this.f8024v = rect;
        this.f8025w = new Rect();
        a aVar = new a();
        this.f8026x = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.d.f40054a, i8, p.c.f40053a);
        if (obtainStyledAttributes.hasValue(p.d.f40057d)) {
            valueOf = obtainStyledAttributes.getColorStateList(p.d.f40057d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f8018y);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(p.b.f40052b) : getResources().getColor(p.b.f40051a));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(p.d.f40058e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(p.d.f40059f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(p.d.f40060g, 0.0f);
        this.f8020o = obtainStyledAttributes.getBoolean(p.d.f40062i, false);
        this.f8021s = obtainStyledAttributes.getBoolean(p.d.f40061h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(p.d.f40063j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(p.d.f40065l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(p.d.f40067n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(p.d.f40066m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(p.d.f40064k, dimensionPixelSize);
        float f8 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f8022t = obtainStyledAttributes.getDimensionPixelSize(p.d.f40055b, 0);
        this.f8023u = obtainStyledAttributes.getDimensionPixelSize(p.d.f40056c, 0);
        obtainStyledAttributes.recycle();
        f8019z.a(aVar, context, colorStateList, dimension, dimension2, f8);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f8019z.m(this.f8026x, colorStateList);
    }
}
