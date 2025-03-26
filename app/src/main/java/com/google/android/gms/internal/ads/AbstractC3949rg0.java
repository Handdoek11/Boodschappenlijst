package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.rg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3949rg0 extends AbstractC1130Ai0 {

    /* renamed from: o, reason: collision with root package name */
    private final int f26210o;

    /* renamed from: s, reason: collision with root package name */
    private int f26211s;

    protected AbstractC3949rg0(int i8, int i9) {
        AbstractC1762Sf0.b(i9, i8, "index");
        this.f26210o = i8;
        this.f26211s = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26211s < this.f26210o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26211s > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f26211s;
        this.f26211s = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26211s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f26211s - 1;
        this.f26211s = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26211s - 1;
    }
}
