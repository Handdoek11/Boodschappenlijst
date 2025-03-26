package com.headcode.ourgroceries.android;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.AbstractC0922h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.C5536e3;
import com.headcode.ourgroceries.android.C5536e3.f;
import com.headcode.ourgroceries.android.C5587k6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n5.C6262l;
import o5.C6291A;
import o5.L;
import p5.C6395a;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public final class ListsActivity extends AbstractActivityC5575j2 implements C5536e3.d, L.b, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: O, reason: collision with root package name */
    private C6262l f33800O;

    /* renamed from: P, reason: collision with root package name */
    private RecyclerView f33801P;

    /* renamed from: Q, reason: collision with root package name */
    private C5536e3 f33802Q = null;

    /* renamed from: R, reason: collision with root package name */
    private MenuItem f33803R = null;

    /* renamed from: S, reason: collision with root package name */
    private final ArrayList f33804S = new ArrayList(10);

    /* renamed from: T, reason: collision with root package name */
    private final ArrayList f33805T = new ArrayList(10);

    /* renamed from: U, reason: collision with root package name */
    private String f33806U = "";

    /* renamed from: V, reason: collision with root package name */
    private boolean f33807V = false;

    /* renamed from: W, reason: collision with root package name */
    private boolean f33808W = false;

    /* renamed from: X, reason: collision with root package name */
    private boolean f33809X = false;

    class a extends androidx.activity.u {
        a(boolean z7) {
            super(z7);
        }

        @Override // androidx.activity.u
        public void d() {
            ListsActivity.this.X0().w(true);
            ListsActivity.this.finish();
        }
    }

    class b implements SearchView.m {
        b() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            ListsActivity.this.f33806U = str;
            ListsActivity.this.P(null);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            C5688z0 W12 = ListsActivity.this.W1(str);
            boolean z7 = W12 != null;
            AbstractC5673x.c("listSearch", "submit", z7 ? "oneList" : "multipleLists");
            if (z7) {
                ListsActivity.this.U1();
                AbstractC5625q.r(ListsActivity.this, W12.T(), W12.U(), AbstractC5625q.b.VIEW);
            }
            return true;
        }
    }

    class c implements MenuItem.OnActionExpandListener {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            ListsActivity.this.f33803R.setVisible(true);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            AbstractC5673x.c("listSearch", "close", null);
            ListsActivity.this.f33807V = false;
            ListsActivity.this.T0().postDelayed(new Runnable() { // from class: com.headcode.ourgroceries.android.B1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33286o.b();
                }
            }, 0L);
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            AbstractC5673x.c("listSearch", "open", null);
            ListsActivity.this.f33807V = true;
            ListsActivity.this.f33803R.setVisible(false);
            return true;
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33813a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f33814b;

        d(boolean z7, View view) {
            this.f33813a = z7;
            this.f33814b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f33813a) {
                return;
            }
            this.f33814b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f33813a) {
                this.f33814b.setVisibility(0);
            }
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33816a;

        e(boolean z7) {
            this.f33816a = z7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f33816a) {
                return;
            }
            ListsActivity.this.f33800O.f39700o.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f33816a) {
                ListsActivity.this.f33800O.f39700o.setVisibility(0);
            }
        }
    }

    static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33818a;

        static {
            int[] iArr = new int[s5.Q.values().length];
            f33818a = iArr;
            try {
                iArr[s5.Q.SHOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33818a[s5.Q.RECIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33818a[s5.Q.MASTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33818a[s5.Q.CATEGORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void S1(C6395a c6395a, List list, Y y7, String[] strArr, String str, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5688z0 c5688z0 = (C5688z0) it.next();
            if (m2(c5688z0, y7, strArr)) {
                arrayList.add(p5.e.e(c5688z0));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c6395a.l(p5.c.g(str, getString(i8)), false);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c6395a.a((p5.e) it2.next());
        }
    }

    private void T1(m5.j jVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String W7 = ((C5688z0) it.next()).W();
            if (m5.o.b(W7)) {
                jVar.a(W7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1() {
        MenuItem menuItem = this.f33803R;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
    }

    private void V1() {
        this.f33800O.f39688c.setActivated(false);
        s2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C5688z0 W1(String str) {
        ArrayList<C5688z0> J7 = V0().J();
        Y y7 = new Y(str);
        String[] b8 = y7.b(str);
        C5688z0 c5688z0 = null;
        for (C5688z0 c5688z02 : J7) {
            s5.Q U7 = c5688z02.U();
            if (U7 == s5.Q.SHOPPING || U7 == s5.Q.RECIPE) {
                if (!m2(c5688z02, y7, b8)) {
                    continue;
                } else {
                    if (c5688z0 != null) {
                        return null;
                    }
                    c5688z0 = c5688z02;
                }
            }
        }
        return c5688z0;
    }

    private boolean X1(Intent intent) {
        String stringExtra;
        final C5688z0 x7;
        if (intent == null || (stringExtra = intent.getStringExtra("com.headcode.ourgroceries.ListID")) == null || (x7 = V0().x(stringExtra)) == null) {
            return false;
        }
        final AbstractC5625q.b c8 = AbstractC5625q.b.c(intent);
        if (intent.getBooleanExtra("com.headcode.ourgroceries.FromWidget", false)) {
            AbstractC5673x.a("widget" + c8.name());
        }
        if (intent.getBooleanExtra("com.headcode.ourgroceries.FromShortcut", false)) {
            AbstractC5673x.a("shortcut" + c8.name());
        }
        OurApplication.j().post(new Runnable() { // from class: com.headcode.ourgroceries.android.n1
            @Override // java.lang.Runnable
            public final void run() {
                this.f34942o.Y1(x7, c8);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y1(C5688z0 c5688z0, AbstractC5625q.b bVar) {
        AbstractC5625q.p(this, c5688z0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z1(FloatingActionButton floatingActionButton, View view) {
        U1();
        floatingActionButton.setActivated(!floatingActionButton.isActivated());
        s2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a2(View view) {
        V1();
        q2(s5.Q.SHOPPING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2(View view) {
        V1();
        q2(s5.Q.RECIPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c2(View view) {
        V1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d2(p5.e eVar, MenuItem menuItem) {
        C5688z0 x7 = V0().x(eVar.b());
        if (x7 == null) {
            return true;
        }
        x7.l0(this, V0().D());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e2(p5.e eVar, MenuItem menuItem) {
        C5688z0 x7 = V0().x(eVar.b());
        if (x7 == null) {
            return true;
        }
        m1(x7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean f2(p5.e eVar, MenuItem menuItem) {
        o5.L.B2(eVar.b(), eVar.c()).r2(getSupportFragmentManager(), "unused");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean g2(p5.e eVar, MenuItem menuItem) {
        C6291A.v2(eVar.b(), eVar.c(), eVar.d()).r2(getSupportFragmentManager(), "unused");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean h2(p5.e eVar, MenuItem menuItem) {
        t2(eVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i2(p5.e eVar, MenuItem menuItem) {
        AbstractC5625q.f(this, eVar.b(), false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j2(View view, boolean z7) {
        this.f33808W = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k2(SearchView searchView, String str, boolean z7) {
        searchView.d0(str, false);
        if (z7) {
            return;
        }
        searchView.clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l2(View view) {
        U1();
    }

    private static boolean m2(C5688z0 c5688z0, Y y7, String[] strArr) {
        if (strArr.length != 0 && (strArr.length != 1 || !strArr[0].isEmpty())) {
            String[] b8 = y7.b(c5688z0.W());
            for (String str : strArr) {
                if (!Z.b(str, b8)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void n2(C5587k6.e eVar) {
        setTitle(eVar.f() ? M2.f34060d3 : M2.f34124l3);
    }

    private void o2(C5688z0 c5688z0) {
        if (c5688z0 == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f33802Q.E(); i8++) {
            Object n02 = this.f33802Q.n0(i8);
            if ((n02 instanceof p5.e) && ((p5.e) n02).b().equals(c5688z0.T())) {
                this.f33801P.getLayoutManager().B1(i8);
                return;
            }
        }
    }

    private void q2(s5.Q q8) {
        U1();
        try {
            o5.L.A2(q8).r2(getSupportFragmentManager(), "unused");
        } catch (IllegalStateException e8) {
            AbstractC6635a.f("OG-ListsActivity", "Got exception showing dialog box: " + e8);
        }
    }

    private void r2() {
        m5.j jVar = new m5.j("Metalist", Q0());
        if (A2.f33140n0.y()) {
            T1(jVar, this.f33804S);
            T1(jVar, this.f33805T);
        }
        P0().m(jVar);
    }

    private void s2(boolean z7) {
        long j8;
        C6262l c6262l = this.f33800O;
        FloatingActionButton floatingActionButton = c6262l.f39688c;
        int i8 = 0;
        View[] viewArr = {c6262l.f39697l, c6262l.f39695j};
        boolean isActivated = floatingActionButton.isActivated();
        while (true) {
            if (i8 >= 2) {
                break;
            }
            View view = viewArr[i8];
            ViewPropertyAnimator animate = view.animate();
            if (z7) {
                j8 = 0;
            } else {
                j8 = isActivated ? (1 - i8) * 40 : i8 * 40;
            }
            ViewPropertyAnimator translationY = animate.setStartDelay(j8).alpha(isActivated ? 1.0f : 0.0f).translationY(isActivated ? 0.0f : 50.0f);
            if (!z7) {
                r6 = 100;
            }
            translationY.setDuration(r6).setListener(new d(isActivated, view)).start();
            i8++;
        }
        this.f33800O.f39700o.animate().alpha(isActivated ? 0.7f : 0.0f).setDuration(z7 ? 0L : 200L).setListener(new e(isActivated)).start();
    }

    private void t2(p5.e eVar) {
        if (this.f33807V) {
            AbstractC5673x.c("listSearch", "viewList", W1(this.f33806U) != null ? "oneList" : "multipleLists");
            U1();
        }
        AbstractC5625q.r(this, eVar.b(), eVar.c(), AbstractC5625q.b.VIEW);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ int A(C6395a c6395a, int i8, Z0 z02) {
        return AbstractC5544f3.d(this, c6395a, i8, z02);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ String D(C6395a c6395a, int i8, Object obj) {
        return AbstractC5544f3.g(this, c6395a, i8, obj);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean E(Object obj) {
        return AbstractC5544f3.p(this, obj);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean F(C6395a c6395a, int i8, Z0 z02) {
        return AbstractC5544f3.i(this, c6395a, i8, z02);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ int G(C6395a c6395a, int i8, Object obj) {
        return AbstractC5544f3.c(this, c6395a, i8, obj);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected boolean G0() {
        return false;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void H() {
        AbstractC5544f3.o(this);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public boolean J(int i8) {
        return i8 == 1 || i8 == 5;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void K(C5536e3.g gVar, Object obj) {
        if (getLifecycle().b() != AbstractC0922h.b.RESUMED) {
            AbstractC6635a.f("OG-ListsActivity", "Ignoring tap because lifecycle state is " + getLifecycle().b());
            return;
        }
        if (obj instanceof p5.e) {
            t2((p5.e) obj);
            return;
        }
        throw new AssertionError("Unknown item type " + obj);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void L() {
        AbstractC5544f3.n(this);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ C5536e3.d.a M() {
        return AbstractC5544f3.b(this);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ String N(C6395a c6395a, int i8, String str) {
        return AbstractC5544f3.f(this, c6395a, i8, str);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void O(C6395a c6395a, int i8) {
        AbstractC5544f3.m(this, c6395a, i8);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, com.headcode.ourgroceries.android.C5574j1.d
    public void P(C5688z0 c5688z0) {
        int i8;
        if (X0().p()) {
            X0().w(false);
        }
        if (c5688z0 == null || !((i8 = f.f33818a[c5688z0.U().ordinal()]) == 3 || i8 == 4)) {
            C5574j1 V02 = V0();
            if (A2.f33140n0.I0()) {
                V02.Q(this.f33804S, s5.Q.SHOPPING, C5688z0.f35134x);
            } else {
                V02.P(this.f33804S, s5.Q.SHOPPING);
            }
            V02.P(this.f33805T, s5.Q.RECIPE);
            Y y7 = new Y(this.f33806U);
            String[] b8 = y7.b(this.f33806U);
            C6395a c6395a = new C6395a(this.f33804S.size() + this.f33805T.size() + 2);
            S1(c6395a, this.f33804S, y7, b8, "shopping_lists", M2.f34100i3);
            S1(c6395a, this.f33805T, y7, b8, "recipes", M2.f34092h3);
            if (c6395a.h() != 0 || this.f33806U.isEmpty()) {
                this.f33800O.f39693h.setVisibility(0);
                this.f33800O.f39690e.setVisibility(8);
            } else {
                this.f33800O.f39693h.setVisibility(8);
                this.f33800O.f39690e.setVisibility(0);
            }
            this.f33802Q.G0(c6395a, true);
            boolean z7 = this.f33804S.size() == 1;
            if (z7 != this.f33809X) {
                this.f33809X = z7;
                n1();
            }
            r2();
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected m5.p Q0() {
        return m5.p.METALIST;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ String b(C6395a c6395a, int i8, Z0 z02) {
        return AbstractC5544f3.e(this, c6395a, i8, z02);
    }

    @Override // o5.L.b
    public void d(C5688z0 c5688z0) {
        o2(c5688z0);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void g(Object obj) {
        AbstractC5544f3.r(this, obj);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    public void j1(C5587k6.b bVar) {
        super.j1(bVar);
        n2(bVar.f34866c);
        if (bVar.f34866c.f()) {
            M0();
        } else {
            N0();
            r2();
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected void k1(CharSequence charSequence, C5688z0 c5688z0, List list) {
        if (list.isEmpty()) {
            return;
        }
        V1.b(charSequence, true);
        AbstractC5625q.q(this, c5688z0, ((Z0) list.get(0)).w());
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean m(C6395a c6395a, int i8, String str) {
        return AbstractC5544f3.h(this, c6395a, i8, str);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6262l c8 = C6262l.c(getLayoutInflater());
        this.f33800O = c8;
        setContentView(c8.b());
        L0();
        this.f33801P = this.f33800O.f39693h;
        this.f33801P.setLayoutManager(new LinearLayoutManager(this));
        C5536e3 c5536e3 = new C5536e3(this, this);
        this.f33802Q = c5536e3;
        this.f33801P.setAdapter(c5536e3);
        C5536e3 c5536e32 = this.f33802Q;
        Objects.requireNonNull(c5536e32);
        this.f33801P.j(new C5643s4(this, c5536e32.new f()));
        p1(this.f33800O.f39699n);
        S0().registerOnSharedPreferenceChangeListener(this);
        if (X0().p() && X1(getIntent())) {
            X0().w(false);
        }
        if (bundle != null) {
            this.f33806U = bundle.getString("com.headcode.ourgroceries.android.FilterString", "");
            this.f33807V = bundle.getBoolean("com.headcode.ourgroceries.android.FilterOpen", false);
            this.f33808W = bundle.getBoolean("com.headcode.ourgroceries.android.FilterFocus", false);
        }
        final FloatingActionButton floatingActionButton = this.f33800O.f39688c;
        floatingActionButton.setActivated(bundle != null && bundle.getBoolean("com.headcode.ourgroceries.android.FabMenuOpen", false));
        floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35006o.Z1(floatingActionButton, view);
            }
        });
        this.f33800O.f39697l.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35019o.a2(view);
            }
        });
        this.f33800O.f39695j.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35043o.b2(view);
            }
        });
        this.f33800O.f39700o.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35056o.c2(view);
            }
        });
        s2(true);
        getOnBackPressedDispatcher().h(this, new a(true));
        this.f33809X = this.f33804S.size() == 1;
        P(null);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(K2.f33728b, menu);
        MenuItem findItem = menu.findItem(H2.f33588k);
        this.f33803R = findItem;
        final SearchView searchView = (SearchView) findItem.getActionView();
        searchView.setQueryHint(getString(M2.f34003W2));
        searchView.setOnQueryTextListener(new b());
        this.f33803R.setOnActionExpandListener(new c());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.headcode.ourgroceries.android.w1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z7) {
                this.f35094a.j2(view, z7);
            }
        });
        if (this.f33807V) {
            final String str = this.f33806U;
            final boolean z7 = this.f33808W;
            this.f33803R.expandActionView();
            T0().postDelayed(new Runnable() { // from class: com.headcode.ourgroceries.android.x1
                @Override // java.lang.Runnable
                public final void run() {
                    ListsActivity.k2(searchView, str, z7);
                }
            }, 0L);
        }
        P1.g(this, menu);
        this.f33800O.f39689d.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35123o.l2(view);
            }
        });
        return true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        S0().unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AbstractC5673x.a("onNewIntent");
        setIntent(intent);
        X1(intent);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == H2.f33530P0) {
            q2(s5.Q.SHOPPING);
            return true;
        }
        if (itemId == H2.f33533Q0) {
            q2(s5.Q.RECIPE);
            return true;
        }
        if (itemId != H2.f33545U0) {
            return super.onOptionsItemSelected(menuItem);
        }
        AbstractC5625q.t(this);
        return true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.headcode.ourgroceries.android.FabMenuOpen", this.f33800O.f39688c.isActivated());
        bundle.putString("com.headcode.ourgroceries.android.FilterString", this.f33806U);
        bundle.putBoolean("com.headcode.ourgroceries.android.FilterOpen", this.f33807V);
        bundle.putBoolean("com.headcode.ourgroceries.android.FilterFocus", this.f33808W);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(getString(M2.f34037a4))) {
            C5536e3 c5536e3 = this.f33802Q;
            c5536e3.N(0, c5536e3.E());
        } else if (str.equals(A2.f33140n0.t())) {
            P(null);
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onStart() {
        super.onStart();
        A2.f33140n0.q0("");
        r2();
    }

    @Override // o5.L.b
    public void q(C5688z0 c5688z0) {
        o2(c5688z0);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void r(Object obj, boolean z7) {
        AbstractC5544f3.k(this, obj, z7);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean s(C6395a c6395a, C5536e3.g gVar, int i8, Object obj) {
        return AbstractC5544f3.a(this, c6395a, gVar, i8, obj);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void t(C6395a c6395a, int i8, int i9) {
        AbstractC5544f3.q(this, c6395a, i8, i9);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void v(Object obj) {
        AbstractC5544f3.j(this, obj);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void z(Object obj, ContextMenu contextMenu) {
        if (!(obj instanceof p5.e)) {
            AbstractC5544f3.l(this, obj, contextMenu);
            return;
        }
        final p5.e eVar = (p5.e) obj;
        contextMenu.setHeaderIcon(G2.f33459g);
        contextMenu.setHeaderTitle(eVar.d());
        boolean z7 = eVar.c() == s5.Q.SHOPPING;
        contextMenu.add(0, H2.f33560a1, 0, z7 ? M2.f34236z3 : M2.f33828A3).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.headcode.ourgroceries.android.z1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f35152o.h2(eVar, menuItem);
            }
        });
        contextMenu.add(0, H2.f33557Z0, 0, z7 ? M2.f34228y3 : M2.f34220x3).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.headcode.ourgroceries.android.A1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f33138o.i2(eVar, menuItem);
            }
        });
        contextMenu.add(0, H2.f33542T0, 0, z7 ? M2.f34172r3 : M2.f34180s3).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.headcode.ourgroceries.android.o1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f34953o.d2(eVar, menuItem);
            }
        });
        contextMenu.add(0, H2.f33548V0, 0, z7 ? M2.f34188t3 : M2.f34196u3).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.headcode.ourgroceries.android.p1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f34965o.e2(eVar, menuItem);
            }
        });
        contextMenu.add(0, H2.f33553X0, 0, z7 ? M2.f34204v3 : M2.f34212w3).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.headcode.ourgroceries.android.q1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f34984o.f2(eVar, menuItem);
            }
        });
        contextMenu.add(0, H2.f33539S0, 0, z7 ? M2.f34156p3 : M2.f34164q3).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.headcode.ourgroceries.android.r1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f34992o.g2(eVar, menuItem);
            }
        });
    }
}
