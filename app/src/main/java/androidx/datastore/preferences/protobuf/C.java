package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0899x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private static final C f9283a;

    /* renamed from: b, reason: collision with root package name */
    private static final C f9284b;

    private static final class b extends C {

        /* renamed from: c, reason: collision with root package name */
        private static final Class f9285c = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j8) {
            return (List) m0.A(obj, j8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static List g(Object obj, long j8, int i8) {
            A a8;
            List f8 = f(obj, j8);
            if (f8.isEmpty()) {
                List a9 = f8 instanceof B ? new A(i8) : ((f8 instanceof W) && (f8 instanceof AbstractC0899x.b)) ? ((AbstractC0899x.b) f8).u(i8) : new ArrayList(i8);
                m0.O(obj, j8, a9);
                return a9;
            }
            if (f9285c.isAssignableFrom(f8.getClass())) {
                ArrayList arrayList = new ArrayList(f8.size() + i8);
                arrayList.addAll(f8);
                m0.O(obj, j8, arrayList);
                a8 = arrayList;
            } else {
                if (!(f8 instanceof l0)) {
                    if (!(f8 instanceof W) || !(f8 instanceof AbstractC0899x.b)) {
                        return f8;
                    }
                    AbstractC0899x.b bVar = (AbstractC0899x.b) f8;
                    if (bVar.x0()) {
                        return f8;
                    }
                    AbstractC0899x.b u7 = bVar.u(f8.size() + i8);
                    m0.O(obj, j8, u7);
                    return u7;
                }
                A a10 = new A(f8.size() + i8);
                a10.addAll((l0) f8);
                m0.O(obj, j8, a10);
                a8 = a10;
            }
            return a8;
        }

        @Override // androidx.datastore.preferences.protobuf.C
        void c(Object obj, long j8) {
            Object unmodifiableList;
            List list = (List) m0.A(obj, j8);
            if (list instanceof B) {
                unmodifiableList = ((B) list).i();
            } else {
                if (f9285c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof W) && (list instanceof AbstractC0899x.b)) {
                    AbstractC0899x.b bVar = (AbstractC0899x.b) list;
                    if (bVar.x0()) {
                        bVar.k();
                        return;
                    }
                    return;
                }
                unmodifiableList = DesugarCollections.unmodifiableList(list);
            }
            m0.O(obj, j8, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.C
        void d(Object obj, Object obj2, long j8) {
            List f8 = f(obj2, j8);
            List g8 = g(obj, j8, f8.size());
            int size = g8.size();
            int size2 = f8.size();
            if (size > 0 && size2 > 0) {
                g8.addAll(f8);
            }
            if (size > 0) {
                f8 = g8;
            }
            m0.O(obj, j8, f8);
        }

        @Override // androidx.datastore.preferences.protobuf.C
        List e(Object obj, long j8) {
            return g(obj, j8, 10);
        }
    }

    private static final class c extends C {
        private c() {
            super();
        }

        static AbstractC0899x.b f(Object obj, long j8) {
            return (AbstractC0899x.b) m0.A(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.C
        void c(Object obj, long j8) {
            f(obj, j8).k();
        }

        @Override // androidx.datastore.preferences.protobuf.C
        void d(Object obj, Object obj2, long j8) {
            AbstractC0899x.b f8 = f(obj, j8);
            AbstractC0899x.b f9 = f(obj2, j8);
            int size = f8.size();
            int size2 = f9.size();
            if (size > 0 && size2 > 0) {
                if (!f8.x0()) {
                    f8 = f8.u(size2 + size);
                }
                f8.addAll(f9);
            }
            if (size > 0) {
                f9 = f8;
            }
            m0.O(obj, j8, f9);
        }

        @Override // androidx.datastore.preferences.protobuf.C
        List e(Object obj, long j8) {
            AbstractC0899x.b f8 = f(obj, j8);
            if (f8.x0()) {
                return f8;
            }
            int size = f8.size();
            AbstractC0899x.b u7 = f8.u(size == 0 ? 10 : size * 2);
            m0.O(obj, j8, u7);
            return u7;
        }
    }

    static {
        f9283a = new b();
        f9284b = new c();
    }

    static C a() {
        return f9283a;
    }

    static C b() {
        return f9284b;
    }

    abstract void c(Object obj, long j8);

    abstract void d(Object obj, Object obj2, long j8);

    abstract List e(Object obj, long j8);

    private C() {
    }
}
