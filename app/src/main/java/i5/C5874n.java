package i5;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import l5.AbstractC6177c;
import z0.C7026g0;
import z0.InterfaceC7028h0;
import z0.X;

/* renamed from: i5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5874n extends AbstractC5861a {

    /* renamed from: r, reason: collision with root package name */
    private static final InterfaceC7028h0 f36679r = new a();

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.F f36680f;

    /* renamed from: g, reason: collision with root package name */
    private Interpolator f36681g;

    /* renamed from: h, reason: collision with root package name */
    private int f36682h;

    /* renamed from: i, reason: collision with root package name */
    private int f36683i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f36684j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f36685k;

    /* renamed from: l, reason: collision with root package name */
    private final Rect f36686l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f36687m;

    /* renamed from: n, reason: collision with root package name */
    private float f36688n;

    /* renamed from: o, reason: collision with root package name */
    private float f36689o;

    /* renamed from: p, reason: collision with root package name */
    private C5870j f36690p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f36691q;

    public C5874n(RecyclerView recyclerView, RecyclerView.F f8, C5870j c5870j) {
        super(recyclerView, f8);
        this.f36684j = new Rect();
        this.f36685k = new Rect();
        Rect rect = new Rect();
        this.f36686l = rect;
        this.f36690p = c5870j;
        AbstractC6177c.m(this.f36523d.getLayoutManager(), this.f36524e.f10944a, rect);
    }

    private static float p(float f8, float f9) {
        float f10 = (f8 * 0.7f) + (0.3f * f9);
        return Math.abs(f10 - f9) < 0.01f ? f9 : f10;
    }

    private float q(RecyclerView.F f8, RecyclerView.F f9) {
        View view = f9.f10944a;
        int G7 = f8.G();
        int G8 = f9.G();
        AbstractC6177c.m(this.f36523d.getLayoutManager(), view, this.f36684j);
        AbstractC6177c.o(view, this.f36685k);
        Rect rect = this.f36685k;
        Rect rect2 = this.f36684j;
        int height = view.getHeight() + rect.top + rect.bottom + rect2.top + rect2.bottom;
        int width = view.getWidth() + rect.left + rect.right + rect2.left + rect2.right;
        float left = width != 0 ? (f8.f10944a.getLeft() - this.f36682h) / width : 0.0f;
        float top = height != 0 ? (f8.f10944a.getTop() - this.f36683i) / height : 0.0f;
        int s8 = AbstractC6177c.s(this.f36523d);
        if (s8 == 1) {
            left = G7 > G8 ? top : top + 1.0f;
        } else if (s8 != 0) {
            left = 0.0f;
        } else if (G7 <= G8) {
            left += 1.0f;
        }
        return Math.min(Math.max(left, 0.0f), 1.0f);
    }

    private void x(RecyclerView.F f8, RecyclerView.F f9, float f10) {
        View view = f9.f10944a;
        int G7 = f8.G();
        int G8 = f9.G();
        C5870j c5870j = this.f36690p;
        Rect rect = c5870j.f36592h;
        Rect rect2 = this.f36686l;
        int i8 = c5870j.f36586b + rect.top + rect.bottom + rect2.top + rect2.bottom;
        int i9 = c5870j.f36585a + rect.left + rect.right + rect2.left + rect2.right;
        Interpolator interpolator = this.f36681g;
        if (interpolator != null) {
            f10 = interpolator.getInterpolation(f10);
        }
        int s8 = AbstractC6177c.s(this.f36523d);
        if (s8 == 0) {
            if (G7 > G8) {
                view.setTranslationX(f10 * i9);
                return;
            } else {
                view.setTranslationX((f10 - 1.0f) * i9);
                return;
            }
        }
        if (s8 != 1) {
            return;
        }
        if (G7 > G8) {
            view.setTranslationY(f10 * i8);
        } else {
            view.setTranslationY((f10 - 1.0f) * i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
        RecyclerView.F f8 = this.f36524e;
        RecyclerView.F f9 = this.f36680f;
        if (f8 == null || f9 == null || f8.E() != this.f36690p.f36587c) {
            return;
        }
        float q8 = q(f8, f9);
        this.f36688n = q8;
        if (this.f36691q) {
            this.f36691q = false;
            this.f36689o = q8;
        } else {
            this.f36689o = p(this.f36689o, q8);
        }
        x(f8, f9, this.f36689o);
    }

    public void r(boolean z7) {
        if (this.f36687m) {
            this.f36523d.j1(this);
        }
        RecyclerView.m itemAnimator = this.f36523d.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.k();
        }
        this.f36523d.J1();
        RecyclerView.F f8 = this.f36680f;
        if (f8 != null) {
            x(this.f36524e, f8, this.f36689o);
            k(this.f36680f.f10944a, 1.0f, 1.0f, 0.0f, 1.0f, z7);
            this.f36680f = null;
        }
        this.f36524e = null;
        this.f36682h = 0;
        this.f36683i = 0;
        this.f36689o = 0.0f;
        this.f36688n = 0.0f;
        this.f36687m = false;
        this.f36690p = null;
    }

    public void s(RecyclerView.F f8) {
        if (f8 == this.f36680f) {
            t(null);
        }
    }

    public void t(RecyclerView.F f8) {
        RecyclerView.F f9 = this.f36680f;
        if (f9 == f8) {
            return;
        }
        if (f9 != null) {
            C7026g0 e8 = X.e(f9.f10944a);
            e8.c();
            e8.i(10L).p(0.0f).q(0.0f).k(f36679r).o();
        }
        this.f36680f = f8;
        if (f8 != null) {
            X.e(f8.f10944a).c();
        }
        this.f36691q = true;
    }

    public void u(Interpolator interpolator) {
        this.f36681g = interpolator;
    }

    public void v() {
        if (this.f36687m) {
            return;
        }
        this.f36523d.k(this, 0);
        this.f36687m = true;
    }

    public void w(int i8, int i9) {
        this.f36682h = i8;
        this.f36683i = i9;
    }

    /* renamed from: i5.n$a */
    class a implements InterfaceC7028h0 {
        a() {
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            X.e(view).k(null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        @Override // z0.InterfaceC7028h0
        public void a(View view) {
        }

        @Override // z0.InterfaceC7028h0
        public void c(View view) {
        }
    }
}
