package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.U;
import androidx.appcompat.widget.V;
import f.AbstractC5755d;
import f.AbstractC5758g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z0.AbstractC7048s;

/* loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: S, reason: collision with root package name */
    private static final int f7100S = AbstractC5758g.f35513e;

    /* renamed from: F, reason: collision with root package name */
    private View f7106F;

    /* renamed from: G, reason: collision with root package name */
    View f7107G;

    /* renamed from: I, reason: collision with root package name */
    private boolean f7109I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f7110J;

    /* renamed from: K, reason: collision with root package name */
    private int f7111K;

    /* renamed from: L, reason: collision with root package name */
    private int f7112L;

    /* renamed from: N, reason: collision with root package name */
    private boolean f7114N;

    /* renamed from: O, reason: collision with root package name */
    private j.a f7115O;

    /* renamed from: P, reason: collision with root package name */
    ViewTreeObserver f7116P;

    /* renamed from: Q, reason: collision with root package name */
    private PopupWindow.OnDismissListener f7117Q;

    /* renamed from: R, reason: collision with root package name */
    boolean f7118R;

    /* renamed from: s, reason: collision with root package name */
    private final Context f7119s;

    /* renamed from: t, reason: collision with root package name */
    private final int f7120t;

    /* renamed from: u, reason: collision with root package name */
    private final int f7121u;

    /* renamed from: v, reason: collision with root package name */
    private final int f7122v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f7123w;

    /* renamed from: x, reason: collision with root package name */
    final Handler f7124x;

    /* renamed from: y, reason: collision with root package name */
    private final List f7125y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    final List f7126z = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f7101A = new a();

    /* renamed from: B, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f7102B = new ViewOnAttachStateChangeListenerC0135b();

    /* renamed from: C, reason: collision with root package name */
    private final U f7103C = new c();

    /* renamed from: D, reason: collision with root package name */
    private int f7104D = 0;

    /* renamed from: E, reason: collision with root package name */
    private int f7105E = 0;

    /* renamed from: M, reason: collision with root package name */
    private boolean f7113M = false;

    /* renamed from: H, reason: collision with root package name */
    private int f7108H = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f7126z.size() <= 0 || ((d) b.this.f7126z.get(0)).f7134a.B()) {
                return;
            }
            View view = b.this.f7107G;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f7126z.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f7134a.b();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0135b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0135b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f7116P;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f7116P = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f7116P.removeGlobalOnLayoutListener(bVar.f7101A);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements U {

        class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f7130o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ MenuItem f7131s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ e f7132t;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f7130o = dVar;
                this.f7131s = menuItem;
                this.f7132t = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f7130o;
                if (dVar != null) {
                    b.this.f7118R = true;
                    dVar.f7135b.e(false);
                    b.this.f7118R = false;
                }
                if (this.f7131s.isEnabled() && this.f7131s.hasSubMenu()) {
                    this.f7132t.M(this.f7131s, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.U
        public void e(e eVar, MenuItem menuItem) {
            b.this.f7124x.removeCallbacksAndMessages(null);
            int size = b.this.f7126z.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                } else if (eVar == ((d) b.this.f7126z.get(i8)).f7135b) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 == -1) {
                return;
            }
            int i9 = i8 + 1;
            b.this.f7124x.postAtTime(new a(i9 < b.this.f7126z.size() ? (d) b.this.f7126z.get(i9) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.U
        public void h(e eVar, MenuItem menuItem) {
            b.this.f7124x.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final V f7134a;

        /* renamed from: b, reason: collision with root package name */
        public final e f7135b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7136c;

        public d(V v7, e eVar, int i8) {
            this.f7134a = v7;
            this.f7135b = eVar;
            this.f7136c = i8;
        }

        public ListView a() {
            return this.f7134a.j();
        }
    }

    public b(Context context, View view, int i8, int i9, boolean z7) {
        this.f7119s = context;
        this.f7106F = view;
        this.f7121u = i8;
        this.f7122v = i9;
        this.f7123w = z7;
        Resources resources = context.getResources();
        this.f7120t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC5755d.f35410b));
        this.f7124x = new Handler();
    }

    private int A(e eVar) {
        int size = this.f7126z.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (eVar == ((d) this.f7126z.get(i8)).f7135b) {
                return i8;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = eVar.getItem(i8);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i8;
        int firstVisiblePosition;
        MenuItem B7 = B(dVar.f7135b, eVar);
        if (B7 == null) {
            return null;
        }
        ListView a8 = dVar.a();
        ListAdapter adapter = a8.getAdapter();
        int i9 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i8 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i8 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i9 >= count) {
                i9 = -1;
                break;
            }
            if (B7 == dVar2.getItem(i9)) {
                break;
            }
            i9++;
        }
        if (i9 != -1 && (firstVisiblePosition = (i9 + i8) - a8.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a8.getChildCount()) {
            return a8.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return this.f7106F.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int E(int i8) {
        List list = this.f7126z;
        ListView a8 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a8.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f7107G.getWindowVisibleDisplayFrame(rect);
        return this.f7108H == 1 ? (iArr[0] + a8.getWidth()) + i8 > rect.right ? 0 : 1 : iArr[0] - i8 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View view;
        int i8;
        int i9;
        int i10;
        LayoutInflater from = LayoutInflater.from(this.f7119s);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f7123w, f7100S);
        if (!a() && this.f7113M) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.x(eVar));
        }
        int o8 = h.o(dVar2, null, this.f7119s, this.f7120t);
        V z7 = z();
        z7.p(dVar2);
        z7.F(o8);
        z7.G(this.f7105E);
        if (this.f7126z.size() > 0) {
            List list = this.f7126z;
            dVar = (d) list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z7.V(false);
            z7.S(null);
            int E7 = E(o8);
            boolean z8 = E7 == 1;
            this.f7108H = E7;
            if (Build.VERSION.SDK_INT >= 26) {
                z7.D(view);
                i9 = 0;
                i8 = 0;
            } else {
                int[] iArr = new int[2];
                this.f7106F.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f7105E & 7) == 5) {
                    iArr[0] = iArr[0] + this.f7106F.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i8 = iArr2[0] - iArr[0];
                i9 = iArr2[1] - iArr[1];
            }
            if ((this.f7105E & 5) == 5) {
                if (!z8) {
                    o8 = view.getWidth();
                    i10 = i8 - o8;
                }
                i10 = i8 + o8;
            } else {
                if (z8) {
                    o8 = view.getWidth();
                    i10 = i8 + o8;
                }
                i10 = i8 - o8;
            }
            z7.f(i10);
            z7.N(true);
            z7.l(i9);
        } else {
            if (this.f7109I) {
                z7.f(this.f7111K);
            }
            if (this.f7110J) {
                z7.l(this.f7112L);
            }
            z7.H(n());
        }
        this.f7126z.add(new d(z7, eVar, this.f7108H));
        z7.b();
        ListView j8 = z7.j();
        j8.setOnKeyListener(this);
        if (dVar == null && this.f7114N && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(AbstractC5758g.f35520l, (ViewGroup) j8, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            j8.addHeaderView(frameLayout, null, false);
            z7.b();
        }
    }

    private V z() {
        V v7 = new V(this.f7119s, null, this.f7121u, this.f7122v);
        v7.U(this.f7103C);
        v7.L(this);
        v7.K(this);
        v7.D(this.f7106F);
        v7.G(this.f7105E);
        v7.J(true);
        v7.I(2);
        return v7;
    }

    @Override // k.e
    public boolean a() {
        return this.f7126z.size() > 0 && ((d) this.f7126z.get(0)).f7134a.a();
    }

    @Override // k.e
    public void b() {
        if (a()) {
            return;
        }
        Iterator it = this.f7125y.iterator();
        while (it.hasNext()) {
            F((e) it.next());
        }
        this.f7125y.clear();
        View view = this.f7106F;
        this.f7107G = view;
        if (view != null) {
            boolean z7 = this.f7116P == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f7116P = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f7101A);
            }
            this.f7107G.addOnAttachStateChangeListener(this.f7102B);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z7) {
        int A7 = A(eVar);
        if (A7 < 0) {
            return;
        }
        int i8 = A7 + 1;
        if (i8 < this.f7126z.size()) {
            ((d) this.f7126z.get(i8)).f7135b.e(false);
        }
        d dVar = (d) this.f7126z.remove(A7);
        dVar.f7135b.P(this);
        if (this.f7118R) {
            dVar.f7134a.T(null);
            dVar.f7134a.E(0);
        }
        dVar.f7134a.dismiss();
        int size = this.f7126z.size();
        if (size > 0) {
            this.f7108H = ((d) this.f7126z.get(size - 1)).f7136c;
        } else {
            this.f7108H = D();
        }
        if (size != 0) {
            if (z7) {
                ((d) this.f7126z.get(0)).f7135b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f7115O;
        if (aVar != null) {
            aVar.c(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f7116P;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f7116P.removeGlobalOnLayoutListener(this.f7101A);
            }
            this.f7116P = null;
        }
        this.f7107G.removeOnAttachStateChangeListener(this.f7102B);
        this.f7117Q.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        Iterator it = this.f7126z.iterator();
        while (it.hasNext()) {
            h.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // k.e
    public void dismiss() {
        int size = this.f7126z.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f7126z.toArray(new d[size]);
            for (int i8 = size - 1; i8 >= 0; i8--) {
                d dVar = dVarArr[i8];
                if (dVar.f7134a.a()) {
                    dVar.f7134a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f7115O = aVar;
    }

    @Override // k.e
    public ListView j() {
        if (this.f7126z.isEmpty()) {
            return null;
        }
        return ((d) this.f7126z.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        for (d dVar : this.f7126z) {
            if (mVar == dVar.f7135b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f7115O;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f7119s);
        if (a()) {
            F(eVar);
        } else {
            this.f7125y.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f7126z.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f7126z.get(i8);
            if (!dVar.f7134a.a()) {
                break;
            } else {
                i8++;
            }
        }
        if (dVar != null) {
            dVar.f7135b.e(false);
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
        if (this.f7106F != view) {
            this.f7106F = view;
            this.f7105E = AbstractC7048s.b(this.f7104D, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z7) {
        this.f7113M = z7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i8) {
        if (this.f7104D != i8) {
            this.f7104D = i8;
            this.f7105E = AbstractC7048s.b(i8, this.f7106F.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i8) {
        this.f7109I = true;
        this.f7111K = i8;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f7117Q = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z7) {
        this.f7114N = z7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i8) {
        this.f7110J = true;
        this.f7112L = i8;
    }
}
