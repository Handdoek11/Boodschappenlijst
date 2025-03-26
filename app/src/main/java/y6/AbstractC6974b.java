package y6;

import J6.AbstractC0650j;
import com.adadapted.android.sdk.core.ad.AdActionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: y6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6974b extends AbstractC6973a implements List, K6.a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f44642o = new a(null);

    /* renamed from: y6.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final void a(int i8, int i9) {
            if (i8 < 0 || i8 >= i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void b(int i8, int i9) {
            if (i8 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void c(int i8, int i9, int i10) {
            if (i8 < 0 || i9 > i10) {
                throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9 + ", size: " + i10);
            }
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i8 + " > toIndex: " + i9);
        }

        public final int d(int i8, int i9) {
            int i10 = i8 + (i8 >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            return i10 - 2147483639 > 0 ? i9 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i10;
        }

        public final boolean e(Collection collection, Collection collection2) {
            J6.r.e(collection, AdActionType.CONTENT);
            J6.r.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!J6.r.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection collection) {
            J6.r.e(collection, AdActionType.CONTENT);
            Iterator it = collection.iterator();
            int i8 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i8 = (i8 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i8;
        }

        private a() {
        }
    }

    /* renamed from: y6.b$b, reason: collision with other inner class name */
    private class C0357b implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private int f44643o;

        public C0357b() {
        }

        protected final int a() {
            return this.f44643o;
        }

        protected final void b(int i8) {
            this.f44643o = i8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44643o < AbstractC6974b.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC6974b abstractC6974b = AbstractC6974b.this;
            int i8 = this.f44643o;
            this.f44643o = i8 + 1;
            return abstractC6974b.get(i8);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: y6.b$c */
    private class c extends C0357b implements ListIterator, K6.a {
        public c(int i8) {
            super();
            AbstractC6974b.f44642o.b(i8, AbstractC6974b.this.size());
            b(i8);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC6974b abstractC6974b = AbstractC6974b.this;
            b(a() - 1);
            return abstractC6974b.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: y6.b$d */
    private static final class d extends AbstractC6974b implements RandomAccess {

        /* renamed from: s, reason: collision with root package name */
        private final AbstractC6974b f44646s;

        /* renamed from: t, reason: collision with root package name */
        private final int f44647t;

        /* renamed from: u, reason: collision with root package name */
        private int f44648u;

        public d(AbstractC6974b abstractC6974b, int i8, int i9) {
            J6.r.e(abstractC6974b, "list");
            this.f44646s = abstractC6974b;
            this.f44647t = i8;
            AbstractC6974b.f44642o.c(i8, i9, abstractC6974b.size());
            this.f44648u = i9 - i8;
        }

        @Override // y6.AbstractC6973a
        public int b() {
            return this.f44648u;
        }

        @Override // y6.AbstractC6974b, java.util.List
        public Object get(int i8) {
            AbstractC6974b.f44642o.a(i8, this.f44648u);
            return this.f44646s.get(this.f44647t + i8);
        }
    }

    protected AbstractC6974b() {
    }

    @Override // java.util.List
    public void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f44642o.e(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i8);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f44642o.f(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (J6.r.a(it.next(), obj)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0357b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (J6.r.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i8, int i9) {
        return new d(this, i8, i9);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i8) {
        return new c(i8);
    }
}
