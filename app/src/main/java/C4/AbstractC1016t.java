package c4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* renamed from: c4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1016t extends u implements NavigableSet, O {

    /* renamed from: t, reason: collision with root package name */
    final transient Comparator f12229t;

    /* renamed from: u, reason: collision with root package name */
    transient AbstractC1016t f12230u;

    AbstractC1016t(Comparator comparator) {
        this.f12229t = comparator;
    }

    static AbstractC1016t C(Comparator comparator, int i8, Object... objArr) {
        if (i8 == 0) {
            return L(comparator);
        }
        AbstractC0997F.c(objArr, i8);
        Arrays.sort(objArr, 0, i8, comparator);
        int i9 = 1;
        for (int i10 = 1; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (comparator.compare(obj, objArr[i9 - 1]) != 0) {
                objArr[i9] = obj;
                i9++;
            }
        }
        Arrays.fill(objArr, i9, i8, (Object) null);
        if (i9 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new L(AbstractC1012o.o(objArr, i9), comparator);
    }

    public static AbstractC1016t F(Comparator comparator, Iterable iterable) {
        b4.h.i(comparator);
        if (P.b(comparator, iterable) && (iterable instanceof AbstractC1016t)) {
            AbstractC1016t abstractC1016t = (AbstractC1016t) iterable;
            if (!abstractC1016t.j()) {
                return abstractC1016t;
            }
        }
        Object[] b8 = v.b(iterable);
        return C(comparator, b8.length, b8);
    }

    public static AbstractC1016t H(Comparator comparator, Collection collection) {
        return F(comparator, collection);
    }

    static L L(Comparator comparator) {
        return G.c().equals(comparator) ? L.f12155w : new L(AbstractC1012o.t(), comparator);
    }

    static int X(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract AbstractC1016t I();

    @Override // java.util.NavigableSet
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public AbstractC1016t descendingSet() {
        AbstractC1016t abstractC1016t = this.f12230u;
        if (abstractC1016t != null) {
            return abstractC1016t;
        }
        AbstractC1016t I7 = I();
        this.f12230u = I7;
        I7.f12230u = this;
        return I7;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public AbstractC1016t headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public AbstractC1016t headSet(Object obj, boolean z7) {
        return P(b4.h.i(obj), z7);
    }

    abstract AbstractC1016t P(Object obj, boolean z7);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public AbstractC1016t subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public AbstractC1016t subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        b4.h.i(obj);
        b4.h.i(obj2);
        b4.h.d(this.f12229t.compare(obj, obj2) <= 0);
        return S(obj, z7, obj2, z8);
    }

    abstract AbstractC1016t S(Object obj, boolean z7, Object obj2, boolean z8);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public AbstractC1016t tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public AbstractC1016t tailSet(Object obj, boolean z7) {
        return V(b4.h.i(obj), z7);
    }

    abstract AbstractC1016t V(Object obj, boolean z7);

    int W(Object obj, Object obj2) {
        return X(this.f12229t, obj, obj2);
    }

    @Override // java.util.SortedSet, c4.O
    public Comparator comparator() {
        return this.f12229t;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
}
