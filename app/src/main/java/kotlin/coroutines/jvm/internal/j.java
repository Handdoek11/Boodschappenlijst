package kotlin.coroutines.jvm.internal;

/* loaded from: classes2.dex */
public abstract class j extends a {
    public j(A6.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != A6.h.f250o) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // A6.d
    public A6.g getContext() {
        return A6.h.f250o;
    }
}
