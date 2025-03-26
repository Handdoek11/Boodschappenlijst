package V3;

import V3.k;
import V3.l;
import V3.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class g extends Drawable implements n {

    /* renamed from: O, reason: collision with root package name */
    private static final String f5600O = "g";

    /* renamed from: P, reason: collision with root package name */
    private static final Paint f5601P;

    /* renamed from: A, reason: collision with root package name */
    private final RectF f5602A;

    /* renamed from: B, reason: collision with root package name */
    private final Region f5603B;

    /* renamed from: C, reason: collision with root package name */
    private final Region f5604C;

    /* renamed from: D, reason: collision with root package name */
    private k f5605D;

    /* renamed from: E, reason: collision with root package name */
    private final Paint f5606E;

    /* renamed from: F, reason: collision with root package name */
    private final Paint f5607F;

    /* renamed from: G, reason: collision with root package name */
    private final U3.a f5608G;

    /* renamed from: H, reason: collision with root package name */
    private final l.b f5609H;

    /* renamed from: I, reason: collision with root package name */
    private final l f5610I;

    /* renamed from: J, reason: collision with root package name */
    private PorterDuffColorFilter f5611J;

    /* renamed from: K, reason: collision with root package name */
    private PorterDuffColorFilter f5612K;

    /* renamed from: L, reason: collision with root package name */
    private int f5613L;

    /* renamed from: M, reason: collision with root package name */
    private final RectF f5614M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f5615N;

    /* renamed from: o, reason: collision with root package name */
    private c f5616o;

    /* renamed from: s, reason: collision with root package name */
    private final m.g[] f5617s;

    /* renamed from: t, reason: collision with root package name */
    private final m.g[] f5618t;

    /* renamed from: u, reason: collision with root package name */
    private final BitSet f5619u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5620v;

    /* renamed from: w, reason: collision with root package name */
    private final Matrix f5621w;

    /* renamed from: x, reason: collision with root package name */
    private final Path f5622x;

    /* renamed from: y, reason: collision with root package name */
    private final Path f5623y;

    /* renamed from: z, reason: collision with root package name */
    private final RectF f5624z;

    class a implements l.b {
        a() {
        }

        @Override // V3.l.b
        public void a(m mVar, Matrix matrix, int i8) {
            g.this.f5619u.set(i8 + 4, mVar.e());
            g.this.f5618t[i8] = mVar.f(matrix);
        }

        @Override // V3.l.b
        public void b(m mVar, Matrix matrix, int i8) {
            g.this.f5619u.set(i8, mVar.e());
            g.this.f5617s[i8] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f5626a;

        b(float f8) {
            this.f5626a = f8;
        }

        @Override // V3.k.c
        public V3.c a(V3.c cVar) {
            return cVar instanceof i ? cVar : new V3.b(this.f5626a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f5601P = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float B() {
        if (I()) {
            return this.f5607F.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean G() {
        c cVar = this.f5616o;
        int i8 = cVar.f5644q;
        return i8 != 1 && cVar.f5645r > 0 && (i8 == 2 || Q());
    }

    private boolean H() {
        Paint.Style style = this.f5616o.f5649v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean I() {
        Paint.Style style = this.f5616o.f5649v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f5607F.getStrokeWidth() > 0.0f;
    }

    private void K() {
        super.invalidateSelf();
    }

    private void N(Canvas canvas) {
        if (G()) {
            canvas.save();
            P(canvas);
            if (!this.f5615N) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f5614M.width() - getBounds().width());
            int height = (int) (this.f5614M.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f5614M.width()) + (this.f5616o.f5645r * 2) + width, ((int) this.f5614M.height()) + (this.f5616o.f5645r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f8 = (getBounds().left - this.f5616o.f5645r) - width;
            float f9 = (getBounds().top - this.f5616o.f5645r) - height;
            canvas2.translate(-f8, -f9);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f8, f9, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int O(int i8, int i9) {
        return (i8 * (i9 + (i9 >>> 7))) >>> 8;
    }

    private void P(Canvas canvas) {
        canvas.translate(y(), z());
    }

    private boolean c0(int[] iArr) {
        boolean z7;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f5616o.f5631d == null || color2 == (colorForState2 = this.f5616o.f5631d.getColorForState(iArr, (color2 = this.f5606E.getColor())))) {
            z7 = false;
        } else {
            this.f5606E.setColor(colorForState2);
            z7 = true;
        }
        if (this.f5616o.f5632e == null || color == (colorForState = this.f5616o.f5632e.getColorForState(iArr, (color = this.f5607F.getColor())))) {
            return z7;
        }
        this.f5607F.setColor(colorForState);
        return true;
    }

    private boolean d0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f5611J;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f5612K;
        c cVar = this.f5616o;
        this.f5611J = k(cVar.f5634g, cVar.f5635h, this.f5606E, true);
        c cVar2 = this.f5616o;
        this.f5612K = k(cVar2.f5633f, cVar2.f5635h, this.f5607F, false);
        c cVar3 = this.f5616o;
        if (cVar3.f5648u) {
            this.f5608G.d(cVar3.f5634g.getColorForState(getState(), 0));
        }
        return (y0.d.a(porterDuffColorFilter, this.f5611J) && y0.d.a(porterDuffColorFilter2, this.f5612K)) ? false : true;
    }

    private void e0() {
        float F7 = F();
        this.f5616o.f5645r = (int) Math.ceil(0.75f * F7);
        this.f5616o.f5646s = (int) Math.ceil(F7 * 0.25f);
        d0();
        K();
    }

    private PorterDuffColorFilter f(Paint paint, boolean z7) {
        if (!z7) {
            return null;
        }
        int color = paint.getColor();
        int l8 = l(color);
        this.f5613L = l8;
        if (l8 != color) {
            return new PorterDuffColorFilter(l8, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f5616o.f5637j != 1.0f) {
            this.f5621w.reset();
            Matrix matrix = this.f5621w;
            float f8 = this.f5616o.f5637j;
            matrix.setScale(f8, f8, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f5621w);
        }
        path.computeBounds(this.f5614M, true);
    }

    private void i() {
        k y7 = A().y(new b(-B()));
        this.f5605D = y7;
        this.f5610I.e(y7, this.f5616o.f5638k, t(), this.f5623y);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z7) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z7) {
            colorForState = l(colorForState);
        }
        this.f5613L = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z7) {
        return (colorStateList == null || mode == null) ? f(paint, z7) : j(colorStateList, mode, z7);
    }

    public static g m(Context context, float f8, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(L3.a.c(context, D3.b.f1413l, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.J(context);
        gVar.U(colorStateList);
        gVar.T(f8);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f5619u.cardinality() > 0) {
            Log.w(f5600O, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f5616o.f5646s != 0) {
            canvas.drawPath(this.f5622x, this.f5608G.c());
        }
        for (int i8 = 0; i8 < 4; i8++) {
            this.f5617s[i8].a(this.f5608G, this.f5616o.f5645r, canvas);
            this.f5618t[i8].a(this.f5608G, this.f5616o.f5645r, canvas);
        }
        if (this.f5615N) {
            int y7 = y();
            int z7 = z();
            canvas.translate(-y7, -z7);
            canvas.drawPath(this.f5622x, f5601P);
            canvas.translate(y7, z7);
        }
    }

    private void o(Canvas canvas) {
        p(canvas, this.f5606E, this.f5622x, this.f5616o.f5628a, s());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a8 = kVar.t().a(rectF) * this.f5616o.f5638k;
            canvas.drawRoundRect(rectF, a8, a8, paint);
        }
    }

    private RectF t() {
        this.f5602A.set(s());
        float B7 = B();
        this.f5602A.inset(B7, B7);
        return this.f5602A;
    }

    public k A() {
        return this.f5616o.f5628a;
    }

    public float C() {
        return this.f5616o.f5628a.r().a(s());
    }

    public float D() {
        return this.f5616o.f5628a.t().a(s());
    }

    public float E() {
        return this.f5616o.f5643p;
    }

    public float F() {
        return u() + E();
    }

    public void J(Context context) {
        this.f5616o.f5629b = new N3.a(context);
        e0();
    }

    public boolean L() {
        N3.a aVar = this.f5616o.f5629b;
        return aVar != null && aVar.d();
    }

    public boolean M() {
        return this.f5616o.f5628a.u(s());
    }

    public boolean Q() {
        return (M() || this.f5622x.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void R(float f8) {
        setShapeAppearanceModel(this.f5616o.f5628a.w(f8));
    }

    public void S(V3.c cVar) {
        setShapeAppearanceModel(this.f5616o.f5628a.x(cVar));
    }

    public void T(float f8) {
        c cVar = this.f5616o;
        if (cVar.f5642o != f8) {
            cVar.f5642o = f8;
            e0();
        }
    }

    public void U(ColorStateList colorStateList) {
        c cVar = this.f5616o;
        if (cVar.f5631d != colorStateList) {
            cVar.f5631d = colorStateList;
            onStateChange(getState());
        }
    }

    public void V(float f8) {
        c cVar = this.f5616o;
        if (cVar.f5638k != f8) {
            cVar.f5638k = f8;
            this.f5620v = true;
            invalidateSelf();
        }
    }

    public void W(int i8, int i9, int i10, int i11) {
        c cVar = this.f5616o;
        if (cVar.f5636i == null) {
            cVar.f5636i = new Rect();
        }
        this.f5616o.f5636i.set(i8, i9, i10, i11);
        invalidateSelf();
    }

    public void X(float f8) {
        c cVar = this.f5616o;
        if (cVar.f5641n != f8) {
            cVar.f5641n = f8;
            e0();
        }
    }

    public void Y(float f8, int i8) {
        b0(f8);
        a0(ColorStateList.valueOf(i8));
    }

    public void Z(float f8, ColorStateList colorStateList) {
        b0(f8);
        a0(colorStateList);
    }

    public void a0(ColorStateList colorStateList) {
        c cVar = this.f5616o;
        if (cVar.f5632e != colorStateList) {
            cVar.f5632e = colorStateList;
            onStateChange(getState());
        }
    }

    public void b0(float f8) {
        this.f5616o.f5639l = f8;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f5606E.setColorFilter(this.f5611J);
        int alpha = this.f5606E.getAlpha();
        this.f5606E.setAlpha(O(alpha, this.f5616o.f5640m));
        this.f5607F.setColorFilter(this.f5612K);
        this.f5607F.setStrokeWidth(this.f5616o.f5639l);
        int alpha2 = this.f5607F.getAlpha();
        this.f5607F.setAlpha(O(alpha2, this.f5616o.f5640m));
        if (this.f5620v) {
            i();
            g(s(), this.f5622x);
            this.f5620v = false;
        }
        N(canvas);
        if (H()) {
            o(canvas);
        }
        if (I()) {
            r(canvas);
        }
        this.f5606E.setAlpha(alpha);
        this.f5607F.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5616o.f5640m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5616o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f5616o.f5644q == 2) {
            return;
        }
        if (M()) {
            outline.setRoundRect(getBounds(), C() * this.f5616o.f5638k);
        } else {
            g(s(), this.f5622x);
            com.google.android.material.drawable.d.j(outline, this.f5622x);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f5616o.f5636i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f5603B.set(getBounds());
        g(s(), this.f5622x);
        this.f5604C.setPath(this.f5622x, this.f5603B);
        this.f5603B.op(this.f5604C, Region.Op.DIFFERENCE);
        return this.f5603B;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.f5610I;
        c cVar = this.f5616o;
        lVar.d(cVar.f5628a, cVar.f5638k, rectF, this.f5609H, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f5620v = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f5616o.f5634g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f5616o.f5633f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f5616o.f5632e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f5616o.f5631d) != null && colorStateList4.isStateful())));
    }

    protected int l(int i8) {
        float F7 = F() + x();
        N3.a aVar = this.f5616o.f5629b;
        return aVar != null ? aVar.c(i8, F7) : i8;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5616o = new c(this.f5616o);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f5620v = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z7 = c0(iArr) || d0();
        if (z7) {
            invalidateSelf();
        }
        return z7;
    }

    protected void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f5616o.f5628a, rectF);
    }

    protected void r(Canvas canvas) {
        p(canvas, this.f5607F, this.f5623y, this.f5605D, t());
    }

    protected RectF s() {
        this.f5624z.set(getBounds());
        return this.f5624z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        c cVar = this.f5616o;
        if (cVar.f5640m != i8) {
            cVar.f5640m = i8;
            K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5616o.f5630c = colorFilter;
        K();
    }

    @Override // V3.n
    public void setShapeAppearanceModel(k kVar) {
        this.f5616o.f5628a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i8) {
        setTintList(ColorStateList.valueOf(i8));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5616o.f5634g = colorStateList;
        d0();
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f5616o;
        if (cVar.f5635h != mode) {
            cVar.f5635h = mode;
            d0();
            K();
        }
    }

    public float u() {
        return this.f5616o.f5642o;
    }

    public ColorStateList v() {
        return this.f5616o.f5631d;
    }

    public float w() {
        return this.f5616o.f5638k;
    }

    public float x() {
        return this.f5616o.f5641n;
    }

    public int y() {
        c cVar = this.f5616o;
        return (int) (cVar.f5646s * Math.sin(Math.toRadians(cVar.f5647t)));
    }

    public int z() {
        c cVar = this.f5616o;
        return (int) (cVar.f5646s * Math.cos(Math.toRadians(cVar.f5647t)));
    }

    public g(Context context, AttributeSet attributeSet, int i8, int i9) {
        this(k.e(context, attributeSet, i8, i9).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    protected g(c cVar) {
        l lVar;
        this.f5617s = new m.g[4];
        this.f5618t = new m.g[4];
        this.f5619u = new BitSet(8);
        this.f5621w = new Matrix();
        this.f5622x = new Path();
        this.f5623y = new Path();
        this.f5624z = new RectF();
        this.f5602A = new RectF();
        this.f5603B = new Region();
        this.f5604C = new Region();
        Paint paint = new Paint(1);
        this.f5606E = paint;
        Paint paint2 = new Paint(1);
        this.f5607F = paint2;
        this.f5608G = new U3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f5610I = lVar;
        this.f5614M = new RectF();
        this.f5615N = true;
        this.f5616o = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        d0();
        c0(getState());
        this.f5609H = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        k f5628a;

        /* renamed from: b, reason: collision with root package name */
        N3.a f5629b;

        /* renamed from: c, reason: collision with root package name */
        ColorFilter f5630c;

        /* renamed from: d, reason: collision with root package name */
        ColorStateList f5631d;

        /* renamed from: e, reason: collision with root package name */
        ColorStateList f5632e;

        /* renamed from: f, reason: collision with root package name */
        ColorStateList f5633f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f5634g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f5635h;

        /* renamed from: i, reason: collision with root package name */
        Rect f5636i;

        /* renamed from: j, reason: collision with root package name */
        float f5637j;

        /* renamed from: k, reason: collision with root package name */
        float f5638k;

        /* renamed from: l, reason: collision with root package name */
        float f5639l;

        /* renamed from: m, reason: collision with root package name */
        int f5640m;

        /* renamed from: n, reason: collision with root package name */
        float f5641n;

        /* renamed from: o, reason: collision with root package name */
        float f5642o;

        /* renamed from: p, reason: collision with root package name */
        float f5643p;

        /* renamed from: q, reason: collision with root package name */
        int f5644q;

        /* renamed from: r, reason: collision with root package name */
        int f5645r;

        /* renamed from: s, reason: collision with root package name */
        int f5646s;

        /* renamed from: t, reason: collision with root package name */
        int f5647t;

        /* renamed from: u, reason: collision with root package name */
        boolean f5648u;

        /* renamed from: v, reason: collision with root package name */
        Paint.Style f5649v;

        public c(k kVar, N3.a aVar) {
            this.f5631d = null;
            this.f5632e = null;
            this.f5633f = null;
            this.f5634g = null;
            this.f5635h = PorterDuff.Mode.SRC_IN;
            this.f5636i = null;
            this.f5637j = 1.0f;
            this.f5638k = 1.0f;
            this.f5640m = 255;
            this.f5641n = 0.0f;
            this.f5642o = 0.0f;
            this.f5643p = 0.0f;
            this.f5644q = 0;
            this.f5645r = 0;
            this.f5646s = 0;
            this.f5647t = 0;
            this.f5648u = false;
            this.f5649v = Paint.Style.FILL_AND_STROKE;
            this.f5628a = kVar;
            this.f5629b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f5620v = true;
            return gVar;
        }

        public c(c cVar) {
            this.f5631d = null;
            this.f5632e = null;
            this.f5633f = null;
            this.f5634g = null;
            this.f5635h = PorterDuff.Mode.SRC_IN;
            this.f5636i = null;
            this.f5637j = 1.0f;
            this.f5638k = 1.0f;
            this.f5640m = 255;
            this.f5641n = 0.0f;
            this.f5642o = 0.0f;
            this.f5643p = 0.0f;
            this.f5644q = 0;
            this.f5645r = 0;
            this.f5646s = 0;
            this.f5647t = 0;
            this.f5648u = false;
            this.f5649v = Paint.Style.FILL_AND_STROKE;
            this.f5628a = cVar.f5628a;
            this.f5629b = cVar.f5629b;
            this.f5639l = cVar.f5639l;
            this.f5630c = cVar.f5630c;
            this.f5631d = cVar.f5631d;
            this.f5632e = cVar.f5632e;
            this.f5635h = cVar.f5635h;
            this.f5634g = cVar.f5634g;
            this.f5640m = cVar.f5640m;
            this.f5637j = cVar.f5637j;
            this.f5646s = cVar.f5646s;
            this.f5644q = cVar.f5644q;
            this.f5648u = cVar.f5648u;
            this.f5638k = cVar.f5638k;
            this.f5641n = cVar.f5641n;
            this.f5642o = cVar.f5642o;
            this.f5643p = cVar.f5643p;
            this.f5645r = cVar.f5645r;
            this.f5647t = cVar.f5647t;
            this.f5633f = cVar.f5633f;
            this.f5649v = cVar.f5649v;
            if (cVar.f5636i != null) {
                this.f5636i = new Rect(cVar.f5636i);
            }
        }
    }
}
