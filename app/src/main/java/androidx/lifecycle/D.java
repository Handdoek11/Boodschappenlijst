package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.H;
import f1.InterfaceC5764d;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class D extends H.d implements H.b {

    /* renamed from: a, reason: collision with root package name */
    private Application f10215a;

    /* renamed from: b, reason: collision with root package name */
    private final H.b f10216b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f10217c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC0922h f10218d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.savedstate.a f10219e;

    public D(Application application, InterfaceC5764d interfaceC5764d, Bundle bundle) {
        J6.r.e(interfaceC5764d, "owner");
        this.f10219e = interfaceC5764d.getSavedStateRegistry();
        this.f10218d = interfaceC5764d.getLifecycle();
        this.f10217c = bundle;
        this.f10215a = application;
        this.f10216b = application != null ? H.a.f10237e.a(application) : new H.a();
    }

    @Override // androidx.lifecycle.H.b
    public G a(Class cls) {
        J6.r.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.H.b
    public G b(Class cls, T0.a aVar) {
        J6.r.e(cls, "modelClass");
        J6.r.e(aVar, "extras");
        String str = (String) aVar.a(H.c.f10244c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.a(A.f10204a) == null || aVar.a(A.f10205b) == null) {
            if (this.f10218d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) aVar.a(H.a.f10239g);
        boolean isAssignableFrom = AbstractC0915a.class.isAssignableFrom(cls);
        Constructor c8 = (!isAssignableFrom || application == null) ? E.c(cls, E.f10224b) : E.c(cls, E.f10223a);
        return c8 == null ? this.f10216b.b(cls, aVar) : (!isAssignableFrom || application == null) ? E.d(cls, c8, A.a(aVar)) : E.d(cls, c8, application, A.a(aVar));
    }

    @Override // androidx.lifecycle.H.d
    public void c(G g8) {
        J6.r.e(g8, "viewModel");
        if (this.f10218d != null) {
            androidx.savedstate.a aVar = this.f10219e;
            J6.r.b(aVar);
            AbstractC0922h abstractC0922h = this.f10218d;
            J6.r.b(abstractC0922h);
            LegacySavedStateHandleController.a(g8, aVar, abstractC0922h);
        }
    }

    public final G d(String str, Class cls) {
        G d8;
        Application application;
        J6.r.e(str, "key");
        J6.r.e(cls, "modelClass");
        AbstractC0922h abstractC0922h = this.f10218d;
        if (abstractC0922h == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0915a.class.isAssignableFrom(cls);
        Constructor c8 = (!isAssignableFrom || this.f10215a == null) ? E.c(cls, E.f10224b) : E.c(cls, E.f10223a);
        if (c8 == null) {
            return this.f10215a != null ? this.f10216b.a(cls) : H.c.f10242a.a().a(cls);
        }
        androidx.savedstate.a aVar = this.f10219e;
        J6.r.b(aVar);
        SavedStateHandleController b8 = LegacySavedStateHandleController.b(aVar, abstractC0922h, str, this.f10217c);
        if (!isAssignableFrom || (application = this.f10215a) == null) {
            d8 = E.d(cls, c8, b8.b());
        } else {
            J6.r.b(application);
            d8 = E.d(cls, c8, application, b8.b());
        }
        d8.e("androidx.lifecycle.savedstate.vm.tag", b8);
        return d8;
    }
}
