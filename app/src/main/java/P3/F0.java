package p3;

import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public abstract class F0 extends B0 implements List, RandomAccess, j$.util.List {

    /* renamed from: s, reason: collision with root package name */
    private static final M0 f40168s = new C0(I0.f40176w, 0);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f40169t = 0;

    F0() {
    }

    static F0 n(Object[] objArr, int i8) {
        return i8 == 0 ? I0.f40176w : new I0(objArr, i8);
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p3.B0
    int b(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = get(i9);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i8 = 0; i8 < size; i8++) {
                        if (AbstractC6372w0.a(get(i8), list.get(i8))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !AbstractC6372w0.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = (i8 * 31) + get(i9).hashCode();
        }
        return i8;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (obj.equals(get(i8))) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public F0 subList(int i8, int i9) {
        AbstractC6374x0.c(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? I0.f40176w : new D0(this, i8, i10);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final M0 listIterator(int i8) {
        AbstractC6374x0.b(i8, size(), "index");
        return isEmpty() ? f40168s : new C0(this, i8);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }
}
