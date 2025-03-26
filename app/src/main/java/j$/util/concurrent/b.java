package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    final ConcurrentHashMap f37311a;

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j8 = this.f37311a.j();
        if (j8 < 0) {
            j8 = 0;
        }
        if (j8 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i8 = (int) j8;
        Object[] objArr = new Object[i8];
        Iterator it = iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i9 == i8) {
                if (i8 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i10 = i8 < 1073741819 ? (i8 >>> 1) + 1 + i8 : 2147483639;
                objArr = Arrays.copyOf(objArr, i10);
                i8 = i10;
            }
            objArr[i9] = next;
            i9++;
        }
        return i9 == i8 ? objArr : Arrays.copyOf(objArr, i9);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j8 = this.f37311a.j();
        if (j8 < 0) {
            j8 = 0;
        }
        if (j8 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i8 = (int) j8;
        Object[] objArr2 = objArr.length >= i8 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i8);
        int length = objArr2.length;
        Iterator it = iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i9 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i10 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArr2 = Arrays.copyOf(objArr2, i10);
                length = i10;
            }
            objArr2[i9] = next;
            i9++;
        }
        if (objArr != objArr2 || i9 >= length) {
            return i9 == length ? objArr2 : Arrays.copyOf(objArr2, i9);
        }
        objArr2[i9] = null;
        return objArr2;
    }

    b(ConcurrentHashMap concurrentHashMap) {
        this.f37311a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f37311a.clear();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f37311a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f37311a.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        for (Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.f37311a.f37296a;
        boolean z7 = false;
        if (lVarArr == null) {
            return false;
        }
        if ((collection instanceof Set) && collection.size() > lVarArr.length) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z7 = true;
                }
            }
        } else {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                z7 |= remove(it2.next());
            }
        }
        return z7;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }
}
