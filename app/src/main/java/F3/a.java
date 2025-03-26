package F3;

import D3.f;
import D3.k;
import F3.d;
import V3.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.j;
import com.google.android.material.internal.l;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import z0.X;

/* loaded from: classes2.dex */
public class a extends Drawable implements j.b {

    /* renamed from: E, reason: collision with root package name */
    private static final int f2304E = k.f1622l;

    /* renamed from: F, reason: collision with root package name */
    private static final int f2305F = D3.b.f1403b;

    /* renamed from: A, reason: collision with root package name */
    private float f2306A;

    /* renamed from: B, reason: collision with root package name */
    private float f2307B;

    /* renamed from: C, reason: collision with root package name */
    private WeakReference f2308C;

    /* renamed from: D, reason: collision with root package name */
    private WeakReference f2309D;

    /* renamed from: o, reason: collision with root package name */
    private final WeakReference f2310o;

    /* renamed from: s, reason: collision with root package name */
    private final g f2311s;

    /* renamed from: t, reason: collision with root package name */
    private final j f2312t;

    /* renamed from: u, reason: collision with root package name */
    private final Rect f2313u;

    /* renamed from: v, reason: collision with root package name */
    private final d f2314v;

    /* renamed from: w, reason: collision with root package name */
    private float f2315w;

    /* renamed from: x, reason: collision with root package name */
    private float f2316x;

    /* renamed from: y, reason: collision with root package name */
    private int f2317y;

    /* renamed from: z, reason: collision with root package name */
    private float f2318z;

    /* renamed from: F3.a$a, reason: collision with other inner class name */
    class RunnableC0037a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f2319o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ FrameLayout f2320s;

