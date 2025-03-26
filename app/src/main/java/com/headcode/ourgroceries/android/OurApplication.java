package com.headcode.ourgroceries.android;

import a6.AbstractC0829f;
import android.app.Activity;
import android.content.SharedPreferences;
import android.net.SSLSessionCache;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.C5574j1;
import d6.InterfaceC5732b;
import java.util.HashSet;
import java.util.Set;
import q5.AbstractC6635a;
import s5.S;
import t5.AbstractC6803e;
import v6.C6845a;

/* loaded from: classes2.dex */
public class OurApplication extends U0.b {

    /* renamed from: G, reason: collision with root package name */
    private static Handler f34285G;

    /* renamed from: H, reason: collision with root package name */
    public static OurApplication f34286H;

    /* renamed from: A, reason: collision with root package name */
    private C5650t4 f34287A;

    /* renamed from: B, reason: collision with root package name */
    private T f34288B;

    /* renamed from: C, reason: collision with root package name */
    private SSLSessionCache f34289C;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC5732b f34291E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC5732b f34292F;

    /* renamed from: u, reason: collision with root package name */
    private C5587k6 f34296u;

    /* renamed from: v, reason: collision with root package name */
    private H0 f34297v;

    /* renamed from: w, reason: collision with root package name */
    private C5574j1 f34298w;

    /* renamed from: x, reason: collision with root package name */
    private L4 f34299x;

    /* renamed from: y, reason: collision with root package name */
    private m5.i f34300y;

    /* renamed from: z, reason: collision with root package name */
    private U1 f34301z;

    /* renamed from: o, reason: collision with root package name */
    private final Set f34293o = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    private final C6845a f34294s = C6845a.P(0);

    /* renamed from: t, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f34295t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.headcode.ourgroceries.android.n2
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.f34945o.q(sharedPreferences, str);
        }
    };

    /* renamed from: D, reason: collision with root package name */
    private boolean f34290D = true;

    class a implements A2.c {
        a() {
        }

        @Override // com.headcode.ourgroceries.android.A2.c
        public void a(A2.c.a aVar) {
            if (aVar == A2.c.a.CLIENT_ID) {
                AbstractC5673x.d(OurApplication.this);
            }
        }
    }

    class b implements F1.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F1.a f34303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A2 f34304b;

        b(F1.a aVar, A2 a22) {
            this.f34303a = aVar;
            this.f34304b = a22;
        }

        @Override // F1.c
        public void a(int i8) {
            if (i8 != 0) {
                return;
            }
            try {
                this.f34304b.p0(AbstractC6803e.w(this.f34303a.b().a()));
                OurApplication.this.n().J0();
            } catch (RemoteException e8) {
                AbstractC6635a.c("OG-Application", e8);
            }
            this.f34303a.a();
        }

        @Override // F1.c
        public void b() {
        }
    }

    static {
        System.loadLibrary("ourgroceries");
    }

    private void e(A2 a22) {
        if (a22.p() != null) {
            return;
        }
        F1.a a8 = F1.a.c(this).a();
        a8.d(new b(a8, a22));
    }

    public static Handler j() {
        if (f34285G == null) {
            f34285G = new Handler(Looper.getMainLooper());
        }
        return f34285G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(SharedPreferences sharedPreferences, String str) {
        if (ShoppingListActivity.h2(str)) {
            OurAppWidgetProvider.j(this, false);
        }
        D6.f33357d.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean r(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(C5688z0 c5688z0) {
        OurAppWidgetProvider.j(this, false);
        D6.f33357d.P(c5688z0);
        Shortcuts.i(this, i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(A2 a22, String str) {
        String D7 = a22.D();
        if (!AbstractC6803e.o(D7) && D7.equalsIgnoreCase(str)) {
            AbstractC6635a.d("OG-Application", "Accepted to requested account: " + str);
        }
        if (AbstractC6803e.o(str)) {
            return;
        }
        a22.z0("");
    }

    public m5.i f() {
        return this.f34300y;
    }

    public T g() {
        return this.f34288B;
    }

    public H0 h() {
        return this.f34297v;
    }

    public C5574j1 i() {
        return this.f34298w;
    }

    public U1 k() {
        return this.f34301z;
    }

    public C5650t4 l() {
        return this.f34287A;
    }

    public SSLSessionCache m() {
        return this.f34289C;
    }

    public L4 n() {
        return this.f34299x;
    }

    public C5587k6 o() {
        return this.f34296u;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        AbstractC6635a.a("OG-Application", "onCreate ************************************************************");
        Z0.O(this);
        A2.T(this);
        final A2 a22 = A2.f33140n0;
        com.google.firebase.f.q(this);
        AbstractC5673x.e(this);
        AbstractRunnableC5500a.e(this);
        m5.D.h(this);
        m5.u.t(this, a22);
        this.f34287A = new C5650t4(this);
        this.f34289C = new SSLSessionCache(this);
        this.f34296u = new C5587k6(this);
        this.f34300y = new m5.i(this);
        this.f34297v = new H0(this, this.f34296u);
        this.f34298w = new C5574j1(this);
        L4 l42 = new L4(this, this.f34296u, this.f34294s);
        this.f34299x = l42;
        this.f34301z = new U1(this, l42);
        this.f34298w.Q0(this.f34299x);
        this.f34299x.S0(this.f34298w);
        m5.D.s(this.f34299x);
        String I7 = this.f34298w.I();
        if (I7 != null) {
            this.f34299x.a(S.c.WARN, "Error loading lists (" + I7 + ")");
        }
        OurAppWidgetProvider.e(this, a22);
        this.f34298w.r();
        this.f34288B = new T(this);
        this.f34292F = AbstractC0829f.h(this.f34299x.b0(), this.f34298w.c0(), new f6.b() { // from class: com.headcode.ourgroceries.android.o2
            @Override // f6.b
            public final Object apply(Object obj, Object obj2) {
                return OurApplication.r((Boolean) obj, (Boolean) obj2);
            }
        }).k(X2.f(L4.Q() * 2)).E(SyncService.b(this));
        this.f34298w.o(new C5574j1.d() { // from class: com.headcode.ourgroceries.android.p2
            @Override // com.headcode.ourgroceries.android.C5574j1.d
            public final void P(C5688z0 c5688z0) {
                this.f34967o.s(c5688z0);
            }
        });
        androidx.preference.k.b(this).registerOnSharedPreferenceChangeListener(this.f34295t);
        D6.f33357d.t(this);
        AbstractC5673x.d(this);
        a22.c(new a());
        this.f34291E = a22.x().E(new f6.d() { // from class: com.headcode.ourgroceries.android.q2
            @Override // f6.d
            public final void accept(Object obj) {
                OurApplication.t(a22, (String) obj);
            }
        });
        e(a22);
        O.y(this);
        f34286H = this;
    }

    public boolean p() {
        return this.f34290D;
    }

    public void u(Activity activity) {
        if (!this.f34293o.add(activity)) {
            AbstractC6635a.f("OG-Application", "Activity " + activity + " was already started");
        }
        this.f34294s.b(Integer.valueOf(this.f34293o.size()));
    }

    public void v(Activity activity) {
        if (!this.f34293o.remove(activity)) {
            AbstractC6635a.f("OG-Application", "Activity " + activity + " was not already started");
        }
        this.f34294s.b(Integer.valueOf(this.f34293o.size()));
    }

    public void w(boolean z7) {
        this.f34290D = z7;
    }
}
