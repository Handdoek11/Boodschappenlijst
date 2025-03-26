package Y1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List f6045a = new ArrayList();

    /* renamed from: Y1.a$a, reason: collision with other inner class name */
    private static final class C0124a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f6046a;

        /* renamed from: b, reason: collision with root package name */
        final J1.d f6047b;

        C0124a(Class cls, J1.d dVar) {
            this.f6046a = cls;
            this.f6047b = dVar;
        }

        boolean a(Class cls) {
            return this.f6046a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, J1.d dVar) {
        this.f6045a.add(new C0124a(cls, dVar));
    }

    public synchronized J1.d b(Class cls) {
        for (C0124a c0124a : this.f6045a) {
            if (c0124a.a(cls)) {
                return c0124a.f6047b;
            }
        }
        return null;
    }
}
