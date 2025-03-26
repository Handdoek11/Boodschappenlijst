package r3;

import java.util.Iterator;

/* renamed from: r3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6703v extends AbstractC6699q {

    /* renamed from: t, reason: collision with root package name */
    private final transient AbstractC6698p f42597t;

    /* renamed from: u, reason: collision with root package name */
    private final transient AbstractC6695m f42598u;

    C6703v(AbstractC6698p abstractC6698p, AbstractC6695m abstractC6695m) {
        this.f42597t = abstractC6698p;
        this.f42598u = abstractC6695m;
    }

    @Override // r3.AbstractC6692j
    final int b(Object[] objArr, int i8) {
        return this.f42598u.b(objArr, 0);
    }

    @Override // r3.AbstractC6692j, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f42597t.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f42598u.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42597t.size();
    }
}
