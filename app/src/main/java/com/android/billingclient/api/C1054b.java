package com.android.billingclient.api;

import E1.C0561a;
import E1.C0565e;
import E1.C0567g;
import E1.InterfaceC0562b;
import E1.InterfaceC0563c;
import E1.InterfaceC0564d;
import E1.InterfaceC0566f;
import E1.InterfaceC0568h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import com.google.android.gms.internal.play_billing.AbstractC5114g0;
import com.google.android.gms.internal.play_billing.C5112f4;
import com.google.android.gms.internal.play_billing.C5124h4;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.InterfaceC5107f;
import com.google.android.gms.internal.play_billing.J4;
import com.google.android.gms.internal.play_billing.L3;
import com.google.android.gms.internal.play_billing.L4;
import com.google.android.gms.internal.play_billing.O3;
import com.google.android.gms.internal.play_billing.Q3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* renamed from: com.android.billingclient.api.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1054b extends AbstractC1053a {

    /* renamed from: A, reason: collision with root package name */
    private boolean f12382A;

    /* renamed from: B, reason: collision with root package name */
    private C1058f f12383B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f12384C;

    /* renamed from: D, reason: collision with root package name */
    private ExecutorService f12385D;

    /* renamed from: E, reason: collision with root package name */
    private volatile A1 f12386E;

    /* renamed from: F, reason: collision with root package name */
    private final Long f12387F;

    /* renamed from: a, reason: collision with root package name */
    private final Object f12388a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f12389b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12390c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f12391d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Q f12392e;

    /* renamed from: f, reason: collision with root package name */
    private Context f12393f;

    /* renamed from: g, reason: collision with root package name */
    private G f12394g;

    /* renamed from: h, reason: collision with root package name */
    private volatile InterfaceC5107f f12395h;

    /* renamed from: i, reason: collision with root package name */
    private volatile ServiceConnectionC1070s f12396i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12397j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12398k;

    /* renamed from: l, reason: collision with root package name */
    private int f12399l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12400m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12401n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12402o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12403p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12404q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f12405r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12406s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12407t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f12408u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12409v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f12410w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f12411x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f12412y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f12413z;

    C1054b(String str, Context context, G g8, ExecutorService executorService) {
        this.f12388a = new Object();
        this.f12389b = 0;
        this.f12391d = new Handler(Looper.getMainLooper());
        this.f12399l = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.f12387F = valueOf;
        String J7 = J();
        this.f12390c = J7;
        this.f12393f = context.getApplicationContext();
        C5112f4 G7 = C5124h4.G();
        G7.x(J7);
        G7.w(this.f12393f.getPackageName());
        G7.v(valueOf.longValue());
        this.f12394g = new I(this.f12393f, (C5124h4) G7.p());
        this.f12393f.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1057e I() {
        C1057e c1057e;
        int i8 = 0;
        int[] iArr = {0, 3};
        synchronized (this.f12388a) {
            while (true) {
                if (i8 >= 2) {
                    c1057e = H.f12306k;
                    break;
                }
                if (this.f12389b == iArr[i8]) {
                    c1057e = H.f12308m;
                    break;
                }
                i8++;
            }
        }
        return c1057e;
    }

    private static String J() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    private final synchronized ExecutorService K() {
        try {
            if (this.f12385D == null) {
                this.f12385D = Executors.newFixedThreadPool(AbstractC5103e1.f29892a, new ThreadFactoryC1066n(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12385D;
    }

    private final void L(C0565e c0565e, InterfaceC0566f interfaceC0566f) {
        InterfaceC5107f interfaceC5107f;
        int j12;
        String str;
        String a8 = c0565e.a();
        try {
            AbstractC5103e1.i("BillingClient", "Consuming purchase with token: " + a8);
            synchronized (this.f12388a) {
                interfaceC5107f = this.f12395h;
            }
            if (interfaceC5107f == null) {
                Z(interfaceC0566f, a8, H.f12308m, 119, "Service has been reset to null.", null);
                return;
            }
            if (this.f12402o) {
                String packageName = this.f12393f.getPackageName();
                boolean z7 = this.f12402o;
                String str2 = this.f12390c;
                long longValue = this.f12387F.longValue();
                Bundle bundle = new Bundle();
                if (z7) {
                    AbstractC5103e1.c(bundle, str2, longValue);
                }
                Bundle n12 = interfaceC5107f.n1(9, packageName, a8, bundle);
                j12 = n12.getInt("RESPONSE_CODE");
                str = AbstractC5103e1.f(n12, "BillingClient");
            } else {
                j12 = interfaceC5107f.j1(3, this.f12393f.getPackageName(), a8);
                str = "";
            }
            C1057e a9 = H.a(j12, str);
            if (j12 == 0) {
                AbstractC5103e1.i("BillingClient", "Successfully consumed purchase.");
                interfaceC0566f.a(a9, a8);
            } else {
                Z(interfaceC0566f, a8, a9, 23, "Error consuming purchase with token. Response code: " + j12, null);
            }
        } catch (DeadObjectException e8) {
            Z(interfaceC0566f, a8, H.f12308m, 29, "Error consuming purchase!", e8);
        } catch (Exception e9) {
            Z(interfaceC0566f, a8, H.f12306k, 29, "Error consuming purchase!", e9);
        }
    }

    private final void M(L3 l32) {
        try {
            this.f12394g.e(l32, this.f12399l);
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingClient", "Unable to log.", th);
        }
    }

    private final void N(Q3 q32) {
        try {
            this.f12394g.f(q32, this.f12399l);
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingClient", "Unable to log.", th);
        }
    }

    private final void O(String str, final InterfaceC0568h interfaceC0568h) {
        if (!d()) {
            C1057e c1057e = H.f12308m;
            t0(2, 11, c1057e);
            interfaceC0568h.a(c1057e, null);
        } else if (m(new CallableC1068p(this, str, interfaceC0568h), 30000L, new Runnable() { // from class: com.android.billingclient.api.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f12457o.f0(interfaceC0568h);
            }
        }, o0(), K()) == null) {
            C1057e I7 = I();
            t0(25, 11, I7);
            interfaceC0568h.a(I7, null);
        }
    }

    private final void P(String str, final E1.i iVar) {
        if (!d()) {
            C1057e c1057e = H.f12308m;
            t0(2, 9, c1057e);
            iVar.a(c1057e, AbstractC5114g0.s());
        } else {
            if (TextUtils.isEmpty(str)) {
                AbstractC5103e1.j("BillingClient", "Please provide a valid product type.");
                C1057e c1057e2 = H.f12303h;
                t0(50, 9, c1057e2);
                iVar.a(c1057e2, AbstractC5114g0.s());
                return;
            }
            if (m(new CallableC1067o(this, str, iVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12449o.g0(iVar);
                }
            }, o0(), K()) == null) {
                C1057e I7 = I();
                t0(25, 9, I7);
                iVar.a(I7, AbstractC5114g0.s());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(int i8) {
        synchronized (this.f12388a) {
            try {
                if (this.f12389b == 3) {
                    return;
                }
                AbstractC5103e1.i("BillingClient", "Setting clientState from " + T(this.f12389b) + " to " + T(i8));
                this.f12389b = i8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        synchronized (this.f12388a) {
            if (this.f12396i != null) {
                try {
                    this.f12393f.unbindService(this.f12396i);
                } catch (Throwable th) {
                    try {
                        AbstractC5103e1.k("BillingClient", "There was an exception while unbinding service!", th);
                        this.f12395h = null;
                        this.f12396i = null;
                    } finally {
                        this.f12395h = null;
                        this.f12396i = null;
                    }
                }
            }
        }
    }

    private final boolean S() {
        return this.f12410w && this.f12383B.b();
    }

    private static final String T(int i8) {
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    private final C1072u U(C1057e c1057e, int i8, String str, Exception exc) {
        AbstractC5103e1.k("BillingClient", str, exc);
        u0(i8, 11, c1057e, F.a(exc));
        return new C1072u(c1057e, null);
    }

    private final E1.D V(int i8, C1057e c1057e, int i9, String str, Exception exc) {
        u0(i9, 9, c1057e, F.a(exc));
        AbstractC5103e1.k("BillingClient", str, exc);
        return new E1.D(c1057e, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E1.D W(String str, int i8) {
        InterfaceC5107f interfaceC5107f;
        AbstractC5103e1.i("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle d8 = AbstractC5103e1.d(this.f12402o, this.f12410w, this.f12383B.a(), this.f12383B.b(), this.f12390c, this.f12387F.longValue());
        String str2 = null;
        do {
            try {
                synchronized (this.f12388a) {
                    interfaceC5107f = this.f12395h;
                }
                if (interfaceC5107f == null) {
                    return V(9, H.f12308m, 119, "Service has been reset to null", null);
                }
                Bundle v62 = this.f12402o ? interfaceC5107f.v6(true != this.f12410w ? 9 : 19, this.f12393f.getPackageName(), str, str2, d8) : interfaceC5107f.b3(3, this.f12393f.getPackageName(), str, str2);
                M a8 = N.a(v62, "BillingClient", "getPurchase()");
                C1057e a9 = a8.a();
                if (a9 != H.f12307l) {
                    return V(9, a9, a8.b(), "Purchase bundle invalid", null);
                }
                ArrayList<String> stringArrayList = v62.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = v62.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = v62.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z7 = false;
                for (int i9 = 0; i9 < stringArrayList2.size(); i9++) {
                    String str3 = stringArrayList2.get(i9);
                    String str4 = stringArrayList3.get(i9);
                    AbstractC5103e1.i("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i9))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.c())) {
                            AbstractC5103e1.j("BillingClient", "BUG: empty/null token!");
                            z7 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e8) {
                        return V(9, H.f12306k, 51, "Got an exception trying to decode the purchase!", e8);
                    }
                }
                if (z7) {
                    t0(26, 9, H.f12306k);
                }
                str2 = v62.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC5103e1.i("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (DeadObjectException e9) {
                return V(9, H.f12308m, 52, "Got exception trying to get purchases try to reconnect", e9);
            } catch (Exception e10) {
                return V(9, H.f12306k, 52, "Got exception trying to get purchases try to reconnect", e10);
            }
        } while (!TextUtils.isEmpty(str2));
        return new E1.D(H.f12307l, arrayList);
    }

    private final O X(C1057e c1057e, int i8, String str, Exception exc) {
        AbstractC5103e1.k("BillingClient", str, exc);
        u0(i8, 8, c1057e, F.a(exc));
        return new O(c1057e.b(), c1057e.a(), null);
    }

    private final void Y(InterfaceC0562b interfaceC0562b, C1057e c1057e, int i8, Exception exc) {
        AbstractC5103e1.k("BillingClient", "Error in acknowledge purchase!", exc);
        u0(i8, 3, c1057e, F.a(exc));
        interfaceC0562b.a(c1057e);
    }

    private final void Z(InterfaceC0566f interfaceC0566f, String str, C1057e c1057e, int i8, String str2, Exception exc) {
        AbstractC5103e1.k("BillingClient", str2, exc);
        u0(i8, 4, c1057e, F.a(exc));
        interfaceC0566f.a(c1057e, str);
    }

    static /* bridge */ /* synthetic */ boolean j0(C1054b c1054b) {
        boolean z7;
        synchronized (c1054b.f12388a) {
            z7 = true;
            if (c1054b.f12389b != 1) {
                z7 = false;
            }
        }
        return z7;
    }

    private void k(Context context, E1.j jVar, C1058f c1058f, E1.o oVar, String str, G g8) {
        this.f12393f = context.getApplicationContext();
        C5112f4 G7 = C5124h4.G();
        G7.x(str);
        G7.w(this.f12393f.getPackageName());
        G7.v(this.f12387F.longValue());
        if (g8 != null) {
            this.f12394g = g8;
        } else {
            this.f12394g = new I(this.f12393f, (C5124h4) G7.p());
        }
        if (jVar == null) {
            AbstractC5103e1.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f12392e = new Q(this.f12393f, jVar, null, oVar, null, this.f12394g);
        this.f12383B = c1058f;
        this.f12384C = oVar != null;
        this.f12393f.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Future m(Callable callable, long j8, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: E1.n
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    AbstractC5103e1.j("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j8 * 0.95d));
            return submit;
        } catch (Exception e8) {
            AbstractC5103e1.k("BillingClient", "Async task throws exception!", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler o0() {
        return Looper.myLooper() == null ? this.f12391d : new Handler(Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1072u p0(String str) {
        InterfaceC5107f interfaceC5107f;
        AbstractC5103e1.i("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle d8 = AbstractC5103e1.d(this.f12402o, this.f12410w, this.f12383B.a(), this.f12383B.b(), this.f12390c, this.f12387F.longValue());
        String str2 = null;
        while (this.f12400m) {
            try {
                synchronized (this.f12388a) {
                    interfaceC5107f = this.f12395h;
                }
                if (interfaceC5107f == null) {
                    return U(H.f12308m, 119, "Service reset to null", null);
                }
                Bundle I12 = interfaceC5107f.I1(6, this.f12393f.getPackageName(), str, str2, d8);
                M a8 = N.a(I12, "BillingClient", "getPurchaseHistory()");
                C1057e a9 = a8.a();
                if (a9 != H.f12307l) {
                    t0(a8.b(), 11, a9);
                    return new C1072u(a9, null);
                }
                ArrayList<String> stringArrayList = I12.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = I12.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = I12.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z7 = false;
                for (int i8 = 0; i8 < stringArrayList2.size(); i8++) {
                    String str3 = stringArrayList2.get(i8);
                    String str4 = stringArrayList3.get(i8);
                    AbstractC5103e1.i("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i8))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            AbstractC5103e1.j("BillingClient", "BUG: empty/null token!");
                            z7 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e8) {
                        return U(H.f12306k, 51, "Got an exception trying to decode the purchase!", e8);
                    }
                }
                if (z7) {
                    t0(26, 11, H.f12306k);
                }
                str2 = I12.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC5103e1.i("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new C1072u(H.f12307l, arrayList);
                }
            } catch (DeadObjectException e9) {
                return U(H.f12308m, 59, "Got exception trying to get purchase history", e9);
            } catch (Exception e10) {
                return U(H.f12306k, 59, "Got exception trying to get purchase history", e10);
            }
        }
        AbstractC5103e1.j("BillingClient", "getPurchaseHistory is not supported on current device");
        return new C1072u(H.f12312q, null);
    }

    private final C1057e q0() {
        AbstractC5103e1.i("BillingClient", "Service connection is valid. No need to re-initialize.");
        O3 D7 = Q3.D();
        D7.v(6);
        J4 C7 = L4.C();
        C7.u(true);
        D7.u(C7);
        N((Q3) D7.p());
        return H.f12307l;
    }

    private final void s0(InterfaceC0564d interfaceC0564d, C1057e c1057e, int i8, Exception exc) {
        AbstractC5103e1.k("BillingClient", "getBillingConfig got an exception.", exc);
        u0(i8, 13, c1057e, F.a(exc));
        interfaceC0564d.a(c1057e, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(int i8, int i9, C1057e c1057e) {
        try {
            M(F.b(i8, i9, c1057e));
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(int i8, int i9, C1057e c1057e, String str) {
        try {
            M(F.c(i8, i9, c1057e, str));
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(int i8) {
        try {
            N(F.d(i8));
        } catch (Throwable th) {
            AbstractC5103e1.k("BillingClient", "Unable to log.", th);
        }
    }

    final G D0() {
        return this.f12394g;
    }

    final C1057e F0(final C1057e c1057e) {
        if (Thread.interrupted()) {
            return c1057e;
        }
        this.f12391d.post(new Runnable() { // from class: com.android.billingclient.api.S
            @Override // java.lang.Runnable
            public final void run() {
                this.f12357o.c0(c1057e);
            }
        });
        return c1057e;
    }

    final O G0(String str, List list, String str2) {
        InterfaceC5107f interfaceC5107f;
        Bundle a52;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i8, i9 > size ? size : i9));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.f12390c);
            try {
                synchronized (this.f12388a) {
                    interfaceC5107f = this.f12395h;
                }
                if (interfaceC5107f == null) {
                    return X(H.f12308m, 119, "Service has been reset to null.", null);
                }
                if (this.f12403p) {
                    String packageName = this.f12393f.getPackageName();
                    int i10 = this.f12399l;
                    boolean a8 = this.f12383B.a();
                    boolean S7 = S();
                    String str3 = this.f12390c;
                    long longValue = this.f12387F.longValue();
                    Bundle bundle2 = new Bundle();
                    if (i10 >= 9) {
                        AbstractC5103e1.c(bundle2, str3, longValue);
                    }
                    if (i10 >= 9 && a8) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    if (S7) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    a52 = interfaceC5107f.f1(10, packageName, str, bundle, bundle2);
                } else {
                    a52 = interfaceC5107f.a5(3, this.f12393f.getPackageName(), str, bundle);
                }
                if (a52 == null) {
                    return X(H.f12291C, 44, "querySkuDetailsAsync got null sku details list", null);
                }
                if (!a52.containsKey("DETAILS_LIST")) {
                    int b8 = AbstractC5103e1.b(a52, "BillingClient");
                    String f8 = AbstractC5103e1.f(a52, "BillingClient");
                    if (b8 == 0) {
                        return X(H.a(6, f8), 45, "getSkuDetails() returned a bundle with neither an error nor a detail list.", null);
                    }
                    return X(H.a(b8, f8), 23, "getSkuDetails() failed. Response code: " + b8, null);
                }
                ArrayList<String> stringArrayList = a52.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return X(H.f12291C, 46, "querySkuDetailsAsync got null response list", null);
                }
                for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                    try {
                        SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i11));
                        AbstractC5103e1.i("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                        arrayList.add(skuDetails);
                    } catch (JSONException e8) {
                        return X(H.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode SkuDetails.", e8);
                    }
                }
                i8 = i9;
            } catch (DeadObjectException e9) {
                return X(H.f12308m, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e9);
            } catch (Exception e10) {
                return X(H.f12306k, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e10);
            }
        }
        return new O(0, "", arrayList);
    }

    final synchronized A1 I0() {
        try {
            if (this.f12386E == null) {
                this.f12386E = H1.a(K());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12386E;
    }

    final /* synthetic */ Object L0(InterfaceC0562b interfaceC0562b, C0561a c0561a) {
        InterfaceC5107f interfaceC5107f;
        try {
            synchronized (this.f12388a) {
                interfaceC5107f = this.f12395h;
            }
            if (interfaceC5107f == null) {
                Y(interfaceC0562b, H.f12308m, 119, null);
                return null;
            }
            String packageName = this.f12393f.getPackageName();
            String a8 = c0561a.a();
            String str = this.f12390c;
            long longValue = this.f12387F.longValue();
            Bundle bundle = new Bundle();
            AbstractC5103e1.c(bundle, str, longValue);
            Bundle Z62 = interfaceC5107f.Z6(9, packageName, a8, bundle);
            interfaceC0562b.a(H.a(AbstractC5103e1.b(Z62, "BillingClient"), AbstractC5103e1.f(Z62, "BillingClient")));
            return null;
        } catch (DeadObjectException e8) {
            Y(interfaceC0562b, H.f12308m, 28, e8);
            return null;
        } catch (Exception e9) {
            Y(interfaceC0562b, H.f12306k, 28, e9);
            return null;
        }
    }

    final /* synthetic */ Object M0(C0565e c0565e, InterfaceC0566f interfaceC0566f) {
        L(c0565e, interfaceC0566f);
        return null;
    }

    final /* synthetic */ Object N0(InterfaceC0564d interfaceC0564d) {
        InterfaceC5107f interfaceC5107f;
        try {
            synchronized (this.f12388a) {
                interfaceC5107f = this.f12395h;
            }
            if (interfaceC5107f == null) {
                s0(interfaceC0564d, H.f12308m, 119, null);
            } else {
                String packageName = this.f12393f.getPackageName();
                String str = this.f12390c;
                long longValue = this.f12387F.longValue();
                Bundle bundle = new Bundle();
                AbstractC5103e1.c(bundle, str, longValue);
                interfaceC5107f.R5(18, packageName, bundle, new BinderC1071t(interfaceC0564d, this.f12394g, this.f12399l, null));
            }
        } catch (DeadObjectException e8) {
            s0(interfaceC0564d, H.f12308m, 62, e8);
        } catch (Exception e9) {
            s0(interfaceC0564d, H.f12306k, 62, e9);
        }
        return null;
    }

    @Override // com.android.billingclient.api.AbstractC1053a
    public void a(final C0561a c0561a, final InterfaceC0562b interfaceC0562b) {
        if (!d()) {
            C1057e c1057e = H.f12308m;
            t0(2, 3, c1057e);
            interfaceC0562b.a(c1057e);
            return;
        }
        if (TextUtils.isEmpty(c0561a.a())) {
            AbstractC5103e1.j("BillingClient", "Please provide a valid purchase token.");
            C1057e c1057e2 = H.f12305j;
            t0(26, 3, c1057e2);
            interfaceC0562b.a(c1057e2);
            return;
        }
        if (!this.f12402o) {
            C1057e c1057e3 = H.f12297b;
            t0(27, 3, c1057e3);
            interfaceC0562b.a(c1057e3);
        } else if (m(new Callable() { // from class: com.android.billingclient.api.U
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f12364o.L0(interfaceC0562b, c0561a);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f12367o.b0(interfaceC0562b);
            }
        }, o0(), K()) == null) {
            C1057e I7 = I();
            t0(25, 3, I7);
            interfaceC0562b.a(I7);
        }
    }

    @Override // com.android.billingclient.api.AbstractC1053a
    public void b(final C0565e c0565e, final InterfaceC0566f interfaceC0566f) {
        if (!d()) {
            C1057e c1057e = H.f12308m;
            t0(2, 4, c1057e);
            interfaceC0566f.a(c1057e, c0565e.a());
        } else if (m(new Callable() { // from class: com.android.billingclient.api.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f12451o.M0(c0565e, interfaceC0566f);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f12454o.d0(interfaceC0566f, c0565e);
            }
        }, o0(), K()) == null) {
            C1057e I7 = I();
            t0(25, 4, I7);
            interfaceC0566f.a(I7, c0565e.a());
        }
    }

    final /* synthetic */ void b0(InterfaceC0562b interfaceC0562b) {
        C1057e c1057e = H.f12309n;
        t0(24, 3, c1057e);
        interfaceC0562b.a(c1057e);
    }

    @Override // com.android.billingclient.api.AbstractC1053a
    public void c(C0567g c0567g, final InterfaceC0564d interfaceC0564d) {
        if (!d()) {
            AbstractC5103e1.j("BillingClient", "Service disconnected.");
            C1057e c1057e = H.f12308m;
            t0(2, 13, c1057e);
            interfaceC0564d.a(c1057e, null);
            return;
        }
        if (!this.f12409v) {
            AbstractC5103e1.j("BillingClient", "Current client doesn't support get billing config.");
            C1057e c1057e2 = H.f12289A;
            t0(32, 13, c1057e2);
            interfaceC0564d.a(c1057e2, null);
            return;
        }
        if (m(new Callable() { // from class: com.android.billingclient.api.W
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f12369o.N0(interfaceC0564d);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f12371o.e0(interfaceC0564d);
            }
        }, o0(), K()) == null) {
            C1057e I7 = I();
            t0(25, 13, I7);
            interfaceC0564d.a(I7, null);
        }
    }

    final /* synthetic */ void c0(C1057e c1057e) {
        if (this.f12392e.d() != null) {
            this.f12392e.d().a(c1057e, null);
        } else {
            AbstractC5103e1.j("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    @Override // com.android.billingclient.api.AbstractC1053a
    public final boolean d() {
        boolean z7;
        synchronized (this.f12388a) {
            try {
                z7 = false;
                if (this.f12389b == 2 && this.f12395h != null && this.f12396i != null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    final /* synthetic */ void d0(InterfaceC0566f interfaceC0566f, C0565e c0565e) {
        C1057e c1057e = H.f12309n;
        t0(24, 4, c1057e);
        interfaceC0566f.a(c1057e, c0565e.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x044d A[Catch: Exception -> 0x0459, CancellationException -> 0x045c, TimeoutException -> 0x045f, TRY_ENTER, TryCatch #6 {CancellationException -> 0x045c, TimeoutException -> 0x045f, Exception -> 0x0459, blocks: (B:172:0x044d, B:180:0x0462, B:182:0x0477, B:206:0x0501, B:205:0x04ef, B:195:0x04cc, B:208:0x0508), top: B:225:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0462 A[Catch: Exception -> 0x0459, CancellationException -> 0x045c, TimeoutException -> 0x045f, TryCatch #6 {CancellationException -> 0x045c, TimeoutException -> 0x045f, Exception -> 0x0459, blocks: (B:172:0x044d, B:180:0x0462, B:182:0x0477, B:206:0x0501, B:205:0x04ef, B:195:0x04cc, B:208:0x0508), top: B:225:0x044b }] */
    @Override // com.android.billingclient.api.AbstractC1053a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.android.billingclient.api.C1057e e(android.app.Activity r31, final com.android.billingclient.api.C1056d r32) {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1054b.e(android.app.Activity, com.android.billingclient.api.d):com.android.billingclient.api.e");
    }

    final /* synthetic */ void e0(InterfaceC0564d interfaceC0564d) {
        C1057e c1057e = H.f12309n;
        t0(24, 13, c1057e);
        interfaceC0564d.a(c1057e, null);
    }

    final /* synthetic */ void f0(InterfaceC0568h interfaceC0568h) {
        C1057e c1057e = H.f12309n;
        t0(24, 11, c1057e);
        interfaceC0568h.a(c1057e, null);
    }

    @Override // com.android.billingclient.api.AbstractC1053a
    public final void g(String str, InterfaceC0568h interfaceC0568h) {
        O(str, interfaceC0568h);
    }

    final /* synthetic */ void g0(E1.i iVar) {
        C1057e c1057e = H.f12309n;
        t0(24, 9, c1057e);
        iVar.a(c1057e, AbstractC5114g0.s());
    }

    @Override // com.android.billingclient.api.AbstractC1053a
    public final void h(String str, E1.i iVar) {
        P(str, iVar);
    }

    final /* synthetic */ void h0(E1.k kVar) {
        C1057e c1057e = H.f12309n;
        t0(24, 8, c1057e);
        kVar.a(c1057e, null);
    }

    @Override // com.android.billingclient.api.AbstractC1053a
    public void i(C1059g c1059g, final E1.k kVar) {
        if (!d()) {
            C1057e c1057e = H.f12308m;
            t0(2, 8, c1057e);
            kVar.a(c1057e, null);
            return;
        }
        final String a8 = c1059g.a();
        final List b8 = c1059g.b();
        if (TextUtils.isEmpty(a8)) {
            AbstractC5103e1.j("BillingClient", "Please fix the input params. SKU type can't be empty.");
            C1057e c1057e2 = H.f12302g;
            t0(49, 8, c1057e2);
            kVar.a(c1057e2, null);
            return;
        }
        if (b8 == null) {
            AbstractC5103e1.j("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            C1057e c1057e3 = H.f12301f;
            t0(48, 8, c1057e3);
            kVar.a(c1057e3, null);
            return;
        }
        final String str = null;
        if (m(new Callable(a8, b8, str, kVar) { // from class: com.android.billingclient.api.Y

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f12374s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ List f12375t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ E1.k f12376u;

            {
                this.f12376u = kVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                O G02 = this.f12373o.G0(this.f12374s, this.f12375t, null);
                this.f12376u.a(H.a(G02.a(), G02.b()), G02.c());
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f12447o.h0(kVar);
            }
        }, o0(), K()) == null) {
            C1057e I7 = I();
            t0(25, 8, I7);
            kVar.a(I7, null);
        }
    }

    @Override // com.android.billingclient.api.AbstractC1053a
    public void j(InterfaceC0563c interfaceC0563c) {
        C1057e c1057e;
        synchronized (this.f12388a) {
            try {
                if (d()) {
                    c1057e = q0();
                } else if (this.f12389b == 1) {
                    AbstractC5103e1.j("BillingClient", "Client is already in the process of connecting to billing service.");
                    c1057e = H.f12300e;
                    t0(37, 6, c1057e);
                } else if (this.f12389b == 3) {
                    AbstractC5103e1.j("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c1057e = H.f12308m;
                    t0(38, 6, c1057e);
                } else {
                    Q(1);
                    R();
                    AbstractC5103e1.i("BillingClient", "Starting in-app billing setup.");
                    this.f12396i = new ServiceConnectionC1070s(this, interfaceC0563c, null);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f12393f.getPackageManager().queryIntentServices(intent, 0);
                    int i8 = 41;
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        Q(0);
                        AbstractC5103e1.i("BillingClient", "Billing service unavailable on device.");
                        c1057e = H.f12298c;
                        t0(i8, 6, c1057e);
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i8 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                AbstractC5103e1.j("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f12390c);
                                synchronized (this.f12388a) {
                                    try {
                                        if (this.f12389b == 2) {
                                            c1057e = q0();
                                        } else if (this.f12389b != 1) {
                                            AbstractC5103e1.j("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c1057e = H.f12308m;
                                            t0(117, 6, c1057e);
                                        } else {
                                            ServiceConnectionC1070s serviceConnectionC1070s = this.f12396i;
                                            if (this.f12393f.bindService(intent2, serviceConnectionC1070s, 1)) {
                                                AbstractC5103e1.i("BillingClient", "Service was bonded successfully.");
                                                c1057e = null;
                                            } else {
                                                AbstractC5103e1.j("BillingClient", "Connection to Billing service is blocked.");
                                                i8 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            AbstractC5103e1.j("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        Q(0);
                        AbstractC5103e1.i("BillingClient", "Billing service unavailable on device.");
                        c1057e = H.f12298c;
                        t0(i8, 6, c1057e);
                    }
                }
            } finally {
            }
        }
        if (c1057e != null) {
            interfaceC0563c.a(c1057e);
        }
    }

    final /* synthetic */ Bundle x0(int i8, String str, String str2, C1056d c1056d, Bundle bundle) {
        InterfaceC5107f interfaceC5107f;
        try {
            synchronized (this.f12388a) {
                interfaceC5107f = this.f12395h;
            }
            return interfaceC5107f == null ? AbstractC5103e1.l(H.f12308m, 119) : interfaceC5107f.V4(i8, this.f12393f.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e8) {
            return AbstractC5103e1.m(H.f12308m, 5, F.a(e8));
        } catch (Exception e9) {
            return AbstractC5103e1.m(H.f12306k, 5, F.a(e9));
        }
    }

    final /* synthetic */ Bundle y0(String str, String str2) {
        InterfaceC5107f interfaceC5107f;
        try {
            synchronized (this.f12388a) {
                interfaceC5107f = this.f12395h;
            }
            return interfaceC5107f == null ? AbstractC5103e1.l(H.f12308m, 119) : interfaceC5107f.n3(3, this.f12393f.getPackageName(), str, str2, null);
        } catch (DeadObjectException e8) {
            return AbstractC5103e1.m(H.f12308m, 5, F.a(e8));
        } catch (Exception e9) {
            return AbstractC5103e1.m(H.f12306k, 5, F.a(e9));
        }
    }

    C1054b(String str, C1058f c1058f, Context context, E1.A a8, G g8, ExecutorService executorService) {
        this.f12388a = new Object();
        this.f12389b = 0;
        this.f12391d = new Handler(Looper.getMainLooper());
        this.f12399l = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.f12387F = valueOf;
        this.f12390c = J();
        this.f12393f = context.getApplicationContext();
        C5112f4 G7 = C5124h4.G();
        G7.x(J());
        G7.w(this.f12393f.getPackageName());
        G7.v(valueOf.longValue());
        this.f12394g = new I(this.f12393f, (C5124h4) G7.p());
        AbstractC5103e1.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f12392e = new Q(this.f12393f, null, null, null, null, this.f12394g);
        this.f12383B = c1058f;
        this.f12393f.getPackageName();
    }

    C1054b(String str, C1058f c1058f, Context context, E1.j jVar, E1.o oVar, G g8, ExecutorService executorService) {
        String J7 = J();
        this.f12388a = new Object();
        this.f12389b = 0;
        this.f12391d = new Handler(Looper.getMainLooper());
        this.f12399l = 0;
        this.f12387F = Long.valueOf(new Random().nextLong());
        this.f12390c = J7;
        k(context, jVar, c1058f, null, J7, null);
    }
}
