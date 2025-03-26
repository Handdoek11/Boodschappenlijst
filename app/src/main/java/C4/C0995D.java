package c4;

import java.io.Serializable;

/* renamed from: c4.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0995D extends G implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    static final C0995D f12130o = new C0995D();

    private C0995D() {
    }

    @Override // c4.G, java.util.Comparator
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        b4.h.i(comparable);
        b4.h.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
