package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.C0928n;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0921g;
import f1.C5763c;
import f1.InterfaceC5764d;

/* loaded from: classes.dex */
class I implements InterfaceC0921g, InterfaceC5764d, androidx.lifecycle.L {

    /* renamed from: o, reason: collision with root package name */
    private final Fragment f9969o;

    /* renamed from: s, reason: collision with root package name */
    private final androidx.lifecycle.K f9970s;

    /* renamed from: t, reason: collision with root package name */
    private C0928n f9971t = null;

    /* renamed from: u, reason: collision with root package name */
    private C5763c f9972u = null;

    I(Fragment fragment, androidx.lifecycle.K k8) {
        this.f9969o = fragment;
        this.f9970s = k8;
    }

    void a(AbstractC0922h.a aVar) {
        this.f9971t.h(aVar);
    }

    void b() {
        if (this.f9971t == null) {
            this.f9971t = new C0928n(this);
            C5763c a8 = C5763c.a(this);
            this.f9972u = a8;
            a8.c();
            androidx.lifecycle.A.c(this);
        }
    }

    boolean c() {
        return this.f9971t != null;
    }

    void d(Bundle bundle) {
        this.f9972u.d(bundle);
    }

    void e(Bundle bundle) {
        this.f9972u.e(bundle);
    }

    void f(AbstractC0922h.b bVar) {
        this.f9971t.m(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC0921g
    public T0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f9969o.L1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        T0.d dVar = new T0.d();
        if (application != null) {
            dVar.c(H.a.f10239g, application);
        }
        dVar.c(androidx.lifecycle.A.f10204a, this);
        dVar.c(androidx.lifecycle.A.f10205b, this);
        if (this.f9969o.x() != null) {
            dVar.c(androidx.lifecycle.A.f10206c, this.f9969o.x());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC0927m
    public AbstractC0922h getLifecycle() {
        b();
        return this.f9971t;
    }

    @Override // f1.InterfaceC5764d
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f9972u.b();
    }

    @Override // androidx.lifecycle.L
    public androidx.lifecycle.K getViewModelStore() {
        b();
        return this.f9970s;
    }
}
