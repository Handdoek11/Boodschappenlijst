package m7;

import java.util.Map;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map f39461a = q.a(1);

    public static final class a {
    }

    public final Object a(i7.f fVar, a aVar) {
        J6.r.e(fVar, "descriptor");
        J6.r.e(aVar, "key");
        Map map = (Map) this.f39461a.get(fVar);
        Object obj = map != null ? map.get(aVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(i7.f fVar, a aVar, I6.a aVar2) {
        J6.r.e(fVar, "descriptor");
        J6.r.e(aVar, "key");
        J6.r.e(aVar2, "defaultValue");
        Object a8 = a(fVar, aVar);
        if (a8 != null) {
            return a8;
        }
        Object invoke = aVar2.invoke();
        c(fVar, aVar, invoke);
        return invoke;
    }

    public final void c(i7.f fVar, a aVar, Object obj) {
        J6.r.e(fVar, "descriptor");
        J6.r.e(aVar, "key");
        J6.r.e(obj, "value");
        Map map = this.f39461a;
        Object obj2 = map.get(fVar);
        if (obj2 == null) {
            obj2 = q.a(1);
            map.put(fVar, obj2);
        }
        ((Map) obj2).put(aVar, obj);
    }
}
