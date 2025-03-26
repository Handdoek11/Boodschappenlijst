package i5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import l5.AbstractC6177c;
import z0.X;

/* renamed from: i5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5868h extends AbstractC5861a {

    /* renamed from: A, reason: collision with root package name */
    private float f36546A;

    /* renamed from: B, reason: collision with root package name */
    private float f36547B;

    /* renamed from: C, reason: collision with root package name */
    private float f36548C;

    /* renamed from: D, reason: collision with root package name */
    private float f36549D;

    /* renamed from: E, reason: collision with root package name */
    private Interpolator f36550E;

    /* renamed from: F, reason: collision with root package name */
    private Interpolator f36551F;

    /* renamed from: G, reason: collision with root package name */
    private Interpolator f36552G;

    /* renamed from: H, reason: collision with root package name */
    private float f36553H;

    /* renamed from: I, reason: collision with root package name */
    private float f36554I;

    /* renamed from: J, reason: collision with root package name */
    private float f36555J;

    /* renamed from: K, reason: collision with root package name */
    private float f36556K;

    /* renamed from: f, reason: collision with root package name */
    private int f36557f;

    /* renamed from: g, reason: collision with root package name */
    private int f36558g;

    /* renamed from: h, reason: collision with root package name */
    private Bitmap f36559h;

    /* renamed from: i, reason: collision with root package name */
    private int f36560i;

    /* renamed from: j, reason: collision with root package name */
    private int f36561j;

    /* renamed from: k, reason: collision with root package name */
    private int f36562k;

    /* renamed from: l, reason: collision with root package name */
    private int f36563l;

    /* renamed from: m, reason: collision with root package name */
    private int f36564m;

    /* renamed from: n, reason: collision with root package name */
    private int f36565n;

    /* renamed from: o, reason: collision with root package name */
    private NinePatchDrawable f36566o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f36567p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f36568q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f36569r;

    /* renamed from: s, reason: collision with root package name */
    private C5871k f36570s;

    /* renamed from: t, reason: collision with root package name */
    private int f36571t;

    /* renamed from: u, reason: collision with root package name */
    private int f36572u;

    /* renamed from: v, reason: collision with root package name */
    private C5870j f36573v;

    /* renamed from: w, reason: collision with root package name */
    private Paint f36574w;

    /* renamed from: x, reason: collision with root package name */
    private long f36575x;

    /* renamed from: y, reason: collision with root package name */
    private long f36576y;

    /* renamed from: z, reason: collision with root package name */
    private float f36577z;

    public C5868h(RecyclerView recyclerView, RecyclerView.F f8, C5871k c5871k) {
        super(recyclerView, f8);
        this.f36567p = new Rect();
        this.f36576y = 0L;
        this.f36577z = 1.0f;
        this.f36546A = 0.0f;
        this.f36547B = 1.0f;
        this.f36550E = null;
        this.f36551F = null;
        this.f36552G = null;
        this.f36570s = c5871k;
        this.f36574w = new Paint();
    }

    private void N(float f8, int i8) {
        RecyclerView.F f9 = this.f36524e;
        if (f9 != null) {
            AbstractC5861a.m(this.f36523d, f9, f8 - f9.f10944a.getLeft(), i8 - this.f36524e.f10944a.getTop());
        }
    }

    private void P() {
        RecyclerView recyclerView = this.f36523d;
        if (recyclerView.getChildCount() > 0) {
            this.f36560i = 0;
            this.f36561j = recyclerView.getWidth() - this.f36573v.f36585a;
            this.f36562k = 0;
            int height = recyclerView.getHeight();
            int i8 = this.f36573v.f36586b;
            this.f36563l = height - i8;
            int i9 = this.f36571t;
            if (i9 == 0) {
                this.f36562k += recyclerView.getPaddingTop();
                this.f36563l -= recyclerView.getPaddingBottom();
                this.f36560i = -this.f36573v.f36585a;
                this.f36561j = recyclerView.getWidth();
            } else if (i9 == 1) {
                this.f36562k = -i8;
                this.f36563l = recyclerView.getHeight();
                this.f36560i += recyclerView.getPaddingLeft();
                this.f36561j -= recyclerView.getPaddingRight();
            }
            this.f36561j = Math.max(this.f36560i, this.f36561j);
            this.f36563l = Math.max(this.f36562k, this.f36563l);
            if (!this.f36569r) {
                int f8 = AbstractC6177c.f(recyclerView, true);
                int i10 = AbstractC6177c.i(recyclerView, true);
                View r8 = r(recyclerView, this.f36570s, f8, i10);
                View s8 = s(recyclerView, this.f36570s, f8, i10);
                int i11 = this.f36571t;
                if (i11 == 0) {
                    if (r8 != null) {
                        this.f36560i = Math.min(this.f36560i, r8.getLeft());
                    }
                    if (s8 != null) {
                        this.f36561j = Math.min(this.f36561j, Math.max(0, s8.getRight() - this.f36573v.f36585a));
                    }
                } else if (i11 == 1) {
                    if (r8 != null) {
                        this.f36562k = Math.min(this.f36563l, r8.getTop());
                    }
                    if (s8 != null) {
                        this.f36563l = Math.min(this.f36563l, Math.max(0, s8.getBottom() - this.f36573v.f36586b));
                    }
                }
            }
        } else {
            int paddingLeft = recyclerView.getPaddingLeft();
            this.f36560i = paddingLeft;
            this.f36561j = paddingLeft;
            int paddingTop = recyclerView.getPaddingTop();
            this.f36562k = paddingTop;
            this.f36563l = paddingTop;
        }
        int i12 = this.f36564m;
        C5870j c5870j = this.f36573v;
        this.f36557f = i12 - c5870j.f36590f;
        this.f36558g = this.f36565n - c5870j.f36591g;
        if (AbstractC6177c.x(this.f36572u)) {
            this.f36557f = p(this.f36557f, this.f36560i, this.f36561j);
            this.f36558g = p(this.f36558g, this.f36562k, this.f36563l);
        }
    }

    private static int p(int i8, int i9, int i10) {
        return Math.min(Math.max(i8, i9), i10);
    }

    private Bitmap q(View view, NinePatchDrawable ninePatchDrawable) {
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth();
        int height = view.getHeight();
        Rect rect = this.f36567p;
        int i8 = rect.left + width + rect.right;
        int i9 = rect.top + height + rect.bottom;
        view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        view.layout(left, top, width + left, height + top);
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (ninePatchDrawable != null) {
            ninePatchDrawable.setBounds(0, 0, i8, i9);
            ninePatchDrawable.draw(canvas);
        }
        int save = canvas.save();
        Rect rect2 = this.f36567p;
        canvas.clipRect(rect2.left, rect2.top, i8 - rect2.right, i9 - rect2.bottom);
        Rect rect3 = this.f36567p;
        canvas.translate(rect3.left, rect3.top);
        view.draw(canvas);
        canvas.restoreToCount(save);
        return createBitmap;
    }

    private static View r(RecyclerView recyclerView, C5871k c5871k, int i8, int i9) {
        int G7;
        if (i8 == -1 || i9 == -1) {
            return null;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            RecyclerView.F m02 = recyclerView.m0(childAt);
            if (m02 != null && (G7 = m02.G()) >= i8 && G7 <= i9 && c5871k.a(G7)) {
                return childAt;
            }
        }
        return null;
    }

    private static View s(RecyclerView recyclerView, C5871k c5871k, int i8, int i9) {
        int G7;
        if (i8 == -1 || i9 == -1) {
            return null;
        }
        for (int childCount = recyclerView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = recyclerView.getChildAt(childCount);
            RecyclerView.F m02 = recyclerView.m0(childAt);
            if (m02 != null && (G7 = m02.G()) >= i8 && G7 <= i9 && c5871k.a(G7)) {
                return childAt;
            }
        }
        return null;
    }

    private static float w(Interpolator interpolator, float f8) {
        return interpolator != null ? interpolator.getInterpolation(f8) : f8;
    }

    public int A() {
        return this.f36558g;
    }

    public void B() {
        RecyclerView.F f8 = this.f36524e;
        if (f8 != null) {
            f8.f10944a.setTranslationX(0.0f);
            this.f36524e.f10944a.setTranslationY(0.0f);
            this.f36524e.f10944a.setVisibility(0);
        }
        this.f36524e = null;
    }

    public boolean C() {
        return this.f36558g == this.f36563l;
    }

    public boolean D() {
        return this.f36557f == this.f36560i;
    }

    public boolean E() {
        return this.f36557f == this.f36561j;
    }

    public boolean F() {
        return this.f36558g == this.f36562k;
    }

    public boolean G(boolean z7) {
        int i8 = this.f36557f;
        int i9 = this.f36558g;
        P();
        int i10 = this.f36557f;
        boolean z8 = (i8 == i10 && i9 == this.f36558g) ? false : true;
        if (z8 || z7) {
            N(i10, this.f36558g);
            X.e0(this.f36523d);
        }
        return z8;
    }

    public void H(RecyclerView.F f8) {
        if (this.f36524e != null) {
            throw new IllegalStateException("A new view holder is attempt to be assigned before invalidating the older one");
        }
        this.f36524e = f8;
        f8.f10944a.setVisibility(4);
    }

    public void I(boolean z7) {
        if (this.f36569r == z7) {
            return;
        }
        this.f36569r = z7;
    }

    public void J(NinePatchDrawable ninePatchDrawable) {
        this.f36566o = ninePatchDrawable;
        if (ninePatchDrawable != null) {
            ninePatchDrawable.getPadding(this.f36567p);
        }
    }

    public void K(C5869i c5869i) {
        this.f36576y = c5869i.f36578a;
        this.f36577z = c5869i.f36579b;
        this.f36550E = c5869i.f36582e;
        this.f36546A = c5869i.f36580c;
        this.f36551F = c5869i.f36583f;
        this.f36547B = c5869i.f36581d;
        this.f36552G = c5869i.f36584g;
    }

    public void L(C5870j c5870j, int i8, int i9) {
        if (this.f36568q) {
            return;
        }
        View view = this.f36524e.f10944a;
        this.f36573v = c5870j;
        this.f36559h = q(view, this.f36566o);
        this.f36560i = this.f36523d.getPaddingLeft();
        this.f36562k = this.f36523d.getPaddingTop();
        this.f36571t = AbstractC6177c.s(this.f36523d);
        this.f36572u = AbstractC6177c.q(this.f36523d);
        this.f36548C = view.getScaleX();
        this.f36549D = view.getScaleY();
        this.f36553H = 1.0f;
        this.f36554I = 1.0f;
        this.f36555J = 0.0f;
        this.f36556K = 1.0f;
        view.setVisibility(4);
        M(i8, i9, true);
        this.f36523d.j(this);
        this.f36575x = System.currentTimeMillis();
        this.f36568q = true;
    }

    public boolean M(int i8, int i9, boolean z7) {
        this.f36564m = i8;
        this.f36565n = i9;
        return G(z7);
    }

    public void O(C5870j c5870j, RecyclerView.F f8) {
        if (this.f36568q) {
            if (this.f36524e != f8) {
                B();
                this.f36524e = f8;
            }
            this.f36559h = q(f8.f10944a, this.f36566o);
            this.f36573v = c5870j;
            G(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
        if (this.f36559h == null) {
            return;
        }
        int min = (int) Math.min(System.currentTimeMillis() - this.f36575x, this.f36576y);
        long j8 = this.f36576y;
        float f8 = j8 > 0 ? min / j8 : 1.0f;
        float w7 = w(this.f36550E, f8);
        float f9 = this.f36577z;
        float f10 = this.f36548C;
        float f11 = ((f9 - f10) * w7) + f10;
        float f12 = this.f36549D;
        float f13 = (w7 * (f9 - f12)) + f12;
        float w8 = (w(this.f36552G, f8) * (this.f36547B - 1.0f)) + 1.0f;
        float w9 = w(this.f36551F, f8) * this.f36546A;
        if (f11 > 0.0f && f13 > 0.0f && w8 > 0.0f) {
            this.f36574w.setAlpha((int) (255.0f * w8));
            int save = canvas.save();
            int i8 = this.f36557f;
            C5870j c5870j = this.f36573v;
            canvas.translate(i8 + c5870j.f36590f, this.f36558g + c5870j.f36591g);
            canvas.scale(f11, f13);
            canvas.rotate(w9);
            int i9 = this.f36567p.left;
            C5870j c5870j2 = this.f36573v;
            canvas.translate(-(i9 + c5870j2.f36590f), -(r6.top + c5870j2.f36591g));
            canvas.drawBitmap(this.f36559h, 0.0f, 0.0f, this.f36574w);
            canvas.restoreToCount(save);
        }
        if (f8 < 1.0f) {
            X.e0(this.f36523d);
        }
        this.f36553H = f11;
        this.f36554I = f13;
        this.f36555J = w9;
        this.f36556K = w8;
    }

    public void t(boolean z7) {
        if (this.f36568q) {
            this.f36523d.j1(this);
        }
        RecyclerView.m itemAnimator = this.f36523d.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.k();
        }
        this.f36523d.J1();
        N(this.f36557f, this.f36558g);
        RecyclerView.F f8 = this.f36524e;
        if (f8 != null) {
            k(f8.f10944a, this.f36553H, this.f36554I, this.f36555J, this.f36556K, z7);
        }
        RecyclerView.F f9 = this.f36524e;
        if (f9 != null) {
            f9.f10944a.setVisibility(0);
        }
        this.f36524e = null;
        Bitmap bitmap = this.f36559h;
        if (bitmap != null) {
            bitmap.recycle();
            this.f36559h = null;
        }
        this.f36570s = null;
        this.f36557f = 0;
        this.f36558g = 0;
        this.f36560i = 0;
        this.f36561j = 0;
        this.f36562k = 0;
        this.f36563l = 0;
        this.f36564m = 0;
        this.f36565n = 0;
        this.f36568q = false;
    }

    public int u() {
        return this.f36557f;
    }

    public int v() {
        return this.f36558g;
    }

    public int x() {
        return this.f36558g + this.f36573v.f36586b;
    }

    public int y() {
        return this.f36557f;
    }

    public int z() {
        return this.f36557f + this.f36573v.f36585a;
    }
}
