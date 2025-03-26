package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import f.AbstractC5752a;
import f.AbstractC5756e;
import f.AbstractC5757f;
import f.AbstractC5759h;
import g.AbstractC5794a;
import k.C6085a;
import z0.AbstractC7030i0;
import z0.C7026g0;

/* loaded from: classes.dex */
public class j0 implements J {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f7850a;

    /* renamed from: b, reason: collision with root package name */
    private int f7851b;

    /* renamed from: c, reason: collision with root package name */
    private View f7852c;

    /* renamed from: d, reason: collision with root package name */
    private View f7853d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f7854e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f7855f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f7856g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7857h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f7858i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f7859j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f7860k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f7861l;

    /* renamed from: m, reason: collision with root package name */
    boolean f7862m;

    /* renamed from: n, reason: collision with root package name */
    private C0843c f7863n;

    /* renamed from: o, reason: collision with root package name */
    private int f7864o;

    /* renamed from: p, reason: collision with root package name */
    private int f7865p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f7866q;

    class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final C6085a f7867o;

        a() {
            this.f7867o = new C6085a(j0.this.f7850a.getContext(), 0, R.id.home, 0, 0, j0.this.f7858i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j0 j0Var = j0.this;
            Window.Callback callback = j0Var.f7861l;
            if (callback == null || !j0Var.f7862m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f7867o);
        }
    }

    class b extends AbstractC7030i0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7869a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7870b;

        b(int i8) {
            this.f7870b = i8;
        }

        @Override // z0.AbstractC7030i0, z0.InterfaceC7028h0
        public void a(View view) {
            this.f7869a = true;
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            if (this.f7869a) {
                return;
            }
            j0.this.f7850a.setVisibility(this.f7870b);
        }

