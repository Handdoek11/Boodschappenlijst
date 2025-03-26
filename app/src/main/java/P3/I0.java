package p3;

import j$.util.Objects;

/* loaded from: classes.dex */
final class I0 extends F0 {

    /* renamed from: w, reason: collision with root package name */
    static final F0 f40176w = new I0(new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    final transient Object[] f40177u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f40178v;

    I0(Object[] objArr, int i8) {
        this.f40177u = objArr;
        this.f40178v = i8;
    }

    @Override // p3.F0, p3.B0
    final int b(Object[] objArr, int i8) {
        System.arraycopy(this.f40177u, 0, objArr, 0, this.f40178v);
        return this.f40178v;
    }

    @Override // p3.B0
    final int c() {
        return this.f40178v;
    }

    @Override // p3.B0
    final int d() {
        return 0;
    }

    @Override // p3.B0
    final Object[] e() {
        return this.f40177u;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC6374x0.a(i8, this.f40178v, "index");
        Object obj = this.f40177u[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40178v;
    }
}
