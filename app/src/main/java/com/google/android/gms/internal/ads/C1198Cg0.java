package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.Cg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1198Cg0 extends C1342Gg0 implements NavigableSet {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ AbstractC1520Lg0 f14211u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1198Cg0(AbstractC1520Lg0 abstractC1520Lg0, NavigableMap navigableMap) {
        super(abstractC1520Lg0, navigableMap);
        this.f14211u = abstractC1520Lg0;
    }

    @Override // com.google.android.gms.internal.ads.C1342Gg0
    final /* synthetic */ SortedMap b() {
        return (NavigableMap) ((SortedMap) this.f17578o);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f17578o)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C1198Cg0(this.f14211u, ((NavigableMap) ((SortedMap) this.f17578o)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f17578o)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C1342Gg0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f17578o)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f17578o)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return AbstractC1236Dh0.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return AbstractC1236Dh0.a(descendingIterator());
    }

    @Override // com.google.android.gms.internal.ads.C1342Gg0, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C1342Gg0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z7) {
        return new C1198Cg0(this.f14211u, ((NavigableMap) ((SortedMap) this.f17578o)).headMap(obj, z7));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        return new C1198Cg0(this.f14211u, ((NavigableMap) ((SortedMap) this.f17578o)).subMap(obj, z7, obj2, z8));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z7) {
        return new C1198Cg0(this.f14211u, ((NavigableMap) ((SortedMap) this.f17578o)).tailMap(obj, z7));
    }
}
