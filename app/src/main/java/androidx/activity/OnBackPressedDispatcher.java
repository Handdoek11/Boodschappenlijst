package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import x6.C6916E;
import y0.InterfaceC6936a;
import y6.C6979g;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f6605a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6936a f6606b;

    /* renamed from: c, reason: collision with root package name */
    private final C6979g f6607c;

    /* renamed from: d, reason: collision with root package name */
    private u f6608d;

    /* renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f6609e;

    /* renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f6610f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6611g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6612h;

    private final class LifecycleOnBackPressedCancellable implements InterfaceC0925k, androidx.activity.c {

        /* renamed from: o, reason: collision with root package name */
        private final AbstractC0922h f6613o;

        /* renamed from: s, reason: collision with root package name */
        private final u f6614s;

        /* renamed from: t, reason: collision with root package name */
        private androidx.activity.c f6615t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f6616u;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0922h abstractC0922h, u uVar) {
            J6.r.e(abstractC0922h, "lifecycle");
            J6.r.e(uVar, "onBackPressedCallback");
            this.f6616u = onBackPressedDispatcher;
            this.f6613o = abstractC0922h;
            this.f6614s = uVar;
            abstractC0922h.a(this);
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f6613o.c(this);
            this.f6614s.i(this);
            androidx.activity.c cVar = this.f6615t;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f6615t = null;
        }

        @Override // androidx.lifecycle.InterfaceC0925k
        public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
            J6.r.e(interfaceC0927m, "source");
            J6.r.e(aVar, "event");
            if (aVar == AbstractC0922h.a.ON_START) {
                this.f6615t = this.f6616u.i(this.f6614s);
                return;
            }
            if (aVar != AbstractC0922h.a.ON_STOP) {
                if (aVar == AbstractC0922h.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.c cVar = this.f6615t;
                if (cVar != null) {
                    cVar.cancel();
                }
            }
        }
    }

    static final class a extends J6.s implements I6.l {
        a() {
            super(1);
        }

        public final void b(androidx.activity.b bVar) {
            J6.r.e(bVar, "backEvent");
            OnBackPressedDispatcher.this.m(bVar);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((androidx.activity.b) obj);
            return C6916E.f44463a;
        }
    }

    static final class b extends J6.s implements I6.l {
        b() {
            super(1);
        }

        public final void b(androidx.activity.b bVar) {
            J6.r.e(bVar, "backEvent");
            OnBackPressedDispatcher.this.l(bVar);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((androidx.activity.b) obj);
            return C6916E.f44463a;
        }
    }

    static final class c extends J6.s implements I6.a {
        c() {
            super(0);
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m12invoke() {
            OnBackPressedDispatcher.this.k();
        }
    }

    static final class d extends J6.s implements I6.a {
        d() {
            super(0);
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13invoke() {
            OnBackPressedDispatcher.this.j();
        }
    }

    static final class e extends J6.s implements I6.a {
        e() {
            super(0);
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m14invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m14invoke() {
            OnBackPressedDispatcher.this.k();
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f6622a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(I6.a aVar) {
            J6.r.e(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(final I6.a aVar) {
            J6.r.e(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.v
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.f.c(aVar);
                }
            };
        }

        public final void d(Object obj, int i8, Object obj2) {
            J6.r.e(obj, "dispatcher");
            J6.r.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i8, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            J6.r.e(obj, "dispatcher");
            J6.r.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f6623a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I6.l f6624a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ I6.l f6625b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ I6.a f6626c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ I6.a f6627d;

            a(I6.l lVar, I6.l lVar2, I6.a aVar, I6.a aVar2) {
                this.f6624a = lVar;
                this.f6625b = lVar2;
                this.f6626c = aVar;
                this.f6627d = aVar2;
            }

            public void onBackCancelled() {
                this.f6627d.invoke();
            }

            public void onBackInvoked() {
                this.f6626c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                J6.r.e(backEvent, "backEvent");
                this.f6625b.invoke(new androidx.activity.b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                J6.r.e(backEvent, "backEvent");
                this.f6624a.invoke(new androidx.activity.b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(I6.l lVar, I6.l lVar2, I6.a aVar, I6.a aVar2) {
            J6.r.e(lVar, "onBackStarted");
            J6.r.e(lVar2, "onBackProgressed");
            J6.r.e(aVar, "onBackInvoked");
            J6.r.e(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    private final class h implements androidx.activity.c {

        /* renamed from: o, reason: collision with root package name */
        private final u f6628o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f6629s;

        public h(OnBackPressedDispatcher onBackPressedDispatcher, u uVar) {
            J6.r.e(uVar, "onBackPressedCallback");
            this.f6629s = onBackPressedDispatcher;
            this.f6628o = uVar;
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f6629s.f6607c.remove(this.f6628o);
            if (J6.r.a(this.f6629s.f6608d, this.f6628o)) {
                this.f6628o.c();
                this.f6629s.f6608d = null;
            }
            this.f6628o.i(this);
            I6.a b8 = this.f6628o.b();
            if (b8 != null) {
                b8.invoke();
            }
            this.f6628o.k(null);
        }
    }

    /* synthetic */ class i extends J6.o implements I6.a {
        i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            j();
            return C6916E.f44463a;
        }

        public final void j() {
            ((OnBackPressedDispatcher) this.f3564s).p();
        }
    }

    /* synthetic */ class j extends J6.o implements I6.a {
        j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            j();
            return C6916E.f44463a;
        }

        public final void j() {
            ((OnBackPressedDispatcher) this.f3564s).p();
        }
    }

    public OnBackPressedDispatcher(Runnable runnable, InterfaceC6936a interfaceC6936a) {
        this.f6605a = runnable;
        this.f6606b = interfaceC6936a;
        this.f6607c = new C6979g();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            this.f6609e = i8 >= 34 ? g.f6623a.a(new a(), new b(), new c(), new d()) : f.f6622a.b(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void j() {
        u uVar;
        u uVar2 = this.f6608d;
        if (uVar2 == null) {
            C6979g c6979g = this.f6607c;
            ListIterator listIterator = c6979g.listIterator(c6979g.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    uVar = 0;
                    break;
                } else {
                    uVar = listIterator.previous();
                    if (((u) uVar).g()) {
                        break;
                    }
                }
            }
            uVar2 = uVar;
        }
        this.f6608d = null;
        if (uVar2 != null) {
            uVar2.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void l(androidx.activity.b bVar) {
        u uVar;
        u uVar2 = this.f6608d;
        if (uVar2 == null) {
            C6979g c6979g = this.f6607c;
            ListIterator listIterator = c6979g.listIterator(c6979g.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    uVar = 0;
                    break;
                } else {
                    uVar = listIterator.previous();
                    if (((u) uVar).g()) {
                        break;
                    }
                }
            }
            uVar2 = uVar;
        }
        if (uVar2 != null) {
            uVar2.e(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(androidx.activity.b bVar) {
        Object obj;
        C6979g c6979g = this.f6607c;
        ListIterator<E> listIterator = c6979g.listIterator(c6979g.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((u) obj).g()) {
                    break;
                }
            }
        }
        u uVar = (u) obj;
        if (this.f6608d != null) {
            j();
        }
        this.f6608d = uVar;
        if (uVar != null) {
            uVar.f(bVar);
        }
    }

    private final void o(boolean z7) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f6610f;
        OnBackInvokedCallback onBackInvokedCallback = this.f6609e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z7 && !this.f6611g) {
            f.f6622a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f6611g = true;
        } else {
            if (z7 || !this.f6611g) {
                return;
            }
            f.f6622a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f6611g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        boolean z7 = this.f6612h;
        C6979g c6979g = this.f6607c;
        boolean z8 = false;
        if (!(c6979g instanceof Collection) || !c6979g.isEmpty()) {
            Iterator<E> it = c6979g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((u) it.next()).g()) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f6612h = z8;
        if (z8 != z7) {
            InterfaceC6936a interfaceC6936a = this.f6606b;
            if (interfaceC6936a != null) {
                interfaceC6936a.accept(Boolean.valueOf(z8));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z8);
            }
        }
    }

    public final void h(InterfaceC0927m interfaceC0927m, u uVar) {
        J6.r.e(interfaceC0927m, "owner");
        J6.r.e(uVar, "onBackPressedCallback");
        AbstractC0922h lifecycle = interfaceC0927m.getLifecycle();
        if (lifecycle.b() == AbstractC0922h.b.DESTROYED) {
            return;
        }
        uVar.a(new LifecycleOnBackPressedCancellable(this, lifecycle, uVar));
        p();
        uVar.k(new i(this));
    }

    public final androidx.activity.c i(u uVar) {
        J6.r.e(uVar, "onBackPressedCallback");
        this.f6607c.add(uVar);
        h hVar = new h(this, uVar);
        uVar.a(hVar);
        p();
        uVar.k(new j(this));
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void k() {
        u uVar;
        u uVar2 = this.f6608d;
        if (uVar2 == null) {
            C6979g c6979g = this.f6607c;
            ListIterator listIterator = c6979g.listIterator(c6979g.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    uVar = 0;
                    break;
                } else {
                    uVar = listIterator.previous();
                    if (((u) uVar).g()) {
                        break;
                    }
                }
            }
            uVar2 = uVar;
        }
        this.f6608d = null;
        if (uVar2 != null) {
            uVar2.d();
            return;
        }
        Runnable runnable = this.f6605a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void n(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        J6.r.e(onBackInvokedDispatcher, "invoker");
        this.f6610f = onBackInvokedDispatcher;
        o(this.f6612h);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
