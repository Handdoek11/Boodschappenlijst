package Z6;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6490a = new E("CONDITION_FALSE");

    public static final Object a() {
        return f6490a;
    }

    public static final p b(Object obj) {
        p pVar;
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null && (pVar = yVar.f6511a) != null) {
            return pVar;
        }
        J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (p) obj;
    }
}
