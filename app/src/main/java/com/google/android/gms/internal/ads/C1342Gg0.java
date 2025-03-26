package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.Gg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1342Gg0 extends C1126Ag0 implements SortedSet {

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ AbstractC1520Lg0 f15424t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1342Gg0(AbstractC1520Lg0 abstractC1520Lg0, SortedMap sortedMap) {
        super(abstractC1520Lg0, sortedMap);
        this.f15424t = abstractC1520Lg0;
    }

    SortedMap b() {
        return (SortedMap) this.f17578o;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C1342Gg0(this.f15424t, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C1342Gg0(this.f15424t, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C1342Gg0(this.f15424t, b().tailMap(obj));
    }
}
