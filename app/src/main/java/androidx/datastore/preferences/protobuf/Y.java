package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class Y {

    /* renamed from: c, reason: collision with root package name */
    private static final Y f9339c = new Y();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f9341b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final d0 f9340a = new E();

    private Y() {
    }

    public static Y a() {
        return f9339c;
    }

    public c0 b(Class cls, c0 c0Var) {
        AbstractC0899x.b(cls, "messageType");
        AbstractC0899x.b(c0Var, "schema");
        return (c0) this.f9341b.putIfAbsent(cls, c0Var);
    }

    public c0 c(Class cls) {
        AbstractC0899x.b(cls, "messageType");
        c0 c0Var = (c0) this.f9341b.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        c0 a8 = this.f9340a.a(cls);
        c0 b8 = b(cls, a8);
        return b8 != null ? b8 : a8;
    }

    public c0 d(Object obj) {
        return c(obj.getClass());
    }
}
