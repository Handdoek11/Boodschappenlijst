package androidx.activity;

import J6.AbstractC0650j;
import T0.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.C0928n;
import androidx.lifecycle.D;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0921g;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.savedstate.a;
import c.C0967a;
import c.InterfaceC0968b;
import e.AbstractC5734a;
import f1.C5763c;
import f1.InterfaceC5764d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l1.AbstractC6167a;
import o0.InterfaceC6279b;
import o0.InterfaceC6280c;
import x6.AbstractC6929k;
import x6.C6916E;
import x6.InterfaceC6928j;
import y0.InterfaceC6936a;
import z0.C7062z;
import z0.InterfaceC6998B;
import z0.InterfaceC7056w;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends androidx.core.app.g implements InterfaceC0927m, L, InterfaceC0921g, InterfaceC5764d, w, d.f, InterfaceC6279b, InterfaceC6280c, androidx.core.app.o, androidx.core.app.p, InterfaceC7056w, t {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b(null);
    private K _viewModelStore;
    private final d.e activityResultRegistry;
    private int contentLayoutId;
    private final InterfaceC6928j defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC6928j fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC6928j onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<InterfaceC6936a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC6936a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC6936a> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC6936a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC6936a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final C5763c savedStateRegistryController;
    private final C0967a contextAwareHelper = new C0967a();
    private final C7062z menuHostHelper = new C7062z(new Runnable() { // from class: androidx.activity.d
        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.h0(this.f6636o);
        }
    });

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6585a = new a();

        private a() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            J6.r.e(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            J6.r.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    private static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private Object f6586a;

        /* renamed from: b, reason: collision with root package name */
        private K f6587b;

        public final Object a() {
            return this.f6586a;
        }

        public final K b() {
            return this.f6587b;
        }

        public final void c(Object obj) {
            this.f6586a = obj;
        }

        public final void d(K k8) {
            this.f6587b = k8;
        }
    }

    private interface d extends Executor {
        void G(View view);

        void l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final long f6588o = SystemClock.uptimeMillis() + 10000;

        /* renamed from: s, reason: collision with root package name */
        private Runnable f6589s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f6590t;

        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(e eVar) {
            J6.r.e(eVar, "this$0");
            Runnable runnable = eVar.f6589s;
            if (runnable != null) {
                J6.r.b(runnable);
                runnable.run();
                eVar.f6589s = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.d
        public void G(View view) {
            J6.r.e(view, "view");
            if (this.f6590t) {
                return;
            }
            this.f6590t = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            J6.r.e(runnable, "runnable");
            this.f6589s = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            J6.r.d(decorView, "window.decorView");
            if (!this.f6590t) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.e.b(this.f6643o);
                    }
                });
            } else if (J6.r.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.d
        public void l() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f6589s;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f6588o) {
                    this.f6590t = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f6589s = null;
            if (ComponentActivity.this.getFullyDrawnReporter().c()) {
                this.f6590t = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class f extends d.e {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(f fVar, int i8, AbstractC5734a.C0250a c0250a) {
            J6.r.e(fVar, "this$0");
            fVar.f(i8, c0250a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(f fVar, int i8, IntentSender.SendIntentException sendIntentException) {
            J6.r.e(fVar, "this$0");
            J6.r.e(sendIntentException, "$e");
            fVar.e(i8, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // d.e
        public void i(final int i8, AbstractC5734a abstractC5734a, Object obj, androidx.core.app.c cVar) {
            Bundle bundle;
            J6.r.e(abstractC5734a, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final AbstractC5734a.C0250a b8 = abstractC5734a.b(componentActivity, obj);
            if (b8 != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f.s(this.f6644o, i8, b8);
                    }
                });
                return;
            }
            Intent a8 = abstractC5734a.a(componentActivity, obj);
            if (a8.getExtras() != null) {
                Bundle extras = a8.getExtras();
                J6.r.b(extras);
                if (extras.getClassLoader() == null) {
                    a8.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (a8.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a8.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a8.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if (J6.r.a("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a8.getAction())) {
                String[] stringArrayExtra = a8.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.v(componentActivity, stringArrayExtra, i8);
                return;
            }
            if (!J6.r.a("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a8.getAction())) {
                androidx.core.app.b.y(componentActivity, a8, i8, bundle);
                return;
            }
            d.g gVar = (d.g) a8.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                J6.r.b(gVar);
                androidx.core.app.b.z(componentActivity, gVar.d(), i8, gVar.a(), gVar.b(), gVar.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e8) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f.t(this.f6647o, i8, e8);
                    }
                });
            }
        }
    }

    static final class g extends J6.s implements I6.a {
        g() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final D invoke() {
            Application application = ComponentActivity.this.getApplication();
            ComponentActivity componentActivity = ComponentActivity.this;
            return new D(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
        }
    }

    static final class h extends J6.s implements I6.a {

        static final class a extends J6.s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ ComponentActivity f6595o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComponentActivity componentActivity) {
                super(0);
                this.f6595o = componentActivity;
            }

            @Override // I6.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m11invoke();
                return C6916E.f44463a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m11invoke() {
                this.f6595o.reportFullyDrawn();
            }
        }

        h() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return new s(ComponentActivity.this.reportFullyDrawnExecutor, new a(ComponentActivity.this));
        }
    }

    static final class i extends J6.s implements I6.a {
        i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(ComponentActivity componentActivity) {
            J6.r.e(componentActivity, "this$0");
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e8) {
                if (!J6.r.a(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e8;
                }
            } catch (NullPointerException e9) {
                if (!J6.r.a(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e9;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
            J6.r.e(componentActivity, "this$0");
            J6.r.e(onBackPressedDispatcher, "$dispatcher");
            componentActivity.d0(onBackPressedDispatcher);
        }

        @Override // I6.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final OnBackPressedDispatcher invoke() {
            final ComponentActivity componentActivity = ComponentActivity.this;
            final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.m
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.i.g(componentActivity);
                }
            });
            final ComponentActivity componentActivity2 = ComponentActivity.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (J6.r.a(Looper.myLooper(), Looper.getMainLooper())) {
                    componentActivity2.d0(onBackPressedDispatcher);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.i.h(componentActivity2, onBackPressedDispatcher);
                        }
                    });
                }
            }
            return onBackPressedDispatcher;
        }
    }

    public ComponentActivity() {
        C5763c a8 = C5763c.f35801d.a(this);
        this.savedStateRegistryController = a8;
        this.reportFullyDrawnExecutor = f0();
        this.fullyDrawnReporter$delegate = AbstractC6929k.a(new h());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC0925k() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.InterfaceC0925k
            public final void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
                ComponentActivity.Z(this.f6637o, interfaceC0927m, aVar);
            }
        });
        getLifecycle().a(new InterfaceC0925k() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.InterfaceC0925k
            public final void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
                ComponentActivity.a0(this.f6638o, interfaceC0927m, aVar);
            }
        });
        getLifecycle().a(new InterfaceC0925k() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC0925k
            public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
                J6.r.e(interfaceC0927m, "source");
                J6.r.e(aVar, "event");
                ComponentActivity.this.g0();
                ComponentActivity.this.getLifecycle().c(this);
            }
        });
        a8.c();
        A.c(this);
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new a.c() { // from class: androidx.activity.g
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return ComponentActivity.b0(this.f6639a);
            }
        });
        addOnContextAvailableListener(new InterfaceC0968b() { // from class: androidx.activity.h
            @Override // c.InterfaceC0968b
            public final void a(Context context) {
                ComponentActivity.c0(this.f6640a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = AbstractC6929k.a(new g());
        this.onBackPressedDispatcher$delegate = AbstractC6929k.a(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(ComponentActivity componentActivity, InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        Window window;
        View peekDecorView;
        J6.r.e(componentActivity, "this$0");
        J6.r.e(interfaceC0927m, "<anonymous parameter 0>");
        J6.r.e(aVar, "event");
        if (aVar != AbstractC0922h.a.ON_STOP || (window = componentActivity.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(ComponentActivity componentActivity, InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        J6.r.e(componentActivity, "this$0");
        J6.r.e(interfaceC0927m, "<anonymous parameter 0>");
        J6.r.e(aVar, "event");
        if (aVar == AbstractC0922h.a.ON_DESTROY) {
            componentActivity.contextAwareHelper.b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle b0(ComponentActivity componentActivity) {
        J6.r.e(componentActivity, "this$0");
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(ComponentActivity componentActivity, Context context) {
        J6.r.e(componentActivity, "this$0");
        J6.r.e(context, "it");
        Bundle b8 = componentActivity.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b8 != null) {
            componentActivity.activityResultRegistry.j(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().a(new InterfaceC0925k() { // from class: androidx.activity.i
            @Override // androidx.lifecycle.InterfaceC0925k
            public final void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
                ComponentActivity.e0(onBackPressedDispatcher, this, interfaceC0927m, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        J6.r.e(onBackPressedDispatcher, "$dispatcher");
        J6.r.e(componentActivity, "this$0");
        J6.r.e(interfaceC0927m, "<anonymous parameter 0>");
        J6.r.e(aVar, "event");
        if (aVar == AbstractC0922h.a.ON_CREATE) {
            onBackPressedDispatcher.n(a.f6585a.a(componentActivity));
        }
    }

    private final d f0() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new K();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(ComponentActivity componentActivity) {
        J6.r.e(componentActivity, "this$0");
        componentActivity.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        J6.r.d(decorView, "window.decorView");
        dVar.G(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // z0.InterfaceC7056w
    public void addMenuProvider(InterfaceC6998B interfaceC6998B) {
        J6.r.e(interfaceC6998B, "provider");
        this.menuHostHelper.c(interfaceC6998B);
    }

    @Override // o0.InterfaceC6279b
    public final void addOnConfigurationChangedListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onConfigurationChangedListeners.add(interfaceC6936a);
    }

    public final void addOnContextAvailableListener(InterfaceC0968b interfaceC0968b) {
        J6.r.e(interfaceC0968b, "listener");
        this.contextAwareHelper.a(interfaceC0968b);
    }

    @Override // androidx.core.app.o
    public final void addOnMultiWindowModeChangedListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onMultiWindowModeChangedListeners.add(interfaceC6936a);
    }

    public final void addOnNewIntentListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onNewIntentListeners.add(interfaceC6936a);
    }

    @Override // androidx.core.app.p
    public final void addOnPictureInPictureModeChangedListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onPictureInPictureModeChangedListeners.add(interfaceC6936a);
    }

    @Override // o0.InterfaceC6280c
    public final void addOnTrimMemoryListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onTrimMemoryListeners.add(interfaceC6936a);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        J6.r.e(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // d.f
    public final d.e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0921g
    public T0.a getDefaultViewModelCreationExtras() {
        T0.d dVar = new T0.d(null, 1, null);
        if (getApplication() != null) {
            a.b bVar = H.a.f10239g;
            Application application = getApplication();
            J6.r.d(application, "application");
            dVar.c(bVar, application);
        }
        dVar.c(A.f10204a, this);
        dVar.c(A.f10205b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.c(A.f10206c, extras);
        }
        return dVar;
    }

    public H.b getDefaultViewModelProviderFactory() {
        return (H.b) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public s getFullyDrawnReporter() {
        return (s) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // androidx.core.app.g, androidx.lifecycle.InterfaceC0927m
    public AbstractC0922h getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.w
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // f1.InterfaceC5764d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.L
    public K getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        g0();
        K k8 = this._viewModelStore;
        J6.r.b(k8);
        return k8;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        J6.r.d(decorView, "window.decorView");
        M.a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        J6.r.d(decorView2, "window.decorView");
        N.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        J6.r.d(decorView3, "window.decorView");
        f1.e.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        J6.r.d(decorView4, "window.decorView");
        z.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        J6.r.d(decorView5, "window.decorView");
        y.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        if (this.activityResultRegistry.e(i8, i9, intent)) {
            return;
        }
        super.onActivityResult(i8, i9, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().k();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        J6.r.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC6936a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.w.f10343s.c(this);
        int i8 = this.contentLayoutId;
        if (i8 != 0) {
            setContentView(i8);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i8, Menu menu) {
        J6.r.e(menu, "menu");
        if (i8 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i8, menu);
        this.menuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        J6.r.e(menuItem, "item");
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        if (i8 == 0) {
            return this.menuHostHelper.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z7) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC6936a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.h(z7));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        J6.r.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC6936a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        J6.r.e(menu, "menu");
        this.menuHostHelper.i(menu);
        super.onPanelClosed(i8, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z7) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC6936a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.q(z7));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i8, View view, Menu menu) {
        J6.r.e(menu, "menu");
        if (i8 != 0) {
            return true;
        }
        super.onPreparePanel(i8, view, menu);
        this.menuHostHelper.k(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        J6.r.e(strArr, "permissions");
        J6.r.e(iArr, "grantResults");
        if (this.activityResultRegistry.e(i8, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i8, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        K k8 = this._viewModelStore;
        if (k8 == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            k8 = cVar.b();
        }
        if (k8 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.c(onRetainCustomNonConfigurationInstance);
        cVar2.d(k8);
        return cVar2;
    }

    @Override // androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        J6.r.e(bundle, "outState");
        if (getLifecycle() instanceof C0928n) {
            AbstractC0922h lifecycle = getLifecycle();
            J6.r.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0928n) lifecycle).m(AbstractC0922h.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i8) {
        super.onTrimMemory(i8);
        Iterator<InterfaceC6936a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i8));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> d.c registerForActivityResult(AbstractC5734a abstractC5734a, d.e eVar, d.b bVar) {
        J6.r.e(abstractC5734a, "contract");
        J6.r.e(eVar, "registry");
        J6.r.e(bVar, "callback");
        return eVar.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, abstractC5734a, bVar);
    }

    @Override // z0.InterfaceC7056w
    public void removeMenuProvider(InterfaceC6998B interfaceC6998B) {
        J6.r.e(interfaceC6998B, "provider");
        this.menuHostHelper.l(interfaceC6998B);
    }

    @Override // o0.InterfaceC6279b
    public final void removeOnConfigurationChangedListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onConfigurationChangedListeners.remove(interfaceC6936a);
    }

    public final void removeOnContextAvailableListener(InterfaceC0968b interfaceC0968b) {
        J6.r.e(interfaceC0968b, "listener");
        this.contextAwareHelper.e(interfaceC0968b);
    }

    @Override // androidx.core.app.o
    public final void removeOnMultiWindowModeChangedListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onMultiWindowModeChangedListeners.remove(interfaceC6936a);
    }

    public final void removeOnNewIntentListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onNewIntentListeners.remove(interfaceC6936a);
    }

    @Override // androidx.core.app.p
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onPictureInPictureModeChangedListeners.remove(interfaceC6936a);
    }

    @Override // o0.InterfaceC6280c
    public final void removeOnTrimMemoryListener(InterfaceC6936a interfaceC6936a) {
        J6.r.e(interfaceC6936a, "listener");
        this.onTrimMemoryListeners.remove(interfaceC6936a);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        J6.r.e(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC6167a.d()) {
                AbstractC6167a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            AbstractC6167a.b();
        } catch (Throwable th) {
            AbstractC6167a.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i8) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        J6.r.d(decorView, "window.decorView");
        dVar.G(decorView);
        super.setContentView(i8);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i8) {
        J6.r.e(intent, "intent");
        super.startActivityForResult(intent, i8);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11) {
        J6.r.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11);
    }

    public void addMenuProvider(InterfaceC6998B interfaceC6998B, InterfaceC0927m interfaceC0927m) {
        J6.r.e(interfaceC6998B, "provider");
        J6.r.e(interfaceC0927m, "owner");
        this.menuHostHelper.d(interfaceC6998B, interfaceC0927m);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i8, Bundle bundle) {
        J6.r.e(intent, "intent");
        super.startActivityForResult(intent, i8, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        J6.r.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(InterfaceC6998B interfaceC6998B, InterfaceC0927m interfaceC0927m, AbstractC0922h.b bVar) {
        J6.r.e(interfaceC6998B, "provider");
        J6.r.e(interfaceC0927m, "owner");
        J6.r.e(bVar, "state");
        this.menuHostHelper.e(interfaceC6998B, interfaceC0927m, bVar);
    }

    public final <I, O> d.c registerForActivityResult(AbstractC5734a abstractC5734a, d.b bVar) {
        J6.r.e(abstractC5734a, "contract");
        J6.r.e(bVar, "callback");
        return registerForActivityResult(abstractC5734a, this.activityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z7, Configuration configuration) {
        J6.r.e(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z7, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC6936a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.h(z7, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z7, Configuration configuration) {
        J6.r.e(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z7, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC6936a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.q(z7, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        J6.r.d(decorView, "window.decorView");
        dVar.G(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        J6.r.d(decorView, "window.decorView");
        dVar.G(decorView);
        super.setContentView(view, layoutParams);
    }
}
