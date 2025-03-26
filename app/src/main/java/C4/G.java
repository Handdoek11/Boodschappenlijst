package c4;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class G implements Comparator {
    protected G() {
    }

    public static G a(Comparator comparator) {
        return comparator instanceof G ? (G) comparator : new C1008k(comparator);
    }

    public static G c() {
        return C0995D.f12130o;
    }

    public AbstractC1012o b(Iterable iterable) {
        return AbstractC1012o.C(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    G d() {
        return e(z.b());
    }

    public G e(b4.c cVar) {
        return new C1003f(cVar, this);
    }
}
