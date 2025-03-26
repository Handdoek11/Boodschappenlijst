package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import A3.InterfaceC0373g;
import A3.InterfaceC0375i;
import G4.a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.V;
import com.google.firebase.messaging.Z;
import e4.InterfaceC5746a;
import g3.ThreadFactoryC5803b;
import h2.InterfaceC5836j;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: m, reason: collision with root package name */
    private static Z f32854m;

    /* renamed from: o, reason: collision with root package name */
    static ScheduledExecutorService f32856o;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f32857a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f32858b;

    /* renamed from: c, reason: collision with root package name */
    private final D f32859c;

    /* renamed from: d, reason: collision with root package name */
    private final V f32860d;

    /* renamed from: e, reason: collision with root package name */
    private final a f32861e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f32862f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f32863g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC0376j f32864h;

    /* renamed from: i, reason: collision with root package name */
    private final I f32865i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f32866j;

    /* renamed from: k, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f32867k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f32853l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n, reason: collision with root package name */
    static H4.b f32855n = new H4.b() { // from class: com.google.firebase.messaging.r
        @Override // H4.b
        public final Object get() {
            return FirebaseMessaging.F();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        private final E4.d f32868a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32869b;

        /* renamed from: c, reason: collision with root package name */
        private E4.b f32870c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f32871d;

        a(E4.d dVar) {
            this.f32868a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(E4.a aVar) {
            if (c()) {
                FirebaseMessaging.this.J();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context k8 = FirebaseMessaging.this.f32857a.k();
            SharedPreferences sharedPreferences = k8.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = k8.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(k8.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f32869b) {
                    return;
                }
                Boolean e8 = e();
                this.f32871d = e8;
                if (e8 == null) {
                    E4.b bVar = new E4.b() { // from class: com.google.firebase.messaging.A
                        @Override // E4.b
                        public final void a(E4.a aVar) {
                            this.f32839a.d(aVar);
                        }
                    };
                    this.f32870c = bVar;
                    this.f32868a.a(com.google.firebase.b.class, bVar);
                }
                this.f32869b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f32871d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f32857a.t();
        }
    }

    FirebaseMessaging(com.google.firebase.f fVar, G4.a aVar, H4.b bVar, H4.b bVar2, I4.e eVar, H4.b bVar3, E4.d dVar) {
        this(fVar, aVar, bVar, bVar2, eVar, bVar3, dVar, new I(fVar.k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(C0377k c0377k) {
        try {
            c0377k.c(k());
        } catch (Exception e8) {
            c0377k.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(V2.a aVar) {
        if (aVar != null) {
            H.y(aVar.A0());
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (w()) {
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(e0 e0Var) {
        if (w()) {
            e0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC5836j F() {
        return null;
    }

    private boolean H() {
        O.c(this.f32858b);
        if (!O.d(this.f32858b)) {
            return false;
        }
        if (this.f32857a.j(InterfaceC5746a.class) != null) {
            return true;
        }
        return H.a() && f32855n != null;
    }

    private synchronized void I() {
        if (!this.f32866j) {
            K(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (L(r())) {
            I();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(com.google.firebase.f fVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) fVar.j(FirebaseMessaging.class);
            Z2.r.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging n() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(com.google.firebase.f.l());
        }
        return firebaseMessaging;
    }

    private static synchronized Z o(Context context) {
        Z z7;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f32854m == null) {
                    f32854m = new Z(context);
                }
                z7 = f32854m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    private String p() {
        return "[DEFAULT]".equals(this.f32857a.m()) ? "" : this.f32857a.o();
    }

    public static InterfaceC5836j s() {
        return (InterfaceC5836j) f32855n.get();
    }

    private void t() {
        this.f32859c.e().j(this.f32862f, new InterfaceC0373g() { // from class: com.google.firebase.messaging.w
            @Override // A3.InterfaceC0373g
            public final void b(Object obj) {
                this.f33021a.B((V2.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void E() {
        O.c(this.f32858b);
        Q.g(this.f32858b, this.f32859c, H());
        if (H()) {
            t();
        }
    }

    private void v(String str) {
        if ("[DEFAULT]".equals(this.f32857a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f32857a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C5488n(this.f32858b).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC0376j y(String str, Z.a aVar, String str2) {
        o(this.f32858b).f(p(), str, str2, this.f32865i.a());
        if (aVar == null || !str2.equals(aVar.f32907a)) {
            v(str2);
        }
        return AbstractC0379m.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC0376j z(final String str, final Z.a aVar) {
        return this.f32859c.f().u(this.f32863g, new InterfaceC0375i() { // from class: com.google.firebase.messaging.y
            @Override // A3.InterfaceC0375i
            public final AbstractC0376j a(Object obj) {
                return this.f33025a.y(str, aVar, (String) obj);
            }
        });
    }

    synchronized void G(boolean z7) {
        this.f32866j = z7;
    }

    synchronized void K(long j8) {
        l(new a0(this, Math.min(Math.max(30L, 2 * j8), f32853l)), j8);
        this.f32866j = true;
    }

    boolean L(Z.a aVar) {
        return aVar == null || aVar.b(this.f32865i.a());
    }

    String k() {
        final Z.a r8 = r();
        if (!L(r8)) {
            return r8.f32907a;
        }
        final String c8 = I.c(this.f32857a);
        try {
            return (String) AbstractC0379m.a(this.f32860d.b(c8, new V.a() { // from class: com.google.firebase.messaging.x
                @Override // com.google.firebase.messaging.V.a
                public final AbstractC0376j start() {
                    return this.f33022a.z(c8, r8);
                }
            }));
        } catch (InterruptedException | ExecutionException e8) {
            throw new IOException(e8);
        }
    }

    void l(Runnable runnable, long j8) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f32856o == null) {
                    f32856o = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC5803b("TAG"));
                }
                f32856o.schedule(runnable, j8, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Context m() {
        return this.f32858b;
    }

    public AbstractC0376j q() {
        final C0377k c0377k = new C0377k();
        this.f32862f.execute(new Runnable() { // from class: com.google.firebase.messaging.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f33028o.A(c0377k);
            }
        });
        return c0377k.a();
    }

    Z.a r() {
        return o(this.f32858b).d(p(), I.c(this.f32857a));
    }

    public boolean w() {
        return this.f32861e.c();
    }

    boolean x() {
        return this.f32865i.g();
    }

    FirebaseMessaging(com.google.firebase.f fVar, G4.a aVar, H4.b bVar, H4.b bVar2, I4.e eVar, H4.b bVar3, E4.d dVar, I i8) {
        this(fVar, aVar, bVar3, dVar, i8, new D(fVar, i8, bVar, bVar2, eVar), AbstractC5489o.f(), AbstractC5489o.c(), AbstractC5489o.b());
    }

    FirebaseMessaging(com.google.firebase.f fVar, G4.a aVar, H4.b bVar, E4.d dVar, I i8, D d8, Executor executor, Executor executor2, Executor executor3) {
        this.f32866j = false;
        f32855n = bVar;
        this.f32857a = fVar;
        this.f32861e = new a(dVar);
        Context k8 = fVar.k();
        this.f32858b = k8;
        C5491q c5491q = new C5491q();
        this.f32867k = c5491q;
        this.f32865i = i8;
        this.f32859c = d8;
        this.f32860d = new V(executor);
        this.f32862f = executor2;
        this.f32863g = executor3;
        Context k9 = fVar.k();
        if (k9 instanceof Application) {
            ((Application) k9).registerActivityLifecycleCallbacks(c5491q);
        } else {
            Log.w("FirebaseMessaging", "Context " + k9 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0043a() { // from class: com.google.firebase.messaging.s
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f33018o.C();
            }
        });
        AbstractC0376j e8 = e0.e(this, i8, d8, k8, AbstractC5489o.g());
        this.f32864h = e8;
        e8.j(executor2, new InterfaceC0373g() { // from class: com.google.firebase.messaging.u
            @Override // A3.InterfaceC0373g
            public final void b(Object obj) {
                this.f33019a.D((e0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f33020o.E();
            }
        });
    }
}
