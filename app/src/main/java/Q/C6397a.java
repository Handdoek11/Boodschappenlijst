package q;

import j$.util.Map;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import r.AbstractC6640a;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6397a extends C6407k implements Map, j$.util.Map {

    /* renamed from: u, reason: collision with root package name */
    C0322a f40849u;

    /* renamed from: v, reason: collision with root package name */
    c f40850v;

    /* renamed from: w, reason: collision with root package name */
    e f40851w;

    /* renamed from: q.a$a, reason: collision with other inner class name */
    final class C0322a extends AbstractSet {
        C0322a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C6397a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6397a.this.size();
        }
    }

    /* renamed from: q.a$b */
    final class b extends AbstractC6403g {
        b() {
            super(C6397a.this.size());
        }

        @Override // q.AbstractC6403g
        protected Object a(int i8) {
            return C6397a.this.g(i8);
        }

        @Override // q.AbstractC6403g
        protected void b(int i8) {
            C6397a.this.i(i8);
        }
    }

    /* renamed from: q.a$d */
    final class d implements Iterator, Map.Entry {

        /* renamed from: o, reason: collision with root package name */
        int f40855o;

        /* renamed from: s, reason: collision with root package name */
        int f40856s = -1;

        /* renamed from: t, reason: collision with root package name */
        boolean f40857t;

        d() {
            this.f40855o = C6397a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f40856s++;
            this.f40857t = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f40857t) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC6640a.c(entry.getKey(), C6397a.this.g(this.f40856s)) && AbstractC6640a.c(entry.getValue(), C6397a.this.k(this.f40856s));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f40857t) {
                return C6397a.this.g(this.f40856s);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f40857t) {
                return C6397a.this.k(this.f40856s);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40856s < this.f40855o;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f40857t) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object g8 = C6397a.this.g(this.f40856s);
            Object k8 = C6397a.this.k(this.f40856s);
            return (g8 == null ? 0 : g8.hashCode()) ^ (k8 != null ? k8.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f40857t) {
                throw new IllegalStateException();
            }
            C6397a.this.i(this.f40856s);
            this.f40856s--;
            this.f40855o--;
            this.f40857t = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f40857t) {
                return C6397a.this.j(this.f40856s, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: q.a$f */
    final class f extends AbstractC6403g {
        f() {
            super(C6397a.this.size());
        }

        @Override // q.AbstractC6403g
        protected Object a(int i8) {
            return C6397a.this.k(i8);
        }

        @Override // q.AbstractC6403g
        protected void b(int i8) {
            C6397a.this.i(i8);
        }
    }

    public C6397a() {
    }

    static boolean m(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // q.C6407k, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // q.C6407k, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0322a c0322a = this.f40849u;
        if (c0322a != null) {
            return c0322a;
        }
        C0322a c0322a2 = new C0322a();
        this.f40849u = c0322a2;
        return c0322a2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // q.C6407k, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f40850v;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f40850v = cVar2;
        return cVar2;
    }

    public boolean l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public boolean n(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean o(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(g(size2))) {
                i(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // q.C6407k, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f40851w;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f40851w = eVar2;
        return eVar2;
    }

    public C6397a(int i8) {
        super(i8);
    }

    /* renamed from: q.a$c */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C6397a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C6397a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C6397a.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C6397a.m(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i8 = 0;
            for (int size = C6397a.this.size() - 1; size >= 0; size--) {
                Object g8 = C6397a.this.g(size);
                i8 += g8 == null ? 0 : g8.hashCode();
            }
            return i8;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C6397a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C6397a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e8 = C6397a.this.e(obj);
            if (e8 < 0) {
                return false;
            }
            C6397a.this.i(e8);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C6397a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C6397a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C6397a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C6397a.this.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = C6397a.this.g(i8);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = C6397a.this.g(i8);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* renamed from: q.a$e */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C6397a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C6397a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C6397a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C6397a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int a8 = C6397a.this.a(obj);
            if (a8 < 0) {
                return false;
            }
            C6397a.this.i(a8);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C6397a.this.size();
            int i8 = 0;
            boolean z7 = false;
            while (i8 < size) {
                if (collection.contains(C6397a.this.k(i8))) {
                    C6397a.this.i(i8);
                    i8--;
                    size--;
                    z7 = true;
                }
                i8++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C6397a.this.size();
            int i8 = 0;
            boolean z7 = false;
            while (i8 < size) {
                if (!collection.contains(C6397a.this.k(i8))) {
                    C6397a.this.i(i8);
                    i8--;
                    size--;
                    z7 = true;
                }
                i8++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public int size() {
            return C6397a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C6397a.this.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = C6397a.this.k(i8);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = C6397a.this.k(i8);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C6397a(C6407k c6407k) {
        super(c6407k);
    }
}