        @Override // z0.AbstractC7030i0, z0.InterfaceC7028h0
        public void c(View view) {
            j0.this.f7850a.setVisibility(0);
        }
    }

    public j0(Toolbar toolbar, boolean z7) {
        this(toolbar, z7, AbstractC5759h.f35529a, AbstractC5756e.f35454n);
    }

    private void F(CharSequence charSequence) {
        this.f7858i = charSequence;
        if ((this.f7851b & 8) != 0) {
            this.f7850a.setTitle(charSequence);
            if (this.f7857h) {
                z0.X.q0(this.f7850a.getRootView(), charSequence);
            }
        }
    }

    private void G() {
        if ((this.f7851b & 4) != 0) {
            if (TextUtils.isEmpty(this.f7860k)) {
                this.f7850a.setNavigationContentDescription(this.f7865p);
            } else {
                this.f7850a.setNavigationContentDescription(this.f7860k);
            }
        }
    }

    private void H() {
        if ((this.f7851b & 4) == 0) {
            this.f7850a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f7850a;
        Drawable drawable = this.f7856g;
        if (drawable == null) {
            drawable = this.f7866q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i8 = this.f7851b;
        if ((i8 & 2) == 0) {
            drawable = null;
        } else if ((i8 & 1) == 0 || (drawable = this.f7855f) == null) {
            drawable = this.f7854e;
        }
        this.f7850a.setLogo(drawable);
    }

    private int z() {
        if (this.f7850a.getNavigationIcon() == null) {
            return 11;
        }
        this.f7866q = this.f7850a.getNavigationIcon();
        return 15;
    }

    public void A(int i8) {
        if (i8 == this.f7865p) {
            return;
        }
        this.f7865p = i8;
        if (TextUtils.isEmpty(this.f7850a.getNavigationContentDescription())) {
            C(this.f7865p);
        }
    }

    public void B(Drawable drawable) {
        this.f7855f = drawable;
        I();
    }

    public void C(int i8) {
        D(i8 == 0 ? null : getContext().getString(i8));
    }

    public void D(CharSequence charSequence) {
        this.f7860k = charSequence;
        G();
    }

    public void E(Drawable drawable) {
        this.f7856g = drawable;
        H();
    }

    @Override // androidx.appcompat.widget.J
    public void a(Menu menu, j.a aVar) {
        if (this.f7863n == null) {
            C0843c c0843c = new C0843c(this.f7850a.getContext());
            this.f7863n = c0843c;
            c0843c.p(AbstractC5757f.f35489g);
        }
        this.f7863n.h(aVar);
        this.f7850a.K((androidx.appcompat.view.menu.e) menu, this.f7863n);
    }

    @Override // androidx.appcompat.widget.J
    public boolean b() {
        return this.f7850a.B();
    }

    @Override // androidx.appcompat.widget.J
    public void c() {
        this.f7862m = true;
    }

    @Override // androidx.appcompat.widget.J
    public void collapseActionView() {
        this.f7850a.e();
    }

    @Override // androidx.appcompat.widget.J
    public boolean d() {
        return this.f7850a.d();
    }

    @Override // androidx.appcompat.widget.J
    public boolean e() {
        return this.f7850a.A();
    }

    @Override // androidx.appcompat.widget.J
    public boolean f() {
        return this.f7850a.w();
    }

    @Override // androidx.appcompat.widget.J
    public boolean g() {
        return this.f7850a.Q();
    }

    @Override // androidx.appcompat.widget.J
    public Context getContext() {
        return this.f7850a.getContext();
    }

    @Override // androidx.appcompat.widget.J
    public CharSequence getTitle() {
        return this.f7850a.getTitle();
    }

    @Override // androidx.appcompat.widget.J
    public void h() {
        this.f7850a.f();
    }

    @Override // androidx.appcompat.widget.J
    public void i(Z z7) {
        View view = this.f7852c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f7850a;
            if (parent == toolbar) {
                toolbar.removeView(this.f7852c);
            }
        }
        this.f7852c = z7;
    }

    @Override // androidx.appcompat.widget.J
    public boolean j() {
        return this.f7850a.v();
    }

    @Override // androidx.appcompat.widget.J
    public void k(int i8) {
        View view;
        int i9 = this.f7851b ^ i8;
        this.f7851b = i8;
        if (i9 != 0) {
            if ((i9 & 4) != 0) {
                if ((i8 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i9 & 3) != 0) {
                I();
            }
            if ((i9 & 8) != 0) {
                if ((i8 & 8) != 0) {
                    this.f7850a.setTitle(this.f7858i);
                    this.f7850a.setSubtitle(this.f7859j);
                } else {
                    this.f7850a.setTitle((CharSequence) null);
                    this.f7850a.setSubtitle((CharSequence) null);
                }
            }
            if ((i9 & 16) == 0 || (view = this.f7853d) == null) {
                return;
            }
            if ((i8 & 16) != 0) {
                this.f7850a.addView(view);
            } else {
                this.f7850a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.J
    public void l(CharSequence charSequence) {
        this.f7859j = charSequence;
        if ((this.f7851b & 8) != 0) {
            this.f7850a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.J
    public Menu m() {
        return this.f7850a.getMenu();
    }

    @Override // androidx.appcompat.widget.J
    public void n(int i8) {
        B(i8 != 0 ? AbstractC5794a.b(getContext(), i8) : null);
    }

    @Override // androidx.appcompat.widget.J
    public int o() {
        return this.f7864o;
    }

    @Override // androidx.appcompat.widget.J
    public C7026g0 p(int i8, long j8) {
        return z0.X.e(this.f7850a).b(i8 == 0 ? 1.0f : 0.0f).i(j8).k(new b(i8));
    }

    @Override // androidx.appcompat.widget.J
    public void q(j.a aVar, e.a aVar2) {
        this.f7850a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.J
    public void r(int i8) {
        this.f7850a.setVisibility(i8);
    }

    @Override // androidx.appcompat.widget.J
    public ViewGroup s() {
        return this.f7850a;
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(int i8) {
        setIcon(i8 != 0 ? AbstractC5794a.b(getContext(), i8) : null);
    }

    @Override // androidx.appcompat.widget.J
    public void setTitle(CharSequence charSequence) {
        this.f7857h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowCallback(Window.Callback callback) {
        this.f7861l = callback;
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f7857h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void t(boolean z7) {
    }

    @Override // androidx.appcompat.widget.J
    public int u() {
        return this.f7851b;
    }

    @Override // androidx.appcompat.widget.J
    public void v(View view) {
        View view2 = this.f7853d;
        if (view2 != null && (this.f7851b & 16) != 0) {
            this.f7850a.removeView(view2);
        }
        this.f7853d = view;
        if (view == null || (this.f7851b & 16) == 0) {
            return;
        }
        this.f7850a.addView(view);
    }

    @Override // androidx.appcompat.widget.J
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void y(boolean z7) {
        this.f7850a.setCollapsible(z7);
    }

    public j0(Toolbar toolbar, boolean z7, int i8, int i9) {
        Drawable drawable;
        this.f7864o = 0;
        this.f7865p = 0;
        this.f7850a = toolbar;
        this.f7858i = toolbar.getTitle();
        this.f7859j = toolbar.getSubtitle();
        this.f7857h = this.f7858i != null;
        this.f7856g = toolbar.getNavigationIcon();
        f0 v7 = f0.v(toolbar.getContext(), null, f.j.f35669a, AbstractC5752a.f35376c, 0);
        this.f7866q = v7.g(f.j.f35724l);
        if (z7) {
            CharSequence p8 = v7.p(f.j.f35754r);
            if (!TextUtils.isEmpty(p8)) {
                setTitle(p8);
            }
            CharSequence p9 = v7.p(f.j.f35744p);
            if (!TextUtils.isEmpty(p9)) {
                l(p9);
            }
            Drawable g8 = v7.g(f.j.f35734n);
            if (g8 != null) {
                B(g8);
            }
            Drawable g9 = v7.g(f.j.f35729m);
            if (g9 != null) {
                setIcon(g9);
            }
            if (this.f7856g == null && (drawable = this.f7866q) != null) {
                E(drawable);
            }
            k(v7.k(f.j.f35704h, 0));
            int n8 = v7.n(f.j.f35699g, 0);
            if (n8 != 0) {
                v(LayoutInflater.from(this.f7850a.getContext()).inflate(n8, (ViewGroup) this.f7850a, false));
                k(this.f7851b | 16);
            }
            int m8 = v7.m(f.j.f35714j, 0);
            if (m8 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f7850a.getLayoutParams();
                layoutParams.height = m8;
                this.f7850a.setLayoutParams(layoutParams);
            }
            int e8 = v7.e(f.j.f35694f, -1);
            int e9 = v7.e(f.j.f35689e, -1);
            if (e8 >= 0 || e9 >= 0) {
                this.f7850a.J(Math.max(e8, 0), Math.max(e9, 0));
            }
            int n9 = v7.n(f.j.f35759s, 0);
            if (n9 != 0) {
                Toolbar toolbar2 = this.f7850a;
                toolbar2.N(toolbar2.getContext(), n9);
            }
            int n10 = v7.n(f.j.f35749q, 0);
            if (n10 != 0) {
                Toolbar toolbar3 = this.f7850a;
                toolbar3.M(toolbar3.getContext(), n10);
            }
            int n11 = v7.n(f.j.f35739o, 0);
            if (n11 != 0) {
                this.f7850a.setPopupTheme(n11);
            }
        } else {
            this.f7851b = z();
        }
        v7.x();
        A(i8);
        this.f7860k = this.f7850a.getNavigationContentDescription();
        this.f7850a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(Drawable drawable) {
        this.f7854e = drawable;
        I();
    }
}
