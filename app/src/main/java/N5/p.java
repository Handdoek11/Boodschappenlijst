package N5;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class p extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f4189a = new HashMap();

    @Override // N5.b
    public Object g(a aVar, I6.a aVar2) {
        J6.r.e(aVar, "key");
        J6.r.e(aVar2, "block");
        Object obj = h().get(aVar);
        if (obj != null) {
            return obj;
        }
        Object invoke = aVar2.invoke();
        Object put = h().put(aVar, invoke);
        if (put != null) {
            invoke = put;
        }
        J6.r.c(invoke, "null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent");
        return invoke;
    }

    @Override // N5.c
    protected Map h() {
        return this.f4189a;
    }
}
