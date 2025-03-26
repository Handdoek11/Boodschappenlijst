package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import f3.InterfaceC5781e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import v3.C6835a;

/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4889d1 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile C4889d1 f29253j;

    /* renamed from: a, reason: collision with root package name */
    private final String f29254a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC5781e f29255b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f29256c;

    /* renamed from: d, reason: collision with root package name */
    private final C6835a f29257d;

    /* renamed from: e, reason: collision with root package name */
    private final List f29258e;

    /* renamed from: f, reason: collision with root package name */
    private int f29259f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29260g;

    /* renamed from: h, reason: collision with root package name */
    private String f29261h;

    /* renamed from: i, reason: collision with root package name */
    private volatile O0 f29262i;

    /* renamed from: com.google.android.gms.internal.measurement.d1$a */
    abstract class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final long f29263o;

        /* renamed from: s, reason: collision with root package name */
        final long f29264s;

        /* renamed from: t, reason: collision with root package name */
        private final boolean f29265t;

        a(C4889d1 c4889d1) {
            this(true);
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4889d1.this.f29260g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e8) {
                C4889d1.this.q(e8, false, this.f29265t);
                b();
            }
        }

        a(boolean z7) {
            this.f29263o = C4889d1.this.f29255b.a();
            this.f29264s = C4889d1.this.f29255b.b();
            this.f29265t = z7;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.d1$b */
    static class b extends X0 {

        /* renamed from: o, reason: collision with root package name */
        private final w3.t f29267o;

        b(w3.t tVar) {
            this.f29267o = tVar;
        }

        @Override // com.google.android.gms.internal.measurement.U0
        public final void J4(String str, String str2, Bundle bundle, long j8) {
            this.f29267o.a(str, str2, bundle, j8);
        }

        @Override // com.google.android.gms.internal.measurement.U0
        public final int zza() {
            return System.identityHashCode(this.f29267o);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.d1$c */
    class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C4889d1.this.m(new B1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C4889d1.this.m(new G1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C4889d1.this.m(new F1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C4889d1.this.m(new C1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            P0 p02 = new P0();
            C4889d1.this.m(new H1(this, activity, p02));
            Bundle D02 = p02.D0(50L);
            if (D02 != null) {
                bundle.putAll(D02);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C4889d1.this.m(new D1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C4889d1.this.m(new E1(this, activity));
        }
    }

    private C4889d1(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !G(str2, str3)) {
            this.f29254a = "FA";
        } else {
            this.f29254a = str;
        }
        this.f29255b = f3.h.d();
        this.f29256c = H0.a().a(new ThreadFactoryC4968m1(this), 1);
        this.f29257d = new C6835a(this);
        this.f29258e = new ArrayList();
        if (D(context) && !N()) {
            this.f29261h = null;
            this.f29260g = true;
            Log.w(this.f29254a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (G(str2, str3)) {
            this.f29261h = str2;
        } else {
            this.f29261h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f29254a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f29254a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        m(new C4880c1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f29254a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
    }

    private static boolean D(Context context) {
        return new w3.n(context, w3.n.a(context)).b("google_app_id") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G(String str, String str2) {
        return (str2 == null || str == null || N()) ? false : true;
    }

    private final boolean N() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static C4889d1 f(Context context) {
        return g(context, null, null, null, null);
    }

    public static C4889d1 g(Context context, String str, String str2, String str3, Bundle bundle) {
        Z2.r.l(context);
        if (f29253j == null) {
            synchronized (C4889d1.class) {
                try {
                    if (f29253j == null) {
                        f29253j = new C4889d1(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f29253j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(a aVar) {
        this.f29256c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Exception exc, boolean z7, boolean z8) {
        this.f29260g |= z7;
        if (z7) {
            Log.w(this.f29254a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z8) {
            j(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f29254a, "Error with data collection. Data lost.", exc);
    }

    private final void t(String str, String str2, Bundle bundle, boolean z7, boolean z8, Long l8) {
        m(new A1(this, l8, str, str2, bundle, z7, z8));
    }

    public final void A(String str) {
        m(new C4984o1(this, str));
    }

    public final void B(String str, String str2) {
        u(null, str, str2, false);
    }

    public final void C(String str, String str2, Bundle bundle) {
        t(str, str2, bundle, true, true, null);
    }

    public final void E(String str) {
        m(new C4976n1(this, str));
    }

    public final String H() {
        return this.f29261h;
    }

    public final void I(String str) {
        m(new C4952k1(this, str));
    }

    public final String J() {
        P0 p02 = new P0();
        m(new C4992p1(this, p02));
        return p02.q2(50L);
    }

    public final String K() {
        P0 p02 = new P0();
        m(new C5031u1(this, p02));
        return p02.q2(500L);
    }

    public final String L() {
        P0 p02 = new P0();
        m(new C5007r1(this, p02));
        return p02.q2(500L);
    }

    public final String M() {
        P0 p02 = new P0();
        m(new C5000q1(this, p02));
        return p02.q2(500L);
    }

    public final int a(String str) {
        P0 p02 = new P0();
        m(new C5047w1(this, str, p02));
        Integer num = (Integer) P0.J0(p02.D0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        P0 p02 = new P0();
        m(new C5015s1(this, p02));
        Long p22 = p02.p2(500L);
        if (p22 != null) {
            return p22.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f29255b.a()).nextLong();
        int i8 = this.f29259f + 1;
        this.f29259f = i8;
        return nextLong + i8;
    }

    public final Bundle c(Bundle bundle, boolean z7) {
        P0 p02 = new P0();
        m(new C5055x1(this, bundle, p02));
        if (z7) {
            return p02.D0(5000L);
        }
        return null;
    }

    protected final O0 d(Context context, boolean z7) {
        try {
            return R0.asInterface(DynamiteModule.e(context, DynamiteModule.f13445e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e8) {
            q(e8, true, false);
            return null;
        }
    }

    public final List h(String str, String str2) {
        P0 p02 = new P0();
        m(new C4925h1(this, str, str2, p02));
        List list = (List) P0.J0(p02.D0(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map i(String str, String str2, boolean z7) {
        P0 p02 = new P0();
        m(new C5023t1(this, str, str2, z7, p02));
        Bundle D02 = p02.D0(5000L);
        if (D02 == null || D02.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(D02.size());
        for (String str3 : D02.keySet()) {
            Object obj = D02.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void j(int i8, String str, Object obj, Object obj2, Object obj3) {
        m(new C5039v1(this, false, 5, str, obj, null, null));
    }

    public final void k(Activity activity, String str, String str2) {
        m(new C4943j1(this, activity, str, str2));
    }

    public final void l(Bundle bundle) {
        m(new C4898e1(this, bundle));
    }

    public final void r(String str, Bundle bundle) {
        t(null, str, bundle, false, true, null);
    }

    public final void s(String str, String str2, Bundle bundle) {
        m(new C4934i1(this, str, str2, bundle));
    }

    public final void u(String str, String str2, Object obj, boolean z7) {
        m(new C4916g1(this, str, str2, obj, z7));
    }

    public final void v(w3.t tVar) {
        Z2.r.l(tVar);
        synchronized (this.f29258e) {
            for (int i8 = 0; i8 < this.f29258e.size(); i8++) {
                try {
                    if (tVar.equals(((Pair) this.f29258e.get(i8)).first)) {
                        Log.w(this.f29254a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b bVar = new b(tVar);
            this.f29258e.add(new Pair(tVar, bVar));
            if (this.f29262i != null) {
                try {
                    this.f29262i.registerOnMeasurementEventListener(bVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f29254a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m(new C5071z1(this, bVar));
        }
    }

    public final C6835a y() {
        return this.f29257d;
    }

    public final void z(Bundle bundle) {
        m(new C4960l1(this, bundle));
    }
}
