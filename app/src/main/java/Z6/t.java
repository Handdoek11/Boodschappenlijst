package Z6;

import U6.G0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f6506a;

    /* renamed from: b, reason: collision with root package name */
    public static final G0 f6507b;

    static {
        t tVar = new t();
        f6506a = tVar;
        F.f("kotlinx.coroutines.fast.service.loader", true);
        f6507b = tVar.a();
    }

    private t() {
    }

    private final G0 a() {
        Object next;
        G0 e8;
        try {
            List k8 = R6.g.k(R6.g.c(ServiceLoader.load(s.class, s.class.getClassLoader()).iterator()));
            Iterator it = k8.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c8 = ((s) next).c();
                    do {
                        Object next2 = it.next();
                        int c9 = ((s) next2).c();
                        if (c8 < c9) {
                            next = next2;
                            c8 = c9;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            s sVar = (s) next;
            if (sVar != null && (e8 = u.e(sVar, k8)) != null) {
                return e8;
            }
            u.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            u.b(th, null, 2, null);
            return null;
        }
    }
}
