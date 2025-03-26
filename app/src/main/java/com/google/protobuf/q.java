package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class q extends AbstractList implements j, RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    private final j f33124o;

    class a implements ListIterator {

        /* renamed from: o, reason: collision with root package name */
        ListIterator f33125o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f33126s;

        a(int i8) {
            this.f33126s = i8;
            this.f33125o = q.this.f33124o.listIterator(i8);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f33125o.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f33125o.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f33125o.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f33125o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f33125o.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f33125o.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        Iterator f33128o;

        b() {
            this.f33128o = q.this.f33124o.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f33128o.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33128o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q(j jVar) {
        this.f33124o = jVar;
    }

    @Override // com.google.protobuf.j
    public void E(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i8) {
        return (String) this.f33124o.get(i8);
    }

    @Override // com.google.protobuf.j
    public List h() {
        return this.f33124o.h();
    }

    @Override // com.google.protobuf.j
    public d h0(int i8) {
        return this.f33124o.h0(i8);
    }

    @Override // com.google.protobuf.j
    public j i() {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f33124o.size();
    }
}
