package q3;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class e7 extends M4 implements Set {

    /* renamed from: s, reason: collision with root package name */
    private transient P6 f41657s;

    e7() {
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
        return l7.a(this);
    }

    public final P6 j() {
        P6 p62 = this.f41657s;
        if (p62 != null) {
            return p62;
        }
        P6 n8 = n();
        this.f41657s = n8;
        return n8;
    }

    P6 n() {
        Object[] array = toArray();
        int i8 = P6.f41435t;
        return P6.n(array, array.length);
    }
}
