package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class l0 extends AbstractList implements B, RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    private final B f9424o;

    class a implements ListIterator {

        /* renamed from: o, reason: collision with root package name */
        ListIterator f9425o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f9426s;

        a(int i8) {
            this.f9426s = i8;
            this.f9425o = l0.this.f9424o.listIterator(i8);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f9425o.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f9425o.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f9425o.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f9425o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f9425o.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f9425o.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        Iterator f9428o;

        b() {
            this.f9428o = l0.this.f9424o.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f9428o.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9428o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public l0(B b8) {
        this.f9424o = b8;
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public void M(AbstractC0883g abstractC0883g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i8) {
        return (String) this.f9424o.get(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public List h() {
        return this.f9424o.h();
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public B i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i8) {
        return new a(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public Object p0(int i8) {
        return this.f9424o.p0(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9424o.size();
    }
}
