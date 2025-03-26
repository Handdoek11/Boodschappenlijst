package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import f.AbstractC5752a;
import f.AbstractC5757f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import z0.AbstractC7030i0;
import z0.C7026g0;
import z0.InterfaceC7028h0;
import z0.InterfaceC7032j0;
import z0.X;

/* loaded from: classes.dex */
public class I extends AbstractC0832a implements ActionBarOverlayLayout.d {

    /* renamed from: D, reason: collision with root package name */
    private static final Interpolator f6808D = new AccelerateInterpolator();

    /* renamed from: E, reason: collision with root package name */
    private static final Interpolator f6809E = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f6813a;

    /* renamed from: b, reason: collision with root package name */
    private Context f6814b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f6815c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f6816d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f6817e;

    /* renamed from: f, reason: collision with root package name */
    J f6818f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f6819g;

    /* renamed from: h, reason: collision with root package name */
    View f6820h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6823k;

    /* renamed from: l, reason: collision with root package name */
    d f6824l;

    /* renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f6825m;

    /* renamed from: n, reason: collision with root package name */
    b.a f6826n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6827o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6829q;

    /* renamed from: t, reason: collision with root package name */
    boolean f6832t;

    /* renamed from: u, reason: collision with root package name */
    boolean f6833u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6834v;

    /* renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f6836x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6837y;

    /* renamed from: z, reason: collision with root package name */
    boolean f6838z;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f6821i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f6822j = -1;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f6828p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private int f6830r = 0;

    /* renamed from: s, reason: collision with root package name */
    boolean f6831s = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6835w = true;

    /* renamed from: A, reason: collision with root package name */
    final InterfaceC7028h0 f6810A = new a();

    /* renamed from: B, reason: collision with root package name */
    final InterfaceC7028h0 f6811B = new b();

    /* renamed from: C, reason: collision with root package name */
    final InterfaceC7032j0 f6812C = new c();

    class a extends AbstractC7030i0 {
        a() {
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            View view2;
            I i8 = I.this;
            if (i8.f6831s && (view2 = i8.f6820h) != null) {
                view2.setTranslationY(0.0f);
                I.this.f6817e.setTranslationY(0.0f);
            }
            I.this.f6817e.setVisibility(8);
            I.this.f6817e.setTransitioning(false);
            I i9 = I.this;
            i9.f6836x = null;
            i9.E();
            ActionBarOverlayLayout actionBarOverlayLayout = I.this.f6816d;
            if (actionBarOverlayLayout != null) {
                X.k0(actionBarOverlayLayout);
            }
        }
    }

    class b extends AbstractC7030i0 {
        b() {
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            I i8 = I.this;
            i8.f6836x = null;
            i8.f6817e.requestLayout();
        }
    }

    class c implements InterfaceC7032j0 {
        c() {
        }

