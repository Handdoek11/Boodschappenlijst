package r3;

import java.util.Set;

/* renamed from: r3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6699q extends AbstractC6692j implements Set {

    /* renamed from: s, reason: collision with root package name */
    private transient AbstractC6695m f42589s;

    AbstractC6699q() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return y.a(this);
    }

    public final AbstractC6695m j() {
        AbstractC6695m abstractC6695m = this.f42589s;
        if (abstractC6695m != null) {
            return abstractC6695m;
        }
        AbstractC6695m n8 = n();
        this.f42589s = n8;
        return n8;
    }

    AbstractC6695m n() {
        Object[] array = toArray();
        int i8 = AbstractC6695m.f42579t;
        return AbstractC6695m.n(array, array.length);
    }
}
