package androidx.lifecycle;

import J6.AbstractC0650j;
import T0.a;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private final K f10234a;

    /* renamed from: b, reason: collision with root package name */
    private final b f10235b;

    /* renamed from: c, reason: collision with root package name */
    private final T0.a f10236c;

    public interface b {
        G a(Class cls);

        G b(Class cls, T0.a aVar);
    }

    public static class c implements b {

        /* renamed from: b, reason: collision with root package name */
        private static c f10243b;

        /* renamed from: a, reason: collision with root package name */
        public static final a f10242a = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final a.b f10244c = a.C0168a.f10245a;

        public static final class a {

            /* renamed from: androidx.lifecycle.H$c$a$a, reason: collision with other inner class name */
            private static final class C0168a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0168a f10245a = new C0168a();

                private C0168a() {
                }
            }

            public /* synthetic */ a(AbstractC0650j abstractC0650j) {
                this();
            }

            public final c a() {
                if (c.f10243b == null) {
                    c.f10243b = new c();
                }
                c cVar = c.f10243b;
                J6.r.b(cVar);
                return cVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.H.b
        public G a(Class cls) {
            J6.r.e(cls, "modelClass");
            try {
                Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                J6.r.d(newInstance, "{\n                modelC…wInstance()\n            }");
                return (G) newInstance;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        }

        @Override // androidx.lifecycle.H.b
        public /* synthetic */ G b(Class cls, T0.a aVar) {
            return I.b(this, cls, aVar);
        }
    }

    public static class d {
        public abstract void c(G g8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H(K k8, b bVar) {
        this(k8, bVar, null, 4, null);
        J6.r.e(k8, "store");
        J6.r.e(bVar, "factory");
    }

    public G a(Class cls) {
        J6.r.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public G b(String str, Class cls) {
        G a8;
        J6.r.e(str, "key");
        J6.r.e(cls, "modelClass");
        G b8 = this.f10234a.b(str);
        if (!cls.isInstance(b8)) {
            T0.d dVar = new T0.d(this.f10236c);
            dVar.c(c.f10244c, str);
            try {
                a8 = this.f10235b.b(cls, dVar);
            } catch (AbstractMethodError unused) {
                a8 = this.f10235b.a(cls);
            }
            this.f10234a.d(str, a8);
            return a8;
        }
        Object obj = this.f10235b;
        d dVar2 = obj instanceof d ? (d) obj : null;
        if (dVar2 != null) {
            J6.r.b(b8);
            dVar2.c(b8);
        }
        J6.r.c(b8, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return b8;
    }

    public static class a extends c {

        /* renamed from: f, reason: collision with root package name */
        private static a f10238f;

        /* renamed from: d, reason: collision with root package name */
        private final Application f10240d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0166a f10237e = new C0166a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final a.b f10239g = C0166a.C0167a.f10241a;

        /* renamed from: androidx.lifecycle.H$a$a, reason: collision with other inner class name */
        public static final class C0166a {

            /* renamed from: androidx.lifecycle.H$a$a$a, reason: collision with other inner class name */
            private static final class C0167a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0167a f10241a = new C0167a();

                private C0167a() {
                }
            }

            public /* synthetic */ C0166a(AbstractC0650j abstractC0650j) {
                this();
            }

            public final a a(Application application) {
                J6.r.e(application, "application");
                if (a.f10238f == null) {
                    a.f10238f = new a(application);
                }
                a aVar = a.f10238f;
                J6.r.b(aVar);
                return aVar;
            }

            private C0166a() {
            }
        }

        private a(Application application, int i8) {
            this.f10240d = application;
        }

        private final G g(Class cls, Application application) {
            if (!AbstractC0915a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                G g8 = (G) cls.getConstructor(Application.class).newInstance(application);
                J6.r.d(g8, "{\n                try {\n…          }\n            }");
                return g8;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }

        @Override // androidx.lifecycle.H.c, androidx.lifecycle.H.b
        public G a(Class cls) {
            J6.r.e(cls, "modelClass");
            Application application = this.f10240d;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.H.c, androidx.lifecycle.H.b
        public G b(Class cls, T0.a aVar) {
            J6.r.e(cls, "modelClass");
            J6.r.e(aVar, "extras");
            if (this.f10240d != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f10239g);
            if (application != null) {
                return g(cls, application);
            }
            if (AbstractC0915a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            J6.r.e(application, "application");
        }
    }

    public H(K k8, b bVar, T0.a aVar) {
        J6.r.e(k8, "store");
        J6.r.e(bVar, "factory");
        J6.r.e(aVar, "defaultCreationExtras");
        this.f10234a = k8;
        this.f10235b = bVar;
        this.f10236c = aVar;
    }

    public /* synthetic */ H(K k8, b bVar, T0.a aVar, int i8, AbstractC0650j abstractC0650j) {
        this(k8, bVar, (i8 & 4) != 0 ? a.C0103a.f5162b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H(L l8, b bVar) {
        this(l8.getViewModelStore(), bVar, J.a(l8));
        J6.r.e(l8, "owner");
        J6.r.e(bVar, "factory");
    }
}
