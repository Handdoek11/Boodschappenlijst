package s3;

import java.util.NoSuchElementException;

/* renamed from: s3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC6730g extends AbstractC6726c {

    /* renamed from: o, reason: collision with root package name */
    private final int f42716o;

    /* renamed from: s, reason: collision with root package name */
    private int f42717s;

    protected AbstractC6730g(int i8, int i9) {
        AbstractC6728e.b(i9, i8, "index");
        this.f42716o = i8;
        this.f42717s = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f42717s < this.f42716o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f42717s > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f42717s;
        this.f42717s = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f42717s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f42717s - 1;
        this.f42717s = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f42717s - 1;
    }
}
