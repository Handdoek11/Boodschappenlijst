package c4;

import j$.util.Objects;

/* loaded from: classes2.dex */
class I extends AbstractC1012o {

    /* renamed from: v, reason: collision with root package name */
    static final AbstractC1012o f12131v = new I(new Object[0], 0);

    /* renamed from: t, reason: collision with root package name */
    final transient Object[] f12132t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f12133u;

    I(Object[] objArr, int i8) {
        this.f12132t = objArr;
        this.f12133u = i8;
    }

    @Override // c4.AbstractC1012o, c4.AbstractC1011n
    int b(Object[] objArr, int i8) {
        System.arraycopy(this.f12132t, 0, objArr, i8, this.f12133u);
        return i8 + this.f12133u;
    }

    @Override // c4.AbstractC1011n
    Object[] c() {
        return this.f12132t;
    }

    @Override // c4.AbstractC1011n
    int d() {
        return this.f12133u;
    }

    @Override // c4.AbstractC1011n
    int e() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i8) {
        b4.h.g(i8, this.f12133u);
        Object obj = this.f12132t[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // c4.AbstractC1011n
    boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12133u;
    }
}
