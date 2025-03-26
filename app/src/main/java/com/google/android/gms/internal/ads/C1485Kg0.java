package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.Kg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1485Kg0 extends AbstractC1414Ig0 implements List {

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ AbstractC1520Lg0 f16617w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1485Kg0(AbstractC1520Lg0 abstractC1520Lg0, Object obj, List list, AbstractC1414Ig0 abstractC1414Ig0) {
        super(abstractC1520Lg0, obj, list, abstractC1414Ig0);
        this.f16617w = abstractC1520Lg0;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        zzb();
        boolean isEmpty = this.f15982s.isEmpty();
        ((List) this.f15982s).add(i8, obj);
        this.f16617w.f16871v++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f15982s).addAll(i8, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f15982s.size();
        this.f16617w.f16871v += size2 - size;
        if (size != 0) {
            return addAll;
        }
        b();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzb();
        return ((List) this.f15982s).get(i8);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f15982s).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f15982s).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C1450Jg0(this);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        zzb();
        Object remove = ((List) this.f15982s).remove(i8);
        AbstractC1520Lg0 abstractC1520Lg0 = this.f16617w;
        abstractC1520Lg0.f16871v--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        zzb();
        return ((List) this.f15982s).set(i8, obj);
    }

    @Override // java.util.List
    public final List subList(int i8, int i9) {
        zzb();
        List subList = ((List) this.f15982s).subList(i8, i9);
        AbstractC1414Ig0 abstractC1414Ig0 = this.f15983t;
        if (abstractC1414Ig0 == null) {
            abstractC1414Ig0 = this;
        }
        return this.f16617w.l(this.f15981o, subList, abstractC1414Ig0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i8) {
        zzb();
        return new C1450Jg0(this, i8);
    }
}
