package r3;

/* renamed from: r3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6700s extends AbstractC6695m {

    /* renamed from: w, reason: collision with root package name */
    static final AbstractC6695m f42590w = new C6700s(new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    final transient Object[] f42591u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f42592v;

    C6700s(Object[] objArr, int i8) {
        this.f42591u = objArr;
        this.f42592v = i8;
    }

    @Override // r3.AbstractC6695m, r3.AbstractC6692j
    final int b(Object[] objArr, int i8) {
        System.arraycopy(this.f42591u, 0, objArr, 0, this.f42592v);
        return this.f42592v;
    }

    @Override // r3.AbstractC6692j
    final int c() {
        return this.f42592v;
    }

    @Override // r3.AbstractC6692j
    final int d() {
        return 0;
    }

    @Override // r3.AbstractC6692j
    final Object[] e() {
        return this.f42591u;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC6685c.a(i8, this.f42592v, "index");
        Object obj = this.f42591u[i8];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42592v;
    }
}
