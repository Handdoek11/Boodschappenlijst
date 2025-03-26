package com.headcode.ourgroceries.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.AbstractC0922h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.C5536e3;
import com.headcode.ourgroceries.android.C5536e3.f;
import com.headcode.ourgroceries.android.C5587k6;
import com.headcode.ourgroceries.android.E;
import g5.AbstractC5808a;
import g5.C5809b;
import h5.C5841a;
import i5.C5873m;
import j$.util.Objects;
import j5.C6080c;
import l5.AbstractC6179e;
import n5.C6262l;
import o0.AbstractC6278a;
import o5.C6291A;
import o5.C6305n;
import o5.L;
import p5.C6395a;
import q5.AbstractC6635a;
import s5.EnumC6750p;
import z0.C7026g0;

/* loaded from: classes2.dex */
public abstract class Q0 extends AbstractActivityC5575j2 implements L.b, C6305n.a, SharedPreferences.OnSharedPreferenceChangeListener, C5536e3.d {

    /* renamed from: O, reason: collision with root package name */
    protected String f34329O;

    /* renamed from: P, reason: collision with root package name */
    protected C5688z0 f34330P;

    /* renamed from: Q, reason: collision with root package name */
    protected R2 f34331Q;

    /* renamed from: R, reason: collision with root package name */
    protected C5536e3 f34332R;

    /* renamed from: S, reason: collision with root package name */
    protected RecyclerView f34333S;

    /* renamed from: T, reason: collision with root package name */
    protected C5873m f34334T;

    /* renamed from: U, reason: collision with root package name */
    private RecyclerView.h f34335U;

    /* renamed from: V, reason: collision with root package name */
    private String f34336V = null;

    /* renamed from: W, reason: collision with root package name */
    private long f34337W = 0;

    /* renamed from: X, reason: collision with root package name */
    protected C6262l f34338X;

    class a extends C5809b {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f34339m;

        a(boolean z7) {
            this.f34339m = z7;
        }

