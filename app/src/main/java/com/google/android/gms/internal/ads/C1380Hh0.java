package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.Hh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1380Hh0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: o, reason: collision with root package name */
    final List f15778o;

    /* renamed from: s, reason: collision with root package name */
    final InterfaceC1376Hf0 f15779s;

    C1380Hh0(List list, InterfaceC1376Hf0 interfaceC1376Hf0) {
        list.getClass();
        this.f15778o = list;
        this.f15779s = interfaceC1376Hf0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        return this.f15779s.apply(this.f15778o.get(i8));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f15778o.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new C1308Fh0(this, this.f15778o.listIterator(i8));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        return this.f15779s.apply(this.f15778o.remove(i8));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        this.f15778o.subList(i8, i9).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15778o.size();
    }
}
