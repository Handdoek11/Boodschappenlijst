package com.google.android.gms.internal.play_billing;

import j$.util.List;
import j$.util.stream.Collector;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5114g0 extends AbstractC5084b0 implements List, RandomAccess, j$.util.List {

    /* renamed from: s, reason: collision with root package name */
    private static final Q0 f29906s = new C5096d0(D0.f29684w, 0);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f29907t = 0;

    AbstractC5114g0() {
    }

    static AbstractC5114g0 q(Object[] objArr, int i8) {
        return i8 == 0 ? D0.f29684w : new D0(objArr, i8);
    }

    public static AbstractC5114g0 r(Collection collection) {
        if (!(collection instanceof AbstractC5084b0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            AbstractC5209w0.b(array, length);
            return q(array, length);
        }
        AbstractC5114g0 e8 = ((AbstractC5084b0) collection).e();
        if (!e8.j()) {
            return e8;
        }
        Object[] array2 = e8.toArray();
        return q(array2, array2.length);
    }

    public static AbstractC5114g0 s() {
        return D0.f29684w;
    }

    public static AbstractC5114g0 t(Object obj) {
        Object[] objArr = {obj};
        AbstractC5209w0.b(objArr, 1);
        return q(objArr, 1);
    }

    public static Collector w() {
        return M.a();
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    int b(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = get(i9);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    public final AbstractC5114g0 e() {
        return this;
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
                        if (AbstractC5196u.a(get(i8), list.get(i8))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !AbstractC5196u.a(it.next(), it2.next())) {
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

    public int indexOf(Object obj) {
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

    public int lastIndexOf(Object obj) {
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

    public AbstractC5114g0 o() {
        return size() <= 1 ? this : new C5102e0(this);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC5114g0 subList(int i8, int i9) {
        AbstractC5202v.e(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? D0.f29684w : new C5108f0(this, i8, i10);
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

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final Q0 listIterator(int i8) {
        AbstractC5202v.b(i8, size(), "index");
        return isEmpty() ? f29906s : new C5096d0(this, i8);
    }
}
