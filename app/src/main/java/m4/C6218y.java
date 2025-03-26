package m4;

import A3.AbstractC0376j;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import j4.InterfaceC6074a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k4.InterfaceC6101a;
import l4.InterfaceC6173a;
import l4.InterfaceC6174b;
import v4.C6836a;
import v4.C6838c;

/* renamed from: m4.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6218y {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39131a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f39132b;

    /* renamed from: c, reason: collision with root package name */
    private final E f39133c;

    /* renamed from: f, reason: collision with root package name */
    private C6219z f39136f;

    /* renamed from: g, reason: collision with root package name */
    private C6219z f39137g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f39138h;

    /* renamed from: i, reason: collision with root package name */
    private C6210p f39139i;

    /* renamed from: j, reason: collision with root package name */
    private final J f39140j;

    /* renamed from: k, reason: collision with root package name */
    private final s4.g f39141k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC6174b f39142l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC6101a f39143m;

    /* renamed from: n, reason: collision with root package name */
    private final C6207m f39144n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC6074a f39145o;

    /* renamed from: p, reason: collision with root package name */
    private final j4.l f39146p;

    /* renamed from: q, reason: collision with root package name */
    private final n4.f f39147q;

    /* renamed from: e, reason: collision with root package name */
    private final long f39135e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final O f39134d = new O();

    public C6218y(com.google.firebase.f fVar, J j8, InterfaceC6074a interfaceC6074a, E e8, InterfaceC6174b interfaceC6174b, InterfaceC6101a interfaceC6101a, s4.g gVar, C6207m c6207m, j4.l lVar, n4.f fVar2) {
        this.f39132b = fVar;
        this.f39133c = e8;
        this.f39131a = fVar.k();
        this.f39140j = j8;
        this.f39145o = interfaceC6074a;
        this.f39142l = interfaceC6174b;
        this.f39143m = interfaceC6101a;
        this.f39141k = gVar;
        this.f39144n = c6207m;
        this.f39146p = lVar;
        this.f39147q = fVar2;
    }

    private void h() {
        try {
            this.f39138h = Boolean.TRUE.equals((Boolean) this.f39147q.f39586a.c().submit(new Callable() { // from class: m4.t
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f39121o.o();
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f39138h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void q(u4.j jVar) {
        n4.f.c();
        y();
        try {
            try {
                this.f39142l.a(new InterfaceC6173a() { // from class: m4.v
                    @Override // l4.InterfaceC6173a
                    public final void a(String str) {
                        this.f39124a.v(str);
                    }
                });
                this.f39139i.S();
            } catch (Exception e8) {
                j4.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e8);
            }
            if (!jVar.b().f43972b.f43979a) {
                j4.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.f39139i.y(jVar)) {
                j4.g.f().k("Previous sessions could not be finalized.");
            }
            this.f39139i.V(jVar.a());
            x();
        } catch (Throwable th) {
            x();
            throw th;
        }
    }

    private void l(final u4.j jVar) {
        Future<?> submit = this.f39147q.f39586a.c().submit(new Runnable() { // from class: m4.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f39122o.q(jVar);
            }
        });
        j4.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            j4.g.f().e("Crashlytics was interrupted during initialization.", e8);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e9) {
            j4.g.f().e("Crashlytics encountered a problem during initialization.", e9);
        } catch (TimeoutException e10) {
            j4.g.f().e("Crashlytics timed out during initialization.", e10);
        }
    }

    public static String m() {
        return "19.3.0";
    }

    static boolean n(String str, boolean z7) {
        if (!z7) {
            j4.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean o() {
        return Boolean.valueOf(this.f39139i.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(long j8, String str) {
        this.f39139i.Z(j8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(final long j8, final String str) {
        this.f39147q.f39587b.f(new Runnable() { // from class: m4.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f39128o.r(j8, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Throwable th) {
        this.f39139i.Y(Thread.currentThread(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(String str) {
        this.f39139i.U(str);
    }

    public void A(final String str) {
        this.f39147q.f39586a.f(new Runnable() { // from class: m4.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f39119o.u(str);
            }
        });
    }

    boolean i() {
        return this.f39136f.c();
    }

    public AbstractC0376j k(final u4.j jVar) {
        return this.f39147q.f39586a.f(new Runnable() { // from class: m4.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f39115o.p(jVar);
            }
        });
    }

    public void v(final String str) {
        final long currentTimeMillis = System.currentTimeMillis() - this.f39135e;
        this.f39147q.f39586a.f(new Runnable() { // from class: m4.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f39125o.s(currentTimeMillis, str);
            }
        });
    }

    public void w(final Throwable th) {
        this.f39147q.f39586a.f(new Runnable() { // from class: m4.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f39117o.t(th);
            }
        });
    }

    void x() {
        n4.f.c();
        try {
            if (this.f39136f.d()) {
                return;
            }
            j4.g.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e8) {
            j4.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e8);
        }
    }

    void y() {
        n4.f.c();
        this.f39136f.a();
        j4.g.f().i("Initialization marker file was created.");
    }

    public boolean z(C6195a c6195a, u4.j jVar) {
        if (!n(c6195a.f39021b, AbstractC6203i.i(this.f39131a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String c8 = new C6202h().c();
        try {
            this.f39137g = new C6219z("crash_marker", this.f39141k);
            this.f39136f = new C6219z("initialization_marker", this.f39141k);
            o4.n nVar = new o4.n(c8, this.f39141k, this.f39147q);
            o4.e eVar = new o4.e(this.f39141k);
            C6836a c6836a = new C6836a(1024, new C6838c(10));
            this.f39146p.c(nVar);
            this.f39139i = new C6210p(this.f39131a, this.f39140j, this.f39133c, this.f39141k, this.f39137g, c6195a, nVar, eVar, b0.i(this.f39131a, this.f39140j, this.f39141k, c6195a, eVar, nVar, c6836a, jVar, this.f39134d, this.f39144n, this.f39147q), this.f39145o, this.f39143m, this.f39144n, this.f39147q);
            boolean i8 = i();
            h();
            this.f39139i.w(c8, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!i8 || !AbstractC6203i.d(this.f39131a)) {
                j4.g.f().b("Successfully configured exception handler.");
                return true;
            }
            j4.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            l(jVar);
            return false;
        } catch (Exception e8) {
            j4.g.f().e("Crashlytics was not started due to an exception during initialization", e8);
            this.f39139i = null;
            return false;
        }
    }
}
