package j5;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import f5.AbstractC5789d;
import g5.AbstractC5812e;
import k5.AbstractC6107a;
import k5.C6108b;
import l5.AbstractC6177c;
import l5.AbstractC6179e;

/* renamed from: j5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6080c {

    /* renamed from: A, reason: collision with root package name */
    private b f38277A;

    /* renamed from: b, reason: collision with root package name */
    private RecyclerView f38280b;

    /* renamed from: f, reason: collision with root package name */
    private int f38284f;

    /* renamed from: g, reason: collision with root package name */
    private int f38285g;

    /* renamed from: h, reason: collision with root package name */
    private int f38286h;

    /* renamed from: i, reason: collision with root package name */
    private int f38287i;

    /* renamed from: j, reason: collision with root package name */
    private int f38288j;

    /* renamed from: k, reason: collision with root package name */
    private int f38289k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f38291m;

    /* renamed from: n, reason: collision with root package name */
    private C6079b f38292n;

    /* renamed from: o, reason: collision with root package name */
    private j f38293o;

    /* renamed from: p, reason: collision with root package name */
    private RecyclerView.F f38294p;

    /* renamed from: t, reason: collision with root package name */
    private int f38298t;

    /* renamed from: u, reason: collision with root package name */
    private int f38299u;

    /* renamed from: v, reason: collision with root package name */
    private int f38300v;

    /* renamed from: w, reason: collision with root package name */
    private int f38301w;

    /* renamed from: x, reason: collision with root package name */
    private int f38302x;

    /* renamed from: z, reason: collision with root package name */
    private l f38304z;

    /* renamed from: c, reason: collision with root package name */
    private long f38281c = 300;

    /* renamed from: d, reason: collision with root package name */
    private long f38282d = 200;

    /* renamed from: e, reason: collision with root package name */
    private long f38283e = 200;

    /* renamed from: l, reason: collision with root package name */
    private long f38290l = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f38295q = -1;

    /* renamed from: r, reason: collision with root package name */
    private long f38296r = -1;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f38297s = new Rect();

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView.t f38279a = new a();

    /* renamed from: y, reason: collision with root package name */
    private VelocityTracker f38303y = VelocityTracker.obtain();

    /* renamed from: B, reason: collision with root package name */
    private int f38278B = ViewConfiguration.getLongPressTimeout();

    /* renamed from: j5.c$a */
    class a implements RecyclerView.t {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C6080c.this.C(recyclerView, motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
            return C6080c.this.A(recyclerView, motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void c(boolean z7) {
            C6080c.this.B(z7);
        }
    }

    /* renamed from: j5.c$b */
    private static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private C6080c f38306a;

        /* renamed from: b, reason: collision with root package name */
        private MotionEvent f38307b;

        public b(C6080c c6080c) {
            super(Looper.getMainLooper());
            this.f38306a = c6080c;
        }

        public void a() {
            removeMessages(1);
            MotionEvent motionEvent = this.f38307b;
            if (motionEvent != null) {
                motionEvent.recycle();
                this.f38307b = null;
            }
        }

        public boolean b() {
            return hasMessages(2);
        }

        public void c() {
            removeMessages(2);
        }

        public void d() {
            if (b()) {
                return;
            }
            sendEmptyMessage(2);
        }

        public void e(MotionEvent motionEvent, int i8) {
            a();
            this.f38307b = MotionEvent.obtain(motionEvent);
            sendEmptyMessageAtTime(1, motionEvent.getDownTime() + i8);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                this.f38306a.v(this.f38307b);
            } else {
                if (i8 != 2) {
                    return;
                }
                this.f38306a.f(true);
            }
        }
    }

    private static int D(int i8) {
        if (i8 == 3) {
            return 1;
        }
        if (i8 != 4) {
            return i8 != 5 ? 0 : 3;
        }
        return 2;
    }

    private void E(RecyclerView.F f8, float f9, boolean z7, boolean z8, boolean z9) {
        if (f9 == -65536.0f) {
            this.f38292n.o(f8, 0, z9, this.f38283e);
            return;
        }
        if (f9 == -65537.0f) {
            this.f38292n.o(f8, 1, z9, this.f38283e);
            return;
        }
        if (f9 == 65536.0f) {
            this.f38292n.o(f8, 2, z9, this.f38283e);
            return;
        }
        if (f9 == 65537.0f) {
            this.f38292n.o(f8, 3, z9, this.f38283e);
        } else if (f9 == 0.0f) {
            this.f38292n.n(f8, z8, z9, this.f38281c);
        } else {
            this.f38292n.q(f8, f9, z7, z8, z9, this.f38282d);
        }
    }

    private void F(MotionEvent motionEvent, RecyclerView.F f8, int i8) {
        this.f38277A.a();
        this.f38294p = f8;
        this.f38295q = i8;
        this.f38296r = this.f38293o.F(i8);
        this.f38300v = (int) (motionEvent.getX() + 0.5f);
        int y7 = (int) (motionEvent.getY() + 0.5f);
        this.f38301w = y7;
        this.f38298t = this.f38300v;
        this.f38299u = y7;
        this.f38290l = -1L;
        AbstractC6177c.o(f8.f10944a, this.f38297s);
        l lVar = new l(this, this.f38294p, this.f38302x, this.f38291m);
        this.f38304z = lVar;
        lVar.d();
        this.f38303y.clear();
        this.f38303y.addMovement(motionEvent);
        this.f38280b.getParent().requestDisallowInterceptTouchEvent(true);
        this.f38293o.t0(this, f8, i8, this.f38296r);
    }

    private static void J(int i8, int i9) {
        if ((i9 != 2 && i9 != 1) || i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) {
            return;
        }
        throw new IllegalStateException("Unexpected after reaction has been requested: result = " + i8 + ", afterReaction = " + i9);
    }

    static float a(i iVar, boolean z7, float f8, boolean z8, boolean z9) {
        if (!(z8 ^ z9)) {
            return f8;
        }
        if (f8 == 0.0f || y(f8)) {
            return f8;
        }
        View b8 = k.b(iVar);
        float width = z7 ? b8.getWidth() : b8.getHeight();
        if (z9) {
            width = width != 0.0f ? 1.0f / width : 0.0f;
        }
        return f8 * width;
    }

    private boolean g(MotionEvent motionEvent, RecyclerView.F f8) {
        int o8 = o(f8);
        if (o8 == -1) {
            return false;
        }
        F(motionEvent, f8, o8);
        return true;
    }

    private static int i(float f8, boolean z7) {
        return z7 ? f8 < 0.0f ? 1 : 3 : f8 < 0.0f ? 2 : 4;
    }

    private void j(int i8) {
        RecyclerView.F f8 = this.f38294p;
        if (f8 == null) {
            return;
        }
        this.f38277A.c();
        this.f38277A.a();
        RecyclerView recyclerView = this.f38280b;
        boolean z7 = false;
        if (recyclerView != null && recyclerView.getParent() != null) {
            this.f38280b.getParent().requestDisallowInterceptTouchEvent(false);
        }
        int n8 = n();
        this.f38303y.clear();
        this.f38294p = null;
        this.f38295q = -1;
        this.f38296r = -1L;
        this.f38300v = 0;
        this.f38301w = 0;
        this.f38288j = 0;
        this.f38298t = 0;
        this.f38299u = 0;
        this.f38290l = -1L;
        this.f38302x = 0;
        l lVar = this.f38304z;
        if (lVar != null) {
            lVar.c();
            this.f38304z = null;
        }
        int D7 = D(i8);
        j jVar = this.f38293o;
        AbstractC6107a r02 = jVar != null ? jVar.r0(f8, n8, i8) : null;
        if (r02 == null) {
            r02 = new C6108b();
        }
        AbstractC6107a abstractC6107a = r02;
        int a8 = abstractC6107a.a();
        J(i8, a8);
        if (a8 == 0) {
            z7 = this.f38292n.e(f8, this.f38291m, true, this.f38281c, n8, abstractC6107a);
        } else if (a8 == 1) {
            RecyclerView.m itemAnimator = this.f38280b.getItemAnimator();
            long o8 = itemAnimator != null ? itemAnimator.o() : 0L;
            d dVar = new d(this.f38280b, f8, i8, o8, itemAnimator != null ? itemAnimator.n() : 0L);
            dVar.r(AbstractC5812e.f36093m);
            dVar.s();
            z7 = this.f38292n.f(f8, D7, true, o8, n8, abstractC6107a);
        } else if (a8 == 2) {
            z7 = this.f38292n.f(f8, D7, true, this.f38283e, n8, abstractC6107a);
        } else if (a8 != 3) {
            throw new IllegalStateException("Unknown after reaction type: " + a8);
        }
        boolean z8 = z7;
        j jVar2 = this.f38293o;
        if (jVar2 != null) {
            jVar2.s0(f8, n8, i8, a8, abstractC6107a);
        }
        if (z8) {
            return;
        }
        abstractC6107a.f();
    }

    static int k(RecyclerView.h hVar, long j8, int i8) {
        if (hVar == null) {
            return -1;
        }
        int E7 = hVar.E();
        if (i8 >= 0 && i8 < E7 && hVar.F(i8) == j8) {
            return i8;
        }
        for (int i9 = 0; i9 < E7; i9++) {
            if (hVar.F(i9) == j8) {
                return i9;
            }
        }
        return -1;
    }

    private int o(RecyclerView.F f8) {
        return AbstractC6179e.e(this.f38280b.getAdapter(), this.f38293o, AbstractC6177c.v(f8));
    }

    private boolean p(RecyclerView recyclerView, MotionEvent motionEvent) {
        int o8;
        RecyclerView.F b8 = AbstractC6177c.b(recyclerView, motionEvent.getX(), motionEvent.getY());
        if (!(b8 instanceof i) || (o8 = o(b8)) < 0 || o8 >= this.f38293o.E()) {
            return false;
        }
        if (AbstractC5789d.a(b8.E()) != AbstractC5789d.a(this.f38293o.F(o8))) {
            return false;
        }
        int x7 = (int) (motionEvent.getX() + 0.5f);
        int y7 = (int) (motionEvent.getY() + 0.5f);
        View view = b8.f10944a;
        int p02 = this.f38293o.p0(b8, o8, x7 - (view.getLeft() + ((int) (view.getTranslationX() + 0.5f))), y7 - (view.getTop() + ((int) (view.getTranslationY() + 0.5f))));
        if (p02 == 0) {
            return false;
        }
        this.f38288j = x7;
        this.f38289k = y7;
        this.f38290l = b8.E();
        this.f38302x = p02;
        if ((16777216 & p02) == 0) {
            return true;
        }
        this.f38277A.e(motionEvent, this.f38278B);
        return true;
    }

    private boolean q(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f38290l == -1) {
            return false;
        }
        int x7 = ((int) (motionEvent.getX() + 0.5f)) - this.f38288j;
        int y7 = ((int) (motionEvent.getY() + 0.5f)) - this.f38289k;
        if (this.f38291m) {
            y7 = x7;
            x7 = y7;
        }
        if (Math.abs(x7) > this.f38284f) {
            this.f38290l = -1L;
            return false;
        }
        if (Math.abs(y7) <= this.f38284f) {
            return false;
        }
        if (!this.f38291m ? y7 >= 0 ? (this.f38302x & 2097152) == 0 : (this.f38302x & 512) == 0 : y7 >= 0 ? (this.f38302x & 32768) == 0 : (this.f38302x & 8) == 0) {
            this.f38290l = -1L;
            return false;
        }
        RecyclerView.F b8 = AbstractC6177c.b(recyclerView, motionEvent.getX(), motionEvent.getY());
        if (b8 != null && b8.E() == this.f38290l) {
            return g(motionEvent, b8);
        }
        this.f38290l = -1L;
        return false;
    }

    private void r(MotionEvent motionEvent) {
        this.f38300v = (int) (motionEvent.getX() + 0.5f);
        this.f38301w = (int) (motionEvent.getY() + 0.5f);
        this.f38303y.addMovement(motionEvent);
        int i8 = this.f38300v - this.f38298t;
        int i9 = this.f38301w - this.f38299u;
        this.f38304z.e(n(), i8, i9);
    }

    private boolean s(MotionEvent motionEvent, boolean z7) {
        int i8;
        if (motionEvent != null) {
            i8 = motionEvent.getActionMasked();
            this.f38300v = (int) (motionEvent.getX() + 0.5f);
            this.f38301w = (int) (motionEvent.getY() + 0.5f);
        } else {
            i8 = 3;
        }
        if (!z()) {
            t();
            return false;
        }
        if (!z7) {
            return true;
        }
        u(i8);
        return true;
    }

    private void t() {
        b bVar = this.f38277A;
        if (bVar != null) {
            bVar.a();
        }
        this.f38290l = -1L;
        this.f38302x = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u(int r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.C6080c.u(int):void");
    }

    private static boolean y(float f8) {
        return f8 == -65536.0f || f8 == 65536.0f || f8 == -65537.0f || f8 == 65537.0f;
    }

    boolean A(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (z()) {
                return false;
            }
            p(recyclerView, motionEvent);
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!z()) {
                    return q(recyclerView, motionEvent);
                }
                r(motionEvent);
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        return s(motionEvent, true);
    }

    void B(boolean z7) {
        if (z7) {
            f(true);
        }
    }

    void C(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (z()) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    r(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    return;
                }
            }
            s(motionEvent, true);
        }
    }

    boolean G() {
        return this.f38291m;
    }

    int H() {
        return I(this.f38295q);
    }

    int I(int i8) {
        int k8 = k(this.f38293o, this.f38296r, i8);
        this.f38295q = k8;
        return k8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(RecyclerView.F f8, int i8, float f9, float f10, boolean z7, boolean z8, boolean z9, boolean z10) {
        float f11;
        i iVar = (i) f8;
        if (k.b(iVar) == null) {
            return;
        }
        int i9 = f10 == 0.0f ? f9 == 0.0f ? 0 : i(f9, z8) : i(f10, z8);
        if (f10 != 0.0f) {
            boolean h8 = iVar.h();
            f11 = Math.min(Math.max(f10, a(iVar, z8, z8 ? iVar.l() : iVar.a(), h8, z7)), a(iVar, z8, z8 ? iVar.d() : iVar.r(), h8, z7));
        } else {
            f11 = f10;
        }
        E(f8, f11, z7, z8, z9);
        this.f38293o.v0(f8, i8, f10, z7, z8, z10, i9);
    }

    public void c(RecyclerView recyclerView) {
        if (x()) {
            throw new IllegalStateException("Accessing released object");
        }
        if (this.f38280b != null) {
            throw new IllegalStateException("RecyclerView instance has already been set");
        }
        int s8 = AbstractC6177c.s(recyclerView);
        if (s8 == -1) {
            throw new IllegalStateException("failed to determine layout orientation");
        }
        this.f38280b = recyclerView;
        recyclerView.m(this.f38279a);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(recyclerView.getContext());
        this.f38284f = viewConfiguration.getScaledTouchSlop();
        this.f38285g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f38286h = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f38287i = this.f38284f * 5;
        C6079b c6079b = new C6079b(this.f38293o);
        this.f38292n = c6079b;
        c6079b.k((int) ((recyclerView.getResources().getDisplayMetrics().density * 8.0f) + 0.5f));
        this.f38291m = s8 == 1;
        this.f38277A = new b(this);
    }

    void d(RecyclerView.F f8) {
        C6079b c6079b = this.f38292n;
        if (c6079b != null) {
            c6079b.d(f8);
        }
    }

    public void e() {
        f(false);
    }

    void f(boolean z7) {
        s(null, false);
        if (z7) {
            j(1);
        } else if (z()) {
            this.f38277A.d();
        }
    }

    public RecyclerView.h h(RecyclerView.h hVar) {
        if (!hVar.I()) {
            throw new IllegalArgumentException("The passed adapter does not support stable IDs");
        }
        if (this.f38293o != null) {
            throw new IllegalStateException("already have a wrapped adapter");
        }
        j jVar = new j(this, hVar);
        this.f38293o = jVar;
        return jVar;
    }

    int l(RecyclerView.F f8) {
        return this.f38292n.g(f8);
    }

    int m(RecyclerView.F f8) {
        return this.f38292n.h(f8);
    }

    int n() {
        return this.f38295q;
    }

    void v(MotionEvent motionEvent) {
        RecyclerView.F f02 = this.f38280b.f0(this.f38290l);
        if (f02 != null) {
            g(motionEvent, f02);
        }
    }

    boolean w(RecyclerView.F f8) {
        C6079b c6079b = this.f38292n;
        return c6079b != null && c6079b.i(f8);
    }

    public boolean x() {
        return this.f38279a == null;
    }

    public boolean z() {
        return (this.f38294p == null || this.f38277A.b()) ? false : true;
    }
}
