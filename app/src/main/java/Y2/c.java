package Y2;

import Z2.r;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class c implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    protected final b f6063o;

    /* renamed from: s, reason: collision with root package name */
    protected int f6064s = -1;

    public c(b bVar) {
        this.f6063o = (b) r.l(bVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6064s < this.f6063o.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            b bVar = this.f6063o;
            int i8 = this.f6064s + 1;
            this.f6064s = i8;
            return bVar.get(i8);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f6064s);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
