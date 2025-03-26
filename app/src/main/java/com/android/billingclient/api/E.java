package com.android.billingclient.api;

import E1.C0561a;
import E1.C0565e;
import E1.InterfaceC0562b;
import E1.InterfaceC0563c;
import E1.InterfaceC0566f;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.billingclient.api.C1057e;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import com.google.android.gms.internal.play_billing.AbstractC5175q1;
import com.google.android.gms.internal.play_billing.B1;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.InterfaceC5143l;
import com.google.android.gms.internal.play_billing.InterfaceFutureC5225z1;
import com.google.android.gms.internal.play_billing.L3;
import com.google.android.gms.internal.play_billing.Q3;
import com.google.android.gms.internal.play_billing.Q4;
import com.google.android.gms.internal.play_billing.U4;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
final class E extends C1054b {

    /* renamed from: G, reason: collision with root package name */
    private final Context f12283G;

    /* renamed from: H, reason: collision with root package name */
    private volatile int f12284H;

    /* renamed from: I, reason: collision with root package name */
    private volatile InterfaceC5143l f12285I;

    /* renamed from: J, reason: collision with root package name */
    private volatile D f12286J;

    /* renamed from: K, reason: collision with root package name */
    private volatile B1 f12287K;

    E(String str, Context context, G g8, ExecutorService executorService) {
        super(null, context, null, null);
        this.f12284H = 0;
        this.f12283G = context;
    }

