package p3;

import java.util.Iterator;

/* loaded from: classes.dex */
final class K0 extends G0 {

    /* renamed from: t, reason: collision with root package name */
    final transient Object f40189t;

    K0(Object obj) {
        obj.getClass();
        this.f40189t = obj;
    }

    @Override // p3.B0
    final int b(Object[] objArr, int i8) {
        objArr[0] = this.f40189t;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f40189t.equals(obj);
    }

    @Override // p3.G0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f40189t.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new H0(this.f40189t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f40189t.toString() + "]";
    }
}
