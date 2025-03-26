package y6;

import J6.AbstractC0650j;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: y6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6979g extends AbstractC6976d {

    /* renamed from: u, reason: collision with root package name */
    public static final a f44654u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    private static final Object[] f44655v = new Object[0];

    /* renamed from: o, reason: collision with root package name */
    private int f44656o;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f44657s = f44655v;

    /* renamed from: t, reason: collision with root package name */
    private int f44658t;

    /* renamed from: y6.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    private final void e(int i8, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f44657s.length;
        while (i8 < length && it.hasNext()) {
            this.f44657s[i8] = it.next();
            i8++;
        }
        int i9 = this.f44656o;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f44657s[i10] = it.next();
        }
        this.f44658t = size() + collection.size();
    }

    private final void j(int i8) {
        Object[] objArr = new Object[i8];
        Object[] objArr2 = this.f44657s;
        AbstractC6980h.g(objArr2, objArr, 0, this.f44656o, objArr2.length);
        Object[] objArr3 = this.f44657s;
        int length = objArr3.length;
        int i9 = this.f44656o;
        AbstractC6980h.g(objArr3, objArr, length - i9, 0, i9);
        this.f44656o = 0;
        this.f44657s = objArr;
    }

    private final int n(int i8) {
        return i8 == 0 ? AbstractC6984l.y(this.f44657s) : i8 - 1;
    }

    private final void o(int i8) {
        if (i8 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f44657s;
        if (i8 <= objArr.length) {
            return;
        }
        if (objArr == f44655v) {
            this.f44657s = new Object[P6.m.c(i8, 10)];
        } else {
            j(AbstractC6974b.f44642o.d(objArr.length, i8));
        }
    }

    private final int p(int i8) {
        if (i8 == AbstractC6984l.y(this.f44657s)) {
            return 0;
        }
        return i8 + 1;
    }

    private final int q(int i8) {
        return i8 < 0 ? i8 + this.f44657s.length : i8;
    }

    private final int r(int i8) {
        Object[] objArr = this.f44657s;
        return i8 >= objArr.length ? i8 - objArr.length : i8;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        J6.r.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        o(size() + collection.size());
        e(r(this.f44656o + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        o(size() + 1);
        int n8 = n(this.f44656o);
        this.f44656o = n8;
        this.f44657s[n8] = obj;
        this.f44658t = size() + 1;
    }

    public final void addLast(Object obj) {
        o(size() + 1);
        this.f44657s[r(this.f44656o + size())] = obj;
        this.f44658t = size() + 1;
    }

    @Override // y6.AbstractC6976d
    public int b() {
        return this.f44658t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int r8 = r(this.f44656o + size());
        int i8 = this.f44656o;
        if (i8 < r8) {
            AbstractC6983k.l(this.f44657s, null, i8, r8);
        } else if (!isEmpty()) {
            Object[] objArr = this.f44657s;
            AbstractC6983k.l(objArr, null, this.f44656o, objArr.length);
            AbstractC6983k.l(this.f44657s, null, 0, r8);
        }
        this.f44656o = 0;
        this.f44658t = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // y6.AbstractC6976d
    public Object d(int i8) {
        AbstractC6974b.f44642o.a(i8, size());
        if (i8 == AbstractC6987o.f(this)) {
            return removeLast();
        }
        if (i8 == 0) {
            return removeFirst();
        }
        int r8 = r(this.f44656o + i8);
        Object obj = this.f44657s[r8];
        if (i8 < (size() >> 1)) {
            int i9 = this.f44656o;
            if (r8 >= i9) {
                Object[] objArr = this.f44657s;
                AbstractC6980h.g(objArr, objArr, i9 + 1, i9, r8);
            } else {
                Object[] objArr2 = this.f44657s;
                AbstractC6980h.g(objArr2, objArr2, 1, 0, r8);
                Object[] objArr3 = this.f44657s;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i10 = this.f44656o;
                AbstractC6980h.g(objArr3, objArr3, i10 + 1, i10, objArr3.length - 1);
            }
            Object[] objArr4 = this.f44657s;
            int i11 = this.f44656o;
            objArr4[i11] = null;
            this.f44656o = p(i11);
        } else {
            int r9 = r(this.f44656o + AbstractC6987o.f(this));
            if (r8 <= r9) {
                Object[] objArr5 = this.f44657s;
                AbstractC6980h.g(objArr5, objArr5, r8, r8 + 1, r9 + 1);
            } else {
                Object[] objArr6 = this.f44657s;
                AbstractC6980h.g(objArr6, objArr6, r8, r8 + 1, objArr6.length);
                Object[] objArr7 = this.f44657s;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC6980h.g(objArr7, objArr7, 0, 1, r9 + 1);
            }
            this.f44657s[r9] = null;
        }
        this.f44658t = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        AbstractC6974b.f44642o.a(i8, size());
        return this.f44657s[r(this.f44656o + i8)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i8;
        int r8 = r(this.f44656o + size());
        int i9 = this.f44656o;
        if (i9 < r8) {
            while (i9 < r8) {
                if (J6.r.a(obj, this.f44657s[i9])) {
                    i8 = this.f44656o;
                } else {
                    i9++;
                }
            }
            return -1;
        }
        if (i9 < r8) {
            return -1;
        }
        int length = this.f44657s.length;
        while (true) {
            if (i9 >= length) {
                for (int i10 = 0; i10 < r8; i10++) {
                    if (J6.r.a(obj, this.f44657s[i10])) {
                        i9 = i10 + this.f44657s.length;
                        i8 = this.f44656o;
                    }
                }
                return -1;
            }
            if (J6.r.a(obj, this.f44657s[i9])) {
                i8 = this.f44656o;
                break;
            }
            i9++;
        }
        return i9 - i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int y7;
        int i8;
        int r8 = r(this.f44656o + size());
        int i9 = this.f44656o;
        if (i9 < r8) {
            y7 = r8 - 1;
            if (i9 <= y7) {
                while (!J6.r.a(obj, this.f44657s[y7])) {
                    if (y7 != i9) {
                        y7--;
                    }
                }
                i8 = this.f44656o;
                return y7 - i8;
            }
            return -1;
        }
        if (i9 > r8) {
            int i10 = r8 - 1;
            while (true) {
                if (-1 >= i10) {
                    y7 = AbstractC6984l.y(this.f44657s);
                    int i11 = this.f44656o;
                    if (i11 <= y7) {
                        while (!J6.r.a(obj, this.f44657s[y7])) {
                            if (y7 != i11) {
                                y7--;
                            }
                        }
                        i8 = this.f44656o;
                    }
                } else {
                    if (J6.r.a(obj, this.f44657s[i10])) {
                        y7 = i10 + this.f44657s.length;
                        i8 = this.f44656o;
                        break;
                    }
                    i10--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int r8;
        J6.r.e(collection, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f44657s.length != 0) {
            int r9 = r(this.f44656o + size());
            int i8 = this.f44656o;
            if (i8 < r9) {
                r8 = i8;
                while (i8 < r9) {
                    Object obj = this.f44657s[i8];
                    if (collection.contains(obj)) {
                        z7 = true;
                    } else {
                        this.f44657s[r8] = obj;
                        r8++;
                    }
                    i8++;
                }
                AbstractC6983k.l(this.f44657s, null, r8, r9);
            } else {
                int length = this.f44657s.length;
                boolean z8 = false;
                int i9 = i8;
                while (i8 < length) {
                    Object[] objArr = this.f44657s;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (collection.contains(obj2)) {
                        z8 = true;
                    } else {
                        this.f44657s[i9] = obj2;
                        i9++;
                    }
                    i8++;
                }
                r8 = r(i9);
                for (int i10 = 0; i10 < r9; i10++) {
                    Object[] objArr2 = this.f44657s;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (collection.contains(obj3)) {
                        z8 = true;
                    } else {
                        this.f44657s[r8] = obj3;
                        r8 = p(r8);
                    }
                }
                z7 = z8;
            }
            if (z7) {
                this.f44658t = q(r8 - this.f44656o);
            }
        }
        return z7;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f44657s;
        int i8 = this.f44656o;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f44656o = p(i8);
        this.f44658t = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int r8 = r(this.f44656o + AbstractC6987o.f(this));
        Object[] objArr = this.f44657s;
        Object obj = objArr[r8];
        objArr[r8] = null;
        this.f44658t = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int r8;
        J6.r.e(collection, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f44657s.length != 0) {
            int r9 = r(this.f44656o + size());
            int i8 = this.f44656o;
            if (i8 < r9) {
                r8 = i8;
                while (i8 < r9) {
                    Object obj = this.f44657s[i8];
                    if (collection.contains(obj)) {
                        this.f44657s[r8] = obj;
                        r8++;
                    } else {
                        z7 = true;
                    }
                    i8++;
                }
                AbstractC6983k.l(this.f44657s, null, r8, r9);
            } else {
                int length = this.f44657s.length;
                boolean z8 = false;
                int i9 = i8;
                while (i8 < length) {
                    Object[] objArr = this.f44657s;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (collection.contains(obj2)) {
                        this.f44657s[i9] = obj2;
                        i9++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                r8 = r(i9);
                for (int i10 = 0; i10 < r9; i10++) {
                    Object[] objArr2 = this.f44657s;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (collection.contains(obj3)) {
                        this.f44657s[r8] = obj3;
                        r8 = p(r8);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                this.f44658t = q(r8 - this.f44656o);
            }
        }
        return z7;
    }

    public final Object s() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        AbstractC6974b.f44642o.a(i8, size());
        int r8 = r(this.f44656o + i8);
        Object[] objArr = this.f44657s;
        Object obj2 = objArr[r8];
        objArr[r8] = obj;
        return obj2;
    }

    public final Object t() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        J6.r.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = AbstractC6981i.a(objArr, size());
        }
        int r8 = r(this.f44656o + size());
        int i8 = this.f44656o;
        if (i8 < r8) {
            AbstractC6980h.j(this.f44657s, objArr, 0, i8, r8, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f44657s;
            AbstractC6980h.g(objArr2, objArr, 0, this.f44656o, objArr2.length);
            Object[] objArr3 = this.f44657s;
            AbstractC6980h.g(objArr3, objArr, objArr3.length - this.f44656o, 0, r8);
        }
        return AbstractC6987o.c(size(), objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        AbstractC6974b.f44642o.b(i8, size());
        if (i8 == size()) {
            addLast(obj);
            return;
        }
        if (i8 == 0) {
            addFirst(obj);
            return;
        }
        o(size() + 1);
        int r8 = r(this.f44656o + i8);
        if (i8 < ((size() + 1) >> 1)) {
            int n8 = n(r8);
            int n9 = n(this.f44656o);
            int i9 = this.f44656o;
            if (n8 >= i9) {
                Object[] objArr = this.f44657s;
                objArr[n9] = objArr[i9];
                AbstractC6980h.g(objArr, objArr, i9, i9 + 1, n8 + 1);
            } else {
                Object[] objArr2 = this.f44657s;
                AbstractC6980h.g(objArr2, objArr2, i9 - 1, i9, objArr2.length);
                Object[] objArr3 = this.f44657s;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC6980h.g(objArr3, objArr3, 0, 1, n8 + 1);
            }
            this.f44657s[n8] = obj;
            this.f44656o = n9;
        } else {
            int r9 = r(this.f44656o + size());
            if (r8 < r9) {
                Object[] objArr4 = this.f44657s;
                AbstractC6980h.g(objArr4, objArr4, r8 + 1, r8, r9);
            } else {
                Object[] objArr5 = this.f44657s;
                AbstractC6980h.g(objArr5, objArr5, 1, 0, r9);
                Object[] objArr6 = this.f44657s;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC6980h.g(objArr6, objArr6, r8 + 1, r8, objArr6.length - 1);
            }
            this.f44657s[r8] = obj;
        }
        this.f44658t = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection collection) {
        J6.r.e(collection, "elements");
        AbstractC6974b.f44642o.b(i8, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i8 == size()) {
            return addAll(collection);
        }
        o(size() + collection.size());
        int r8 = r(this.f44656o + size());
        int r9 = r(this.f44656o + i8);
        int size = collection.size();
        if (i8 < ((size() + 1) >> 1)) {
            int i9 = this.f44656o;
            int i10 = i9 - size;
            if (r9 < i9) {
                Object[] objArr = this.f44657s;
                AbstractC6980h.g(objArr, objArr, i10, i9, objArr.length);
                if (size >= r9) {
                    Object[] objArr2 = this.f44657s;
                    AbstractC6980h.g(objArr2, objArr2, objArr2.length - size, 0, r9);
                } else {
                    Object[] objArr3 = this.f44657s;
                    AbstractC6980h.g(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f44657s;
                    AbstractC6980h.g(objArr4, objArr4, 0, size, r9);
                }
            } else if (i10 >= 0) {
                Object[] objArr5 = this.f44657s;
                AbstractC6980h.g(objArr5, objArr5, i10, i9, r9);
            } else {
                Object[] objArr6 = this.f44657s;
                i10 += objArr6.length;
                int i11 = r9 - i9;
                int length = objArr6.length - i10;
                if (length >= i11) {
                    AbstractC6980h.g(objArr6, objArr6, i10, i9, r9);
                } else {
                    AbstractC6980h.g(objArr6, objArr6, i10, i9, i9 + length);
                    Object[] objArr7 = this.f44657s;
                    AbstractC6980h.g(objArr7, objArr7, 0, this.f44656o + length, r9);
                }
            }
            this.f44656o = i10;
            e(q(r9 - size), collection);
        } else {
            int i12 = r9 + size;
            if (r9 < r8) {
                int i13 = size + r8;
                Object[] objArr8 = this.f44657s;
                if (i13 <= objArr8.length) {
                    AbstractC6980h.g(objArr8, objArr8, i12, r9, r8);
                } else if (i12 >= objArr8.length) {
                    AbstractC6980h.g(objArr8, objArr8, i12 - objArr8.length, r9, r8);
                } else {
                    int length2 = r8 - (i13 - objArr8.length);
                    AbstractC6980h.g(objArr8, objArr8, 0, length2, r8);
                    Object[] objArr9 = this.f44657s;
                    AbstractC6980h.g(objArr9, objArr9, i12, r9, length2);
                }
            } else {
                Object[] objArr10 = this.f44657s;
                AbstractC6980h.g(objArr10, objArr10, size, 0, r8);
                Object[] objArr11 = this.f44657s;
                if (i12 >= objArr11.length) {
                    AbstractC6980h.g(objArr11, objArr11, i12 - objArr11.length, r9, objArr11.length);
                } else {
                    AbstractC6980h.g(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f44657s;
                    AbstractC6980h.g(objArr12, objArr12, i12, r9, objArr12.length - size);
                }
            }
            e(r9, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
