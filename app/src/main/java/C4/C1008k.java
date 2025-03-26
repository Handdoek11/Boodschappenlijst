package c4;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: c4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1008k extends G implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    final Comparator f12198o;

    C1008k(Comparator comparator) {
        this.f12198o = (Comparator) b4.h.i(comparator);
    }

    @Override // c4.G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f12198o.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1008k) {
            return this.f12198o.equals(((C1008k) obj).f12198o);
        }
        return false;
    }

    public int hashCode() {
        return this.f12198o.hashCode();
    }

    public String toString() {
        return this.f12198o.toString();
    }
}
