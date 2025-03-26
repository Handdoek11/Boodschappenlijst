package com.google.android.gms.internal.ads;

import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: com.google.android.gms.internal.ads.th0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4169th0 extends AbstractC3625oh0 implements List, RandomAccess, j$.util.List {

    /* renamed from: s, reason: collision with root package name */
    private static final AbstractC1130Ai0 f26912s = new C3951rh0(C2648fi0.f22099w, 0);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f26913t = 0;

    AbstractC4169th0() {
    }

    public static AbstractC4169th0 C(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        AbstractC2431di0.b(objArr, 3);
        return r(objArr, 3);
    }

    public static AbstractC4169th0 F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        AbstractC2431di0.b(objArr, 5);
        return r(objArr, 5);
    }

    public static AbstractC4169th0 H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        AbstractC2431di0.b(objArr, 6);
        return r(objArr, 6);
    }

    public static AbstractC4169th0 I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i8 = length + 12;
        Object[] objArr2 = new Object[i8];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        AbstractC2431di0.b(objArr2, i8);
        return r(objArr2, i8);
    }

    public static C3843qh0 q(int i8) {
        AbstractC1659Pg0.a(i8, "expectedSize");
        return new C3843qh0(i8);
    }

    static AbstractC4169th0 r(Object[] objArr, int i8) {
        return i8 == 0 ? C2648fi0.f22099w : new C2648fi0(objArr, i8);
    }

    public static AbstractC4169th0 s(Iterable iterable) {
        iterable.getClass();
        return t((Collection) iterable);
    }

    public static AbstractC4169th0 t(Collection collection) {
        if (!(collection instanceof AbstractC3625oh0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            AbstractC2431di0.b(array, length);
            return r(array, length);
        }
        AbstractC4169th0 e8 = ((AbstractC3625oh0) collection).e();
        if (!e8.n()) {
            return e8;
        }
        Object[] array2 = e8.toArray();
        return r(array2, array2.length);
    }

    public static AbstractC4169th0 v(Object[] objArr) {
        if (objArr.length == 0) {
            return C2648fi0.f22099w;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        AbstractC2431di0.b(objArr2, length);
        return r(objArr2, length);
    }

    public static AbstractC4169th0 w() {
        return C2648fi0.f22099w;
    }

    public static AbstractC4169th0 x(Object obj) {
        Object[] objArr = {obj};
        AbstractC2431di0.b(objArr, 1);
        return r(objArr, 1);
    }

    public static AbstractC4169th0 y(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC2431di0.b(objArr, 2);
        return r(objArr, 2);
    }

    @Override // java.util.List
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final AbstractC1130Ai0 listIterator(int i8) {
        AbstractC1762Sf0.b(i8, size(), "index");
        return isEmpty() ? f26912s : new C3951rh0(this, i8);
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    int b(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i8 + i9] = get(i9);
        }
        return i8 + size;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    public final AbstractC4169th0 e() {
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
                        if (AbstractC1657Pf0.a(get(i8), list.get(i8))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !AbstractC1657Pf0.a(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    public final AbstractC4825zi0 j() {
        return listIterator(0);
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
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC4169th0 subList(int i8, int i9) {
        AbstractC1762Sf0.k(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? C2648fi0.f22099w : new C4060sh0(this, i8, i10);
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
