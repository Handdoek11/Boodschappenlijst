package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import r0.AbstractC6641a;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5819b extends Drawable implements Drawable.Callback {

    /* renamed from: A, reason: collision with root package name */
    private long f36128A;

    /* renamed from: B, reason: collision with root package name */
    private long f36129B;

    /* renamed from: C, reason: collision with root package name */
    private c f36130C;

    /* renamed from: o, reason: collision with root package name */
    private d f36131o;

    /* renamed from: s, reason: collision with root package name */
    private Rect f36132s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f36133t;

    /* renamed from: u, reason: collision with root package name */
    private Drawable f36134u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f36136w;

    /* renamed from: y, reason: collision with root package name */
    private boolean f36138y;

    /* renamed from: z, reason: collision with root package name */
    private Runnable f36139z;

    /* renamed from: v, reason: collision with root package name */
    private int f36135v = 255;

    /* renamed from: x, reason: collision with root package name */
    private int f36137x = -1;

    /* renamed from: h.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5819b.this.a(true);
            AbstractC5819b.this.invalidateSelf();
        }
    }

    /* renamed from: h.b$b, reason: collision with other inner class name */
    private static class C0262b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: h.b$d */
    static abstract class d extends Drawable.ConstantState {

        /* renamed from: A, reason: collision with root package name */
        int f36142A;

        /* renamed from: B, reason: collision with root package name */
        int f36143B;

        /* renamed from: C, reason: collision with root package name */
        boolean f36144C;

        /* renamed from: D, reason: collision with root package name */
        ColorFilter f36145D;

        /* renamed from: E, reason: collision with root package name */
        boolean f36146E;

        /* renamed from: F, reason: collision with root package name */
        ColorStateList f36147F;

        /* renamed from: G, reason: collision with root package name */
        PorterDuff.Mode f36148G;

        /* renamed from: H, reason: collision with root package name */
        boolean f36149H;

        /* renamed from: I, reason: collision with root package name */
        boolean f36150I;

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5819b f36151a;

        /* renamed from: b, reason: collision with root package name */
        Resources f36152b;

        /* renamed from: c, reason: collision with root package name */
        int f36153c;

        /* renamed from: d, reason: collision with root package name */
        int f36154d;

        /* renamed from: e, reason: collision with root package name */
        int f36155e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray f36156f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f36157g;

        /* renamed from: h, reason: collision with root package name */
        int f36158h;

        /* renamed from: i, reason: collision with root package name */
        boolean f36159i;

        /* renamed from: j, reason: collision with root package name */
        boolean f36160j;

        /* renamed from: k, reason: collision with root package name */
        Rect f36161k;

        /* renamed from: l, reason: collision with root package name */
        boolean f36162l;

        /* renamed from: m, reason: collision with root package name */
        boolean f36163m;

        /* renamed from: n, reason: collision with root package name */
        int f36164n;

        /* renamed from: o, reason: collision with root package name */
        int f36165o;

        /* renamed from: p, reason: collision with root package name */
        int f36166p;

        /* renamed from: q, reason: collision with root package name */
        int f36167q;

        /* renamed from: r, reason: collision with root package name */
        boolean f36168r;

        /* renamed from: s, reason: collision with root package name */
        int f36169s;

        /* renamed from: t, reason: collision with root package name */
        boolean f36170t;

        /* renamed from: u, reason: collision with root package name */
        boolean f36171u;

        /* renamed from: v, reason: collision with root package name */
        boolean f36172v;

        /* renamed from: w, reason: collision with root package name */
        boolean f36173w;

        /* renamed from: x, reason: collision with root package name */
        boolean f36174x;

        /* renamed from: y, reason: collision with root package name */
        boolean f36175y;

        /* renamed from: z, reason: collision with root package name */
        int f36176z;

        d(d dVar, AbstractC5819b abstractC5819b, Resources resources) {
            this.f36159i = false;
            this.f36162l = false;
            this.f36174x = true;
            this.f36142A = 0;
            this.f36143B = 0;
            this.f36151a = abstractC5819b;
            this.f36152b = resources != null ? resources : dVar != null ? dVar.f36152b : null;
            int f8 = AbstractC5819b.f(resources, dVar != null ? dVar.f36153c : 0);
            this.f36153c = f8;
            if (dVar == null) {
                this.f36157g = new Drawable[10];
                this.f36158h = 0;
                return;
            }
            this.f36154d = dVar.f36154d;
            this.f36155e = dVar.f36155e;
            this.f36172v = true;
            this.f36173w = true;
            this.f36159i = dVar.f36159i;
            this.f36162l = dVar.f36162l;
            this.f36174x = dVar.f36174x;
            this.f36175y = dVar.f36175y;
            this.f36176z = dVar.f36176z;
            this.f36142A = dVar.f36142A;
            this.f36143B = dVar.f36143B;
            this.f36144C = dVar.f36144C;
            this.f36145D = dVar.f36145D;
            this.f36146E = dVar.f36146E;
            this.f36147F = dVar.f36147F;
            this.f36148G = dVar.f36148G;
            this.f36149H = dVar.f36149H;
            this.f36150I = dVar.f36150I;
            if (dVar.f36153c == f8) {
                if (dVar.f36160j) {
                    this.f36161k = dVar.f36161k != null ? new Rect(dVar.f36161k) : null;
                    this.f36160j = true;
                }
                if (dVar.f36163m) {
                    this.f36164n = dVar.f36164n;
                    this.f36165o = dVar.f36165o;
                    this.f36166p = dVar.f36166p;
                    this.f36167q = dVar.f36167q;
                    this.f36163m = true;
                }
            }
            if (dVar.f36168r) {
                this.f36169s = dVar.f36169s;
                this.f36168r = true;
            }
            if (dVar.f36170t) {
                this.f36171u = dVar.f36171u;
                this.f36170t = true;
            }
            Drawable[] drawableArr = dVar.f36157g;
            this.f36157g = new Drawable[drawableArr.length];
            this.f36158h = dVar.f36158h;
            SparseArray sparseArray = dVar.f36156f;
            if (sparseArray != null) {
                this.f36156f = sparseArray.clone();
            } else {
                this.f36156f = new SparseArray(this.f36158h);
            }
            int i8 = this.f36158h;
            for (int i9 = 0; i9 < i8; i9++) {
                Drawable drawable = drawableArr[i9];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f36156f.put(i9, constantState);
                    } else {
                        this.f36157g[i9] = drawableArr[i9];
                    }
                }
            }
        }

        private void e() {
            SparseArray sparseArray = this.f36156f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i8 = 0; i8 < size; i8++) {
                    this.f36157g[this.f36156f.keyAt(i8)] = s(((Drawable.ConstantState) this.f36156f.valueAt(i8)).newDrawable(this.f36152b));
                }
                this.f36156f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            AbstractC6641a.m(drawable, this.f36176z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f36151a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i8 = this.f36158h;
            if (i8 >= this.f36157g.length) {
                o(i8, i8 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f36151a);
            this.f36157g[i8] = drawable;
            this.f36158h++;
            this.f36155e = drawable.getChangingConfigurations() | this.f36155e;
            p();
            this.f36161k = null;
            this.f36160j = false;
            this.f36163m = false;
            this.f36172v = false;
            return i8;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i8 = this.f36158h;
                Drawable[] drawableArr = this.f36157g;
                for (int i9 = 0; i9 < i8; i9++) {
                    Drawable drawable = drawableArr[i9];
                    if (drawable != null && AbstractC6641a.b(drawable)) {
                        AbstractC6641a.a(drawableArr[i9], theme);
                        this.f36155e |= drawableArr[i9].getChangingConfigurations();
                    }
                }
                y(C0262b.c(theme));
            }
        }

        public boolean c() {
            if (this.f36172v) {
                return this.f36173w;
            }
            e();
            this.f36172v = true;
            int i8 = this.f36158h;
            Drawable[] drawableArr = this.f36157g;
            for (int i9 = 0; i9 < i8; i9++) {
                if (drawableArr[i9].getConstantState() == null) {
                    this.f36173w = false;
                    return false;
                }
            }
            this.f36173w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i8 = this.f36158h;
            Drawable[] drawableArr = this.f36157g;
            for (int i9 = 0; i9 < i8; i9++) {
                Drawable drawable = drawableArr[i9];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f36156f.get(i9);
                    if (constantState != null && C0262b.a(constantState)) {
                        return true;
                    }
                } else if (AbstractC6641a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f36163m = true;
            e();
            int i8 = this.f36158h;
            Drawable[] drawableArr = this.f36157g;
            this.f36165o = -1;
            this.f36164n = -1;
            this.f36167q = 0;
            this.f36166p = 0;
            for (int i9 = 0; i9 < i8; i9++) {
                Drawable drawable = drawableArr[i9];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f36164n) {
                    this.f36164n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f36165o) {
                    this.f36165o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f36166p) {
                    this.f36166p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f36167q) {
                    this.f36167q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f36157g.length;
        }

        public final Drawable g(int i8) {
            int indexOfKey;
            Drawable drawable = this.f36157g[i8];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f36156f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i8)) < 0) {
                return null;
            }
            Drawable s8 = s(((Drawable.ConstantState) this.f36156f.valueAt(indexOfKey)).newDrawable(this.f36152b));
            this.f36157g[i8] = s8;
            this.f36156f.removeAt(indexOfKey);
            if (this.f36156f.size() == 0) {
                this.f36156f = null;
            }
            return s8;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36154d | this.f36155e;
        }

        public final int h() {
            return this.f36158h;
        }

        public final int i() {
            if (!this.f36163m) {
                d();
            }
            return this.f36165o;
        }

        public final int j() {
            if (!this.f36163m) {
                d();
            }
            return this.f36167q;
        }

        public final int k() {
            if (!this.f36163m) {
                d();
            }
            return this.f36166p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f36159i) {
                return null;
            }
            Rect rect2 = this.f36161k;
            if (rect2 != null || this.f36160j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i8 = this.f36158h;
            Drawable[] drawableArr = this.f36157g;
            for (int i9 = 0; i9 < i8; i9++) {
                if (drawableArr[i9].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i10 = rect3.left;
                    if (i10 > rect.left) {
                        rect.left = i10;
                    }
                    int i11 = rect3.top;
                    if (i11 > rect.top) {
                        rect.top = i11;
                    }
                    int i12 = rect3.right;
                    if (i12 > rect.right) {
                        rect.right = i12;
                    }
                    int i13 = rect3.bottom;
                    if (i13 > rect.bottom) {
                        rect.bottom = i13;
                    }
                }
            }
            this.f36160j = true;
            this.f36161k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f36163m) {
                d();
            }
            return this.f36164n;
        }

        public final int n() {
            if (this.f36168r) {
                return this.f36169s;
            }
            e();
            int i8 = this.f36158h;
            Drawable[] drawableArr = this.f36157g;
            int opacity = i8 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i9 = 1; i9 < i8; i9++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i9].getOpacity());
            }
            this.f36169s = opacity;
            this.f36168r = true;
            return opacity;
        }

        public void o(int i8, int i9) {
            Drawable[] drawableArr = new Drawable[i9];
            Drawable[] drawableArr2 = this.f36157g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i8);
            }
            this.f36157g = drawableArr;
        }

        void p() {
            this.f36168r = false;
            this.f36170t = false;
        }

        public final boolean q() {
            return this.f36162l;
        }

        abstract void r();

        public final void t(boolean z7) {
            this.f36162l = z7;
        }

        public final void u(int i8) {
            this.f36142A = i8;
        }

        public final void v(int i8) {
            this.f36143B = i8;
        }

        final boolean w(int i8, int i9) {
            int i10 = this.f36158h;
            Drawable[] drawableArr = this.f36157g;
            boolean z7 = false;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    boolean m8 = AbstractC6641a.m(drawable, i8);
                    if (i11 == i9) {
                        z7 = m8;
                    }
                }
            }
            this.f36176z = i8;
            return z7;
        }

        public final void x(boolean z7) {
            this.f36159i = z7;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f36152b = resources;
                int f8 = AbstractC5819b.f(resources, this.f36153c);
                int i8 = this.f36153c;
                this.f36153c = f8;
                if (i8 != f8) {
                    this.f36163m = false;
                    this.f36160j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f36130C == null) {
            this.f36130C = new c();
        }
        drawable.setCallback(this.f36130C.b(drawable.getCallback()));
        try {
            if (this.f36131o.f36142A <= 0 && this.f36136w) {
                drawable.setAlpha(this.f36135v);
            }
            d dVar = this.f36131o;
            if (dVar.f36146E) {
                drawable.setColorFilter(dVar.f36145D);
            } else {
                if (dVar.f36149H) {
                    AbstractC6641a.o(drawable, dVar.f36147F);
                }
                d dVar2 = this.f36131o;
                if (dVar2.f36150I) {
                    AbstractC6641a.p(drawable, dVar2.f36148G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f36131o.f36174x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            AbstractC6641a.m(drawable, AbstractC6641a.f(this));
            AbstractC6641a.j(drawable, this.f36131o.f36144C);
            Rect rect = this.f36132s;
            if (rect != null) {
                AbstractC6641a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f36130C.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f36130C.a());
            throw th;
        }
    }

    private boolean e() {
        return isAutoMirrored() && AbstractC6641a.f(this) == 1;
    }

    static int f(Resources resources, int i8) {
        if (resources != null) {
            i8 = resources.getDisplayMetrics().densityDpi;
        }
        if (i8 == 0) {
            return 160;
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f36136w = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f36133t
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f36128A
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f36135v
            r3.setAlpha(r9)
            r13.f36128A = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            h.b$d r10 = r13.f36131o
            int r10 = r10.f36142A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f36135v
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f36128A = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f36134u
            if (r9 == 0) goto L61
            long r10 = r13.f36129B
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f36134u = r0
            r13.f36129B = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$d r4 = r13.f36131o
            int r4 = r4.f36143B
            int r3 = r3 / r4
            int r4 = r13.f36135v
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f36129B = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f36139z
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.AbstractC5819b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f36131o.b(theme);
    }

    abstract d b();

    int c() {
        return this.f36137x;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f36131o.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f36133t;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f36134u;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f36137x
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$d r0 = r9.f36131o
            int r0 = r0.f36143B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f36134u
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f36133t
            if (r0 == 0) goto L29
            r9.f36134u = r0
            h.b$d r0 = r9.f36131o
            int r0 = r0.f36143B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f36129B = r0
            goto L35
        L29:
            r9.f36134u = r4
            r9.f36129B = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f36133t
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.b$d r0 = r9.f36131o
            int r1 = r0.f36158h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f36133t = r0
            r9.f36137x = r10
            if (r0 == 0) goto L5a
            h.b$d r10 = r9.f36131o
            int r10 = r10.f36142A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f36128A = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f36133t = r4
            r10 = -1
            r9.f36137x = r10
        L5a:
            long r0 = r9.f36128A
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f36129B
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f36139z
            if (r10 != 0) goto L73
            h.b$a r10 = new h.b$a
            r10.<init>()
            r9.f36139z = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.AbstractC5819b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f36135v;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f36131o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f36131o.c()) {
            return null;
        }
        this.f36131o.f36154d = getChangingConfigurations();
        return this.f36131o;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f36133t;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f36132s;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f36131o.q()) {
            return this.f36131o.i();
        }
        Drawable drawable = this.f36133t;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f36131o.q()) {
            return this.f36131o.m();
        }
        Drawable drawable = this.f36133t;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f36131o.q()) {
            return this.f36131o.j();
        }
        Drawable drawable = this.f36133t;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f36131o.q()) {
            return this.f36131o.k();
        }
        Drawable drawable = this.f36133t;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f36133t;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f36131o.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f36133t;
        if (drawable != null) {
            C0262b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l8 = this.f36131o.l();
        if (l8 != null) {
            rect.set(l8);
            padding = (l8.right | ((l8.left | l8.top) | l8.bottom)) != 0;
        } else {
            Drawable drawable = this.f36133t;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return padding;
    }

    void h(d dVar) {
        this.f36131o = dVar;
        int i8 = this.f36137x;
        if (i8 >= 0) {
            Drawable g8 = dVar.g(i8);
            this.f36133t = g8;
            if (g8 != null) {
                d(g8);
            }
        }
        this.f36134u = null;
    }

    final void i(Resources resources) {
        this.f36131o.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f36131o;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f36133t || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f36131o.f36144C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z7;
        Drawable drawable = this.f36134u;
        boolean z8 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f36134u = null;
            z7 = true;
        } else {
            z7 = false;
        }
        Drawable drawable2 = this.f36133t;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f36136w) {
                this.f36133t.setAlpha(this.f36135v);
            }
        }
        if (this.f36129B != 0) {
            this.f36129B = 0L;
            z7 = true;
        }
        if (this.f36128A != 0) {
            this.f36128A = 0L;
        } else {
            z8 = z7;
        }
        if (z8) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f36138y && super.mutate() == this) {
            d b8 = b();
            b8.r();
            h(b8);
            this.f36138y = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36134u;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f36133t;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i8) {
        return this.f36131o.w(i8, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        Drawable drawable = this.f36134u;
        if (drawable != null) {
            return drawable.setLevel(i8);
        }
        Drawable drawable2 = this.f36133t;
        if (drawable2 != null) {
            return drawable2.setLevel(i8);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        if (drawable != this.f36133t || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        if (this.f36136w && this.f36135v == i8) {
            return;
        }
        this.f36136w = true;
        this.f36135v = i8;
        Drawable drawable = this.f36133t;
        if (drawable != null) {
            if (this.f36128A == 0) {
                drawable.setAlpha(i8);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        d dVar = this.f36131o;
        if (dVar.f36144C != z7) {
            dVar.f36144C = z7;
            Drawable drawable = this.f36133t;
            if (drawable != null) {
                AbstractC6641a.j(drawable, z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f36131o;
        dVar.f36146E = true;
        if (dVar.f36145D != colorFilter) {
            dVar.f36145D = colorFilter;
            Drawable drawable = this.f36133t;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z7) {
        d dVar = this.f36131o;
        if (dVar.f36174x != z7) {
            dVar.f36174x = z7;
            Drawable drawable = this.f36133t;
            if (drawable != null) {
                drawable.setDither(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f8, float f9) {
        Drawable drawable = this.f36133t;
        if (drawable != null) {
            AbstractC6641a.k(drawable, f8, f9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i8, int i9, int i10, int i11) {
        Rect rect = this.f36132s;
        if (rect == null) {
            this.f36132s = new Rect(i8, i9, i10, i11);
        } else {
            rect.set(i8, i9, i10, i11);
        }
        Drawable drawable = this.f36133t;
        if (drawable != null) {
            AbstractC6641a.l(drawable, i8, i9, i10, i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i8) {
        setTintList(ColorStateList.valueOf(i8));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f36131o;
        dVar.f36149H = true;
        if (dVar.f36147F != colorStateList) {
            dVar.f36147F = colorStateList;
            AbstractC6641a.o(this.f36133t, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f36131o;
        dVar.f36150I = true;
        if (dVar.f36148G != mode) {
            dVar.f36148G = mode;
            AbstractC6641a.p(this.f36133t, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        Drawable drawable = this.f36134u;
        if (drawable != null) {
            drawable.setVisible(z7, z8);
        }
        Drawable drawable2 = this.f36133t;
        if (drawable2 != null) {
            drawable2.setVisible(z7, z8);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f36133t || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* renamed from: h.b$c */
    static class c implements Drawable.Callback {

        /* renamed from: o, reason: collision with root package name */
        private Drawable.Callback f36141o;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f36141o;
            this.f36141o = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f36141o = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
            Drawable.Callback callback = this.f36141o;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j8);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f36141o;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
