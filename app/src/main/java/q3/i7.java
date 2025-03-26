package q3;

import java.util.Iterator;

/* loaded from: classes.dex */
final class i7 extends e7 {

    /* renamed from: t, reason: collision with root package name */
    private final transient d7 f41743t;

    /* renamed from: u, reason: collision with root package name */
    private final transient P6 f41744u;

    i7(d7 d7Var, P6 p62) {
        this.f41743t = d7Var;
        this.f41744u = p62;
    }

    @Override // q3.M4
    final int b(Object[] objArr, int i8) {
        return this.f41744u.b(objArr, 0);
    }

    @Override // q3.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41743t.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f41744u.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41743t.size();
    }
}
