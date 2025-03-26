package k7;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import x6.C6934p;

/* renamed from: k7.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6156v implements InterfaceC6144o0 {

    /* renamed from: a, reason: collision with root package name */
    private final I6.p f38740a;

    /* renamed from: b, reason: collision with root package name */
    private final a f38741b;

    /* renamed from: k7.v$a */
    public static final class a extends ClassValue {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ClassValue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6142n0 computeValue(Class cls) {
            J6.r.e(cls, "type");
            return new C6142n0();
        }
    }

    public C6156v(I6.p pVar) {
        J6.r.e(pVar, "compute");
        this.f38740a = pVar;
        this.f38741b = b();
    }

    private final a b() {
        return new a();
    }

    @Override // k7.InterfaceC6144o0
    public Object a(Q6.b bVar, List list) {
        Object b8;
        J6.r.e(bVar, "key");
        J6.r.e(list, "types");
        ConcurrentHashMap concurrentHashMap = ((C6142n0) this.f38741b.get(H6.a.a(bVar))).f38712a;
        Object obj = concurrentHashMap.get(list);
        if (obj == null) {
            try {
                C6934p.a aVar = C6934p.f44487s;
                b8 = C6934p.b((g7.b) this.f38740a.invoke(bVar, list));
            } catch (Throwable th) {
                C6934p.a aVar2 = C6934p.f44487s;
                b8 = C6934p.b(x6.q.a(th));
            }
            C6934p a8 = C6934p.a(b8);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(list, a8);
            obj = putIfAbsent == null ? a8 : putIfAbsent;
        }
        J6.r.d(obj, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((C6934p) obj).j();
    }
}
