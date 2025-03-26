package com.headcode.ourgroceries.android;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.lifecycle.AbstractC0922h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.C5536e3;
import com.headcode.ourgroceries.android.C5688z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o5.C6308q;
import p5.C6395a;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public final class ShoppingListActivity extends Q0 implements C6308q.a {

    /* renamed from: a0, reason: collision with root package name */
    private int f34425a0;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f34423Y = false;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f34424Z = false;

    /* renamed from: b0, reason: collision with root package name */
    private Snackbar f34426b0 = null;

    /* renamed from: c0, reason: collision with root package name */
    private String f34427c0 = null;

    class a extends BaseTransientBottomBar.q {
        a() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i8) {
            super.a(snackbar, i8);
            if (snackbar == ShoppingListActivity.this.f34426b0) {
                ShoppingListActivity.this.f34426b0 = null;
            }
        }
    }

    class b extends BaseTransientBottomBar.q {
        b() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i8) {
            super.a(snackbar, i8);
            if (snackbar == ShoppingListActivity.this.f34426b0) {
                ShoppingListActivity.this.f34426b0 = null;
            }
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34430a;

        static {
            int[] iArr = new int[A2.e.values().length];
            f34430a = iArr;
            try {
                iArr[A2.e.SHORT_PRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34430a[A2.e.LONG_PRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34430a[A2.e.SWIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private final class d implements b.a {
        private d() {
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            ShoppingListActivity.this.f34332R.F0(false);
            ShoppingListActivity.this.f34334T.c();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return true;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            return false;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return true;
        }

        /* synthetic */ d(ShoppingListActivity shoppingListActivity, a aVar) {
            this();
        }
    }

    private void f2() {
        try {
            C6308q.w2().r2(getSupportFragmentManager(), "unused");
        } catch (IllegalStateException e8) {
            AbstractC6635a.f("OG-SListActivity", "Got exception showing dialog box: " + e8);
        }
    }

    private void g2(Z0 z02) {
        if (this.f34330P != null) {
            final String w7 = z02.w();
            final boolean P7 = z02.P();
            boolean z7 = P7 && Y1(z02);
            J1(w7);
            AbstractC5673x.a(z7 ? "undoCrossOffItem" : P7 ? "uncrossOffItem" : "crossOffItem");
            Z0 u7 = V0().u(this.f34330P, z02, !P7);
            A2 a22 = A2.f33140n0;
            if (u7.P()) {
                m5.D.k(Z0(), this.f34330P, u7.E());
            } else {
                m5.D.j(Z0(), this.f34330P, u7.E());
            }
            if (!u7.P()) {
                u7 = I0(this.f34330P, u7);
            }
            final String E7 = u7.E();
            P0().l(E7);
            if (!a22.G().c() || a22.m()) {
                Snackbar snackbar = (Snackbar) Snackbar.o0(this.f34333S, getString(P7 ? M2.f34132m3 : M2.f33963R2, E7), 0).q0(M2.f33954Q1, new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.u3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f35045o.l2(w7, P7, E7, view);
                    }
                }).s(new b());
                this.f34426b0 = snackbar;
                snackbar.Y();
            }
            if (P7) {
                return;
            }
            T0().postDelayed(new Runnable() { // from class: com.headcode.ourgroceries.android.v3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35057o.m2();
                }
            }, 250L);
        }
    }

    public static boolean h2(String str) {
        A2 a22 = A2.f33140n0;
        return str.equals(a22.H()) || str.equals(a22.J()) || str.equals(a22.n());
    }

    private void i2() {
        if (this.f34424Z) {
            P(null);
        }
    }

    private void j2() {
        Snackbar snackbar = this.f34426b0;
        if (snackbar != null) {
            snackbar.y();
            this.f34426b0 = null;
        }
    }

    private int k2() {
        int i8 = -1;
        for (int i9 = 0; i9 < this.f34332R.E(); i9++) {
            Object n02 = this.f34332R.n0(i9);
            if (n02 instanceof Z0) {
                if (((Z0) n02).P()) {
                    break;
                }
                i8 = i9;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l2(String str, boolean z7, String str2, View view) {
        Z0 J7 = this.f34330P.J(str);
        if (J7 != null) {
            J1(str);
            Z0 u7 = V0().u(this.f34330P, J7, z7);
            if (u7.P()) {
                m5.D.k(Z0(), this.f34330P, u7.E());
            } else {
                m5.D.j(Z0(), this.f34330P, u7.E());
            }
            Snackbar.o0(this.f34333S, getString(z7 ? M2.f33963R2 : M2.f34132m3, str2), 0).Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2() {
        int k22;
        if (this.f34333S == null || (k22 = k2()) == -1) {
            return;
        }
        RecyclerView.p layoutManager = this.f34333S.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || k22 > ((LinearLayoutManager) layoutManager).d2()) {
            return;
        }
        this.f34333S.B1(0, -P1.i(50), null, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n2(List list, View view) {
        V0().R0(this.f34330P, list);
        Snackbar.n0(this.f34333S, M2.f34140n3, 0).Y();
        AbstractC5673x.a("delAllUndo");
    }

    private void o2(C6395a c6395a, int i8, int i9) {
        if (i9 >= i8) {
            i9++;
        }
        AbstractC6635a.d("OG-SListActivity", "onItemMove from " + i8 + " to " + i9);
        p5.d f8 = c6395a.f(i8);
        if (f8 == null) {
            AbstractC6635a.b("OG-SListActivity", "Can't find index path for fromPosition " + i8);
            return;
        }
        p5.d e8 = c6395a.e(i9);
        if (e8 == null) {
            AbstractC6635a.b("OG-SListActivity", "Can't find index path for toPosition " + i9);
            return;
        }
        AbstractC6635a.d("OG-SListActivity", "Moving position " + i8 + "->" + i9 + ", " + f8 + "->" + e8);
        int b8 = f8.b();
        int b9 = e8.b();
        int a8 = f8.a();
        int a9 = e8.a();
        p5.b c8 = c6395a.c(b9);
        if (!c8.f()) {
            AbstractC6635a.b("OG-SListActivity", "Can't move an item to a section that's not a target");
            return;
        }
        ArrayList arrayList = new ArrayList(c6395a.j(b8));
        ArrayList arrayList2 = b9 == b8 ? arrayList : new ArrayList(c6395a.j(b9));
        boolean z7 = A2.f33140n0.I() == C5688z0.d.BY_DRAG_AND_DROP;
        if (b8 != b9 || a8 == a9 || z7) {
            if (!z7) {
                this.f34427c0 = ((Z0) arrayList.get(a8)).w();
            }
            p5.c c9 = c8.c();
            String b10 = c9 == null ? null : c9.b();
            if (Z0.F().w().equals(b10)) {
                b10 = "";
            }
            V0().o0(this.f34330P, b10, arrayList, a8, arrayList2, a9, z7);
            return;
        }
        int i10 = this.f34425a0 + 1;
        this.f34425a0 = i10;
        if (i10 >= 3) {
            try {
                o5.D.v2(getSupportFragmentManager());
            } catch (IllegalStateException e9) {
                AbstractC6635a.f("OG-SListActivity", "Got exception showing dialog box: " + e9);
            }
        }
    }

    private void q2(C5688z0 c5688z0, boolean z7) {
        C5688z0.c G7 = A2.f33140n0.G();
        if (c5688z0 == null || c5688z0.T().equals(this.f34329O) || c5688z0.U() == s5.Q.CATEGORY || (c5688z0.U() == s5.Q.MASTER && G7 == C5688z0.c.BY_FREQUENCY)) {
            C5574j1 V02 = V0();
            C5688z0 x7 = V02.x(this.f34329O);
            if (x7 == null) {
                finish();
                return;
            }
            setTitle(x7.W());
            if (this.f34423Y) {
                this.f34424Z = true;
                return;
            }
            this.f34424Z = false;
            this.f34330P = x7;
            B0 e8 = B0.e(V02.D());
            B0 f8 = B0.f(V02);
            Iterator it = x7.iterator();
            while (it.hasNext()) {
                Z0 z02 = (Z0) it.next();
                if (z02.P()) {
                    f8.a(z02);
                } else {
                    e8.a(z02);
                }
            }
            C6395a c6395a = new C6395a(x7.size());
            Iterator it2 = e8.d().iterator();
            while (true) {
                String str = null;
                if (!it2.hasNext()) {
                    break;
                }
                C5565i0 c5565i0 = (C5565i0) it2.next();
                Z0 z03 = (Z0) c5565i0.a();
                String w7 = z03.w();
                if (c5565i0.g()) {
                    str = z03.E();
                }
                c6395a.l(p5.c.g(w7, str), true);
                c6395a.b(c5565i0.c());
            }
            List<C5565i0> d8 = f8.d();
            if (!d8.isEmpty()) {
                c6395a.l(p5.c.f("crossed_off", getString(M2.f33955Q2)), false);
                for (C5565i0 c5565i02 : d8) {
                    Z0 z04 = (Z0) c5565i02.a();
                    c6395a.l(p5.c.a(z04.w(), c5565i02.g() ? z04.E() : null), false);
                    c6395a.b(c5565i02.c());
                }
                c6395a.a(new p5.g("delete_all_crossed_off_items", getString(M2.f33971S2)));
            }
            if (c6395a.h() == 0) {
                this.f34338X.f39692g.setText(M2.f34044b3);
                this.f34338X.f39693h.setVisibility(8);
                this.f34338X.f39691f.setVisibility(0);
            } else {
                this.f34338X.f39693h.setVisibility(0);
                this.f34338X.f39691f.setVisibility(8);
            }
            this.f34332R.G0(c6395a, z7 && !this.f34332R.o0());
            V1();
        }
    }

    private void r2() {
        this.f34332R.F0(true);
        androidx.appcompat.view.b startSupportActionMode = startSupportActionMode(new d(this, null));
        if (startSupportActionMode != null) {
            startSupportActionMode.q(M2.f34076f3);
            startSupportActionMode.n(M2.f34068e3);
        }
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.C5536e3.d
    public boolean E(Object obj) {
        if (this.f34332R.o0()) {
            return true;
        }
        if (obj instanceof Z0) {
            Z0 J7 = this.f34330P.J(((Z0) obj).w());
            if (J7 != null && c.f34430a[A2.f33140n0.i().ordinal()] == 2) {
                g2(J7);
            }
            return true;
        }
        if (!(obj instanceof p5.g)) {
            return false;
        }
        String a8 = ((p5.g) obj).a();
        a8.hashCode();
        if (!a8.equals("delete_all_crossed_off_items")) {
            throw new AssertionError();
        }
        f2();
        return true;
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.C5536e3.d
    public void H() {
        this.f34423Y = true;
        this.f34427c0 = null;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void K(C5536e3.g gVar, Object obj) {
        if (getLifecycle().b() != AbstractC0922h.b.RESUMED) {
            AbstractC6635a.b("OG-SListActivity", "Ignoring tap because lifecycle state is " + getLifecycle().b());
            return;
        }
        if (this.f34332R.o0()) {
            return;
        }
        if (obj instanceof Z0) {
            Z0 J7 = this.f34330P.J(((Z0) obj).w());
            if (J7 != null) {
                int i8 = c.f34430a[A2.f33140n0.i().ordinal()];
                if (i8 == 1) {
                    g2(J7);
                    return;
                } else if (i8 == 2) {
                    V1.d(this.f34333S, J7.P() ? M2.f34027Z2 : M2.f34011X2, false);
                    return;
                } else {
                    if (i8 != 3) {
                        return;
                    }
                    V1.d(this.f34333S, J7.P() ? M2.f34116k3 : M2.f34108j3, false);
                    return;
                }
            }
            return;
        }
        if (!(obj instanceof p5.g)) {
            if (!(obj instanceof p5.c)) {
                throw new AssertionError();
            }
            return;
        }
        String a8 = ((p5.g) obj).a();
        a8.hashCode();
        if (!a8.equals("delete_all_crossed_off_items")) {
            throw new AssertionError();
        }
        int i9 = c.f34430a[A2.f33140n0.i().ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                V1.e(this.f34333S, getString(M2.f34019Y2), true);
                return;
            } else if (i9 != 3) {
                return;
            }
        }
        f2();
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.C5536e3.d
    public void L() {
        this.f34423Y = false;
        i2();
        String str = this.f34427c0;
        if (str != null) {
            S1(str);
            this.f34427c0 = null;
        }
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.C5536e3.d
    public C5536e3.d.a M() {
        return this.f34332R.o0() ? C5536e3.d.a.NONE : c.f34430a[A2.f33140n0.i().ordinal()] != 3 ? C5536e3.d.a.NONE : C5536e3.d.a.CROSS_OFF;
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.C5536e3.d
    public void O(C6395a c6395a, int i8) {
        if (i8 < 0) {
            return;
        }
        Object g8 = c6395a.g(i8);
        if (!(g8 instanceof Z0)) {
            throw new AssertionError();
        }
        g2((Z0) g8);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, com.headcode.ourgroceries.android.C5574j1.d
    public void P(C5688z0 c5688z0) {
        q2(c5688z0, true);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected m5.p Q0() {
        return m5.p.SHOPPING_LIST;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected void k1(CharSequence charSequence, C5688z0 c5688z0, List list) {
        if (list.isEmpty()) {
            return;
        }
        S1(((Z0) list.get(0)).w());
        V1.e(this.f34338X.f39699n, charSequence, true);
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34425a0 = 0;
        P(null);
        C5688z0 c5688z0 = this.f34330P;
        if (c5688z0 != null) {
            Shortcuts.k(this, c5688z0);
        }
        if (bundle == null || !bundle.getBoolean("com.headcode.ourgroceries.android.ShoppingListActivity.EditMode", false)) {
            return;
        }
        r2();
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.AbstractActivityC5575j2, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() != H2.f33551W0) {
            return false;
        }
        r2();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        getMenuInflater().inflate(K2.f33730d, menu);
        P1.g(this, menu);
        X1(menu);
        return true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.headcode.ourgroceries.android.ShoppingListActivity.EditMode", this.f34332R.o0());
    }

    @Override // com.headcode.ourgroceries.android.Q0, android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        super.onSharedPreferenceChanged(sharedPreferences, str);
        if (h2(str)) {
            q2(null, false);
        }
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.C5536e3.d
    public void t(C6395a c6395a, int i8, int i9) {
        if (!this.f34423Y) {
            AbstractC6635a.b("OG-SListActivity", "m_ignoreListChangeNotifications should be true in onItemMove()");
        }
        o2(c6395a, i8, i9);
    }

    @Override // o5.C6308q.a
    public void u() {
        if (this.f34330P == null || this.f34333S == null) {
            return;
        }
        j2();
        final List t02 = V0().t0(this.f34330P);
        m5.D.m(Z0(), this.f34330P, t02);
        Snackbar snackbar = (Snackbar) Snackbar.n0(this.f34333S, M2.f33979T2, 0).q0(M2.f33954Q1, new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.w3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35097o.n2(t02, view);
            }
        }).s(new a());
        this.f34426b0 = snackbar;
        snackbar.Y();
    }
}
