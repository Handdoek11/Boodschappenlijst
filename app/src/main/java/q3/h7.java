package q3;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class h7 extends e7 {

    /* renamed from: t, reason: collision with root package name */
    private final transient d7 f41721t;

    /* renamed from: u, reason: collision with root package name */
    private final transient Object[] f41722u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f41723v;

    h7(d7 d7Var, Object[] objArr, int i8, int i9) {
        this.f41721t = d7Var;
        this.f41722u = objArr;
        this.f41723v = i9;
    }

    @Override // q3.M4
    final int b(Object[] objArr, int i8) {
        return j().b(objArr, 0);
    }

    @Override // q3.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f41721t.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // q3.e7
    final P6 n() {
        return new g7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41723v;
    }
}
