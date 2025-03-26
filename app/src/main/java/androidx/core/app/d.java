package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class f9078a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f9079b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f9080c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f9081d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f9082e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f9083f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f9084g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C0153d f9085o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f9086s;

        a(C0153d c0153d, Object obj) {
            this.f9085o = c0153d;
            this.f9086s = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9085o.f9091o = this.f9086s;
        }
    }

    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Application f9087o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C0153d f9088s;

        b(Application application, C0153d c0153d) {
            this.f9087o = application;
            this.f9088s = c0153d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9087o.unregisterActivityLifecycleCallbacks(this.f9088s);
        }
    }

    class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f9089o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f9090s;

        c(Object obj, Object obj2) {
            this.f9089o = obj;
            this.f9090s = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f9081d;
                if (method != null) {
                    method.invoke(this.f9089o, this.f9090s, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f9082e.invoke(this.f9089o, this.f9090s, Boolean.FALSE);
                }
            } catch (RuntimeException e8) {
                if (e8.getClass() == RuntimeException.class && e8.getMessage() != null && e8.getMessage().startsWith("Unable to stop")) {
                    throw e8;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0153d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: o, reason: collision with root package name */
        Object f9091o;

        /* renamed from: s, reason: collision with root package name */
        private Activity f9092s;

        /* renamed from: t, reason: collision with root package name */
        private final int f9093t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f9094u = false;

        /* renamed from: v, reason: collision with root package name */
        private boolean f9095v = false;

        /* renamed from: w, reason: collision with root package name */
        private boolean f9096w = false;

        C0153d(Activity activity) {
            this.f9092s = activity;
            this.f9093t = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f9092s == activity) {
                this.f9092s = null;
                this.f9095v = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f9095v || this.f9096w || this.f9094u || !d.h(this.f9091o, this.f9093t, activity)) {
                return;
            }
            this.f9096w = true;
            this.f9091o = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f9092s == activity) {
                this.f9094u = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a8 = a();
        f9078a = a8;
        f9079b = b();
        f9080c = f();
        f9081d = d(a8);
        f9082e = c(a8);
        f9083f = e(a8);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i8 = Build.VERSION.SDK_INT;
        return i8 == 26 || i8 == 27;
    }

    protected static boolean h(Object obj, int i8, Activity activity) {
        try {
            Object obj2 = f9080c.get(activity);
            if (obj2 == obj && activity.hashCode() == i8) {
                f9084g.postAtFrontOfQueue(new c(f9079b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f9083f == null) {
            return false;
        }
        if (f9082e == null && f9081d == null) {
            return false;
        }
        try {
            Object obj2 = f9080c.get(activity);
            if (obj2 == null || (obj = f9079b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0153d c0153d = new C0153d(activity);
            application.registerActivityLifecycleCallbacks(c0153d);
            Handler handler = f9084g;
            handler.post(new a(c0153d, obj2));
            try {
                if (g()) {
                    Method method = f9083f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0153d));
                return true;
            } catch (Throwable th) {
                f9084g.post(new b(application, c0153d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
