package q3;

/* loaded from: classes.dex */
final class f7 extends P6 {

    /* renamed from: w, reason: collision with root package name */
    static final P6 f41685w = new f7(new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    final transient Object[] f41686u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f41687v;

    f7(Object[] objArr, int i8) {
        this.f41686u = objArr;
        this.f41687v = i8;
    }

    @Override // q3.P6, q3.M4
    final int b(Object[] objArr, int i8) {
        System.arraycopy(this.f41686u, 0, objArr, 0, this.f41687v);
        return this.f41687v;
    }

    @Override // q3.M4
    final int c() {
        return this.f41687v;
    }

    @Override // q3.M4
    final int d() {
        return 0;
    }

    @Override // q3.M4
    final Object[] e() {
        return this.f41686u;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        G1.a(i8, this.f41687v, "index");
        Object obj = this.f41686u[i8];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41687v;
    }
}
