package com.headcode.ourgroceries.android;

import a6.AbstractC0829f;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.print.PrintJob;
import android.print.PrintJobInfo;
import android.util.AndroidRuntimeException;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0835d;
import androidx.appcompat.app.AbstractC0832a;
import androidx.appcompat.widget.Toolbar;
import c6.AbstractC1021a;
import com.adadapted.android.sdk.constants.Config;
import com.adadapted.android.sdk.core.atl.AddToListContent;
import com.adadapted.android.sdk.core.atl.AddToListItem;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.C5574j1;
import com.headcode.ourgroceries.android.C5587k6;
import com.headcode.ourgroceries.android.R4;
import com.headcode.ourgroceries.android.U;
import com.headcode.ourgroceries.android.U1;
import d6.InterfaceC5732b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o5.h0;
import q5.AbstractC6635a;
import s5.EnumC6746l;
import t5.AbstractC6803e;
import t5.AbstractC6804f;

/* renamed from: com.headcode.ourgroceries.android.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5575j2 extends AbstractActivityC0835d implements C5574j1.d, h0.a {

    /* renamed from: L, reason: collision with root package name */
    private static final long f34801L = TimeUnit.DAYS.toMillis(1);

    /* renamed from: M, reason: collision with root package name */
    private static final List f34802M = new ArrayList();

    /* renamed from: N, reason: collision with root package name */
    private static long f34803N = 0;

    /* renamed from: s, reason: collision with root package name */
    private R4.a f34816s;

    /* renamed from: t, reason: collision with root package name */
    private InputMethodManager f34817t;

    /* renamed from: u, reason: collision with root package name */
    private SharedPreferences f34818u;

    /* renamed from: v, reason: collision with root package name */
    private String f34819v;

    /* renamed from: w, reason: collision with root package name */
    private C f34820w;

    /* renamed from: o, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f34815o = new a();

    /* renamed from: x, reason: collision with root package name */
    private m5.n f34821x = new m5.z();

    /* renamed from: y, reason: collision with root package name */
    private boolean f34822y = true;

    /* renamed from: z, reason: collision with root package name */
    protected boolean f34823z = false;

    /* renamed from: A, reason: collision with root package name */
    private long f34804A = 0;

    /* renamed from: B, reason: collision with root package name */
    private InterfaceC5732b f34805B = null;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC5732b f34806C = null;

    /* renamed from: D, reason: collision with root package name */
    private InterfaceC5732b f34807D = null;

    /* renamed from: E, reason: collision with root package name */
    private PrintJob f34808E = null;

    /* renamed from: F, reason: collision with root package name */
    private String f34809F = null;

    /* renamed from: G, reason: collision with root package name */
    private InterfaceC5732b f34810G = null;

    /* renamed from: H, reason: collision with root package name */
    private View f34811H = null;

    /* renamed from: I, reason: collision with root package name */
    private TextView f34812I = null;

    /* renamed from: J, reason: collision with root package name */
    private boolean f34813J = false;

    /* renamed from: K, reason: collision with root package name */
    private final m5.k f34814K = new b();

    /* renamed from: com.headcode.ourgroceries.android.j2$a */
    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (str.equals(AbstractActivityC5575j2.this.f34819v)) {
                AbstractActivityC5575j2.this.q1();
            }
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.j2$b */
    class b implements m5.k {
        b() {
        }

        @Override // m5.k
        public void a(AddToListContent addToListContent) {
            AbstractActivityC5575j2.this.i1(addToListContent);
        }

        @Override // m5.k
        public void b() {
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.j2$c */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34826a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f34827b;

        static {
            int[] iArr = new int[m5.p.values().length];
            f34827b = iArr;
            try {
                iArr[m5.p.SHOPPING_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34827b[m5.p.SHOPPING_LIST_ITEM_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34827b[m5.p.METALIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[A2.b.values().length];
            f34826a = iArr2;
            try {
                iArr2[A2.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34826a[A2.b.FIRST_WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34826a[A2.b.EVERY_WORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private void E0(AddToListContent addToListContent) {
        C5688z0 O7;
        L4 Y02 = Y0();
        C5574j1 V02 = V0();
        int i8 = c.f34827b[Q0().ordinal()];
        String q8 = (i8 == 1 || i8 == 2) ? A2.f33140n0.q() : (i8 == 3 && (O7 = V02.O()) != null) ? O7.T() : null;
        if (AbstractC6803e.o(q8)) {
            AbstractC6635a.b("OG-OurActivity", "addItemsFromAd: targetListId is empty");
            AbstractC5673x.a("aaAddToListError");
            addToListContent.failed("no destination list found");
            return;
        }
        C5688z0 x7 = V02.x(q8);
        if (x7 == null || x7.U() != s5.Q.SHOPPING) {
            AbstractC6635a.b("OG-OurActivity", "addItemsFromAd: targetListId \"" + q8 + "\" not a shopping list");
            AbstractC5673x.a("aaAddToListError");
            addToListContent.failed("invalid destination list");
            return;
        }
        AbstractC5673x.a("aaAddToListAuto");
        List e8 = m5.D.e(addToListContent);
        Y02.b("AddItem list picked " + x7.T() + " " + x7.W() + " titles " + e8);
        ArrayList arrayList = new ArrayList();
        for (AddToListItem addToListItem : addToListContent.getItems()) {
            String title = addToListItem.getTitle();
            Y02.b("AddItem adding item " + title);
            Z0 n8 = V02.n(x7, title, getString(M2.f34216x));
            String productImage = addToListItem.getProductImage();
            if (!AbstractC6803e.o(productImage)) {
                String a8 = AbstractC6804f.a();
                Y02.U0(a8, productImage);
                n8 = V02.K0(x7, n8, a8);
                AbstractC5648t2.a(a8, productImage);
            }
            arrayList.add(n8);
            addToListContent.itemAcknowledge(addToListItem);
            m5.D.j(Z0(), x7, title);
        }
        k1(getString(M2.f34224y, AbstractC6803e.r(e8, Locale.getDefault())), x7, arrayList);
    }

    private void J0() {
        InterfaceC5732b interfaceC5732b = this.f34807D;
        if (interfaceC5732b != null) {
            interfaceC5732b.c();
            this.f34807D = null;
        }
    }

    public static void K0() {
        f34803N = 0L;
    }

    private void O0() {
        C c8 = this.f34820w;
        if (c8 != null) {
            c8.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1(Long l8) {
        X0().h().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e1(C5503a2 c5503a2) {
        A2 a22 = A2.f33140n0;
        if (a22.O0()) {
            return;
        }
        AbstractC5673x.a("wearWatchPresentToast");
        View findViewById = findViewById(H2.f33608q1);
        if (findViewById != null) {
            V1.e(findViewById, getString(M2.f33959Q6), true);
            a22.F0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f1(View view) {
        u1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ U1.b g1(U1.b bVar, String str) {
        return str.isEmpty() ? U1.b.ONLINE : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(AddToListContent addToListContent) {
        if (!c1()) {
            f34802M.add(addToListContent);
        } else {
            Y0().b("AddItem direct");
            E0(addToListContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q1() {
        setRequestedOrientation(this.f34818u.getBoolean(this.f34819v, false) ? 5 : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1(U1.b bVar) {
        View view = this.f34811H;
        if (view == null || this.f34812I == null) {
            return;
        }
        U1.b bVar2 = U1.b.ONLINE;
        boolean z7 = bVar != bVar2;
        int i8 = z7 ? 0 : 8;
        if (i8 != view.getVisibility()) {
            AbstractC5673x.a(bVar == bVar2 ? "syncWarningOnline" : bVar == U1.b.NETWORK_UNREACHABLE ? "syncWarningNetwork" : "syncWarningServer");
            if (z7) {
                this.f34812I.setText(bVar == U1.b.NETWORK_UNREACHABLE ? M2.f34198u5 : M2.f34206v5);
            }
            this.f34811H.setVisibility(i8);
        }
    }

    private void u1() {
        AbstractC5673x.a("syncWarningDialog");
        o5.T.t2().c(C2.f33313d).f(M2.f34190t5).d(M2.f34182s5).g(this);
    }

    private void v1() {
        InterfaceC5732b interfaceC5732b = this.f34810G;
        if (interfaceC5732b != null) {
            interfaceC5732b.c();
            this.f34810G = null;
        }
    }

    private void w1() {
        InterfaceC5732b interfaceC5732b = this.f34806C;
        if (interfaceC5732b != null) {
            interfaceC5732b.c();
            this.f34806C = null;
        }
    }

    private void x1() {
        InterfaceC5732b interfaceC5732b = this.f34805B;
        if (interfaceC5732b != null) {
            interfaceC5732b.c();
            this.f34805B = null;
        }
    }

    protected Z0 F0(C5688z0 c5688z0, Z0 z02) {
        C5574j1 V02 = V0();
        Z0 G02 = V02.G0(c5688z0, V02.K0(c5688z0, V02.L0(c5688z0, V02.l(c5688z0, z02.E(), z02.y()), z02.C()), z02.A()), z02.s());
        return z02.u().isEmpty() ? I0(c5688z0, G02) : V02.I0(c5688z0, G02, z02.u());
    }

    protected boolean G0() {
        return true;
    }

    protected boolean H0() {
        return true;
    }

    protected Z0 I0(C5688z0 c5688z0, Z0 z02) {
        Z0 j8;
        if (!z02.u().isEmpty() || A2.f33140n0.e() != EnumC6746l.AC_GUESS) {
            return z02;
        }
        C5574j1 V02 = V0();
        U b8 = X0().g().b(z02.t(), V02.D().g0());
        String b9 = b8.b();
        if (b9 == null && !b8.a().isEmpty() && (j8 = V02.j(((U.a) b8.a().get(0)).b())) != null) {
            b9 = j8.w();
        }
        return b9 != null ? V02.I0(c5688z0, z02, b9) : z02;
    }

    protected void L0() {
        Toolbar toolbar = (Toolbar) findViewById(H2.f33587j1);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            AbstractC0832a supportActionBar = getSupportActionBar();
            if (supportActionBar == null || !G0()) {
                return;
            }
            supportActionBar.s(true);
        }
    }

    protected final void M0() {
        this.f34821x.b();
        if (this.f34822y) {
            return;
        }
        this.f34821x = new m5.z();
        this.f34822y = true;
    }

    protected final void N0() {
        if (this.f34822y) {
            this.f34821x = m5.n.a(this, this.f34814K, Q0());
            this.f34822y = false;
            this.f34804A = SystemClock.elapsedRealtime();
        }
        this.f34821x.c();
    }

    public void P(C5688z0 c5688z0) {
    }

    protected final m5.n P0() {
        return this.f34821x;
    }

    protected m5.p Q0() {
        return m5.p.OTHER;
    }

    protected int R0() {
        int i8 = c.f34826a[A2.f33140n0.g().ordinal()];
        if (i8 != 2) {
            return i8 != 3 ? 0 : 8192;
        }
        return 16384;
    }

    protected final SharedPreferences S0() {
        return this.f34818u;
    }

    protected final Handler T0() {
        return OurApplication.j();
    }

    protected final InputMethodManager U0() {
        if (this.f34817t == null) {
            this.f34817t = (InputMethodManager) getSystemService("input_method");
        }
        return this.f34817t;
    }

    protected final C5574j1 V0() {
        return X0().i();
    }

    protected final U1 W0() {
        return X0().k();
    }

    protected final OurApplication X0() {
        return (OurApplication) super.getApplication();
    }

    protected final L4 Y0() {
        return X0().n();
    }

    protected final C5587k6 Z0() {
        return X0().o();
    }

    protected final void a1(View view) {
        P1.A(U0(), view);
    }

    protected final void b1(View view) {
        P1.B(T0(), U0(), view);
    }

    public final boolean c1() {
        return this.f34823z;
    }

    @Override // androidx.appcompat.app.AbstractActivityC0835d, androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        O0();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        O0();
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (AndroidRuntimeException e8) {
            AbstractC6635a.b("OG-OurActivity", "Got AndroidRuntimeException in dispatchTouchEvent(): " + e8.getMessage());
            return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        O0();
        return super.dispatchTrackballEvent(motionEvent);
    }

    public void j1(C5587k6.b bVar) {
    }

    protected void k1(CharSequence charSequence, C5688z0 c5688z0, List list) {
        AbstractC6635a.b("OG-OurActivity", "onItemsAddedFromAd not implemented for class " + getClass().getSimpleName());
        View findViewById = findViewById(H2.f33608q1);
        if (findViewById != null) {
            V1.e(findViewById, charSequence, true);
        }
    }

    protected final boolean l1() {
        boolean a8 = AbstractC5595l6.a(this, Z0());
        if (!a8 && !A2.f33140n0.X()) {
            a8 = W.a(this);
        }
        return !a8 ? Q2.a(this) : a8;
    }

    protected void m1(C5688z0 c5688z0) {
        c5688z0.i0(this, V0().D());
    }

    protected final void n1() {
        if (this.f34822y) {
            return;
        }
        M0();
        N0();
    }

    protected View o1(int i8, int i9) {
        AbstractC0832a supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException("no action bar in activity");
        }
        supportActionBar.t(16);
        View inflate = getLayoutInflater().inflate(i8, (ViewGroup) null);
        supportActionBar.q(inflate);
        inflate.findViewById(i9).setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34764o.h1(view);
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f34816s = R4.f(this);
        super.onCreate(bundle);
        this.f34819v = getString(M2.f34148o3);
        SharedPreferences b8 = androidx.preference.k.b(getApplicationContext());
        this.f34818u = b8;
        b8.registerOnSharedPreferenceChangeListener(this.f34815o);
        q1();
        V0().o(this);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        V0().x0(this);
        this.f34818u.unregisterOnSharedPreferenceChangeListener(this.f34815o);
        this.f34821x.e();
        super.onDestroy();
        R4.a aVar = this.f34816s;
        if (aVar != null) {
            aVar.b();
            this.f34816s = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC0835d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onPause() {
        super.onPause();
        J0();
        this.f34821x.g();
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        C5688z0 x7;
        super.onRestoreInstanceState(bundle);
        String string = bundle.getString("com.headcode.ourgroceries.android.OurActivity.PrintingListId");
        if (string == null || (x7 = V0().x(string)) == null) {
            return;
        }
        m1(x7);
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f34821x.h();
        AbstractC5517c0.c(this, null);
        X0().k().j(this);
        X0().o().I();
        J0();
        this.f34807D = AbstractC0829f.w(0L, 20L, TimeUnit.SECONDS, AbstractC1021a.a()).E(new f6.d() { // from class: com.headcode.ourgroceries.android.b2
            @Override // f6.d
            public final void accept(Object obj) {
                this.f34656o.d1((Long) obj);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > f34803N + f34801L && Z0().w0(this)) {
            f34803N = currentTimeMillis;
        }
        View findViewById = findViewById(H2.f33608q1);
        if (findViewById != null) {
            V1.c(findViewById);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        PrintJobInfo info;
        super.onSaveInstanceState(bundle);
        PrintJob printJob = this.f34808E;
        if (printJob == null || this.f34809F == null || (info = printJob.getInfo()) == null || info.getState() != 1) {
            return;
        }
        bundle.putString("com.headcode.ourgroceries.android.OurActivity.PrintingListId", this.f34809F);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onStart() {
        super.onStart();
        X0().u(this);
        this.f34823z = true;
        X0().f().m(this);
        x1();
        this.f34805B = D6.f33357d.f33360a.t(new f6.i() { // from class: com.headcode.ourgroceries.android.c2
            @Override // f6.i
            public final boolean test(Object obj) {
                return ((C5503a2) obj).d();
            }
        }).u().a(new f6.d() { // from class: com.headcode.ourgroceries.android.d2
            @Override // f6.d
            public final void accept(Object obj) {
                this.f34677o.e1((C5503a2) obj);
            }
        });
        w1();
        this.f34806C = Z0().N().E(new f6.d() { // from class: com.headcode.ourgroceries.android.e2
            @Override // f6.d
            public final void accept(Object obj) {
                this.f34689o.j1((C5587k6.b) obj);
            }
        });
        this.f34821x.i();
        if (SystemClock.elapsedRealtime() - this.f34804A >= Config.DEFAULT_AD_POLLING) {
            n1();
        }
        C c8 = this.f34820w;
        if (c8 != null) {
            c8.p();
        }
        if (!this.f34813J) {
            this.f34813J = true;
            View findViewById = findViewById(H2.f33521M0);
            this.f34811H = findViewById;
            if (findViewById != null) {
                this.f34812I = (TextView) findViewById.findViewById(H2.f33486A1);
                this.f34811H.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.f2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f34731o.f1(view);
                    }
                });
            } else {
                this.f34812I = null;
            }
        }
        v1();
        if (this.f34811H != null && A2.f33140n0.U(s5.G.FEATURE_CONNECTIVITY_WARNING)) {
            this.f34810G = AbstractC0829f.h(W0().e(), A2.f33140n0.x(), new f6.b() { // from class: com.headcode.ourgroceries.android.g2
                @Override // f6.b
                public final Object apply(Object obj, Object obj2) {
                    return AbstractActivityC5575j2.g1((U1.b) obj, (String) obj2);
                }
            }).E(new f6.d() { // from class: com.headcode.ourgroceries.android.h2
                @Override // f6.d
                public final void accept(Object obj) {
                    this.f34753o.t1((U1.b) obj);
                }
            });
        }
        List list = f34802M;
        if (!list.isEmpty()) {
            Y0().b("AddItem deferred");
            E0((AddToListContent) list.remove(0));
        }
        if (o5.V.v2(this, getSupportFragmentManager()) || !H0()) {
            return;
        }
        o5.j0.v2(this, getSupportFragmentManager());
    }

    @Override // androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f34823z = false;
        X0().v(this);
        v1();
        x1();
        w1();
        this.f34821x.j();
        C c8 = this.f34820w;
        if (c8 != null) {
            c8.q();
        }
    }

    protected final void p1(ViewGroup viewGroup) {
        if (this.f34820w == null) {
            this.f34820w = new C(viewGroup);
        }
    }

    protected void r1(PrintJob printJob, String str) {
        this.f34808E = printJob;
        this.f34809F = str;
    }

    protected final void s1(TextView textView) {
        P1.T(T0(), U0(), textView);
    }

    @Override // o5.h0.a
    public void w() {
        X0().f().h(this);
    }
}
