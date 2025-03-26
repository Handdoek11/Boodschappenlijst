package s3;

/* loaded from: classes2.dex */
final class l extends k {

    /* renamed from: v, reason: collision with root package name */
    static final k f42724v = new l(new Object[0], 0);

    /* renamed from: t, reason: collision with root package name */
    final transient Object[] f42725t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f42726u;

    l(Object[] objArr, int i8) {
        this.f42725t = objArr;
        this.f42726u = i8;
    }

    @Override // s3.k, s3.AbstractC6731h
    final int b(Object[] objArr, int i8) {
        System.arraycopy(this.f42725t, 0, objArr, 0, this.f42726u);
        return this.f42726u;
    }

    @Override // s3.AbstractC6731h
    final int c() {
        return this.f42726u;
    }

    @Override // s3.AbstractC6731h
    final int d() {
        return 0;
    }

    @Override // s3.AbstractC6731h
    final Object[] e() {
        return this.f42725t;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC6728e.a(i8, this.f42726u, "index");
        Object obj = this.f42725t[i8];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42726u;
    }
}
