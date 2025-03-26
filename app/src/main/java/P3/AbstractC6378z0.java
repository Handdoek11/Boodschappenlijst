package p3;

import java.util.NoSuchElementException;

/* renamed from: p3.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6378z0 extends M0 {

    /* renamed from: o, reason: collision with root package name */
    private final int f40403o;

    /* renamed from: s, reason: collision with root package name */
    private int f40404s;

    protected AbstractC6378z0(int i8, int i9) {
        AbstractC6374x0.b(i9, i8, "index");
        this.f40403o = i8;
        this.f40404s = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40404s < this.f40403o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40404s > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f40404s;
        this.f40404s = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40404s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f40404s - 1;
        this.f40404s = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40404s - 1;
    }
}
