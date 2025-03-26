package Y1;

import J1.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f6059a = new ArrayList();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f6060a;

        /* renamed from: b, reason: collision with root package name */
        final k f6061b;

        a(Class cls, k kVar) {
            this.f6060a = cls;
            this.f6061b = kVar;
        }

        boolean a(Class cls) {
            return this.f6060a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, k kVar) {
        this.f6059a.add(new a(cls, kVar));
    }

    public synchronized k b(Class cls) {
        int size = this.f6059a.size();
        for (int i8 = 0; i8 < size; i8++) {
            a aVar = (a) this.f6059a.get(i8);
            if (aVar.a(cls)) {
                return aVar.f6061b;
            }
        }
        return null;
    }
}
