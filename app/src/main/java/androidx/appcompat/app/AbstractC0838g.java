package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import q.C6398b;

/* renamed from: androidx.appcompat.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0838g {

    /* renamed from: o, reason: collision with root package name */
    static c f6854o = new c(new d());

    /* renamed from: s, reason: collision with root package name */
    private static int f6855s = -100;

    /* renamed from: t, reason: collision with root package name */
    private static v0.i f6856t = null;

    /* renamed from: u, reason: collision with root package name */
    private static v0.i f6857u = null;

    /* renamed from: v, reason: collision with root package name */
    private static Boolean f6858v = null;

    /* renamed from: w, reason: collision with root package name */
    private static boolean f6859w = false;

    /* renamed from: x, reason: collision with root package name */
    private static final C6398b f6860x = new C6398b();

    /* renamed from: y, reason: collision with root package name */
    private static final Object f6861y = new Object();

    /* renamed from: z, reason: collision with root package name */
    private static final Object f6862z = new Object();

    /* renamed from: androidx.appcompat.app.g$a */
    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.app.g$c */
    static class c implements Executor {

        /* renamed from: o, reason: collision with root package name */
        private final Object f6863o = new Object();

        /* renamed from: s, reason: collision with root package name */
        final Queue f6864s = new ArrayDeque();

        /* renamed from: t, reason: collision with root package name */
        final Executor f6865t;

        /* renamed from: u, reason: collision with root package name */
        Runnable f6866u;

        c(Executor executor) {
            this.f6865t = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        protected void c() {
            synchronized (this.f6863o) {
                try {
                    Runnable runnable = (Runnable) this.f6864s.poll();
                    this.f6866u = runnable;
                    if (runnable != null) {
                        this.f6865t.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f6863o) {
                try {
                    this.f6864s.add(new Runnable() { // from class: androidx.appcompat.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6867o.b(runnable);
                        }
                    });
                    if (this.f6866u == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$d */
    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    AbstractC0838g() {
    }

    static void F(AbstractC0838g abstractC0838g) {
        synchronized (f6861y) {
            G(abstractC0838g);
        }
    }

    private static void G(AbstractC0838g abstractC0838g) {
        synchronized (f6861y) {
            try {
                Iterator it = f6860x.iterator();
                while (it.hasNext()) {
                    AbstractC0838g abstractC0838g2 = (AbstractC0838g) ((WeakReference) it.next()).get();
                    if (abstractC0838g2 == abstractC0838g || abstractC0838g2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void Q(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (k().f()) {
                    String b8 = androidx.core.app.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(b8));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void R(final Context context) {
        if (v(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f6859w) {
                    return;
                }
                f6854o.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0838g.w(context);
                    }
                });
                return;
            }
            synchronized (f6862z) {
                try {
                    v0.i iVar = f6856t;
                    if (iVar == null) {
                        if (f6857u == null) {
                            f6857u = v0.i.c(androidx.core.app.e.b(context));
                        }
                        if (f6857u.f()) {
                        } else {
                            f6856t = f6857u;
                        }
                    } else if (!iVar.equals(f6857u)) {
                        v0.i iVar2 = f6856t;
                        f6857u = iVar2;
                        androidx.core.app.e.a(context, iVar2.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static void d(AbstractC0838g abstractC0838g) {
        synchronized (f6861y) {
            G(abstractC0838g);
            f6860x.add(new WeakReference(abstractC0838g));
        }
    }

    public static AbstractC0838g h(Activity activity, InterfaceC0836e interfaceC0836e) {
        return new LayoutInflaterFactory2C0840i(activity, interfaceC0836e);
    }

    public static AbstractC0838g i(Dialog dialog, InterfaceC0836e interfaceC0836e) {
        return new LayoutInflaterFactory2C0840i(dialog, interfaceC0836e);
    }

    public static v0.i k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object p8 = p();
            if (p8 != null) {
                return v0.i.i(b.a(p8));
            }
        } else {
            v0.i iVar = f6856t;
            if (iVar != null) {
                return iVar;
            }
        }
        return v0.i.e();
    }

    public static int m() {
        return f6855s;
    }

    static Object p() {
        Context l8;
        Iterator it = f6860x.iterator();
        while (it.hasNext()) {
            AbstractC0838g abstractC0838g = (AbstractC0838g) ((WeakReference) it.next()).get();
            if (abstractC0838g != null && (l8 = abstractC0838g.l()) != null) {
                return l8.getSystemService("locale");
            }
        }
        return null;
    }

    static v0.i r() {
        return f6856t;
    }

    static boolean v(Context context) {
        if (f6858v == null) {
            try {
                Bundle bundle = A.a(context).metaData;
                if (bundle != null) {
                    f6858v = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f6858v = Boolean.FALSE;
            }
        }
        return f6858v.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Context context) {
        Q(context);
        f6859w = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i8);

    public abstract void I(int i8);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void M(Toolbar toolbar);

    public abstract void N(int i8);

    public abstract void O(CharSequence charSequence);

    public abstract androidx.appcompat.view.b P(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i8);

    public abstract Context l();

    public abstract InterfaceC0833b n();

    public abstract int o();

    public abstract MenuInflater q();

    public abstract AbstractC0832a s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
