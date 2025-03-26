package w;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6850c implements Iterator, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC6858k[] f44168o;

    /* renamed from: s, reason: collision with root package name */
    private int f44169s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f44170t = true;

    public AbstractC6850c(C6857j c6857j, AbstractC6858k[] abstractC6858kArr) {
        this.f44168o = abstractC6858kArr;
        abstractC6858kArr[0].i(c6857j.h(), c6857j.e() * 2);
        this.f44169s = 0;
        b();
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void b() {
        if (this.f44168o[this.f44169s].e()) {
            return;
        }
        for (int i8 = this.f44169s; -1 < i8; i8--) {
            int d8 = d(i8);
            if (d8 == -1 && this.f44168o[i8].g()) {
                this.f44168o[i8].h();
                d8 = d(i8);
            }
            if (d8 != -1) {
                this.f44169s = d8;
                return;
            }
            if (i8 > 0) {
                this.f44168o[i8 - 1].h();
            }
            this.f44168o[i8].i(C6857j.f44174d.a().h(), 0);
        }
        this.f44170t = false;
    }

    private final int d(int i8) {
        if (this.f44168o[i8].e()) {
            return i8;
        }
        if (!this.f44168o[i8].g()) {
            return -1;
        }
        C6857j a8 = this.f44168o[i8].a();
        if (i8 == 6) {
            this.f44168o[i8 + 1].i(a8.h(), a8.h().length);
        } else {
            this.f44168o[i8 + 1].i(a8.h(), a8.e() * 2);
        }
        return d(i8 + 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f44170t;
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        Object next = this.f44168o[this.f44169s].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
