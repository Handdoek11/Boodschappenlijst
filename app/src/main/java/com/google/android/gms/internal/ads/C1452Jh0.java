package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.Jh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1452Jh0 extends AbstractSequentialList implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    final List f16289o;

    /* renamed from: s, reason: collision with root package name */
    final InterfaceC1376Hf0 f16290s;

    C1452Jh0(List list, InterfaceC1376Hf0 interfaceC1376Hf0) {
        list.getClass();
        this.f16289o = list;
        this.f16290s = interfaceC1376Hf0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f16289o.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new C1416Ih0(this, this.f16289o.listIterator(i8));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        this.f16289o.subList(i8, i9).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16289o.size();
    }
}