        @Override // z0.InterfaceC7032j0
        public void d(View view) {
            ((View) I.this.f6817e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements e.a {

        /* renamed from: t, reason: collision with root package name */
        private final Context f6842t;

        /* renamed from: u, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f6843u;

        /* renamed from: v, reason: collision with root package name */
        private b.a f6844v;

        /* renamed from: w, reason: collision with root package name */
        private WeakReference f6845w;

        public d(Context context, b.a aVar) {
            this.f6842t = context;
            this.f6844v = aVar;
            androidx.appcompat.view.menu.e T7 = new androidx.appcompat.view.menu.e(context).T(1);
            this.f6843u = T7;
            T7.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f6844v;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f6844v == null) {
                return;
            }
            k();
            I.this.f6819g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            I i8 = I.this;
            if (i8.f6824l != this) {
                return;
            }
            if (I.D(i8.f6832t, i8.f6833u, false)) {
                this.f6844v.a(this);
            } else {
                I i9 = I.this;
                i9.f6825m = this;
                i9.f6826n = this.f6844v;
            }
            this.f6844v = null;
            I.this.C(false);
            I.this.f6819g.g();
            I i10 = I.this;
            i10.f6816d.setHideOnContentScrollEnabled(i10.f6838z);
            I.this.f6824l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f6845w;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f6843u;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f6842t);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return I.this.f6819g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return I.this.f6819g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (I.this.f6824l != this) {
                return;
            }
            this.f6843u.e0();
            try {
                this.f6844v.c(this, this.f6843u);
            } finally {
                this.f6843u.d0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return I.this.f6819g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            I.this.f6819g.setCustomView(view);
            this.f6845w = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i8) {
            o(I.this.f6813a.getResources().getString(i8));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            I.this.f6819g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i8) {
            r(I.this.f6813a.getResources().getString(i8));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            I.this.f6819g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z7) {
            super.s(z7);
            I.this.f6819g.setTitleOptional(z7);
        }

        public boolean t() {
            this.f6843u.e0();
            try {
                return this.f6844v.b(this, this.f6843u);
            } finally {
                this.f6843u.d0();
            }
        }
    }

    public I(Activity activity, boolean z7) {
        this.f6815c = activity;
        View decorView = activity.getWindow().getDecorView();
        K(decorView);
        if (z7) {
            return;
        }
        this.f6820h = decorView.findViewById(R.id.content);
    }

    static boolean D(boolean z7, boolean z8, boolean z9) {
        if (z9) {
            return true;
        }
        return (z7 || z8) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J H(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void J() {
        if (this.f6834v) {
            this.f6834v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f6816d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            S(false);
        }
    }

    private void K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC5757f.f35498p);
        this.f6816d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f6818f = H(view.findViewById(AbstractC5757f.f35483a));
        this.f6819g = (ActionBarContextView) view.findViewById(AbstractC5757f.f35488f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC5757f.f35485c);
        this.f6817e = actionBarContainer;
        J j8 = this.f6818f;
        if (j8 == null || this.f6819g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f6813a = j8.getContext();
        boolean z7 = (this.f6818f.u() & 4) != 0;
        if (z7) {
            this.f6823k = true;
        }
        androidx.appcompat.view.a b8 = androidx.appcompat.view.a.b(this.f6813a);
        P(b8.a() || z7);
        N(b8.e());
        TypedArray obtainStyledAttributes = this.f6813a.obtainStyledAttributes(null, f.j.f35669a, AbstractC5752a.f35376c, 0);
        if (obtainStyledAttributes.getBoolean(f.j.f35719k, false)) {
            O(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(f.j.f35709i, 0);
        if (dimensionPixelSize != 0) {
            M(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void N(boolean z7) {
        this.f6829q = z7;
        if (z7) {
            this.f6817e.setTabContainer(null);
            this.f6818f.i(null);
        } else {
            this.f6818f.i(null);
            this.f6817e.setTabContainer(null);
        }
        boolean z8 = false;
        boolean z9 = I() == 2;
        this.f6818f.y(!this.f6829q && z9);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6816d;
        if (!this.f6829q && z9) {
            z8 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z8);
    }

    private boolean Q() {
        return this.f6817e.isLaidOut();
    }

    private void R() {
        if (this.f6834v) {
            return;
        }
        this.f6834v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6816d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        S(false);
    }

    private void S(boolean z7) {
        if (D(this.f6832t, this.f6833u, this.f6834v)) {
            if (this.f6835w) {
                return;
            }
            this.f6835w = true;
            G(z7);
            return;
        }
        if (this.f6835w) {
            this.f6835w = false;
            F(z7);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void A(CharSequence charSequence) {
        this.f6818f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public androidx.appcompat.view.b B(b.a aVar) {
        d dVar = this.f6824l;
        if (dVar != null) {
            dVar.c();
        }
        this.f6816d.setHideOnContentScrollEnabled(false);
        this.f6819g.k();
        d dVar2 = new d(this.f6819g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f6824l = dVar2;
        dVar2.k();
        this.f6819g.h(dVar2);
        C(true);
        return dVar2;
    }

    public void C(boolean z7) {
        C7026g0 p8;
        C7026g0 f8;
        if (z7) {
            R();
        } else {
            J();
        }
        if (!Q()) {
            if (z7) {
                this.f6818f.r(4);
                this.f6819g.setVisibility(0);
                return;
            } else {
                this.f6818f.r(0);
                this.f6819g.setVisibility(8);
                return;
            }
        }
        if (z7) {
            f8 = this.f6818f.p(4, 100L);
            p8 = this.f6819g.f(0, 200L);
        } else {
            p8 = this.f6818f.p(0, 200L);
            f8 = this.f6819g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(f8, p8);
        hVar.h();
    }

    void E() {
        b.a aVar = this.f6826n;
        if (aVar != null) {
            aVar.a(this.f6825m);
            this.f6825m = null;
            this.f6826n = null;
        }
    }

    public void F(boolean z7) {
        View view;
        androidx.appcompat.view.h hVar = this.f6836x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f6830r != 0 || (!this.f6837y && !z7)) {
            this.f6810A.b(null);
            return;
        }
        this.f6817e.setAlpha(1.0f);
        this.f6817e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f8 = -this.f6817e.getHeight();
        if (z7) {
            this.f6817e.getLocationInWindow(new int[]{0, 0});
            f8 -= r5[1];
        }
        C7026g0 q8 = X.e(this.f6817e).q(f8);
        q8.n(this.f6812C);
        hVar2.c(q8);
        if (this.f6831s && (view = this.f6820h) != null) {
            hVar2.c(X.e(view).q(f8));
        }
        hVar2.f(f6808D);
        hVar2.e(250L);
        hVar2.g(this.f6810A);
        this.f6836x = hVar2;
        hVar2.h();
    }

    public void G(boolean z7) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f6836x;
        if (hVar != null) {
            hVar.a();
        }
        this.f6817e.setVisibility(0);
        if (this.f6830r == 0 && (this.f6837y || z7)) {
            this.f6817e.setTranslationY(0.0f);
            float f8 = -this.f6817e.getHeight();
            if (z7) {
                this.f6817e.getLocationInWindow(new int[]{0, 0});
                f8 -= r5[1];
            }
            this.f6817e.setTranslationY(f8);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C7026g0 q8 = X.e(this.f6817e).q(0.0f);
            q8.n(this.f6812C);
            hVar2.c(q8);
            if (this.f6831s && (view2 = this.f6820h) != null) {
                view2.setTranslationY(f8);
                hVar2.c(X.e(this.f6820h).q(0.0f));
            }
            hVar2.f(f6809E);
            hVar2.e(250L);
            hVar2.g(this.f6811B);
            this.f6836x = hVar2;
            hVar2.h();
        } else {
            this.f6817e.setAlpha(1.0f);
            this.f6817e.setTranslationY(0.0f);
            if (this.f6831s && (view = this.f6820h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f6811B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6816d;
        if (actionBarOverlayLayout != null) {
            X.k0(actionBarOverlayLayout);
        }
    }

    public int I() {
        return this.f6818f.o();
    }

    public void L(int i8, int i9) {
        int u7 = this.f6818f.u();
        if ((i9 & 4) != 0) {
            this.f6823k = true;
        }
        this.f6818f.k((i8 & i9) | ((~i9) & u7));
    }

    public void M(float f8) {
        X.u0(this.f6817e, f8);
    }

    public void O(boolean z7) {
        if (z7 && !this.f6816d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f6838z = z7;
        this.f6816d.setHideOnContentScrollEnabled(z7);
    }

    public void P(boolean z7) {
        this.f6818f.t(z7);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f6833u) {
            this.f6833u = false;
            S(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z7) {
        this.f6831s = z7;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f6833u) {
            return;
        }
        this.f6833u = true;
        S(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f6836x;
        if (hVar != null) {
            hVar.a();
            this.f6836x = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public boolean g() {
        J j8 = this.f6818f;
        if (j8 == null || !j8.j()) {
            return false;
        }
        this.f6818f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void h(boolean z7) {
        if (z7 == this.f6827o) {
            return;
        }
        this.f6827o = z7;
        if (this.f6828p.size() <= 0) {
            return;
        }
        E.a(this.f6828p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public int i() {
        return this.f6818f.u();
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public Context j() {
        if (this.f6814b == null) {
            TypedValue typedValue = new TypedValue();
            this.f6813a.getTheme().resolveAttribute(AbstractC5752a.f35378e, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                this.f6814b = new ContextThemeWrapper(this.f6813a, i8);
            } else {
                this.f6814b = this.f6813a;
            }
        }
        return this.f6814b;
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void l(Configuration configuration) {
        N(androidx.appcompat.view.a.b(this.f6813a).e());
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public boolean n(int i8, KeyEvent keyEvent) {
        Menu e8;
        d dVar = this.f6824l;
        if (dVar == null || (e8 = dVar.e()) == null) {
            return false;
        }
        e8.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e8.performShortcut(i8, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i8) {
        this.f6830r = i8;
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void q(View view) {
        this.f6818f.v(view);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void r(boolean z7) {
        if (this.f6823k) {
            return;
        }
        s(z7);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void s(boolean z7) {
        L(z7 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void t(int i8) {
        if ((i8 & 4) != 0) {
            this.f6823k = true;
        }
        this.f6818f.k(i8);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void u(int i8) {
        this.f6818f.setIcon(i8);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void v(boolean z7) {
        androidx.appcompat.view.h hVar;
        this.f6837y = z7;
        if (z7 || (hVar = this.f6836x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void w(int i8) {
        x(this.f6813a.getString(i8));
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void x(CharSequence charSequence) {
        this.f6818f.l(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void y(int i8) {
        z(this.f6813a.getString(i8));
    }

    @Override // androidx.appcompat.app.AbstractC0832a
    public void z(CharSequence charSequence) {
        this.f6818f.setTitle(charSequence);
    }

    public I(Dialog dialog) {
        K(dialog.getWindow().getDecorView());
    }
}
