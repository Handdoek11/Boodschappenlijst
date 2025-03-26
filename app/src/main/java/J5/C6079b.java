package j5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k5.AbstractC6107a;
import z0.C7026g0;
import z0.InterfaceC7028h0;
import z0.InterfaceC7032j0;
import z0.X;

/* renamed from: j5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6079b {

    /* renamed from: a, reason: collision with root package name */
    private final j f38252a;

    /* renamed from: i, reason: collision with root package name */
    private int f38260i;

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f38253b = new AccelerateDecelerateInterpolator();

    /* renamed from: c, reason: collision with root package name */
    private final Interpolator f38254c = new DecelerateInterpolator();

    /* renamed from: d, reason: collision with root package name */
    private final Interpolator f38255d = new AccelerateInterpolator(0.8f);

    /* renamed from: g, reason: collision with root package name */
    private final int[] f38258g = new int[2];

    /* renamed from: h, reason: collision with root package name */
    private final Rect f38259h = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final List f38256e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f38257f = new ArrayList();

    /* renamed from: j5.b$a */
    private static final class a extends d {

        /* renamed from: s, reason: collision with root package name */
        final float f38261s;

        /* renamed from: t, reason: collision with root package name */
        final boolean f38262t;

        public a(RecyclerView.F f8, float f9, boolean z7) {
            super(f8);
            this.f38261s = f9;
            this.f38262t = z7;
        }

        @Override // j5.C6079b.d
        protected void c(RecyclerView.F f8) {
            View a8 = k.a(f8);
            if (this.f38262t) {
                C6079b.m(f8, true, (int) ((a8.getWidth() * this.f38261s) + 0.5f), 0);
            } else {
                C6079b.m(f8, false, 0, (int) ((a8.getHeight() * this.f38261s) + 0.5f));
            }
        }
    }

    /* renamed from: j5.b$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f38274a;

        /* renamed from: b, reason: collision with root package name */
        AbstractC6107a f38275b;

        public c(int i8, AbstractC6107a abstractC6107a) {
            this.f38274a = i8;
            this.f38275b = abstractC6107a;
        }
    }

    /* renamed from: j5.b$d */
    private static abstract class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final WeakReference f38276o;

        public d(RecyclerView.F f8) {
            this.f38276o = new WeakReference(f8);
        }

        public boolean a(RecyclerView.F f8) {
            return ((RecyclerView.F) this.f38276o.get()) == f8;
        }

        public boolean b(RecyclerView.F f8) {
            return ((RecyclerView.F) this.f38276o.get()) == null;
        }

        protected abstract void c(RecyclerView.F f8);

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.F f8 = (RecyclerView.F) this.f38276o.get();
            if (f8 != null) {
                c(f8);
            }
        }
    }

    public C6079b(j jVar) {
        this.f38252a = jVar;
    }

    private boolean a(RecyclerView.F f8, boolean z7, int i8, int i9, long j8, Interpolator interpolator, c cVar) {
        if (!(f8 instanceof i)) {
            return false;
        }
        View a8 = k.a(f8);
        int translationX = (int) (a8.getTranslationX() + 0.5f);
        int translationY = (int) (a8.getTranslationY() + 0.5f);
        d(f8);
        int translationX2 = (int) (a8.getTranslationX() + 0.5f);
        int translationY2 = (int) (a8.getTranslationY() + 0.5f);
        if (j8 == 0 || ((translationX2 == i8 && translationY2 == i9) || Math.max(Math.abs(i8 - translationX), Math.abs(i9 - translationY)) <= this.f38260i)) {
            a8.setTranslationX(i8);
            a8.setTranslationY(i9);
            return false;
        }
        a8.setTranslationX(translationX);
        a8.setTranslationY(translationY);
        new C0281b(this.f38252a, this.f38256e, f8, i8, i9, j8, z7, interpolator, cVar).e();
        return true;
    }

    private boolean b(RecyclerView.F f8, boolean z7, int i8, int i9, long j8, Interpolator interpolator, c cVar) {
        return a(f8, z7, i8, i9, j8, interpolator, cVar);
    }

    private void c(RecyclerView.F f8) {
        for (int size = this.f38257f.size() - 1; size >= 0; size--) {
            d dVar = (d) ((WeakReference) this.f38257f.get(size)).get();
            if (dVar != null && dVar.a(f8)) {
                f8.f10944a.removeCallbacks(dVar);
                this.f38257f.remove(size);
            } else if (dVar == null || dVar.b(f8)) {
                this.f38257f.remove(size);
            }
        }
    }

    private void j(RecyclerView.F f8, d dVar) {
        this.f38257f.add(new WeakReference(dVar));
        f8.f10944a.post(dVar);
    }

    private static void l(RecyclerView.F f8, boolean z7, int i8, int i9) {
        if (f8 instanceof i) {
            View a8 = k.a(f8);
            X.e(a8).c();
            a8.setTranslationX(i8);
            a8.setTranslationY(i9);
        }
    }

    static void m(RecyclerView.F f8, boolean z7, int i8, int i9) {
        l(f8, z7, i8, i9);
    }

    private boolean p(RecyclerView.F f8, int i8, boolean z7, long j8, c cVar) {
        boolean z8;
        if (!(f8 instanceof i)) {
            return false;
        }
        View a8 = k.a(f8);
        ViewGroup viewGroup = (ViewGroup) a8.getParent();
        if (viewGroup == null) {
            return false;
        }
        int left = a8.getLeft();
        int right = a8.getRight();
        int top = a8.getTop();
        int i9 = right - left;
        int bottom = a8.getBottom() - top;
        viewGroup.getWindowVisibleDisplayFrame(this.f38259h);
        int width = this.f38259h.width();
        int height = this.f38259h.height();
        if (i9 == 0 || bottom == 0) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            width = 0;
                            height = 0;
                        }
                    }
                    z8 = false;
                } else {
                    height = -height;
                }
                width = 0;
                z8 = false;
            } else {
                width = -width;
            }
            height = 0;
            z8 = false;
        } else {
            viewGroup.getLocationInWindow(this.f38258g);
            int[] iArr = this.f38258g;
            int i10 = iArr[0];
            int i11 = iArr[1];
            if (i8 == 0) {
                height = 0;
                width = -(i10 + i9);
            } else if (i8 == 1) {
                width = 0;
                height = -(i11 + bottom);
            } else if (i8 == 2) {
                width -= i10 - left;
                z8 = z7;
                height = 0;
            } else if (i8 != 3) {
                z8 = z7;
                width = 0;
                height = 0;
            } else {
                height -= i11 - top;
                z8 = z7;
                width = 0;
            }
            z8 = z7;
        }
        if (z8) {
            z8 = X.Q(a8) && a8.getVisibility() == 0;
        }
        return b(f8, i8 == 0 || i8 == 2, width, height, z8 ? j8 : 0L, this.f38255d, cVar);
    }

    private boolean r(RecyclerView.F f8, float f9, boolean z7, boolean z8, boolean z9, Interpolator interpolator, long j8, c cVar) {
        float f10 = f9;
        View a8 = k.a(f8);
        long j9 = z9 ? X.Q(a8) && a8.getVisibility() == 0 : z9 ? j8 : 0L;
        if (f10 == 0.0f) {
            return b(f8, z8, 0, 0, j9, interpolator, cVar);
        }
        int width = a8.getWidth();
        int height = a8.getHeight();
        if (z8 && (!z7 || width != 0)) {
            if (z7) {
                f10 *= width;
            }
            return b(f8, true, (int) (f10 + 0.5f), 0, j9, interpolator, cVar);
        }
        if (!z8 && (!z7 || height != 0)) {
            if (z7) {
                f10 *= height;
            }
            return b(f8, false, 0, (int) (f10 + 0.5f), j9, interpolator, cVar);
        }
        if (cVar != null) {
            throw new IllegalStateException("Unexpected state in slideToSpecifiedPositionInternal (swipeFinish == null)");
        }
        j(f8, new a(f8, f9, z8));
        return false;
    }

    public void d(RecyclerView.F f8) {
        if (f8 instanceof i) {
            c(f8);
            X.e(k.a(f8)).c();
            if (this.f38256e.remove(f8)) {
                throw new IllegalStateException("after animation is cancelled, item should not be in the active animation list [slide]");
            }
        }
    }

    public boolean e(RecyclerView.F f8, boolean z7, boolean z8, long j8, int i8, AbstractC6107a abstractC6107a) {
        c(f8);
        return r(f8, 0.0f, false, z7, z8, this.f38253b, j8, new c(i8, abstractC6107a));
    }

    public boolean f(RecyclerView.F f8, int i8, boolean z7, long j8, int i9, AbstractC6107a abstractC6107a) {
        c(f8);
        return p(f8, i8, z7, j8, new c(i9, abstractC6107a));
    }

    public int g(RecyclerView.F f8) {
        return (int) (k.a(f8).getTranslationX() + 0.5f);
    }

    public int h(RecyclerView.F f8) {
        return (int) (k.a(f8).getTranslationY() + 0.5f);
    }

    public boolean i(RecyclerView.F f8) {
        return this.f38256e.contains(f8);
    }

    public void k(int i8) {
        this.f38260i = i8;
    }

    public void n(RecyclerView.F f8, boolean z7, boolean z8, long j8) {
        c(f8);
        r(f8, 0.0f, false, z7, z8, this.f38253b, j8, null);
    }

    public void o(RecyclerView.F f8, int i8, boolean z7, long j8) {
        c(f8);
        p(f8, i8, z7, j8, null);
    }

    public void q(RecyclerView.F f8, float f9, boolean z7, boolean z8, boolean z9, long j8) {
        c(f8);
        r(f8, f9, z7, z8, z9, this.f38254c, j8, null);
    }

    /* renamed from: j5.b$b, reason: collision with other inner class name */
    private static class C0281b implements InterfaceC7028h0, InterfaceC7032j0 {

        /* renamed from: a, reason: collision with root package name */
        private j f38263a;

        /* renamed from: b, reason: collision with root package name */
        private List f38264b;

        /* renamed from: c, reason: collision with root package name */
        private RecyclerView.F f38265c;

        /* renamed from: d, reason: collision with root package name */
        private C7026g0 f38266d;

        /* renamed from: e, reason: collision with root package name */
        private final int f38267e;

        /* renamed from: f, reason: collision with root package name */
        private final int f38268f;

        /* renamed from: g, reason: collision with root package name */
        private final long f38269g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f38270h;

        /* renamed from: i, reason: collision with root package name */
        private final c f38271i;

        /* renamed from: j, reason: collision with root package name */
        private final Interpolator f38272j;

        /* renamed from: k, reason: collision with root package name */
        private float f38273k;

        C0281b(j jVar, List list, RecyclerView.F f8, int i8, int i9, long j8, boolean z7, Interpolator interpolator, c cVar) {
            this.f38263a = jVar;
            this.f38264b = list;
            this.f38265c = f8;
            this.f38267e = i8;
            this.f38268f = i9;
            this.f38270h = z7;
            this.f38271i = cVar;
            this.f38269g = j8;
            this.f38272j = interpolator;
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            this.f38266d.k(null);
            AbstractC6078a.a(view);
            view.setTranslationX(this.f38267e);
            view.setTranslationY(this.f38268f);
            this.f38264b.remove(this.f38265c);
            Object parent = this.f38265c.f10944a.getParent();
            if (parent != null) {
                X.e0((View) parent);
            }
            c cVar = this.f38271i;
            if (cVar != null) {
                cVar.f38275b.f();
            }
            this.f38264b = null;
            this.f38266d = null;
            this.f38265c = null;
            this.f38263a = null;
        }

        @Override // z0.InterfaceC7032j0
        public void d(View view) {
            float translationX = (this.f38270h ? view.getTranslationX() : view.getTranslationY()) * this.f38273k;
            j jVar = this.f38263a;
            RecyclerView.F f8 = this.f38265c;
            jVar.u0(f8, f8.G(), translationX, true, this.f38270h, false);
        }

        void e() {
            View a8 = k.a(this.f38265c);
            this.f38273k = 1.0f / Math.max(1.0f, this.f38270h ? a8.getWidth() : a8.getHeight());
            C7026g0 e8 = X.e(a8);
            this.f38266d = e8;
            e8.i(this.f38269g);
            this.f38266d.p(this.f38267e);
            this.f38266d.q(this.f38268f);
            Interpolator interpolator = this.f38272j;
            if (interpolator != null) {
                this.f38266d.j(interpolator);
            }
            this.f38266d.k(this);
            this.f38266d.n(this);
            this.f38264b.add(this.f38265c);
            this.f38266d.o();
        }

        @Override // z0.InterfaceC7028h0
        public void a(View view) {
        }

        @Override // z0.InterfaceC7028h0
        public void c(View view) {
        }
    }
}
