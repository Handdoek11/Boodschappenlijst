package j$.util;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* renamed from: j$.util.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5901h implements java.util.Collection, Serializable, Collection {
    private static final long serialVersionUID = 3053995032091335093L;

    /* renamed from: a, reason: collision with root package name */
    final java.util.Collection f37378a;

    /* renamed from: b, reason: collision with root package name */
    final Object f37379b;

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    C5901h(java.util.Collection collection) {
        this.f37378a = (java.util.Collection) Objects.requireNonNull(collection);
        this.f37379b = this;
    }

    C5901h(java.util.Collection collection, Object obj) {
        this.f37378a = (java.util.Collection) Objects.requireNonNull(collection);
        this.f37379b = Objects.requireNonNull(obj);
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f37379b) {
            size = this.f37378a.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f37379b) {
            isEmpty = this.f37378a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f37379b) {
            contains = this.f37378a.contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f37379b) {
            array = this.f37378a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f37379b) {
            array = this.f37378a.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f37378a.iterator();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.f37379b) {
            add = this.f37378a.add(obj);
        }
        return add;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f37379b) {
            remove = this.f37378a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        boolean containsAll;
        synchronized (this.f37379b) {
            containsAll = this.f37378a.containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        boolean addAll;
        synchronized (this.f37379b) {
            addAll = this.f37378a.addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        boolean removeAll;
        synchronized (this.f37379b) {
            removeAll = this.f37378a.removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        boolean retainAll;
        synchronized (this.f37379b) {
            retainAll = this.f37378a.retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f37379b) {
            this.f37378a.clear();
        }
    }

    public final String toString() {
        String obj;
        synchronized (this.f37379b) {
            obj = this.f37378a.toString();
        }
        return obj;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        synchronized (this.f37379b) {
            Collection.EL.a(this.f37378a, consumer);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        boolean removeIf;
        synchronized (this.f37379b) {
            java.util.Collection collection = this.f37378a;
            removeIf = collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : Collection.CC.$default$removeIf(collection, predicate);
        }
        return removeIf;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public final Spliterator spliterator() {
        return Collection.EL.c(this.f37378a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(Collection.EL.c(this.f37378a));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return Collection.EL.stream(this.f37378a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.EL.stream(this.f37378a));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return Collection.EL.b(this.f37378a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.EL.b(this.f37378a));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f37379b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
