package q3;

/* loaded from: classes.dex */
final class j7 extends P6 {

    /* renamed from: u, reason: collision with root package name */
    private final transient Object[] f41758u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f41759v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f41760w;

    j7(Object[] objArr, int i8, int i9) {
        this.f41758u = objArr;
        this.f41759v = i8;
        this.f41760w = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        G1.a(i8, this.f41760w, "index");
        Object obj = this.f41758u[i8 + i8 + this.f41759v];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41760w;
    }
}
