package q3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class I2 extends AbstractC6443c {

    /* renamed from: o, reason: collision with root package name */
    private final int f41180o;

    /* renamed from: s, reason: collision with root package name */
    private int f41181s;

    protected I2(int i8, int i9) {
        G1.b(i9, i8, "index");
        this.f41180o = i8;
        this.f41181s = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f41181s < this.f41180o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41181s > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f41181s;
        this.f41181s = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41181s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f41181s - 1;
        this.f41181s = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41181s - 1;
    }
}
