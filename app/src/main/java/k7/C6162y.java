package k7;

import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: k7.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6162y implements D0 {

    /* renamed from: a, reason: collision with root package name */
    private final I6.l f38745a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f38746b;

    public C6162y(I6.l lVar) {
        J6.r.e(lVar, "compute");
        this.f38745a = lVar;
        this.f38746b = new ConcurrentHashMap();
    }

    @Override // k7.D0
    public g7.b a(Q6.b bVar) {
        Object putIfAbsent;
        J6.r.e(bVar, "key");
        ConcurrentHashMap concurrentHashMap = this.f38746b;
        Class a8 = H6.a.a(bVar);
        Object obj = concurrentHashMap.get(a8);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a8, (obj = new C6139m((g7.b) this.f38745a.invoke(bVar))))) != null) {
            obj = putIfAbsent;
        }
        return ((C6139m) obj).f38708a;
    }
}
