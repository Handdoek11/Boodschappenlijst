package p3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class H0 extends L0 {

    /* renamed from: o, reason: collision with root package name */
    private final Object f40173o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f40174s;

    H0(Object obj) {
        this.f40173o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f40174s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f40174s) {
            throw new NoSuchElementException();
        }
        this.f40174s = true;
        return this.f40173o;
    }
}
