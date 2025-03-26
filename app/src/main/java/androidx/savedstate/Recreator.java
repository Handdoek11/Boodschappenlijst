package androidx.savedstate;

import J6.AbstractC0650j;
import J6.r;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import androidx.savedstate.a;
import f1.InterfaceC5764d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0925k {

    /* renamed from: s, reason: collision with root package name */
    public static final a f11412s = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5764d f11413o;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements a.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f11414a;

        public b(androidx.savedstate.a aVar) {
            r.e(aVar, "registry");
            this.f11414a = new LinkedHashSet();
            aVar.h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f11414a));
            return bundle;
        }

        public final void b(String str) {
            r.e(str, "className");
            this.f11414a.add(str);
        }
    }

    public Recreator(InterfaceC5764d interfaceC5764d) {
        r.e(interfaceC5764d, "owner");
        this.f11413o = interfaceC5764d;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0188a.class);
            r.d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    r.d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0188a) newInstance).a(this.f11413o);
                } catch (Exception e8) {
                    throw new RuntimeException("Failed to instantiate " + str, e8);
                }
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Class " + str + " wasn't found", e10);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        r.e(interfaceC0927m, "source");
        r.e(aVar, "event");
        if (aVar != AbstractC0922h.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0927m.getLifecycle().c(this);
        Bundle b8 = this.f11413o.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (b8 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b8.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
