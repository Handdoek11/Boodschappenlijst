package j$.util.concurrent;

/* renamed from: j$.util.concurrent.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5896a extends p {

    /* renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f37309i;

    /* renamed from: j, reason: collision with root package name */
    l f37310j;

    AbstractC5896a(l[] lVarArr, int i8, int i9, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i8, 0, i9);
        this.f37309i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f37330b != null;
    }

    public final boolean hasMoreElements() {
        return this.f37330b != null;
    }

    public final void remove() {
        l lVar = this.f37310j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f37310j = null;
        this.f37309i.g(lVar.f37322b, null, null);
    }
}
