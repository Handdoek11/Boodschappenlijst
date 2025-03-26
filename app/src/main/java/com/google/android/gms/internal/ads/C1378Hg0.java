package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Hg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1378Hg0 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    final Iterator f15775o;

    /* renamed from: s, reason: collision with root package name */
    final Collection f15776s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ AbstractC1414Ig0 f15777t;

    C1378Hg0(AbstractC1414Ig0 abstractC1414Ig0, Iterator it) {
        this.f15777t = abstractC1414Ig0;
        this.f15776s = abstractC1414Ig0.f15982s;
        this.f15775o = it;
    }

    final void a() {
        this.f15777t.zzb();
        if (this.f15777t.f15982s != this.f15776s) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f15775o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f15775o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15775o.remove();
        AbstractC1520Lg0 abstractC1520Lg0 = this.f15777t.f15985v;
        abstractC1520Lg0.f16871v--;
        this.f15777t.c();
    }

    C1378Hg0(AbstractC1414Ig0 abstractC1414Ig0) {
        this.f15777t = abstractC1414Ig0;
        Collection collection = abstractC1414Ig0.f15982s;
        this.f15776s = collection;
        this.f15775o = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
