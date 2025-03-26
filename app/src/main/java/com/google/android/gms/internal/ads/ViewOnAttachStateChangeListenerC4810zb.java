package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC4810zb implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: G, reason: collision with root package name */
    private static final long f28662G = ((Long) D2.A.c().a(AbstractC3184kf.f24027v1)).longValue();

    /* renamed from: A, reason: collision with root package name */
    private final G2.Z f28663A = new G2.Z(f28662G);

    /* renamed from: B, reason: collision with root package name */
    private boolean f28664B = false;

    /* renamed from: C, reason: collision with root package name */
    private int f28665C = -1;

    /* renamed from: D, reason: collision with root package name */
    private final HashSet f28666D = new HashSet();

    /* renamed from: E, reason: collision with root package name */
    private final DisplayMetrics f28667E;

    /* renamed from: F, reason: collision with root package name */
    private final Rect f28668F;

    /* renamed from: o, reason: collision with root package name */
    private final Context f28669o;

    /* renamed from: s, reason: collision with root package name */
    private Application f28670s;

    /* renamed from: t, reason: collision with root package name */
    private final WindowManager f28671t;

    /* renamed from: u, reason: collision with root package name */
    private final PowerManager f28672u;

    /* renamed from: v, reason: collision with root package name */
    private final KeyguardManager f28673v;

    /* renamed from: w, reason: collision with root package name */
    BroadcastReceiver f28674w;

    /* renamed from: x, reason: collision with root package name */
    private WeakReference f28675x;

    /* renamed from: y, reason: collision with root package name */
    final WeakReference f28676y;

    /* renamed from: z, reason: collision with root package name */
    private C1509Lb f28677z;

    public ViewOnAttachStateChangeListenerC4810zb(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f28669o = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f28671t = windowManager;
        this.f28672u = (PowerManager) applicationContext.getSystemService("power");
        this.f28673v = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f28670s = application;
            this.f28677z = new C1509Lb(application, this);
        }
        this.f28667E = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f28668F = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f28676y;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f28676y = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int h(int i8) {
        return (int) (i8 / this.f28667E.density);
    }

    private final void i(Activity activity, int i8) {
        Window window;
        if (this.f28676y == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.f28676y;
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f28665C = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        r3 = 1;
        r13 = true;
        r14 = true;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r35) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC4810zb.j(int):void");
    }

    private final void k() {
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vb
            @Override // java.lang.Runnable
            public final void run() {
                this.f27294o.d();
            }
        });
    }

    private final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f28675x = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f28674w == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f28674w = new C4483wb(this);
            C2.v.z().c(this.f28669o, this.f28674w, intentFilter);
        }
        Application application = this.f28670s;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f28677z);
            } catch (Exception e8) {
                H2.p.e("Error registering activity lifecycle callbacks.", e8);
            }
        }
    }

    private final void m(View view) {
        try {
            WeakReference weakReference = this.f28675x;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f28675x = null;
            }
        } catch (Exception e8) {
            H2.p.e("Error while unregistering listeners from the last ViewTreeObserver.", e8);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e9) {
            H2.p.e("Error while unregistering listeners from the ViewTreeObserver.", e9);
        }
        if (this.f28674w != null) {
            try {
                C2.v.z().d(this.f28669o, this.f28674w);
            } catch (IllegalStateException e10) {
                H2.p.e("Failed trying to unregister the receiver", e10);
            } catch (Exception e11) {
                C2.v.s().x(e11, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f28674w = null;
        }
        Application application = this.f28670s;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f28677z);
            } catch (Exception e12) {
                H2.p.e("Error registering activity lifecycle callbacks.", e12);
            }
        }
    }

    final Rect a(Rect rect) {
        return new Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void c(InterfaceC4701yb interfaceC4701yb) {
        this.f28666D.add(interfaceC4701yb);
        j(3);
    }

    final /* synthetic */ void d() {
        j(3);
    }

    public final void e(InterfaceC4701yb interfaceC4701yb) {
        this.f28666D.remove(interfaceC4701yb);
    }

    public final void f() {
        this.f28663A.a(f28662G);
    }

    public final void g(long j8) {
        this.f28663A.a(j8);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f28665C = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f28665C = -1;
        j(3);
        k();
        m(view);
    }
}
