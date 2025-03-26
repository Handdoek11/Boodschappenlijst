package com.google.firebase;

import X2.D;
import Z2.AbstractC0777p;
import Z2.r;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1089a;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import f3.AbstractC5779c;
import g4.C5807c;
import g4.o;
import g4.u;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q.C6397a;
import v0.v;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f32783k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map f32784l = new C6397a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f32785a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32786b;

    /* renamed from: c, reason: collision with root package name */
    private final n f32787c;

    /* renamed from: d, reason: collision with root package name */
    private final g4.o f32788d;

    /* renamed from: g, reason: collision with root package name */
    private final u f32791g;

    /* renamed from: h, reason: collision with root package name */
    private final H4.b f32792h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f32789e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f32790f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List f32793i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List f32794j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z7);
    }

    private static class b implements ComponentCallbacks2C1089a.InterfaceC0228a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference f32795a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (f3.m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f32795a.get() == null) {
                    b bVar = new b();
                    if (D.a(f32795a, null, bVar)) {
                        ComponentCallbacks2C1089a.c(application);
                        ComponentCallbacks2C1089a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1089a.InterfaceC0228a
        public void a(boolean z7) {
            synchronized (f.f32783k) {
                try {
                    Iterator it = new ArrayList(f.f32784l.values()).iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar.f32789e.get()) {
                            fVar.y(z7);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference f32796b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        private final Context f32797a;

        public c(Context context) {
            this.f32797a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f32796b.get() == null) {
                c cVar = new c(context);
                if (D.a(f32796b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f32797a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f32783k) {
                try {
                    Iterator it = f.f32784l.values().iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, n nVar) {
        this.f32785a = (Context) r.l(context);
        this.f32786b = r.f(str);
        this.f32787c = (n) r.l(nVar);
        o b8 = FirebaseInitProvider.b();
        U4.c.b("Firebase");
        U4.c.b("ComponentDiscovery");
        List b9 = g4.g.c(context, ComponentDiscoveryService.class).b();
        U4.c.a();
        U4.c.b("Runtime");
        o.b g8 = g4.o.m(h4.l.INSTANCE).d(b9).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C5807c.s(context, Context.class, new Class[0])).b(C5807c.s(this, f.class, new Class[0])).b(C5807c.s(nVar, n.class, new Class[0])).g(new U4.b());
        if (v.a(context) && FirebaseInitProvider.c()) {
            g8.b(C5807c.s(b8, o.class, new Class[0]));
        }
        g4.o e8 = g8.e();
        this.f32788d = e8;
        U4.c.a();
        this.f32791g = new u(new H4.b() { // from class: com.google.firebase.d
            @Override // H4.b
            public final Object get() {
                return this.f32780a.v(context);
            }
        });
        this.f32792h = e8.d(F4.f.class);
        g(new a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.f.a
            public final void a(boolean z7) {
                this.f32782a.w(z7);
            }
        });
        U4.c.a();
    }

    private void i() {
        r.q(!this.f32790f.get(), "FirebaseApp was deleted");
    }

    public static f l() {
        f fVar;
        synchronized (f32783k) {
            try {
                fVar = (f) f32784l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + f3.o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((F4.f) fVar.f32792h.get()).l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!v.a(this.f32785a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f32785a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f32788d.p(u());
        ((F4.f) this.f32792h.get()).l();
    }

    public static f q(Context context) {
        synchronized (f32783k) {
            try {
                if (f32784l.containsKey("[DEFAULT]")) {
                    return l();
                }
                n a8 = n.a(context);
                if (a8 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, a8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f r(Context context, n nVar) {
        return s(context, nVar, "[DEFAULT]");
    }

    public static f s(Context context, n nVar, String str) {
        f fVar;
        b.c(context);
        String x7 = x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f32783k) {
            Map map = f32784l;
            r.q(!map.containsKey(x7), "FirebaseApp name " + x7 + " already exists!");
            r.m(context, "Application context cannot be null.");
            fVar = new f(context, x7, nVar);
            map.put(x7, fVar);
        }
        fVar.p();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ M4.a v(Context context) {
        return new M4.a(context, o(), (E4.c) this.f32788d.a(E4.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(boolean z7) {
        if (z7) {
            return;
        }
        ((F4.f) this.f32792h.get()).l();
    }

    private static String x(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(boolean z7) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f32793i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z7);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f32786b.equals(((f) obj).m());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f32789e.get() && ComponentCallbacks2C1089a.b().d()) {
            aVar.a(true);
        }
        this.f32793i.add(aVar);
    }

    public void h(g gVar) {
        i();
        r.l(gVar);
        this.f32794j.add(gVar);
    }

    public int hashCode() {
        return this.f32786b.hashCode();
    }

    public Object j(Class cls) {
        i();
        return this.f32788d.a(cls);
    }

    public Context k() {
        i();
        return this.f32785a;
    }

    public String m() {
        i();
        return this.f32786b;
    }

    public n n() {
        i();
        return this.f32787c;
    }

    public String o() {
        return AbstractC5779c.b(m().getBytes(Charset.defaultCharset())) + "+" + AbstractC5779c.b(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return ((M4.a) this.f32791g.get()).b();
    }

    public String toString() {
        return AbstractC0777p.c(this).a("name", this.f32786b).a("options", this.f32787c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
