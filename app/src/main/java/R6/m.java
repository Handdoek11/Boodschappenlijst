package R6;

import J6.r;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d f4959a;

    /* renamed from: b, reason: collision with root package name */
    private final I6.l f4960b;

    public static final class a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private final Iterator f4961o;

        a() {
            this.f4961o = m.this.f4959a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4961o.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return m.this.f4960b.invoke(this.f4961o.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m(d dVar, I6.l lVar) {
        r.e(dVar, "sequence");
        r.e(lVar, "transformer");
        this.f4959a = dVar;
        this.f4960b = lVar;
    }

    @Override // R6.d
    public Iterator iterator() {
        return new a();
    }
}
