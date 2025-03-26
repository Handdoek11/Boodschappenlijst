package r3;

import java.util.NoSuchElementException;

/* renamed from: r3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6687e extends AbstractC6682A {

    /* renamed from: o, reason: collision with root package name */
    private final int f42571o;

    /* renamed from: s, reason: collision with root package name */
    private int f42572s;

    protected AbstractC6687e(int i8, int i9) {
        AbstractC6685c.b(i9, i8, "index");
        this.f42571o = i8;
        this.f42572s = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f42572s < this.f42571o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f42572s > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f42572s;
        this.f42572s = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f42572s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f42572s - 1;
        this.f42572s = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f42572s - 1;
    }
}
