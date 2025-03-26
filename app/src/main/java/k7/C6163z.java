package k7;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import x6.C6934p;

/* renamed from: k7.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6163z implements InterfaceC6144o0 {

    /* renamed from: a, reason: collision with root package name */
    private final I6.p f38749a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f38750b;

    public C6163z(I6.p pVar) {
        J6.r.e(pVar, "compute");
        this.f38749a = pVar;
        this.f38750b = new ConcurrentHashMap();
    }

    @Override // k7.InterfaceC6144o0
    public Object a(Q6.b bVar, List list) {
        Object b8;
        Object putIfAbsent;
        J6.r.e(bVar, "key");
        J6.r.e(list, "types");
        ConcurrentHashMap concurrentHashMap = this.f38750b;
        Class a8 = H6.a.a(bVar);
        Object obj = concurrentHashMap.get(a8);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a8, (obj = new C6142n0()))) != null) {
            obj = putIfAbsent;
        }
        ConcurrentHashMap concurrentHashMap2 = ((C6142n0) obj).f38712a;
        Object obj2 = concurrentHashMap2.get(list);
        if (obj2 == null) {
            try {
                C6934p.a aVar = C6934p.f44487s;
                b8 = C6934p.b((g7.b) this.f38749a.invoke(bVar, list));
            } catch (Throwable th) {
                C6934p.a aVar2 = C6934p.f44487s;
                b8 = C6934p.b(x6.q.a(th));
            }
            C6934p a9 = C6934p.a(b8);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(list, a9);
            obj2 = putIfAbsent2 == null ? a9 : putIfAbsent2;
        }
        J6.r.d(obj2, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((C6934p) obj2).j();
    }
}
