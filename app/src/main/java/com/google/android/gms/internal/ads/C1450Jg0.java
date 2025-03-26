package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.Jg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1450Jg0 extends C1378Hg0 implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ C1485Kg0 f16288u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1450Jg0(C1485Kg0 c1485Kg0) {
        super(c1485Kg0);
        this.f16288u = c1485Kg0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f16288u.isEmpty();
        a();
        ((ListIterator) this.f15775o).add(obj);
        this.f16288u.f16617w.f16871v++;
        if (isEmpty) {
            this.f16288u.b();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f15775o).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f15775o).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f15775o).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f15775o).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f15775o).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1450Jg0(C1485Kg0 c1485Kg0, int i8) {
        super(c1485Kg0, ((List) c1485Kg0.f15982s).listIterator(i8));
        this.f16288u = c1485Kg0;
    }
}
