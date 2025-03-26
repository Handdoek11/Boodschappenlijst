package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.lifecycle.AbstractC0922h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.headcode.ourgroceries.android.C5536e3;
import com.headcode.ourgroceries.android.C5536e3.f;
import g5.C5809b;
import i5.C5873m;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import l5.AbstractC6179e;
import n5.C6262l;
import o0.AbstractC6278a;
import o5.C6296e;
import p5.C6395a;
import q5.AbstractC6635a;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public final class CategoriesActivity extends AbstractActivityC5575j2 implements C6296e.a, C5536e3.d {

    /* renamed from: O, reason: collision with root package name */
    private RecyclerView f33323O;

    /* renamed from: P, reason: collision with root package name */
    private C5536e3 f33324P;

    /* renamed from: Q, reason: collision with root package name */
    private androidx.appcompat.view.b f33325Q;

    /* renamed from: R, reason: collision with root package name */
    private String f33326R;

    /* renamed from: S, reason: collision with root package name */
    private String f33327S;

    /* renamed from: T, reason: collision with root package name */
    private String f33328T;

    /* renamed from: U, reason: collision with root package name */
    private C5688z0 f33329U;

    /* renamed from: V, reason: collision with root package name */
    private Z0 f33330V;

    /* renamed from: W, reason: collision with root package name */
    private C5688z0 f33331W;

    /* renamed from: X, reason: collision with root package name */
    private final ArrayList f33332X = new ArrayList(16);

    /* renamed from: Y, reason: collision with root package name */
    private boolean f33333Y = false;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f33334Z = false;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f33335a0 = false;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f33336b0 = false;

    /* renamed from: c0, reason: collision with root package name */
    private C5873m f33337c0;

    /* renamed from: d0, reason: collision with root package name */
    private RecyclerView.h f33338d0;

    /* renamed from: e0, reason: collision with root package name */
    private C6262l f33339e0;

    private final class b implements b.a {
        private b() {
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            CategoriesActivity.this.f33325Q = null;
            CategoriesActivity.this.H1();
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
    }

    private void B1() {
        C6296e.A2().r2(getSupportFragmentManager(), "unused");
    }

    private void C1() {
        if (this.f33335a0) {
            P(null);
        }
    }

    private boolean D1() {
        return (AbstractC6803e.o(this.f33326R) || AbstractC6803e.o(this.f33327S)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1(View view) {
        B1();
    }

    private void F1(int i8, int i9) {
        if (i8 < 0 || i9 < 0) {
            AbstractC6635a.b("OG-CategoriesAct", "Illegal request to drag from " + i8 + " to " + i9);
            return;
        }
        int size = this.f33332X.size();
        if (i8 >= size || i9 >= size) {
            AbstractC6635a.b("OG-CategoriesAct", "Illegal request to drag from " + i8 + " to " + i9);
            return;
        }
        if (i8 == i9) {
            return;
        }
        C5598m1 c5598m1 = new C5598m1(V0(), this.f33331W);
        c5598m1.g(this.f33332X);
        this.f33332X.add(i9, (Z0) this.f33332X.remove(i8));
        c5598m1.f(this.f33332X, i9);
    }

    private void G1() {
        this.f33336b0 = true;
        this.f33324P.F0(true);
        androidx.appcompat.view.b startSupportActionMode = startSupportActionMode(new b());
        this.f33325Q = startSupportActionMode;
        if (startSupportActionMode != null) {
            startSupportActionMode.q(M2.f34122l1);
            this.f33325Q.n(M2.f34114k1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H1() {
        this.f33336b0 = false;
        this.f33324P.F0(false);
        androidx.appcompat.view.b bVar = this.f33325Q;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public int A(C6395a c6395a, int i8, Z0 z02) {
        String w7 = z02.w();
        return (w7.endsWith("*") || w7.endsWith("%") || z02 == Z0.F()) ? 5 : 3;
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
    public boolean F(C6395a c6395a, int i8, Z0 z02) {
        return AbstractC6803e.o(this.f33328T) ? z02 == Z0.F() : o5.c0.x2(z02.w()).equals(this.f33328T);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ int G(C6395a c6395a, int i8, Object obj) {
        return AbstractC5544f3.c(this, c6395a, i8, obj);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void H() {
        this.f33334Z = true;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean J(int i8) {
        return AbstractC5544f3.s(this, i8);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void K(C5536e3.g gVar, Object obj) {
        String w7;
        if (getLifecycle().b() != AbstractC0922h.b.RESUMED) {
            AbstractC6635a.f("OG-CategoriesAct", "Ignoring tap because lifecycle state is " + getLifecycle().b());
            return;
        }
        if (obj instanceof Z0) {
            Z0 z02 = (Z0) obj;
            if (!D1()) {
                if (z02 != Z0.F()) {
                    AbstractC5625q.k(this, z02);
                    return;
                }
                return;
            }
            if (z02 == Z0.F()) {
                AbstractC5673x.a("catActUncat");
                w7 = "";
            } else {
                w7 = z02.w();
                if (w7.endsWith("%")) {
                    w7 = w7.substring(0, w7.length() - 1);
                    AbstractC5673x.a("catActSugg");
                } else if (w7.endsWith("*")) {
                    w7 = V0().j(z02.E()).w();
                    AbstractC5673x.a("catActNew");
                } else {
                    AbstractC5673x.a("catActExist");
                }
            }
            Intent intent = new Intent();
            intent.putExtra("com.headcode.ourgroceries.CategoryID", w7);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void L() {
        this.f33334Z = false;
        C1();
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
        boolean z7;
        p5.c cVar;
        Z0 C7;
        if (D1() && this.f33329U == null) {
            C5688z0 x7 = V0().x(this.f33326R);
            this.f33329U = x7;
            if (x7 == null) {
                AbstractC6635a.f("OG-CategoriesAct", "Containing list disappeared; finishing");
                finish();
                return;
            }
        }
        if (D1()) {
            Z0 J7 = this.f33329U.J(this.f33327S);
            this.f33330V = J7;
            if (J7 == null) {
                finish();
                return;
            }
            setTitle(getString(M2.f34098i1, J7.t()));
        }
        if (this.f33334Z) {
            this.f33335a0 = true;
            return;
        }
        this.f33335a0 = false;
        if (this.f33331W == null || c5688z0 == null || c5688z0.U() == s5.Q.CATEGORY) {
            this.f33331W = V0().D();
            this.f33332X.clear();
            C5688z0 c5688z02 = this.f33331W;
            if (c5688z02 != null) {
                c5688z02.v(this.f33332X);
                Collections.sort(this.f33332X, Z0.f34619D);
            }
            z7 = true;
        } else {
            z7 = false;
        }
        if (D1()) {
            z7 |= c5688z0 == null || c5688z0 == this.f33329U;
        }
        if (z7 || this.f33333Y) {
            C6395a c6395a = new C6395a(this.f33332X.size() + 1);
            if (D1() ? o5.c0.u2(this.f33330V.t(), this, c6395a) : false) {
                cVar = p5.c.g("your_categories", this.f33332X.size() == 1 ? getString(M2.f34133m4) : getString(M2.f34125l4));
            } else {
                cVar = null;
            }
            p5.b l8 = c6395a.l(cVar, true);
            c6395a.b(this.f33332X);
            if (D1()) {
                c6395a.l(null, false);
                c6395a.a(Z0.F());
            }
            this.f33324P.G0(c6395a, false);
            if (this.f33333Y) {
                if (D1() && this.f33328T != null) {
                    int size = this.f33332X.size();
                    if (!this.f33328T.isEmpty() && (C7 = V0().C(this.f33328T)) != null) {
                        size = this.f33332X.indexOf(C7);
                    }
                    this.f33323O.getLayoutManager().B1(size + l8.a());
                }
                this.f33333Y = false;
            }
        }
    }

    @Override // o5.C6296e.a
    public void R(Z0 z02) {
        if (this.f33329U == null || this.f33330V == null) {
            return;
        }
        if (z02 == Z0.F()) {
            z02 = null;
        }
        this.f33330V = V0().H0(this.f33329U, this.f33330V, z02);
        AbstractC5673x.a("catActUserNew");
        finish();
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public String b(C6395a c6395a, int i8, Z0 z02) {
        return o5.c0.w2(z02, this);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void g(Object obj) {
        AbstractC5544f3.r(this, obj);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean m(C6395a c6395a, int i8, String str) {
        return AbstractC5544f3.h(this, c6395a, i8, str);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f33333Y = true;
        }
        C6262l c8 = C6262l.c(getLayoutInflater());
        this.f33339e0 = c8;
        setContentView(c8.b());
        L0();
        this.f33326R = getIntent().getStringExtra("com.headcode.ourgroceries.ListID");
        this.f33327S = getIntent().getStringExtra("com.headcode.ourgroceries.ItemID");
        this.f33328T = getIntent().getStringExtra("com.headcode.ourgroceries.CategoryID");
        this.f33323O = this.f33339e0.f39693h;
        this.f33323O.setLayoutManager(new LinearLayoutManager(this));
        ((androidx.recyclerview.widget.q) this.f33323O.getItemAnimator()).Q(false);
        C5873m c5873m = new C5873m();
        this.f33337c0 = c5873m;
        c5873m.d0(true);
        this.f33337c0.c0(false);
        this.f33337c0.e0(false);
        this.f33337c0.a0(false);
        this.f33337c0.b0((NinePatchDrawable) AbstractC6278a.e(this, G2.f33462j));
        C5536e3 c5536e3 = new C5536e3(this, this);
        this.f33324P = c5536e3;
        RecyclerView.h i8 = this.f33337c0.i(c5536e3);
        this.f33338d0 = i8;
        this.f33323O.setAdapter(i8);
        this.f33337c0.a(this.f33323O);
        C5536e3 c5536e32 = this.f33324P;
        Objects.requireNonNull(c5536e32);
        this.f33323O.j(new C5643s4(this, c5536e32.new f()));
        this.f33323O.setItemAnimator(new C5809b());
        this.f33324P.m0(this);
        this.f33339e0.f39688c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34307o.E1(view);
            }
        });
        P(null);
        if (bundle != null && bundle.getBoolean("com.headcode.ourgroceries.android.CategoriesActivity.EditMode", false)) {
            G1();
        }
        setResult(-1);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(K2.f33727a, menu);
        P1.g(this, menu);
        return true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        C5873m c5873m = this.f33337c0;
        if (c5873m != null) {
            c5873m.T();
            this.f33337c0 = null;
        }
        RecyclerView recyclerView = this.f33323O;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            this.f33323O.setAdapter(null);
            this.f33323O = null;
        }
        RecyclerView.h hVar = this.f33338d0;
        if (hVar != null) {
            AbstractC6179e.c(hVar);
            this.f33338d0 = null;
        }
        super.onDestroy();
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != H2.f33551W0) {
            return super.onOptionsItemSelected(menuItem);
        }
        G1();
        return true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onPause() {
        this.f33337c0.c();
        super.onPause();
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.headcode.ourgroceries.android.CategoriesActivity.EditMode", this.f33324P.o0());
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void r(Object obj, boolean z7) {
        AbstractC5544f3.k(this, obj, z7);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean s(C6395a c6395a, C5536e3.g gVar, int i8, Object obj) {
        return AbstractC5544f3.a(this, c6395a, gVar, i8, obj);
    }

    @Override // android.app.Activity
    public void setTitle(int i8) {
        getSupportActionBar().y(i8);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void t(C6395a c6395a, int i8, int i9) {
        p5.d f8 = c6395a.f(i8);
        if (f8 == null) {
            AbstractC6635a.b("OG-CategoriesAct", "Can't find index path for fromPosition " + i8);
            return;
        }
        p5.d e8 = c6395a.e(i9);
        if (e8 == null) {
            AbstractC6635a.b("OG-CategoriesAct", "Can't find index path for toPosition " + i9);
            return;
        }
        AbstractC6635a.a("OG-CategoriesAct", "Moving position " + i8 + "->" + i9 + ", " + f8 + "->" + e8);
        int b8 = e8.b();
        int a8 = f8.a();
        int a9 = e8.a();
        if (c6395a.c(b8).f()) {
            F1(a8, a9);
        } else {
            AbstractC6635a.b("OG-CategoriesAct", "Can't move an item to a section that's not a target");
        }
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void v(Object obj) {
        Z0 z02;
        if (getLifecycle().b() != AbstractC0922h.b.RESUMED) {
            AbstractC6635a.f("OG-CategoriesAct", "Ignoring tap because lifecycle state is " + getLifecycle().b());
            return;
        }
        if (!(obj instanceof Z0) || (z02 = (Z0) obj) == Z0.F()) {
            return;
        }
        AbstractC5625q.k(this, z02);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void z(Object obj, ContextMenu contextMenu) {
        AbstractC5544f3.l(this, obj, contextMenu);
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        getSupportActionBar().z(charSequence);
    }
}
