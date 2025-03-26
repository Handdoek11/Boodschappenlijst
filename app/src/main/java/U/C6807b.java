package u;

import J6.AbstractC0649i;
import J6.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import y6.AbstractC6980h;
import y6.AbstractC6987o;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6807b implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    public static final int f43939u = 8;

    /* renamed from: o, reason: collision with root package name */
    private Object[] f43940o;

    /* renamed from: s, reason: collision with root package name */
    private List f43941s;

    /* renamed from: t, reason: collision with root package name */
    private int f43942t;

    /* renamed from: u.b$a */
    private static final class a implements List, K6.c {

        /* renamed from: o, reason: collision with root package name */
        private final C6807b f43943o;

        public a(C6807b c6807b) {
            this.f43943o = c6807b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f43943o.c(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection collection) {
            return this.f43943o.d(i8, collection);
        }

        public int b() {
            return this.f43943o.q();
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f43943o.j();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f43943o.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f43943o.n(collection);
        }

        public Object d(int i8) {
            AbstractC6808c.c(this, i8);
            return this.f43943o.x(i8);
        }

        @Override // java.util.List
        public Object get(int i8) {
            AbstractC6808c.c(this, i8);
            return this.f43943o.p()[i8];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f43943o.r(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f43943o.s();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f43943o.t(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i8) {
            return d(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f43943o.w(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f43943o.C(collection);
        }

        @Override // java.util.List
        public Object set(int i8, Object obj) {
            AbstractC6808c.c(this, i8);
            return this.f43943o.E(i8, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List subList(int i8, int i9) {
            AbstractC6808c.d(this, i8, i9);
            return new C0333b(this, i8, i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC0649i.a(this);
        }

        @Override // java.util.List
        public void add(int i8, Object obj) {
            this.f43943o.b(i8, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f43943o.h(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i8) {
            return new c(this, i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f43943o.v(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC0649i.b(this, objArr);
        }
    }

    /* renamed from: u.b$b, reason: collision with other inner class name */
    private static final class C0333b implements List, K6.c {

        /* renamed from: o, reason: collision with root package name */
        private final List f43944o;

        /* renamed from: s, reason: collision with root package name */
        private final int f43945s;

        /* renamed from: t, reason: collision with root package name */
        private int f43946t;

        public C0333b(List list, int i8, int i9) {
            this.f43944o = list;
            this.f43945s = i8;
            this.f43946t = i9;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f43944o;
            int i8 = this.f43946t;
            this.f43946t = i8 + 1;
            list.add(i8, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection collection) {
            this.f43944o.addAll(i8 + this.f43945s, collection);
            this.f43946t += collection.size();
            return collection.size() > 0;
        }

        public int b() {
            return this.f43946t - this.f43945s;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i8 = this.f43946t - 1;
            int i9 = this.f43945s;
            if (i9 <= i8) {
                while (true) {
                    this.f43944o.remove(i8);
                    if (i8 == i9) {
                        break;
                    } else {
                        i8--;
                    }
                }
            }
            this.f43946t = this.f43945s;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i8 = this.f43946t;
            for (int i9 = this.f43945s; i9 < i8; i9++) {
                if (r.a(this.f43944o.get(i9), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public Object d(int i8) {
            AbstractC6808c.c(this, i8);
            this.f43946t--;
            return this.f43944o.remove(i8 + this.f43945s);
        }

        @Override // java.util.List
        public Object get(int i8) {
            AbstractC6808c.c(this, i8);
            return this.f43944o.get(i8 + this.f43945s);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i8 = this.f43946t;
            for (int i9 = this.f43945s; i9 < i8; i9++) {
                if (r.a(this.f43944o.get(i9), obj)) {
                    return i9 - this.f43945s;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f43946t == this.f43945s;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i8 = this.f43946t - 1;
            int i9 = this.f43945s;
            if (i9 > i8) {
                return -1;
            }
            while (!r.a(this.f43944o.get(i8), obj)) {
                if (i8 == i9) {
                    return -1;
                }
                i8--;
            }
            return i8 - this.f43945s;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i8) {
            return d(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i8 = this.f43946t;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i8 != this.f43946t;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i8 = this.f43946t;
            int i9 = i8 - 1;
            int i10 = this.f43945s;
            if (i10 <= i9) {
                while (true) {
                    if (!collection.contains(this.f43944o.get(i9))) {
                        this.f43944o.remove(i9);
                        this.f43946t--;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9--;
                }
            }
            return i8 != this.f43946t;
        }

        @Override // java.util.List
        public Object set(int i8, Object obj) {
            AbstractC6808c.c(this, i8);
            return this.f43944o.set(i8 + this.f43945s, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List subList(int i8, int i9) {
            AbstractC6808c.d(this, i8, i9);
            return new C0333b(this, i8, i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC0649i.a(this);
        }

        @Override // java.util.List
        public void add(int i8, Object obj) {
            this.f43944o.add(i8 + this.f43945s, obj);
            this.f43946t++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i8) {
            return new c(this, i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i8 = this.f43946t;
            for (int i9 = this.f43945s; i9 < i8; i9++) {
                if (r.a(this.f43944o.get(i9), obj)) {
                    this.f43944o.remove(i9);
                    this.f43946t--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC0649i.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f43944o.addAll(this.f43946t, collection);
            this.f43946t += collection.size();
            return collection.size() > 0;
        }
    }

    /* renamed from: u.b$c */
    private static final class c implements ListIterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private final List f43947o;

        /* renamed from: s, reason: collision with root package name */
        private int f43948s;

        public c(List list, int i8) {
            this.f43947o = list;
            this.f43948s = i8;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f43947o.add(this.f43948s, obj);
            this.f43948s++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f43948s < this.f43947o.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f43948s > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f43947o;
            int i8 = this.f43948s;
            this.f43948s = i8 + 1;
            return list.get(i8);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f43948s;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i8 = this.f43948s - 1;
            this.f43948s = i8;
            return this.f43947o.get(i8);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f43948s - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i8 = this.f43948s - 1;
            this.f43948s = i8;
            this.f43947o.remove(i8);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f43947o.set(this.f43948s, obj);
        }
    }

    public C6807b(Object[] objArr, int i8) {
        this.f43940o = objArr;
        this.f43942t = i8;
    }

    public final boolean C(Collection collection) {
        int i8 = this.f43942t;
        for (int q8 = q() - 1; -1 < q8; q8--) {
            if (!collection.contains(p()[q8])) {
                x(q8);
            }
        }
        return i8 != this.f43942t;
    }

    public final Object E(int i8, Object obj) {
        Object[] objArr = this.f43940o;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public final void F(Comparator comparator) {
        AbstractC6980h.o(this.f43940o, comparator, 0, this.f43942t);
    }

    public final void b(int i8, Object obj) {
        o(this.f43942t + 1);
        Object[] objArr = this.f43940o;
        int i9 = this.f43942t;
        if (i8 != i9) {
            AbstractC6980h.g(objArr, objArr, i8 + 1, i8, i9);
        }
        objArr[i8] = obj;
        this.f43942t++;
    }

    public final boolean c(Object obj) {
        o(this.f43942t + 1);
        Object[] objArr = this.f43940o;
        int i8 = this.f43942t;
        objArr[i8] = obj;
        this.f43942t = i8 + 1;
        return true;
    }

    public final boolean d(int i8, Collection collection) {
        int i9 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        o(this.f43942t + collection.size());
        Object[] objArr = this.f43940o;
        if (i8 != this.f43942t) {
            AbstractC6980h.g(objArr, objArr, collection.size() + i8, i8, this.f43942t);
        }
        for (Object obj : collection) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC6987o.k();
            }
            objArr[i9 + i8] = obj;
            i9 = i10;
        }
        this.f43942t += collection.size();
        return true;
    }

    public final boolean e(int i8, C6807b c6807b) {
        if (c6807b.s()) {
            return false;
        }
        o(this.f43942t + c6807b.f43942t);
        Object[] objArr = this.f43940o;
        int i9 = this.f43942t;
        if (i8 != i9) {
            AbstractC6980h.g(objArr, objArr, c6807b.f43942t + i8, i8, i9);
        }
        AbstractC6980h.g(c6807b.f43940o, objArr, i8, 0, c6807b.f43942t);
        this.f43942t += c6807b.f43942t;
        return true;
    }

    public final boolean h(Collection collection) {
        return d(this.f43942t, collection);
    }

    public final List i() {
        List list = this.f43941s;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f43941s = aVar;
        return aVar;
    }

    public final void j() {
        Object[] objArr = this.f43940o;
        int q8 = q();
        while (true) {
            q8--;
            if (-1 >= q8) {
                this.f43942t = 0;
                return;
            }
            objArr[q8] = null;
        }
    }

    public final boolean l(Object obj) {
        int q8 = q() - 1;
        if (q8 >= 0) {
            for (int i8 = 0; !r.a(p()[i8], obj); i8++) {
                if (i8 != q8) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean n(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void o(int i8) {
        Object[] objArr = this.f43940o;
        if (objArr.length < i8) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i8, objArr.length * 2));
            r.d(copyOf, "copyOf(this, newSize)");
            this.f43940o = copyOf;
        }
    }

    public final Object[] p() {
        return this.f43940o;
    }

    public final int q() {
        return this.f43942t;
    }

    public final int r(Object obj) {
        int i8 = this.f43942t;
        if (i8 <= 0) {
            return -1;
        }
        Object[] objArr = this.f43940o;
        int i9 = 0;
        while (!r.a(obj, objArr[i9])) {
            i9++;
            if (i9 >= i8) {
                return -1;
            }
        }
        return i9;
    }

    public final boolean s() {
        return this.f43942t == 0;
    }

    public final int t(Object obj) {
        int i8 = this.f43942t;
        if (i8 <= 0) {
            return -1;
        }
        int i9 = i8 - 1;
        Object[] objArr = this.f43940o;
        while (!r.a(obj, objArr[i9])) {
            i9--;
            if (i9 < 0) {
                return -1;
            }
        }
        return i9;
    }

    public final boolean v(Object obj) {
        int r8 = r(obj);
        if (r8 < 0) {
            return false;
        }
        x(r8);
        return true;
    }

    public final boolean w(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i8 = this.f43942t;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
        return i8 != this.f43942t;
    }

    public final Object x(int i8) {
        Object[] objArr = this.f43940o;
        Object obj = objArr[i8];
        if (i8 != q() - 1) {
            AbstractC6980h.g(objArr, objArr, i8, i8 + 1, this.f43942t);
        }
        int i9 = this.f43942t - 1;
        this.f43942t = i9;
        objArr[i9] = null;
        return obj;
    }

    public final void y(int i8, int i9) {
        if (i9 > i8) {
            int i10 = this.f43942t;
            if (i9 < i10) {
                Object[] objArr = this.f43940o;
                AbstractC6980h.g(objArr, objArr, i8, i9, i10);
            }
            int i11 = this.f43942t - (i9 - i8);
            int q8 = q() - 1;
            if (i11 <= q8) {
                int i12 = i11;
                while (true) {
                    this.f43940o[i12] = null;
                    if (i12 == q8) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f43942t = i11;
        }
    }
}
