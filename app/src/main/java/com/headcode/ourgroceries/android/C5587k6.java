package com.headcode.ourgroceries.android;

import E1.C0561a;
import E1.C0565e;
import E1.C0567g;
import E1.InterfaceC0562b;
import E1.InterfaceC0563c;
import E1.InterfaceC0564d;
import E1.InterfaceC0566f;
import E1.InterfaceC0568h;
import a6.AbstractC0829f;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC0835d;
import c6.AbstractC1021a;
import com.android.billingclient.api.AbstractC1053a;
import com.android.billingclient.api.C1055c;
import com.android.billingclient.api.C1057e;
import com.android.billingclient.api.C1058f;
import com.android.billingclient.api.C1059g;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.headcode.ourgroceries.android.C5587k6;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import q5.AbstractC6635a;
import s5.C6755v;
import v6.C6845a;
import v6.C6846b;
import y0.InterfaceC6936a;

/* renamed from: com.headcode.ourgroceries.android.k6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5587k6 implements E1.j {

    /* renamed from: u, reason: collision with root package name */
    private static final List f34839u = Arrays.asList("personal_lifetime", "personal_nbo");

    /* renamed from: v, reason: collision with root package name */
    private static final List f34840v = Arrays.asList("personal_monthly", "personal_yearly");

    /* renamed from: w, reason: collision with root package name */
    private static final Set f34841w = new HashSet(Arrays.asList("personal_lifetime", "personal_monthly", "personal_yearly"));

    /* renamed from: a, reason: collision with root package name */
    private final Context f34842a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f34843b = OurApplication.j();

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1053a f34844c;

    /* renamed from: d, reason: collision with root package name */
    private final C6845a f34845d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC0829f f34846e;

    /* renamed from: f, reason: collision with root package name */
    private final C6845a f34847f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC0829f f34848g;

    /* renamed from: h, reason: collision with root package name */
    private final C6845a f34849h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC0829f f34850i;

    /* renamed from: j, reason: collision with root package name */
    private final C6846b f34851j;

    /* renamed from: k, reason: collision with root package name */
    private final C6845a f34852k;

    /* renamed from: l, reason: collision with root package name */
    private final C6845a f34853l;

    /* renamed from: m, reason: collision with root package name */
    private final C6845a f34854m;

    /* renamed from: n, reason: collision with root package name */
    private final C6845a f34855n;

    /* renamed from: o, reason: collision with root package name */
    private final C6845a f34856o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC0829f f34857p;

    /* renamed from: q, reason: collision with root package name */
    private final AbstractC0829f f34858q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f34859r;

    /* renamed from: s, reason: collision with root package name */
    private e f34860s;

    /* renamed from: t, reason: collision with root package name */
    private long f34861t;

    /* renamed from: com.headcode.ourgroceries.android.k6$a */
    class a implements InterfaceC0563c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f34862a;

        a(long j8) {
            this.f34862a = j8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g() {
            AbstractC6635a.f("OG-UpgradeManager", "onBillingServiceDisconnected()");
            C5587k6 c5587k6 = C5587k6.this;
            c5587k6.f34861t = Math.min(c5587k6.f34861t * 2, 10000L);
            Handler handler = C5587k6.this.f34843b;
            final C5587k6 c5587k62 = C5587k6.this;
            handler.postDelayed(new Runnable() { // from class: com.headcode.ourgroceries.android.j6
                @Override // java.lang.Runnable
                public final void run() {
                    C5587k6.z(c5587k62);
                }
            }, C5587k6.this.f34861t);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(C1057e c1057e, long j8) {
            int b8 = c1057e.b();
            AbstractC6635a.d("OG-UpgradeManager", "onBillingSetupFinished: " + b8);
            C5587k6.this.f34861t = 100L;
            if (b8 == 0) {
                AbstractC6635a.d("OG-UpgradeManager", "Took " + (SystemClock.elapsedRealtime() - j8) + " ms to connect to Play Store");
                C5587k6.this.I();
                C5587k6.this.q0();
                C5587k6.this.H();
                C5587k6.this.u0();
            }
        }

        @Override // E1.InterfaceC0563c
        public void a(final C1057e c1057e) {
            Handler handler = C5587k6.this.f34843b;
            final long j8 = this.f34862a;
            handler.post(new Runnable() { // from class: com.headcode.ourgroceries.android.h6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34758o.h(c1057e, j8);
                }
            });
        }

        @Override // E1.InterfaceC0563c
        public void b() {
            C5587k6.this.f34843b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.i6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34770o.g();
                }
            });
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.k6$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f34864a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34865b;

        /* renamed from: c, reason: collision with root package name */
        public final e f34866c;

        public b(c cVar, boolean z7, e eVar) {
            this.f34864a = cVar;
            this.f34865b = z7;
            this.f34866c = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f34865b == bVar.f34865b && this.f34864a.equals(bVar.f34864a) && this.f34866c == bVar.f34866c;
        }

        public int hashCode() {
            return Objects.hash(this.f34864a, Boolean.valueOf(this.f34865b), this.f34866c);
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.k6$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Z1 f34867a;

        /* renamed from: b, reason: collision with root package name */
        private final Boolean f34868b;

        public c(Z1 z12, Boolean bool) {
            this.f34867a = z12.d();
            this.f34868b = bool;
        }

        private static e a(Z1 z12, boolean z7) {
            return (z7 || z12.c("personal_lifetime")) ? e.LIFETIME : z12.c("personal_nbo") ? e.NBO : z12.c("personal_yearly") ? e.YEARLY : z12.c("personal_monthly") ? e.MONTHLY : e.NONE;
        }

        public e b() {
            Z1 z12 = this.f34867a;
            Boolean bool = this.f34868b;
            return a(z12, bool != null && bool.booleanValue());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f34867a.equals(cVar.f34867a)) {
                return Objects.equals(this.f34868b, cVar.f34868b);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f34867a, this.f34868b);
        }

        public String toString() {
            return "UpgradeDetails{mIapSet=" + this.f34867a + ", mKeyAppPresent=" + this.f34868b + '}';
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.k6$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f34869a;

        /* renamed from: b, reason: collision with root package name */
        public final String f34870b;

        public d(int i8, String str) {
            this.f34869a = i8;
            this.f34870b = str;
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.k6$e */
    public enum e {
        NONE,
        MONTHLY,
        YEARLY,
        LIFETIME,
        NBO,
        TEAM;

        public boolean c() {
            return (this == LIFETIME || this == NBO || this == TEAM) ? false : true;
        }

        public boolean f() {
            return this != NONE;
        }
    }

    public C5587k6(Context context) {
        C6845a O7 = C6845a.O();
        this.f34845d = O7;
        this.f34846e = O7.n().z(AbstractC1021a.a()).q(X2.l("OG-UpgradeManager", "monthly upgrade sku"));
        C6845a O8 = C6845a.O();
        this.f34847f = O8;
        this.f34848g = O8.n().z(AbstractC1021a.a()).q(X2.l("OG-UpgradeManager", "yearly upgrade sku"));
        C6845a O9 = C6845a.O();
        this.f34849h = O9;
        this.f34850i = O9.n().z(AbstractC1021a.a()).q(X2.l("OG-UpgradeManager", "lifetime upgrade sku"));
        this.f34851j = C6846b.O();
        C6845a O10 = C6845a.O();
        this.f34852k = O10;
        C6845a O11 = C6845a.O();
        this.f34853l = O11;
        C6845a O12 = C6845a.O();
        this.f34854m = O12;
        C6845a P7 = C6845a.P(0L);
        this.f34855n = P7;
        this.f34856o = C6845a.P(Boolean.FALSE);
        AbstractC0829f n8 = AbstractC0829f.h(O10.q(X2.l("OG-UpgradeManager", "iap set")), O11.q(X2.l("OG-UpgradeManager", "key app present")), new f6.b() { // from class: com.headcode.ourgroceries.android.Z5
            @Override // f6.b
            public final Object apply(Object obj, Object obj2) {
                return new C5587k6.c((Z1) obj, (Boolean) obj2);
            }
        }).n();
        this.f34857p = n8;
        AbstractC0829f n9 = AbstractC0829f.g(n8.q(X2.l("OG-UpgradeManager", "local upgrade details")), O12.q(X2.l("OG-UpgradeManager", "team upgraded")), P7.q(X2.l("OG-UpgradeManager", "debug toggle")), new f6.e() { // from class: com.headcode.ourgroceries.android.a6
            @Override // f6.e
            public final Object a(Object obj, Object obj2, Object obj3) {
                return this.f34653a.d0((C5587k6.c) obj, (Boolean) obj2, (Long) obj3);
            }
        }).n();
        this.f34858q = n9;
        this.f34859r = O10.n().E(new f6.d() { // from class: com.headcode.ourgroceries.android.b6
            @Override // f6.d
            public final void accept(Object obj) {
                this.f34661o.e0((Z1) obj);
            }
        });
        this.f34860s = e.NONE;
        this.f34861t = 100L;
        this.f34842a = context;
        O12.b(Boolean.valueOf(A2.f33140n0.L() != 0));
        O10.b(A2.f33140n0.o());
        n9.E(new f6.d() { // from class: com.headcode.ourgroceries.android.c6
            @Override // f6.d
            public final void accept(Object obj) {
                this.f34673o.f0((C5587k6.b) obj);
            }
        });
        this.f34844c = AbstractC1053a.f(context).b(C1058f.c().b().a()).c(this).a();
        t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean F(android.app.Activity r6, com.android.billingclient.api.SkuDetails r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.C5587k6.F(android.app.Activity, com.android.billingclient.api.SkuDetails, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        if (this.f34844c.d()) {
            this.f34844c.g("subs", new InterfaceC0568h() { // from class: com.headcode.ourgroceries.android.N5
                @Override // E1.InterfaceC0568h
                public final void a(C1057e c1057e, List list) {
                    this.f34262a.X(c1057e, list);
                }
            });
        }
    }

    private static String K(Z1 z12) {
        Iterator it = f34840v.iterator();
        while (it.hasNext()) {
            Y1 f8 = z12.f((String) it.next());
            if (f8 != null && f8.g()) {
                return f8.e();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(C1057e c1057e, List list) {
        if (c1057e.b() == 0) {
            this.f34856o.b(Boolean.valueOf(list == null || list.isEmpty()));
        } else {
            this.f34843b.postDelayed(new Runnable() { // from class: com.headcode.ourgroceries.android.Y5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34614o.H();
                }
            }, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(final C1057e c1057e, final List list) {
        this.f34843b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.S5
            @Override // java.lang.Runnable
            public final void run() {
                this.f34413o.W(c1057e, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(Z1 z12, Z1 z13) {
        this.f34852k.b(z12.g(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(final Z1 z12, final Z1 z13) {
        this.f34843b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.g6
            @Override // java.lang.Runnable
            public final void run() {
                this.f34746o.Y(z12, z13);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(final Z1 z12) {
        p0("subs", new InterfaceC6936a() { // from class: com.headcode.ourgroceries.android.d6
            @Override // y0.InterfaceC6936a
            public final void accept(Object obj) {
                this.f34683a.Z(z12, (Z1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(C1057e c1057e, View view) {
        int b8 = c1057e.b();
        if (b8 == 0) {
            I();
            AbstractActivityC5575j2.K0();
            return;
        }
        V1.e(view, "Consume failed: " + b8 + " " + c1057e.a(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(final View view, final C1057e c1057e, String str) {
        this.f34843b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.f6
            @Override // java.lang.Runnable
            public final void run() {
                this.f34735o.b0(c1057e, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b d0(c cVar, Boolean bool, Long l8) {
        e b8;
        if (V.d(this.f34842a)) {
            b8 = V.c(this.f34842a);
        } else {
            b8 = cVar.b();
            e eVar = e.NONE;
            if (b8 == eVar) {
                b8 = bool.booleanValue() ? e.TEAM : eVar;
            }
        }
        return new b(cVar, bool.booleanValue(), b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(Z1 z12) {
        if (this.f34842a != null) {
            A2.f33140n0.o0(z12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(b bVar) {
        this.f34860s = bVar.f34866c;
        AbstractC5673x.a("iapIs" + this.f34860s.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g0(C1057e c1057e) {
        int b8 = c1057e.b();
        if (b8 == 0) {
            AbstractC5673x.a("iapAckSuccess");
            return;
        }
        AbstractC5673x.a("iapAckFail" + b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(final C1057e c1057e) {
        this.f34843b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.V5
            @Override // java.lang.Runnable
            public final void run() {
                C5587k6.g0(c1057e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(InterfaceC6936a interfaceC6936a, C1057e c1057e, List list) {
        int b8 = c1057e.b();
        if (b8 == -1) {
            this.f34843b.postDelayed(new Runnable() { // from class: com.headcode.ourgroceries.android.M5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34241o.t0();
                }
            }, 1000L);
            return;
        }
        if (b8 == 0) {
            interfaceC6936a.accept(o0(list));
            return;
        }
        AbstractC6635a.b("OG-UpgradeManager", "Got unexpected code from queryPurchasesAsync(): " + b8);
        AbstractC5673x.a("iapQueryErr" + b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(final C1057e c1057e, final List list) {
        this.f34843b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.T5
            @Override // java.lang.Runnable
            public final void run() {
                this.f34490o.m0(c1057e, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(C1057e c1057e, List list) {
        AbstractC6635a.d("OG-UpgradeManager", "onSkuDetailsResponse: " + c1057e.b() + " " + list);
        if (c1057e.b() != 0 || list == null) {
            this.f34843b.postDelayed(new Runnable() { // from class: com.headcode.ourgroceries.android.X5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34600o.q0();
                }
            }, 10000L);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it.next();
            AbstractC6635a.d("OG-UpgradeManager", "skuDetails: " + skuDetails);
            if (skuDetails != null) {
                if ("personal_monthly".equals(skuDetails.d())) {
                    this.f34845d.b(skuDetails);
                }
                if ("personal_yearly".equals(skuDetails.d())) {
                    this.f34847f.b(skuDetails);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(final C1057e c1057e, final List list) {
        this.f34843b.post(new Runnable() { // from class: com.headcode.ourgroceries.android.U5
            @Override // java.lang.Runnable
            public final void run() {
                this.f34555o.k0(c1057e, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(C1057e c1057e, List list) {
        AbstractC6635a.d("OG-UpgradeManager", "onSkuDetailsResponse: " + c1057e.b() + " " + list);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = (SkuDetails) it.next();
                AbstractC6635a.d("OG-UpgradeManager", "skuDetails: " + skuDetails);
                if (skuDetails != null && "personal_lifetime".equals(skuDetails.d())) {
                    this.f34849h.b(skuDetails);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n0(C1057e c1057e, C1055c c1055c) {
        String a8;
        if (c1057e.b() != 0 || c1055c == null || (a8 = c1055c.a()) == null || !A2.f33140n0.C0(a8)) {
            return;
        }
        OurApplication.f34286H.n().J0();
    }

    private Z1 o0(List list) {
        Z1 z12 = new Z1();
        AbstractC6635a.d("OG-UpgradeManager", "processPurchases: purchases " + list);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                AbstractC6635a.d("OG-UpgradeManager", "Processing purchase: " + purchase);
                int b8 = purchase.b();
                if (b8 == 2 || b8 == 1) {
                    z12.b(purchase);
                }
                if (b8 == 1 && !purchase.f()) {
                    AbstractC5673x.a("iapAckStart");
                    this.f34844c.a(C0561a.b().b(purchase.c()).a(), new InterfaceC0562b() { // from class: com.headcode.ourgroceries.android.R5
                        @Override // E1.InterfaceC0562b
                        public final void a(C1057e c1057e) {
                            this.f34402a.h0(c1057e);
                        }
                    });
                }
            }
        }
        return z12;
    }

    private void p0(String str, final InterfaceC6936a interfaceC6936a) {
        this.f34844c.h(str, new E1.i() { // from class: com.headcode.ourgroceries.android.e6
            @Override // E1.i
            public final void a(C1057e c1057e, List list) {
                this.f34727a.i0(interfaceC6936a, c1057e, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        this.f34844c.i(C1059g.c().c("inapp").b(f34839u).a(), new E1.k() { // from class: com.headcode.ourgroceries.android.P5
            @Override // E1.k
            public final void a(C1057e c1057e, List list) {
                this.f34328a.j0(c1057e, list);
            }
        });
        this.f34844c.i(C1059g.c().c("subs").b(f34840v).a(), new E1.k() { // from class: com.headcode.ourgroceries.android.Q5
            @Override // E1.k
            public final void a(C1057e c1057e, List list) {
                this.f34352a.l0(c1057e, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        this.f34844c.j(new a(SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        if (this.f34844c.d()) {
            this.f34844c.c(C0567g.a().a(), new InterfaceC0564d() { // from class: com.headcode.ourgroceries.android.O5
                @Override // E1.InterfaceC0564d
                public final void a(C1057e c1057e, C1055c c1055c) {
                    C5587k6.n0(c1057e, c1055c);
                }
            });
        }
    }

    public static void v0(Context context, String str) {
        P1.b0(context, String.format("https://play.google.com/store/account/subscriptions?sku=%s&package=%s", str, "com.headcode.ourgroceries"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void z(C5587k6 c5587k6) {
        c5587k6.t0();
    }

    public boolean D(Activity activity) {
        return F(activity, (SkuDetails) this.f34849h.Q(), "L");
    }

    public boolean E(Activity activity) {
        return F(activity, (SkuDetails) this.f34845d.Q(), "M");
    }

    public boolean G(Activity activity) {
        return F(activity, (SkuDetails) this.f34847f.Q(), "Y");
    }

    public void I() {
        if (this.f34844c.d()) {
            p0("inapp", new InterfaceC6936a() { // from class: com.headcode.ourgroceries.android.L5
                @Override // y0.InterfaceC6936a
                public final void accept(Object obj) {
                    this.f33781a.a0((Z1) obj);
                }
            });
        }
    }

    public void J(final View view) {
        Y1 f8 = ((Z1) this.f34852k.Q()).f("personal_lifetime");
        if (f8 == null || f8.d() == null) {
            V1.e(view, "No purchase to consume", false);
        } else {
            this.f34844c.b(C0565e.b().b(f8.d()).a(), new InterfaceC0566f() { // from class: com.headcode.ourgroceries.android.W5
                @Override // E1.InterfaceC0566f
                public final void a(C1057e c1057e, String str) {
                    this.f34585a.c0(view, c1057e, str);
                }
            });
        }
    }

    public AbstractC0829f L() {
        return this.f34851j.z(AbstractC1021a.a());
    }

    public AbstractC0829f M() {
        return this.f34856o;
    }

    public AbstractC0829f N() {
        return this.f34858q;
    }

    public AbstractC0829f O() {
        return this.f34852k;
    }

    public Boolean P() {
        return (Boolean) this.f34853l.Q();
    }

    public d Q() {
        A2 a22 = A2.f33140n0;
        C6755v j8 = a22.j();
        String K7 = a22.K();
        SkuDetails skuDetails = (SkuDetails) this.f34849h.Q();
        if (j8 == null || K7 == null || !j8.v() || !j8.p().equals(K7) || !j8.x() || !j8.t().equals("personal_lifetime") || !j8.w() || skuDetails == null) {
            return null;
        }
        long c8 = skuDetails.c();
        long s8 = j8.s();
        if (s8 <= 0) {
            return null;
        }
        long j9 = 100 - ((c8 * 100) / s8);
        if (j9 < 10) {
            return null;
        }
        long round = Math.round(j9 / 5.0d) * 5;
        if (round == 45 || round == 55) {
            round = 50;
        }
        if (round >= 100) {
            return null;
        }
        return new d((int) round, skuDetails.b());
    }

    public AbstractC0829f R() {
        return this.f34850i;
    }

    public AbstractC0829f S() {
        return this.f34846e;
    }

    public String T() {
        return K((Z1) this.f34852k.Q());
    }

    public e U() {
        return this.f34860s;
    }

    public AbstractC0829f V() {
        return this.f34848g;
    }

    @Override // E1.j
    public void a(C1057e c1057e, List list) {
        int b8 = c1057e.b();
        if (b8 != 0) {
            AbstractC5673x.a("iapUpdateErr" + b8);
            this.f34851j.b(Integer.valueOf(b8));
            return;
        }
        AbstractC5673x.a("iapUpdateOk");
        I();
        if (list != null) {
            Iterator it = list.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.b() == 1) {
                    Iterator it2 = purchase.e().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (f34841w.contains((String) it2.next())) {
                                z7 = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (z7) {
                this.f34851j.b(Integer.valueOf(b8));
            }
        }
    }

    public void r0(boolean z7) {
        this.f34853l.b(Boolean.valueOf(z7));
    }

    public void s0(boolean z7) {
        if (z7) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - A2.f33140n0.L() < 86400) {
                return;
            } else {
                A2.f33140n0.D0(currentTimeMillis);
            }
        } else if (A2.f33140n0.L() == 0) {
            return;
        } else {
            A2.f33140n0.D0(0L);
        }
        this.f34854m.b(Boolean.valueOf(z7));
    }

    public boolean w0(AbstractActivityC0835d abstractActivityC0835d) {
        String K7;
        Z1 z12 = (Z1) this.f34852k.Q();
        boolean equals = Boolean.TRUE.equals(this.f34853l.Q());
        if ((!z12.c("personal_lifetime") && !z12.c("personal_nbo") && !equals) || (K7 = K(z12)) == null) {
            return false;
        }
        AbstractC5673x.a("uncanceledWarn" + K7.toUpperCase());
        o5.e0.u2(K7, new c(z12, Boolean.valueOf(equals)).b()).r2(abstractActivityC0835d.getSupportFragmentManager(), "unused");
        return true;
    }
}
