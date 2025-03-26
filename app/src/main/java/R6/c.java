package R6;

import J6.r;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final I6.a f4945a;

    /* renamed from: b, reason: collision with root package name */
    private final I6.l f4946b;

    public static final class a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private Object f4947o;

        /* renamed from: s, reason: collision with root package name */
        private int f4948s = -2;

        a() {
        }

        private final void a() {
            Object invoke;
            if (this.f4948s == -2) {
                invoke = c.this.f4945a.invoke();
            } else {
                I6.l lVar = c.this.f4946b;
                Object obj = this.f4947o;
                r.b(obj);
                invoke = lVar.invoke(obj);
            }
            this.f4947o = invoke;
            this.f4948s = invoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f4948s < 0) {
                a();
            }
            return this.f4948s == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f4948s < 0) {
                a();
            }
            if (this.f4948s == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f4947o;
            r.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f4948s = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(I6.a aVar, I6.l lVar) {
        r.e(aVar, "getInitialValue");
        r.e(lVar, "getNextValue");
        this.f4945a = aVar;
        this.f4946b = lVar;
    }

    @Override // R6.d
    public Iterator iterator() {
        return new a();
    }
}
