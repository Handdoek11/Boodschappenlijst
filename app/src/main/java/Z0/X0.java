package z0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import q.C6407k;

/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    private final g f44717a;

    private static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f44718a;

        /* renamed from: b, reason: collision with root package name */
        private final C7010N f44719b;

        a(Window window, C7010N c7010n) {
            this.f44718a = window;
            this.f44719b = c7010n;
        }

        private void f(int i8) {
            if (i8 == 1) {
                g(4);
                h(1024);
            } else if (i8 == 2) {
                g(2);
            } else {
                if (i8 != 8) {
                    return;
                }
                this.f44719b.a();
            }
        }

        @Override // z0.X0.g
        void c(int i8) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    f(i9);
                }
            }
        }

        protected void d(int i8) {
            View decorView = this.f44718a.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        protected void e(int i8) {
            this.f44718a.addFlags(i8);
        }

        protected void g(int i8) {
            View decorView = this.f44718a.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }

        protected void h(int i8) {
            this.f44718a.clearFlags(i8);
        }
    }

    private static class b extends a {
        b(Window window, C7010N c7010n) {
            super(window, c7010n);
        }

        @Override // z0.X0.g
        public void b(boolean z7) {
            if (!z7) {
                g(8192);
                return;
            }
            h(67108864);
            e(Integer.MIN_VALUE);
            d(8192);
        }
    }

    private static class c extends b {
        c(Window window, C7010N c7010n) {
            super(window, c7010n);
        }

        @Override // z0.X0.g
        public void a(boolean z7) {
            if (!z7) {
                g(16);
                return;
            }
            h(134217728);
            e(Integer.MIN_VALUE);
            d(16);
        }
    }

    private static class e extends d {
        e(Window window, X0 x02, C7010N c7010n) {
            super(window, x02, c7010n);
        }

        e(WindowInsetsController windowInsetsController, X0 x02, C7010N c7010n) {
            super(windowInsetsController, x02, c7010n);
        }
    }

    private static class f extends e {
        f(Window window, X0 x02, C7010N c7010n) {
            super(window, x02, c7010n);
        }

        f(WindowInsetsController windowInsetsController, X0 x02, C7010N c7010n) {
            super(windowInsetsController, x02, c7010n);
        }
    }

    private X0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f44717a = new f(windowInsetsController, this, new C7010N(windowInsetsController));
        } else {
            this.f44717a = new d(windowInsetsController, this, new C7010N(windowInsetsController));
        }
    }

    public static X0 d(WindowInsetsController windowInsetsController) {
        return new X0(windowInsetsController);
    }

    public void a(boolean z7) {
        this.f44717a.a(z7);
    }

    public void b(boolean z7) {
        this.f44717a.b(z7);
    }

    public void c(int i8) {
        this.f44717a.c(i8);
    }

    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        final X0 f44720a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f44721b;

        /* renamed from: c, reason: collision with root package name */
        final C7010N f44722c;

        /* renamed from: d, reason: collision with root package name */
        private final C6407k f44723d;

        /* renamed from: e, reason: collision with root package name */
        protected Window f44724e;

        d(Window window, X0 x02, C7010N c7010n) {
            this(window.getInsetsController(), x02, c7010n);
            this.f44724e = window;
        }

        @Override // z0.X0.g
        public void a(boolean z7) {
            if (z7) {
                if (this.f44724e != null) {
                    d(16);
                }
                this.f44721b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f44724e != null) {
                    e(16);
                }
                this.f44721b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // z0.X0.g
        public void b(boolean z7) {
            if (z7) {
                if (this.f44724e != null) {
                    d(8192);
                }
                this.f44721b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f44724e != null) {
                    e(8192);
                }
                this.f44721b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // z0.X0.g
        void c(int i8) {
            if ((i8 & 8) != 0) {
                this.f44722c.a();
            }
            this.f44721b.show(i8 & (-9));
        }

        protected void d(int i8) {
            View decorView = this.f44724e.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        protected void e(int i8) {
            View decorView = this.f44724e.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, X0 x02, C7010N c7010n) {
            this.f44723d = new C6407k();
            this.f44721b = windowInsetsController;
            this.f44720a = x02;
            this.f44722c = c7010n;
        }
    }

    public X0(Window window, View view) {
        C7010N c7010n = new C7010N(view);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 35) {
            this.f44717a = new f(window, this, c7010n);
            return;
        }
        if (i8 >= 30) {
            this.f44717a = new d(window, this, c7010n);
        } else if (i8 >= 26) {
            this.f44717a = new c(window, c7010n);
        } else {
            this.f44717a = new b(window, c7010n);
        }
    }

    private static class g {
        g() {
        }

        public abstract void b(boolean z7);

        abstract void c(int i8);

        public void a(boolean z7) {
        }
    }
}
