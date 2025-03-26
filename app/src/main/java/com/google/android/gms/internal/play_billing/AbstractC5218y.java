package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5218y extends Q0 {

    /* renamed from: o, reason: collision with root package name */
    private final int f30028o;

    /* renamed from: s, reason: collision with root package name */
    private int f30029s;

    protected AbstractC5218y(int i8, int i9) {
        AbstractC5202v.b(i9, i8, "index");
        this.f30028o = i8;
        this.f30029s = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f30029s < this.f30028o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30029s > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f30029s;
        this.f30029s = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30029s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f30029s - 1;
        this.f30029s = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30029s - 1;
    }
}
