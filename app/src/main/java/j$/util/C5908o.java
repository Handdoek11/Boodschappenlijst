package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* renamed from: j$.util.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5908o implements ListIterator, InterfaceC6047z {

    /* renamed from: a, reason: collision with root package name */
    private final ListIterator f37406a;

    C5908o(C5909p c5909p, int i8) {
        this.f37406a = c5909p.f37407b.listIterator(i8);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f37406a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f37406a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37406a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f37406a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37406a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37406a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC6047z
    public final void forEachRemaining(Consumer consumer) {
        AbstractC5897d.q(this.f37406a, consumer);
    }
}
