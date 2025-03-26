package R6;

import J6.r;
import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.C6916E;
import x6.C6934p;
import x6.q;

/* loaded from: classes2.dex */
final class e extends f implements Iterator, A6.d, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private int f4950o;

    /* renamed from: s, reason: collision with root package name */
    private Object f4951s;

    /* renamed from: t, reason: collision with root package name */
    private Iterator f4952t;

    /* renamed from: u, reason: collision with root package name */
    private A6.d f4953u;

    private final Throwable g() {
        int i8 = this.f4950o;
        if (i8 == 4) {
            return new NoSuchElementException();
        }
        if (i8 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f4950o);
    }

    private final Object h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // R6.f
    public Object a(Object obj, A6.d dVar) {
        this.f4951s = obj;
        this.f4950o = 3;
        this.f4953u = dVar;
        Object e8 = B6.b.e();
        if (e8 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e8 == B6.b.e() ? e8 : C6916E.f44463a;
    }

    @Override // R6.f
    public Object e(Iterator it, A6.d dVar) {
        if (!it.hasNext()) {
            return C6916E.f44463a;
        }
        this.f4952t = it;
        this.f4950o = 2;
        this.f4953u = dVar;
        Object e8 = B6.b.e();
        if (e8 == B6.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e8 == B6.b.e() ? e8 : C6916E.f44463a;
    }

    @Override // A6.d
    public A6.g getContext() {
        return A6.h.f250o;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i8 = this.f4950o;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        return true;
                    }
                    if (i8 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator it = this.f4952t;
                r.b(it);
                if (it.hasNext()) {
                    this.f4950o = 2;
                    return true;
                }
                this.f4952t = null;
            }
            this.f4950o = 5;
            A6.d dVar = this.f4953u;
            r.b(dVar);
            this.f4953u = null;
            C6934p.a aVar = C6934p.f44487s;
            dVar.resumeWith(C6934p.b(C6916E.f44463a));
        }
    }

    public final void i(A6.d dVar) {
        this.f4953u = dVar;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i8 = this.f4950o;
        if (i8 == 0 || i8 == 1) {
            return h();
        }
        if (i8 == 2) {
            this.f4950o = 1;
            Iterator it = this.f4952t;
            r.b(it);
            return it.next();
        }
        if (i8 != 3) {
            throw g();
        }
        this.f4950o = 0;
        Object obj = this.f4951s;
        this.f4951s = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // A6.d
    public void resumeWith(Object obj) {
        q.b(obj);
        this.f4950o = 4;
    }
}
