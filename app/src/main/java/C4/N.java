package c4;

/* loaded from: classes2.dex */
final class N extends r {

    /* renamed from: t, reason: collision with root package name */
    final transient Object f12162t;

    N(Object obj) {
        this.f12162t = b4.h.i(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return w.c(this.f12162t);
    }

    @Override // c4.AbstractC1011n
    int b(Object[] objArr, int i8) {
        objArr[i8] = this.f12162t;
        return i8 + 1;
    }

    @Override // c4.AbstractC1011n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f12162t.equals(obj);
    }

    @Override // c4.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12162t.hashCode();
    }

    @Override // c4.AbstractC1011n
    boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f12162t.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
