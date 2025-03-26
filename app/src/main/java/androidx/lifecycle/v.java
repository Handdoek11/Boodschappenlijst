package androidx.lifecycle;

import J6.AbstractC0650j;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.w;

/* loaded from: classes.dex */
public final class v implements InterfaceC0927m {

    /* renamed from: o, reason: collision with root package name */
    private int f10333o;

    /* renamed from: s, reason: collision with root package name */
    private int f10334s;

    /* renamed from: v, reason: collision with root package name */
    private Handler f10337v;

    /* renamed from: z, reason: collision with root package name */
    public static final b f10332z = new b(null);

    /* renamed from: A, reason: collision with root package name */
    private static final v f10331A = new v();

    /* renamed from: t, reason: collision with root package name */
    private boolean f10335t = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f10336u = true;

    /* renamed from: w, reason: collision with root package name */
    private final C0928n f10338w = new C0928n(this);

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f10339x = new Runnable() { // from class: androidx.lifecycle.u
        @Override // java.lang.Runnable
        public final void run() {
            v.i(this.f10330o);
        }
    };

    /* renamed from: y, reason: collision with root package name */
    private final w.a f10340y = new d();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10341a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            J6.r.e(activity, "activity");
            J6.r.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        public final InterfaceC0927m a() {
            return v.f10331A;
        }

        public final void b(Context context) {
            J6.r.e(context, "context");
            v.f10331A.h(context);
        }

        private b() {
        }
    }

    public static final class c extends AbstractC0919e {

        public static final class a extends AbstractC0919e {
            final /* synthetic */ v this$0;

            a(v vVar) {
                this.this$0 = vVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                J6.r.e(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                J6.r.e(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC0919e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            J6.r.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                w.f10343s.b(activity).e(v.this.f10340y);
            }
        }

        @Override // androidx.lifecycle.AbstractC0919e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            J6.r.e(activity, "activity");
            v.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            J6.r.e(activity, "activity");
            a.a(activity, new a(v.this));
        }

        @Override // androidx.lifecycle.AbstractC0919e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            J6.r.e(activity, "activity");
            v.this.g();
        }
    }

    public static final class d implements w.a {
        d() {
        }

        @Override // androidx.lifecycle.w.a
        public void a() {
            v.this.f();
        }

        @Override // androidx.lifecycle.w.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.w.a
        public void onResume() {
            v.this.e();
        }
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(v vVar) {
        J6.r.e(vVar, "this$0");
        vVar.j();
        vVar.k();
    }

    public final void d() {
        int i8 = this.f10334s - 1;
        this.f10334s = i8;
        if (i8 == 0) {
            Handler handler = this.f10337v;
            J6.r.b(handler);
            handler.postDelayed(this.f10339x, 700L);
        }
    }

    public final void e() {
        int i8 = this.f10334s + 1;
        this.f10334s = i8;
        if (i8 == 1) {
            if (this.f10335t) {
                this.f10338w.h(AbstractC0922h.a.ON_RESUME);
                this.f10335t = false;
            } else {
                Handler handler = this.f10337v;
                J6.r.b(handler);
                handler.removeCallbacks(this.f10339x);
            }
        }
    }

    public final void f() {
        int i8 = this.f10333o + 1;
        this.f10333o = i8;
        if (i8 == 1 && this.f10336u) {
            this.f10338w.h(AbstractC0922h.a.ON_START);
            this.f10336u = false;
        }
    }

    public final void g() {
        this.f10333o--;
        k();
    }

    @Override // androidx.lifecycle.InterfaceC0927m
    public AbstractC0922h getLifecycle() {
        return this.f10338w;
    }

    public final void h(Context context) {
        J6.r.e(context, "context");
        this.f10337v = new Handler();
        this.f10338w.h(AbstractC0922h.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        J6.r.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f10334s == 0) {
            this.f10335t = true;
            this.f10338w.h(AbstractC0922h.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f10333o == 0 && this.f10335t) {
            this.f10338w.h(AbstractC0922h.a.ON_STOP);
            this.f10336u = true;
        }
    }
}
