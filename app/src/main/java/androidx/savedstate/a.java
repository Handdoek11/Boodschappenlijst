package androidx.savedstate;

import J6.AbstractC0650j;
import J6.r;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import androidx.savedstate.Recreator;
import f1.InterfaceC5764d;
import java.util.Iterator;
import java.util.Map;
import m.C6182b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final b f11415g = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private boolean f11417b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f11418c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11419d;

    /* renamed from: e, reason: collision with root package name */
    private Recreator.b f11420e;

    /* renamed from: a, reason: collision with root package name */
    private final C6182b f11416a = new C6182b();

    /* renamed from: f, reason: collision with root package name */
    private boolean f11421f = true;

    /* renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0188a {
        void a(InterfaceC5764d interfaceC5764d);
    }

    private static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar2) {
        r.e(aVar, "this$0");
        r.e(interfaceC0927m, "<anonymous parameter 0>");
        r.e(aVar2, "event");
        if (aVar2 == AbstractC0922h.a.ON_START) {
            aVar.f11421f = true;
        } else if (aVar2 == AbstractC0922h.a.ON_STOP) {
            aVar.f11421f = false;
        }
    }

    public final Bundle b(String str) {
        r.e(str, "key");
        if (!this.f11419d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f11418c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f11418c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f11418c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f11418c = null;
        }
        return bundle2;
    }

    public final c c(String str) {
        r.e(str, "key");
        Iterator it = this.f11416a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r.d(entry, "components");
            String str2 = (String) entry.getKey();
            c cVar = (c) entry.getValue();
            if (r.a(str2, str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC0922h abstractC0922h) {
        r.e(abstractC0922h, "lifecycle");
        if (this.f11417b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC0922h.a(new InterfaceC0925k() { // from class: f1.b
            @Override // androidx.lifecycle.InterfaceC0925k
            public final void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
                androidx.savedstate.a.d(this.f35800o, interfaceC0927m, aVar);
            }
        });
        this.f11417b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f11417b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f11419d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f11418c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f11419d = true;
    }

    public final void g(Bundle bundle) {
        r.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f11418c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C6182b.d d8 = this.f11416a.d();
        r.d(d8, "this.components.iteratorWithAdditions()");
        while (d8.hasNext()) {
            Map.Entry entry = (Map.Entry) d8.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        r.e(str, "key");
        r.e(cVar, "provider");
        if (((c) this.f11416a.n(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class cls) {
        r.e(cls, "clazz");
        if (!this.f11421f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.b bVar = this.f11420e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f11420e = bVar;
        try {
            cls.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.f11420e;
            if (bVar2 != null) {
                String name = cls.getName();
                r.d(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e8) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
        }
    }
}
