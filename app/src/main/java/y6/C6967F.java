package y6;

import java.util.Iterator;

/* renamed from: y6.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6967F implements Iterator, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final Iterator f44639o;

    /* renamed from: s, reason: collision with root package name */
    private int f44640s;

    public C6967F(Iterator it) {
        J6.r.e(it, "iterator");
        this.f44639o = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C6965D next() {
        int i8 = this.f44640s;
        this.f44640s = i8 + 1;
        if (i8 < 0) {
            AbstractC6987o.k();
        }
        return new C6965D(i8, this.f44639o.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44639o.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
