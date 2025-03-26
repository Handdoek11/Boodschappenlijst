package r3;

/* renamed from: r3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6704w extends AbstractC6695m {

    /* renamed from: u, reason: collision with root package name */
    private final transient Object[] f42599u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f42600v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f42601w;

    C6704w(Object[] objArr, int i8, int i9) {
        this.f42599u = objArr;
        this.f42600v = i8;
        this.f42601w = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC6685c.a(i8, this.f42601w, "index");
        Object obj = this.f42599u[i8 + i8 + this.f42600v];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42601w;
    }
}
