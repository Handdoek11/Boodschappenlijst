package N5;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class l extends c {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f4180a = new ConcurrentHashMap();

    @Override // N5.b
    public Object g(a aVar, I6.a aVar2) {
        J6.r.e(aVar, "key");
        J6.r.e(aVar2, "block");
        Object obj = h().get(aVar);
        if (obj != null) {
            return obj;
        }
        Object invoke = aVar2.invoke();
        Object putIfAbsent = h().putIfAbsent(aVar, invoke);
        if (putIfAbsent != null) {
            invoke = putIfAbsent;
        }
        J6.r.c(invoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // N5.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ConcurrentHashMap h() {
        return this.f4180a;
    }
}