        RunnableC0037a(View view, FrameLayout frameLayout) {
            this.f2319o = view;
            this.f2320s = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.N(this.f2319o, this.f2320s);
        }
    }

    private a(Context context, int i8, int i9, int i10, d.a aVar) {
        this.f2310o = new WeakReference(context);
        l.c(context);
        this.f2313u = new Rect();
        j jVar = new j(this);
        this.f2312t = jVar;
        jVar.g().setTextAlign(Paint.Align.CENTER);
        d dVar = new d(context, i8, i9, i10, aVar);
        this.f2314v = dVar;
        this.f2311s = new g(V3.k.b(context, x() ? dVar.m() : dVar.i(), x() ? dVar.l() : dVar.h()).m());
        K();
    }

    private boolean A() {
        FrameLayout i8 = i();
        return i8 != null && i8.getId() == f.f1551v;
    }

    private void B() {
        this.f2312t.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void C() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f2314v.e());
        if (this.f2311s.v() != valueOf) {
            this.f2311s.U(valueOf);
            invalidateSelf();
        }
    }

    private void D() {
        this.f2312t.l(true);
        F();
        O();
        invalidateSelf();
    }

    private void E() {
        WeakReference weakReference = this.f2308C;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f2308C.get();
        WeakReference weakReference2 = this.f2309D;
        N(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void F() {
        Context context = (Context) this.f2310o.get();
        if (context == null) {
            return;
        }
        this.f2311s.setShapeAppearanceModel(V3.k.b(context, x() ? this.f2314v.m() : this.f2314v.i(), x() ? this.f2314v.l() : this.f2314v.h()).m());
        invalidateSelf();
    }

    private void G() {
        S3.d dVar;
        Context context = (Context) this.f2310o.get();
        if (context == null || this.f2312t.e() == (dVar = new S3.d(context, this.f2314v.z()))) {
            return;
        }
        this.f2312t.k(dVar, context);
        H();
        O();
        invalidateSelf();
    }

    private void H() {
        this.f2312t.g().setColor(this.f2314v.j());
        invalidateSelf();
    }

    private void I() {
        P();
        this.f2312t.l(true);
        O();
        invalidateSelf();
    }

    private void J() {
        boolean F7 = this.f2314v.F();
        setVisible(F7, false);
        if (!e.f2363a || i() == null || F7) {
            return;
        }
        ((ViewGroup) i().getParent()).invalidate();
    }

    private void K() {
        F();
        G();
        I();
        D();
        B();
        C();
        H();
        E();
        O();
        J();
    }

    private void L(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.f1551v) {
            WeakReference weakReference = this.f2309D;
            if (weakReference == null || weakReference.get() != viewGroup) {
                M(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(f.f1551v);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f2309D = new WeakReference(frameLayout);
                frameLayout.post(new RunnableC0037a(view, frameLayout));
            }
        }
    }

    private static void M(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void O() {
        Context context = (Context) this.f2310o.get();
        WeakReference weakReference = this.f2308C;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f2313u);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f2309D;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null || e.f2363a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        e.d(this.f2313u, this.f2315w, this.f2316x, this.f2306A, this.f2307B);
        float f8 = this.f2318z;
        if (f8 != -1.0f) {
            this.f2311s.R(f8);
        }
        if (rect.equals(this.f2313u)) {
            return;
        }
        this.f2311s.setBounds(this.f2313u);
    }

    private void P() {
        if (l() != -2) {
            this.f2317y = ((int) Math.pow(10.0d, l() - 1.0d)) - 1;
        } else {
            this.f2317y = m();
        }
    }

    private void b(View view) {
        float f8;
        float f9;
        View i8 = i();
        if (i8 == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y7 = view.getY();
            f9 = view.getX();
            i8 = (View) view.getParent();
            f8 = y7;
        } else if (!A()) {
            f8 = 0.0f;
            f9 = 0.0f;
        } else {
            if (!(i8.getParent() instanceof View)) {
                return;
            }
            f8 = i8.getY();
            f9 = i8.getX();
            i8 = (View) i8.getParent();
        }
        float u7 = u(i8, f8);
        float k8 = k(i8, f9);
        float g8 = g(i8, f8);
        float q8 = q(i8, f9);
        if (u7 < 0.0f) {
            this.f2316x += Math.abs(u7);
        }
        if (k8 < 0.0f) {
            this.f2315w += Math.abs(k8);
        }
        if (g8 > 0.0f) {
            this.f2316x -= Math.abs(g8);
        }
        if (q8 > 0.0f) {
            this.f2315w -= Math.abs(q8);
        }
    }

    private void c(Rect rect, View view) {
        float f8 = x() ? this.f2314v.f2325d : this.f2314v.f2324c;
        this.f2318z = f8;
        if (f8 != -1.0f) {
            this.f2306A = f8;
            this.f2307B = f8;
        } else {
            this.f2306A = Math.round((x() ? this.f2314v.f2328g : this.f2314v.f2326e) / 2.0f);
            this.f2307B = Math.round((x() ? this.f2314v.f2329h : this.f2314v.f2327f) / 2.0f);
        }
        if (x()) {
            String f9 = f();
            this.f2306A = Math.max(this.f2306A, (this.f2312t.h(f9) / 2.0f) + this.f2314v.g());
            float max = Math.max(this.f2307B, (this.f2312t.f(f9) / 2.0f) + this.f2314v.k());
            this.f2307B = max;
            this.f2306A = Math.max(this.f2306A, max);
        }
        int w7 = w();
        int f10 = this.f2314v.f();
        if (f10 == 8388691 || f10 == 8388693) {
            this.f2316x = rect.bottom - w7;
        } else {
            this.f2316x = rect.top + w7;
        }
        int v7 = v();
        int f11 = this.f2314v.f();
        if (f11 == 8388659 || f11 == 8388691) {
            this.f2315w = X.z(view) == 0 ? (rect.left - this.f2306A) + v7 : (rect.right + this.f2306A) - v7;
        } else {
            this.f2315w = X.z(view) == 0 ? (rect.right + this.f2306A) - v7 : (rect.left - this.f2306A) + v7;
        }
        if (this.f2314v.E()) {
            b(view);
        }
    }

    public static a d(Context context) {
        return new a(context, 0, f2305F, f2304E, null);
    }

    private void e(Canvas canvas) {
        String f8 = f();
        if (f8 != null) {
            Rect rect = new Rect();
            this.f2312t.g().getTextBounds(f8, 0, f8.length(), rect);
            float exactCenterY = this.f2316x - rect.exactCenterY();
            canvas.drawText(f8, this.f2315w, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), this.f2312t.g());
        }
    }

    private String f() {
        if (z()) {
            return s();
        }
        if (y()) {
            return o();
        }
        return null;
    }

    private float g(View view, float f8) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f2316x + this.f2307B) - (((View) view.getParent()).getHeight() - view.getY())) + f8;
    }

    private CharSequence j() {
        return this.f2314v.p();
    }

    private float k(View view, float f8) {
        return (this.f2315w - this.f2306A) + view.getX() + f8;
    }

    private String o() {
        if (this.f2317y == -2 || n() <= this.f2317y) {
            return NumberFormat.getInstance(this.f2314v.x()).format(n());
        }
        Context context = (Context) this.f2310o.get();
        return context == null ? "" : String.format(this.f2314v.x(), context.getString(D3.j.f1600p), Integer.valueOf(this.f2317y), "+");
    }

    private String p() {
        Context context;
        if (this.f2314v.q() == 0 || (context = (Context) this.f2310o.get()) == null) {
            return null;
        }
        return (this.f2317y == -2 || n() <= this.f2317y) ? context.getResources().getQuantityString(this.f2314v.q(), n(), Integer.valueOf(n())) : context.getString(this.f2314v.n(), Integer.valueOf(this.f2317y));
    }

    private float q(View view, float f8) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f2315w + this.f2306A) - (((View) view.getParent()).getWidth() - view.getX())) + f8;
    }

    private String s() {
        String r8 = r();
        int l8 = l();
        if (l8 == -2 || r8 == null || r8.length() <= l8) {
            return r8;
        }
        Context context = (Context) this.f2310o.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(D3.j.f1593i), r8.substring(0, l8 - 1), "…");
    }

    private CharSequence t() {
        CharSequence o8 = this.f2314v.o();
        return o8 != null ? o8 : r();
    }

    private float u(View view, float f8) {
        return (this.f2316x - this.f2307B) + view.getY() + f8;
    }

    private int v() {
        int r8 = x() ? this.f2314v.r() : this.f2314v.s();
        if (this.f2314v.f2332k == 1) {
            r8 += x() ? this.f2314v.f2331j : this.f2314v.f2330i;
        }
        return r8 + this.f2314v.b();
    }

    private int w() {
        int B7 = this.f2314v.B();
        if (x()) {
            B7 = this.f2314v.A();
            Context context = (Context) this.f2310o.get();
            if (context != null) {
                B7 = E3.a.c(B7, B7 - this.f2314v.t(), E3.a.b(0.0f, 1.0f, 0.3f, 1.0f, S3.c.e(context) - 1.0f));
            }
        }
        if (this.f2314v.f2332k == 0) {
            B7 -= Math.round(this.f2307B);
        }
        return B7 + this.f2314v.c();
    }

    private boolean x() {
        return z() || y();
    }

    public void N(View view, FrameLayout frameLayout) {
        this.f2308C = new WeakReference(view);
        boolean z7 = e.f2363a;
        if (z7 && frameLayout == null) {
            L(view);
        } else {
            this.f2309D = new WeakReference(frameLayout);
        }
        if (!z7) {
            M(view);
        }
        O();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f2311s.draw(canvas);
        if (x()) {
            e(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2314v.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2313u.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2313u.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CharSequence h() {
        if (isVisible()) {
            return z() ? t() : y() ? p() : j();
        }
        return null;
    }

    public FrameLayout i() {
        WeakReference weakReference = this.f2309D;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int l() {
        return this.f2314v.u();
    }

    public int m() {
        return this.f2314v.v();
    }

    public int n() {
        if (this.f2314v.C()) {
            return this.f2314v.w();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public String r() {
        return this.f2314v.y();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f2314v.H(i8);
        B();
    }

    public boolean y() {
        return !this.f2314v.D() && this.f2314v.C();
    }

    public boolean z() {
        return this.f2314v.D();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
