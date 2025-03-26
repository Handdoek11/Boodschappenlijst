package y6;

import java.util.Iterator;

/* renamed from: y6.H, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6969H implements Iterator, K6.a {
    public abstract long a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
