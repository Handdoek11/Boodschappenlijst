package c4;

import java.util.NoSuchElementException;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0998a extends T {

    /* renamed from: o, reason: collision with root package name */
    private final int f12163o;

    /* renamed from: s, reason: collision with root package name */
    private int f12164s;

    protected AbstractC0998a(int i8, int i9) {
        b4.h.k(i9, i8);
        this.f12163o = i8;
        this.f12164s = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12164s < this.f12163o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12164s > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f12164s;
        this.f12164s = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12164s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f12164s - 1;
        this.f12164s = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12164s - 1;
    }
}
