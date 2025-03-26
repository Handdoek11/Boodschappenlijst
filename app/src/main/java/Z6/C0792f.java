package Z6;

/* renamed from: Z6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0792f implements U6.M {

    /* renamed from: o, reason: collision with root package name */
    private final A6.g f6473o;

    public C0792f(A6.g gVar) {
        this.f6473o = gVar;
    }

    @Override // U6.M
    public A6.g getCoroutineContext() {
        return this.f6473o;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
