package q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6403g implements Iterator, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private int f40870o;

    /* renamed from: s, reason: collision with root package name */
    private int f40871s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f40872t;

    public AbstractC6403g(int i8) {
        this.f40870o = i8;
    }

    protected abstract Object a(int i8);

    protected abstract void b(int i8);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f40871s < this.f40870o;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a8 = a(this.f40871s);
        this.f40871s++;
        this.f40872t = true;
        return a8;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f40872t) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i8 = this.f40871s - 1;
        this.f40871s = i8;
        b(i8);
        this.f40870o--;
        this.f40872t = false;
    }
}