    private final int Z0(InterfaceFutureC5225z1 interfaceFutureC5225z1) {
        try {
            return ((Integer) interfaceFutureC5225z1.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e8) {
            f1(114, 28, H.f12295G);
            AbstractC5103e1.k("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e8);
            return 0;
        } catch (Exception e9) {
            if (e9 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            f1(107, 28, H.f12295G);
            AbstractC5103e1.k("BillingClientTesting", "An error occurred while retrieving billing override.", e9);
            return 0;
        }
    }

    private final synchronized B1 a1() {
        try {
            if (this.f12287K == null) {
                this.f12287K = H1.b(Executors.newSingleThreadScheduledExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12287K;
    }

    private final synchronized void b1() {
        if (U0()) {
            AbstractC5103e1.i("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            g1(26);
            return;
        }
        int i8 = 1;
        if (this.f12284H == 1) {
            AbstractC5103e1.j("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f12284H == 3) {
            AbstractC5103e1.j("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            f1(38, 26, H.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f12284H = 1;
        AbstractC5103e1.i("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f12286J = new D(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        List<ResolveInfo> queryIntentServices = this.f12283G.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            i8 = 41;
        } else {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    AbstractC5103e1.j("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (this.f12283G.bindService(intent2, this.f12286J, 1)) {
                        AbstractC5103e1.i("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    }
                    AbstractC5103e1.j("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                }
                i8 = 39;
            }
        }
        this.f12284H = 0;
        AbstractC5103e1.i("BillingClientTesting", "Billing Override Service unavailable on device.");
        f1(i8, 26, H.a(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c1(int i8) {
        return i8 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1057e d1(int i8, int i9) {
        C1057e a8 = H.a(i9, "Billing override value was set by a license tester.");
        f1(105, i8, a8);
        return a8;
    }

    private final InterfaceFutureC5225z1 e1(int i8) {
        if (U0()) {
            return U4.a(new C1075x(this, i8));
        }
        AbstractC5103e1.j("BillingClientTesting", "Billing Override Service is not ready.");
        f1(106, 28, H.a(-1, "Billing Override Service connection is disconnected."));
        return AbstractC5175q1.a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1(int i8, int i9, C1057e c1057e) {
        L3 b8 = F.b(i8, i9, c1057e);
        Objects.requireNonNull(b8, "ApiFailure should not be null");
        D0().d(b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g1(int i8) {
        Q3 d8 = F.d(i8);
        Objects.requireNonNull(d8, "ApiSuccess should not be null");
        D0().g(d8);
    }

    private final void h1(int i8, Consumer consumer, Runnable runnable) {
        AbstractC5175q1.c(AbstractC5175q1.b(e1(i8), 28500L, TimeUnit.MILLISECONDS, a1()), new B(this, i8, consumer, runnable), I0());
    }

    final /* synthetic */ void P0(C0561a c0561a, InterfaceC0562b interfaceC0562b) {
        super.a(c0561a, interfaceC0562b);
    }

    final /* synthetic */ void Q0(C0565e c0565e, InterfaceC0566f interfaceC0566f) {
        super.b(c0565e, interfaceC0566f);
    }

    final /* synthetic */ void R0(C1057e c1057e) {
        super.F0(c1057e);
    }

    final /* synthetic */ void S0(C1059g c1059g, E1.k kVar) {
        super.i(c1059g, kVar);
    }

    public final synchronized boolean U0() {
        if (this.f12284H == 2 && this.f12285I != null) {
            if (this.f12286J != null) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ Object W0(int i8, Q4 q42) {
        String str;
        try {
            if (this.f12285I == null) {
                throw null;
            }
            InterfaceC5143l interfaceC5143l = this.f12285I;
            String packageName = this.f12283G.getPackageName();
            switch (i8) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            interfaceC5143l.b2(packageName, str, new C(q42));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e8) {
            f1(107, 28, H.f12295G);
            AbstractC5103e1.k("BillingClientTesting", "An error occurred while retrieving billing override.", e8);
            q42.b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // com.android.billingclient.api.C1054b, com.android.billingclient.api.AbstractC1053a
    public final void a(final C0561a c0561a, final InterfaceC0562b interfaceC0562b) {
        Objects.requireNonNull(interfaceC0562b);
        h1(3, new Consumer() { // from class: E1.s
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                interfaceC0562b.a((C1057e) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f12493o.P0(c0561a, interfaceC0562b);
            }
        });
    }

    @Override // com.android.billingclient.api.C1054b, com.android.billingclient.api.AbstractC1053a
    public final void b(final C0565e c0565e, final InterfaceC0566f interfaceC0566f) {
        h1(4, new Consumer() { // from class: E1.q
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                interfaceC0566f.a((C1057e) obj, c0565e.a());
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f12485o.Q0(c0565e, interfaceC0566f);
            }
        });
    }

    @Override // com.android.billingclient.api.C1054b, com.android.billingclient.api.AbstractC1053a
    public final C1057e e(final Activity activity, final C1056d c1056d) {
        Consumer consumer = new Consumer() { // from class: com.android.billingclient.api.A
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f12276a.R0((C1057e) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12482o.i1(activity, c1056d);
            }
        };
        int Z02 = Z0(e1(2));
        if (c1(Z02)) {
            C1057e d12 = d1(2, Z02);
            consumer.accept(d12);
            return d12;
        }
        try {
            return (C1057e) callable.call();
        } catch (Exception e8) {
            C1057e c1057e = H.f12306k;
            f1(115, 2, c1057e);
            AbstractC5103e1.k("BillingClientTesting", "An internal error occurred.", e8);
            return c1057e;
        }
    }

    @Override // com.android.billingclient.api.C1054b, com.android.billingclient.api.AbstractC1053a
    public final void i(final C1059g c1059g, final E1.k kVar) {
        h1(8, new Consumer() { // from class: E1.r
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                kVar.a((C1057e) obj, null);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f12490o.S0(c1059g, kVar);
            }
        });
    }

    final /* synthetic */ C1057e i1(Activity activity, C1056d c1056d) {
        return super.e(activity, c1056d);
    }

    @Override // com.android.billingclient.api.C1054b, com.android.billingclient.api.AbstractC1053a
    public final void j(InterfaceC0563c interfaceC0563c) {
        b1();
        super.j(interfaceC0563c);
    }

    E(String str, C1058f c1058f, Context context, E1.A a8, G g8, ExecutorService executorService) {
        super(null, c1058f, context, null, null, null);
        this.f12284H = 0;
        this.f12283G = context;
    }

    E(String str, C1058f c1058f, Context context, E1.j jVar, E1.o oVar, G g8, ExecutorService executorService) {
        super(null, c1058f, context, jVar, null, null, null);
        this.f12284H = 0;
        this.f12283G = context;
    }
}
