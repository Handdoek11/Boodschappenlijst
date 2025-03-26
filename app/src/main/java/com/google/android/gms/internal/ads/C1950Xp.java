package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import f3.AbstractC5780d;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Xp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1950Xp {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f20140a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f20141b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f20142c = null;

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f20143d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f20144e = new AtomicInteger(-1);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f20145f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f20146g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentMap f20147h = new ConcurrentHashMap(9);

    /* renamed from: i, reason: collision with root package name */
    private final Object f20148i;

    public C1950Xp() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.f20148i = new Object();
    }

    public static final Bundle q(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean r(Context context) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f24026v0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) D2.A.c().a(AbstractC3184kf.f24034w0)).intValue()) {
            return false;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f24042x0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object s(String str, Context context) {
        if (!x(context, "com.google.android.gms.measurement.AppMeasurement", this.f20145f, true)) {
            return null;
        }
        try {
            return t(context, str).invoke(this.f20145f.get(), null);
        } catch (Exception unused) {
            w(str, true);
            return null;
        }
    }

    private final Method t(Context context, String str) {
        Method method = (Method) this.f20147h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.f20147h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w(str, false);
            return null;
        }
    }

    private final void u(Context context, String str, String str2) {
        if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f20145f, true)) {
            Method method = (Method) this.f20147h.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f20147h.put(str2, method);
                } catch (Exception unused) {
                    w(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f20145f.get(), str);
                AbstractC0608p0.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                w(str2, false);
            }
        }
    }

    private final void v(Context context, String str, String str2, Bundle bundle) {
        if (p(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e8) {
                H2.p.e("Invalid event ID: ".concat(String.valueOf(str2)), e8);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f20145f, true)) {
                Method method = (Method) this.f20147h.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f20147h.put("logEventInternal", method);
                    } catch (Exception unused) {
                        w("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f20145f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    w("logEventInternal", true);
                }
            }
        }
    }

    private final void w(String str, boolean z7) {
        if (this.f20143d.get()) {
            return;
        }
        H2.p.g("Invoke Firebase method " + str + " error.");
        if (z7) {
            H2.p.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f20143d.set(true);
        }
    }

    private final boolean x(Context context, String str, AtomicReference atomicReference, boolean z7) {
        if (atomicReference.get() == null) {
            try {
                AbstractC1845Up.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                w("getInstance", z7);
                return false;
            }
        }
        return true;
    }

    public final String a(Context context) {
        Object s8;
        if (p(context) && (s8 = s("generateEventId", context)) != null) {
            return s8.toString();
        }
        return null;
    }

    public final String b(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!p(context)) {
            return null;
        }
        long longValue = ((Long) D2.A.c().a(AbstractC3184kf.f24010t0)).longValue();
        if (longValue < 0) {
            return (String) s("getAppInstanceId", context);
        }
        if (this.f20140a.get() == null) {
            if (AbstractC5780d.c()) {
                threadPoolExecutor = AbstractC1933Xd0.a().a(((Integer) D2.A.c().a(AbstractC3184kf.f24018u0)).intValue(), new ThreadFactoryC1915Wp(this), 2);
            } else {
                AbstractC2207bf abstractC2207bf = AbstractC3184kf.f24018u0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) D2.A.c().a(abstractC2207bf)).intValue(), ((Integer) D2.A.c().a(abstractC2207bf)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC1915Wp(this));
            }
            AbstractC1845Up.a(this.f20140a, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.f20140a.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.Vp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f19660o.e(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String c(Context context) {
        if (p(context) && x(context, "com.google.android.gms.measurement.AppMeasurement", this.f20145f, true)) {
            try {
                String str = (String) t(context, "getCurrentScreenName").invoke(this.f20145f.get(), null);
                if (str == null) {
                    str = (String) t(context, "getCurrentScreenClass").invoke(this.f20145f.get(), null);
                }
                return str == null ? "" : str;
            } catch (Exception unused) {
                w("getCurrentScreenName", false);
            }
        }
        return "";
    }

    public final String d(Context context) {
        if (!p(context)) {
            return null;
        }
        synchronized (this.f20141b) {
            try {
                String str = this.f20142c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) s("getGmpAppId", context);
                this.f20142c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ String e(Context context) {
        return (String) s("getAppInstanceId", context);
    }

    public final void f(Context context, String str) {
        if (p(context)) {
            u(context, str, "beginAdUnitExposure");
        }
    }

    public final void g(Context context, String str) {
        if (p(context)) {
            u(context, str, "endAdUnitExposure");
        }
    }

    public final void h(Context context, String str) {
        v(context, "_aa", str, null);
    }

    public final void i(Context context, String str) {
        v(context, "_aq", str, null);
    }

    public final void j(Context context, String str, Map map) {
        v(context, "_ac", str, q(map));
    }

    public final void k(Context context, String str, Map map) {
        v(context, "_ai", str, q(map));
    }

    public final void l(Context context, String str, String str2, String str3, int i8) {
        if (p(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i8);
            v(context, "_ar", str, bundle);
            AbstractC0608p0.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i8);
        }
    }

    public final void m(Context context, D2.X1 x12) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23631A0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.f20148i) {
            }
        }
    }

    public final void n(Context context, D2.K1 k12) {
        AbstractC1985Yp.d(context).b().c(k12);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23631A0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.f20148i) {
            }
        }
    }

    public final void o(Context context, String str) {
        if (p(context) && (context instanceof Activity) && x(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f20146g, false)) {
            Method method = (Method) this.f20147h.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.f20147h.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    w("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f20146g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                w("setCurrentScreen", false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f23956n0
            com.google.android.gms.internal.ads.if r1 = D2.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f20143d
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f24050y0
            com.google.android.gms.internal.ads.if r2 = D2.A.c()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f20144e
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            D2.C0555y.b()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = H2.g.w(r5, r0)
            if (r0 != 0) goto L59
            D2.C0555y.b()
            boolean r5 = H2.g.x(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            H2.p.g(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f20144e
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f20144e
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f20144e
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1950Xp.p(android.content.Context):boolean");
    }
}
