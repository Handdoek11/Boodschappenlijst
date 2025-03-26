package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import n0.AbstractC6244c;
import q0.C6411b;
import z0.C7061y0;

/* renamed from: z0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7036l0 {

    /* renamed from: a, reason: collision with root package name */
    private e f44763a;

    /* renamed from: z0.l0$b */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        WindowInsets f44766a;

        /* renamed from: b, reason: collision with root package name */
        private final int f44767b;

        public b(int i8) {
            this.f44767b = i8;
        }

        public final int a() {
            return this.f44767b;
        }

        public abstract void b(C7036l0 c7036l0);

        public abstract void c(C7036l0 c7036l0);

        public abstract C7061y0 d(C7061y0 c7061y0, List list);

        public abstract a e(C7036l0 c7036l0, a aVar);
    }

    /* renamed from: z0.l0$c */
    private static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        private static final Interpolator f44768e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f44769f = new Q0.a();

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f44770g = new DecelerateInterpolator();

        /* renamed from: z0.l0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            final b f44771a;

            /* renamed from: b, reason: collision with root package name */
            private C7061y0 f44772b;

            /* renamed from: z0.l0$c$a$a, reason: collision with other inner class name */
            class C0361a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C7036l0 f44773a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C7061y0 f44774b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C7061y0 f44775c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f44776d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f44777e;

                C0361a(C7036l0 c7036l0, C7061y0 c7061y0, C7061y0 c7061y02, int i8, View view) {
                    this.f44773a = c7036l0;
                    this.f44774b = c7061y0;
                    this.f44775c = c7061y02;
                    this.f44776d = i8;
                    this.f44777e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f44773a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f44777e, c.o(this.f44774b, this.f44775c, this.f44773a.b(), this.f44776d), Collections.singletonList(this.f44773a));
                }
            }

            /* renamed from: z0.l0$c$a$b */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C7036l0 f44779a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f44780b;

                b(C7036l0 c7036l0, View view) {
                    this.f44779a = c7036l0;
                    this.f44780b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f44779a.e(1.0f);
                    c.i(this.f44780b, this.f44779a);
                }
            }

            /* renamed from: z0.l0$c$a$c, reason: collision with other inner class name */
            class RunnableC0362c implements Runnable {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ View f44782o;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ C7036l0 f44783s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ a f44784t;

                /* renamed from: u, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f44785u;

                RunnableC0362c(View view, C7036l0 c7036l0, a aVar, ValueAnimator valueAnimator) {
                    this.f44782o = view;
                    this.f44783s = c7036l0;
                    this.f44784t = aVar;
                    this.f44785u = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f44782o, this.f44783s, this.f44784t);
                    this.f44785u.start();
                }
            }

            a(View view, b bVar) {
                this.f44771a = bVar;
                C7061y0 F7 = X.F(view);
                this.f44772b = F7 != null ? new C7061y0.a(F7).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f44772b = C7061y0.v(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                C7061y0 v7 = C7061y0.v(windowInsets, view);
                if (this.f44772b == null) {
                    this.f44772b = X.F(view);
                }
                if (this.f44772b == null) {
                    this.f44772b = v7;
                    return c.m(view, windowInsets);
                }
                b n8 = c.n(view);
                if (n8 != null && Objects.equals(n8.f44766a, windowInsets)) {
                    return c.m(view, windowInsets);
                }
                int e8 = c.e(v7, this.f44772b);
                if (e8 == 0) {
                    return c.m(view, windowInsets);
                }
                C7061y0 c7061y0 = this.f44772b;
                C7036l0 c7036l0 = new C7036l0(e8, c.g(e8, v7, c7061y0), 160L);
                c7036l0.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c7036l0.a());
                a f8 = c.f(v7, c7061y0, e8);
                c.j(view, c7036l0, windowInsets, false);
                duration.addUpdateListener(new C0361a(c7036l0, v7, c7061y0, e8, view));
                duration.addListener(new b(c7036l0, view));
                ViewTreeObserverOnPreDrawListenerC7007K.a(view, new RunnableC0362c(view, c7036l0, f8, duration));
                this.f44772b = v7;
                return c.m(view, windowInsets);
            }
        }

        c(int i8, Interpolator interpolator, long j8) {
            super(i8, interpolator, j8);
        }

        static int e(C7061y0 c7061y0, C7061y0 c7061y02) {
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if (!c7061y0.f(i9).equals(c7061y02.f(i9))) {
                    i8 |= i9;
                }
            }
            return i8;
        }

        static a f(C7061y0 c7061y0, C7061y0 c7061y02, int i8) {
            C6411b f8 = c7061y0.f(i8);
            C6411b f9 = c7061y02.f(i8);
            return new a(C6411b.b(Math.min(f8.f40897a, f9.f40897a), Math.min(f8.f40898b, f9.f40898b), Math.min(f8.f40899c, f9.f40899c), Math.min(f8.f40900d, f9.f40900d)), C6411b.b(Math.max(f8.f40897a, f9.f40897a), Math.max(f8.f40898b, f9.f40898b), Math.max(f8.f40899c, f9.f40899c), Math.max(f8.f40900d, f9.f40900d)));
        }

        static Interpolator g(int i8, C7061y0 c7061y0, C7061y0 c7061y02) {
            return (i8 & 8) != 0 ? c7061y0.f(C7061y0.l.a()).f40900d > c7061y02.f(C7061y0.l.a()).f40900d ? f44768e : f44769f : f44770g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, C7036l0 c7036l0) {
            b n8 = n(view);
            if (n8 != null) {
                n8.b(c7036l0);
                if (n8.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    i(viewGroup.getChildAt(i8), c7036l0);
                }
            }
        }

        static void j(View view, C7036l0 c7036l0, WindowInsets windowInsets, boolean z7) {
            b n8 = n(view);
            if (n8 != null) {
                n8.f44766a = windowInsets;
                if (!z7) {
                    n8.c(c7036l0);
                    z7 = n8.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    j(viewGroup.getChildAt(i8), c7036l0, windowInsets, z7);
                }
            }
        }

        static void k(View view, C7061y0 c7061y0, List list) {
            b n8 = n(view);
            if (n8 != null) {
                c7061y0 = n8.d(c7061y0, list);
                if (n8.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    k(viewGroup.getChildAt(i8), c7061y0, list);
                }
            }
        }

        static void l(View view, C7036l0 c7036l0, a aVar) {
            b n8 = n(view);
            if (n8 != null) {
                n8.e(c7036l0, aVar);
                if (n8.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    l(viewGroup.getChildAt(i8), c7036l0, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC6244c.f39494L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(AbstractC6244c.f39501S);
            if (tag instanceof a) {
                return ((a) tag).f44771a;
            }
            return null;
        }

        static C7061y0 o(C7061y0 c7061y0, C7061y0 c7061y02, float f8, int i8) {
            C7061y0.a aVar = new C7061y0.a(c7061y0);
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) == 0) {
                    aVar.b(i9, c7061y0.f(i9));
                } else {
                    C6411b f9 = c7061y0.f(i9);
                    C6411b f10 = c7061y02.f(i9);
                    float f11 = 1.0f - f8;
                    aVar.b(i9, C7061y0.m(f9, (int) (((f9.f40897a - f10.f40897a) * f11) + 0.5d), (int) (((f9.f40898b - f10.f40898b) * f11) + 0.5d), (int) (((f9.f40899c - f10.f40899c) * f11) + 0.5d), (int) (((f9.f40900d - f10.f40900d) * f11) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(AbstractC6244c.f39494L);
            if (bVar == null) {
                view.setTag(AbstractC6244c.f39501S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener h8 = h(view, bVar);
            view.setTag(AbstractC6244c.f39501S, h8);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(h8);
            }
        }
    }

    /* renamed from: z0.l0$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f44792a;

        /* renamed from: b, reason: collision with root package name */
        private float f44793b;

        /* renamed from: c, reason: collision with root package name */
        private final Interpolator f44794c;

        /* renamed from: d, reason: collision with root package name */
        private final long f44795d;

        e(int i8, Interpolator interpolator, long j8) {
            this.f44792a = i8;
            this.f44794c = interpolator;
            this.f44795d = j8;
        }

        public long a() {
            return this.f44795d;
        }

        public float b() {
            Interpolator interpolator = this.f44794c;
            return interpolator != null ? interpolator.getInterpolation(this.f44793b) : this.f44793b;
        }

        public int c() {
            return this.f44792a;
        }

        public void d(float f8) {
            this.f44793b = f8;
        }
    }

    public C7036l0(int i8, Interpolator interpolator, long j8) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f44763a = new d(i8, interpolator, j8);
        } else {
            this.f44763a = new c(i8, interpolator, j8);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static C7036l0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C7036l0(windowInsetsAnimation);
    }

    public long a() {
        return this.f44763a.a();
    }

    public float b() {
        return this.f44763a.b();
    }

    public int c() {
        return this.f44763a.c();
    }

    public void e(float f8) {
        this.f44763a.d(f8);
    }

    /* renamed from: z0.l0$d */
    private static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        private final WindowInsetsAnimation f44787e;

        /* renamed from: z0.l0$d$a */
        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f44788a;

            /* renamed from: b, reason: collision with root package name */
            private List f44789b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList f44790c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap f44791d;

            a(b bVar) {
                super(bVar.a());
                this.f44791d = new HashMap();
                this.f44788a = bVar;
            }

            private C7036l0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C7036l0 c7036l0 = (C7036l0) this.f44791d.get(windowInsetsAnimation);
                if (c7036l0 != null) {
                    return c7036l0;
                }
                C7036l0 f8 = C7036l0.f(windowInsetsAnimation);
                this.f44791d.put(windowInsetsAnimation, f8);
                return f8;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f44788a.b(a(windowInsetsAnimation));
                this.f44791d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f44788a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f44790c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f44790c = arrayList2;
                    this.f44789b = DesugarCollections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a8 = AbstractC7057w0.a(list.get(size));
                    C7036l0 a9 = a(a8);
                    a9.e(a8.getFraction());
                    this.f44790c.add(a9);
                }
                return this.f44788a.d(C7061y0.u(windowInsets), this.f44789b).t();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f44788a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f44787e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            AbstractC7051t0.a();
            return AbstractC7049s0.a(aVar.a().e(), aVar.b().e());
        }

        public static C6411b f(WindowInsetsAnimation.Bounds bounds) {
            return C6411b.d(bounds.getUpperBound());
        }

        public static C6411b g(WindowInsetsAnimation.Bounds bounds) {
            return C6411b.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // z0.C7036l0.e
        public long a() {
            return this.f44787e.getDurationMillis();
        }

        @Override // z0.C7036l0.e
        public float b() {
            return this.f44787e.getInterpolatedFraction();
        }

        @Override // z0.C7036l0.e
        public int c() {
            return this.f44787e.getTypeMask();
        }

        @Override // z0.C7036l0.e
        public void d(float f8) {
            this.f44787e.setFraction(f8);
        }

        d(int i8, Interpolator interpolator, long j8) {
            this(AbstractC7047r0.a(i8, interpolator, j8));
        }
    }

    /* renamed from: z0.l0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C6411b f44764a;

        /* renamed from: b, reason: collision with root package name */
        private final C6411b f44765b;

        public a(C6411b c6411b, C6411b c6411b2) {
            this.f44764a = c6411b;
            this.f44765b = c6411b2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public C6411b a() {
            return this.f44764a;
        }

        public C6411b b() {
            return this.f44765b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f44764a + " upper=" + this.f44765b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f44764a = d.g(bounds);
            this.f44765b = d.f(bounds);
        }
    }

    private C7036l0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f44763a = new d(windowInsetsAnimation);
        }
    }
}
