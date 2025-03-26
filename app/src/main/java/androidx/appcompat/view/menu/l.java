package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.V;
import f.AbstractC5755d;
import f.AbstractC5758g;

/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* renamed from: M, reason: collision with root package name */
    private static final int f7231M = AbstractC5758g.f35521m;

    /* renamed from: C, reason: collision with root package name */
    private PopupWindow.OnDismissListener f7234C;

    /* renamed from: D, reason: collision with root package name */
    private View f7235D;

    /* renamed from: E, reason: collision with root package name */
    View f7236E;

    /* renamed from: F, reason: collision with root package name */
    private j.a f7237F;

    /* renamed from: G, reason: collision with root package name */
    ViewTreeObserver f7238G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f7239H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f7240I;

    /* renamed from: J, reason: collision with root package name */
    private int f7241J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f7243L;

    /* renamed from: s, reason: collision with root package name */
    private final Context f7244s;

    /* renamed from: t, reason: collision with root package name */
    private final e f7245t;

    /* renamed from: u, reason: collision with root package name */
    private final d f7246u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f7247v;

    /* renamed from: w, reason: collision with root package name */
    private final int f7248w;

    /* renamed from: x, reason: collision with root package name */
    private final int f7249x;

    /* renamed from: y, reason: collision with root package name */
    private final int f7250y;

    /* renamed from: z, reason: collision with root package name */
    final V f7251z;

    /* renamed from: A, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f7232A = new a();

    /* renamed from: B, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f7233B = new b();

    /* renamed from: K, reason: collision with root package name */
    private int f7242K = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f7251z.B()) {
                return;
            }
            View view = l.this.f7236E;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f7251z.b();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f7238G;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f7238G = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f7238G.removeGlobalOnLayoutListener(lVar.f7232A);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i8, int i9, boolean z7) {
        this.f7244s = context;
        this.f7245t = eVar;
        this.f7247v = z7;
        this.f7246u = new d(eVar, LayoutInflater.from(context), z7, f7231M);
        this.f7249x = i8;
        this.f7250y = i9;
        Resources resources = context.getResources();
        this.f7248w = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC5755d.f35410b));
        this.f7235D = view;
        this.f7251z = new V(context, null, i8, i9);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f7239H || (view = this.f7235D) == null) {
            return false;
        }
        this.f7236E = view;
        this.f7251z.K(this);
        this.f7251z.L(this);
        this.f7251z.J(true);
        View view2 = this.f7236E;
        boolean z7 = this.f7238G == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f7238G = viewTreeObserver;
        if (z7) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f7232A);
        }
        view2.addOnAttachStateChangeListener(this.f7233B);
        this.f7251z.D(view2);
        this.f7251z.G(this.f7242K);
        if (!this.f7240I) {
            this.f7241J = h.o(this.f7246u, null, this.f7244s, this.f7248w);
            this.f7240I = true;
        }
        this.f7251z.F(this.f7241J);
        this.f7251z.I(2);
        this.f7251z.H(n());
        this.f7251z.b();
        ListView j8 = this.f7251z.j();
        j8.setOnKeyListener(this);
        if (this.f7243L && this.f7245t.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f7244s).inflate(AbstractC5758g.f35520l, (ViewGroup) j8, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f7245t.x());
            }
            frameLayout.setEnabled(false);
            j8.addHeaderView(frameLayout, null, false);
        }
        this.f7251z.p(this.f7246u);
        this.f7251z.b();
        return true;
    }

    @Override // k.e
    public boolean a() {
        return !this.f7239H && this.f7251z.a();
    }

    @Override // k.e
    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z7) {
        if (eVar != this.f7245t) {
            return;
        }
        dismiss();
        j.a aVar = this.f7237F;
        if (aVar != null) {
            aVar.c(eVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        this.f7240I = false;
        d dVar = this.f7246u;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // k.e
    public void dismiss() {
        if (a()) {
            this.f7251z.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f7237F = aVar;
    }

    @Override // k.e
    public ListView j() {
        return this.f7251z.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f7244s, mVar, this.f7236E, this.f7247v, this.f7249x, this.f7250y);
            iVar.j(this.f7237F);
            iVar.g(h.x(mVar));
            iVar.i(this.f7234C);
            this.f7234C = null;
            this.f7245t.e(false);
            int d8 = this.f7251z.d();
            int o8 = this.f7251z.o();
            if ((Gravity.getAbsoluteGravity(this.f7242K, this.f7235D.getLayoutDirection()) & 7) == 5) {
                d8 += this.f7235D.getWidth();
            }
            if (iVar.n(d8, o8)) {
                j.a aVar = this.f7237F;
                if (aVar == null) {
                    return true;
                }
                aVar.d(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f7239H = true;
        this.f7245t.close();
        ViewTreeObserver viewTreeObserver = this.f7238G;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f7238G = this.f7236E.getViewTreeObserver();
            }
            this.f7238G.removeGlobalOnLayoutListener(this.f7232A);
            this.f7238G = null;
        }
        this.f7236E.removeOnAttachStateChangeListener(this.f7233B);
        PopupWindow.OnDismissListener onDismissListener = this.f7234C;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i8 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f7235D = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z7) {
        this.f7246u.d(z7);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i8) {
        this.f7242K = i8;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i8) {
        this.f7251z.f(i8);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f7234C = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z7) {
        this.f7243L = z7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i8) {
        this.f7251z.l(i8);
    }
}
