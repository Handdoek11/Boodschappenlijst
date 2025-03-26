package r3;

import java.util.Iterator;
import java.util.Map;

/* renamed from: r3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6702u extends AbstractC6699q {

    /* renamed from: t, reason: collision with root package name */
    private final transient AbstractC6698p f42594t;

    /* renamed from: u, reason: collision with root package name */
    private final transient Object[] f42595u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f42596v;

    C6702u(AbstractC6698p abstractC6698p, Object[] objArr, int i8, int i9) {
        this.f42594t = abstractC6698p;
        this.f42595u = objArr;
        this.f42596v = i9;
    }

    @Override // r3.AbstractC6692j
    final int b(Object[] objArr, int i8) {
        return j().b(objArr, 0);
    }

    @Override // r3.AbstractC6692j, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f42594t.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // r3.AbstractC6699q
    final AbstractC6695m n() {
        return new C6701t(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42596v;
    }
}
