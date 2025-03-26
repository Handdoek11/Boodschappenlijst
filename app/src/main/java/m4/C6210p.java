package m4;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import A3.InterfaceC0375i;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import j4.InterfaceC6074a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.InterfaceC6101a;
import m4.C;
import n4.AbstractC6250b;
import p4.AbstractC6384F;
import p4.AbstractC6385G;

/* renamed from: m4.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C6210p {

    /* renamed from: t, reason: collision with root package name */
    static final FilenameFilter f39080t = new FilenameFilter() { // from class: m4.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C6210p.K(file, str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f39081a;

    /* renamed from: b, reason: collision with root package name */
    private final E f39082b;

    /* renamed from: c, reason: collision with root package name */
    private final C6219z f39083c;

    /* renamed from: d, reason: collision with root package name */
    private final o4.n f39084d;

    /* renamed from: e, reason: collision with root package name */
    private final n4.f f39085e;

    /* renamed from: f, reason: collision with root package name */
    private final J f39086f;

    /* renamed from: g, reason: collision with root package name */
    private final s4.g f39087g;

    /* renamed from: h, reason: collision with root package name */
    private final C6195a f39088h;

    /* renamed from: i, reason: collision with root package name */
    private final o4.e f39089i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC6074a f39090j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC6101a f39091k;

    /* renamed from: l, reason: collision with root package name */
    private final C6207m f39092l;

    /* renamed from: m, reason: collision with root package name */
    private final b0 f39093m;

    /* renamed from: n, reason: collision with root package name */
    private C f39094n;

    /* renamed from: o, reason: collision with root package name */
    private u4.j f39095o = null;

    /* renamed from: p, reason: collision with root package name */
    final C0377k f39096p = new C0377k();

    /* renamed from: q, reason: collision with root package name */
    final C0377k f39097q = new C0377k();

    /* renamed from: r, reason: collision with root package name */
    final C0377k f39098r = new C0377k();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f39099s = new AtomicBoolean(false);

    /* renamed from: m4.p$a */
    class a implements C.a {
        a() {
        }

        @Override // m4.C.a
        public void a(u4.j jVar, Thread thread, Throwable th) {
            C6210p.this.G(jVar, thread, th);
        }
    }

    /* renamed from: m4.p$b */
    class b implements Callable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f39101o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Throwable f39102s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Thread f39103t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ u4.j f39104u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f39105v;

        /* renamed from: m4.p$b$a */
        class a implements InterfaceC0375i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f39107a;

            a(String str) {
                this.f39107a = str;
            }

            @Override // A3.InterfaceC0375i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC0376j a(u4.d dVar) {
                if (dVar != null) {
                    return AbstractC0379m.g(C6210p.this.N(), C6210p.this.f39093m.A(C6210p.this.f39085e.f39586a, b.this.f39105v ? this.f39107a : null));
                }
                j4.g.f().k("Received null app settings, cannot send reports at crash time.");
                return AbstractC0379m.e(null);
            }
        }

        b(long j8, Throwable th, Thread thread, u4.j jVar, boolean z7) {
            this.f39101o = j8;
            this.f39102s = th;
            this.f39103t = thread;
            this.f39104u = jVar;
            this.f39105v = z7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0376j call() {
            long E7 = C6210p.E(this.f39101o);
            String A7 = C6210p.this.A();
            if (A7 == null) {
                j4.g.f().d("Tried to write a fatal exception while no session was open.");
                return AbstractC0379m.e(null);
            }
            C6210p.this.f39083c.a();
            C6210p.this.f39093m.v(this.f39102s, this.f39103t, A7, E7);
            C6210p.this.v(this.f39101o);
            C6210p.this.s(this.f39104u);
            C6210p.this.u(new C6202h().c(), Boolean.valueOf(this.f39105v));
            return !C6210p.this.f39082b.d() ? AbstractC0379m.e(null) : this.f39104u.a().u(C6210p.this.f39085e.f39586a, new a(A7));
        }
    }

    /* renamed from: m4.p$c */
    class c implements InterfaceC0375i {
        c() {
        }

        @Override // A3.InterfaceC0375i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC0376j a(Void r12) {
            return AbstractC0379m.e(Boolean.TRUE);
        }
    }

    /* renamed from: m4.p$d */
    class d implements InterfaceC0375i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC0376j f39110a;

        /* renamed from: m4.p$d$a */
        class a implements InterfaceC0375i {
            a() {
            }

            @Override // A3.InterfaceC0375i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC0376j a(u4.d dVar) {
                if (dVar == null) {
                    j4.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return AbstractC0379m.e(null);
                }
                C6210p.this.N();
                C6210p.this.f39093m.z(C6210p.this.f39085e.f39586a);
                C6210p.this.f39098r.e(null);
                return AbstractC0379m.e(null);
            }
        }

        d(AbstractC0376j abstractC0376j) {
            this.f39110a = abstractC0376j;
        }

        @Override // A3.InterfaceC0375i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC0376j a(Boolean bool) {
            if (bool.booleanValue()) {
                j4.g.f().b("Sending cached crash reports...");
                C6210p.this.f39082b.c(bool.booleanValue());
                return this.f39110a.u(C6210p.this.f39085e.f39586a, new a());
            }
            j4.g.f().i("Deleting cached crash reports...");
            C6210p.q(C6210p.this.L());
            C6210p.this.f39093m.y();
            C6210p.this.f39098r.e(null);
            return AbstractC0379m.e(null);
        }
    }

    /* renamed from: m4.p$e */
    class e implements Callable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f39113o;

        e(long j8) {
            this.f39113o = j8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f39113o);
            C6210p.this.f39091k.a("_ae", bundle);
            return null;
        }
    }

    C6210p(Context context, J j8, E e8, s4.g gVar, C6219z c6219z, C6195a c6195a, o4.n nVar, o4.e eVar, b0 b0Var, InterfaceC6074a interfaceC6074a, InterfaceC6101a interfaceC6101a, C6207m c6207m, n4.f fVar) {
        this.f39081a = context;
        this.f39086f = j8;
        this.f39082b = e8;
        this.f39087g = gVar;
        this.f39083c = c6219z;
        this.f39088h = c6195a;
        this.f39084d = nVar;
        this.f39089i = eVar;
        this.f39090j = interfaceC6074a;
        this.f39091k = interfaceC6101a;
        this.f39092l = c6207m;
        this.f39093m = b0Var;
        this.f39085e = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A() {
        SortedSet r8 = this.f39093m.r();
        if (r8.isEmpty()) {
            return null;
        }
        return (String) r8.first();
    }

    private static long B() {
        return E(System.currentTimeMillis());
    }

    static List C(j4.h hVar, String str, s4.g gVar, byte[] bArr) {
        File q8 = gVar.q(str, "user-data");
        File q9 = gVar.q(str, "keys");
        File q10 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6201g("logs_file", "logs", bArr));
        arrayList.add(new H("crash_meta_file", "metadata", hVar.g()));
        arrayList.add(new H("session_meta_file", "session", hVar.f()));
        arrayList.add(new H("app_meta_file", "app", hVar.a()));
        arrayList.add(new H("device_meta_file", "device", hVar.c()));
        arrayList.add(new H("os_meta_file", "os", hVar.b()));
        arrayList.add(P(hVar));
        arrayList.add(new H("user_meta_file", "user", q8));
        arrayList.add(new H("keys_file", "keys", q9));
        arrayList.add(new H("rollouts_file", "rollouts", q10));
        return arrayList;
    }

    private InputStream D(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            j4.g.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        j4.g.f().g("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long E(long j8) {
        return j8 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str) {
        u(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean K(File file, String str) {
        return str.startsWith(".ae");
    }

    private AbstractC0376j M(long j8) {
        if (z()) {
            j4.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return AbstractC0379m.e(null);
        }
        j4.g.f().b("Logging app exception event to Firebase Analytics");
        return AbstractC0379m.c(new ScheduledThreadPoolExecutor(1), new e(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC0376j N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                j4.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return AbstractC0379m.f(arrayList);
    }

    private static boolean O(String str, File file, AbstractC6384F.a aVar) {
        if (file == null || !file.exists()) {
            j4.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            j4.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static M P(j4.h hVar) {
        File e8 = hVar.e();
        return (e8 == null || !e8.exists()) ? new C6201g("minidump_file", "minidump", new byte[]{0}) : new H("minidump_file", "minidump", e8);
    }

    private static byte[] R(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private AbstractC0376j W() {
        if (this.f39082b.d()) {
            j4.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f39096p.e(Boolean.FALSE);
            return AbstractC0379m.e(Boolean.TRUE);
        }
        j4.g.f().b("Automatic data collection is disabled.");
        j4.g.f().i("Notifying that unsent reports are available.");
        this.f39096p.e(Boolean.TRUE);
        AbstractC0376j t7 = this.f39082b.h().t(new c());
        j4.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return AbstractC6250b.c(t7, this.f39097q.a());
    }

    private void X(String str) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30) {
            j4.g.f().i("ANR feature enabled, but device is API " + i8);
            return;
        }
        List historicalProcessExitReasons = ((ActivityManager) this.f39081a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f39093m.x(str, historicalProcessExitReasons, new o4.e(this.f39087g, str), o4.n.k(str, this.f39087g, this.f39085e));
        } else {
            j4.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static AbstractC6385G.a n(J j8, C6195a c6195a) {
        return AbstractC6385G.a.b(j8.f(), c6195a.f39025f, c6195a.f39026g, j8.a().c(), F.c(c6195a.f39023d).f(), c6195a.f39027h);
    }

    private static AbstractC6385G.b o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC6385G.b.c(AbstractC6203i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC6203i.b(context), statFs.getBlockCount() * statFs.getBlockSize(), AbstractC6203i.w(), AbstractC6203i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static AbstractC6385G.c p() {
        return AbstractC6385G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC6203i.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(boolean z7, u4.j jVar, boolean z8) {
        String str;
        n4.f.c();
        ArrayList arrayList = new ArrayList(this.f39093m.r());
        if (arrayList.size() <= z7) {
            j4.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z7 ? 1 : 0);
        if (z8 && jVar.b().f43972b.f43980b) {
            X(str2);
        } else {
            j4.g.f().i("ANR feature disabled.");
        }
        if (z8 && this.f39090j.d(str2)) {
            x(str2);
        }
        if (z7 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f39092l.e(null);
            str = null;
        }
        this.f39093m.l(B(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str, Boolean bool) {
        long B7 = B();
        j4.g.f().b("Opening a new session with ID " + str);
        this.f39090j.b(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C6218y.m()), B7, AbstractC6385G.b(n(this.f39086f, this.f39088h), p(), o(this.f39081a)));
        if (bool.booleanValue() && str != null) {
            this.f39084d.o(str);
        }
        this.f39089i.e(str);
        this.f39092l.e(str);
        this.f39093m.s(str, B7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j8) {
        try {
            if (this.f39087g.g(".ae" + j8).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e8) {
            j4.g.f().l("Could not create app exception marker file.", e8);
        }
    }

    private void x(String str) {
        j4.g.f().i("Finalizing native report for session " + str);
        j4.h a8 = this.f39090j.a(str);
        File e8 = a8.e();
        AbstractC6384F.a d8 = a8.d();
        if (O(str, e8, d8)) {
            j4.g.f().k("No native core present");
            return;
        }
        long lastModified = e8.lastModified();
        o4.e eVar = new o4.e(this.f39087g, str);
        File k8 = this.f39087g.k(str);
        if (!k8.isDirectory()) {
            j4.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        v(lastModified);
        List C7 = C(a8, str, this.f39087g, eVar.b());
        N.b(k8, C7);
        j4.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f39093m.k(str, C7, d8);
        eVar.a();
    }

    private static boolean z() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    String F() {
        InputStream D7 = D("META-INF/version-control-info.textproto");
        if (D7 == null) {
            return null;
        }
        j4.g.f().b("Read version control info");
        return Base64.encodeToString(R(D7), 0);
    }

    void G(u4.j jVar, Thread thread, Throwable th) {
        H(jVar, thread, th, false);
    }

    synchronized void H(u4.j jVar, Thread thread, Throwable th, boolean z7) {
        j4.g.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        AbstractC0376j g8 = this.f39085e.f39586a.g(new b(System.currentTimeMillis(), th, thread, jVar, z7));
        if (!z7) {
            try {
                try {
                    e0.b(g8);
                } catch (Exception e8) {
                    j4.g.f().e("Error handling uncaught exception", e8);
                }
            } catch (TimeoutException unused) {
                j4.g.f().d("Cannot send reports. Timed out while fetching settings.");
            }
        }
    }

    boolean I() {
        C c8 = this.f39094n;
        return c8 != null && c8.a();
    }

    List L() {
        return this.f39087g.h(f39080t);
    }

    void Q(final String str) {
        this.f39085e.f39586a.f(new Runnable() { // from class: m4.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f39078o.J(str);
            }
        });
    }

    void S() {
        try {
            String F7 = F();
            if (F7 != null) {
                T("com.crashlytics.version-control-info", F7);
                j4.g.f().g("Saved version control info");
            }
        } catch (IOException e8) {
            j4.g.f().l("Unable to save version control info", e8);
        }
    }

    void T(String str, String str2) {
        try {
            this.f39084d.n(str, str2);
        } catch (IllegalArgumentException e8) {
            Context context = this.f39081a;
            if (context != null && AbstractC6203i.u(context)) {
                throw e8;
            }
            j4.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void U(String str) {
        this.f39084d.p(str);
    }

    void V(AbstractC0376j abstractC0376j) {
        if (this.f39093m.o()) {
            j4.g.f().i("Crash reports are available to be sent.");
            W().u(this.f39085e.f39586a, new d(abstractC0376j));
        } else {
            j4.g.f().i("No crash reports are available to be sent.");
            this.f39096p.e(Boolean.FALSE);
        }
    }

    void Y(Thread thread, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        if (I()) {
            return;
        }
        long E7 = E(currentTimeMillis);
        String A7 = A();
        if (A7 == null) {
            j4.g.f().k("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f39093m.w(th, thread, A7, E7);
        }
    }

    void Z(long j8, String str) {
        if (I()) {
            return;
        }
        this.f39089i.g(j8, str);
    }

    boolean r() {
        n4.f.c();
        if (!this.f39083c.c()) {
            String A7 = A();
            return A7 != null && this.f39090j.d(A7);
        }
        j4.g.f().i("Found previous crash marker.");
        this.f39083c.d();
        return true;
    }

    void s(u4.j jVar) {
        t(false, jVar, false);
    }

    void w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, u4.j jVar) {
        this.f39095o = jVar;
        Q(str);
        C c8 = new C(new a(), jVar, uncaughtExceptionHandler, this.f39090j);
        this.f39094n = c8;
        Thread.setDefaultUncaughtExceptionHandler(c8);
    }

    boolean y(u4.j jVar) {
        n4.f.c();
        if (I()) {
            j4.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        j4.g.f().i("Finalizing previously open sessions.");
        try {
            t(true, jVar, true);
            j4.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e8) {
            j4.g.f().e("Unable to finalize previously open sessions.", e8);
            return false;
        }
    }
}
