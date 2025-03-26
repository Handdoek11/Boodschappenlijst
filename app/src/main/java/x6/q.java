package x6;

import x6.C6934p;

/* loaded from: classes2.dex */
public abstract class q {
    public static final Object a(Throwable th) {
        J6.r.e(th, "exception");
        return new C6934p.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof C6934p.b) {
            throw ((C6934p.b) obj).f44489o;
        }
    }
}
