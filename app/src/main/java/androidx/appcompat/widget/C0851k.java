package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.W;
import f.AbstractC5752a;
import f.AbstractC5754c;
import f.AbstractC5755d;
import f.AbstractC5756e;
import g.AbstractC5794a;
import q0.AbstractC6410a;

/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851k {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f7872b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static C0851k f7873c;

    /* renamed from: a, reason: collision with root package name */
    private W f7874a;

    /* renamed from: androidx.appcompat.widget.k$a */
    class a implements W.f {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f7875a = {AbstractC5756e.f35439R, AbstractC5756e.f35437P, AbstractC5756e.f35441a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f7876b = {AbstractC5756e.f35455o, AbstractC5756e.f35423B, AbstractC5756e.f35460t, AbstractC5756e.f35456p, AbstractC5756e.f35457q, AbstractC5756e.f35459s, AbstractC5756e.f35458r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f7877c = {AbstractC5756e.f35436O, AbstractC5756e.f35438Q, AbstractC5756e.f35451k, AbstractC5756e.f35432K, AbstractC5756e.f35433L, AbstractC5756e.f35434M, AbstractC5756e.f35435N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f7878d = {AbstractC5756e.f35463w, AbstractC5756e.f35449i, AbstractC5756e.f35462v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f7879e = {AbstractC5756e.f35431J, AbstractC5756e.f35440S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f7880f = {AbstractC5756e.f35443c, AbstractC5756e.f35447g, AbstractC5756e.f35444d, AbstractC5756e.f35448h};

        a() {
        }

        private boolean f(int[] iArr, int i8) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i8) {
            int c8 = b0.c(context, AbstractC5752a.f35393t);
            return new ColorStateList(new int[][]{b0.f7764b, b0.f7767e, b0.f7765c, b0.f7771i}, new int[]{b0.b(context, AbstractC5752a.f35391r), AbstractC6410a.g(c8, i8), AbstractC6410a.g(c8, i8), i8});
        }

        private ColorStateList i(Context context) {
            return h(context, b0.c(context, AbstractC5752a.f35390q));
        }

        private ColorStateList j(Context context) {
            return h(context, b0.c(context, AbstractC5752a.f35391r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e8 = b0.e(context, AbstractC5752a.f35395v);
            if (e8 == null || !e8.isStateful()) {
                iArr[0] = b0.f7764b;
                iArr2[0] = b0.b(context, AbstractC5752a.f35395v);
                iArr[1] = b0.f7768f;
                iArr2[1] = b0.c(context, AbstractC5752a.f35392s);
                iArr[2] = b0.f7771i;
                iArr2[2] = b0.c(context, AbstractC5752a.f35395v);
            } else {
                int[] iArr3 = b0.f7764b;
                iArr[0] = iArr3;
                iArr2[0] = e8.getColorForState(iArr3, 0);
                iArr[1] = b0.f7768f;
                iArr2[1] = b0.c(context, AbstractC5752a.f35392s);
                iArr[2] = b0.f7771i;
                iArr2[2] = e8.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(W w7, Context context, int i8) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i8);
            Drawable j8 = w7.j(context, AbstractC5756e.f35427F);
            Drawable j9 = w7.j(context, AbstractC5756e.f35428G);
            if ((j8 instanceof BitmapDrawable) && j8.getIntrinsicWidth() == dimensionPixelSize && j8.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j8;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j8.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j8.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j9 instanceof BitmapDrawable) && j9.getIntrinsicWidth() == dimensionPixelSize && j9.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j9;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j9.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i8, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C0851k.f7872b;
            }
            mutate.setColorFilter(C0851k.e(i8, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
        @Override // androidx.appcompat.widget.W.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0851k.a()
                int[] r1 = r7.f7875a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = f.AbstractC5752a.f35394u
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f7877c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = f.AbstractC5752a.f35392s
                goto L11
            L20:
                int[] r1 = r7.f7878d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = f.AbstractC5756e.f35461u
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = f.AbstractC5756e.f35452l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L66
                android.graphics.drawable.Drawable r10 = r10.mutate()
                int r8 = androidx.appcompat.widget.b0.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0851k.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L65
                r10.setAlpha(r0)
            L65:
                return r2
            L66:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0851k.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.W.f
        public PorterDuff.Mode b(int i8) {
            if (i8 == AbstractC5756e.f35429H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.W.f
        public Drawable c(W w7, Context context, int i8) {
            if (i8 == AbstractC5756e.f35450j) {
                return new LayerDrawable(new Drawable[]{w7.j(context, AbstractC5756e.f35449i), w7.j(context, AbstractC5756e.f35451k)});
            }
            if (i8 == AbstractC5756e.f35465y) {
                return l(w7, context, AbstractC5755d.f35415g);
            }
            if (i8 == AbstractC5756e.f35464x) {
                return l(w7, context, AbstractC5755d.f35416h);
            }
            if (i8 == AbstractC5756e.f35466z) {
                return l(w7, context, AbstractC5755d.f35417i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.W.f
        public ColorStateList d(Context context, int i8) {
            if (i8 == AbstractC5756e.f35453m) {
                return AbstractC5794a.a(context, AbstractC5754c.f35405e);
            }
            if (i8 == AbstractC5756e.f35430I) {
                return AbstractC5794a.a(context, AbstractC5754c.f35408h);
            }
            if (i8 == AbstractC5756e.f35429H) {
                return k(context);
            }
            if (i8 == AbstractC5756e.f35446f) {
                return j(context);
            }
            if (i8 == AbstractC5756e.f35442b) {
                return g(context);
            }
            if (i8 == AbstractC5756e.f35445e) {
                return i(context);
            }
            if (i8 == AbstractC5756e.f35425D || i8 == AbstractC5756e.f35426E) {
                return AbstractC5794a.a(context, AbstractC5754c.f35407g);
            }
            if (f(this.f7876b, i8)) {
                return b0.e(context, AbstractC5752a.f35394u);
            }
            if (f(this.f7879e, i8)) {
                return AbstractC5794a.a(context, AbstractC5754c.f35404d);
            }
            if (f(this.f7880f, i8)) {
                return AbstractC5794a.a(context, AbstractC5754c.f35403c);
            }
            if (i8 == AbstractC5756e.f35422A) {
                return AbstractC5794a.a(context, AbstractC5754c.f35406f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.W.f
        public boolean e(Context context, int i8, Drawable drawable) {
            if (i8 == AbstractC5756e.f35424C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), b0.c(context, AbstractC5752a.f35394u), C0851k.f7872b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), b0.c(context, AbstractC5752a.f35394u), C0851k.f7872b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), b0.c(context, AbstractC5752a.f35392s), C0851k.f7872b);
                return true;
            }
            if (i8 != AbstractC5756e.f35465y && i8 != AbstractC5756e.f35464x && i8 != AbstractC5756e.f35466z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), b0.b(context, AbstractC5752a.f35394u), C0851k.f7872b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), b0.c(context, AbstractC5752a.f35392s), C0851k.f7872b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), b0.c(context, AbstractC5752a.f35392s), C0851k.f7872b);
            return true;
        }
    }

    public static synchronized C0851k b() {
        C0851k c0851k;
        synchronized (C0851k.class) {
            try {
                if (f7873c == null) {
                    h();
                }
                c0851k = f7873c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0851k;
    }

    public static synchronized PorterDuffColorFilter e(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter l8;
        synchronized (C0851k.class) {
            l8 = W.l(i8, mode);
        }
        return l8;
    }

    public static synchronized void h() {
        synchronized (C0851k.class) {
            if (f7873c == null) {
                C0851k c0851k = new C0851k();
                f7873c = c0851k;
                c0851k.f7874a = W.h();
                f7873c.f7874a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, d0 d0Var, int[] iArr) {
        W.w(drawable, d0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i8) {
        return this.f7874a.j(context, i8);
    }

    synchronized Drawable d(Context context, int i8, boolean z7) {
        return this.f7874a.k(context, i8, z7);
    }

    synchronized ColorStateList f(Context context, int i8) {
        return this.f7874a.m(context, i8);
    }

    public synchronized void g(Context context) {
        this.f7874a.s(context);
    }
}
