package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.common.C1109h;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Sn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1773Sn implements InterfaceC1843Un {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f18955k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static InterfaceC1843Un f18956l;

    /* renamed from: m, reason: collision with root package name */
    static InterfaceC1843Un f18957m;

    /* renamed from: n, reason: collision with root package name */
    static InterfaceC1843Un f18958n;

    /* renamed from: o, reason: collision with root package name */
    static Boolean f18959o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f18960a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18961b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f18962c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f18963d;

    /* renamed from: e, reason: collision with root package name */
    private final H2.a f18964e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f18965f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18966g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18967h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f18968i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18969j;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected C1773Sn(android.content.Context r3, H2.a r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f18960a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.f18962c = r0
            com.google.android.gms.internal.ads.AbstractC1933Xd0.a()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.f18963d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f18968i = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.f18961b = r3
            r2.f18964e = r4
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.AbstractC3184kf.G7
            com.google.android.gms.internal.ads.if r0 = D2.A.c()
            java.lang.Object r4 = r0.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = H2.g.f2925b
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L61
        L52:
            h3.d r4 = h3.e.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.f(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r2.f18965f = r3
            com.google.android.gms.internal.ads.bf r3 = com.google.android.gms.internal.ads.AbstractC3184kf.E7
            com.google.android.gms.internal.ads.if r4 = D2.A.c()
            java.lang.Object r4 = r4.a(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L80
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L81
        L80:
            r4 = r1
        L81:
            r2.f18966g = r4
            com.google.android.gms.internal.ads.if r4 = D2.A.c()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb0
            android.content.Context r3 = r2.f18961b
            android.os.Handler r4 = H2.g.f2925b
            if (r3 != 0) goto L9a
            goto Lb1
        L9a:
            h3.d r3 = h3.e.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r3 = r3.f(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r3 != 0) goto La9
            goto Lb1
        La9:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            goto Lb1
        Lb0:
            r0 = r1
        Lb1:
            r2.f18967h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1773Sn.<init>(android.content.Context, H2.a):void");
    }

    public static InterfaceC1843Un c(Context context) {
        synchronized (f18955k) {
            try {
                if (f18956l == null) {
                    if (l(context)) {
                        f18956l = new C1773Sn(context, H2.a.A0());
                    } else {
                        f18956l = new C1808Tn();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18956l;
    }

    public static InterfaceC1843Un d(Context context, H2.a aVar) {
        synchronized (f18955k) {
            try {
                if (f18958n == null) {
                    boolean z7 = false;
                    if (((Boolean) AbstractC2426dg.f21628c.e()).booleanValue()) {
                        if (!((Boolean) D2.A.c().a(AbstractC3184kf.z7)).booleanValue() || ((Boolean) AbstractC2426dg.f21626a.e()).booleanValue()) {
                            z7 = true;
                        }
                    }
                    if (l(context)) {
                        C1773Sn c1773Sn = new C1773Sn(context, aVar);
                        c1773Sn.k();
                        c1773Sn.j();
                        f18958n = c1773Sn;
                    } else if (!z7 || context == null) {
                        f18958n = new C1808Tn();
                    } else {
                        C1773Sn c1773Sn2 = new C1773Sn(context, aVar, true);
                        c1773Sn2.k();
                        c1773Sn2.j();
                        f18958n = c1773Sn2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18958n;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0040), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.InterfaceC1843Un e(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C1773Sn.f18955k
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Un r1 = com.google.android.gms.internal.ads.C1773Sn.f18957m     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L40
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.A7     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.z7     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            com.google.android.gms.internal.ads.Sn r1 = new com.google.android.gms.internal.ads.Sn     // Catch: java.lang.Throwable -> L37
            H2.a r2 = H2.a.A0()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C1773Sn.f18957m = r1     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r3 = move-exception
            goto L44
        L39:
            com.google.android.gms.internal.ads.Tn r3 = new com.google.android.gms.internal.ads.Tn     // Catch: java.lang.Throwable -> L37
            r3.<init>()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.C1773Sn.f18957m = r3     // Catch: java.lang.Throwable -> L37
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.Un r3 = com.google.android.gms.internal.ads.C1773Sn.f18957m
            return r3
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1773Sn.e(android.content.Context):com.google.android.gms.internal.ads.Un");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.InterfaceC1843Un f(android.content.Context r3, H2.a r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C1773Sn.f18955k
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Un r1 = com.google.android.gms.internal.ads.C1773Sn.f18957m     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L3c
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.A7     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.z7     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            com.google.android.gms.internal.ads.Sn r1 = new com.google.android.gms.internal.ads.Sn     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.C1773Sn.f18957m = r1     // Catch: java.lang.Throwable -> L33
            goto L3c
        L33:
            r3 = move-exception
            goto L40
        L35:
            com.google.android.gms.internal.ads.Tn r3 = new com.google.android.gms.internal.ads.Tn     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.C1773Sn.f18957m = r3     // Catch: java.lang.Throwable -> L33
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.Un r3 = com.google.android.gms.internal.ads.C1773Sn.f18957m
            return r3
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1773Sn.f(android.content.Context, H2.a):com.google.android.gms.internal.ads.Un");
    }

    public static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String h(Throwable th) {
        return AbstractC3187kg0.c(H2.g.k(g(th)));
    }

    private final void j() {
        Thread.setDefaultUncaughtExceptionHandler(new C1703Qn(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void k() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f18960a) {
            this.f18962c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C1738Rn(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Fc)).booleanValue()) {
            if (((Boolean) AbstractC4275ug.f27088e.e()).booleanValue()) {
                if (!((Boolean) D2.A.c().a(AbstractC3184kf.z7)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (f18955k) {
            try {
                if (f18959o == null) {
                    f18959o = Boolean.valueOf(C0555y.e().nextInt(100) < ((Integer) D2.A.c().a(AbstractC3184kf.Cc)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f18959o.booleanValue()) {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.z7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1843Un
    public final void a(Throwable th, String str) {
        if (this.f18969j) {
            return;
        }
        b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1843Un
    public final void b(Throwable th, String str, float f8) {
        Throwable th2;
        String str2;
        PackageInfo f9;
        ActivityManager.MemoryInfo g8;
        if (this.f18969j) {
            return;
        }
        Handler handler = H2.g.f2925b;
        boolean z7 = false;
        if (((Boolean) AbstractC4275ug.f27089f.e()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z8 = ((Boolean) D2.A.c().a(AbstractC3184kf.f24003s2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && H2.g.s(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (H2.g.s(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z8 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z8) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String g9 = g(th);
            String h8 = ((Boolean) D2.A.c().a(AbstractC3184kf.J8)).booleanValue() ? h(th) : "";
            double d8 = f8;
            double random = Math.random();
            int i8 = f8 > 0.0f ? (int) (1.0f / f8) : 1;
            if (random < d8) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    z7 = h3.e.a(this.f18961b).g();
                } catch (Throwable th5) {
                    H2.p.e("Error fetching instant app info", th5);
                }
                try {
                    str2 = this.f18961b.getPackageName();
                } catch (Throwable unused) {
                    H2.p.g("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z7)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i9 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i9));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str4).appendQueryParameter("js", this.f18964e.f2914o).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", g9).appendQueryParameter("eids", TextUtils.join(",", D2.A.a().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i8)).appendQueryParameter("pb_tm", String.valueOf(AbstractC4275ug.f27086c.e())).appendQueryParameter("gmscv", String.valueOf(C1109h.f().a(this.f18961b))).appendQueryParameter("lite", true != this.f18964e.f2918v ? "0" : "1");
                if (!TextUtils.isEmpty(h8)) {
                    appendQueryParameter3.appendQueryParameter("hash", h8);
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.F7)).booleanValue() && (g8 = H2.g.g(this.f18961b)) != null) {
                    appendQueryParameter3.appendQueryParameter("available_memory", Long.toString(g8.availMem));
                    appendQueryParameter3.appendQueryParameter("total_memory", Long.toString(g8.totalMem));
                    appendQueryParameter3.appendQueryParameter("is_low_memory", true != g8.lowMemory ? "0" : "1");
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.E7)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.f18966g)) {
                        appendQueryParameter3.appendQueryParameter("countrycode", this.f18966g);
                    }
                    if (!TextUtils.isEmpty(this.f18967h)) {
                        appendQueryParameter3.appendQueryParameter("psv", this.f18967h);
                    }
                    Context context = this.f18961b;
                    if (i9 >= 26) {
                        f9 = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        f9 = null;
                    } else {
                        try {
                            f9 = h3.e.a(context).f("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (f9 != null) {
                        appendQueryParameter3.appendQueryParameter("wvvc", Integer.toString(f9.versionCode));
                        appendQueryParameter3.appendQueryParameter("wvvn", f9.versionName);
                        appendQueryParameter3.appendQueryParameter("wvpn", f9.packageName);
                    }
                }
                PackageInfo packageInfo = this.f18965f;
                if (packageInfo != null) {
                    appendQueryParameter3.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter3.appendQueryParameter("appvn", this.f18965f.versionName);
                }
                arrayList2.add(appendQueryParameter3.toString());
                for (final String str5 : arrayList2) {
                    final H2.u uVar = new H2.u(null);
                    this.f18963d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Pn
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.n(str5);
                        }
                    });
                }
            }
        }
    }

    protected final void i(Thread thread, Throwable th) {
        if (th != null) {
            boolean z7 = false;
            boolean z8 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z7 |= H2.g.s(stackTraceElement.getClassName());
                    z8 |= C1773Sn.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z7 || z8) {
                return;
            }
            if (!this.f18969j) {
                a(th, "");
            }
            if (this.f18968i.getAndSet(true) || !((Boolean) AbstractC2426dg.f21628c.e()).booleanValue()) {
                return;
            }
            AbstractC1829Ue.c(this.f18961b);
        }
    }

    protected C1773Sn(Context context, H2.a aVar, boolean z7) {
        this(context, aVar);
        this.f18969j = true;
    }
}
