package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC4372va implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: D, reason: collision with root package name */
    private static final Handler f27280D = new Handler(Looper.getMainLooper());

    /* renamed from: A, reason: collision with root package name */
    private byte f27281A = -1;

    /* renamed from: B, reason: collision with root package name */
    private int f27282B = -1;

    /* renamed from: C, reason: collision with root package name */
    private long f27283C = -3;

    /* renamed from: o, reason: collision with root package name */
    private final Context f27284o;

    /* renamed from: s, reason: collision with root package name */
    private Application f27285s;

    /* renamed from: t, reason: collision with root package name */
    private final PowerManager f27286t;

    /* renamed from: u, reason: collision with root package name */
    private final KeyguardManager f27287u;

    /* renamed from: v, reason: collision with root package name */
    private BroadcastReceiver f27288v;

    /* renamed from: w, reason: collision with root package name */
    private final C2740ga f27289w;

    /* renamed from: x, reason: collision with root package name */
    private WeakReference f27290x;

    /* renamed from: y, reason: collision with root package name */
    private WeakReference f27291y;

    /* renamed from: z, reason: collision with root package name */
    private C2414da f27292z;

    public ViewOnAttachStateChangeListenerC4372va(Context context, C2740ga c2740ga) {
        Context applicationContext = context.getApplicationContext();
        this.f27284o = applicationContext;
        this.f27289w = c2740ga;
        this.f27286t = (PowerManager) applicationContext.getSystemService("power");
        this.f27287u = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f27285s = application;
            this.f27292z = new C2414da(application, this);
        }
        d(null);
    }

    private final void e(Activity activity, int i8) {
        Window window;
        if (this.f27291y == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View b8 = b();
        if (b8 == null || peekDecorView == null || b8.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f27282B = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r10 = this;
            r0 = 1
            java.lang.ref.WeakReference r1 = r10.f27291y
            if (r1 != 0) goto L7
            goto Lbe
        L7:
            android.view.View r1 = r10.b()
            r2 = -1
            r3 = -3
            if (r1 != 0) goto L15
            r10.f27283C = r3
            r10.f27281A = r2
            return
        L15:
            int r5 = r1.getVisibility()
            r6 = 0
            if (r5 == 0) goto L1e
            r5 = r0
            goto L1f
        L1e:
            r5 = r6
        L1f:
            boolean r7 = r1.isShown()
            if (r7 != 0) goto L27
            r5 = r5 | 2
        L27:
            android.os.PowerManager r7 = r10.f27286t
            if (r7 == 0) goto L33
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L33
            r5 = r5 | 4
        L33:
            com.google.android.gms.internal.ads.ga r7 = r10.f27289w
            boolean r7 = r7.a()
            if (r7 != 0) goto L84
            android.app.KeyguardManager r7 = r10.f27287u
            if (r7 == 0) goto L82
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L82
            int r7 = com.google.android.gms.internal.ads.AbstractC3936ra.f26195b
            android.view.View r7 = r1.getRootView()
            if (r7 != 0) goto L4e
            r7 = r1
        L4e:
            android.content.Context r7 = r7.getContext()
        L52:
            boolean r8 = r7 instanceof android.content.ContextWrapper
            r9 = 0
            if (r8 == 0) goto L6a
            r8 = 10
            if (r6 >= r8) goto L6a
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L62
            android.app.Activity r7 = (android.app.Activity) r7
            goto L6b
        L62:
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            int r6 = r6 + r0
            goto L52
        L6a:
            r7 = r9
        L6b:
            if (r7 != 0) goto L6e
            goto L82
        L6e:
            android.view.Window r0 = r7.getWindow()
            if (r0 != 0) goto L75
            goto L79
        L75:
            android.view.WindowManager$LayoutParams r9 = r0.getAttributes()
        L79:
            if (r9 == 0) goto L82
            int r0 = r9.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r6
            if (r0 != 0) goto L84
        L82:
            r5 = r5 | 8
        L84:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getGlobalVisibleRect(r0)
            if (r0 != 0) goto L91
            r5 = r5 | 16
        L91:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getLocalVisibleRect(r0)
            if (r0 != 0) goto L9e
            r5 = r5 | 32
        L9e:
            int r0 = r1.getWindowVisibility()
            int r1 = r10.f27282B
            if (r1 == r2) goto La7
            r0 = r1
        La7:
            if (r0 == 0) goto Lab
            r5 = r5 | 64
        Lab:
            byte r0 = r10.f27281A
            if (r0 == r5) goto Lbe
            byte r0 = (byte) r5
            r10.f27281A = r0
            if (r5 != 0) goto Lb9
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbc
        Lb9:
            long r0 = (long) r5
            long r0 = r3 - r0
        Lbc:
            r10.f27283C = r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC4372va.f():void");
    }

    private final void g() {
        f27280D.post(new RunnableC4154ta(this));
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f27290x = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f27288v == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C4263ua c4263ua = new C4263ua(this);
            this.f27288v = c4263ua;
            this.f27284o.registerReceiver(c4263ua, intentFilter);
        }
        Application application = this.f27285s;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f27292z);
            } catch (Exception unused) {
            }
        }
    }

    private final void i(View view) {
        try {
            WeakReference weakReference = this.f27290x;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f27290x = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f27288v;
        if (broadcastReceiver != null) {
            try {
                this.f27284o.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f27288v = null;
        }
        Application application = this.f27285s;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f27292z);
            } catch (Exception unused4) {
            }
        }
    }

    public final long a() {
        if (this.f27283C <= -2 && b() == null) {
            this.f27283C = -3L;
        }
        return this.f27283C;
    }

    final View b() {
        WeakReference weakReference = this.f27291y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    final void d(View view) {
        long j8;
        View b8 = b();
        if (b8 != null) {
            b8.removeOnAttachStateChangeListener(this);
            i(b8);
        }
        this.f27291y = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j8 = -2;
        } else {
            j8 = -3;
        }
        this.f27283C = j8;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        f();
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f27282B = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f27282B = -1;
        f();
        g();
        i(view);
    }
}
