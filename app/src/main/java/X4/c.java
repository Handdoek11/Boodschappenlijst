package X4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f5941a = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f5942a;

        /* renamed from: b, reason: collision with root package name */
        private final H4.b f5943b;

        public a(Class cls, H4.b bVar) {
            this.f5942a = cls;
            this.f5943b = bVar;
        }

        final H4.b a() {
            return this.f5943b;
        }

        final Class b() {
            return this.f5942a;
        }
    }

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            this.f5941a.put(aVar.b(), aVar.a());
        }
    }
}
