package z0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class S implements Iterator, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final I6.l f44690o;

    /* renamed from: s, reason: collision with root package name */
    private final List f44691s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private Iterator f44692t;

    public S(Iterator it, I6.l lVar) {
        this.f44690o = lVar;
        this.f44692t = it;
    }

    private final void a(Object obj) {
        Iterator it = (Iterator) this.f44690o.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f44691s.add(this.f44692t);
            this.f44692t = it;
        } else {
            while (!this.f44692t.hasNext() && !this.f44691s.isEmpty()) {
                this.f44692t = (Iterator) AbstractC6987o.J(this.f44691s);
                AbstractC6987o.r(this.f44691s);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f44692t.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f44692t.next();
        a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
