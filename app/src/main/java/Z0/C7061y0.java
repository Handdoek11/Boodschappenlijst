package z0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import q0.C6411b;

/* renamed from: z0.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7061y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C7061y0 f44816b;

    /* renamed from: a, reason: collision with root package name */
    private final k f44817a;

    /* renamed from: z0.y0$d */
    private static class d extends c {
        d() {
        }

        @Override // z0.C7061y0.e
        void c(int i8, C6411b c6411b) {
            this.f44825c.setInsets(m.a(i8), c6411b.e());
        }

        d(C7061y0 c7061y0) {
            super(c7061y0);
        }
    }

    /* renamed from: z0.y0$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final C7061y0 f44826a;

        /* renamed from: b, reason: collision with root package name */
        C6411b[] f44827b;

        e() {
            this(new C7061y0((C7061y0) null));
        }

        protected final void a() {
            C6411b[] c6411bArr = this.f44827b;
            if (c6411bArr != null) {
                C6411b c6411b = c6411bArr[l.b(1)];
                C6411b c6411b2 = this.f44827b[l.b(2)];
                if (c6411b2 == null) {
                    c6411b2 = this.f44826a.f(2);
                }
                if (c6411b == null) {
                    c6411b = this.f44826a.f(1);
                }
                g(C6411b.a(c6411b, c6411b2));
                C6411b c6411b3 = this.f44827b[l.b(16)];
                if (c6411b3 != null) {
                    f(c6411b3);
                }
                C6411b c6411b4 = this.f44827b[l.b(32)];
                if (c6411b4 != null) {
                    d(c6411b4);
                }
                C6411b c6411b5 = this.f44827b[l.b(64)];
                if (c6411b5 != null) {
                    h(c6411b5);
                }
            }
        }

        abstract C7061y0 b();

        void c(int i8, C6411b c6411b) {
            if (this.f44827b == null) {
                this.f44827b = new C6411b[9];
            }
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    this.f44827b[l.b(i9)] = c6411b;
                }
            }
        }

        abstract void e(C6411b c6411b);

        abstract void g(C6411b c6411b);

        e(C7061y0 c7061y0) {
            this.f44826a = c7061y0;
        }

        void d(C6411b c6411b) {
        }

        void f(C6411b c6411b) {
        }

        void h(C6411b c6411b) {
        }
    }

    /* renamed from: z0.y0$h */
    private static class h extends g {
        h(C7061y0 c7061y0, WindowInsets windowInsets) {
            super(c7061y0, windowInsets);
        }

        @Override // z0.C7061y0.k
        C7061y0 a() {
            return C7061y0.u(this.f44833c.consumeDisplayCutout());
        }

        @Override // z0.C7061y0.f, z0.C7061y0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f44833c, hVar.f44833c) && Objects.equals(this.f44837g, hVar.f44837g);
        }

        @Override // z0.C7061y0.k
        r f() {
            return r.e(this.f44833c.getDisplayCutout());
        }

        @Override // z0.C7061y0.k
        public int hashCode() {
            return this.f44833c.hashCode();
        }

        h(C7061y0 c7061y0, h hVar) {
            super(c7061y0, hVar);
        }
    }

    /* renamed from: z0.y0$j */
    private static class j extends i {

        /* renamed from: q, reason: collision with root package name */
        static final C7061y0 f44842q = C7061y0.u(WindowInsets.CONSUMED);

        j(C7061y0 c7061y0, WindowInsets windowInsets) {
            super(c7061y0, windowInsets);
        }

        @Override // z0.C7061y0.f, z0.C7061y0.k
        public C6411b g(int i8) {
            return C6411b.d(this.f44833c.getInsets(m.a(i8)));
        }

        j(C7061y0 c7061y0, j jVar) {
            super(c7061y0, jVar);
        }

        @Override // z0.C7061y0.f, z0.C7061y0.k
        final void d(View view) {
        }
    }

    /* renamed from: z0.y0$l */
    public static final class l {
        public static int a() {
            return 8;
        }

        static int b(int i8) {
            if (i8 == 1) {
                return 0;
            }
            if (i8 == 2) {
                return 1;
            }
            if (i8 == 4) {
                return 2;
            }
            if (i8 == 8) {
                return 3;
            }
            if (i8 == 16) {
                return 4;
            }
            if (i8 == 32) {
                return 5;
            }
            if (i8 == 64) {
                return 6;
            }
            if (i8 == 128) {
                return 7;
            }
            if (i8 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i8);
        }

        public static int c() {
            return 32;
        }

        public static int d() {
            return 7;
        }
    }

    /* renamed from: z0.y0$m */
    private static final class m {
        static int a(int i8) {
            int statusBars;
            int i9 = 0;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i8 & i10) != 0) {
                    if (i10 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i10 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i10 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i10 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i10 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i10 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i10 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i10 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i9 |= statusBars;
                }
            }
            return i9;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f44816b = j.f44842q;
        } else {
            f44816b = k.f44843b;
        }
    }

    private C7061y0(WindowInsets windowInsets) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.f44817a = new j(this, windowInsets);
            return;
        }
        if (i8 >= 29) {
            this.f44817a = new i(this, windowInsets);
        } else if (i8 >= 28) {
            this.f44817a = new h(this, windowInsets);
        } else {
            this.f44817a = new g(this, windowInsets);
        }
    }

    static C6411b m(C6411b c6411b, int i8, int i9, int i10, int i11) {
        int max = Math.max(0, c6411b.f40897a - i8);
        int max2 = Math.max(0, c6411b.f40898b - i9);
        int max3 = Math.max(0, c6411b.f40899c - i10);
        int max4 = Math.max(0, c6411b.f40900d - i11);
        return (max == i8 && max2 == i9 && max3 == i10 && max4 == i11) ? c6411b : C6411b.b(max, max2, max3, max4);
    }

    public static C7061y0 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static C7061y0 v(WindowInsets windowInsets, View view) {
        C7061y0 c7061y0 = new C7061y0((WindowInsets) y0.i.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c7061y0.r(X.F(view));
            c7061y0.d(view.getRootView());
        }
        return c7061y0;
    }

    public C7061y0 a() {
        return this.f44817a.a();
    }

    public C7061y0 b() {
        return this.f44817a.b();
    }

    public C7061y0 c() {
        return this.f44817a.c();
    }

    void d(View view) {
        this.f44817a.d(view);
    }

    public r e() {
        return this.f44817a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7061y0) {
            return y0.d.a(this.f44817a, ((C7061y0) obj).f44817a);
        }
        return false;
    }

    public C6411b f(int i8) {
        return this.f44817a.g(i8);
    }

    public C6411b g() {
        return this.f44817a.i();
    }

    public int h() {
        return this.f44817a.k().f40900d;
    }

    public int hashCode() {
        k kVar = this.f44817a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public int i() {
        return this.f44817a.k().f40897a;
    }

    public int j() {
        return this.f44817a.k().f40899c;
    }

    public int k() {
        return this.f44817a.k().f40898b;
    }

    public C7061y0 l(int i8, int i9, int i10, int i11) {
        return this.f44817a.m(i8, i9, i10, i11);
    }

    public boolean n() {
        return this.f44817a.n();
    }

    public C7061y0 o(int i8, int i9, int i10, int i11) {
        return new a(this).d(C6411b.b(i8, i9, i10, i11)).a();
    }

    void p(C6411b[] c6411bArr) {
        this.f44817a.p(c6411bArr);
    }

    void q(C6411b c6411b) {
        this.f44817a.q(c6411b);
    }

    void r(C7061y0 c7061y0) {
        this.f44817a.r(c7061y0);
    }

    void s(C6411b c6411b) {
        this.f44817a.s(c6411b);
    }

    public WindowInsets t() {
        k kVar = this.f44817a;
        if (kVar instanceof f) {
            return ((f) kVar).f44833c;
        }
        return null;
    }

    /* renamed from: z0.y0$b */
    private static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        private static Field f44819e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f44820f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor f44821g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f44822h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f44823c;

        /* renamed from: d, reason: collision with root package name */
        private C6411b f44824d;

        b() {
            this.f44823c = i();
        }

        private static WindowInsets i() {
            if (!f44820f) {
                try {
                    f44819e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
                }
                f44820f = true;
            }
            Field field = f44819e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
                }
            }
            if (!f44822h) {
                try {
                    f44821g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
                }
                f44822h = true;
            }
            Constructor constructor = f44821g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
                }
            }
            return null;
        }

        @Override // z0.C7061y0.e
        C7061y0 b() {
            a();
            C7061y0 u7 = C7061y0.u(this.f44823c);
            u7.p(this.f44827b);
            u7.s(this.f44824d);
            return u7;
        }

        @Override // z0.C7061y0.e
        void e(C6411b c6411b) {
            this.f44824d = c6411b;
        }

        @Override // z0.C7061y0.e
        void g(C6411b c6411b) {
            WindowInsets windowInsets = this.f44823c;
            if (windowInsets != null) {
                this.f44823c = windowInsets.replaceSystemWindowInsets(c6411b.f40897a, c6411b.f40898b, c6411b.f40899c, c6411b.f40900d);
            }
        }

        b(C7061y0 c7061y0) {
            super(c7061y0);
            this.f44823c = c7061y0.t();
        }
    }

    /* renamed from: z0.y0$c */
    private static class c extends e {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f44825c;

        c() {
            this.f44825c = G0.a();
        }

        @Override // z0.C7061y0.e
        C7061y0 b() {
            a();
            C7061y0 u7 = C7061y0.u(this.f44825c.build());
            u7.p(this.f44827b);
            return u7;
        }

        @Override // z0.C7061y0.e
        void d(C6411b c6411b) {
            this.f44825c.setMandatorySystemGestureInsets(c6411b.e());
        }

        @Override // z0.C7061y0.e
        void e(C6411b c6411b) {
            this.f44825c.setStableInsets(c6411b.e());
        }

        @Override // z0.C7061y0.e
        void f(C6411b c6411b) {
            this.f44825c.setSystemGestureInsets(c6411b.e());
        }

        @Override // z0.C7061y0.e
        void g(C6411b c6411b) {
            this.f44825c.setSystemWindowInsets(c6411b.e());
        }

        @Override // z0.C7061y0.e
        void h(C6411b c6411b) {
            this.f44825c.setTappableElementInsets(c6411b.e());
        }

        c(C7061y0 c7061y0) {
            WindowInsets.Builder a8;
            super(c7061y0);
            WindowInsets t7 = c7061y0.t();
            if (t7 != null) {
                a8 = F0.a(t7);
            } else {
                a8 = G0.a();
            }
            this.f44825c = a8;
        }
    }

    /* renamed from: z0.y0$g */
    private static class g extends f {

        /* renamed from: m, reason: collision with root package name */
        private C6411b f44838m;

        g(C7061y0 c7061y0, WindowInsets windowInsets) {
            super(c7061y0, windowInsets);
            this.f44838m = null;
        }

        @Override // z0.C7061y0.k
        C7061y0 b() {
            return C7061y0.u(this.f44833c.consumeStableInsets());
        }

        @Override // z0.C7061y0.k
        C7061y0 c() {
            return C7061y0.u(this.f44833c.consumeSystemWindowInsets());
        }

        @Override // z0.C7061y0.k
        final C6411b i() {
            if (this.f44838m == null) {
                this.f44838m = C6411b.b(this.f44833c.getStableInsetLeft(), this.f44833c.getStableInsetTop(), this.f44833c.getStableInsetRight(), this.f44833c.getStableInsetBottom());
            }
            return this.f44838m;
        }

        @Override // z0.C7061y0.k
        boolean n() {
            return this.f44833c.isConsumed();
        }

        @Override // z0.C7061y0.k
        public void s(C6411b c6411b) {
            this.f44838m = c6411b;
        }

        g(C7061y0 c7061y0, g gVar) {
            super(c7061y0, gVar);
            this.f44838m = null;
            this.f44838m = gVar.f44838m;
        }
    }

    /* renamed from: z0.y0$f */
    private static class f extends k {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f44828h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f44829i;

        /* renamed from: j, reason: collision with root package name */
        private static Class f44830j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f44831k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f44832l;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f44833c;

        /* renamed from: d, reason: collision with root package name */
        private C6411b[] f44834d;

        /* renamed from: e, reason: collision with root package name */
        private C6411b f44835e;

        /* renamed from: f, reason: collision with root package name */
        private C7061y0 f44836f;

        /* renamed from: g, reason: collision with root package name */
        C6411b f44837g;

        f(C7061y0 c7061y0, WindowInsets windowInsets) {
            super(c7061y0);
            this.f44835e = null;
            this.f44833c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private C6411b t(int i8, boolean z7) {
            C6411b c6411b = C6411b.f40896e;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    c6411b = C6411b.a(c6411b, u(i9, z7));
                }
            }
            return c6411b;
        }

        private C6411b v() {
            C7061y0 c7061y0 = this.f44836f;
            return c7061y0 != null ? c7061y0.g() : C6411b.f40896e;
        }

        private C6411b w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f44828h) {
                x();
            }
            Method method = f44829i;
            if (method != null && f44830j != null && f44831k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f44831k.get(f44832l.get(invoke));
                    if (rect != null) {
                        return C6411b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e8) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f44829i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f44830j = cls;
                f44831k = cls.getDeclaredField("mVisibleInsets");
                f44832l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f44831k.setAccessible(true);
                f44832l.setAccessible(true);
            } catch (ReflectiveOperationException e8) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
            }
            f44828h = true;
        }

        @Override // z0.C7061y0.k
        void d(View view) {
            C6411b w7 = w(view);
            if (w7 == null) {
                w7 = C6411b.f40896e;
            }
            q(w7);
        }

        @Override // z0.C7061y0.k
        void e(C7061y0 c7061y0) {
            c7061y0.r(this.f44836f);
            c7061y0.q(this.f44837g);
        }

        @Override // z0.C7061y0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f44837g, ((f) obj).f44837g);
            }
            return false;
        }

        @Override // z0.C7061y0.k
        public C6411b g(int i8) {
            return t(i8, false);
        }

        @Override // z0.C7061y0.k
        final C6411b k() {
            if (this.f44835e == null) {
                this.f44835e = C6411b.b(this.f44833c.getSystemWindowInsetLeft(), this.f44833c.getSystemWindowInsetTop(), this.f44833c.getSystemWindowInsetRight(), this.f44833c.getSystemWindowInsetBottom());
            }
            return this.f44835e;
        }

        @Override // z0.C7061y0.k
        C7061y0 m(int i8, int i9, int i10, int i11) {
            a aVar = new a(C7061y0.u(this.f44833c));
            aVar.d(C7061y0.m(k(), i8, i9, i10, i11));
            aVar.c(C7061y0.m(i(), i8, i9, i10, i11));
            return aVar.a();
        }

        @Override // z0.C7061y0.k
        boolean o() {
            return this.f44833c.isRound();
        }

        @Override // z0.C7061y0.k
        public void p(C6411b[] c6411bArr) {
            this.f44834d = c6411bArr;
        }

        @Override // z0.C7061y0.k
        void q(C6411b c6411b) {
            this.f44837g = c6411b;
        }

        @Override // z0.C7061y0.k
        void r(C7061y0 c7061y0) {
            this.f44836f = c7061y0;
        }

        protected C6411b u(int i8, boolean z7) {
            C6411b g8;
            int i9;
            if (i8 == 1) {
                return z7 ? C6411b.b(0, Math.max(v().f40898b, k().f40898b), 0, 0) : C6411b.b(0, k().f40898b, 0, 0);
            }
            if (i8 == 2) {
                if (z7) {
                    C6411b v7 = v();
                    C6411b i10 = i();
                    return C6411b.b(Math.max(v7.f40897a, i10.f40897a), 0, Math.max(v7.f40899c, i10.f40899c), Math.max(v7.f40900d, i10.f40900d));
                }
                C6411b k8 = k();
                C7061y0 c7061y0 = this.f44836f;
                g8 = c7061y0 != null ? c7061y0.g() : null;
                int i11 = k8.f40900d;
                if (g8 != null) {
                    i11 = Math.min(i11, g8.f40900d);
                }
                return C6411b.b(k8.f40897a, 0, k8.f40899c, i11);
            }
            if (i8 != 8) {
                if (i8 == 16) {
                    return j();
                }
                if (i8 == 32) {
                    return h();
                }
                if (i8 == 64) {
                    return l();
                }
                if (i8 != 128) {
                    return C6411b.f40896e;
                }
                C7061y0 c7061y02 = this.f44836f;
                r e8 = c7061y02 != null ? c7061y02.e() : f();
                return e8 != null ? C6411b.b(e8.b(), e8.d(), e8.c(), e8.a()) : C6411b.f40896e;
            }
            C6411b[] c6411bArr = this.f44834d;
            g8 = c6411bArr != null ? c6411bArr[l.b(8)] : null;
            if (g8 != null) {
                return g8;
            }
            C6411b k9 = k();
            C6411b v8 = v();
            int i12 = k9.f40900d;
            if (i12 > v8.f40900d) {
                return C6411b.b(0, 0, 0, i12);
            }
            C6411b c6411b = this.f44837g;
            return (c6411b == null || c6411b.equals(C6411b.f40896e) || (i9 = this.f44837g.f40900d) <= v8.f40900d) ? C6411b.f40896e : C6411b.b(0, 0, 0, i9);
        }

        f(C7061y0 c7061y0, f fVar) {
            this(c7061y0, new WindowInsets(fVar.f44833c));
        }
    }

    /* renamed from: z0.y0$i */
    private static class i extends h {

        /* renamed from: n, reason: collision with root package name */
        private C6411b f44839n;

        /* renamed from: o, reason: collision with root package name */
        private C6411b f44840o;

        /* renamed from: p, reason: collision with root package name */
        private C6411b f44841p;

        i(C7061y0 c7061y0, WindowInsets windowInsets) {
            super(c7061y0, windowInsets);
            this.f44839n = null;
            this.f44840o = null;
            this.f44841p = null;
        }

        @Override // z0.C7061y0.k
        C6411b h() {
            if (this.f44840o == null) {
                this.f44840o = C6411b.d(this.f44833c.getMandatorySystemGestureInsets());
            }
            return this.f44840o;
        }

        @Override // z0.C7061y0.k
        C6411b j() {
            if (this.f44839n == null) {
                this.f44839n = C6411b.d(this.f44833c.getSystemGestureInsets());
            }
            return this.f44839n;
        }

        @Override // z0.C7061y0.k
        C6411b l() {
            if (this.f44841p == null) {
                this.f44841p = C6411b.d(this.f44833c.getTappableElementInsets());
            }
            return this.f44841p;
        }

        @Override // z0.C7061y0.f, z0.C7061y0.k
        C7061y0 m(int i8, int i9, int i10, int i11) {
            return C7061y0.u(this.f44833c.inset(i8, i9, i10, i11));
        }

        i(C7061y0 c7061y0, i iVar) {
            super(c7061y0, iVar);
            this.f44839n = null;
            this.f44840o = null;
            this.f44841p = null;
        }

        @Override // z0.C7061y0.g, z0.C7061y0.k
        public void s(C6411b c6411b) {
        }
    }

    /* renamed from: z0.y0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final e f44818a;

        public a() {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                this.f44818a = new d();
            } else if (i8 >= 29) {
                this.f44818a = new c();
            } else {
                this.f44818a = new b();
            }
        }

        public C7061y0 a() {
            return this.f44818a.b();
        }

        public a b(int i8, C6411b c6411b) {
            this.f44818a.c(i8, c6411b);
            return this;
        }

        public a c(C6411b c6411b) {
            this.f44818a.e(c6411b);
            return this;
        }

        public a d(C6411b c6411b) {
            this.f44818a.g(c6411b);
            return this;
        }

        public a(C7061y0 c7061y0) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                this.f44818a = new d(c7061y0);
            } else if (i8 >= 29) {
                this.f44818a = new c(c7061y0);
            } else {
                this.f44818a = new b(c7061y0);
            }
        }
    }

    public C7061y0(C7061y0 c7061y0) {
        if (c7061y0 != null) {
            k kVar = c7061y0.f44817a;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30 && (kVar instanceof j)) {
                this.f44817a = new j(this, (j) kVar);
            } else if (i8 >= 29 && (kVar instanceof i)) {
                this.f44817a = new i(this, (i) kVar);
            } else if (i8 >= 28 && (kVar instanceof h)) {
                this.f44817a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f44817a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f44817a = new f(this, (f) kVar);
            } else {
                this.f44817a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.f44817a = new k(this);
    }

    /* renamed from: z0.y0$k */
    private static class k {

        /* renamed from: b, reason: collision with root package name */
        static final C7061y0 f44843b = new a().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final C7061y0 f44844a;

        k(C7061y0 c7061y0) {
            this.f44844a = c7061y0;
        }

        C7061y0 a() {
            return this.f44844a;
        }

        C7061y0 b() {
            return this.f44844a;
        }

        C7061y0 c() {
            return this.f44844a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return o() == kVar.o() && n() == kVar.n() && y0.d.a(k(), kVar.k()) && y0.d.a(i(), kVar.i()) && y0.d.a(f(), kVar.f());
        }

        r f() {
            return null;
        }

        C6411b g(int i8) {
            return C6411b.f40896e;
        }

        C6411b h() {
            return k();
        }

        public int hashCode() {
            return y0.d.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        C6411b i() {
            return C6411b.f40896e;
        }

        C6411b j() {
            return k();
        }

        C6411b k() {
            return C6411b.f40896e;
        }

        C6411b l() {
            return k();
        }

        C7061y0 m(int i8, int i9, int i10, int i11) {
            return f44843b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        void d(View view) {
        }

        void e(C7061y0 c7061y0) {
        }

        public void p(C6411b[] c6411bArr) {
        }

        void q(C6411b c6411b) {
        }

        void r(C7061y0 c7061y0) {
        }

        public void s(C6411b c6411b) {
        }
    }
}
