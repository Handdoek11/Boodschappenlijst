package J6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: J6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0641a implements Iterator, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final Object[] f3558o;

    /* renamed from: s, reason: collision with root package name */
    private int f3559s;

    public C0641a(Object[] objArr) {
        r.e(objArr, "array");
        this.f3558o = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3559s < this.f3558o.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f3558o;
            int i8 = this.f3559s;
            this.f3559s = i8 + 1;
            return objArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f3559s--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
