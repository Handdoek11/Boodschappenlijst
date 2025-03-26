package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.yi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4716yi0 extends AbstractC4607xi0 implements ListIterator {
    AbstractC4716yi0(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f27901o).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f27901o).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f27901o).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f27901o).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