        @Override // g5.C5809b, g5.AbstractC5811d, g5.AbstractC5810c
        protected void e0() {
            super.e0();
            if (this.f34339m) {
                g0(Q0.this.new c(this));
                j0(Q0.this.new d(this));
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34341a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f34342b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f34343c;

        static {
            int[] iArr = new int[E.d.values().length];
            f34343c = iArr;
            try {
                iArr[E.d.FOUND_IN_MASTER_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34343c[E.d.FOUND_IN_DATABASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34343c[E.d.NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34343c[E.d.NETWORK_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[s5.Q.values().length];
            f34342b = iArr2;
            try {
                iArr2[s5.Q.RECIPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34342b[s5.Q.SHOPPING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[AbstractC5625q.b.values().length];
            f34341a = iArr3;
            try {
                iArr3[AbstractC5625q.b.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34341a[AbstractC5625q.b.ADD_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34341a[AbstractC5625q.b.SCAN_BARCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34341a[AbstractC5625q.b.ADD_BY_VOICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    protected class d extends h5.h {

        private class a extends h5.j {

            /* renamed from: b, reason: collision with root package name */
            private final boolean f34348b;

            public a(RecyclerView.F f8, boolean z7) {
                super(f8);
                this.f34348b = z7;
            }

            public boolean c() {
                return this.f34348b;
            }
        }

        public d(AbstractC5808a abstractC5808a) {
            super(abstractC5808a);
        }

        private boolean D(h5.j jVar) {
            return (jVar instanceof a) && ((a) jVar).c();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void q(h5.j jVar, RecyclerView.F f8) {
            if (D(jVar)) {
                f8.f10944a.setTranslationX(0.0f);
            } else {
                f8.f10944a.setAlpha(1.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void r(h5.j jVar, RecyclerView.F f8) {
            if (f8 != null) {
                if (D(jVar)) {
                    f8.f10944a.setTranslationX(0.0f);
                } else {
                    f8.f10944a.setAlpha(1.0f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public void s(h5.j jVar, RecyclerView.F f8) {
            if (D(jVar)) {
                f8.f10944a.setTranslationX(0.0f);
            } else {
                f8.f10944a.setAlpha(1.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public void t(h5.j jVar) {
            C7026g0 e8 = z0.X.e(jVar.f36261a.f10944a);
            if (D(jVar)) {
                e8.p(-jVar.f36261a.f10944a.getRootView().getWidth()).i(100L);
            } else {
                e8.b(0.0f).i(100L);
            }
            x(jVar, jVar.f36261a, e8);
        }

        @Override // h5.h
        public boolean y(RecyclerView.F f8) {
            boolean K12 = Q0.this.K1(f8);
            v(f8);
            n(new a(f8, K12));
            return true;
        }
    }

    private void G1(String str, String str2) {
        AbstractC5673x.a("barcodeAdded");
        Z0 l8 = V0().l(this.f34330P, str, str2);
        m5.D.j(Z0(), this.f34330P, str);
        if (getLifecycle().b().c(AbstractC0922h.b.CREATED)) {
            S1(l8.w());
            l1();
            U1(this, this.f34333S, this.f34330P, l8);
        }
        if (I1()) {
            X0().l().i(str);
        }
    }

    private void H1(C5688z0 c5688z0, boolean z7) {
        Intent c8 = AbstractC5625q.c(this, c5688z0.T(), z7 ? AbstractC5625q.b.ADD_ITEM : AbstractC5625q.b.VIEW);
        c8.putExtra("com.headcode.ourgroceries.FromShortcut", true);
        int i8 = z7 ? G2.f33460h : G2.f33461i;
        Intent intent = new Intent();
        intent.putExtra("duplicate", false);
        intent.putExtra("android.intent.extra.shortcut.INTENT", c8);
        intent.putExtra("android.intent.extra.shortcut.NAME", c5688z0.W());
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(getApplicationContext(), i8));
        intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        getApplicationContext().sendBroadcast(intent);
        o5.T.t2().b(i8).f(M2.f34170r1).d(M2.f34162q1).g(this);
    }

    private boolean I1() {
        return S0().getBoolean(getString(M2.f34069e4), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K1(RecyclerView.F f8) {
        if (!(f8 instanceof C5536e3.g)) {
            return false;
        }
        Object g02 = ((C5536e3.g) f8).g0();
        if (g02 instanceof Z0) {
            return Z1((Z0) g02);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void L1(java.lang.String r4, s5.EnumC6750p r5, java.lang.String r6, java.lang.String r7, com.headcode.ourgroceries.android.E.d r8) {
        /*
            r3 = this;
            int[] r0 = com.headcode.ourgroceries.android.Q0.b.f34343c
            int r1 = r8.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L4f
            r2 = 2
            if (r0 == r2) goto L4f
            r6 = 3
            if (r0 == r6) goto L44
            r6 = 4
            if (r0 == r6) goto L16
            goto Laa
        L16:
            java.lang.String r6 = "barcodeNetworkError"
            com.headcode.ourgroceries.android.AbstractC5673x.a(r6)
            java.lang.String r6 = r3.f34329O     // Catch: java.lang.IllegalStateException -> L2c
            androidx.fragment.app.e r4 = o5.C6305n.w2(r6, r4, r5)     // Catch: java.lang.IllegalStateException -> L2c
            androidx.fragment.app.w r5 = r3.getSupportFragmentManager()     // Catch: java.lang.IllegalStateException -> L2c
            java.lang.String r6 = "unused"
            r4.r2(r5, r6)     // Catch: java.lang.IllegalStateException -> L2c
            goto Laa
        L2c:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got exception showing dialog box: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "OG-ListActivity"
            q5.AbstractC6635a.f(r5, r4)
            goto Laa
        L44:
            java.lang.String r5 = "barcodeNotFound"
            com.headcode.ourgroceries.android.AbstractC5673x.a(r5)
            java.lang.String r5 = r3.f34329O
            com.headcode.ourgroceries.android.AbstractC5625q.h(r3, r5, r4)
            goto Laa
        L4f:
            com.headcode.ourgroceries.android.E$d r5 = com.headcode.ourgroceries.android.E.d.FOUND_IN_MASTER_LIST
            if (r8 != r5) goto L57
            r3.G1(r6, r7)
            goto Laa
        L57:
            com.headcode.ourgroceries.android.z0 r5 = r3.f34330P
            r7 = 0
            if (r5 == 0) goto L79
            java.util.List r5 = r5.L(r6)
            int r8 = r5.size()
            if (r8 != r1) goto L79
            java.lang.Object r5 = r5.get(r7)
            com.headcode.ourgroceries.android.Z0 r5 = (com.headcode.ourgroceries.android.Z0) r5
            java.lang.String r8 = r5.t()
            java.lang.String r5 = r5.y()
            r3.G1(r8, r5)
            r5 = r1
            goto L7a
        L79:
            r5 = r7
        L7a:
            com.headcode.ourgroceries.android.j1 r8 = r3.V0()
            com.headcode.ourgroceries.android.z0 r8 = r8.L()
            if (r5 != 0) goto La2
            if (r8 == 0) goto La2
            java.util.List r8 = r8.L(r6)
            int r0 = r8.size()
            if (r0 != r1) goto La2
            java.lang.Object r5 = r8.get(r7)
            com.headcode.ourgroceries.android.Z0 r5 = (com.headcode.ourgroceries.android.Z0) r5
            java.lang.String r7 = r5.E()
            java.lang.String r5 = r5.y()
            r3.G1(r7, r5)
            goto La3
        La2:
            r1 = r5
        La3:
            if (r1 != 0) goto Laa
            java.lang.String r5 = r3.f34329O
            com.headcode.ourgroceries.android.AbstractC5625q.i(r3, r5, r6, r4)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.Q0.L1(java.lang.String, s5.p, java.lang.String, java.lang.String, com.headcode.ourgroceries.android.E$d):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1() {
        AbstractC5625q.h(this, this.f34329O, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N1() {
        O.A(this, new N0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O1() {
        AbstractC5625q.g(this, this.f34329O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P1(View view) {
        AbstractC5673x.a("addItemFromFab");
        AbstractC5625q.h(this, this.f34329O, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q1(AlertDialog alertDialog, String str, C5688z0 c5688z0, DialogInterface dialogInterface, int i8) {
        int checkedItemPosition = alertDialog.getListView().getCheckedItemPosition();
        if (checkedItemPosition != -1) {
            boolean z7 = checkedItemPosition == 1;
            AbstractC5673x.a("shortcutCreate" + str + (z7 ? "AddItem" : "ViewList"));
            H1(c5688z0, z7);
        }
    }

    private void T1(final C5688z0 c5688z0) {
        int i8;
        final String V7 = c5688z0.V();
        AbstractC5673x.a("shortcutShowDialog" + V7);
        int i9 = b.f34342b[c5688z0.U().ordinal()];
        if (i9 == 1) {
            i8 = B2.f33287a;
        } else if (i9 != 2) {
            return;
        } else {
            i8 = B2.f33288b;
        }
        final AlertDialog create = new AlertDialog.Builder(this).setIcon(G2.f33459g).setTitle(M2.f34186t1).setSingleChoiceItems(i8, 0, (DialogInterface.OnClickListener) null).setNegativeButton(M2.f34154p1, (DialogInterface.OnClickListener) null).create();
        create.setButton(-1, getString(M2.f34178s1), new DialogInterface.OnClickListener() { // from class: com.headcode.ourgroceries.android.O0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f34269o.Q1(create, V7, c5688z0, dialogInterface, i10);
            }
        });
        create.show();
    }

    public static void U1(final Activity activity, View view, final C5688z0 c5688z0, final Z0 z02) {
        Snackbar.o0(view, activity.getString(M2.f33907K2, z02.t()), 0).q0(M2.f33930N1, new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC5625q.l(activity, c5688z0, z02, false);
            }
        }).Y();
    }

    private void W1() {
        a aVar = new a(A2.f33140n0.i() != A2.e.SWIPE);
        aVar.Q(false);
        this.f34333S.setItemAnimator(aVar);
    }

    private boolean Z1(Z0 z02) {
        return z02.w().equals(this.f34336V) && SystemClock.elapsedRealtime() - this.f34337W < 1000;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public int A(C6395a c6395a, int i8, Z0 z02) {
        return 3;
    }

    @Override // o5.C6305n.a
    public void C(String str, EnumC6750p enumC6750p) {
        AbstractC5673x.a("barcodeLookup");
        E.c(this, str, enumC6750p, new E.c() { // from class: com.headcode.ourgroceries.android.P0
            @Override // com.headcode.ourgroceries.android.E.c
            public final void a(String str2, EnumC6750p enumC6750p2, String str3, String str4, E.d dVar) {
                this.f34308a.L1(str2, enumC6750p2, str3, str4, dVar);
            }
        });
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

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void H() {
        AbstractC5544f3.o(this);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean J(int i8) {
        return AbstractC5544f3.s(this, i8);
    }

    protected void J1(String str) {
        this.f34336V = str;
        this.f34337W = SystemClock.elapsedRealtime();
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

    protected void S1(String str) {
        for (int i8 = 0; i8 < this.f34332R.E(); i8++) {
            Object n02 = this.f34332R.n0(i8);
            if ((n02 instanceof Z0) && ((Z0) n02).w().equals(str)) {
                RecyclerView.p layoutManager = this.f34333S.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).E2(i8, (this.f34333S.getHeight() / 2) - 200);
                    return;
                } else {
                    if (layoutManager != null) {
                        layoutManager.B1(i8);
                        return;
                    }
                    return;
                }
            }
        }
    }

    protected void V1() {
        if (this.f34330P != null) {
            P0().m(A2.f33140n0.y() ? this.f34330P.R(Q0()) : b.f34342b[this.f34330P.U().ordinal()] != 1 ? new m5.j("Shopping List", Q0()) : new m5.j("Recipe", Q0()));
        }
    }

    protected void X1(Menu menu) {
        MenuItem findItem = menu.findItem(H2.f33536R0);
        if (findItem != null) {
            findItem.setVisible(Build.VERSION.SDK_INT < 25);
        }
    }

    protected boolean Y1(Z0 z02) {
        return z02.w().equals(this.f34336V) && SystemClock.elapsedRealtime() - this.f34337W < 120000;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public String b(C6395a c6395a, int i8, Z0 z02) {
        return z02.y();
    }

    @Override // o5.L.b
    public void d(C5688z0 c5688z0) {
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void g(Object obj) {
        if (obj instanceof Z0) {
            AbstractC5662v2.l(this, (Z0) obj, "list");
        } else {
            AbstractC5544f3.r(this, obj);
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    public void j1(C5587k6.b bVar) {
        super.j1(bVar);
        if (bVar.f34866c.f()) {
            M0();
        } else {
            N0();
            V1();
        }
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean m(C6395a c6395a, int i8, String str) {
        return AbstractC5544f3.h(this, c6395a, i8, str);
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 != -1 || intent == null) {
            return;
        }
        if (i8 != 5) {
            if (i8 == 11) {
                S1(intent.getStringExtra("com.headcode.ourgroceries.ItemID"));
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("com.headcode.ourgroceries.ItemID");
        S1(stringExtra);
        l1();
        Z0 J7 = this.f34330P.J(stringExtra);
        if (J7 != null) {
            U1(this, this.f34333S, this.f34330P, J7);
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        AbstractC6635a.d("OG-ListActivity", "onCreate");
        super.onCreate(bundle);
        X0().w(false);
        C6262l c8 = C6262l.c(getLayoutInflater());
        this.f34338X = c8;
        setContentView(c8.f39699n);
        L0();
        String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.ListID");
        this.f34329O = stringExtra;
        if (stringExtra == null || stringExtra.length() == 0) {
            AbstractC6635a.b("OG-ListActivity", "Received request to display list without any list ID");
            finish();
            return;
        }
        this.f34333S = this.f34338X.f39693h;
        this.f34333S.setLayoutManager(new LinearLayoutManager(this));
        C5873m c5873m = new C5873m();
        this.f34334T = c5873m;
        c5873m.d0(true);
        this.f34334T.c0(false);
        this.f34334T.e0(false);
        this.f34334T.a0(false);
        this.f34334T.b0((NinePatchDrawable) AbstractC6278a.e(this, G2.f33462j));
        C6080c c6080c = new C6080c();
        C5536e3 c5536e3 = new C5536e3(this, this);
        this.f34332R = c5536e3;
        RecyclerView.h i8 = this.f34334T.i(c5536e3);
        this.f34335U = i8;
        RecyclerView.h h8 = c6080c.h(i8);
        this.f34335U = h8;
        this.f34333S.setAdapter(h8);
        this.f34334T.a(this.f34333S);
        c6080c.c(this.f34333S);
        C5536e3 c5536e32 = this.f34332R;
        Objects.requireNonNull(c5536e32);
        this.f34333S.j(new C5643s4(this, c5536e32.new f()));
        W1();
        p1(this.f34338X.f39699n);
        S0().registerOnSharedPreferenceChangeListener(this);
        this.f34331Q = new R2(getApplicationContext());
        Intent intent = getIntent();
        if (intent != null) {
            int i9 = b.f34341a[AbstractC5625q.b.c(intent).ordinal()];
            if (i9 == 2) {
                AbstractC5673x.a("addItemFromIntent");
                OurApplication.j().post(new Runnable() { // from class: com.headcode.ourgroceries.android.J0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33670o.M1();
                    }
                });
            } else if (i9 == 3) {
                AbstractC5673x.a("scanBarcodeFromIntent");
                OurApplication.j().post(new Runnable() { // from class: com.headcode.ourgroceries.android.K0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33726o.N1();
                    }
                });
            } else if (i9 == 4) {
                AbstractC5673x.a("addByVoiceFromIntent");
                OurApplication.j().post(new Runnable() { // from class: com.headcode.ourgroceries.android.L0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33737o.O1();
                    }
                });
            }
        }
        this.f34338X.f39688c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33823o.P1(view);
            }
        });
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        C5873m c5873m = this.f34334T;
        if (c5873m != null) {
            c5873m.T();
            this.f34334T = null;
        }
        RecyclerView recyclerView = this.f34333S;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            this.f34333S.setAdapter(null);
            this.f34333S = null;
        }
        RecyclerView.h hVar = this.f34335U;
        if (hVar != null) {
            AbstractC6179e.c(hVar);
            this.f34335U = null;
        }
        S0().unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == H2.f33555Y0) {
            Shortcuts.j(this, this.f34330P);
            O.A(this, new N0(this));
            return true;
        }
        if (itemId == H2.f33542T0) {
            this.f34330P.l0(this, V0().D());
            return true;
        }
        if (itemId == H2.f33548V0) {
            m1(this.f34330P);
            return true;
        }
        if (itemId == H2.f33536R0) {
            C5688z0 c5688z0 = this.f34330P;
            if (c5688z0 != null) {
                T1(c5688z0);
            }
            return true;
        }
        if (itemId == H2.f33553X0) {
            o5.L.B2(this.f34329O, this.f34330P.U()).r2(getSupportFragmentManager(), "unused");
            return true;
        }
        if (itemId == H2.f33539S0) {
            try {
                C6291A.u2(this.f34330P).r2(getSupportFragmentManager(), "unused");
            } catch (IllegalStateException unused) {
            }
            return true;
        }
        if (itemId == H2.f33557Z0) {
            AbstractC5625q.f(this, this.f34329O, false);
            return true;
        }
        if (itemId != H2.f33545U0) {
            return super.onOptionsItemSelected(menuItem);
        }
        AbstractC5625q.t(this);
        return true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onPause() {
        this.f34334T.c();
        super.onPause();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0835d, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        Intent intent;
        String stringExtra;
        super.onPostCreate(bundle);
        if (bundle != null || (intent = getIntent()) == null || AbstractC5625q.b.c(intent) != AbstractC5625q.b.VIEW || (stringExtra = intent.getStringExtra("com.headcode.ourgroceries.ItemID")) == null) {
            return;
        }
        S1(stringExtra);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(getString(M2.f34037a4))) {
            C5536e3 c5536e3 = this.f34332R;
            c5536e3.N(0, c5536e3.E());
        } else if (str.equals(getString(M2.f34194u1))) {
            W1();
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onStart() {
        super.onStart();
        A2.f33140n0.q0(this.f34329O);
    }

    @Override // o5.L.b
    public void q(C5688z0 c5688z0) {
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
    public /* synthetic */ void t(C6395a c6395a, int i8, int i9) {
        AbstractC5544f3.q(this, c6395a, i8, i9);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void v(Object obj) {
        if (getLifecycle().b() != AbstractC0922h.b.RESUMED) {
            AbstractC6635a.f("OG-ListActivity", "Ignoring tap because lifecycle state is " + getLifecycle().b());
            return;
        }
        if (!(obj instanceof Z0)) {
            throw new AssertionError();
        }
        AbstractC5673x.a("itemDetails");
        AbstractC5625q.l(this, this.f34330P, (Z0) obj, false);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void z(Object obj, ContextMenu contextMenu) {
        AbstractC5544f3.l(this, obj, contextMenu);
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        getSupportActionBar().z(charSequence);
    }

    private class c extends h5.d {

        private class a extends C5841a {

            /* renamed from: b, reason: collision with root package name */
            private final boolean f34345b;

            public a(RecyclerView.F f8, boolean z7) {
                super(f8);
                this.f34345b = z7;
            }

            public boolean c() {
                return this.f34345b;
            }
        }

        public c(AbstractC5808a abstractC5808a) {
            super(abstractC5808a);
        }

        private boolean D(C5841a c5841a) {
            return (c5841a instanceof a) && ((a) c5841a).c();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void q(C5841a c5841a, RecyclerView.F f8) {
            if (D(c5841a)) {
                f8.f10944a.setTranslationX(0.0f);
            } else {
                f8.f10944a.setAlpha(1.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void r(C5841a c5841a, RecyclerView.F f8) {
            if (f8 != null) {
                if (D(c5841a)) {
                    f8.f10944a.setTranslationX(0.0f);
                } else {
                    f8.f10944a.setAlpha(1.0f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public void t(C5841a c5841a) {
            C7026g0 e8 = z0.X.e(c5841a.f36238a.f10944a);
            if (D(c5841a)) {
                e8.p(0.0f).i(100L);
            } else {
                e8.b(1.0f).i(100L);
            }
            x(c5841a, c5841a.f36238a, e8);
        }

        @Override // h5.d
        public boolean y(RecyclerView.F f8) {
            boolean K12 = Q0.this.K1(f8);
            v(f8);
            if (K12) {
                f8.f10944a.setTranslationX(-r1.getRootView().getWidth());
            } else {
                f8.f10944a.setAlpha(0.0f);
            }
            n(new a(f8, K12));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h5.AbstractC5842b
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public void s(C5841a c5841a, RecyclerView.F f8) {
        }
    }
}
